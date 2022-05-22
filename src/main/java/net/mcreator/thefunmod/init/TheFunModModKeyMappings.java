
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefunmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.thefunmod.network.SomethingIsWrongMessage;
import net.mcreator.thefunmod.network.HelpMessage;
import net.mcreator.thefunmod.TheFunModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TheFunModModKeyMappings {
	public static final KeyMapping HELP = new KeyMapping("key.the_fun_mod.help", GLFW.GLFW_KEY_KP_0, "key.categories.chat_commands");
	public static final KeyMapping SOMETHING_IS_WRONG = new KeyMapping("key.the_fun_mod.something_is_wrong", GLFW.GLFW_KEY_KP_1,
			"key.categories.chat_commands");
	private static long SOMETHING_IS_WRONG_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(HELP);
		ClientRegistry.registerKeyBinding(SOMETHING_IS_WRONG);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == HELP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TheFunModMod.PACKET_HANDLER.sendToServer(new HelpMessage(0, 0));
						HelpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == SOMETHING_IS_WRONG.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TheFunModMod.PACKET_HANDLER.sendToServer(new SomethingIsWrongMessage(0, 0));
						SomethingIsWrongMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						SOMETHING_IS_WRONG_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - SOMETHING_IS_WRONG_LASTPRESS);
						TheFunModMod.PACKET_HANDLER.sendToServer(new SomethingIsWrongMessage(1, dt));
						SomethingIsWrongMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
