package com.google.protobuf;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import io.ktor.util.C4211;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰哲苏子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3613 extends AbstractC3548 implements InterfaceC3395, RandomAccess, InterfaceC3371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3613 f11249;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int[] f11250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f11251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11252;

    static {
        int[] iArr = new int[0];
        f11250 = iArr;
        f11249 = new C3613(iArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3613(C3613 c3613, boolean z) {
        int i = c3613.f11252;
        this(i == 0 ? f11250 : Arrays.copyOf(c3613.f11251, i), c3613.f11252, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m7788();
        if (i < 0 || i > (i2 = this.f11252)) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11252);
            return;
        }
        int[] iArr = this.f11251;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC2442.m4570(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11251, 0, iArr2, 0, i);
            System.arraycopy(this.f11251, i, iArr2, i + 1, this.f11252 - i);
            this.f11251 = iArr2;
        }
        this.f11251[i] = iIntValue;
        this.f11252++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7788();
        Charset charset = AbstractC3402.f11059;
        collection.getClass();
        if (!(collection instanceof C3613)) {
            return super.addAll(collection);
        }
        C3613 c3613 = (C3613) collection;
        int i = c3613.f11252;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11252;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f11251;
        if (i3 > iArr.length) {
            this.f11251 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c3613.f11251, 0, this.f11251, this.f11252, c3613.f11252);
        this.f11252 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3613)) {
            return super.equals(obj);
        }
        C3613 c3613 = (C3613) obj;
        if (this.f11252 != c3613.f11252) {
            return false;
        }
        int[] iArr = c3613.f11251;
        for (int i = 0; i < this.f11252; i++) {
            if (this.f11251[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(m7814(i));
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11252; i2++) {
            i = (i * 31) + this.f11251[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f11252;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11251[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7788();
        m7811(i);
        int[] iArr = this.f11251;
        int i2 = iArr[i];
        if (i < this.f11252 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f11252--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7788();
        if (i2 < i) {
            C7547.m12772("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f11251;
        System.arraycopy(iArr, i2, iArr, i, this.f11252 - i2);
        this.f11252 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Integer.valueOf(m7815(i, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11252;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7811(int i) {
        if (i < 0 || i >= this.f11252) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11252);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7812(int i) {
        m7788();
        int i2 = this.f11252;
        int[] iArr = this.f11251;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC2442.m4570(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11251, 0, iArr2, 0, this.f11252);
            this.f11251 = iArr2;
        }
        int[] iArr3 = this.f11251;
        int i3 = this.f11252;
        this.f11252 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.protobuf.InterfaceC3403
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3613 mo7486(int i) {
        if (i >= this.f11252) {
            return new C3613(i == 0 ? f11250 : Arrays.copyOf(this.f11251, i), this.f11252, true);
        }
        C5925.m11306();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7814(int i) {
        m7811(i);
        return this.f11251[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7815(int i, int i2) {
        m7788();
        m7811(i);
        int[] iArr = this.f11251;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public C3613(int[] iArr, int i, boolean z) {
        super(z);
        this.f11251 = iArr;
        this.f11252 = i;
    }

    public C3613() {
        this(f11250, 0, true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7812(((Integer) obj).intValue());
        return true;
    }
}
