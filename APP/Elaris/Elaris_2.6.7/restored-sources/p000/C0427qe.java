package p000;

import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: qe */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0427qe extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f769b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0427qe(ClassLoader classLoader, Method method) {
        super(70);
        this.f768a = method;
        this.f769b = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0502v9 c0502v9M315p0 = AbstractC0169w.m315p0(methodHookParam == null ? null : methodHookParam.thisObject);
        if (c0502v9M315p0 == null) {
            return;
        }
        methodHookParam.setResult(AbstractC0169w.m318r(this.f768a.getReturnType()));
        AbstractC0169w.m286b(this.f769b, c0502v9M315p0);
    }
}
