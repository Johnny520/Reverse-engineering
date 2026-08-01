package p041H0;

import com.bumptech.glide.AbstractC1923e;
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
import p153e1.C2014j;
import p153e1.C2016l;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: T */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r29v12, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m884m0(C0564I c0564i, C0414n c0414n) {
        char c5;
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i5;
        char c6;
        long j9;
        long j10;
        int i6;
        int i7;
        int i8;
        C2408E c2408e = this.f1784q;
        char c7 = 7;
        long j11 = -9187201950435737472L;
        int i9 = 8;
        if (c2408e != null) {
            Object[] objArr = c2408e.f7789c;
            long[] jArr3 = c2408e.f7787a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i10 = 0;
                long j12 = 128;
                while (true) {
                    long j13 = jArr3[i10];
                    j6 = 255;
                    if ((((~j13) << c7) & j13 & j11) != j11) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j13 & 255) < j12) {
                                c6 = c7;
                                C2409F c2409f = (C2409F) objArr[(i10 << 3) + i12];
                                j9 = j11;
                                Object[] objArr2 = c2409f.f7794b;
                                long[] jArr4 = c2409f.f7793a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j10 = j12;
                                    int i13 = 0;
                                    int i14 = i9;
                                    while (true) {
                                        int i15 = length2;
                                        long j14 = jArr4[i13];
                                        jArr2 = jArr3;
                                        j8 = j13;
                                        if ((((~j14) << c6) & j14 & j9) != j9) {
                                            int i16 = 8 - ((~(i13 - i15)) >>> 31);
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                if ((j14 & 255) < j10) {
                                                    int i18 = (i13 << 3) + i17;
                                                    C0564I c0564i2 = (C0564I) ((C0562G0) objArr2[i18]).get();
                                                    i7 = i17;
                                                    if (c0564i2 != null) {
                                                        boolean zM799G = c0564i2.m799G();
                                                        i8 = i12;
                                                        if (zM799G) {
                                                        }
                                                    } else {
                                                        i8 = i12;
                                                    }
                                                    c2409f.m4291m(i18);
                                                } else {
                                                    i7 = i17;
                                                    i8 = i12;
                                                }
                                                j14 >>= i14;
                                                i17 = i7 + 1;
                                                i12 = i8;
                                            }
                                            i5 = i12;
                                            if (i16 != i14) {
                                                break;
                                            }
                                        } else {
                                            i5 = i12;
                                        }
                                        length2 = i15;
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        jArr3 = jArr2;
                                        j13 = j8;
                                        i12 = i5;
                                        i14 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j8 = j13;
                                    i5 = i12;
                                    j10 = j12;
                                }
                                i6 = 8;
                            } else {
                                jArr2 = jArr3;
                                j8 = j13;
                                i5 = i12;
                                c6 = c7;
                                j9 = j11;
                                j10 = j12;
                                i6 = i9;
                            }
                            i9 = i6;
                            j13 = j8 >> i6;
                            c7 = c6;
                            j11 = j9;
                            j12 = j10;
                            i12 = i5 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c5 = c7;
                        j5 = j11;
                        j7 = j12;
                        if (i11 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c5 = c7;
                        j5 = j11;
                        j7 = j12;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    c7 = c5;
                    j11 = j5;
                    j12 = j7;
                    jArr3 = jArr;
                    i9 = 8;
                }
            } else {
                c5 = 7;
                j5 = -9187201950435737472L;
                j6 = 255;
                j7 = 128;
            }
        }
        C2408E c2408e2 = this.f1784q;
        if (c2408e2 != null) {
            long[] jArr5 = c2408e2.f7787a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i19 = 0;
                while (true) {
                    long j15 = jArr5[i19];
                    if ((((~j15) << c5) & j15 & j5) != j5) {
                        int i20 = 8 - ((~(i19 - length3)) >>> 31);
                        for (int i21 = 0; i21 < i20; i21++) {
                            if ((j15 & j6) < j7) {
                                int i22 = (i19 << 3) + i21;
                                if (((C2409F) c2408e2.f7789c[i22]).m4285g()) {
                                    c2408e2.m4277l(i22);
                                }
                            }
                            j15 >>= 8;
                        }
                        if (i20 != 8) {
                            break;
                        }
                    }
                    if (i19 == length3) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        }
        C2408E c2408e3 = this.f1784q;
        if (c2408e3 == null) {
            c2408e3 = new C2408E();
            this.f1784q = c2408e3;
        }
        Object objM4272g = c2408e3.m4272g(c0414n);
        if (objM4272g == null) {
            objM4272g = new C2409F();
            c2408e3.m4278m(c0414n, objM4272g);
        }
        ((C2409F) objM4272g).m4288j(new C0562G0(c0564i));
    }

    /* JADX INFO: renamed from: n0 */
    public abstract int mo885n0(AbstractC0388a abstractC0388a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: T */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0379Q
    /* JADX INFO: renamed from: r */
    public final InterfaceC0378P mo605r(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        if ((i5 & (-16777216)) != 0 || ((-16777216) & i6) != 0) {
            AbstractC0277a.m483b("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0571P(i5, i6, map, interfaceC1601c, interfaceC1601c2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX INFO: renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m887r0(InterfaceC0378P interfaceC0378P) {
        long j5;
        long j6;
        C2408E c2408e = this.f1784q;
        if (!this.f1781n) {
            InterfaceC1601c interfaceC1601cMo610d = interfaceC0378P.mo610d();
            if (interfaceC1601cMo610d != null) {
                boolean z5 = this.f1777j != interfaceC1601cMo610d;
                if (z5 || !m881C0().f1762d) {
                    j5 = 0;
                    j6 = 9223372034707292159L;
                } else {
                    InterfaceC0430v interfaceC0430vMo891w0 = mo891w0();
                    long jM3457Q = AbstractC1923e.m3457Q(interfaceC0430vMo891w0.mo640d(0L));
                    long jMo637Q = interfaceC0430vMo891w0.mo637Q();
                    j6 = jM3457Q;
                    j5 = jMo637Q;
                    z5 = (C2014j.m3700a(jM3457Q, m881C0().f1763e) && C2016l.m3704a(jMo637Q, m881C0().f1764f)) ? false : true;
                }
                if (z5) {
                    C0622u0 c0622u0 = this.f1778k;
                    if (c0622u0 != null) {
                        c0622u0.f1987d = interfaceC0378P;
                    } else {
                        c0622u0 = new C0622u0(interfaceC0378P, this);
                        this.f1778k = c0622u0;
                    }
                    m886p0(c0622u0, j6, j5);
                    this.f1777j = interfaceC0378P.mo610d();
                }
            } else if (c2408e != null) {
                Object[] objArr = c2408e.f7789c;
                long[] jArr = c2408e.f7787a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j7 = jArr[i5];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j7) < 128) {
                                    m882E0((C2409F) objArr[(i5 << 3) + i7]);
                                }
                                j7 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                c2408e.m4266a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    /* JADX INFO: renamed from: z */
    public boolean mo606z() {
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public abstract InterfaceC0378P mo894z0();
}
