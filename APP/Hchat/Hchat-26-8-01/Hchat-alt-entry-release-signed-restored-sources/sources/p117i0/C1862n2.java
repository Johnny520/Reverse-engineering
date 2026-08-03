package p117i0;

import gg.AbstractC1416l;
import p266s0.C3878h;

/* JADX INFO: renamed from: i0.n2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1862n2 implements InterfaceC1870p2 {

    /* JADX INFO: renamed from: a */
    public final Object f6187a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1862n2(Object obj) {
        this.f6187a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1870p2
    /* JADX INFO: renamed from: a */
    public final Object mo4454a(C3878h c3878h) {
        return this.f6187a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1862n2) && AbstractC1416l.m3825a(this.f6187a, ((C1862n2) obj).f6187a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f6187a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StaticValueHolder(value=" + this.f6187a + ')';
    }
}
