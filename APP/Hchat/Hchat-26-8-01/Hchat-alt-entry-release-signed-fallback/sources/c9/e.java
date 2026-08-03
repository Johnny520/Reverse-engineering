package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c9.e f1154a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f1155b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f1156c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f1157d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f1158e = null;

    static {
            c9.e r0 = new c9.e
            r0.<init>()
            c9.e.f1154a = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 29968(0x7510, float:4.1994E-41)
            r0.<init>(r1)
            c9.e.f1155b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            c9.e.f1156c = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            c9.e.f1157d = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            c9.e.f1158e = r0
            return
    }

    public static void b(android.content.Context r5, android.content.Intent r6) {
            java.lang.String r0 = "com.google.android.documentsui"
            java.lang.String r1 = "com.android.documentsui"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r6)
            android.content.Intent r2 = r2.setPackage(r1)
            r2.getClass()
            android.content.pm.PackageManager r3 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L32
            r4 = 0
            java.util.List r2 = r3.queryIntentActivities(r2, r4)     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L39:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L40
            tf.t r2 = tf.t.f13167g
        L40:
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L10
            r6.setPackage(r1)
        L4b:
            return
    }

    public static java.lang.String c(android.app.Activity r5, android.net.Uri r6) {
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.io.InputStream r5 = r5.openInputStream(r6)
            if (r5 == 0) goto L44
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2b
            r6.<init>()     // Catch: java.lang.Throwable -> L2b
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            r2 = r1
        L15:
            int r3 = r5.read(r0)     // Catch: java.lang.Throwable -> L2b
            if (r3 >= 0) goto L2d
            java.nio.charset.Charset r0 = og.a.f9804a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r6.toString(r0)     // Catch: java.lang.Throwable -> L2b
            r5.close()
            if (r6 == 0) goto L44
            return r6
        L2b:
            r6 = move-exception
            goto L3e
        L2d:
            int r2 = r2 + r3
            r4 = 8388608(0x800000, float:1.1754944E-38)
            if (r2 > r4) goto L36
            r6.write(r0, r1, r3)     // Catch: java.lang.Throwable -> L2b
            goto L15
        L36:
            java.lang.String r6 = "聊天分组文件不能超过 8 MB"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L3e:
            throw r6     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            ig.a.i(r5, r6)
            throw r0
        L44:
            java.lang.String r5 = "无法读取所选文件"
            j8.o.A(r5)
            r5 = 0
            return r5
    }

    public final void a(android.app.Activity r8, c9.o2 r9, android.content.Intent r10, fg.l r11, bi.c r12) {
            r7 = this;
            sf.n r0 = sf.n.f12433a
            java.lang.Class r1 = r8.getClass()
        L6:
            if (r1 == 0) goto L61
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L61
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = c9.e.f1157d
            boolean r3 = r2.add(r1)
            if (r3 != 0) goto L19
            goto L36
        L19:
            java.lang.String r3 = "onActivityResult"
            b9.e r4 = new b9.e     // Catch: java.lang.Throwable -> L26
            r5 = 4
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L26
            java.util.Set r3 = de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r3, r4)     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L2d:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L36
            r2.remove(r1)
        L36:
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = c9.e.f1158e
            boolean r3 = r2.add(r1)
            if (r3 != 0) goto L3f
            goto L5c
        L3f:
            java.lang.String r3 = "onDestroy"
            ba.f r4 = new ba.f     // Catch: java.lang.Throwable -> L4c
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            java.util.Set r3 = de.robv.android.xposed.XposedBridge.hookAllMethods(r1, r3, r4)     // Catch: java.lang.Throwable -> L4c
            goto L53
        L4c:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L53:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L5c
            r2.remove(r1)
        L5c:
            java.lang.Class r1 = r1.getSuperclass()
            goto L6
        L61:
            r1 = 0
            r2 = r1
        L63:
            java.util.concurrent.ConcurrentHashMap r3 = c9.e.f1156c
            r4 = 240(0xf0, float:3.36E-43)
            if (r2 >= r4) goto L83
            ba.c r4 = new ba.c
            r5 = 1
            r4.<init>(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = c9.e.f1155b
            int r4 = r5.updateAndGet(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r3.containsKey(r5)
            if (r5 != 0) goto L80
            goto Lb3
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.util.Set r2 = r3.keySet()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Comparable r2 = tf.m.D1(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L9a
            int r2 = r2.intValue()
        L98:
            r4 = r2
            goto L9d
        L9a:
            r2 = 29968(0x7510, float:4.1994E-41)
            goto L98
        L9d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r3.remove(r2)
            c9.d r2 = (c9.d) r2
            if (r2 == 0) goto Lb3
            c9.p2 r5 = new c9.p2
            java.lang.String r6 = ""
            r5.<init>(r6, r1)
            r2.a(r5)
        Lb3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            c9.d r5 = new c9.d
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r8)
            r5.<init>(r6, r9, r11)
            r3.put(r2, r5)
            r8.startActivityForResult(r10, r4)     // Catch: java.lang.Throwable -> Lc9
            r10 = r0
            goto Lcf
        Lc9:
            r9 = move-exception
            sf.f r10 = new sf.f
            r10.<init>(r9)
        Lcf:
            java.lang.Throwable r9 = sf.g.b(r10)
            if (r9 == 0) goto L124
            if (r12 == 0) goto Lde
            java.lang.Object r10 = r12.invoke()
            android.content.Intent r10 = (android.content.Intent) r10
            goto Ldf
        Lde:
            r10 = 0
        Ldf:
            java.lang.String r12 = "当前系统不支持选择文件"
            if (r10 != 0) goto Lfc
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r3.remove(r8)
            c9.p2 r8 = new c9.p2
            r8.<init>(r12, r1)
            r11.invoke(r8)
            java.lang.String r8 = r9.getMessage()
            java.lang.String r10 = "[Hchat:ConversationGroup] 启动系统文档选择器失败: "
            eh.a.x(r10, r8, r9)
            goto L124
        Lfc:
            r8.startActivityForResult(r10, r4)     // Catch: java.lang.Throwable -> L100
            goto L106
        L100:
            r8 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r8)
        L106:
            java.lang.Throwable r8 = sf.g.b(r0)
            if (r8 == 0) goto L124
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r3.remove(r9)
            c9.p2 r9 = new c9.p2
            r9.<init>(r12, r1)
            r11.invoke(r9)
            java.lang.String r9 = r8.getMessage()
            java.lang.String r10 = "[Hchat:ConversationGroup] 启动备用文档选择器失败: "
            eh.a.x(r10, r9, r8)
        L124:
            return
    }
}
