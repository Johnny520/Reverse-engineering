package p124;

import bsh.C2632;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7413 extends AbstractC7415 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f20105;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f20106 = 1;

    public C7413(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.f20105 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f20106;
        Object obj = this.f20105;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C2632.m5291();
                } else {
                    int i2 = this.f20108;
                    this.f20108 = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    C2632.m5291();
                } else {
                    this.f20108++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f20106;
        Object obj = this.f20105;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    C2632.m5291();
                } else {
                    int i2 = this.f20108 - 1;
                    this.f20108 = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    C2632.m5291();
                } else {
                    this.f20108--;
                }
                break;
        }
        return null;
    }

    public C7413(Object obj, int i) {
        super(i, 1);
        this.f20105 = obj;
    }
}
