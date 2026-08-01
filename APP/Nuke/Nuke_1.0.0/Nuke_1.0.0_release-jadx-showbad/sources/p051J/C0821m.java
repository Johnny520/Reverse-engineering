package p051J;

import p115X0.C1633h;
import p115X0.InterfaceC1632g;

/* JADX INFO: renamed from: J.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0821m implements InterfaceC1632g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1632g[] f2639a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0821m(InterfaceC1632g[] interfaceC1632gArr) {
        this.f2639a = interfaceC1632gArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p115X0.InterfaceC1632g
    /* JADX INFO: renamed from: a */
    public final void mo1453a(C1633h c1633h) {
        for (InterfaceC1632g interfaceC1632g : this.f2639a) {
            interfaceC1632g.mo1453a(c1633h);
        }
    }
}
