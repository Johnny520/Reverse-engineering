package p116i;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1750f1 implements InterfaceC1747e1 {

    /* JADX INFO: renamed from: a */
    public final Object f5842a;

    /* JADX INFO: renamed from: b */
    public final Object f5843b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1750f1(Object obj, Object obj2) {
        this.f5842a = obj;
        this.f5843b = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1747e1
    /* JADX INFO: renamed from: b */
    public final Object mo4002b() {
        return this.f5842a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1747e1
    /* JADX INFO: renamed from: c */
    public final Object mo4003c() {
        return this.f5843b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1747e1)) {
            return false;
        }
        InterfaceC1747e1 interfaceC1747e1 = (InterfaceC1747e1) obj;
        return AbstractC1416l.m3825a(this.f5842a, interfaceC1747e1.mo4002b()) && AbstractC1416l.m3825a(this.f5843b, interfaceC1747e1.mo4003c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f5842a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f5843b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
