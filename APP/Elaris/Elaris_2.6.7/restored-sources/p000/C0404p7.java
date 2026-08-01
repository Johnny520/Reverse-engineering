package p000;

import android.content.Context;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import dalvik.system.BaseDexClassLoader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0404p7 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f710c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClassLoader f711d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f712e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404p7(AtomicReference atomicReference, AtomicReference atomicReference2, String str, ClassLoader classLoader, String str2) {
        super(100);
        this.f708a = atomicReference;
        this.f709b = atomicReference2;
        this.f710c = str;
        this.f711d = classLoader;
        this.f712e = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Context context;
        Set set = (Set) this.f709b.getAndSet(null);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    ((XC_MethodHook.Unhook) it.next()).unhook();
                } catch (Throwable unused) {
                }
            }
        }
        this.f708a.set(null);
        Object[] objArr = methodHookParam.args;
        if (objArr == null || objArr.length <= 0) {
            context = null;
        } else {
            Object obj = objArr[0];
            if (obj instanceof Context) {
                context = (Context) obj;
            }
        }
        AbstractC0260i5.m667x(context != null ? context.getClassLoader() : null, this.f710c, this.f712e.concat(".attachBaseContext"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Context context;
        Thread threadCurrentThread = Thread.currentThread();
        AtomicReference atomicReference = this.f708a;
        atomicReference.set(threadCurrentThread);
        String str = this.f710c;
        this.f709b.set(XposedBridge.hookAllConstructors(BaseDexClassLoader.class, new C0420q7(atomicReference, str)));
        Object[] objArr = methodHookParam.args;
        if (objArr == null || objArr.length <= 0) {
            context = null;
        } else {
            Object obj = objArr[0];
            if (obj instanceof Context) {
                context = (Context) obj;
            }
        }
        HookEntry.reloadRuntimeConfig(context, "QFix.attachBaseContext");
        if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE)) {
            ClassLoader classLoader = this.f711d;
            AbstractC0532x7.m1134c(classLoader);
            AbstractC0532x7.m1133b(classLoader);
            HookEntry.logAlways("host hot update early hooks active: process=" + str + ", entry=" + this.f712e);
        }
    }
}
