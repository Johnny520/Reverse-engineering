package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g7 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ h7 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7(h7 h7Var, int i) {
        super(1);
        this.i = i;
        this.j = h7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        h7 h7Var = this.j;
        switch (i) {
            case 0:
                View view = h7Var.k;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                jl2 jl2Var = (jl2) obj;
                if (jl2Var.i.contains(jl2Var)) {
                    bw1 snapshotObserver = h7Var.k.getSnapshotObserver();
                    snapshotObserver.a.c(jl2Var, h7Var.T, new t6(1, jl2Var, h7Var));
                }
                return a83.a;
        }
    }
}
