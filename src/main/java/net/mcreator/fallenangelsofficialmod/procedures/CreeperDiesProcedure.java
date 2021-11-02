package net.mcreator.fallenangelsofficialmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.fallenangelsofficialmod.item.YourRealityItem;
import net.mcreator.fallenangelsofficialmod.item.WormbossItem;
import net.mcreator.fallenangelsofficialmod.item.TraditionellMuseteItem;
import net.mcreator.fallenangelsofficialmod.item.TarantellaNapoletanaItem;
import net.mcreator.fallenangelsofficialmod.item.RollerDiscoItem;
import net.mcreator.fallenangelsofficialmod.item.NeverGonnaGiveYouUpItem;
import net.mcreator.fallenangelsofficialmod.item.MegalovaniaItem;
import net.mcreator.fallenangelsofficialmod.item.IlVentoDiOroItem;
import net.mcreator.fallenangelsofficialmod.item.HimnoEspanaItem;
import net.mcreator.fallenangelsofficialmod.item.HimnoBetisItem;
import net.mcreator.fallenangelsofficialmod.item.GiornoRussianItem;
import net.mcreator.fallenangelsofficialmod.item.EarthboundSanctuaryGuardianItem;
import net.mcreator.fallenangelsofficialmod.item.DripSusItem;
import net.mcreator.fallenangelsofficialmod.item.DejaVuItem;
import net.mcreator.fallenangelsofficialmod.item.AlmaPartiaItem;
import net.mcreator.fallenangelsofficialmod.FallenangelsofficialmodMod;

import java.util.Map;
import java.util.HashMap;

public class CreeperDiesProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityDeath(LivingDeathEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FallenangelsofficialmodMod.LOGGER.warn("Failed to load dependency entity for procedure CreeperDies!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				FallenangelsofficialmodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure CreeperDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FallenangelsofficialmodMod.LOGGER.warn("Failed to load dependency x for procedure CreeperDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FallenangelsofficialmodMod.LOGGER.warn("Failed to load dependency y for procedure CreeperDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FallenangelsofficialmodMod.LOGGER.warn("Failed to load dependency z for procedure CreeperDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FallenangelsofficialmodMod.LOGGER.warn("Failed to load dependency world for procedure CreeperDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		int randomchancemusicdisc = (int) Math.floor (Math.random()* (15-1+1)) + 1;
		if (((entity instanceof CreeperEntity) && (sourceentity instanceof SkeletonEntity))) {
		switch (randomchancemusicdisc) {
			case 1:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(NeverGonnaGiveYouUpItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 2:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DejaVuItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 3:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(AlmaPartiaItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 4:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DripSusItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 5:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(EarthboundSanctuaryGuardianItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 6:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GiornoRussianItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 7:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(HimnoBetisItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 8:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(HimnoEspanaItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 9:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IlVentoDiOroItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 10:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(TraditionellMuseteItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 11:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(MegalovaniaItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 12:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RollerDiscoItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 13:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(TarantellaNapoletanaItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 14:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(YourRealityItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			case 15:
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(WormbossItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			break;
			default:
			break;
		}
		}
	}
}
