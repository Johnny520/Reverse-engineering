package p000;

import android.content.SharedPreferences;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: cG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1257cG {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f4258a = null;

    /* JADX INFO: renamed from: b */
    public static int f4259b;

    /* JADX INFO: renamed from: c */
    public static final C1251cA f4260c = null;

    static {
        f4258a = new LinkedHashMap();
        f4259b = -1;
        f4260c = new C1251cA(new C1302d(27));
    }

    /* JADX INFO: renamed from: a */
    public static void m2373a(String r2, Function2 r3) {
        Class r1 = null;
        String r0 = m2376d().getString(r2, null);
        if (r0 == null) goto L5;
        r1 = AbstractC2808zl.m5432a(AbstractC0235Fd.m479b(r0), AbstractC1450gG.f5069c);
    L5:
        C1214bG r02 = new C1214bG(r1, r2, r3);
        f4258a.put(r2, r02);
    }

    /* JADX INFO: renamed from: b */
    public static void m2374b(String r2, Function2 r3) {
        Method r1 = null;
        String r0 = m2376d().getString(r2, null);
        if (r0 == null) goto L5;
        r1 = new C0149Dd(r0).m293a(AbstractC1450gG.f5069c);
    L5:
        C1214bG r02 = new C1214bG(r1, r2, r3);
        f4258a.put(r2, r02);
    }

    /* JADX INFO: renamed from: c */
    public static Method m2375c() {
        C1214bG r0 = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-819767522883637L));
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == true) goto L9;
        return null;
    L9:
        return (Method) r02;
    L5:
        r02 = null;
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public static SharedPreferences m2376d() {
        return (SharedPreferences) f4260c.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static Method m2377e() {
        C1214bG r0 = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-587495691515957L));
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == true) goto L9;
        return null;
    L9:
        return (Method) r02;
    L5:
        r02 = null;
        goto L7
    }

    /* JADX INFO: renamed from: f */
    public static Class m2378f() {
        C1214bG r0 = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-584154206959669L));
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Class) == true) goto L9;
        return null;
    L9:
        return (Class) r02;
    L5:
        r02 = null;
        goto L7
    }

    /* JADX INFO: renamed from: g */
    public static Method m2379g() {
        C1214bG r0 = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-588818541443125L));
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == true) goto L9;
        return null;
    L9:
        return (Method) r02;
    L5:
        r02 = null;
        goto L7
    }
}
