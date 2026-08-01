package p000;

import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: q7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0420q7 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f745b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0420q7(AtomicReference atomicReference, String str) {
        super(100);
        this.f744a = atomicReference;
        this.f745b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String strValueOf;
        Thread thread = (Thread) this.f744a.get();
        if (thread == null || thread != Thread.currentThread()) {
            return;
        }
        Object obj = methodHookParam.thisObject;
        if (obj instanceof ClassLoader) {
            ClassLoader classLoader = (ClassLoader) obj;
            try {
                strValueOf = String.valueOf(classLoader);
            } catch (Throwable unused) {
                strValueOf = "";
            }
            if (strValueOf.contains(Prefs.PACKAGE_NAME)) {
                return;
            }
            if (strValueOf.contains("com.tencent.") || strValueOf.contains("TinkerClassLoader") || strValueOf.contains("DelegateLastClassLoader")) {
                AbstractC0260i5.m667x(classLoader, this.f745b, "BaseDexClassLoader");
            }
        }
    }
}
