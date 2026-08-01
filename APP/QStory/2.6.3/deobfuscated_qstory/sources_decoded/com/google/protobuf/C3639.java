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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3639 extends AbstractC3548 implements InterfaceC3396, RandomAccess, InterfaceC3371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3639 f11309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final float[] f11310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float[] f11311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11312;

    static {
        float[] fArr = new float[0];
        f11310 = fArr;
        f11309 = new C3639(fArr, 0, false);
    }

    public C3639() {
        this(f11310, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m7788();
        if (i < 0 || i > (i2 = this.f11312)) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11312);
            return;
        }
        float[] fArr = this.f11311;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC2442.m4570(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11311, 0, fArr2, 0, i);
            System.arraycopy(this.f11311, i, fArr2, i + 1, this.f11312 - i);
            this.f11311 = fArr2;
        }
        this.f11311[i] = fFloatValue;
        this.f11312++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7788();
        Charset charset = AbstractC3402.f11059;
        collection.getClass();
        if (!(collection instanceof C3639)) {
            return super.addAll(collection);
        }
        C3639 c3639 = (C3639) collection;
        int i = c3639.f11312;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11312;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f11311;
        if (i3 > fArr.length) {
            this.f11311 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c3639.f11311, 0, this.f11311, this.f11312, c3639.f11312);
        this.f11312 = i3;
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
        if (!(obj instanceof C3639)) {
            return super.equals(obj);
        }
        C3639 c3639 = (C3639) obj;
        if (this.f11312 != c3639.f11312) {
            return false;
        }
        float[] fArr = c3639.f11311;
        for (int i = 0; i < this.f11312; i++) {
            if (Float.floatToIntBits(this.f11311[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7841(i);
        return Float.valueOf(this.f11311[i]);
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f11312; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f11311[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f11312;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11311[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7788();
        m7841(i);
        float[] fArr = this.f11311;
        float f = fArr[i];
        if (i < this.f11312 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f11312--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7788();
        if (i2 < i) {
            C7547.m12772("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f11311;
        System.arraycopy(fArr, i2, fArr, i, this.f11312 - i2);
        this.f11312 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m7788();
        m7841(i);
        float[] fArr = this.f11311;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11312;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7841(int i) {
        if (i < 0 || i >= this.f11312) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11312);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7842(float f) {
        m7788();
        int i = this.f11312;
        float[] fArr = this.f11311;
        if (i == fArr.length) {
            float[] fArr2 = new float[AbstractC2442.m4570(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11311, 0, fArr2, 0, this.f11312);
            this.f11311 = fArr2;
        }
        float[] fArr3 = this.f11311;
        int i2 = this.f11312;
        this.f11312 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.protobuf.InterfaceC3403
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3639 mo7486(int i) {
        if (i >= this.f11312) {
            return new C3639(i == 0 ? f11310 : Arrays.copyOf(this.f11311, i), this.f11312, true);
        }
        C5925.m11306();
        return null;
    }

    public C3639(float[] fArr, int i, boolean z) {
        super(z);
        this.f11311 = fArr;
        this.f11312 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7842(((Float) obj).floatValue());
        return true;
    }
}
