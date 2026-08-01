package p124;

import bsh.C2632;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7417 extends AbstractC7415 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7419 f20113;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] f20114;

    public C7417(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super(i, i2);
        this.f20114 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f20113 = new C7419(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2632.m5291();
            return null;
        }
        C7419 c7419 = this.f20113;
        if (c7419.hasNext()) {
            this.f20108++;
            return c7419.next();
        }
        int i = this.f20108;
        this.f20108 = i + 1;
        return this.f20114[i - c7419.f20107];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C2632.m5291();
            return null;
        }
        int i = this.f20108;
        C7419 c7419 = this.f20113;
        int i2 = c7419.f20107;
        if (i <= i2) {
            this.f20108 = i - 1;
            return c7419.previous();
        }
        int i3 = i - 1;
        this.f20108 = i3;
        return this.f20114[i3 - i2];
    }
}
