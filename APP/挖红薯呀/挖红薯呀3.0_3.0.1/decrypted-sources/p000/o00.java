package p000;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    /* JADX INFO: renamed from: a */
    public static final o00 f4379a = new o00();

    /* JADX INFO: renamed from: b */
    public static final int f4380b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private o00() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Object m2749c(XposedInterface.Chain chain) {
        List args;
        chain.getClass();
        try {
            args = chain.getArgs();
            args.getClass();
        } catch (Exception unused) {
        }
        if (!args.isEmpty() && args.size() >= 2) {
            Object obj = args.get(1);
            if (obj == null) {
                return chain.proceed();
            }
            int iIntValue = -1;
            String strM45j = null;
            if (args.size() > 2) {
                Object obj2 = args.get(2);
                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            int i = iIntValue;
            C0633pz c0633pzM3366r = C0670qz.f5241a.m3366r(obj);
            if (c0633pzM3366r.m3180p() && c0633pzM3366r.m3175k() != null) {
                strM45j = ab0.f88a.m45j(c0633pzM3366r.m3175k());
            }
            C1021zy.f8036a.m5639u(c0633pzM3366r.m3177m(), c0633pzM3366r.m3178n(), strM45j, c0633pzM3366r.m3179o(), c0633pzM3366r.m3174j(), c0633pzM3366r.m3180p(), false, i);
            return chain.proceed();
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2750b(ClassLoader classLoader, List<? extends Class<?>> list) {
        classLoader.getClass();
        list.getClass();
        if (list.isEmpty() || kf1.f3100G.m1887b() == null) {
            return;
        }
        Iterator<? extends Class<?>> it = list.iterator();
        while (it.hasNext()) {
            try {
                C0822v c0822vM1933s = AbstractC0398kl.m1933s(it.next().getDeclaredConstructors());
                while (c0822vM1933s.hasNext()) {
                    Constructor constructor = (Constructor) c0822vM1933s.next();
                    try {
                        kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                        kf1VarM1887b.getClass();
                        kf1VarM1887b.hook(constructor).intercept(new C0796ua(15)).getClass();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
