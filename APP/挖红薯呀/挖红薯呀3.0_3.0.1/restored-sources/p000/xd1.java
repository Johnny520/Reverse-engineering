package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 extends wd1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xd1(be1 be1Var, WindowInsets windowInsets) {
        super(be1Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qd1, p000.yd1
    /* JADX INFO: renamed from: e */
    public List<Rect> mo3219e(int i) {
        return this.f5126c.getBoundingRects(ae1.m131a(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qd1, p000.yd1
    /* JADX INFO: renamed from: f */
    public List<Rect> mo3220f(int i) {
        return this.f5126c.getBoundingRectsIgnoringVisibility(ae1.m131a(i));
    }

    @Override // p000.qd1, p000.yd1
    /* JADX INFO: renamed from: m */
    public void mo3225m() {
    }
}
