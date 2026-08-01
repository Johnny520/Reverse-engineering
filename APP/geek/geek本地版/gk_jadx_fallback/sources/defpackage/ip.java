package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ip implements defpackage.gw {
    public static boolean A;
    public static java.lang.reflect.Field B;
    public static final defpackage.l0 a = null;
    public static final java.lang.Object[] b = null;
    public static final java.lang.Object c = null;
    public static final defpackage.l0 d = null;
    public static final defpackage.l0 e = null;
    public static final defpackage.l0 f = null;
    public static final defpackage.l0 g = null;
    public static final defpackage.l0 h = null;
    public static final defpackage.l0 i = null;
    public static final defpackage.l0 j = null;
    public static final defpackage.ui k = null;
    public static final defpackage.ui l = null;
    public static final defpackage.yv m = null;
    public static defpackage.yv n;
    public static final byte[] o = null;
    public static final byte[] p = null;
    public static final defpackage.iy q = null;
    public static final defpackage.iy r = null;
    public static final defpackage.iy s = null;
    public static final defpackage.ce t = null;
    public static java.lang.reflect.Method u;
    public static java.lang.reflect.Method v;
    public static boolean w;
    public static java.lang.Object x;
    public static boolean y;
    public static java.lang.reflect.Method z;

    static {
            l0 r0 = new l0
            r1 = 27
            java.lang.String r2 = "NO_DECISION"
            r0.<init>(r1, r2)
            defpackage.ip.a = r0
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            defpackage.ip.b = r2
            l0 r2 = new l0
            java.lang.String r3 = "REMOVED_TASK"
            r2.<init>(r1, r3)
            defpackage.ip.d = r2
            l0 r2 = new l0
            java.lang.String r3 = "CLOSED_EMPTY"
            r2.<init>(r1, r3)
            defpackage.ip.e = r2
            l0 r2 = new l0
            java.lang.String r3 = "COMPLETING_ALREADY"
            r2.<init>(r1, r3)
            defpackage.ip.f = r2
            l0 r2 = new l0
            java.lang.String r3 = "COMPLETING_WAITING_CHILDREN"
            r2.<init>(r1, r3)
            defpackage.ip.g = r2
            l0 r2 = new l0
            java.lang.String r3 = "COMPLETING_RETRY"
            r2.<init>(r1, r3)
            defpackage.ip.h = r2
            l0 r2 = new l0
            java.lang.String r3 = "TOO_LATE_TO_CANCEL"
            r2.<init>(r1, r3)
            defpackage.ip.i = r2
            l0 r2 = new l0
            java.lang.String r3 = "SEALED"
            r2.<init>(r1, r3)
            defpackage.ip.j = r2
            ui r1 = new ui
            r1.<init>(r0)
            defpackage.ip.k = r1
            ui r0 = new ui
            r1 = 1
            r0.<init>(r1)
            defpackage.ip.l = r0
            yv r0 = new yv
            r1 = 0
            r0.<init>(r1, r1, r1)
            defpackage.ip.m = r0
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0096: FILL_ARRAY_DATA , data: [112, 114, 111, 0} // fill-array
            defpackage.ip.o = r1
            byte[] r0 = new byte[r0]
            r0 = {x009c: FILL_ARRAY_DATA , data: [112, 114, 109, 0} // fill-array
            defpackage.ip.p = r0
            iy r0 = new iy
            r1 = 6
            r0.<init>(r1)
            defpackage.ip.q = r0
            iy r0 = new iy
            r1 = 7
            r0.<init>(r1)
            defpackage.ip.r = r0
            iy r0 = new iy
            r1 = 5
            r0.<init>(r1)
            defpackage.ip.s = r0
            ce r0 = new ce
            r1 = 3
            r0.<init>(r1)
            defpackage.ip.t = r0
            return
    }

    public static boolean A() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L2a
            r1 = 32
            if (r0 < r1) goto L28
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L15
            goto L28
        L15:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r2 = "Tiramisu"
            java.lang.String r1 = r2.toUpperCase(r1)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L28
            goto L2a
        L28:
            r0 = 0
            return r0
        L2a:
            r0 = 1
            return r0
    }

    public static boolean B(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L4b
            r0 = 33
            if (r1 == r0) goto L3a
            r0 = 66
            if (r1 == r0) goto L29
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L21
            int r1 = r2.top
            int r0 = r3.top
            if (r1 < r0) goto L1a
            int r1 = r2.bottom
            if (r1 > r0) goto L5d
        L1a:
            int r1 = r2.bottom
            int r2 = r3.bottom
            if (r1 >= r2) goto L5d
            goto L5b
        L21:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L29:
            int r1 = r2.left
            int r0 = r3.left
            if (r1 < r0) goto L33
            int r1 = r2.right
            if (r1 > r0) goto L5d
        L33:
            int r1 = r2.right
            int r2 = r3.right
            if (r1 >= r2) goto L5d
            goto L5b
        L3a:
            int r1 = r2.bottom
            int r0 = r3.bottom
            if (r1 > r0) goto L44
            int r1 = r2.top
            if (r1 < r0) goto L5d
        L44:
            int r1 = r2.top
            int r2 = r3.top
            if (r1 <= r2) goto L5d
            goto L5b
        L4b:
            int r1 = r2.right
            int r0 = r3.right
            if (r1 > r0) goto L55
            int r1 = r2.left
            if (r1 < r0) goto L5d
        L55:
            int r1 = r2.left
            int r2 = r3.left
            if (r1 <= r2) goto L5d
        L5b:
            r1 = 1
            return r1
        L5d:
            r1 = 0
            return r1
    }

    public static java.util.List C(java.lang.Object r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(...)"
            n(r0, r1)
            return r1
    }

    public static int D(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L28
            r0 = 33
            if (r1 == r0) goto L23
            r0 = 66
            if (r1 == r0) goto L1e
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L16
            int r1 = r3.top
            int r2 = r2.bottom
        L14:
            int r1 = r1 - r2
            goto L2d
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L1e:
            int r1 = r3.left
            int r2 = r2.right
            goto L14
        L23:
            int r1 = r2.top
            int r2 = r3.bottom
            goto L14
        L28:
            int r1 = r2.left
            int r2 = r3.right
            goto L14
        L2d:
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            return r1
    }

    public static int E(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L31
            r0 = 33
            if (r1 == r0) goto L19
            r0 = 66
            if (r1 == r0) goto L31
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L19:
            int r1 = r2.left
            int r2 = r2.width()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.left
            int r3 = r3.width()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
        L31:
            int r1 = r2.top
            int r2 = r2.height()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.top
            int r3 = r3.height()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
    }

    public static void J(android.content.Context r8, java.lang.String r9) {
            java.lang.String r0 = "locales"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales: "
            java.lang.String r3 = "Storing App Locales : app-locales: "
            java.lang.String r4 = ""
            boolean r4 = r9.equals(r4)
            java.lang.String r5 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r4 == 0) goto L16
            r8.deleteFile(r5)
            return
        L16:
            r4 = 0
            java.io.FileOutputStream r8 = r8.openFileOutput(r5, r4)     // Catch: java.io.FileNotFoundException -> L68
            org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()
            r5 = 0
            r4.setOutput(r8, r5)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r6 = "UTF-8"
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.startDocument(r6, r7)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.startTag(r5, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r6 = "application_locales"
            r4.attribute(r5, r6, r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.endTag(r5, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r4.endDocument()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r0.append(r9)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r3 = " persisted successfully."
            r0.append(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            if (r8 == 0) goto L61
            r8.close()     // Catch: java.io.IOException -> L61
            return
        L52:
            r9 = move-exception
            goto L62
        L54:
            r0 = move-exception
            java.lang.String r9 = r2.concat(r9)     // Catch: java.lang.Throwable -> L52
            android.util.Log.w(r1, r9, r0)     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L61
            r8.close()     // Catch: java.io.IOException -> L61
        L61:
            return
        L62:
            if (r8 == 0) goto L67
            r8.close()     // Catch: java.io.IOException -> L67
        L67:
            throw r9
        L68:
            java.lang.String r8 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r1, r8)
            return
    }

    public static int[] K(java.io.ByteArrayInputStream r5, int r6) {
            int[] r0 = new int[r6]
            r1 = 0
            r2 = r1
        L4:
            if (r1 >= r6) goto L12
            r3 = 2
            long r3 = defpackage.ff.J(r5, r3)
            int r3 = (int) r3
            int r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static java.lang.String L(android.content.Context r9) {
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
    }

    public static defpackage.mg[] M(java.io.FileInputStream r6, byte[] r7, byte[] r8, defpackage.mg[] r9) {
            byte[] r0 = defpackage.a80.n
            boolean r1 = java.util.Arrays.equals(r7, r0)
            java.lang.String r2 = "Unsupported meta version"
            java.lang.String r3 = "Content found after the end of file"
            r4 = 4
            if (r1 == 0) goto L60
            byte[] r1 = defpackage.a80.i
            boolean r8 = java.util.Arrays.equals(r1, r8)
            if (r8 != 0) goto L58
            boolean r7 = java.util.Arrays.equals(r7, r0)
            if (r7 == 0) goto L52
            r7 = 1
            long r7 = defpackage.ff.J(r6, r7)
            int r7 = (int) r7
            long r0 = defpackage.ff.J(r6, r4)
            long r4 = defpackage.ff.J(r6, r4)
            int r8 = (int) r4
            int r0 = (int) r0
            byte[] r8 = defpackage.ff.I(r6, r8, r0)
            int r6 = r6.read()
            if (r6 > 0) goto L4c
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r8)
            mg[] r7 = N(r6, r7, r9)     // Catch: java.lang.Throwable -> L42
            r6.close()
            return r7
        L42:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r6 = move-exception
            r7.addSuppressed(r6)
        L4b:
            throw r7
        L4c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        L58:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
            r6.<init>(r7)
            throw r6
        L60:
            byte[] r0 = defpackage.a80.o
            boolean r7 = java.util.Arrays.equals(r7, r0)
            if (r7 == 0) goto L9f
            r7 = 2
            long r0 = defpackage.ff.J(r6, r7)
            int r7 = (int) r0
            long r0 = defpackage.ff.J(r6, r4)
            long r4 = defpackage.ff.J(r6, r4)
            int r2 = (int) r4
            int r0 = (int) r0
            byte[] r0 = defpackage.ff.I(r6, r2, r0)
            int r6 = r6.read()
            if (r6 > 0) goto L99
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r0)
            mg[] r7 = O(r6, r8, r7, r9)     // Catch: java.lang.Throwable -> L8f
            r6.close()
            return r7
        L8f:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r6 = move-exception
            r7.addSuppressed(r6)
        L98:
            throw r7
        L99:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r3)
            throw r6
        L9f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
    }

    public static defpackage.mg[] N(java.io.ByteArrayInputStream r8, int r9, defpackage.mg[] r10) {
            int r0 = r8.available()
            r1 = 0
            if (r0 != 0) goto La
            mg[] r8 = new defpackage.mg[r1]
            return r8
        La:
            int r0 = r10.length
            if (r9 != r0) goto L55
            java.lang.String[] r0 = new java.lang.String[r9]
            int[] r2 = new int[r9]
            r3 = r1
        L12:
            if (r3 >= r9) goto L31
            r4 = 2
            long r5 = defpackage.ff.J(r8, r4)
            int r5 = (int) r5
            long r6 = defpackage.ff.J(r8, r4)
            int r4 = (int) r6
            r2[r3] = r4
            java.lang.String r4 = new java.lang.String
            byte[] r5 = defpackage.ff.H(r8, r5)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r5, r6)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L12
        L31:
            if (r1 >= r9) goto L54
            r3 = r10[r1]
            java.lang.String r4 = r3.b
            r5 = r0[r1]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4c
            r4 = r2[r1]
            r3.e = r4
            int[] r4 = K(r8, r4)
            r3.h = r4
            int r1 = r1 + 1
            goto L31
        L4c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Order of dexfiles in metadata did not match baseline"
            r8.<init>(r9)
            throw r8
        L54:
            return r10
        L55:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Mismatched number of dex files found in metadata"
            r8.<init>(r9)
            throw r8
    }

    public static defpackage.mg[] O(java.io.ByteArrayInputStream r10, byte[] r11, int r12, defpackage.mg[] r13) {
            int r0 = r10.available()
            r1 = 0
            if (r0 != 0) goto La
            mg[] r10 = new defpackage.mg[r1]
            return r10
        La:
            int r0 = r13.length
            if (r12 != r0) goto L83
            r0 = r1
        Le:
            if (r0 >= r12) goto L82
            r2 = 2
            defpackage.ff.J(r10, r2)
            long r3 = defpackage.ff.J(r10, r2)
            int r3 = (int) r3
            java.lang.String r4 = new java.lang.String
            byte[] r3 = defpackage.ff.H(r10, r3)
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r3, r5)
            r3 = 4
            long r5 = defpackage.ff.J(r10, r3)
            long r2 = defpackage.ff.J(r10, r2)
            int r2 = (int) r2
            int r3 = r13.length
            r7 = 0
            if (r3 > 0) goto L33
            goto L5f
        L33:
            java.lang.String r3 = "!"
            int r3 = r4.indexOf(r3)
            if (r3 >= 0) goto L41
            java.lang.String r3 = ":"
            int r3 = r4.indexOf(r3)
        L41:
            if (r3 <= 0) goto L4a
            int r3 = r3 + 1
            java.lang.String r3 = r4.substring(r3)
            goto L4b
        L4a:
            r3 = r4
        L4b:
            r8 = r1
        L4c:
            int r9 = r13.length
            if (r8 >= r9) goto L5f
            r9 = r13[r8]
            java.lang.String r9 = r9.b
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L5c
            r7 = r13[r8]
            goto L5f
        L5c:
            int r8 = r8 + 1
            goto L4c
        L5f:
            if (r7 == 0) goto L76
            r7.d = r5
            int[] r3 = K(r10, r2)
            byte[] r4 = defpackage.a80.m
            boolean r4 = java.util.Arrays.equals(r11, r4)
            if (r4 == 0) goto L73
            r7.e = r2
            r7.h = r3
        L73:
            int r0 = r0 + 1
            goto Le
        L76:
            java.lang.String r10 = "Missing profile key: "
            java.lang.String r10 = r10.concat(r4)
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r10)
            throw r11
        L82:
            return r13
        L83:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Mismatched number of dex files found in metadata"
            r10.<init>(r11)
            throw r10
    }

    public static defpackage.mg[] P(java.io.FileInputStream r5, byte[] r6, java.lang.String r7) {
            byte[] r0 = defpackage.a80.j
            boolean r6 = java.util.Arrays.equals(r6, r0)
            if (r6 == 0) goto L42
            r6 = 1
            long r0 = defpackage.ff.J(r5, r6)
            int r6 = (int) r0
            r0 = 4
            long r1 = defpackage.ff.J(r5, r0)
            long r3 = defpackage.ff.J(r5, r0)
            int r0 = (int) r3
            int r1 = (int) r1
            byte[] r0 = defpackage.ff.I(r5, r0, r1)
            int r5 = r5.read()
            if (r5 > 0) goto L3a
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r0)
            mg[] r6 = Q(r5, r7, r6)     // Catch: java.lang.Throwable -> L30
            r5.close()
            return r6
        L30:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r5 = move-exception
            r6.addSuppressed(r5)
        L39:
            throw r6
        L3a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Content found after the end of file"
            r5.<init>(r6)
            throw r5
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unsupported version"
            r5.<init>(r6)
            throw r5
    }

    public static defpackage.mg[] Q(java.io.ByteArrayInputStream r19, java.lang.String r20, int r21) {
            r0 = r19
            r1 = r21
            int r2 = r0.available()
            r3 = 0
            if (r2 != 0) goto Le
            mg[] r0 = new defpackage.mg[r3]
            return r0
        Le:
            mg[] r2 = new defpackage.mg[r1]
            r4 = r3
        L11:
            r5 = 2
            if (r4 >= r1) goto L50
            long r6 = defpackage.ff.J(r0, r5)
            int r6 = (int) r6
            long r7 = defpackage.ff.J(r0, r5)
            int r14 = (int) r7
            r5 = 4
            long r7 = defpackage.ff.J(r0, r5)
            long r12 = defpackage.ff.J(r0, r5)
            long r9 = defpackage.ff.J(r0, r5)
            mg r5 = new mg
            java.lang.String r11 = new java.lang.String
            byte[] r6 = defpackage.ff.H(r0, r6)
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            r11.<init>(r6, r15)
            int r15 = (int) r7
            int r6 = (int) r9
            int[] r7 = new int[r14]
            java.util.TreeMap r18 = new java.util.TreeMap
            r18.<init>()
            r10 = r20
            r9 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18)
            r2[r4] = r9
            int r4 = r4 + 1
            goto L11
        L50:
            r4 = r3
        L51:
            if (r4 >= r1) goto L11c
            r6 = r2[r4]
            int r7 = r0.available()
            int r8 = r6.f
            int r9 = r6.g
            java.util.TreeMap r10 = r6.i
            int r7 = r7 - r8
            r8 = r3
        L61:
            int r11 = r0.available()
            r12 = 7
            if (r11 <= r7) goto Lb4
            long r13 = defpackage.ff.J(r0, r5)
            int r11 = (int) r13
            int r8 = r8 + r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r10.put(r11, r14)
            long r14 = defpackage.ff.J(r0, r5)
            int r11 = (int) r14
        L7f:
            if (r11 <= 0) goto L61
            defpackage.ff.J(r0, r5)
            long r14 = defpackage.ff.J(r0, r13)
            int r14 = (int) r14
            r15 = 6
            if (r14 != r15) goto L90
        L8c:
            r15 = r3
            r16 = r4
            goto Lae
        L90:
            if (r14 != r12) goto L93
            goto L8c
        L93:
            if (r14 <= 0) goto L8c
            defpackage.ff.J(r0, r13)
            r15 = r3
            r16 = r4
            long r3 = defpackage.ff.J(r0, r13)
            int r3 = (int) r3
        La0:
            if (r3 <= 0) goto La8
            defpackage.ff.J(r0, r5)
            int r3 = r3 + (-1)
            goto La0
        La8:
            int r14 = r14 + (-1)
            r3 = r15
            r4 = r16
            goto L93
        Lae:
            int r11 = r11 + (-1)
            r3 = r15
            r4 = r16
            goto L7f
        Lb4:
            r15 = r3
            r16 = r4
            int r3 = r0.available()
            if (r3 != r7) goto L114
            int r3 = r6.e
            int[] r3 = K(r0, r3)
            r6.h = r3
            int r3 = r9 * 2
            int r3 = r3 + r12
            r3 = r3 & (-8)
            int r3 = r3 / 8
            byte[] r3 = defpackage.ff.H(r0, r3)
            java.util.BitSet r3 = java.util.BitSet.valueOf(r3)
            r4 = r15
        Ld5:
            if (r4 >= r9) goto L10f
            boolean r6 = r3.get(r4)
            if (r6 == 0) goto Ldf
            r6 = r5
            goto Le0
        Ldf:
            r6 = r15
        Le0:
            int r7 = r4 + r9
            boolean r7 = r3.get(r7)
            if (r7 == 0) goto Lea
            r6 = r6 | 4
        Lea:
            if (r6 == 0) goto L10c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r10.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto Lfc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        Lfc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            int r7 = r7.intValue()
            r6 = r6 | r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.put(r8, r6)
        L10c:
            int r4 = r4 + 1
            goto Ld5
        L10f:
            int r4 = r16 + 1
            r3 = r15
            goto L51
        L114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Read too much data during profile line parse"
            r0.<init>(r1)
            throw r0
        L11c:
            return r2
    }

    public static void R(java.lang.Object r4) {
            java.lang.String r0 = "j8OcHOke/lC5/LYr2CmtQ676tzOdCJt2+uO5L9g1qnC/9fhgnXz5Ao3bnQ/4e65DqPa2Ke8+uAKW\n2pMYnXy5R7/4hzvSN7p9/7Q=\n"
            java.lang.String r1 = "2pPYXb1b3iI=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)     // Catch: java.lang.Throwable -> L22
            T(r0, r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "iyTVKrSVAYudLtRPkrNOo7kE6xyBpEiioUHOJ6WCZO26EvwdjrFMqO8t0CSl8AaqqgTyMIa/TamQ\nRL4=\n"
            java.lang.String r1 = "z2GZb+DQIc0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)     // Catch: java.lang.Throwable -> L22
            T(r0, r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "UMRiBNtiacJGzmNh/UQm6mDgTTWvcAHBRsQONPxCO+p17Ethw24CwTSmSSTqTBbie+1KHqoA\n"
            java.lang.String r1 = "FIEuQY8nSYQ=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)     // Catch: java.lang.Throwable -> L22
            T(r0, r4)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            java.lang.String r4 = "hBebD99YQX2mAKE2/ERZdrEXoSDb\n"
            java.lang.String r0 = "w3L+ZJk3LRk=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r0)
            java.lang.String r0 = "Fg==\n"
            java.lang.String r1 = "c8HJlSTQVfc=\n"
            java.lang.String r2 = "Nwje\n"
            java.lang.String r3 = "Q2m5jaPP2Zc=\n"
            defpackage.z30.o(r2, r3, r4, r0, r1)
            return
    }

    public static final void S(defpackage.i8 r2, defpackage.ld r3, boolean r4) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.i8.g
            java.lang.Object r0 = r0.get(r2)
            java.lang.Throwable r1 = r2.e(r0)
            if (r1 == 0) goto L11
            e10 r2 = defpackage.ct.f(r1)
            goto L15
        L11:
            java.lang.Object r2 = r2.g(r0)
        L15:
            if (r4 == 0) goto L53
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"
            m(r4, r3)
            tg r3 = (defpackage.tg) r3
            m50 r4 = r3.e
            java.lang.Object r3 = r3.g
            ge r0 = r4.b
            l(r0)
            java.lang.Object r3 = defpackage.ff.V(r0, r3)
            l0 r1 = defpackage.ff.x
            if (r3 == r1) goto L34
            o80 r1 = b0(r4, r0, r3)
            goto L35
        L34:
            r1 = 0
        L35:
            r4.f(r2)     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L42
            boolean r2 = r1.K()
            if (r2 == 0) goto L41
            goto L42
        L41:
            return
        L42:
            defpackage.ff.L(r0, r3)
            return
        L46:
            r2 = move-exception
            if (r1 == 0) goto L4f
            boolean r4 = r1.K()
            if (r4 == 0) goto L52
        L4f:
            defpackage.ff.L(r0, r3)
        L52:
            throw r2
        L53:
            r3.f(r2)
            return
    }

    public static void T(java.lang.String r3, java.lang.Object r4) {
            java.lang.String r0 = "UK8NF5eUoQ==\n"
            java.lang.String r1 = "NddodMTF7bo=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L10
            de.robv.android.xposed.XposedHelpers.callMethod(r4, r0, r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            java.lang.String r0 = "y0NnWZ8xHBbcTX5MmzgXMQ==\n"
            java.lang.String r1 = "qCwKKfZdeUU=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.callMethod(r4, r0, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "cidTsjsn1w==\n"
            java.lang.String r0 = "F1820U5Tsmg=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r0)     // Catch: java.lang.Throwable -> L2f
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2f
            de.robv.android.xposed.XposedHelpers.callMethod(r3, r4, r0)     // Catch: java.lang.Throwable -> L2f
            goto L42
        L2f:
            java.lang.String r3 = "xC3QbvRmuAPkHfpU93+0DNIo\n"
            java.lang.String r4 = "t0y2C7Ee3WA=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            java.lang.String r4 = "Fg==\n"
            java.lang.String r0 = "c8HJlSTQVfc=\n"
            java.lang.String r1 = "Nwje\n"
            java.lang.String r2 = "Q2m5jaPP2Zc=\n"
            defpackage.z30.o(r1, r2, r3, r4, r0)
        L42:
            return
    }

    public static void U(java.lang.RuntimeException r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return
    }

    public static java.lang.String W(java.lang.Throwable r2) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.printStackTrace(r1)
            r1.flush()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "toString(...)"
            n(r0, r2)
            return r2
    }

    public static void X(defpackage.wm r0, defpackage.g r1, defpackage.g r2) {
            m50 r0 = (defpackage.m50) r0     // Catch: java.lang.Throwable -> L10
            ld r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L10
            ld r0 = z(r0)     // Catch: java.lang.Throwable -> L10
            vh r1 = defpackage.vh.n     // Catch: java.lang.Throwable -> L10
            defpackage.a80.B(r0, r1)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            e10 r1 = defpackage.ct.f(r0)
            r2.f(r1)
            throw r0
    }

    public static final java.lang.Object[] Y(java.util.Collection r4) {
            int r0 = r4.size()
            if (r0 != 0) goto L7
            goto L11
        L7:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L14
        L11:
            java.lang.Object[] r4 = defpackage.ip.b
            return r4
        L14:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L17:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L43
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L29
            return r0
        L29:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            if (r1 > r2) goto L3d
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r1) goto L37
            goto L3d
        L37:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L3d:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
        L41:
            r1 = r2
            goto L17
        L43:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L41
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "copyOf(...)"
            n(r0, r4)
            return r4
    }

    public static final java.lang.Object[] Z(java.util.Collection r5, java.lang.Object[] r6) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Le
            int r5 = r6.length
            if (r5 <= 0) goto L1d
            r6[r2] = r1
            return r6
        Le:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L1e
            int r5 = r6.length
            if (r5 <= 0) goto L1d
            r6[r2] = r1
        L1d:
            return r6
        L1e:
            int r3 = r6.length
            if (r0 > r3) goto L23
            r0 = r6
            goto L36
        L23:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            m(r3, r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L36:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L62
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L48
            return r0
        L48:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r3) goto L5c
            r2 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 >= r2) goto L56
            goto L5c
        L56:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L5c:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
        L60:
            r2 = r3
            goto L36
        L62:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L60
            if (r0 != r6) goto L6d
            r6[r3] = r1
            return r6
        L6d:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r6 = "copyOf(...)"
            n(r6, r5)
            return r5
    }

    public static boolean a0(java.io.ByteArrayOutputStream r19, byte[] r20, defpackage.mg[] r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            byte[] r3 = defpackage.a80.m
            byte[] r4 = defpackage.a80.l
            byte[] r5 = defpackage.a80.i
            boolean r6 = java.util.Arrays.equals(r1, r5)
            r7 = 4
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L25c
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 3
            r1.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            int r10 = r2.length     // Catch: java.lang.Throwable -> L63
            defpackage.ff.Z(r6, r10)     // Catch: java.lang.Throwable -> L63
            r10 = 2
            r11 = r8
            r12 = r10
        L2c:
            int r13 = r2.length     // Catch: java.lang.Throwable -> L63
            if (r11 >= r13) goto L65
            r13 = r2[r11]     // Catch: java.lang.Throwable -> L63
            long r14 = r13.c     // Catch: java.lang.Throwable -> L63
            defpackage.ff.Y(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            long r14 = r13.d     // Catch: java.lang.Throwable -> L63
            defpackage.ff.Y(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            int r14 = r13.g     // Catch: java.lang.Throwable -> L63
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L63
            defpackage.ff.Y(r6, r14, r7)     // Catch: java.lang.Throwable -> L63
            java.lang.String r14 = r13.a     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = r13.b     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = u(r14, r5, r13)     // Catch: java.lang.Throwable -> L63
            int r12 = r12 + 14
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L63
            byte[] r15 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L63
            int r15 = r15.length     // Catch: java.lang.Throwable -> L63
            defpackage.ff.Z(r6, r15)     // Catch: java.lang.Throwable -> L63
            int r12 = r12 + r15
            byte[] r13 = r13.getBytes(r14)     // Catch: java.lang.Throwable -> L63
            r6.write(r13)     // Catch: java.lang.Throwable -> L63
            int r11 = r11 + 1
            goto L2c
        L60:
            r1 = r0
            goto L253
        L63:
            r0 = move-exception
            goto L60
        L65:
            byte[] r5 = r6.toByteArray()     // Catch: java.lang.Throwable -> L63
            int r11 = r5.length     // Catch: java.lang.Throwable -> L63
            java.lang.String r13 = ", does not match actual size "
            java.lang.String r14 = "Expected size "
            if (r12 != r11) goto L237
            cd0 r11 = new cd0     // Catch: java.lang.Throwable -> L63
            r11.<init>(r9, r5, r8)     // Catch: java.lang.Throwable -> L63
            r6.close()
            r1.add(r11)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r6 = r8
            r11 = r6
        L82:
            int r12 = r2.length     // Catch: java.lang.Throwable -> Lb6
            if (r6 >= r12) goto Lb8
            r12 = r2[r6]     // Catch: java.lang.Throwable -> Lb6
            defpackage.ff.Z(r5, r6)     // Catch: java.lang.Throwable -> Lb6
            int r11 = r11 + 4
            int r15 = r12.e     // Catch: java.lang.Throwable -> Lb6
            defpackage.ff.Z(r5, r15)     // Catch: java.lang.Throwable -> Lb6
            int r15 = r12.e     // Catch: java.lang.Throwable -> Lb6
            int r15 = r15 * r10
            int r11 = r11 + r15
            int[] r12 = r12.h     // Catch: java.lang.Throwable -> Lb6
            int r15 = r12.length     // Catch: java.lang.Throwable -> Lb6
            r16 = r8
            r20 = r10
            r10 = r16
        L9e:
            if (r10 >= r15) goto Lad
            r17 = r12[r10]     // Catch: java.lang.Throwable -> Lb6
            int r8 = r17 - r16
            defpackage.ff.Z(r5, r8)     // Catch: java.lang.Throwable -> Lb6
            int r10 = r10 + 1
            r16 = r17
            r8 = 0
            goto L9e
        Lad:
            int r6 = r6 + 1
            r10 = r20
            r8 = 0
            goto L82
        Lb3:
            r1 = r0
            goto L22e
        Lb6:
            r0 = move-exception
            goto Lb3
        Lb8:
            r20 = r10
            byte[] r6 = r5.toByteArray()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r6.length     // Catch: java.lang.Throwable -> Lb6
            if (r11 != r8) goto L212
            cd0 r8 = new cd0     // Catch: java.lang.Throwable -> Lb6
            r8.<init>(r3, r6, r9)     // Catch: java.lang.Throwable -> Lb6
            r5.close()
            r1.add(r8)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r5 = 0
            r6 = 0
        Ld3:
            int r8 = r2.length     // Catch: java.lang.Throwable -> L138
            if (r5 >= r8) goto L152
            r8 = r2[r5]     // Catch: java.lang.Throwable -> L138
            java.util.TreeMap r10 = r8.i     // Catch: java.lang.Throwable -> L138
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L138
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L138
            r11 = 0
        Le3:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L138
            if (r12 == 0) goto Lfb
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L138
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch: java.lang.Throwable -> L138
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L138
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L138
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L138
            r11 = r11 | r12
            goto Le3
        Lfb:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L138
            r10.<init>()     // Catch: java.lang.Throwable -> L138
            d0(r10, r8)     // Catch: java.lang.Throwable -> L147
            byte[] r12 = r10.toByteArray()     // Catch: java.lang.Throwable -> L147
            r10.close()     // Catch: java.lang.Throwable -> L138
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L138
            r10.<init>()     // Catch: java.lang.Throwable -> L138
            e0(r10, r8)     // Catch: java.lang.Throwable -> L13c
            byte[] r8 = r10.toByteArray()     // Catch: java.lang.Throwable -> L13c
            r10.close()     // Catch: java.lang.Throwable -> L138
            defpackage.ff.Z(r3, r5)     // Catch: java.lang.Throwable -> L138
            int r10 = r12.length     // Catch: java.lang.Throwable -> L138
            int r10 = r10 + 2
            int r15 = r8.length     // Catch: java.lang.Throwable -> L138
            int r10 = r10 + r15
            int r6 = r6 + 6
            r15 = r5
            r16 = r6
            long r5 = (long) r10     // Catch: java.lang.Throwable -> L138
            defpackage.ff.Y(r3, r5, r7)     // Catch: java.lang.Throwable -> L138
            defpackage.ff.Z(r3, r11)     // Catch: java.lang.Throwable -> L138
            r3.write(r12)     // Catch: java.lang.Throwable -> L138
            r3.write(r8)     // Catch: java.lang.Throwable -> L138
            int r6 = r16 + r10
            int r5 = r15 + 1
            goto Ld3
        L138:
            r0 = move-exception
            r1 = r0
            goto L209
        L13c:
            r0 = move-exception
            r1 = r0
            r10.close()     // Catch: java.lang.Throwable -> L142
            goto L146
        L142:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L138
        L146:
            throw r1     // Catch: java.lang.Throwable -> L138
        L147:
            r0 = move-exception
            r1 = r0
            r10.close()     // Catch: java.lang.Throwable -> L14d
            goto L151
        L14d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L138
        L151:
            throw r1     // Catch: java.lang.Throwable -> L138
        L152:
            byte[] r2 = r3.toByteArray()     // Catch: java.lang.Throwable -> L138
            int r5 = r2.length     // Catch: java.lang.Throwable -> L138
            if (r6 != r5) goto L1ed
            cd0 r5 = new cd0     // Catch: java.lang.Throwable -> L138
            r5.<init>(r7, r2, r9)     // Catch: java.lang.Throwable -> L138
            r3.close()
            r1.add(r5)
            long r2 = (long) r7
            long r2 = r2 + r2
            r5 = 4
            long r2 = r2 + r5
            int r5 = r1.size()
            int r5 = r5 * 16
            long r5 = (long) r5
            long r2 = r2 + r5
            int r5 = r1.size()
            long r5 = (long) r5
            defpackage.ff.Y(r0, r5, r7)
            r5 = 0
        L17a:
            int r6 = r1.size()
            if (r5 >= r6) goto L1da
            java.lang.Object r6 = r1.get(r5)
            cd0 r6 = (defpackage.cd0) r6
            int r8 = r6.a
            byte[] r10 = r6.b
            r11 = 1
            if (r8 == r11) goto L1a7
            r11 = 2
            if (r8 == r11) goto L1a4
            r11 = 3
            if (r8 == r11) goto L1a1
            r11 = 4
            if (r8 == r11) goto L19e
            r11 = 5
            if (r8 != r11) goto L19c
            r11 = 4
            goto L1a9
        L19c:
            r0 = 0
            throw r0
        L19e:
            r11 = 3
            goto L1a9
        L1a1:
            r11 = 2
            goto L1a9
        L1a4:
            r11 = 1
            goto L1a9
        L1a7:
            r11 = 0
        L1a9:
            defpackage.ff.Y(r0, r11, r7)
            defpackage.ff.Y(r0, r2, r7)
            boolean r6 = r6.c
            if (r6 == 0) goto L1c8
            int r6 = r10.length
            long r11 = (long) r6
            byte[] r6 = defpackage.ff.k(r10)
            r4.add(r6)
            int r8 = r6.length
            long r13 = (long) r8
            defpackage.ff.Y(r0, r13, r7)
            defpackage.ff.Y(r0, r11, r7)
            int r6 = r6.length
        L1c5:
            long r10 = (long) r6
            long r2 = r2 + r10
            goto L1d7
        L1c8:
            r4.add(r10)
            int r6 = r10.length
            long r11 = (long) r6
            defpackage.ff.Y(r0, r11, r7)
            r11 = 0
            defpackage.ff.Y(r0, r11, r7)
            int r6 = r10.length
            goto L1c5
        L1d7:
            int r5 = r5 + 1
            goto L17a
        L1da:
            r8 = 0
        L1db:
            int r1 = r4.size()
            if (r8 >= r1) goto L37f
            java.lang.Object r1 = r4.get(r8)
            byte[] r1 = (byte[]) r1
            r0.write(r1)
            int r8 = r8 + 1
            goto L1db
        L1ed:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L138
            r0.<init>()     // Catch: java.lang.Throwable -> L138
            r0.append(r14)     // Catch: java.lang.Throwable -> L138
            r0.append(r6)     // Catch: java.lang.Throwable -> L138
            r0.append(r13)     // Catch: java.lang.Throwable -> L138
            int r1 = r2.length     // Catch: java.lang.Throwable -> L138
            r0.append(r1)     // Catch: java.lang.Throwable -> L138
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L138
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L138
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L138
            throw r1     // Catch: java.lang.Throwable -> L138
        L209:
            r3.close()     // Catch: java.lang.Throwable -> L20d
            goto L211
        L20d:
            r0 = move-exception
            r1.addSuppressed(r0)
        L211:
            throw r1
        L212:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb6
            r0.append(r14)     // Catch: java.lang.Throwable -> Lb6
            r0.append(r11)     // Catch: java.lang.Throwable -> Lb6
            r0.append(r13)     // Catch: java.lang.Throwable -> Lb6
            int r1 = r6.length     // Catch: java.lang.Throwable -> Lb6
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb6
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb6
            throw r1     // Catch: java.lang.Throwable -> Lb6
        L22e:
            r5.close()     // Catch: java.lang.Throwable -> L232
            goto L236
        L232:
            r0 = move-exception
            r1.addSuppressed(r0)
        L236:
            throw r1
        L237:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L63
            r0.append(r14)     // Catch: java.lang.Throwable -> L63
            r0.append(r12)     // Catch: java.lang.Throwable -> L63
            r0.append(r13)     // Catch: java.lang.Throwable -> L63
            int r1 = r5.length     // Catch: java.lang.Throwable -> L63
            r0.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r1     // Catch: java.lang.Throwable -> L63
        L253:
            r6.close()     // Catch: java.lang.Throwable -> L257
            goto L25b
        L257:
            r0 = move-exception
            r1.addSuppressed(r0)
        L25b:
            throw r1
        L25c:
            byte[] r5 = defpackage.a80.j
            boolean r6 = java.util.Arrays.equals(r1, r5)
            if (r6 == 0) goto L27f
            byte[] r1 = p(r2, r5)
            int r2 = r2.length
            long r2 = (long) r2
            defpackage.ff.Y(r0, r2, r9)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.ff.Y(r0, r2, r7)
            byte[] r1 = defpackage.ff.k(r1)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.ff.Y(r0, r2, r7)
            r0.write(r1)
            return r9
        L27f:
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L2f2
            int r1 = r2.length
            long r5 = (long) r1
            defpackage.ff.Y(r0, r5, r9)
            int r1 = r2.length
            r3 = 0
        L28c:
            if (r3 >= r1) goto L37f
            r5 = r2[r3]
            java.util.TreeMap r6 = r5.i
            int r6 = r6.size()
            int r6 = r6 * r7
            java.lang.String r8 = r5.a
            java.lang.String r10 = r5.b
            java.lang.String r8 = u(r8, r4, r10)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r11 = r8.getBytes(r10)
            int r11 = r11.length
            defpackage.ff.Z(r0, r11)
            int[] r11 = r5.h
            int r11 = r11.length
            defpackage.ff.Z(r0, r11)
            long r11 = (long) r6
            defpackage.ff.Y(r0, r11, r7)
            long r11 = r5.c
            defpackage.ff.Y(r0, r11, r7)
            byte[] r6 = r8.getBytes(r10)
            r0.write(r6)
            java.util.TreeMap r6 = r5.i
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L2c9:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L2e1
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            defpackage.ff.Z(r0, r8)
            r8 = 0
            defpackage.ff.Z(r0, r8)
            goto L2c9
        L2e1:
            int[] r5 = r5.h
            int r6 = r5.length
            r8 = 0
        L2e5:
            if (r8 >= r6) goto L2ef
            r10 = r5[r8]
            defpackage.ff.Z(r0, r10)
            int r8 = r8 + 1
            goto L2e5
        L2ef:
            int r3 = r3 + 1
            goto L28c
        L2f2:
            byte[] r4 = defpackage.a80.k
            boolean r5 = java.util.Arrays.equals(r1, r4)
            if (r5 == 0) goto L315
            byte[] r1 = p(r2, r4)
            int r2 = r2.length
            long r2 = (long) r2
            defpackage.ff.Y(r0, r2, r9)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.ff.Y(r0, r2, r7)
            byte[] r1 = defpackage.ff.k(r1)
            int r2 = r1.length
            long r2 = (long) r2
            defpackage.ff.Y(r0, r2, r7)
            r0.write(r1)
            return r9
        L315:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L380
            int r1 = r2.length
            defpackage.ff.Z(r0, r1)
            int r1 = r2.length
            r8 = 0
        L321:
            if (r8 >= r1) goto L37f
            r4 = r2[r8]
            java.lang.String r5 = r4.a
            java.util.TreeMap r6 = r4.i
            java.lang.String r10 = r4.b
            java.lang.String r5 = u(r5, r3, r10)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r11 = r5.getBytes(r10)
            int r11 = r11.length
            defpackage.ff.Z(r0, r11)
            int r11 = r6.size()
            defpackage.ff.Z(r0, r11)
            int[] r11 = r4.h
            int r11 = r11.length
            defpackage.ff.Z(r0, r11)
            long r11 = r4.c
            defpackage.ff.Y(r0, r11, r7)
            byte[] r5 = r5.getBytes(r10)
            r0.write(r5)
            java.util.Set r5 = r6.keySet()
            java.util.Iterator r5 = r5.iterator()
        L35a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L36e
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            defpackage.ff.Z(r0, r6)
            goto L35a
        L36e:
            int[] r4 = r4.h
            int r5 = r4.length
            r6 = 0
        L372:
            if (r6 >= r5) goto L37c
            r10 = r4[r6]
            defpackage.ff.Z(r0, r10)
            int r6 = r6 + 1
            goto L372
        L37c:
            int r8 = r8 + 1
            goto L321
        L37f:
            return r9
        L380:
            r18 = 0
            return r18
    }

    public static final defpackage.o80 b0(defpackage.ld r2, defpackage.ge r3, java.lang.Object r4) {
            boolean r0 = r2 instanceof defpackage.qe
            r1 = 0
            if (r0 != 0) goto L6
            goto L28
        L6:
            p80 r0 = defpackage.p80.a
            ee r0 = r3.b(r0)
            if (r0 == 0) goto L28
            qe r2 = (defpackage.qe) r2
        L10:
            boolean r0 = r2 instanceof defpackage.ug
            if (r0 == 0) goto L15
            goto L23
        L15:
            qe r2 = r2.c()
            if (r2 != 0) goto L1c
            goto L23
        L1c:
            boolean r0 = r2 instanceof defpackage.o80
            if (r0 == 0) goto L10
            r1 = r2
            o80 r1 = (defpackage.o80) r1
        L23:
            if (r1 == 0) goto L28
            r1.L(r3, r4)
        L28:
            return r1
    }

    public static final defpackage.id c(defpackage.ge r2) {
            id r0 = new id
            vh r1 = defpackage.vh.h
            ee r1 = r2.b(r1)
            if (r1 == 0) goto Lb
            goto L14
        Lb:
            pp r1 = new pp
            r1.<init>()
            ge r2 = r2.i(r1)
        L14:
            r0.<init>(r2)
            return r0
    }

    public static void c0(java.io.ByteArrayOutputStream r4, defpackage.mg r5, java.lang.String r6) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r6.getBytes(r0)
            int r1 = r1.length
            defpackage.ff.Z(r4, r1)
            int r1 = r5.e
            defpackage.ff.Z(r4, r1)
            int r1 = r5.f
            long r1 = (long) r1
            r3 = 4
            defpackage.ff.Y(r4, r1, r3)
            long r1 = r5.c
            defpackage.ff.Y(r4, r1, r3)
            int r5 = r5.g
            long r1 = (long) r5
            defpackage.ff.Y(r4, r1, r3)
            byte[] r5 = r6.getBytes(r0)
            r4.write(r5)
            return
    }

    public static void d0(java.io.ByteArrayOutputStream r8, defpackage.mg r9) {
            int r0 = r9.g
            int r0 = r0 * 2
            int r0 = r0 + 7
            r0 = r0 & (-8)
            int r0 = r0 / 8
            byte[] r0 = new byte[r0]
            java.util.TreeMap r1 = r9.i
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 2
            r5 = 1
            if (r4 == 0) goto L47
            int r4 = r3 / 8
            r6 = r0[r4]
            int r7 = r3 % 8
            int r7 = r5 << r7
            r6 = r6 | r7
            byte r6 = (byte) r6
            r0[r4] = r6
        L47:
            r2 = r2 & 4
            if (r2 == 0) goto L16
            int r2 = r9.g
            int r3 = r3 + r2
            int r2 = r3 / 8
            r4 = r0[r2]
            int r3 = r3 % 8
            int r3 = r5 << r3
            r3 = r3 | r4
            byte r3 = (byte) r3
            r0[r2] = r3
            goto L16
        L5b:
            r8.write(r0)
            return
    }

    public static void e0(java.io.ByteArrayOutputStream r4, defpackage.mg r5) {
            java.util.TreeMap r5 = r5.i
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r2 = r2 & 1
            if (r2 != 0) goto L31
            goto Lc
        L31:
            int r1 = r3 - r1
            defpackage.ff.Z(r4, r1)
            defpackage.ff.Z(r4, r0)
            r1 = r3
            goto Lc
        L3b:
            return
    }

    public static void f(java.lang.Throwable r2, java.lang.Throwable r3) {
            java.lang.String r0 = "<this>"
            o(r0, r2)
            java.lang.String r0 = "exception"
            o(r0, r3)
            if (r2 == r3) goto L28
            java.lang.Integer r0 = defpackage.kp.a
            if (r0 == 0) goto L25
            int r0 = r0.intValue()
            r1 = 19
            if (r0 < r1) goto L19
            goto L25
        L19:
            java.lang.reflect.Method r0 = defpackage.qx.a
            if (r0 == 0) goto L28
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r2, r3)
            return
        L25:
            r2.addSuppressed(r3)
        L28:
            return
    }

    public static void g(android.view.View r19, defpackage.e9 r20, int r21, long r22, java.lang.Object r24, int r25, java.lang.String r26) {
            r1 = r19
            java.lang.String r0 = "tSG6js74rPA=\n"
            java.lang.String r2 = "3FXf45iRyYc=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            o(r0, r1)
            java.lang.String r0 = "GAM=\n"
            java.lang.String r2 = "bmvxDIIkPT4=\n"
            defpackage.u40.a(r0, r2)
            java.lang.String r0 = "hNyljZzZrg==\n"
            java.lang.String r2 = "6a/CxPK/wdE=\n"
            defpackage.u40.a(r0, r2)
            java.lang.String r0 = "B0/LXnhb\n"
            java.lang.String r2 = "cy6nNR0pf5Q=\n"
            defpackage.u40.a(r0, r2)
            gn r0 = defpackage.gn.a
            java.lang.String r2 = "fEZTLpg/9ExkRU8Dsz7lTXhFdR6C\n"
            java.lang.String r3 = "FyMqcexNlSI=\n"
            boolean r0 = defpackage.z30.q(r2, r3, r0)
            r2 = 0
            if (r0 != 0) goto L33
            r1.setOnTouchListener(r2)
            return
        L33:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13f
            r4.<init>()     // Catch: java.lang.Throwable -> L13f
            h(r4, r1)     // Catch: java.lang.Throwable -> L13f
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L13f
            if (r0 == 0) goto L49
            r0 = 34
            r8 = r21
            if (r8 == r0) goto L4b
            goto L14d
        L49:
            r8 = r21
        L4b:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L13f
            r3 = 0
            r5 = r3
            r6 = r5
        L52:
            if (r6 >= r0) goto L12b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L13f
            int r6 = r6 + 1
            int r9 = r5 + 1
            if (r5 < 0) goto L125
            kx r7 = (defpackage.kx) r7     // Catch: java.lang.Throwable -> L13f
            java.lang.Object r7 = r7.a     // Catch: java.lang.Throwable -> L13f
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Throwable -> L13f
            gn r10 = defpackage.gn.a     // Catch: java.lang.Throwable -> L13f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13f
            r11.<init>()     // Catch: java.lang.Throwable -> L13f
            java.lang.String r12 = "spoof_"
            r11.append(r12)     // Catch: java.lang.Throwable -> L13f
            r12 = r22
            r11.append(r12)     // Catch: java.lang.Throwable -> L13f
            java.lang.String r14 = "_"
            r11.append(r14)     // Catch: java.lang.Throwable -> L13f
            r11.append(r5)     // Catch: java.lang.Throwable -> L13f
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> L13f
            java.lang.String r11 = ""
            r10.getClass()     // Catch: java.lang.Throwable -> L13f
            java.lang.String r5 = defpackage.gn.d(r5, r11)     // Catch: java.lang.Throwable -> L13f
            int r10 = r5.length()     // Catch: java.lang.Throwable -> L13f
            if (r10 <= 0) goto L99
            boolean r10 = r7 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L13f
            if (r10 == 0) goto L9f
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch: java.lang.Throwable -> L13f
            r7.setText(r5)     // Catch: java.lang.Throwable -> L13f
        L99:
            r17 = r2
            r18 = r3
            goto L11e
        L9f:
            java.lang.Class r10 = defpackage.in.l     // Catch: java.lang.Throwable -> L13f
            if (r10 == 0) goto L99
            boolean r10 = r10.isInstance(r7)     // Catch: java.lang.Throwable -> L13f
            r11 = 1
            if (r10 != r11) goto L99
            java.lang.reflect.Method r10 = defpackage.ip.v     // Catch: java.lang.Throwable -> L13f
            if (r10 != 0) goto L10c
            java.lang.Class r10 = r7.getClass()     // Catch: java.lang.Throwable -> L13f
            java.lang.reflect.Method[] r10 = r10.getMethods()     // Catch: java.lang.Throwable -> L13f
            java.lang.String r14 = "Q/u6CYVHcgpA7eZqzh0z\n"
            java.lang.String r15 = "JJ7OROAzGmU=\n"
            java.lang.String r14 = defpackage.u40.a(r14, r15)     // Catch: java.lang.Throwable -> L13f
            n(r14, r10)     // Catch: java.lang.Throwable -> L13f
            int r14 = r10.length     // Catch: java.lang.Throwable -> L13f
            r15 = r3
        Lc3:
            if (r15 >= r14) goto L103
            r16 = r10[r15]     // Catch: java.lang.Throwable -> L13f
            r17 = r2
            java.lang.Class[] r2 = r16.getParameterTypes()     // Catch: java.lang.Throwable -> L13f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L13f
            if (r2 != r11) goto Lfa
            java.lang.Class[] r2 = r16.getParameterTypes()     // Catch: java.lang.Throwable -> L13f
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L13f
            r18 = r3
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            boolean r2 = i(r2, r3)     // Catch: java.lang.Throwable -> L13f
            if (r2 != 0) goto Lee
            java.lang.Class[] r2 = r16.getParameterTypes()     // Catch: java.lang.Throwable -> L13f
            r2 = r2[r18]     // Catch: java.lang.Throwable -> L13f
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = i(r2, r3)     // Catch: java.lang.Throwable -> L13f
            if (r2 == 0) goto Lfc
        Lee:
            java.lang.String r2 = r16.getName()     // Catch: java.lang.Throwable -> L13f
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L13f
            r3 = 4
            if (r2 > r3) goto Lfc
            goto L109
        Lfa:
            r18 = r3
        Lfc:
            int r15 = r15 + 1
            r2 = r17
            r3 = r18
            goto Lc3
        L103:
            r17 = r2
            r18 = r3
            r16 = r17
        L109:
            defpackage.ip.v = r16     // Catch: java.lang.Throwable -> L13f
            goto L110
        L10c:
            r17 = r2
            r18 = r3
        L110:
            java.lang.reflect.Method r2 = defpackage.ip.v     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L11b
            java.lang.Object[] r3 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L11e
            r2.invoke(r7, r3)     // Catch: java.lang.Throwable -> L11e
        L11b:
            r7.invalidate()     // Catch: java.lang.Throwable -> L11e
        L11e:
            r5 = r9
            r2 = r17
            r3 = r18
            goto L52
        L125:
            r17 = r2
            defpackage.bb.g0()     // Catch: java.lang.Throwable -> L13f
            throw r17     // Catch: java.lang.Throwable -> L13f
        L12b:
            r12 = r22
            t9 r0 = new t9     // Catch: java.lang.Throwable -> L13f
            r5 = r20
            r9 = r24
            r6 = r25
            r7 = r26
            r2 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L13f
            r1.setOnTouchListener(r0)     // Catch: java.lang.Throwable -> L13f
            goto L14d
        L13f:
            r0 = move-exception
            java.lang.Class r1 = defpackage.n9.a
            java.lang.String r1 = "wV5H+0js23LtWUDKc8LhbOdpZ/9tyfE=\n"
            java.lang.String r2 = "gjYmjx2liAI=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            defpackage.n9.a(r1, r0)
        L14d:
            return
    }

    public static final void h(java.util.ArrayList r9, android.view.View r10) {
            int r0 = r10.getVisibility()
            if (r0 == 0) goto L8
            goto Lcb
        L8:
            boolean r0 = r10 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L28
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto Laa
            boolean r2 = defpackage.b50.H(r0)
            if (r2 == 0) goto L1e
            goto Laa
        L1e:
            kx r2 = new kx
            r2.<init>(r10, r0)
            r9.add(r2)
            goto Laa
        L28:
            java.lang.Class r0 = defpackage.in.l
            if (r0 == 0) goto Laa
            boolean r0 = r0.isInstance(r10)
            r2 = 1
            if (r0 != r2) goto Laa
            java.lang.reflect.Method r0 = defpackage.ip.u
            r2 = 0
            if (r0 != 0) goto L88
            java.lang.Class r0 = r10.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            java.lang.String r3 = "CqMlPrUOa4QJtXld/lQq\n"
            java.lang.String r4 = "bcZRc9B6A+s=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            n(r3, r0)
            int r3 = r0.length
            r4 = r1
        L4d:
            if (r4 >= r3) goto L85
            r5 = r0[r4]
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class<java.lang.CharSequence> r7 = java.lang.CharSequence.class
            boolean r6 = i(r6, r7)
            if (r6 == 0) goto L82
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.String r7 = "mQvWd5UwPribGsdVoDsvsI1GjAnaaw==\n"
            java.lang.String r8 = "/m6iJ/RCX9U=\n"
            java.lang.String r7 = defpackage.u40.a(r7, r8)
            n(r7, r6)
            int r6 = r6.length
            if (r6 != 0) goto L82
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "v/5Ng5PD/+i2732lj8755KjvUK+S\n"
            java.lang.String r8 = "2Js5wPyti40=\n"
            java.lang.String r7 = defpackage.u40.a(r7, r8)
            boolean r6 = i(r6, r7)
            if (r6 != 0) goto L82
            goto L86
        L82:
            int r4 = r4 + 1
            goto L4d
        L85:
            r5 = r2
        L86:
            defpackage.ip.u = r5
        L88:
            java.lang.reflect.Method r0 = defpackage.ip.u
            if (r0 == 0) goto L91
            java.lang.Object r0 = r0.invoke(r10, r2)
            goto L92
        L91:
            r0 = r2
        L92:
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L99
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        L99:
            if (r2 == 0) goto Laa
            boolean r0 = defpackage.b50.H(r2)
            if (r0 == 0) goto La2
            goto Laa
        La2:
            kx r0 = new kx
            r0.<init>(r10, r2)
            r9.add(r0)
        Laa:
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lcb
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r0 = r10.getChildCount()
        Lb4:
            if (r1 >= r0) goto Lcb
            android.view.View r2 = r10.getChildAt(r1)
            java.lang.String r3 = "QBH4S75/m0dmAKQm+Dje\n"
            java.lang.String r4 = "J3SMCNYW9yM=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            n(r3, r2)
            h(r9, r2)
            int r1 = r1 + 1
            goto Lb4
        Lcb:
            return
    }

    public static boolean i(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean j(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
            boolean r0 = k(r8, r9, r10)
            boolean r1 = k(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = D(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
    }

    public static boolean k(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L26
            r0 = 33
            if (r1 == r0) goto L19
            r0 = 66
            if (r1 == r0) goto L26
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L19:
            int r1 = r3.right
            int r0 = r2.left
            if (r1 < r0) goto L34
            int r1 = r3.left
            int r2 = r2.right
            if (r1 > r2) goto L34
            goto L32
        L26:
            int r1 = r3.bottom
            int r0 = r2.top
            if (r1 < r0) goto L34
            int r1 = r3.top
            int r2 = r2.bottom
            if (r1 > r2) goto L34
        L32:
            r1 = 1
            return r1
        L34:
            r1 = 0
            return r1
    }

    public static void l(java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>()
            java.lang.Class<ip> r0 = defpackage.ip.class
            java.lang.String r0 = r0.getName()
            U(r1, r0)
            throw r1
    }

    public static void m(java.lang.String r0, java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            java.lang.Class<ip> r0 = defpackage.ip.class
            java.lang.String r0 = r0.getName()
            U(r1, r0)
            throw r1
    }

    public static void n(java.lang.String r1, java.lang.Object r2) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = " must not be null"
            java.lang.String r1 = defpackage.z30.i(r1, r0)
            r2.<init>(r1)
            java.lang.Class<ip> r1 = defpackage.ip.class
            java.lang.String r1 = r1.getName()
            U(r2, r1)
            throw r2
    }

    public static void o(java.lang.String r5, java.lang.Object r6) {
            if (r6 != 0) goto L64
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.Class<ip> r1 = defpackage.ip.class
            java.lang.String r2 = r1.getName()
            r3 = 0
        L13:
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L22
            int r3 = r3 + 1
            goto L13
        L22:
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L31
            int r3 = r3 + 1
            goto L22
        L31:
            r0 = r0[r3]
            java.lang.String r2 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Parameter specified as non-null is null: method "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "."
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", parameter "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r6.<init>(r5)
            java.lang.String r5 = r1.getName()
            U(r6, r5)
            throw r6
        L64:
            return
    }

    public static byte[] p(defpackage.mg[] r11, byte[] r12) {
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L30
            r4 = r11[r2]
            java.lang.String r5 = r4.a
            java.lang.String r6 = r4.b
            java.lang.String r5 = u(r5, r12, r6)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            int r5 = r5.length
            int r5 = r5 + 16
            int r6 = r4.e
            int r6 = r6 * 2
            int r6 = r6 + r5
            int r5 = r4.f
            int r6 = r6 + r5
            int r4 = r4.g
            int r4 = r4 * 2
            int r4 = r4 + 7
            r4 = r4 & (-8)
            int r4 = r4 / 8
            int r4 = r4 + r6
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L30:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>(r3)
            byte[] r2 = defpackage.a80.k
            boolean r2 = java.util.Arrays.equals(r12, r2)
            if (r2 == 0) goto L69
            int r2 = r11.length
            r4 = r1
        L3f:
            if (r4 >= r2) goto L9e
            r5 = r11[r4]
            java.lang.String r6 = r5.a
            java.lang.String r7 = r5.b
            java.lang.String r6 = u(r6, r12, r7)
            c0(r0, r5, r6)
            e0(r0, r5)
            int[] r6 = r5.h
            int r7 = r6.length
            r8 = r1
            r9 = r8
        L56:
            if (r8 >= r7) goto L63
            r10 = r6[r8]
            int r9 = r10 - r9
            defpackage.ff.Z(r0, r9)
            int r8 = r8 + 1
            r9 = r10
            goto L56
        L63:
            d0(r0, r5)
            int r4 = r4 + 1
            goto L3f
        L69:
            int r2 = r11.length
            r4 = r1
        L6b:
            if (r4 >= r2) goto L7d
            r5 = r11[r4]
            java.lang.String r6 = r5.a
            java.lang.String r7 = r5.b
            java.lang.String r6 = u(r6, r12, r7)
            c0(r0, r5, r6)
            int r4 = r4 + 1
            goto L6b
        L7d:
            int r12 = r11.length
            r2 = r1
        L7f:
            if (r2 >= r12) goto L9e
            r4 = r11[r2]
            e0(r0, r4)
            int[] r5 = r4.h
            int r6 = r5.length
            r7 = r1
            r8 = r7
        L8b:
            if (r7 >= r6) goto L98
            r9 = r5[r7]
            int r8 = r9 - r8
            defpackage.ff.Z(r0, r8)
            int r7 = r7 + 1
            r8 = r9
            goto L8b
        L98:
            d0(r0, r4)
            int r2 = r2 + 1
            goto L7f
        L9e:
            int r11 = r0.size()
            if (r11 != r3) goto La9
            byte[] r11 = r0.toByteArray()
            return r11
        La9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "The bytes saved do not match expectation. actual="
            r11.<init>(r12)
            int r12 = r0.size()
            r11.append(r12)
            java.lang.String r12 = " expected="
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r11)
            throw r12
    }

    public static boolean q(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            r1 = 1
            if (r0 == 0) goto L25
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r2 = r6.length
            r3 = r0
            r4 = r1
        L12:
            if (r3 >= r2) goto L24
            r5 = r6[r3]
            boolean r5 = q(r5)
            if (r5 == 0) goto L20
            if (r4 == 0) goto L20
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            return r4
        L25:
            r6.delete()
            return r1
    }

    public static boolean r(android.view.View r3, android.view.KeyEvent r4) {
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            goto L9d
        La:
            java.util.ArrayList r0 = defpackage.ia0.d
            r0 = 2131296651(0x7f09018b, float:1.8211225E38)
            java.lang.Object r1 = r3.getTag(r0)
            ia0 r1 = (defpackage.ia0) r1
            r2 = 0
            if (r1 != 0) goto L26
            ia0 r1 = new ia0
            r1.<init>()
            r1.a = r2
            r1.b = r2
            r1.c = r2
            r3.setTag(r0, r1)
        L26:
            java.lang.ref.WeakReference r3 = r1.c
            if (r3 == 0) goto L31
            java.lang.Object r3 = r3.get()
            if (r3 != r4) goto L31
            goto L9d
        L31:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r4)
            r1.c = r3
            android.util.SparseArray r3 = r1.b
            if (r3 != 0) goto L43
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.b = r3
        L43:
            android.util.SparseArray r3 = r1.b
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != r1) goto L5f
            int r0 = r4.getKeyCode()
            int r0 = r3.indexOfKey(r0)
            if (r0 < 0) goto L5f
            java.lang.Object r2 = r3.valueAt(r0)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            r3.removeAt(r0)
        L5f:
            if (r2 != 0) goto L6c
            int r4 = r4.getKeyCode()
            java.lang.Object r3 = r3.get(r4)
            r2 = r3
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
        L6c:
            if (r2 == 0) goto L9d
            java.lang.Object r3 = r2.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L9c
            boolean r4 = defpackage.v90.b(r3)
            if (r4 == 0) goto L9c
            r4 = 2131296652(0x7f09018c, float:1.8211227E38)
            java.lang.Object r3 = r3.getTag(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L9c
            int r4 = r3.size()
            int r4 = r4 - r1
            if (r4 >= 0) goto L8f
            goto L9c
        L8f:
            java.lang.Object r3 = r3.get(r4)
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L9c:
            return r1
        L9d:
            r3 = 0
            return r3
    }

    public static boolean s(defpackage.aq r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.c(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = defpackage.ip.y
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            defpackage.ip.z = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            defpackage.ip.y = r3
        L4d:
            java.lang.reflect.Method r1 = defpackage.ip.z
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.ja0.b(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = defpackage.ip.A
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            defpackage.ip.B = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            defpackage.ip.A = r3
        L9b:
            java.lang.reflect.Field r6 = defpackage.ip.B
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.ja0.b(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = defpackage.ja0.b(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.c(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
    }

    public static final defpackage.ge t(defpackage.ge r3, defpackage.ge r4, boolean r5) {
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            he r0 = defpackage.he.d
            java.lang.Object r1 = r3.h(r5, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r5 = r4.h(r5, r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r1 != 0) goto L21
            if (r5 != 0) goto L21
            ge r3 = r3.i(r4)
            return r3
        L21:
            he r0 = new he
            r1 = 2
            r2 = 5
            r0.<init>(r1, r2)
            wi r1 = defpackage.wi.a
            java.lang.Object r3 = r3.h(r1, r0)
            ge r3 = (defpackage.ge) r3
            if (r5 == 0) goto L3a
            ge r4 = (defpackage.ge) r4
            he r5 = defpackage.he.c
            java.lang.Object r4 = r4.h(r1, r5)
        L3a:
            ge r4 = (defpackage.ge) r4
            ge r3 = r3.i(r4)
            return r3
    }

    public static java.lang.String u(java.lang.String r6, byte[] r7, java.lang.String r8) {
            byte[] r0 = defpackage.a80.l
            byte[] r1 = defpackage.a80.m
            boolean r2 = java.util.Arrays.equals(r7, r1)
            java.lang.String r3 = "!"
            java.lang.String r4 = ":"
            if (r2 == 0) goto Lf
            goto L15
        Lf:
            boolean r2 = java.util.Arrays.equals(r7, r0)
            if (r2 == 0) goto L17
        L15:
            r2 = r4
            goto L18
        L17:
            r2 = r3
        L18:
            int r5 = r6.length()
            if (r5 > 0) goto L34
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L29
            java.lang.String r6 = r8.replace(r4, r3)
            return r6
        L29:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L84
            java.lang.String r6 = r8.replace(r3, r4)
            return r6
        L34:
            java.lang.String r5 = "classes.dex"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L3d
            return r6
        L3d:
            boolean r5 = r8.contains(r3)
            if (r5 != 0) goto L6e
            boolean r5 = r8.contains(r4)
            if (r5 == 0) goto L4a
            goto L6e
        L4a:
            java.lang.String r2 = ".apk"
            boolean r2 = r8.endsWith(r2)
            if (r2 == 0) goto L53
            goto L84
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            boolean r6 = java.util.Arrays.equals(r7, r1)
            if (r6 == 0) goto L62
            goto L68
        L62:
            boolean r6 = java.util.Arrays.equals(r7, r0)
            if (r6 == 0) goto L69
        L68:
            r3 = r4
        L69:
            java.lang.String r6 = defpackage.z30.l(r2, r3, r8)
            return r6
        L6e:
            boolean r6 = r3.equals(r2)
            if (r6 == 0) goto L79
            java.lang.String r6 = r8.replace(r4, r3)
            return r6
        L79:
            boolean r6 = r4.equals(r2)
            if (r6 == 0) goto L84
            java.lang.String r6 = r8.replace(r3, r4)
            return r6
        L84:
            return r8
    }

    public static android.content.res.ColorStateList v(android.content.Context r8, int r9) {
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            a10 r1 = new a10
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.c10.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.c10.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            z00 r5 = (defpackage.z00) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.c10.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.hb.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.c10.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.c10.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            z00 r0 = new z00     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = defpackage.y00.b(r0, r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
    }

    public static java.util.ArrayList x(com.google.android.material.appbar.MaterialToolbar r4, java.lang.CharSequence r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L26
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L23
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r3 = r2.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L23
            r0.add(r2)
        L23:
            int r1 = r1 + 1
            goto L6
        L26:
            return r0
    }

    public static defpackage.ld z(defpackage.ld r2) {
            java.lang.String r0 = "<this>"
            o(r0, r2)
            boolean r0 = r2 instanceof defpackage.m50
            if (r0 == 0) goto Ld
            r0 = r2
            m50 r0 = (defpackage.m50) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2f
            ld r2 = r0.c
            if (r2 != 0) goto L2f
            ge r2 = r0.b
            l(r2)
            vh r1 = defpackage.vh.b
            ee r2 = r2.b(r1)
            md r2 = (defpackage.md) r2
            if (r2 == 0) goto L2b
            ke r2 = (defpackage.ke) r2
            tg r1 = new tg
            r1.<init>(r2, r0)
            goto L2c
        L2b:
            r1 = r0
        L2c:
            r0.c = r1
            return r1
        L2f:
            return r2
    }

    public abstract void F(java.lang.Throwable r1);

    public abstract android.view.View G(int r1);

    public abstract boolean H();

    public abstract void I(defpackage.a8 r1);

    public abstract void V(java.lang.Object r1, float r2);

    public abstract void w(defpackage.p30 r1, float r2, float r3);

    public abstract float y(java.lang.Object r1);
}
