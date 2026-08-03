package p000a;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000a.C0354Ta;

/* JADX INFO: renamed from: a.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0852u2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f3351a;

    public C0852u2(BottomSheetBehavior bottomSheetBehavior) {
        this.f3351a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C0354Ta c0354Ta = this.f3351a.f5473i;
        if (c0354Ta != null) {
            C0354Ta.b bVar = c0354Ta.f1310a;
            if (bVar.f1342i != fFloatValue) {
                bVar.f1342i = fFloatValue;
                c0354Ta.f1314e = true;
                c0354Ta.invalidateSelf();
            }
        }
    }
}
