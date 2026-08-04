package yyds;

import android.animation.ValueAnimator;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: yyds.ᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2371 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11684;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2207 f11685;

    public /* synthetic */ C2371(C2207 c2207, int i) {
        this.f11684 = i;
        this.f11685 = c2207;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f11684;
        C2207 c2207 = this.f11685;
        switch (i) {
            case 0:
                ((DialogXBaseRelativeLayout) ((C2283) c2207.f10909).f11231).m299(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((DialogXBaseRelativeLayout) ((C2283) c2207.f10909).f11231).m299(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
