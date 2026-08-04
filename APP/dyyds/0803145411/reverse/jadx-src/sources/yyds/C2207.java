package yyds;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲁᛳᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2207 extends AbstractC0181 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f10909;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10910;

    public /* synthetic */ C2207(int i, Object obj) {
        this.f10910 = i;
        this.f10909 = obj;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m4195(Object obj) {
        int i = this.f10910;
        int i2 = R.anim.anim_dialogx_default_exit;
        Object obj2 = this.f10909;
        int i3 = 1;
        switch (i) {
            case 0:
                C2457 c2457 = (C2457) obj2;
                long j = c2457.f12138.f411;
                if (j == -1) {
                    j = 300;
                }
                RelativeLayout relativeLayout = c2457.f12143;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), relativeLayout.getHeight());
                objectAnimatorOfFloat.setDuration(j);
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.addUpdateListener(new C1734(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C2283 c2283 = (C2283) obj2;
                C1188 c1188 = (C1188) c2283.f11233;
                c1188.f398.getClass();
                c1188.f398.getClass();
                int i4 = c1188.f5449;
                if (i4 != 0) {
                    i2 = i4;
                }
                Context contextM282 = c1188.f5446.f408;
                if (contextM282 == null) {
                    contextM282 = c1188.m282();
                }
                Animation animationM1814 = AbstractC0797.m1814(contextM282, i2);
                long jM4291 = c2283.m4291(animationM1814);
                animationM1814.setInterpolator(new AccelerateInterpolator());
                animationM1814.setDuration(jM4291);
                ((MaxRelativeLayout) c2283.f11241).startAnimation(animationM1814);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setDuration(jM4291);
                valueAnimatorOfFloat2.addUpdateListener(new C2371(this, i3));
                valueAnimatorOfFloat2.start();
                break;
            default:
                C2458 c2458 = (C2458) obj2;
                Context contextM2822 = c2458.f12153.m282();
                if (contextM2822 == null) {
                    contextM2822 = c2458.f12151.getContext();
                }
                if (contextM2822 != null) {
                    Animation animationM18142 = AbstractC0797.m1814(contextM2822, R.anim.anim_dialogx_default_exit);
                    long jM4499 = c2458.m4499(animationM18142);
                    animationM18142.setDuration(jM4499);
                    animationM18142.setInterpolator(new AccelerateInterpolator());
                    c2458.f12154.startAnimation(animationM18142);
                    c2458.f12151.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(jM4499);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat3.setDuration(jM4499);
                    valueAnimatorOfFloat3.addUpdateListener(new C2158(this, i3));
                    valueAnimatorOfFloat3.start();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final void m4196(Object obj) {
        int i = this.f10910;
        int i2 = R.anim.anim_dialogx_default_enter;
        Object obj2 = this.f10909;
        int i3 = 0;
        switch (i) {
            case 0:
                C0763 c0763 = (C0763) obj;
                C2457 c2457 = (C2457) obj2;
                C0763 c07632 = c2457.f12138;
                long j = c07632.f402;
                duration = j >= 0 ? j : 300L;
                RelativeLayout relativeLayout = c2457.f12143;
                if (c0763.m1711()) {
                    c07632.getClass();
                } else {
                    c07632.getClass();
                    relativeLayout.setPadding(0, 0, 0, 0);
                }
                float measuredHeight = c07632.m278() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : c07632.m278().getMeasuredHeight();
                float f = c2457.f12135.getUnsafePlace().top + 0.0f;
                c2457.f12132 = f;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", measuredHeight, f);
                objectAnimatorOfFloat.setDuration(duration);
                objectAnimatorOfFloat.setAutoCancel(true);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                objectAnimatorOfFloat.start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(duration);
                valueAnimatorOfFloat.addUpdateListener(new C1734(this, i3));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                C2283 c2283 = (C2283) obj2;
                C1188 c1188 = (C1188) c2283.f11233;
                MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) c2283.f11241;
                c1188.f398.getClass();
                c1188.f398.getClass();
                int i4 = c1188.f5434;
                if (i4 != 0) {
                    i2 = i4;
                }
                Context contextM282 = c1188.f5446.f408;
                if (contextM282 == null) {
                    contextM282 = c1188.m282();
                }
                Animation animationM1814 = AbstractC0797.m1814(contextM282, i2);
                Animation animation = (animationM1814 != null || maxRelativeLayout.getAnimation() == null) ? animationM1814 : maxRelativeLayout.getAnimation();
                if (animation != null && animation.getDuration() != 0) {
                    duration = animation.getDuration();
                }
                long j2 = c1188.f402;
                if (j2 >= 0) {
                    duration = j2;
                }
                animationM1814.setDuration(duration);
                animationM1814.setInterpolator(new DecelerateInterpolator());
                maxRelativeLayout.startAnimation(animationM1814);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.setDuration(duration);
                valueAnimatorOfFloat2.addUpdateListener(new C2371(this, i3));
                valueAnimatorOfFloat2.start();
                break;
            default:
                C2458 c2458 = (C2458) obj2;
                C1624 c1624 = c2458.f12153;
                Animation animationM18142 = AbstractC0797.m1814(c1624.m282(), R.anim.anim_dialogx_default_enter);
                Animation animation2 = (animationM18142 != null || c2458.f12154.getAnimation() == null) ? animationM18142 : c2458.f12154.getAnimation();
                if (animation2 != null && animation2.getDuration() != 0) {
                    duration = animation2.getDuration();
                }
                long j3 = c1624.f402;
                if (j3 >= 0) {
                    duration = j3;
                }
                animationM18142.setInterpolator(new DecelerateInterpolator());
                animationM18142.setDuration(duration);
                c2458.f12154.startAnimation(animationM18142);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat3.setDuration(duration);
                valueAnimatorOfFloat3.addUpdateListener(new C2158(this, i3));
                valueAnimatorOfFloat3.start();
                c2458.f12151.animate().setDuration(duration).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                break;
        }
    }
}
