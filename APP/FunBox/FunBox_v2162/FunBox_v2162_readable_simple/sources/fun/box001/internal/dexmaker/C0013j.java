package fun.box001.internal.dexmaker;

import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.HashMap;

/* JADX INFO: renamed from: c.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0013j {

    /* JADX INFO: renamed from: d */
    public static final C0013j f41d = null;

    /* JADX INFO: renamed from: e */
    public static final C0013j f42e = null;

    /* JADX INFO: renamed from: f */
    public static final C0013j f43f = null;

    /* JADX INFO: renamed from: g */
    public static final C0013j f44g = null;

    /* JADX INFO: renamed from: h */
    public static final C0013j f45h = null;

    /* JADX INFO: renamed from: i */
    public static final C0013j f46i = null;

    /* JADX INFO: renamed from: j */
    public static final C0013j f47j = null;

    /* JADX INFO: renamed from: k */
    public static final C0013j f48k = null;

    /* JADX INFO: renamed from: l */
    public static final C0013j f49l = null;

    /* JADX INFO: renamed from: m */
    public static final C0013j f50m = null;

    /* JADX INFO: renamed from: n */
    private static final HashMap f51n = null;

    /* JADX INFO: renamed from: a */
    final String f52a;

    /* JADX INFO: renamed from: b */
    final C0195c f53b;

    /* JADX INFO: renamed from: c */
    final C0191u f54c;

    static {
        C0013j r0 = new C0013j(C0195c.f762g);
        f41d = r0;
        C0013j r1 = new C0013j(C0195c.f763h);
        f42e = r1;
        C0013j r2 = new C0013j(C0195c.f764i);
        f43f = r2;
        C0013j r3 = new C0013j(C0195c.f765j);
        f44g = r3;
        C0013j r4 = new C0013j(C0195c.f766k);
        f45h = r4;
        C0013j r5 = new C0013j(C0195c.f767l);
        f46i = r5;
        C0013j r6 = new C0013j(C0195c.f768m);
        f47j = r6;
        C0013j r7 = new C0013j(C0195c.f769n);
        f48k = r7;
        C0013j r8 = new C0013j(C0195c.f770o);
        f49l = r8;
        f50m = new C0013j(C0195c.f776u);
        new C0013j(C0195c.f777v);
        HashMap r9 = new HashMap();
        f51n = r9;
        r9.put(Boolean.TYPE, r0);
        r9.put(Byte.TYPE, r1);
        r9.put(Character.TYPE, r2);
        r9.put(Double.TYPE, r3);
        r9.put(Float.TYPE, r4);
        r9.put(Integer.TYPE, r5);
        r9.put(Long.TYPE, r6);
        r9.put(Short.TYPE, r7);
        r9.put(Void.TYPE, r8);
    }

    C0013j(String r1, C0195c r2) {
        if (r1 == null) goto L8;
        if (r2 == null) goto L8;
        this.f52a = r1;
        this.f53b = r2;
        this.f54c = C0191u.m449i(r2);
        return;
    L8:
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static C0013j m64a(Class r3) {
        if (r3.isPrimitive() == true) goto L5;
        String r0 = r3.getName().replace('.', '/');
        if (r3.isArray() == true) goto L11;
        r0 = "L" + r0 + ';';
    L11:
        return m65b(r0);
    L5:
        return (C0013j) f51n.get(r3);
    }

    /* JADX INFO: renamed from: b */
    public static C0013j m65b(String r2) {
        if (r2.equals("V") == false) goto L7;
        C0195c r1 = C0195c.f770o;     // Catch: NullPointerException -> L10
    L9:
        return new C0013j(r2, r1);
    L7:
        r1 = C0195c.m465i(r2);
    L11:
        throw new NullPointerException("descriptor == null");
    }

    /* JADX INFO: renamed from: c */
    public final C0012i m66c(C0013j r3, String r4, C0013j... r5) {
        return new C0012i(this, r3, r4, new C0014k(r5));
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0013j) == true) goto L5;
    L7:
        return false;
    L5:
        if (((C0013j) r2).f52a.equals(this.f52a) == false) goto L7;
        return true;
    }

    public final int hashCode() {
        return this.f52a.hashCode();
    }

    public final String toString() {
        return this.f52a;
    }

    C0013j(C0195c r2) {
        this(r2.m471h(), r2);
    }
}
