package p182m7;

import p068eh.AbstractC0921a;
import p257r7.C3725o;

/* JADX INFO: renamed from: m7.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2802o extends AbstractC2789b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p182m7.AbstractC2789b, p166l7.AbstractC2513a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("xmlns:");
        C3725o c3725oM6165V = m6165V(this.f9036o.f12083n);
        sb2.append(c3725oM6165V != null ? c3725oM6165V.f12101m : null);
        sb2.append("=\"");
        C3725o c3725oM6165V2 = m6165V(this.f9037p.f12083n);
        return AbstractC0921a.m2255r(sb2, c3725oM6165V2 != null ? c3725oM6165V2.f12101m : null, "\"");
    }
}
