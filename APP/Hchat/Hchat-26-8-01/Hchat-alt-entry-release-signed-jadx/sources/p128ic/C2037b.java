package p128ic;

import java.util.Objects;
import p068eh.AbstractC0921a;
import p110hc.InterfaceC1704a;
import p110hc.InterfaceC1706c;

/* JADX INFO: renamed from: ic.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2037b implements InterfaceC1704a {

    /* JADX INFO: renamed from: g */
    public final InterfaceC1706c f6872g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2037b(InterfaceC1706c interfaceC1706c) {
        Objects.requireNonNull(interfaceC1706c);
        this.f6872g = interfaceC1706c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2037b)) {
            return false;
        }
        return this.f6872g.equals(((C2037b) obj).f6872g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6872g.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2251n("NodeDeclareRef{", String.valueOf(this.f6872g), "}");
    }
}
