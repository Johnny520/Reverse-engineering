package com.google.protobuf;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import io.ktor.util.C5043;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4367 extends AbstractC4380 implements InterfaceC4444, RandomAccess, InterfaceC4203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4367 f11522;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean[] f11523;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean[] f11524;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11525;

    static {
        boolean[] zArr = new boolean[0];
        f11523 = zArr;
        f11522 = new C4367(zArr, 0, false);
    }

    public C4367() {
        this(f11523, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8347();
        if (i < 0 || i > (i2 = this.f11525)) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11525);
            return;
        }
        boolean[] zArr = this.f11524;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[AbstractC3275.m5130(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11524, 0, zArr2, 0, i);
            System.arraycopy(this.f11524, i, zArr2, i + 1, this.f11525 - i);
            this.f11524 = zArr2;
        }
        this.f11524[i] = zBooleanValue;
        this.f11525++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8347();
        Charset charset = AbstractC4234.f11404;
        collection.getClass();
        if (!(collection instanceof C4367)) {
            return super.addAll(collection);
        }
        C4367 c4367 = (C4367) collection;
        int i = c4367.f11525;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11525;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f11524;
        if (i3 > zArr.length) {
            this.f11524 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c4367.f11524, 0, this.f11524, this.f11525, c4367.f11525);
        this.f11525 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4367)) {
            return super.equals(obj);
        }
        C4367 c4367 = (C4367) obj;
        if (this.f11525 != c4367.f11525) {
            return false;
        }
        boolean[] zArr = c4367.f11524;
        for (int i = 0; i < this.f11525; i++) {
            if (this.f11524[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8319(i);
        return Boolean.valueOf(this.f11524[i]);
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8062 = 1;
        for (int i = 0; i < this.f11525; i++) {
            iM8062 = (iM8062 * 31) + AbstractC4234.m8062(this.f11524[i]);
        }
        return iM8062;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f11525;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11524[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8347();
        m8319(i);
        boolean[] zArr = this.f11524;
        boolean z = zArr[i];
        if (i < this.f11525 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f11525--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8347();
        if (i2 < i) {
            C8376.m13331("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f11524;
        System.arraycopy(zArr, i2, zArr, i, this.f11525 - i2);
        this.f11525 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8347();
        m8319(i);
        boolean[] zArr = this.f11524;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11525;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8319(int i) {
        if (i < 0 || i >= this.f11525) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11525);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8320(boolean z) {
        m8347();
        int i = this.f11525;
        boolean[] zArr = this.f11524;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC3275.m5130(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11524, 0, zArr2, 0, this.f11525);
            this.f11524 = zArr2;
        }
        boolean[] zArr3 = this.f11524;
        int i2 = this.f11525;
        this.f11525 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.protobuf.InterfaceC4235
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4367 mo8045(int i) {
        if (i >= this.f11525) {
            return new C4367(i == 0 ? f11523 : Arrays.copyOf(this.f11524, i), this.f11525, true);
        }
        C6755.m11865();
        return null;
    }

    public C4367(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f11524 = zArr;
        this.f11525 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8320(((Boolean) obj).booleanValue());
        return true;
    }
}
