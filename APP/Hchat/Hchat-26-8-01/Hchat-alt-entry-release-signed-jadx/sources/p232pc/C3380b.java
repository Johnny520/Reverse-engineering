package p232pc;

import java.util.LinkedHashMap;
import p214oc.AbstractC3127d;
import p214oc.C3126c;
import p214oc.InterfaceC3124a;

/* JADX INFO: renamed from: pc.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3380b extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f10914g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3380b(LinkedHashMap linkedHashMap) {
        this.f10914g = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C3126c.f10132e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ANNOTATION_DEFAULT_CLASS: ".concat(String.valueOf(this.f10914g));
    }
}
