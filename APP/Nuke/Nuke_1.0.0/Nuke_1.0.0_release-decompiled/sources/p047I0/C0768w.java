package p047I0;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: I0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0768w extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2394a;

    public C0768w(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        this.f2394a = viewTreeObserverOnGlobalLayoutListenerC0772y;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0749n(this.f2394a);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo141f(AbstractC2206o abstractC2206o) {
    }

    public final int hashCode() {
        return this.f2394a.hashCode();
    }
}
