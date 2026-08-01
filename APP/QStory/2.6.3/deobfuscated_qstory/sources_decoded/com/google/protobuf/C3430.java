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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3430 extends AbstractC3548 implements InterfaceC3404, RandomAccess, InterfaceC3371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3430 f11092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long[] f11093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long[] f11094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11095;

    static {
        long[] jArr = new long[0];
        f11093 = jArr;
        f11092 = new C3430(jArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3430(C3430 c3430, boolean z) {
        int i = c3430.f11095;
        this(i == 0 ? f11093 : Arrays.copyOf(c3430.f11094, i), c3430.f11095, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m7788();
        if (i < 0 || i > (i2 = this.f11095)) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11095);
            return;
        }
        long[] jArr = this.f11094;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC2442.m4570(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11094, 0, jArr2, 0, i);
            System.arraycopy(this.f11094, i, jArr2, i + 1, this.f11095 - i);
            this.f11094 = jArr2;
        }
        this.f11094[i] = jLongValue;
        this.f11095++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7788();
        Charset charset = AbstractC3402.f11059;
        collection.getClass();
        if (!(collection instanceof C3430)) {
            return super.addAll(collection);
        }
        C3430 c3430 = (C3430) collection;
        int i = c3430.f11095;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11095;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f11094;
        if (i3 > jArr.length) {
            this.f11094 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c3430.f11094, 0, this.f11094, this.f11095, c3430.f11095);
        this.f11095 = i3;
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
        if (!(obj instanceof C3430)) {
            return super.equals(obj);
        }
        C3430 c3430 = (C3430) obj;
        if (this.f11095 != c3430.f11095) {
            return false;
        }
        long[] jArr = c3430.f11094;
        for (int i = 0; i < this.f11095; i++) {
            if (this.f11094[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(m7568(i));
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM7502 = 1;
        for (int i = 0; i < this.f11095; i++) {
            iM7502 = (iM7502 * 31) + AbstractC3402.m7502(this.f11094[i]);
        }
        return iM7502;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f11095;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11094[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7788();
        m7565(i);
        long[] jArr = this.f11094;
        long j = jArr[i];
        if (i < this.f11095 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f11095--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7788();
        if (i2 < i) {
            C7547.m12772("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f11094;
        System.arraycopy(jArr, i2, jArr, i, this.f11095 - i2);
        this.f11095 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m7788();
        m7565(i);
        long[] jArr = this.f11094;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11095;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7565(int i) {
        if (i < 0 || i >= this.f11095) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11095);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7566(long j) {
        m7788();
        int i = this.f11095;
        long[] jArr = this.f11094;
        if (i == jArr.length) {
            long[] jArr2 = new long[AbstractC2442.m4570(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11094, 0, jArr2, 0, this.f11095);
            this.f11094 = jArr2;
        }
        long[] jArr3 = this.f11094;
        int i2 = this.f11095;
        this.f11095 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.protobuf.InterfaceC3403
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3430 mo7486(int i) {
        if (i >= this.f11095) {
            return new C3430(i == 0 ? f11093 : Arrays.copyOf(this.f11094, i), this.f11095, true);
        }
        C5925.m11306();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m7568(int i) {
        m7565(i);
        return this.f11094[i];
    }

    public C3430(long[] jArr, int i, boolean z) {
        super(z);
        this.f11094 = jArr;
        this.f11095 = i;
    }

    public C3430() {
        this(f11093, 0, true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7566(((Long) obj).longValue());
        return true;
    }
}
