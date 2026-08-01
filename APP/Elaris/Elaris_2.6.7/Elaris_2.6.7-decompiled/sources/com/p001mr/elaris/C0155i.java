package com.p001mr.elaris;

import android.widget.ImageView;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import p000.AbstractC0000a;

/* JADX INFO: renamed from: com.mr.elaris.i */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0155i extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f129a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155i(ClassLoader classLoader) {
        super(30);
        this.f129a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        try {
            if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER)) {
                Object obj = (methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length < 2) ? null : objArr[1];
                if (obj == null) {
                    HookEntry.log("repeater icon skipped reason=message item null");
                    return;
                }
                if (MessageRepeater.canReuseRepeaterBinding(MessageRepeater.cachedRepeaterImageView(methodHookParam.thisObject), obj)) {
                    return;
                }
                ImageView imageViewFindRepeaterImageView = MessageRepeater.findRepeaterImageView(methodHookParam.thisObject);
                if (imageViewFindRepeaterImageView == null) {
                    MessageRepeater.logFollowProbe(methodHookParam.thisObject, methodHookParam.args, obj);
                    HookEntry.log("repeater icon skipped reason=icon view not found");
                    return;
                }
                Object objMsgRecordFromAny = MessageRepeater.msgRecordFromAny(obj);
                if (objMsgRecordFromAny != null) {
                    MessageRepeater.rememberAioMsgRecord(obj, objMsgRecordFromAny);
                }
                if (MessageRepeater.bindIcon(this.f129a, imageViewFindRepeaterImageView, obj) && MessageRepeater.shouldLogBindSuccess()) {
                    HookEntry.log("repeater menu add success");
                    HookEntry.log("repeater message matched");
                }
            }
        } catch (Throwable th) {
            AbstractC0000a.m3d(th, new StringBuilder("repeater icon skipped reason="), ": ");
        }
    }
}
