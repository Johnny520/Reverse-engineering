package p140;

import bsh.C3466;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8247 extends AbstractC8245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8249 f20453;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] f20454;

    public C8247(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super(i, i2);
        this.f20454 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f20453 = new C8249(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        C8249 c8249 = this.f20453;
        if (c8249.hasNext()) {
            this.f20448++;
            return c8249.next();
        }
        int i = this.f20448;
        this.f20448 = i + 1;
        return this.f20454[i - c8249.f20447];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C3466.m5896();
            return null;
        }
        int i = this.f20448;
        C8249 c8249 = this.f20453;
        int i2 = c8249.f20447;
        if (i <= i2) {
            this.f20448 = i - 1;
            return c8249.previous();
        }
        int i3 = i - 1;
        this.f20448 = i3;
        return this.f20454[i3 - i2];
    }
}
