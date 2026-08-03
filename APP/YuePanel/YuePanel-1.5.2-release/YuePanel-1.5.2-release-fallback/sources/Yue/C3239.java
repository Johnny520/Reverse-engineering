package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3239<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f10597;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final T f10598;

    public C3239(int r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.f10597 = r1
            r0.f10598 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C3239 m13658(Yue.C3239 r0, int r1, java.lang.Object r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            int r1 = r0.f10597
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            T r2 = r0.f10598
        Lc:
            Yue.ۥ۠ۥۡۤ r0 = r0.m13661(r1, r2)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C3239
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۠ۥۡۤ r5 = (Yue.C3239) r5
            int r1 = r4.f10597
            int r3 = r5.f10597
            if (r1 == r3) goto L13
            return r2
        L13:
            T r1 = r4.f10598
            T r5 = r5.f10598
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f10597
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            T r1 = r2.f10598
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IndexedValue(index="
            r0.append(r1)
            int r1 = r2.f10597
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            T r1 = r2.f10598
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int m13659() {
            r1 = this;
            int r0 = r1.f10597
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final T m13660() {
            r1 = this;
            T r0 = r1.f10598
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C3239<T> m13661(int r2, T r3) {
            r1 = this;
            Yue.ۥ۠ۥۡۤ r0 = new Yue.ۥ۠ۥۡۤ
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m13662() {
            r1 = this;
            int r0 = r1.f10597
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final T m13663() {
            r1 = this;
            T r0 = r1.f10598
            return r0
    }
}
