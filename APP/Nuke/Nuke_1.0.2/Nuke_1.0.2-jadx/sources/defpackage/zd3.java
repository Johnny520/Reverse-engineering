package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zd3 implements Runnable {
    public final /* synthetic */ View h;
    public final /* synthetic */ ge3 i;
    public final /* synthetic */ dq1 j;
    public final /* synthetic */ ValueAnimator k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zd3(View view, ge3 ge3Var, dq1 dq1Var, ValueAnimator valueAnimator) {
        this.h = view;
        this.i = ge3Var;
        this.j = dq1Var;
        this.k = valueAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        be3.i(this.h, this.i, this.j);
        this.k.start();
    }
}
