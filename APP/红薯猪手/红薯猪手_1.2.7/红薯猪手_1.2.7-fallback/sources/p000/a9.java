package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class a9 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @java.lang.Deprecated
    public volatile p000.ab f100;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.concurrent.Executor f101;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public p000.bb f102;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final p000.k4 f103;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f104;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    @java.lang.Deprecated
    public java.util.List<۟.a9.a> f105;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public java.util.HashMap f106;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f107;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final java.lang.ThreadLocal<java.lang.Integer> f108;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final java.util.HashMap f109;

    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, p000.t5>> f110;

        public b() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f110 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m39(p000.t5... r9) {
                r8 = this;
                int r0 = r9.length
                r1 = 0
            L2:
                if (r1 >= r0) goto L5a
                r2 = r9[r1]
                int r3 = r2.f1035
                int r4 = r2.f1036
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, ۟.t5>> r5 = r8.f110
                java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
                java.lang.Object r5 = r5.get(r6)
                java.util.TreeMap r5 = (java.util.TreeMap) r5
                if (r5 != 0) goto L26
                java.util.TreeMap r5 = new java.util.TreeMap
                r5.<init>()
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, ۟.t5>> r6 = r8.f110
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6.put(r3, r5)
            L26:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                java.lang.Object r3 = r5.get(r3)
                ۟.t5 r3 = (p000.t5) r3
                if (r3 == 0) goto L50
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Overriding migration "
                r6.append(r7)
                r6.append(r3)
                java.lang.String r3 = " with "
                r6.append(r3)
                r6.append(r2)
                java.lang.String r3 = r6.toString()
                java.lang.String r6 = "ROOM"
                android.util.Log.w(r6, r3)
            L50:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r5.put(r3, r2)
                int r1 = r1 + 1
                goto L2
            L5a:
                return
        }
    }

    public a9() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.f107 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.f108 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Collections.synchronizedMap(r0)
            ۟.k4 r0 = r1.mo16()
            r1.f103 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f109 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f106 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static java.lang.Object m34(java.lang.Class r1, p000.bb r2) {
            boolean r0 = r1.isInstance(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            boolean r0 = r2 instanceof p000.j1
            if (r0 == 0) goto L16
            ۟.j1 r2 = (p000.j1) r2
            ۟.bb r2 = r2.mo125()
            java.lang.Object r1 = m34(r1, r2)
            return r1
        L16:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m35() {
            r2 = this;
            boolean r0 = r2.f104
            if (r0 == 0) goto L5
            return
        L5:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 != 0) goto L19
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m36() {
            r2 = this;
            ۟.bb r0 = r2.f102
            ۟.ab r0 = r0.mo84()
            boolean r0 = r0.mo45()
            if (r0 != 0) goto L1d
            java.lang.ThreadLocal<java.lang.Integer> r0 = r2.f108
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on a different coroutine context inherited from a suspending transaction."
            r0.<init>(r1)
            throw r0
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract p000.k4 mo16();

    /* JADX INFO: renamed from: ۥ۟۠ */
    public abstract p000.bb mo17(p000.f1 r1);

    /* JADX INFO: renamed from: ۥ۟ۡ */
    public java.util.List mo18() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۢ */
    public java.util.Set<java.lang.Class<? extends p000.z>> mo19() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟ */
    public java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> mo20() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m37() {
            r4 = this;
            ۟.bb r0 = r4.f102
            ۟.ab r0 = r0.mo84()
            r0.mo40()
            ۟.bb r0 = r4.f102
            ۟.ab r0 = r0.mo84()
            boolean r0 = r0.mo45()
            if (r0 != 0) goto L2a
            ۟.k4 r0 = r4.f103
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f644
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L2a
            ۟.a9 r1 = r0.f643
            java.util.concurrent.Executor r1 = r1.f101
            ۟.k4$a r0 = r0.f650
            r1.execute(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final android.database.Cursor m38(p000.db r2) {
            r1 = this;
            r1.m35()
            r1.m36()
            ۟.bb r0 = r1.f102
            ۟.ab r0 = r0.mo84()
            android.database.Cursor r2 = r0.mo43(r2)
            return r2
    }
}
