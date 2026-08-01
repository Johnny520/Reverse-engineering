package p047I0;

import p077P0.C1135v;
import p077P0.InterfaceC1136w;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: I0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0663C implements InterfaceC1136w {

    /* JADX INFO: renamed from: d */
    public boolean f2102d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2738M f2103e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0663C(InterfaceC2738M interfaceC2738M) {
        this.f2103e = interfaceC2738M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077P0.InterfaceC1136w
    /* JADX INFO: renamed from: a */
    public final void mo1128a(C1135v c1135v, Object obj) {
        if (obj == this.f2103e) {
            this.f2102d = true;
        }
    }
}
