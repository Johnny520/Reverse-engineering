package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b9 extends ۟.bb.a {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public p000.f1 f156;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ۟.b9.a f157;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final java.lang.String f158;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final java.lang.String f159;

    public static abstract class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f160;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 3
                r1.f160 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo21(p000.b3 r1);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract ۟.b9.b mo22(p000.b3 r1);
    }

    public static class b {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean f161;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String f162;

        public b(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.f161 = r2
                r0.f162 = r1
                return
        }
    }

    public b9(p000.f1 r2, com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl.a r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            int r0 = r3.f160
            r1.<init>(r0)
            r1.f156 = r2
            r1.f157 = r3
            r1.f158 = r4
            r1.f159 = r5
            return
    }

    @Override // ۟.bb.a
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void mo75() {
            r0 = this;
            return
    }

    @Override // ۟.bb.a
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void mo76(p000.b3 r4) {
            r3 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r4.m62(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L64
            r2 = 0
            if (r1 == 0) goto L15
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = r2
        L16:
            r0.close()
            ۟.b9$a r0 = r3.f157
            r0.mo21(r4)
            if (r1 != 0) goto L40
            ۟.b9$a r0 = r3.f157
            ۟.b9$b r0 = r0.mo22(r4)
            boolean r1 = r0.f161
            if (r1 == 0) goto L2b
            goto L40
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            java.lang.String r0 = r0.f162
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L40:
            r3.m80(r4)
            ۟.b9$a r4 = r3.f157
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl$a r4 = (com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl.a) r4
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl r0 = r4.f82
            java.util.List<۟.a9$a> r0 = r0.f105
            if (r0 == 0) goto L63
            int r0 = r0.size()
        L51:
            if (r2 >= r0) goto L63
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl r1 = r4.f82
            java.util.List<۟.a9$a> r1 = r1.f105
            java.lang.Object r1 = r1.get(r2)
            ۟.a9$a r1 = (۟.a9.a) r1
            r1.getClass()
            int r2 = r2 + 1
            goto L51
        L63:
            return
        L64:
            r4 = move-exception
            r0.close()
            throw r4
    }

    @Override // ۟.bb.a
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void mo77(p000.b3 r1, int r2, int r3) {
            r0 = this;
            r0.mo79(r1, r2, r3)
            return
    }

    @Override // ۟.bb.a
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void mo78(p000.b3 r7) {
            r6 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r7.m62(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Ld4
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> Ld4
            if (r1 == 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            r0.close()
            r0 = 0
            if (r1 == 0) goto L55
            ۟.i4 r1 = new ۟.i4
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r7.mo43(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L33
            java.lang.String r4 = r1.getString(r2)     // Catch: java.lang.Throwable -> L50
            goto L34
        L33:
            r4 = r0
        L34:
            r1.close()
            java.lang.String r1 = r6.f158
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L67
            java.lang.String r1 = r6.f159
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L48
            goto L67
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r7.<init>(r0)
            throw r7
        L50:
            r7 = move-exception
            r1.close()
            throw r7
        L55:
            ۟.b9$a r1 = r6.f157
            ۟.b9$b r1 = r1.mo22(r7)
            boolean r4 = r1.f161
            if (r4 == 0) goto Lbf
            ۟.b9$a r1 = r6.f157
            r1.getClass()
            r6.m80(r7)
        L67:
            ۟.b9$a r1 = r6.f157
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl$a r1 = (com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl.a) r1
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl r4 = r1.f82
            r4.f100 = r7
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl r4 = r1.f82
            ۟.k4 r4 = r4.f103
            monitor-enter(r4)
            boolean r5 = r4.f645     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L80
            java.lang.String r7 = "ROOM"
            java.lang.String r3 = "Invalidation tracker is initialized twice :/."
            android.util.Log.e(r7, r3)     // Catch: java.lang.Throwable -> Lbc
            goto L9c
        L80:
            java.lang.String r5 = "PRAGMA temp_store = MEMORY;"
            r7.mo42(r5)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = "PRAGMA recursive_triggers='ON';"
            r7.mo42(r5)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            r7.mo42(r5)     // Catch: java.lang.Throwable -> Lbc
            r4.m228(r7)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "
            ۟.eb r7 = r7.mo44(r5)     // Catch: java.lang.Throwable -> Lbc
            r4.f646 = r7     // Catch: java.lang.Throwable -> Lbc
            r4.f645 = r3     // Catch: java.lang.Throwable -> Lbc
        L9c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbc
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl r7 = r1.f82
            java.util.List<۟.a9$a> r7 = r7.f105
            if (r7 == 0) goto Lb9
            int r7 = r7.size()
        La7:
            if (r2 >= r7) goto Lb9
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl r3 = r1.f82
            java.util.List<۟.a9$a> r3 = r3.f105
            java.lang.Object r3 = r3.get(r2)
            ۟.a9$a r3 = (۟.a9.a) r3
            r3.getClass()
            int r2 = r2 + 1
            goto La7
        Lb9:
            r6.f156 = r0
            return
        Lbc:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbc
            throw r7
        Lbf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.String r1 = r1.f162
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Ld4:
            r7 = move-exception
            r0.close()
            throw r7
    }

    @Override // ۟.bb.a
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final void mo79(p000.b3 r12, int r13, int r14) {
            r11 = this;
            ۟.f1 r0 = r11.f156
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10d
            ۟.a9$b r0 = r0.f329
            r0.getClass()
            if (r13 != r14) goto L13
            java.util.List r0 = java.util.Collections.emptyList()
            goto L7a
        L13:
            if (r14 <= r13) goto L17
            r3 = r1
            goto L18
        L17:
            r3 = r2
        L18:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r13
        L1e:
            if (r3 == 0) goto L23
            if (r5 >= r14) goto L79
            goto L25
        L23:
            if (r5 <= r14) goto L79
        L25:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, ۟.t5>> r6 = r0.f110
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L35
            goto L77
        L35:
            if (r3 == 0) goto L3c
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L40
        L3c:
            java.util.Set r8 = r6.keySet()
        L40:
            java.util.Iterator r8 = r8.iterator()
        L44:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L74
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 == 0) goto L5b
            if (r9 > r14) goto L61
            if (r9 <= r5) goto L61
            goto L5f
        L5b:
            if (r9 < r14) goto L61
            if (r9 >= r5) goto L61
        L5f:
            r10 = r1
            goto L62
        L61:
            r10 = r2
        L62:
            if (r10 == 0) goto L44
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r6.get(r5)
            ۟.t5 r5 = (p000.t5) r5
            r4.add(r5)
            r6 = r1
            r5 = r9
            goto L75
        L74:
            r6 = r2
        L75:
            if (r6 != 0) goto L1e
        L77:
            r0 = r7
            goto L7a
        L79:
            r0 = r4
        L7a:
            if (r0 == 0) goto L10d
            ۟.b9$a r3 = r11.f157
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl$a r3 = (com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl.a) r3
            r3.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r4 = r12.m62(r4)
        L8e:
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L108
            if (r5 == 0) goto L9c
            java.lang.String r5 = r4.getString(r2)     // Catch: java.lang.Throwable -> L108
            r3.add(r5)     // Catch: java.lang.Throwable -> L108
            goto L8e
        L9c:
            r4.close()
            java.util.Iterator r2 = r3.iterator()
        La3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lcc
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "room_fts_content_sync_"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto La3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r12.mo42(r3)
            goto La3
        Lcc:
            java.util.Iterator r0 = r0.iterator()
        Ld0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r0.next()
            ۟.t5 r2 = (p000.t5) r2
            r2.mo14(r12)
            goto Ld0
        Le0:
            ۟.b9$a r0 = r11.f157
            ۟.b9$b r0 = r0.mo22(r12)
            boolean r2 = r0.f161
            if (r2 == 0) goto Lf3
            ۟.b9$a r0 = r11.f157
            r0.getClass()
            r11.m80(r12)
            goto L10e
        Lf3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Migration didn't properly handle: "
            java.lang.StringBuilder r13 = p000.c4.m108(r13)
            java.lang.String r14 = r0.f162
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L108:
            r12 = move-exception
            r4.close()
            throw r12
        L10d:
            r1 = r2
        L10e:
            if (r1 == 0) goto L111
            return
        L111:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = " to "
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m80(p000.b3 r4) {
            r3 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r4.mo42(r0)
            java.lang.String r0 = r3.f158
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "')"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.mo42(r0)
            return
    }
}
