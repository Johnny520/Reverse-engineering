package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: classes.dex */
public final class C2780z extends AbstractC0000A implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC0000A f9437a;

    /* JADX INFO: renamed from: b */
    public final int f9438b;

    /* JADX INFO: renamed from: c */
    public final int f9439c;

    public C2780z(AbstractC0000A abstractC0000A, int i, int i2) {
        this.f9437a = abstractC0000A;
        this.f9438b = i;
        AbstractC0585Nj.m1136d(i, i2, abstractC0000A.mo0a());
        this.f9439c = i2 - i;
    }

    @Override // p000.AbstractC0000A
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f9439c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f9439c;
        if (i >= 0 && i < i2) {
            return this.f9437a.get(this.f9438b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final List subList(int i, int i2) {
        AbstractC0585Nj.m1136d(i, i2, this.f9439c);
        int i3 = this.f9438b;
        return new C2780z(this.f9437a, i + i3, i3 + i2);
    }
}
