package com.p001mr.elaris;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: com.mr.elaris.j */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0156j extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Class f130a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156j(Class cls) {
        super(12);
        this.f130a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (MessageRepeater.isRepeaterCaptureEnabled()) {
            Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
            Class cls = this.f130a;
            MessageRepeater.rememberAioParam(obj, cls);
            MessageRepeater.rememberAioParamFromArgs(methodHookParam != null ? methodHookParam.args : null, cls);
        }
    }
}
