package p249qg;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: qg.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3562f0 implements InterfaceC3589o0 {

    /* JADX INFO: renamed from: g */
    public final boolean f11562g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3562f0(boolean z9) {
        this.f11562g = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3589o0
    /* JADX INFO: renamed from: b */
    public final boolean mo7476b() {
        return this.f11562g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3589o0
    /* JADX INFO: renamed from: d */
    public final C3548a1 mo7477d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2254q(new StringBuilder("Empty{"), this.f11562g ? "Active" : "New", '}');
    }
}
