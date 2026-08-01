package p000;

import android.content.Context;
import com.github.megatronking.stringfog.Base64;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.TagExecutor;
import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: hi */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0299hi implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2226c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2227d;

    public /* synthetic */ RunnableC0299hi(Object obj, Object obj2, Object obj3, int i) {
        this.f2224a = i;
        this.f2225b = obj;
        this.f2226c = obj2;
        this.f2227d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objectField;
        String string;
        switch (this.f2224a) {
            case Base64.DEFAULT /* 0 */:
                C0431l0 c0431l0 = (C0431l0) this.f2225b;
                AbstractC0259gf abstractC0259gf = (AbstractC0259gf) this.f2226c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f2227d;
                try {
                    C0933yk c0933ykM1858h = AbstractC0493mp.m1858h((Context) c0431l0.f2886b);
                    if (c0933ykM1858h == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0896xk c0896xk = (C0896xk) ((InterfaceC0225fi) c0933ykM1858h.f897b);
                    synchronized (c0896xk.f5266d) {
                        c0896xk.f5268f = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC0225fi) c0933ykM1858h.f897b).mo1102b(new C0335ii(abstractC0259gf, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0259gf.mo51J(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case Base64.NO_PADDING /* 1 */:
                ClassLoader classLoader = (ClassLoader) this.f2225b;
                Object obj = this.f2226c;
                String str = (String) this.f2227d;
                C0459ls c0459ls = C0459ls.f3042a;
                AbstractC0493mp.m1854d(obj);
                try {
                    Object objectField2 = XposedHelpers.getObjectField(obj, ub0.f4807z);
                    String str2 = objectField2 instanceof String ? (String) objectField2 : null;
                    if (str2 != null && (objectField = XposedHelpers.getObjectField(obj, ub0.f4682B)) != null && (string = objectField.toString()) != null) {
                        int intField = XposedHelpers.getIntField(obj, ub0.f4684C);
                        Object objectField3 = XposedHelpers.getObjectField(obj, ub0.f4680A);
                        String str3 = objectField3 instanceof String ? (String) objectField3 : null;
                        String str4 = str3 == null ? "" : str3;
                        String str5 = (String) C0459ls.f3044c.get(str2);
                        String str6 = str5 == null ? "" : str5;
                        Class clsFindClassIfExists = XposedHelpers.findClassIfExists(ub0.f4771n, classLoader);
                        if (clsFindClassIfExists == null) {
                            return;
                        }
                        Object[] objArr = (Object[]) ub0.f4727X0.m2285c(str2, Integer.valueOf(intField), string, str4, str6, str);
                        if (objArr.length == 0) {
                            return;
                        }
                        Object objNewInstance = XposedHelpers.newInstance(clsFindClassIfExists, Arrays.copyOf(objArr, objArr.length));
                        AbstractC0493mp.m1854d(objNewInstance);
                        C0459ls.m1778e(classLoader, objNewInstance, true);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", b50.m492a("wVtOLItFbiPoV2I3l2Y=\n", "jS4tR/IIAU0=\n"), "tw==\n", "0vI8ySRxU5w=\n");
                    return;
                }
            default:
                ((TagExecutor) this.f2225b).lambda$start$0((Runnable) this.f2226c, (String) this.f2227d);
                return;
        }
    }
}
