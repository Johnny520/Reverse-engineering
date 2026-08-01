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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰哲苏子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3612 extends AbstractC3547 implements InterfaceC3394, RandomAccess, InterfaceC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3612 f11244;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int[] f11245;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f11246;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11247;

    static {
        int[] iArr = new int[0];
        f11245 = iArr;
        f11244 = new C3612(iArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3612(C3612 c3612, boolean z) {
        int i = c3612.f11247;
        this(i == 0 ? f11245 : Arrays.copyOf(c3612.f11246, i), c3612.f11247, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m7801();
        if (i < 0 || i > (i2 = this.f11247)) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11247);
            return;
        }
        int[] iArr = this.f11246;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC2442.m4560(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11246, 0, iArr2, 0, i);
            System.arraycopy(this.f11246, i, iArr2, i + 1, this.f11247 - i);
            this.f11246 = iArr2;
        }
        this.f11246[i] = iIntValue;
        this.f11247++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7801();
        Charset charset = AbstractC3401.f11054;
        collection.getClass();
        if (!(collection instanceof C3612)) {
            return super.addAll(collection);
        }
        C3612 c3612 = (C3612) collection;
        int i = c3612.f11247;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11247;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f11246;
        if (i3 > iArr.length) {
            this.f11246 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c3612.f11246, 0, this.f11246, this.f11247, c3612.f11247);
        this.f11247 = i3;
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
        if (!(obj instanceof C3612)) {
            return super.equals(obj);
        }
        C3612 c3612 = (C3612) obj;
        if (this.f11247 != c3612.f11247) {
            return false;
        }
        int[] iArr = c3612.f11246;
        for (int i = 0; i < this.f11247; i++) {
            if (this.f11246[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(m7827(i));
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11247; i2++) {
            i = (i * 31) + this.f11246[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f11247;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11246[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7801();
        m7824(i);
        int[] iArr = this.f11246;
        int i2 = iArr[i];
        if (i < this.f11247 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f11247--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7801();
        if (i2 < i) {
            C7546.m12743("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f11246;
        System.arraycopy(iArr, i2, iArr, i, this.f11247 - i2);
        this.f11247 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Integer.valueOf(m7828(i, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11247;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7824(int i) {
        if (i < 0 || i >= this.f11247) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11247);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7825(int i) {
        m7801();
        int i2 = this.f11247;
        int[] iArr = this.f11246;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC2442.m4560(iArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11246, 0, iArr2, 0, this.f11247);
            this.f11246 = iArr2;
        }
        int[] iArr3 = this.f11246;
        int i3 = this.f11247;
        this.f11247 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.protobuf.InterfaceC3402
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3612 mo7499(int i) {
        if (i >= this.f11247) {
            return new C3612(i == 0 ? f11245 : Arrays.copyOf(this.f11246, i), this.f11247, true);
        }
        C5919.m11245();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m7827(int i) {
        m7824(i);
        return this.f11246[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int m7828(int i, int i2) {
        m7801();
        m7824(i);
        int[] iArr = this.f11246;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public C3612(int[] iArr, int i, boolean z) {
        super(z);
        this.f11246 = iArr;
        this.f11247 = i;
    }

    public C3612() {
        this(f11245, 0, true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7825(((Integer) obj).intValue());
        return true;
    }
}
