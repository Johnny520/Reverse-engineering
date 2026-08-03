package p000;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: fw */
/* JADX INFO: loaded from: classes.dex */
public final class C1429fw implements InterfaceC1091Za {

    /* JADX INFO: renamed from: a */
    public final C2692wy f5032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C1473gw f5033b;

    public C1429fw(ComponentCallbacks2C1473gw componentCallbacks2C1473gw, C2692wy c2692wy) {
        this.f5033b = componentCallbacks2C1473gw;
        this.f5032a = c2692wy;
    }

    @Override // p000.InterfaceC1091Za
    /* JADX INFO: renamed from: a */
    public final void mo2019a(boolean z) {
        if (z) {
            synchronized (this.f5033b) {
                C2692wy c2692wy = this.f5032a;
                for (InterfaceC1026Xv interfaceC1026Xv : AbstractC2622vD.m5134e((Set) c2692wy.f9265c)) {
                    if (!interfaceC1026Xv.mo1942k() && !interfaceC1026Xv.mo1940i()) {
                        interfaceC1026Xv.clear();
                        if (c2692wy.f9264b) {
                            ((HashSet) c2692wy.f9266d).add(interfaceC1026Xv);
                        } else {
                            interfaceC1026Xv.mo1941j();
                        }
                    }
                }
            }
        }
    }
}
