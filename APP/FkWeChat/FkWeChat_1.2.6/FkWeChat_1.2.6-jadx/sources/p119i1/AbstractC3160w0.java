package p119i1;

import p057e1.C1974c;

/* JADX INFO: renamed from: i1.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3160w0 implements InterfaceC3158v0 {

    /* JADX INFO: renamed from: q */
    public final C1974c f8436q = new C1974c(0);

    /* JADX INFO: renamed from: d */
    public final boolean m11934d(int i10) {
        return (i10 & AbstractC3129h.m11748a(this.f8436q.get())) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m11935k(int i10) {
        int iM11748a;
        do {
            iM11748a = AbstractC3129h.m11748a(this.f8436q.get());
            if ((iM11748a & i10) != 0) {
                return;
            }
        } while (!this.f8436q.compareAndSet(iM11748a, AbstractC3129h.m11748a(iM11748a | i10)));
    }
}
