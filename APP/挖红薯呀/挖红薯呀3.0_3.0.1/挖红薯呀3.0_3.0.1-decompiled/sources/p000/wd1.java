package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class wd1 extends vd1 {

    /* JADX INFO: renamed from: j */
    public static final be1 f7113j = be1.m352b(null, WindowInsets.CONSUMED);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wd1(be1 be1Var, WindowInsets windowInsets) {
        super(be1Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ud1, p000.qd1, p000.yd1
    /* JADX INFO: renamed from: h */
    public i20 mo3221h(int i) {
        return i20.m1513b(this.f5126c.getInsets(ae1.m131a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ud1, p000.qd1, p000.yd1
    /* JADX INFO: renamed from: i */
    public i20 mo3222i(int i) {
        return i20.m1513b(this.f5126c.getInsetsIgnoringVisibility(ae1.m131a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ud1, p000.yd1
    /* JADX INFO: renamed from: q */
    public boolean mo4317q(int i) {
        return this.f5126c.isVisible(ae1.m131a(i));
    }

    @Override // p000.qd1, p000.yd1
    /* JADX INFO: renamed from: l */
    public void mo3224l(View view) {
    }
}
