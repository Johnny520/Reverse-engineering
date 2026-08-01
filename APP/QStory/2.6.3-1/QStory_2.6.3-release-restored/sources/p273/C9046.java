package p273;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.animation.core.C1171;
import androidx.recyclerview.widget.C3325;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.C4009;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9046 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f23016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f23017;

    public /* synthetic */ C9046(Object obj, int i) {
        this.f23017 = i;
        this.f23016 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14301(Object obj) {
        Animation animationLoadAnimation;
        int i = this.f23017;
        int i2 = C0328R.anim.anim_dialogx_default_enter;
        Object obj2 = this.f23016;
        int i3 = 0;
        switch (i) {
            case 0:
                C9069 c9069 = (C9069) obj;
                C9068 c9068 = (C9068) obj2;
                C9069 c90692 = c9068.f23090;
                long j = c90692.f11925;
                if (j < 0) {
                    j = 300;
                }
                RelativeLayout relativeLayout = c9068.f23085;
                if (!c9069.m14321()) {
                    relativeLayout.setPadding(0, 0, 0, 0);
                }
                float measuredHeight = c90692.m8616() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c90692.m8616().getMeasuredHeight();
                float f = c9068.f23086.getUnsafePlace().top + 0.0f;
                c9068.f23088 = f;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", measuredHeight, f);
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.setAutoCancel(true);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.addUpdateListener(new C9047(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C1171 c1171 = (C1171) obj2;
                C9062 c9062 = (C9062) c1171.f1438;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c1171.f1441;
                C1171 c11712 = c9062.f23063;
                if (c11712 != null && ((MaxRelativeLayout) c11712.f1441) != null) {
                    int i4 = c9062.f23066;
                    if (i4 == C0328R.anim.anim_dialogx_default_enter && c9062.f23065 == C0328R.anim.anim_dialogx_default_exit) {
                        switch (AbstractC9067.f23081[c9062.f23061.ordinal()]) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                                c9062.f23066 = C0328R.anim.anim_dialogx_top_enter;
                                c9062.f23065 = C0328R.anim.anim_dialogx_top_exit;
                                break;
                            case 2:
                            case 8:
                            case 14:
                            case 15:
                                c9062.f23066 = C0328R.anim.anim_dialogx_left_enter;
                                c9062.f23065 = C0328R.anim.anim_dialogx_left_exit;
                                break;
                            case 6:
                            case 12:
                            case 16:
                            case 17:
                                c9062.f23066 = C0328R.anim.anim_dialogx_right_enter;
                                c9062.f23065 = C0328R.anim.anim_dialogx_right_exit;
                                break;
                            case 7:
                            case 9:
                            case 10:
                            case 11:
                                c9062.f23066 = C0328R.anim.anim_dialogx_bottom_enter;
                                c9062.f23065 = C0328R.anim.anim_dialogx_bottom_exit;
                                break;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c9062.m8617(), c9062.f23066);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                    } else {
                        if (i4 != 0) {
                            i2 = i4;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c9062.m8617(), i2);
                    }
                    long duration = animationLoadAnimation.getDuration();
                    long j2 = c9062.f11925;
                    if (j2 >= 0) {
                        duration = j2;
                    }
                    animationLoadAnimation.setDuration(duration);
                    long duration2 = animationLoadAnimation.getDuration() == 0 ? 300L : animationLoadAnimation.getDuration();
                    long j3 = c9062.f11925;
                    if (j3 >= 0) {
                        duration2 = j3;
                    }
                    animationLoadAnimation.setDuration(duration2);
                    if (maxRelativeLayout != null) {
                        maxRelativeLayout.setVisibility(0);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    }
                    int i5 = c9062.f23062;
                    if (i5 != 0) {
                        ((DialogXBaseRelativeLayout) c1171.f1440).setBackgroundColor(i5);
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(duration2);
                    valueAnimatorOfFloat2.addUpdateListener(new C9058(this, i3));
                    valueAnimatorOfFloat2.start();
                    break;
                }
                break;
            case 2:
                C9052 c9052 = (C9052) obj2;
                c9052.m14305();
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c9052.f23030;
                float safeHeight = dialogXBaseRelativeLayout.getSafeHeight() - c9052.f23037;
                c9052.f23033 = safeHeight;
                if (safeHeight < 0.0f) {
                    c9052.f23033 = 0.0f;
                }
                c9052.m14307(dialogXBaseRelativeLayout.getHeight(), (int) c9052.f23033, false);
                break;
            case 3:
                C9038 c9038 = (C9038) obj2;
                C9037 c9037 = c9038.f22985;
                MaxRelativeLayout maxRelativeLayout2 = c9038.f22979;
                c9037.f11928.getClass();
                c9037.f11928.getClass();
                c9037.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c9037.m8617(), C0328R.anim.anim_dialogx_default_enter);
                Animation animation = (animationLoadAnimation2 != null || maxRelativeLayout2.getAnimation() == null) ? animationLoadAnimation2 : maxRelativeLayout2.getAnimation();
                long duration3 = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
                long j4 = c9037.f11925;
                if (j4 >= 0) {
                    duration3 = j4;
                }
                animationLoadAnimation2.setDuration(duration3);
                animationLoadAnimation2.setInterpolator(new DecelerateInterpolator());
                maxRelativeLayout2.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat3.setDuration(duration3);
                valueAnimatorOfFloat3.addUpdateListener(new C9039(this, i3));
                valueAnimatorOfFloat3.start();
                break;
            case 4:
                C3325 c3325 = (C3325) obj2;
                C9041 c9041 = (C9041) c3325.f7808;
                LinearLayout linearLayout = (LinearLayout) c3325.f7806;
                Activity activityM8617 = c9041.m8617();
                int i6 = c9041.f22997;
                if (i6 != 0) {
                    i2 = i6;
                }
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(activityM8617, i2);
                Animation animation2 = (animationLoadAnimation3 != null || linearLayout.getAnimation() == null) ? animationLoadAnimation3 : linearLayout.getAnimation();
                long duration4 = (animation2 == null || animation2.getDuration() == 0) ? 300L : animation2.getDuration();
                long j5 = c9041.f11925;
                if (j5 >= 0) {
                    duration4 = j5;
                }
                animationLoadAnimation3.setInterpolator(new DecelerateInterpolator(2.0f));
                animationLoadAnimation3.setDuration(duration4);
                animationLoadAnimation3.setFillAfter(true);
                linearLayout.startAnimation(animationLoadAnimation3);
                ((DialogXBaseRelativeLayout) c3325.f7807).animate().setDuration(duration4).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                break;
            default:
                C9029 c9029 = (C9029) obj2;
                C9027 c9027 = c9029.f22937;
                Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(c9027.m8617(), C0328R.anim.anim_dialogx_default_enter);
                Animation animation3 = (animationLoadAnimation4 != null || c9029.f22931.getAnimation() == null) ? animationLoadAnimation4 : c9029.f22931.getAnimation();
                long duration5 = (animation3 == null || animation3.getDuration() == 0) ? 300L : animation3.getDuration();
                long j6 = c9027.f11925;
                if (j6 >= 0) {
                    duration5 = j6;
                }
                animationLoadAnimation4.setInterpolator(new DecelerateInterpolator());
                animationLoadAnimation4.setDuration(duration5);
                c9029.f22931.startAnimation(animationLoadAnimation4);
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat4.setDuration(duration5);
                valueAnimatorOfFloat4.addUpdateListener(new C9032(this, i3));
                valueAnimatorOfFloat4.start();
                c9029.f22932.animate().setDuration(duration5).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14302(Object obj) {
        long j;
        long jM1523;
        int i = this.f23017;
        int i2 = C0328R.anim.anim_dialogx_default_exit;
        Object obj2 = this.f23016;
        int i3 = 1;
        switch (i) {
            case 0:
                C9068 c9068 = (C9068) obj2;
                long j2 = c9068.f23090.f11936;
                j = j2 != -1 ? j2 : 300L;
                RelativeLayout relativeLayout = c9068.f23085;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), relativeLayout.getHeight());
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.addUpdateListener(new C9047(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C1171 c1171 = (C1171) obj2;
                C9062 c9062 = (C9062) c1171.f1438;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c1171.f1441;
                C1171 c11712 = c9062.f23063;
                if (c11712 != null && ((MaxRelativeLayout) c11712.f1441) != null) {
                    int i4 = c9062.f23065;
                    if (i4 != 0) {
                        i2 = i4;
                    }
                    if (maxRelativeLayout != null) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c9062.m8617() == null ? maxRelativeLayout.getContext() : c9062.m8617(), i2);
                        jM1523 = c1171.m1523(animationLoadAnimation);
                        animationLoadAnimation.setDuration(jM1523);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    } else {
                        jM1523 = c1171.m1523(null);
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.setDuration(jM1523);
                    valueAnimatorOfFloat2.addUpdateListener(new C9058(this, i3));
                    valueAnimatorOfFloat2.start();
                    break;
                }
                break;
            case 2:
                C9052 c9052 = (C9052) obj2;
                long j3 = c9052.f23036.f11936;
                j = j3 != -1 ? j3 : 300L;
                MaxRelativeLayout maxRelativeLayout2 = c9052.f23028;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(maxRelativeLayout2, "y", maxRelativeLayout2.getY(), c9052.f23029.getHeight());
                objectAnimatorOfFloat2.setDuration(j);
                objectAnimatorOfFloat2.start();
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat3.setDuration(j);
                valueAnimatorOfFloat3.addUpdateListener(new C4009(this, 4));
                valueAnimatorOfFloat3.start();
                break;
            case 3:
                C9038 c9038 = (C9038) obj2;
                C9037 c9037 = c9038.f22985;
                c9037.f11928.getClass();
                c9037.f11928.getClass();
                c9037.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c9037.m8617(), C0328R.anim.anim_dialogx_default_exit);
                long jM14292 = c9038.m14292(animationLoadAnimation2);
                animationLoadAnimation2.setInterpolator(new AccelerateInterpolator());
                animationLoadAnimation2.setDuration(jM14292);
                c9038.f22979.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat4.setDuration(jM14292);
                valueAnimatorOfFloat4.addUpdateListener(new C9039(this, i3));
                valueAnimatorOfFloat4.start();
                break;
            case 4:
                C3325 c3325 = (C3325) obj2;
                C9041 c9041 = (C9041) c3325.f7808;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c3325.f7807;
                Context context = c9041.m8617() == null ? dialogXBaseRelativeLayout.getContext() : c9041.m8617();
                int i5 = c9041.f23000;
                if (i5 != 0) {
                    i2 = i5;
                }
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, i2);
                long jM5491 = c3325.m5491(animationLoadAnimation3);
                animationLoadAnimation3.setDuration(jM5491);
                animationLoadAnimation3.setFillAfter(true);
                ((LinearLayout) c3325.f7806).startAnimation(animationLoadAnimation3);
                dialogXBaseRelativeLayout.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(jM5491);
                break;
            default:
                C9029 c9029 = (C9029) obj2;
                Context contextM8617 = c9029.f22937.m8617();
                if (contextM8617 == null) {
                    contextM8617 = c9029.f22932.getContext();
                }
                if (contextM8617 != null) {
                    Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(contextM8617, C0328R.anim.anim_dialogx_default_exit);
                    long jM14275 = c9029.m14275(animationLoadAnimation4);
                    animationLoadAnimation4.setDuration(jM14275);
                    animationLoadAnimation4.setInterpolator(new AccelerateInterpolator());
                    c9029.f22931.startAnimation(animationLoadAnimation4);
                    c9029.f22932.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(jM14275);
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat5.setDuration(jM14275);
                    valueAnimatorOfFloat5.addUpdateListener(new C9032(this, i3));
                    valueAnimatorOfFloat5.start();
                    break;
                }
                break;
        }
    }
}
