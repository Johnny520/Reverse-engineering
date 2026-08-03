package ng;

import java.util.Iterator;
import p069f.C0939i0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: ng.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3005c implements InterfaceC3012j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9790a = 1;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1231l f9791b;

    /* JADX INFO: renamed from: c */
    public final Object f9792c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3005c(InterfaceC3012j interfaceC3012j, InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        this.f9792c = interfaceC3012j;
        this.f9791b = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        switch (this.f9790a) {
            case 0:
                return new C3004b(((InterfaceC3012j) this.f9792c).iterator(), this.f9791b);
            default:
                return new C0939i0(this);
        }
    }

    public C3005c(InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l) {
        this.f9792c = interfaceC1220a;
        this.f9791b = interfaceC1231l;
    }
}
