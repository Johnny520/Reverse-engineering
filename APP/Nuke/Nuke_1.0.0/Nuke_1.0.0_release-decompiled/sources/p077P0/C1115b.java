package p077P0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2205n;

/* JADX INFO: renamed from: P0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1115b extends AbstractC0582a0 implements InterfaceC2205n {

    /* JADX INFO: renamed from: a */
    public final boolean f3635a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1601c f3636b;

    public C1115b(boolean z5, InterfaceC1601c interfaceC1601c) {
        this.f3635a = z5;
        this.f3636b = interfaceC1601c;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C1117d c1117d = new C1117d();
        c1117d.f3639r = this.f3635a;
        c1117d.f3640s = this.f3636b;
        return c1117d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1115b)) {
            return false;
        }
        C1115b c1115b = (C1115b) obj;
        return this.f3635a == c1115b.f3635a && this.f3636b == c1115b.f3636b;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C1117d c1117d = (C1117d) abstractC2206o;
        c1117d.f3639r = this.f3635a;
        c1117d.f3640s = this.f3636b;
    }

    public final int hashCode() {
        return this.f3636b.hashCode() + (Boolean.hashCode(this.f3635a) * 31);
    }
}
