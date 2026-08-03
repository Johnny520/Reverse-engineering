package p311v4;

import p000a.AbstractC0000a;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4473v extends AbstractC4471t {

    /* JADX INFO: renamed from: h */
    public static final C4473v f14819h = new C4473v(0);

    /* JADX INFO: renamed from: i */
    public static final C4473v f14820i = new C4473v(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return Long.toString(this.f14818g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15642u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "long";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("long{0x");
        long j3 = this.f14818g;
        sb2.append(AbstractC0000a.m50Z0(j3));
        sb2.append(" / ");
        sb2.append(j3);
        sb2.append('}');
        return sb2.toString();
    }
}
