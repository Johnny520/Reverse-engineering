package p198m0;

import p028F.C0354o;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p186k.AbstractC2416M;
import p186k.C2404A;
import p186k.C2409F;

/* JADX INFO: renamed from: m0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2578i {

    /* JADX INFO: renamed from: a */
    public final C2584o f8213a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f8214b;

    /* JADX INFO: renamed from: c */
    public final C2409F f8215c;

    /* JADX INFO: renamed from: d */
    public final C2409F f8216d;

    /* JADX INFO: renamed from: e */
    public boolean f8217e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2578i(C2584o c2584o, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        this.f8213a = c2584o;
        this.f8214b = viewTreeObserverOnGlobalLayoutListenerC0772y;
        C2409F c2409f = AbstractC2416M.f7817a;
        this.f8215c = new C2409F();
        this.f8216d = new C2409F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4525a() {
        if (this.f8217e) {
            return;
        }
        C0354o c0354o = new C0354o(0, this, C2578i.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 2);
        C2404A c2404a = this.f8214b.f2427A0;
        if (c2404a.m4249g(c0354o) < 0) {
            c2404a.m4243a(c0354o);
        }
        this.f8217e = true;
    }
}
