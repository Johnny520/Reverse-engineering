package p199nd;

import java.util.List;
import md.C2825b;
import p068eh.AbstractC0921a;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;

/* JADX INFO: renamed from: nd.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2980l implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final List f9743g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2980l(List list) {
        this.f9743g = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9183J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2251n("GenericInfoAttr{", String.valueOf(this.f9743g), ", explicit=false}");
    }
}
