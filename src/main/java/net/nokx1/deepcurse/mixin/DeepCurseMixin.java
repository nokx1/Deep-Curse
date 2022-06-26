package net.nokx1.deepcurse.mixin;

import net.nokx1.deepcurse.DeepCurse;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class DeepCurseMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		DeepCurse.LOGGER.info("This line is printed by Deep Curse's mixin!");
	}
}
