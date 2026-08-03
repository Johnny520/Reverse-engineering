package p199nd;

import java.util.BitSet;
import md.C2825b;
import p214oc.AbstractC3127d;
import p214oc.InterfaceC3124a;
import p302ud.C4322r;

/* JADX INFO: renamed from: nd.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2973g0 extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final BitSet f9732g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2973g0(C4322r c4322r) {
        this.f9732g = new BitSet(c4322r.f14410k.f10152i.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m6391b(C4322r c4322r, int i9) {
        C2973g0 c2973g0 = (C2973g0) c4322r.f9217g.mo6237c(C2825b.f9202q);
        if (c2973g0 == null) {
            c2973g0 = new C2973g0(c4322r);
            c4322r.m6233y(c2973g0);
        }
        c2973g0.f9732g.set(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9202q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SKIP_MTH_ARGS: ".concat(String.valueOf(this.f9732g));
    }
}
