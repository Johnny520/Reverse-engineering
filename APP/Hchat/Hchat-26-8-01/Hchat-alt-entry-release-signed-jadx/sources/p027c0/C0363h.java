package p027c0;

import ac.AbstractC0063p;
import okio.C3193a;
import p040d0.InterfaceC0647d;
import p057e1.C0808c;
import p201o.AbstractC3026b;
import p308v1.InterfaceC4428t;
import p372z.C6055c;

/* JADX INFO: renamed from: c0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0363h implements InterfaceC0647d {

    /* JADX INFO: renamed from: g */
    public final long f1015g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0365j f1016h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0363h(C0365j c0365j, long j3) {
        this.f1016h = c0365j;
        this.f1015g = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0647d
    /* JADX INFO: renamed from: E0 */
    public final long mo1315E0(InterfaceC4428t interfaceC4428t) {
        InterfaceC4428t interfaceC4428t2 = (InterfaceC4428t) this.f1016h.f1024x.getValue();
        if (interfaceC4428t2 != null) {
            return interfaceC4428t.mo8869w(interfaceC4428t2, this.f1015g);
        }
        AbstractC3026b.m6431d("Tried to open context menu before the anchor was placed.");
        C3193a.m6814c();
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0647d
    /* JADX INFO: renamed from: j0 */
    public final C6055c mo1316j0() {
        return AbstractC0366k.m1320b(this.f1016h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p040d0.InterfaceC0647d
    /* JADX INFO: renamed from: w0 */
    public final C0808c mo1317w0(InterfaceC4428t interfaceC4428t) {
        return AbstractC0063p.m408a(mo1315E0(interfaceC4428t), 0L);
    }
}
