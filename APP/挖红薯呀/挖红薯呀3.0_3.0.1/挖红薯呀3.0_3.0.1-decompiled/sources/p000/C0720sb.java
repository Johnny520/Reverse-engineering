package p000;

/* JADX INFO: renamed from: sb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720sb extends AbstractC0982z {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5734f = 1;

    /* JADX INFO: renamed from: g */
    public final Object f5735g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0720sb(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.f5735g = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f5734f;
        Object obj = this.f5735g;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C0921xc.m5132m();
                } else {
                    int i2 = this.f7744d;
                    this.f7744d = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    C0921xc.m5132m();
                } else {
                    this.f7744d++;
                }
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f5734f;
        Object obj = this.f5735g;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    C0921xc.m5132m();
                } else {
                    int i2 = this.f7744d - 1;
                    this.f7744d = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    C0921xc.m5132m();
                } else {
                    this.f7744d--;
                }
                break;
        }
        return null;
    }

    public C0720sb(int i, Object obj) {
        super(i, 1);
        this.f5735g = obj;
    }
}
