package p047d7;

import p034c7.EnumC0411g;
import p152k7.AbstractC2331a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: d7.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0725h extends AbstractC0737t {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2164o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0725h(int i9, EnumC0411g enumC0411g, int i10) {
        super(i9, enumC0411g);
        this.f2164o = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f2164o) {
            case 0:
                return m1932T() + ", crc=" + AbstractC5999a.m10749l(8, m1927N(4)) + ", compressed=" + m1927N(8) + ", size=" + m1927N(12);
            case 1:
                if (mo5551p() < this.f2191n) {
                    return "Invalid";
                }
                return m1932T() + ", offsetZip64Record=" + AbstractC2331a.m5540t(this.f12076k, 8) + ", numberOfDisks=" + AbstractC2331a.m5539s(this.f12076k, 16);
            default:
                if (mo5551p() < this.f2191n) {
                    return "Invalid";
                }
                return m1932T() + ", EOCDR=" + AbstractC2331a.m5540t(this.f12076k, 4) + ", creator=" + m1928O(12) + ", viewer=" + m1928O(12) + ", disk number=" + AbstractC2331a.m5539s(this.f12076k, 16) + ", disk CD=" + AbstractC2331a.m5539s(this.f12076k, 20) + ", noOf CDR=" + AbstractC2331a.m5540t(this.f12076k, 24) + ", total rec=" + AbstractC2331a.m5540t(this.f12076k, 32) + ", size of CD=" + AbstractC2331a.m5540t(this.f12076k, 40) + ", offset of CD=" + AbstractC2331a.m5540t(this.f12076k, 48);
        }
    }
}
