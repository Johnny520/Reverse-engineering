package p000;

import java.util.RandomAccess;

/* JADX INFO: renamed from: k */
/* JADX INFO: loaded from: classes.dex */
public final class C0393k extends AbstractC0430l implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC0430l f2757a;

    /* JADX INFO: renamed from: b */
    public final int f2758b;

    /* JADX INFO: renamed from: c */
    public final int f2759c;

    public C0393k(AbstractC0430l abstractC0430l, int i, int i2) {
        this.f2757a = abstractC0430l;
        this.f2758b = i;
        g80.m1189d(i, i2, abstractC0430l.mo1640a());
        this.f2759c = i2 - i;
    }

    @Override // p000.AbstractC0430l
    /* JADX INFO: renamed from: a */
    public final int mo1640a() {
        return this.f2759c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f2759c;
        if (i >= 0 && i < i2) {
            return this.f2757a.get(this.f2758b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
