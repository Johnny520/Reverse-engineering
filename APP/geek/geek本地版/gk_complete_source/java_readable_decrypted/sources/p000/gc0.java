package p000;

import android.os.Build;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 {

    /* JADX INFO: renamed from: a */
    public fc0 f2123a;

    public gc0(int i, DecelerateInterpolator decelerateInterpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2123a = new ec0(AbstractC0134d0.m845i(i, decelerateInterpolator, j));
        } else {
            this.f2123a = new cc0(i, decelerateInterpolator, j);
        }
    }
}
