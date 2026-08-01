package p124;

import androidx.collection.C0276;
import bsh.C2633;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7417 extends AbstractC7416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7420 f20104;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f20105;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f20106;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7411 f20107;

    public C7417(C7411 c7411, int i) {
        super(i, c7411.size());
        this.f20107 = c7411;
        this.f20105 = c7411.m12609();
        this.f20106 = -1;
        m12645();
    }

    @Override // p124.AbstractC7416, java.util.ListIterator
    public final void add(Object obj) {
        m12646();
        int i = this.f20103;
        C7411 c7411 = this.f20107;
        c7411.add(i, obj);
        this.f20103++;
        this.f20102 = c7411.size();
        this.f20105 = c7411.m12609();
        this.f20106 = -1;
        m12645();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m12646();
        if (!hasNext()) {
            C2633.m5336();
            return null;
        }
        int i = this.f20103;
        this.f20106 = i;
        C7420 c7420 = this.f20104;
        C7411 c7411 = this.f20107;
        if (c7420 == null) {
            Object[] objArr = c7411.f20090;
            this.f20103 = i + 1;
            return objArr[i];
        }
        if (c7420.hasNext()) {
            this.f20103++;
            return c7420.next();
        }
        Object[] objArr2 = c7411.f20090;
        int i2 = this.f20103;
        this.f20103 = i2 + 1;
        return objArr2[i2 - c7420.f20102];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m12646();
        if (!hasPrevious()) {
            C2633.m5336();
            return null;
        }
        int i = this.f20103;
        this.f20106 = i - 1;
        C7420 c7420 = this.f20104;
        C7411 c7411 = this.f20107;
        if (c7420 == null) {
            Object[] objArr = c7411.f20090;
            int i2 = i - 1;
            this.f20103 = i2;
            return objArr[i2];
        }
        int i3 = c7420.f20102;
        if (i <= i3) {
            this.f20103 = i - 1;
            return c7420.previous();
        }
        Object[] objArr2 = c7411.f20090;
        int i4 = i - 1;
        this.f20103 = i4;
        return objArr2[i4 - i3];
    }

    @Override // p124.AbstractC7416, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m12646();
        int i = this.f20106;
        if (i == -1) {
            C2633.m5341();
            return;
        }
        C7411 c7411 = this.f20107;
        c7411.remove(i);
        int i2 = this.f20106;
        if (i2 < this.f20103) {
            this.f20103 = i2;
        }
        this.f20102 = c7411.size();
        this.f20105 = c7411.m12609();
        this.f20106 = -1;
        m12645();
    }

    @Override // p124.AbstractC7416, java.util.ListIterator
    public final void set(Object obj) {
        m12646();
        int i = this.f20106;
        if (i == -1) {
            C2633.m5341();
            return;
        }
        C7411 c7411 = this.f20107;
        c7411.set(i, obj);
        this.f20105 = c7411.m12609();
        m12645();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12645() {
        C7411 c7411 = this.f20107;
        Object[] objArr = c7411.f20089;
        if (objArr == null) {
            this.f20104 = null;
            return;
        }
        int size = (c7411.size() - 1) & (-32);
        int i = this.f20103;
        if (i > size) {
            i = size;
        }
        int i2 = (c7411.f20087 / 5) + 1;
        C7420 c7420 = this.f20104;
        if (c7420 == null) {
            this.f20104 = new C7420(objArr, i, size, i2);
            return;
        }
        c7420.f20103 = i;
        c7420.f20102 = size;
        c7420.f20114 = i2;
        if (c7420.f20113.length < i2) {
            c7420.f20113 = new Object[i2];
        }
        c7420.f20113[0] = objArr;
        ?? r0 = i == size ? 1 : 0;
        c7420.f20112 = r0;
        c7420.m12648(i - r0, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12646() {
        if (this.f20105 == this.f20107.m12609()) {
            return;
        }
        C0276.m840();
    }
}
