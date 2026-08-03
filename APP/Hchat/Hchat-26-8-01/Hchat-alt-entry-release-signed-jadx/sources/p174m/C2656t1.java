package p174m;

import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import p371yg.C6046b;

/* JADX INFO: renamed from: m.t1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2656t1 implements InterfaceC2644q1, InterfaceC4233c {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC4233c f8668g;

    /* JADX INFO: renamed from: h */
    public boolean f8669h;

    /* JADX INFO: renamed from: i */
    public boolean f8670i;

    /* JADX INFO: renamed from: j */
    public final C6046b f8671j = new C6046b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2656t1(InterfaceC4233c interfaceC4233c) {
        this.f8668g = interfaceC4233c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: G0 */
    public final int mo1590G0(float f3) {
        return this.f8668g.mo1590G0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: J */
    public final long mo1591J(float f3) {
        return this.f8668g.mo1591J(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: K */
    public final long mo1592K(long j3) {
        return this.f8668g.mo1592K(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: L0 */
    public final long mo1593L0(long j3) {
        return this.f8668g.mo1593L0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: O0 */
    public final float mo1594O0(long j3) {
        return this.f8668g.mo1594O0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: S */
    public final float mo1595S(long j3) {
        return this.f8668g.mo1595S(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p174m.InterfaceC2644q1
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1596T(AbstractC6038c abstractC6038c) {
        C2652s1 c2652s1;
        if (abstractC6038c instanceof C2652s1) {
            c2652s1 = (C2652s1) abstractC6038c;
            int i9 = c2652s1.f8658i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2652s1.f8658i = i9 - Integer.MIN_VALUE;
            } else {
                c2652s1 = new C2652s1(this, abstractC6038c);
            }
        }
        Object obj = c2652s1.f8656g;
        int i10 = c2652s1.f8658i;
        C6046b c6046b = this.f8671j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (!this.f8669h && !this.f8670i) {
                c2652s1.f8658i = 1;
                Object objM10806d = c6046b.m10806d(c2652s1);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM10806d == enumC5799a) {
                    return enumC5799a;
                }
            }
            return Boolean.valueOf(this.f8669h);
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        c6046b.m10808f(null);
        return Boolean.valueOf(this.f8669h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f8668g.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6114e() {
        this.f8669h = true;
        C6046b c6046b = this.f8671j;
        if (c6046b.m10805c()) {
            c6046b.m10808f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: e0 */
    public final long mo1598e0(float f3) {
        return this.f8668g.mo1598e0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: i0 */
    public final float mo1599i0(int i9) {
        return this.f8668g.mo1599i0(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6115j(AbstractC6038c abstractC6038c) {
        C2648r1 c2648r1;
        if (abstractC6038c instanceof C2648r1) {
            c2648r1 = (C2648r1) abstractC6038c;
            int i9 = c2648r1.f8647i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2648r1.f8647i = i9 - Integer.MIN_VALUE;
            } else {
                c2648r1 = new C2648r1(this, abstractC6038c);
            }
        }
        Object obj = c2648r1.f8645g;
        int i10 = c2648r1.f8647i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            c2648r1.f8647i = 1;
            Object objM10806d = this.f8671j.m10806d(c2648r1);
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
        this.f8669h = false;
        this.f8670i = false;
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: l0 */
    public final float mo1600l0(float f3) {
        return this.f8668g.mo1600l0(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f8668g.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: x0 */
    public final float mo1601x0(float f3) {
        return this.f8668g.mo1601x0(f3);
    }
}
