package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC0630z0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p057e1.C1971a0;
import p057e1.C1992t;
import p117i.AbstractC3047d1;
import p117i.AbstractC3088u0;
import p117i.C3082r0;
import p117i.C3084s0;
import p119i1.AbstractC3129h;
import p119i1.AbstractC3160w0;
import p119i1.InterfaceC3158v0;
import p150k1.InterfaceC3921n;
import p150k1.InterfaceC3927t;
import p163l.AbstractC4284d1;
import p172l8.C4700i0;
import p172l8.C4711r;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5102r;
import p215oc.C5706c;
import p228p8.InterfaceC5980j;
import p333x0.C9295a;
import p349y0.AbstractC9512g;

/* JADX INFO: renamed from: androidx.compose.runtime.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0510i0 implements InterfaceC0612w0, InterfaceC0493f4, InterfaceC0548n3, InterfaceC0593t2, InterfaceC3927t {

    /* JADX INFO: renamed from: A */
    public final C9295a f1390A;

    /* JADX INFO: renamed from: B */
    public final C9295a f1391B;

    /* JADX INFO: renamed from: C */
    public final C3082r0 f1392C;

    /* JADX INFO: renamed from: D */
    public C3082r0 f1393D;

    /* JADX INFO: renamed from: E */
    public boolean f1394E;

    /* JADX INFO: renamed from: F */
    public InterfaceC0521j4 f1395F;

    /* JADX INFO: renamed from: G */
    public C0620x2 f1396G;

    /* JADX INFO: renamed from: H */
    public C0510i0 f1397H;

    /* JADX INFO: renamed from: I */
    public int f1398I;

    /* JADX INFO: renamed from: J */
    public final C0573r0 f1399J;

    /* JADX INFO: renamed from: K */
    public final C1992t f1400K;

    /* JADX INFO: renamed from: L */
    public final C0617x f1401L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC5980j f1402M;

    /* JADX INFO: renamed from: N */
    public final boolean f1403N;

    /* JADX INFO: renamed from: O */
    public int f1404O;

    /* JADX INFO: renamed from: P */
    public InterfaceC0188p f1405P;

    /* JADX INFO: renamed from: q */
    public final AbstractC0482e0 f1406q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0474d f1407r;

    /* JADX INFO: renamed from: s */
    public final AtomicReference f1408s;

    /* JADX INFO: renamed from: t */
    public final Object f1409t;

    /* JADX INFO: renamed from: u */
    public final Set f1410u;

    /* JADX INFO: renamed from: v */
    public final C0535l4 f1411v;

    /* JADX INFO: renamed from: w */
    public final C3082r0 f1412w;

    /* JADX INFO: renamed from: x */
    public final C3084s0 f1413x;

    /* JADX INFO: renamed from: y */
    public final C3084s0 f1414y;

    /* JADX INFO: renamed from: z */
    public final C3082r0 f1415z;

    public C0510i0(AbstractC0482e0 abstractC0482e0, InterfaceC0474d interfaceC0474d, InterfaceC5980j interfaceC5980j) {
        this.f1406q = abstractC0482e0;
        this.f1407r = interfaceC0474d;
        this.f1408s = new AtomicReference(null);
        this.f1409t = new Object();
        Set setM11540l = new C3084s0(0, 1, null).m11540l();
        this.f1410u = setM11540l;
        C0535l4 c0535l4 = new C0535l4();
        if (abstractC0482e0.mo1609d()) {
            c0535l4.m1901o();
        }
        if (abstractC0482e0.mo1611f()) {
            c0535l4.m1902p();
        }
        this.f1411v = c0535l4;
        this.f1412w = AbstractC9512g.m37070d(null, 1, null);
        this.f1413x = new C3084s0(0, 1, null);
        this.f1414y = new C3084s0(0, 1, null);
        this.f1415z = AbstractC9512g.m37070d(null, 1, null);
        C9295a c9295a = new C9295a();
        this.f1390A = c9295a;
        C9295a c9295a2 = new C9295a();
        this.f1391B = c9295a2;
        this.f1392C = AbstractC9512g.m37070d(null, 1, null);
        this.f1393D = AbstractC9512g.m37070d(null, 1, null);
        C0573r0 c0573r0 = new C0573r0(null, false, abstractC0482e0, 3, null);
        this.f1399J = c0573r0;
        this.f1400K = new C1992t();
        C0617x c0617x = new C0617x(interfaceC0474d, abstractC0482e0, c0535l4, setM11540l, c9295a, c9295a2, c0573r0, this);
        abstractC0482e0.mo1623r(c0617x);
        this.f1401L = c0617x;
        this.f1402M = interfaceC5980j;
        this.f1403N = abstractC0482e0 instanceof C0608v3;
        this.f1405P = C0530l.f1456a.m1838d();
    }

    @Override // androidx.compose.runtime.InterfaceC0593t2
    /* JADX INFO: renamed from: A */
    public InterfaceC0614w2 mo1700A(InterfaceC0188p interfaceC0188p) {
        return m1707H(m1705F(), interfaceC0188p);
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: B */
    public boolean mo1701B() {
        synchronized (this.f1409t) {
            C0620x2 c0620x2 = this.f1396G;
            if (c0620x2 != null && !c0620x2.m2430f()) {
                c0620x2.m2432h();
                c0620x2.m2428d().m2459l();
                return false;
            }
            m1709J();
            try {
                try {
                    boolean zM2380c1 = this.f1401L.m2380c1(m1723X(), this.f1395F);
                    if (!zM2380c1) {
                        m1710K();
                    }
                    return zM2380c1;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (!this.f1410u.isEmpty()) {
                        C1992t c1992t = this.f1400K;
                        try {
                            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                            c1992t.m7188j();
                            c1992t.m7187i();
                        } catch (Throwable th2) {
                            c1992t.m7187i();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    mo1744x();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: C */
    public void mo1702C() {
        synchronized (this.f1409t) {
            try {
                for (Object obj : this.f1411v.m1908v()) {
                    C0534l3 c0534l3 = obj instanceof C0534l3 ? (C0534l3) obj : null;
                    if (c0534l3 != null) {
                        c0534l3.invalidate();
                    }
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: D */
    public final void m1703D(C9295a c9295a) {
        InterfaceC0474d interfaceC0474dM2428d;
        C1992t c1992tM2429e;
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        boolean zM11271d;
        long[] jArr3;
        this.f1400K.m7195r(this.f1410u, this.f1401L.m2363K0());
        try {
            if (c9295a.m36143c()) {
                try {
                    if (this.f1391B.m36143c() && this.f1396G == null) {
                        this.f1400K.m7188j();
                    }
                } finally {
                }
            } else {
                C0620x2 c0620x2 = this.f1396G;
                if (c0620x2 == null || (interfaceC0474dM2428d = c0620x2.m2428d()) == null) {
                    interfaceC0474dM2428d = this.f1407r;
                }
                C0620x2 c0620x22 = this.f1396G;
                String str = AbstractC1061t.m3842c(interfaceC0474dM2428d, c0620x22 != null ? c0620x22.m2428d() : null) ? "Compose:recordChanges" : "Compose:applyChanges";
                C1971a0 c1971a0 = C1971a0.f5486a;
                Object objM7128a = c1971a0.m7128a(str);
                try {
                    C0620x2 c0620x23 = this.f1396G;
                    if (c0620x23 == null || (c1992tM2429e = c0620x23.m2429e()) == null) {
                        c1992tM2429e = this.f1400K;
                    }
                    interfaceC0474dM2428d.m1583f();
                    C0556o4 c0556o4M1892C = this.f1411v.m1892C();
                    int i11 = 0;
                    try {
                        c9295a.m36142b(interfaceC0474dM2428d, c0556o4M1892C, c1992tM2429e, this.f1401L.m2363K0());
                        C4700i0 c4700i0 = C4700i0.f13910a;
                        c0556o4M1892C.m2028K(true);
                        interfaceC0474dM2428d.mo1587k();
                        c1971a0.m7129b(objM7128a);
                        this.f1400K.m7191m();
                        this.f1400K.m7192n();
                        if (this.f1394E) {
                            objM7128a = c1971a0.m7128a("Compose:unobserve");
                            try {
                                this.f1394E = false;
                                C3082r0 c3082r0 = this.f1412w;
                                long[] jArr4 = c3082r0.f8070a;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j12 = jArr4[i12];
                                        char c11 = 7;
                                        long j13 = -9187201950435737472L;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = i11;
                                            while (i15 < i14) {
                                                if ((j12 & 255) < 128) {
                                                    int i16 = (i12 << 3) + i15;
                                                    c10 = c11;
                                                    Object obj = c3082r0.f8071b[i16];
                                                    Object obj2 = c3082r0.f8072c[i16];
                                                    j11 = j13;
                                                    if (obj2 instanceof C3084s0) {
                                                        C3084s0 c3084s0 = (C3084s0) obj2;
                                                        Object[] objArr = c3084s0.f8093b;
                                                        long[] jArr5 = c3084s0.f8092a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j10 = j12;
                                                            int i17 = i13;
                                                            int i18 = 0;
                                                            while (true) {
                                                                long j14 = jArr5[i18];
                                                                Object[] objArr2 = objArr;
                                                                long[] jArr6 = jArr5;
                                                                if ((((~j14) << c10) & j14 & j11) != j11) {
                                                                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                    int i20 = 0;
                                                                    while (i20 < i19) {
                                                                        if ((j14 & 255) < 128) {
                                                                            jArr3 = jArr4;
                                                                            int i21 = (i18 << 3) + i20;
                                                                            if (!((C0534l3) objArr2[i21]).m1883u()) {
                                                                                c3084s0.m11533A(i21);
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr4;
                                                                        }
                                                                        j14 >>= i17;
                                                                        i20++;
                                                                        jArr4 = jArr3;
                                                                    }
                                                                    jArr2 = jArr4;
                                                                    if (i19 != i17) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr4;
                                                                }
                                                                if (i18 == length2) {
                                                                    break;
                                                                }
                                                                i18++;
                                                                objArr = objArr2;
                                                                jArr5 = jArr6;
                                                                jArr4 = jArr2;
                                                                i17 = 8;
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j10 = j12;
                                                        }
                                                        zM11271d = c3084s0.m11271d();
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j10 = j12;
                                                        obj2.getClass();
                                                        zM11271d = !((C0534l3) obj2).m1883u();
                                                    }
                                                    if (zM11271d) {
                                                        c3082r0.m11527v(i16);
                                                    }
                                                    i10 = 8;
                                                } else {
                                                    jArr2 = jArr4;
                                                    j10 = j12;
                                                    c10 = c11;
                                                    j11 = j13;
                                                    i10 = i13;
                                                }
                                                j12 = j10 >> i10;
                                                i15++;
                                                i13 = i10;
                                                c11 = c10;
                                                j13 = j11;
                                                jArr4 = jArr2;
                                            }
                                            jArr = jArr4;
                                            if (i14 != i13) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                        jArr4 = jArr;
                                        i11 = 0;
                                    }
                                }
                                m1704E();
                                C4700i0 c4700i02 = C4700i0.f13910a;
                                C1971a0.f5486a.m7129b(objM7128a);
                            } finally {
                                C1971a0.f5486a.m7129b(objM7128a);
                            }
                        }
                        try {
                            if (this.f1391B.m36143c() && this.f1396G == null) {
                                this.f1400K.m7188j();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        c0556o4M1892C.m2028K(false);
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (this.f1391B.m36143c() && this.f1396G == null) {
                    this.f1400K.m7188j();
                }
                throw th3;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1704E() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i10;
        char c11;
        long j14;
        long j15;
        int i11;
        boolean zM11271d;
        long[] jArr3;
        int i12;
        int i13;
        C3082r0 c3082r0 = this.f1415z;
        long[] jArr4 = c3082r0.f8070a;
        int length = jArr4.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr4[i15];
                j11 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i18 = (i15 << 3) + i17;
                            j14 = j16;
                            Object obj = c3082r0.f8071b[i18];
                            Object obj2 = c3082r0.f8072c[i18];
                            if (obj2 instanceof C3084s0) {
                                C3084s0 c3084s0 = (C3084s0) obj2;
                                Object[] objArr = c3084s0.f8093b;
                                long[] jArr5 = c3084s0.f8092a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j15 = j17;
                                    int i19 = 0;
                                    int i20 = i14;
                                    while (true) {
                                        int i21 = length2;
                                        long j19 = jArr5[i19];
                                        j13 = j18;
                                        if ((((~j19) << c11) & j19 & j14) != j14) {
                                            int i22 = 8 - ((~(i19 - i21)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j19 & 255) < j15) {
                                                    jArr3 = jArr4;
                                                    int i24 = (i19 << 3) + i23;
                                                    i12 = i23;
                                                    i13 = i17;
                                                    if (!AbstractC9512g.m37071e(this.f1412w, (InterfaceC0630z0) objArr[i24])) {
                                                        c3084s0.m11533A(i24);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i12 = i23;
                                                    i13 = i17;
                                                }
                                                j19 >>= i20;
                                                i23 = i12 + 1;
                                                i17 = i13;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i10 = i17;
                                            if (i22 != i20) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i10 = i17;
                                        }
                                        length2 = i21;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        j18 = j13;
                                        i17 = i10;
                                        jArr4 = jArr2;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j13 = j18;
                                    i10 = i17;
                                    j15 = j17;
                                }
                                zM11271d = c3084s0.m11271d();
                            } else {
                                jArr2 = jArr4;
                                j13 = j18;
                                i10 = i17;
                                j15 = j17;
                                obj2.getClass();
                                zM11271d = !AbstractC9512g.m37071e(this.f1412w, (InterfaceC0630z0) obj2);
                            }
                            if (zM11271d) {
                                c3082r0.m11527v(i18);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            j13 = j18;
                            i10 = i17;
                            c11 = c12;
                            j14 = j16;
                            j15 = j17;
                            i11 = i14;
                        }
                        j18 = j13 >> i11;
                        i17 = i10 + 1;
                        i14 = i11;
                        c12 = c11;
                        j16 = j14;
                        j17 = j15;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c12 = c10;
                j16 = j10;
                j17 = j12;
                jArr4 = jArr;
                i14 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        if (!this.f1414y.m11272e()) {
            return;
        }
        C3084s0 c3084s02 = this.f1414y;
        Object[] objArr2 = c3084s02.f8093b;
        long[] jArr6 = c3084s02.f8092a;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j20 = jArr6[i25];
            if ((((~j20) << c10) & j20 & j10) != j10) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j20 & j11) < j12) {
                        int i28 = (i25 << 3) + i27;
                        if (!((C0534l3) objArr2[i28]).m1885w()) {
                            c3084s02.m11533A(i28);
                        }
                    }
                    j20 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m1705F() {
        boolean z10;
        synchronized (this.f1409t) {
            z10 = true;
            if (this.f1404O != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1404O = 0;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: G */
    public final void m1706G(InterfaceC0188p interfaceC0188p) {
        this.f1405P = interfaceC0188p;
        this.f1406q.mo1606a(this, interfaceC0188p);
    }

    /* JADX INFO: renamed from: H */
    public final InterfaceC0614w2 m1707H(boolean z10, InterfaceC0188p interfaceC0188p) {
        if (!(this.f1396G == null)) {
            AbstractC0464b3.m1536b("A pausable composition is in progress");
        }
        C0620x2 c0620x2 = new C0620x2(this, this.f1406q, this.f1401L, this.f1410u, interfaceC0188p, z10, this.f1407r, this.f1409t);
        this.f1396G = c0620x2;
        return c0620x2;
    }

    /* JADX INFO: renamed from: I */
    public final void m1708I(InterfaceC0188p interfaceC0188p) {
        this.f1401L.m2416x1();
        m1706G(interfaceC0188p);
        this.f1401L.m2415x0();
    }

    /* JADX INFO: renamed from: J */
    public final void m1709J() {
        Object andSet = this.f1408s.getAndSet(AbstractC0517j0.f1425a);
        if (andSet != null) {
            if (AbstractC1061t.m3842c(andSet, AbstractC0517j0.f1425a)) {
                AbstractC0468c0.m1549c("pending composition has not been applied");
                C5706c.m23089a();
                return;
            }
            if (andSet instanceof Set) {
                m1734m((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0468c0.m1549c("corrupt pendingModifications drain: " + this.f1408s);
                C5706c.m23089a();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m1734m(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m1710K() {
        Object andSet = this.f1408s.getAndSet(null);
        if (AbstractC1061t.m3842c(andSet, AbstractC0517j0.f1425a)) {
            return;
        }
        if (andSet instanceof Set) {
            m1734m((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m1734m(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f1396G == null) {
                AbstractC0468c0.m1548b("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC0468c0.m1549c("corrupt pendingModifications drain: " + this.f1408s);
            C5706c.m23089a();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1711L() {
        Object andSet = this.f1408s.getAndSet(AbstractC5068b1.m20483e());
        if (AbstractC1061t.m3842c(andSet, AbstractC0517j0.f1425a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m1734m((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0468c0.m1549c("corrupt pendingModifications drain: " + this.f1408s);
            C5706c.m23089a();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m1734m(set, false);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1712M() {
        int i10 = this.f1404O;
        if (!(i10 == 0)) {
            AbstractC0464b3.m1536b(i10 != 1 ? i10 != 2 ? i10 != 3 ? _UrlKt.FRAGMENT_ENCODE_SET : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f1396G == null) {
            return;
        }
        AbstractC0464b3.m1536b("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: N */
    public final boolean m1713N() {
        return this.f1401L.m2355G0();
    }

    /* JADX INFO: renamed from: O */
    public final C0617x m1714O() {
        return this.f1401L;
    }

    /* JADX INFO: renamed from: P */
    public final C0573r0 m1715P() {
        return this.f1399J;
    }

    /* JADX INFO: renamed from: Q */
    public final C0535l4 m1716Q() {
        return this.f1411v;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[Catch: all -> 0x001e, EDGE_INSN: B:65:0x00a3->B:50:0x00a3 BREAK  A[LOOP:0: B:32:0x005a->B:46:0x009b], EDGE_INSN: B:66:0x00a3->B:50:0x00a3 BREAK  A[LOOP:0: B:32:0x005a->B:46:0x009b], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:24:0x003e, B:25:0x0044, B:27:0x004a, B:29:0x004e, B:32:0x005a, B:34:0x006a, B:36:0x0076, B:38:0x0080, B:42:0x008f, B:46:0x009b, B:47:0x009e, B:50:0x00a3), top: B:63:0x000b }] */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.EnumC0567q1 m1717R(androidx.compose.runtime.C0534l3 r21, androidx.compose.runtime.C0460b r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r1.f1409t
            monitor-enter(r4)
            androidx.compose.runtime.i0 r5 = r1.f1397H     // Catch: java.lang.Throwable -> L1e
            r6 = 0
            if (r5 == 0) goto L21
            androidx.compose.runtime.l4 r7 = r1.f1411v     // Catch: java.lang.Throwable -> L1e
            int r8 = r1.f1398I     // Catch: java.lang.Throwable -> L1e
            boolean r7 = r7.m1890A(r8, r2)     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L1b
            goto L1c
        L1b:
            r5 = r6
        L1c:
            r6 = r5
            goto L21
        L1e:
            r0 = move-exception
            goto Lc1
        L21:
            if (r6 != 0) goto La8
            boolean r5 = r1.m1724Y(r0, r3)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L2d
            androidx.compose.runtime.q1 r0 = androidx.compose.runtime.EnumC0567q1.f1566t     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r4)
            return r0
        L2d:
            if (r3 != 0) goto L38
            i.r0 r5 = r1.f1393D     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.h4 r7 = androidx.compose.runtime.C0507h4.f1387a     // Catch: java.lang.Throwable -> L1e
            p349y0.AbstractC9512g.m37075i(r5, r0, r7)     // Catch: java.lang.Throwable -> L1e
            goto La8
        L38:
            boolean r5 = r3 instanceof androidx.compose.runtime.InterfaceC0630z0     // Catch: java.lang.Throwable -> L1e
            i.r0 r7 = r1.f1393D
            if (r5 != 0) goto L44
            androidx.compose.runtime.h4 r5 = androidx.compose.runtime.C0507h4.f1387a     // Catch: java.lang.Throwable -> L1e
            p349y0.AbstractC9512g.m37075i(r7, r0, r5)     // Catch: java.lang.Throwable -> L1e
            goto La8
        L44:
            java.lang.Object r5 = r7.m11238e(r0)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto La3
            boolean r7 = r5 instanceof p117i.C3084s0     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L9e
            i.s0 r5 = (p117i.C3084s0) r5     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r7 = r5.f8093b     // Catch: java.lang.Throwable -> L1e
            long[] r5 = r5.f8092a     // Catch: java.lang.Throwable -> L1e
            int r8 = r5.length     // Catch: java.lang.Throwable -> L1e
            int r8 = r8 + (-2)
            if (r8 < 0) goto La3
            r10 = 0
        L5a:
            r11 = r5[r10]     // Catch: java.lang.Throwable -> L1e
            long r13 = ~r11     // Catch: java.lang.Throwable -> L1e
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L99
            int r13 = r10 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L74:
            if (r15 >= r13) goto L96
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L8d
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]     // Catch: java.lang.Throwable -> L1e
            r16 = r14
            androidx.compose.runtime.h4 r14 = androidx.compose.runtime.C0507h4.f1387a     // Catch: java.lang.Throwable -> L1e
            if (r9 != r14) goto L8f
            goto La8
        L8d:
            r16 = r14
        L8f:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L74
        L96:
            r9 = r14
            if (r13 != r9) goto La3
        L99:
            if (r10 == r8) goto La3
            int r10 = r10 + 1
            goto L5a
        L9e:
            androidx.compose.runtime.h4 r7 = androidx.compose.runtime.C0507h4.f1387a     // Catch: java.lang.Throwable -> L1e
            if (r5 != r7) goto La3
            goto La8
        La3:
            i.r0 r5 = r1.f1393D     // Catch: java.lang.Throwable -> L1e
            p349y0.AbstractC9512g.m37067a(r5, r0, r3)     // Catch: java.lang.Throwable -> L1e
        La8:
            monitor-exit(r4)
            if (r6 == 0) goto Lb0
            androidx.compose.runtime.q1 r0 = r6.m1717R(r0, r2, r3)
            return r0
        Lb0:
            androidx.compose.runtime.e0 r0 = r1.f1406q
            r0.mo1619n(r1)
            boolean r0 = r1.mo1738q()
            if (r0 == 0) goto Lbe
            androidx.compose.runtime.q1 r0 = androidx.compose.runtime.EnumC0567q1.f1565s
            return r0
        Lbe:
            androidx.compose.runtime.q1 r0 = androidx.compose.runtime.EnumC0567q1.f1564r
            return r0
        Lc1:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0510i0.m1717R(androidx.compose.runtime.l3, androidx.compose.runtime.b, java.lang.Object):androidx.compose.runtime.q1");
    }

    /* JADX INFO: renamed from: S */
    public final void m1718S(Object obj) {
        Object objM11238e = this.f1412w.m11238e(obj);
        if (objM11238e == null) {
            return;
        }
        if (!(objM11238e instanceof C3084s0)) {
            C0534l3 c0534l3 = (C0534l3) objM11238e;
            if (c0534l3.m1884v(obj) == EnumC0567q1.f1566t) {
                AbstractC9512g.m37067a(this.f1392C, obj, c0534l3);
                return;
            }
            return;
        }
        C3084s0 c3084s0 = (C3084s0) objM11238e;
        Object[] objArr = c3084s0.f8093b;
        long[] jArr = c3084s0.f8092a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C0534l3 c0534l32 = (C0534l3) objArr[(i10 << 3) + i12];
                        if (c0534l32.m1884v(obj) == EnumC0567q1.f1566t) {
                            AbstractC9512g.m37067a(this.f1392C, obj, c0534l32);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
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

    /* JADX INFO: renamed from: T */
    public final InterfaceC3921n m1719T() {
        this.f1399J.m2192a();
        return null;
    }

    /* JADX INFO: renamed from: U */
    public final void m1720U(AbstractC3047d1 abstractC3047d1) {
        this.f1396G = null;
        if (abstractC3047d1 != null) {
            this.f1400K.m7194q(abstractC3047d1);
            this.f1404O = 2;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m1721V(InterfaceC0630z0 interfaceC0630z0) {
        if (AbstractC9512g.m37071e(this.f1412w, interfaceC0630z0)) {
            return;
        }
        AbstractC9512g.m37074h(this.f1415z, interfaceC0630z0);
    }

    /* JADX INFO: renamed from: W */
    public final void m1722W(Object obj, C0534l3 c0534l3) {
        AbstractC9512g.m37073g(this.f1412w, obj, c0534l3);
    }

    /* JADX INFO: renamed from: X */
    public final C3082r0 m1723X() {
        C3082r0 c3082r0 = this.f1393D;
        this.f1393D = AbstractC9512g.m37070d(null, 1, null);
        return c3082r0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m1724Y(C0534l3 c0534l3, Object obj) {
        return mo1738q() && this.f1401L.m2420z1(c0534l3, obj);
    }

    /* JADX INFO: renamed from: Z */
    public final void m1725Z() {
        synchronized (this.f1409t) {
            m1711L();
            C3082r0 c3082r0M1723X = m1723X();
            try {
                this.f1401L.m2346B1(c3082r0M1723X);
                C4700i0 c4700i0 = C4700i0.f13910a;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0475d0
    /* JADX INFO: renamed from: a */
    public void mo1588a() {
        synchronized (this.f1409t) {
            try {
                if (this.f1401L.m2371U0()) {
                    AbstractC0464b3.m1536b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f1404O != 3) {
                    this.f1404O = 3;
                    this.f1405P = C0530l.f1456a.m1837c();
                    C9295a c9295aM2361J0 = this.f1401L.m2361J0();
                    if (c9295aM2361J0 != null) {
                        m1703D(c9295aM2361J0);
                    }
                    boolean z10 = this.f1411v.m1907u() > 0;
                    if (z10 || !this.f1410u.isEmpty()) {
                        C1992t c1992t = this.f1400K;
                        try {
                            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                            if (z10) {
                                this.f1407r.m1583f();
                                C0556o4 c0556o4M1892C = this.f1411v.m1892C();
                                try {
                                    AbstractC0468c0.m1557k(c0556o4M1892C, this.f1400K);
                                    C4700i0 c4700i0 = C4700i0.f13910a;
                                    c0556o4M1892C.m2028K(true);
                                    this.f1407r.clear();
                                    this.f1407r.mo1587k();
                                    c1992t.m7191m();
                                } catch (Throwable th) {
                                    c0556o4M1892C.m2028K(false);
                                    throw th;
                                }
                            }
                            c1992t.m7188j();
                            c1992t.m7187i();
                        } catch (Throwable th2) {
                            c1992t.m7187i();
                            throw th2;
                        }
                    }
                    this.f1401L.m2404r0();
                }
                C4700i0 c4700i02 = C4700i0.f13910a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f1406q.mo1629x(this);
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0, androidx.compose.runtime.InterfaceC0548n3
    /* JADX INFO: renamed from: b */
    public void mo1726b(Object obj) {
        C0534l3 c0534l3M2359I0;
        int i10;
        int i11;
        int i12;
        if (m1713N() || (c0534l3M2359I0 = this.f1401L.m2359I0()) == null) {
            return;
        }
        int i13 = 1;
        c0534l3M2359I0.m1864O(true);
        boolean zM1888z = c0534l3M2359I0.m1888z(obj);
        m1719T();
        if (zM1888z) {
            return;
        }
        if (obj instanceof AbstractC3160w0) {
            ((AbstractC3160w0) obj).m11935k(AbstractC3129h.m11748a(1));
        }
        AbstractC9512g.m37067a(this.f1412w, obj, c0534l3M2359I0);
        if (obj instanceof InterfaceC0630z0) {
            InterfaceC0630z0 interfaceC0630z0 = (InterfaceC0630z0) obj;
            InterfaceC0630z0.a aVarMo2438u = interfaceC0630z0.mo2438u();
            AbstractC9512g.m37074h(this.f1415z, obj);
            AbstractC3088u0 abstractC3088u0Mo2444b = aVarMo2438u.mo2444b();
            Object[] objArr = abstractC3088u0Mo2444b.f8223b;
            long[] jArr = abstractC3088u0Mo2444b.f8222a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr[i14];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j10 & 255) < 128) {
                                i11 = i13;
                                InterfaceC3158v0 interfaceC3158v0 = (InterfaceC3158v0) objArr[(i14 << 3) + i17];
                                if (interfaceC3158v0 instanceof AbstractC3160w0) {
                                    i12 = i15;
                                    ((AbstractC3160w0) interfaceC3158v0).m11935k(AbstractC3129h.m11748a(i11));
                                } else {
                                    i12 = i15;
                                }
                                AbstractC9512g.m37067a(this.f1415z, interfaceC3158v0, obj);
                            } else {
                                i11 = i13;
                                i12 = i15;
                            }
                            j10 >>= i12;
                            i17++;
                            i13 = i11;
                            i15 = i12;
                        }
                        i10 = i13;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        i10 = i13;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    i13 = i10;
                }
            }
            c0534l3M2359I0.m1887y(interfaceC0630z0, aVarMo2438u.mo2443a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1727c(java.util.Set r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof p349y0.C9510e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            y0.e r15 = (p349y0.C9510e) r15
            i.d1 r15 = r15.m37063a()
            java.lang.Object[] r0 = r15.f8093b
            long[] r15 = r15.f8092a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            i.r0 r11 = r14.f1412w
            boolean r11 = p349y0.AbstractC9512g.m37071e(r11, r10)
            if (r11 != 0) goto L50
            i.r0 r11 = r14.f1415z
            boolean r10 = p349y0.AbstractC9512g.m37071e(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            i.r0 r3 = r14.f1412w
            boolean r3 = p349y0.AbstractC9512g.m37071e(r3, r0)
            if (r3 != 0) goto L7c
            i.r0 r3 = r14.f1415z
            boolean r0 = p349y0.AbstractC9512g.m37071e(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0510i0.mo1727c(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: d */
    public void mo1728d(InterfaceC0173a interfaceC0173a) {
        this.f1401L.m2377a1(interfaceC0173a);
    }

    @Override // androidx.compose.runtime.InterfaceC0493f4
    public void deactivate() {
        synchronized (this.f1409t) {
            try {
                if (!(this.f1396G == null)) {
                    AbstractC0464b3.m1536b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z10 = this.f1411v.m1907u() > 0;
                if (z10 || !this.f1410u.isEmpty()) {
                    C1971a0 c1971a0 = C1971a0.f5486a;
                    Object objM7128a = c1971a0.m7128a("Compose:deactivate");
                    try {
                        C1992t c1992t = this.f1400K;
                        try {
                            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                            if (z10) {
                                this.f1407r.m1583f();
                                C0556o4 c0556o4M1892C = this.f1411v.m1892C();
                                try {
                                    AbstractC0454a0.m1502r(c0556o4M1892C, this.f1400K);
                                    C4700i0 c4700i0 = C4700i0.f13910a;
                                    c0556o4M1892C.m2028K(true);
                                    this.f1407r.mo1587k();
                                    c1992t.m7191m();
                                } catch (Throwable th) {
                                    c0556o4M1892C.m2028K(false);
                                    throw th;
                                }
                            }
                            c1992t.m7188j();
                            c1992t.m7187i();
                            C4700i0 c4700i02 = C4700i0.f13910a;
                            c1971a0.m7129b(objM7128a);
                        } catch (Throwable th2) {
                            c1992t.m7187i();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        C1971a0.f5486a.m7129b(objM7128a);
                        throw th3;
                    }
                }
                AbstractC9512g.m37068b(this.f1412w);
                AbstractC9512g.m37068b(this.f1415z);
                AbstractC9512g.m37068b(this.f1393D);
                this.f1390A.m36141a();
                this.f1391B.m36141a();
                this.f1401L.m2402q0();
                this.f1404O = 1;
                C4700i0 c4700i03 = C4700i0.f13910a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0548n3
    /* JADX INFO: renamed from: e */
    public EnumC0567q1 mo1729e(C0534l3 c0534l3, Object obj) {
        C0510i0 c0510i0;
        if (c0534l3.m1872j()) {
            c0534l3.m1855F(true);
        }
        C0460b c0460bM1870h = c0534l3.m1870h();
        if (c0460bM1870h == null || !c0460bM1870h.m1528b()) {
            return EnumC0567q1.f1563q;
        }
        if (!this.f1411v.m1893D(c0460bM1870h)) {
            synchronized (this.f1409t) {
                c0510i0 = this.f1397H;
            }
            return (c0510i0 == null || !c0510i0.m1724Y(c0534l3, obj)) ? EnumC0567q1.f1563q : EnumC0567q1.f1566t;
        }
        if (!c0534l3.m1871i()) {
            return EnumC0567q1.f1563q;
        }
        EnumC0567q1 enumC0567q1M1717R = m1717R(c0534l3, c0460bM1870h, obj);
        if (enumC0567q1M1717R != EnumC0567q1.f1563q) {
            m1719T();
        }
        return enumC0567q1M1717R;
    }

    @Override // androidx.compose.runtime.InterfaceC0548n3
    /* JADX INFO: renamed from: f */
    public void mo1730f(C0534l3 c0534l3) {
        this.f1394E = true;
        m1719T();
    }

    @Override // androidx.compose.runtime.InterfaceC0475d0
    /* JADX INFO: renamed from: g */
    public void mo1589g(InterfaceC0188p interfaceC0188p) {
        boolean zM1705F = m1705F();
        m1712M();
        if (zM1705F) {
            m1708I(interfaceC0188p);
        } else {
            m1706G(interfaceC0188p);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: i */
    public void mo1731i() {
        synchronized (this.f1409t) {
            try {
                if (this.f1391B.m36144d()) {
                    m1703D(this.f1391B);
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                try {
                    if (!this.f1410u.isEmpty()) {
                        C1992t c1992t = this.f1400K;
                        try {
                            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                            c1992t.m7188j();
                            c1992t.m7187i();
                        } catch (Throwable th2) {
                            c1992t.m7187i();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    mo1744x();
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1732j(Object obj, boolean z10) {
        Object objM11238e = this.f1412w.m11238e(obj);
        if (objM11238e == null) {
            return;
        }
        if (!(objM11238e instanceof C3084s0)) {
            C0534l3 c0534l3 = (C0534l3) objM11238e;
            if (AbstractC9512g.m37073g(this.f1392C, obj, c0534l3) || c0534l3.m1884v(obj) == EnumC0567q1.f1563q) {
                return;
            }
            if (!c0534l3.m1885w() || z10) {
                this.f1413x.m11536h(c0534l3);
                return;
            } else {
                this.f1414y.m11536h(c0534l3);
                return;
            }
        }
        C3084s0 c3084s0 = (C3084s0) objM11238e;
        Object[] objArr = c3084s0.f8093b;
        long[] jArr = c3084s0.f8092a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C0534l3 c0534l32 = (C0534l3) objArr[(i10 << 3) + i12];
                        if (!AbstractC9512g.m37073g(this.f1392C, obj, c0534l32) && c0534l32.m1884v(obj) != EnumC0567q1.f1563q) {
                            if (!c0534l32.m1885w() || z10) {
                                this.f1413x.m11536h(c0534l32);
                            } else {
                                this.f1414y.m11536h(c0534l32);
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
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

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: k */
    public void mo1733k(InterfaceC0188p interfaceC0188p) {
        try {
            synchronized (this.f1409t) {
                m1709J();
                try {
                    this.f1401L.m2391k0(m1723X(), interfaceC0188p, this.f1395F);
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f1410u.isEmpty()) {
                    C1992t c1992t = this.f1400K;
                    try {
                        c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                        c1992t.m7188j();
                        c1992t.m7187i();
                    } catch (Throwable th2) {
                        c1992t.m7187i();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                mo1744x();
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0475d0
    /* JADX INFO: renamed from: l */
    public boolean mo1590l() {
        return this.f1404O == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1734m(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0510i0.m1734m(java.util.Set, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: n */
    public void mo1735n(Set set) {
        Object obj;
        Object objM20644D;
        do {
            obj = this.f1408s.get();
            if (obj == null || AbstractC1061t.m3842c(obj, AbstractC0517j0.f1425a)) {
                objM20644D = set;
            } else if (obj instanceof Set) {
                objM20644D = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    C0503h0.m1691a("corrupt pendingModifications: ", this.f1408s);
                    return;
                }
                objM20644D = AbstractC5102r.m20644D((Set[]) obj, set);
            }
        } while (!AbstractC4284d1.m16830a(this.f1408s, obj, objM20644D));
        if (obj == null) {
            synchronized (this.f1409t) {
                m1710K();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: o */
    public void mo1736o() {
        synchronized (this.f1409t) {
            try {
                m1703D(this.f1390A);
                m1710K();
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                try {
                    if (!this.f1410u.isEmpty()) {
                        C1992t c1992t = this.f1400K;
                        try {
                            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                            c1992t.m7188j();
                            c1992t.m7187i();
                        } catch (Throwable th2) {
                            c1992t.m7187i();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    mo1744x();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0593t2
    /* JADX INFO: renamed from: p */
    public InterfaceC0614w2 mo1737p(InterfaceC0188p interfaceC0188p) {
        m1705F();
        m1712M();
        return m1707H(true, interfaceC0188p);
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: q */
    public boolean mo1738q() {
        return this.f1401L.m2371U0();
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: r */
    public void mo1739r(AbstractC0470c2 abstractC0470c2) {
        C1992t c1992t = this.f1400K;
        try {
            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
            C0556o4 c0556o4M1892C = abstractC0470c2.m1560a().m1892C();
            try {
                AbstractC0468c0.m1557k(c0556o4M1892C, this.f1400K);
                C4700i0 c4700i0 = C4700i0.f13910a;
                c0556o4M1892C.m2028K(true);
                c1992t.m7191m();
            } catch (Throwable th) {
                c0556o4M1892C.m2028K(false);
                throw th;
            }
        } finally {
            c1992t.m7187i();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: s */
    public void mo1740s(List list) {
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!AbstractC1061t.m3842c(((C0477d2) ((C4711r) list.get(i10)).m18795e()).m1593b(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            AbstractC0468c0.m1548b("Check failed");
        }
        try {
            this.f1401L.m2368R0(list);
            C4700i0 c4700i0 = C4700i0.f13910a;
        } catch (Throwable th) {
            try {
                if (!this.f1410u.isEmpty()) {
                    C1992t c1992t = this.f1400K;
                    try {
                        c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                        c1992t.m7188j();
                        c1992t.m7187i();
                    } catch (Throwable th2) {
                        c1992t.m7187i();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                mo1744x();
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1741t(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f1409t
            monitor-enter(r0)
            r14.m1718S(r15)     // Catch: java.lang.Throwable -> L4f
            i.r0 r1 = r14.f1415z     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.m11238e(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof p117i.C3084s0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            i.s0 r15 = (p117i.C3084s0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f8093b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f8092a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.z0 r10 = (androidx.compose.runtime.InterfaceC0630z0) r10     // Catch: java.lang.Throwable -> L4f
            r14.m1718S(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L65
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.z0 r15 = (androidx.compose.runtime.InterfaceC0630z0) r15     // Catch: java.lang.Throwable -> L4f
            r14.m1718S(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            l8.i0 r15 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L65:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0510i0.mo1741t(java.lang.Object):void");
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: u */
    public Object mo1742u(InterfaceC0612w0 interfaceC0612w0, int i10, InterfaceC0173a interfaceC0173a) {
        if (interfaceC0612w0 == null || AbstractC1061t.m3842c(interfaceC0612w0, this) || i10 < 0) {
            return interfaceC0173a.invoke();
        }
        this.f1397H = (C0510i0) interfaceC0612w0;
        this.f1398I = i10;
        try {
            return interfaceC0173a.invoke();
        } finally {
            this.f1397H = null;
            this.f1398I = 0;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: v */
    public InterfaceC0521j4 mo1743v(InterfaceC0521j4 interfaceC0521j4) {
        InterfaceC0521j4 interfaceC0521j42 = this.f1395F;
        this.f1395F = interfaceC0521j4;
        return interfaceC0521j42;
    }

    @Override // androidx.compose.runtime.InterfaceC0475d0
    /* JADX INFO: renamed from: w */
    public boolean mo1591w() {
        boolean z10;
        synchronized (this.f1409t) {
            z10 = AbstractC9512g.m37072f(this.f1393D) > 0;
        }
        return z10;
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: x */
    public void mo1744x() {
        this.f1408s.set(null);
        this.f1390A.m36141a();
        this.f1391B.m36141a();
        if (this.f1410u.isEmpty()) {
            return;
        }
        C1992t c1992t = this.f1400K;
        try {
            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
            c1992t.m7188j();
        } finally {
            c1992t.m7187i();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0612w0
    /* JADX INFO: renamed from: y */
    public void mo1745y() {
        C1992t c1992t;
        synchronized (this.f1409t) {
            try {
                this.f1401L.m2385h0();
                if (!this.f1410u.isEmpty()) {
                    c1992t = this.f1400K;
                    try {
                        c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                        c1992t.m7188j();
                        c1992t.m7187i();
                    } finally {
                    }
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                try {
                    if (!this.f1410u.isEmpty()) {
                        c1992t = this.f1400K;
                        try {
                            c1992t.m7195r(this.f1410u, this.f1401L.m2363K0());
                            c1992t.m7188j();
                            c1992t.m7187i();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    mo1744x();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0493f4
    /* JADX INFO: renamed from: z */
    public void mo1667z(InterfaceC0188p interfaceC0188p) {
        m1705F();
        m1712M();
        m1708I(interfaceC0188p);
    }

    public /* synthetic */ C0510i0(AbstractC0482e0 abstractC0482e0, InterfaceC0474d interfaceC0474d, InterfaceC5980j interfaceC5980j, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC0482e0, interfaceC0474d, (i10 & 4) != 0 ? null : interfaceC5980j);
    }
}
