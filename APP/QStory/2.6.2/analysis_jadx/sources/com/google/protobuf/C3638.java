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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲子世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3638 extends AbstractC3547 implements InterfaceC3395, RandomAccess, InterfaceC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3638 f11304;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final float[] f11305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float[] f11306;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11307;

    static {
        float[] fArr = new float[0];
        f11305 = fArr;
        f11304 = new C3638(fArr, 0, false);
    }

    public C3638() {
        this(f11305, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m7801();
        if (i < 0 || i > (i2 = this.f11307)) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11307);
            return;
        }
        float[] fArr = this.f11306;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC2442.m4560(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11306, 0, fArr2, 0, i);
            System.arraycopy(this.f11306, i, fArr2, i + 1, this.f11307 - i);
            this.f11306 = fArr2;
        }
        this.f11306[i] = fFloatValue;
        this.f11307++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7801();
        Charset charset = AbstractC3401.f11054;
        collection.getClass();
        if (!(collection instanceof C3638)) {
            return super.addAll(collection);
        }
        C3638 c3638 = (C3638) collection;
        int i = c3638.f11307;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11307;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f11306;
        if (i3 > fArr.length) {
            this.f11306 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c3638.f11306, 0, this.f11306, this.f11307, c3638.f11307);
        this.f11307 = i3;
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
        if (!(obj instanceof C3638)) {
            return super.equals(obj);
        }
        C3638 c3638 = (C3638) obj;
        if (this.f11307 != c3638.f11307) {
            return false;
        }
        float[] fArr = c3638.f11306;
        for (int i = 0; i < this.f11307; i++) {
            if (Float.floatToIntBits(this.f11306[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7854(i);
        return Float.valueOf(this.f11306[i]);
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f11307; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f11306[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f11307;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11306[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7801();
        m7854(i);
        float[] fArr = this.f11306;
        float f = fArr[i];
        if (i < this.f11307 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f11307--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7801();
        if (i2 < i) {
            C7546.m12743("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f11306;
        System.arraycopy(fArr, i2, fArr, i, this.f11307 - i2);
        this.f11307 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m7801();
        m7854(i);
        float[] fArr = this.f11306;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11307;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7854(int i) {
        if (i < 0 || i >= this.f11307) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11307);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7855(float f) {
        m7801();
        int i = this.f11307;
        float[] fArr = this.f11306;
        if (i == fArr.length) {
            float[] fArr2 = new float[AbstractC2442.m4560(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11306, 0, fArr2, 0, this.f11307);
            this.f11306 = fArr2;
        }
        float[] fArr3 = this.f11306;
        int i2 = this.f11307;
        this.f11307 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.protobuf.InterfaceC3402
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3638 mo7499(int i) {
        if (i >= this.f11307) {
            return new C3638(i == 0 ? f11305 : Arrays.copyOf(this.f11306, i), this.f11307, true);
        }
        C5919.m11245();
        return null;
    }

    public C3638(float[] fArr, int i, boolean z) {
        super(z);
        this.f11306 = fArr;
        this.f11307 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7855(((Float) obj).floatValue());
        return true;
    }
}
