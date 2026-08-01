package p211o0;

import android.content.Context;
import android.os.Build;
import me.dartcv.nuke.R;
import p047I0.ViewOnAttachStateChangeListenerC0709Z0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p222q0.C2901b;
import p228r0.C3029b;
import p228r0.C3032e;
import p228r0.C3034g;
import p228r0.C3036i;
import p228r0.InterfaceC3031d;
import p233s0.AbstractC3167a;
import p233s0.C3168b;

/* JADX INFO: renamed from: o0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2746e implements InterfaceC2765x {

    /* JADX INFO: renamed from: f */
    public static boolean f8728f = true;

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f8729a;

    /* JADX INFO: renamed from: b */
    public final Object f8730b = new Object();

    /* JADX INFO: renamed from: c */
    public C3168b f8731c;

    /* JADX INFO: renamed from: d */
    public boolean f8732d;

    /* JADX INFO: renamed from: e */
    public final ComponentCallbacks2C2745d f8733e;

    public C2746e(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        this.f8729a = viewTreeObserverOnGlobalLayoutListenerC0772y;
        ComponentCallbacks2C2745d componentCallbacks2C2745d = new ComponentCallbacks2C2745d(this);
        this.f8733e = componentCallbacks2C2745d;
        if (viewTreeObserverOnGlobalLayoutListenerC0772y.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0772y.getContext();
            if (!this.f8732d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C2745d);
                this.f8732d = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC0772y.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0709Z0(1, this));
    }

    @Override // p211o0.InterfaceC2765x
    /* JADX INFO: renamed from: a */
    public final void mo4859a(C3029b c3029b) {
        synchronized (this.f8730b) {
            if (!c3029b.f9625s) {
                c3029b.f9625s = true;
                c3029b.m5226b();
            }
        }
    }

    @Override // p211o0.InterfaceC2765x
    /* JADX INFO: renamed from: b */
    public final C3029b mo4860b() {
        InterfaceC3031d c3036i;
        C3029b c3029b;
        synchronized (this.f8730b) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f8729a;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC0772y.getUniqueDrawingId();
                }
                if (i5 >= 29) {
                    c3036i = new C3034g();
                } else if (f8728f) {
                    try {
                        c3036i = new C3032e(this.f8729a, new C2761t(), new C2901b());
                    } catch (Throwable unused) {
                        f8728f = false;
                        c3036i = new C3036i(m4861c(this.f8729a));
                    }
                } else {
                    c3036i = new C3036i(m4861c(this.f8729a));
                }
                c3029b = new C3029b(c3036i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3029b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC3167a m4861c(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        C3168b c3168b = this.f8731c;
        if (c3168b != null) {
            return c3168b;
        }
        C3168b c3168b2 = new C3168b(viewTreeObserverOnGlobalLayoutListenerC0772y.getContext());
        c3168b2.setClipChildren(false);
        c3168b2.setClipToPadding(false);
        c3168b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC0772y.addView(c3168b2, -1);
        this.f8731c = c3168b2;
        return c3168b2;
    }
}
