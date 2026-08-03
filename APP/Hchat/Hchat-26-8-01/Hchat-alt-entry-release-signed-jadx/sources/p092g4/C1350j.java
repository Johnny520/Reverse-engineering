package p092g4;

import java.util.HashMap;
import p311v4.C4453d0;
import p326w4.C4683c;

/* JADX INFO: renamed from: g4.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1350j {

    /* JADX INFO: renamed from: d */
    public static final C1350j f4467d;

    /* JADX INFO: renamed from: e */
    public static final C1350j f4468e;

    /* JADX INFO: renamed from: f */
    public static final C1350j f4469f;

    /* JADX INFO: renamed from: g */
    public static final C1350j f4470g;

    /* JADX INFO: renamed from: h */
    public static final C1350j f4471h;

    /* JADX INFO: renamed from: i */
    public static final C1350j f4472i;

    /* JADX INFO: renamed from: j */
    public static final C1350j f4473j;

    /* JADX INFO: renamed from: k */
    public static final C1350j f4474k;

    /* JADX INFO: renamed from: l */
    public static final C1350j f4475l;

    /* JADX INFO: renamed from: m */
    public static final C1350j f4476m;

    /* JADX INFO: renamed from: n */
    public static final C1350j f4477n;

    /* JADX INFO: renamed from: o */
    public static final HashMap f4478o;

    /* JADX INFO: renamed from: a */
    public final String f4479a;

    /* JADX INFO: renamed from: b */
    public final C4683c f4480b;

    /* JADX INFO: renamed from: c */
    public final C4453d0 f4481c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1350j c1350j = new C1350j(C4683c.f15636o);
        f4467d = c1350j;
        C1350j c1350j2 = new C1350j(C4683c.f15637p);
        f4468e = c1350j2;
        C1350j c1350j3 = new C1350j(C4683c.f15638q);
        f4469f = c1350j3;
        C1350j c1350j4 = new C1350j(C4683c.f15639r);
        f4470g = c1350j4;
        C1350j c1350j5 = new C1350j(C4683c.f15640s);
        f4471h = c1350j5;
        C1350j c1350j6 = new C1350j(C4683c.f15641t);
        f4472i = c1350j6;
        C1350j c1350j7 = new C1350j(C4683c.f15642u);
        f4473j = c1350j7;
        C1350j c1350j8 = new C1350j(C4683c.f15643v);
        f4474k = c1350j8;
        C1350j c1350j9 = new C1350j(C4683c.f15644w);
        f4475l = c1350j9;
        f4476m = new C1350j(C4683c.f15613E);
        f4477n = new C1350j(C4683c.f15615G);
        HashMap map = new HashMap();
        f4478o = map;
        map.put(Boolean.TYPE, c1350j);
        map.put(Byte.TYPE, c1350j2);
        map.put(Character.TYPE, c1350j3);
        map.put(Double.TYPE, c1350j4);
        map.put(Float.TYPE, c1350j5);
        map.put(Integer.TYPE, c1350j6);
        map.put(Long.TYPE, c1350j7);
        map.put(Short.TYPE, c1350j8);
        map.put(Void.TYPE, c1350j9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1350j(String str, C4683c c4683c) {
        if (str == null || c4683c == null) {
            throw null;
        }
        this.f4479a = str;
        this.f4480b = c4683c;
        this.f4481c = C4453d0.m8902l(c4683c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1350j m3626a(Class cls) {
        if (cls.isPrimitive()) {
            return (C1350j) f4478o.get(cls);
        }
        String strReplace = cls.getName().replace('.', '/');
        if (!cls.isArray()) {
            strReplace = "L" + strReplace + ';';
        }
        return new C1350j(strReplace, C4683c.m9184o(strReplace));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C1349i m3627b(C1350j c1350j, String str, C1350j... c1350jArr) {
        return new C1349i(this, c1350j, str, new C1351k(c1350jArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1350j) && ((C1350j) obj).f4479a.equals(this.f4479a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4479a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4479a;
    }

    public C1350j(C4683c c4683c) {
        this(c4683c.f15648g, c4683c);
    }
}
