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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4262 extends AbstractC4380 implements InterfaceC4236, RandomAccess, InterfaceC4203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4262 f11437;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long[] f11438;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long[] f11439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11440;

    static {
        long[] jArr = new long[0];
        f11438 = jArr;
        f11437 = new C4262(jArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4262(C4262 c4262, boolean z) {
        int i = c4262.f11440;
        this(i == 0 ? f11438 : Arrays.copyOf(c4262.f11439, i), c4262.f11440, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m8347();
        if (i < 0 || i > (i2 = this.f11440)) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11440);
            return;
        }
        long[] jArr = this.f11439;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC3275.m5130(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11439, 0, jArr2, 0, i);
            System.arraycopy(this.f11439, i, jArr2, i + 1, this.f11440 - i);
            this.f11439 = jArr2;
        }
        this.f11439[i] = jLongValue;
        this.f11440++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8347();
        Charset charset = AbstractC4234.f11404;
        collection.getClass();
        if (!(collection instanceof C4262)) {
            return super.addAll(collection);
        }
        C4262 c4262 = (C4262) collection;
        int i = c4262.f11440;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11440;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f11439;
        if (i3 > jArr.length) {
            this.f11439 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c4262.f11439, 0, this.f11439, this.f11440, c4262.f11440);
        this.f11440 = i3;
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
        if (!(obj instanceof C4262)) {
            return super.equals(obj);
        }
        C4262 c4262 = (C4262) obj;
        if (this.f11440 != c4262.f11440) {
            return false;
        }
        long[] jArr = c4262.f11439;
        for (int i = 0; i < this.f11440; i++) {
            if (this.f11439[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(m8127(i));
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8061 = 1;
        for (int i = 0; i < this.f11440; i++) {
            iM8061 = (iM8061 * 31) + AbstractC4234.m8061(this.f11439[i]);
        }
        return iM8061;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f11440;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11439[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8347();
        m8124(i);
        long[] jArr = this.f11439;
        long j = jArr[i];
        if (i < this.f11440 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f11440--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8347();
        if (i2 < i) {
            C8376.m13331("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f11439;
        System.arraycopy(jArr, i2, jArr, i, this.f11440 - i2);
        this.f11440 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m8347();
        m8124(i);
        long[] jArr = this.f11439;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11440;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8124(int i) {
        if (i < 0 || i >= this.f11440) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11440);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8125(long j) {
        m8347();
        int i = this.f11440;
        long[] jArr = this.f11439;
        if (i == jArr.length) {
            long[] jArr2 = new long[AbstractC3275.m5130(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11439, 0, jArr2, 0, this.f11440);
            this.f11439 = jArr2;
        }
        long[] jArr3 = this.f11439;
        int i2 = this.f11440;
        this.f11440 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.protobuf.InterfaceC4235
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4262 mo8045(int i) {
        if (i >= this.f11440) {
            return new C4262(i == 0 ? f11438 : Arrays.copyOf(this.f11439, i), this.f11440, true);
        }
        C6755.m11865();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m8127(int i) {
        m8124(i);
        return this.f11439[i];
    }

    public C4262(long[] jArr, int i, boolean z) {
        super(z);
        this.f11439 = jArr;
        this.f11440 = i;
    }

    public C4262() {
        this(f11438, 0, true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8125(((Long) obj).longValue());
        return true;
    }
}
