package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k4 {

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final java.lang.String[] f640 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.HashMap<java.lang.String, java.lang.Integer> f641;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String[] f642;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final p000.a9 f643;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public java.util.concurrent.atomic.AtomicBoolean f644;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public volatile boolean f645;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public volatile p000.eb f646;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final ۟.k4.b f647;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    @android.annotation.SuppressLint({"RestrictedApi"})
    public final p000.e9<۟.k4.c, ۟.k4.d> f648;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final java.lang.Object f649;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public ۟.k4.a f650;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.k4 f651;

        public a(p000.k4 r1) {
                r0 = this;
                r0.f651 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                ۟.k4 r0 = r5.f651
                ۟.a9 r0 = r0.f643
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f107
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.lock()
                r1 = 0
                r2 = 0
                r3 = 1
                ۟.k4 r4 = r5.f651     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                boolean r4 = r4.m226()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                if (r4 != 0) goto L19
                goto L34
            L19:
                ۟.k4 r4 = r5.f651     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f644     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                boolean r1 = r4.compareAndSet(r3, r1)     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                if (r1 != 0) goto L24
                goto L34
            L24:
                ۟.k4 r1 = r5.f651     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                ۟.a9 r1 = r1.f643     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                ۟.bb r1 = r1.f102     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                ۟.ab r1 = r1.mo84()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                boolean r1 = r1.mo45()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                if (r1 == 0) goto L3d
            L34:
                r0.unlock()
                ۟.k4 r0 = r5.f651
                r0.getClass()
                return
            L3d:
                ۟.k4 r1 = r5.f651     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                ۟.a9 r1 = r1.f643     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                ۟.bb r1 = r1.f102     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                ۟.ab r1 = r1.mo84()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                r1.mo48()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                java.util.HashSet r2 = r5.m229()     // Catch: java.lang.Throwable -> L59
                r1.mo47()     // Catch: java.lang.Throwable -> L59
                r1.mo40()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                goto L67
            L55:
                r1 = move-exception
                goto L60
            L57:
                r1 = move-exception
                goto L60
            L59:
                r3 = move-exception
                r1.mo40()     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
                throw r3     // Catch: android.database.sqlite.SQLiteException -> L55 java.lang.IllegalStateException -> L57 java.lang.Throwable -> L5e
            L5e:
                r1 = move-exception
                goto La3
            L60:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r1)     // Catch: java.lang.Throwable -> L5e
            L67:
                r0.unlock()
                ۟.k4 r0 = r5.f651
                r0.getClass()
                if (r2 == 0) goto La2
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto La2
                ۟.k4 r0 = r5.f651
                ۟.e9<۟.k4$c, ۟.k4$d> r0 = r0.f648
                monitor-enter(r0)
                ۟.k4 r1 = r5.f651     // Catch: java.lang.Throwable -> L9f
                ۟.e9<۟.k4$c, ۟.k4$d> r1 = r1.f648     // Catch: java.lang.Throwable -> L9f
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9f
                ۟.e9$c r1 = (۟.e9.c) r1     // Catch: java.lang.Throwable -> L9f
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9f
                if (r2 != 0) goto L8e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
                goto La2
            L8e:
                java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L9f
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L9f
                ۟.k4$d r1 = (۟.k4.d) r1     // Catch: java.lang.Throwable -> L9f
                r1.getClass()     // Catch: java.lang.Throwable -> L9f
                r1 = 0
                throw r1     // Catch: java.lang.Throwable -> L9f
            L9f:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
                throw r1
            La2:
                return
            La3:
                r0.unlock()
                ۟.k4 r0 = r5.f651
                r0.getClass()
                throw r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.HashSet m229() {
                r4 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                ۟.k4 r1 = r4.f651
                ۟.a9 r1 = r1.f643
                ۟.i4 r2 = new ۟.i4
                java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
                r2.<init>(r3)
                android.database.Cursor r1 = r1.m38(r2)
            L14:
                boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L27
                r2 = 0
                int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L38
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L38
                r0.add(r2)     // Catch: java.lang.Throwable -> L38
                goto L14
            L27:
                r1.close()
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L37
                ۟.k4 r1 = r4.f651
                ۟.eb r1 = r1.f646
                r1.mo136()
            L37:
                return r0
            L38:
                r0 = move-exception
                r1.close()
                throw r0
        }
    }

    public static class b {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final long[] f652;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean[] f653;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int[] f654;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public boolean f655;

        public b(int r5) {
                r4 = this;
                r4.<init>()
                long[] r0 = new long[r5]
                r4.f652 = r0
                boolean[] r1 = new boolean[r5]
                r4.f653 = r1
                int[] r5 = new int[r5]
                r4.f654 = r5
                r2 = 0
                java.util.Arrays.fill(r0, r2)
                r5 = 0
                java.util.Arrays.fill(r1, r5)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int[] m230() {
                r8 = this;
                monitor-enter(r8)
                boolean r0 = r8.f655     // Catch: java.lang.Throwable -> L41
                if (r0 != 0) goto L8
                r0 = 0
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
                return r0
            L8:
                long[] r0 = r8.f652     // Catch: java.lang.Throwable -> L41
                int r0 = r0.length     // Catch: java.lang.Throwable -> L41
                r1 = 0
                r2 = r1
            Ld:
                if (r2 >= r0) goto L35
                long[] r3 = r8.f652     // Catch: java.lang.Throwable -> L41
                r4 = r3[r2]     // Catch: java.lang.Throwable -> L41
                r6 = 0
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r4 = 1
                if (r3 <= 0) goto L1c
                r3 = r4
                goto L1d
            L1c:
                r3 = r1
            L1d:
                boolean[] r5 = r8.f653     // Catch: java.lang.Throwable -> L41
                boolean r6 = r5[r2]     // Catch: java.lang.Throwable -> L41
                if (r3 == r6) goto L2c
                int[] r6 = r8.f654     // Catch: java.lang.Throwable -> L41
                if (r3 == 0) goto L28
                goto L29
            L28:
                r4 = 2
            L29:
                r6[r2] = r4     // Catch: java.lang.Throwable -> L41
                goto L30
            L2c:
                int[] r4 = r8.f654     // Catch: java.lang.Throwable -> L41
                r4[r2] = r1     // Catch: java.lang.Throwable -> L41
            L30:
                r5[r2] = r3     // Catch: java.lang.Throwable -> L41
                int r2 = r2 + 1
                goto Ld
            L35:
                r8.f655 = r1     // Catch: java.lang.Throwable -> L41
                int[] r0 = r8.f654     // Catch: java.lang.Throwable -> L41
                java.lang.Object r0 = r0.clone()     // Catch: java.lang.Throwable -> L41
                int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L41
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
                return r0
            L41:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
                throw r0
        }
    }

    public static abstract class c {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract void m231(java.util.Set<java.lang.String> r1);
    }

    public static class d {
    }

    static {
            java.lang.String r0 = "UPDATE"
            java.lang.String r1 = "DELETE"
            java.lang.String r2 = "INSERT"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            p000.k4.f640 = r0
            return
    }

    public k4(p000.a9 r5, java.util.HashMap r6, java.util.HashMap r7, java.lang.String... r8) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r7.<init>(r0)
            r4.f644 = r7
            r4.f645 = r0
            ۟.e9 r7 = new ۟.e9
            r7.<init>()
            r4.f648 = r7
            java.lang.Object r7 = new java.lang.Object
            r7.<init>()
            r4.f649 = r7
            ۟.k4$a r7 = new ۟.k4$a
            r7.<init>(r4)
            r4.f650 = r7
            r4.f643 = r5
            ۟.k4$b r5 = new ۟.k4$b
            int r7 = r8.length
            r5.<init>(r7)
            r4.f647 = r5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.f641 = r5
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap
            r5.<init>()
            java.util.Collections.newSetFromMap(r5)
            int r5 = r8.length
            java.lang.String[] r7 = new java.lang.String[r5]
            r4.f642 = r7
        L40:
            if (r0 >= r5) goto L6d
            r7 = r8[r0]
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r1)
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r4.f641
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.put(r7, r3)
            r2 = r8[r0]
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L66
            java.lang.String[] r7 = r4.f642
            java.lang.String r1 = r2.toLowerCase(r1)
            r7[r0] = r1
            goto L6a
        L66:
            java.lang.String[] r1 = r4.f642
            r1[r0] = r7
        L6a:
            int r0 = r0 + 1
            goto L40
        L6d:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L75:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lab
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f641
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L75
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.toLowerCase(r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r4.f641
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r8.put(r6, r7)
            goto L75
        Lab:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m226() {
            r3 = this;
            ۟.a9 r0 = r3.f643
            ۟.ab r0 = r0.f100
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != 0) goto L14
            return r2
        L14:
            boolean r0 = r3.f645
            if (r0 != 0) goto L1f
            ۟.a9 r0 = r3.f643
            ۟.bb r0 = r0.f102
            r0.mo84()
        L1f:
            boolean r0 = r3.f645
            if (r0 != 0) goto L2b
            java.lang.String r0 = "ROOM"
            java.lang.String r1 = "database is not initialized even though it is open"
            android.util.Log.e(r0, r1)
            return r2
        L2b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m227(int r9, p000.ab r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", 0)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.mo42(r0)
            java.lang.String[] r0 = r8.f642
            r0 = r0[r9]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = p000.k4.f640
            r3 = 0
            r4 = r3
        L26:
            r5 = 3
            if (r4 >= r5) goto La2
            r5 = r2[r4]
            r1.setLength(r3)
            java.lang.String r6 = "CREATE TEMP TRIGGER IF NOT EXISTS "
            r1.append(r6)
            java.lang.String r6 = "`"
            r1.append(r6)
            java.lang.String r7 = "room_table_modification_trigger_"
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = "_"
            r1.append(r7)
            r1.append(r5)
            r1.append(r6)
            java.lang.String r6 = " AFTER "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = " ON `"
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = "` BEGIN UPDATE "
            r1.append(r5)
            java.lang.String r5 = "room_table_modification_log"
            r1.append(r5)
            java.lang.String r5 = " SET "
            r1.append(r5)
            java.lang.String r5 = "invalidated"
            r1.append(r5)
            java.lang.String r6 = " = 1"
            r1.append(r6)
            java.lang.String r6 = " WHERE "
            r1.append(r6)
            java.lang.String r6 = "table_id"
            r1.append(r6)
            java.lang.String r6 = " = "
            r1.append(r6)
            r1.append(r9)
            java.lang.String r6 = " AND "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = " = 0"
            r1.append(r5)
            java.lang.String r5 = "; END"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r10.mo42(r5)
            int r4 = r4 + 1
            goto L26
        La2:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m228(p000.ab r14) {
            r13 = this;
            boolean r0 = r14.mo45()
            if (r0 == 0) goto L7
            return
        L7:
            ۟.a9 r0 = r13.f643     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f107     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
            r0.lock()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
            java.lang.Object r1 = r13.f649     // Catch: java.lang.Throwable -> L92
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L92
            ۟.k4$b r2 = r13.f647     // Catch: java.lang.Throwable -> L8f
            int[] r2 = r2.m230()     // Catch: java.lang.Throwable -> L8f
            if (r2 != 0) goto L22
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8f
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
            return
        L22:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L8f
            boolean r4 = r14.mo46()     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L2d
            r14.mo48()     // Catch: java.lang.Throwable -> L8f
            goto L30
        L2d:
            r14.mo41()     // Catch: java.lang.Throwable -> L8f
        L30:
            r4 = 0
            r5 = r4
        L32:
            if (r5 >= r3) goto L80
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L78
            r7 = 1
            if (r6 == r7) goto L7a
            r7 = 2
            if (r6 == r7) goto L3d
            goto L7d
        L3d:
            java.lang.String[] r6 = r13.f642     // Catch: java.lang.Throwable -> L78
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r7.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String[] r8 = p000.k4.f640     // Catch: java.lang.Throwable -> L78
            r9 = r4
        L49:
            r10 = 3
            if (r9 >= r10) goto L7d
            r10 = r8[r9]     // Catch: java.lang.Throwable -> L78
            r7.setLength(r4)     // Catch: java.lang.Throwable -> L78
            java.lang.String r11 = "DROP TRIGGER IF EXISTS "
            r7.append(r11)     // Catch: java.lang.Throwable -> L78
            java.lang.String r11 = "`"
            r7.append(r11)     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = "room_table_modification_trigger_"
            r7.append(r12)     // Catch: java.lang.Throwable -> L78
            r7.append(r6)     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = "_"
            r7.append(r12)     // Catch: java.lang.Throwable -> L78
            r7.append(r10)     // Catch: java.lang.Throwable -> L78
            r7.append(r11)     // Catch: java.lang.Throwable -> L78
            java.lang.String r10 = r7.toString()     // Catch: java.lang.Throwable -> L78
            r14.mo42(r10)     // Catch: java.lang.Throwable -> L78
            int r9 = r9 + 1
            goto L49
        L78:
            r2 = move-exception
            goto L8b
        L7a:
            r13.m227(r5, r14)     // Catch: java.lang.Throwable -> L78
        L7d:
            int r5 = r5 + 1
            goto L32
        L80:
            r14.mo47()     // Catch: java.lang.Throwable -> L78
            r14.mo40()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8f
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
            goto La1
        L8b:
            r14.mo40()     // Catch: java.lang.Throwable -> L8f
            throw r2     // Catch: java.lang.Throwable -> L8f
        L8f:
            r14 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8f
            throw r14     // Catch: java.lang.Throwable -> L92
        L92:
            r14 = move-exception
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
            throw r14     // Catch: android.database.sqlite.SQLiteException -> L97 java.lang.IllegalStateException -> L99
        L97:
            r14 = move-exception
            goto L9a
        L99:
            r14 = move-exception
        L9a:
            java.lang.String r0 = "ROOM"
            java.lang.String r1 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r0, r1, r14)
        La1:
            return
    }
}
