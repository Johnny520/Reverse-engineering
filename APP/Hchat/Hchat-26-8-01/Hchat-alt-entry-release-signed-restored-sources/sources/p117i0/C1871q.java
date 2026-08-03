package p117i0;

import android.os.Trace;
import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okio.C3193a;
import p015b0.C0151q;
import p015b0.C0154t;
import p020b5.C0190i;
import p069f.C0925b0;
import p069f.C0943k0;
import p069f.C0945l0;
import p069f.C0949n0;
import p069f.C0965w;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p089g1.C1275d;
import p131j0.C2048d;
import p159l0.AbstractC2428j;
import p159l0.C2420b;
import p159l0.C2426h;
import p159l0.C2429k;
import p175m0.C2682a;
import p175m0.C2705l0;
import p266s0.AbstractC3879i;
import p276sf.C3958e;
import p322w0.AbstractC4671v;
import p322w0.InterfaceC4670u;
import p338x0.C5574d;
import p339x1.C5604f2;
import tf.C4175v;

/* JADX INFO: renamed from: i0.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1871q implements InterfaceC1859n {

    /* JADX INFO: renamed from: A */
    public final C0190i f6199A;

    /* JADX INFO: renamed from: B */
    public final C1836h0 f6200B;

    /* JADX INFO: renamed from: C */
    public int f6201C;

    /* JADX INFO: renamed from: g */
    public final AbstractC1863o f6202g;

    /* JADX INFO: renamed from: h */
    public final C5604f2 f6203h;

    /* JADX INFO: renamed from: i */
    public final AtomicReference f6204i = new AtomicReference(null);

    /* JADX INFO: renamed from: j */
    public final Object f6205j = new Object();

    /* JADX INFO: renamed from: k */
    public final C0949n0 f6206k;

    /* JADX INFO: renamed from: l */
    public final C2426h f6207l;

    /* JADX INFO: renamed from: m */
    public final C0943k0 f6208m;

    /* JADX INFO: renamed from: n */
    public final C0945l0 f6209n;

    /* JADX INFO: renamed from: o */
    public final C0945l0 f6210o;

    /* JADX INFO: renamed from: p */
    public final C0943k0 f6211p;

    /* JADX INFO: renamed from: q */
    public final C2682a f6212q;

    /* JADX INFO: renamed from: r */
    public final C2682a f6213r;

    /* JADX INFO: renamed from: s */
    public final C0943k0 f6214s;

    /* JADX INFO: renamed from: t */
    public C0943k0 f6215t;

    /* JADX INFO: renamed from: u */
    public boolean f6216u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1826e2 f6217v;

    /* JADX INFO: renamed from: w */
    public C1853l1 f6218w;

    /* JADX INFO: renamed from: x */
    public C1871q f6219x;

    /* JADX INFO: renamed from: y */
    public int f6220y;

    /* JADX INFO: renamed from: z */
    public final C0119x f6221z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1871q(AbstractC1863o abstractC1863o, C5604f2 c5604f2) {
        this.f6202g = abstractC1863o;
        this.f6203h = c5604f2;
        C0949n0 c0949n0 = new C0949n0(new C0945l0());
        this.f6206k = c0949n0;
        C2426h c2426h = new C2426h();
        if (abstractC1863o.mo4464d()) {
            c2426h.f7959q = new C0965w();
        }
        if (abstractC1863o.mo4466f()) {
            c2426h.m5782c();
        }
        this.f6207l = c2426h;
        this.f6208m = AbstractC1089i.m2781o();
        this.f6209n = new C0945l0();
        this.f6210o = new C0945l0();
        this.f6211p = AbstractC1089i.m2781o();
        C2682a c2682a = new C2682a();
        this.f6212q = c2682a;
        C2682a c2682a2 = new C2682a();
        this.f6213r = c2682a2;
        this.f6214s = AbstractC1089i.m2781o();
        this.f6215t = AbstractC1089i.m2781o();
        C0119x c0119x = new C0119x(abstractC1863o, 23);
        this.f6221z = c0119x;
        this.f6199A = new C0190i();
        C1836h0 c1836h0 = new C1836h0(c5604f2, abstractC1863o, AbstractC2428j.m5790d(c2426h), c0949n0, c2682a, c2682a2, c0119x, this);
        abstractC1863o.mo4476p(c1836h0);
        this.f6200B = c1836h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m4587A(InterfaceC1235p interfaceC1235p) {
        boolean zM4596i = m4596i();
        m4604q();
        AbstractC1863o abstractC1863o = this.f6202g;
        if (!zM4596i) {
            abstractC1863o.mo4461a(this, interfaceC1235p);
            return;
        }
        C1836h0 c1836h0 = this.f6200B;
        c1836h0.f6122z = 0;
        c1836h0.f6121y = true;
        abstractC1863o.mo4461a(this, interfaceC1235p);
        c1836h0.m4558u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4588a() {
        this.f6204i.set(null);
        this.f6212q.f8739j.m6133R();
        this.f6213r.f8739j.m6133R();
        C0949n0 c0949n0 = this.f6206k;
        if (c0949n0.f2994g.m2334g()) {
            return;
        }
        C0190i c0190i = this.f6199A;
        try {
            c0190i.m846i(c0949n0, this.f6200B.m4501C());
            c0190i.m840b();
        } finally {
            c0190i.m839a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4589b(Object obj, boolean z9) {
        int i9;
        Object objM2320g = this.f6208m.m2320g(obj);
        if (objM2320g == null) {
            return;
        }
        boolean z10 = objM2320g instanceof C0945l0;
        EnumC1864o0 enumC1864o0 = EnumC1864o0.f6188g;
        C0945l0 c0945l0 = this.f6209n;
        C0945l0 c0945l02 = this.f6210o;
        C0943k0 c0943k0 = this.f6214s;
        if (!z10) {
            C1876r1 c1876r1 = (C1876r1) objM2320g;
            if (AbstractC1089i.m2798w0(c0943k0, obj, c1876r1) || c1876r1.m4646b(obj) == enumC1864o0) {
                return;
            }
            if (c1876r1.f6244g == null || z9) {
                c0945l0.m2328a(c1876r1);
                return;
            } else {
                c0945l02.m2328a(c1876r1);
                return;
            }
        }
        C0945l0 c0945l03 = (C0945l0) objM2320g;
        Object[] objArr = c0945l03.f2976b;
        long[] jArr = c0945l03.f2975a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j3 & 255) < 128) {
                        C1876r1 c1876r12 = (C1876r1) objArr[(i10 << 3) + i13];
                        if (AbstractC1089i.m2798w0(c0943k0, obj, c1876r12)) {
                            i9 = i11;
                        } else {
                            i9 = i11;
                            if (c1876r12.m4646b(obj) != enumC1864o0) {
                                if (c1876r12.f6244g == null || z9) {
                                    c0945l0.m2328a(c1876r12);
                                } else {
                                    c0945l02.m2328a(c1876r12);
                                }
                            }
                        }
                    }
                    j3 >>= i9;
                    i13++;
                    i11 = i9;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4590c(Set set, boolean z9) {
        long j3;
        long j4;
        long j5;
        char c10;
        int i9;
        long[] jArr;
        long[] jArr2;
        long j10;
        boolean zM2330c;
        long[] jArr3;
        long j11;
        long[] jArr4;
        long[] jArr5;
        int i10;
        long j12;
        boolean zM2334g;
        int i11;
        long j13;
        long[] jArr6;
        long[] jArr7;
        char c11;
        long j14;
        int i12;
        int i13;
        long[] jArr8;
        boolean z10 = set instanceof C2048d;
        C0943k0 c0943k0 = this.f6211p;
        Object obj = null;
        int i14 = 8;
        if (z10) {
            C0945l0 c0945l0 = ((C2048d) set).f6894g;
            Object[] objArr = c0945l0.f2976b;
            long[] jArr9 = c0945l0.f2975a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j3 = 128;
                j4 = 255;
                while (true) {
                    long j15 = jArr9[i15];
                    char c12 = 7;
                    j5 = -9187201950435737472L;
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j15 & 255) < 128) {
                                Object obj2 = objArr[(i15 << 3) + i17];
                                c11 = c12;
                                if (obj2 instanceof C1876r1) {
                                    ((C1876r1) obj2).m4646b(obj);
                                } else {
                                    m4589b(obj2, z9);
                                    Object objM2320g = c0943k0.m2320g(obj2);
                                    if (objM2320g != null) {
                                        if (objM2320g instanceof C0945l0) {
                                            C0945l0 c0945l02 = (C0945l0) objM2320g;
                                            Object[] objArr2 = c0945l02.f2976b;
                                            long[] jArr10 = c0945l02.f2975a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i18 = i14;
                                                i12 = length;
                                                int i19 = 0;
                                                while (true) {
                                                    long j16 = jArr10[i19];
                                                    j14 = j15;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j16) << c11) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j16 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                m4589b((C1892x) objArr2[(i19 << 3) + i21], z9);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j16 >>= i18;
                                                            i21++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i20 != i18) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    jArr10 = jArr11;
                                                    j15 = j14;
                                                    jArr9 = jArr7;
                                                    i18 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j14 = j15;
                                            i12 = length;
                                            m4589b((C1892x) objM2320g, z9);
                                        }
                                        i13 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j14 = j15;
                                i12 = length;
                                i13 = 8;
                            } else {
                                jArr7 = jArr9;
                                c11 = c12;
                                j14 = j15;
                                i12 = length;
                                i13 = i14;
                            }
                            j15 = j14 >> i13;
                            i17++;
                            length = i12;
                            i14 = i13;
                            c12 = c11;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c10 = c12;
                        int i22 = length;
                        if (i16 != i14) {
                            break;
                        } else {
                            length = i22;
                        }
                    } else {
                        jArr6 = jArr9;
                        c10 = 7;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    jArr9 = jArr6;
                    obj = null;
                    i14 = 8;
                }
            } else {
                j3 = 128;
                j4 = 255;
                j5 = -9187201950435737472L;
                c10 = 7;
            }
        } else {
            j3 = 128;
            j4 = 255;
            j5 = -9187201950435737472L;
            c10 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C1876r1) {
                    ((C1876r1) obj3).m4646b(null);
                } else {
                    m4589b(obj3, z9);
                    Object objM2320g2 = c0943k0.m2320g(obj3);
                    if (objM2320g2 != null) {
                        if (objM2320g2 instanceof C0945l0) {
                            C0945l0 c0945l03 = (C0945l0) objM2320g2;
                            Object[] objArr3 = c0945l03.f2976b;
                            long[] jArr12 = c0945l03.f2975a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j17 = jArr12[i9];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i9 - length3)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j17 & 255) < 128) {
                                                m4589b((C1892x) objArr3[(i9 << 3) + i24], z9);
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i23 == 8) {
                                            i9 = i9 != length3 ? i9 + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            m4589b((C1892x) objM2320g2, z9);
                        }
                    }
                }
            }
        }
        C0943k0 c0943k02 = this.f6208m;
        C0945l0 c0945l04 = this.f6209n;
        if (z9) {
            C0945l0 c0945l05 = this.f6210o;
            if (c0945l05.m2335h()) {
                long[] jArr13 = c0943k02.f2968a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j18 = jArr13[i25];
                        if ((((~j18) << c10) & j18 & j5) != j5) {
                            int i26 = 8 - ((~(i25 - length4)) >>> 31);
                            int i27 = 0;
                            while (i27 < i26) {
                                if ((j18 & j4) < j3) {
                                    int i28 = (i25 << 3) + i27;
                                    Object obj4 = c0943k02.f2969b[i28];
                                    Object obj5 = c0943k02.f2970c[i28];
                                    if (obj5 instanceof C0945l0) {
                                        C0945l0 c0945l06 = (C0945l0) obj5;
                                        Object[] objArr4 = c0945l06.f2976b;
                                        long[] jArr14 = c0945l06.f2975a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j12 = j18;
                                            int i29 = 0;
                                            while (true) {
                                                long j19 = jArr14[i29];
                                                jArr5 = jArr13;
                                                i10 = length4;
                                                if ((((~j19) << c10) & j19 & j5) != j5) {
                                                    int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                    for (int i31 = 0; i31 < i30; i31 = i11 + 1) {
                                                        if ((j19 & j4) < j3) {
                                                            i11 = i31;
                                                            int i32 = (i29 << 3) + i11;
                                                            j13 = j19;
                                                            C1876r1 c1876r1 = (C1876r1) objArr4[i32];
                                                            if (c0945l05.m2330c(c1876r1) || c0945l04.m2330c(c1876r1)) {
                                                                c0945l06.m2340m(i32);
                                                            }
                                                        } else {
                                                            i11 = i31;
                                                            j13 = j19;
                                                        }
                                                        j19 = j13 >> 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                    if (i29 == length5) {
                                                        break;
                                                    }
                                                    i29++;
                                                    length4 = i10;
                                                    jArr13 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i10 = length4;
                                            j12 = j18;
                                        }
                                        zM2334g = c0945l06.m2334g();
                                    } else {
                                        jArr5 = jArr13;
                                        i10 = length4;
                                        j12 = j18;
                                        obj5.getClass();
                                        C1876r1 c1876r12 = (C1876r1) obj5;
                                        zM2334g = c0945l05.m2330c(c1876r12) || c0945l04.m2330c(c1876r12);
                                    }
                                    if (zM2334g) {
                                        c0943k02.m2325l(i28);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i10 = length4;
                                    j12 = j18;
                                }
                                j18 = j12 >> 8;
                                i27++;
                                length4 = i10;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i33 = length4;
                            if (i26 != 8) {
                                break;
                            } else {
                                length4 = i33;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i25 == length4) {
                            break;
                        }
                        i25++;
                        jArr13 = jArr4;
                    }
                }
                c0945l05.m2329b();
                m4595h();
                return;
            }
        }
        if (c0945l04.m2335h()) {
            long[] jArr15 = c0943k02.f2968a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i34 = 0;
                while (true) {
                    long j20 = jArr15[i34];
                    if ((((~j20) << c10) & j20 & j5) != j5) {
                        int i35 = 8 - ((~(i34 - length6)) >>> 31);
                        int i36 = 0;
                        while (i36 < i35) {
                            if ((j20 & j4) < j3) {
                                int i37 = (i34 << 3) + i36;
                                Object obj6 = c0943k02.f2969b[i37];
                                Object obj7 = c0943k02.f2970c[i37];
                                if (obj7 instanceof C0945l0) {
                                    C0945l0 c0945l07 = (C0945l0) obj7;
                                    Object[] objArr5 = c0945l07.f2976b;
                                    long[] jArr16 = c0945l07.f2975a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j10 = j20;
                                        int i38 = 0;
                                        while (true) {
                                            long j21 = jArr16[i38];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j21) << c10) & j21 & j5) != j5) {
                                                int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                int i40 = 0;
                                                while (i40 < i39) {
                                                    if ((j21 & j4) < j3) {
                                                        jArr3 = jArr15;
                                                        int i41 = (i38 << 3) + i40;
                                                        j11 = j21;
                                                        if (c0945l04.m2330c((C1876r1) objArr6[i41])) {
                                                            c0945l07.m2340m(i41);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j11 = j21;
                                                    }
                                                    i40++;
                                                    jArr15 = jArr3;
                                                    j21 = j11 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i39 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i38 == length7) {
                                                break;
                                            }
                                            i38++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j10 = j20;
                                    }
                                    zM2330c = c0945l07.m2334g();
                                } else {
                                    jArr2 = jArr15;
                                    j10 = j20;
                                    obj7.getClass();
                                    zM2330c = c0945l04.m2330c((C1876r1) obj7);
                                }
                                if (zM2330c) {
                                    c0943k02.m2325l(i37);
                                }
                            } else {
                                jArr2 = jArr15;
                                j10 = j20;
                            }
                            i36++;
                            j20 = j10 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i35 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i34 == length6) {
                        break;
                    }
                    i34++;
                    jArr15 = jArr;
                }
            }
            m4595h();
            c0945l04.m2329b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: d */
    public final void m4591d() {
        synchronized (this.f6205j) {
            try {
                m4592e(this.f6212q);
                m4602o();
            } catch (Throwable th2) {
                try {
                    if (!this.f6206k.f2994g.m2334g()) {
                        C0190i c0190i = this.f6199A;
                        try {
                            c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                            c0190i.m840b();
                            c0190i.m839a();
                        } catch (Throwable th3) {
                            c0190i.m839a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    m4588a();
                    throw th4;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4592e(C2682a c2682a) throws Throwable {
        InterfaceC1807a interfaceC1807a;
        C0190i c0190i;
        C0190i c0190i2;
        long[] jArr;
        int i9;
        long[] jArr2;
        C0190i c0190i3;
        long j3;
        char c10;
        long j4;
        int i10;
        boolean zM2334g;
        long j5;
        C2682a c2682a2 = this.f6213r;
        C1836h0 c1836h0 = this.f6200B;
        C5574d c5574dM4501C = c1836h0.m4501C();
        C0190i c0190i4 = this.f6199A;
        c0190i4.m846i(this.f6206k, c5574dM4501C);
        try {
            if (c2682a.f8739j.m6135T()) {
                try {
                    if (c2682a2.f8739j.m6135T() && this.f6218w == null) {
                        c0190i4.m840b();
                    }
                    return;
                } finally {
                }
            }
            C1853l1 c1853l1 = this.f6218w;
            if (c1853l1 == null || (interfaceC1807a = c1853l1.f6168l) == null) {
                interfaceC1807a = this.f6203h;
            }
            try {
                Trace.beginSection(interfaceC1807a.equals(c1853l1 != null ? c1853l1.f6168l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    C1853l1 c1853l12 = this.f6218w;
                    if (c1853l12 == null || (c0190i = c1853l12.f6167k) == null) {
                        c0190i = c0190i4;
                    }
                    C2426h c2426h = this.f6207l;
                    C5574d c5574dM4501C2 = c1836h0.m4501C();
                    C2429k c2429kM5784e = AbstractC2428j.m5790d(c2426h).m5784e();
                    int i11 = 0;
                    try {
                        c2682a.m6125t0(interfaceC1807a, c2429kM5784e, c0190i, c5574dM4501C2);
                        c2429kM5784e.m5820e(true);
                        interfaceC1807a.mo4451q();
                        Trace.endSection();
                        c0190i4.m841c();
                        c0190i4.m842d();
                        if (this.f6216u) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f6216u = false;
                                C0943k0 c0943k0 = this.f6208m;
                                long[] jArr3 = c0943k0.f2968a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr3[i12];
                                        char c11 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = i11;
                                            while (i15 < i14) {
                                                if ((j10 & 255) < 128) {
                                                    c10 = c11;
                                                    int i16 = (i12 << 3) + i15;
                                                    j4 = j11;
                                                    Object obj = c0943k0.f2969b[i16];
                                                    Object obj2 = c0943k0.f2970c[i16];
                                                    if (obj2 instanceof C0945l0) {
                                                        C0945l0 c0945l0 = (C0945l0) obj2;
                                                        Object[] objArr = c0945l0.f2976b;
                                                        long[] jArr4 = c0945l0.f2975a;
                                                        int i17 = i13;
                                                        int length2 = jArr4.length - 2;
                                                        i9 = i15;
                                                        jArr2 = jArr3;
                                                        c0190i3 = c0190i4;
                                                        if (length2 >= 0) {
                                                            int i18 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr4[i18];
                                                                    j3 = j10;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j12) << c10) & j12 & j4) != j4) {
                                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                        for (int i20 = 0; i20 < i19; i20++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                j5 = j12;
                                                                                int i21 = (i18 << 3) + i20;
                                                                                if (!((C1876r1) objArr[i21]).m4645a()) {
                                                                                    c0945l0.m2340m(i21);
                                                                                }
                                                                            } else {
                                                                                j5 = j12;
                                                                            }
                                                                            j12 = j5 >> i17;
                                                                        }
                                                                        if (i19 != i17) {
                                                                            break;
                                                                        }
                                                                        if (i18 == length2) {
                                                                            break;
                                                                        }
                                                                        i18++;
                                                                        jArr4 = jArr5;
                                                                        j10 = j3;
                                                                        i17 = 8;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j3 = j10;
                                                        }
                                                        zM2334g = c0945l0.m2334g();
                                                    } else {
                                                        i9 = i15;
                                                        jArr2 = jArr3;
                                                        c0190i3 = c0190i4;
                                                        j3 = j10;
                                                        obj2.getClass();
                                                        zM2334g = !((C1876r1) obj2).m4645a();
                                                    }
                                                    if (zM2334g) {
                                                        c0943k0.m2325l(i16);
                                                    }
                                                    i10 = 8;
                                                } else {
                                                    i9 = i15;
                                                    jArr2 = jArr3;
                                                    c0190i3 = c0190i4;
                                                    j3 = j10;
                                                    c10 = c11;
                                                    j4 = j11;
                                                    i10 = i13;
                                                }
                                                j10 = j3 >> i10;
                                                i15 = i9 + 1;
                                                i13 = i10;
                                                c11 = c10;
                                                j11 = j4;
                                                c0190i4 = c0190i3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            c0190i2 = c0190i4;
                                            if (i14 != i13) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            c0190i2 = c0190i4;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                        c0190i4 = c0190i2;
                                        jArr3 = jArr;
                                        i11 = 0;
                                    }
                                } else {
                                    c0190i2 = c0190i4;
                                }
                                m4595h();
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            c0190i2 = c0190i4;
                        }
                        try {
                            if (c2682a2.f8739j.m6135T() && this.f6218w == null) {
                                c0190i2.m840b();
                            }
                            return;
                        } finally {
                            c0190i2.m839a();
                        }
                    } catch (Throwable th4) {
                        try {
                            c2429kM5784e.m5820e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        try {
            if (c2682a2.f8739j.m6135T() && this.f6218w == null) {
                c0190i4.m840b();
            }
            throw th;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: f */
    public final void m4593f() {
        synchronized (this.f6205j) {
            try {
                C2682a c2682a = this.f6213r;
                c2682a.getClass();
                if (!c2682a.f8739j.m6135T()) {
                    m4592e(this.f6213r);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f6206k.f2994g.m2334g()) {
                        C0190i c0190i = this.f6199A;
                        try {
                            c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                            c0190i.m840b();
                            c0190i.m839a();
                        } catch (Throwable th3) {
                            c0190i.m839a();
                            throw th3;
                        }
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    /* JADX INFO: renamed from: g */
    public final void m4594g() {
        C0190i c0190i;
        synchronized (this.f6205j) {
            try {
                this.f6200B.f6118v = null;
                if (!this.f6206k.f2994g.m2334g()) {
                    c0190i = this.f6199A;
                    try {
                        c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                        c0190i.m840b();
                        c0190i.m839a();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f6206k.f2994g.m2334g()) {
                        c0190i = this.f6199A;
                        try {
                            c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                            c0190i.m840b();
                            c0190i.m839a();
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    m4588a();
                    throw th3;
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
    public final void m4595h() {
        char c10;
        long j3;
        long j4;
        long j5;
        long[] jArr;
        long[] jArr2;
        int i9;
        long j10;
        char c11;
        long j11;
        long j12;
        int i10;
        boolean zM2334g;
        int i11;
        long j13;
        C0943k0 c0943k0 = this.f6211p;
        long[] jArr3 = c0943k0.f2968a;
        int length = jArr3.length - 2;
        char c12 = 7;
        long j14 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            long j15 = 128;
            while (true) {
                long j16 = jArr3[i13];
                j4 = 255;
                if ((((~j16) << c12) & j16 & j14) != j14) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j16 & 255) < j15) {
                            c11 = c12;
                            int i16 = (i13 << 3) + i15;
                            j11 = j14;
                            Object obj = c0943k0.f2969b[i16];
                            Object obj2 = c0943k0.f2970c[i16];
                            boolean z9 = obj2 instanceof C0945l0;
                            C0943k0 c0943k02 = this.f6208m;
                            if (z9) {
                                C0945l0 c0945l0 = (C0945l0) obj2;
                                Object[] objArr = c0945l0.f2976b;
                                long[] jArr4 = c0945l0.f2975a;
                                j12 = j15;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j10 = j16;
                                    int i17 = i12;
                                    int i18 = 0;
                                    while (true) {
                                        long j17 = jArr4[i18];
                                        jArr2 = jArr3;
                                        i9 = length;
                                        if ((((~j17) << c11) & j17 & j11) != j11) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j17 & 255) < j12) {
                                                    i11 = i20;
                                                    int i21 = (i18 << 3) + i11;
                                                    j13 = j17;
                                                    if (!c0943k02.m2316c((C1892x) objArr[i21])) {
                                                        c0945l0.m2340m(i21);
                                                    }
                                                } else {
                                                    i11 = i20;
                                                    j13 = j17;
                                                }
                                                j17 = j13 >> i17;
                                                i20 = i11 + 1;
                                            }
                                            if (i19 != i17) {
                                                break;
                                            }
                                            if (i18 == length2) {
                                                break;
                                            }
                                            i18++;
                                            jArr3 = jArr2;
                                            length = i9;
                                            i17 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i9 = length;
                                    j10 = j16;
                                }
                                zM2334g = c0945l0.m2334g();
                            } else {
                                jArr2 = jArr3;
                                i9 = length;
                                j10 = j16;
                                j12 = j15;
                                obj2.getClass();
                                zM2334g = !c0943k02.m2316c((C1892x) obj2);
                            }
                            if (zM2334g) {
                                c0943k0.m2325l(i16);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            i9 = length;
                            j10 = j16;
                            c11 = c12;
                            j11 = j14;
                            j12 = j15;
                            i10 = i12;
                        }
                        j16 = j10 >> i10;
                        i15++;
                        i12 = i10;
                        c12 = c11;
                        j14 = j11;
                        j15 = j12;
                        jArr3 = jArr2;
                        length = i9;
                    }
                    jArr = jArr3;
                    int i22 = length;
                    c10 = c12;
                    j3 = j14;
                    j5 = j15;
                    if (i14 != i12) {
                        break;
                    } else {
                        length = i22;
                    }
                } else {
                    jArr = jArr3;
                    c10 = c12;
                    j3 = j14;
                    j5 = j15;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                c12 = c10;
                j14 = j3;
                j15 = j5;
                jArr3 = jArr;
                i12 = 8;
            }
        } else {
            c10 = 7;
            j3 = -9187201950435737472L;
            j4 = 255;
            j5 = 128;
        }
        C0945l0 c0945l02 = this.f6210o;
        if (!c0945l02.m2335h()) {
            return;
        }
        Object[] objArr2 = c0945l02.f2976b;
        long[] jArr5 = c0945l02.f2975a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i23 = 0;
        while (true) {
            long j18 = jArr5[i23];
            if ((((~j18) << c10) & j18 & j3) != j3) {
                int i24 = 8 - ((~(i23 - length3)) >>> 31);
                for (int i25 = 0; i25 < i24; i25++) {
                    if ((j18 & j4) < j5) {
                        int i26 = (i23 << 3) + i25;
                        if (!(((C1876r1) objArr2[i26]).f6244g != null)) {
                            c0945l02.m2340m(i26);
                        }
                    }
                    j18 >>= 8;
                }
                if (i24 != 8) {
                    return;
                }
            }
            if (i23 == length3) {
                return;
            } else {
                i23++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m4596i() {
        boolean z9;
        synchronized (this.f6205j) {
            z9 = true;
            if (this.f6201C != 1) {
                z9 = false;
            }
            if (z9) {
                this.f6201C = 0;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: j */
    public final void m4597j(InterfaceC1235p interfaceC1235p) {
        try {
            synchronized (this.f6205j) {
                m4601n();
                C0943k0 c0943k0 = this.f6215t;
                this.f6215t = AbstractC1089i.m2781o();
                try {
                    C1836h0 c1836h0 = this.f6200B;
                    InterfaceC1826e2 interfaceC1826e2 = this.f6217v;
                    if (!c1836h0.f6101e.f8739j.m6135T()) {
                        AbstractC1855m.m4573a("Expected applyChanges() to have been called");
                    }
                    c1836h0.f6091P = interfaceC1826e2;
                    try {
                        c1836h0.m4550n(c0943k0, interfaceC1235p);
                    } finally {
                        c1836h0.f6091P = null;
                    }
                } catch (Throwable th2) {
                    this.f6215t = c0943k0;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f6206k.f2994g.m2334g()) {
                    C0190i c0190i = this.f6199A;
                    try {
                        c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                        c0190i.m840b();
                        c0190i.m839a();
                    } catch (Throwable th4) {
                        c0190i.m839a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                m4588a();
                throw th5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final C1853l1 m4598k(boolean z9, InterfaceC1235p interfaceC1235p) {
        if (this.f6218w != null) {
            AbstractC1861n1.m4584b("A pausable composition is in progress");
        }
        C1853l1 c1853l1 = new C1853l1(this, this.f6202g, this.f6200B, this.f6206k, interfaceC1235p, z9, this.f6203h, this.f6205j);
        this.f6218w = c1853l1;
        return c1853l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4599l() {
        synchronized (this.f6205j) {
            try {
                if (this.f6218w != null) {
                    AbstractC1861n1.m4584b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z9 = this.f6207l.f7950h == 0;
                if (!z9 || !this.f6206k.f2994g.m2334g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C0190i c0190i = this.f6199A;
                        try {
                            c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                            if (!z9) {
                                C2426h c2426h = this.f6207l;
                                C0190i c0190i2 = this.f6199A;
                                C2429k c2429kM5784e = c2426h.m5784e();
                                try {
                                    c2429kM5784e.m5828n(c2429kM5784e.f7982t, new C0151q(c0190i2, 7, c2429kM5784e));
                                    c2429kM5784e.m5820e(true);
                                    this.f6203h.mo4451q();
                                    c0190i.m841c();
                                } catch (Throwable th2) {
                                    c2429kM5784e.m5820e(false);
                                    throw th2;
                                }
                            }
                            c0190i.m840b();
                            c0190i.m839a();
                        } catch (Throwable th3) {
                            c0190i.m839a();
                            throw th3;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f6208m.m2314a();
                this.f6211p.m2314a();
                this.f6215t.m2314a();
                this.f6212q.f8739j.m6133R();
                this.f6213r.f8739j.m6133R();
                C1836h0 c1836h0 = this.f6200B;
                c1836h0.f6080E.clear();
                c1836h0.f6115s.clear();
                c1836h0.f6101e.f8739j.m6133R();
                c1836h0.f6118v = null;
                this.f6201C = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4600m() {
        synchronized (this.f6205j) {
            try {
                if (this.f6200B.f6081F) {
                    AbstractC1861n1.m4584b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f6201C != 3) {
                    this.f6201C = 3;
                    C2682a c2682a = this.f6200B.f6087L;
                    if (c2682a != null) {
                        m4592e(c2682a);
                    }
                    boolean z9 = this.f6207l.f7950h == 0;
                    if (!z9 || !this.f6206k.f2994g.m2334g()) {
                        C0190i c0190i = this.f6199A;
                        try {
                            c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                            if (!z9) {
                                C2426h c2426h = this.f6207l;
                                C0190i c0190i2 = this.f6199A;
                                C2429k c2429kM5784e = c2426h.m5784e();
                                try {
                                    c2429kM5784e.m5828n(c2429kM5784e.f7982t, new C0154t(c0190i2, 8));
                                    c2429kM5784e.m5802H();
                                    c2429kM5784e.m5820e(true);
                                    this.f6203h.m10055a();
                                    this.f6203h.mo4451q();
                                    c0190i.m841c();
                                } catch (Throwable th2) {
                                    c2429kM5784e.m5820e(false);
                                    throw th2;
                                }
                            }
                            c0190i.m840b();
                            c0190i.m839a();
                        } catch (Throwable th3) {
                            c0190i.m839a();
                            throw th3;
                        }
                    }
                    C1836h0 c1836h0 = this.f6200B;
                    c1836h0.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c1836h0.f6098b.mo4481u(c1836h0);
                        c1836h0.f6080E.clear();
                        c1836h0.f6115s.clear();
                        c1836h0.f6101e.f8739j.m6133R();
                        c1836h0.f6118v = null;
                        c1836h0.f6097a.m10055a();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f6202g.mo4482v(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4601n() {
        Object obj = AbstractC1874r.f6231a;
        AtomicReference atomicReference = this.f6204i;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC1855m.m4574b("pending composition has not been applied");
                C3193a.m6814c();
                return;
            }
            if (andSet instanceof Set) {
                m4590c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1855m.m4574b("corrupt pendingModifications drain: " + atomicReference);
                C3193a.m6814c();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m4590c(set, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m4602o() {
        AtomicReference atomicReference = this.f6204i;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC1416l.m3825a(andSet, AbstractC1874r.f6231a)) {
            return;
        }
        if (andSet instanceof Set) {
            m4590c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m4590c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f6218w == null) {
                AbstractC1855m.m4573a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC1855m.m4574b("corrupt pendingModifications drain: " + atomicReference);
            C3193a.m6814c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m4603p() {
        C4175v c4175v = C4175v.f13712g;
        AtomicReference atomicReference = this.f6204i;
        Object andSet = atomicReference.getAndSet(c4175v);
        if (AbstractC1416l.m3825a(andSet, AbstractC1874r.f6231a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m4590c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC1855m.m4574b("corrupt pendingModifications drain: " + atomicReference);
            C3193a.m6814c();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m4590c(set, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4604q() {
        int i9 = this.f6201C;
        if (i9 != 0) {
            AbstractC1861n1.m4584b(i9 != 1 ? i9 != 2 ? i9 != 3 ? HttpUrl.FRAGMENT_ENCODE_SET : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f6218w == null) {
            return;
        }
        AbstractC1861n1.m4584b("A pausable composition is in progress");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: r */
    public final void m4605r(ArrayList arrayList) {
        C0949n0 c0949n0 = this.f6206k;
        C1836h0 c1836h0 = this.f6200B;
        if (arrayList.size() > 0) {
            ((AbstractC1887v0) ((C3958e) arrayList.get(0)).f12961g).getClass();
            throw null;
        }
        try {
            c1836h0.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    c1836h0.m4504F(arrayList);
                    c1836h0.m4540i();
                } catch (Throwable th2) {
                    c1836h0.m4524a();
                    throw th2;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th3) {
            try {
                if (!c0949n0.f2994g.m2334g()) {
                    C0190i c0190i = this.f6199A;
                    try {
                        c0190i.m846i(c0949n0, c1836h0.m4501C());
                        c0190i.m840b();
                        c0190i.m839a();
                    } catch (Throwable th4) {
                        c0190i.m839a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                m4588a();
                throw th5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final EnumC1864o0 m4606s(C1876r1 c1876r1, Object obj) {
        C1871q c1871q;
        int i9 = c1876r1.f6239b;
        if ((i9 & 2) != 0) {
            c1876r1.f6239b = i9 | 4;
        }
        C2420b c2420b = c1876r1.f6240c;
        if (c2420b == null || !c2420b.m5756a()) {
            return EnumC1864o0.f6188g;
        }
        C2426h c2426h = this.f6207l;
        c2426h.getClass();
        C2420b c2420b2 = c1876r1.f6240c;
        if (c2420b2 != null && c2426h.m5785f(AbstractC1184v0.m3192b(c2420b2))) {
            if (c1876r1.f6241d == null) {
                return EnumC1864o0.f6188g;
            }
            EnumC1864o0 enumC1864o0M4607t = m4607t(c1876r1, c2420b, obj);
            if (enumC1864o0M4607t != EnumC1864o0.f6188g) {
                this.f6221z.m606m();
            }
            return enumC1864o0M4607t;
        }
        synchronized (this.f6205j) {
            c1871q = this.f6219x;
        }
        if (c1871q != null) {
            C1836h0 c1836h0 = c1871q.f6200B;
            if (c1836h0.f6081F && c1836h0.m4535f0(c1876r1, obj)) {
                return EnumC1864o0.f6191j;
            }
        }
        return EnumC1864o0.f6188g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC1864o0 m4607t(C1876r1 c1876r1, C2420b c2420b, Object obj) {
        synchronized (this.f6205j) {
            try {
                C1871q c1871q = this.f6219x;
                C1871q c1871q2 = null;
                if (c1871q != null) {
                    C2426h c2426h = this.f6207l;
                    int i9 = this.f6220y;
                    if (c2426h.f7955m) {
                        AbstractC1855m.m4573a("Writer is active");
                    }
                    if (i9 < 0 || i9 >= c2426h.f7950h) {
                        AbstractC1855m.m4573a("Invalid group index");
                    }
                    C2420b c2420bM3192b = AbstractC1184v0.m3192b(c2420b);
                    if (c2426h.m5785f(c2420bM3192b)) {
                        int i10 = c2426h.f7949g[(i9 * 5) + 3] + i9;
                        int i11 = c2420bM3192b.f7923a;
                        if (i9 > i11 || i11 >= i10) {
                            c1871q = null;
                        }
                        c1871q2 = c1871q;
                    }
                }
                if (c1871q2 == null) {
                    C1836h0 c1836h0 = this.f6200B;
                    if (c1836h0.f6081F && c1836h0.m4535f0(c1876r1, obj)) {
                        return EnumC1864o0.f6191j;
                    }
                    if (obj == null) {
                        this.f6215t.m2326m(c1876r1, C1823e.f6051l);
                    } else {
                        boolean z9 = obj instanceof C1892x;
                        C0943k0 c0943k0 = this.f6215t;
                        if (z9) {
                            Object objM2320g = c0943k0.m2320g(c1876r1);
                            if (objM2320g == null) {
                                AbstractC1089i.m2760c(this.f6215t, c1876r1, obj);
                            } else if (objM2320g instanceof C0945l0) {
                                C0945l0 c0945l0 = (C0945l0) objM2320g;
                                Object[] objArr = c0945l0.f2976b;
                                long[] jArr = c0945l0.f2975a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    loop0: while (true) {
                                        long j3 = jArr[i12];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                if ((255 & j3) < 128 && objArr[(i12 << 3) + i14] == C1823e.f6051l) {
                                                    break loop0;
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i13 != 8) {
                                                break;
                                            }
                                            if (i12 == length) {
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                    AbstractC1089i.m2760c(this.f6215t, c1876r1, obj);
                                }
                            } else if (objM2320g == C1823e.f6051l) {
                            }
                        } else {
                            c0943k0.m2326m(c1876r1, C1823e.f6051l);
                        }
                    }
                }
                if (c1871q2 != null) {
                    return c1871q2.m4607t(c1876r1, c2420b, obj);
                }
                this.f6202g.mo4472l(this);
                return this.f6200B.f6081F ? EnumC1864o0.f6190i : EnumC1864o0.f6189h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m4608u(Object obj) {
        Object objM2320g = this.f6208m.m2320g(obj);
        if (objM2320g == null) {
            return;
        }
        boolean z9 = objM2320g instanceof C0945l0;
        C0943k0 c0943k0 = this.f6214s;
        if (!z9) {
            C1876r1 c1876r1 = (C1876r1) objM2320g;
            if (c1876r1.m4646b(obj) == EnumC1864o0.f6191j) {
                AbstractC1089i.m2760c(c0943k0, obj, c1876r1);
                return;
            }
            return;
        }
        C0945l0 c0945l0 = (C0945l0) objM2320g;
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
                    if ((255 & j3) < 128) {
                        C1876r1 c1876r12 = (C1876r1) objArr[(i9 << 3) + i11];
                        if (c1876r12.m4646b(obj) == EnumC1864o0.f6191j) {
                            AbstractC1089i.m2760c(c0943k0, obj, c1876r12);
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
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4609v(Set set) {
        boolean z9 = set instanceof C2048d;
        C0943k0 c0943k0 = this.f6211p;
        C0943k0 c0943k02 = this.f6208m;
        if (z9) {
            C0945l0 c0945l0 = ((C2048d) set).f6894g;
            Object[] objArr = c0945l0.f2976b;
            long[] jArr = c0945l0.f2975a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                loop0: while (true) {
                    long j3 = jArr[i9];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j3) < 128) {
                                Object obj = objArr[(i9 << 3) + i11];
                                if (c0943k02.m2316c(obj) || c0943k0.m2316c(obj)) {
                                    break loop0;
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
        } else {
            for (Object obj2 : set) {
                if (c0943k02.m2316c(obj2) || c0943k0.m2316c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m4610w() {
        synchronized (this.f6205j) {
            C1853l1 c1853l1 = this.f6218w;
            boolean z9 = false;
            if (c1853l1 != null && (c1853l1.f6164h.get() != EnumC1857m1.f6180k || c1853l1.f6165i != AbstractC3879i.m8069c())) {
                AtomicReference atomicReference = c1853l1.f6164h;
                EnumC1857m1 enumC1857m1 = EnumC1857m1.f6181l;
                EnumC1857m1 enumC1857m12 = EnumC1857m1.f6179j;
                while (!atomicReference.compareAndSet(enumC1857m1, enumC1857m12) && atomicReference.get() == enumC1857m1) {
                }
                c1853l1.f6168l.f6333g.m2369a(9);
                return false;
            }
            m4601n();
            try {
                C0943k0 c0943k0 = this.f6215t;
                this.f6215t = AbstractC1089i.m2781o();
                try {
                    C1836h0 c1836h0 = this.f6200B;
                    InterfaceC1826e2 interfaceC1826e2 = this.f6217v;
                    C2705l0 c2705l0 = c1836h0.f6101e.f8739j;
                    if (!c2705l0.m6135T()) {
                        AbstractC1855m.m4573a("Expected applyChanges() to have been called");
                    }
                    if (c0943k0.f2972e > 0 || !c1836h0.f6115s.isEmpty()) {
                        c1836h0.f6091P = interfaceC1826e2;
                        try {
                            c1836h0.m4550n(c0943k0, null);
                            c1836h0.f6091P = null;
                            z9 = !c2705l0.m6135T();
                        } catch (Throwable th2) {
                            c1836h0.f6091P = null;
                            throw th2;
                        }
                    }
                    if (!z9) {
                        m4602o();
                    }
                    return z9;
                } catch (Throwable th3) {
                    this.f6215t = c0943k0;
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    if (!this.f6206k.f2994g.m2334g()) {
                        C0190i c0190i = this.f6199A;
                        try {
                            c0190i.m846i(this.f6206k, this.f6200B.m4501C());
                            c0190i.m840b();
                            c0190i.m839a();
                        } catch (Throwable th5) {
                            c0190i.m839a();
                            throw th5;
                        }
                    }
                    throw th4;
                } catch (Throwable th6) {
                    m4588a();
                    throw th6;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m4611x(C2048d c2048d) {
        Object obj;
        while (true) {
            Object obj2 = this.f6204i.get();
            if (obj2 == null || obj2.equals(AbstractC1874r.f6231a)) {
                obj = c2048d;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c2048d};
            } else {
                if (!(obj2 instanceof Object[])) {
                    C1275d.m3414h(this.f6204i, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c2048d;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f6204i;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f6205j) {
                    m4602o();
                }
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4612y(Object obj) {
        C1876r1 c1876r1M4499A;
        int i9;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        C1836h0 c1836h0 = this.f6200B;
        if (c1836h0.f6076A <= 0 && (c1876r1M4499A = c1836h0.m4499A()) != null) {
            boolean z12 = true;
            int i11 = c1876r1M4499A.f6239b | 1;
            c1876r1M4499A.f6239b = i11;
            if ((i11 & 32) == 0) {
                C0925b0 c0925b0 = c1876r1M4499A.f6243f;
                if (c0925b0 == null) {
                    c0925b0 = new C0925b0();
                    c1876r1M4499A.f6243f = c0925b0;
                }
                int i12 = c1876r1M4499A.f6242e;
                int iM2269c = c0925b0.m2269c(obj);
                if (iM2269c < 0) {
                    iM2269c = ~iM2269c;
                    i9 = -1;
                } else {
                    i9 = c0925b0.f2896c[iM2269c];
                }
                c0925b0.f2895b[iM2269c] = obj;
                c0925b0.f2896c[iM2269c] = i12;
                z9 = i9 == c1876r1M4499A.f6242e;
            }
            this.f6221z.m606m();
            if (z9) {
                return;
            }
            if (obj instanceof AbstractC4671v) {
                ((AbstractC4671v) obj).m9165f(1);
            }
            AbstractC1089i.m2760c(this.f6208m, obj, c1876r1M4499A);
            if (obj instanceof C1892x) {
                C1892x c1892x = (C1892x) obj;
                C1889w c1889wM4653h = c1892x.m4653h();
                C0943k0 c0943k0 = this.f6211p;
                AbstractC1089i.m2799x0(c0943k0, obj);
                C0925b0 c0925b02 = c1889wM4653h.f6269e;
                Object[] objArr = c0925b02.f2895b;
                long[] jArr = c0925b02.f2894a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j3 = jArr[i13];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j3 & 255) < 128) {
                                    i10 = i14;
                                    InterfaceC4670u interfaceC4670u = (InterfaceC4670u) objArr[(i13 << 3) + i16];
                                    if (interfaceC4670u instanceof AbstractC4671v) {
                                        z11 = true;
                                        ((AbstractC4671v) interfaceC4670u).m9165f(1);
                                    } else {
                                        z11 = true;
                                    }
                                    AbstractC1089i.m2760c(c0943k0, interfaceC4670u, obj);
                                } else {
                                    z11 = z12;
                                    i10 = i14;
                                }
                                j3 >>= i10;
                                i16++;
                                z12 = z11;
                                i14 = i10;
                            }
                            z10 = z12;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            z10 = z12;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        z12 = z10;
                    }
                }
                Object obj2 = c1889wM4653h.f6270f;
                C0943k0 c0943k02 = c1876r1M4499A.f6244g;
                if (c0943k02 == null) {
                    c0943k02 = new C0943k0();
                    c1876r1M4499A.f6244g = c0943k02;
                }
                c0943k02.m2326m(c1892x, obj2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4613z(Object obj) {
        synchronized (this.f6205j) {
            try {
                m4608u(obj);
                Object objM2320g = this.f6211p.m2320g(obj);
                if (objM2320g != null) {
                    if (objM2320g instanceof C0945l0) {
                        C0945l0 c0945l0 = (C0945l0) objM2320g;
                        Object[] objArr = c0945l0.f2976b;
                        long[] jArr = c0945l0.f2975a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            while (true) {
                                long j3 = jArr[i9];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j3) < 128) {
                                            m4608u((C1892x) objArr[(i9 << 3) + i11]);
                                        }
                                        j3 >>= 8;
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
                    } else {
                        m4608u((C1892x) objM2320g);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
