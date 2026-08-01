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
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.C3177;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8217 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f22671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f22672;

    public /* synthetic */ C8217(Object obj, int i) {
        this.f22672 = i;
        this.f22671 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m13742(Object obj) {
        Animation animationLoadAnimation;
        int i = this.f22672;
        int i2 = R.anim.anim_dialogx_default_enter;
        Object obj2 = this.f22671;
        int i3 = 0;
        switch (i) {
            case 0:
                C8240 c8240 = (C8240) obj;
                C8239 c8239 = (C8239) obj2;
                C8240 c82402 = c8239.f22745;
                long j = c82402.f11580;
                if (j < 0) {
                    j = 300;
                }
                RelativeLayout relativeLayout = c8239.f22740;
                if (!c8240.m13762()) {
                    relativeLayout.setPadding(0, 0, 0, 0);
                }
                float measuredHeight = c82402.m8057() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c82402.m8057().getMeasuredHeight();
                float f = c8239.f22741.getUnsafePlace().top + 0.0f;
                c8239.f22743 = f;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", measuredHeight, f);
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.setAutoCancel(true);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.addUpdateListener(new C8218(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C0325 c0325 = (C0325) obj2;
                C8233 c8233 = (C8233) c0325.f1093;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0325.f1096;
                C0325 c03252 = c8233.f22718;
                if (c03252 != null && ((MaxRelativeLayout) c03252.f1096) != null) {
                    int i4 = c8233.f22721;
                    if (i4 == R.anim.anim_dialogx_default_enter && c8233.f22720 == R.anim.anim_dialogx_default_exit) {
                        switch (AbstractC8238.f22736[c8233.f22716.ordinal()]) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                                c8233.f22721 = R.anim.anim_dialogx_top_enter;
                                c8233.f22720 = R.anim.anim_dialogx_top_exit;
                                break;
                            case 2:
                            case 8:
                            case 14:
                            case 15:
                                c8233.f22721 = R.anim.anim_dialogx_left_enter;
                                c8233.f22720 = R.anim.anim_dialogx_left_exit;
                                break;
                            case 6:
                            case 12:
                            case 16:
                            case 17:
                                c8233.f22721 = R.anim.anim_dialogx_right_enter;
                                c8233.f22720 = R.anim.anim_dialogx_right_exit;
                                break;
                            case 7:
                            case 9:
                            case 10:
                            case 11:
                                c8233.f22721 = R.anim.anim_dialogx_bottom_enter;
                                c8233.f22720 = R.anim.anim_dialogx_bottom_exit;
                                break;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c8233.m8058(), c8233.f22721);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                    } else {
                        if (i4 != 0) {
                            i2 = i4;
                        }
                        animationLoadAnimation = AnimationUtils.loadAnimation(c8233.m8058(), i2);
                    }
                    long duration = animationLoadAnimation.getDuration();
                    long j2 = c8233.f11580;
                    if (j2 >= 0) {
                        duration = j2;
                    }
                    animationLoadAnimation.setDuration(duration);
                    long duration2 = animationLoadAnimation.getDuration() == 0 ? 300L : animationLoadAnimation.getDuration();
                    long j3 = c8233.f11580;
                    if (j3 >= 0) {
                        duration2 = j3;
                    }
                    animationLoadAnimation.setDuration(duration2);
                    if (maxRelativeLayout != null) {
                        maxRelativeLayout.setVisibility(0);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    }
                    int i5 = c8233.f22717;
                    if (i5 != 0) {
                        ((DialogXBaseRelativeLayout) c0325.f1095).setBackgroundColor(i5);
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(duration2);
                    valueAnimatorOfFloat2.addUpdateListener(new C8229(this, i3));
                    valueAnimatorOfFloat2.start();
                    break;
                }
                break;
            case 2:
                C8223 c8223 = (C8223) obj2;
                c8223.m13746();
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8223.f22685;
                float safeHeight = dialogXBaseRelativeLayout.getSafeHeight() - c8223.f22692;
                c8223.f22688 = safeHeight;
                if (safeHeight < 0.0f) {
                    c8223.f22688 = 0.0f;
                }
                c8223.m13748(dialogXBaseRelativeLayout.getHeight(), (int) c8223.f22688, false);
                break;
            case 3:
                C8209 c8209 = (C8209) obj2;
                C8208 c8208 = c8209.f22640;
                MaxRelativeLayout maxRelativeLayout2 = c8209.f22634;
                c8208.f11583.getClass();
                c8208.f11583.getClass();
                c8208.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c8208.m8058(), R.anim.anim_dialogx_default_enter);
                Animation animation = (animationLoadAnimation2 != null || maxRelativeLayout2.getAnimation() == null) ? animationLoadAnimation2 : maxRelativeLayout2.getAnimation();
                long duration3 = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
                long j4 = c8208.f11580;
                if (j4 >= 0) {
                    duration3 = j4;
                }
                animationLoadAnimation2.setDuration(duration3);
                animationLoadAnimation2.setInterpolator(new DecelerateInterpolator());
                maxRelativeLayout2.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat3.setDuration(duration3);
                valueAnimatorOfFloat3.addUpdateListener(new C8210(this, i3));
                valueAnimatorOfFloat3.start();
                break;
            case 4:
                C2492 c2492 = (C2492) obj2;
                C8212 c8212 = (C8212) c2492.f7463;
                LinearLayout linearLayout = (LinearLayout) c2492.f7461;
                Activity activityM8058 = c8212.m8058();
                int i6 = c8212.f22652;
                if (i6 != 0) {
                    i2 = i6;
                }
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(activityM8058, i2);
                Animation animation2 = (animationLoadAnimation3 != null || linearLayout.getAnimation() == null) ? animationLoadAnimation3 : linearLayout.getAnimation();
                long duration4 = (animation2 == null || animation2.getDuration() == 0) ? 300L : animation2.getDuration();
                long j5 = c8212.f11580;
                if (j5 >= 0) {
                    duration4 = j5;
                }
                animationLoadAnimation3.setInterpolator(new DecelerateInterpolator(2.0f));
                animationLoadAnimation3.setDuration(duration4);
                animationLoadAnimation3.setFillAfter(true);
                linearLayout.startAnimation(animationLoadAnimation3);
                ((DialogXBaseRelativeLayout) c2492.f7462).animate().setDuration(duration4).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                break;
            default:
                C8200 c8200 = (C8200) obj2;
                C8198 c8198 = c8200.f22592;
                Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(c8198.m8058(), R.anim.anim_dialogx_default_enter);
                Animation animation3 = (animationLoadAnimation4 != null || c8200.f22586.getAnimation() == null) ? animationLoadAnimation4 : c8200.f22586.getAnimation();
                long duration5 = (animation3 == null || animation3.getDuration() == 0) ? 300L : animation3.getDuration();
                long j6 = c8198.f11580;
                if (j6 >= 0) {
                    duration5 = j6;
                }
                animationLoadAnimation4.setInterpolator(new DecelerateInterpolator());
                animationLoadAnimation4.setDuration(duration5);
                c8200.f22586.startAnimation(animationLoadAnimation4);
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat4.setDuration(duration5);
                valueAnimatorOfFloat4.addUpdateListener(new C8203(this, i3));
                valueAnimatorOfFloat4.start();
                c8200.f22587.animate().setDuration(duration5).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m13743(Object obj) {
        long j;
        long jM963;
        int i = this.f22672;
        int i2 = R.anim.anim_dialogx_default_exit;
        Object obj2 = this.f22671;
        int i3 = 1;
        switch (i) {
            case 0:
                C8239 c8239 = (C8239) obj2;
                long j2 = c8239.f22745.f11591;
                j = j2 != -1 ? j2 : 300L;
                RelativeLayout relativeLayout = c8239.f22740;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), relativeLayout.getHeight());
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.addUpdateListener(new C8218(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C0325 c0325 = (C0325) obj2;
                C8233 c8233 = (C8233) c0325.f1093;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c0325.f1096;
                C0325 c03252 = c8233.f22718;
                if (c03252 != null && ((MaxRelativeLayout) c03252.f1096) != null) {
                    int i4 = c8233.f22720;
                    if (i4 != 0) {
                        i2 = i4;
                    }
                    if (maxRelativeLayout != null) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(c8233.m8058() == null ? maxRelativeLayout.getContext() : c8233.m8058(), i2);
                        jM963 = c0325.m963(animationLoadAnimation);
                        animationLoadAnimation.setDuration(jM963);
                        maxRelativeLayout.startAnimation(animationLoadAnimation);
                    } else {
                        jM963 = c0325.m963(null);
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.setDuration(jM963);
                    valueAnimatorOfFloat2.addUpdateListener(new C8229(this, i3));
                    valueAnimatorOfFloat2.start();
                    break;
                }
                break;
            case 2:
                C8223 c8223 = (C8223) obj2;
                long j3 = c8223.f22691.f11591;
                j = j3 != -1 ? j3 : 300L;
                MaxRelativeLayout maxRelativeLayout2 = c8223.f22683;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(maxRelativeLayout2, "y", maxRelativeLayout2.getY(), c8223.f22684.getHeight());
                objectAnimatorOfFloat2.setDuration(j);
                objectAnimatorOfFloat2.start();
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat3.setDuration(j);
                valueAnimatorOfFloat3.addUpdateListener(new C3177(this, 4));
                valueAnimatorOfFloat3.start();
                break;
            case 3:
                C8209 c8209 = (C8209) obj2;
                C8208 c8208 = c8209.f22640;
                c8208.f11583.getClass();
                c8208.f11583.getClass();
                c8208.getClass();
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(c8208.m8058(), R.anim.anim_dialogx_default_exit);
                long jM13733 = c8209.m13733(animationLoadAnimation2);
                animationLoadAnimation2.setInterpolator(new AccelerateInterpolator());
                animationLoadAnimation2.setDuration(jM13733);
                c8209.f22634.startAnimation(animationLoadAnimation2);
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat4.setDuration(jM13733);
                valueAnimatorOfFloat4.addUpdateListener(new C8210(this, i3));
                valueAnimatorOfFloat4.start();
                break;
            case 4:
                C2492 c2492 = (C2492) obj2;
                C8212 c8212 = (C8212) c2492.f7463;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c2492.f7462;
                Context context = c8212.m8058() == null ? dialogXBaseRelativeLayout.getContext() : c8212.m8058();
                int i5 = c8212.f22655;
                if (i5 != 0) {
                    i2 = i5;
                }
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, i2);
                long jM4931 = c2492.m4931(animationLoadAnimation3);
                animationLoadAnimation3.setDuration(jM4931);
                animationLoadAnimation3.setFillAfter(true);
                ((LinearLayout) c2492.f7461).startAnimation(animationLoadAnimation3);
                dialogXBaseRelativeLayout.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(jM4931);
                break;
            default:
                C8200 c8200 = (C8200) obj2;
                Context contextM8058 = c8200.f22592.m8058();
                if (contextM8058 == null) {
                    contextM8058 = c8200.f22587.getContext();
                }
                if (contextM8058 != null) {
                    Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(contextM8058, R.anim.anim_dialogx_default_exit);
                    long jM13716 = c8200.m13716(animationLoadAnimation4);
                    animationLoadAnimation4.setDuration(jM13716);
                    animationLoadAnimation4.setInterpolator(new AccelerateInterpolator());
                    c8200.f22586.startAnimation(animationLoadAnimation4);
                    c8200.f22587.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(jM13716);
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat5.setDuration(jM13716);
                    valueAnimatorOfFloat5.addUpdateListener(new C8203(this, i3));
                    valueAnimatorOfFloat5.start();
                    break;
                }
                break;
        }
    }
}
