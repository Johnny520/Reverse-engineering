package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hc extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ab3 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc(ab3 ab3Var, int i) {
        super(0);
        this.i = i;
        this.j = ab3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.i;
        a83 a83Var = a83.a;
        ab3 ab3Var = this.j;
        switch (i) {
            case 0:
                ab3Var.getLayoutNode().C();
                break;
            case 1:
                if (ab3Var.l && ab3Var.isAttachedToWindow() && ab3Var.getView().getParent() == ab3Var) {
                    bw1 snapshotObserver = ab3Var.getSnapshotObserver();
                    snapshotObserver.a.c(ab3Var, v6.s, ab3Var.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                ab3Var.H.saveHierarchyState(sparseArray);
                break;
            case 3:
                ab3Var.getReleaseBlock().j(ab3Var.H);
                ab3.h(ab3Var);
                break;
            case 4:
                ab3Var.getResetBlock().j(ab3Var.H);
                break;
            default:
                ab3Var.getUpdateBlock().j(ab3Var.H);
                break;
        }
        return a83Var;
    }
}
