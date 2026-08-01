package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import androidx.collection.C0257;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p128.AbstractC7482;
import p323.C8731;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2281 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f6626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6628;

    public C2281(AbstractC7482 abstractC7482, C0257 c0257) {
        this.f6628 = 1;
        this.f6626 = abstractC7482;
        this.f6627 = c0257;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6628) {
            case 4:
                AbstractC3056.m6668(-3937831887725397415L);
                animator.getClass();
                ((TextView) this.f6627).setTag(R.id.tag_sticker_dir_color_animator, null);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6628;
        Object obj = this.f6626;
        Object obj2 = this.f6627;
        switch (i) {
            case 0:
                C2274 c2274 = (C2274) obj2;
                c2274.f6603.mo4243(1.0f);
                C2277.m4249((View) obj, c2274);
                break;
            case 1:
                ((C0257) obj2).remove(animator);
                ((AbstractC7482) obj).f20256.remove(animator);
                break;
            case 2:
                View view = (View) obj;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj2;
                hideBottomViewOnScrollBehavior.f9987 = null;
                if (hideBottomViewOnScrollBehavior.f9990 == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj2;
                hideViewOnScrollBehavior.f10000 = null;
                if (hideViewOnScrollBehavior.f10003 == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            default:
                AbstractC3056.m6668(-3937831887725397415L);
                animator.getClass();
                TextView textView = (TextView) obj2;
                textView.setTag(R.id.tag_sticker_dir_color_animator, null);
                textView.setTag(R.id.tag_sticker_dir_state, (C8731) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6628) {
            case 1:
                ((AbstractC7482) this.f6626).f20256.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C2281(Object obj, int i, Object obj2) {
        this.f6628 = i;
        this.f6627 = obj;
        this.f6626 = obj2;
    }
}
