package kotlin.collections;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5158 extends AbstractC5162 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f13251;

    public C5158(int i, Object[] objArr) {
        this.f13251 = objArr;
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i > objArr.length) {
            C6755.m11868(AbstractC0900.m710(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "), objArr.length);
            throw null;
        }
        this.f13249 = objArr.length;
        this.f13248 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C5165 c5165 = AbstractC5162.Companion;
        int size = size();
        c5165.getClass();
        C5165.m9323(i, size);
        return this.f13251[(this.f13250 + i) % this.f13249];
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        return this.f13248;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C5159(this);
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.f13250;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.f13251;
            if (i3 >= size || i >= this.f13249) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9318(int i) {
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            C6755.m11868(AbstractC0900.m710(i, "n shouldn't be greater than the buffer size: n = ", ", size = "), size());
            return;
        }
        if (i > 0) {
            int i2 = this.f13250;
            int i3 = this.f13249;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f13251;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f13250 = i4;
            this.f13248 = size() - i;
        }
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
