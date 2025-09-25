package dev.lemonnik.polybook;

import dev.lemonnik.polybook.items.PolybookItem;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import java.util.List;
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
			.component(
				DataComponentTypes.LORE,
				new LoreComponent(List.of(
					Text.translatable("item.polybook.polydex.tooltip").formatted(Formatting.GRAY)
				))
			)
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