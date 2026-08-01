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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3591 extends AbstractC3548 implements InterfaceC3400, RandomAccess, InterfaceC3371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3591 f11210;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final double[] f11211;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public double[] f11212;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11213;

    static {
        double[] dArr = new double[0];
        f11211 = dArr;
        f11210 = new C3591(dArr, 0, false);
    }

    public C3591() {
        this(f11211, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m7788();
        if (i < 0 || i > (i2 = this.f11213)) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11213);
            return;
        }
        double[] dArr = this.f11212;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[AbstractC2442.m4570(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11212, 0, dArr2, 0, i);
            System.arraycopy(this.f11212, i, dArr2, i + 1, this.f11213 - i);
            this.f11212 = dArr2;
        }
        this.f11212[i] = dDoubleValue;
        this.f11213++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7788();
        Charset charset = AbstractC3402.f11059;
        collection.getClass();
        if (!(collection instanceof C3591)) {
            return super.addAll(collection);
        }
        C3591 c3591 = (C3591) collection;
        int i = c3591.f11213;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11213;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f11212;
        if (i3 > dArr.length) {
            this.f11212 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c3591.f11212, 0, this.f11212, this.f11213, c3591.f11213);
        this.f11213 = i3;
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
        if (!(obj instanceof C3591)) {
            return super.equals(obj);
        }
        C3591 c3591 = (C3591) obj;
        if (this.f11213 != c3591.f11213) {
            return false;
        }
        double[] dArr = c3591.f11212;
        for (int i = 0; i < this.f11213; i++) {
            if (Double.doubleToLongBits(this.f11212[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7794(i);
        return Double.valueOf(this.f11212[i]);
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM7502 = 1;
        for (int i = 0; i < this.f11213; i++) {
            iM7502 = (iM7502 * 31) + AbstractC3402.m7502(Double.doubleToLongBits(this.f11212[i]));
        }
        return iM7502;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f11213;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11212[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7788();
        m7794(i);
        double[] dArr = this.f11212;
        double d = dArr[i];
        if (i < this.f11213 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f11213--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7788();
        if (i2 < i) {
            C7547.m12772("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f11212;
        System.arraycopy(dArr, i2, dArr, i, this.f11213 - i2);
        this.f11213 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m7788();
        m7794(i);
        double[] dArr = this.f11212;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11213;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7794(int i) {
        if (i < 0 || i >= this.f11213) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11213);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7795(double d) {
        m7788();
        int i = this.f11213;
        double[] dArr = this.f11212;
        if (i == dArr.length) {
            double[] dArr2 = new double[AbstractC2442.m4570(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11212, 0, dArr2, 0, this.f11213);
            this.f11212 = dArr2;
        }
        double[] dArr3 = this.f11212;
        int i2 = this.f11213;
        this.f11213 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.protobuf.InterfaceC3403
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3591 mo7486(int i) {
        if (i >= this.f11213) {
            return new C3591(i == 0 ? f11211 : Arrays.copyOf(this.f11212, i), this.f11213, true);
        }
        C5925.m11306();
        return null;
    }

    public C3591(double[] dArr, int i, boolean z) {
        super(z);
        this.f11212 = dArr;
        this.f11213 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7795(((Double) obj).doubleValue());
        return true;
    }
}
