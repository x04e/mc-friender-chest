package com.x04e.minecraft.mcfrienderchest;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

/**
 * Hello world!
 *
 */
public class FrienderChestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);

        ItemMeta meta = item.getItemMeta();
        getLogger().info(meta.toString());
        meta.setDisplayName("§aEmerald Sword");
        item.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "");
        ShapedRecipe recipe = new ShapedRecipe(key, item);
        recipe.shape(
            " E ",
            " E ",
            " S "
        );
        recipe.setIngredient('E', Material.EMERALD);
        recipe.setIngredient('D', Material.RED_DYE);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() { }
}
