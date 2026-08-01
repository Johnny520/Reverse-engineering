package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class ud1 extends td1 {

    /* JADX INFO: renamed from: i */
    public static final be1 f6202i = be1.m352b(null, WindowInsets.CONSUMED);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ud1(be1 be1Var, WindowInsets windowInsets) {
        super(be1Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qd1, p000.yd1
    /* JADX INFO: renamed from: h */
    public i20 mo3221h(int i) {
        return i20.m1513b(this.f5126c.getInsets(zd1.m5584a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qd1, p000.yd1
    /* JADX INFO: renamed from: i */
    public i20 mo3222i(int i) {
        return i20.m1513b(this.f5126c.getInsetsIgnoringVisibility(zd1.m5584a(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: q */
    public boolean mo4317q(int i) {
        return this.f5126c.isVisible(zd1.m5584a(i));
    }

    @Override // p000.yd1
    /* JADX INFO: renamed from: d */
    public final void mo4316d(View view) {
    }
}
