package ng;

import java.util.Iterator;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: ng.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3011i implements InterfaceC3012j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3012j f9805a;

    /* JADX INFO: renamed from: b */
    public final boolean f9806b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1231l f9807c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3011i(InterfaceC3012j interfaceC3012j, boolean z9, InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.getClass();
        this.f9805a = interfaceC3012j;
        this.f9806b = z9;
        this.f9807c = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        return new C3010h(this);
    }
}
