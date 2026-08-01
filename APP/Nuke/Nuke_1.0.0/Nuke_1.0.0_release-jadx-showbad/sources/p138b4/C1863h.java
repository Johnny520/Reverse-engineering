package p138b4;

/* JADX INFO: renamed from: b4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1863h implements InterfaceC1875t {

    /* JADX INFO: renamed from: a */
    public final C1874s f6312a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1863h(Throwable th) {
        this.f6312a = new C1874s(this, th, 2);
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
        return this.f6312a;
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
        throw new IllegalStateException("unexpected call");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: e */
    public final boolean mo3330e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p138b4.InterfaceC1875t
    /* JADX INFO: renamed from: g */
    public final C1874s mo3332g() {
        return this.f6312a;
    }
}
