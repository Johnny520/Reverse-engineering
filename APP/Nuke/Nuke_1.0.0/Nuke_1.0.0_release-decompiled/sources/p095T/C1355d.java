package p095T;

import p112W2.InterfaceC1601c;
import p127Z2.AbstractC1784a;
import p136b0.AbstractC1840b;
import p160f3.C2135g;

/* JADX INFO: renamed from: T.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1355d extends AbstractC1840b {

    /* JADX INFO: renamed from: a */
    public C2135g f4790a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1601c f4791b;

    @Override // p136b0.AbstractC1840b
    /* JADX INFO: renamed from: a */
    public final void mo2500a() {
        this.f4791b = null;
        this.f4790a = null;
    }

    @Override // p136b0.AbstractC1840b
    /* JADX INFO: renamed from: b */
    public final void mo2501b(Throwable th) {
        C2135g c2135g = this.f4790a;
        if (c2135g != null) {
            c2135g.mo278i(AbstractC1784a.m3229o(th));
        }
    }
}
