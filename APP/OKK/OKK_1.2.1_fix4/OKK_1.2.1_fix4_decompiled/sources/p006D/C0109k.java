package p006D;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: D.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0109k {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f293a;

    public C0109k(DisplayCutout displayCutout) {
        this.f293a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0109k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f293a, ((C0109k) obj).f293a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f293a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f293a + "}";
    }
}
