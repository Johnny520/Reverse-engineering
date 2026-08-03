package p006D;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: D.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0096d0 {

    /* JADX INFO: renamed from: a */
    public AbstractC0094c0 f252a;

    public C0096d0(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f252a = new C0092b0(AbstractC0130v.m445j(i2, interpolator, j2));
        } else {
            this.f252a = new C0088Z(i2, interpolator, j2);
        }
    }
}
