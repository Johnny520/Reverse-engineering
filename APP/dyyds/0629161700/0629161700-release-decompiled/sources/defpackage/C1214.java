package defpackage;

/* JADX INFO: renamed from: ᛷᛱᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1214 extends defpackage.AbstractC1359 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f5460;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.AutoCloseable f5461;

    public C1214(defpackage.C0633 r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.f5460 = r0
            r1.<init>(r2, r3)
            ᛵᛲᲁᛵ r0 = new ᛵᛲᲁᛵ
            android.database.sqlite.SQLiteDatabase r2 = r2.f3141
            android.database.sqlite.SQLiteStatement r2 = r2.compileStatement(r3)
            r0.<init>(r2)
            r1.f5461 = r0
            return
    }

    public C1214(defpackage.C0633 r2, java.lang.String r3, defpackage.C1351 r4) {
            r1 = this;
            r0 = 0
            r1.f5460 = r0
            r1.<init>(r2, r3)
            r1.f5461 = r4
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            int r0 = r2.f5460
            java.lang.AutoCloseable r1 = r2.f5461
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            ᛵᛲᲁᛵ r1 = (defpackage.C0841) r1
            r1.close()
            r0 = 1
            r2.f5945 = r0
            return
        L10:
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            r1.close()
            return
    }

    @Override // defpackage.InterfaceC0270
    public final int getColumnCount() {
            r1 = this;
            int r0 = r1.f5460
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            r1.m2534()
            r1 = 0
            return r1
        La:
            java.lang.AutoCloseable r1 = r1.f5461
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            int r1 = r1.getColumnCount()
            return r1
    }

    @Override // defpackage.InterfaceC0270
    public final java.lang.String getColumnName(int r2) {
            r1 = this;
            int r0 = r1.f5460
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1.m2534()
            r1 = 21
            java.lang.String r2 = "no row"
            defpackage.AbstractC1628.m2954(r1, r2)
            r1 = 0
            throw r1
        L11:
            java.lang.AutoCloseable r1 = r1.f5461
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            java.lang.String r1 = r1.getColumnName(r2)
            return r1
    }

    @Override // defpackage.InterfaceC0270
    public final long getLong(int r2) {
            r1 = this;
            int r0 = r1.f5460
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1.m2534()
            r1 = 21
            java.lang.String r2 = "no row"
            defpackage.AbstractC1628.m2954(r1, r2)
            r1 = 0
            throw r1
        L11:
            java.lang.AutoCloseable r1 = r1.f5461
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            long r1 = r1.getLong(r2)
            return r1
    }

    @Override // defpackage.InterfaceC0270
    public final boolean isNull(int r2) {
            r1 = this;
            int r0 = r1.f5460
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1.m2534()
            r1 = 21
            java.lang.String r2 = "no row"
            defpackage.AbstractC1628.m2954(r1, r2)
            r1 = 0
            throw r1
        L11:
            java.lang.AutoCloseable r1 = r1.f5461
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            boolean r1 = r1.isNull(r2)
            return r1
    }

    @Override // defpackage.AbstractC1359, defpackage.InterfaceC0270
    public void reset() {
            r1 = this;
            int r0 = r1.f5460
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.reset()
            return
        L9:
            java.lang.AutoCloseable r1 = r1.f5461
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            r1.reset()
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.String mo526(int r2) {
            r1 = this;
            int r0 = r1.f5460
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1.m2534()
            r1 = 21
            java.lang.String r2 = "no row"
            defpackage.AbstractC1628.m2954(r1, r2)
            r1 = 0
            throw r1
        L11:
            java.lang.AutoCloseable r1 = r1.f5461
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            java.lang.String r1 = r1.mo526(r2)
            return r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ */
    public final void mo527(int r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.f5460
            java.lang.AutoCloseable r1 = r2.f5461
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            r2.m2534()
            ᛵᛲᲁᛵ r1 = (defpackage.C0841) r1
            r1.mo1286(r3, r4)
            return
        L10:
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            r1.mo527(r3, r4)
            return
    }

    @Override // defpackage.AbstractC1359, defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo894() {
            r2 = this;
            int r0 = r2.f5460
            java.lang.AutoCloseable r1 = r2.f5461
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            r2.m2534()
            ᛵᛲᲁᛵ r1 = (defpackage.C0841) r1
            r1.mo1283()
            return
        L10:
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            r1.mo894()
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛷᛷᲀᛴ */
    public boolean mo895() {
            r1 = this;
            int r0 = r1.f5460
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.mo895()
            return r1
        La:
            java.lang.AutoCloseable r1 = r1.f5461
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            boolean r1 = r1.mo895()
            return r1
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo528(long r3, int r5) {
            r2 = this;
            int r0 = r2.f5460
            java.lang.AutoCloseable r1 = r2.f5461
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            r2.m2534()
            ᛵᛲᲁᛵ r1 = (defpackage.C0841) r1
            r1.mo1285(r3, r5)
            return
        L10:
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            r1.mo528(r3, r5)
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo529(int r3) {
            r2 = this;
            int r0 = r2.f5460
            java.lang.AutoCloseable r1 = r2.f5461
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            r2.m2534()
            ᛵᛲᲁᛵ r1 = (defpackage.C0841) r1
            r1.mo1288(r3)
            return
        L10:
            ᛷᲀᛵ r1 = (defpackage.C1351) r1
            r1.mo529(r3)
            return
    }

    @Override // defpackage.InterfaceC0270
    /* JADX INFO: renamed from: ᲈᛵᲀᛱ */
    public final boolean mo530() {
            r3 = this;
            int r0 = r3.f5460
            r1 = 0
            java.lang.AutoCloseable r2 = r3.f5461
            switch(r0) {
                case 0: goto L13;
                default: goto L8;
            }
        L8:
            r3.m2534()
            ᛵᛲᲁᛵ r2 = (defpackage.C0841) r2
            android.database.sqlite.SQLiteStatement r3 = r2.f3865
            r3.execute()
            return r1
        L13:
            ᛷᲀᛵ r2 = (defpackage.C1351) r2
            boolean r0 = r2.mo530()
            java.lang.String r1 = r2.mo526(r1)
            java.lang.String r2 = "wal"
            boolean r1 = r1.equalsIgnoreCase(r2)
            ᛴᛲᲈᲀ r3 = r3.f5947
            if (r1 == 0) goto L2d
            android.database.sqlite.SQLiteDatabase r3 = r3.f3141
            r3.enableWriteAheadLogging()
            goto L32
        L2d:
            android.database.sqlite.SQLiteDatabase r3 = r3.f3141
            r3.disableWriteAheadLogging()
        L32:
            return r0
    }
}
