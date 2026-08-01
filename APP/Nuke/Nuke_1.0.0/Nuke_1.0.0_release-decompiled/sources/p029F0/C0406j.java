package p029F0;

import me.dartcv.nuke.BuildConfig;
import p041H0.EnumC0600j0;
import p041H0.EnumC0602k0;
import p153e1.C2005a;

/* JADX INFO: renamed from: F0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0406j implements InterfaceC0376N {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1233d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0376N f1234e;

    /* JADX INFO: renamed from: f */
    public final Enum f1235f;

    /* JADX INFO: renamed from: g */
    public final Enum f1236g;

    public /* synthetic */ C0406j(InterfaceC0376N interfaceC0376N, Enum r22, Enum r32, int i5) {
        this.f1233d = i5;
        this.f1234e = interfaceC0376N;
        this.f1235f = r22;
        this.f1236g = r32;
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: T */
    public final int mo645T(int i5) {
        switch (this.f1233d) {
        }
        return this.f1234e.mo645T(i5);
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: X */
    public final int mo646X(int i5) {
        switch (this.f1233d) {
        }
        return this.f1234e.mo646X(i5);
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: Z */
    public final int mo647Z(int i5) {
        switch (this.f1233d) {
        }
        return this.f1234e.mo647Z(i5);
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: e */
    public final AbstractC0391b0 mo648e(long j5) {
        switch (this.f1233d) {
            case 0:
                EnumC0422r enumC0422r = (EnumC0422r) this.f1235f;
                EnumC0424s enumC0424s = (EnumC0424s) this.f1236g;
                EnumC0424s enumC0424s2 = EnumC0424s.f1279d;
                EnumC0422r enumC0422r2 = EnumC0422r.f1267e;
                InterfaceC0376N interfaceC0376N = this.f1234e;
                if (enumC0424s == enumC0424s2) {
                    return new C0408k(enumC0422r == enumC0422r2 ? interfaceC0376N.mo646X(C2005a.m3679g(j5)) : interfaceC0376N.mo645T(C2005a.m3679g(j5)), C2005a.m3675c(j5) ? C2005a.m3679g(j5) : 32767, 0);
                }
                return new C0408k(C2005a.m3676d(j5) ? C2005a.m3680h(j5) : 32767, enumC0422r == enumC0422r2 ? interfaceC0376N.mo649f(C2005a.m3680h(j5)) : interfaceC0376N.mo647Z(C2005a.m3680h(j5)), 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                EnumC0380S enumC0380S = (EnumC0380S) this.f1235f;
                EnumC0381T enumC0381T = (EnumC0381T) this.f1236g;
                EnumC0381T enumC0381T2 = EnumC0381T.f1193d;
                EnumC0380S enumC0380S2 = EnumC0380S.f1191e;
                InterfaceC0376N interfaceC0376N2 = this.f1234e;
                if (enumC0381T == enumC0381T2) {
                    return new C0408k(enumC0380S == enumC0380S2 ? interfaceC0376N2.mo646X(C2005a.m3679g(j5)) : interfaceC0376N2.mo645T(C2005a.m3679g(j5)), C2005a.m3675c(j5) ? C2005a.m3679g(j5) : 32767, 1);
                }
                return new C0408k(C2005a.m3676d(j5) ? C2005a.m3680h(j5) : 32767, enumC0380S == enumC0380S2 ? interfaceC0376N2.mo649f(C2005a.m3680h(j5)) : interfaceC0376N2.mo647Z(C2005a.m3680h(j5)), 1);
            default:
                EnumC0600j0 enumC0600j0 = (EnumC0600j0) this.f1235f;
                EnumC0602k0 enumC0602k0 = (EnumC0602k0) this.f1236g;
                EnumC0602k0 enumC0602k02 = EnumC0602k0.f1948d;
                EnumC0600j0 enumC0600j02 = EnumC0600j0.f1945e;
                InterfaceC0376N interfaceC0376N3 = this.f1234e;
                if (enumC0602k0 == enumC0602k02) {
                    return new C0408k(enumC0600j0 == enumC0600j02 ? interfaceC0376N3.mo646X(C2005a.m3679g(j5)) : interfaceC0376N3.mo645T(C2005a.m3679g(j5)), C2005a.m3675c(j5) ? C2005a.m3679g(j5) : 32767, 2);
                }
                return new C0408k(C2005a.m3676d(j5) ? C2005a.m3680h(j5) : 32767, enumC0600j0 == enumC0600j02 ? interfaceC0376N3.mo649f(C2005a.m3680h(j5)) : interfaceC0376N3.mo647Z(C2005a.m3680h(j5)), 2);
        }
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: f */
    public final int mo649f(int i5) {
        switch (this.f1233d) {
        }
        return this.f1234e.mo649f(i5);
    }

    @Override // p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: l */
    public final Object mo650l() {
        switch (this.f1233d) {
        }
        return this.f1234e.mo650l();
    }
}
