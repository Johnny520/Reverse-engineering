package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1163l {

    /* JADX INFO: renamed from: a */
    public int f4048a;

    /* JADX INFO: renamed from: b */
    public int f4049b;

    /* JADX INFO: renamed from: c */
    public int f4050c;

    /* JADX INFO: renamed from: d */
    public int f4051d;

    /* JADX INFO: renamed from: e */
    public Interpolator f4052e;

    /* JADX INFO: renamed from: f */
    public boolean f4053f;

    /* JADX INFO: renamed from: a */
    public final void m2270a(RecyclerView recyclerView) {
        int i = this.f4051d;
        if (i >= 0) {
            this.f4051d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f4053f = false;
        } else if (this.f4053f) {
            Interpolator interpolator = this.f4052e;
            if (interpolator != null && this.f4050c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f4050c;
            if (i2 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.mViewFlinger.m2273c(this.f4048a, this.f4049b, interpolator, i2);
            this.f4053f = false;
        }
    }
}
