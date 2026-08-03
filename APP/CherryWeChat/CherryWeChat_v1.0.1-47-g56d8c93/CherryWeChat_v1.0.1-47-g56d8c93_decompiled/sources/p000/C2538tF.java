package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: tF */
/* JADX INFO: loaded from: classes.dex */
public final class C2538tF {

    /* JADX INFO: renamed from: a */
    public AbstractC2495sF f8846a;

    public C2538tF(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f8846a = new C2452rF(AbstractC0773S.m1578i(i, interpolator, j));
        } else {
            this.f8846a = new C2358pF(i, interpolator, j);
        }
    }
}
