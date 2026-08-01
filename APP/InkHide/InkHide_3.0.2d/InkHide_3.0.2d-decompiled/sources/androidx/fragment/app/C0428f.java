package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.p055lu.wxmask272.R;
import p014H.C0142a;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0428f extends AbstractC0429g {

    /* JADX INFO: renamed from: c */
    public boolean f1325c;

    /* JADX INFO: renamed from: d */
    public boolean f1326d;

    /* JADX INFO: renamed from: e */
    public C0142a f1327e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8 A[Catch: RuntimeException -> 0x00c3, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00c3, blocks: (B:67:0x00b2, B:69:0x00b8), top: B:80:0x00b2 }] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0142a m824j(Context context) {
        int i2;
        Animation animationLoadAnimation;
        C0142a c0142a;
        Animator animatorLoadAnimator;
        if (this.f1326d) {
            return this.f1327e;
        }
        C0420K c0420k = (C0420K) this.f1328a;
        boolean z2 = c0420k.f1274a == 2;
        boolean z3 = this.f1325c;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0420k.f1276c;
        C0433k c0433k = abstractComponentCallbacksC0434l.f1356I;
        int i3 = c0433k == null ? 0 : c0433k.f1341f;
        if (z3) {
            if (z2) {
                i2 = c0433k == null ? 0 : c0433k.f1339d;
            } else if (c0433k != null) {
                i2 = c0433k.f1340e;
            }
        } else if (z2) {
            if (c0433k != null) {
                i2 = c0433k.f1337b;
            }
        } else if (c0433k != null) {
            i2 = c0433k.f1338c;
        }
        abstractComponentCallbacksC0434l.m850o(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0434l.f1352E;
        C0142a c0142a2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0434l.f1352E.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0434l.f1352E;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i2 == 0 && i3 != 0) {
                i2 = i3 != 4097 ? i3 != 4099 ? i3 != 8194 ? -1 : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            }
            if (i2 != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i2));
                if (zEquals) {
                    try {
                        animationLoadAnimation = AnimationUtils.loadAnimation(context, i2);
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
                            if (animatorLoadAnimator != null) {
                            }
                        } catch (RuntimeException e3) {
                            if (zEquals) {
                                throw e3;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i2);
                            if (animationLoadAnimation2 != null) {
                                c0142a2 = new C0142a(animationLoadAnimation2);
                            }
                        }
                    }
                    if (animationLoadAnimation != null) {
                        c0142a = new C0142a(animationLoadAnimation);
                        c0142a2 = c0142a;
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
                    if (animatorLoadAnimator != null) {
                        c0142a = new C0142a();
                        c0142a.f443b = null;
                        c0142a.f444c = animatorLoadAnimator;
                        c0142a2 = c0142a;
                    }
                }
            }
        }
        this.f1327e = c0142a2;
        this.f1326d = true;
        return c0142a2;
    }
}
