package p222p;

import p339x1.AbstractC5618k;
import p339x1.InterfaceC5600e2;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: p.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3212e0 extends AbstractC5852n implements InterfaceC5600e2 {

    /* JADX INFO: renamed from: u */
    public InterfaceC3252r1 f10262u;

    /* JADX INFO: renamed from: v */
    public InterfaceC3252r1 f10263v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3212e0() {
        C3206c0 c3206c0 = AbstractC3208d.f10248c;
        this.f10262u = c3206c0;
        this.f10263v = c3206c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5600e2
    /* JADX INFO: renamed from: F */
    public final Object mo742F() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public void mo1323c1() {
        AbstractC5618k.m10170z(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C3209d0(this, 1));
        mo6895l1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public void mo743d1() {
        this.f10263v = this.f10262u;
        AbstractC5618k.m10144C(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C3209d0(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: e1 */
    public final void mo1328e1() {
        this.f10262u = AbstractC3208d.f10248c;
    }

    /* JADX INFO: renamed from: k1 */
    public abstract InterfaceC3252r1 mo6894k1(InterfaceC3252r1 interfaceC3252r1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public void mo6895l1() {
        this.f10263v = mo6894k1(this.f10262u);
        AbstractC5618k.m10144C(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new C3209d0(this, 0));
    }
}
