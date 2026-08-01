package p228p8;

import p010a9.InterfaceC0184l;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: p8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5972b implements InterfaceC5980j.c {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0184l f18907q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j.c f18908r;

    public AbstractC5972b(InterfaceC5980j.c cVar, InterfaceC0184l interfaceC0184l) {
        cVar.getClass();
        interfaceC0184l.getClass();
        this.f18907q = interfaceC0184l;
        this.f18908r = cVar instanceof AbstractC5972b ? ((AbstractC5972b) cVar).f18908r : cVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m23969a(InterfaceC5980j.c cVar) {
        cVar.getClass();
        return cVar == this || this.f18908r == cVar;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5980j.b m23970b(InterfaceC5980j.b bVar) {
        bVar.getClass();
        return (InterfaceC5980j.b) this.f18907q.mo27m(bVar);
    }
}
