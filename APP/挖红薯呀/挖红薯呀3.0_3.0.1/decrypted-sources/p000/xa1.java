package p000;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class xa1 {

    /* JADX INFO: renamed from: a */
    public static final xa1 f7291a = new xa1();

    /* JADX INFO: renamed from: b */
    private static final u60 f7292b = new x51(new us0(17));

    /* JADX INFO: renamed from: c */
    private static final u60 f7293c = new x51(new us0(18));

    /* JADX INFO: renamed from: d */
    public static final int f7294d = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private xa1() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final String m5108d() {
        return "image_id_list";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final du0 m5109e() {
        return (du0) f7293c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final String m5110f() {
        return (String) f7292b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Object m5111h(XposedInterface.Chain chain) {
        chain.getClass();
        try {
            Object obj = chain.getArgs().get(0);
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                xa1 xa1Var = f7291a;
                if (k41.m1764V(str, xa1Var.m5110f(), false)) {
                    du0 du0VarM5109e = xa1Var.m5109e();
                    du0VarM5109e.getClass();
                    Matcher matcher = du0VarM5109e.f1193d.matcher(str);
                    matcher.getClass();
                    od0 od0VarM1204c = g60.m1204c(matcher, 0, str);
                    if (od0VarM1204c != null) {
                        String strDecode = URLDecoder.decode((String) ((nd0) od0VarM1204c.m2878a()).get(1), "UTF-8");
                        strDecode.getClass();
                        List listM1773e0 = k41.m1773e0(strDecode, new String[]{","}, 6);
                        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(listM1773e0));
                        Iterator it = listM1773e0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(k41.m1775g0((String) it.next()).toString());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (((String) obj2).length() >= 10) {
                                arrayList2.add(obj2);
                            }
                        }
                        List<String> listM5253W = AbstractC0960ye.m5253W(new LinkedHashSet(arrayList2));
                        if (!listM5253W.isEmpty()) {
                            C0745sz.f5862a.m4116A(AbstractC0960ye.m5245O(listM5253W, ",", null, null, null, 62), listM5253W);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final du0 m5112i() {
        return new du0(f7291a.m5110f() + "=([^&]+)");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5113g(ClassLoader classLoader) {
        classLoader.getClass();
        if (kf1.f3100G.m1887b() == null) {
            return;
        }
        C0822v c0822vM1933s = AbstractC0398kl.m1933s(URL.class.getDeclaredConstructors());
        while (c0822vM1933s.hasNext()) {
            Constructor constructor = (Constructor) c0822vM1933s.next();
            try {
                kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                kf1VarM1887b.getClass();
                kf1VarM1887b.hook(constructor).intercept(new C0796ua(28)).getClass();
            } catch (Exception unused) {
            }
        }
    }
}
