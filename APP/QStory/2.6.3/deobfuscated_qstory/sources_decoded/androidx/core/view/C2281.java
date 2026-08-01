package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import androidx.collection.C0257;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p128.AbstractC7483;
import p287.AbstractC8405;
import p324.C8734;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2281 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f6627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6629;

    public C2281(AbstractC7483 abstractC7483, C0257 c0257) {
        this.f6629 = 1;
        this.f6627 = abstractC7483;
        this.f6628 = c0257;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6629) {
            case 4:
                AbstractC8405.m13972(2716); /* decoded: m13972(2716)=animation */
                animator.getClass();
                ((TextView) this.f6628).setTag(R.id.tag_sticker_dir_color_animator, null);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6629;
        Object obj = this.f6627;
        Object obj2 = this.f6628;
        switch (i) {
            case 0:
                C2274 c2274 = (C2274) obj2;
                c2274.f6604.mo4253(1.0f);
                C2277.m4259((View) obj, c2274);
                break;
            case 1:
                ((C0257) obj2).remove(animator);
                ((AbstractC7483) obj).f20251.remove(animator);
                break;
            case 2:
                View view = (View) obj;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj2;
                hideBottomViewOnScrollBehavior.f9992 = null;
                if (hideBottomViewOnScrollBehavior.f9995 == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj2;
                hideViewOnScrollBehavior.f10005 = null;
                if (hideViewOnScrollBehavior.f10008 == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            default:
                AbstractC8405.m13972(2716); /* decoded: m13972(2716)=animation */
                animator.getClass();
                TextView textView = (TextView) obj2;
                textView.setTag(R.id.tag_sticker_dir_color_animator, null);
                textView.setTag(R.id.tag_sticker_dir_state, (C8734) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6629) {
            case 1:
                ((AbstractC7483) this.f6627).f20251.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C2281(Object obj, int i, Object obj2) {
        this.f6629 = i;
        this.f6628 = obj;
        this.f6627 = obj2;
    }
}
