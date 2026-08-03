package p000;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: ie */
/* JADX INFO: loaded from: classes.dex */
public final class C1543ie {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f5442a;

    public C1543ie(DisplayCutout displayCutout) {
        this.f5442a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1543ie.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5442a, ((C1543ie) obj).f5442a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f5442a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5442a + "}";
    }
}
