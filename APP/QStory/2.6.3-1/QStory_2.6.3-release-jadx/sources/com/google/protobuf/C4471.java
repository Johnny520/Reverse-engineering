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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4471 extends AbstractC4380 implements InterfaceC4228, RandomAccess, InterfaceC4203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4471 f11654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final float[] f11655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float[] f11656;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11657;

    static {
        float[] fArr = new float[0];
        f11655 = fArr;
        f11654 = new C4471(fArr, 0, false);
    }

    public C4471() {
        this(f11655, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m8347();
        if (i < 0 || i > (i2 = this.f11657)) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11657);
            return;
        }
        float[] fArr = this.f11656;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC3275.m5130(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11656, 0, fArr2, 0, i);
            System.arraycopy(this.f11656, i, fArr2, i + 1, this.f11657 - i);
            this.f11656 = fArr2;
        }
        this.f11656[i] = fFloatValue;
        this.f11657++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8347();
        Charset charset = AbstractC4234.f11404;
        collection.getClass();
        if (!(collection instanceof C4471)) {
            return super.addAll(collection);
        }
        C4471 c4471 = (C4471) collection;
        int i = c4471.f11657;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11657;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f11656;
        if (i3 > fArr.length) {
            this.f11656 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c4471.f11656, 0, this.f11656, this.f11657, c4471.f11657);
        this.f11657 = i3;
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
        if (!(obj instanceof C4471)) {
            return super.equals(obj);
        }
        C4471 c4471 = (C4471) obj;
        if (this.f11657 != c4471.f11657) {
            return false;
        }
        float[] fArr = c4471.f11656;
        for (int i = 0; i < this.f11657; i++) {
            if (Float.floatToIntBits(this.f11656[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8400(i);
        return Float.valueOf(this.f11656[i]);
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f11657; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f11656[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f11657;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11656[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8347();
        m8400(i);
        float[] fArr = this.f11656;
        float f = fArr[i];
        if (i < this.f11657 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f11657--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8347();
        if (i2 < i) {
            C8376.m13331("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f11656;
        System.arraycopy(fArr, i2, fArr, i, this.f11657 - i2);
        this.f11657 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m8347();
        m8400(i);
        float[] fArr = this.f11656;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11657;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8400(int i) {
        if (i < 0 || i >= this.f11657) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11657);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8401(float f) {
        m8347();
        int i = this.f11657;
        float[] fArr = this.f11656;
        if (i == fArr.length) {
            float[] fArr2 = new float[AbstractC3275.m5130(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11656, 0, fArr2, 0, this.f11657);
            this.f11656 = fArr2;
        }
        float[] fArr3 = this.f11656;
        int i2 = this.f11657;
        this.f11657 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.protobuf.InterfaceC4235
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4471 mo8045(int i) {
        if (i >= this.f11657) {
            return new C4471(i == 0 ? f11655 : Arrays.copyOf(this.f11656, i), this.f11657, true);
        }
        C6755.m11865();
        return null;
    }

    public C4471(float[] fArr, int i, boolean z) {
        super(z);
        this.f11656 = fArr;
        this.f11657 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8401(((Float) obj).floatValue());
        return true;
    }
}
