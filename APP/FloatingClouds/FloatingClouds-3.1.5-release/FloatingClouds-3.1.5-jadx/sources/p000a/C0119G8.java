package p000a;

import io.github.libxposed.api.XposedInterface;

/* JADX INFO: renamed from: a.G8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0119G8 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0064D7 f384b;

    public /* synthetic */ C0119G8(InterfaceC0064D7 interfaceC0064D7, int i) {
        this.f383a = i;
        this.f384b = interfaceC0064D7;
    }

    public final Object intercept(XposedInterface.Chain chain) {
        switch (this.f383a) {
            case 0:
                C0631i9.m1482e(chain, "chain");
                break;
            case 1:
                C0631i9.m1482e(chain, "chain");
                break;
            case 2:
                C0631i9.m1482e(chain, "chain");
                break;
            case 3:
                C0631i9.m1482e(chain, "chain");
                break;
            default:
                C0631i9.m1482e(chain, "chain");
                break;
        }
        return this.f384b.mo53f(chain);
    }
}
