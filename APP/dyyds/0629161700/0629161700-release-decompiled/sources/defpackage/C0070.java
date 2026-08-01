package defpackage;

/* JADX INFO: renamed from: ᛱᛴᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0070 extends defpackage.AbstractC1359 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f777;

    public C0070(defpackage.C0633 r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f777 = r3
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            r0 = 1
            r1.f5945 = r0
            return
    }

    @Override // defpackage.InterfaceC0270
    public final int getColumnCount() {
            r0 = this;
            r0.m2534()
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0270
    public final java.lang.String getColumnName(int r1) {
            r0 = this;
            r0.m2534()
            r0 = 21
            java.lang.String r1 = "no row"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0270
    public final long getLong(int r1) {
            r0 = this;
            r0.m2534()
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
            r0 = 21
            java.lang.String r1 = "no row"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.String mo526(int r1) {
            r0 = this;
            r0.m2534()
            r0 = 21
            java.lang.String r1 = "no row"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final void mo527(int r1, java.lang.String r2) {
            r0 = this;
            r0.m2534()
            r0 = 25
            java.lang.String r1 = "column index out of range"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo528(long r1, int r3) {
            r0 = this;
            r0.m2534()
            r0 = 25
            java.lang.String r1 = "column index out of range"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo529(int r1) {
            r0 = this;
            r0.m2534()
            r0 = 25
            java.lang.String r1 = "column index out of range"
            defpackage.AbstractC1628.m2954(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public final boolean mo530() {
            r6 = this;
            int r0 = r6.f777
            int r0 = defpackage.AbstractC0225.m812(r0)
            r1 = 0
            ᛴᛲᲈᲀ r6 = r6.f5947
            if (r0 == 0) goto L68
            r2 = 1
            if (r0 == r2) goto L64
            r2 = 2
            if (r0 == r2) goto L60
            r2 = 3
            if (r0 == r2) goto L5c
            r2 = 4
            if (r0 != r2) goto L56
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            android.database.sqlite.SQLiteDatabase r2 = r6.f3141
            ᛲᛴᛱᛵ r3 = defpackage.C0633.f3140
            java.lang.Object r4 = r3.getValue()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L52
            ᛲᛴᛱᛵ r4 = defpackage.C0633.f3138
            java.lang.Object r5 = r4.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L52
            java.lang.Object r6 = r3.getValue()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Object r3 = r4.getValue()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r4 = 0
            java.lang.Object r2 = r3.invoke(r2, r4)
            if (r2 == 0) goto L4c
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4, r0, r4}
            r6.invoke(r2, r0)
            goto L6e
        L4c:
            java.lang.String r6 = "Required value was null."
            defpackage.C2264.m3676(r6)
            goto L6e
        L52:
            r6.m1469()
            goto L6e
        L56:
            ᛸᛵᛳᲀ r6 = new ᛸᛵᛳᲀ
            r6.<init>()
            throw r6
        L5c:
            r6.m1471()
            goto L6e
        L60:
            r6.m1469()
            goto L6e
        L64:
            r6.m1468()
            goto L6e
        L68:
            r6.m1467()
            r6.m1468()
        L6e:
            return r1
    }
}
