package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f4 extends p000.d4 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f336;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f337;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f338;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public int f339;

    public f4(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.f336 = r5
            r2.f337 = r4
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto Le
            if (r3 > r4) goto L11
            goto L12
        Le:
            if (r3 < r4) goto L11
            goto L12
        L11:
            r0 = r1
        L12:
            r2.f338 = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.f339 = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f338
            return r0
    }

    @Override // p000.d4
    public final int nextInt() {
            r2 = this;
            int r0 = r2.f339
            int r1 = r2.f337
            if (r0 != r1) goto L14
            boolean r1 = r2.f338
            if (r1 == 0) goto Le
            r1 = 0
            r2.f338 = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.f336
            int r1 = r1 + r0
            r2.f339 = r1
        L19:
            return r0
    }
}
