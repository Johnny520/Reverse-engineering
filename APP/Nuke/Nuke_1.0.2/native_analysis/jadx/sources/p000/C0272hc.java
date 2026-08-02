package p000;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: hc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0272hc extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3950i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ab3 f3951j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0272hc(ab3 ab3Var, int i) {
        super(0);
        this.f3950i = i;
        this.f3951j = ab3Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f3950i;
        a83 a83Var = a83.f116a;
        ab3 ab3Var = this.f3951j;
        switch (i) {
            case 0:
                ab3Var.getLayoutNode().m4345C();
                break;
            case 1:
                if (ab3Var.f4536l && ab3Var.isAttachedToWindow() && ab3Var.getView().getParent() == ab3Var) {
                    bw1 snapshotObserver = ab3Var.getSnapshotObserver();
                    snapshotObserver.f1051a.m5436c(ab3Var, C0799v6.f11770s, ab3Var.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                ab3Var.f134H.saveHierarchyState(sparseArray);
                break;
            case 3:
                ab3Var.getReleaseBlock().mo5j(ab3Var.f134H);
                ab3.m126h(ab3Var);
                break;
            case 4:
                ab3Var.getResetBlock().mo5j(ab3Var.f134H);
                break;
            default:
                ab3Var.getUpdateBlock().mo5j(ab3Var.f134H);
                break;
        }
        return a83Var;
    }
}
