package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rd1 extends qd1 {

    /* JADX INFO: renamed from: h */
    public i20 f5381h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rd1(be1 be1Var, WindowInsets windowInsets) {
        super(be1Var, windowInsets);
        this.f5381h = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: b */
    public be1 mo3498b() {
        return be1.m352b(null, this.f5126c.consumeStableInsets());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: c */
    public be1 mo3499c() {
        return be1.m352b(null, this.f5126c.consumeSystemWindowInsets());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: j */
    public final i20 mo3500j() {
        if (this.f5381h == null) {
            WindowInsets windowInsets = this.f5126c;
            this.f5381h = i20.m1512a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f5381h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: o */
    public boolean mo3501o() {
        return this.f5126c.isConsumed();
    }
}
