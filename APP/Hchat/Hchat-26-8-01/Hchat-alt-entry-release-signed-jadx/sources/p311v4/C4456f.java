package p311v4;

import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4456f extends AbstractC4470s {

    /* JADX INFO: renamed from: h */
    public static final C4456f f14789h = new C4456f(0);

    /* JADX INFO: renamed from: i */
    public static final C4456f f14790i = new C4456f(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C4456f m8907n(int i9) {
        if (i9 == 0) {
            return f14789h;
        }
        if (i9 == 1) {
            return f14790i;
        }
        C2104o.m5294t(AbstractC0921a.m2249l(i9, "bogus value: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f14817g == 0 ? "false" : "true";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15636o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "boolean";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14817g == 0 ? "boolean{false}" : "boolean{true}";
    }
}
