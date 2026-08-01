package p198m0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: m0.c */
/* JADX INFO: loaded from: classes.dex */
final class C2572c extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f8207a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2572c(InterfaceC1601c interfaceC1601c) {
        this.f8207a = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2574e c2574e = new C2574e();
        c2574e.f8208r = this.f8207a;
        return c2574e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2572c) {
            return this.f8207a == ((C2572c) obj).f8207a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C2574e) abstractC2206o).f8208r = this.f8207a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8207a.hashCode();
    }
}
