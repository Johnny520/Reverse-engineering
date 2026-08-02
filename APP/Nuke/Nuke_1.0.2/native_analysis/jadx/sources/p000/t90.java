package p000;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f10619a;

    public t90(DisplayCutout displayCutout) {
        this.f10619a = displayCutout;
    }

    /* JADX INFO: renamed from: a */
    public final zz0 m5142a() {
        return Build.VERSION.SDK_INT >= 30 ? zz0.m6519c(AbstractC0227g4.m1795c(this.f10619a)) : zz0.f14156e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t90.class != obj.getClass()) {
            return false;
        }
        return this.f10619a.equals(((t90) obj).f10619a);
    }

    public final int hashCode() {
        return this.f10619a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f10619a + "}";
    }
}
