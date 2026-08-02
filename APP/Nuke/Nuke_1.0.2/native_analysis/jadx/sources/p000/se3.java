package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class se3 extends re3 {
    public se3(cf3 cf3Var, WindowInsets windowInsets) {
        super(cf3Var, windowInsets);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: a */
    public cf3 mo4857a() {
        return cf3.m769c(null, this.f8938c.consumeDisplayCutout());
    }

    @Override // p000.qe3, p000.ye3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3)) {
            return false;
        }
        se3 se3Var = (se3) obj;
        return Objects.equals(this.f8938c, se3Var.f8938c) && Objects.equals(this.f8942g, se3Var.f8942g) && qe3.m4155M(this.f8943h, se3Var.f8943h);
    }

    @Override // p000.ye3
    /* JADX INFO: renamed from: h */
    public t90 mo4858h() {
        DisplayCutout displayCutout = this.f8938c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new t90(displayCutout);
    }

    @Override // p000.ye3
    public int hashCode() {
        return this.f8938c.hashCode();
    }

    public se3(cf3 cf3Var, se3 se3Var) {
        super(cf3Var, se3Var);
    }
}
