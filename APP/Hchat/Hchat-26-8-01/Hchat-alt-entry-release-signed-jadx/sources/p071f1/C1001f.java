package p071f1;

import android.content.Context;
import android.os.Build;
import p014b.C0126e;
import p099h.Hchat.R;
import p101h1.C1565b;
import p118i1.C1902b;
import p118i1.C1905e;
import p118i1.C1907g;
import p118i1.C1909i;
import p118i1.InterfaceC1904d;
import p132j1.AbstractC2049a;
import p132j1.C2050b;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: f1.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1001f implements InterfaceC1037z {

    /* JADX INFO: renamed from: g */
    public static boolean f3171g = true;

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f3172a;

    /* JADX INFO: renamed from: b */
    public final Object f3173b = new Object();

    /* JADX INFO: renamed from: c */
    public C2050b f3174c;

    /* JADX INFO: renamed from: d */
    public boolean f3175d;

    /* JADX INFO: renamed from: e */
    public C0126e f3176e;

    /* JADX INFO: renamed from: f */
    public final ComponentCallbacks2C0997d f3177f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1001f(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        this.f3172a = viewTreeObserverOnGlobalLayoutListenerC5934t;
        ComponentCallbacks2C0997d componentCallbacks2C0997d = new ComponentCallbacks2C0997d(this);
        this.f3177f = componentCallbacks2C0997d;
        if (viewTreeObserverOnGlobalLayoutListenerC5934t.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC5934t.getContext();
            if (!this.f3175d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C0997d);
                this.f3175d = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC5934t.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0999e(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1037z
    /* JADX INFO: renamed from: a */
    public final void mo2555a(C1902b c1902b) {
        synchronized (this.f3173b) {
            if (!c1902b.f6358s) {
                c1902b.f6358s = true;
                c1902b.m4674b();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1037z
    /* JADX INFO: renamed from: b */
    public final C0126e mo2556b() {
        C0126e c0126e = this.f3176e;
        if (c0126e != null) {
            return c0126e;
        }
        C0126e c0126e2 = new C0126e(20, false);
        this.f3176e = c0126e2;
        return c0126e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1037z
    /* JADX INFO: renamed from: c */
    public final C1902b mo2557c() {
        InterfaceC1904d c1909i;
        C1902b c1902b;
        synchronized (this.f3173b) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f3172a;
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC5934t.getUniqueDrawingId();
                }
                if (i9 >= 29) {
                    c1909i = new C1907g();
                } else if (f3171g) {
                    try {
                        c1909i = new C1905e(this.f3172a, new C1033v(), new C1565b());
                    } catch (Throwable unused) {
                        f3171g = false;
                        c1909i = new C1909i(m2558d(this.f3172a));
                    }
                } else {
                    c1909i = new C1909i(m2558d(this.f3172a));
                }
                c1902b = new C1902b(c1909i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1902b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC2049a m2558d(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        C2050b c2050b = this.f3174c;
        if (c2050b != null) {
            return c2050b;
        }
        C2050b c2050b2 = new C2050b(viewTreeObserverOnGlobalLayoutListenerC5934t.getContext());
        c2050b2.setClipChildren(false);
        c2050b2.setClipToPadding(false);
        c2050b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC5934t.addView(c2050b2, -1);
        this.f3174c = c2050b2;
        return c2050b2;
    }
}
