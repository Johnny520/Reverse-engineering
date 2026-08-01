package p140;

import bsh.C3466;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8243 extends AbstractC8245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f20445;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f20446 = 1;

    public C8243(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.f20445 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f20446;
        Object obj = this.f20445;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C3466.m5896();
                } else {
                    int i2 = this.f20448;
                    this.f20448 = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    C3466.m5896();
                } else {
                    this.f20448++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f20446;
        Object obj = this.f20445;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    C3466.m5896();
                } else {
                    int i2 = this.f20448 - 1;
                    this.f20448 = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    C3466.m5896();
                } else {
                    this.f20448--;
                }
                break;
        }
        return null;
    }

    public C8243(Object obj, int i) {
        super(i, 1);
        this.f20445 = obj;
    }
}
