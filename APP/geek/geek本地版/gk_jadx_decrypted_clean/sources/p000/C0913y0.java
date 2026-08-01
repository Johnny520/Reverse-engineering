package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: renamed from: y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913y0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5244b;

    public /* synthetic */ C0913y0(int i, Object obj) {
        this.f5243a = i;
        this.f5244b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5243a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5244b;
                actionBarOverlayLayout.f277w = null;
                actionBarOverlayLayout.f265k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5243a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5244b;
                actionBarOverlayLayout.f277w = null;
                actionBarOverlayLayout.f265k = false;
                break;
            case Base64.NO_PADDING /* 1 */:
                C0507n2 c0507n2 = (C0507n2) this.f5244b;
                ArrayList arrayList = new ArrayList(c0507n2.f3309e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0831vt) arrayList.get(i)).f4887b.f5202o;
                    if (colorStateList != null) {
                        AbstractC0104ch.m688h(c0507n2, colorStateList);
                    }
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                C0597ph c0597ph = (C0597ph) this.f5244b;
                c0597ph.m1228p();
                c0597ph.f3904r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f5244b).f1005h = null;
                break;
            case 4:
                AbstractC0346ip.m1503o("animation", animator);
                ((FrameLayout) this.f5244b).setLayerType(0, null);
                break;
            default:
                ((r70) this.f5244b).m2268l();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5243a) {
            case Base64.NO_PADDING /* 1 */:
                C0507n2 c0507n2 = (C0507n2) this.f5244b;
                ArrayList arrayList = new ArrayList(c0507n2.f3309e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0905xt c0905xt = ((C0831vt) arrayList.get(i)).f4887b;
                    ColorStateList colorStateList = c0905xt.f5202o;
                    if (colorStateList != null) {
                        AbstractC0104ch.m687g(c0507n2, colorStateList.getColorForState(c0905xt.f5206s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
