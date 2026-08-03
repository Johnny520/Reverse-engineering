package p339x1;

import gg.AbstractC1416l;
import java.util.List;
import okio.C3193a;
import p016b1.C0166f;
import p069f.C0929d0;
import p085fg.InterfaceC1231l;
import p118i1.C1902b;
import p131j0.C2046b;
import p292u1.AbstractC4229a;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.C4240j;
import p293u2.C4242l;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5652v0 extends AbstractC4377b1 implements InterfaceC4409m0, InterfaceC5581a, InterfaceC5661y0 {

    /* JADX INFO: renamed from: A */
    public boolean f23011A;

    /* JADX INFO: renamed from: B */
    public boolean f23012B;

    /* JADX INFO: renamed from: C */
    public boolean f23013C;

    /* JADX INFO: renamed from: G */
    public boolean f23017G;

    /* JADX INFO: renamed from: K */
    public float f23021K;

    /* JADX INFO: renamed from: L */
    public boolean f23022L;

    /* JADX INFO: renamed from: M */
    public InterfaceC1231l f23023M;

    /* JADX INFO: renamed from: N */
    public C1902b f23024N;

    /* JADX INFO: renamed from: P */
    public float f23026P;

    /* JADX INFO: renamed from: R */
    public boolean f23028R;

    /* JADX INFO: renamed from: l */
    public final C5616j0 f23029l;

    /* JADX INFO: renamed from: m */
    public boolean f23030m;

    /* JADX INFO: renamed from: p */
    public boolean f23033p;

    /* JADX INFO: renamed from: q */
    public boolean f23034q;

    /* JADX INFO: renamed from: t */
    public InterfaceC1231l f23037t;

    /* JADX INFO: renamed from: u */
    public C1902b f23038u;

    /* JADX INFO: renamed from: v */
    public float f23039v;

    /* JADX INFO: renamed from: x */
    public Object f23041x;

    /* JADX INFO: renamed from: y */
    public boolean f23042y;

    /* JADX INFO: renamed from: z */
    public boolean f23043z;

    /* JADX INFO: renamed from: n */
    public int f23031n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public int f23032o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r */
    public EnumC5594d0 f23035r = EnumC5594d0.f22745i;

    /* JADX INFO: renamed from: s */
    public long f23036s = 0;

    /* JADX INFO: renamed from: w */
    public boolean f23040w = true;

    /* JADX INFO: renamed from: D */
    public final C5606g0 f23014D = new C5606g0(this, 0);

    /* JADX INFO: renamed from: E */
    public final C2046b f23015E = new C2046b(new C5652v0[16]);

    /* JADX INFO: renamed from: F */
    public boolean f23016F = true;

    /* JADX INFO: renamed from: H */
    public long f23018H = AbstractC4232b.m8509b(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: I */
    public final C5649u0 f23019I = new C5649u0(this, 1);

    /* JADX INFO: renamed from: J */
    public final C5649u0 f23020J = new C5649u0(this, 0);

    /* JADX INFO: renamed from: O */
    public long f23025O = 0;

    /* JADX INFO: renamed from: Q */
    public final C5649u0 f23027Q = new C5649u0(this, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5652v0(C5616j0 c5616j0) {
        this.f23029l = c5616j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: A */
    public final C5639r mo9967A() {
        return this.f23029l.f22876a.f22778L.f22716c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: A0 */
    public final void mo8820A0(long j3, float f3, InterfaceC1231l interfaceC1231l) {
        m10220T0(j3, f3, interfaceC1231l, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: B */
    public final InterfaceC5581a mo9968B() {
        C5616j0 c5616j0;
        C5602f0 c5602f0M10049u = this.f23029l.f22876a.m10049u();
        if (c5602f0M10049u == null || (c5616j0 = c5602f0M10049u.f22779M) == null) {
            return null;
        }
        return c5616j0.f22891p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: B0 */
    public final void mo8821B0(long j3, float f3, C1902b c1902b) {
        m10220T0(j3, f3, null, c1902b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: G */
    public final int mo8829G(int i9) {
        C5616j0 c5616j0 = this.f23029l;
        if (!AbstractC5618k.m10161q(c5616j0.f22876a)) {
            m10217N0();
            return c5616j0.m10125a().mo8829G(i9);
        }
        C5640r0 c5640r0 = c5616j0.f22892q;
        c5640r0.getClass();
        return c5640r0.mo8829G(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: H */
    public final int mo9969H() {
        return this.f23032o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final List m10214J0() {
        C5616j0 c5616j0 = this.f23029l;
        c5616j0.f22876a.m10035f0();
        boolean z9 = this.f23016F;
        C2046b c2046b = this.f23015E;
        if (!z9) {
            return c2046b.m5060f();
        }
        C5602f0 c5602f0 = c5616j0.f22876a;
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            if (c2046b.f6893i <= i10) {
                c2046b.m5056b(c5602f02.f22779M.f22891p);
            } else {
                C5652v0 c5652v0 = c5602f02.f22779M.f22891p;
                Object[] objArr2 = c2046b.f6891g;
                Object obj = objArr2[i10];
                objArr2[i10] = c5652v0;
            }
        }
        c2046b.m5066l(((C2046b) ((C0929d0) c5602f0.m10042n()).f2909h).f6893i, c2046b.f6893i);
        this.f23016F = false;
        return c2046b.m5060f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final void m10215K0() {
        boolean z9 = this.f23042y;
        this.f23042y = true;
        C5616j0 c5616j0 = this.f23029l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5587b1 c5587b1 = c5602f0.f22778L;
        if (!z9) {
            c5587b1.f22716c.m10071C1();
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getRectManager().m3437f(c5616j0.f22876a);
            if (c5602f0.m10045q()) {
                C5602f0.m10001V(c5602f0, true, 6);
            } else if (c5602f0.f22779M.f22880e) {
                C5602f0.m10000T(c5602f0, true, 6);
            }
        }
        AbstractC5614i1 abstractC5614i1 = c5587b1.f22716c.f22869v;
        for (AbstractC5614i1 abstractC5614i12 = c5587b1.f22717d; !AbstractC1416l.m3825a(abstractC5614i12, abstractC5614i1) && abstractC5614i12 != null; abstractC5614i12 = abstractC5614i12.f22869v) {
            if (abstractC5614i12.f22865Q) {
                abstractC5614i12.m10113y1();
            }
        }
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            if (c5602f02.m10050v() != Integer.MAX_VALUE) {
                c5602f02.f22779M.f22891p.m10215K0();
                C5602f0.m10002W(c5602f02);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: M */
    public final int mo8830M(int i9) {
        C5616j0 c5616j0 = this.f23029l;
        if (!AbstractC5618k.m10161q(c5616j0.f22876a)) {
            m10217N0();
            return c5616j0.m10125a().mo8830M(i9);
        }
        C5640r0 c5640r0 = c5616j0.f22892q;
        c5640r0.getClass();
        return c5640r0.mo8830M(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final void m10216M0() {
        if (this.f23042y) {
            this.f23042y = false;
            C5616j0 c5616j0 = this.f23029l;
            C5602f0 c5602f0 = c5616j0.f22876a;
            C5602f0 c5602f02 = c5616j0.f22876a;
            ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getRectManager().m3438g(c5602f02);
            C5587b1 c5587b1 = c5602f02.f22778L;
            AbstractC5614i1 abstractC5614i1 = c5587b1.f22716c.f22869v;
            for (AbstractC5614i1 abstractC5614i12 = c5587b1.f22717d; !AbstractC1416l.m3825a(abstractC5614i12, abstractC5614i1) && abstractC5614i12 != null; abstractC5614i12 = abstractC5614i12.f22869v) {
                abstractC5614i12.m10073E1();
                abstractC5614i12.m10078J1();
            }
            C2046b c2046bM10053y = c5602f02.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i9 = c2046bM10053y.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                ((C5602f0) objArr[i10]).f22779M.f22891p.m10216M0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final void m10217N0() {
        C5616j0 c5616j0 = this.f23029l;
        C5602f0.m10001V(c5616j0.f22876a, false, 7);
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        if (c5602f0M10049u == null || c5602f0.f22775I != EnumC5594d0.f22745i) {
            return;
        }
        int iOrdinal = c5602f0M10049u.f22779M.f22879d.ordinal();
        c5602f0.f22775I = iOrdinal != 0 ? iOrdinal != 2 ? c5602f0M10049u.f22775I : EnumC5594d0.f22744h : EnumC5594d0.f22743g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: Q */
    public final AbstractC4377b1 mo8831Q(long j3) {
        EnumC5594d0 enumC5594d0;
        C5616j0 c5616j0 = this.f23029l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        EnumC5594d0 enumC5594d02 = c5602f0.f22775I;
        EnumC5594d0 enumC5594d03 = EnumC5594d0.f22745i;
        if (enumC5594d02 == enumC5594d03) {
            c5602f0.m10032e();
        }
        if (AbstractC5618k.m10161q(c5602f02)) {
            C5640r0 c5640r0 = c5616j0.f22892q;
            c5640r0.getClass();
            c5640r0.f22964p = enumC5594d03;
            c5640r0.mo8831Q(j3);
        }
        C5602f0 c5602f0M10049u = c5602f02.m10049u();
        if (c5602f0M10049u != null) {
            C5616j0 c5616j02 = c5602f0M10049u.f22779M;
            if (this.f23035r != enumC5594d03 && !c5602f02.f22777K) {
                AbstractC4229a.m8494b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = c5616j02.f22879d.ordinal();
            if (iOrdinal == 0) {
                enumC5594d0 = EnumC5594d0.f22743g;
            } else {
                if (iOrdinal != 2) {
                    C3193a.m6823l(c5616j02.f22879d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                enumC5594d0 = EnumC5594d0.f22744h;
            }
            this.f23035r = enumC5594d0;
        } else {
            this.f23035r = enumC5594d03;
        }
        m10221X0(j3);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public final void m10218R0() {
        this.f23022L = true;
        C5616j0 c5616j0 = this.f23029l;
        C5602f0 c5602f0M10049u = c5616j0.f22876a.m10049u();
        float f3 = mo9967A().f22855G;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5587b1 c5587b1 = c5602f0.f22778L;
        AbstractC5614i1 abstractC5614i1 = c5587b1.f22717d;
        C5639r c5639r = c5587b1.f22716c;
        while (abstractC5614i1 != c5639r) {
            abstractC5614i1.getClass();
            C5657x c5657x = (C5657x) abstractC5614i1;
            f3 += c5657x.f22855G;
            abstractC5614i1 = c5657x.f22869v;
        }
        if (f3 != this.f23021K) {
            this.f23021K = f3;
            if (c5602f0M10049u != null) {
                c5602f0M10049u.m10017O();
            }
            if (c5602f0M10049u != null) {
                c5602f0M10049u.m10005B();
            }
        }
        if (!mo9967A().f22924q) {
            boolean z9 = this.f23042y;
            if (!z9 || this.f23014D.m10059d()) {
                m10215K0();
            }
            if (z9) {
                c5602f0.f22778L.f22716c.m10071C1();
            } else {
                if (c5602f0M10049u != null) {
                    c5602f0M10049u.m10005B();
                }
                if (this.f23030m && c5602f0M10049u != null) {
                    c5602f0M10049u.m10022U(false);
                }
            }
        }
        if (c5602f0M10049u != null) {
            C5616j0 c5616j02 = c5602f0M10049u.f22779M;
            if (!this.f23030m && c5616j02.f22879d == EnumC5586b0.f22710i) {
                if (this.f23032o != Integer.MAX_VALUE) {
                    AbstractC4229a.m8494b("Place was called on a node which was placed already");
                }
                int i9 = c5616j02.f22884i;
                this.f23032o = i9;
                c5616j02.f22884i = i9 + 1;
            }
        } else {
            this.f23032o = 0;
        }
        mo9972h0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public final void m10219S0(long j3, float f3, InterfaceC1231l interfaceC1231l, C1902b c1902b) {
        C5616j0 c5616j0 = this.f23029l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        if (c5602f0.f22789W) {
            AbstractC4229a.m8493a("place is called on a deactivated node");
        }
        c5616j0.f22879d = EnumC5586b0.f22710i;
        this.f23036s = j3;
        this.f23039v = f3;
        this.f23037t = interfaceC1231l;
        this.f23038u = c1902b;
        this.f23022L = false;
        InterfaceC5641r1 interfaceC5641r1M10067a = AbstractC5613i0.m10067a(c5602f02);
        if (this.f23012B || !this.f23042y) {
            this.f23014D.f22820e = false;
            c5616j0.m10130f(false);
            this.f23023M = interfaceC1231l;
            this.f23025O = j3;
            this.f23026P = f3;
            this.f23024N = c1902b;
            C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1M10067a).getSnapshotObserver();
            snapshotObserver.f23001a.m9162c(c5602f02, snapshotObserver.f23006f, this.f23027Q);
        } else {
            AbstractC5614i1 abstractC5614i1M10125a = c5616j0.m10125a();
            abstractC5614i1M10125a.m10076H1(C4240j.m8530d(j3, abstractC5614i1M10125a.f14597k), f3, interfaceC1231l, c1902b);
            m10218R0();
        }
        c5616j0.f22879d = EnumC5586b0.f22712k;
        if (c5616j0.m10125a().f22924q && (c5616j0.f22886k || c5616j0.f22885j)) {
            requestLayout();
        }
        this.f23034q = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public final void m10220T0(long j3, float f3, InterfaceC1231l interfaceC1231l, C1902b c1902b) {
        AbstractC4374a1 placementScope;
        C5616j0 c5616j0 = this.f23029l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        try {
            this.f23043z = true;
            if (!C4240j.m8528b(j3, this.f23036s) || interfaceC1231l != this.f23037t || this.f23028R) {
                if (c5616j0.f22886k || c5616j0.f22885j || this.f23028R) {
                    this.f23012B = true;
                    this.f23028R = false;
                }
            }
            C5640r0 c5640r0 = c5616j0.f22892q;
            if (c5640r0 != null) {
                C5616j0 c5616j02 = c5640r0.f22960l;
                if (c5640r0.f22971w == EnumC5634p0.f22945i && !AbstractC5618k.m10161q(c5616j02.f22876a)) {
                    c5616j02.f22878c = true;
                }
            }
            C5640r0 c5640r02 = c5616j0.f22892q;
            if (c5640r02 != null && c5640r02.m10187J0()) {
                AbstractC5614i1 abstractC5614i1 = c5616j0.m10125a().f22870w;
                if (abstractC5614i1 == null || (placementScope = abstractC5614i1.f22925r) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f02)).getPlacementScope();
                }
                C5640r0 c5640r03 = c5616j0.f22892q;
                c5640r03.getClass();
                C5602f0 c5602f0M10049u = c5602f02.m10049u();
                if (c5602f0M10049u != null) {
                    c5602f0M10049u.f22779M.f22883h = 0;
                }
                c5640r03.f22963o = Integer.MAX_VALUE;
                placementScope.m8816A(c5640r03, (int) (j3 >> 32), (int) (4294967295L & j3), 0.0f);
            }
            C5640r0 c5640r04 = c5616j0.f22892q;
            if (c5640r04 != null && !c5640r04.f22965q) {
                AbstractC4229a.m8494b("Error: Placement happened before lookahead.");
            }
            m10219S0(j3, f3, interfaceC1231l, c1902b);
        } catch (Throwable th2) {
            c5602f0.m10024Y(th2);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1, p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: X */
    public final Object mo8824X() {
        return this.f23041x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public final boolean m10221X0(long j3) {
        C5616j0 c5616j0 = this.f23029l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        try {
            if (c5602f0.f22789W) {
                AbstractC4229a.m8493a("measure is called on a deactivated node");
            }
            InterfaceC5641r1 interfaceC5641r1M10067a = AbstractC5613i0.m10067a(c5602f02);
            C5602f0 c5602f0M10049u = c5602f02.m10049u();
            boolean z9 = true;
            c5602f02.f22777K = c5602f02.f22777K || (c5602f0M10049u != null && c5602f0M10049u.f22777K);
            if (!c5602f02.m10045q() && C4231a.m8498b(this.f14596j, j3)) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1M10067a).m10659n(c5602f02, false);
                c5602f02.m10023X();
                return false;
            }
            this.f23014D.f22819d = false;
            C2046b c2046bM10053y = c5602f02.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i9 = c2046bM10053y.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                ((C5602f0) objArr[i10]).f22779M.f22891p.f23014D.getClass();
            }
            this.f23033p = true;
            long j4 = c5616j0.m10125a().f14595i;
            m8823E0(j3);
            EnumC5586b0 enumC5586b0 = c5616j0.f22879d;
            EnumC5586b0 enumC5586b02 = EnumC5586b0.f22712k;
            if (enumC5586b0 != enumC5586b02) {
                AbstractC4229a.m8494b("layout state is not idle before measure starts");
            }
            this.f23018H = j3;
            EnumC5586b0 enumC5586b03 = EnumC5586b0.f22708g;
            c5616j0.f22879d = enumC5586b03;
            this.f23011A = false;
            C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f02)).getSnapshotObserver();
            snapshotObserver.f23001a.m9162c(c5602f02, snapshotObserver.f23003c, this.f23019I);
            if (c5616j0.f22879d == enumC5586b03) {
                this.f23012B = true;
                this.f23013C = true;
                c5616j0.f22879d = enumC5586b02;
            }
            if (C4242l.m8534a(c5616j0.m10125a().f14595i, j4) && c5616j0.m10125a().f14593g == this.f14593g && c5616j0.m10125a().f14594h == this.f14594h) {
                z9 = false;
            }
            m8822C0((((long) c5616j0.m10125a().f14594h) & 4294967295L) | (((long) c5616j0.m10125a().f14593g) << 32));
            return z9;
        } catch (Throwable th2) {
            c5602f0.m10024Y(th2);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y0 */
    public final void m10222Y0() {
        C5616j0 c5616j0 = this.f23029l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        if (!c5602f0.m10011H() || c5616j0.f22887l <= 0) {
            return;
        }
        C5616j0 c5616j02 = c5602f02.f22779M;
        if ((c5616j02.f22885j || c5616j02.f22886k) && !c5616j02.f22891p.f23012B) {
            c5602f02.m10022U(false);
        }
        C2046b c2046bM10053y = c5602f02.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            ((C5602f0) objArr[i10]).f22779M.f22891p.m10222Y0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: c0 */
    public final void mo9970c0(C0166f c0166f) {
        C2046b c2046bM10053y = this.f23029l.f22876a.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            c0166f.invoke(((C5602f0) objArr[i10]).f22779M.f22891p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: e */
    public final C5606g0 mo9971e() {
        return this.f23014D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5661y0
    /* JADX INFO: renamed from: f0 */
    public final void mo10180f0(boolean z9) {
        C5616j0 c5616j0 = this.f23029l;
        if (z9 != c5616j0.m10125a().f22922o) {
            c5616j0.m10125a().f22922o = z9;
            this.f23028R = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: h0 */
    public final void mo9972h0() {
        boolean zM10221X0;
        this.f23017G = true;
        C5606g0 c5606g0 = this.f23014D;
        c5606g0.m10063h();
        boolean z9 = this.f23012B;
        C5616j0 c5616j0 = this.f23029l;
        if (z9) {
            C2046b c2046bM10053y = c5616j0.f22876a.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i9 = c2046bM10053y.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                C5602f0 c5602f0 = (C5602f0) objArr[i10];
                boolean zM10045q = c5602f0.m10045q();
                C5616j0 c5616j02 = c5602f0.f22779M;
                if (zM10045q && c5602f0.m10046r() == EnumC5594d0.f22743g) {
                    C5652v0 c5652v0 = c5616j02.f22891p;
                    C4231a c4231a = c5652v0.f23033p ? new C4231a(c5652v0.f14596j) : null;
                    if (c4231a != null) {
                        if (c5602f0.f22775I == EnumC5594d0.f22745i) {
                            c5602f0.m10032e();
                        }
                        zM10221X0 = c5616j02.f22891p.m10221X0(c4231a.f13903a);
                    } else {
                        zM10221X0 = false;
                    }
                    if (zM10221X0) {
                        C5602f0.m10001V(c5616j0.f22876a, false, 7);
                    }
                }
            }
        }
        if (this.f23013C || (!mo9967A().f22924q && this.f23012B)) {
            this.f23012B = false;
            EnumC5586b0 enumC5586b0 = c5616j0.f22879d;
            c5616j0.f22879d = EnumC5586b0.f22710i;
            c5616j0.m10131g(false);
            C5602f0 c5602f02 = c5616j0.f22876a;
            C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f02)).getSnapshotObserver();
            snapshotObserver.f23001a.m9162c(c5602f02, snapshotObserver.f23005e, this.f23020J);
            c5616j0.f22879d = enumC5586b0;
            this.f23013C = false;
        }
        if (c5606g0.f22817b && c5606g0.m10060e()) {
            c5606g0.m10062g();
        }
        this.f23017G = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: j */
    public final int mo8832j(int i9) {
        C5616j0 c5616j0 = this.f23029l;
        if (!AbstractC5618k.m10161q(c5616j0.f22876a)) {
            m10217N0();
            return c5616j0.m10125a().mo8832j(i9);
        }
        C5640r0 c5640r0 = c5616j0.f22892q;
        c5640r0.getClass();
        return c5640r0.mo8832j(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: o0 */
    public final void mo9973o0() {
        C5602f0.m10001V(this.f23029l.f22876a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: p0 */
    public final int mo8833p0(int i9) {
        C5616j0 c5616j0 = this.f23029l;
        if (!AbstractC5618k.m10161q(c5616j0.f22876a)) {
            m10217N0();
            return c5616j0.m10125a().mo8833p0(i9);
        }
        C5640r0 c5640r0 = c5616j0.f22892q;
        c5640r0.getClass();
        return c5640r0.mo8833p0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: r0 */
    public final int mo8825r0() {
        return this.f23029l.m10125a().mo8825r0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    public final void requestLayout() {
        this.f23029l.f22876a.m10022U(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: w0 */
    public final int mo8826w0() {
        return this.f23029l.m10125a().mo8826w0();
    }
}
