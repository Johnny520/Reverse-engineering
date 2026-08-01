package com.p001mr.elaris;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: com.mr.elaris.l */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0158l extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (MessageRepeater.isRepeaterCaptureEnabled()) {
            MessageRepeater.rememberSendContact(MessageRepeater.firstContactArg(methodHookParam == null ? null : methodHookParam.args));
        }
    }
}
