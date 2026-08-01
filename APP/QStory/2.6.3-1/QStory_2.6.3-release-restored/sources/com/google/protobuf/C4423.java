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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4423 extends AbstractC4380 implements InterfaceC4232, RandomAccess, InterfaceC4203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4423 f11555;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final double[] f11556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public double[] f11557;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11558;

    static {
        double[] dArr = new double[0];
        f11556 = dArr;
        f11555 = new C4423(dArr, 0, false);
    }

    public C4423() {
        this(f11556, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m8347();
        if (i < 0 || i > (i2 = this.f11558)) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11558);
            return;
        }
        double[] dArr = this.f11557;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[AbstractC3275.m5130(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11557, 0, dArr2, 0, i);
            System.arraycopy(this.f11557, i, dArr2, i + 1, this.f11558 - i);
            this.f11557 = dArr2;
        }
        this.f11557[i] = dDoubleValue;
        this.f11558++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8347();
        Charset charset = AbstractC4234.f11404;
        collection.getClass();
        if (!(collection instanceof C4423)) {
            return super.addAll(collection);
        }
        C4423 c4423 = (C4423) collection;
        int i = c4423.f11558;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11558;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f11557;
        if (i3 > dArr.length) {
            this.f11557 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c4423.f11557, 0, this.f11557, this.f11558, c4423.f11558);
        this.f11558 = i3;
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
        if (!(obj instanceof C4423)) {
            return super.equals(obj);
        }
        C4423 c4423 = (C4423) obj;
        if (this.f11558 != c4423.f11558) {
            return false;
        }
        double[] dArr = c4423.f11557;
        for (int i = 0; i < this.f11558; i++) {
            if (Double.doubleToLongBits(this.f11557[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8353(i);
        return Double.valueOf(this.f11557[i]);
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8061 = 1;
        for (int i = 0; i < this.f11558; i++) {
            iM8061 = (iM8061 * 31) + AbstractC4234.m8061(Double.doubleToLongBits(this.f11557[i]));
        }
        return iM8061;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f11558;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11557[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8347();
        m8353(i);
        double[] dArr = this.f11557;
        double d = dArr[i];
        if (i < this.f11558 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f11558--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8347();
        if (i2 < i) {
            C8376.m13331("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.f11557;
        System.arraycopy(dArr, i2, dArr, i, this.f11558 - i2);
        this.f11558 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m8347();
        m8353(i);
        double[] dArr = this.f11557;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11558;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8353(int i) {
        if (i < 0 || i >= this.f11558) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11558);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8354(double d) {
        m8347();
        int i = this.f11558;
        double[] dArr = this.f11557;
        if (i == dArr.length) {
            double[] dArr2 = new double[AbstractC3275.m5130(dArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11557, 0, dArr2, 0, this.f11558);
            this.f11557 = dArr2;
        }
        double[] dArr3 = this.f11557;
        int i2 = this.f11558;
        this.f11558 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.protobuf.InterfaceC4235
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4423 mo8045(int i) {
        if (i >= this.f11558) {
            return new C4423(i == 0 ? f11556 : Arrays.copyOf(this.f11557, i), this.f11558, true);
        }
        C6755.m11865();
        return null;
    }

    public C4423(double[] dArr, int i, boolean z) {
        super(z);
        this.f11557 = dArr;
        this.f11558 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8354(((Double) obj).doubleValue());
        return true;
    }
}
