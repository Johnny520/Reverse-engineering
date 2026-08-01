package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AbstractC0927;
import androidx.appcompat.app.C0923;
import androidx.core.os.C3002;
import com.davemorrissey.labs.subscaleview.C0328R;
import p191.AbstractC8568;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3162 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f7179;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f7180;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C0923 f7181;

    public C3162(C3190 c3190, C3002 c3002, boolean z) {
        super(c3190, 2, c3002);
        this.f7180 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6 A[Catch: RuntimeException -> 0x00ec, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00ec, blocks: (B:78:0x00e0, B:80:0x00e6), top: B:91:0x00e0 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0923 m4985(Context context) {
        int iM13611;
        Animation animationLoadAnimation;
        C0923 c0923;
        Animator animatorLoadAnimator;
        if (this.f7179) {
            return this.f7181;
        }
        C3190 c3190 = (C3190) this.f576;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = c3190.f7326;
        boolean z = c3190.f7328 == SpecialEffectsController$Operation$State.VISIBLE;
        C3167 c3167 = abstractComponentCallbacksC3171.f7262;
        int i = c3167 == null ? 0 : c3167.f7206;
        if (this.f7180) {
            if (z) {
                iM13611 = c3167 == null ? 0 : c3167.f7208;
            } else if (c3167 != null) {
                iM13611 = c3167.f7207;
            }
        } else if (z) {
            if (c3167 != null) {
                iM13611 = c3167.f7210;
            }
        } else if (c3167 != null) {
            iM13611 = c3167.f7209;
        }
        abstractComponentCallbacksC3171.m4993(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC3171.f7227;
        C0923 c09232 = null;
        if (viewGroup != null && viewGroup.getTag(C0328R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC3171.f7227.setTag(C0328R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC3171.f7227;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (iM13611 == 0 && i != 0) {
                iM13611 = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z ? AbstractC8568.m13611(context, R.attr.activityOpenEnterAnimation) : AbstractC8568.m13611(context, R.attr.activityOpenExitAnimation) : z ? C0328R.animator.fragment_fade_enter : C0328R.animator.fragment_fade_exit : z ? AbstractC8568.m13611(context, R.attr.activityCloseEnterAnimation) : AbstractC8568.m13611(context, R.attr.activityCloseExitAnimation) : z ? C0328R.animator.fragment_close_enter : C0328R.animator.fragment_close_exit : z ? C0328R.animator.fragment_open_enter : C0328R.animator.fragment_open_exit;
            }
            if (iM13611 != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM13611));
                if (zEquals) {
                    try {
                        animationLoadAnimation = AnimationUtils.loadAnimation(context, iM13611);
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM13611);
                            if (animatorLoadAnimator != null) {
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM13611);
                            if (animationLoadAnimation2 != null) {
                                c09232 = new C0923(animationLoadAnimation2);
                            }
                        }
                    }
                    if (animationLoadAnimation != null) {
                        c0923 = new C0923(animationLoadAnimation);
                        c09232 = c0923;
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM13611);
                    if (animatorLoadAnimator != null) {
                        c0923 = new C0923(animatorLoadAnimator);
                        c09232 = c0923;
                    }
                }
            }
        }
        this.f7181 = c09232;
        this.f7179 = true;
        return c09232;
    }
}
