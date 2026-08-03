package p000;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: G4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0263G4 extends AbstractC2410qa {

    /* JADX INFO: renamed from: b */
    public final C0220F4 f845b;

    public C0263G4(InterfaceC0717Qm r2) {
        super(r2);
        this.f845b = new C0220F4(r2.getDescriptor());
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: a */
    public final Object mo544a() {
        return new ArrayList();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: b */
    public final int mo545b(Object r1) {
        return ((ArrayList) r1).size();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((Collection) r1).size();
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        return new ArrayList(null);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: g */
    public final Object mo546g(Object r1) {
        return (ArrayList) r1;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f845b;
    }

    @Override // p000.AbstractC2410qa
    /* JADX INFO: renamed from: h */
    public final void mo547h(int r1, Object r2, Object r3) {
        ((ArrayList) r2).add(r1, r3);
    }
}
