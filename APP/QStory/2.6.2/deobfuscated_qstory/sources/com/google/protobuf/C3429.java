package com.google.protobuf;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import io.ktor.util.C4210;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏子兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3429 extends AbstractC3547 implements InterfaceC3403, RandomAccess, InterfaceC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3429 f11087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long[] f11088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long[] f11089;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11090;

    static {
        long[] jArr = new long[0];
        f11088 = jArr;
        f11087 = new C3429(jArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3429(C3429 c3429, boolean z) {
        int i = c3429.f11090;
        this(i == 0 ? f11088 : Arrays.copyOf(c3429.f11089, i), c3429.f11090, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m7801();
        if (i < 0 || i > (i2 = this.f11090)) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11090);
            return;
        }
        long[] jArr = this.f11089;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC2442.m4560(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11089, 0, jArr2, 0, i);
            System.arraycopy(this.f11089, i, jArr2, i + 1, this.f11090 - i);
            this.f11089 = jArr2;
        }
        this.f11089[i] = jLongValue;
        this.f11090++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7801();
        Charset charset = AbstractC3401.f11054;
        collection.getClass();
        if (!(collection instanceof C3429)) {
            return super.addAll(collection);
        }
        C3429 c3429 = (C3429) collection;
        int i = c3429.f11090;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11090;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f11089;
        if (i3 > jArr.length) {
            this.f11089 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c3429.f11089, 0, this.f11089, this.f11090, c3429.f11090);
        this.f11090 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3429)) {
            return super.equals(obj);
        }
        C3429 c3429 = (C3429) obj;
        if (this.f11090 != c3429.f11090) {
            return false;
        }
        long[] jArr = c3429.f11089;
        for (int i = 0; i < this.f11090; i++) {
            if (this.f11089[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(m7581(i));
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM7515 = 1;
        for (int i = 0; i < this.f11090; i++) {
            iM7515 = (iM7515 * 31) + AbstractC3401.m7515(this.f11089[i]);
        }
        return iM7515;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f11090;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11089[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7801();
        m7578(i);
        long[] jArr = this.f11089;
        long j = jArr[i];
        if (i < this.f11090 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f11090--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7801();
        if (i2 < i) {
            C7546.m12743("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f11089;
        System.arraycopy(jArr, i2, jArr, i, this.f11090 - i2);
        this.f11090 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m7801();
        m7578(i);
        long[] jArr = this.f11089;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11090;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7578(int i) {
        if (i < 0 || i >= this.f11090) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11090);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7579(long j) {
        m7801();
        int i = this.f11090;
        long[] jArr = this.f11089;
        if (i == jArr.length) {
            long[] jArr2 = new long[AbstractC2442.m4560(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11089, 0, jArr2, 0, this.f11090);
            this.f11089 = jArr2;
        }
        long[] jArr3 = this.f11089;
        int i2 = this.f11090;
        this.f11090 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.protobuf.InterfaceC3402
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3429 mo7499(int i) {
        if (i >= this.f11090) {
            return new C3429(i == 0 ? f11088 : Arrays.copyOf(this.f11089, i), this.f11090, true);
        }
        C5919.m11245();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long m7581(int i) {
        m7578(i);
        return this.f11089[i];
    }

    public C3429(long[] jArr, int i, boolean z) {
        super(z);
        this.f11089 = jArr;
        this.f11090 = i;
    }

    public C3429() {
        this(f11088, 0, true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7579(((Long) obj).longValue());
        return true;
    }
}
