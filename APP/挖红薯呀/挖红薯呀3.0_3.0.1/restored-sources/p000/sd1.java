package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sd1 extends rd1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sd1(be1 be1Var, WindowInsets windowInsets) {
        super(be1Var, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: a */
    public be1 mo4063a() {
        return be1.m352b(null, this.f5126c.consumeDisplayCutout());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return false;
        }
        sd1 sd1Var = (sd1) obj;
        return Objects.equals(this.f5126c, sd1Var.f5126c) && Objects.equals(null, null) && qd1.m3215A(this.f5128e, sd1Var.f5128e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    /* JADX INFO: renamed from: g */
    public C0362jo mo4064g() {
        DisplayCutout displayCutout = this.f5126c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0362jo(displayCutout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yd1
    public int hashCode() {
        return this.f5126c.hashCode();
    }
}
