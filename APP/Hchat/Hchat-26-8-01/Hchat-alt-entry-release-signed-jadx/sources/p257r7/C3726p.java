package p257r7;

import p068eh.AbstractC0921a;
import p152k7.AbstractC2331a;
import p241q7.InterfaceC3444a;

/* JADX INFO: renamed from: r7.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3726p extends AbstractC3712b implements InterfaceC3444a {

    /* JADX INFO: renamed from: m */
    public final C3716f f12099m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3726p(C3716f c3716f) {
        super(0);
        this.f12099m = c3716f;
        c3716f.f7660j = this;
        this.f7660j = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m7738N(int i9) {
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = i9 * 4;
        if (i10 >= 0) {
            m7715M(i10, true);
        } else {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Huge integers size = ", ", parent = ");
            sbM2257t.append(this.f7658h);
            throw new IndexOutOfBoundsException(sbM2257t.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p241q7.InterfaceC3444a
    /* JADX INFO: renamed from: m */
    public final void mo1926m(AbstractC2331a abstractC2331a) {
        C3716f c3716f = this.f12099m;
        if (abstractC2331a == c3716f) {
            m7738N(c3716f.f12083n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int iM5539s;
        StringBuilder sb2 = new StringBuilder("size=");
        int length = this.f12076k.length / 4;
        sb2.append(length);
        int i9 = length <= 10 ? length : 10;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 == 0) {
                sb2.append(" [");
            } else {
                sb2.append(", ");
            }
            int i11 = 65535 & i10;
            if (i11 >= 0) {
                byte[] bArr = this.f12076k;
                iM5539s = i11 >= bArr.length / 4 ? 0 : AbstractC2331a.m5539s(bArr, i11 * 4);
            }
            sb2.append(iM5539s);
        }
        if (length > i9) {
            sb2.append(", +");
            sb2.append(length - i9);
            sb2.append(" more");
        }
        if (length > 0) {
            sb2.append(']');
        }
        return sb2.toString();
    }
}
