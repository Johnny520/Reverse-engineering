package p128ic;

import p068eh.AbstractC0921a;
import p081fc.C1199b;
import p081fc.C1203f;
import p110hc.InterfaceC1704a;
import p302ud.C4320p;

/* JADX INFO: renamed from: ic.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2036a implements InterfaceC1704a {

    /* JADX INFO: renamed from: g */
    public final int f6871g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2036a(int i9) {
        this.f6871g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m4989a(C1203f c1203f, C4320p c4320p) {
        if (c4320p == null) {
            return;
        }
        c1203f.getClass();
        if (c1203f instanceof C1199b) {
            int i9 = c4320p.f14399n;
            C2036a c2036a = i9 < 0 ? null : new C2036a(i9);
            if (c2036a != null) {
                c1203f.mo3262l(c2036a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2249l(this.f6871g, "offset=");
    }
}
