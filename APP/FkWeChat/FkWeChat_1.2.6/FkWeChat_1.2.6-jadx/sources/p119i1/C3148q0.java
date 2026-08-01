package p119i1;

import p172l8.C4700i0;
import p364z0.InterfaceC9827e;

/* JADX INFO: renamed from: i1.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3148q0 extends AbstractC3162x0 {

    /* JADX INFO: renamed from: c */
    public InterfaceC9827e f8407c;

    /* JADX INFO: renamed from: d */
    public int f8408d;

    /* JADX INFO: renamed from: e */
    public int f8409e;

    public C3148q0(long j10, InterfaceC9827e interfaceC9827e) {
        super(j10);
        this.f8407c = interfaceC9827e;
    }

    @Override // p119i1.AbstractC3162x0
    /* JADX INFO: renamed from: c */
    public void mo1522c(AbstractC3162x0 abstractC3162x0) {
        synchronized (AbstractC3126f0.f8329a) {
            abstractC3162x0.getClass();
            this.f8407c = ((C3148q0) abstractC3162x0).f8407c;
            this.f8408d = ((C3148q0) abstractC3162x0).f8408d;
            this.f8409e = ((C3148q0) abstractC3162x0).f8409e;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    @Override // p119i1.AbstractC3162x0
    /* JADX INFO: renamed from: d */
    public AbstractC3162x0 mo1523d(long j10) {
        return new C3148q0(j10, this.f8407c);
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC9827e m11853i() {
        return this.f8407c;
    }

    /* JADX INFO: renamed from: j */
    public final int m11854j() {
        return this.f8408d;
    }

    /* JADX INFO: renamed from: k */
    public final int m11855k() {
        return this.f8409e;
    }

    /* JADX INFO: renamed from: l */
    public final void m11856l(InterfaceC9827e interfaceC9827e) {
        this.f8407c = interfaceC9827e;
    }

    /* JADX INFO: renamed from: m */
    public final void m11857m(int i10) {
        this.f8408d = i10;
    }

    /* JADX INFO: renamed from: n */
    public final void m11858n(int i10) {
        this.f8409e = i10;
    }
}
