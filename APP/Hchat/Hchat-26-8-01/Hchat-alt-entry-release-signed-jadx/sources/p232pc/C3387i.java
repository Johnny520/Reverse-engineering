package p232pc;

import java.util.ArrayList;
import p214oc.AbstractC3127d;
import p214oc.C3126c;
import p214oc.InterfaceC3124a;

/* JADX INFO: renamed from: pc.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3387i extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final ArrayList f10924g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3387i(ArrayList arrayList) {
        this.f10924g = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C3126c.f10137j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "METHOD_PARAMETERS: ".concat(String.valueOf(this.f10924g));
    }
}
