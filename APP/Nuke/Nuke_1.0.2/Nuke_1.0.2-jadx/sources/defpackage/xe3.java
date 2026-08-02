package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xe3 extends we3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xe3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qe3, defpackage.ye3
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(bf3.a(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qe3, defpackage.ye3
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(bf3.a(i));
    }

    public xe3(cf3 cf3Var, xe3 xe3Var) {
        super(cf3Var, xe3Var);
    }

    @Override // defpackage.qe3, defpackage.ye3
    public void q() {
    }
}
