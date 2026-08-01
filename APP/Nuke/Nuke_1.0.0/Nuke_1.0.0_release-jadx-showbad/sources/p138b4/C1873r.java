package p138b4;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1873r implements InterfaceC1875t {

    /* JADX INFO: renamed from: a */
    public final C1870o f6381a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1873r(C1870o c1870o) {
        AbstractC1665j.m2985e(c1870o, "connection");
        this.f6381a = c1870o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: a */
    public final InterfaceC1875t mo3326a() {
        throw new IllegalStateException("unexpected retry");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: c */
    public final C1874s mo3328c() {
        throw new IllegalStateException("already connected");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t, p144c4.InterfaceC1914d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: d */
    public final C1870o mo3329d() {
        return this.f6381a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: e */
    public final boolean mo3330e() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: g */
    public final C1874s mo3332g() {
        throw new IllegalStateException("already connected");
    }
}
