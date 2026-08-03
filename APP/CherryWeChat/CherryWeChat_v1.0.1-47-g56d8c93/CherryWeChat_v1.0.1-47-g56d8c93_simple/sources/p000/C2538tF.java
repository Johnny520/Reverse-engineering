package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: tF */
/* JADX INFO: loaded from: classes.dex */
public final class C2538tF {

    /* JADX INFO: renamed from: a */
    public AbstractC2495sF f8846a;

    public C2538tF(int r3, Interpolator r4, long r5) {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        this.f8846a = new C2452rF(AbstractC0773S.m1578i(r3, r4, r5));
        return;
    L6:
        this.f8846a = new C2358pF(r3, r4, r5);
    }
}
