package kotlin.collections;

import androidx.activity.AbstractC0053;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4325 extends AbstractC4329 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12899;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f12900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f12902;

    public C4325(int i, Object[] objArr) {
        this.f12902 = objArr;
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i > objArr.length) {
            C5919.m11248(AbstractC0053.m148(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "), objArr.length);
            throw null;
        }
        this.f12900 = objArr.length;
        this.f12899 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4332 c4332 = AbstractC4329.Companion;
        int size = size();
        c4332.getClass();
        C4332.m8774(i, size);
        return this.f12902[(this.f12901 + i) % this.f12900];
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        return this.f12899;
    }

    @Override // kotlin.collections.AbstractC4329, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C4326(this);
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.f12901;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.f12902;
            if (i3 >= size || i >= this.f12900) {
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
    public final void m8769(int i) {
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            C5919.m11248(AbstractC0053.m148(i, "n shouldn't be greater than the buffer size: n = ", ", size = "), size());
            return;
        }
        if (i > 0) {
            int i2 = this.f12901;
            int i3 = this.f12900;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f12902;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f12901 = i4;
            this.f12899 = size() - i;
        }
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
