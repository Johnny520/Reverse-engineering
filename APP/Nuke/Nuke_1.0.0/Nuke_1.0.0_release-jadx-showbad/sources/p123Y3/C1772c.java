package p123Y3;

import p117X2.AbstractC1665j;
import p118X3.AbstractC1687I;
import p118X3.C1711u;
import p179i4.AbstractC2352g;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.InterfaceC2708g;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: Y3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1772c extends AbstractC1687I implements InterfaceC2722u {

    /* JADX INFO: renamed from: f */
    public final C1711u f6069f;

    /* JADX INFO: renamed from: g */
    public final long f6070g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1772c(C1711u c1711u, long j5) {
        this.f6069f = c1711u;
        this.f6070g = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return AbstractC2724w.f8665d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: c */
    public final long mo505c() {
        return this.f6070g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: d */
    public final C1711u mo506d() {
        return this.f6069f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1687I
    /* JADX INFO: renamed from: f */
    public final InterfaceC2708g mo507f() {
        return AbstractC2352g.m4199l(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) {
        AbstractC1665j.m2985e(c2706e, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p118X3.AbstractC1687I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
