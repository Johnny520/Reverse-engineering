package p244u;

import p041H0.InterfaceC0620t0;
import p169h0.AbstractC2206o;
import p169h0.C2197f;

/* JADX INFO: renamed from: u.D */
/* JADX INFO: loaded from: classes.dex */
public final class C3235D extends AbstractC2206o implements InterfaceC0620t0 {

    /* JADX INFO: renamed from: r */
    public C2197f f10024r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0620t0
    /* JADX INFO: renamed from: m0 */
    public final Object mo950m0(Object obj) {
        C3254X c3254x = obj instanceof C3254X ? (C3254X) obj : null;
        if (c3254x == null) {
            c3254x = new C3254X();
        }
        c3254x.f10070c = new C3291x(this.f10024r);
        return c3254x;
    }
}
