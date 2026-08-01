package p077P0;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import com.bumptech.glide.AbstractC1924f;
import java.util.List;
import p000A.C0066i0;
import p029F0.AbstractC0435z;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.InterfaceC0597i;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2015k;
import p169h0.AbstractC2206o;
import p186k.AbstractC2429k;
import p186k.C2439u;
import p204n0.C2684c;

/* JADX INFO: renamed from: P0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1131r {

    /* JADX INFO: renamed from: a */
    public static final C2684c f3721a = new C2684c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p077P0.C1128o m2182a(p041H0.C0564I r8, boolean r9) {
        /*
            H0.e0 r0 = r8.f1699J
            h0.o r0 = r0.f1896f
            int r1 = r0.f7189g
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f7188f
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof p041H0.InterfaceC0632z0
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f7188f
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof p041H0.AbstractC0599j
            if (r4 == 0) goto L56
            r4 = r1
            H0.j r4 = (p041H0.AbstractC0599j) r4
            h0.o r4 = r4.f1943s
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f7188f
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            V.e r3 = new V.e
            r6 = 16
            h0.o[] r6 = new p169h0.AbstractC2206o[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.m2753b(r1)
            r1 = r2
        L4d:
            r3.m2753b(r4)
        L50:
            h0.o r4 = r4.f7191i
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            h0.o r1 = p041H0.AbstractC0601k.m1029e(r3)
            goto L15
        L5b:
            int r1 = r0.f7189g
            r1 = r1 & 8
            if (r1 == 0) goto L64
            h0.o r0 = r0.f7191i
            goto Lb
        L64:
            p117X2.AbstractC1665j.m2982b(r2)
            H0.z0 r2 = (p041H0.InterfaceC0632z0) r2
            h0.o r2 = (p169h0.AbstractC2206o) r2
            h0.o r0 = r2.f7186d
            P0.l r1 = r8.m841w()
            if (r1 != 0) goto L78
            P0.l r1 = new P0.l
            r1.<init>()
        L78:
            P0.o r2 = new P0.o
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p077P0.AbstractC1131r.m2182a(H0.I, boolean):P0.o");
    }

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

    /* JADX INFO: renamed from: d */
    public static final Object m2185d(C1125l c1125l, C1135v c1135v) {
        Object objM4272g = c1125l.f3702d.m4272g(c1135v);
        if (objM4272g == null) {
            return null;
        }
        return objM4272g;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m2187f(p077P0.C1128o r14) {
        /*
            boolean r0 = m2186e(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            P0.l r14 = r14.f3711d
            boolean r0 = r14.f3704f
            if (r0 != 0) goto L59
            k.E r14 = r14.f3702d
            java.lang.Object[] r0 = r14.f7788b
            java.lang.Object[] r2 = r14.f7789c
            long[] r14 = r14.f7787a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            P0.v r11 = (p077P0.C1135v) r11
            boolean r10 = r11.f3769c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p077P0.AbstractC1131r.m2187f(P0.o):boolean");
    }
}
