package com.eraoftinkering.datagen;

import com.eraoftinkering.registries.Items;
import net.minecraft.data.DataGenerator;
import slimeknights.tconstruct.library.data.tinkering.AbstractStationSlotLayoutProvider;
import slimeknights.tconstruct.tools.TinkerToolParts;

public class EomToolSlotLayout extends AbstractStationSlotLayoutProvider {
    public EomToolSlotLayout(DataGenerator generator) {
        super(generator);
    }

    /**
     * Function to add all relevant layouts
     */
    @Override
    protected void addLayouts() {
        defineModifiable(Items.SAW)
                .sortIndex(SORT_HARVEST)
                .addInputItem(TinkerToolParts.broadBlade, 0, 0)
                .addInputItem(TinkerToolParts.toolHandle, 10, 10)
                .build();
    }

    @Override
    public String getName() {
        return "Era of Tinkering Tool Station layout";
    }
}