package p264s0;

import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p049d9.AbstractC1927c;
import p080f9.AbstractC2368o;
import p121i3.C3173c;
import p135j2.AbstractC3500a0;
import p135j2.AbstractC3503b;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p152k3.AbstractC3949c;
import p165l1.InterfaceC4499e;
import p185m8.AbstractC5114x;
import p215oc.C5706c;
import p274t.C7823e;
import p275t0.InterfaceC8012w0;

/* JADX INFO: renamed from: s0.ke */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6814ke implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8012w0 f21855a;

    /* JADX INFO: renamed from: b */
    public final C7823e.m f21856b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4499e.b f21857c;

    /* JADX INFO: renamed from: d */
    public final int f21858d;

    /* JADX INFO: renamed from: e */
    public final float f21859e;

    public C6814ke(InterfaceC8012w0 interfaceC8012w0, C7823e.m mVar, InterfaceC4499e.b bVar, int i10, float f10) {
        this.f21855a = interfaceC8012w0;
        this.f21856b = mVar;
        this.f21857c = bVar;
        this.f21858d = i10;
        this.f21859e = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p172l8.C4700i0 m27013a(p135j2.AbstractC3545l1 r10, int r11, p135j2.AbstractC3545l1 r12, p135j2.AbstractC3545l1 r13, long r14, p135j2.InterfaceC3561q0 r16, p264s0.C6814ke r17, int r18, int r19, p135j2.AbstractC3545l1.a r20) {
        /*
            r0 = r17
            r1 = r19
            int r2 = r10.m13259G0()
            int r2 = r11 - r2
            int r6 = r2 / 2
            r8 = 4
            r9 = 0
            r5 = 0
            r7 = 0
            r4 = r10
            r3 = r20
            p135j2.AbstractC3545l1.a.m13270O(r3, r4, r5, r6, r7, r8, r9)
            float r2 = p264s0.AbstractC7016y.m27680o()
            r3 = r16
            int r2 = r3.mo1236x1(r2)
            int r10 = r10.m13264M0()
            int r10 = java.lang.Math.max(r2, r10)
            int r2 = r13.m13264M0()
            l1.e$b r3 = r0.f21857c
            int r4 = r12.m13264M0()
            int r5 = p121i3.C3173c.m11973l(r14)
            i3.u r6 = p121i3.EnumC3191u.f8484q
            int r3 = r3.mo17427a(r4, r5, r6)
            if (r3 >= r10) goto L42
            int r10 = r10 - r3
        L3f:
            int r3 = r3 + r10
        L40:
            r2 = r3
            goto L5a
        L42:
            int r10 = r12.m13264M0()
            int r10 = r10 + r3
            int r4 = p121i3.C3173c.m11973l(r14)
            int r4 = r4 - r2
            if (r10 <= r4) goto L40
            int r10 = p121i3.C3173c.m11973l(r14)
            int r10 = r10 - r2
            int r2 = r12.m13264M0()
            int r2 = r2 + r3
            int r10 = r10 - r2
            goto L3f
        L5a:
            t.e$m r10 = r0.f21856b
            t.e r3 = p274t.C7823e.f26045a
            t.e$f r4 = r3.m30273e()
            boolean r4 = p024b9.AbstractC1061t.m3842c(r10, r4)
            if (r4 == 0) goto L72
            int r10 = r12.m13259G0()
            int r10 = r11 - r10
            int r10 = r10 / 2
        L70:
            r3 = r10
            goto La5
        L72:
            t.e$m r3 = r3.m30272d()
            boolean r10 = p024b9.AbstractC1061t.m3842c(r10, r3)
            r3 = 0
            if (r10 == 0) goto La5
            int r10 = r0.f21858d
            if (r10 != 0) goto L88
            int r10 = r12.m13259G0()
            int r10 = r11 - r10
            goto L70
        L88:
            int r0 = r12.m13259G0()
            int r0 = r0 - r18
            int r10 = r10 - r0
            int r0 = r12.m13259G0()
            int r0 = r0 + r10
            if (r0 <= r1) goto L98
            int r0 = r0 - r1
            int r10 = r10 - r0
        L98:
            int r0 = r12.m13259G0()
            int r0 = r11 - r0
            int r10 = java.lang.Math.max(r3, r10)
            int r10 = r0 - r10
            goto L70
        La5:
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r12
            r0 = r20
            p135j2.AbstractC3545l1.a.m13270O(r0, r1, r2, r3, r4, r5, r6)
            int r10 = p121i3.C3173c.m11973l(r14)
            int r12 = r13.m13264M0()
            int r2 = r10 - r12
            int r10 = r13.m13259G0()
            int r11 = r11 - r10
            int r3 = r11 / 2
            r1 = r13
            p135j2.AbstractC3545l1.a.m13270O(r0, r1, r2, r3, r4, r5, r6)
            l8.i0 r10 = p172l8.C4700i0.f13910a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s0.C6814ke.m27013a(j2.l1, int, j2.l1, j2.l1, long, j2.q0, s0.ke, int, int, j2.l1$a):l8.i0");
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: b */
    public int mo3081b(InterfaceC3566s interfaceC3566s, List list, int i10) {
        int size = list.size();
        int iMo13147W = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iMo13147W += ((InterfaceC3563r) list.get(i11)).mo13147W(i10);
        }
        return iMo13147W;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        int iM8578e;
        InterfaceC3561q0 interfaceC3561q02;
        int i10;
        C6814ke c6814ke = this;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            InterfaceC3552n0 interfaceC3552n0 = (InterfaceC3552n0) list.get(i11);
            if (AbstractC1061t.m3842c(AbstractC3500a0.m13037a(interfaceC3552n0), "navigationIcon")) {
                AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(C3173c.m11965d(j10, 0, 0, 0, 0, 14, null));
                int size2 = list.size();
                int i12 = 0;
                while (i12 < size2) {
                    InterfaceC3552n0 interfaceC3552n02 = (InterfaceC3552n0) list.get(i12);
                    if (AbstractC1061t.m3842c(AbstractC3500a0.m13037a(interfaceC3552n02), "actionIcons")) {
                        AbstractC3545l1 abstractC3545l1Mo13148X2 = interfaceC3552n02.mo13148X(C3173c.m11965d(j10, 0, 0, 0, 0, 14, null));
                        int iM11973l = C3173c.m11973l(j10) == Integer.MAX_VALUE ? C3173c.m11973l(j10) : AbstractC2368o.m8578e((C3173c.m11973l(j10) - abstractC3545l1Mo13148X.m13264M0()) - abstractC3545l1Mo13148X2.m13264M0(), 0);
                        int size3 = list.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            InterfaceC3552n0 interfaceC3552n03 = (InterfaceC3552n0) list.get(i13);
                            if (AbstractC1061t.m3842c(AbstractC3500a0.m13037a(interfaceC3552n03), "title")) {
                                AbstractC3545l1 abstractC3545l1Mo13148X3 = interfaceC3552n03.mo13148X(C3173c.m11965d(j10, 0, iM11973l, 0, 0, 12, null));
                                int iMo13237G = abstractC3545l1Mo13148X3.mo13237G(AbstractC3503b.m13042b()) != Integer.MIN_VALUE ? abstractC3545l1Mo13148X3.mo13237G(AbstractC3503b.m13042b()) : 0;
                                float fInvoke = c6814ke.f21855a.invoke();
                                int iM6980d = Float.isNaN(fInvoke) ? 0 : AbstractC1927c.m6980d(fInvoke);
                                int iMax = Math.max(interfaceC3561q0.mo1236x1(c6814ke.f21859e), abstractC3545l1Mo13148X3.m13259G0());
                                if (C3173c.m11972k(j10) == Integer.MAX_VALUE) {
                                    iM8578e = iMax;
                                    interfaceC3561q02 = interfaceC3561q0;
                                    i10 = iM8578e;
                                } else {
                                    iM8578e = AbstractC2368o.m8578e(iM6980d + iMax, 0);
                                    interfaceC3561q02 = interfaceC3561q0;
                                    i10 = iMax;
                                }
                                return c6814ke.m27014f(interfaceC3561q02, j10, iM8578e, i10, abstractC3545l1Mo13148X, abstractC3545l1Mo13148X3, abstractC3545l1Mo13148X2, iMo13237G);
                            }
                            i13++;
                            c6814ke = this;
                        }
                        AbstractC3949c.m15657e("Collection contains no element matching the predicate.");
                        C5706c.m23089a();
                        return null;
                    }
                    i12++;
                    c6814ke = this;
                }
                AbstractC3949c.m15657e("Collection contains no element matching the predicate.");
                C5706c.m23089a();
                return null;
            }
            i11++;
            c6814ke = this;
        }
        AbstractC3949c.m15657e("Collection contains no element matching the predicate.");
        C5706c.m23089a();
        return null;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: d */
    public int mo13327d(InterfaceC3566s interfaceC3566s, List list, int i10) {
        Integer num;
        int iMo1236x1 = interfaceC3566s.mo1236x1(this.f21859e);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((InterfaceC3563r) list.get(0)).mo13150t(i10));
            int iM20802q = AbstractC5114x.m20802q(list);
            int i11 = 1;
            if (1 <= iM20802q) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC3563r) list.get(i11)).mo13150t(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM20802q) {
                        break;
                    }
                    i11++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iMo1236x1, num != null ? num.intValue() : 0);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: e */
    public int mo13328e(InterfaceC3566s interfaceC3566s, List list, int i10) {
        int size = list.size();
        int iMo13146S = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iMo13146S += ((InterfaceC3563r) list.get(i11)).mo13146S(i10);
        }
        return iMo13146S;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC3558p0 m27014f(final InterfaceC3561q0 interfaceC3561q0, final long j10, final int i10, final int i11, final AbstractC3545l1 abstractC3545l1, final AbstractC3545l1 abstractC3545l12, final AbstractC3545l1 abstractC3545l13, final int i12) {
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, C3173c.m11973l(j10), i10, null, new InterfaceC0184l() { // from class: s0.je
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C6814ke.m27013a(abstractC3545l1, i10, abstractC3545l12, abstractC3545l13, j10, interfaceC3561q0, this, i12, i11, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: h */
    public int mo13329h(InterfaceC3566s interfaceC3566s, List list, int i10) {
        Integer num;
        int iMo1236x1 = interfaceC3566s.mo1236x1(this.f21859e);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((InterfaceC3563r) list.get(0)).mo13151z0(i10));
            int iM20802q = AbstractC5114x.m20802q(list);
            int i11 = 1;
            if (1 <= iM20802q) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC3563r) list.get(i11)).mo13151z0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM20802q) {
                        break;
                    }
                    i11++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iMo1236x1, num != null ? num.intValue() : 0);
    }

    public /* synthetic */ C6814ke(InterfaceC8012w0 interfaceC8012w0, C7823e.m mVar, InterfaceC4499e.b bVar, int i10, float f10, AbstractC1043k abstractC1043k) {
        this(interfaceC8012w0, mVar, bVar, i10, f10);
    }
}
