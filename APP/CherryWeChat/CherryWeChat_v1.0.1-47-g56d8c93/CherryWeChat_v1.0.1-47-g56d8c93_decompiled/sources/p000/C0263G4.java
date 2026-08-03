package p000;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: G4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0263G4 extends AbstractC2410qa {

    /* JADX INFO: renamed from: b */
    public final C0220F4 f845b;

    public C0263G4(InterfaceC0717Qm interfaceC0717Qm) {
        super(interfaceC0717Qm);
        this.f845b = new C0220F4(interfaceC0717Qm.getDescriptor());
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: a */
    public final Object mo544a() {
        return new ArrayList();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: b */
    public final int mo545b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object obj) {
        return new ArrayList((Collection) null);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: g */
    public final Object mo546g(Object obj) {
        return (ArrayList) obj;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f845b;
    }

    @Override // p000.AbstractC2410qa
    /* JADX INFO: renamed from: h */
    public final void mo547h(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
