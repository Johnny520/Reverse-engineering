package p227r;

import p056K2.C0891q;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p127Z2.AbstractC1784a;
import p153e1.InterfaceC2007c;
import p207n3.C2695c;

/* JADX INFO: renamed from: r.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2989g0 implements InterfaceC2007c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2007c f9460d;

    /* JADX INFO: renamed from: e */
    public boolean f9461e;

    /* JADX INFO: renamed from: f */
    public boolean f9462f;

    /* JADX INFO: renamed from: g */
    public final C2695c f9463g = new C2695c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2989g0(InterfaceC2007c interfaceC2007c) {
        this.f9460d = interfaceC2007c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: C */
    public final long mo266C(float f2) {
        return this.f9460d.mo266C(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: E */
    public final long mo267E(long j5) {
        return this.f9460d.mo267E(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: G */
    public final float mo268G(float f2) {
        return this.f9460d.mo268G(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: M */
    public final float mo269M(long j5) {
        return this.f9460d.mo269M(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: S */
    public final int mo270S(float f2) {
        return this.f9460d.mo270S(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5198a() {
        this.f9462f = true;
        C2695c c2695c = this.f9463g;
        if (c2695c.m4690c()) {
            c2695c.m4693f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f9460d.mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: c0 */
    public final long mo273c0(long j5) {
        return this.f9460d.mo273c0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5199d() {
        this.f9461e = true;
        C2695c c2695c = this.f9463g;
        if (c2695c.m4690c()) {
            c2695c.m4693f(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5200e(AbstractC1178c abstractC1178c) {
        C2985e0 c2985e0;
        if (abstractC1178c instanceof C2985e0) {
            c2985e0 = (C2985e0) abstractC1178c;
            int i5 = c2985e0.f9452i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2985e0.f9452i = i5 - Integer.MIN_VALUE;
            } else {
                c2985e0 = new C2985e0(this, abstractC1178c);
            }
        }
        Object obj = c2985e0.f9450g;
        int i6 = c2985e0.f9452i;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            c2985e0.f9452i = 1;
            Object objM4691d = this.f9463g.m4691d(c2985e0);
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            if (objM4691d == enumC1152a) {
                return enumC1152a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
        }
        this.f9461e = false;
        this.f9462f = false;
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: e0 */
    public final float mo276e0(long j5) {
        return this.f9460d.mo276e0(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5201f(AbstractC1178c abstractC1178c) {
        C2987f0 c2987f0;
        if (abstractC1178c instanceof C2987f0) {
            c2987f0 = (C2987f0) abstractC1178c;
            int i5 = c2987f0.f9457i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2987f0.f9457i = i5 - Integer.MIN_VALUE;
            } else {
                c2987f0 = new C2987f0(this, abstractC1178c);
            }
        }
        Object obj = c2987f0.f9455g;
        int i6 = c2987f0.f9457i;
        C2695c c2695c = this.f9463g;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            if (!this.f9461e && !this.f9462f) {
                c2987f0.f9457i = 1;
                Object objM4691d = c2695c.m4691d(c2987f0);
                EnumC1152a enumC1152a = EnumC1152a.f3788d;
                if (objM4691d == enumC1152a) {
                    return enumC1152a;
                }
            }
            return Boolean.valueOf(this.f9461e);
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1784a.m3205S(obj);
        c2695c.m4693f(null);
        return Boolean.valueOf(this.f9461e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: k0 */
    public final long mo280k0(float f2) {
        return this.f9460d.mo280k0(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f9460d.mo282p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: q0 */
    public final float mo283q0(int i5) {
        return this.f9460d.mo283q0(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: u0 */
    public final float mo284u0(float f2) {
        return this.f9460d.mo284u0(f2);
    }
}
