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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3535 extends AbstractC3548 implements InterfaceC3612, RandomAccess, InterfaceC3371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3535 f11177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean[] f11178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean[] f11179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11180;

    static {
        boolean[] zArr = new boolean[0];
        f11178 = zArr;
        f11177 = new C3535(zArr, 0, false);
    }

    public C3535() {
        this(f11178, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m7788();
        if (i < 0 || i > (i2 = this.f11180)) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11180);
            return;
        }
        boolean[] zArr = this.f11179;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[AbstractC2442.m4570(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11179, 0, zArr2, 0, i);
            System.arraycopy(this.f11179, i, zArr2, i + 1, this.f11180 - i);
            this.f11179 = zArr2;
        }
        this.f11179[i] = zBooleanValue;
        this.f11180++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7788();
        Charset charset = AbstractC3402.f11059;
        collection.getClass();
        if (!(collection instanceof C3535)) {
            return super.addAll(collection);
        }
        C3535 c3535 = (C3535) collection;
        int i = c3535.f11180;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11180;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f11179;
        if (i3 > zArr.length) {
            this.f11179 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c3535.f11179, 0, this.f11179, this.f11180, c3535.f11180);
        this.f11180 = i3;
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
        if (!(obj instanceof C3535)) {
            return super.equals(obj);
        }
        C3535 c3535 = (C3535) obj;
        if (this.f11180 != c3535.f11180) {
            return false;
        }
        boolean[] zArr = c3535.f11179;
        for (int i = 0; i < this.f11180; i++) {
            if (this.f11179[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7760(i);
        return Boolean.valueOf(this.f11179[i]);
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM7503 = 1;
        for (int i = 0; i < this.f11180; i++) {
            iM7503 = (iM7503 * 31) + AbstractC3402.m7503(this.f11179[i]);
        }
        return iM7503;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f11180;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11179[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7788();
        m7760(i);
        boolean[] zArr = this.f11179;
        boolean z = zArr[i];
        if (i < this.f11180 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f11180--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7788();
        if (i2 < i) {
            C7547.m12772("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f11179;
        System.arraycopy(zArr, i2, zArr, i, this.f11180 - i2);
        this.f11180 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m7788();
        m7760(i);
        boolean[] zArr = this.f11179;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11180;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7760(int i) {
        if (i < 0 || i >= this.f11180) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11180);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7761(boolean z) {
        m7788();
        int i = this.f11180;
        boolean[] zArr = this.f11179;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC2442.m4570(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11179, 0, zArr2, 0, this.f11180);
            this.f11179 = zArr2;
        }
        boolean[] zArr3 = this.f11179;
        int i2 = this.f11180;
        this.f11180 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.protobuf.InterfaceC3403
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3535 mo7486(int i) {
        if (i >= this.f11180) {
            return new C3535(i == 0 ? f11178 : Arrays.copyOf(this.f11179, i), this.f11180, true);
        }
        C5925.m11306();
        return null;
    }

    public C3535(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f11179 = zArr;
        this.f11180 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7761(((Boolean) obj).booleanValue());
        return true;
    }
}
