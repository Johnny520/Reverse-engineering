package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import androidx.collection.C1104;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p144.AbstractC8312;
import p340.C9563;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3114 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f6972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6974;

    public C3114(AbstractC8312 abstractC8312, C1104 c1104) {
        this.f6974 = 1;
        this.f6972 = abstractC8312;
        this.f6973 = c1104;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6974) {
            case 4:
                "animation";
                animator.getClass();
                ((TextView) this.f6973).setTag(C0328R.id.tag_sticker_dir_color_animator, null);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6974;
        Object obj = this.f6972;
        Object obj2 = this.f6973;
        switch (i) {
            case 0:
                C3107 c3107 = (C3107) obj2;
                c3107.f6949.mo4813(1.0f);
                C3110.m4819((View) obj, c3107);
                break;
            case 1:
                ((C1104) obj2).remove(animator);
                ((AbstractC8312) obj).f20596.remove(animator);
                break;
            case 2:
                View view = (View) obj;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj2;
                hideBottomViewOnScrollBehavior.f10337 = null;
                if (hideBottomViewOnScrollBehavior.f10340 == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj2;
                hideViewOnScrollBehavior.f10350 = null;
                if (hideViewOnScrollBehavior.f10353 == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            default:
                "animation";
                animator.getClass();
                TextView textView = (TextView) obj2;
                textView.setTag(C0328R.id.tag_sticker_dir_color_animator, null);
                textView.setTag(C0328R.id.tag_sticker_dir_state, (C9563) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6974) {
            case 1:
                ((AbstractC8312) this.f6972).f20596.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C3114(Object obj, int i, Object obj2) {
        this.f6974 = i;
        this.f6973 = obj;
        this.f6972 = obj2;
    }
}
