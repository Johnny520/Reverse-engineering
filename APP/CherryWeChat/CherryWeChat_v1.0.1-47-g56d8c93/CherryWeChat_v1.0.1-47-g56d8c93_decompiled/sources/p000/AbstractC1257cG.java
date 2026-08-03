package p000;

import android.content.SharedPreferences;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: cG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1257cG {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f4258a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public static int f4259b = -1;

    /* JADX INFO: renamed from: c */
    public static final C1251cA f4260c = new C1251cA(new C1302d(27));

    /* JADX INFO: renamed from: a */
    public static void m2373a(String str, Function2 function2) {
        String string = m2376d().getString(str, null);
        f4258a.put(str, new C1214bG(string != null ? AbstractC2808zl.m5432a(AbstractC0235Fd.m479b(string), AbstractC1450gG.f5069c) : null, str, function2));
    }

    /* JADX INFO: renamed from: b */
    public static void m2374b(String str, Function2 function2) {
        String string = m2376d().getString(str, null);
        f4258a.put(str, new C1214bG(string != null ? new C0149Dd(string).m293a(AbstractC1450gG.f5069c) : null, str, function2));
    }

    /* JADX INFO: renamed from: c */
    public static Method m2375c() {
        C1214bG c1214bG = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-819767522883637L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        if (obj instanceof Method) {
            return (Method) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static SharedPreferences m2376d() {
        return (SharedPreferences) f4260c.getValue();
    }

    /* JADX INFO: renamed from: e */
    public static Method m2377e() {
        C1214bG c1214bG = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-587495691515957L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        if (obj instanceof Method) {
            return (Method) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Class m2378f() {
        C1214bG c1214bG = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-584154206959669L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static Method m2379g() {
        C1214bG c1214bG = (C1214bG) f4258a.get(AbstractC0295Gu.m625r(-588818541443125L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        if (obj instanceof Method) {
            return (Method) obj;
        }
        return null;
    }
}
