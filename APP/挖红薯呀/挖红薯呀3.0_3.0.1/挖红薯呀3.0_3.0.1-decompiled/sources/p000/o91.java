package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o91 extends m91 {

    /* JADX INFO: renamed from: g */
    public final C0016af f4489g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o91(C0016af c0016af) {
        this.f4489g = c0016af;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3891f;
        this.f3891f = i + 2;
        Object[] objArr = this.f3889d;
        return new bh0(this.f4489g, objArr[i], objArr[i + 1]);
    }
}
