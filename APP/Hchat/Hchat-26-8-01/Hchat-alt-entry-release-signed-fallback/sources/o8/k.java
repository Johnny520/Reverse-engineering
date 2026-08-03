package o8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f9611d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f9612e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f9613f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f9614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f9615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile l8.i f9616c;

    static {
            java.lang.String r0 = "(?:patch\\.client\\.ver|clientVersion|CLIENT_VERSION)\\s*[=:]\\s*(0x[0-9a-fA-F]+|\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            o8.k.f9611d = r0
            java.lang.String r0 = "(?:NEW_TINKER_ID|TINKER_ID)\\s*[=:]\\s*([^,}\\s]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            o8.k.f9612e = r0
            java.lang.String r0 = "intent_patch_(?:new|old)_version\\s*[=:]\\s*([^,}\\s]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            o8.k.f9613f = r0
            return
    }

    public k(android.content.Context r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>()
            r0.f9614a = r1
            r0.f9615b = r2
            return
    }

    public static l8.i a(android.content.Context r19, java.lang.ClassLoader r20) {
            r0 = r19
            r1 = r20
            java.lang.String r2 = ""
            if (r0 != 0) goto L29
            l8.i r3 = new l8.i
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r0 = r0.hashCode()
            java.lang.Integer.toHexString(r0)
            java.lang.String r13 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r8 = 0
            r10 = 0
            java.lang.String r12 = ""
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13)
            return r3
        L29:
            java.lang.String r5 = r0.getPackageName()
            r3 = 0
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L4b
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = r4.versionName     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L3b
            goto L3c
        L3b:
            r8 = r2
        L3c:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4c
            r10 = 28
            if (r9 < r10) goto L47
            long r9 = b0.b0.b(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L47:
            int r4 = r4.versionCode     // Catch: java.lang.Throwable -> L4c
            long r9 = (long) r4
            goto L4e
        L4b:
            r8 = r2
        L4c:
            r9 = 0
        L4e:
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L68
            java.lang.String r11 = r4.sourceDir     // Catch: java.lang.Throwable -> L68
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L68
            if (r11 != 0) goto L68
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.sourceDir     // Catch: java.lang.Throwable -> L68
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L68
            long r11 = r11.lastModified()     // Catch: java.lang.Throwable -> L68
            goto L6a
        L68:
            r11 = 0
        L6a:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            if (r1 != 0) goto L72
        L70:
            r3 = r2
            goto L9e
        L72:
            java.lang.String r13 = "com.tencent.mm.boot.BuildConfig"
            java.lang.Class r13 = java.lang.Class.forName(r13, r3, r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r14 = "CLIENT_VERSION_ARM64"
            java.lang.String r14 = e(r13, r14)     // Catch: java.lang.Throwable -> L70
            java.lang.String r15 = "CLIENT_VERSION"
            java.lang.String r15 = e(r13, r15)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "CLIENT_VERSION_INT"
            java.lang.String r3 = e(r13, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = "CLIENTVERSION"
            java.lang.String r6 = e(r13, r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String[] r3 = new java.lang.String[]{r14, r15, r3, r6}     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = c(r3)     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L70
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L70
        L9e:
            java.util.regex.Pattern r6 = o8.k.f9611d
            java.lang.String r6 = d(r6, r4)
            java.lang.String r7 = "patch.client.ver"
            java.lang.String r7 = f(r0, r7)
            java.lang.String r13 = "client.ver"
            java.lang.String r13 = f(r0, r13)
            java.lang.String[] r3 = new java.lang.String[]{r3, r6, r7, r13}
            java.lang.String r7 = c(r3)
            java.util.regex.Pattern r3 = o8.k.f9612e
            java.lang.String r3 = d(r3, r4)
            java.lang.String r6 = "NEW_TINKER_ID"
            java.lang.String r6 = f(r0, r6)
            java.lang.String r13 = "TINKER_ID"
            java.lang.String r13 = f(r0, r13)
            java.lang.String[] r3 = new java.lang.String[]{r3, r6, r13}
            java.lang.String r3 = c(r3)
            java.util.regex.Pattern r6 = o8.k.f9613f
            java.lang.String r4 = d(r6, r4)
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Led
            java.io.File r0 = r0.getFilesDir()     // Catch: java.lang.Throwable -> Led
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Throwable -> Led
            java.lang.String r13 = "tinker"
            r6.<init>(r0, r13)     // Catch: java.lang.Throwable -> Led
            java.io.File[] r0 = r6.listFiles()     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto Lef
        Led:
            r14 = r2
            goto L12a
        Lef:
            int r6 = r0.length     // Catch: java.lang.Throwable -> Led
            r14 = r2
            r13 = 0
            r17 = 0
        Lf4:
            if (r13 >= r6) goto L12a
            r15 = r0[r13]     // Catch: java.lang.Throwable -> Led
            if (r15 == 0) goto L100
            boolean r16 = r15.isDirectory()     // Catch: java.lang.Throwable -> Led
            if (r16 != 0) goto L103
        L100:
            r19 = r0
            goto L123
        L103:
            r19 = r0
            java.lang.String r0 = r15.getName()     // Catch: java.lang.Throwable -> Led
            boolean r16 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Led
            if (r16 != 0) goto L123
            java.lang.String r1 = "patch-"
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> Led
            if (r1 != 0) goto L118
            goto L123
        L118:
            long r15 = r15.lastModified()     // Catch: java.lang.Throwable -> Led
            int r1 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r1 < 0) goto L123
            r14 = r0
            r17 = r15
        L123:
            int r13 = r13 + 1
            r0 = r19
            r1 = r20
            goto Lf4
        L12a:
            java.lang.String[] r0 = new java.lang.String[]{r4, r14}
            java.lang.String r13 = c(r0)
            java.lang.String r0 = java.lang.String.valueOf(r20)
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r5 == 0) goto L147
            r4 = r5
            goto L148
        L147:
            r4 = r2
        L148:
            r1.append(r4)
            r4 = 124(0x7c, float:1.74E-43)
            r1.append(r4)
            r1.append(r8)
            r1.append(r4)
            r1.append(r9)
            r1.append(r4)
            if (r7 == 0) goto L160
            r6 = r7
            goto L161
        L160:
            r6 = r2
        L161:
            r1.append(r6)
            r1.append(r4)
            if (r3 == 0) goto L16b
            r6 = r3
            goto L16c
        L16b:
            r6 = r2
        L16c:
            r1.append(r6)
            r1.append(r4)
            if (r13 == 0) goto L176
            r6 = r13
            goto L177
        L176:
            r6 = r2
        L177:
            r1.append(r6)
            r1.append(r4)
            r1.append(r11)
            r1.append(r4)
            if (r0 == 0) goto L186
            r2 = r0
        L186:
            r1.append(r2)
            java.lang.String r14 = r1.toString()
            l8.i r4 = new l8.i
            r6 = r8
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9, r11, r13, r14)
            return r4
    }

    public static java.lang.String c(java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Ld
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String d(java.util.regex.Pattern r1, java.lang.String r2) {
            if (r1 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            goto L19
        L9:
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.Throwable -> L19
            boolean r2 = r1.find()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            r2 = 1
            java.lang.String r1 = r1.group(r2)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String e(java.lang.Class r1, java.lang.String r2) {
            if (r1 == 0) goto L1d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            goto L1d
        L9:
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1d
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String f(android.content.Context r2, java.lang.String r3) {
            if (r2 == 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            goto L1f
        L9:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L1f
            java.io.File r2 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L1f
            java.io.File r2 = r2.getParentFile()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "tinker"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = g(r0, r3)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1f
            return r2
        L1f:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String g(java.io.File r8, java.lang.String r9) {
            boolean r0 = r8.exists()
            java.lang.String r1 = ""
            if (r0 != 0) goto La
            goto Laf
        La:
            java.io.File[] r8 = r8.listFiles()
            if (r8 != 0) goto L12
            goto Laf
        L12:
            int r0 = r8.length
            r2 = 0
        L14:
            if (r2 >= r0) goto Laf
            r3 = r8[r2]
            if (r3 != 0) goto L1c
            goto Lab
        L1c:
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L2d
            java.lang.String r3 = g(r3, r9)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lab
            return r3
        L2d:
            java.lang.String r4 = r3.getName()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto Lab
            java.lang.String r5 = ".meta"
            boolean r5 = r4.endsWith(r5)
            if (r5 != 0) goto L50
            java.lang.String r5 = ".txt"
            boolean r5 = r4.endsWith(r5)
            if (r5 != 0) goto L50
            java.lang.String r5 = ".properties"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L50
            goto Lab
        L50:
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9e
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> L9e
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L9e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L9e
        L5b:
            java.lang.String r3 = r5.readLine()     // Catch: java.lang.Throwable -> L81
            if (r3 == 0) goto L9a
            int r4 = r3.indexOf(r9)     // Catch: java.lang.Throwable -> L81
            if (r4 >= 0) goto L68
            goto L5b
        L68:
            int r6 = r9.length()     // Catch: java.lang.Throwable -> L81
            int r6 = r6 + r4
            r7 = 61
            int r6 = r3.indexOf(r7, r6)     // Catch: java.lang.Throwable -> L81
            if (r6 >= 0) goto L83
            int r6 = r9.length()     // Catch: java.lang.Throwable -> L81
            int r4 = r4 + r6
            r6 = 58
            int r6 = r3.indexOf(r6, r4)     // Catch: java.lang.Throwable -> L81
            goto L83
        L81:
            r4 = r5
            goto L9e
        L83:
            if (r6 < 0) goto L5b
            int r6 = r6 + 1
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L81
            if (r6 < r4) goto L8e
            goto L5b
        L8e:
            java.lang.String r3 = r3.substring(r6)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L81
            r5.close()     // Catch: java.lang.Throwable -> La4
            goto La4
        L9a:
            r5.close()     // Catch: java.lang.Throwable -> La3
            goto La3
        L9e:
            if (r4 == 0) goto La3
            r4.close()     // Catch: java.lang.Throwable -> La3
        La3:
            r3 = r1
        La4:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lab
            return r3
        Lab:
            int r2 = r2 + 1
            goto L14
        Laf:
            return r1
    }

    public final l8.i b() {
            r6 = this;
            l8.i r0 = r6.f9616c
            android.content.Context r1 = r6.f9614a
            java.lang.ClassLoader r2 = r6.f9615b
            l8.i r1 = a(r1, r2)
            if (r0 != 0) goto Lf
            r6.f9616c = r1
            return r1
        Lf:
            java.lang.String r2 = r0.f7930e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L18
            goto L54
        L18:
            java.lang.String r2 = r0.f7929d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L21
            goto L54
        L21:
            long r2 = r0.f7926a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L2a
            goto L54
        L2a:
            java.lang.String r2 = r0.f7933h
            java.lang.String r3 = r1.f7933h
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L54
            java.lang.String r2 = r0.f7930e
            java.lang.String r3 = r1.f7930e
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L54
            java.lang.String r2 = r0.f7931f
            java.lang.String r3 = r1.f7931f
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L54
            java.lang.String r2 = r0.f7932g
            java.lang.String r3 = r1.f7932g
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L53
            goto L54
        L53:
            return r0
        L54:
            r6.f9616c = r1
            return r1
    }
}
