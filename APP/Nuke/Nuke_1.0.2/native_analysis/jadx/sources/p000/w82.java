package p000;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w82 implements InterfaceC0827vy {

    /* JADX INFO: renamed from: a */
    public final er2 f12404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x82 f12405b;

    public w82(x82 x82Var, er2 er2Var) {
        this.f12405b = x82Var;
        this.f12404a = er2Var;
    }

    @Override // p000.InterfaceC0827vy
    /* JADX INFO: renamed from: a */
    public final void mo583a(boolean z) {
        if (z) {
            synchronized (this.f12405b) {
                er2 er2Var = this.f12404a;
                for (l82 l82Var : b93.m498e((Set) er2Var.f2577j)) {
                    if (!l82Var.mo1027j() && !l82Var.mo1025h()) {
                        l82Var.clear();
                        if (er2Var.f2576i) {
                            ((HashSet) er2Var.f2578k).add(l82Var);
                        } else {
                            l82Var.mo1026i();
                        }
                    }
                }
            }
        }
    }
}
