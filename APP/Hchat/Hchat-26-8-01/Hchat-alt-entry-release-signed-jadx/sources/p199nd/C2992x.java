package p199nd;

import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import md.C2825b;
import p214oc.AbstractC3127d;
import p214oc.InterfaceC3124a;

/* JADX INFO: renamed from: nd.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2992x extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final List f9765g;

    /* JADX INFO: renamed from: h */
    public SortedSet f9766h;

    /* JADX INFO: renamed from: i */
    public final HashSet f9767i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2992x(List list, SortedSet sortedSet, HashSet hashSet) {
        this.f9765g = list;
        this.f9766h = sortedSet;
        this.f9767i = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9203r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "METHOD_OVERRIDE: ".concat(String.valueOf(this.f9767i));
    }
}
