package p072f2;

import ac.AbstractC0063p;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.lifecycle.C0119x;
import java.util.List;
import p057e1.C0808c;
import p069f.AbstractC0944l;
import p069f.C0943k0;
import p069f.C0965w;
import p085fg.InterfaceC1231l;
import p131j0.C2046b;
import p219oh.AbstractC3165h;
import p259r9.AbstractC3754e0;
import p293u2.C4241k;
import p308v1.AbstractC4434w;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;
import p339x1.C5639r;
import p339x1.InterfaceC5612i;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f2.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1057t {

    /* JADX INFO: renamed from: a */
    public static final C0808c f3359a = new C0808c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1054q m2670a(C5602f0 c5602f0, boolean z9) {
        AbstractC5852n abstractC5852n = c5602f0.f22778L.f22719f;
        InterfaceC5612i interfaceC5612i = null;
        if ((abstractC5852n.f23791j & 8) != 0) {
            loop0: while (true) {
                if (abstractC5852n == null) {
                    break;
                }
                if ((abstractC5852n.f23790i & 8) != 0) {
                    AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                    C2046b c2046b = null;
                    while (abstractC5852nM10149e != null) {
                        if (abstractC5852nM10149e instanceof InterfaceC5665z1) {
                            interfaceC5612i = abstractC5852nM10149e;
                            break loop0;
                        }
                        if ((abstractC5852nM10149e.f23790i & 8) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                            int i9 = 0;
                            for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                if ((abstractC5852n2.f23790i & 8) != 0) {
                                    i9++;
                                    if (i9 == 1) {
                                        abstractC5852nM10149e = abstractC5852n2;
                                    } else {
                                        if (c2046b == null) {
                                            c2046b = new C2046b(new AbstractC5852n[16]);
                                        }
                                        if (abstractC5852nM10149e != null) {
                                            c2046b.m5056b(abstractC5852nM10149e);
                                            abstractC5852nM10149e = null;
                                        }
                                        c2046b.m5056b(abstractC5852n2);
                                    }
                                }
                            }
                            if (i9 == 1) {
                            }
                        }
                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                    }
                    if ((abstractC5852n.f23791j & 8) != 0) {
                        break;
                    }
                    abstractC5852n = abstractC5852n.f23793l;
                } else if ((abstractC5852n.f23791j & 8) != 0) {
                }
            }
        }
        interfaceC5612i.getClass();
        AbstractC5852n abstractC5852n3 = ((AbstractC5852n) ((InterfaceC5665z1) interfaceC5612i)).f23788g;
        C1050m c1050mM10051w = c5602f0.m10051w();
        if (c1050mM10051w == null) {
            c1050mM10051w = new C1050m();
        }
        return new C1054q(abstractC5852n3, z9, c5602f0, c1050mM10051w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C0965w m2671b(C1056s c1056s, InterfaceC1231l interfaceC1231l) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C1054q c1054qM2668a = c1056s.m2668a();
            C5602f0 c5602f0 = c1054qM2668a.f3349c;
            if (c5602f0.m10011H() && c5602f0.m10010G()) {
                C0808c c0808cM2656g = c1054qM2668a.m2656g();
                C0965w c0965w = new C0965w(48);
                C0119x c0119x = new C0119x(11);
                c0119x.m591W(AbstractC3165h.m6765Q(c0808cM2656g));
                m2674e(new C0119x(11), c0119x, c0965w, c1054qM2668a, c1054qM2668a, interfaceC1231l);
                return c0965w;
            }
            C0965w c0965w2 = AbstractC0944l.f2974a;
            c0965w2.getClass();
            return c0965w2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2672c(C0119x c0119x, C0119x c0119x2, C0965w c0965w, C1054q c1054q, C1054q c1054q2, InterfaceC1231l interfaceC1231l) {
        C0119x c0119x3 = c0119x;
        Region region = (Region) c0119x3.f310h;
        C0119x c0119x4 = c0119x2;
        Region region2 = (Region) c0119x4.f310h;
        C5602f0 c5602f0 = c1054q2.f3349c;
        C5602f0 c5602f02 = c1054q2.f3349c;
        if (!c5602f0.m10011H() || !c5602f02.m10010G() || region2.isEmpty()) {
            if (c1054q2.m2663o()) {
                m2673d(c0965w, c1054q, c1054q2);
                return;
            }
            return;
        }
        C0808c c0808cM2661m = c1054q2.m2661m();
        if (c0808cM2661m.m2050f()) {
            InterfaceC5612i interfaceC5612iM2655f = c1054q2.m2655f();
            if (interfaceC5612iM2655f == null) {
                C5639r c5639r = c5602f02.f22778L.f22716c;
                c0808cM2661m = AbstractC4434w.m8884h(c5639r).mo8866k0(c5639r, false);
            } else {
                AbstractC5852n abstractC5852n = ((AbstractC5852n) interfaceC5612iM2655f).f23788g;
                Object objM2320g = c1054q2.f3350d.f3341g.m2320g(AbstractC1049l.f3316b);
                if (objM2320g == null) {
                    objM2320g = null;
                }
                c0808cM2661m = AbstractC5618k.m10153i(abstractC5852n, objM2320g != null, false);
            }
        }
        C4241k c4241kM6765Q = AbstractC3165h.m6765Q(c0808cM2661m);
        c0119x3.m591W(c4241kM6765Q);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i9 = c1054q2.f3352f;
            C1054q c1054q3 = c1054q;
            if (i9 == c1054q3.f3352f) {
                i9 = -1;
            }
            Rect bounds = region.getBounds();
            C1055r c1055r = new C1055r(c1054q2, new C4241k(bounds.left, bounds.top, bounds.right, bounds.bottom));
            C0965w c0965w2 = c0965w;
            c0965w2.m2379h(i9, c1055r);
            List listM2649j = C1054q.m2649j(4, c1054q2);
            int size = listM2649j.size() - 1;
            while (-1 < size) {
                if (!((Boolean) interfaceC1231l.invoke(listM2649j.get(size))).booleanValue()) {
                    m2672c(c0119x3, c0119x4, c0965w2, c1054q3, (C1054q) listM2649j.get(size), interfaceC1231l);
                }
                size--;
                c0119x3 = c0119x;
                c0119x4 = c0119x2;
                c0965w2 = c0965w;
                c1054q3 = c1054q;
            }
            if (m2677h(c1054q2)) {
                region2.op(c4241kM6765Q.f13914a, c4241kM6765Q.f13915b, c4241kM6765Q.f13916c, c4241kM6765Q.f13917d, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m2673d(C0965w c0965w, C1054q c1054q, C1054q c1054q2) {
        C5602f0 c5602f0;
        C1054q c1054qM2660l = c1054q2.m2660l();
        C0808c c0808cM2656g = (c1054qM2660l == null || (c5602f0 = c1054qM2660l.f3349c) == null || !c5602f0.m10011H()) ? f3359a : c1054qM2660l.m2656g();
        int i9 = c1054q2.f3352f;
        if (i9 == c1054q.f3352f) {
            i9 = -1;
        }
        c0965w.m2379h(i9, new C1055r(c1054q2, AbstractC3165h.m6765Q(c0808cM2656g)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2674e(C0119x c0119x, C0119x c0119x2, C0965w c0965w, C1054q c1054q, C1054q c1054q2, InterfaceC1231l interfaceC1231l) {
        boolean z9;
        C0808c c0808cM10153i;
        boolean z10;
        AbstractC5614i1 abstractC5614i1M2653d;
        C1054q c1054q3 = c1054q;
        InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
        int i9 = c1054q3.f3352f;
        Region region = (Region) c0119x.f310h;
        C0119x c0119x3 = c0119x2;
        Region region2 = (Region) c0119x3.f310h;
        C5602f0 c5602f0 = c1054q2.f3349c;
        C1050m c1050m = c1054q2.f3350d;
        C5602f0 c5602f02 = c1054q2.f3349c;
        int i10 = c1054q2.f3352f;
        boolean z11 = (c5602f0.m10011H() && c5602f02.m10010G()) ? false : true;
        if (!region2.isEmpty() || i10 == i9) {
            if (!z11 || c1054q2.m2663o()) {
                C4241k c4241kM6765Q = AbstractC3165h.m6765Q(c1054q2.m2661m());
                c0119x.m591W(c4241kM6765Q);
                if (i10 == i9) {
                    i10 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (c1054q2.m2663o()) {
                        m2673d(c0965w, c1054q, c1054q2);
                        return;
                    } else {
                        if (i10 == -1) {
                            Rect bounds = region.getBounds();
                            c0965w.m2379h(i10, new C1055r(c1054q2, new C4241k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                c0965w.m2379h(i10, new C1055r(c1054q2, new C4241k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM2649j = C1054q.m2649j(4, c1054q2);
                if (c1050m.f3343i) {
                    C1054q c1054qM2660l = c1054q2.m2660l();
                    while (true) {
                        if (c1054qM2660l == null) {
                            c1054qM2660l = null;
                            break;
                        }
                        C0943k0 c0943k0 = c1054qM2660l.f3350d.f3341g;
                        if (c0943k0.m2316c(AbstractC1058u.f3397v) || c0943k0.m2316c(AbstractC1058u.f3396u)) {
                            break;
                        } else {
                            c1054qM2660l = c1054qM2660l.m2660l();
                        }
                    }
                    if (c1054qM2660l == null) {
                        z10 = false;
                        z9 = z10;
                    } else {
                        AbstractC5614i1 abstractC5614i1M2653d2 = c1054q2.m2653d();
                        if (abstractC5614i1M2653d2 == null) {
                            abstractC5614i1M2653d2 = null;
                            abstractC5614i1M2653d = c1054qM2660l.m2653d();
                            if (abstractC5614i1M2653d == null) {
                                abstractC5614i1M2653d = null;
                                if (abstractC5614i1M2653d2 == null && abstractC5614i1M2653d != null) {
                                    C0808c c0808cMo8866k0 = abstractC5614i1M2653d.mo8866k0(abstractC5614i1M2653d2, false);
                                    z10 = !c0808cMo8866k0.equals(c0808cMo8866k0.m2049e(AbstractC0063p.m408a(0L, AbstractC3754e0.m7908q0(abstractC5614i1M2653d.f14595i))));
                                }
                                if (z10) {
                                }
                            } else {
                                if (!abstractC5614i1M2653d.mo10106r1().f23801t) {
                                    abstractC5614i1M2653d = null;
                                }
                                if (abstractC5614i1M2653d == null) {
                                }
                                if (abstractC5614i1M2653d2 == null) {
                                    z10 = false;
                                    if (z10) {
                                    }
                                }
                            }
                        } else {
                            if (!abstractC5614i1M2653d2.mo10106r1().f23801t) {
                                abstractC5614i1M2653d2 = null;
                            }
                            if (abstractC5614i1M2653d2 == null) {
                            }
                            abstractC5614i1M2653d = c1054qM2660l.m2653d();
                            if (abstractC5614i1M2653d == null) {
                            }
                        }
                    }
                }
                if (z9) {
                    C0119x c0119x4 = new C0119x(11);
                    InterfaceC5612i interfaceC5612iM2655f = c1054q2.m2655f();
                    if (interfaceC5612iM2655f == null) {
                        C5639r c5639r = c5602f02.f22778L.f22716c;
                        c0808cM10153i = AbstractC4434w.m8884h(c5639r).mo8866k0(c5639r, false);
                    } else {
                        AbstractC5852n abstractC5852n = ((AbstractC5852n) interfaceC5612iM2655f).f23788g;
                        Object objM2320g = c1050m.f3341g.m2320g(AbstractC1049l.f3316b);
                        c0808cM10153i = AbstractC5618k.m10153i(abstractC5852n, (objM2320g == null ? null : objM2320g) != null, false);
                    }
                    c0119x4.m591W(AbstractC3165h.m6765Q(c0808cM10153i));
                    int size = listM2649j.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) interfaceC1231l2.invoke(listM2649j.get(size))).booleanValue()) {
                            m2672c(new C0119x(11), c0119x4, c0965w, c1054q3, (C1054q) listM2649j.get(size), interfaceC1231l2);
                        }
                        size--;
                        c1054q3 = c1054q;
                    }
                } else {
                    int size2 = listM2649j.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) interfaceC1231l2.invoke(listM2649j.get(size2))).booleanValue()) {
                            m2674e(c0119x, c0119x3, c0965w, c1054q, (C1054q) listM2649j.get(size2), interfaceC1231l2);
                        }
                        size2--;
                        c0119x3 = c0119x2;
                        interfaceC1231l2 = interfaceC1231l;
                    }
                }
                if (m2677h(c1054q2)) {
                    region2.op(c4241kM6765Q.f13914a, c4241kM6765Q.f13915b, c4241kM6765Q.f13916c, c4241kM6765Q.f13917d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final Object m2675f(C1050m c1050m, C1061x c1061x) {
        Object objM2320g = c1050m.f3341g.m2320g(c1061x);
        if (objM2320g == null) {
            return null;
        }
        return objM2320g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m2676g(C1054q c1054q) {
        AbstractC5614i1 abstractC5614i1M2653d = c1054q.m2653d();
        C0943k0 c0943k0 = c1054q.f3350d.f3341g;
        return (abstractC5614i1M2653d != null ? abstractC5614i1M2653d.m10114z1() : false) || c0943k0.m2316c(AbstractC1058u.f3391p) || c0943k0.m2316c(AbstractC1058u.f3390o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m2677h(C1054q c1054q) {
        if (!m2676g(c1054q)) {
            C1050m c1050m = c1054q.f3350d;
            if (c1050m.f3343i) {
                return true;
            }
            C0943k0 c0943k0 = c1050m.f3341g;
            Object[] objArr = c0943k0.f2969b;
            Object[] objArr2 = c0943k0.f2970c;
            long[] jArr = c0943k0.f2968a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j3 = jArr[i9];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j3) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr[i12];
                                Object obj2 = objArr2[i12];
                                if (((C1061x) obj).f3407c) {
                                    return true;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                    }
                }
            }
        }
        return false;
    }
}
