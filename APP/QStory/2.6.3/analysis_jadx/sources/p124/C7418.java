package p124;

import bsh.C2633;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7418 extends AbstractC7416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7420 f20108;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object[] f20109;

    public C7418(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super(i, i2);
        this.f20109 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f20108 = new C7420(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2633.m5336();
            return null;
        }
        C7420 c7420 = this.f20108;
        if (c7420.hasNext()) {
            this.f20103++;
            return c7420.next();
        }
        int i = this.f20103;
        this.f20103 = i + 1;
        return this.f20109[i - c7420.f20102];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C2633.m5336();
            return null;
        }
        int i = this.f20103;
        C7420 c7420 = this.f20108;
        int i2 = c7420.f20102;
        if (i <= i2) {
            this.f20103 = i - 1;
            return c7420.previous();
        }
        int i3 = i - 1;
        this.f20103 = i3;
        return this.f20109[i3 - i2];
    }
}
