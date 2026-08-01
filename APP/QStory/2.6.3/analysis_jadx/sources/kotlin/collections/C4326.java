package kotlin.collections;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4326 extends AbstractC4330 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f12906;

    public C4326(int i, Object[] objArr) {
        this.f12906 = objArr;
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i > objArr.length) {
            C5925.m11309(AbstractC0053.m150(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "), objArr.length);
            throw null;
        }
        this.f12904 = objArr.length;
        this.f12903 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4333 c4333 = AbstractC4330.Companion;
        int size = size();
        c4333.getClass();
        C4333.m8764(i, size);
        return this.f12906[(this.f12905 + i) % this.f12904];
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        return this.f12903;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C4327(this);
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.f12905;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.f12906;
            if (i3 >= size || i >= this.f12904) {
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
    public final void m8759(int i) {
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            C5925.m11309(AbstractC0053.m150(i, "n shouldn't be greater than the buffer size: n = ", ", size = "), size());
            return;
        }
        if (i > 0) {
            int i2 = this.f12905;
            int i3 = this.f12904;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f12906;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f12905 = i4;
            this.f12903 = size() - i;
        }
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
