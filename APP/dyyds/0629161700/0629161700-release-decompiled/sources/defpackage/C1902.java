package defpackage;

/* JADX INFO: renamed from: ᲁᛸᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1902 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C0633 f8257;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.List f8258;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.AbstractC2126 f8259;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1570 f8260;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f8261;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public boolean f8262;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.InterfaceC1645 f8263;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.InterfaceC1801 f8264;

    public native C1902(defpackage.C1570 r1, defpackage.C0640 r2, defpackage.C1863 r3);

    public C1902(defpackage.C1570 r9, defpackage.AbstractC2126 r10, defpackage.C1863 r11) {
            r8 = this;
            int r0 = r9.f6946
            ᛷᲈᲀ r1 = r9.f6938
            java.lang.String r2 = r9.f6943
            ᛲᛵᲈᛴ r3 = r9.f6942
            r8.<init>()
            r8.f8260 = r9
            r8.f8259 = r10
            java.util.List r4 = r9.f6935
            if (r4 != 0) goto L15
            ᲀᛶᲇ r4 = defpackage.C1698.f7558
        L15:
            r8.f8258 = r4
            r4 = 0
            r5 = 0
            r6 = 1
            java.lang.String r7 = ":memory:"
            if (r3 != 0) goto L47
            if (r1 == 0) goto L41
            android.content.Context r9 = r9.f6939
            ᲇᛶᲀᛸ r1 = new ᲇᛶᲀᛸ
            int r10 = r10.f9096
            r1.<init>(r8, r10)
            ᲁᛸᛴᛴ r4 = new ᲁᛸᛴᛴ
            r4.<init>(r9, r2, r1)
            r8.f8264 = r4
            ᛸᛳᛵᛷ r9 = new ᛸᛳᛵᛷ
            ᛶᲈᛱᲈ r10 = new ᛶᲈᛱᲈ
            r10.<init>(r4)
            if (r2 != 0) goto L3a
            r2 = r7
        L3a:
            r9.<init>(r10, r2, r11)
            r8.f8263 = r9
            goto Ld0
        L41:
            java.lang.String r8 = "SQLiteManager was constructed with both null driver and open helper factory!"
            defpackage.C2264.m3684(r8)
            throw r4
        L47:
            r8.f8264 = r4
            boolean r9 = r3.mo957()
            r10 = 8
            if (r9 == 0) goto L60
            ᛸᛳᛵᛷ r9 = new ᛸᛳᛵᛷ
            ᛴᛵᲇᲇ r1 = new ᛴᛵᲇᲇ
            r1.<init>(r8, r3, r10, r5)
            if (r2 != 0) goto L5b
            r2 = r7
        L5b:
            r9.<init>(r1, r2, r11)
            goto Lce
        L60:
            if (r2 != 0) goto L6e
            ᛴᛵᲇᲇ r9 = new ᛴᛵᲇᲇ
            r9.<init>(r8, r3, r10, r5)
            ᲁᛳᛱᲁ r10 = new ᲁᛳᛱᲁ
            r10.<init>(r9)
            r9 = r10
            goto Lce
        L6e:
            ᛴᛵᲇᲇ r9 = new ᛴᛵᲇᲇ
            r9.<init>(r8, r3, r10, r5)
            int r10 = defpackage.AbstractC0225.m812(r0)
            r11 = 39
            r1 = 2
            if (r10 == r6) goto L9f
            if (r10 != r1) goto L80
            r10 = 4
            goto La0
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = defpackage.AbstractC1124.m2144(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't get max number of reader for journal mode '"
            r10.<init>(r0)
            r10.append(r9)
            r10.append(r11)
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L9f:
            r10 = r6
        La0:
            int r3 = defpackage.AbstractC0225.m812(r0)
            if (r3 == r6) goto Lc8
            if (r3 != r1) goto La9
            goto Lc8
        La9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = defpackage.AbstractC1124.m2144(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't get max number of writers for journal mode '"
            r10.<init>(r0)
            r10.append(r9)
            r10.append(r11)
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lc8:
            ᲁᛳᛱᲁ r11 = new ᲁᛳᛱᲁ
            r11.<init>(r9, r2, r10)
            r9 = r11
        Lce:
            r8.f8263 = r9
        Ld0:
            r8 = 3
            if (r0 != r8) goto Ld4
            r5 = r6
        Ld4:
            if (r4 == 0) goto Ld9
            r4.setWriteAheadLoggingEnabled(r5)
        Ld9:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3331(defpackage.InterfaceC1661 r5) {
            java.lang.String r0 = "PRAGMA busy_timeout"
            ᛲᛳᲇᛱ r0 = r5.mo892(r0)
            r0.mo530()     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            defpackage.AbstractC0209.m772(r0, r3)
            r3 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1d
            java.lang.String r0 = "PRAGMA busy_timeout = 3000"
            defpackage.AbstractC1628.m2943(r5, r0)
        L1d:
            return
        L1e:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            defpackage.AbstractC0209.m772(r0, r5)
            throw r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m3332(defpackage.InterfaceC1661 r12) {
            r11 = this;
            ᲇᲁᛱᛱ r0 = r11.f8259
            java.lang.Object r1 = r0.f9097
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            java.lang.String r3 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'"
            ᛲᛳᲇᛱ r3 = r12.mo892(r3)
            boolean r4 = r3.mo530()     // Catch: java.lang.Throwable -> L22
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L25
            long r7 = r3.getLong(r6)     // Catch: java.lang.Throwable -> L22
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 == 0) goto L25
            r4 = r5
            goto L26
        L22:
            r11 = move-exception
            goto Lf4
        L25:
            r4 = r6
        L26:
            r7 = 0
            defpackage.AbstractC0209.m772(r3, r7)
            if (r4 == 0) goto L7a
            java.lang.String r2 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            ᛲᛳᲇᛱ r2 = r12.mo892(r2)
            boolean r3 = r2.mo530()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L3f
            java.lang.String r3 = r2.mo526(r6)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r11 = move-exception
            goto L74
        L3f:
            r3 = r7
        L40:
            defpackage.AbstractC0209.m772(r2, r7)
            boolean r2 = r1.equals(r3)
            if (r2 != 0) goto Lc4
            java.lang.Object r2 = r0.f9095
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L54
            goto Lc4
        L54:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r12.<init>(r0)
            r12.append(r1)
            java.lang.String r0 = ", found: "
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L74:
            throw r11     // Catch: java.lang.Throwable -> L75
        L75:
            r12 = move-exception
            defpackage.AbstractC0209.m772(r2, r11)
            throw r12
        L7a:
            java.lang.String r1 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.AbstractC1628.m2943(r12, r1)
            ᲁᲁᛴᲇ r1 = r0.mo1892(r12)     // Catch: java.lang.Throwable -> L90
            boolean r3 = r1.f8365     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L92
            r0.mo1890()     // Catch: java.lang.Throwable -> L90
            r11.m3336(r12)     // Catch: java.lang.Throwable -> L90
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L90
            goto Lb2
        L90:
            r1 = move-exception
            goto Lac
        L92:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r1.f8366     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L90
            r4.append(r1)     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L90
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L90
            throw r3     // Catch: java.lang.Throwable -> L90
        Lac:
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r1)
            r1 = r2
        Lb2:
            boolean r2 = r1 instanceof defpackage.C0723
            if (r2 != 0) goto Lbe
            r2 = r1
            ᲁᲀᛱᲁ r2 = (defpackage.C1907) r2
            java.lang.String r2 = "END TRANSACTION"
            defpackage.AbstractC1628.m2943(r12, r2)
        Lbe:
            java.lang.Throwable r1 = defpackage.C2165.m3569(r1)
            if (r1 != 0) goto Lee
        Lc4:
            r0.mo1891(r12)
            java.util.List r0 = r11.f8258
            java.util.Iterator r0 = r0.iterator()
        Lcd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Leb
            java.lang.Object r1 = r0.next()
            ᲀᛴᲈᲀ r1 = (defpackage.C1667) r1
            r1.getClass()
            boolean r2 = r12 instanceof defpackage.C0260
            if (r2 == 0) goto Lcd
            r2 = r12
            ᛲᛳᛲᛸ r2 = (defpackage.C0260) r2
            ᛴᛲᲈᲀ r2 = r2.f1513
            ᲈᲈᛸᲁ r1 = r1.f7448
            r1.mo617(r2)
            goto Lcd
        Leb:
            r11.f8261 = r5
            return
        Lee:
            java.lang.String r11 = "ROLLBACK TRANSACTION"
            defpackage.AbstractC1628.m2943(r12, r11)
            throw r1
        Lf4:
            throw r11     // Catch: java.lang.Throwable -> Lf5
        Lf5:
            r12 = move-exception
            defpackage.AbstractC0209.m772(r3, r11)
            throw r12
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3333(defpackage.InterfaceC1661 r7, int r8, int r9) {
            r6 = this;
            ᛸᲁᛶᛸ r0 = r6.f8260
            ᛳᛴᛱᲀ r1 = r0.f6937
            java.util.List r1 = defpackage.AbstractC0498.m1281(r1, r8, r9)
            ᲇᲁᛱᛱ r2 = r6.f8259
            if (r1 == 0) goto Lc6
            r2.mo1889(r7)
            java.util.Iterator r8 = r1.iterator()
        L13:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9b
            java.lang.Object r9 = r8.next()
            ᛳᲈᛴ r9 = (defpackage.C0589) r9
            r9.getClass()
            boolean r0 = r7 instanceof defpackage.C0260
            if (r0 == 0) goto L93
            r0 = r7
            ᛲᛳᛲᛸ r0 = (defpackage.C0260) r0
            ᛴᛲᲈᲀ r0 = r0.f1513
            int r9 = r9.f2956
            switch(r9) {
                case 0: goto L72;
                case 1: goto L5d;
                default: goto L30;
            }
        L30:
            r3 = -1074828735323694(0xfffc2e72ef0961d2, double:NaN)
            r3 = -1074841620225582(0xfffc2e6fef0961d2, double:NaN)
            java.lang.String r9 = "ALTER TABLE ward_items ADD COLUMN type TEXT DEFAULT NULL"
            r0.m1466(r9)
            r3 = -1075086433361454(0xfffc2e36ef0961d2, double:NaN)
            java.lang.String r9 = "UPDATE ward_items SET type = 'video' WHERE cid = '-1'"
            r0.m1466(r9)
            r3 = -1075318361595438(0xfffc2e00ef0961d2, double:NaN)
            java.lang.String r9 = "UPDATE ward_items SET type = 'comment' WHERE cid != '-1'"
            r0.m1466(r9)
            goto L13
        L5d:
            r3 = -12717682761262(0xfffff46eef0961d2, double:NaN)
            r3 = -12730567663150(0xfffff46bef0961d2, double:NaN)
            java.lang.String r9 = "ALTER TABLE ward_items ADD COLUMN authorUid TEXT DEFAULT NULL"
            r0.m1466(r9)
            goto L13
        L72:
            r3 = -1134932507663918(0xfffbf7c8ef0961d2, double:NaN)
            r3 = -1134945392565806(0xfffbf7c5ef0961d2, double:NaN)
            java.lang.String r9 = "ALTER TABLE ward_items ADD COLUMN authorName TEXT DEFAULT NULL"
            r0.m1466(r9)
            r3 = -1135215975505454(0xfffbf786ef0961d2, double:NaN)
            java.lang.String r9 = "ALTER TABLE ward_items ADD COLUMN authorAvatar TEXT DEFAULT NULL"
            r0.m1466(r9)
            goto L13
        L93:
            ᛱᛶᲀᲇ r6 = new ᛱᛶᲀᲇ
            java.lang.String r7 = "Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function."
            r6.<init>(r7)
            throw r6
        L9b:
            ᲁᲁᛴᲇ r8 = r2.mo1892(r7)
            boolean r9 = r8.f8365
            if (r9 == 0) goto Laa
            r2.mo1890()
            r6.m3336(r7)
            return
        Laa:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.Object r7 = r8.f8366
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Migration didn't properly handle: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        Lc6:
            r1 = 1
            r3 = 0
            if (r8 <= r9) goto Lcf
            boolean r4 = r0.f6932
            if (r4 == 0) goto Lcf
            goto Le3
        Lcf:
            java.util.Set r4 = r0.f6936
            boolean r5 = r0.f6931
            if (r5 == 0) goto Le3
            if (r4 == 0) goto Le1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto Le3
        Le1:
            r4 = r1
            goto Le4
        Le3:
            r4 = r3
        Le4:
            if (r4 != 0) goto L1a4
            boolean r8 = r0.f6945
            if (r8 == 0) goto L187
            java.lang.String r8 = "SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"
            ᛲᛳᲇᛱ r8 = r7.mo892(r8)
            ᛱᲇᲀᛲ r9 = defpackage.AbstractC0425.m1189()     // Catch: java.lang.Throwable -> L126
        Lf4:
            boolean r0 = r8.mo530()     // Catch: java.lang.Throwable -> L126
            if (r0 == 0) goto L128
            java.lang.String r0 = r8.mo526(r3)     // Catch: java.lang.Throwable -> L126
            java.lang.String r4 = "sqlite_"
            boolean r4 = r0.startsWith(r4)     // Catch: java.lang.Throwable -> L126
            if (r4 != 0) goto Lf4
            java.lang.String r4 = "android_metadata"
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L126
            if (r4 == 0) goto L10f
            goto Lf4
        L10f:
            java.lang.String r4 = r8.mo526(r1)     // Catch: java.lang.Throwable -> L126
            java.lang.String r5 = "view"
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)     // Catch: java.lang.Throwable -> L126
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L126
            kotlin.Pair r5 = new kotlin.Pair     // Catch: java.lang.Throwable -> L126
            r5.<init>(r0, r4)     // Catch: java.lang.Throwable -> L126
            r9.add(r5)     // Catch: java.lang.Throwable -> L126
            goto Lf4
        L126:
            r6 = move-exception
            goto L181
        L128:
            ᛱᲇᲀᛲ r9 = defpackage.AbstractC0425.m1197(r9)     // Catch: java.lang.Throwable -> L126
            r0 = 0
            defpackage.AbstractC0209.m772(r8, r0)
            java.util.ListIterator r8 = r9.listIterator(r3)
        L134:
            r9 = r8
            ᛸᛱᛳᛵ r9 = (defpackage.C1415) r9
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L18a
            java.lang.Object r9 = r9.next()
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r0 = r9.component1()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r9.component2()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r1 = 96
            if (r9 == 0) goto L16c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP VIEW IF EXISTS `"
            r9.<init>(r3)
            r9.append(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            defpackage.AbstractC1628.m2943(r7, r9)
            goto L134
        L16c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r3 = "DROP TABLE IF EXISTS `"
            r9.<init>(r3)
            r9.append(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            defpackage.AbstractC1628.m2943(r7, r9)
            goto L134
        L181:
            throw r6     // Catch: java.lang.Throwable -> L182
        L182:
            r7 = move-exception
            defpackage.AbstractC0209.m772(r8, r6)
            throw r7
        L187:
            r2.mo1893(r7)
        L18a:
            java.util.List r6 = r6.f8258
            java.util.Iterator r6 = r6.iterator()
        L190:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L1a0
            java.lang.Object r8 = r6.next()
            ᲀᛴᲈᲀ r8 = (defpackage.C1667) r8
            r8.getClass()
            goto L190
        L1a0:
            r2.mo1894(r7)
            return
        L1a4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "A migration from "
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = " to "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3334(defpackage.InterfaceC1661 r8) {
            r7 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            ᛲᛳᲇᛱ r0 = r8.mo892(r0)
            boolean r1 = r0.mo530()     // Catch: java.lang.Throwable -> L19
            r2 = 0
            if (r1 == 0) goto L1b
            long r3 = r0.getLong(r2)     // Catch: java.lang.Throwable -> L19
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L1b
            r2 = 1
            goto L1b
        L19:
            r7 = move-exception
            goto L68
        L1b:
            r1 = 0
            defpackage.AbstractC0209.m772(r0, r1)
            ᲇᲁᛱᛱ r0 = r7.f8259
            r0.mo1894(r8)
            if (r2 != 0) goto L4b
            ᲁᲁᛴᲇ r1 = r0.mo1892(r8)
            boolean r2 = r1.f8365
            if (r2 == 0) goto L2f
            goto L4b
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.Object r8 = r1.f8366
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L4b:
            r7.m3336(r8)
            r0.mo1895()
            java.util.List r7 = r7.f8258
            java.util.Iterator r7 = r7.iterator()
        L57:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L67
            java.lang.Object r8 = r7.next()
            ᲀᛴᲈᲀ r8 = (defpackage.C1667) r8
            r8.getClass()
            goto L57
        L67:
            return
        L68:
            throw r7     // Catch: java.lang.Throwable -> L69
        L69:
            r8 = move-exception
            defpackage.AbstractC0209.m772(r0, r7)
            throw r8
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3335(defpackage.InterfaceC1661 r6) {
            r5 = this;
            ᲇᲁᛱᛱ r0 = r5.f8259
            int r0 = r0.f9096
            java.lang.String r1 = "PRAGMA user_version = "
            m3331(r6)
            ᛸᲁᛶᛸ r2 = r5.f8260
            int r3 = r2.f6946
            r4 = 3
            if (r3 != r4) goto L16
            java.lang.String r3 = "PRAGMA journal_mode = WAL"
            defpackage.AbstractC1628.m2943(r6, r3)
            goto L1b
        L16:
            java.lang.String r3 = "PRAGMA journal_mode = TRUNCATE"
            defpackage.AbstractC1628.m2943(r6, r3)
        L1b:
            int r2 = r2.f6946
            if (r2 != r4) goto L25
            java.lang.String r2 = "PRAGMA synchronous = NORMAL"
            defpackage.AbstractC1628.m2943(r6, r2)
            goto L2a
        L25:
            java.lang.String r2 = "PRAGMA synchronous = FULL"
            defpackage.AbstractC1628.m2943(r6, r2)
        L2a:
            java.lang.String r2 = "PRAGMA user_version"
            ᛲᛳᲇᛱ r2 = r6.mo892(r2)
            r2.mo530()     // Catch: java.lang.Throwable -> L84
            r3 = 0
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> L84
            int r3 = (int) r3
            r4 = 0
            defpackage.AbstractC0209.m772(r2, r4)
            if (r3 == r0) goto L80
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r2)
            if (r3 != 0) goto L4c
            r5.m3334(r6)     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            goto L61
        L4c:
            r5.m3333(r6, r3, r0)     // Catch: java.lang.Throwable -> L4a
        L4f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            r2.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4a
            defpackage.AbstractC1628.m2943(r6, r0)     // Catch: java.lang.Throwable -> L4a
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L4a
            goto L67
        L61:
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r0)
            r0 = r1
        L67:
            boolean r1 = r0 instanceof defpackage.C0723
            if (r1 != 0) goto L73
            r1 = r0
            ᲁᲀᛱᲁ r1 = (defpackage.C1907) r1
            java.lang.String r1 = "END TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r1)
        L73:
            java.lang.Throwable r0 = defpackage.C2165.m3569(r0)
            if (r0 != 0) goto L7a
            goto L80
        L7a:
            java.lang.String r5 = "ROLLBACK TRANSACTION"
            defpackage.AbstractC1628.m2943(r6, r5)
            throw r0
        L80:
            r5.m3332(r6)
            return
        L84:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L86
        L86:
            r6 = move-exception
            defpackage.AbstractC0209.m772(r2, r5)
            throw r6
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m3336(defpackage.InterfaceC1661 r3) {
            r2 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            defpackage.AbstractC1628.m2943(r3, r0)
            ᲇᲁᛱᛱ r2 = r2.f8259
            java.lang.Object r2 = r2.f9097
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "')"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            defpackage.AbstractC1628.m2943(r3, r2)
            return
    }
}
