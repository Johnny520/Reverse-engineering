package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ge3 {

    /* JADX INFO: renamed from: a */
    public fe3 f3471a;

    public ge3(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3471a = new ee3(AbstractC0153e4.m1231j(i, interpolator, j));
        } else {
            this.f3471a = new be3(i, interpolator, j);
        }
    }
}
