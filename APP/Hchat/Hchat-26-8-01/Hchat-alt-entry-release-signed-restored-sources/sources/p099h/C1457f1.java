package p099h;

import gg.AbstractC1417m;
import p085fg.InterfaceC1231l;
import p116i.InterfaceC1803y;

/* JADX INFO: renamed from: h.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1457f1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1417m f4837a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1803y f4838b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: fg.l */
    /* JADX WARN: Multi-variable type inference failed */
    public C1457f1(InterfaceC1231l interfaceC1231l, InterfaceC1803y interfaceC1803y) {
        this.f4837a = (AbstractC1417m) interfaceC1231l;
        this.f4838b = interfaceC1803y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1457f1)) {
            return false;
        }
        C1457f1 c1457f1 = (C1457f1) obj;
        return this.f4837a.equals(c1457f1.f4837a) && this.f4838b.equals(c1457f1.f4838b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4838b.hashCode() + (this.f4837a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Slide(slideOffset=" + this.f4837a + ", animationSpec=" + this.f4838b + ')';
    }
}
