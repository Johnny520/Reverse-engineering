package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2437r0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8546b;

    public /* synthetic */ C2437r0(int i, Object obj) {
        this.f8545a = i;
        this.f8546b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f8545a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8546b;
                actionBarOverlayLayout.f3772w = null;
                actionBarOverlayLayout.f3759j = false;
                break;
            case 6:
                ((InterfaceC0359IE) this.f8546b).mo797d();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8545a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8546b;
                actionBarOverlayLayout.f3772w = null;
                actionBarOverlayLayout.f3759j = false;
                break;
            case 1:
                C0519M2 c0519m2 = (C0519M2) this.f8546b;
                ArrayList arrayList = new ArrayList(c0519m2.f1695e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0592Nq) arrayList.get(i)).f1921b.f2168o;
                    if (colorStateList != null) {
                        c0519m2.setTintList(colorStateList);
                    }
                }
                break;
            case 2:
                C0494Le c0494Le = (C0494Le) this.f8546b;
                c0494Le.m2348p();
                c0494Le.f1619r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f8546b).f4390k = null;
                break;
            case 4:
                ((HideViewOnScrollBehavior) this.f8546b).f4401k = null;
                break;
            case 5:
                ((AbstractC0356IB) this.f8546b).m777m();
                animator.removeListener(this);
                break;
            default:
                ((InterfaceC0359IE) this.f8546b).mo796c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f8545a) {
            case 1:
                C0519M2 c0519m2 = (C0519M2) this.f8546b;
                ArrayList arrayList = new ArrayList(c0519m2.f1695e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0678Pq c0678Pq = ((C0592Nq) arrayList.get(i)).f1921b;
                    ColorStateList colorStateList = c0678Pq.f2168o;
                    if (colorStateList != null) {
                        c0519m2.setTint(colorStateList.getColorForState(c0678Pq.f2172s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 6:
                ((InterfaceC0359IE) this.f8546b).mo795C();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C2437r0(InterfaceC0359IE interfaceC0359IE, View view) {
        this.f8545a = 6;
        this.f8546b = interfaceC0359IE;
    }
}
