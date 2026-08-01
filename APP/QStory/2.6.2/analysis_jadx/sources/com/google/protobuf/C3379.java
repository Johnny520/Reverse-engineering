package com.google.protobuf;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import io.ktor.util.C4210;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲苏子楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3379 extends AbstractC3547 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C3379 f11022;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final Object[] f11023;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object[] f11024;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f11025;

    static {
        Object[] objArr = new Object[0];
        f11023 = objArr;
        f11022 = new C3379(objArr, 0, false);
    }

    public C3379() {
        this(f11023, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m7801();
        if (i < 0 || i > (i2 = this.f11025)) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11025);
            return;
        }
        Object[] objArr = this.f11024;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC2442.m4560(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f11024, 0, objArr2, 0, i);
            System.arraycopy(this.f11024, i, objArr2, i + 1, this.f11025 - i);
            this.f11024 = objArr2;
        }
        this.f11024[i] = obj;
        this.f11025++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m7496(i);
        return this.f11024[i];
    }

    @Override // com.google.protobuf.AbstractC3547, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7801();
        m7496(i);
        Object[] objArr = this.f11024;
        Object obj = objArr[i];
        if (i < this.f11025 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f11025--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m7801();
        m7496(i);
        Object[] objArr = this.f11024;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11025;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m7496(int i) {
        if (i < 0 || i >= this.f11025) {
            C4210.m8624(AbstractC0053.m148(i, "Index:", ", Size:"), this.f11025);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7497(int i) {
        Object[] objArr = this.f11024;
        if (i <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f11024 = new Object[Math.max(i, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i) {
            length = AbstractC2442.m4560(length, 3, 2, 1, 10);
        }
        this.f11024 = Arrays.copyOf(this.f11024, length);
    }

    @Override // com.google.protobuf.InterfaceC3402
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3379 mo7499(int i) {
        if (i >= this.f11025) {
            return new C3379(i == 0 ? f11023 : Arrays.copyOf(this.f11024, i), this.f11025, true);
        }
        C5919.m11245();
        return null;
    }

    public C3379(Object[] objArr, int i, boolean z) {
        super(z);
        this.f11024 = objArr;
        this.f11025 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7801();
        int i = this.f11025;
        Object[] objArr = this.f11024;
        if (i == objArr.length) {
            this.f11024 = Arrays.copyOf(this.f11024, AbstractC2442.m4560(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f11024;
        int i2 = this.f11025;
        this.f11025 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
