package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class d11 implements InterfaceC0622po {

    /* JADX INFO: renamed from: d */
    public final f11 f926d;

    /* JADX INFO: renamed from: e */
    public final long f927e;

    /* JADX INFO: renamed from: f */
    public final Object f928f;

    /* JADX INFO: renamed from: g */
    public final C0884wc f929g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d11(f11 f11Var, long j, Object obj, C0884wc c0884wc) {
        this.f926d = f11Var;
        this.f927e = j;
        this.f928f = obj;
        this.f929g = c0884wc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0622po
    /* JADX INFO: renamed from: a */
    public final void mo623a() {
        f11 f11Var = this.f926d;
        synchronized (f11Var) {
            if (this.f927e < f11Var.m989o()) {
                return;
            }
            Object[] objArr = f11Var.f1559k;
            objArr.getClass();
            long j = this.f927e;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC0398kl.m1919e(objArr, j, AbstractC0398kl.f3211v);
            f11Var.m985j();
        }
    }
}
