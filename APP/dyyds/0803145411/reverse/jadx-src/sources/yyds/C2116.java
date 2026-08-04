package yyds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: yyds.ᲀᲇᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2116 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10458;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f10459;

    public C2116(InterfaceC1824 interfaceC1824, View view) {
        this.f10458 = 2;
        this.f10459 = interfaceC1824;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.f10458;
        Object obj = this.f10459;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f132 = null;
                actionBarOverlayLayout.f109 = false;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ((InterfaceC1824) obj).mo3309();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f10458;
        Object obj = this.f10459;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f132 = null;
                actionBarOverlayLayout.f109 = false;
                break;
            case 1:
                AbstractC2328.m4341(-815291739833198L);
                C1557 c1557 = (C1557) obj;
                if (c1557.f7936 == animator) {
                    c1557.f7936 = null;
                    c1557.f7938 = 0.0f;
                    c1557.f7948 = 1.0f;
                    c1557.invalidateSelf();
                }
                break;
            default:
                ((InterfaceC1824) obj).mo1183();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f10458) {
            case 2:
                ((InterfaceC1824) this.f10459).mo2973();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C2116(int i, Object obj) {
        this.f10458 = i;
        this.f10459 = obj;
    }
}
