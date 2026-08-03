package p047d7;

import p152k7.AbstractC2331a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: d7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0726i extends AbstractC0737t {

    /* JADX INFO: renamed from: o */
    public C0725h f2165o;

    /* JADX INFO: renamed from: p */
    public C0725h f2166p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (mo5551p() < this.f2191n) {
            return "Invalid";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1932T());
        if (AbstractC2331a.m5539s(this.f12076k, 16) == -1) {
            sb2.append(", ZIP64");
        }
        sb2.append(", disks=");
        sb2.append(m1928O(4));
        sb2.append(", start disk=");
        sb2.append(m1928O(6));
        sb2.append(", dirs=");
        sb2.append(m1928O(8));
        sb2.append(", total dirs=");
        sb2.append(m1928O(10));
        sb2.append(", length=");
        sb2.append(m1927N(12));
        sb2.append(", offset=");
        C0725h c0725h = this.f2166p;
        sb2.append(c0725h != null ? AbstractC2331a.m5540t(c0725h.f12076k, 48) : m1927N(16));
        sb2.append(", last=");
        sb2.append(AbstractC5999a.m10748k(m1928O(20), 8));
        return sb2.toString();
    }
}
