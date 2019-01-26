package natanaeljr.kickoff.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Block Box
 */
public class BlockBox extends Block
{
    /* We could also extend BlockHorizontal to get the FACING property automatically.
     * Or we could simply assign FACING to BlockHorizontal.FACING.
     */
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    /**
     * Default Constructor
     */
    public BlockBox(Material material)
    {
        super(material);
    }

    /**
     * Create a block state container.
     * BlockStateContainer: Will contain all possible `IBlockState`s (variants) for the given properties.
     */
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING);
    }

    /**
     * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
     * IBlockstate
     */
    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
                                            float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumFacing = EnumFacing.getHorizontal(meta);
        return this.getDefaultState().withProperty(FACING, enumFacing);
    }

    /**
     * Convert the BlockState into the correct metadata value (0..15)
     */
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(FACING).getIndex();
    }
}
