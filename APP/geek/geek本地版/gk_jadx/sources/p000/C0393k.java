package p000;

import java.util.RandomAccess;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: classes.dex */
public final class C0393k extends AbstractC0430l implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC0430l f2683a;

    /* JADX INFO: renamed from: b */
    public final int f2684b;

    /* JADX INFO: renamed from: c */
    public final int f2685c;

    public C0393k(AbstractC0430l abstractC0430l, int i, int i2) {
        this.f2683a = abstractC0430l;
        this.f2684b = i;
        a80.m40d(i, i2, abstractC0430l.mo1236a());
        this.f2685c = i2 - i;
    }

    @Override // p000.AbstractC0430l
    /* JADX INFO: renamed from: a */
    public final int mo1236a() {
        return this.f2685c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f2685c;
        if (i >= 0 && i < i2) {
            return this.f2683a.get(this.f2684b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
