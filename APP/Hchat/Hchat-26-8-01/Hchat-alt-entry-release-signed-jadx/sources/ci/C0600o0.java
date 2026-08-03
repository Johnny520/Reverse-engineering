package ci;

import p116i.C1785r0;
import p144k.InterfaceC2226y0;
import p187n.C2857k;
import p339x1.InterfaceC5612i;

/* JADX INFO: renamed from: ci.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0600o0 implements InterfaceC2226y0 {

    /* JADX INFO: renamed from: a */
    public final C1785r0 f1883a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0600o0(C1785r0 c1785r0) {
        this.f1883a = c1785r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2226y0
    /* JADX INFO: renamed from: a */
    public final InterfaceC5612i mo1606a(C2857k c2857k) {
        c2857k.getClass();
        return new C0598n0(c2857k, this.f1883a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0600o0) {
            return Float.compare(0.85f, 0.85f) == 0 && this.f1883a.equals(((C0600o0) obj).f1883a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2226y0
    public final int hashCode() {
        return this.f1883a.hashCode() + (Float.hashCode(0.85f) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SinkFeedback(sinkAmount=0.85, animationSpec=" + this.f1883a + ")";
    }
}
