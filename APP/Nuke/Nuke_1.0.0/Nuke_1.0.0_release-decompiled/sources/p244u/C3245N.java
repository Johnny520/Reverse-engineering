package p244u;

import p041H0.InterfaceC0620t0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.N */
/* JADX INFO: loaded from: classes.dex */
public final class C3245N extends AbstractC2206o implements InterfaceC0620t0 {

    /* JADX INFO: renamed from: r */
    public float f10046r;

    /* JADX INFO: renamed from: s */
    public boolean f10047s;

    @Override // p041H0.InterfaceC0620t0
    /* JADX INFO: renamed from: m0 */
    public final Object mo950m0(Object obj) {
        C3254X c3254x = obj instanceof C3254X ? (C3254X) obj : null;
        if (c3254x == null) {
            c3254x = new C3254X();
        }
        c3254x.f10068a = this.f10046r;
        c3254x.f10069b = this.f10047s;
        return c3254x;
    }
}
