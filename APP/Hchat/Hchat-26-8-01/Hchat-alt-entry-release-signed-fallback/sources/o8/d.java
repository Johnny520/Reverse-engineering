package o8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f9588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f9589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i8.f f9590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f9591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.ThreadLocal f9592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f9593f;

    public d(h.Hchat.dexkit.DexFinder r3, java.lang.ClassLoader r4, i8.f r5) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.f9591d = r0
            ha.p r0 = new ha.p
            r1 = 4
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            r2.f9592e = r0
            r2.f9588a = r3
            r2.f9589b = r4
            r2.f9590c = r5
            return
    }

    public static android.content.ContentValues a(java.lang.Object[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = r2 instanceof android.content.ContentValues
            if (r3 == 0) goto Ld
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r4 = 0
            return r4
    }

    public static java.lang.String c(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L1c
        L7:
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r1 = "<msgsource"
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto L14
            goto L1c
        L14:
            java.lang.String r2 = "</msgsource>"
            int r0 = r0.indexOf(r2, r1)
            if (r0 >= 0) goto L1f
        L1c:
            java.lang.String r3 = ""
            return r3
        L1f:
            int r0 = r0 + 12
            int r2 = r3.length()
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.String r3 = r3.trim()
            return r3
    }

    public static java.lang.String h(java.lang.Object[] r5) {
            int r0 = r5.length
            if (r0 != 0) goto L4
            goto L31
        L4:
            r0 = 0
            r1 = r5[r0]
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Le
            java.lang.String r1 = (java.lang.String) r1
            return r1
        Le:
            int r1 = r5.length
        Lf:
            if (r0 >= r1) goto L31
            r2 = r5[r0]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 != 0) goto L18
            goto L2d
        L18:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "message"
            boolean r4 = r3.equalsIgnoreCase(r2)
            if (r4 != 0) goto L30
            java.lang.String r4 = r2.toLowerCase()
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L2d
            goto L30
        L2d:
            int r0 = r0 + 1
            goto Lf
        L30:
            return r2
        L31:
            java.lang.String r5 = ""
            return r5
    }

    public final void b(l8.a r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f9591d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            o8.c r1 = (o8.c) r1
            r1.a(r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "数据库变更监听回调失败: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            i8.f r2 = r4.f9590c
            if (r2 == 0) goto L6
            java.lang.String r2 = "[WeChatDatabaseListenerApi] "
            java.lang.String r1 = r2.concat(r1)
            i8.i.f(r1)
            goto L6
        L37:
            return
    }

    public final int d(java.lang.Class r13) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.util.List r13 = h.Hchat.utils.KavaReflector.declaredMethods(r13)
            java.util.Iterator r13 = r13.iterator()
            r1 = r0
        Ld:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r13.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = 0
            if (r2 != 0) goto L1e
            goto Lb1
        L1e:
            java.lang.Class[] r4 = r2.getParameterTypes()
            java.lang.Class r5 = r2.getReturnType()
            java.lang.String r6 = r2.getName()
            java.lang.Class r7 = java.lang.Long.TYPE
            java.lang.Class<android.content.ContentValues> r8 = android.content.ContentValues.class
            if (r5 != r7) goto L64
            if (r4 != 0) goto L33
            goto L64
        L33:
            int r7 = r4.length
            r9 = r0
        L35:
            if (r9 >= r7) goto L64
            r10 = r4[r9]
            boolean r10 = r8.isAssignableFrom(r10)
            if (r10 == 0) goto L61
            java.lang.String r7 = "insert"
            boolean r9 = r7.equals(r6)
            if (r9 != 0) goto L5f
            java.lang.String r9 = "insertWithOnConflict"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L5f
            java.lang.String r9 = "replace"
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L5f
            java.lang.String r9 = "replaceOrThrow"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L64
        L5f:
            r3 = r7
            goto Lb1
        L61:
            int r9 = r9 + 1
            goto L35
        L64:
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r5 != r7) goto L8c
            if (r4 != 0) goto L6b
            goto L8c
        L6b:
            int r9 = r4.length
            r10 = r0
        L6d:
            if (r10 >= r9) goto L8c
            r11 = r4[r10]
            boolean r11 = r8.isAssignableFrom(r11)
            if (r11 == 0) goto L89
            java.lang.String r8 = "update"
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L87
            java.lang.String r9 = "updateWithOnConflict"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L8c
        L87:
            r3 = r8
            goto Lb1
        L89:
            int r10 = r10 + 1
            goto L6d
        L8c:
            java.lang.String r6 = r2.getName()
            java.lang.String r8 = "delete"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto Lb1
            if (r5 != r7) goto Lb1
            int r5 = r4.length
            r6 = 3
            if (r5 != r6) goto Lb1
            r5 = r4[r0]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 != r6) goto Lb1
            r5 = 1
            r5 = r4[r5]
            if (r5 != r6) goto Lb1
            r5 = 2
            r4 = r4[r5]
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            if (r4 != r5) goto Lb1
            goto L87
        Lb1:
            if (r3 != 0) goto Lb5
            goto Ld
        Lb5:
            r8.i r4 = r8.i.f11631b
            aa.d r5 = new aa.d
            r5.<init>(r12, r3, r2)
            r4.b(r2, r5)
            int r1 = r1 + 1
            goto Ld
        Lc3:
            return r1
    }

    public final synchronized void e() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f9593f     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L8a
            boolean r0 = r4.f()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Ld
            goto L8a
        Ld:
            h.Hchat.dexkit.DexFinder r0 = r4.f9588a     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L17
            java.lang.Class<?> r0 = r0.sqliteDbWrapperClass     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            goto L8c
        L17:
            r0 = 0
        L18:
            r1 = 0
            r2 = r1
        L1a:
            if (r0 == 0) goto L2a
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r0 == r3) goto L2a
            int r3 = r4.d(r0)     // Catch: java.lang.Throwable -> L14
            int r2 = r2 + r3
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L14
            goto L1a
        L2a:
            java.lang.String r0 = "com.tencent.wcdb.database.SQLiteDatabase"
            java.lang.ClassLoader r3 = r4.f9589b     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto L31
            goto L3a
        L31:
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)     // Catch: java.lang.Throwable -> L3a
            int r0 = r4.d(r0)     // Catch: java.lang.Throwable -> L3a
            goto L3b
        L3a:
            r0 = r1
        L3b:
            int r2 = r2 + r0
            java.lang.String r0 = "android.database.sqlite.SQLiteDatabase"
            java.lang.ClassLoader r3 = r4.f9589b     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto L43
            goto L4c
        L43:
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)     // Catch: java.lang.Throwable -> L4c
            int r0 = r4.d(r0)     // Catch: java.lang.Throwable -> L4c
            goto L4d
        L4c:
            r0 = r1
        L4d:
            int r2 = r2 + r0
            if (r2 <= 0) goto L51
            r1 = 1
        L51:
            r4.f9593f = r1     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "数据库变更监听Hook: wrapper="
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            h.Hchat.dexkit.DexFinder r1 = r4.f9588a     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L6a
            java.lang.Class<?> r1 = r1.sqliteDbWrapperClass     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L6a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L14
            goto L6c
        L6a:
            java.lang.String r1 = "null"
        L6c:
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = " methods="
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            r0.append(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L14
            i8.f r1 = r4.f9590c     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L88
            java.lang.String r1 = "[WeChatDatabaseListenerApi] "
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L14
            i8.i.f(r0)     // Catch: java.lang.Throwable -> L14
        L88:
            monitor-exit(r4)
            return
        L8a:
            monitor-exit(r4)
            return
        L8c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public final boolean f() {
            r1 = this;
            h.Hchat.dexkit.DexFinder r0 = r1.f9588a
            if (r0 == 0) goto L8
            java.lang.Class<?> r0 = r0.sqliteDbWrapperClass
            if (r0 != 0) goto Lc
        L8:
            java.lang.ClassLoader r0 = r1.f9589b
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final void g(o8.c r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.f9591d
            r0.addIfAbsent(r2)
            return
    }
}
