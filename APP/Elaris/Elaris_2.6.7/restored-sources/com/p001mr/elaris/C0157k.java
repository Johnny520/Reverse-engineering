package com.p001mr.elaris;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: com.mr.elaris.k */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0157k extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Class f131a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157k(Class cls) {
        super(12);
        this.f131a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (MessageRepeater.isRepeaterCaptureEnabled()) {
            Object result = methodHookParam == null ? null : methodHookParam.getResult();
            Class cls = this.f131a;
            MessageRepeater.rememberAioParam(result, cls);
            MessageRepeater.rememberAioParam(methodHookParam != null ? methodHookParam.thisObject : null, cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (MessageRepeater.isRepeaterCaptureEnabled()) {
            MessageRepeater.rememberAioParamFromArgs(methodHookParam == null ? null : methodHookParam.args, this.f131a);
        }
    }
}
