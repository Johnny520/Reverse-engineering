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

    public C2780z(AbstractC0000A r1, int r2, int r3) {
        this.f9437a = r1;
        this.f9438b = r2;
        AbstractC0585Nj.m1136d(r2, r3, r1.mo0a());
        this.f9439c = r3 - r2;
    }

    @Override // p000.AbstractC0000A
    /* JADX INFO: renamed from: a */
    public final int mo0a() {
        return this.f9439c;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        int r0 = this.f9439c;
        if (r5 < 0) goto L8;
        if (r5 >= r0) goto L8;
        return this.f9437a.get(this.f9438b + r5);
    L8:
        throw new IndexOutOfBoundsException("index: " + r5 + ", size: " + r0);
    }

    @Override // p000.AbstractC0000A, java.util.List
    public final List subList(int r3, int r4) {
        AbstractC0585Nj.m1136d(r3, r4, this.f9439c);
        int r1 = this.f9438b;
        int r32 = r3 + r1;
        int r12 = r1 + r4;
        return new C2780z(this.f9437a, r32, r12);
    }
}
