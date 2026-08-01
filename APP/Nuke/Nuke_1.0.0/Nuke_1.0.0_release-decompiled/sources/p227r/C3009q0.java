package p227r;

import p027E4.C0330q;
import p041H0.AbstractC0601k;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p112W2.InterfaceC1599a;
import p198m0.C2567A;
import p198m0.C2584o;
import p198m0.EnumC2594y;

/* JADX INFO: renamed from: r.q0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3009q0 implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9522d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3015t0 f9523e;

    public /* synthetic */ C3009q0(C3015t0 c3015t0, int i5) {
        this.f9522d = i5;
        this.f9523e = c3015t0;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f9522d) {
            case 0:
                return Boolean.valueOf(this.f9523e.f7199q);
            default:
                C2567A c2567a = this.f9523e.f9554S;
                if (!c2567a.f7186d.f7199q) {
                    return null;
                }
                EnumC2594y enumC2594yM4488O0 = c2567a.m4488O0();
                int iOrdinal = enumC2594yM4488O0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    throw new C0330q();
                }
                if (enumC2594yM4488O0.m4540a()) {
                    return c2567a.m4486M0(null);
                }
                C2567A c2567aM4531f = ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4531f();
                if (c2567aM4531f != null) {
                    return c2567aM4531f.m4486M0(AbstractC0601k.m1043s(c2567a));
                }
                return null;
        }
    }
}
