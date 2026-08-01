package com.p001mr.elaris;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.Map;
import p000.AbstractC0219fc;

/* JADX INFO: renamed from: com.mr.elaris.u */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167u extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f156b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167u(ClassLoader classLoader, Method method) {
        super(70);
        this.f155a = method;
        this.f156b = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object obj2;
        boolean zEquals;
        Map map = AbstractC0219fc.f261c;
        synchronized (map) {
            obj = map.get(methodHookParam == null ? null : methodHookParam.thisObject);
        }
        Map map2 = AbstractC0219fc.f262d;
        synchronized (map2) {
            obj2 = map2.get(methodHookParam == null ? null : methodHookParam.thisObject);
        }
        Map map3 = AbstractC0219fc.f263e;
        synchronized (map3) {
            zEquals = Boolean.TRUE.equals(map3.get(methodHookParam == null ? null : methodHookParam.thisObject));
        }
        if (obj == null) {
            return;
        }
        AbstractC0219fc.f273o = System.currentTimeMillis() + 650;
        methodHookParam.setResult(AbstractC0219fc.m392e(this.f155a.getReturnType()));
        if (AbstractC0219fc.m393f()) {
            HookEntry.log("repeater long press menu clicked");
            AbstractC0219fc.m389b(null, obj2);
            MessageRepeater.repeatFromLongPressMenu(this.f156b, HookEntry.hostContext(), obj, zEquals);
        }
    }
}
