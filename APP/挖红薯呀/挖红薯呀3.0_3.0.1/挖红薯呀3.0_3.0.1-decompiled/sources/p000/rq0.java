package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class rq0 extends AbstractC0982z {

    /* JADX INFO: renamed from: f */
    public final Object[] f5536f;

    /* JADX INFO: renamed from: g */
    public final k91 f5537g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rq0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.f5536f = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f5537g = new k91(objArr, i > i4 ? i4 : i, i4, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        k91 k91Var = this.f5537g;
        if (k91Var.hasNext()) {
            this.f7744d++;
            return k91Var.next();
        }
        int i = this.f7744d;
        this.f7744d = i + 1;
        return this.f5536f[i - k91Var.f7745e];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C0921xc.m5132m();
            return null;
        }
        int i = this.f7744d;
        k91 k91Var = this.f5537g;
        int i2 = k91Var.f7745e;
        if (i <= i2) {
            this.f7744d = i - 1;
            return k91Var.previous();
        }
        int i3 = i - 1;
        this.f7744d = i3;
        return this.f5536f[i3 - i2];
    }
}
