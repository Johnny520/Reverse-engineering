package p095T;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p000A.C0002B;
import p000A.C0066i0;
import p027E4.C0330q;
import p028F.C0352m;
import p029F0.C0363A;
import p041H0.C0560F0;
import p056K2.C0882h;
import p061L2.C0983w;
import p100U.C1439L;
import p100U.C1440a;
import p105V.C1486h;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1849k;
import p158f0.AbstractC2091w;
import p158f0.InterfaceC2090v;
import p163g0.C2172d;
import p179i4.AbstractC2352g;
import p186k.C2408E;
import p186k.C2409F;
import p186k.C2411H;
import p186k.C2439u;
import p186k.C2444z;

/* JADX INFO: renamed from: T.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1397y implements InterfaceC1389u {

    /* JADX INFO: renamed from: d */
    public final AbstractC1391v f4955d;

    /* JADX INFO: renamed from: e */
    public final C0560F0 f4956e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f4957f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final Object f4958g = new Object();

    /* JADX INFO: renamed from: h */
    public final C2411H f4959h;

    /* JADX INFO: renamed from: i */
    public final C1318I0 f4960i;

    /* JADX INFO: renamed from: j */
    public final C2408E f4961j;

    /* JADX INFO: renamed from: k */
    public final C2409F f4962k;

    /* JADX INFO: renamed from: l */
    public final C2409F f4963l;

    /* JADX INFO: renamed from: m */
    public final C2408E f4964m;

    /* JADX INFO: renamed from: n */
    public final C1440a f4965n;

    /* JADX INFO: renamed from: o */
    public final C1440a f4966o;

    /* JADX INFO: renamed from: p */
    public final C2408E f4967p;

    /* JADX INFO: renamed from: q */
    public C2408E f4968q;

    /* JADX INFO: renamed from: r */
    public boolean f4969r;

    /* JADX INFO: renamed from: s */
    public C0363A f4970s;

    /* JADX INFO: renamed from: t */
    public C1370k0 f4971t;

    /* JADX INFO: renamed from: u */
    public C1397y f4972u;

    /* JADX INFO: renamed from: v */
    public int f4973v;

    /* JADX INFO: renamed from: w */
    public final C0066i0 f4974w;

    /* JADX INFO: renamed from: x */
    public final C1849k f4975x;

    /* JADX INFO: renamed from: y */
    public final C1383r f4976y;

    /* JADX INFO: renamed from: z */
    public int f4977z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1397y(AbstractC1391v abstractC1391v, C0560F0 c0560f0) {
        this.f4955d = abstractC1391v;
        this.f4956e = c0560f0;
        C2411H c2411h = new C2411H(new C2409F());
        this.f4959h = c2411h;
        C1318I0 c1318i0 = new C1318I0();
        if (abstractC1391v.mo2522d()) {
            c1318i0.f4715n = new C2439u();
        }
        if (abstractC1391v.mo2524f()) {
            c1318i0.m2437b();
        }
        this.f4960i = c1318i0;
        this.f4961j = AbstractC2352g.m4201n();
        this.f4962k = new C2409F();
        this.f4963l = new C2409F();
        this.f4964m = AbstractC2352g.m4201n();
        C1440a c1440a = new C1440a();
        this.f4965n = c1440a;
        C1440a c1440a2 = new C1440a();
        this.f4966o = c1440a2;
        this.f4967p = AbstractC2352g.m4201n();
        this.f4968q = AbstractC2352g.m4201n();
        C0066i0 c0066i0 = new C0066i0(18, abstractC1391v);
        this.f4974w = c0066i0;
        this.f4975x = new C1849k();
        C1383r c1383r = new C1383r(c0560f0, abstractC1391v, c1318i0, c2411h, c1440a, c1440a2, c0066i0, this);
        abstractC1391v.mo2534p(c1383r);
        this.f4976y = c1383r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2645A(Object obj) {
        synchronized (this.f4958g) {
            try {
                m2668v(obj);
                Object objM4272g = this.f4964m.m4272g(obj);
                if (objM4272g != null) {
                    if (objM4272g instanceof C2409F) {
                        C2409F c2409f = (C2409F) objM4272g;
                        Object[] objArr = c2409f.f7794b;
                        long[] jArr = c2409f.f7793a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j5 = jArr[i5];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((255 & j5) < 128) {
                                            m2668v((C1311F) objArr[(i5 << 3) + i7]);
                                        }
                                        j5 >>= 8;
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
                    } else {
                        m2668v((C1311F) objM4272g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m2646B(InterfaceC1603e interfaceC1603e) {
        boolean zM2655i = m2655i();
        m2663q();
        AbstractC1391v abstractC1391v = this.f4955d;
        if (!zM2655i) {
            abstractC1391v.mo2519a(this, interfaceC1603e);
            return;
        }
        C1383r c1383r = this.f4976y;
        c1383r.f4909z = 0;
        c1383r.f4908y = true;
        abstractC1391v.mo2519a(this, interfaceC1603e);
        c1383r.m2600s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2647a() {
        this.f4957f.set(null);
        this.f4965n.f5102h.m2724v();
        this.f4966o.f5102h.m2724v();
        C2411H c2411h = this.f4959h;
        if (c2411h.f7810d.m4285g()) {
            return;
        }
        C1849k c1849k = this.f4975x;
        try {
            c1849k.m3322g(c2411h, this.f4976y.m2607z());
            c1849k.m3318b();
        } finally {
            c1849k.m3317a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2648b(Object obj, boolean z5) {
        int i5;
        Object objM4272g = this.f4961j.m4272g(obj);
        if (objM4272g == null) {
            return;
        }
        boolean z6 = objM4272g instanceof C2409F;
        EnumC1331P enumC1331P = EnumC1331P.f4758d;
        C2409F c2409f = this.f4962k;
        C2409F c2409f2 = this.f4963l;
        C2408E c2408e = this.f4967p;
        if (!z6) {
            C1388t0 c1388t0 = (C1388t0) objM4272g;
            if (AbstractC2352g.m4180C(c2408e, obj, c1388t0) || c1388t0.m2642c(obj) == enumC1331P) {
                return;
            }
            if (c1388t0.f4931g == null || z5) {
                c2409f.m4279a(c1388t0);
                return;
            } else {
                c2409f2.m4279a(c1388t0);
                return;
            }
        }
        C2409F c2409f3 = (C2409F) objM4272g;
        Object[] objArr = c2409f3.f7794b;
        long[] jArr = c2409f3.f7793a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j5 = jArr[i6];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((j5 & 255) < 128) {
                        C1388t0 c1388t02 = (C1388t0) objArr[(i6 << 3) + i9];
                        if (AbstractC2352g.m4180C(c2408e, obj, c1388t02)) {
                            i5 = i7;
                        } else {
                            i5 = i7;
                            if (c1388t02.m2642c(obj) != enumC1331P) {
                                if (c1388t02.f4931g == null || z5) {
                                    c2409f.m4279a(c1388t02);
                                } else {
                                    c2409f2.m4279a(c1388t02);
                                }
                            }
                        }
                    }
                    j5 >>= i5;
                    i9++;
                    i7 = i5;
                }
                if (i8 != i7) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2649c(Set set, boolean z5) {
        long j5;
        long j6;
        long j7;
        char c5;
        int i5;
        long[] jArr;
        long[] jArr2;
        long j8;
        boolean zM4281c;
        long[] jArr3;
        long j9;
        long[] jArr4;
        long[] jArr5;
        int i6;
        long j10;
        boolean zM4285g;
        int i7;
        long j11;
        long[] jArr6;
        long[] jArr7;
        char c6;
        long j12;
        int i8;
        int i9;
        long[] jArr8;
        boolean z6 = set instanceof C1486h;
        C2408E c2408e = this.f4964m;
        Object obj = null;
        int i10 = 8;
        if (z6) {
            C2409F c2409f = ((C1486h) set).f5195d;
            Object[] objArr = c2409f.f7794b;
            long[] jArr9 = c2409f.f7793a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i11 = 0;
                j5 = 128;
                j6 = 255;
                while (true) {
                    long j13 = jArr9[i11];
                    char c7 = 7;
                    j7 = -9187201950435737472L;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j13 & 255) < 128) {
                                Object obj2 = objArr[(i11 << 3) + i13];
                                c6 = c7;
                                if (obj2 instanceof C1388t0) {
                                    ((C1388t0) obj2).m2642c(obj);
                                } else {
                                    m2648b(obj2, z5);
                                    Object objM4272g = c2408e.m4272g(obj2);
                                    if (objM4272g != null) {
                                        if (objM4272g instanceof C2409F) {
                                            C2409F c2409f2 = (C2409F) objM4272g;
                                            Object[] objArr2 = c2409f2.f7794b;
                                            long[] jArr10 = c2409f2.f7793a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i14 = i10;
                                                i8 = length;
                                                int i15 = 0;
                                                while (true) {
                                                    long j14 = jArr10[i15];
                                                    j12 = j13;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j14) << c6) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        int i17 = 0;
                                                        while (i17 < i16) {
                                                            if ((j14 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                m2648b((C1311F) objArr2[(i15 << 3) + i17], z5);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j14 >>= i14;
                                                            i17++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i16 != i14) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i15 == length2) {
                                                        break;
                                                    }
                                                    i15++;
                                                    jArr10 = jArr11;
                                                    j13 = j12;
                                                    jArr9 = jArr7;
                                                    i14 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j12 = j13;
                                            i8 = length;
                                            m2648b((C1311F) objM4272g, z5);
                                        }
                                        i9 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j12 = j13;
                                i8 = length;
                                i9 = 8;
                            } else {
                                jArr7 = jArr9;
                                c6 = c7;
                                j12 = j13;
                                i8 = length;
                                i9 = i10;
                            }
                            j13 = j12 >> i9;
                            i13++;
                            length = i8;
                            i10 = i9;
                            c7 = c6;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c5 = c7;
                        int i18 = length;
                        if (i12 != i10) {
                            break;
                        } else {
                            length = i18;
                        }
                    } else {
                        jArr6 = jArr9;
                        c5 = 7;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    jArr9 = jArr6;
                    obj = null;
                    i10 = 8;
                }
            } else {
                j5 = 128;
                j6 = 255;
                j7 = -9187201950435737472L;
                c5 = 7;
            }
        } else {
            j5 = 128;
            j6 = 255;
            j7 = -9187201950435737472L;
            c5 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C1388t0) {
                    ((C1388t0) obj3).m2642c(null);
                } else {
                    m2648b(obj3, z5);
                    Object objM4272g2 = c2408e.m4272g(obj3);
                    if (objM4272g2 != null) {
                        if (objM4272g2 instanceof C2409F) {
                            C2409F c2409f3 = (C2409F) objM4272g2;
                            Object[] objArr3 = c2409f3.f7794b;
                            long[] jArr12 = c2409f3.f7793a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j15 = jArr12[i5];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i19 = 8 - ((~(i5 - length3)) >>> 31);
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            if ((j15 & 255) < 128) {
                                                m2648b((C1311F) objArr3[(i5 << 3) + i20], z5);
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i19 == 8) {
                                            i5 = i5 != length3 ? i5 + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            m2648b((C1311F) objM4272g2, z5);
                        }
                    }
                }
            }
        }
        C2408E c2408e2 = this.f4961j;
        C2409F c2409f4 = this.f4962k;
        if (z5) {
            C2409F c2409f5 = this.f4963l;
            if (c2409f5.m4286h()) {
                long[] jArr13 = c2408e2.f7787a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i21 = 0;
                    while (true) {
                        long j16 = jArr13[i21];
                        if ((((~j16) << c5) & j16 & j7) != j7) {
                            int i22 = 8 - ((~(i21 - length4)) >>> 31);
                            int i23 = 0;
                            while (i23 < i22) {
                                if ((j16 & j6) < j5) {
                                    int i24 = (i21 << 3) + i23;
                                    Object obj4 = c2408e2.f7788b[i24];
                                    Object obj5 = c2408e2.f7789c[i24];
                                    if (obj5 instanceof C2409F) {
                                        C2409F c2409f6 = (C2409F) obj5;
                                        Object[] objArr4 = c2409f6.f7794b;
                                        long[] jArr14 = c2409f6.f7793a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j10 = j16;
                                            int i25 = 0;
                                            while (true) {
                                                long j17 = jArr14[i25];
                                                jArr5 = jArr13;
                                                i6 = length4;
                                                if ((((~j17) << c5) & j17 & j7) != j7) {
                                                    int i26 = 8 - ((~(i25 - length5)) >>> 31);
                                                    for (int i27 = 0; i27 < i26; i27 = i7 + 1) {
                                                        if ((j17 & j6) < j5) {
                                                            i7 = i27;
                                                            int i28 = (i25 << 3) + i7;
                                                            j11 = j17;
                                                            C1388t0 c1388t0 = (C1388t0) objArr4[i28];
                                                            if (c2409f5.m4281c(c1388t0) || c2409f4.m4281c(c1388t0)) {
                                                                c2409f6.m4291m(i28);
                                                            }
                                                        } else {
                                                            i7 = i27;
                                                            j11 = j17;
                                                        }
                                                        j17 = j11 >> 8;
                                                    }
                                                    if (i26 != 8) {
                                                        break;
                                                    }
                                                    if (i25 == length5) {
                                                        break;
                                                    }
                                                    i25++;
                                                    length4 = i6;
                                                    jArr13 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i6 = length4;
                                            j10 = j16;
                                        }
                                        zM4285g = c2409f6.m4285g();
                                    } else {
                                        jArr5 = jArr13;
                                        i6 = length4;
                                        j10 = j16;
                                        AbstractC1665j.m2983c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C1388t0 c1388t02 = (C1388t0) obj5;
                                        zM4285g = c2409f5.m4281c(c1388t02) || c2409f4.m4281c(c1388t02);
                                    }
                                    if (zM4285g) {
                                        c2408e2.m4277l(i24);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i6 = length4;
                                    j10 = j16;
                                }
                                j16 = j10 >> 8;
                                i23++;
                                length4 = i6;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i29 = length4;
                            if (i22 != 8) {
                                break;
                            } else {
                                length4 = i29;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i21 == length4) {
                            break;
                        }
                        i21++;
                        jArr13 = jArr4;
                    }
                }
                c2409f5.m4280b();
                m2654h();
                return;
            }
        }
        if (c2409f4.m4286h()) {
            long[] jArr15 = c2408e2.f7787a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i30 = 0;
                while (true) {
                    long j18 = jArr15[i30];
                    if ((((~j18) << c5) & j18 & j7) != j7) {
                        int i31 = 8 - ((~(i30 - length6)) >>> 31);
                        int i32 = 0;
                        while (i32 < i31) {
                            if ((j18 & j6) < j5) {
                                int i33 = (i30 << 3) + i32;
                                Object obj6 = c2408e2.f7788b[i33];
                                Object obj7 = c2408e2.f7789c[i33];
                                if (obj7 instanceof C2409F) {
                                    C2409F c2409f7 = (C2409F) obj7;
                                    Object[] objArr5 = c2409f7.f7794b;
                                    long[] jArr16 = c2409f7.f7793a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j8 = j18;
                                        int i34 = 0;
                                        while (true) {
                                            long j19 = jArr16[i34];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j19) << c5) & j19 & j7) != j7) {
                                                int i35 = 8 - ((~(i34 - length7)) >>> 31);
                                                int i36 = 0;
                                                while (i36 < i35) {
                                                    if ((j19 & j6) < j5) {
                                                        jArr3 = jArr15;
                                                        int i37 = (i34 << 3) + i36;
                                                        j9 = j19;
                                                        if (c2409f4.m4281c((C1388t0) objArr6[i37])) {
                                                            c2409f7.m4291m(i37);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j9 = j19;
                                                    }
                                                    i36++;
                                                    jArr15 = jArr3;
                                                    j19 = j9 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i35 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i34 == length7) {
                                                break;
                                            }
                                            i34++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j8 = j18;
                                    }
                                    zM4281c = c2409f7.m4285g();
                                } else {
                                    jArr2 = jArr15;
                                    j8 = j18;
                                    AbstractC1665j.m2983c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zM4281c = c2409f4.m4281c((C1388t0) obj7);
                                }
                                if (zM4281c) {
                                    c2408e2.m4277l(i33);
                                }
                            } else {
                                jArr2 = jArr15;
                                j8 = j18;
                            }
                            i32++;
                            j18 = j8 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i31 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i30 == length6) {
                        break;
                    }
                    i30++;
                    jArr15 = jArr;
                }
            }
            m2654h();
            c2409f4.m4280b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: d */
    public final void m2650d() {
        synchronized (this.f4958g) {
            try {
                m2651e(this.f4965n);
                m2661o();
            } catch (Throwable th) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m2647a();
                    throw th3;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2651e(C1440a c1440a) throws Throwable {
        InterfaceC1353c interfaceC1353c;
        C1849k c1849k;
        C1849k c1849k2;
        long[] jArr;
        int i5;
        long[] jArr2;
        C1849k c1849k3;
        long j5;
        char c5;
        long j6;
        int i6;
        boolean zM4285g;
        long j7;
        C1440a c1440a2 = this.f4966o;
        C1383r c1383r = this.f4976y;
        C2172d c2172dM2607z = c1383r.m2607z();
        C1849k c1849k4 = this.f4975x;
        c1849k4.m3322g(this.f4959h, c2172dM2607z);
        try {
            if (c1440a.f5102h.m2726x()) {
                try {
                    if (c1440a2.f5102h.m2726x() && this.f4971t == null) {
                        c1849k4.m3318b();
                    }
                    return;
                } finally {
                }
            }
            C1370k0 c1370k0 = this.f4971t;
            if (c1370k0 == null || (interfaceC1353c = c1370k0.f4832l) == null) {
                interfaceC1353c = this.f4956e;
            }
            try {
                Trace.beginSection(interfaceC1353c.equals(c1370k0 != null ? c1370k0.f4832l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    C1370k0 c1370k02 = this.f4971t;
                    if (c1370k02 == null || (c1849k = c1370k02.f4831k) == null) {
                        c1849k = c1849k4;
                    }
                    C1324L0 c1324l0M2439d = this.f4960i.m2439d();
                    int i7 = 0;
                    try {
                        c1440a.m2729v(interfaceC1353c, c1324l0M2439d, c1849k, c1383r.m2607z());
                        c1324l0M2439d.m2475e(true);
                        interfaceC1353c.mo784g();
                        Trace.endSection();
                        c1849k4.m3319c();
                        c1849k4.m3320d();
                        if (this.f4969r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f4969r = false;
                                C2408E c2408e = this.f4961j;
                                long[] jArr3 = c2408e.f7787a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j8 = jArr3[i8];
                                        char c6 = 7;
                                        long j9 = -9187201950435737472L;
                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8;
                                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                                            int i11 = i7;
                                            while (i11 < i10) {
                                                if ((j8 & 255) < 128) {
                                                    c5 = c6;
                                                    int i12 = (i8 << 3) + i11;
                                                    j6 = j9;
                                                    Object obj = c2408e.f7788b[i12];
                                                    Object obj2 = c2408e.f7789c[i12];
                                                    if (obj2 instanceof C2409F) {
                                                        C2409F c2409f = (C2409F) obj2;
                                                        Object[] objArr = c2409f.f7794b;
                                                        long[] jArr4 = c2409f.f7793a;
                                                        int i13 = i9;
                                                        int length2 = jArr4.length - 2;
                                                        i5 = i11;
                                                        jArr2 = jArr3;
                                                        c1849k3 = c1849k4;
                                                        if (length2 >= 0) {
                                                            int i14 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j10 = jArr4[i14];
                                                                    j5 = j8;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j10) << c5) & j10 & j6) != j6) {
                                                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                                        for (int i16 = 0; i16 < i15; i16++) {
                                                                            if ((j10 & 255) < 128) {
                                                                                j7 = j10;
                                                                                int i17 = (i14 << 3) + i16;
                                                                                if (!((C1388t0) objArr[i17]).m2641b()) {
                                                                                    c2409f.m4291m(i17);
                                                                                }
                                                                            } else {
                                                                                j7 = j10;
                                                                            }
                                                                            j10 = j7 >> i13;
                                                                        }
                                                                        if (i15 != i13) {
                                                                            break;
                                                                        }
                                                                        if (i14 == length2) {
                                                                            break;
                                                                        }
                                                                        i14++;
                                                                        jArr4 = jArr5;
                                                                        j8 = j5;
                                                                        i13 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j5 = j8;
                                                        }
                                                        zM4285g = c2409f.m4285g();
                                                    } else {
                                                        i5 = i11;
                                                        jArr2 = jArr3;
                                                        c1849k3 = c1849k4;
                                                        j5 = j8;
                                                        AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zM4285g = !((C1388t0) obj2).m2641b();
                                                    }
                                                    if (zM4285g) {
                                                        c2408e.m4277l(i12);
                                                    }
                                                    i6 = 8;
                                                } else {
                                                    i5 = i11;
                                                    jArr2 = jArr3;
                                                    c1849k3 = c1849k4;
                                                    j5 = j8;
                                                    c5 = c6;
                                                    j6 = j9;
                                                    i6 = i9;
                                                }
                                                j8 = j5 >> i6;
                                                i11 = i5 + 1;
                                                i9 = i6;
                                                c6 = c5;
                                                j9 = j6;
                                                c1849k4 = c1849k3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            c1849k2 = c1849k4;
                                            if (i10 != i9) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            c1849k2 = c1849k4;
                                        }
                                        if (i8 == length) {
                                            break;
                                        }
                                        i8++;
                                        c1849k4 = c1849k2;
                                        jArr3 = jArr;
                                        i7 = 0;
                                    }
                                } else {
                                    c1849k2 = c1849k4;
                                }
                                m2654h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c1849k2 = c1849k4;
                        }
                        try {
                            if (c1440a2.f5102h.m2726x() && this.f4971t == null) {
                                c1849k2.m3318b();
                            }
                            return;
                        } finally {
                            c1849k2.m3317a();
                        }
                    } catch (Throwable th3) {
                        try {
                            c1324l0M2439d.m2475e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (c1440a2.f5102h.m2726x() && this.f4971t == null) {
                c1849k4.m3318b();
            }
            throw th;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: f */
    public final void m2652f() {
        synchronized (this.f4958g) {
            try {
                if (this.f4966o.f5102h.m2727y()) {
                    m2651e(this.f4966o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: g */
    public final void m2653g() {
        C1849k c1849k;
        synchronized (this.f4958g) {
            try {
                this.f4976y.f4905v = null;
                if (!this.f4959h.f7810d.m4285g()) {
                    c1849k = this.f4975x;
                    try {
                        c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                        c1849k.m3318b();
                        c1849k.m3317a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m2647a();
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2654h() {
        char c5;
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i5;
        long j8;
        char c6;
        long j9;
        long j10;
        int i6;
        boolean zM4285g;
        int i7;
        long j11;
        C2408E c2408e = this.f4964m;
        long[] jArr3 = c2408e.f7787a;
        int length = jArr3.length - 2;
        char c7 = 7;
        long j12 = -9187201950435737472L;
        int i8 = 8;
        if (length >= 0) {
            int i9 = 0;
            long j13 = 128;
            while (true) {
                long j14 = jArr3[i9];
                j6 = 255;
                if ((((~j14) << c7) & j14 & j12) != j12) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j14 & 255) < j13) {
                            c6 = c7;
                            int i12 = (i9 << 3) + i11;
                            j9 = j12;
                            Object obj = c2408e.f7788b[i12];
                            Object obj2 = c2408e.f7789c[i12];
                            boolean z5 = obj2 instanceof C2409F;
                            C2408E c2408e2 = this.f4961j;
                            if (z5) {
                                C2409F c2409f = (C2409F) obj2;
                                Object[] objArr = c2409f.f7794b;
                                long[] jArr4 = c2409f.f7793a;
                                j10 = j13;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j8 = j14;
                                    int i13 = i8;
                                    int i14 = 0;
                                    while (true) {
                                        long j15 = jArr4[i14];
                                        jArr2 = jArr3;
                                        i5 = length;
                                        if ((((~j15) << c6) & j15 & j9) != j9) {
                                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j15 & 255) < j10) {
                                                    i7 = i16;
                                                    int i17 = (i14 << 3) + i7;
                                                    j11 = j15;
                                                    if (!c2408e2.m4268c((C1311F) objArr[i17])) {
                                                        c2409f.m4291m(i17);
                                                    }
                                                } else {
                                                    i7 = i16;
                                                    j11 = j15;
                                                }
                                                j15 = j11 >> i13;
                                                i16 = i7 + 1;
                                            }
                                            if (i15 != i13) {
                                                break;
                                            }
                                            if (i14 == length2) {
                                                break;
                                            }
                                            i14++;
                                            jArr3 = jArr2;
                                            length = i5;
                                            i13 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i5 = length;
                                    j8 = j14;
                                }
                                zM4285g = c2409f.m4285g();
                            } else {
                                jArr2 = jArr3;
                                i5 = length;
                                j8 = j14;
                                j10 = j13;
                                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zM4285g = !c2408e2.m4268c((C1311F) obj2);
                            }
                            if (zM4285g) {
                                c2408e.m4277l(i12);
                            }
                            i6 = 8;
                        } else {
                            jArr2 = jArr3;
                            i5 = length;
                            j8 = j14;
                            c6 = c7;
                            j9 = j12;
                            j10 = j13;
                            i6 = i8;
                        }
                        j14 = j8 >> i6;
                        i11++;
                        i8 = i6;
                        c7 = c6;
                        j12 = j9;
                        j13 = j10;
                        jArr3 = jArr2;
                        length = i5;
                    }
                    jArr = jArr3;
                    int i18 = length;
                    c5 = c7;
                    j5 = j12;
                    j7 = j13;
                    if (i10 != i8) {
                        break;
                    } else {
                        length = i18;
                    }
                } else {
                    jArr = jArr3;
                    c5 = c7;
                    j5 = j12;
                    j7 = j13;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                c7 = c5;
                j12 = j5;
                j13 = j7;
                jArr3 = jArr;
                i8 = 8;
            }
        } else {
            c5 = 7;
            j5 = -9187201950435737472L;
            j6 = 255;
            j7 = 128;
        }
        C2409F c2409f2 = this.f4963l;
        if (!c2409f2.m4286h()) {
            return;
        }
        Object[] objArr2 = c2409f2.f7794b;
        long[] jArr5 = c2409f2.f7793a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            long j16 = jArr5[i19];
            if ((((~j16) << c5) & j16 & j5) != j5) {
                int i20 = 8 - ((~(i19 - length3)) >>> 31);
                for (int i21 = 0; i21 < i20; i21++) {
                    if ((j16 & j6) < j7) {
                        int i22 = (i19 << 3) + i21;
                        if (!(((C1388t0) objArr2[i22]).f4931g != null)) {
                            c2409f2.m4291m(i22);
                        }
                    }
                    j16 >>= 8;
                }
                if (i20 != 8) {
                    return;
                }
            }
            if (i19 == length3) {
                return;
            } else {
                i19++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m2655i() {
        boolean z5;
        synchronized (this.f4958g) {
            z5 = true;
            if (this.f4977z != 1) {
                z5 = false;
            }
            if (z5) {
                this.f4977z = 0;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: j */
    public final void m2656j(InterfaceC1603e interfaceC1603e) {
        try {
            synchronized (this.f4958g) {
                m2660n();
                C2408E c2408e = this.f4968q;
                this.f4968q = AbstractC2352g.m4201n();
                try {
                    C1383r c1383r = this.f4976y;
                    C0363A c0363a = this.f4970s;
                    if (!c1383r.f4888e.f5102h.m2726x()) {
                        AbstractC1387t.m2638a("Expected applyChanges() to have been called");
                    }
                    c1383r.f4878P = c0363a;
                    try {
                        c1383r.m2595n(c2408e, interfaceC1603e);
                    } finally {
                        c1383r.f4878P = null;
                    }
                } catch (Throwable th) {
                    this.f4968q = c2408e;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f4959h.f7810d.m4285g()) {
                    C1849k c1849k = this.f4975x;
                    try {
                        c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                        c1849k.m3318b();
                        c1849k.m3317a();
                    } catch (Throwable th3) {
                        c1849k.m3317a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2647a();
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final C1370k0 m2657k(boolean z5, InterfaceC1603e interfaceC1603e) {
        if (this.f4971t != null) {
            AbstractC1380p0.m2543b("A pausable composition is in progress");
        }
        C1370k0 c1370k0 = new C1370k0(this, this.f4955d, this.f4976y, this.f4959h, interfaceC1603e, z5, this.f4956e, this.f4958g);
        this.f4971t = c1370k0;
        return c1370k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m2658l() {
        synchronized (this.f4958g) {
            try {
                if (this.f4971t != null) {
                    AbstractC1380p0.m2543b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z5 = this.f4960i.f4706e > 0;
                if (z5 || !this.f4959h.f7810d.m4285g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            if (z5) {
                                C1324L0 c1324l0M2439d = this.f4960i.m2439d();
                                try {
                                    c1324l0M2439d.m2483n(c1324l0M2439d.f4742t, new C0352m(8, this.f4975x, c1324l0M2439d));
                                    c1324l0M2439d.m2475e(true);
                                    this.f4956e.mo784g();
                                    c1849k.m3319c();
                                } catch (Throwable th) {
                                    c1324l0M2439d.m2475e(false);
                                    throw th;
                                }
                            }
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f4961j.m4266a();
                this.f4964m.m4266a();
                this.f4968q.m4266a();
                this.f4965n.f5102h.m2724v();
                this.f4966o.f5102h.m2724v();
                C1383r c1383r = this.f4976y;
                c1383r.f4867E.clear();
                c1383r.f4902s.clear();
                c1383r.f4888e.f5102h.m2724v();
                c1383r.f4905v = null;
                this.f4977z = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2659m() {
        synchronized (this.f4958g) {
            try {
                if (this.f4976y.f4868F) {
                    AbstractC1380p0.m2543b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f4977z != 3) {
                    this.f4977z = 3;
                    C1440a c1440a = this.f4976y.f4874L;
                    if (c1440a != null) {
                        m2651e(c1440a);
                    }
                    boolean z5 = this.f4960i.f4706e > 0;
                    if (z5 || !this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            if (z5) {
                                C1324L0 c1324l0M2439d = this.f4960i.m2439d();
                                try {
                                    c1324l0M2439d.m2483n(c1324l0M2439d.f4742t, new C0002B(8, this.f4975x));
                                    c1324l0M2439d.m2457H();
                                    c1324l0M2439d.m2475e(true);
                                    this.f4956e.m779a();
                                    this.f4956e.mo784g();
                                    c1849k.m3319c();
                                } catch (Throwable th) {
                                    c1324l0M2439d.m2475e(false);
                                    throw th;
                                }
                            }
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th2) {
                            c1849k.m3317a();
                            throw th2;
                        }
                    }
                    C1383r c1383r = this.f4976y;
                    c1383r.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c1383r.f4885b.mo2539u(c1383r);
                        c1383r.f4867E.clear();
                        c1383r.f4902s.clear();
                        c1383r.f4888e.f5102h.m2724v();
                        c1383r.f4905v = null;
                        c1383r.f4884a.m779a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f4955d.mo2540v(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m2660n() {
        Object obj = AbstractC1385s.f4912b;
        AtomicReference atomicReference = this.f4957f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC1387t.m2639b("pending composition has not been applied");
                throw new C0330q();
            }
            if (andSet instanceof Set) {
                m2649c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1387t.m2639b("corrupt pendingModifications drain: " + atomicReference);
                throw new C0330q();
            }
            for (Set set : (Set[]) andSet) {
                m2649c(set, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m2661o() {
        AtomicReference atomicReference = this.f4957f;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC1665j.m2981a(andSet, AbstractC1385s.f4912b)) {
            return;
        }
        if (andSet instanceof Set) {
            m2649c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m2649c(set, false);
            }
            return;
        }
        if (andSet != null) {
            AbstractC1387t.m2639b("corrupt pendingModifications drain: " + atomicReference);
            throw new C0330q();
        }
        if (this.f4971t == null) {
            AbstractC1387t.m2638a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m2662p() {
        C0983w c0983w = C0983w.f3049d;
        AtomicReference atomicReference = this.f4957f;
        Object andSet = atomicReference.getAndSet(c0983w);
        if (AbstractC1665j.m2981a(andSet, AbstractC1385s.f4912b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m2649c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC1387t.m2639b("corrupt pendingModifications drain: " + atomicReference);
            throw new C0330q();
        }
        for (Set set : (Set[]) andSet) {
            m2649c(set, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m2663q() {
        int i5 = this.f4977z;
        if (i5 != 0) {
            AbstractC1380p0.m2543b(i5 != 1 ? i5 != 2 ? i5 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f4971t == null) {
            return;
        }
        AbstractC1380p0.m2543b("A pausable composition is in progress");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: r */
    public final void m2664r(ArrayList arrayList) {
        C2411H c2411h = this.f4959h;
        C1383r c1383r = this.f4976y;
        if (arrayList.size() > 0) {
            ((AbstractC1346X) ((C0882h) arrayList.get(0)).f2769d).getClass();
            throw null;
        }
        try {
            c1383r.getClass();
            try {
                c1383r.m2548B(arrayList);
                c1383r.m2588i();
            } catch (Throwable th) {
                c1383r.m2572a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!c2411h.f7810d.m4285g()) {
                    C1849k c1849k = this.f4975x;
                    try {
                        c1849k.m3322g(c2411h, c1383r.m2607z());
                        c1849k.m3318b();
                        c1849k.m3317a();
                    } catch (Throwable th3) {
                        c1849k.m3317a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m2647a();
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final EnumC1331P m2665s(C1388t0 c1388t0, Object obj) {
        C1397y c1397y;
        int i5 = c1388t0.f4926b;
        if ((i5 & 2) != 0) {
            c1388t0.f4926b = i5 | 4;
        }
        C1349a c1349a = c1388t0.f4927c;
        if (c1349a == null || !c1349a.m2499a()) {
            return EnumC1331P.f4758d;
        }
        if (this.f4960i.m2440e(c1349a)) {
            if (c1388t0.f4928d == null) {
                return EnumC1331P.f4758d;
            }
            EnumC1331P enumC1331PM2667u = m2667u(c1388t0, c1349a, obj);
            if (enumC1331PM2667u != EnumC1331P.f4758d) {
                this.f4974w.m69i();
            }
            return enumC1331PM2667u;
        }
        synchronized (this.f4958g) {
            c1397y = this.f4972u;
        }
        if (c1397y != null) {
            C1383r c1383r = c1397y.f4976y;
            if (c1383r.f4868F && c1383r.m2575b0(c1388t0, obj)) {
                return EnumC1331P.f4761g;
            }
        }
        return EnumC1331P.f4758d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m2666t() {
        C1397y c1397y;
        synchronized (this.f4958g) {
            try {
                for (Object obj : this.f4960i.f4707f) {
                    C1388t0 c1388t0 = obj instanceof C1388t0 ? (C1388t0) obj : null;
                    if (c1388t0 != null && (c1397y = c1388t0.f4925a) != null) {
                        c1397y.m2665s(c1388t0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:80:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], EDGE_INSN: B:81:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC1331P m2667u(C1388t0 c1388t0, C1349a c1349a, Object obj) {
        int i5;
        synchronized (this.f4958g) {
            try {
                C1397y c1397y = this.f4972u;
                C1397y c1397y2 = null;
                if (c1397y != null) {
                    C1318I0 c1318i0 = this.f4960i;
                    int i6 = this.f4973v;
                    if (c1318i0.f4711j) {
                        AbstractC1387t.m2638a("Writer is active");
                    }
                    if (i6 < 0 || i6 >= c1318i0.f4706e) {
                        AbstractC1387t.m2638a("Invalid group index");
                    }
                    if (c1318i0.m2440e(c1349a)) {
                        int i7 = c1318i0.f4705d[(i6 * 5) + 3] + i6;
                        int i8 = c1349a.f4783a;
                        if (i6 > i8 || i8 >= i7) {
                            c1397y = null;
                        }
                        c1397y2 = c1397y;
                    }
                }
                if (c1397y2 == null) {
                    C1383r c1383r = this.f4976y;
                    if (c1383r.f4868F && c1383r.m2575b0(c1388t0, obj)) {
                        return EnumC1331P.f4761g;
                    }
                    if (obj != null && (obj instanceof C1311F)) {
                        Object objM4272g = this.f4968q.m4272g(c1388t0);
                        if (objM4272g == null) {
                            AbstractC2352g.m4192e(this.f4968q, c1388t0, obj);
                        } else if (objM4272g instanceof C2409F) {
                            C2409F c2409f = (C2409F) objM4272g;
                            Object[] objArr = c2409f.f7794b;
                            long[] jArr = c2409f.f7793a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i9 = 0;
                                loop0: while (true) {
                                    long j5 = jArr[i9];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i10 = 8;
                                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j5 & 255) < 128) {
                                                i5 = i10;
                                                if (objArr[(i9 << 3) + i12] == C1357e.f4797i) {
                                                    break loop0;
                                                }
                                            } else {
                                                i5 = i10;
                                            }
                                            j5 >>= i5;
                                            i12++;
                                            i10 = i5;
                                        }
                                        if (i11 != i10) {
                                            break;
                                        }
                                        if (i9 == length) {
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                                AbstractC2352g.m4192e(this.f4968q, c1388t0, obj);
                            }
                        } else if (objM4272g == C1357e.f4797i) {
                        }
                    } else {
                        this.f4968q.m4278m(c1388t0, C1357e.f4797i);
                    }
                }
                if (c1397y2 != null) {
                    return c1397y2.m2667u(c1388t0, c1349a, obj);
                }
                this.f4955d.mo2530l(this);
                return this.f4976y.f4868F ? EnumC1331P.f4760f : EnumC1331P.f4759e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m2668v(Object obj) {
        Object objM4272g = this.f4961j.m4272g(obj);
        if (objM4272g == null) {
            return;
        }
        boolean z5 = objM4272g instanceof C2409F;
        C2408E c2408e = this.f4967p;
        if (!z5) {
            C1388t0 c1388t0 = (C1388t0) objM4272g;
            if (c1388t0.m2642c(obj) == EnumC1331P.f4761g) {
                AbstractC2352g.m4192e(c2408e, obj, c1388t0);
                return;
            }
            return;
        }
        C2409F c2409f = (C2409F) objM4272g;
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
                    if ((255 & j5) < 128) {
                        C1388t0 c1388t02 = (C1388t0) objArr[(i5 << 3) + i7];
                        if (c1388t02.m2642c(obj) == EnumC1331P.f4761g) {
                            AbstractC2352g.m4192e(c2408e, obj, c1388t02);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2669w(Set set) {
        boolean z5 = set instanceof C1486h;
        C2408E c2408e = this.f4964m;
        C2408E c2408e2 = this.f4961j;
        if (z5) {
            C2409F c2409f = ((C1486h) set).f5195d;
            Object[] objArr = c2409f.f7794b;
            long[] jArr = c2409f.f7793a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                loop0: while (true) {
                    long j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j5) < 128) {
                                Object obj = objArr[(i5 << 3) + i7];
                                if (c2408e2.m4268c(obj) || c2408e.m4268c(obj)) {
                                    break loop0;
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
        } else {
            for (Object obj2 : set) {
                if (c2408e2.m4268c(obj2) || c2408e.m4268c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m2670x() {
        synchronized (this.f4958g) {
            C1370k0 c1370k0 = this.f4971t;
            boolean zM2727y = false;
            if (c1370k0 != null && (c1370k0.f4828h.get() != EnumC1372l0.f4838h || c1370k0.f4829i != AbstractC1848j.m3313b())) {
                AtomicReference atomicReference = c1370k0.f4828h;
                EnumC1372l0 enumC1372l0 = EnumC1372l0.f4839i;
                EnumC1372l0 enumC1372l02 = EnumC1372l0.f4837g;
                while (!atomicReference.compareAndSet(enumC1372l0, enumC1372l02) && atomicReference.get() == enumC1372l0) {
                }
                c1370k0.f4832l.f4663d.m4334a(9);
                return false;
            }
            m2660n();
            try {
                C2408E c2408e = this.f4968q;
                this.f4968q = AbstractC2352g.m4201n();
                try {
                    C1383r c1383r = this.f4976y;
                    C0363A c0363a = this.f4970s;
                    C1439L c1439l = c1383r.f4888e.f5102h;
                    if (!c1439l.m2726x()) {
                        AbstractC1387t.m2638a("Expected applyChanges() to have been called");
                    }
                    if (c2408e.f7791e > 0 || !c1383r.f4902s.isEmpty()) {
                        c1383r.f4878P = c0363a;
                        try {
                            c1383r.m2595n(c2408e, null);
                            c1383r.f4878P = null;
                            zM2727y = c1439l.m2727y();
                        } catch (Throwable th) {
                            c1383r.f4878P = null;
                            throw th;
                        }
                    }
                    if (!zM2727y) {
                        m2661o();
                    }
                    return zM2727y;
                } catch (Throwable th2) {
                    this.f4968q = c2408e;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f4959h.f7810d.m4285g()) {
                        C1849k c1849k = this.f4975x;
                        try {
                            c1849k.m3322g(this.f4959h, this.f4976y.m2607z());
                            c1849k.m3318b();
                            c1849k.m3317a();
                        } catch (Throwable th4) {
                            c1849k.m3317a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m2647a();
                    throw th5;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m2671y(C1486h c1486h) {
        Object obj;
        while (true) {
            Object obj2 = this.f4957f.get();
            if (obj2 == null || obj2.equals(AbstractC1385s.f4912b)) {
                obj = c1486h;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c1486h};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f4957f).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c1486h;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f4957f;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f4958g) {
                    m2661o();
                }
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2672z(Object obj) {
        C1388t0 c1388t0M2605x;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        int i6;
        C1383r c1383r = this.f4976y;
        if (c1383r.f4863A <= 0 && (c1388t0M2605x = c1383r.m2605x()) != null) {
            boolean z8 = true;
            int i7 = c1388t0M2605x.f4926b | 1;
            c1388t0M2605x.f4926b = i7;
            if ((i7 & 32) == 0) {
                C2444z c2444z = c1388t0M2605x.f4930f;
                if (c2444z == null) {
                    c2444z = new C2444z();
                    c1388t0M2605x.f4930f = c2444z;
                }
                int i8 = c1388t0M2605x.f4929e;
                int iM4363c = c2444z.m4363c(obj);
                if (iM4363c < 0) {
                    iM4363c = ~iM4363c;
                    i5 = -1;
                } else {
                    i5 = c2444z.f7900c[iM4363c];
                }
                c2444z.f7899b[iM4363c] = obj;
                c2444z.f7900c[iM4363c] = i8;
                z5 = i5 == c1388t0M2605x.f4929e;
            }
            this.f4974w.m69i();
            if (z5) {
                return;
            }
            if (obj instanceof AbstractC2091w) {
                ((AbstractC2091w) obj).m3870f(1);
            }
            AbstractC2352g.m4192e(this.f4961j, obj, c1388t0M2605x);
            if (obj instanceof C1311F) {
                C1311F c1311f = (C1311F) obj;
                C1309E c1309eM2413h = c1311f.m2413h();
                C2408E c2408e = this.f4964m;
                AbstractC2352g.m4181D(c2408e, obj);
                C2444z c2444z2 = c1309eM2413h.f4677e;
                Object[] objArr = c2444z2.f7899b;
                long[] jArr = c2444z2.f7898a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j5 = jArr[i9];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j5 & 255) < 128) {
                                    i6 = i10;
                                    InterfaceC2090v interfaceC2090v = (InterfaceC2090v) objArr[(i9 << 3) + i12];
                                    if (interfaceC2090v instanceof AbstractC2091w) {
                                        z7 = true;
                                        ((AbstractC2091w) interfaceC2090v).m3870f(1);
                                    } else {
                                        z7 = true;
                                    }
                                    AbstractC2352g.m4192e(c2408e, interfaceC2090v, obj);
                                } else {
                                    z7 = z8;
                                    i6 = i10;
                                }
                                j5 >>= i6;
                                i12++;
                                z8 = z7;
                                i10 = i6;
                            }
                            z6 = z8;
                            if (i11 != i10) {
                                break;
                            }
                        } else {
                            z6 = z8;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        z8 = z6;
                    }
                }
                Object obj2 = c1309eM2413h.f4678f;
                C2408E c2408e2 = c1388t0M2605x.f4931g;
                if (c2408e2 == null) {
                    c2408e2 = new C2408E();
                    c1388t0M2605x.f4931g = c2408e2;
                }
                c2408e2.m4278m(c1311f, obj2);
            }
        }
    }
}
