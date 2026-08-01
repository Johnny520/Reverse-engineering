package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: za */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0567za extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_AVATAR_PENDANT)) {
            Object obj = methodHookParam.thisObject;
            if (obj == null || !HookEntry.runtimeBool(Prefs.KEY_BLOCK_AVATAR_PENDANT)) {
                return;
            }
            AbstractC0513w4.m1121d(obj, "pendantId", 0L);
            AbstractC0513w4.m1121d(obj, "pendantDiyInfoId", 0);
            String[] strArr = {"dynamicAvatar", "dynamicAvatarInfo", "dynamicHead", "dynamicHeadInfo", "dynamicFace", "dynamicFaceInfo", "avatarAnimation", "avatarAnimationInfo", "avatarDynamic", "avatarDynamicInfo", "avatarVideo", "avatarVideoUrl", "avatarPag", "avatarSvga", "avatarLottie", "avatarVapie", "headAnimation", "headVideoUrl", "headPendant", "headPendantInfo", "avatarFrame", "avatarFrameInfo", "avatarBorder", "avatarBorderInfo", "avatarEffect", "avatarEffectInfo", "avatarPendant", "avatarPendantInfo"};
            for (int i = 0; i < 28; i++) {
                AbstractC0513w4.m1121d(obj, strArr[i], null);
            }
            String[] strArr2 = {"dynamicAvatarId", "dynamicHeadId", "dynamicFaceId", "avatarAnimationId", "avatarDynamicId", "avatarVideoId", "avatarFrameId", "avatarBorderId", "avatarEffectId", "avatarPendantId", "pendantId", "avatarPendantId", "headPendantId", "headFrameId", "headBorderId", "headEffectId", "avatarDecorId", "headDecorId"};
            for (int i2 = 0; i2 < 18; i2++) {
                AbstractC0513w4.m1121d(obj, strArr2[i2], 0L);
                AbstractC0513w4.m1121d(obj, strArr2[i2], 0);
            }
            String[] strArr3 = {"hasDynamicAvatar", "isDynamicAvatar", "showDynamicAvatar", "useDynamicAvatar", "hasAvatarAnimation", "showAvatarAnimation", "isAvatarDynamic", "hasAvatarEffect", "showAvatarEffect", "hasAvatarPendant", "showAvatarPendant", "hasHeadPendant", "showHeadPendant", "hasAvatarFrame", "showAvatarFrame", "hasAvatarBorder", "showAvatarBorder", "hasHeadDecor", "showHeadDecor"};
            for (int i3 = 0; i3 < 19; i3++) {
                AbstractC0513w4.m1121d(obj, strArr3[i3], Boolean.FALSE);
            }
            String[] strArr4 = {"dynamicAvatarUrl", "dynamicHeadUrl", "dynamicFaceUrl", "avatarAnimationUrl", "avatarDynamicUrl", "avatarVideoUrl", "avatarPagUrl", "avatarSvgaUrl", "avatarLottieUrl", "avatarVapieUrl", "avatarEffectUrl", "avatarPendantUrl", "headPendantUrl", "avatarFrameUrl", "avatarBorderUrl", "headDecorUrl"};
            for (int i4 = 0; i4 < 16; i4++) {
                AbstractC0513w4.m1121d(obj, strArr4[i4], "");
            }
        }
    }
}
