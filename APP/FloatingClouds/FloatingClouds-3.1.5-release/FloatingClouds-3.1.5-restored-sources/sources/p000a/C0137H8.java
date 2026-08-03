package p000a;

import io.github.libxposed.api.XposedInterface;

/* JADX INFO: renamed from: a.H8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0137H8 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0742o6 f486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0064D7 f487c;

    public /* synthetic */ C0137H8(C0742o6 c0742o6, InterfaceC0064D7 interfaceC0064D7, int i) {
        this.f485a = i;
        this.f486b = c0742o6;
        this.f487c = interfaceC0064D7;
    }

    public final Object intercept(final XposedInterface.Chain chain) {
        switch (this.f485a) {
            case 0:
                C0631i9.m1482e(chain, "chain");
                final InterfaceC0064D7 interfaceC0064D7 = this.f487c;
                final int i = 1;
                return C0742o6.m1761a(this.f486b, new InterfaceC0819s7() { // from class: a.I8
                    @Override // p000a.InterfaceC0819s7
                    /* JADX INFO: renamed from: a */
                    public final Object mo31a() {
                        switch (i) {
                            case 0:
                                XposedInterface.Chain chain2 = chain;
                                C0631i9.m1479b(chain2);
                                return interfaceC0064D7.mo53f(chain2);
                            default:
                                XposedInterface.Chain chain3 = chain;
                                C0631i9.m1479b(chain3);
                                return interfaceC0064D7.mo53f(chain3);
                        }
                    }
                });
            default:
                C0631i9.m1482e(chain, "chain");
                final InterfaceC0064D7 interfaceC0064D72 = this.f487c;
                final int i2 = 0;
                return C0742o6.m1761a(this.f486b, new InterfaceC0819s7() { // from class: a.I8
                    @Override // p000a.InterfaceC0819s7
                    /* JADX INFO: renamed from: a */
                    public final Object mo31a() {
                        switch (i2) {
                            case 0:
                                XposedInterface.Chain chain2 = chain;
                                C0631i9.m1479b(chain2);
                                return interfaceC0064D72.mo53f(chain2);
                            default:
                                XposedInterface.Chain chain3 = chain;
                                C0631i9.m1479b(chain3);
                                return interfaceC0064D72.mo53f(chain3);
                        }
                    }
                });
        }
    }
}
