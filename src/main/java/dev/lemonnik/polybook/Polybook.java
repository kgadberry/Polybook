package dev.lemonnik.polybook;

import dev.lemonnik.polybook.items.PolybookItem;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Polybook implements ModInitializer {
	public static final String MOD_ID = "polybook";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		final Item POLYDEX = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "polydex"), new PolybookItem(
				new Item.Settings()
						.maxCount(1)
						.registryKey(
								RegistryKey.of(
										RegistryKeys.ITEM,
										Identifier.of(MOD_ID, "polydex")
								)
						)
		));

		PolymerResourcePackUtils.addModAssets(MOD_ID);
	}
}