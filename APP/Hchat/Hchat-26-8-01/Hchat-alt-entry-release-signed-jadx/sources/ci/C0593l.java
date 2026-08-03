package ci;

import p071f1.C1034w;
import p144k.InterfaceC2226y0;
import p187n.C2857k;
import p339x1.InterfaceC5612i;

/* JADX INFO: renamed from: ci.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0593l implements InterfaceC2226y0 {

    /* JADX INFO: renamed from: a */
    public final long f1852a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0593l(long j3) {
        this.f1852a = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2226y0
    /* JADX INFO: renamed from: a */
    public final InterfaceC5612i mo1606a(C2857k c2857k) {
        c2857k.getClass();
        return new C0591k(c2857k, this.f1852a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0593l) {
            return C1034w.m2635c(this.f1852a, ((C0593l) obj).f1852a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2226y0
    public final int hashCode() {
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f1852a);
    }
}
