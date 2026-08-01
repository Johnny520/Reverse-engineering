package p190n0;

import p073f2.C2236d0;
import p073f2.C2261q;
import p179m2.InterfaceC4862j3;

/* JADX INFO: renamed from: n0.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5382l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4862j3 f16562a;

    /* JADX INFO: renamed from: b */
    public int f16563b;

    /* JADX INFO: renamed from: c */
    public C2236d0 f16564c;

    public C5382l(InterfaceC4862j3 interfaceC4862j3) {
        this.f16562a = interfaceC4862j3;
    }

    /* JADX INFO: renamed from: a */
    public final int m21921a() {
        return this.f16563b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21922b(C2236d0 c2236d0, C2236d0 c2236d02) {
        return AbstractC5396n1.m21958i(this.f16562a, c2236d0, c2236d02);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21923c(C2236d0 c2236d0, C2236d0 c2236d02) {
        return c2236d02.m8084o() - c2236d0.m8084o() < this.f16562a.mo17977a();
    }

    /* JADX INFO: renamed from: d */
    public final void m21924d(C2261q c2261q) {
        C2236d0 c2236d0 = this.f16564c;
        C2236d0 c2236d02 = (C2236d0) c2261q.m8216c().get(0);
        if (c2236d0 != null && m21923c(c2236d0, c2236d02) && m21922b(c2236d0, c2236d02)) {
            this.f16563b++;
        } else {
            this.f16563b = 1;
        }
        this.f16564c = c2236d02;
    }
}
