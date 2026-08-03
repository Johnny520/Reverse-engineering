package fun.box001.internal.dexmaker;

import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.HashMap;

/* JADX INFO: renamed from: c.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0013j {

    /* JADX INFO: renamed from: d */
    public static final C0013j f41d;

    /* JADX INFO: renamed from: e */
    public static final C0013j f42e;

    /* JADX INFO: renamed from: f */
    public static final C0013j f43f;

    /* JADX INFO: renamed from: g */
    public static final C0013j f44g;

    /* JADX INFO: renamed from: h */
    public static final C0013j f45h;

    /* JADX INFO: renamed from: i */
    public static final C0013j f46i;

    /* JADX INFO: renamed from: j */
    public static final C0013j f47j;

    /* JADX INFO: renamed from: k */
    public static final C0013j f48k;

    /* JADX INFO: renamed from: l */
    public static final C0013j f49l;

    /* JADX INFO: renamed from: m */
    public static final C0013j f50m;

    /* JADX INFO: renamed from: n */
    private static final HashMap f51n;

    /* JADX INFO: renamed from: a */
    final String f52a;

    /* JADX INFO: renamed from: b */
    final C0195c f53b;

    /* JADX INFO: renamed from: c */
    final C0191u f54c;

    static {
        C0013j c0013j = new C0013j(C0195c.f762g);
        f41d = c0013j;
        C0013j c0013j2 = new C0013j(C0195c.f763h);
        f42e = c0013j2;
        C0013j c0013j3 = new C0013j(C0195c.f764i);
        f43f = c0013j3;
        C0013j c0013j4 = new C0013j(C0195c.f765j);
        f44g = c0013j4;
        C0013j c0013j5 = new C0013j(C0195c.f766k);
        f45h = c0013j5;
        C0013j c0013j6 = new C0013j(C0195c.f767l);
        f46i = c0013j6;
        C0013j c0013j7 = new C0013j(C0195c.f768m);
        f47j = c0013j7;
        C0013j c0013j8 = new C0013j(C0195c.f769n);
        f48k = c0013j8;
        C0013j c0013j9 = new C0013j(C0195c.f770o);
        f49l = c0013j9;
        f50m = new C0013j(C0195c.f776u);
        new C0013j(C0195c.f777v);
        HashMap map = new HashMap();
        f51n = map;
        map.put(Boolean.TYPE, c0013j);
        map.put(Byte.TYPE, c0013j2);
        map.put(Character.TYPE, c0013j3);
        map.put(Double.TYPE, c0013j4);
        map.put(Float.TYPE, c0013j5);
        map.put(Integer.TYPE, c0013j6);
        map.put(Long.TYPE, c0013j7);
        map.put(Short.TYPE, c0013j8);
        map.put(Void.TYPE, c0013j9);
    }

    C0013j(String str, C0195c c0195c) {
        if (str == null || c0195c == null) {
            throw null;
        }
        this.f52a = str;
        this.f53b = c0195c;
        this.f54c = C0191u.m449i(c0195c);
    }

    /* JADX INFO: renamed from: a */
    public static C0013j m64a(Class cls) {
        if (cls.isPrimitive()) {
            return (C0013j) f51n.get(cls);
        }
        String strReplace = cls.getName().replace('.', '/');
        if (!cls.isArray()) {
            strReplace = "L" + strReplace + ';';
        }
        return m65b(strReplace);
    }

    /* JADX INFO: renamed from: b */
    public static C0013j m65b(String str) {
        try {
            return new C0013j(str, str.equals("V") ? C0195c.f770o : C0195c.m465i(str));
        } catch (NullPointerException unused) {
            throw new NullPointerException("descriptor == null");
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0012i m66c(C0013j c0013j, String str, C0013j... c0013jArr) {
        return new C0012i(this, c0013j, str, new C0014k(c0013jArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0013j) && ((C0013j) obj).f52a.equals(this.f52a);
    }

    public final int hashCode() {
        return this.f52a.hashCode();
    }

    public final String toString() {
        return this.f52a;
    }

    C0013j(C0195c c0195c) {
        this(c0195c.m471h(), c0195c);
    }
}
