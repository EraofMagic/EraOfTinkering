package com.eraoftinkering.datagen;

import com.eraoftinkering.EraOfTinkering;
import slimeknights.tconstruct.library.client.data.material.AbstractPartSpriteProvider;

public class EomPartSpriteProvider extends AbstractPartSpriteProvider {

    public EomPartSpriteProvider() {
        super(EraOfTinkering.MOD_ID);
    }

    /**
     * Gets the name of these part sprites
     */
    @Override
    public String getName() {
        return "Era Of Magica Part Sprite Provider";
    }

    /**
     * Function to add both sprites and materials
     */
    @Override
    protected void addAllSpites() {

        buildTool("saw").addBreakableHead("blade").addHandle("handle");
    }
}