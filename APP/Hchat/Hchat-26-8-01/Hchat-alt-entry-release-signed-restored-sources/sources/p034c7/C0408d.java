package p034c7;

import java.io.InputStream;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2335e;
import p344x7.C5704a;

/* JADX INFO: renamed from: c7.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0408d extends AbstractC0409e {

    /* JADX INFO: renamed from: e */
    public final AbstractC2331a f1107e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0408d(String str, AbstractC2331a abstractC2331a) {
        super(str);
        this.f1107e = abstractC2331a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: k7.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034c7.AbstractC0409e
    /* JADX INFO: renamed from: b */
    public final InputStream mo1367b() {
        AbstractC2331a abstractC2331a = this.f1107e;
        if (abstractC2331a instanceof InterfaceC2335e) {
            ((InterfaceC2335e) abstractC2331a).mo5562c();
        }
        byte[] bArrMo5552r = abstractC2331a.mo5552r();
        return new C5704a(bArrMo5552r, 0, bArrMo5552r.length);
    }
}
