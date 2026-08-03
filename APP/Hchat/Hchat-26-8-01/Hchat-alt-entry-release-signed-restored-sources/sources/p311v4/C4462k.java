package p311v4;

import p000a.AbstractC0000a;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4462k extends AbstractC4471t {

    /* JADX INFO: renamed from: h */
    public static final C4462k f14795h = new C4462k(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: i */
    public static final C4462k f14796i = new C4462k(Double.doubleToLongBits(1.0d));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return Double.toString(Double.longBitsToDouble(this.f14818g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15639r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "double";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("double{0x");
        long j3 = this.f14818g;
        sb2.append(AbstractC0000a.m50Z0(j3));
        sb2.append(" / ");
        sb2.append(Double.longBitsToDouble(j3));
        sb2.append('}');
        return sb2.toString();
    }
}
