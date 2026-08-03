package p339x1;

import okio.C3193a;
import p016b1.C0166f;
import p085fg.InterfaceC1231l;
import p118i1.C1902b;
import p131j0.C2046b;
import p136j8.C2104o;
import p292u1.AbstractC4229a;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p293u2.C4240j;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5640r0 extends AbstractC4377b1 implements InterfaceC4409m0, InterfaceC5581a, InterfaceC5661y0 {

    /* JADX INFO: renamed from: A */
    public boolean f22952A;

    /* JADX INFO: renamed from: D */
    public Object f22955D;

    /* JADX INFO: renamed from: H */
    public boolean f22959H;

    /* JADX INFO: renamed from: l */
    public final C5616j0 f22960l;

    /* JADX INFO: renamed from: m */
    public boolean f22961m;

    /* JADX INFO: renamed from: q */
    public boolean f22965q;

    /* JADX INFO: renamed from: r */
    public boolean f22966r;

    /* JADX INFO: renamed from: s */
    public C4231a f22967s;

    /* JADX INFO: renamed from: u */
    public InterfaceC1231l f22969u;

    /* JADX INFO: renamed from: v */
    public C1902b f22970v;

    /* JADX INFO: renamed from: n */
    public int f22962n = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: o */
    public int f22963o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: p */
    public EnumC5594d0 f22964p = EnumC5594d0.f22745i;

    /* JADX INFO: renamed from: t */
    public long f22968t = 0;

    /* JADX INFO: renamed from: w */
    public EnumC5634p0 f22971w = EnumC5634p0.f22945i;

    /* JADX INFO: renamed from: x */
    public final C5606g0 f22972x = new C5606g0(this, 1);

    /* JADX INFO: renamed from: y */
    public final C2046b f22973y = new C2046b(new C5640r0[16]);

    /* JADX INFO: renamed from: z */
    public boolean f22974z = true;

    /* JADX INFO: renamed from: B */
    public final C5637q0 f22953B = new C5637q0(this, 0);

    /* JADX INFO: renamed from: C */
    public boolean f22954C = true;

    /* JADX INFO: renamed from: E */
    public long f22956E = AbstractC4232b.m8509b(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: F */
    public final C5637q0 f22957F = new C5637q0(this, 2);

    /* JADX INFO: renamed from: G */
    public final C5637q0 f22958G = new C5637q0(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5640r0(C5616j0 c5616j0) {
        this.f22960l = c5616j0;
        this.f22955D = c5616j0.f22891p.f23041x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: A */
    public final C5639r mo9967A() {
        return this.f22960l.f22876a.f22778L.f22716c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: A0 */
    public final void mo8820A0(long j3, float f3, InterfaceC1231l interfaceC1231l) {
        m10193T0(j3, interfaceC1231l, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: B */
    public final InterfaceC5581a mo9968B() {
        C5616j0 c5616j0;
        C5602f0 c5602f0M10049u = this.f22960l.f22876a.m10049u();
        if (c5602f0M10049u == null || (c5616j0 = c5602f0M10049u.f22779M) == null) {
            return null;
        }
        return c5616j0.f22892q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: B0 */
    public final void mo8821B0(long j3, float f3, C1902b c1902b) {
        m10193T0(j3, null, c1902b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: G */
    public final int mo8829G(int i9) {
        m10191R0();
        AbstractC5631o0 abstractC5631o0Mo10104p1 = this.f22960l.m10125a().mo10104p1();
        abstractC5631o0Mo10104p1.getClass();
        return abstractC5631o0Mo10104p1.mo8829G(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: H */
    public final int mo9969H() {
        return this.f22963o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final boolean m10187J0() {
        C5616j0 c5616j0 = this.f22960l;
        return AbstractC5618k.m10161q(c5616j0.f22876a) || c5616j0.f22878c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final void m10188K0(boolean z9) {
        if (z9 && m10187J0()) {
            return;
        }
        if (z9 || m10187J0()) {
            this.f22971w = EnumC5634p0.f22945i;
            C2046b c2046bM10053y = this.f22960l.f22876a.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i9 = c2046bM10053y.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                C5640r0 c5640r0 = ((C5602f0) objArr[i10]).f22779M.f22892q;
                c5640r0.getClass();
                c5640r0.m10188K0(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: M */
    public final int mo8830M(int i9) {
        m10191R0();
        AbstractC5631o0 abstractC5631o0Mo10104p1 = this.f22960l.m10125a().mo10104p1();
        abstractC5631o0Mo10104p1.getClass();
        return abstractC5631o0Mo10104p1.mo8830M(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public final void m10189M0() {
        EnumC5634p0 enumC5634p0 = this.f22971w;
        C5616j0 c5616j0 = this.f22960l;
        boolean z9 = c5616j0.f22878c;
        C5602f0 c5602f0 = c5616j0.f22876a;
        EnumC5634p0 enumC5634p02 = EnumC5634p0.f22943g;
        if (z9) {
            this.f22971w = EnumC5634p0.f22944h;
        } else {
            this.f22971w = enumC5634p02;
        }
        if (enumC5634p0 != enumC5634p02 && c5616j0.f22880e) {
            C5602f0.m10000T(c5602f0, true, 6);
        }
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5602f0 c5602f02 = (C5602f0) objArr[i10];
            C5640r0 c5640r0 = c5602f02.f22779M.f22892q;
            if (c5640r0 == null) {
                C2104o.m5294t("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (c5640r0.f22963o != Integer.MAX_VALUE) {
                c5640r0.m10189M0();
                C5602f0.m10002W(c5602f02);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final void m10190N0() {
        C5616j0 c5616j0 = this.f22960l;
        if (c5616j0.f22890o > 0) {
            C2046b c2046bM10053y = c5616j0.f22876a.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i9 = c2046bM10053y.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                C5602f0 c5602f0 = (C5602f0) objArr[i10];
                C5616j0 c5616j02 = c5602f0.f22779M;
                if ((c5616j02.f22888m || c5616j02.f22889n) && !c5616j02.f22881f) {
                    c5602f0.m10021S(false);
                }
                C5640r0 c5640r0 = c5616j02.f22892q;
                if (c5640r0 != null) {
                    c5640r0.m10190N0();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC4377b1 mo8831Q(long j3) {
        EnumC5594d0 enumC5594d0;
        C5616j0 c5616j0 = this.f22960l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        if ((c5602f0M10049u != null ? c5602f0M10049u.f22779M.f22879d : null) == EnumC5586b0.f22709h) {
            c5616j0.f22877b = false;
        } else {
            C5602f0 c5602f0M10049u2 = c5602f02.m10049u();
            if ((c5602f0M10049u2 != null ? c5602f0M10049u2.f22779M.f22879d : null) == EnumC5586b0.f22711j) {
            }
        }
        C5602f0 c5602f0M10049u3 = c5602f02.m10049u();
        EnumC5594d0 enumC5594d02 = EnumC5594d0.f22745i;
        if (c5602f0M10049u3 != null) {
            C5616j0 c5616j02 = c5602f0M10049u3.f22779M;
            if (this.f22964p != enumC5594d02 && !c5602f02.f22777K) {
                AbstractC4229a.m8494b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = c5616j02.f22879d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                enumC5594d0 = EnumC5594d0.f22743g;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    C3193a.m6823l(c5616j02.f22879d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                enumC5594d0 = EnumC5594d0.f22744h;
            }
            this.f22964p = enumC5594d0;
        } else {
            this.f22964p = enumC5594d02;
        }
        if (c5602f02.f22775I == enumC5594d02) {
            c5602f02.m10032e();
        }
        m10194X0(j3);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public final void m10191R0() {
        C5616j0 c5616j0 = this.f22960l;
        C5602f0.m10000T(c5616j0.f22876a, false, 7);
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f0M10049u = c5602f0.m10049u();
        if (c5602f0M10049u == null || c5602f0.f22775I != EnumC5594d0.f22745i) {
            return;
        }
        int iOrdinal = c5602f0M10049u.f22779M.f22879d.ordinal();
        c5602f0.f22775I = iOrdinal != 0 ? iOrdinal != 2 ? c5602f0M10049u.f22775I : EnumC5594d0.f22744h : EnumC5594d0.f22743g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public final void m10192S0() {
        EnumC5586b0 enumC5586b0;
        this.f22959H = true;
        C5616j0 c5616j0 = this.f22960l;
        C5602f0 c5602f0M10049u = c5616j0.f22876a.m10049u();
        EnumC5634p0 enumC5634p0 = this.f22971w;
        if ((enumC5634p0 != EnumC5634p0.f22943g && !c5616j0.f22878c) || (enumC5634p0 != EnumC5634p0.f22944h && c5616j0.f22878c)) {
            m10189M0();
            if (this.f22961m && c5602f0M10049u != null) {
                c5602f0M10049u.m10021S(false);
            }
        }
        if (c5602f0M10049u != null) {
            C5616j0 c5616j02 = c5602f0M10049u.f22779M;
            if (!this.f22961m && ((enumC5586b0 = c5616j02.f22879d) == EnumC5586b0.f22710i || enumC5586b0 == EnumC5586b0.f22711j)) {
                if (this.f22963o != Integer.MAX_VALUE) {
                    AbstractC4229a.m8494b("Place was called on a node which was placed already");
                }
                int i9 = c5616j02.f22883h;
                this.f22963o = i9;
                c5616j02.f22883h = i9 + 1;
            }
        } else {
            this.f22963o = 0;
        }
        mo9972h0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0085, B:31:0x006f), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10193T0(long j3, InterfaceC1231l interfaceC1231l, C1902b c1902b) {
        C5616j0 c5616j0 = this.f22960l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        try {
            C5602f0 c5602f0M10049u = c5602f0.m10049u();
            EnumC5586b0 enumC5586b0 = c5602f0M10049u != null ? c5602f0M10049u.f22779M.f22879d : null;
            EnumC5586b0 enumC5586b02 = EnumC5586b0.f22711j;
            if (enumC5586b0 == enumC5586b02) {
                c5616j0.f22878c = false;
            }
            if (c5602f02.f22789W) {
                AbstractC4229a.m8493a("place is called on a deactivated node");
            }
            c5616j0.f22879d = enumC5586b02;
            boolean z9 = true;
            this.f22965q = true;
            this.f22959H = false;
            if (!C4240j.m8528b(j3, this.f22968t)) {
                if (c5616j0.f22889n || c5616j0.f22888m) {
                    c5616j0.f22881f = true;
                }
                m10190N0();
            }
            InterfaceC5641r1 interfaceC5641r1M10067a = AbstractC5613i0.m10067a(c5602f02);
            this.f22968t = j3;
            if (c5616j0.f22881f) {
                c5616j0.m10132h(false);
                this.f22972x.f22820e = false;
                C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1M10067a).getSnapshotObserver();
                snapshotObserver.f23001a.m9162c(c5602f02, snapshotObserver.f23007g, this.f22958G);
            } else {
                if (this.f22971w == EnumC5634p0.f22945i) {
                    z9 = false;
                }
                if (z9) {
                    AbstractC5631o0 abstractC5631o0Mo10104p1 = c5616j0.m10125a().mo10104p1();
                    abstractC5631o0Mo10104p1.getClass();
                    abstractC5631o0Mo10104p1.m10183i1(C4240j.m8530d(j3, abstractC5631o0Mo10104p1.f14597k));
                    m10192S0();
                }
            }
            this.f22969u = interfaceC1231l;
            this.f22970v = c1902b;
            c5616j0.f22879d = EnumC5586b0.f22712k;
        } catch (Throwable th2) {
            c5602f0.m10024Y(th2);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1, p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: X */
    public final Object mo8824X() {
        return this.f22955D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public final boolean m10194X0(long j3) {
        long j4;
        C5616j0 c5616j0 = this.f22960l;
        C5602f0 c5602f0 = c5616j0.f22876a;
        C5602f0 c5602f02 = c5616j0.f22876a;
        try {
            if (c5602f0.f22789W) {
                AbstractC4229a.m8493a("measure is called on a deactivated node");
            }
            C5602f0 c5602f0M10049u = c5602f02.m10049u();
            c5602f02.f22777K = c5602f02.f22777K || (c5602f0M10049u != null && c5602f0M10049u.f22777K);
            if (!c5602f02.f22779M.f22880e) {
                C4231a c4231a = this.f22967s;
                if (c4231a == null ? false : C4231a.m8498b(c4231a.f13903a, j3)) {
                    InterfaceC5641r1 interfaceC5641r1 = c5602f02.f22803t;
                    if (interfaceC5641r1 != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1).m10659n(c5602f02, true);
                    }
                    c5602f02.m10023X();
                    return false;
                }
            }
            this.f22967s = new C4231a(j3);
            m8823E0(j3);
            this.f22972x.f22819d = false;
            C2046b c2046bM10053y = c5602f02.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i9 = c2046bM10053y.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                C5640r0 c5640r0 = ((C5602f0) objArr[i10]).f22779M.f22892q;
                c5640r0.getClass();
                c5640r0.f22972x.getClass();
            }
            if (this.f22966r) {
                j4 = this.f14595i;
            } else {
                long j5 = Integer.MIN_VALUE;
                j4 = (j5 & 4294967295L) | (j5 << 32);
            }
            this.f22966r = true;
            AbstractC5631o0 abstractC5631o0Mo10104p1 = c5616j0.m10125a().mo10104p1();
            if (!(abstractC5631o0Mo10104p1 != null)) {
                AbstractC4229a.m8494b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            c5616j0.m10127c(j3);
            m8822C0((((long) abstractC5631o0Mo10104p1.f14594h) & 4294967295L) | (((long) abstractC5631o0Mo10104p1.f14593g) << 32));
            return (((int) (j4 >> 32)) == abstractC5631o0Mo10104p1.f14593g && ((int) (j4 & 4294967295L)) == abstractC5631o0Mo10104p1.f14594h) ? false : true;
        } catch (Throwable th2) {
            c5602f0.m10024Y(th2);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: c0 */
    public final void mo9970c0(C0166f c0166f) {
        C2046b c2046bM10053y = this.f22960l.f22876a.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            C5640r0 c5640r0 = ((C5602f0) objArr[i10]).f22779M.f22892q;
            c5640r0.getClass();
            c0166f.invoke(c5640r0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: e */
    public final C5606g0 mo9971e() {
        return this.f22972x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5661y0
    /* JADX INFO: renamed from: f0 */
    public final void mo10180f0(boolean z9) {
        AbstractC5631o0 abstractC5631o0Mo10104p1;
        C5616j0 c5616j0 = this.f22960l;
        AbstractC5631o0 abstractC5631o0Mo10104p12 = c5616j0.m10125a().mo10104p1();
        if (Boolean.valueOf(z9).equals(abstractC5631o0Mo10104p12 != null ? Boolean.valueOf(abstractC5631o0Mo10104p12.f22922o) : null) || (abstractC5631o0Mo10104p1 = c5616j0.m10125a().mo10104p1()) == null) {
            return;
        }
        abstractC5631o0Mo10104p1.f22922o = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: h0 */
    public final void mo9972h0() {
        this.f22952A = true;
        C5606g0 c5606g0 = this.f22972x;
        c5606g0.m10063h();
        C5616j0 c5616j0 = this.f22960l;
        boolean z9 = c5616j0.f22881f;
        C5602f0 c5602f0 = c5616j0.f22876a;
        if (z9) {
            C2046b c2046bM10053y = c5602f0.m10053y();
            Object[] objArr = c2046bM10053y.f6891g;
            int i9 = c2046bM10053y.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                C5602f0 c5602f02 = (C5602f0) objArr[i10];
                C5616j0 c5616j02 = c5602f02.f22779M;
                if (c5616j02.f22880e && c5602f02.m10047s() == EnumC5594d0.f22743g) {
                    C5640r0 c5640r0 = c5616j02.f22892q;
                    c5640r0.getClass();
                    C5640r0 c5640r02 = c5616j02.f22892q;
                    C4231a c4231a = c5640r02 != null ? c5640r02.f22967s : null;
                    c4231a.getClass();
                    if (c5640r0.m10194X0(c4231a.f13903a)) {
                        C5602f0.m10000T(c5602f0, false, 7);
                    }
                }
            }
        }
        C5636q c5636q = mo9967A().f22951Z;
        c5636q.getClass();
        if (c5616j0.f22882g || (!c5636q.f22924q && c5616j0.f22881f)) {
            c5616j0.f22881f = false;
            EnumC5586b0 enumC5586b0 = c5616j0.f22879d;
            c5616j0.f22879d = EnumC5586b0.f22711j;
            c5616j0.m10133i(false);
            C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getSnapshotObserver();
            snapshotObserver.f23001a.m9162c(c5602f0, snapshotObserver.f23008h, this.f22953B);
            c5616j0.f22879d = enumC5586b0;
            if (c5616j0.f22888m && c5636q.f22924q) {
                requestLayout();
            }
            c5616j0.f22882g = false;
        }
        if (c5606g0.f22817b && c5606g0.m10060e()) {
            c5606g0.m10062g();
        }
        this.f22952A = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: j */
    public final int mo8832j(int i9) {
        m10191R0();
        AbstractC5631o0 abstractC5631o0Mo10104p1 = this.f22960l.m10125a().mo10104p1();
        abstractC5631o0Mo10104p1.getClass();
        return abstractC5631o0Mo10104p1.mo8832j(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    /* JADX INFO: renamed from: o0 */
    public final void mo9973o0() {
        C5602f0.m10000T(this.f22960l.f22876a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: p0 */
    public final int mo8833p0(int i9) {
        m10191R0();
        AbstractC5631o0 abstractC5631o0Mo10104p1 = this.f22960l.m10125a().mo10104p1();
        abstractC5631o0Mo10104p1.getClass();
        return abstractC5631o0Mo10104p1.mo8833p0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5581a
    public final void requestLayout() {
        this.f22960l.f22876a.m10021S(false);
    }
}
