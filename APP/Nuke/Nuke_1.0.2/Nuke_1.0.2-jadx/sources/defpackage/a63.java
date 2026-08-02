package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a63 {
    public static final a63 d;
    public static final a63 e;
    public static final a63 f;
    public static final a63 g;
    public static final a63 h;
    public static final a63 i;
    public static final a63 j;
    public static final a63 k;
    public static final a63 l;
    public static final a63 m;
    public static final a63 n;
    public static final HashMap o;
    public final String a;
    public final o43 b;
    public final r30 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a63 a63Var = new a63(o43.n);
        d = a63Var;
        a63 a63Var2 = new a63(o43.o);
        e = a63Var2;
        a63 a63Var3 = new a63(o43.p);
        f = a63Var3;
        a63 a63Var4 = new a63(o43.q);
        g = a63Var4;
        a63 a63Var5 = new a63(o43.r);
        h = a63Var5;
        a63 a63Var6 = new a63(o43.s);
        i = a63Var6;
        a63 a63Var7 = new a63(o43.t);
        j = a63Var7;
        a63 a63Var8 = new a63(o43.u);
        k = a63Var8;
        a63 a63Var9 = new a63(o43.v);
        l = a63Var9;
        m = new a63(o43.B);
        n = new a63(o43.C);
        HashMap map = new HashMap();
        o = map;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a63(String str, o43 o43Var) {
        if (str == null || o43Var == null) {
            throw null;
        }
        this.a = str;
        this.b = o43Var;
        r30 r30Var = new r30(o43Var);
        r30 r30Var2 = (r30) r30.j.putIfAbsent(o43Var, r30Var);
        this.c = r30Var2 != null ? r30Var2 : r30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a63 a(Class cls) {
        if (cls.isPrimitive()) {
            return (a63) o.get(cls);
        }
        String strReplace = cls.getName().replace('.', '/');
        if (!cls.isArray()) {
            strReplace = "L" + strReplace + ';';
        }
        try {
            return new a63(strReplace, strReplace.equals("V") ? o43.v : o43.g(strReplace));
        } catch (NullPointerException unused) {
            um2.f("descriptor == null");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final vg1 b(a63 a63Var, String str, a63... a63VarArr) {
        return new vg1(this, a63Var, str, new e63(a63VarArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof a63) && ((a63) obj).a.equals(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.a;
    }

    public a63(o43 o43Var) {
        this(o43Var.h, o43Var);
    }
}
