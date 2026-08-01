package p216p;

import p000A.C0098y0;
import p041H0.C0566K;
import p041H0.InterfaceC0605m;
import p074O2.InterfaceC1046d;
import p160f3.AbstractC2162v;
import p169h0.AbstractC2206o;
import p211o0.C2762u;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;
import p232s.C3162i;

/* JADX INFO: renamed from: p.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2868y extends AbstractC2206o implements InterfaceC0605m {

    /* JADX INFO: renamed from: r */
    public final C3162i f9056r;

    /* JADX INFO: renamed from: s */
    public boolean f9057s;

    /* JADX INFO: renamed from: t */
    public boolean f9058t;

    /* JADX INFO: renamed from: u */
    public boolean f9059u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2868y(C3162i c3162i) {
        this.f9056r = c3162i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        AbstractC2162v.m3994p(m4023x0(), null, new C0098y0(this, (InterfaceC1046d) null, 3), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        c0566k.m857a();
        C2901b c2901b = c0566k.f1742d;
        if (this.f9057s) {
            InterfaceC2903d.m5104h(c0566k, C2762u.m4920b(0.3f, C2762u.f8757b), 0L, c2901b.mo859c(), 122);
        } else if (this.f9058t || this.f9059u) {
            InterfaceC2903d.m5104h(c0566k, C2762u.m4920b(0.1f, C2762u.f8757b), 0L, c2901b.mo859c(), 122);
        }
    }
}
