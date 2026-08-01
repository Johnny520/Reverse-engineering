package p047I0;

import android.content.Context;
import android.view.View;
import p160f3.C2136g0;
import p211o0.C2746e;

/* JADX INFO: renamed from: I0.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0709Z0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2247d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2248e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0709Z0(int i5, Object obj) {
        this.f2247d = i5;
        this.f2248e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f2247d) {
            case 0:
                break;
            default:
                C2746e c2746e = (C2746e) this.f2248e;
                Context context = view.getContext();
                if (!c2746e.f8732d) {
                    context.getApplicationContext().registerComponentCallbacks(c2746e.f8733e);
                    c2746e.f8732d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f2247d) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                ((C2136g0) this.f2248e).mo3905c(null);
                break;
            default:
                C2746e c2746e = (C2746e) this.f2248e;
                Context context = view.getContext();
                if (c2746e.f8732d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c2746e.f8733e);
                    c2746e.f8732d = false;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1208a(View view) {
    }
}
