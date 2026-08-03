package p041d1;

import p015b0.C0156v;
import p069f.AbstractC0959s0;
import p069f.C0933f0;
import p069f.C0945l0;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: d1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0663i {

    /* JADX INFO: renamed from: a */
    public final C0670p f2043a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f2044b;

    /* JADX INFO: renamed from: c */
    public final C0945l0 f2045c;

    /* JADX INFO: renamed from: d */
    public final C0945l0 f2046d;

    /* JADX INFO: renamed from: e */
    public boolean f2047e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0663i(C0670p c0670p, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        this.f2043a = c0670p;
        this.f2044b = viewTreeObserverOnGlobalLayoutListenerC5934t;
        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
        this.f2045c = new C0945l0();
        this.f2046d = new C0945l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1841a() {
        if (this.f2047e) {
            return;
        }
        C0156v c0156v = new C0156v(0, this, C0663i.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 2);
        C0933f0 c0933f0 = this.f2044b.f24073F0;
        if (c0933f0.m2292g(c0156v) < 0) {
            c0933f0.m2286a(c0156v);
        }
        this.f2047e = true;
    }
}
