package a;

/* JADX INFO: renamed from: a.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0074bh f413a = null;
    public static volatile long b;
    public static volatile java.lang.String c;
    public static volatile boolean d;
    public static volatile int e;
    public static volatile long f;
    public static final int[] g = null;

    static {
            a.bh r0 = new a.bh
            r0.<init>()
            a.C0074bh.f413a = r0
            r0 = -1
            a.C0074bh.e = r0
            r0 = 5
            r1 = 3
            r2 = 2
            int[] r0 = new int[]{r2, r0, r1}
            a.C0074bh.g = r0
            return
    }

    public static final java.lang.String a() {
            boolean r0 = b()
            if (r0 == 0) goto L9
            java.lang.String r0 = a.C0074bh.c
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static final boolean b() {
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = a.C0074bh.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            r0 = 0
            a.C0074bh.c = r0
            a.bh r0 = a.C0074bh.f413a
            r0.getClass()
            d()
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public static void c(java.lang.String r1) {
            java.lang.String r0 = "[VoipInterceptionState] "
            java.lang.String r1 = a.C0487z.k(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r1)
            return
    }

    public static void d() {
            long r0 = android.os.SystemClock.uptimeMillis()
            boolean r2 = a.C0074bh.d
            if (r2 == 0) goto L97
            long r2 = a.C0074bh.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L97
            boolean r0 = a.C0074bh.d
            if (r0 != 0) goto L14
            goto L97
        L14:
            android.content.Context r0 = a.C0435w1.p
            r1 = 0
            if (r0 != 0) goto L1c
            a.C0074bh.d = r1
            return
        L1c:
            java.lang.String r2 = "audio"
            java.lang.Object r0 = r0.getSystemService(r2)
            boolean r2 = r0 instanceof android.media.AudioManager
            if (r2 == 0) goto L29
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 != 0) goto L2f
            a.C0074bh.d = r1
            return
        L2f:
            int[] r2 = a.C0074bh.g
            int r3 = r2.length
            r4 = r1
        L33:
            if (r4 >= r3) goto L5c
            r5 = r2[r4]
            r0.setStreamMute(r5, r1)     // Catch: java.lang.Throwable -> L3b
            goto L59
        L3b:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "unmute stream "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = " failed: "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            c(r5)
        L59:
            int r4 = r4 + 1
            goto L33
        L5c:
            int r2 = a.C0074bh.e     // Catch: java.lang.Throwable -> L7f
            if (r2 < 0) goto L95
            int r2 = a.C0074bh.e     // Catch: java.lang.Throwable -> L7f
            r0.setStreamVolume(r1, r2, r1)     // Catch: java.lang.Throwable -> L7f
            int r0 = a.C0074bh.e     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r2.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = "restored VOICE_CALL volume -> "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7f
            r2.append(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7f
            c(r0)     // Catch: java.lang.Throwable -> L7f
            r0 = -1
            a.C0074bh.e = r0     // Catch: java.lang.Throwable -> L7f
            goto L95
        L7f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "restore VOICE_CALL volume failed: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            c(r0)
        L95:
            a.C0074bh.d = r1
        L97:
            return
    }

    public static void e() {
            java.lang.String r0 = a.C0074bh.c
            if (r0 == 0) goto L19
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 + r2
            a.C0074bh.b = r0
            long r0 = a.C0074bh.f
            long r4 = a.C0074bh.b
            long r4 = r4 + r2
            long r0 = java.lang.Math.max(r0, r4)
            a.C0074bh.f = r0
        L19:
            return
    }

    public static final boolean f() {
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = a.C0074bh.b
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Lb
            goto L11
        Lb:
            long r2 = a.C0074bh.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L13
        L11:
            r0 = 1
            return r0
        L13:
            a.bh r0 = a.C0074bh.f413a
            r0.getClass()
            d()
            r0 = 0
            return r0
    }

    public static void g(java.lang.String r8) {
            a.C0074bh.c = r8
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 + r2
            a.C0074bh.b = r0
            long r0 = a.C0074bh.b
            long r0 = r0 + r2
            a.C0074bh.f = r0
            a.bh r8 = a.C0074bh.f413a
            r8.getClass()
            boolean r8 = a.C0074bh.d
            if (r8 == 0) goto L1c
            goto La3
        L1c:
            android.content.Context r8 = a.C0435w1.p
            if (r8 != 0) goto L22
            goto La3
        L22:
            java.lang.String r0 = "audio"
            java.lang.Object r8 = r8.getSystemService(r0)
            boolean r0 = r8 instanceof android.media.AudioManager
            if (r0 == 0) goto L2f
            android.media.AudioManager r8 = (android.media.AudioManager) r8
            goto L30
        L2f:
            r8 = 0
        L30:
            if (r8 != 0) goto L33
            goto La3
        L33:
            int[] r0 = a.C0074bh.g
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L38:
            r4 = 1
            if (r3 >= r1) goto L62
            r5 = r0[r3]
            r8.setStreamMute(r5, r4)     // Catch: java.lang.Throwable -> L41
            goto L5f
        L41:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "mute stream "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " failed: "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            c(r4)
        L5f:
            int r3 = r3 + 1
            goto L38
        L62:
            int r0 = r8.getStreamVolume(r2)     // Catch: java.lang.Throwable -> L8b
            a.C0074bh.e = r0     // Catch: java.lang.Throwable -> L8b
            int r0 = a.C0074bh.e     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto La1
            r8.setStreamVolume(r2, r2, r2)     // Catch: java.lang.Throwable -> L8b
            int r8 = a.C0074bh.e     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r0.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "muted VOICE_CALL volume ("
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            r0.append(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = " -> 0)"
            r0.append(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L8b
            c(r8)     // Catch: java.lang.Throwable -> L8b
            goto La1
        L8b:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "mute VOICE_CALL volume failed: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            c(r8)
        La1:
            a.C0074bh.d = r4
        La3:
            return
    }
}
