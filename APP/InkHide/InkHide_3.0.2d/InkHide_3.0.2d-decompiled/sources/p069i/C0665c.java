package p069i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import p099y.InterfaceC1055T;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0665c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2239a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2240b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0665c(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2240b = actionBarOverlayLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f2239a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2240b;
                actionBarOverlayLayout.f999x = null;
                actionBarOverlayLayout.f987l = false;
                break;
            default:
                ((InterfaceC1055T) this.f2240b).mo996b();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2239a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2240b;
                actionBarOverlayLayout.f999x = null;
                actionBarOverlayLayout.f987l = false;
                break;
            default:
                ((InterfaceC1055T) this.f2240b).mo1047a();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2239a) {
            case 1:
                ((InterfaceC1055T) this.f2240b).mo997c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0665c(InterfaceC1055T interfaceC1055T, View view) {
        this.f2240b = interfaceC1055T;
    }
}
