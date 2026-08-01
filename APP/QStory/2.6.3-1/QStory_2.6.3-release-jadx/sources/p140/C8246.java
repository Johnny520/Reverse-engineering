package p140;

import androidx.collection.C1123;
import bsh.C3466;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8246 extends AbstractC8245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C8249 f20449;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20450;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20451;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8240 f20452;

    public C8246(C8240 c8240, int i) {
        super(i, c8240.size());
        this.f20452 = c8240;
        this.f20450 = c8240.m13168();
        this.f20451 = -1;
        m13204();
    }

    @Override // p140.AbstractC8245, java.util.ListIterator
    public final void add(Object obj) {
        m13205();
        int i = this.f20448;
        C8240 c8240 = this.f20452;
        c8240.add(i, obj);
        this.f20448++;
        this.f20447 = c8240.size();
        this.f20450 = c8240.m13168();
        this.f20451 = -1;
        m13204();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m13205();
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        int i = this.f20448;
        this.f20451 = i;
        C8249 c8249 = this.f20449;
        C8240 c8240 = this.f20452;
        if (c8249 == null) {
            Object[] objArr = c8240.f20435;
            this.f20448 = i + 1;
            return objArr[i];
        }
        if (c8249.hasNext()) {
            this.f20448++;
            return c8249.next();
        }
        Object[] objArr2 = c8240.f20435;
        int i2 = this.f20448;
        this.f20448 = i2 + 1;
        return objArr2[i2 - c8249.f20447];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m13205();
        if (!hasPrevious()) {
            C3466.m5896();
            return null;
        }
        int i = this.f20448;
        this.f20451 = i - 1;
        C8249 c8249 = this.f20449;
        C8240 c8240 = this.f20452;
        if (c8249 == null) {
            Object[] objArr = c8240.f20435;
            int i2 = i - 1;
            this.f20448 = i2;
            return objArr[i2];
        }
        int i3 = c8249.f20447;
        if (i <= i3) {
            this.f20448 = i - 1;
            return c8249.previous();
        }
        Object[] objArr2 = c8240.f20435;
        int i4 = i - 1;
        this.f20448 = i4;
        return objArr2[i4 - i3];
    }

    @Override // p140.AbstractC8245, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m13205();
        int i = this.f20451;
        if (i == -1) {
            C3466.m5901();
            return;
        }
        C8240 c8240 = this.f20452;
        c8240.remove(i);
        int i2 = this.f20451;
        if (i2 < this.f20448) {
            this.f20448 = i2;
        }
        this.f20447 = c8240.size();
        this.f20450 = c8240.m13168();
        this.f20451 = -1;
        m13204();
    }

    @Override // p140.AbstractC8245, java.util.ListIterator
    public final void set(Object obj) {
        m13205();
        int i = this.f20451;
        if (i == -1) {
            C3466.m5901();
            return;
        }
        C8240 c8240 = this.f20452;
        c8240.set(i, obj);
        this.f20450 = c8240.m13168();
        m13204();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13204() {
        C8240 c8240 = this.f20452;
        Object[] objArr = c8240.f20434;
        if (objArr == null) {
            this.f20449 = null;
            return;
        }
        int size = (c8240.size() - 1) & (-32);
        int i = this.f20448;
        if (i > size) {
            i = size;
        }
        int i2 = (c8240.f20432 / 5) + 1;
        C8249 c8249 = this.f20449;
        if (c8249 == null) {
            this.f20449 = new C8249(objArr, i, size, i2);
            return;
        }
        c8249.f20448 = i;
        c8249.f20447 = size;
        c8249.f20459 = i2;
        if (c8249.f20458.length < i2) {
            c8249.f20458 = new Object[i2];
        }
        c8249.f20458[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        c8249.f20457 = r0;
        c8249.m13207(i - r0, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13205() {
        if (this.f20450 == this.f20452.m13168()) {
            return;
        }
        C1123.m1400();
    }
}
