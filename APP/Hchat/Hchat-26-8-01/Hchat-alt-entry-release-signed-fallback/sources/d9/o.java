package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2133a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            d9.o.f2133a = r0
            return
    }

    public static java.io.File a(android.content.Context r8, java.lang.String r9) {
            java.io.File r0 = new java.io.File
            java.io.File r8 = ub.b.d(r8)
            java.lang.String r1 = "custom_friend_avatars"
            r0.<init>(r8, r1)
            java.io.File r8 = new java.io.File
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            java.nio.charset.Charset r2 = og.a.f9804a
            byte[] r9 = r9.getBytes(r2)
            r9.getClass()
            byte[] r9 = r1.digest(r9)
            r9.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            int r3 = r9.length
            r4 = 0
            r5 = r4
        L30:
            if (r4 >= r3) goto L53
            r6 = r9[r4]
            r7 = 1
            int r5 = r5 + r7
            if (r5 <= r7) goto L3b
            r1.append(r2)
        L3b:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "%02x"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r1.append(r6)
            int r4 = r4 + 1
            goto L30
        L53:
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = ".png"
            java.lang.String r9 = r9.concat(r1)
            r8.<init>(r0, r9)
            return r8
    }

    public static final java.util.LinkedHashSet b(android.content.Context r4) {
            r4.getClass()
            java.lang.String r0 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r1 = "configured_friends"
            tf.v r2 = tf.v.f13169g
            java.util.Set r0 = r0.getStringSet(r1, r2)
            if (r0 != 0) goto L14
            goto L15
        L14:
            r2 = r0
        L15:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.io.File r3 = a(r4, r3)
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L20
            r0.add(r2)
            goto L20
        L3e:
            return r0
    }

    public static android.graphics.Bitmap c(android.content.Context r5, android.net.Uri r6) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.content.ContentResolver r2 = r5.getContentResolver()
            java.io.InputStream r2 = r2.openInputStream(r6)
            r3 = 0
            if (r2 == 0) goto L21
            android.graphics.BitmapFactory.decodeStream(r2, r3, r0)     // Catch: java.lang.Throwable -> L1a
            r2.close()
            goto L21
        L1a:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L1c
        L1c:
            r6 = move-exception
            ig.a.i(r2, r5)
            throw r6
        L21:
            int r2 = r0.outWidth
            if (r2 <= 0) goto L5e
            int r2 = r0.outHeight
            if (r2 > 0) goto L2a
            goto L5e
        L2a:
            int r2 = r0.outWidth
            int r2 = r2 / r1
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 > r4) goto L5b
            int r2 = r0.outHeight
            int r2 = r2 / r1
            if (r2 <= r4) goto L37
            goto L5b
        L37:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inSampleSize = r1
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            r0.inPreferredConfig = r1
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.io.InputStream r5 = r5.openInputStream(r6)
            if (r5 == 0) goto L5e
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r3, r0)     // Catch: java.lang.Throwable -> L54
            r5.close()
            return r6
        L54:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L56
        L56:
            r0 = move-exception
            ig.a.i(r5, r6)
            throw r0
        L5b:
            int r1 = r1 * 2
            goto L2a
        L5e:
            return r3
    }

    public static final boolean d(android.content.Context r1, java.lang.String r2) {
            r1.getClass()
            if (r2 == 0) goto Le
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 != 0) goto L13
            java.lang.String r2 = ""
        L13:
            int r0 = r2.length()
            if (r0 <= 0) goto L25
            java.io.File r1 = a(r1, r2)
            boolean r1 = r1.isFile()
            if (r1 == 0) goto L25
            r1 = 1
            return r1
        L25:
            r1 = 0
            return r1
    }

    public static final android.graphics.Bitmap e(android.content.Context r10, java.lang.String r11) {
            r10.getClass()
            r1 = 0
            if (r11 == 0) goto Lf
            java.lang.CharSequence r11 = og.m.R0(r11)
            java.lang.String r11 = r11.toString()
            goto L10
        Lf:
            r11 = r1
        L10:
            if (r11 != 0) goto L14
            java.lang.String r11 = ""
        L14:
            int r0 = r11.length()
            if (r0 != 0) goto L1c
            goto Lab
        L1c:
            java.io.File r10 = a(r10, r11)
            boolean r0 = r10.isFile()
            if (r0 == 0) goto Lab
            long r2 = r10.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L32
            goto Lab
        L32:
            java.util.concurrent.ConcurrentHashMap r2 = d9.o.f2133a
            java.lang.Object r0 = r2.get(r11)
            d9.n r0 = (d9.n) r0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L66
            long r5 = r0.f2130a
            long r7 = r10.lastModified()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L5c
            long r5 = r0.f2131b
            long r7 = r10.length()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L5c
            android.graphics.Bitmap r5 = r0.f2132c
            boolean r5 = r5.isRecycled()
            if (r5 != 0) goto L5c
            r5 = r4
            goto L5d
        L5c:
            r5 = r3
        L5d:
            if (r5 == 0) goto L60
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 == 0) goto L66
            android.graphics.Bitmap r10 = r0.f2132c
            return r10
        L66:
            java.lang.String r0 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L6f
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L76:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L7c
            r0 = r1
        L7c:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lab
            boolean r5 = r0.isRecycled()
            if (r5 != 0) goto L93
            int r5 = r0.getWidth()
            if (r5 <= 0) goto L93
            int r5 = r0.getHeight()
            if (r5 <= 0) goto L93
            r3 = r4
        L93:
            if (r3 == 0) goto L97
            r9 = r0
            goto L98
        L97:
            r9 = r1
        L98:
            if (r9 == 0) goto Lab
            d9.n r4 = new d9.n
            long r5 = r10.lastModified()
            long r7 = r10.length()
            r4.<init>(r5, r7, r9)
            r2.put(r11, r4)
            return r9
        Lab:
            return r1
    }

    public static final android.graphics.Bitmap f(android.content.Context r4, java.lang.String r5) {
            r4.getClass()
            java.lang.String r0 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r1 = ub.b.c(r4, r0)
            java.lang.String r2 = "enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L20
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r1 = "scope_notifications"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L20
            r3 = r2
        L20:
            if (r3 != 0) goto L24
            r4 = 0
            return r4
        L24:
            android.graphics.Bitmap r4 = e(r4, r5)
            return r4
    }

    public static final synchronized boolean g(android.content.Context r4, java.lang.String r5) {
            java.lang.Class<d9.o> r0 = d9.o.class
            monitor-enter(r0)
            r5.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L28
            r2 = 0
            if (r1 != 0) goto L17
            monitor-exit(r0)
            return r2
        L17:
            java.io.File r1 = a(r4, r5)     // Catch: java.lang.Throwable -> L28
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            boolean r1 = r1.delete()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2b
            goto L2a
        L28:
            r4 = move-exception
            goto L50
        L2a:
            r2 = 1
        L2b:
            java.util.LinkedHashSet r1 = b(r4)     // Catch: java.lang.Throwable -> L28
            java.util.Set r1 = tf.m.T1(r1)     // Catch: java.lang.Throwable -> L28
            r1.remove(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r4 = ub.b.c(r4, r3)     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "configured_friends"
            android.content.SharedPreferences$Editor r4 = r4.putStringSet(r3, r1)     // Catch: java.lang.Throwable -> L28
            r4.apply()     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.ConcurrentHashMap r4 = d9.o.f2133a     // Catch: java.lang.Throwable -> L28
            r4.remove(r5)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)
            return r2
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r4
    }
}
