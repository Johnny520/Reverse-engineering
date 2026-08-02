package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a63 {

    /* JADX INFO: renamed from: d */
    public static final a63 f83d;

    /* JADX INFO: renamed from: e */
    public static final a63 f84e;

    /* JADX INFO: renamed from: f */
    public static final a63 f85f;

    /* JADX INFO: renamed from: g */
    public static final a63 f86g;

    /* JADX INFO: renamed from: h */
    public static final a63 f87h;

    /* JADX INFO: renamed from: i */
    public static final a63 f88i;

    /* JADX INFO: renamed from: j */
    public static final a63 f89j;

    /* JADX INFO: renamed from: k */
    public static final a63 f90k;

    /* JADX INFO: renamed from: l */
    public static final a63 f91l;

    /* JADX INFO: renamed from: m */
    public static final a63 f92m;

    /* JADX INFO: renamed from: n */
    public static final a63 f93n;

    /* JADX INFO: renamed from: o */
    public static final HashMap f94o;

    /* JADX INFO: renamed from: a */
    public final String f95a;

    /* JADX INFO: renamed from: b */
    public final o43 f96b;

    /* JADX INFO: renamed from: c */
    public final r30 f97c;

    static {
        a63 a63Var = new a63(o43.f7508n);
        f83d = a63Var;
        a63 a63Var2 = new a63(o43.f7509o);
        f84e = a63Var2;
        a63 a63Var3 = new a63(o43.f7510p);
        f85f = a63Var3;
        a63 a63Var4 = new a63(o43.f7511q);
        f86g = a63Var4;
        a63 a63Var5 = new a63(o43.f7512r);
        f87h = a63Var5;
        a63 a63Var6 = new a63(o43.f7513s);
        f88i = a63Var6;
        a63 a63Var7 = new a63(o43.f7514t);
        f89j = a63Var7;
        a63 a63Var8 = new a63(o43.f7515u);
        f90k = a63Var8;
        a63 a63Var9 = new a63(o43.f7516v);
        f91l = a63Var9;
        f92m = new a63(o43.f7486B);
        f93n = new a63(o43.f7487C);
        HashMap map = new HashMap();
        f94o = map;
        map.put(Boolean.TYPE, a63Var);
        map.put(Byte.TYPE, a63Var2);
        map.put(Character.TYPE, a63Var3);
        map.put(Double.TYPE, a63Var4);
        map.put(Float.TYPE, a63Var5);
        map.put(Integer.TYPE, a63Var6);
        map.put(Long.TYPE, a63Var7);
        map.put(Short.TYPE, a63Var8);
        map.put(Void.TYPE, a63Var9);
    }

    public a63(String str, o43 o43Var) {
        if (str == null || o43Var == null) {
            throw null;
        }
        this.f95a = str;
        this.f96b = o43Var;
        r30 r30Var = new r30(o43Var);
        r30 r30Var2 = (r30) r30.f9338j.putIfAbsent(o43Var, r30Var);
        this.f97c = r30Var2 != null ? r30Var2 : r30Var;
    }

    /* JADX INFO: renamed from: a */
    public static a63 m101a(Class cls) {
        if (cls.isPrimitive()) {
            return (a63) f94o.get(cls);
        }
        String strReplace = cls.getName().replace('.', '/');
        if (!cls.isArray()) {
            strReplace = "L" + strReplace + ';';
        }
        try {
            return new a63(strReplace, strReplace.equals("V") ? o43.f7516v : o43.m3504g(strReplace));
        } catch (NullPointerException unused) {
            um2.m5516f("descriptor == null");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final vg1 m102b(a63 a63Var, String str, a63... a63VarArr) {
        return new vg1(this, a63Var, str, new e63(a63VarArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a63) && ((a63) obj).f95a.equals(this.f95a);
    }

    public final int hashCode() {
        return this.f95a.hashCode();
    }

    public final String toString() {
        return this.f95a;
    }

    public a63(o43 o43Var) {
        this(o43Var.f7521h, o43Var);
    }
}
