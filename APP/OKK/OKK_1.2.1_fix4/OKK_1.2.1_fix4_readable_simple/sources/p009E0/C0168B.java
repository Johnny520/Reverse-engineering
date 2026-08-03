package p009E0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0168B extends AbstractC0175f implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final Object[] f366a;

    /* JADX INFO: renamed from: b */
    public final int f367b;

    /* JADX INFO: renamed from: c */
    public int f368c;

    /* JADX INFO: renamed from: d */
    public int f369d;

    public C0168B(int r3, Object[] r4) {
        this.f366a = r4;
        if (r3 < 0) goto L11;
        if (r3 > r4.length) goto L9;
        this.f367b = r4.length;
        this.f369d = r3;
        return;
    L9:
        throw new IllegalArgumentException(("ring buffer filled size: " + r3 + " cannot be larger than the buffer size: " + r4.length).toString());
    L11:
        throw new IllegalArgumentException(AbstractC0324d.m720c("ring buffer filled size should not be negative but it is ", r3).toString());
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        return this.f369d;
    }

    /* JADX INFO: renamed from: b */
    public final void m517b(int r5) {
        if (r5 < 0) goto L15;
        if (r5 > this.f369d) goto L13;
        if (r5 <= 0) goto L16;
        int r02 = this.f368c;
        int r2 = this.f367b;
        int r1 = (r02 + r5) % r2;
        Object[] r3 = this.f366a;
        if (r02 <= r1) goto L9;
        AbstractC0179j.m534k0(r3, r02, r2);
        AbstractC0179j.m534k0(r3, 0, r1);
    L10:
        this.f368c = r1;
        this.f369d -= r5;
        return;
    L9:
        AbstractC0179j.m534k0(r3, r02, r1);
        goto L10
    L16:
        return;
    L13:
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + r5 + ", size = " + this.f369d).toString());
    L15:
        throw new IllegalArgumentException(AbstractC0324d.m720c("n shouldn't be negative but it is ", r5).toString());
    }

    @Override // java.util.List
    public final Object get(int r5) {
        int r02 = mo516a();
        if (r5 < 0) goto L8;
        if (r5 >= r02) goto L8;
        int r03 = (this.f368c + r5) % this.f367b;
        return this.f366a[r03];
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0167A(this);
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[mo516a()]);
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r7) {
        AbstractC0307g.m703e(r7, "array");
        int r02 = r7.length;
        int r1 = this.f369d;
        if (r02 >= r1) goto L5;
        r7 = Arrays.copyOf(r7, r1);
        AbstractC0307g.m702d(r7, "copyOf(...)");
    L5:
        int r03 = this.f369d;
        int r12 = this.f368c;
        int r2 = 0;
        int r3 = 0;
    L6:
        Object[] r4 = this.f366a;
        if (r3 >= r03) goto L11;
        if (r12 >= this.f367b) goto L11;
        r7[r3] = r4[r12];
        r3 = r3 + 1;
        r12 = r12 + 1;
    L11:
        if (r3 >= r03) goto L13;
        r7[r3] = r4[r2];
        r3 = r3 + 1;
        r2 = r2 + 1;
        goto L11
    L13:
        AbstractC0040p.m95a0(r03, r7);
        return r7;
    }
}
