package p024b9;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0174b;
import p010a9.InterfaceC0175c;
import p010a9.InterfaceC0176d;
import p010a9.InterfaceC0177e;
import p010a9.InterfaceC0178f;
import p010a9.InterfaceC0179g;
import p010a9.InterfaceC0180h;
import p010a9.InterfaceC0181i;
import p010a9.InterfaceC0182j;
import p010a9.InterfaceC0183k;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0185m;
import p010a9.InterfaceC0186n;
import p010a9.InterfaceC0187o;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p010a9.InterfaceC0190r;
import p010a9.InterfaceC0191s;
import p010a9.InterfaceC0192t;
import p010a9.InterfaceC0193u;
import p010a9.InterfaceC0194v;
import p010a9.InterfaceC0195w;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1401b;
import p036c9.InterfaceC1402c;
import p036c9.InterfaceC1403d;
import p036c9.InterfaceC1404e;
import p036c9.InterfaceC1405f;
import p172l8.InterfaceC4695g;

/* JADX INFO: renamed from: b9.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1064u0 {
    /* JADX INFO: renamed from: a */
    public static Collection m3853a(Object obj) {
        if ((obj instanceof InterfaceC1400a) && !(obj instanceof InterfaceC1401b)) {
            m3871s(obj, "kotlin.collections.MutableCollection");
        }
        return m3859g(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Iterable m3854b(Object obj) {
        if ((obj instanceof InterfaceC1400a) && !(obj instanceof InterfaceC1402c)) {
            m3871s(obj, "kotlin.collections.MutableIterable");
        }
        return m3860h(obj);
    }

    /* JADX INFO: renamed from: c */
    public static List m3855c(Object obj) {
        if ((obj instanceof InterfaceC1400a) && !(obj instanceof InterfaceC1403d)) {
            m3871s(obj, "kotlin.collections.MutableList");
        }
        return m3861i(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Map m3856d(Object obj) {
        if ((obj instanceof InterfaceC1400a) && !(obj instanceof InterfaceC1404e)) {
            m3871s(obj, "kotlin.collections.MutableMap");
        }
        return m3862j(obj);
    }

    /* JADX INFO: renamed from: e */
    public static Set m3857e(Object obj) {
        if ((obj instanceof InterfaceC1400a) && !(obj instanceof InterfaceC1405f)) {
            m3871s(obj, "kotlin.collections.MutableSet");
        }
        return m3863k(obj);
    }

    /* JADX INFO: renamed from: f */
    public static Object m3858f(Object obj, int i10) {
        if (obj != null && !m3865m(obj, i10)) {
            m3871s(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static Collection m3859g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m3870r(e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Iterable m3860h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw m3870r(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static List m3861i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m3870r(e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public static Map m3862j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m3870r(e10);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Set m3863k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw m3870r(e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m3864l(Object obj) {
        if (obj instanceof InterfaceC1051o) {
            return ((InterfaceC1051o) obj).getArity();
        }
        if (obj instanceof InterfaceC0173a) {
            return 0;
        }
        if (obj instanceof InterfaceC0184l) {
            return 1;
        }
        if (obj instanceof InterfaceC0188p) {
            return 2;
        }
        if (obj instanceof InterfaceC0189q) {
            return 3;
        }
        if (obj instanceof InterfaceC0190r) {
            return 4;
        }
        if (obj instanceof InterfaceC0191s) {
            return 5;
        }
        if (obj instanceof InterfaceC0192t) {
            return 6;
        }
        if (obj instanceof InterfaceC0193u) {
            return 7;
        }
        if (obj instanceof InterfaceC0194v) {
            return 8;
        }
        if (obj instanceof InterfaceC0195w) {
            return 9;
        }
        if (obj instanceof InterfaceC0174b) {
            return 10;
        }
        if (obj instanceof InterfaceC0175c) {
            return 11;
        }
        if (obj instanceof InterfaceC0176d) {
            return 12;
        }
        if (obj instanceof InterfaceC0177e) {
            return 13;
        }
        if (obj instanceof InterfaceC0178f) {
            return 14;
        }
        if (obj instanceof InterfaceC0179g) {
            return 15;
        }
        if (obj instanceof InterfaceC0180h) {
            return 16;
        }
        if (obj instanceof InterfaceC0181i) {
            return 17;
        }
        if (obj instanceof InterfaceC0182j) {
            return 18;
        }
        if (obj instanceof InterfaceC0183k) {
            return 19;
        }
        if (obj instanceof InterfaceC0185m) {
            return 20;
        }
        if (obj instanceof InterfaceC0186n) {
            return 21;
        }
        return obj instanceof InterfaceC0187o ? 22 : -1;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3865m(Object obj, int i10) {
        return (obj instanceof InterfaceC4695g) && m3864l(obj) == i10;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m3866n(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC1400a) || (obj instanceof InterfaceC1403d);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m3867o(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC1400a) || (obj instanceof InterfaceC1404e.a);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3868p(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof InterfaceC1400a) || (obj instanceof InterfaceC1405f);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static Throwable m3869q(Throwable th) {
        return AbstractC1061t.m3847h(th, AbstractC1064u0.class.getName());
    }

    /* JADX INFO: renamed from: r */
    public static ClassCastException m3870r(ClassCastException classCastException) {
        throw ((ClassCastException) m3869q(classCastException));
    }

    /* JADX INFO: renamed from: s */
    public static void m3871s(Object obj, String str) {
        m3872t((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* JADX INFO: renamed from: t */
    public static void m3872t(String str) {
        throw m3870r(new ClassCastException(str));
    }
}
