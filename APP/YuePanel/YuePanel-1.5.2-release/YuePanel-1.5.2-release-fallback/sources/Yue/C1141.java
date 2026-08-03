package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1141 extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f3515 = 1073741824;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f3516 = 256;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f3517;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f3518;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f3519;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f3520;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f3521;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f3522;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.lang.Object[] f3523;

    public C1141() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r0)
            return
    }

    public C1141(int r2) {
            r1 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            r1.<init>(r2, r0)
            return
    }

    public C1141(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f3517 = r0
            r2.f3518 = r0
            r2.f3519 = r0
            if (r3 > r4) goto L3a
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 > r0) goto L32
            r0 = 1
            r2.f3520 = r0
        L13:
            int r1 = r2.f3520
            if (r1 >= r3) goto L1c
            int r1 = r1 << 1
            r2.f3520 = r1
            goto L13
        L1c:
            r2.f3521 = r0
        L1e:
            int r3 = r2.f3521
            if (r3 >= r4) goto L27
            int r3 = r3 << 1
            r2.f3521 = r3
            goto L1e
        L27:
            int r3 = r2.f3520
            int r4 = r3 + (-1)
            r2.f3522 = r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f3523 = r3
            return
        L32:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Maximum capacity greater than allowed"
            r3.<init>(r4)
            throw r3
        L3a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Capacity greater than maximum"
            r3.<init>(r4)
            throw r3
    }

    public C1141(Yue.C1141 r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f3517 = r0
            r3.f3518 = r0
            r3.f3519 = r0
            int r1 = r4.f3517
            r3.f3517 = r1
            int r1 = r4.f3518
            r3.f3518 = r1
            int r1 = r4.f3519
            r3.f3519 = r1
            int r1 = r4.f3520
            r3.f3520 = r1
            int r1 = r4.f3521
            r3.f3521 = r1
            int r1 = r4.f3522
            r3.f3522 = r1
            java.lang.Object[] r1 = r4.f3523
            int r1 = r1.length
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3.f3523 = r1
            java.lang.Object[] r4 = r4.f3523
            int r2 = r1.length
            java.lang.System.arraycopy(r4, r0, r1, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ int m5990(Yue.C1141 r0) {
            int r0 = r0.f3519
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ int m5991(Yue.C1141 r0) {
            int r0 = r0.f3518
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m5992(Yue.C1141 r0) {
            int r0 = r0.f3517
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object[] m5993(Yue.C1141 r0) {
            java.lang.Object[] r0 = r0.f3523
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m5994(Yue.C1141 r0) {
            int r0 = r0.f3522
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f3517
            int r1 = r3.f3520
            if (r0 != r1) goto Le
            boolean r0 = r3.m5996()
            if (r0 != 0) goto Le
            r4 = 0
            return r4
        Le:
            int r0 = r3.f3517
            r1 = 1
            int r0 = r0 + r1
            r3.f3517 = r0
            java.lang.Object[] r0 = r3.f3523
            int r2 = r3.f3518
            r0[r2] = r4
            int r2 = r2 + r1
            int r4 = r3.f3522
            r4 = r4 & r2
            r3.f3518 = r4
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.Object[] r0 = r2.f3523
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r2.f3517 = r0
            r2.f3518 = r0
            r2.f3519 = r0
            return
    }

    public java.lang.Object clone() {
            r1 = this;
            Yue.ۥ۟ۤۦۨ r0 = new Yue.ۥ۟ۤۦۨ
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f3517
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
            r1 = this;
            Yue.ۥ۟ۤۦۧ r0 = new Yue.ۥ۟ۤۦۧ
            r0.<init>(r1)
            return r0
    }

    public java.lang.Object peek() {
            r2 = this;
            int r0 = r2.f3517
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object[] r0 = r2.f3523
            int r1 = r2.f3519
            r0 = r0[r1]
            return r0
    }

    public java.lang.Object remove() {
            r4 = this;
            int r0 = r4.f3517
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0 + (-1)
            r4.f3517 = r0
            java.lang.Object[] r0 = r4.f3523
            int r2 = r4.f3519
            r3 = r0[r2]
            r0[r2] = r1
            int r2 = r2 + 1
            int r0 = r4.f3522
            r0 = r0 & r2
            r4.f3519 = r0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r1 = this;
            int r0 = r1.f3517
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = super.toString()
            r1.append(r2)
            java.lang.String r2 = " - capacity: '"
            r1.append(r2)
            int r2 = r5.m5995()
            r1.append(r2)
            java.lang.String r2 = "' size: '"
            r1.append(r2)
            int r2 = r5.size()
            r1.append(r2)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int r1 = r5.f3517
            if (r1 <= 0) goto L5e
            java.lang.String r1 = " elements:"
            r0.append(r1)
            r1 = 0
        L3c:
            int r2 = r5.f3517
            if (r1 >= r2) goto L5e
            r2 = 10
            r0.append(r2)
            r2 = 9
            r0.append(r2)
            java.lang.Object[] r2 = r5.f3523
            int r3 = r5.f3519
            int r3 = r3 + r1
            int r4 = r5.f3522
            r3 = r3 & r4
            r2 = r2[r3]
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L3c
        L5e:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m5995() {
            r1 = this;
            int r0 = r1.f3520
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m5996() {
            r6 = this;
            int r0 = r6.f3520
            int r1 = r6.f3521
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            java.lang.Object[] r1 = r6.f3523
            int r3 = r0 + r0
            r6.f3520 = r3
            int r4 = r3 + (-1)
            r6.f3522 = r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6.f3523 = r3
            int r4 = r6.f3519
            int r5 = r0 - r4
            java.lang.System.arraycopy(r1, r4, r3, r2, r5)
            int r3 = r6.f3519
            if (r3 == 0) goto L27
            java.lang.Object[] r4 = r6.f3523
            int r0 = r0 - r3
            java.lang.System.arraycopy(r1, r2, r4, r0, r3)
        L27:
            r6.f3519 = r2
            int r0 = r6.f3517
            r6.f3518 = r0
            r0 = 1
            return r0
    }
}
