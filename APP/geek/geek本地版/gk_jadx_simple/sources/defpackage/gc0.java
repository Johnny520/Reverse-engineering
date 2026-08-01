package defpackage;

import android.os.Build;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 {
    public fc0 a;

    public gc0(int r3, DecelerateInterpolator r4, long r5) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        this.a = new ec0(d0.i(r3, r4, r5));
        return;
    L6:
        this.a = new cc0(r3, r4, r5);
    }
}
