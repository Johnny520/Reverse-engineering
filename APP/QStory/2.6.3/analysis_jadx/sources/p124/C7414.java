package p124;

import bsh.C2633;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7414 extends AbstractC7416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f20100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f20101 = 1;

    public C7414(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.f20100 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f20101;
        Object obj = this.f20100;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C2633.m5336();
                } else {
                    int i2 = this.f20103;
                    this.f20103 = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    C2633.m5336();
                } else {
                    this.f20103++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f20101;
        Object obj = this.f20100;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    C2633.m5336();
                } else {
                    int i2 = this.f20103 - 1;
                    this.f20103 = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    C2633.m5336();
                } else {
                    this.f20103--;
                }
                break;
        }
        return null;
    }

    public C7414(Object obj, int i) {
        super(i, 1);
        this.f20100 = obj;
    }
}
