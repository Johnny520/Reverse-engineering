package cd;

import bd.InterfaceC0268a;
import p121i4.C1962c0;
import p302ud.C4325u;

/* JADX INFO: renamed from: cd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0547b implements InterfaceC0268a {

    /* JADX INFO: renamed from: g */
    public C1962c0 f1724g;

    /* JADX INFO: renamed from: h */
    public int f1725h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1725h = 0;
        this.f1724g = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bd.InterfaceC0268a
    /* JADX INFO: renamed from: f */
    public final C1962c0 mo1049f(C4325u c4325u) {
        if (this.f1725h == c4325u.hashCode()) {
            return this.f1724g;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bd.InterfaceC0268a
    /* JADX INFO: renamed from: p */
    public final void mo1050p(C4325u c4325u, C1962c0 c1962c0) {
        this.f1725h = c4325u.hashCode();
        this.f1724g = c1962c0;
    }
}
