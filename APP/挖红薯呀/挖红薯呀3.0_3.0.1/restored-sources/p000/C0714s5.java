package p000;

import android.content.Context;

/* JADX INFO: renamed from: s5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0714s5 implements InterfaceC0819ux {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f5640a;

    /* JADX INFO: renamed from: b */
    public final Object f5641b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f5642c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C0640q5 f5643d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0714s5(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        this.f5640a = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        ComponentCallbacks2C0640q5 componentCallbacks2C0640q5 = new ComponentCallbacks2C0640q5();
        this.f5643d = componentCallbacks2C0640q5;
        if (viewTreeObserverOnGlobalLayoutListenerC0875w3.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0875w3.getContext();
            if (!this.f5642c) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C0640q5);
                this.f5642c = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC0875w3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0677r5(0, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0819ux
    /* JADX INFO: renamed from: a */
    public final void mo4004a(C0868vx c0868vx) {
        synchronized (this.f5641b) {
            if (!c0868vx.f6855s) {
                c0868vx.f6855s = true;
                c0868vx.m4795b();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0819ux
    /* JADX INFO: renamed from: b */
    public final C0868vx mo4005b() {
        C0868vx c0868vx;
        synchronized (this.f5641b) {
            this.f5640a.getUniqueDrawingId();
            c0868vx = new C0868vx(new C1020zx());
        }
        return c0868vx;
    }
}
