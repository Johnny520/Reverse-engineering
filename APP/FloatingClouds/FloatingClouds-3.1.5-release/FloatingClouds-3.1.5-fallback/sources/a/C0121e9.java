package a;

/* JADX INFO: renamed from: a.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0121e9 extends a.AbstractC0085c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f458a;
    public final int b;
    public boolean c;
    public int d;

    public C0121e9(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f458a = r5
            r2.b = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.c = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.d = r3
            return
    }

    @Override // a.AbstractC0085c9
    public final int a() {
            r2 = this;
            int r0 = r2.d
            int r1 = r2.b
            if (r0 != r1) goto L14
            boolean r1 = r2.c
            if (r1 == 0) goto Le
            r1 = 0
            r2.c = r1
            return r0
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.f458a
            int r1 = r1 + r0
            r2.d = r1
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }
}
