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

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3534 extends AbstractC3547 implements InterfaceC3611, RandomAccess, InterfaceC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3534 f11172;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final boolean[] f11173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean[] f11174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11175;

    static {
        boolean[] zArr = new boolean[0];
        f11173 = zArr;
        f11172 = new C3534(zArr, 0, false);
    }

    public C3534() {
        this(f11173, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m7801();
        if (i < 0 || i > (i2 = this.f11175)) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11175);
            return;
        }
        boolean[] zArr = this.f11174;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[AbstractC2442.m4560(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11174, 0, zArr2, 0, i);
            System.arraycopy(this.f11174, i, zArr2, i + 1, this.f11175 - i);
            this.f11174 = zArr2;
        }
        this.f11174[i] = zBooleanValue;
        this.f11175++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7801();
        Charset charset = AbstractC3401.f11054;
        collection.getClass();
        if (!(collection instanceof C3534)) {
            return super.addAll(collection);
        }
        C3534 c3534 = (C3534) collection;
        int i = c3534.f11175;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11175;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f11174;
        if (i3 > zArr.length) {
            this.f11174 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c3534.f11174, 0, this.f11174, this.f11175, c3534.f11175);
        this.f11175 = i3;
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
        if (!(obj instanceof C3534)) {
            return super.equals(obj);
        }
        C3534 c3534 = (C3534) obj;
        if (this.f11175 != c3534.f11175) {
            return false;
        }
        boolean[] zArr = c3534.f11174;
        for (int i = 0; i < this.f11175; i++) {
            if (this.f11174[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7773(i);
        return Boolean.valueOf(this.f11174[i]);
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM7516 = 1;
        for (int i = 0; i < this.f11175; i++) {
            iM7516 = (iM7516 * 31) + AbstractC3401.m7516(this.f11174[i]);
        }
        return iM7516;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f11175;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11174[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7801();
        m7773(i);
        boolean[] zArr = this.f11174;
        boolean z = zArr[i];
        if (i < this.f11175 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f11175--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7801();
        if (i2 < i) {
            C7546.m12743("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.f11174;
        System.arraycopy(zArr, i2, zArr, i, this.f11175 - i2);
        this.f11175 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m7801();
        m7773(i);
        boolean[] zArr = this.f11174;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11175;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7773(int i) {
        if (i < 0 || i >= this.f11175) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11175);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7774(boolean z) {
        m7801();
        int i = this.f11175;
        boolean[] zArr = this.f11174;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC2442.m4560(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11174, 0, zArr2, 0, this.f11175);
            this.f11174 = zArr2;
        }
        boolean[] zArr3 = this.f11174;
        int i2 = this.f11175;
        this.f11175 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.protobuf.InterfaceC3402
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3534 mo7499(int i) {
        if (i >= this.f11175) {
            return new C3534(i == 0 ? f11173 : Arrays.copyOf(this.f11174, i), this.f11175, true);
        }
        C5919.m11245();
        return null;
    }

    public C3534(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f11174 = zArr;
        this.f11175 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7774(((Boolean) obj).booleanValue());
        return true;
    }
}
