
package net.mcreator.fallenangelsofficialmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.fallenangelsofficialmod.FallenangelsofficialmodModElements;

import java.util.List;

@FallenangelsofficialmodModElements.ModElement.Tag
public class MegalovaniaItem extends FallenangelsofficialmodModElements.ModElement {
	@ObjectHolder("fallenangelsofficialmod:megalovania")
	public static final Item block = null;
	public MegalovaniaItem(FallenangelsofficialmodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, FallenangelsofficialmodModElements.sounds.get(new ResourceLocation("fallenangelsofficialmod:megalovania")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("megalovania");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Wanna have a bad time kiddo?"));
		}
	}
}
