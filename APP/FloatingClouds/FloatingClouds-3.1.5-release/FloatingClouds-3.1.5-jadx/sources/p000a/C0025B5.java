package p000a;

import android.animation.ValueAnimator;
import android.view.View;
import p000a.C0696lh;

/* JADX INFO: renamed from: a.B5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0025B5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f75b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.F5.r():void] */
    public /* synthetic */ C0025B5(C0098F5 c0098f5) {
        this.f75b = c0098f5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f74a) {
            case 0:
                C0098F5 c0098f5 = (C0098F5) this.f75b;
                c0098f5.getClass();
                c0098f5.f1878d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((C0696lh.c) this.f75b).f2629a.f2606d.getParent()).invalidate();
                break;
        }
    }
}
