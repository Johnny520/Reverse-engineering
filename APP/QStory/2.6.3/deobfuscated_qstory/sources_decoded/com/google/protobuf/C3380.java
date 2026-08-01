package com.google.protobuf;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import io.ktor.util.C4211;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲苏子楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3380 extends AbstractC3548 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3380 f11027;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Object[] f11028;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f11029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11030;

    static {
        Object[] objArr = new Object[0];
        f11028 = objArr;
        f11027 = new C3380(objArr, 0, false);
    }

    public C3380() {
        this(f11028, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m7788();
        if (i < 0 || i > (i2 = this.f11030)) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11030);
            return;
        }
        Object[] objArr = this.f11029;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC2442.m4570(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11029, 0, objArr2, 0, i);
            System.arraycopy(this.f11029, i, objArr2, i + 1, this.f11030 - i);
            this.f11029 = objArr2;
        }
        this.f11029[i] = obj;
        this.f11030++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7483(i);
        return this.f11029[i];
    }

    @Override // com.google.protobuf.AbstractC3548, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7788();
        m7483(i);
        Object[] objArr = this.f11029;
        Object obj = objArr[i];
        if (i < this.f11030 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f11030--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m7788();
        m7483(i);
        Object[] objArr = this.f11029;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11030;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7483(int i) {
        if (i < 0 || i >= this.f11030) {
            C4211.m8614(AbstractC0053.m150(i, "Index:", ", Size:"), this.f11030);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7484(int i) {
        Object[] objArr = this.f11029;
        if (i <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f11029 = new Object[Math.max(i, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i) {
            length = AbstractC2442.m4570(length, 3, 2, 1, 10);
        }
        this.f11029 = Arrays.copyOf(this.f11029, length);
    }

    @Override // com.google.protobuf.InterfaceC3403
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3380 mo7486(int i) {
        if (i >= this.f11030) {
            return new C3380(i == 0 ? f11028 : Arrays.copyOf(this.f11029, i), this.f11030, true);
        }
        C5925.m11306();
        return null;
    }

    public C3380(Object[] objArr, int i, boolean z) {
        super(z);
        this.f11029 = objArr;
        this.f11030 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7788();
        int i = this.f11030;
        Object[] objArr = this.f11029;
        if (i == objArr.length) {
            this.f11029 = Arrays.copyOf(this.f11029, AbstractC2442.m4570(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f11029;
        int i2 = this.f11030;
        this.f11030 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
