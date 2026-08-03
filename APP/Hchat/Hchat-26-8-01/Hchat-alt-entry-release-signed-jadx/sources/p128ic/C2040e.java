package p128ic;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p110hc.InterfaceC1704a;

/* JADX INFO: renamed from: ic.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2040e implements InterfaceC1704a {

    /* JADX INFO: renamed from: g */
    public final C2039d f6880g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2040e(C2039d c2039d) {
        this.f6880g = c2039d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C2039d c2039d = this.f6880g;
        String strValueOf = String.valueOf(c2039d);
        String str = c2039d.f6877j;
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("VarRef{", strValueOf, ", name=", str, ", mth="), String.valueOf(c2039d.f6874g), "}");
    }
}
