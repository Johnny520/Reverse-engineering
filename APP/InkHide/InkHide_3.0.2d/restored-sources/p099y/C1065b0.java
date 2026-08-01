package p099y;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: y.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C1065b0 extends C1063a0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1065b0(C1075g0 c1075g0, WindowInsets windowInsets) {
        super(c1075g0, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: a */
    public C1075g0 mo2327a() {
        return C1075g0.m2342c(this.f3686c.consumeDisplayCutout(), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: e */
    public C1077i mo2328e() {
        DisplayCutout displayCutout = this.f3686c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1077i(displayCutout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.AbstractC1061Z, p099y.C1073f0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1065b0)) {
            return false;
        }
        C1065b0 c1065b0 = (C1065b0) obj;
        return Objects.equals(this.f3686c, c1065b0.f3686c) && Objects.equals(this.f3688e, c1065b0.f3688e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    public int hashCode() {
        return this.f3686c.hashCode();
    }
}
