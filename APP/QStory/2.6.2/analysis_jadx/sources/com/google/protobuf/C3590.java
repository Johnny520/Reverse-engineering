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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3590 extends AbstractC3547 implements InterfaceC3399, RandomAccess, InterfaceC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3590 f11205;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final double[] f11206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public double[] f11207;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11208;

    static {
        double[] dArr = new double[0];
        f11206 = dArr;
        f11205 = new C3590(dArr, 0, false);
    }

    public C3590() {
        this(f11206, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m7801();
        if (i < 0 || i > (i2 = this.f11208)) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11208);
            return;
        }
        double[] dArr = this.f11207;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[AbstractC2442.m4560(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11207, 0, dArr2, 0, i);
            System.arraycopy(this.f11207, i, dArr2, i + 1, this.f11208 - i);
            this.f11207 = dArr2;
        }
        this.f11207[i] = dDoubleValue;
        this.f11208++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7801();
        Charset charset = AbstractC3401.f11054;
        collection.getClass();
        if (!(collection instanceof C3590)) {
            return super.addAll(collection);
        }
        C3590 c3590 = (C3590) collection;
        int i = c3590.f11208;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11208;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f11207;
        if (i3 > dArr.length) {
            this.f11207 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c3590.f11207, 0, this.f11207, this.f11208, c3590.f11208);
        this.f11208 = i3;
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
        if (!(obj instanceof C3590)) {
            return super.equals(obj);
        }
        C3590 c3590 = (C3590) obj;
        if (this.f11208 != c3590.f11208) {
            return false;
        }
        double[] dArr = c3590.f11207;
        for (int i = 0; i < this.f11208; i++) {
            if (Double.doubleToLongBits(this.f11207[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7807(i);
        return Double.valueOf(this.f11207[i]);
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM7515 = 1;
        for (int i = 0; i < this.f11208; i++) {
            iM7515 = (iM7515 * 31) + AbstractC3401.m7515(Double.doubleToLongBits(this.f11207[i]));
        }
        return iM7515;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f11208;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11207[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7801();
        m7807(i);
        double[] dArr = this.f11207;
        double d = dArr[i];
        if (i < this.f11208 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f11208--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7801();
        if (i2 < i) {
            C7546.m12743("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f11207;
        System.arraycopy(dArr, i2, dArr, i, this.f11208 - i2);
        this.f11208 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m7801();
        m7807(i);
        double[] dArr = this.f11207;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11208;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7807(int i) {
        if (i < 0 || i >= this.f11208) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11208);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7808(double d) {
        m7801();
        int i = this.f11208;
        double[] dArr = this.f11207;
        if (i == dArr.length) {
            double[] dArr2 = new double[AbstractC2442.m4560(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11207, 0, dArr2, 0, this.f11208);
            this.f11207 = dArr2;
        }
        double[] dArr3 = this.f11207;
        int i2 = this.f11208;
        this.f11208 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.protobuf.InterfaceC3402
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3590 mo7499(int i) {
        if (i >= this.f11208) {
            return new C3590(i == 0 ? f11206 : Arrays.copyOf(this.f11207, i), this.f11208, true);
        }
        C5919.m11245();
        return null;
    }

    public C3590(double[] dArr, int i, boolean z) {
        super(z);
        this.f11207 = dArr;
        this.f11208 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7808(((Double) obj).doubleValue());
        return true;
    }
}
