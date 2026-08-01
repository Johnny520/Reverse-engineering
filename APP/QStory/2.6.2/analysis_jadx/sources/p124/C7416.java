package p124;

import androidx.collection.C0276;
import bsh.C2632;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7416 extends AbstractC7415 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7419 f20109;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20110;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20111;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7410 f20112;

    public C7416(C7410 c7410, int i) {
        super(i, c7410.size());
        this.f20112 = c7410;
        this.f20110 = c7410.m12583();
        this.f20111 = -1;
        m12618();
    }

    @Override // p124.AbstractC7415, java.util.ListIterator
    public final void add(Object obj) {
        m12619();
        int i = this.f20108;
        C7410 c7410 = this.f20112;
        c7410.add(i, obj);
        this.f20108++;
        this.f20107 = c7410.size();
        this.f20110 = c7410.m12583();
        this.f20111 = -1;
        m12618();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m12619();
        if (!hasNext()) {
            C2632.m5291();
            return null;
        }
        int i = this.f20108;
        this.f20111 = i;
        C7419 c7419 = this.f20109;
        C7410 c7410 = this.f20112;
        if (c7419 == null) {
            Object[] objArr = c7410.f20095;
            this.f20108 = i + 1;
            return objArr[i];
        }
        if (c7419.hasNext()) {
            this.f20108++;
            return c7419.next();
        }
        Object[] objArr2 = c7410.f20095;
        int i2 = this.f20108;
        this.f20108 = i2 + 1;
        return objArr2[i2 - c7419.f20107];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m12619();
        if (!hasPrevious()) {
            C2632.m5291();
            return null;
        }
        int i = this.f20108;
        this.f20111 = i - 1;
        C7419 c7419 = this.f20109;
        C7410 c7410 = this.f20112;
        if (c7419 == null) {
            Object[] objArr = c7410.f20095;
            int i2 = i - 1;
            this.f20108 = i2;
            return objArr[i2];
        }
        int i3 = c7419.f20107;
        if (i <= i3) {
            this.f20108 = i - 1;
            return c7419.previous();
        }
        Object[] objArr2 = c7410.f20095;
        int i4 = i - 1;
        this.f20108 = i4;
        return objArr2[i4 - i3];
    }

    @Override // p124.AbstractC7415, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m12619();
        int i = this.f20111;
        if (i == -1) {
            C2632.m5296();
            return;
        }
        C7410 c7410 = this.f20112;
        c7410.remove(i);
        int i2 = this.f20111;
        if (i2 < this.f20108) {
            this.f20108 = i2;
        }
        this.f20107 = c7410.size();
        this.f20110 = c7410.m12583();
        this.f20111 = -1;
        m12618();
    }

    @Override // p124.AbstractC7415, java.util.ListIterator
    public final void set(Object obj) {
        m12619();
        int i = this.f20111;
        if (i == -1) {
            C2632.m5296();
            return;
        }
        C7410 c7410 = this.f20112;
        c7410.set(i, obj);
        this.f20110 = c7410.m12583();
        m12618();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12618() {
        C7410 c7410 = this.f20112;
        Object[] objArr = c7410.f20094;
        if (objArr == null) {
            this.f20109 = null;
            return;
        }
        int size = (c7410.size() - 1) & (-32);
        int i = this.f20108;
        if (i > size) {
            i = size;
        }
        int i2 = (c7410.f20092 / 5) + 1;
        C7419 c7419 = this.f20109;
        if (c7419 == null) {
            this.f20109 = new C7419(objArr, i, size, i2);
            return;
        }
        c7419.f20108 = i;
        c7419.f20107 = size;
        c7419.f20119 = i2;
        if (c7419.f20118.length < i2) {
            c7419.f20118 = new Object[i2];
        }
        c7419.f20118[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        c7419.f20117 = r0;
        c7419.m12621(i - r0, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12619() {
        if (this.f20110 == this.f20112.m12583()) {
            return;
        }
        C0276.m839();
    }
}
