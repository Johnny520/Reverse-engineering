package p077P0;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import com.bumptech.glide.AbstractC1924f;
import java.util.List;
import p000A.C0066i0;
import p029F0.AbstractC0435z;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0632z0;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2015k;
import p169h0.AbstractC2206o;
import p186k.AbstractC2429k;
import p186k.C2408E;
import p186k.C2439u;
import p204n0.C2684c;

/* JADX INFO: renamed from: P0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1131r {

    /* JADX INFO: renamed from: a */
    public static final C2684c f3721a = new C2684c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1128o m2182a(C0564I c0564i, boolean z5) {
        AbstractC2206o abstractC2206o = c0564i.f1699J.f1896f;
        InterfaceC0597i interfaceC0597i = null;
        if ((abstractC2206o.f7189g & 8) != 0) {
            loop0: while (true) {
                if (abstractC2206o == null) {
                    break;
                }
                if ((abstractC2206o.f7188f & 8) != 0) {
                    AbstractC2206o abstractC2206oM1029e = abstractC2206o;
                    C1483e c1483e = null;
                    while (abstractC2206oM1029e != null) {
                        if (abstractC2206oM1029e instanceof InterfaceC0632z0) {
                            interfaceC0597i = abstractC2206oM1029e;
                            break loop0;
                        }
                        if ((abstractC2206oM1029e.f7188f & 8) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                            int i5 = 0;
                            for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                if ((abstractC2206o2.f7188f & 8) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        abstractC2206oM1029e = abstractC2206o2;
                                    } else {
                                        if (c1483e == null) {
                                            c1483e = new C1483e(new AbstractC2206o[16]);
                                        }
                                        if (abstractC2206oM1029e != null) {
                                            c1483e.m2753b(abstractC2206oM1029e);
                                            abstractC2206oM1029e = null;
                                        }
                                        c1483e.m2753b(abstractC2206o2);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                    }
                    if ((abstractC2206o.f7189g & 8) != 0) {
                        break;
                    }
                    abstractC2206o = abstractC2206o.f7191i;
                } else if ((abstractC2206o.f7189g & 8) != 0) {
                }
            }
        }
        AbstractC1665j.m2982b(interfaceC0597i);
        AbstractC2206o abstractC2206o3 = ((AbstractC2206o) ((InterfaceC0632z0) interfaceC0597i)).f7186d;
        C1125l c1125lM841w = c0564i.m841w();
        if (c1125lM841w == null) {
            c1125lM841w = new C1125l();
        }
        return new C1128o(abstractC2206o3, z5, c0564i, c1125lM841w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C2439u m2183b(C1130q c1130q, InterfaceC1601c interfaceC1601c) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C1128o c1128oM2180a = c1130q.m2180a();
            C0564I c0564i = c1128oM2180a.f3710c;
            if (c0564i.m801I() && c0564i.m799G()) {
                C2439u c2439u = new C2439u(48);
                C0066i0 c0066i0 = new C0066i0(15);
                C2015k c2015kM3508v = AbstractC1924f.m3508v(c1128oM2180a.m2170g());
                ((Region) c0066i0.f297e).set(c2015kM3508v.f6737a, c2015kM3508v.f6738b, c2015kM3508v.f6739c, c2015kM3508v.f6740d);
                m2184c(c0066i0, c1128oM2180a, c2439u, interfaceC1601c, c1128oM2180a, new C0066i0(15));
                return c2439u;
            }
            C2439u c2439u2 = AbstractC2429k.f7850a;
            AbstractC1665j.m2983c(c2439u2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return c2439u2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2184c(C0066i0 c0066i0, C1128o c1128o, C2439u c2439u, InterfaceC1601c interfaceC1601c, C1128o c1128o2, C0066i0 c0066i02) {
        C2684c c2684cM1001m1;
        C0564I c0564i;
        C1128o c1128o3 = c1128o;
        int i5 = c1128o3.f3714g;
        C0066i0 c0066i03 = c0066i02;
        Region region = (Region) c0066i03.f297e;
        C0564I c0564i2 = c1128o2.f3710c;
        int i6 = c1128o2.f3714g;
        boolean z5 = (c0564i2.m801I() && c0564i2.m799G()) ? false : true;
        C0066i0 c0066i04 = c0066i0;
        Region region2 = (Region) c0066i04.f297e;
        if (!region2.isEmpty() || i6 == i5) {
            if (!z5 || c1128o2.f3712e) {
                InterfaceC0597i interfaceC0597iM2169f = c1128o2.m2169f();
                if (interfaceC0597iM2169f == null) {
                    c2684cM1001m1 = c0564i2.f1699J.f1893c.m1001m1();
                } else {
                    AbstractC2206o abstractC2206o = ((AbstractC2206o) interfaceC0597iM2169f).f7186d;
                    Object objM4272g = c1128o2.f3711d.f3702d.m4272g(AbstractC1124k.f3677b);
                    if (objM4272g == null) {
                        objM4272g = null;
                    }
                    boolean z6 = objM4272g != null;
                    if (!abstractC2206o.f7186d.f7199q) {
                        c2684cM1001m1 = C2684c.f8557e;
                    } else if (z6) {
                        c2684cM1001m1 = AbstractC0601k.m1042r(abstractC2206o, 8).m1001m1();
                    } else {
                        AbstractC0596h0 abstractC0596h0M1042r = AbstractC0601k.m1042r(abstractC2206o, 8);
                        c2684cM1001m1 = AbstractC0435z.m693f(abstractC0596h0M1042r).mo634K(abstractC0596h0M1042r, true);
                    }
                }
                C2015k c2015kM3508v = AbstractC1924f.m3508v(c2684cM1001m1);
                region.set(c2015kM3508v.f6737a, c2015kM3508v.f6738b, c2015kM3508v.f6739c, c2015kM3508v.f6740d);
                if (i6 == i5) {
                    i6 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (c1128o2.f3712e) {
                        C1128o c1128oM2174l = c1128o2.m2174l();
                        c2439u.m4344h(i6, new C1129p(c1128o2, AbstractC1924f.m3508v((c1128oM2174l == null || (c0564i = c1128oM2174l.f3710c) == null || !c0564i.m801I()) ? f3721a : c1128oM2174l.m2170g())));
                        return;
                    } else {
                        if (i6 == -1) {
                            Rect bounds = region.getBounds();
                            c2439u.m4344h(i6, new C1129p(c1128o2, new C2015k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                c2439u.m4344h(i6, new C1129p(c1128o2, new C2015k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM2163j = C1128o.m2163j(4, c1128o2);
                int size = listM2163j.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) interfaceC1601c.mo1h(listM2163j.get(size))).booleanValue()) {
                        m2184c(c0066i04, c1128o3, c2439u, interfaceC1601c, (C1128o) listM2163j.get(size), c0066i03);
                    }
                    size--;
                    c0066i04 = c0066i0;
                    c1128o3 = c1128o;
                    c0066i03 = c0066i02;
                }
                if (m2187f(c1128o2)) {
                    region2.op(c2015kM3508v.f6737a, c2015kM3508v.f6738b, c2015kM3508v.f6739c, c2015kM3508v.f6740d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final Object m2185d(C1125l c1125l, C1135v c1135v) {
        Object objM4272g = c1125l.f3702d.m4272g(c1135v);
        if (objM4272g == null) {
            return null;
        }
        return objM4272g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m2186e(C1128o c1128o) {
        AbstractC0596h0 abstractC0596h0M2167d = c1128o.m2167d();
        C1125l c1125l = c1128o.f3711d;
        if (abstractC0596h0M2167d != null ? abstractC0596h0M2167d.m989Z0() : false) {
            return true;
        }
        C1135v c1135v = AbstractC1132s.f3738a;
        if (c1125l.f3702d.m4268c(AbstractC1132s.f3753p)) {
            return true;
        }
        return c1125l.f3702d.m4268c(AbstractC1132s.f3752o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m2187f(C1128o c1128o) {
        if (!m2186e(c1128o)) {
            C1125l c1125l = c1128o.f3711d;
            if (c1125l.f3704f) {
                return true;
            }
            C2408E c2408e = c1125l.f3702d;
            Object[] objArr = c2408e.f7788b;
            Object[] objArr2 = c2408e.f7789c;
            long[] jArr = c2408e.f7787a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j5) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr[i8];
                                Object obj2 = objArr2[i8];
                                if (((C1135v) obj).f3769c) {
                                    return true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        return false;
    }
}
