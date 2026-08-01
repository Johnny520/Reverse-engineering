package p189n;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p265s1.AbstractC7147u0;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7089i2;
import p265s1.InterfaceC7144t2;
import p290u1.C8482a;

/* JADX INFO: renamed from: n.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5242l {

    /* JADX INFO: renamed from: a */
    public InterfaceC7089i2 f16138a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7088i1 f16139b;

    /* JADX INFO: renamed from: c */
    public C8482a f16140c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7144t2 f16141d;

    public /* synthetic */ C5242l(InterfaceC7089i2 interfaceC7089i2, InterfaceC7088i1 interfaceC7088i1, C8482a c8482a, InterfaceC7144t2 interfaceC7144t2, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : interfaceC7089i2, (i10 & 2) != 0 ? null : interfaceC7088i1, (i10 & 4) != 0 ? null : c8482a, (i10 & 8) != 0 ? null : interfaceC7144t2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5242l)) {
            return false;
        }
        C5242l c5242l = (C5242l) obj;
        return AbstractC1061t.m3842c(this.f16138a, c5242l.f16138a) && AbstractC1061t.m3842c(this.f16139b, c5242l.f16139b) && AbstractC1061t.m3842c(this.f16140c, c5242l.f16140c) && AbstractC1061t.m3842c(this.f16141d, c5242l.f16141d);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC7144t2 m21478g() {
        InterfaceC7144t2 interfaceC7144t2 = this.f16141d;
        if (interfaceC7144t2 != null) {
            return interfaceC7144t2;
        }
        InterfaceC7144t2 interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
        this.f16141d = interfaceC7144t2M28224a;
        return interfaceC7144t2M28224a;
    }

    public int hashCode() {
        InterfaceC7089i2 interfaceC7089i2 = this.f16138a;
        int iHashCode = (interfaceC7089i2 == null ? 0 : interfaceC7089i2.hashCode()) * 31;
        InterfaceC7088i1 interfaceC7088i1 = this.f16139b;
        int iHashCode2 = (iHashCode + (interfaceC7088i1 == null ? 0 : interfaceC7088i1.hashCode())) * 31;
        C8482a c8482a = this.f16140c;
        int iHashCode3 = (iHashCode2 + (c8482a == null ? 0 : c8482a.hashCode())) * 31;
        InterfaceC7144t2 interfaceC7144t2 = this.f16141d;
        return iHashCode3 + (interfaceC7144t2 != null ? interfaceC7144t2.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f16138a + ", canvas=" + this.f16139b + ", canvasDrawScope=" + this.f16140c + ", borderPath=" + this.f16141d + ')';
    }

    public C5242l(InterfaceC7089i2 interfaceC7089i2, InterfaceC7088i1 interfaceC7088i1, C8482a c8482a, InterfaceC7144t2 interfaceC7144t2) {
        this.f16138a = interfaceC7089i2;
        this.f16139b = interfaceC7088i1;
        this.f16140c = c8482a;
        this.f16141d = interfaceC7144t2;
    }
}
