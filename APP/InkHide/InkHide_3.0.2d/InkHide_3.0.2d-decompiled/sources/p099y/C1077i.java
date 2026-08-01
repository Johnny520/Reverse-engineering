package p099y;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: y.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1077i {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f3714a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1077i(DisplayCutout displayCutout) {
        this.f3714a = displayCutout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1077i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3714a, ((C1077i) obj).f3714a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3714a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3714a + "}";
    }
}
