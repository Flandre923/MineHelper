package net.flandre923.minehelper.datagen;

import net.flandre923.minehelper.MineHelper;
import net.flandre923.minehelper.block.ModBlocks;
import net.flandre923.minehelper.item.ModCreativeTab;
import net.flandre923.minehelper.item.ModItem;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageGen extends LanguageProvider {
    public ModLanguageGen(PackOutput output,  String locale) {
        super(output, MineHelper.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModCreativeTab.TUTORIAL_TAB_STRING,"MineHelper Tab");
        add(ModItem.WOOD_BALL.get(),"Wood Ball");
        add(ModItem.STONE_BALL.get(),"Stone Ball");
        add(ModItem.IRON_BALL.get(),"Iron Ball");
        add(ModItem.DIAMOND_BALL.get(),"Diamond Ball");
        add(ModItem.END_PEARL_WOOD_BALL.get(),"Wood End Pearl Ball");
        add(ModItem.END_PEARL_STONE_BALL.get(),"Stone End Pearl Ball");
        add(ModItem.END_PEARL_IRON_BALL.get(),"Iron End Pearl Ball");
        add(ModItem.END_PEARL_DIAMOND_BALL.get(),"Diamond End Pearl Ball");
        add(ModItem.DISAPPEAR_WOOD_BALL.get(),"Wood Disappear Ball");
        add(ModItem.DISAPPEAR_STONE_BALL.get(),"Stone Disappear Ball");
        add(ModItem.DISAPPEAR_IRON_BALL.get(),"Iron Disappear Ball");
        add(ModItem.DISAPPEAR_DIAMOND_BALL.get(),"Diamond Disappear Ball");
        add(ModItem.END_PEARL_DISAPPEAR_WOOD_BALL.get(),"Wood End Pearl Disappear Ball");
        add(ModItem.END_PEARL_DISAPPEAR_STONE_BALL.get(),"Wood End Pearl Disappear Ball");
        add(ModItem.END_PEARL_DISAPPEAR_IRON_BALL.get(),"Wood End Pearl Disappear Ball");
        add(ModItem.END_PEARL_DISAPPEAR_DIAMOND_BALL.get(),"Wood End Pearl Disappear Ball");
        add(ModBlocks.MY_ANVIL.get(),"My Anvil");


    }
}
