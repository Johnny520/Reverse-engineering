package com.google.protobuf;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import io.ktor.util.C5043;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲苏子楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4212 extends AbstractC4380 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4212 f11372;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Object[] f11373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f11374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11375;

    static {
        Object[] objArr = new Object[0];
        f11373 = objArr;
        f11372 = new C4212(objArr, 0, false);
    }

    public C4212() {
        this(f11373, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m8347();
        if (i < 0 || i > (i2 = this.f11375)) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11375);
            return;
        }
        Object[] objArr = this.f11374;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC3275.m5130(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11374, 0, objArr2, 0, i);
            System.arraycopy(this.f11374, i, objArr2, i + 1, this.f11375 - i);
            this.f11374 = objArr2;
        }
        this.f11374[i] = obj;
        this.f11375++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8042(i);
        return this.f11374[i];
    }

    @Override // com.google.protobuf.AbstractC4380, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8347();
        m8042(i);
        Object[] objArr = this.f11374;
        Object obj = objArr[i];
        if (i < this.f11375 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f11375--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m8347();
        m8042(i);
        Object[] objArr = this.f11374;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11375;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8042(int i) {
        if (i < 0 || i >= this.f11375) {
            C5043.m9173(AbstractC0900.m710(i, "Index:", ", Size:"), this.f11375);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8043(int i) {
        Object[] objArr = this.f11374;
        if (i <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f11374 = new Object[Math.max(i, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i) {
            length = AbstractC3275.m5130(length, 3, 2, 1, 10);
        }
        this.f11374 = Arrays.copyOf(this.f11374, length);
    }

    @Override // com.google.protobuf.InterfaceC4235
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4212 mo8045(int i) {
        if (i >= this.f11375) {
            return new C4212(i == 0 ? f11373 : Arrays.copyOf(this.f11374, i), this.f11375, true);
        }
        C6755.m11865();
        return null;
    }

    public C4212(Object[] objArr, int i, boolean z) {
        super(z);
        this.f11374 = objArr;
        this.f11375 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8347();
        int i = this.f11375;
        Object[] objArr = this.f11374;
        if (i == objArr.length) {
            this.f11374 = Arrays.copyOf(this.f11374, AbstractC3275.m5130(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f11374;
        int i2 = this.f11375;
        this.f11375 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
