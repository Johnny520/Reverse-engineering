package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ba.r f632a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f633b = null;

    static {
            ba.r r0 = new ba.r
            r0.<init>()
            ba.r.f632a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            ba.r.f633b = r0
            return
    }

    public static java.io.File a(android.content.Context r3, ba.n r4) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r3 = ub.b.d(r3)
            java.lang.String r2 = "message_bubbles"
            r1.<init>(r3, r2)
            java.lang.String r3 = r4.f614g
            r0.<init>(r1, r3)
            return r0
    }

    public static ba.o b(java.io.File r12) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            java.lang.String r2 = r12.getAbsolutePath()
            android.graphics.BitmapFactory.decodeFile(r2, r0)
            int r2 = r0.outWidth
            int r0 = r0.outHeight
            r3 = 0
            if (r2 <= 0) goto L28e
            if (r0 <= 0) goto L28e
            r4 = 2048(0x800, float:2.87E-42)
            if (r2 > r4) goto L28e
            if (r0 > r4) goto L28e
            long r4 = (long) r2
            long r6 = (long) r0
            long r4 = r4 * r6
            r6 = 2000000(0x1e8480, double:9.881313E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2a
            goto L28e
        L2a:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r12)
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L287
            r12.<init>()     // Catch: java.lang.Throwable -> L287
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L287
            r12.inPreferredConfig = r4     // Catch: java.lang.Throwable -> L287
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeStream(r2, r0, r12)     // Catch: java.lang.Throwable -> L287
            r2.close()
            if (r12 == 0) goto L28e
            boolean r2 = r12.isRecycled()
            r4 = 0
            if (r2 != 0) goto L5b
            int r2 = r12.getWidth()
            if (r2 <= 0) goto L5b
            int r2 = r12.getHeight()
            if (r2 <= 0) goto L5b
            r2 = r1
            goto L5c
        L5b:
            r2 = r4
        L5c:
            if (r2 == 0) goto L5f
            goto L60
        L5f:
            r12 = r3
        L60:
            if (r12 == 0) goto L28e
            byte[] r2 = r12.getNinePatchChunk()
            if (r2 == 0) goto L6f
            boolean r5 = android.graphics.NinePatch.isNinePatchChunk(r2)
            if (r5 == 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            if (r2 == 0) goto L9f
            ba.o r1 = new ba.o
            int r4 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            int r4 = r0.left
            if (r4 < 0) goto L8f
            int r5 = r0.top
            if (r5 < 0) goto L8f
            int r6 = r0.right
            if (r6 < 0) goto L8f
            int r7 = r0.bottom
            if (r7 < 0) goto L8f
            int r4 = r4 + r5
            int r4 = r4 + r6
            int r4 = r4 + r7
            if (r4 <= 0) goto L8f
            goto L90
        L8f:
            r0 = r3
        L90:
            if (r0 == 0) goto L97
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0)
        L97:
            int r0 = h(r12)
            r1.<init>(r12, r2, r3, r0)
            return r1
        L9f:
            int r0 = r12.getWidth()
            r2 = 3
            if (r0 < r2) goto L279
            int r0 = r12.getHeight()
            if (r0 < r2) goto L279
            int r0 = r12.getPixel(r4, r4)
            boolean r0 = d(r0)
            if (r0 == 0) goto L279
            int r0 = r12.getWidth()
            int r0 = r0 - r1
            int r0 = r12.getPixel(r0, r4)
            boolean r0 = d(r0)
            if (r0 == 0) goto L279
            int r0 = r12.getHeight()
            int r0 = r0 - r1
            int r0 = r12.getPixel(r4, r0)
            boolean r0 = d(r0)
            if (r0 == 0) goto L279
            int r0 = r12.getWidth()
            int r0 = r0 - r1
            int r2 = r12.getHeight()
            int r2 = r2 - r1
            int r0 = r12.getPixel(r0, r2)
            boolean r0 = d(r0)
            if (r0 != 0) goto Lea
            goto L279
        Lea:
            int r0 = r12.getWidth()
            int r0 = r0 - r1
            r2 = r1
            r5 = r4
        Lf1:
            if (r2 < r0) goto L247
            int r0 = r12.getHeight()
            int r6 = r0 + (-1)
            r0 = r1
            r2 = r4
        Lfb:
            if (r0 < r6) goto L215
            if (r5 == 0) goto L279
            if (r2 == 0) goto L279
            int r0 = r12.getWidth()
            r2 = 2
            int r0 = r0 - r2
            int r5 = r12.getHeight()
            int r5 = r5 - r2
            int[] r6 = f(r12, r1, r4)
            int r7 = r6.length
            if (r7 != 0) goto L114
            r6 = r3
        L114:
            if (r6 == 0) goto L117
            goto L11d
        L117:
            int[] r6 = new int[r2]
            r6[r4] = r4
            r6[r1] = r0
        L11d:
            int[] r7 = f(r12, r4, r4)
            int r8 = r7.length
            if (r8 != 0) goto L125
            r7 = r3
        L125:
            if (r7 == 0) goto L128
            goto L12e
        L128:
            int[] r7 = new int[r2]
            r7[r4] = r4
            r7[r1] = r5
        L12e:
            int[] r8 = f(r12, r1, r1)
            int[] r9 = f(r12, r4, r1)
            int r10 = r8.length
            if (r10 != r2) goto L154
            int r10 = r9.length
            if (r10 != r2) goto L154
            android.graphics.Rect r2 = new android.graphics.Rect
            r10 = r8[r4]
            r11 = r9[r4]
            r8 = r8[r1]
            int r8 = r0 - r8
            if (r8 >= 0) goto L149
            r8 = r4
        L149:
            r9 = r9[r1]
            int r9 = r5 - r9
            if (r9 >= 0) goto L150
            r9 = r4
        L150:
            r2.<init>(r10, r11, r8, r9)
            goto L155
        L154:
            r2 = r3
        L155:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r12, r1, r1, r0, r5)
            r0.getClass()
            r12.recycle()
            int r5 = r6.length
            int r5 = r5 + r1
            int r8 = r7.length
            int r8 = r8 + r1
            int r8 = r8 * r5
            int[] r5 = new int[r8]
            r9 = r4
        L167:
            if (r9 >= r8) goto L16e
            r5[r9] = r1
            int r9 = r9 + 1
            goto L167
        L16e:
            int r9 = r6.length
            int r10 = r7.length
            int r9 = r9 + r10
            int r9 = r9 + r8
            int r9 = r9 * 4
            int r9 = r9 + 32
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r9 = r9.order(r10)
            r9.put(r1)
            int r1 = r6.length
            byte r1 = (byte) r1
            r9.put(r1)
            int r1 = r7.length
            byte r1 = (byte) r1
            r9.put(r1)
            byte r1 = (byte) r8
            r9.put(r1)
            r9.putInt(r4)
            r9.putInt(r4)
            if (r2 == 0) goto L19e
            int r1 = r2.left
            goto L19f
        L19e:
            r1 = r4
        L19f:
            r9.putInt(r1)
            if (r2 == 0) goto L1a7
            int r1 = r2.right
            goto L1a8
        L1a7:
            r1 = r4
        L1a8:
            r9.putInt(r1)
            if (r2 == 0) goto L1b0
            int r1 = r2.top
            goto L1b1
        L1b0:
            r1 = r4
        L1b1:
            r9.putInt(r1)
            if (r2 == 0) goto L1b9
            int r1 = r2.bottom
            goto L1ba
        L1b9:
            r1 = r4
        L1ba:
            r9.putInt(r1)
            r9.putInt(r4)
            int r1 = r6.length
            r10 = r4
        L1c2:
            if (r10 >= r1) goto L1cc
            r11 = r6[r10]
            r9.putInt(r11)
            int r10 = r10 + 1
            goto L1c2
        L1cc:
            int r1 = r7.length
            r6 = r4
        L1ce:
            if (r6 >= r1) goto L1d8
            r10 = r7[r6]
            r9.putInt(r10)
            int r6 = r6 + 1
            goto L1ce
        L1d8:
            if (r4 >= r8) goto L1e2
            r1 = r5[r4]
            r9.putInt(r1)
            int r4 = r4 + 1
            goto L1d8
        L1e2:
            byte[] r1 = r9.array()
            r1.getClass()
            boolean r4 = android.graphics.NinePatch.isNinePatchChunk(r1)     // Catch: java.lang.Throwable -> L1f2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1f2
            goto L1f9
        L1f2:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L1f9:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r4 instanceof sf.f
            if (r6 == 0) goto L200
            r4 = r5
        L200:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L209
            goto L20a
        L209:
            r1 = r3
        L20a:
            ba.o r4 = new ba.o
            int r5 = h(r0)
            r4.<init>(r0, r1, r2, r5)
            goto L27a
        L215:
            int r7 = r12.getPixel(r4, r0)
            boolean r8 = d(r7)
            if (r8 != 0) goto L226
            boolean r8 = c(r7)
            if (r8 != 0) goto L226
            goto L279
        L226:
            boolean r7 = c(r7)
            if (r7 == 0) goto L22d
            r2 = r1
        L22d:
            int r7 = r12.getWidth()
            int r7 = r7 - r1
            int r7 = r12.getPixel(r7, r0)
            boolean r8 = d(r7)
            if (r8 != 0) goto L243
            boolean r7 = c(r7)
            if (r7 != 0) goto L243
            goto L279
        L243:
            int r0 = r0 + 1
            goto Lfb
        L247:
            int r6 = r12.getPixel(r2, r4)
            boolean r7 = d(r6)
            if (r7 != 0) goto L258
            boolean r7 = c(r6)
            if (r7 != 0) goto L258
            goto L279
        L258:
            boolean r6 = c(r6)
            if (r6 == 0) goto L25f
            r5 = r1
        L25f:
            int r6 = r12.getHeight()
            int r6 = r6 - r1
            int r6 = r12.getPixel(r2, r6)
            boolean r7 = d(r6)
            if (r7 != 0) goto L275
            boolean r6 = c(r6)
            if (r6 != 0) goto L275
            goto L279
        L275:
            int r2 = r2 + 1
            goto Lf1
        L279:
            r4 = r3
        L27a:
            if (r4 == 0) goto L27d
            goto L286
        L27d:
            ba.o r4 = new ba.o
            int r0 = h(r12)
            r4.<init>(r12, r3, r3, r0)
        L286:
            return r4
        L287:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L289
        L289:
            r0 = move-exception
            ig.a.i(r2, r12)
            throw r0
        L28e:
            return r3
    }

    public static boolean c(int r1) {
            int r0 = r1 >>> 24
            if (r0 == 0) goto Lc
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static boolean d(int r0) {
            int r0 = r0 >>> 24
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static int[] f(android.graphics.Bitmap r6, boolean r7, boolean r8) {
            if (r7 == 0) goto L7
            int r0 = r6.getWidth()
            goto Lb
        L7:
            int r0 = r6.getHeight()
        Lb:
            r1 = 1
            int r0 = r0 - r1
            r2 = -1
            r4 = r1
            r3 = r2
        L10:
            r5 = 0
            if (r4 < r0) goto L1f
            if (r2 < 0) goto L1c
            if (r3 <= r2) goto L1c
            int[] r6 = new int[]{r2, r3}
            return r6
        L1c:
            int[] r6 = new int[r5]
            return r6
        L1f:
            if (r7 == 0) goto L2d
            if (r8 == 0) goto L28
            int r5 = r6.getHeight()
            int r5 = r5 - r1
        L28:
            int r5 = r6.getPixel(r4, r5)
            goto L38
        L2d:
            if (r8 == 0) goto L34
            int r5 = r6.getWidth()
            int r5 = r5 - r1
        L34:
            int r5 = r6.getPixel(r5, r4)
        L38:
            boolean r5 = c(r5)
            if (r5 == 0) goto L43
            if (r2 >= 0) goto L42
            int r2 = r4 + (-1)
        L42:
            r3 = r4
        L43:
            int r4 = r4 + 1
            goto L10
    }

    public static final void g(android.content.Context r6, boolean r7) {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            a2.a r2 = ba.n.f608l
            r2.getClass()
            ba.a r2 = ba.a.f545h
            ba.n r3 = a2.a.E(r2, r1, r7)
            ba.r r4 = ba.r.f632a
            ba.o r5 = r4.e(r6, r3)
            if (r5 != 0) goto L10
            boolean r3 = r3.f618k
            if (r3 == 0) goto L10
            r3 = 0
            ba.n r1 = a2.a.E(r2, r1, r3)
            r4.e(r6, r1)
            goto L10
        L40:
            return
    }

    public static int h(android.graphics.Bitmap r15) {
            int r0 = r15.getWidth()
            int r0 = r0 / 32
            r1 = 1
            if (r0 >= r1) goto La
            r0 = r1
        La:
            int r2 = r15.getHeight()
            int r2 = r2 / 32
            if (r2 >= r1) goto L13
            goto L14
        L13:
            r1 = r2
        L14:
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
        L19:
            int r7 = r15.getHeight()
            if (r5 >= r7) goto L62
            r7 = r2
        L20:
            int r8 = r15.getWidth()
            if (r7 >= r8) goto L60
            int r8 = r15.getPixel(r7, r5)
            int r9 = android.graphics.Color.alpha(r8)
            r10 = 96
            if (r9 < r10) goto L5e
            int r9 = android.graphics.Color.red(r8)
            double r9 = (double) r9
            r11 = 4599057925072241033(0x3fd322d0e5604189, double:0.299)
            double r9 = r9 * r11
            int r11 = android.graphics.Color.green(r8)
            double r11 = (double) r11
            r13 = 4603462445507809378(0x3fe2c8b439581062, double:0.587)
            double r11 = r11 * r13
            double r11 = r11 + r9
            int r8 = android.graphics.Color.blue(r8)
            double r8 = (double) r8
            r13 = 4592878986383488713(0x3fbd2f1a9fbe76c9, double:0.114)
            double r8 = r8 * r13
            double r8 = r8 + r11
            r10 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r8 = r8 / r10
            double r3 = r3 + r8
            int r6 = r6 + 1
        L5e:
            int r7 = r7 + r0
            goto L20
        L60:
            int r5 = r5 + r1
            goto L19
        L62:
            if (r6 <= 0) goto L72
            double r0 = (double) r6
            double r3 = r3 / r0
            r0 = 4603399395113026191(0x3fe28f5c28f5c28f, double:0.58)
            int r15 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r15 < 0) goto L72
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r15
        L72:
            r15 = -1
            return r15
    }

    public final synchronized ba.o e(android.content.Context r8, ba.n r9) {
            r7 = this;
            monitor-enter(r7)
            java.io.File r8 = a(r8, r9)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r8.isFile()     // Catch: java.lang.Throwable -> L41
            r1 = 0
            if (r0 == 0) goto L69
            long r2 = r8.length()     // Catch: java.lang.Throwable -> L41
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L17
            goto L69
        L17:
            java.util.concurrent.ConcurrentHashMap r0 = ba.r.f633b     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r0.get(r9)     // Catch: java.lang.Throwable -> L41
            ba.p r2 = (ba.p) r2     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L4f
            long r3 = r2.f623a     // Catch: java.lang.Throwable -> L41
            long r5 = r8.lastModified()     // Catch: java.lang.Throwable -> L41
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            long r3 = r2.f624b     // Catch: java.lang.Throwable -> L41
            long r5 = r8.length()     // Catch: java.lang.Throwable -> L41
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            ba.o r3 = r2.f625c     // Catch: java.lang.Throwable -> L41
            android.graphics.Bitmap r3 = r3.f619a     // Catch: java.lang.Throwable -> L41
            boolean r3 = r3.isRecycled()     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L44
            r3 = 1
            goto L45
        L41:
            r0 = move-exception
            r8 = r0
            goto L70
        L44:
            r3 = 0
        L45:
            if (r3 == 0) goto L48
            goto L49
        L48:
            r2 = r1
        L49:
            if (r2 == 0) goto L4f
            ba.o r8 = r2.f625c     // Catch: java.lang.Throwable -> L41
            monitor-exit(r7)
            return r8
        L4f:
            ba.o r6 = b(r8)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L67
            ba.p r1 = new ba.p     // Catch: java.lang.Throwable -> L41
            long r2 = r8.lastModified()     // Catch: java.lang.Throwable -> L41
            long r4 = r8.length()     // Catch: java.lang.Throwable -> L41
            r1.<init>(r2, r4, r6)     // Catch: java.lang.Throwable -> L41
            r0.put(r9, r1)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r7)
            return r6
        L67:
            monitor-exit(r7)
            return r1
        L69:
            java.util.concurrent.ConcurrentHashMap r8 = ba.r.f633b     // Catch: java.lang.Throwable -> L41
            r8.remove(r9)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r7)
            return r1
        L70:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L41
            throw r8
    }
}
