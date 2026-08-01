package com.p001mr.elaris;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: com.mr.elaris.h */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0154h extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (MessageRepeater.isRepeaterCaptureEnabled()) {
            Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
            Object objFirstMsgRecordArg = MessageRepeater.firstMsgRecordArg(methodHookParam != null ? methodHookParam.args : null);
            if (obj == null || objFirstMsgRecordArg == null) {
                return;
            }
            MessageRepeater.rememberAioMsgRecord(obj, objFirstMsgRecordArg);
        }
    }
}
