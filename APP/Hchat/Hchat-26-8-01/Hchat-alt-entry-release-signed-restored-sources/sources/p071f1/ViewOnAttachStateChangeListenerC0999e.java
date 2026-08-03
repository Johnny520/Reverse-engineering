package p071f1;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import p014b.C0126e;
import p069f.C0943k0;
import p249qg.C3560e1;
import p299u9.C4282a;
import p299u9.C4289h;

/* JADX INFO: renamed from: f1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0999e implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3167g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3168h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnAttachStateChangeListenerC0999e(Object obj, int i9) {
        this.f3167g = i9;
        this.f3168h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C4282a c4282a;
        switch (this.f3167g) {
            case 0:
                C1001f c1001f = (C1001f) this.f3168h;
                Context context = view.getContext();
                if (c1001f.f3175d) {
                    return;
                }
                context.getApplicationContext().registerComponentCallbacks(c1001f.f3177f);
                c1001f.f3175d = true;
                return;
            case 1:
                view.getClass();
                Map map = ((C4289h) this.f3168h).f14225i;
                map.getClass();
                C4289h c4289h = (C4289h) this.f3168h;
                synchronized (map) {
                    c4282a = (C4282a) c4289h.f14225i.get(view);
                }
                if (c4282a != null) {
                    View rootView = view.getRootView();
                    rootView.getClass();
                    c4282a.f14201a = rootView;
                    ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(c4282a.f14202b);
                    }
                    if (((C4289h) this.f3168h).f14221e.getBoolean("hide_wechat_bottom_bar_enable", false)) {
                        ((C4289h) this.f3168h).m8611e(view);
                        ((C4289h) this.f3168h).m8609b(c4282a.f14201a);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C4282a c4282a;
        switch (this.f3167g) {
            case 0:
                C1001f c1001f = (C1001f) this.f3168h;
                Context context = view.getContext();
                if (c1001f.f3175d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c1001f.f3177f);
                    c1001f.f3175d = false;
                }
                C0126e c0126e = c1001f.f3176e;
                if (c0126e != null) {
                    synchronized (c0126e) {
                        try {
                            C0943k0 c0943k0 = (C0943k0) c0126e.f332h;
                            if (c0943k0 != null) {
                                c0943k0.m2314a();
                            }
                            c0126e.f333i = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                c1001f.f3176e = null;
                return;
            case 1:
                view.getClass();
                Map map = ((C4289h) this.f3168h).f14225i;
                map.getClass();
                C4289h c4289h = (C4289h) this.f3168h;
                synchronized (map) {
                    c4282a = (C4282a) c4289h.f14225i.get(view);
                }
                if (c4282a != null) {
                    ViewTreeObserver viewTreeObserver = c4282a.f14201a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(c4282a.f14202b);
                        return;
                    }
                    return;
                }
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((C3560e1) this.f3168h).mo7485a(null);
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m2553a(View view) {
    }
}
