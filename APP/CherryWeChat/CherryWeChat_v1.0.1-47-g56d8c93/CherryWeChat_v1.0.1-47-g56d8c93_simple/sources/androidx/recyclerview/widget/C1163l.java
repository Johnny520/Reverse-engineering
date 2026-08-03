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
    public final void m2270a(RecyclerView r6) {
        int r0 = this.f4051d;
        if (r0 < 0) goto L7;
        this.f4051d = -1;
        r6.jumpToPositionForSmoothScroller(r0);
        this.f4053f = false;
        return;
    L7:
        if (this.f4053f == false) goto L21;
        Interpolator r02 = this.f4052e;
        if (r02 != null) goto L11;
    L15:
        int r3 = this.f4050c;
        if (r3 < 1) goto L20;
        r6.mViewFlinger.m2273c(this.f4048a, this.f4049b, r02, r3);
        this.f4053f = false;
        return;
    L20:
        throw new IllegalStateException("Scroll duration must be a positive number");
    L11:
        if (this.f4050c >= 1) goto L15;
        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
    }
}
