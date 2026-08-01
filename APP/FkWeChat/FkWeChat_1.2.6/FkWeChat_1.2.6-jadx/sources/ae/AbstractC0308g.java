package ae;

import java.io.EOFException;
import java.util.ArrayList;
import okio.C5799e;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p376zd.C10003m;
import p376zd.C9995i;

/* JADX INFO: renamed from: ae.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0308g {

    /* JADX INFO: renamed from: a */
    public static final C10003m f765a;

    /* JADX INFO: renamed from: b */
    public static final C10003m f766b;

    /* JADX INFO: renamed from: c */
    public static final C10003m f767c;

    /* JADX INFO: renamed from: d */
    public static final C10003m f768d;

    /* JADX INFO: renamed from: e */
    public static final C10003m f769e;

    static {
        C10003m.a aVar = C10003m.f33582t;
        f765a = aVar.m38794d("/");
        f766b = aVar.m38794d("\\");
        f767c = aVar.m38794d("/\\");
        f768d = aVar.m38794d(".");
        f769e = aVar.m38794d("..");
    }

    /* JADX INFO: renamed from: j */
    public static final C5799e m933j(C5799e c5799e, C5799e c5799e2, boolean z10) {
        c5799e.getClass();
        c5799e2.getClass();
        if (c5799e2.isAbsolute() || c5799e2.m23308t() != null) {
            return c5799e2;
        }
        C10003m c10003mM936m = m936m(c5799e);
        if (c10003mM936m == null && (c10003mM936m = m936m(c5799e2)) == null) {
            c10003mM936m = m942s(C5799e.f18172s);
        }
        C9995i c9995i = new C9995i();
        c9995i.mo38736y0(c5799e.m23297c());
        if (c9995i.size() > 0) {
            c9995i.mo38736y0(c10003mM936m);
        }
        c9995i.mo38736y0(c5799e2.m23297c());
        return m940q(c9995i, z10);
    }

    /* JADX INFO: renamed from: k */
    public static final C5799e m934k(String str, boolean z10) {
        str.getClass();
        return m940q(new C9995i().mo38698a0(str), z10);
    }

    /* JADX INFO: renamed from: l */
    public static final int m935l(C5799e c5799e) {
        int iM38758y = C10003m.m38758y(c5799e.m23297c(), f765a, 0, 2, null);
        return iM38758y != -1 ? iM38758y : C10003m.m38758y(c5799e.m23297c(), f766b, 0, 2, null);
    }

    /* JADX INFO: renamed from: m */
    public static final C10003m m936m(C5799e c5799e) {
        C10003m c10003mM23297c = c5799e.m23297c();
        C10003m c10003m = f765a;
        if (C10003m.m38757t(c10003mM23297c, c10003m, 0, 2, null) != -1) {
            return c10003m;
        }
        C10003m c10003mM23297c2 = c5799e.m23297c();
        C10003m c10003m2 = f766b;
        if (C10003m.m38757t(c10003mM23297c2, c10003m2, 0, 2, null) != -1) {
            return c10003m2;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m937n(C5799e c5799e) {
        return c5799e.m23297c().m38776i(f769e) && (c5799e.m23297c().m38765G() == 2 || c5799e.m23297c().mo38759A(c5799e.m23297c().m38765G() + (-3), f765a, 0, 1) || c5799e.m23297c().mo38759A(c5799e.m23297c().m38765G() + (-3), f766b, 0, 1));
    }

    /* JADX INFO: renamed from: o */
    public static final int m938o(C5799e c5799e) {
        if (c5799e.m23297c().m38765G() == 0) {
            return -1;
        }
        if (c5799e.m23297c().m38777j(0) == 47) {
            return 1;
        }
        if (c5799e.m23297c().m38777j(0) == 92) {
            if (c5799e.m23297c().m38765G() <= 2 || c5799e.m23297c().m38777j(1) != 92) {
                return 1;
            }
            int iM38783r = c5799e.m23297c().m38783r(f766b, 2);
            return iM38783r == -1 ? c5799e.m23297c().m38765G() : iM38783r;
        }
        if (c5799e.m23297c().m38765G() > 2 && c5799e.m23297c().m38777j(1) == 58 && c5799e.m23297c().m38777j(2) == 92) {
            char cM38777j = (char) c5799e.m23297c().m38777j(0);
            if ('a' <= cM38777j && cM38777j < '{') {
                return 3;
            }
            if ('A' <= cM38777j && cM38777j < '[') {
                return 3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m939p(C9995i c9995i, C10003m c10003m) {
        if (!AbstractC1061t.m3842c(c10003m, f766b) || c9995i.size() < 2 || c9995i.m38716l(1L) != 58) {
            return false;
        }
        char cM38716l = (char) c9995i.m38716l(0L);
        if ('a' > cM38716l || cM38716l >= '{') {
            return 'A' <= cM38716l && cM38716l < '[';
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static final C5799e m940q(C9995i c9995i, boolean z10) throws EOFException {
        C10003m c10003m;
        C10003m c10003mMo38729u;
        c9995i.getClass();
        C9995i c9995i2 = new C9995i();
        C10003m c10003mM941r = null;
        int i10 = 0;
        while (true) {
            if (!c9995i.mo38706f0(0L, f765a)) {
                c10003m = f766b;
                if (!c9995i.mo38706f0(0L, c10003m)) {
                    break;
                }
            }
            byte b10 = c9995i.readByte();
            if (c10003mM941r == null) {
                c10003mM941r = m941r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && AbstractC1061t.m3842c(c10003mM941r, c10003m);
        if (z11) {
            c10003mM941r.getClass();
            c9995i2.mo38736y0(c10003mM941r);
            c9995i2.mo38736y0(c10003mM941r);
        } else if (i10 > 0) {
            c10003mM941r.getClass();
            c9995i2.mo38736y0(c10003mM941r);
        } else {
            long jM38719n = c9995i.m38719n(f767c);
            if (c10003mM941r == null) {
                c10003mM941r = jM38719n == -1 ? m942s(C5799e.f18172s) : m941r(c9995i.m38716l(jM38719n));
            }
            if (m939p(c9995i, c10003mM941r)) {
                if (jM38719n == 2) {
                    c9995i2.write(c9995i, 3L);
                } else {
                    c9995i2.write(c9995i, 2L);
                }
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        boolean z12 = c9995i2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c9995i.mo38707g()) {
            long jM38719n2 = c9995i.m38719n(f767c);
            if (jM38719n2 == -1) {
                c10003mMo38729u = c9995i.mo38717l0();
            } else {
                c10003mMo38729u = c9995i.mo38729u(jM38719n2);
                c9995i.readByte();
            }
            C10003m c10003m2 = f769e;
            if (AbstractC1061t.m3842c(c10003mMo38729u, c10003m2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || AbstractC1061t.m3842c(AbstractC5081g0.m20587u0(arrayList), c10003m2)))) {
                        arrayList.add(c10003mMo38729u);
                    } else if (!z11 || arrayList.size() != 1) {
                        AbstractC5070c0.m20500M(arrayList);
                    }
                }
            } else if (!AbstractC1061t.m3842c(c10003mMo38729u, f768d) && !AbstractC1061t.m3842c(c10003mMo38729u, C10003m.f33583u)) {
                arrayList.add(c10003mMo38729u);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                c9995i2.mo38736y0(c10003mM941r);
            }
            c9995i2.mo38736y0((C10003m) arrayList.get(i11));
        }
        if (c9995i2.size() == 0) {
            c9995i2.mo38736y0(f768d);
        }
        return new C5799e(c9995i2.mo38717l0());
    }

    /* JADX INFO: renamed from: r */
    public static final C10003m m941r(byte b10) {
        if (b10 == 47) {
            return f765a;
        }
        if (b10 == 92) {
            return f766b;
        }
        C0306e.m922a("not a directory separator: ", b10);
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final C10003m m942s(String str) {
        if (AbstractC1061t.m3842c(str, "/")) {
            return f765a;
        }
        if (AbstractC1061t.m3842c(str, "\\")) {
            return f766b;
        }
        C0307f.m923a("not a directory separator: ", str);
        return null;
    }
}
