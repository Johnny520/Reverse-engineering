package p000;

import android.os.Build;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class lc0 {

    /* JADX INFO: renamed from: a */
    public kc0 f2997a;

    public lc0(int i, DecelerateInterpolator decelerateInterpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2997a = new jc0(AbstractC0134d0.m795i(i, decelerateInterpolator, j));
        } else {
            this.f2997a = new hc0(i, decelerateInterpolator, j);
        }
    }
}
