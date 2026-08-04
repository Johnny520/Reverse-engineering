package yyds;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: yyds.ᛱᛲᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0075 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f647;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f648;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0075(int i, Object obj) {
        this.f647 = i;
        this.f648 = obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m466(View view) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m467(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        long j;
        switch (this.f647) {
            case 0:
                return;
            case 1:
                j = -1017262576927598L;
                break;
            case 2:
                return;
            default:
                j = -596914127668078L;
                break;
        }
        AbstractC2328.m4341(j);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f647;
        Object obj = this.f648;
        switch (i) {
            case 0:
                ViewOnKeyListenerC2374 viewOnKeyListenerC2374 = (ViewOnKeyListenerC2374) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC2374.f11698;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC2374.f11698 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2374.f11698.removeGlobalOnLayoutListener(viewOnKeyListenerC2374.f11704);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                AbstractC2328.m4341(-1017271166862190L);
                ((C2469) obj).m4512(true);
                break;
            case 2:
                ViewOnKeyListenerC0619 viewOnKeyListenerC0619 = (ViewOnKeyListenerC0619) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0619.f2997;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0619.f2997 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0619.f2997.removeGlobalOnLayoutListener(viewOnKeyListenerC0619.f3001);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                AbstractC2328.m4341(-596922717602670L);
                ((ValueAnimator) obj).cancel();
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
