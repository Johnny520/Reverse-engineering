package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0869v0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3412a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3413b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0869v0(int i, Object obj) {
        this.f3412a = i;
        this.f3413b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3412a) {
            case 3:
                ((InterfaceC0217Lg) this.f3413b).mo595b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3412a) {
            case 0:
                C0850u0 c0850u0 = (C0850u0) this.f3413b;
                ArrayList arrayList = new ArrayList(c0850u0.f3331e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0831t0) arrayList.get(i)).mo587a(c0850u0);
                }
                break;
            case 1:
                C0098F5 c0098f5 = (C0098F5) this.f3413b;
                c0098f5.m1269q();
                c0098f5.f324r.start();
                break;
            case 2:
                ((HideBottomViewOnScrollBehavior) this.f3413b).f5395h = null;
                break;
            default:
                ((InterfaceC0217Lg) this.f3413b).mo553a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3412a) {
            case 0:
                C0850u0 c0850u0 = (C0850u0) this.f3413b;
                ArrayList arrayList = new ArrayList(c0850u0.f3331e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC0831t0) arrayList.get(i)).mo588b(c0850u0);
                }
                break;
            case 3:
                ((InterfaceC0217Lg) this.f3413b).mo554c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0869v0(InterfaceC0217Lg interfaceC0217Lg, View view) {
        this.f3412a = 3;
        this.f3413b = interfaceC0217Lg;
    }
}
