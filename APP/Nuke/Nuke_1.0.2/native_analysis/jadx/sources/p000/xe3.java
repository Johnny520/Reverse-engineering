package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xe3 extends we3 {
    public xe3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: f */
    public List<Rect> mo4163f(int i) {
        return this.f8938c.getBoundingRects(bf3.m530a(i));
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: g */
    public List<Rect> mo4164g(int i) {
        return this.f8938c.getBoundingRectsIgnoringVisibility(bf3.m530a(i));
    }

    public xe3(cf3 cf3Var, xe3 xe3Var) {
        super(cf3Var, xe3Var);
    }

    @Override // p000.qe3, p000.ye3
    /* JADX INFO: renamed from: q */
    public void mo4169q() {
    }
}
