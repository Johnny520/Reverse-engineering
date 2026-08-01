package p257;

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
import androidx.compose.animation.core.C0325;
import androidx.recyclerview.widget.C2492;
import com.bumptech.glide.AbstractC3064;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.C3176;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8216 extends AbstractC3064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f22672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f22673;

    public /* synthetic */ C8216(Object obj, int i) {
        this.f22672 = i;
        this.f22673 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m13725(Object obj) {
        Animation animationLoadAnimation;
        int i = this.f22672;
        int i2 = R.anim.anim_dialogx_default_enter;
        Object obj2 = this.f22673;
        int i3 = 0;
        switch (i) {
            case 0:
                C8239 c8239 = (C8239) obj;
                C8238 c8238 = (C8238) obj2;
                C8239 c82392 = c8238.f22746;
                long j = c82392.f11575;
                if (j < 0) {
                    j = 300;
                }
                RelativeLayout relativeLayout = c8238.f22741;
                if (!c8239.m13745()) {
                    relativeLayout.setPadding(0, 0, 0, 0);
                }
                float measuredHeight = c82392.m8070() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c82392.m8070().getMeasuredHeight();
                float f = c8238.f22742.getUnsafePlace().top + 0.0f;
                c8238.f22744 = f;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", measuredHeight, f);
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.setAutoCancel(true);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.addUpdateListener(new C8217(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C0325 c0325 = (C0325) obj2;
                C8232 c8232 = (C8232) c0325.f1093;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0325.f1096;
                C0325 c03252 = c8232.f22719;
                if (c03252 != null && ((MaxRelativeLayout) c03252.f1096) != null) {
                    int i4 = c8232.f22722;
                    if (i4 == R.anim.anim_dialogx_default_enter && c8232.f22721 == R.anim.anim_dialogx_default_exit) {
                        switch (AbstractC8237.f22737[c8232.f22717.ordinal()]) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                                c8232.f22722 = R.anim.anim_dialogx_top_enter;
                                c8232.f22721 = R.anim.anim_dialogx_top_exit;
                                break;
                            case 2:
                            case 8:
                            case 14:
                            case 15:
                                c8232.f22722 = R.anim.anim_dialogx_left_enter;
                                c8232.f22721 = R.anim.anim_dialogx_left_exit;
                                break;
                            case 6:
                            case 12:
                            case 16:
                            case 17:
                                c8232.f22722 = R.anim.anim_dialogx_right_enter;
                                c8232.f22721 = R.anim.anim_dialogx_right_exit;
                                break;
                            case 7:
                            case 9:
                            case 10:
                            case 11:
                                c8232.f22722 = R.anim.anim_dialogx_bottom_enter;
                                c8232.f22721 = R.anim.anim_dialogx_bottom_exit;
                                break;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c8232.m8071(), c8232.f22722);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                    } else {
                        if (i4 != 0) {
                            i2 = i4;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c8232.m8071(), i2);
                    }
                    long duration = animationLoadAnimation.getDuration();
                    long j2 = c8232.f11575;
                    if (j2 >= 0) {
                        duration = j2;
                    }
                    animationLoadAnimation.setDuration(duration);
                    long duration2 = animationLoadAnimation.getDuration() == 0 ? 300L : animationLoadAnimation.getDuration();
                    long j3 = c8232.f11575;
                    if (j3 >= 0) {
                        duration2 = j3;
                    }
                    animationLoadAnimation.setDuration(duration2);
                    if (maxRelativeLayout != null) {
                        maxRelativeLayout.setVisibility(0);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    }
                    int i5 = c8232.f22718;
                    if (i5 != 0) {
                        ((DialogXBaseRelativeLayout) c0325.f1095).setBackgroundColor(i5);
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(duration2);
                    valueAnimatorOfFloat2.addUpdateListener(new C8228(this, i3));
                    valueAnimatorOfFloat2.start();
                    break;
                }
                break;
            case 2:
                C8222 c8222 = (C8222) obj2;
                c8222.m13729();
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8222.f22686;
                float safeHeight = dialogXBaseRelativeLayout.getSafeHeight() - c8222.f22693;
                c8222.f22689 = safeHeight;
                if (safeHeight < 0.0f) {
                    c8222.f22689 = 0.0f;
                }
                c8222.m13731(dialogXBaseRelativeLayout.getHeight(), (int) c8222.f22689, false);
                break;
            case 3:
                C8208 c8208 = (C8208) obj2;
                C8207 c8207 = c8208.f22641;
                MaxRelativeLayout maxRelativeLayout2 = c8208.f22635;
                c8207.f11578.getClass();
                c8207.f11578.getClass();
                c8207.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c8207.m8071(), R.anim.anim_dialogx_default_enter);
                Animation animation = (animationLoadAnimation2 != null || maxRelativeLayout2.getAnimation() == null) ? animationLoadAnimation2 : maxRelativeLayout2.getAnimation();
                long duration3 = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
                long j4 = c8207.f11575;
                if (j4 >= 0) {
                    duration3 = j4;
                }
                animationLoadAnimation2.setDuration(duration3);
                animationLoadAnimation2.setInterpolator(new DecelerateInterpolator());
                maxRelativeLayout2.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat3.setDuration(duration3);
                valueAnimatorOfFloat3.addUpdateListener(new C8209(this, i3));
                valueAnimatorOfFloat3.start();
                break;
            case 4:
                C2492 c2492 = (C2492) obj2;
                C8211 c8211 = (C8211) c2492.f7462;
                LinearLayout linearLayout = (LinearLayout) c2492.f7460;
                Activity activityM8071 = c8211.m8071();
                int i6 = c8211.f22653;
                if (i6 != 0) {
                    i2 = i6;
                }
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(activityM8071, i2);
                Animation animation2 = (animationLoadAnimation3 != null || linearLayout.getAnimation() == null) ? animationLoadAnimation3 : linearLayout.getAnimation();
                long duration4 = (animation2 == null || animation2.getDuration() == 0) ? 300L : animation2.getDuration();
                long j5 = c8211.f11575;
                if (j5 >= 0) {
                    duration4 = j5;
                }
                animationLoadAnimation3.setInterpolator(new DecelerateInterpolator(2.0f));
                animationLoadAnimation3.setDuration(duration4);
                animationLoadAnimation3.setFillAfter(true);
                linearLayout.startAnimation(animationLoadAnimation3);
                ((DialogXBaseRelativeLayout) c2492.f7461).animate().setDuration(duration4).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                break;
            default:
                C8199 c8199 = (C8199) obj2;
                C8197 c8197 = c8199.f22593;
                Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(c8197.m8071(), R.anim.anim_dialogx_default_enter);
                Animation animation3 = (animationLoadAnimation4 != null || c8199.f22587.getAnimation() == null) ? animationLoadAnimation4 : c8199.f22587.getAnimation();
                long duration5 = (animation3 == null || animation3.getDuration() == 0) ? 300L : animation3.getDuration();
                long j6 = c8197.f11575;
                if (j6 >= 0) {
                    duration5 = j6;
                }
                animationLoadAnimation4.setInterpolator(new DecelerateInterpolator());
                animationLoadAnimation4.setDuration(duration5);
                c8199.f22587.startAnimation(animationLoadAnimation4);
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat4.setDuration(duration5);
                valueAnimatorOfFloat4.addUpdateListener(new C8202(this, i3));
                valueAnimatorOfFloat4.start();
                c8199.f22588.animate().setDuration(duration5).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final void m13726(Object obj) {
        long j;
        long jM962;
        int i = this.f22672;
        int i2 = R.anim.anim_dialogx_default_exit;
        Object obj2 = this.f22673;
        int i3 = 1;
        switch (i) {
            case 0:
                C8238 c8238 = (C8238) obj2;
                long j2 = c8238.f22746.f11586;
                j = j2 != -1 ? j2 : 300L;
                RelativeLayout relativeLayout = c8238.f22741;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), relativeLayout.getHeight());
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.addUpdateListener(new C8217(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C0325 c0325 = (C0325) obj2;
                C8232 c8232 = (C8232) c0325.f1093;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0325.f1096;
                C0325 c03252 = c8232.f22719;
                if (c03252 != null && ((MaxRelativeLayout) c03252.f1096) != null) {
                    int i4 = c8232.f22721;
                    if (i4 != 0) {
                        i2 = i4;
                    }
                    if (maxRelativeLayout != null) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c8232.m8071() == null ? maxRelativeLayout.getContext() : c8232.m8071(), i2);
                        jM962 = c0325.m962(animationLoadAnimation);
                        animationLoadAnimation.setDuration(jM962);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    } else {
                        jM962 = c0325.m962(null);
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.setDuration(jM962);
                    valueAnimatorOfFloat2.addUpdateListener(new C8228(this, i3));
                    valueAnimatorOfFloat2.start();
                    break;
                }
                break;
            case 2:
                C8222 c8222 = (C8222) obj2;
                long j3 = c8222.f22692.f11586;
                j = j3 != -1 ? j3 : 300L;
                MaxRelativeLayout maxRelativeLayout2 = c8222.f22684;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(maxRelativeLayout2, "y", maxRelativeLayout2.getY(), c8222.f22685.getHeight());
                objectAnimatorOfFloat2.setDuration(j);
                objectAnimatorOfFloat2.start();
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat3.setDuration(j);
                valueAnimatorOfFloat3.addUpdateListener(new C3176(this, 4));
                valueAnimatorOfFloat3.start();
                break;
            case 3:
                C8208 c8208 = (C8208) obj2;
                C8207 c8207 = c8208.f22641;
                c8207.f11578.getClass();
                c8207.f11578.getClass();
                c8207.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c8207.m8071(), R.anim.anim_dialogx_default_exit);
                long jM13716 = c8208.m13716(animationLoadAnimation2);
                animationLoadAnimation2.setInterpolator(new AccelerateInterpolator());
                animationLoadAnimation2.setDuration(jM13716);
                c8208.f22635.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat4.setDuration(jM13716);
                valueAnimatorOfFloat4.addUpdateListener(new C8209(this, i3));
                valueAnimatorOfFloat4.start();
                break;
            case 4:
                C2492 c2492 = (C2492) obj2;
                C8211 c8211 = (C8211) c2492.f7462;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c2492.f7461;
                Context context = c8211.m8071() == null ? dialogXBaseRelativeLayout.getContext() : c8211.m8071();
                int i5 = c8211.f22656;
                if (i5 != 0) {
                    i2 = i5;
                }
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, i2);
                long jM4921 = c2492.m4921(animationLoadAnimation3);
                animationLoadAnimation3.setDuration(jM4921);
                animationLoadAnimation3.setFillAfter(true);
                ((LinearLayout) c2492.f7460).startAnimation(animationLoadAnimation3);
                dialogXBaseRelativeLayout.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(jM4921);
                break;
            default:
                C8199 c8199 = (C8199) obj2;
                Context contextM8071 = c8199.f22593.m8071();
                if (contextM8071 == null) {
                    contextM8071 = c8199.f22588.getContext();
                }
                if (contextM8071 != null) {
                    Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(contextM8071, R.anim.anim_dialogx_default_exit);
                    long jM13699 = c8199.m13699(animationLoadAnimation4);
                    animationLoadAnimation4.setDuration(jM13699);
                    animationLoadAnimation4.setInterpolator(new AccelerateInterpolator());
                    c8199.f22587.startAnimation(animationLoadAnimation4);
                    c8199.f22588.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(jM13699);
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat5.setDuration(jM13699);
                    valueAnimatorOfFloat5.addUpdateListener(new C8202(this, i3));
                    valueAnimatorOfFloat5.start();
                    break;
                }
                break;
        }
    }
}
