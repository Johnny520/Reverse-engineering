package p311v4;

import p000a.AbstractC0000a;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4458g extends AbstractC4470s {

    /* JADX INFO: renamed from: h */
    public static final C4458g f14791h = new C4458g(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return Integer.toString(this.f14817g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15637p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "byte";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("byte{0x");
        int i9 = this.f14817g;
        sb2.append(AbstractC0000a.m44W0(i9));
        sb2.append(" / ");
        sb2.append(i9);
        sb2.append('}');
        return sb2.toString();
    }
}
