package p267s1;

import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p100h0.C1531k0;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3564g;
import p276sf.C3959f;
import p293u2.InterfaceC4233c;
import p339x1.AbstractC5618k;
import p352xf.EnumC5799a;
import p357y1.InterfaceC5905l2;
import p370yf.AbstractC6036a;
import p370yf.AbstractC6038c;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: s1.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3904k0 implements InterfaceC4233c, InterfaceC5557c {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3906l0 f12806g;

    /* JADX INFO: renamed from: h */
    public final C3564g f12807h;

    /* JADX INFO: renamed from: i */
    public C3564g f12808i;

    /* JADX INFO: renamed from: j */
    public EnumC3905l f12809j = EnumC3905l.f12813h;

    /* JADX INFO: renamed from: k */
    public final C5562h f12810k = C5562h.f22661g;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3906l0 f12811l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3904k0(C3906l0 c3906l0, C3564g c3564g) {
        this.f12811l = c3906l0;
        this.f12806g = c3906l0;
        this.f12807h = c3564g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final InterfaceC5905l2 m8099B() {
        return AbstractC5618k.m10167w(this.f12811l).f22773G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8100C(long j3, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        C3900i0 c3900i0;
        C3560e1 c3560e1M7563q;
        Throwable th2;
        C3564g c3564g;
        if (abstractC6038c instanceof C3900i0) {
            c3900i0 = (C3900i0) abstractC6038c;
            int i9 = c3900i0.f12794j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3900i0.f12794j = i9 - Integer.MIN_VALUE;
            } else {
                c3900i0 = new C3900i0(this, abstractC6038c);
            }
        }
        Object objInvoke = c3900i0.f12792h;
        int i10 = c3900i0.f12794j;
        if (i10 != 0) {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3560e1M7563q = c3900i0.f12791g;
            try {
                AbstractC1089i.m2732I0(objInvoke);
                c3560e1M7563q.mo7485a(C3885b.f12745h);
                return objInvoke;
            } catch (Throwable th3) {
                th2 = th3;
                c3560e1M7563q.mo7485a(C3885b.f12745h);
                throw th2;
            }
        }
        AbstractC1089i.m2732I0(objInvoke);
        if (j3 <= 0 && (c3564g = this.f12808i) != null) {
            c3564g.resumeWith(new C3959f(new C3907m(j3)));
        }
        c3560e1M7563q = AbstractC3603v.m7563q(this.f12811l.m10550Y0(), null, new C1531k0(j3, this, (InterfaceC5557c) null, 1), 3);
        try {
            c3900i0.f12791g = c3560e1M7563q;
            c3900i0.f12794j = 1;
            objInvoke = interfaceC1235p.invoke(this, c3900i0);
            Object obj = EnumC5799a.f23547g;
            if (objInvoke == obj) {
                return obj;
            }
            c3560e1M7563q.mo7485a(C3885b.f12745h);
            return objInvoke;
        } catch (Throwable th4) {
            th2 = th4;
            c3560e1M7563q.mo7485a(C3885b.f12745h);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8101E(long j3, InterfaceC1235p interfaceC1235p, AbstractC6036a abstractC6036a) {
        C3902j0 c3902j0;
        if (abstractC6036a instanceof C3902j0) {
            c3902j0 = (C3902j0) abstractC6036a;
            int i9 = c3902j0.f12799i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c3902j0.f12799i = i9 - Integer.MIN_VALUE;
            } else {
                c3902j0 = new C3902j0(this, abstractC6036a);
            }
        }
        Object obj = c3902j0.f12797g;
        int i10 = c3902j0.f12799i;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC1089i.m2732I0(obj);
                    return obj;
                }
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
            c3902j0.f12799i = 1;
            Object objM8100C = m8100C(j3, interfaceC1235p, c3902j0);
            Object obj2 = EnumC5799a.f23547g;
            return objM8100C == obj2 ? obj2 : objM8100C;
        } catch (C3907m unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: G0 */
    public final int mo1590G0(float f3) {
        return this.f12806g.mo1590G0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: J */
    public final long mo1591J(float f3) {
        return this.f12806g.mo1591J(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: K */
    public final long mo1592K(long j3) {
        return this.f12806g.mo1592K(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: L0 */
    public final long mo1593L0(long j3) {
        return this.f12806g.mo1593L0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: O0 */
    public final float mo1594O0(long j3) {
        return this.f12806g.mo1594O0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: S */
    public final float mo1595S(long j3) {
        return this.f12806g.mo1595S(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f12806g.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m8102e(EnumC3905l enumC3905l, InterfaceC5557c interfaceC5557c) {
        C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(interfaceC5557c));
        c3564g.m7513p();
        this.f12809j = enumC3905l;
        this.f12808i = c3564g;
        return c3564g.m7512o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: e0 */
    public final long mo1598e0(float f3) {
        return this.f12806g.mo1598e0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return this.f12810k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: i0 */
    public final float mo1599i0(int i9) {
        return this.f12806g.mo1599i0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: l0 */
    public final float mo1600l0(float f3) {
        return f3 / this.f12806g.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final long m8103m() {
        C3906l0 c3906l0 = this.f12811l;
        long jMo1593L0 = c3906l0.mo1593L0(AbstractC5618k.m10167w(c3906l0).f22773G.mo10227d());
        long j3 = c3906l0.f12820E;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1593L0 >> 32)) - ((int) (j3 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1593L0 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f12806g.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        C3906l0 c3906l0 = this.f12811l;
        synchronized (c3906l0.f12817B) {
            c3906l0.f12816A.m5064j(this);
        }
        this.f12807h.resumeWith(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: x0 */
    public final float mo1601x0(float f3) {
        return this.f12806g.mo1333d() * f3;
    }
}
