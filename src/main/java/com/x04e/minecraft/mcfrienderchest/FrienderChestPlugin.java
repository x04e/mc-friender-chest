package com.x04e.minecraft.mcfrienderchest;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class FrienderChestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§aFriender Chest");

        meta.setCustomModelData(1234567);
        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "friender_chest");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(
            "OOO",
            "OEO",
            "ODO"
        );
        recipe.setIngredient('O', Material.OBSIDIAN);
        recipe.setIngredient('D', Material.RED_DYE);
        recipe.setIngredient('E', Material.ENDER_EYE);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() { }
}
