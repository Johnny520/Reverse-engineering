package p339x1;

import gg.AbstractC1416l;
import java.util.Map;
import p069f.C0943k0;
import p069f.C0945l0;
import p085fg.InterfaceC1231l;
import p129ig.AbstractC2043a;
import p183m8.C2815c;
import p292u1.AbstractC4229a;
import p293u2.C4240j;
import p293u2.C4242l;
import p308v1.AbstractC4377b1;
import p308v1.C4399j;
import p308v1.C4403k0;
import p308v1.C4405l;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p308v1.InterfaceC4428t;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: x1.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5628n0 extends AbstractC4377b1 implements InterfaceC4418p0, InterfaceC5661y0 {

    /* JADX INFO: renamed from: l */
    public C5619k0 f22919l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1231l f22920m;

    /* JADX INFO: renamed from: n */
    public C5653v1 f22921n;

    /* JADX INFO: renamed from: o */
    public boolean f22922o;

    /* JADX INFO: renamed from: p */
    public boolean f22923p;

    /* JADX INFO: renamed from: q */
    public boolean f22924q;

    /* JADX INFO: renamed from: r */
    public final C4403k0 f22925r = new C4403k0(this, 0);

    /* JADX INFO: renamed from: s */
    public C2815c f22926s;

    /* JADX INFO: renamed from: t */
    public C0943k0 f22927t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d1 */
    public static void m10172d1(AbstractC5614i1 abstractC5614i1) {
        C5606g0 c5606g0;
        AbstractC5614i1 abstractC5614i12 = abstractC5614i1.f22869v;
        C5602f0 c5602f0 = abstractC5614i1.f22868u;
        if (!AbstractC1416l.m3825a(abstractC5614i12 != null ? abstractC5614i12.f22868u : null, c5602f0)) {
            c5602f0.f22779M.f22891p.f23014D.m10061f();
            return;
        }
        InterfaceC5581a interfaceC5581aMo9968B = c5602f0.f22779M.f22891p.mo9968B();
        if (interfaceC5581aMo9968B == null || (c5606g0 = ((C5652v0) interfaceC5581aMo9968B).f23014D) == null) {
            return;
        }
        c5606g0.m10061f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4418p0
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC4415o0 mo8008D0(int i9, int i10, Map map, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        if ((i9 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            AbstractC4229a.m8494b("Size(" + i9 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C5625m0(i9, i10, map, interfaceC1231l, interfaceC1231l2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r29v12, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX INFO: renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10173J0(C5602f0 c5602f0, C4405l c4405l) {
        char c10;
        long j3;
        long j4;
        long j5;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i9;
        char c11;
        long j11;
        long j12;
        int i10;
        int i11;
        int i12;
        C0943k0 c0943k0 = this.f22927t;
        char c12 = 7;
        long j13 = -9187201950435737472L;
        int i13 = 8;
        if (c0943k0 != null) {
            Object[] objArr = c0943k0.f2970c;
            long[] jArr3 = c0943k0.f2968a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                long j14 = 128;
                while (true) {
                    long j15 = jArr3[i14];
                    j4 = 255;
                    if ((((~j15) << c12) & j15 & j13) != j13) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j15 & 255) < j14) {
                                c11 = c12;
                                C0945l0 c0945l0 = (C0945l0) objArr[(i14 << 3) + i16];
                                j11 = j13;
                                Object[] objArr2 = c0945l0.f2976b;
                                long[] jArr4 = c0945l0.f2975a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j12 = j14;
                                    int i17 = 0;
                                    int i18 = i13;
                                    while (true) {
                                        int i19 = length2;
                                        long j16 = jArr4[i17];
                                        jArr2 = jArr3;
                                        j10 = j15;
                                        if ((((~j16) << c11) & j16 & j11) != j11) {
                                            int i20 = 8 - ((~(i17 - i19)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j16 & 255) < j12) {
                                                    int i22 = (i17 << 3) + i21;
                                                    C5602f0 c5602f02 = (C5602f0) ((C5608g2) objArr2[i22]).get();
                                                    i11 = i21;
                                                    if (c5602f02 != null) {
                                                        boolean zM10010G = c5602f02.m10010G();
                                                        i12 = i16;
                                                        if (zM10010G) {
                                                        }
                                                    } else {
                                                        i12 = i16;
                                                    }
                                                    c0945l0.m2340m(i22);
                                                } else {
                                                    i11 = i21;
                                                    i12 = i16;
                                                }
                                                j16 >>= i18;
                                                i21 = i11 + 1;
                                                i16 = i12;
                                            }
                                            i9 = i16;
                                            if (i20 != i18) {
                                                break;
                                            }
                                        } else {
                                            i9 = i16;
                                        }
                                        length2 = i19;
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        jArr3 = jArr2;
                                        j15 = j10;
                                        i16 = i9;
                                        i18 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j10 = j15;
                                    i9 = i16;
                                    j12 = j14;
                                }
                                i10 = 8;
                            } else {
                                jArr2 = jArr3;
                                j10 = j15;
                                i9 = i16;
                                c11 = c12;
                                j11 = j13;
                                j12 = j14;
                                i10 = i13;
                            }
                            i13 = i10;
                            j15 = j10 >> i10;
                            c12 = c11;
                            j13 = j11;
                            j14 = j12;
                            i16 = i9 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c10 = c12;
                        j3 = j13;
                        j5 = j14;
                        if (i15 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c10 = c12;
                        j3 = j13;
                        j5 = j14;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    c12 = c10;
                    j13 = j3;
                    j14 = j5;
                    jArr3 = jArr;
                    i13 = 8;
                }
            } else {
                c10 = 7;
                j3 = -9187201950435737472L;
                j4 = 255;
                j5 = 128;
            }
        }
        C0943k0 c0943k02 = this.f22927t;
        if (c0943k02 != null) {
            long[] jArr5 = c0943k02.f2968a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i23 = 0;
                while (true) {
                    long j17 = jArr5[i23];
                    if ((((~j17) << c10) & j17 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                        for (int i25 = 0; i25 < i24; i25++) {
                            if ((j17 & j4) < j5) {
                                int i26 = (i23 << 3) + i25;
                                if (((C0945l0) c0943k02.f2970c[i26]).m2334g()) {
                                    c0943k02.m2325l(i26);
                                }
                            }
                            j17 >>= 8;
                        }
                        if (i24 != 8) {
                            break;
                        }
                    }
                    if (i23 == length3) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
        }
        C0943k0 c0943k03 = this.f22927t;
        if (c0943k03 == null) {
            c0943k03 = new C0943k0();
            this.f22927t = c0943k03;
        }
        Object objM2320g = c0943k03.m2320g(c4405l);
        if (objM2320g == null) {
            objM2320g = new C0945l0();
            c0943k03.m2326m(c4405l, objM2320g);
        }
        ((C0945l0) objM2320g).m2338k(new C5608g2(c5602f0));
    }

    /* JADX INFO: renamed from: K0 */
    public abstract int mo10174K0(C4399j c4399j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v10, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public final void m10175M0(C5653v1 c5653v1, long j3, long j4) {
        boolean z9;
        char c10;
        long j5;
        long j10;
        long j11;
        C5602f0 c5602f0;
        boolean z10;
        int i9;
        char c11;
        long j12;
        C5647t1 snapshotObserver;
        C0943k0 c0943k0 = this.f22927t;
        C2815c c2815c = this.f22926s;
        if (c2815c == null) {
            c2815c = new C2815c();
            this.f22926s = c2815c;
        }
        C2815c c2815c2 = c2815c;
        InterfaceC5641r1 interfaceC5641r1 = mo10090Y0().f22803t;
        if (interfaceC5641r1 != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).getSnapshotObserver()) != null) {
            snapshotObserver.f23001a.m9162c(c5653v1, C5593d.f22731i, new C5622l0(this, j3, j4, c5653v1));
        }
        boolean zMo8009u0 = mo8009u0();
        C0945l0 c0945l0 = (C0945l0) c2815c2.f9084e;
        C0945l0 c0945l02 = (C0945l0) c2815c2.f9085f;
        int i10 = c2815c2.f9080a;
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = ((byte[]) c2815c2.f9083d)[i11];
            if (b10 == 3) {
                C4405l c4405l = ((C4405l[]) c2815c2.f9081b)[i11];
                c4405l.getClass();
                c0945l02.m2338k(c4405l);
            } else if (b10 != 0 && c0943k0 != null) {
                C4405l c4405l2 = ((C4405l[]) c2815c2.f9081b)[i11];
                c4405l2.getClass();
                C0945l0 c0945l03 = (C0945l0) c0943k0.m2324k(c4405l2);
                if (c0945l03 != null) {
                    c0945l0.m2337j(c0945l03);
                }
            }
        }
        int i12 = c2815c2.f9080a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr = (byte[]) c2815c2.f9083d;
            if (bArr[i14] == 2) {
                i13++;
            } else if (i13 > 0) {
                C4405l[] c4405lArr = (C4405l[]) c2815c2.f9081b;
                c4405lArr[i14 - i13] = c4405lArr[i14];
            }
            bArr[i14] = 2;
        }
        int i15 = c2815c2.f9080a;
        for (int i16 = i15 - i13; i16 < i15; i16++) {
            ((C4405l[]) c2815c2.f9081b)[i16] = null;
        }
        c2815c2.f9080a -= i13;
        AbstractC5628n0 abstractC5628n0Mo10092a1 = mo10092a1();
        Object[] objArr = c0945l02.f2976b;
        long[] jArr = c0945l02.f2975a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j13 = -9187201950435737472L;
        int i17 = 8;
        if (length >= 0) {
            j10 = 128;
            int i18 = 0;
            while (true) {
                long j14 = jArr[i18];
                j11 = 255;
                if ((((~j14) << c12) & j14 & j13) != j13) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j14 & 255) < 128) {
                            c11 = c12;
                            C4405l c4405l3 = (C4405l) objArr[(i18 << 3) + i20];
                            j12 = j13;
                            AbstractC5628n0 abstractC5628n0 = abstractC5628n0Mo10092a1 == null ? this : abstractC5628n0Mo10092a1;
                            i9 = i17;
                            AbstractC5628n0 abstractC5628n02 = abstractC5628n0;
                            while (true) {
                                C2815c c2815c3 = abstractC5628n02.f22926s;
                                if (c2815c3 != null) {
                                    z10 = zMo8009u0;
                                    if (!AbstractC4165l.m8378m0((C4405l[]) c2815c3.f9081b, c4405l3)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z10 = zMo8009u0;
                                AbstractC5628n0 abstractC5628n0Mo10092a12 = abstractC5628n02.mo10092a1();
                                if (abstractC5628n0Mo10092a12 == null) {
                                    break;
                                }
                                abstractC5628n02 = abstractC5628n0Mo10092a12;
                                zMo8009u0 = z10;
                            }
                            C0943k0 c0943k02 = abstractC5628n02.f22927t;
                            C0945l0 c0945l04 = c0943k02 != null ? (C0945l0) c0943k02.m2324k(c4405l3) : null;
                            if (c0945l04 != null) {
                                abstractC5628n0.m10179e1(c0945l04);
                            }
                        } else {
                            z10 = zMo8009u0;
                            i9 = i17;
                            c11 = c12;
                            j12 = j13;
                        }
                        j14 >>= i9;
                        i20++;
                        c12 = c11;
                        j13 = j12;
                        i17 = i9;
                        zMo8009u0 = z10;
                    }
                    z9 = zMo8009u0;
                    c10 = c12;
                    j5 = j13;
                    if (i19 != i17) {
                        break;
                    }
                } else {
                    z9 = zMo8009u0;
                    c10 = c12;
                    j5 = j13;
                }
                if (i18 == length) {
                    break;
                }
                i18++;
                c12 = c10;
                j13 = j5;
                zMo8009u0 = z9;
                i17 = 8;
            }
        } else {
            z9 = zMo8009u0;
            c10 = 7;
            j5 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        c0945l02.m2329b();
        Object[] objArr2 = c0945l0.f2976b;
        long[] jArr2 = c0945l0.f2975a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i21 = 0;
            while (true) {
                long j15 = jArr2[i21];
                if ((((~j15) << c10) & j15 & j5) != j5) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j15 & j11) < j10 && (c5602f0 = (C5602f0) ((C5608g2) objArr2[(i21 << 3) + i23]).get()) != null) {
                            if (z9) {
                                c5602f0.m10021S(false);
                            } else {
                                c5602f0.m10022U(false);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length2) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        c0945l0.m2329b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10176N0(InterfaceC4415o0 interfaceC4415o0) {
        long j3;
        long j4;
        C0943k0 c0943k0 = this.f22927t;
        if (!this.f22924q) {
            InterfaceC1231l interfaceC1231lMo7612i = interfaceC4415o0.mo7612i();
            if (interfaceC1231lMo7612i != null) {
                boolean z9 = this.f22920m != interfaceC1231lMo7612i;
                if (z9 || !m10178c1().f22895g) {
                    j3 = 0;
                    j4 = 9223372034707292159L;
                } else {
                    InterfaceC4428t interfaceC4428tMo10088T0 = mo10088T0();
                    long jM5017W = AbstractC2043a.m5017W(interfaceC4428tMo10088T0.mo8859P(0L));
                    long jMo8858F = interfaceC4428tMo10088T0.mo8858F();
                    j4 = jM5017W;
                    j3 = jMo8858F;
                    z9 = (C4240j.m8528b(jM5017W, m10178c1().f22896h) && C4242l.m8534a(jMo8858F, m10178c1().f22897i)) ? false : true;
                }
                if (z9) {
                    C5653v1 c5653v1 = this.f22921n;
                    if (c5653v1 != null) {
                        c5653v1.f23044g = interfaceC4415o0;
                    } else {
                        c5653v1 = new C5653v1(interfaceC4415o0, this);
                        this.f22921n = c5653v1;
                    }
                    m10175M0(c5653v1, j4, j3);
                    this.f22920m = interfaceC4415o0.mo7612i();
                }
            } else if (c0943k0 != null) {
                Object[] objArr = c0943k0.f2970c;
                long[] jArr = c0943k0.f2968a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j5 = jArr[i9];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j5) < 128) {
                                    m10179e1((C0945l0) objArr[(i9 << 3) + i11]);
                                }
                                j5 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            } else if (i9 == length) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                }
                c0943k0.m2314a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public final int m10177R0(C4399j c4399j) {
        int iMo10174K0;
        if (mo10089X0() && (iMo10174K0 = mo10174K0(c4399j)) != Integer.MIN_VALUE) {
            return iMo10174K0 + ((int) (this.f14597k & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: S0 */
    public abstract AbstractC5628n0 mo10086S0();

    /* JADX INFO: renamed from: T0 */
    public abstract InterfaceC4428t mo10088T0();

    /* JADX INFO: renamed from: X0 */
    public abstract boolean mo10089X0();

    /* JADX INFO: renamed from: Y0 */
    public abstract C5602f0 mo10090Y0();

    /* JADX INFO: renamed from: Z0 */
    public abstract InterfaceC4415o0 mo10091Z0();

    /* JADX INFO: renamed from: a1 */
    public abstract AbstractC5628n0 mo10092a1();

    /* JADX INFO: renamed from: b1 */
    public abstract long mo10093b1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c1 */
    public final C5619k0 m10178c1() {
        C5619k0 c5619k0 = this.f22919l;
        if (c5619k0 != null) {
            return c5619k0;
        }
        C5619k0 c5619k02 = new C5619k0(this);
        this.f22919l = c5619k02;
        return c5619k02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public final void m10179e1(C0945l0 c0945l0) {
        C5602f0 c5602f0;
        Object[] objArr = c0945l0.f2976b;
        long[] jArr = c0945l0.f2975a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128 && (c5602f0 = (C5602f0) ((C5608g2) objArr[(i9 << 3) + i11]).get()) != null) {
                        if (mo8009u0()) {
                            c5602f0.m10021S(false);
                        } else {
                            c5602f0.m10022U(false);
                        }
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5661y0
    /* JADX INFO: renamed from: f0 */
    public final void mo10180f0(boolean z9) {
        AbstractC5628n0 abstractC5628n0Mo10092a1 = mo10092a1();
        C5602f0 c5602f0Mo10090Y0 = abstractC5628n0Mo10092a1 != null ? abstractC5628n0Mo10092a1.mo10090Y0() : null;
        if (AbstractC1416l.m3825a(c5602f0Mo10090Y0, mo10090Y0())) {
            this.f22922o = z9;
            return;
        }
        if ((c5602f0Mo10090Y0 != null ? c5602f0Mo10090Y0.f22779M.f22879d : null) != EnumC5586b0.f22710i) {
            if ((c5602f0Mo10090Y0 != null ? c5602f0Mo10090Y0.f22779M.f22879d : null) != EnumC5586b0.f22711j) {
                return;
            }
        }
        this.f22922o = z9;
    }

    /* JADX INFO: renamed from: f1 */
    public abstract void mo10094f1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    /* JADX INFO: renamed from: u0 */
    public boolean mo8009u0() {
        return false;
    }
}
