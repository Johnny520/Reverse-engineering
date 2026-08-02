package p000;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zd3 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f13842h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ge3 f13843i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ dq1 f13844j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ValueAnimator f13845k;

    public zd3(View view, ge3 ge3Var, dq1 dq1Var, ValueAnimator valueAnimator) {
        this.f13842h = view;
        this.f13843i = ge3Var;
        this.f13844j = dq1Var;
        this.f13845k = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        be3.m518i(this.f13842h, this.f13843i, this.f13844j);
        this.f13845k.start();
    }
}
