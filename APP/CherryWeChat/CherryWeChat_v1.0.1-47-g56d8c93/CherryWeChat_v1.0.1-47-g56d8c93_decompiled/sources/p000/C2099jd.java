package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: jd */
/* JADX INFO: loaded from: classes.dex */
public final class C2099jd extends AbstractC0047B3 {

    /* JADX INFO: renamed from: c */
    public final boolean f7386c;

    /* JADX INFO: renamed from: d */
    public boolean f7387d;

    /* JADX INFO: renamed from: e */
    public C0649P3 f7388e;

    public C2099jd(C0557My c0557My, C0609O6 c0609o6, boolean z) {
        super(c0557My, c0609o6);
        this.f7386c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5 A[Catch: RuntimeException -> 0x00eb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00eb, blocks: (B:78:0x00df, B:80:0x00e5), top: B:91:0x00df }] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0649P3 m4293o(Context context) {
        int iM603D;
        Animation animationLoadAnimation;
        C0649P3 c0649p3;
        Animator animatorLoadAnimator;
        if (this.f7387d) {
            return this.f7388e;
        }
        C0557My c0557My = (C0557My) this.f96a;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0557My.f1827c;
        boolean z = c0557My.f1825a == 2;
        C1415fi c1415fi = abstractComponentCallbacksC1503hi.f5299H;
        int i = c1415fi == null ? 0 : c1415fi.f5002f;
        if (this.f7386c) {
            if (z) {
                iM603D = c1415fi == null ? 0 : c1415fi.f5000d;
            } else if (c1415fi != null) {
                iM603D = c1415fi.f5001e;
            }
        } else if (z) {
            if (c1415fi != null) {
                iM603D = c1415fi.f4998b;
            }
        } else if (c1415fi != null) {
            iM603D = c1415fi.f4999c;
        }
        abstractComponentCallbacksC1503hi.m2866A(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC1503hi.f5295D;
        C0649P3 c0649p32 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC1503hi.f5295D.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC1503hi.f5295D;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (iM603D == 0 && i != 0) {
                iM603D = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z ? AbstractC0295Gu.m603D(context, android.R.attr.activityOpenEnterAnimation) : AbstractC0295Gu.m603D(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? AbstractC0295Gu.m603D(context, android.R.attr.activityCloseEnterAnimation) : AbstractC0295Gu.m603D(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
            }
            if (iM603D != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM603D));
                if (zEquals) {
                    try {
                        animationLoadAnimation = AnimationUtils.loadAnimation(context, iM603D);
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM603D);
                            if (animatorLoadAnimator != null) {
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM603D);
                            if (animationLoadAnimation2 != null) {
                                c0649p32 = new C0649P3(animationLoadAnimation2);
                            }
                        }
                    }
                    if (animationLoadAnimation != null) {
                        c0649p3 = new C0649P3(animationLoadAnimation);
                        c0649p32 = c0649p3;
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM603D);
                    if (animatorLoadAnimator != null) {
                        c0649p3 = new C0649P3(animatorLoadAnimator);
                        c0649p32 = c0649p3;
                    }
                }
            }
        }
        this.f7388e = c0649p32;
        this.f7387d = true;
        return c0649p32;
    }
}
