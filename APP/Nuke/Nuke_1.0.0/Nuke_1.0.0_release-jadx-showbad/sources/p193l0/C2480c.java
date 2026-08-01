package p193l0;

import com.bumptech.glide.AbstractC1925g;
import p007B0.C0190d;
import p011B4.AbstractC0231b;
import p041H0.AbstractC0601k;
import p041H0.C0566K;
import p041H0.InterfaceC0604l0;
import p041H0.InterfaceC0605m;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: l0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2480c extends AbstractC2206o implements InterfaceC0604l0, InterfaceC2479b, InterfaceC0605m {

    /* JADX INFO: renamed from: r */
    public final C2481d f7978r;

    /* JADX INFO: renamed from: s */
    public boolean f7979s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1601c f7980t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2480c(C2481d c2481d, InterfaceC1601c interfaceC1601c) {
        this.f7978r = c2481d;
        this.f7980t = interfaceC1601c;
        c2481d.f7981d = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: D0 */
    public final void mo4022D0() {
        m4425J0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final void m4425J0() {
        this.f7979s = false;
        this.f7978r.f7982e = null;
        AbstractC0601k.m1034j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() {
        m4425J0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        boolean z5 = this.f7979s;
        C2481d c2481d = this.f7978r;
        if (!z5) {
            c2481d.f7982e = null;
            AbstractC0601k.m1040p(this, new C0190d(9, this, c2481d));
            if (c2481d.f7982e == null) {
                throw AbstractC0231b.m396g("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f7979s = true;
        }
        C1753n c1753n = c2481d.f7982e;
        AbstractC1665j.m2982b(c1753n);
        ((InterfaceC1601c) c1753n.f6028e).mo1h(c0566k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0597i, p041H0.InterfaceC0624v0
    /* JADX INFO: renamed from: a */
    public final void mo289a() {
        m4425J0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p193l0.InterfaceC2479b
    /* JADX INFO: renamed from: b */
    public final InterfaceC2007c mo945b() {
        return AbstractC0601k.m1044t(this).f1692C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p193l0.InterfaceC2479b
    /* JADX INFO: renamed from: c */
    public final long mo946c() {
        return AbstractC1925g.m3523F(AbstractC0601k.m1042r(this, 4).f1208f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p193l0.InterfaceC2479b
    public final EnumC2017m getLayoutDirection() {
        return AbstractC0601k.m1044t(this).f1693D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: n0 */
    public final void mo951n0() {
        m4425J0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0597i
    /* JADX INFO: renamed from: s0 */
    public final void mo1007s0() {
        m4425J0();
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
    }
}
