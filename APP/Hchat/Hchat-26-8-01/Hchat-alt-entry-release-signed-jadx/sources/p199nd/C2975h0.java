package p199nd;

import md.C2825b;
import p025bc.AbstractC0255e;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p302ud.C4305a;

/* JADX INFO: renamed from: nd.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2975h0 implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public final int f9735g;

    /* JADX INFO: renamed from: h */
    public final C4305a f9736h;

    /* JADX INFO: renamed from: i */
    public final C4305a f9737i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2975h0(int i9, C4305a c4305a, C4305a c4305a2) {
        this.f9735g = i9;
        this.f9736h = c4305a;
        this.f9737i = c4305a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9175B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f9735g;
        return AbstractC0255e.m1033v(i9 != 1 ? i9 != 2 ? "null" : "CROSS_EDGE" : "BACK_EDGE", ": ", String.valueOf(this.f9736h), " -> ", String.valueOf(this.f9737i));
    }
}
