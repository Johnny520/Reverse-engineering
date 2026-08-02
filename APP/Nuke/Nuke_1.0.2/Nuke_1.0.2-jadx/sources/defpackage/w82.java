package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w82 implements vy {
    public final er2 a;
    public final /* synthetic */ x82 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w82(x82 x82Var, er2 er2Var) {
        this.b = x82Var;
        this.a = er2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vy
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                er2 er2Var = this.a;
                for (l82 l82Var : b93.e((Set) er2Var.j)) {
                    if (!l82Var.j() && !l82Var.h()) {
                        l82Var.clear();
                        if (er2Var.i) {
                            ((HashSet) er2Var.k).add(l82Var);
                        } else {
                            l82Var.i();
                        }
                    }
                }
            }
        }
    }
}
