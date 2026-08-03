package ng;

import java.util.Iterator;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: ng.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3022t implements InterfaceC3012j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3012j f9822a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1231l f9823b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3022t(InterfaceC3012j interfaceC3012j, InterfaceC1231l interfaceC1231l) {
        interfaceC3012j.getClass();
        interfaceC1231l.getClass();
        this.f9822a = interfaceC3012j;
        this.f9823b = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        return new C3021s(this);
    }
}
