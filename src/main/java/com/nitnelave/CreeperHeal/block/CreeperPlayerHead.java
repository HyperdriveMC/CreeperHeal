package com.nitnelave.CreeperHeal.block;

import com.nitnelave.CreeperHeal.config.CfgVal;
import com.nitnelave.CreeperHeal.config.CreeperConfig;
import org.bukkit.block.BlockState;
import org.bukkit.block.Skull;
import org.bukkit.profile.PlayerProfile;

public class CreeperPlayerHead extends CreeperBlock {
    private final PlayerProfile skullOwnerProfile;
    CreeperPlayerHead(BlockState blockState) {
        super(blockState);
        Skull skull = (Skull) blockState;
        skullOwnerProfile = skull.getOwnerProfile();
    }

    @Override
    public void update(boolean shouldDrop) {
        getLocation().getChunk().load();
        getBlock().setBlockData(blockData);
        Skull skullState = (Skull) blockState;
        skullState.setOwnerProfile(skullOwnerProfile);
        blockState.update();
        getWorld().playSound(getLocation(), CreeperConfig.getSound(), CreeperConfig.getInt(CfgVal.SOUND_VOLUME) / 10F, 0.1F);
    }
}
