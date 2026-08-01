package p119Y;

/* JADX INFO: renamed from: Y.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1731o extends AbstractC1729m {

    /* JADX INFO: renamed from: g */
    public final C1723g f5985g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1731o(C1723g c1723g) {
        this.f5985g = c1723g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f5983f;
        this.f5983f = i5 + 2;
        Object[] objArr = this.f5981d;
        return new C1718b(this.f5985g, objArr[i5], objArr[i5 + 1]);
    }
}
