package p000;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.Toast;

/* JADX INFO: renamed from: hq */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC1511hq implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinearLayout f5352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2112jq f5353b;

    public AnimationAnimationListenerC1511hq(LinearLayout linearLayout, C2112jq c2112jq) {
        this.f5352a = linearLayout;
        this.f5353b = c2112jq;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        String strM2791I = C1456gf.m2791I();
        LinearLayout linearLayout = this.f5352a;
        Object systemService = linearLayout.getContext().getSystemService(AbstractC0295Gu.m625r(-809803198756917L));
        AbstractC0295Gu.m625r(-809846148429877L);
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-826089714743349L), strM2791I));
        AbstractC0295Gu.m625r(-782302523160629L);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.05f, 0.95f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleAnimation.setAnimationListener(new AnimationAnimationListenerC0730Qz(linearLayout, 2));
        linearLayout.startAnimation(scaleAnimation);
        AbstractC0295Gu.m625r(-781980400613429L);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C0733R2(0, linearLayout));
        AbstractC0295Gu.m625r(-782001875449909L);
        valueAnimatorOfFloat.start();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2260n3(13, valueAnimatorOfFloat, linearLayout), 1000L);
        C2112jq c2112jq = this.f5353b;
        try {
            try {
                Toast.makeText(c2112jq.getContext(), AbstractC0295Gu.m625r(-825398225008693L), 0).show();
            } catch (Exception unused) {
                Toast toast = new Toast(c2112jq.getContext());
                toast.setDuration(0);
                toast.setText(AbstractC0295Gu.m625r(-825458354550837L));
                toast.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
