package p199nd;

import java.util.HashSet;
import md.C2825b;
import p214oc.AbstractC3127d;
import p214oc.InterfaceC3124a;

/* JADX INFO: renamed from: nd.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2994z extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final HashSet f9769g;

    /* JADX INFO: renamed from: h */
    public boolean f9770h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2994z(HashSet hashSet) {
        this.f9769g = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C2825b.f9207v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "THROWS:".concat(String.valueOf(this.f9769g));
    }
}
