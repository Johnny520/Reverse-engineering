package p332wb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: wb.v2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5393v2 extends AbstractC5459x2 {

    /* JADX INFO: renamed from: a */
    public final C5294s2 f21269a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5393v2(C5294s2 c5294s2) {
        this.f21269a = c5294s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5393v2) && AbstractC1416l.m3825a(this.f21269a, ((C5393v2) obj).f21269a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C5294s2 c5294s2 = this.f21269a;
        if (c5294s2 == null) {
            return 0;
        }
        return c5294s2.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptPluginMarket(parentFeature=" + this.f21269a + ")";
    }
}
