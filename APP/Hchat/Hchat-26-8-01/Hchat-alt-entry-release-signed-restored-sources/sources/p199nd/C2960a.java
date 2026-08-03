package p199nd;

import md.C2825b;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p214oc.AbstractC3127d;
import p214oc.InterfaceC3124a;
import p246qd.AbstractC3506j;
import p302ud.C4309e;

/* JADX INFO: renamed from: nd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2960a extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final C4309e f9709g;

    /* JADX INFO: renamed from: h */
    public final AbstractC3506j f9710h;

    /* JADX INFO: renamed from: i */
    public final int f9711i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2960a(C4309e c4309e, AbstractC3506j abstractC3506j, int i9) {
        this.f9709g = c4309e;
        this.f9710h = abstractC3506j;
        this.f9711i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9193h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f9709g);
        String strValueOf2 = String.valueOf(this.f9710h);
        int i9 = this.f9711i;
        return AbstractC0921a.m2255r(AbstractC0255e.m1027p("AnonymousClass{", strValueOf, ", base: ", strValueOf2, ", inline type: "), i9 != 1 ? i9 != 2 ? "null" : "INSTANCE_FIELD" : "CONSTRUCTOR", "}");
    }
}
