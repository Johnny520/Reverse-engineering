package defpackage;

/* JADX INFO: renamed from: ᛷᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1351 extends defpackage.AbstractC1359 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public double[] f5929;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.database.Cursor f5930;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.String[] f5931;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public byte[][] f5932;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int[] f5933;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public long[] f5934;

    public C1351(defpackage.C0633 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            int[] r2 = new int[r1]
            r0.f5933 = r2
            long[] r2 = new long[r1]
            r0.f5934 = r2
            double[] r2 = new double[r1]
            r0.f5929 = r2
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.f5931 = r2
            byte[][] r1 = new byte[r1][]
            r0.f5932 = r1
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static void m2527(android.database.Cursor r0, int r1) {
            if (r1 < 0) goto L9
            int r0 = r0.getColumnCount()
            if (r1 >= r0) goto L9
            return
        L9:
            r0 = 25
            java.lang.String r1 = "column index out of range"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f5945
            if (r0 != 0) goto La
            r1.mo894()
            r1.reset()
        La:
            r0 = 1
            r1.f5945 = r0
            return
    }

    @Override // defpackage.InterfaceC0270
    public final int getColumnCount() {
            r0 = this;
            r0.m2534()
            r0.m2528()
            android.database.Cursor r0 = r0.f5930
            if (r0 == 0) goto Lf
            int r0 = r0.getColumnCount()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0270
    public final java.lang.String getColumnName(int r1) {
            r0 = this;
            r0.m2534()
            r0.m2528()
            android.database.Cursor r0 = r0.f5930
            if (r0 == 0) goto L12
            m2527(r0, r1)
            java.lang.String r0 = r0.getColumnName(r1)
            return r0
        L12:
            java.lang.String r0 = "Required value was null."
            defpackage.C2264.m3676(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0270
    public final long getLong(int r1) {
            r0 = this;
            r0.m2534()
            android.database.Cursor r0 = r0.f5930
            if (r0 == 0) goto Lf
            m2527(r0, r1)
            long r0 = r0.getLong(r1)
            return r0
        Lf:
            r0 = 21
            java.lang.String r1 = "no row"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0270
    public final boolean isNull(int r1) {
            r0 = this;
            r0.m2534()
            android.database.Cursor r0 = r0.f5930
            if (r0 == 0) goto Lf
            m2527(r0, r1)
            boolean r0 = r0.isNull(r1)
            return r0
        Lf:
            r0 = 21
            java.lang.String r1 = "no row"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.AbstractC1359, defpackage.InterfaceC0270
    public final void reset() {
            r1 = this;
            r1.m2534()
            android.database.Cursor r0 = r1.f5930
            if (r0 == 0) goto La
            r0.close()
        La:
            r0 = 0
            r1.f5930 = r0
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.String mo526(int r1) {
            r0 = this;
            r0.m2534()
            android.database.Cursor r0 = r0.f5930
            if (r0 == 0) goto Lf
            m2527(r0, r1)
            java.lang.String r0 = r0.getString(r1)
            return r0
        Lf:
            r0 = 21
            java.lang.String r1 = "no row"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m2528() {
            r5 = this;
            android.database.Cursor r0 = r5.f5930
            if (r0 != 0) goto L29
            ᛶᲈᛱᲈ r0 = new ᛶᲈᛱᲈ
            r0.<init>(r5)
            ᛴᛲᲈᲀ r1 = r5.f5947
            r1.getClass()
            ᲀᲈᛶᛶ r2 = new ᲀᲈᛶᛶ
            r2.<init>(r0)
            android.database.sqlite.SQLiteDatabase r1 = r1.f3141
            ᛳᛲᛷᲈ r3 = new ᛳᛲᛷᲈ
            r3.<init>(r2)
            java.lang.Object r0 = r0.f5356
            ᛷᲀᛵ r0 = (defpackage.C1351) r0
            java.lang.String r0 = r0.f5946
            java.lang.String[] r2 = defpackage.C0633.f3139
            r4 = 0
            android.database.Cursor r0 = r1.rawQueryWithFactory(r3, r0, r2, r4)
            r5.f5930 = r0
        L29:
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ */
    public final void mo527(int r3, java.lang.String r4) {
            r2 = this;
            r2.m2534()
            r0 = 3
            r2.m2529(r0, r3)
            int[] r1 = r2.f5933
            r1[r3] = r0
            java.lang.String[] r2 = r2.f5931
            r2[r3] = r4
            return
    }

    @Override // defpackage.AbstractC1359, defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo894() {
            r2 = this;
            r2.m2534()
            r0 = 0
            int[] r1 = new int[r0]
            r2.f5933 = r1
            long[] r1 = new long[r0]
            r2.f5934 = r1
            double[] r1 = new double[r0]
            r2.f5929 = r1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.f5931 = r1
            byte[][] r0 = new byte[r0][]
            r2.f5932 = r0
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo528(long r3, int r5) {
            r2 = this;
            r2.m2534()
            r0 = 1
            r2.m2529(r0, r5)
            int[] r1 = r2.f5933
            r1[r5] = r0
            long[] r2 = r2.f5934
            r2[r5] = r3
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo529(int r2) {
            r1 = this;
            r1.m2534()
            r0 = 5
            r1.m2529(r0, r2)
            int[] r1 = r1.f5933
            r1[r2] = r0
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲈᛵᲀᛱ */
    public final boolean mo530() {
            r0 = this;
            r0.m2534()
            r0.m2528()
            android.database.Cursor r0 = r0.f5930
            if (r0 == 0) goto Lf
            boolean r0 = r0.moveToNext()
            return r0
        Lf:
            java.lang.String r0 = "Required value was null."
            defpackage.C2264.m3676(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2529(int r4, int r5) {
            r3 = this;
            r0 = 1
            int r5 = r5 + r0
            int[] r1 = r3.f5933
            int r2 = r1.length
            if (r2 >= r5) goto Ld
            int[] r1 = java.util.Arrays.copyOf(r1, r5)
            r3.f5933 = r1
        Ld:
            if (r4 == r0) goto L41
            r0 = 2
            if (r4 == r0) goto L35
            r0 = 3
            if (r4 == r0) goto L27
            r0 = 4
            if (r4 == r0) goto L19
            goto L4c
        L19:
            byte[][] r4 = r3.f5932
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            byte[][] r4 = (byte[][]) r4
            r3.f5932 = r4
            return
        L27:
            java.lang.String[] r4 = r3.f5931
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.f5931 = r4
            return
        L35:
            double[] r4 = r3.f5929
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            double[] r4 = java.util.Arrays.copyOf(r4, r5)
            r3.f5929 = r4
            return
        L41:
            long[] r4 = r3.f5934
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            long[] r4 = java.util.Arrays.copyOf(r4, r5)
            r3.f5934 = r4
        L4c:
            return
    }
}
