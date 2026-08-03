package th;

import ac.AbstractC0063p;
import ai.C0089b;
import android.graphics.RuntimeShader;
import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import p020b5.C0184c;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1018n0;
import p071f1.C1005h;
import p071f1.C1034w;
import p071f1.InterfaceC1026r0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p116i.C1746e0;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1829f1;
import p117i0.C1845j1;
import p117i0.C1872q0;
import p118i1.C1902b;
import p174m.C2576b;
import p198nb.C2924a;
import p219oh.AbstractC3165h;
import p293u2.EnumC4243m;
import p305uh.C4352a;
import p305uh.C4353b;
import p306v.C4359d;
import p306v.InterfaceC4356a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p308v1.InterfaceC4428t;
import p320vh.AbstractC4577d;
import p320vh.C4579f;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.C5610h0;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5626m1;
import p339x1.InterfaceC5627n;
import p339x1.InterfaceC5651v;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: th.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4217i extends AbstractC5852n implements InterfaceC5651v, InterfaceC5624m, InterfaceC5627n, InterfaceC5626m1, InterfaceC5609h {

    /* JADX INFO: renamed from: A */
    public boolean f13863A;

    /* JADX INFO: renamed from: B */
    public final C4579f f13864B;

    /* JADX INFO: renamed from: C */
    public final C4215g f13865C;

    /* JADX INFO: renamed from: D */
    public final C4213e f13866D;

    /* JADX INFO: renamed from: E */
    public final C4213e f13867E;

    /* JADX INFO: renamed from: F */
    public C1902b f13868F;

    /* JADX INFO: renamed from: G */
    public final C1845j1 f13869G;

    /* JADX INFO: renamed from: H */
    public final C1829f1 f13870H;

    /* JADX INFO: renamed from: I */
    public final C2924a f13871I;

    /* JADX INFO: renamed from: J */
    public final C1845j1 f13872J;

    /* JADX INFO: renamed from: K */
    public final C1005h f13873K;

    /* JADX INFO: renamed from: u */
    public InterfaceC4209a f13874u;

    /* JADX INFO: renamed from: v */
    public InterfaceC1231l f13875v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1231l f13876w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1231l f13877x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1235p f13878y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1231l f13879z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4217i(InterfaceC4209a interfaceC4209a, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l4, boolean z9) {
        interfaceC4209a.getClass();
        interfaceC1220a.getClass();
        interfaceC1231l.getClass();
        this.f13874u = interfaceC4209a;
        this.f13875v = interfaceC1231l;
        this.f13876w = interfaceC1231l2;
        this.f13877x = interfaceC1231l3;
        this.f13878y = interfaceC1235p;
        this.f13879z = interfaceC1231l4;
        this.f13863A = z9;
        this.f13864B = new C4579f(interfaceC1220a);
        this.f13865C = new C4215g(this);
        this.f13866D = new C4213e(this);
        this.f13867E = new C4213e(this);
        this.f13869G = AbstractC1874r.m4639u(Boolean.FALSE);
        this.f13870H = new C1829f1(0.0f);
        this.f13871I = new C2924a(this, 14);
        this.f13872J = new C1845j1(null, C1823e.f6049j);
        AbstractC0996c0.m2510f();
        this.f13873K = AbstractC0996c0.m2510f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public static final void m8483k1(C4217i c4217i, InterfaceC1567d interfaceC1567d, C4213e c4213e) {
        float fM4488g = c4213e.f13821e.m4488g();
        int i9 = c4213e.f13822f;
        if (fM4488g == 0.0f) {
            fM4488g = 0.0f;
        } else if (i9 > 1) {
            fM4488g = (int) (fM4488g / i9);
        }
        ((C0119x) interfaceC1567d.mo4081z0().f469a).m598c0(fM4488g, fM4488g);
        try {
            c4217i.f13878y.invoke(interfaceC1567d, new C4212d(i9, 0, c4217i));
        } finally {
            float f3 = -fM4488g;
            ((C0119x) interfaceC1567d.mo4081z0().f469a).m598c0(f3, f3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        C4353b c4353b;
        int i9;
        int i10;
        C1565b c1565b;
        RuntimeShader runtimeShader;
        C1565b c1565b2 = c5610h0.f22833g;
        if (!this.f13863A) {
            c5610h0.m10064e();
            return;
        }
        C4215g c4215g = this.f13865C;
        c4215g.getClass();
        float fMo1333d = c1565b2.mo1333d();
        float fMo1335q0 = c1565b2.mo1335q0();
        long jMo4091a = c1565b2.mo4091a();
        EnumC4243m layoutDirection = c5610h0.getLayoutDirection();
        boolean z9 = (fMo1333d == c4215g.f13839g && fMo1335q0 == c4215g.f13840h && C0810e.m2054a(jMo4091a, c4215g.f13841i) && layoutDirection == c4215g.f13842j) ? false : true;
        if (z9) {
            c4215g.f13839g = fMo1333d;
            c4215g.f13840h = fMo1335q0;
            c4215g.f13841i = jMo4091a;
            layoutDirection.getClass();
            c4215g.f13842j = layoutDirection;
        }
        if (z9) {
            m8489q1();
        }
        m8488p1(c5610h0, this.f13866D);
        if (((Boolean) this.f13869G.getValue()).booleanValue()) {
            C1902b c1902bMo2557c = this.f13868F;
            if (c1902bMo2557c == null) {
                c1902bMo2557c = AbstractC5618k.m10165u(this).mo2557c();
                this.f13868F = c1902bMo2557c;
            }
            int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (c1565b2.mo4091a() >> 32));
            if (iIntBitsToFloat < 1) {
                iIntBitsToFloat = 1;
            }
            int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (c1565b2.mo4091a() & 4294967295L));
            if (iIntBitsToFloat2 < 1) {
                iIntBitsToFloat2 = 1;
            }
            c5610h0.mo4092y((((long) iIntBitsToFloat2) & 4294967295L) | (((long) iIntBitsToFloat) << 32), new C1872q0(AbstractC5618k.m10167w(this).f22771E, 1, this), c1902bMo2557c);
            c1902bMo2557c.m4678f(this.f13870H.m4488g());
            AbstractC3165h.m6794u(c5610h0, c1902bMo2557c);
        }
        InterfaceC1231l interfaceC1231l = this.f13879z;
        if (interfaceC1231l != null) {
            interfaceC1231l.invoke(c5610h0);
        }
        c5610h0.m10064e();
        InterfaceC1231l interfaceC1231l2 = this.f13876w;
        if (interfaceC1231l2 == null || (c4353b = (C4353b) interfaceC1231l2.invoke(c4215g)) == null) {
            return;
        }
        InterfaceC1026r0 interfaceC1026r0 = (InterfaceC1026r0) ((InterfaceC1220a) c4215g.f13838H.f13864B.f15084c).invoke();
        InterfaceC4221m interfaceC4221m = c4215g.f13846n;
        C4352a c4352a = c4353b.f14544c;
        float f3 = c4353b.f14543b;
        interfaceC1026r0.getClass();
        interfaceC4221m.getClass();
        C1005h c1005h = this.f13873K;
        c1005h.getClass();
        float f10 = c4353b.f14542a;
        if (f10 <= 0.0f || f3 <= 0.0f) {
            return;
        }
        long jMo4091a2 = c1565b2.mo4091a();
        int i11 = (int) (jMo4091a2 >> 32);
        if (Float.intBitsToFloat(i11) > 0.0f) {
            int i12 = (int) (jMo4091a2 & 4294967295L);
            if (Float.intBitsToFloat(i12) <= 0.0f) {
                return;
            }
            float fMo1601x0 = c5610h0.mo1601x0(f10);
            float fM2055b = C0810e.m2055b(jMo4091a2) / 2.0f;
            if (fMo1601x0 > fM2055b) {
                fMo1601x0 = fM2055b;
            }
            boolean z10 = c4352a.f14541f;
            long j3 = c4352a.f14536a;
            if (AbstractC4211c.m8477c()) {
                long jMo4091a3 = c1565b2.mo4091a();
                C0089b c0089bMo8482e = interfaceC4221m.mo8482e(z10 ? "BloomStrokeDual" : "BloomStrokeSingle", z10 ? AbstractC4577d.f15079c : AbstractC4577d.f15078b);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo4091a3 >> 32)) * 0.5f;
                i9 = i12;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo4091a3 & 4294967295L)) * 0.5f;
                c0089bMo8482e.getClass();
                c0089bMo8482e.f255a.setFloatUniform("halfView", fIntBitsToFloat, fIntBitsToFloat2);
                c0089bMo8482e.f255a.setFloatUniform("halfViewFloor", (float) Math.floor(fIntBitsToFloat), (float) Math.floor(fIntBitsToFloat2));
                long jMo4091a4 = c1565b2.mo4091a();
                float fM2055b2 = C0810e.m2055b(jMo4091a4) / 2.0f;
                C4359d c4359d = interfaceC1026r0 instanceof C4359d ? (C4359d) interfaceC1026r0 : null;
                if (c4359d == null) {
                    c0089bMo8482e.f255a.setFloatUniform("cornerRadii", fM2055b2, fM2055b2, fM2055b2, fM2055b2);
                    c1565b = c1565b2;
                    i10 = i11;
                } else {
                    InterfaceC4356a interfaceC4356a = c4359d.f14556d;
                    InterfaceC4356a interfaceC4356a2 = c4359d.f14555c;
                    i10 = i11;
                    InterfaceC4356a interfaceC4356a3 = c4359d.f14554b;
                    InterfaceC4356a interfaceC4356a4 = c4359d.f14553a;
                    c1565b = c1565b2;
                    boolean z11 = c5610h0.getLayoutDirection() == EnumC4243m.f13919g;
                    float fMo8799a = z11 ? interfaceC4356a4.mo8799a(jMo4091a4, c5610h0) : interfaceC4356a3.mo8799a(jMo4091a4, c5610h0);
                    float fMo8799a2 = z11 ? interfaceC4356a3.mo8799a(jMo4091a4, c5610h0) : interfaceC4356a4.mo8799a(jMo4091a4, c5610h0);
                    float fMo8799a3 = z11 ? interfaceC4356a2.mo8799a(jMo4091a4, c5610h0) : interfaceC4356a.mo8799a(jMo4091a4, c5610h0);
                    float fMo8799a4 = z11 ? interfaceC4356a.mo8799a(jMo4091a4, c5610h0) : interfaceC4356a2.mo8799a(jMo4091a4, c5610h0);
                    if (fMo8799a > fM2055b2) {
                        fMo8799a = fM2055b2;
                    }
                    if (fMo8799a2 > fM2055b2) {
                        fMo8799a2 = fM2055b2;
                    }
                    if (fMo8799a4 > fM2055b2) {
                        fMo8799a4 = fM2055b2;
                    }
                    c0089bMo8482e.f255a.setFloatUniform("cornerRadii", fMo8799a, fMo8799a2, fMo8799a4, fMo8799a3 > fM2055b2 ? fM2055b2 : fMo8799a3);
                }
                c0089bMo8482e.f255a.setFloatUniform("strokeWidth", fMo1601x0);
                float fMo1601x02 = c5610h0.mo1601x0(c4352a.f14538c);
                c0089bMo8482e.f255a.setFloatUniform("innerBlurRadius", fMo1601x02);
                c0089bMo8482e.f255a.setFloatUniform("innerBlurRadiusSq", fMo1601x02 * fMo1601x02);
                c0089bMo8482e.f255a.setFloatUniform("highlightAlpha", f3);
                c0089bMo8482e.f255a.setColorUniform("strokeColor", AbstractC0996c0.m2526w(C1034w.m2634b(j3, 1.0f)));
                c0089bMo8482e.f255a.setFloatUniform("strokeAlphaMul", C1034w.m2636d(j3));
                boolean z12 = !z10;
                AbstractC5700d.m10286m(c0089bMo8482e, "1", c4352a.f14539d, z12);
                AbstractC5700d.m10286m(c0089bMo8482e, "2", c4352a.f14540e, z12);
                runtimeShader = c0089bMo8482e.f255a;
            } else {
                c1565b = c1565b2;
                i10 = i11;
                i9 = i12;
                runtimeShader = null;
            }
            if (runtimeShader == null) {
                return;
            }
            c1005h.m2591z(runtimeShader);
            c1005h.m2587v(c4352a.f14537b);
            c1565b.f5220h.m819p().mo2501t(0.0f, 0.0f, Float.intBitsToFloat(i10), Float.intBitsToFloat(i9), c1005h);
            c1005h.m2591z(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        AbstractC5618k.m10162r(this, new C1746e0(this, 26));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        InterfaceC4221m interfaceC4221m = (InterfaceC4221m) AbstractC5618k.m10152h(this, AbstractC4223o.f13890a);
        C4215g c4215g = this.f13865C;
        c4215g.getClass();
        interfaceC4221m.getClass();
        c4215g.f13846n = interfaceC4221m;
        if (this.f13863A) {
            C4213e c4213e = this.f13866D;
            if (c4213e.f13817a == null) {
                c4213e.f13817a = AbstractC5618k.m10165u(c4213e.f13827k).mo2557c();
            }
            AbstractC5618k.m10162r(this, new C1746e0(this, 26));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        m8487o1();
        this.f13872J.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        interfaceC4409m0.getClass();
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C2576b(this, 19, abstractC4377b1Mo8831Q));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final void m8484l1(InterfaceC1567d interfaceC1567d, C4213e c4213e, int i9, C1902b c1902b, int i10, int i11, C1902b c1902b2, int i12, int i13, float f3, String str, String str2) {
        AbstractC1018n0[] abstractC1018n0Arr = c4213e.f13826j;
        int[] iArr = c4213e.f13825i;
        int[] iArr2 = c4213e.f13824h;
        String[] strArr = c4213e.f13823g;
        AbstractC1018n0 abstractC1018n0M402L = abstractC1018n0Arr[i9];
        if (abstractC1018n0M402L == null || !AbstractC1416l.m3825a(strArr[i9], str) || iArr2[i9] != i10 || iArr[i9] != i11) {
            C0089b c0089bMo8482e = this.f13865C.mo8482e(str, str2);
            c0089bMo8482e.getClass();
            c0089bMo8482e.f255a.setFloatUniform("maxCoord", i10 - 0.5f, i11 - 0.5f);
            abstractC1018n0M402L = AbstractC0063p.m402L(c0089bMo8482e, "child");
            c4213e.f13826j[i9] = abstractC1018n0M402L;
            strArr[i9] = str;
            iArr2[i9] = i10;
            iArr[i9] = i11;
        }
        c1902b.m4679g(abstractC1018n0M402L);
        interfaceC1567d.mo4092y((((long) i12) << 32) | (((long) i13) & 4294967295L), new C4214f(AbstractC5618k.m10167w(this).f22771E, f3, c1902b), c1902b2);
        c1902b.m4679g(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m8485m1() {
        this.f13865C.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m8486n1(InterfaceC1567d interfaceC1567d, C4213e c4213e, C1902b c1902b, float f3, float f10, int i9, float f11, float f12, int i10, int i11) {
        long j3;
        this.f13865C.getClass();
        if (f10 == 0.0f) {
            j3 = 0;
        } else {
            long j4 = -((int) (f10 / i9));
            j3 = (j4 & 4294967295L) | (j4 << 32);
        }
        c1902b.m4681i(j3);
        float f13 = -f11;
        float f14 = -f12;
        ((C0119x) interfaceC1567d.mo4081z0().f469a).m598c0(f13, f14);
        try {
            C0184c c0184cMo4081z0 = interfaceC1567d.mo4081z0();
            long jM825v = c0184cMo4081z0.m825v();
            c0184cMo4081z0.m819p().mo2487e();
            try {
                ((C0119x) c0184cMo4081z0.f469a).m587S(f3, f3, 0L);
                AbstractC3165h.m6794u(interfaceC1567d, c1902b);
            } finally {
                c0184cMo4081z0.m819p().mo2497p();
                c0184cMo4081z0.m803U(jM825v);
            }
        } finally {
            ((C0119x) interfaceC1567d.mo4081z0().f469a).m598c0(-f13, -f14);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final void m8487o1() {
        this.f13866D.m8481b();
        this.f13867E.m8481b();
        C1902b c1902b = this.f13868F;
        if (c1902b != null) {
            AbstractC5618k.m10165u(this).mo2555a(c1902b);
        }
        this.f13868F = null;
        this.f13869G.setValue(Boolean.FALSE);
        C4215g c4215g = this.f13865C;
        c4215g.f13839g = 1.0f;
        c4215g.f13840h = 1.0f;
        c4215g.f13841i = 9205357640488583168L;
        c4215g.f13842j = EnumC4243m.f13919g;
        c4215g.f13843k = 0.0f;
        c4215g.f13844l = null;
        c4215g.f13845m = 1;
        c4215g.f13852t = Float.NaN;
        c4215g.f13853u = Float.NaN;
        c4215g.f13854v = Float.NaN;
        c4215g.f13855w = Float.NaN;
        c4215g.f13856x = -1;
        c4215g.f13857y = null;
        c4215g.f13858z = Float.NaN;
        c4215g.f13831A = Float.NaN;
        c4215g.f13832B = Float.NaN;
        c4215g.f13833C = null;
        c4215g.f13834D = -1;
        c4215g.f13835E = 0;
        c4215g.f13836F = 0;
        c4215g.f13837G = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public final void m8488p1(InterfaceC1567d interfaceC1567d, C4213e c4213e) {
        int i9;
        C1902b c1902b;
        C4217i c4217i;
        long j3;
        C1902b c1902b2 = c4213e.f13817a;
        if (c1902b2 == null) {
            return;
        }
        float fM4488g = c4213e.f13821e.m4488g();
        int i10 = c4213e.f13820d;
        float f3 = 2 * fM4488g;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (interfaceC1567d.mo4091a() >> 32)) + f3);
        int iIntBitsToFloat2 = (int) (Float.intBitsToFloat((int) (interfaceC1567d.mo4091a() & 4294967295L)) + f3);
        if (i10 <= 1) {
            c4213e.f13822f = 1;
            interfaceC1567d.mo4092y((((long) iIntBitsToFloat) << 32) | (((long) iIntBitsToFloat2) & 4294967295L), new C4216h(AbstractC5618k.m10167w(this).f22771E, this, c4213e, 0), c1902b2);
            if (fM4488g == 0.0f) {
                j3 = 0;
            } else {
                long j4 = -((int) fM4488g);
                j3 = (j4 & 4294967295L) | (j4 << 32);
            }
            c1902b2.m4681i(j3);
            AbstractC3165h.m6794u(interfaceC1567d, c1902b2);
            return;
        }
        if (i10 <= 2) {
            c4213e.f13822f = 2;
            int i11 = iIntBitsToFloat / 2;
            if (i11 < 1) {
                i11 = 1;
            }
            int i12 = iIntBitsToFloat2 / 2;
            interfaceC1567d.mo4092y((((long) i11) << 32) | (((long) (i12 >= 1 ? i12 : 1)) & 4294967295L), new C4216h(AbstractC5618k.m10167w(this).f22771E, this, c4213e, 1), c1902b2);
            m8486n1(interfaceC1567d, c4213e, c1902b2, i10, fM4488g, i10, this.f13874u.mo8473c(), this.f13874u.mo8474d(), iIntBitsToFloat, iIntBitsToFloat2);
            return;
        }
        c4213e.f13822f = 2;
        int i13 = iIntBitsToFloat / 2;
        int i14 = i13 < 1 ? 1 : i13;
        int i15 = iIntBitsToFloat2 / 2;
        int i16 = i15 < 1 ? 1 : i15;
        C1902b c1902bM8480a = c4213e.m8480a(0);
        interfaceC1567d.mo4092y((((long) i14) << 32) | (((long) i16) & 4294967295L), new C4216h(AbstractC5618k.m10167w(this).f22771E, this, c4213e, 2), c1902bM8480a);
        if (i10 == 4) {
            i9 = i10;
            c1902b = c1902b2;
            int i17 = i14 / 2;
            int i18 = i17 < 1 ? 1 : i17;
            int i19 = i16 / 2;
            int i20 = i19 < 1 ? 1 : i19;
            c4217i = this;
            c4217i.m8484l1(interfaceC1567d, c4213e, 0, c1902bM8480a, i14, i16, c1902b, i18, i20, 0.5f, "Downsample2x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
        } else if (i10 == 8) {
            i9 = i10;
            c1902b = c1902b2;
            int i21 = i14 / 4;
            int i22 = i21 < 1 ? 1 : i21;
            int i23 = i16 / 4;
            int i24 = i23 < 1 ? 1 : i23;
            c4217i = this;
            c4217i.m8484l1(interfaceC1567d, c4213e, 0, c1902bM8480a, i14, i16, c1902b, i22, i24, 0.25f, "Downsample4x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
        } else {
            if (i10 != 16) {
                throw new IllegalStateException(("Unsupported scaleFactor: " + i10 + " (must be 1/2/4/8/16)").toString());
            }
            int i25 = i14 / 4;
            int i26 = i25 < 1 ? 1 : i25;
            int i27 = i16 / 4;
            int i28 = i27 < 1 ? 1 : i27;
            C1902b c1902bM8480a2 = c4213e.m8480a(1);
            i9 = i10;
            m8484l1(interfaceC1567d, c4213e, 0, c1902bM8480a, i14, i16, c1902bM8480a2, i26, i28, 0.25f, "Downsample4x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
            int i29 = i26;
            int i30 = i28;
            int i31 = i29 / 2;
            if (i31 < 1) {
                i31 = 1;
            }
            int i32 = i30 / 2;
            if (i32 < 1) {
                i32 = 1;
            }
            c4217i = this;
            c1902b = c1902b2;
            c4217i.m8484l1(interfaceC1567d, c4213e, 1, c1902bM8480a2, i29, i30, c1902b, i31, i32, 0.5f, "Downsample2x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
        }
        c4217i.m8486n1(interfaceC1567d, c4213e, c1902b, i9, fM4488g, i9, c4217i.f13874u.mo8473c(), c4217i.f13874u.mo8474d(), iIntBitsToFloat, iIntBitsToFloat2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final void m8489q1() {
        if (this.f13863A) {
            C4213e c4213e = this.f13866D;
            if (c4213e.f13817a == null) {
                c4213e.f13817a = AbstractC5618k.m10165u(c4213e.f13827k).mo2557c();
            }
            C4215g c4215g = this.f13865C;
            c4215g.f13834D = -1;
            InterfaceC1231l interfaceC1231l = this.f13875v;
            interfaceC1231l.getClass();
            c4215g.f13843k = 0.0f;
            c4215g.f13844l = null;
            c4215g.f13845m = 1;
            interfaceC1231l.invoke(c4215g);
            m8485m1();
            C1902b c1902b = c4213e.f13817a;
            if (c1902b != null) {
                c1902b.m4679g(c4215g.f13844l);
            }
            c4213e.f13821e.m4489h(c4215g.f13843k);
            int i9 = c4215g.f13845m;
            if (i9 < 1) {
                i9 = 1;
            }
            c4213e.f13820d = i9;
            int i10 = c4215g.f13835E;
            int i11 = c4215g.f13836F;
            float f3 = c4215g.f13837G;
            C1845j1 c1845j1 = this.f13869G;
            if (i10 == i11 || f3 <= 0.001f) {
                c1845j1.setValue(Boolean.FALSE);
                return;
            }
            C4213e c4213e2 = this.f13867E;
            if (c4213e2.f13817a == null) {
                c4213e2.f13817a = AbstractC5618k.m10165u(c4213e2.f13827k).mo2557c();
            }
            c4215g.f13834D = i11;
            InterfaceC1231l interfaceC1231l2 = this.f13875v;
            interfaceC1231l2.getClass();
            c4215g.f13843k = 0.0f;
            c4215g.f13844l = null;
            c4215g.f13845m = 1;
            interfaceC1231l2.invoke(c4215g);
            m8485m1();
            C1902b c1902b2 = c4213e2.f13817a;
            if (c1902b2 != null) {
                c1902b2.m4679g(c4215g.f13844l);
            }
            c4213e2.f13821e.m4489h(c4215g.f13843k);
            int i12 = c4215g.f13845m;
            c4213e2.f13820d = i12 >= 1 ? i12 : 1;
            c4215g.f13834D = -1;
            this.f13870H.m4489h(f3);
            c1845j1.setValue(Boolean.TRUE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5627n
    /* JADX INFO: renamed from: w */
    public final void mo1318w(AbstractC5614i1 abstractC5614i1) {
        if (abstractC5614i1.mo10106r1().f23801t) {
            boolean zMo8472b = this.f13874u.mo8472b();
            C1845j1 c1845j1 = this.f13872J;
            if (zMo8472b) {
                c1845j1.setValue(abstractC5614i1);
            } else if (((InterfaceC4428t) c1845j1.getValue()) != null) {
                c1845j1.setValue(null);
            }
        }
    }
}
