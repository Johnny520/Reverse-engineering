package p199nd;

import md.C2825b;
import p025bc.AbstractC0255e;
import p214oc.AbstractC3127d;
import p214oc.InterfaceC3124a;
import p215od.C3128a;
import p246qd.AbstractC3508l;

/* JADX INFO: renamed from: nd.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2979k extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final int f9741g = 1;

    /* JADX INFO: renamed from: h */
    public final Object f9742h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2979k(C3128a c3128a) {
        this.f9742h = c3128a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9197l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f9741g;
        return AbstractC0255e.m1021j("REPLACE: ", i9 != 1 ? i9 != 2 ? "null" : "VAR" : "CLASS_INSTANCE", " ", String.valueOf(this.f9742h));
    }

    public C2979k(AbstractC3508l abstractC3508l) {
        this.f9742h = abstractC3508l;
    }
}
