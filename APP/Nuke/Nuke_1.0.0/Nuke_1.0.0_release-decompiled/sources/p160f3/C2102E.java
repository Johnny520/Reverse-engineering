package p160f3;

import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: f3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2102E extends AbstractC2118V {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7030h;

    /* JADX INFO: renamed from: i */
    public final Object f7031i;

    public /* synthetic */ C2102E(int i5, Object obj) {
        this.f7030h = i5;
        this.f7031i = obj;
    }

    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: k */
    public final boolean mo3884k() {
        switch (this.f7030h) {
        }
        return false;
    }

    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: l */
    public final void mo3885l(Throwable th) {
        switch (this.f7030h) {
            case 0:
                ((InterfaceC2101D) this.f7031i).mo3883a();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((InterfaceC1601c) this.f7031i).mo1h(th);
                break;
            default:
                C2119W c2119w = (C2119W) this.f7031i;
                Object obj = C2122Z.f7062d.get(m3913j());
                if (!(obj instanceof C2149n)) {
                    c2119w.mo278i(AbstractC2162v.m3999u(obj));
                } else {
                    c2119w.mo278i(AbstractC1784a.m3229o(((C2149n) obj).f7092a));
                }
                break;
        }
    }
}
