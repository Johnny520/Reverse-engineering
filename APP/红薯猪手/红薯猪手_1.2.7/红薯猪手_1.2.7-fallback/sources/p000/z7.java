package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z7 {

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public static final ۟.z7.a f1248 = null;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static volatile p000.z7 f1249;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final ۟.z7.f f1250;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<p000.y8> f1251;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.content.Context f1252;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final p000.s1 f1253;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final p000.e0 f1254;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final p000.fa f1255;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final java.util.WeakHashMap f1256;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final java.util.WeakHashMap f1257;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final java.lang.ref.ReferenceQueue<java.lang.Object> f1258;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final android.graphics.Bitmap.Config f1259;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public boolean f1260;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public volatile boolean f1261;

    public static class a extends android.os.Handler {
        public a(android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r12) {
                r11 = this;
                int r0 = r12.what
                r1 = 3
                if (r0 == r1) goto Lde
                r1 = 8
                r2 = 0
                r3 = 1
                if (r0 == r1) goto L84
                r1 = 13
                if (r0 != r1) goto L6f
                java.lang.Object r12 = r12.obj
                java.util.List r12 = (java.util.List) r12
                int r0 = r12.size()
                r1 = r2
            L18:
                if (r1 >= r0) goto Lf8
                java.lang.Object r4 = r12.get(r1)
                ۟.f r4 = (p000.f) r4
                ۟.z7 r5 = r4.f313
                r5.getClass()
                int r6 = r4.f317
                r6 = r6 & r3
                if (r6 != 0) goto L2c
                r6 = r3
                goto L2d
            L2c:
                r6 = r2
            L2d:
                if (r6 == 0) goto L49
                java.lang.String r6 = r4.f321
                ۟.e0 r7 = r5.f1254
                ۟.h5 r7 = (p000.h5) r7
                android.graphics.Bitmap r6 = r7.m192(r6)
                ۟.fa r7 = r5.f1255
                if (r6 == 0) goto L43
                ۟.fa$a r7 = r7.f365
                r7.sendEmptyMessage(r2)
                goto L4a
            L43:
                ۟.fa$a r7 = r7.f365
                r7.sendEmptyMessage(r3)
                goto L4a
            L49:
                r6 = 0
            L4a:
                if (r6 == 0) goto L5e
                ۟.z7$e r7 = ۟.z7.e.f1270
                r5.m497(r6, r7, r4)
                boolean r5 = r5.f1261
                if (r5 == 0) goto L6c
                ۟.w8 r4 = r4.f314
                r4.m454()
                r7.toString()
                goto L6a
            L5e:
                r5.m498(r4)
                boolean r5 = r5.f1261
                if (r5 == 0) goto L6c
                ۟.w8 r4 = r4.f314
                r4.m454()
            L6a:
                java.lang.StringBuilder r4 = p000.ic.f502
            L6c:
                int r1 = r1 + 1
                goto L18
            L6f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Unknown handler message received: "
                java.lang.StringBuilder r1 = p000.c4.m108(r1)
                int r12 = r12.what
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12)
                throw r0
            L84:
                java.lang.Object r12 = r12.obj
                java.util.List r12 = (java.util.List) r12
                int r0 = r12.size()
                r1 = r2
            L8d:
                if (r1 >= r0) goto Lf8
                java.lang.Object r4 = r12.get(r1)
                ۟.c0 r4 = (p000.c0) r4
                ۟.z7 r5 = r4.f176
                r5.getClass()
                ۟.f r6 = r4.f185
                java.util.ArrayList r7 = r4.f186
                if (r7 == 0) goto La8
                boolean r8 = r7.isEmpty()
                if (r8 != 0) goto La8
                r8 = r3
                goto La9
            La8:
                r8 = r2
            La9:
                if (r6 != 0) goto Lb0
                if (r8 == 0) goto Lae
                goto Lb0
            Lae:
                r9 = r2
                goto Lb1
            Lb0:
                r9 = r3
            Lb1:
                if (r9 != 0) goto Lb4
                goto Ldb
            Lb4:
                ۟.w8 r9 = r4.f181
                android.net.Uri r9 = r9.f1130
                java.lang.Exception r9 = r4.f190
                android.graphics.Bitmap r9 = r4.f187
                ۟.z7$e r4 = r4.f189
                if (r6 == 0) goto Lc3
                r5.m497(r9, r4, r6)
            Lc3:
                if (r8 == 0) goto Ld8
                int r6 = r7.size()
                r8 = r2
            Lca:
                if (r8 >= r6) goto Ld8
                java.lang.Object r10 = r7.get(r8)
                ۟.f r10 = (p000.f) r10
                r5.m497(r9, r4, r10)
                int r8 = r8 + 1
                goto Lca
            Ld8:
                r5.getClass()
            Ldb:
                int r1 = r1 + 1
                goto L8d
            Lde:
                java.lang.Object r12 = r12.obj
                ۟.f r12 = (p000.f) r12
                ۟.z7 r0 = r12.f313
                boolean r0 = r0.f1261
                if (r0 == 0) goto Lef
                ۟.w8 r0 = r12.f314
                r0.m454()
                java.lang.StringBuilder r0 = p000.ic.f502
            Lef:
                ۟.z7 r0 = r12.f313
                java.lang.Object r12 = r12.m145()
                r0.m496(r12)
            Lf8:
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.Context f1262;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public p000.x1 f1263;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public p000.b8 f1264;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public p000.h5 f1265;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public ۟.z7.f.a f1266;

        public b(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto Lc
                android.content.Context r2 = r2.getApplicationContext()
                r1.f1262 = r2
                return
            Lc:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Context must not be null."
                r2.<init>(r0)
                throw r2
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.z7 m499() {
                r10 = this;
                android.content.Context r7 = r10.f1262
                ۟.x1 r0 = r10.f1263
                if (r0 != 0) goto L36
                java.lang.StringBuilder r0 = p000.ic.f502
                java.lang.String r0 = "com.squareup.okhttp.OkHttpClient"
                java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L2f
                ۟.x6 r0 = new ۟.x6     // Catch: java.lang.ClassNotFoundException -> L2f
                java.io.File r1 = new java.io.File     // Catch: java.lang.ClassNotFoundException -> L2f
                android.content.Context r2 = r7.getApplicationContext()     // Catch: java.lang.ClassNotFoundException -> L2f
                java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.ClassNotFoundException -> L2f
                java.lang.String r3 = "picasso-cache"
                r1.<init>(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L2f
                boolean r2 = r1.exists()     // Catch: java.lang.ClassNotFoundException -> L2f
                if (r2 != 0) goto L27
                r1.mkdirs()     // Catch: java.lang.ClassNotFoundException -> L2f
            L27:
                long r2 = p000.ic.m200(r1)     // Catch: java.lang.ClassNotFoundException -> L2f
                r0.<init>(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L2f
                goto L34
            L2f:
                ۟.xb r0 = new ۟.xb
                r0.<init>(r7)
            L34:
                r10.f1263 = r0
            L36:
                ۟.h5 r0 = r10.f1265
                if (r0 != 0) goto L41
                ۟.h5 r0 = new ۟.h5
                r0.<init>(r7)
                r10.f1265 = r0
            L41:
                ۟.b8 r0 = r10.f1264
                if (r0 != 0) goto L4c
                ۟.b8 r0 = new ۟.b8
                r0.<init>()
                r10.f1264 = r0
            L4c:
                ۟.z7$f$a r0 = r10.f1266
                if (r0 != 0) goto L54
                ۟.z7$f$a r0 = ۟.z7.f.f1275
                r10.f1266 = r0
            L54:
                ۟.fa r8 = new ۟.fa
                ۟.h5 r0 = r10.f1265
                r8.<init>(r0)
                ۟.s1 r9 = new ۟.s1
                ۟.b8 r2 = r10.f1264
                ۟.z7$a r3 = p000.z7.f1248
                ۟.x1 r4 = r10.f1263
                ۟.h5 r5 = r10.f1265
                r0 = r9
                r1 = r7
                r6 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                ۟.z7 r6 = new ۟.z7
                ۟.h5 r3 = r10.f1265
                ۟.z7$f$a r4 = r10.f1266
                r0 = r6
                r2 = r9
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }
    }

    public static class c extends java.lang.Thread {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.ref.ReferenceQueue<java.lang.Object> f1267;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.os.Handler f1268;

        public class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ java.lang.Exception f1269;

            public a(java.lang.Exception r1) {
                    r0 = this;
                    r0.f1269 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r2 = this;
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    java.lang.Exception r1 = r2.f1269
                    r0.<init>(r1)
                    throw r0
            }
        }

        public c(java.lang.ref.ReferenceQueue r1, ۟.z7.a r2) {
                r0 = this;
                r0.<init>()
                r0.f1267 = r1
                r0.f1268 = r2
                r1 = 1
                r0.setDaemon(r1)
                java.lang.String r1 = "Picasso-refQueue"
                r0.setName(r1)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r3 = this;
                r0 = 10
                android.os.Process.setThreadPriority(r0)
            L5:
                java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r3.f1267     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                r1 = 1000(0x3e8, double:4.94E-321)
                java.lang.ref.Reference r0 = r0.remove(r1)     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                ۟.f$a r0 = (۟.f.a) r0     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                android.os.Handler r1 = r3.f1268     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                if (r0 == 0) goto L24
                r2 = 3
                r1.what = r2     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                ۟.f r0 = r0.f325     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                r1.obj = r0     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                android.os.Handler r0 = r3.f1268     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                r0.sendMessage(r1)     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                goto L5
            L24:
                r1.recycle()     // Catch: java.lang.Exception -> L28 java.lang.InterruptedException -> L33
                goto L5
            L28:
                r0 = move-exception
                android.os.Handler r1 = r3.f1268
                ۟.z7$c$a r2 = new ۟.z7$c$a
                r2.<init>(r0)
                r1.post(r2)
            L33:
                return
        }
    }

    public interface d {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m500();
    }

    public enum e extends java.lang.Enum<۟.z7.e> {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final ۟.z7.e f1270 = null;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final ۟.z7.e f1271 = null;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public static final ۟.z7.e f1272 = null;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public static final /* synthetic */ ۟.z7.e[] f1273 = null;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f1274;

        static {
                ۟.z7$e r0 = new ۟.z7$e
                java.lang.String r1 = "MEMORY"
                r2 = 0
                r3 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                r0.<init>(r1, r2, r3)
                ۟.z7.e.f1270 = r0
                ۟.z7$e r1 = new ۟.z7$e
                java.lang.String r3 = "DISK"
                r4 = 1
                r5 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                r1.<init>(r3, r4, r5)
                ۟.z7.e.f1271 = r1
                ۟.z7$e r3 = new ۟.z7$e
                java.lang.String r5 = "NETWORK"
                r6 = 2
                r7 = -65536(0xffffffffffff0000, float:NaN)
                r3.<init>(r5, r6, r7)
                ۟.z7.e.f1272 = r3
                r5 = 3
                ۟.z7$e[] r5 = new ۟.z7.e[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                ۟.z7.e.f1273 = r5
                return
        }

        e(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f1274 = r3
                return
        }

        public static ۟.z7.e valueOf(java.lang.String r1) {
                java.lang.Class<۟.z7$e> r0 = ۟.z7.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ۟.z7$e r1 = (۟.z7.e) r1
                return r1
        }

        public static ۟.z7.e[] values() {
                ۟.z7$e[] r0 = ۟.z7.e.f1273
                java.lang.Object r0 = r0.clone()
                ۟.z7$e[] r0 = (۟.z7.e[]) r0
                return r0
        }
    }

    public interface f {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final ۟.z7.f.a f1275 = null;

        public static class a implements ۟.z7.f {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                ۟.z7$f$a r0 = new ۟.z7$f$a
                r0.<init>()
                ۟.z7.f.f1275 = r0
                return
        }
    }

    static {
            ۟.z7$a r0 = new ۟.z7$a
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.z7.f1248 = r0
            r0 = 0
            p000.z7.f1249 = r0
            return
    }

    public z7(android.content.Context r1, p000.s1 r2, p000.e0 r3, ۟.z7.f r4, p000.fa r5) {
            r0 = this;
            r0.<init>()
            r0.f1252 = r1
            r0.f1253 = r2
            r0.f1254 = r3
            r3 = 0
            r0.f1250 = r4
            r0.f1259 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 7
            r3.<init>(r4)
            ۟.z8 r4 = new ۟.z8
            r4.<init>(r1)
            r3.add(r4)
            ۟.q0 r4 = new ۟.q0
            r4.<init>(r1)
            r3.add(r4)
            ۟.s5 r4 = new ۟.s5
            r4.<init>(r1)
            r3.add(r4)
            ۟.r0 r4 = new ۟.r0
            r4.<init>(r1)
            r3.add(r4)
            ۟.v r4 = new ۟.v
            r4.<init>(r1)
            r3.add(r4)
            ۟.u2 r4 = new ۟.u2
            r4.<init>(r1)
            r3.add(r4)
            ۟.v6 r1 = new ۟.v6
            ۟.x1 r2 = r2.f957
            r1.<init>(r2, r5)
            r3.add(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r0.f1251 = r1
            r0.f1255 = r5
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.f1256 = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.f1257 = r1
            r1 = 0
            r0.f1260 = r1
            r0.f1261 = r1
            java.lang.ref.ReferenceQueue r1 = new java.lang.ref.ReferenceQueue
            r1.<init>()
            r0.f1258 = r1
            ۟.z7$c r2 = new ۟.z7$c
            ۟.z7$a r3 = p000.z7.f1248
            r2.<init>(r1, r3)
            r2.start()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m495(p000.z7 r2) {
            java.lang.Class<۟.z7> r0 = p000.z7.class
            monitor-enter(r0)
            ۟.z7 r1 = p000.z7.f1249     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lb
            p000.z7.f1249 = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Singleton instance already exists."
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L13:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m496(java.lang.Object r4) {
            r3 = this;
            java.lang.StringBuilder r0 = p000.ic.f502
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L45
            java.util.WeakHashMap r0 = r3.f1256
            java.lang.Object r0 = r0.remove(r4)
            ۟.f r0 = (p000.f) r0
            if (r0 == 0) goto L2e
            r0.mo63()
            ۟.s1 r1 = r3.f1253
            ۟.s1$a r1 = r1.f962
            r2 = 2
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r1.sendMessage(r0)
        L2e:
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L44
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.util.WeakHashMap r0 = r3.f1257
            java.lang.Object r4 = r0.remove(r4)
            ۟.i1 r4 = (p000.i1) r4
            if (r4 != 0) goto L3f
            goto L44
        L3f:
            r0 = 0
            r4.getClass()
            throw r0
        L44:
            return
        L45:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Method call should happen from the main thread."
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m497(android.graphics.Bitmap r3, ۟.z7.e r4, p000.f r5) {
            r2 = this;
            boolean r0 = r5.f324
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r5.f323
            if (r0 != 0) goto L12
            java.util.WeakHashMap r0 = r2.f1256
            java.lang.Object r1 = r5.m145()
            r0.remove(r1)
        L12:
            if (r3 == 0) goto L2e
            if (r4 == 0) goto L26
            r5.mo64(r3, r4)
            boolean r3 = r2.f1261
            if (r3 == 0) goto L3c
            ۟.w8 r3 = r5.f314
            r3.m454()
            r4.toString()
            goto L3a
        L26:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "LoadedFrom cannot be null."
            r3.<init>(r4)
            throw r3
        L2e:
            r5.mo65()
            boolean r3 = r2.f1261
            if (r3 == 0) goto L3c
            ۟.w8 r3 = r5.f314
            r3.m454()
        L3a:
            java.lang.StringBuilder r3 = p000.ic.f502
        L3c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m498(p000.f r3) {
            r2 = this;
            java.lang.Object r0 = r3.m145()
            if (r0 == 0) goto L16
            java.util.WeakHashMap r1 = r2.f1256
            java.lang.Object r1 = r1.get(r0)
            if (r1 == r3) goto L16
            r2.m496(r0)
            java.util.WeakHashMap r1 = r2.f1256
            r1.put(r0, r3)
        L16:
            ۟.s1 r0 = r2.f1253
            ۟.s1$a r0 = r0.f962
            r1 = 1
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }
}
