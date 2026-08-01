package p229r1;

import android.os.Build;
import android.view.animation.Interpolator;
import p010B3.AbstractC0228g;

/* JADX INFO: renamed from: r1.G */
/* JADX INFO: loaded from: classes.dex */
public final class C3046G {

    /* JADX INFO: renamed from: a */
    public AbstractC3045F f9741a;

    public C3046G(int i5, Interpolator interpolator, long j5) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9741a = new C3044E(AbstractC0228g.m371i(i5, interpolator, j5));
        } else {
            this.f9741a = new C3042C(i5, interpolator, j5);
        }
    }
}
