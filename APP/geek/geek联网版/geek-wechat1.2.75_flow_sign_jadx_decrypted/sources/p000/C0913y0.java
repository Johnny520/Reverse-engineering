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
    public final /* synthetic */ int f5320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5321b;

    public /* synthetic */ C0913y0(int i, Object obj) {
        this.f5320a = i;
        this.f5321b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f5320a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5321b;
                actionBarOverlayLayout.f240w = null;
                actionBarOverlayLayout.f228k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5320a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f5321b;
                actionBarOverlayLayout.f240w = null;
                actionBarOverlayLayout.f228k = false;
                break;
            case Base64.NO_PADDING /* 1 */:
                C0507n2 c0507n2 = (C0507n2) this.f5321b;
                ArrayList arrayList = new ArrayList(c0507n2.f3209e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0979zt) arrayList.get(i)).f5619b.f772o;
                    if (colorStateList != null) {
                        AbstractC0187eh.m995h(c0507n2, colorStateList);
                    }
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                C0670rh c0670rh = (C0670rh) this.f5321b;
                c0670rh.m1403p();
                c0670rh.f4143r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f5321b).f930h = null;
                break;
            case 4:
                AbstractC0493mp.m1857g("animation", animator);
                ((FrameLayout) this.f5321b).setLayerType(0, null);
                break;
            default:
                ((x70) this.f5321b).m2647l();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5320a) {
            case Base64.NO_PADDING /* 1 */:
                C0507n2 c0507n2 = (C0507n2) this.f5321b;
                ArrayList arrayList = new ArrayList(c0507n2.f3209e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0081bu c0081bu = ((C0979zt) arrayList.get(i)).f5619b;
                    ColorStateList colorStateList = c0081bu.f772o;
                    if (colorStateList != null) {
                        AbstractC0187eh.m994g(c0507n2, colorStateList.getColorForState(c0081bu.f776s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
