package ci;

import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p174m.InterfaceC2644q1;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import p371yg.C6046b;

/* JADX INFO: renamed from: ci.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0586h0 implements InterfaceC2644q1, InterfaceC4233c {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC4233c f1828g;

    /* JADX INFO: renamed from: h */
    public boolean f1829h;

    /* JADX INFO: renamed from: i */
    public boolean f1830i;

    /* JADX INFO: renamed from: j */
    public final C6046b f1831j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0586h0(InterfaceC4233c interfaceC4233c) {
        interfaceC4233c.getClass();
        this.f1828g = interfaceC4233c;
        this.f1831j = new C6046b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: G0 */
    public final int mo1590G0(float f3) {
        return this.f1828g.mo1590G0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: J */
    public final long mo1591J(float f3) {
        return this.f1828g.mo1591J(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: K */
    public final long mo1592K(long j3) {
        return this.f1828g.mo1592K(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: L0 */
    public final long mo1593L0(long j3) {
        return this.f1828g.mo1593L0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: O0 */
    public final float mo1594O0(long j3) {
        return this.f1828g.mo1594O0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: S */
    public final float mo1595S(long j3) {
        return this.f1828g.mo1595S(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p174m.InterfaceC2644q1
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1596T(AbstractC6038c abstractC6038c) {
        C0584g0 c0584g0;
        if (abstractC6038c instanceof C0584g0) {
            c0584g0 = (C0584g0) abstractC6038c;
            int i9 = c0584g0.f1822i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0584g0.f1822i = i9 - Integer.MIN_VALUE;
            } else {
                c0584g0 = new C0584g0(this, abstractC6038c);
            }
        }
        Object obj = c0584g0.f1820g;
        int i10 = c0584g0.f1822i;
        C6046b c6046b = this.f1831j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (!this.f1829h && !this.f1830i) {
                c0584g0.f1822i = 1;
                Object objM10806d = c6046b.m10806d(c0584g0);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM10806d == enumC5799a) {
                    return enumC5799a;
                }
            }
            return Boolean.valueOf(this.f1829h);
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        c6046b.m10808f(null);
        return Boolean.valueOf(this.f1829h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f1828g.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1597e(AbstractC6038c abstractC6038c) {
        C0582f0 c0582f0;
        if (abstractC6038c instanceof C0582f0) {
            c0582f0 = (C0582f0) abstractC6038c;
            int i9 = c0582f0.f1810i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0582f0.f1810i = i9 - Integer.MIN_VALUE;
            } else {
                c0582f0 = new C0582f0(this, abstractC6038c);
            }
        }
        Object obj = c0582f0.f1808g;
        int i10 = c0582f0.f1810i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            c0582f0.f1810i = 1;
            Object objM10806d = this.f1831j.m10806d(c0582f0);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM10806d == enumC5799a) {
                return enumC5799a;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC1089i.m2732I0(obj);
        }
        this.f1829h = false;
        this.f1830i = false;
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: e0 */
    public final long mo1598e0(float f3) {
        return this.f1828g.mo1598e0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: i0 */
    public final float mo1599i0(int i9) {
        return this.f1828g.mo1599i0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: l0 */
    public final float mo1600l0(float f3) {
        return this.f1828g.mo1600l0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f1828g.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: x0 */
    public final float mo1601x0(float f3) {
        return this.f1828g.mo1601x0(f3);
    }
}
