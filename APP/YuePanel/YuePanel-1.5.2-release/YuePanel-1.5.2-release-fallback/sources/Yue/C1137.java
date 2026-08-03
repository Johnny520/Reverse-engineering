package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1137<E> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public E[] f3501;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f3502;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f3503;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f3504;

    public C1137() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public C1137(int r3) {
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
            r2.f3504 = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f3501 = r3
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
    public void m5960(E r3) {
            r2 = this;
            int r0 = r2.f3502
            int r0 = r0 + (-1)
            int r1 = r2.f3504
            r0 = r0 & r1
            r2.f3502 = r0
            E[] r1 = r2.f3501
            r1[r0] = r3
            int r3 = r2.f3503
            if (r0 != r3) goto L14
            r2.m5963()
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m5961(E r3) {
            r2 = this;
            E[] r0 = r2.f3501
            int r1 = r2.f3503
            r0[r1] = r3
            int r1 = r1 + 1
            int r3 = r2.f3504
            r3 = r3 & r1
            r2.f3503 = r3
            int r0 = r2.f3502
            if (r3 != r0) goto L14
            r2.m5963()
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m5962() {
            r1 = this;
            int r0 = r1.m5972()
            r1.m5971(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m5963() {
            r7 = this;
            E[] r0 = r7.f3501
            int r1 = r0.length
            int r2 = r7.f3502
            int r3 = r1 - r2
            int r4 = r1 << 1
            if (r4 < 0) goto L23
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            java.lang.System.arraycopy(r0, r2, r5, r6, r3)
            E[] r0 = r7.f3501
            int r2 = r7.f3502
            java.lang.System.arraycopy(r0, r6, r5, r3, r2)
            r7.f3501 = r5
            r7.f3502 = r6
            r7.f3503 = r1
            int r4 = r4 + (-1)
            r7.f3504 = r4
            return
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Max array capacity exceeded"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public E m5964(int r3) {
            r2 = this;
            if (r3 < 0) goto L13
            int r0 = r2.m5972()
            if (r3 >= r0) goto L13
            E[] r0 = r2.f3501
            int r1 = r2.f3502
            int r1 = r1 + r3
            int r3 = r2.f3504
            r3 = r3 & r1
            r3 = r0[r3]
            return r3
        L13:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public E m5965() {
            r2 = this;
            int r0 = r2.f3502
            int r1 = r2.f3503
            if (r0 == r1) goto Lb
            E[] r1 = r2.f3501
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public E m5966() {
            r3 = this;
            int r0 = r3.f3502
            int r1 = r3.f3503
            if (r0 == r1) goto L10
            E[] r0 = r3.f3501
            int r1 = r1 + (-1)
            int r2 = r3.f3504
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L10:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m5967() {
            r2 = this;
            int r0 = r2.f3502
            int r1 = r2.f3503
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public E m5968() {
            r4 = this;
            int r0 = r4.f3502
            int r1 = r4.f3503
            if (r0 == r1) goto L15
            E[] r1 = r4.f3501
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r0 + 1
            int r1 = r4.f3504
            r0 = r0 & r1
            r4.f3502 = r0
            return r2
        L15:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public E m5969() {
            r4 = this;
            int r0 = r4.f3502
            int r1 = r4.f3503
            if (r0 == r1) goto L15
            int r1 = r1 + (-1)
            int r0 = r4.f3504
            r0 = r0 & r1
            E[] r1 = r4.f3501
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            r4.f3503 = r0
            return r2
        L15:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m5970(int r5) {
            r4 = this;
            if (r5 > 0) goto L3
            return
        L3:
            int r0 = r4.m5972()
            if (r5 > r0) goto L3a
            int r0 = r4.f3503
            if (r5 >= r0) goto Lf
            int r0 = r0 - r5
            goto L10
        Lf:
            r0 = 0
        L10:
            r1 = r0
        L11:
            int r2 = r4.f3503
            r3 = 0
            if (r1 >= r2) goto L1d
            E[] r2 = r4.f3501
            r2[r1] = r3
            int r1 = r1 + 1
            goto L11
        L1d:
            int r0 = r2 - r0
            int r5 = r5 - r0
            int r2 = r2 - r0
            r4.f3503 = r2
            if (r5 <= 0) goto L39
            E[] r0 = r4.f3501
            int r0 = r0.length
            r4.f3503 = r0
            int r0 = r0 - r5
            r5 = r0
        L2c:
            int r1 = r4.f3503
            if (r5 >= r1) goto L37
            E[] r1 = r4.f3501
            r1[r5] = r3
            int r5 = r5 + 1
            goto L2c
        L37:
            r4.f3503 = r0
        L39:
            return
        L3a:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m5971(int r5) {
            r4 = this;
            if (r5 > 0) goto L3
            return
        L3:
            int r0 = r4.m5972()
            if (r5 > r0) goto L37
            E[] r0 = r4.f3501
            int r0 = r0.length
            int r1 = r4.f3502
            int r2 = r0 - r1
            if (r5 >= r2) goto L14
            int r0 = r1 + r5
        L14:
            r2 = 0
            if (r1 >= r0) goto L1e
            E[] r3 = r4.f3501
            r3[r1] = r2
            int r1 = r1 + 1
            goto L14
        L1e:
            int r1 = r4.f3502
            int r0 = r0 - r1
            int r5 = r5 - r0
            int r1 = r1 + r0
            int r0 = r4.f3504
            r0 = r0 & r1
            r4.f3502 = r0
            if (r5 <= 0) goto L36
            r0 = 0
        L2b:
            if (r0 >= r5) goto L34
            E[] r1 = r4.f3501
            r1[r0] = r2
            int r0 = r0 + 1
            goto L2b
        L34:
            r4.f3502 = r5
        L36:
            return
        L37:
            java.lang.ArrayIndexOutOfBoundsException r5 = new java.lang.ArrayIndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m5972() {
            r2 = this;
            int r0 = r2.f3503
            int r1 = r2.f3502
            int r0 = r0 - r1
            int r1 = r2.f3504
            r0 = r0 & r1
            return r0
    }
}
