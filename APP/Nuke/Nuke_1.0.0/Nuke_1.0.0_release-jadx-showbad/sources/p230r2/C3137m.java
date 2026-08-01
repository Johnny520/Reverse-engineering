package p230r2;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import p042H1.AbstractC0636d;
import p213o2.AbstractC2770B;
import p213o2.AbstractC2788q;
import p213o2.C2787p;
import p213o2.C2790s;
import p213o2.C2791t;
import p213o2.C2792u;
import p224q2.C2919j;
import p224q2.C2920k;
import p224q2.C2921l;
import p224q2.C2922m;
import p237s4.AbstractC3202a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: r2.m */
/* JADX INFO: loaded from: classes.dex */
public class C3137m extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public static final C3137m f9876a = new C3137m();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C3137m() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static AbstractC2788q m5412d(C3390a c3390a, int i5) {
        int iM1088a = AbstractC0636d.m1088a(i5);
        if (iM1088a == 5) {
            return new C2792u(c3390a.m5628H());
        }
        if (iM1088a == 6) {
            return new C2792u(new C2919j(c3390a.m5628H()));
        }
        if (iM1088a == 7) {
            return new C2792u(Boolean.valueOf(c3390a.m5650w()));
        }
        if (iM1088a != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC3202a.m5469d(i5)));
        }
        c3390a.m5626F();
        return C2790s.f8817d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m5413e(C3391b c3391b, AbstractC2788q abstractC2788q) throws IOException {
        if (abstractC2788q == null || (abstractC2788q instanceof C2790s)) {
            c3391b.m5666n();
            return;
        }
        boolean z5 = abstractC2788q instanceof C2792u;
        if (z5) {
            if (!z5) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC2788q);
            }
            C2792u c2792u = (C2792u) abstractC2788q;
            Serializable serializable = c2792u.f8819d;
            if (serializable instanceof Number) {
                c3391b.m5654D(c2792u.m4982b());
                return;
            } else if (serializable instanceof Boolean) {
                c3391b.m5656F(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c2792u.m4983c()));
                return;
            } else {
                c3391b.m5655E(c2792u.m4983c());
                return;
            }
        }
        boolean z6 = abstractC2788q instanceof C2787p;
        if (z6) {
            c3391b.m5659c();
            if (!z6) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC2788q);
            }
            Iterator it = ((C2787p) abstractC2788q).f8816d.iterator();
            while (it.hasNext()) {
                m5413e(c3391b, (AbstractC2788q) it.next());
            }
            c3391b.m5662h();
            return;
        }
        boolean z7 = abstractC2788q instanceof C2791t;
        if (!z7) {
            throw new IllegalArgumentException("Couldn't write " + abstractC2788q.getClass());
        }
        c3391b.m5660d();
        if (!z7) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC2788q);
        }
        Iterator it2 = ((C2921l) ((C2791t) abstractC2788q).f8818d.entrySet()).iterator();
        while (((C2920k) it2).hasNext()) {
            C2922m c2922mM5122b = ((C2920k) it2).m5122b();
            c3391b.m5664l((String) c2922mM5122b.getKey());
            m5413e(c3391b, (AbstractC2788q) c2922mM5122b.getValue());
        }
        c3391b.m5663j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        AbstractC2788q c2787p;
        AbstractC2788q c2787p2;
        int iM5630J = c3390a.m5630J();
        int iM1088a = AbstractC0636d.m1088a(iM5630J);
        if (iM1088a == 0) {
            c3390a.m5639b();
            c2787p = new C2787p();
        } else if (iM1088a != 2) {
            c2787p = null;
        } else {
            c3390a.m5640c();
            c2787p = new C2791t();
        }
        if (c2787p == null) {
            return m5412d(c3390a, iM5630J);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c3390a.m5647n()) {
                String strM5624D = c2787p instanceof C2791t ? c3390a.m5624D() : null;
                int iM5630J2 = c3390a.m5630J();
                int iM1088a2 = AbstractC0636d.m1088a(iM5630J2);
                if (iM1088a2 == 0) {
                    c3390a.m5639b();
                    c2787p2 = new C2787p();
                } else if (iM1088a2 != 2) {
                    c2787p2 = null;
                } else {
                    c3390a.m5640c();
                    c2787p2 = new C2791t();
                }
                boolean z5 = c2787p2 != null;
                if (c2787p2 == null) {
                    c2787p2 = m5412d(c3390a, iM5630J2);
                }
                if (c2787p instanceof C2787p) {
                    ((C2787p) c2787p).f8816d.add(c2787p2);
                } else {
                    ((C2791t) c2787p).f8818d.put(strM5624D, c2787p2);
                }
                if (z5) {
                    arrayDeque.addLast(c2787p);
                    c2787p = c2787p2;
                }
            } else {
                if (c2787p instanceof C2787p) {
                    c3390a.m5643h();
                } else {
                    c3390a.m5644j();
                }
                if (arrayDeque.isEmpty()) {
                    return c2787p;
                }
                c2787p = (AbstractC2788q) arrayDeque.removeLast();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo4965c(C3391b c3391b, Object obj) throws IOException {
        m5413e(c3391b, (AbstractC2788q) obj);
    }
}
