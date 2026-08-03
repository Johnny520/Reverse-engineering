package a;

/* JADX INFO: renamed from: a.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0435w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f745a = null;
    public static final float[][] b = null;
    public static final float[][] c = null;
    public static final float[] d = null;
    public static final float[][] e = null;
    public static final /* synthetic */ a.C0435w1 f = null;
    public static volatile java.lang.ClassLoader g;
    public static final java.lang.Object[] h = null;
    public static final int[] i = null;
    public static final java.lang.Object[] j = null;
    public static final a.C0435w1 k = null;
    public static volatile org.luckypray.dexkit.DexKitBridge l;
    public static final java.lang.Object m = null;
    public static final java.lang.String[] n = null;
    public static final a.C0435w1 o = null;
    public static volatile android.content.Context p;
    public static volatile boolean q;
    public static volatile java.lang.Object r;
    public static volatile java.lang.reflect.Method s;
    public static java.io.File t;

    static {
            r0 = 0
            r1 = 3
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            a.C0435w1.f745a = r2
            float[] r2 = new float[r1]
            r2 = {x0086: FILL_ARRAY_DATA , data: [1053652383, 1059484093, -1118648123} // fill-array
            float[] r3 = new float[r1]
            r3 = {x0090: FILL_ARRAY_DATA , data: [-1098898655, 1067067965, 1027330407} // fill-array
            float[] r4 = new float[r1]
            r4 = {x009a: FILL_ARRAY_DATA , data: [-1157087275, 1028162020, 1064566818} // fill-array
            float[][] r2 = new float[][]{r2, r3, r4}
            a.C0435w1.b = r2
            float[] r2 = new float[r1]
            r2 = {x00a4: FILL_ARRAY_DATA , data: [1072584765, -1082036021, 1041810539} // fill-array
            float[] r3 = new float[r1]
            r3 = {x00ae: FILL_ARRAY_DATA , data: [1053190625, 1059002158, -1139603558} // fill-array
            float[] r4 = new float[r1]
            r4 = {x00b8: FILL_ARRAY_DATA , data: [-1132345847, -1123302273, 1065772348} // fill-array
            float[][] r2 = new float[][]{r2, r3, r4}
            a.C0435w1.c = r2
            float[] r2 = new float[r1]
            r2 = {x00c2: FILL_ARRAY_DATA , data: [1119754256, 1120403456, 1121567769} // fill-array
            a.C0435w1.d = r2
            float[] r2 = new float[r1]
            r2 = {x00cc: FILL_ARRAY_DATA , data: [1054023191, 1052187149, 1043912633} // fill-array
            float[] r3 = new float[r1]
            r3 = {x00d6: FILL_ARRAY_DATA , data: [1046066128, 1060575065, 1033100696} // fill-array
            float[] r1 = new float[r1]
            r1 = {x00e0: FILL_ARRAY_DATA , data: [1017006063, 1039404073, 1064520140} // fill-array
            float[][] r1 = new float[][]{r2, r3, r1}
            a.C0435w1.e = r1
            a.w1 r1 = new a.w1
            r1.<init>()
            a.C0435w1.f = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            a.C0435w1.h = r1
            int[] r1 = new int[r0]
            a.C0435w1.i = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            a.C0435w1.j = r0
            a.w1 r0 = new a.w1
            r0.<init>()
            a.C0435w1.k = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.C0435w1.m = r0
            java.lang.String r0 = "decelerate"
            java.lang.String r1 = "linear"
            java.lang.String r2 = "standard"
            java.lang.String r3 = "accelerate"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            a.C0435w1.n = r0
            a.w1 r0 = new a.w1
            r0.<init>()
            a.C0435w1.o = r0
            return
    }

    public static android.graphics.drawable.Drawable A(android.content.Context r1, int r2) {
            a.pd r0 = a.C0322pd.b()
            android.graphics.drawable.Drawable r1 = r0.c(r1, r2)
            return r1
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    public static java.util.Set B() {
            java.lang.String r0 = "android.text.EmojiConsistency"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "getEmojiConsistencySet"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L16
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L2d
            return r0
        L16:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r2 instanceof int[]     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L1c
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L2d
        L2c:
            return r0
        L2d:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    public static void C(java.lang.String r1) {
            java.lang.String r0 = "msg"
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "[ConvRV] "
            java.lang.String r1 = r0.concat(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.b(r1)
            return
    }

    public static void D(android.content.Context r2) {
            java.lang.String r0 = "ctx"
            a.C0193i9.e(r2, r0)
            java.io.File r0 = a.C0435w1.t
            if (r0 == 0) goto La
            return
        La:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = "top.mmjz.floatingclouds"
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r0, r1)     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = "getApplicationInfo(...)"
            a.C0193i9.d(r2, r0)     // Catch: java.lang.Exception -> L24
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L24
            java.lang.String r2 = r2.dataDir     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "files"
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L24
            goto L2f
        L24:
            java.io.File r0 = new java.io.File
            java.io.File r2 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = "data/top.mmjz.floatingclouds/files"
            r0.<init>(r2, r1)
        L2f:
            a.C0435w1.t = r0
            r0.mkdirs()
            java.io.File r2 = a.C0435w1.t
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "init: rootDir="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "FileConfigStore"
            android.util.Log.d(r0, r2)
            return
    }

    public static int F(float r15) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r15
        L9:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r15 = -1
            return r15
        L11:
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r15 + r0
            r2 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 / r2
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            r4 = 1147261687(0x4461d2f7, float:903.2963)
            if (r3 <= 0) goto L25
            float r15 = r1 * r1
            float r15 = r15 * r1
            goto L26
        L25:
            float r15 = r15 / r4
        L26:
            float r3 = r1 * r1
            float r3 = r3 * r1
            r5 = 1007753895(0x3c111aa7, float:0.008856452)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 <= 0) goto L34
            r5 = r7
            goto L35
        L34:
            r5 = r6
        L35:
            if (r5 == 0) goto L39
            r8 = r3
            goto L3d
        L39:
            float r8 = r1 * r2
            float r8 = r8 - r0
            float r8 = r8 / r4
        L3d:
            if (r5 == 0) goto L40
            goto L44
        L40:
            float r1 = r1 * r2
            float r1 = r1 - r0
            float r3 = r1 / r4
        L44:
            float[] r0 = a.C0435w1.d
            r1 = r0[r6]
            float r8 = r8 * r1
            double r9 = (double) r8
            r1 = r0[r7]
            float r15 = r15 * r1
            double r11 = (double) r15
            r15 = 2
            r15 = r0[r15]
            float r3 = r3 * r15
            double r13 = (double) r3
            int r15 = a.C0419v3.a(r9, r11, r13)
            return r15
    }

    public static boolean G(android.widget.EditText r0) {
            int r0 = r0.getInputType()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean H() {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final a.G1 I(java.lang.Object[] r1) {
            java.lang.String r0 = "array"
            a.C0193i9.e(r1, r0)
            a.G1 r0 = new a.G1
            r0.<init>(r1)
            return r0
    }

    public static float J(int r6) {
            float r6 = (float) r6
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r0
            r0 = 1025879782(0x3d25aee6, float:0.04045)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r0 > 0) goto L13
            r0 = 1095678034(0x414eb852, float:12.92)
            float r6 = r6 / r0
        L11:
            float r6 = r6 * r1
            return r6
        L13:
            r0 = 1029785518(0x3d6147ae, float:0.055)
            float r6 = r6 + r0
            r0 = 1065814589(0x3f870a3d, float:1.055)
            float r6 = r6 / r0
            double r2 = (double) r6
            r4 = 4612586738567610368(0x4003333340000000, double:2.4000000953674316)
            double r2 = java.lang.Math.pow(r2, r4)
            float r6 = (float) r2
            goto L11
    }

    public static java.util.List K(java.lang.Object r1) {
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r0 = "singletonList(...)"
            a.C0193i9.d(r1, r0)
            return r1
    }

    public static void L(android.view.inputmethod.EditorInfo r0, android.view.inputmethod.InputConnection r1, android.widget.TextView r2) {
            if (r1 == 0) goto L20
            java.lang.CharSequence r1 = r0.hintText
            if (r1 != 0) goto L20
            android.view.ViewParent r1 = r2.getParent()
        La:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            boolean r2 = r1 instanceof a.uh
            if (r2 == 0) goto L1b
            a.uh r1 = (a.uh) r1
            java.lang.CharSequence r1 = r1.a()
            r0.hintText = r1
            return
        L1b:
            android.view.ViewParent r1 = r1.getParent()
            goto La
        L20:
            return
    }

    public static void M(android.content.Context r5, java.lang.String r6) {
            java.lang.Object r0 = a.C0435w1.f745a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    public static void N(android.animation.AnimatorSet r10, java.util.ArrayList r11) {
            int r0 = r11.size()
            r1 = 0
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r0) goto L20
            java.lang.Object r5 = r11.get(r4)
            android.animation.Animator r5 = (android.animation.Animator) r5
            long r6 = r5.getStartDelay()
            long r8 = r5.getDuration()
            long r8 = r8 + r6
            long r1 = java.lang.Math.max(r1, r8)
            int r4 = r4 + 1
            goto L8
        L20:
            int[] r0 = new int[]{r3, r3}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r0.setDuration(r1)
            r11.add(r3, r0)
            r10.playTogether(r11)
            return
    }

    public static java.lang.Object O(a.InterfaceC0369s7 r1) {
            java.lang.Object r0 = a.C0435w1.m
            monitor-enter(r0)
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static byte[] P(java.io.InputStream r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
        L3:
            if (r1 >= r4) goto L1b
            int r2 = r4 - r1
            int r2 = r3.read(r0, r1, r2)
            if (r2 < 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.lang.String r3 = "Not enough bytes to read: "
            java.lang.String r3 = a.C0487z.e(r3, r4)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L1b:
            return r0
    }

    public static byte[] Q(java.io.FileInputStream r8, int r9, int r10) {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
    }

    public static java.util.ArrayList R(java.io.File r5) {
            java.nio.charset.Charset r0 = a.V2.f298a
            java.lang.String r1 = "charset"
            a.C0193i9.e(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r5)
            r3.<init>(r4, r0)
            r2.<init>(r3)
            a.D9 r5 = new a.D9     // Catch: java.lang.Throwable -> L40
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L40
            a.L3 r0 = new a.L3     // Catch: java.lang.Throwable -> L40
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L29:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L42
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "it"
            a.C0193i9.e(r0, r3)     // Catch: java.lang.Throwable -> L40
            r1.add(r0)     // Catch: java.lang.Throwable -> L40
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L40
            goto L29
        L40:
            r5 = move-exception
            goto L48
        L42:
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> L40
            r2.close()
            return r1
        L48:
            throw r5     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            e(r2, r5)
            throw r0
    }

    public static java.lang.String S(android.content.Context r8) {
            java.lang.Object r0 = a.C0435w1.f745a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
    }

    public static java.lang.String T(java.io.File r3) {
            java.nio.charset.Charset r0 = a.V2.f298a
            java.lang.String r1 = "charset"
            a.C0193i9.e(r0, r1)
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r0)
            java.lang.String r3 = a.C0282n9.v(r1)     // Catch: java.lang.Throwable -> L19
            r1.close()
            return r3
        L19:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L1b
        L1b:
            r0 = move-exception
            e(r1, r3)
            throw r0
    }

    public static long U(java.io.InputStream r6, int r7) {
            byte[] r6 = P(r6, r7)
            r0 = 0
            r2 = 0
        L7:
            if (r2 >= r7) goto L15
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    public static void V(java.lang.ClassLoader r12, java.util.List r13) {
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r12, r0)
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto Ld
            goto Ld9
        Ld:
            java.lang.Object r12 = a.C0435w1.r
            java.lang.reflect.Method r0 = a.C0435w1.s
            java.lang.String r1 = "] "
            java.lang.String r2 = "["
            java.lang.String r3 = "ConvSyncDriver"
            java.lang.String r4 = "msg"
            if (r12 == 0) goto Lde
            if (r0 != 0) goto L1f
            goto Lde
        L1f:
            r5 = 1
            r6 = 0
            a.C0435w1.q = r5     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r5 = r13.iterator()     // Catch: java.lang.Throwable -> L69
            r7 = r6
        L28:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> L69
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L69
            r9 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r8}     // Catch: java.lang.Throwable -> L43
            r0.invoke(r12, r9)     // Catch: java.lang.Throwable -> L43
            int r7 = r7 + 1
            goto L28
        L43:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r10.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r11 = "sync: k(3, "
            r10.append(r11)     // Catch: java.lang.Throwable -> L69
            r10.append(r8)     // Catch: java.lang.Throwable -> L69
            java.lang.String r8 = ") failed: "
            r10.append(r8)     // Catch: java.lang.Throwable -> L69
            r10.append(r9)     // Catch: java.lang.Throwable -> L69
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r8 = new java.lang.Object[]{r3, r8}     // Catch: java.lang.Throwable -> L69
            a.C0453x1.e(r8)     // Catch: java.lang.Throwable -> L69
            goto L28
        L69:
            r12 = move-exception
            goto La7
        L6b:
            int r12 = r13.size()     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r13.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "sync: k(3, wxid) invoked for "
            r13.append(r0)     // Catch: java.lang.Throwable -> L69
            r13.append(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "/"
            r13.append(r0)     // Catch: java.lang.Throwable -> L69
            r13.append(r12)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L69
            a.C0193i9.e(r12, r4)     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L69
            r13.append(r3)     // Catch: java.lang.Throwable -> L69
            r13.append(r1)     // Catch: java.lang.Throwable -> L69
            r13.append(r12)     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L69
            a.C0453x1.b(r12)     // Catch: java.lang.Throwable -> L69
        La4:
            a.C0435w1.q = r6
            goto Ld9
        La7:
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r13.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r0 = "sync failed: "
            r13.append(r0)     // Catch: java.lang.Throwable -> Lda
            r13.append(r12)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> Lda
            a.C0193i9.e(r12, r4)     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r13.<init>(r2)     // Catch: java.lang.Throwable -> Lda
            r13.append(r3)     // Catch: java.lang.Throwable -> Lda
            r13.append(r1)     // Catch: java.lang.Throwable -> Lda
            r13.append(r12)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> Lda
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> Lda
            a.C0453x1.e(r12)     // Catch: java.lang.Throwable -> Lda
            goto La4
        Ld9:
            return
        Lda:
            r12 = move-exception
            a.C0435w1.q = r6
            throw r12
        Lde:
            int r12 = r13.size()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "sync: DataSource not captured yet, skip (wxids="
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = ")"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            a.C0193i9.e(r12, r4)
            java.lang.String r13 = "[ConvSyncDriver] "
            java.lang.String r12 = r13.concat(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            a.C0453x1.e(r12)
            return
    }

    public static final java.lang.Object[] W(java.util.Collection r4) {
            int r0 = r4.size()
            java.lang.Object[] r1 = a.C0435w1.h
            if (r0 != 0) goto L9
            goto L13
        L9:
            java.util.Iterator r4 = r4.iterator()
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L14
        L13:
            return r1
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
            a.C0193i9.d(r4, r0)
            return r4
    }

    public static final java.lang.Object[] X(java.util.Collection r5, java.lang.Object[] r6) {
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
            a.C0193i9.c(r0, r3)
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
            a.C0193i9.d(r5, r6)
            return r5
    }

    public static final void Y(java.io.FileOutputStream r9, java.lang.String r10, java.nio.charset.Charset r11) {
            java.lang.String r0 = "text"
            a.C0193i9.e(r10, r0)
            int r0 = r10.length()
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 >= r1) goto L1a
            byte[] r10 = r10.getBytes(r11)
            java.lang.String r11 = "getBytes(...)"
            a.C0193i9.d(r10, r11)
            r9.write(r10)
            return
        L1a:
            java.nio.charset.CharsetEncoder r11 = r11.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r11 = r11.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r11 = r11.onUnmappableCharacter(r0)
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.CharBuffer r1 = java.nio.CharBuffer.allocate(r0)
            a.C0193i9.b(r11)
            float r2 = r11.maxBytesPerChar()
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            int r0 = r0 * r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.lang.String r2 = "allocate(...)"
            a.C0193i9.d(r0, r2)
            r2 = 0
            r3 = r2
            r4 = r3
        L49:
            int r5 = r10.length()
            if (r3 >= r5) goto Lae
            int r5 = 8192 - r4
            int r6 = r10.length()
            int r6 = r6 - r3
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r3 + r5
            char[] r7 = r1.array()
            java.lang.String r8 = "array(...)"
            a.C0193i9.d(r7, r8)
            r10.getChars(r3, r6, r7, r4)
            int r5 = r5 + r4
            r1.limit(r5)
            int r3 = r10.length()
            r4 = 1
            if (r6 != r3) goto L75
            r3 = r4
            goto L76
        L75:
            r3 = r2
        L76:
            java.nio.charset.CoderResult r3 = r11.encode(r1, r0, r3)
            boolean r3 = r3.isUnderflow()
            if (r3 == 0) goto La6
            byte[] r3 = r0.array()
            int r5 = r0.position()
            r9.write(r3, r2, r5)
            int r3 = r1.position()
            int r5 = r1.limit()
            if (r3 == r5) goto L9d
            char r3 = r1.get()
            r1.put(r2, r3)
            goto L9e
        L9d:
            r4 = r2
        L9e:
            r1.clear()
            r0.clear()
            r3 = r6
            goto L49
        La6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            r9.<init>(r10)
            throw r9
        Lae:
            return
    }

    public static void Z(java.io.ByteArrayOutputStream r6, long r7, int r9) {
            byte[] r0 = new byte[r9]
            r1 = 0
        L3:
            if (r1 >= r9) goto L13
            int r2 = r1 * 8
            long r2 = r7 >> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L13:
            r6.write(r0)
            return
    }

    public static int a(int r3, int r4, int[] r5) {
            int r3 = r3 + (-1)
            r0 = 0
        L3:
            if (r0 > r3) goto L18
            int r1 = r0 + r3
            int r1 = r1 >>> 1
            r2 = r5[r1]
            if (r2 >= r4) goto L11
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L11:
            if (r2 <= r4) goto L17
            int r1 = r1 + (-1)
            r3 = r1
            goto L3
        L17:
            return r1
        L18:
            int r3 = ~r0
            return r3
    }

    public static void a0(java.io.ByteArrayOutputStream r2, int r3) {
            long r0 = (long) r3
            r3 = 2
            Z(r2, r0, r3)
            return
    }

    public static int b(long[] r4, int r5, long r6) {
            int r5 = r5 + (-1)
            r0 = 0
        L3:
            if (r0 > r5) goto L1a
            int r1 = r0 + r5
            int r1 = r1 >>> 1
            r2 = r4[r1]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L13
            int r1 = r1 + 1
            r0 = r1
            goto L3
        L13:
            if (r2 <= 0) goto L19
            int r1 = r1 + (-1)
            r5 = r1
            goto L3
        L19:
            return r1
        L1a:
            int r4 = ~r0
            return r4
    }

    public static float b0() {
            r0 = 1112014848(0x42480000, float:50.0)
            double r0 = (double) r0
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 + r2
            r2 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r0 = r0 / r2
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            return r0
    }

    public static void c(java.lang.Object r2, java.lang.reflect.Method r3) {
            java.lang.Object r0 = a.C0435w1.r
            if (r0 != 0) goto L3c
            a.C0435w1.r = r2
            a.C0435w1.s = r3
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "captureFromHook: DataSource captured ("
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "), k="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "msg"
            a.C0193i9.e(r2, r3)
            java.lang.String r3 = "[ConvSyncDriver] "
            java.lang.String r2 = r3.concat(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            a.C0453x1.b(r2)
        L3c:
            return
    }

    public static void d(android.content.Context r2) {
            java.lang.String r0 = "ctx"
            a.C0193i9.e(r2, r0)
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L45
            java.lang.String r0 = "top.mmjz.floatingclouds"
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r0, r1)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L45
            java.lang.String r0 = "getApplicationInfo(...)"
            a.C0193i9.d(r2, r0)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L45
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L45
            java.lang.String r2 = r2.dataDir     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L45
            java.lang.String r1 = "files"
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L45
            goto L2a
        L1f:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.io.File r2 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "data/top.mmjz.floatingclouds/files"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L45
        L2a:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "floatingclouds_config.json"
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L45
            r2.delete()     // Catch: java.lang.Throwable -> L45
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "floatingclouds_config.json.tmp"
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L45
            r2.delete()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "FileConfigStore"
            java.lang.String r0 = "clear: removed floatingclouds_config.json"
            android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L45
        L45:
            return
    }

    public static final void e(java.io.Closeable r1, java.lang.Throwable r2) {
            r1.close()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "exception"
            a.C0193i9.e(r1, r0)
            if (r2 == r1) goto L16
            a.m9 r0 = a.C0446wc.f751a
            r0.a(r2, r1)
        L16:
            return
    }

    public static int f(java.lang.Comparable r0, java.lang.Comparable r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static byte[] g(byte[] r3) {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 1
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r2.write(r3)     // Catch: java.lang.Throwable -> L20
            r2.close()     // Catch: java.lang.Throwable -> L1e
            r0.end()
            byte[] r3 = r1.toByteArray()
            return r3
        L1e:
            r3 = move-exception
            goto L2a
        L20:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch: java.lang.Throwable -> L1e
        L29:
            throw r3     // Catch: java.lang.Throwable -> L1e
        L2a:
            r0.end()
            throw r3
    }

    public static final void h(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "destination"
            a.C0193i9.e(r2, r0)
            int r5 = r5 - r4
            java.lang.System.arraycopy(r1, r4, r2, r3, r5)
            return
    }

    public static /* synthetic */ void i(java.lang.Object[] r2, java.lang.Object[] r3, int r4, int r5, int r6, int r7) {
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            int r6 = r2.length
        L10:
            h(r2, r3, r4, r5, r6)
            return
    }

    public static a.InterfaceC0042a4 j(a.InterfaceC0042a4 r2, a.InterfaceC0042a4 r3, a.H7 r4) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r4, r0)
            boolean r0 = r4 instanceof a.W1
            if (r0 == 0) goto L10
            a.W1 r4 = (a.W1) r4
            a.a4 r2 = r4.g(r2, r3)
            return r2
        L10:
            a.x4 r0 = r3.c()
            a.W5 r1 = a.W5.f320a
            if (r0 != r1) goto L1e
            a.j9 r0 = new a.j9
            r0.<init>(r3, r2, r4)
            return r0
        L1e:
            a.k9 r1 = new a.k9
            r1.<init>(r3, r0, r4, r2)
            return r1
    }

    public static void k(java.lang.String r1) {
            java.lang.String r0 = "msg"
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "[ConvRV] "
            java.lang.String r1 = r0.concat(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.a(r1)
            return
    }

    public static final boolean l(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            return r0
    }

    public static void m(android.view.View r4, a.C0454x2 r5, java.util.ArrayList r6) {
            java.lang.Object r0 = r5.f(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf
            r6.add(r4)
        Lf:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L1a:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r2, r3)
            m(r2, r5, r6)
            int r1 = r1 + 1
            goto L1a
        L2b:
            return
    }

    public static java.util.List n(java.lang.String r7) {
            java.lang.String r0 = "className"
            a.C0193i9.e(r7, r0)
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto Lc
            goto L6b
        Lc:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L56
            monitor-enter(r2)     // Catch: java.lang.Exception -> L56
            a.z6 r3 = new a.z6     // Catch: java.lang.Throwable -> L59
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L59
            a.pb r4 = new a.pb     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            a.C0320pb.h(r4, r7)     // Catch: java.lang.Throwable -> L59
            r3.b = r4     // Catch: java.lang.Throwable -> L59
            a.ob r0 = r0.q(r3)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r2)     // Catch: java.lang.Exception -> L56
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)     // Catch: java.lang.Exception -> L56
            r2.<init>(r3)     // Catch: java.lang.Exception -> L56
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L56
        L33:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L58
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L56
            a.lb r3 = (a.C0248lb) r3     // Catch: java.lang.Exception -> L56
            a.Hf r4 = new a.Hf     // Catch: java.lang.Exception -> L56
            a.f5 r5 = r3.b()     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = r5.f469a     // Catch: java.lang.Exception -> L56
            a.f5 r6 = r3.b()     // Catch: java.lang.Exception -> L56
            java.lang.String r6 = r6.b     // Catch: java.lang.Exception -> L56
            java.lang.String r3 = r3.d     // Catch: java.lang.Exception -> L56
            r4.<init>(r5, r6, r3)     // Catch: java.lang.Exception -> L56
            r2.add(r4)     // Catch: java.lang.Exception -> L56
            goto L33
        L56:
            r0 = move-exception
            goto L5c
        L58:
            return r2
        L59:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L56
            throw r0     // Catch: java.lang.Exception -> L56
        L5c:
            java.lang.String r2 = "DkBridge.findAllMethodsInClass("
            java.lang.String r3 = ") err"
            java.lang.String r7 = a.C0487z.g(r2, r7, r3)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0}
            a.C0453x1.e(r7)
        L6b:
            return r1
    }

    public static java.util.List o(java.lang.String r3, java.lang.String[] r4) {
            java.lang.String r0 = "namePattern"
            a.C0193i9.e(r3, r0)
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto Lc
            goto L4c
        Lc:
            a.o5 r2 = new a.o5     // Catch: java.lang.Exception -> L3a
            r2.<init>(r0, r4, r3)     // Catch: java.lang.Exception -> L3a
            java.lang.Object r4 = O(r2)     // Catch: java.lang.Exception -> L3a
            a.d3 r4 = (a.C0097d3) r4     // Catch: java.lang.Exception -> L3a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3a
            r2 = 10
            int r2 = a.C0312p3.g0(r4, r2)     // Catch: java.lang.Exception -> L3a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L3a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3a
        L26:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Exception -> L3a
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Exception -> L3a
            a.b3 r2 = (a.C0060b3) r2     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = r2.b()     // Catch: java.lang.Exception -> L3a
            r0.add(r2)     // Catch: java.lang.Exception -> L3a
            goto L26
        L3a:
            r4 = move-exception
            goto L3d
        L3c:
            return r0
        L3d:
            java.lang.String r0 = "DkBridge.findClasses("
            java.lang.String r2 = ") fail"
            java.lang.String r3 = a.C0487z.g(r0, r3, r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            a.C0453x1.e(r3)
        L4c:
            return r1
    }

    public static java.util.List p(java.lang.String r7) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto L7
            goto L58
        L7:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L43
            monitor-enter(r2)     // Catch: java.lang.Exception -> L43
            a.y6 r3 = new a.y6     // Catch: java.lang.Throwable -> L46
            r3.<init>()     // Catch: java.lang.Throwable -> L46
            a.e3 r4 = new a.e3     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            r5 = 3
            r6 = 4
            a.C0115e3.i(r4, r7, r5, r6)     // Catch: java.lang.Throwable -> L46
            r3.b = r4     // Catch: java.lang.Throwable -> L46
            a.d3 r0 = r0.p(r3)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r2)     // Catch: java.lang.Exception -> L43
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L43
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)     // Catch: java.lang.Exception -> L43
            r2.<init>(r3)     // Catch: java.lang.Exception -> L43
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L43
        L2f:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L45
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L43
            a.b3 r3 = (a.C0060b3) r3     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> L43
            r2.add(r3)     // Catch: java.lang.Exception -> L43
            goto L2f
        L43:
            r0 = move-exception
            goto L49
        L45:
            return r2
        L46:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L43
            throw r0     // Catch: java.lang.Exception -> L43
        L49:
            java.lang.String r2 = "DkBridge.findClassesByNameEnd("
            java.lang.String r3 = ") fail"
            java.lang.String r7 = a.C0487z.g(r2, r7, r3)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0}
            a.C0453x1.e(r7)
        L58:
            return r1
    }

    public static java.util.List q(java.lang.String r7) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto L7
            goto L58
        L7:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L43
            monitor-enter(r2)     // Catch: java.lang.Exception -> L43
            a.y6 r3 = new a.y6     // Catch: java.lang.Throwable -> L46
            r3.<init>()     // Catch: java.lang.Throwable -> L46
            a.e3 r4 = new a.e3     // Catch: java.lang.Throwable -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L46
            r5 = 1
            r6 = 4
            a.C0115e3.i(r4, r7, r5, r6)     // Catch: java.lang.Throwable -> L46
            r3.b = r4     // Catch: java.lang.Throwable -> L46
            a.d3 r0 = r0.p(r3)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r2)     // Catch: java.lang.Exception -> L43
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L43
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)     // Catch: java.lang.Exception -> L43
            r2.<init>(r3)     // Catch: java.lang.Exception -> L43
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L43
        L2f:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L45
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L43
            a.b3 r3 = (a.C0060b3) r3     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> L43
            r2.add(r3)     // Catch: java.lang.Exception -> L43
            goto L2f
        L43:
            r0 = move-exception
            goto L49
        L45:
            return r2
        L46:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L43
            throw r0     // Catch: java.lang.Exception -> L43
        L49:
            java.lang.String r2 = "DkBridge.findClassesInPackage("
            java.lang.String r3 = ") fail"
            java.lang.String r7 = a.C0487z.g(r2, r7, r3)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0}
            a.C0453x1.e(r7)
        L58:
            return r1
    }

    public static java.util.List r(java.lang.String r5, java.lang.String[] r6) {
            java.lang.String r0 = "targetString"
            a.C0193i9.e(r5, r0)
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto Lc
            goto L7c
        Lc:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L67
            monitor-enter(r2)     // Catch: java.lang.Exception -> L67
            a.y6 r3 = new a.y6     // Catch: java.lang.Throwable -> L6a
            r3.<init>()     // Catch: java.lang.Throwable -> L6a
            if (r6 == 0) goto L35
            java.util.List r6 = a.N1.g0(r6)     // Catch: java.lang.Throwable -> L6a
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r6 = r6.toArray(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L6a
            int r4 = r6.length     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "searchPackages"
            a.C0193i9.e(r6, r4)     // Catch: java.lang.Throwable -> L6a
            java.util.List r6 = a.N1.g0(r6)     // Catch: java.lang.Throwable -> L6a
            r3.f768a = r6     // Catch: java.lang.Throwable -> L6a
        L35:
            a.e3 r6 = new a.e3     // Catch: java.lang.Throwable -> L6a
            r6.<init>()     // Catch: java.lang.Throwable -> L6a
            a.C0115e3.g(r6, r5)     // Catch: java.lang.Throwable -> L6a
            r3.b = r6     // Catch: java.lang.Throwable -> L6a
            a.d3 r6 = r0.p(r3)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r2)     // Catch: java.lang.Exception -> L67
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L67
            r2 = 10
            int r2 = a.C0312p3.g0(r6, r2)     // Catch: java.lang.Exception -> L67
            r0.<init>(r2)     // Catch: java.lang.Exception -> L67
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L67
        L53:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L67
            if (r2 == 0) goto L69
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L67
            a.b3 r2 = (a.C0060b3) r2     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = r2.b()     // Catch: java.lang.Exception -> L67
            r0.add(r2)     // Catch: java.lang.Exception -> L67
            goto L53
        L67:
            r6 = move-exception
            goto L6d
        L69:
            return r0
        L6a:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L67
            throw r6     // Catch: java.lang.Exception -> L67
        L6d:
            java.lang.String r0 = "DkBridge.findClassesUsingString("
            java.lang.String r2 = ") fail"
            java.lang.String r5 = a.C0487z.g(r0, r5, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            a.C0453x1.e(r5)
        L7c:
            return r1
    }

    public static java.util.List s(java.lang.String... r5) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto L7
            goto L51
        L7:
            a.n5 r2 = new a.n5     // Catch: java.lang.Exception -> L36
            r3 = 0
            r2.<init>(r0, r3, r5)     // Catch: java.lang.Exception -> L36
            java.lang.Object r0 = O(r2)     // Catch: java.lang.Exception -> L36
            a.d3 r0 = (a.C0097d3) r0     // Catch: java.lang.Exception -> L36
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L36
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)     // Catch: java.lang.Exception -> L36
            r2.<init>(r3)     // Catch: java.lang.Exception -> L36
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L36
        L22:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L36
            a.b3 r3 = (a.C0060b3) r3     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> L36
            r2.add(r3)     // Catch: java.lang.Exception -> L36
            goto L22
        L36:
            r0 = move-exception
            goto L39
        L38:
            return r2
        L39:
            java.lang.String r2 = ","
            r3 = 0
            r4 = 62
            java.lang.String r5 = a.N1.e0(r5, r2, r3, r4)
            java.lang.String r2 = "DkBridge.findClassesUsingStrings("
            java.lang.String r3 = ") fail"
            java.lang.String r5 = a.C0487z.g(r2, r5, r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0}
            a.C0453x1.e(r5)
        L51:
            return r1
    }

    public static java.util.List t(java.lang.String r4, java.lang.String r5, java.lang.Boolean r6, java.lang.Boolean r7) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto L7
            goto L5d
        L7:
            a.o5 r2 = new a.o5     // Catch: java.lang.Exception -> L3b
            r2.<init>(r0, r4, r5)     // Catch: java.lang.Exception -> L3b
            java.lang.Object r4 = O(r2)     // Catch: java.lang.Exception -> L3b
            a.s6 r4 = (a.C0368s6) r4     // Catch: java.lang.Exception -> L3b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3b
            r5.<init>()     // Catch: java.lang.Exception -> L3b
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3b
        L1b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L3b
            if (r0 == 0) goto L53
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Exception -> L3b
            r2 = r0
            a.r6 r2 = (a.C0350r6) r2     // Catch: java.lang.Exception -> L3b
            if (r6 == 0) goto L3d
            int r3 = r2.c     // Catch: java.lang.Exception -> L3b
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L3b
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L1b
            goto L3d
        L3b:
            r4 = move-exception
            goto L54
        L3d:
            if (r7 == 0) goto L4f
            int r2 = r2.c     // Catch: java.lang.Exception -> L3b
            boolean r2 = java.lang.reflect.Modifier.isFinal(r2)     // Catch: java.lang.Exception -> L3b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L3b
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Exception -> L3b
            if (r2 == 0) goto L1b
        L4f:
            r5.add(r0)     // Catch: java.lang.Exception -> L3b
            goto L1b
        L53:
            return r5
        L54:
            java.lang.String r5 = "DkBridge.findFieldsByStructure fail"
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            a.C0453x1.e(r4)
        L5d:
            return r1
    }

    public static java.util.List u(java.util.List r6) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto L7
            goto L65
        L7:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L56
            monitor-enter(r2)     // Catch: java.lang.Exception -> L56
            a.z6 r3 = new a.z6     // Catch: java.lang.Throwable -> L59
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L59
            a.pb r4 = new a.pb     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "V"
            a.C0320pb.j(r4, r5)     // Catch: java.lang.Throwable -> L59
            r4.i(r6)     // Catch: java.lang.Throwable -> L59
            r3.b = r4     // Catch: java.lang.Throwable -> L59
            a.ob r6 = r0.q(r3)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r2)     // Catch: java.lang.Exception -> L56
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56
            r2 = 10
            int r2 = a.C0312p3.g0(r6, r2)     // Catch: java.lang.Exception -> L56
            r0.<init>(r2)     // Catch: java.lang.Exception -> L56
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L56
        L33:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L56
            if (r2 == 0) goto L58
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L56
            a.lb r2 = (a.C0248lb) r2     // Catch: java.lang.Exception -> L56
            a.Hf r3 = new a.Hf     // Catch: java.lang.Exception -> L56
            a.f5 r4 = r2.b()     // Catch: java.lang.Exception -> L56
            java.lang.String r4 = r4.f469a     // Catch: java.lang.Exception -> L56
            a.f5 r5 = r2.b()     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = r5.b     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = r2.d     // Catch: java.lang.Exception -> L56
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Exception -> L56
            r0.add(r3)     // Catch: java.lang.Exception -> L56
            goto L33
        L56:
            r6 = move-exception
            goto L5c
        L58:
            return r0
        L59:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L56
            throw r6     // Catch: java.lang.Exception -> L56
        L5c:
            java.lang.String r0 = "DkBridge.findMethodsByParamTypes err"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            a.C0453x1.e(r6)
        L65:
            return r1
    }

    public static java.util.List v(java.util.List r6) {
            java.lang.String r0 = "paramTypes"
            a.C0193i9.e(r6, r0)
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto Lc
            goto L65
        Lc:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L56
            monitor-enter(r2)     // Catch: java.lang.Exception -> L56
            a.z6 r3 = new a.z6     // Catch: java.lang.Throwable -> L59
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L59
            a.pb r4 = new a.pb     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            r4.i(r6)     // Catch: java.lang.Throwable -> L59
            r3.b = r4     // Catch: java.lang.Throwable -> L59
            a.ob r6 = r0.q(r3)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r2)     // Catch: java.lang.Exception -> L56
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56
            r2 = 10
            int r2 = a.C0312p3.g0(r6, r2)     // Catch: java.lang.Exception -> L56
            r0.<init>(r2)     // Catch: java.lang.Exception -> L56
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L56
        L33:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L56
            if (r2 == 0) goto L58
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L56
            a.lb r2 = (a.C0248lb) r2     // Catch: java.lang.Exception -> L56
            a.Hf r3 = new a.Hf     // Catch: java.lang.Exception -> L56
            a.f5 r4 = r2.b()     // Catch: java.lang.Exception -> L56
            java.lang.String r4 = r4.f469a     // Catch: java.lang.Exception -> L56
            a.f5 r5 = r2.b()     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = r5.b     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = r2.d     // Catch: java.lang.Exception -> L56
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Exception -> L56
            r0.add(r3)     // Catch: java.lang.Exception -> L56
            goto L33
        L56:
            r6 = move-exception
            goto L5c
        L58:
            return r0
        L59:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L56
            throw r6     // Catch: java.lang.Exception -> L56
        L5c:
            java.lang.String r0 = "DkBridge.findMethodsByParamTypesRelaxed err"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            a.C0453x1.e(r6)
        L65:
            return r1
    }

    public static java.util.List w(java.lang.String r6) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto L7
            goto L60
        L7:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L51
            monitor-enter(r2)     // Catch: java.lang.Exception -> L51
            a.z6 r3 = new a.z6     // Catch: java.lang.Throwable -> L54
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L54
            a.pb r4 = new a.pb     // Catch: java.lang.Throwable -> L54
            r4.<init>()     // Catch: java.lang.Throwable -> L54
            a.C0320pb.g(r4, r6)     // Catch: java.lang.Throwable -> L54
            r3.b = r4     // Catch: java.lang.Throwable -> L54
            a.ob r6 = r0.q(r3)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Exception -> L51
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L51
            r2 = 10
            int r2 = a.C0312p3.g0(r6, r2)     // Catch: java.lang.Exception -> L51
            r0.<init>(r2)     // Catch: java.lang.Exception -> L51
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L51
        L2e:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L53
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L51
            a.lb r2 = (a.C0248lb) r2     // Catch: java.lang.Exception -> L51
            a.Hf r3 = new a.Hf     // Catch: java.lang.Exception -> L51
            a.f5 r4 = r2.b()     // Catch: java.lang.Exception -> L51
            java.lang.String r4 = r4.f469a     // Catch: java.lang.Exception -> L51
            a.f5 r5 = r2.b()     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = r5.b     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = r2.d     // Catch: java.lang.Exception -> L51
            r3.<init>(r4, r5, r2)     // Catch: java.lang.Exception -> L51
            r0.add(r3)     // Catch: java.lang.Exception -> L51
            goto L2e
        L51:
            r6 = move-exception
            goto L57
        L53:
            return r0
        L54:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L51
            throw r6     // Catch: java.lang.Exception -> L51
        L57:
            java.lang.String r0 = "DkBridge.findMethodsBySignature fail"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            a.C0453x1.e(r6)
        L60:
            return r1
    }

    public static java.util.List x(java.lang.String r8, java.lang.String r9, java.util.List r10, java.lang.String r11, int r12) {
            r0 = r12 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r8
        L8:
            r8 = r12 & 2
            if (r8 == 0) goto Le
            r5 = r1
            goto Lf
        Le:
            r5 = r9
        Lf:
            r8 = r12 & 4
            if (r8 == 0) goto L15
            r6 = r1
            goto L16
        L15:
            r6 = r10
        L16:
            r8 = r12 & 8
            if (r8 == 0) goto L1c
            r7 = r1
            goto L1d
        L1c:
            r7 = r11
        L1d:
            org.luckypray.dexkit.DexKitBridge r3 = a.C0435w1.l
            a.Y5 r8 = a.Y5.f351a
            if (r3 != 0) goto L24
            goto L3b
        L24:
            a.p5 r2 = new a.p5     // Catch: java.lang.Exception -> L30
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L30
            java.lang.Object r9 = O(r2)     // Catch: java.lang.Exception -> L30
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L30
            return r9
        L30:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = "DkBridge.findMethodsByStructure fail"
            java.lang.Object[] r9 = new java.lang.Object[]{r10, r9}
            a.C0453x1.e(r9)
        L3b:
            return r8
    }

    public static java.util.List y(java.lang.String r6) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            a.Y5 r1 = a.Y5.f351a
            if (r0 != 0) goto L7
            goto L38
        L7:
            java.lang.Object r2 = a.C0435w1.m     // Catch: java.lang.Exception -> L28
            monitor-enter(r2)     // Catch: java.lang.Exception -> L28
            a.z6 r3 = new a.z6     // Catch: java.lang.Throwable -> L25
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            a.pb r4 = new a.pb     // Catch: java.lang.Throwable -> L25
            r4.<init>()     // Catch: java.lang.Throwable -> L25
            a.C0320pb.h(r4, r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "updateUnreadByTalker"
            a.C0320pb.g(r4, r5)     // Catch: java.lang.Throwable -> L25
            r3.b = r4     // Catch: java.lang.Throwable -> L25
            a.ob r0 = r0.q(r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)     // Catch: java.lang.Exception -> L28
            return r0
        L25:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Exception -> L28
            throw r0     // Catch: java.lang.Exception -> L28
        L28:
            r0 = move-exception
            java.lang.String r2 = "DkBridge.findMethodsInClassByString("
            java.lang.String r3 = ") fail"
            java.lang.String r6 = a.C0487z.g(r2, r6, r3)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            a.C0453x1.e(r6)
        L38:
            return r1
    }

    public synchronized boolean E(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "DkBridge.init FAILED: "
            java.lang.String r1 = "DkBridge.init OK, apkPath="
            monitor-enter(r5)
            java.lang.String r2 = "apkPath"
            a.C0193i9.e(r6, r2)     // Catch: java.lang.Throwable -> L2f
            org.luckypray.dexkit.DexKitBridge r2 = a.C0435w1.l     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            if (r2 == 0) goto L11
            monitor-exit(r5)
            return r3
        L11:
            r2 = 0
            java.lang.String r4 = "dexkit"
            java.lang.System.loadLibrary(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            org.luckypray.dexkit.DexKitBridge r4 = new org.luckypray.dexkit.DexKitBridge     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            a.C0435w1.l = r4     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            java.lang.String r4 = "[MyPlugin-DexKit]"
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            android.util.Log.i(r4, r6)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            org.luckypray.dexkit.DexKitBridge r6 = a.C0435w1.l     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r6 == 0) goto L2c
            goto L2d
        L2c:
            r3 = r2
        L2d:
            r2 = r3
            goto L47
        L2f:
            r6 = move-exception
            goto L49
        L31:
            r6 = move-exception
            java.lang.String r1 = "[MyPlugin-DexKit]"
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            r3.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            android.util.Log.w(r1, r6)     // Catch: java.lang.Throwable -> L2f
        L47:
            monitor-exit(r5)
            return r2
        L49:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6
    }

    public void z(a.Yd r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
