package p041H0;

import java.util.Map;
import p023E0.AbstractC0277a;
import p029F0.AbstractC0388a;
import p029F0.AbstractC0391b0;
import p029F0.C0374L;
import p029F0.C0414n;
import p029F0.C0419p0;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p029F0.InterfaceC0430v;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p061L2.AbstractC0972l;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p186k.C2408E;
import p186k.C2409F;

/* JADX INFO: renamed from: H0.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0572Q extends AbstractC0391b0 implements InterfaceC0379Q, InterfaceC0584b0 {

    /* JADX INFO: renamed from: i */
    public C0569N f1776i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1601c f1777j;

    /* JADX INFO: renamed from: k */
    public C0622u0 f1778k;

    /* JADX INFO: renamed from: l */
    public boolean f1779l;

    /* JADX INFO: renamed from: m */
    public boolean f1780m;

    /* JADX INFO: renamed from: n */
    public boolean f1781n;

    /* JADX INFO: renamed from: o */
    public final C0374L f1782o = new C0374L(0, this);

    /* JADX INFO: renamed from: p */
    public C0630y0 f1783p;

    /* JADX INFO: renamed from: q */
    public C2408E f1784q;

    /* JADX INFO: renamed from: D0 */
    public static void m878D0(AbstractC0596h0 abstractC0596h0) {
        C0565J c0565j;
        AbstractC0596h0 abstractC0596h02 = abstractC0596h0.f1933s;
        C0564I c0564i = abstractC0596h0.f1932r;
        if (!AbstractC1665j.m2981a(abstractC0596h02 != null ? abstractC0596h02.f1932r : null, c0564i)) {
            c0564i.f1700K.f1760p.f1863z.m850f();
            return;
        }
        InterfaceC0581a interfaceC0581aMo911x = c0564i.f1700K.f1760p.mo911x();
        if (interfaceC0581aMo911x == null || (c0565j = ((C0580Z) interfaceC0581aMo911x).f1863z) == null) {
            return;
        }
        c0565j.m850f();
    }

    /* JADX INFO: renamed from: A0 */
    public abstract AbstractC0572Q mo879A0();

    /* JADX INFO: renamed from: B0 */
    public abstract long mo880B0();

    /* JADX INFO: renamed from: C0 */
    public final C0569N m881C0() {
        C0569N c0569n = this.f1776i;
        if (c0569n != null) {
            return c0569n;
        }
        C0569N c0569n2 = new C0569N(this);
        this.f1776i = c0569n2;
        return c0569n2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public final void m882E0(C2409F c2409f) {
        C0564I c0564i;
        Object[] objArr = c2409f.f7794b;
        long[] jArr = c2409f.f7793a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128 && (c0564i = (C0564I) ((C0562G0) objArr[(i5 << 3) + i7]).get()) != null) {
                        if (mo606z()) {
                            c0564i.m811S(false);
                        } else {
                            c0564i.m812U(false);
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public abstract void mo883F0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m884m0(p041H0.C0564I r32, p029F0.C0414n r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.AbstractC0572Q.m884m0(H0.I, F0.n):void");
    }

    /* JADX INFO: renamed from: n0 */
    public abstract int mo885n0(AbstractC0388a abstractC0388a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final void m886p0(C0622u0 c0622u0, long j5, long j6) {
        char c5;
        long j7;
        long j8;
        long j9;
        C0564I c0564i;
        int i5;
        char c6;
        long j10;
        AbstractC0572Q abstractC0572QMo879A0;
        C0618s0 snapshotObserver;
        C2408E c2408e = this.f1784q;
        C0630y0 c0630y0 = this.f1783p;
        if (c0630y0 == null) {
            c0630y0 = new C0630y0();
            this.f1783p = c0630y0;
        }
        C0630y0 c0630y02 = c0630y0;
        InterfaceC0614q0 interfaceC0614q0 = mo893y0().f1725r;
        if (interfaceC0614q0 != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).getSnapshotObserver()) != null) {
            snapshotObserver.f1972a.m3867c(c0622u0, C0587d.f1874g, new C0570O(this, j5, j6, c0622u0));
        }
        boolean zMo606z = mo606z();
        C2409F c2409f = (C2409F) c0630y02.f2003f;
        C2409F c2409f2 = (C2409F) c0630y02.f2004g;
        int i6 = c0630y02.f1999b;
        for (int i7 = 0; i7 < i6; i7++) {
            byte b2 = ((byte[]) c0630y02.f2002e)[i7];
            if (b2 == 3) {
                C0414n c0414n = ((C0414n[]) c0630y02.f2000c)[i7];
                AbstractC1665j.m2982b(c0414n);
                c2409f2.m4288j(c0414n);
            } else if (b2 != 0 && c2408e != null) {
                C0414n c0414n2 = ((C0414n[]) c0630y02.f2000c)[i7];
                AbstractC1665j.m2982b(c0414n2);
                C2409F c2409f3 = (C2409F) c2408e.m4276k(c0414n2);
                if (c2409f3 != null) {
                    c2409f.m4289k(c2409f3);
                }
            }
        }
        int i8 = c0630y02.f1999b;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            byte[] bArr = (byte[]) c0630y02.f2002e;
            if (bArr[i10] == 2) {
                i9++;
            } else if (i9 > 0) {
                C0414n[] c0414nArr = (C0414n[]) c0630y02.f2000c;
                c0414nArr[i10 - i9] = c0414nArr[i10];
            }
            bArr[i10] = 2;
        }
        int i11 = c0630y02.f1999b;
        for (int i12 = i11 - i9; i12 < i11; i12++) {
            ((C0414n[]) c0630y02.f2000c)[i12] = null;
        }
        c0630y02.f1999b -= i9;
        AbstractC0572Q abstractC0572QMo879A02 = mo879A0();
        Object[] objArr = c2409f2.f7794b;
        long[] jArr = c2409f2.f7793a;
        int length = jArr.length - 2;
        char c7 = 7;
        long j11 = -9187201950435737472L;
        int i13 = 8;
        if (length >= 0) {
            j8 = 128;
            int i14 = 0;
            while (true) {
                long j12 = jArr[i14];
                j9 = 255;
                if ((((~j12) << c7) & j12 & j11) != j11) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j12 & 255) < 128) {
                            c6 = c7;
                            C0414n c0414n3 = (C0414n) objArr[(i14 << 3) + i16];
                            j10 = j11;
                            AbstractC0572Q abstractC0572Q = abstractC0572QMo879A02 == null ? this : abstractC0572QMo879A02;
                            i5 = i13;
                            AbstractC0572Q abstractC0572Q2 = abstractC0572Q;
                            while (true) {
                                C0630y0 c0630y03 = abstractC0572Q2.f1783p;
                                if ((c0630y03 != null && AbstractC0972l.m2004b0((C0414n[]) c0630y03.f2000c, c0414n3) >= 0) || (abstractC0572QMo879A0 = abstractC0572Q2.mo879A0()) == null) {
                                    break;
                                } else {
                                    abstractC0572Q2 = abstractC0572QMo879A0;
                                }
                            }
                            C2408E c2408e2 = abstractC0572Q2.f1784q;
                            C2409F c2409f4 = c2408e2 != null ? (C2409F) c2408e2.m4276k(c0414n3) : null;
                            if (c2409f4 != null) {
                                abstractC0572Q.m882E0(c2409f4);
                            }
                        } else {
                            i5 = i13;
                            c6 = c7;
                            j10 = j11;
                        }
                        j12 >>= i5;
                        i16++;
                        c7 = c6;
                        j11 = j10;
                        i13 = i5;
                    }
                    c5 = c7;
                    j7 = j11;
                    if (i15 != i13) {
                        break;
                    }
                } else {
                    c5 = c7;
                    j7 = j11;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c7 = c5;
                j11 = j7;
                i13 = 8;
            }
        } else {
            c5 = 7;
            j7 = -9187201950435737472L;
            j8 = 128;
            j9 = 255;
        }
        c2409f2.m4280b();
        Object[] objArr2 = c2409f.f7794b;
        long[] jArr2 = c2409f.f7793a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j13 = jArr2[i17];
                if ((((~j13) << c5) & j13 & j7) != j7) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j13 & j9) < j8 && (c0564i = (C0564I) ((C0562G0) objArr2[(i17 << 3) + i19]).get()) != null) {
                            if (zMo606z) {
                                c0564i.m811S(false);
                            } else {
                                c0564i.m812U(false);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    }
                }
                if (i17 == length2) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        c2409f.m4280b();
    }

    @Override // p029F0.InterfaceC0379Q
    /* JADX INFO: renamed from: r */
    public final InterfaceC0378P mo605r(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        if ((i5 & (-16777216)) != 0 || ((-16777216) & i6) != 0) {
            AbstractC0277a.m483b("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0571P(i5, i6, map, interfaceC1601c, interfaceC1601c2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX INFO: renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m887r0(p029F0.InterfaceC0378P r15) {
        /*
            r14 = this;
            k.E r0 = r14.f1784q
            boolean r1 = r14.f1781n
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            W2.c r1 = r15.mo610d()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.f7789c
            long[] r1 = r0.f7787a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            k.F r10 = (p186k.C2409F) r10
            r14.m882E0(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.m4266a()
            return
        L5a:
            W2.c r0 = r14.f1777j
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            H0.N r1 = r14.m881C0()
            boolean r1 = r1.f1762d
            if (r1 == 0) goto L9b
            F0.v r0 = r14.mo891w0()
            long r4 = r0.mo640d(r4)
            long r4 = com.bumptech.glide.AbstractC1923e.m3457Q(r4)
            long r0 = r0.mo637Q()
            H0.N r6 = r14.m881C0()
            long r6 = r6.f1763e
            boolean r6 = p153e1.C2014j.m3700a(r4, r6)
            if (r6 == 0) goto L96
            H0.N r6 = r14.m881C0()
            long r6 = r6.f1764f
            boolean r6 = p153e1.C2016l.m3704a(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            H0.u0 r0 = r14.f1778k
            if (r0 == 0) goto Lad
            r0.f1987d = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            H0.u0 r0 = new H0.u0
            r0.<init>(r15, r14)
            r14.f1778k = r0
            goto Laa
        Lb5:
            r1.m886p0(r2, r3, r5)
            W2.c r15 = r15.mo610d()
            r1.f1777j = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.AbstractC0572Q.m887r0(F0.P):void");
    }

    /* JADX INFO: renamed from: s0 */
    public final int m888s0(AbstractC0388a abstractC0388a) {
        int iMo885n0;
        if (mo892x0() && (iMo885n0 = mo885n0(abstractC0388a)) != Integer.MIN_VALUE) {
            return iMo885n0 + ((int) (abstractC0388a instanceof C0419p0 ? this.f1210h >> 32 : this.f1210h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: t0 */
    public abstract AbstractC0572Q mo889t0();

    @Override // p041H0.InterfaceC0584b0
    /* JADX INFO: renamed from: v */
    public final void mo890v(boolean z5) {
        AbstractC0572Q abstractC0572QMo879A0 = mo879A0();
        C0564I c0564iMo893y0 = abstractC0572QMo879A0 != null ? abstractC0572QMo879A0.mo893y0() : null;
        if (AbstractC1665j.m2981a(c0564iMo893y0, mo893y0())) {
            this.f1779l = z5;
            return;
        }
        if ((c0564iMo893y0 != null ? c0564iMo893y0.f1700K.f1748d : null) != EnumC0557E.f1674f) {
            if ((c0564iMo893y0 != null ? c0564iMo893y0.f1700K.f1748d : null) != EnumC0557E.f1675g) {
                return;
            }
        }
        this.f1779l = z5;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract InterfaceC0430v mo891w0();

    /* JADX INFO: renamed from: x0 */
    public abstract boolean mo892x0();

    /* JADX INFO: renamed from: y0 */
    public abstract C0564I mo893y0();

    @Override // p029F0.InterfaceC0420q
    /* JADX INFO: renamed from: z */
    public boolean mo606z() {
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public abstract InterfaceC0378P mo894z0();
}
