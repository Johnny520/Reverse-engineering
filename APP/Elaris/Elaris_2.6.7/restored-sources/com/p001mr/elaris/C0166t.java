package com.p001mr.elaris;

import android.content.Context;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;
import p000.AbstractC0219fc;

/* JADX INFO: renamed from: com.mr.elaris.t */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0166t extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f154b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166t(ClassLoader classLoader, Method method) {
        super(70);
        this.f153a = method;
        this.f154b = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length < 3) {
            return;
        }
        Object obj = objArr[0];
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == 14787861) {
            AbstractC0219fc.f273o = System.currentTimeMillis() + 650;
            methodHookParam.setResult(AbstractC0219fc.m392e(this.f153a.getReturnType()));
            if (AbstractC0219fc.m393f()) {
                Object obj2 = methodHookParam.args[1];
                Context contextHostContext = obj2 instanceof Context ? (Context) obj2 : HookEntry.hostContext();
                HookEntry.log("repeater legacy long press menu clicked");
                AbstractC0219fc.m389b(null, null);
                MessageRepeater.repeatFromLongPressMenu(this.f154b, contextHostContext, methodHookParam.args[2]);
            }
        }
    }
}
