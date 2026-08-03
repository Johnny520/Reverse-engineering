package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1138 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int[] f3505;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f3506;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f3507;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f3508;

    public C1138() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public C1138(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r3 < r0) goto L28
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 > r1) goto L20
            int r1 = java.lang.Integer.bitCount(r3)
            if (r1 == r0) goto L17
            int r3 = r3 + (-1)
            int r3 = java.lang.Integer.highestOneBit(r3)
            int r3 = r3 << r0
        L17:
            int r0 = r3 + (-1)
            r2.f3508 = r0
            int[] r3 = new int[r3]
            r2.f3505 = r3
            return
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be <= 2^30"
            r3.<init>(r0)
            throw r3
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "capacity must be >= 1"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m5973(int r3) {
            r2 = this;
            int r0 = r2.f3506
            int r0 = r0 + (-1)
            int r1 = r2.f3508
            r0 = r0 & r1
            r2.f3506 = r0
            int[] r1 = r2.f3505
            r1[r0] = r3
            int r3 = r2.f3507
            if (r0 != r3) goto L14
            r2.m5976()
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m5974(int r3) {
            r2 = this;
            int[] r0 = r2.f3505
            int r1 = r2.f3507
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r2.f3508
            r3 = r3 & r1
            r2.f3507 = r3
            int r0 = r2.f3506
            if (r3 != r0) goto L14
            r2.m5976()
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m5975() {
            r1 = this;
            int r0 = r1.f3506
            r1.f3507 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m5976() {
            r7 = this;
            int[] r0 = r7.f3505
            int r1 = r0.length
            int r2 = r7.f3506
            int r3 = r1 - r2
            int r4 = r1 << 1
            if (r4 < 0) goto L23
            int[] r5 = new int[r4]
            r6 = 0
            java.lang.System.arraycopy(r0, r2, r5, r6, r3)
            int[] r0 = r7.f3505
            int r2 = r7.f3506
            java.lang.System.arraycopy(r0, r6, r5, r3, r2)
            r7.f3505 = r5
            r7.f3506 = r6
            r7.f3507 = r1
            int r4 = r4 + (-1)
            r7.f3508 = r4
            return
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Max array capacity exceeded"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m5977(int r3) {
            r2 = this;
            if (r3 < 0) goto L13
            int r0 = r2.m5985()
            if (r3 >= r0) goto L13
            int[] r0 = r2.f3505
            int r1 = r2.f3506
            int r1 = r1 + r3
            int r3 = r2.f3508
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
        L13:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m5978() {
            r2 = this;
            int r0 = r2.f3506
            int r1 = r2.f3507
            if (r0 == r1) goto Lb
            int[] r1 = r2.f3505
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m5979() {
            r3 = this;
            int r0 = r3.f3506
            int r1 = r3.f3507
            if (r0 == r1) goto L10
            int[] r0 = r3.f3505
            int r1 = r1 + (-1)
            int r2 = r3.f3508
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L10:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m5980() {
            r2 = this;
            int r0 = r2.f3506
            int r1 = r2.f3507
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m5981() {
            r3 = this;
            int r0 = r3.f3506
            int r1 = r3.f3507
            if (r0 == r1) goto L12
            int[] r1 = r3.f3505
            r1 = r1[r0]
            int r0 = r0 + 1
            int r2 = r3.f3508
            r0 = r0 & r2
            r3.f3506 = r0
            return r1
        L12:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m5982() {
            r2 = this;
            int r0 = r2.f3506
            int r1 = r2.f3507
            if (r0 == r1) goto L12
            int r1 = r1 + (-1)
            int r0 = r2.f3508
            r0 = r0 & r1
            int[] r1 = r2.f3505
            r1 = r1[r0]
            r2.f3507 = r0
            return r1
        L12:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m5983(int r2) {
            r1 = this;
            if (r2 > 0) goto L3
            return
        L3:
            int r0 = r1.m5985()
            if (r2 > r0) goto L12
            int r0 = r1.f3507
            int r0 = r0 - r2
            int r2 = r1.f3508
            r2 = r2 & r0
            r1.f3507 = r2
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m5984(int r2) {
            r1 = this;
            if (r2 > 0) goto L3
            return
        L3:
            int r0 = r1.m5985()
            if (r2 > r0) goto L12
            int r0 = r1.f3506
            int r0 = r0 + r2
            int r2 = r1.f3508
            r2 = r2 & r0
            r1.f3506 = r2
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m5985() {
            r2 = this;
            int r0 = r2.f3507
            int r1 = r2.f3506
            int r0 = r0 - r1
            int r1 = r2.f3508
            r0 = r0 & r1
            return r0
    }
}
