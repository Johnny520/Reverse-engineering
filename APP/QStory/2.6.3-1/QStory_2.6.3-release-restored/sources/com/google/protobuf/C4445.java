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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰哲苏子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4445 extends AbstractC4380 implements InterfaceC4227, RandomAccess, InterfaceC4203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4445 f11594;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int[] f11595;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f11596;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11597;

    static {
        int[] iArr = new int[0];
        f11595 = iArr;
        f11594 = new C4445(iArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4445(C4445 c4445, boolean z) {
        int i = c4445.f11597;
        this(i == 0 ? f11595 : Arrays.copyOf(c4445.f11596, i), c4445.f11597, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m8347();
        if (i < 0 || i > (i2 = this.f11597)) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11597);
            return;
        }
        int[] iArr = this.f11596;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC3275.m5130(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11596, 0, iArr2, 0, i);
            System.arraycopy(this.f11596, i, iArr2, i + 1, this.f11597 - i);
            this.f11596 = iArr2;
        }
        this.f11596[i] = iIntValue;
        this.f11597++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8347();
        Charset charset = AbstractC4234.f11404;
        collection.getClass();
        if (!(collection instanceof C4445)) {
            return super.addAll(collection);
        }
        C4445 c4445 = (C4445) collection;
        int i = c4445.f11597;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11597;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f11596;
        if (i3 > iArr.length) {
            this.f11596 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c4445.f11596, 0, this.f11596, this.f11597, c4445.f11597);
        this.f11597 = i3;
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
        if (!(obj instanceof C4445)) {
            return super.equals(obj);
        }
        C4445 c4445 = (C4445) obj;
        if (this.f11597 != c4445.f11597) {
            return false;
        }
        int[] iArr = c4445.f11596;
        for (int i = 0; i < this.f11597; i++) {
            if (this.f11596[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(m8373(i));
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11597; i2++) {
            i = (i * 31) + this.f11596[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f11597;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11596[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8347();
        m8370(i);
        int[] iArr = this.f11596;
        int i2 = iArr[i];
        if (i < this.f11597 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f11597--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8347();
        if (i2 < i) {
            C8376.m13331("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f11596;
        System.arraycopy(iArr, i2, iArr, i, this.f11597 - i2);
        this.f11597 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Integer.valueOf(m8374(i, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11597;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8370(int i) {
        if (i < 0 || i >= this.f11597) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11597);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8371(int i) {
        m8347();
        int i2 = this.f11597;
        int[] iArr = this.f11596;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC3275.m5130(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11596, 0, iArr2, 0, this.f11597);
            this.f11596 = iArr2;
        }
        int[] iArr3 = this.f11596;
        int i3 = this.f11597;
        this.f11597 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.protobuf.InterfaceC4235
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4445 mo8045(int i) {
        if (i >= this.f11597) {
            return new C4445(i == 0 ? f11595 : Arrays.copyOf(this.f11596, i), this.f11597, true);
        }
        C6755.m11865();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m8373(int i) {
        m8370(i);
        return this.f11596[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m8374(int i, int i2) {
        m8347();
        m8370(i);
        int[] iArr = this.f11596;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public C4445(int[] iArr, int i, boolean z) {
        super(z);
        this.f11596 = iArr;
        this.f11597 = i;
    }

    public C4445() {
        this(f11595, 0, true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8371(((Integer) obj).intValue());
        return true;
    }
}
