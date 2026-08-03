package p105h6;

import p136j8.C2104o;
import p151k6.AbstractC2325x;
import p208o6.C3066a;

/* JADX INFO: renamed from: h6.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1613e extends AbstractC2325x {

    /* JADX INFO: renamed from: a */
    public AbstractC1622n f5289a = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) {
        AbstractC1622n abstractC1622n = this.f5289a;
        if (abstractC1622n != null) {
            abstractC1622n.mo4127b(c3066a, obj);
        } else {
            C2104o.m5276A("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p151k6.AbstractC2325x
    /* JADX INFO: renamed from: c */
    public final AbstractC1622n mo4128c() {
        AbstractC1622n abstractC1622n = this.f5289a;
        if (abstractC1622n != null) {
            return abstractC1622n;
        }
        C2104o.m5276A("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
