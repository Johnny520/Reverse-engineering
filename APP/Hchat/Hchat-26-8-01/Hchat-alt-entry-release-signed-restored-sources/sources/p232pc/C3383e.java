package p232pc;

import java.util.List;
import p214oc.AbstractC3127d;
import p214oc.C3126c;
import p214oc.InterfaceC3124a;

/* JADX INFO: renamed from: pc.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3383e extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final List f10917g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3383e(List list) {
        this.f10917g = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C3126c.f10136i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "EXCEPTIONS:".concat(String.valueOf(this.f10917g));
    }
}
