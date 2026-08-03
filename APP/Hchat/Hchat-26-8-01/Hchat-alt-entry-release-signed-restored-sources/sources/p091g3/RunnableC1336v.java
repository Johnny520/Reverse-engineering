package p091g3;

import android.animation.ValueAnimator;
import android.view.View;
import p014b.C0126e;

/* JADX INFO: renamed from: g3.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1336v implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f4409g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1300b0 f4410h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0126e f4411i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ValueAnimator f4412j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC1336v(View view, C1300b0 c1300b0, C0126e c0126e, ValueAnimator valueAnimator) {
        this.f4409g = view;
        this.f4410h = c1300b0;
        this.f4411i = c0126e;
        this.f4412j = valueAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C1338x.m3567i(this.f4409g, this.f4410h, this.f4411i);
        this.f4412j.start();
    }
}
