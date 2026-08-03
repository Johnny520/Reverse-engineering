package p232pc;

import p214oc.AbstractC3127d;
import p214oc.C3126c;
import p214oc.InterfaceC3124a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: pc.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3388j extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final String f10925g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3388j(String str) {
        this.f10925g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final InterfaceC3124a mo441a() {
        return C3126c.f10129b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC4855en.m9263g("SIGNATURE: ", this.f10925g);
    }
}
