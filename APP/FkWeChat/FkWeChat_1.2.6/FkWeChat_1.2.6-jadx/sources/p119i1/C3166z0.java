package p119i1;

import p172l8.C4700i0;
import p364z0.InterfaceC9829g;

/* JADX INFO: renamed from: i1.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3166z0 extends AbstractC3162x0 {

    /* JADX INFO: renamed from: c */
    public InterfaceC9829g f8445c;

    /* JADX INFO: renamed from: d */
    public int f8446d;

    public C3166z0(long j10, InterfaceC9829g interfaceC9829g) {
        super(j10);
        this.f8445c = interfaceC9829g;
    }

    @Override // p119i1.AbstractC3162x0
    /* JADX INFO: renamed from: c */
    public void mo1522c(AbstractC3162x0 abstractC3162x0) {
        synchronized (AbstractC3142n0.f8381a) {
            abstractC3162x0.getClass();
            this.f8445c = ((C3166z0) abstractC3162x0).f8445c;
            this.f8446d = ((C3166z0) abstractC3162x0).f8446d;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    @Override // p119i1.AbstractC3162x0
    /* JADX INFO: renamed from: d */
    public AbstractC3162x0 mo1523d(long j10) {
        return new C3166z0(j10, this.f8445c);
    }

    /* JADX INFO: renamed from: i */
    public final int m11951i() {
        return this.f8446d;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC9829g m11952j() {
        return this.f8445c;
    }

    /* JADX INFO: renamed from: k */
    public final void m11953k(int i10) {
        this.f8446d = i10;
    }

    /* JADX INFO: renamed from: l */
    public final void m11954l(InterfaceC9829g interfaceC9829g) {
        this.f8445c = interfaceC9829g;
    }
}
