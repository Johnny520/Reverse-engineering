package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private static final java.lang.String a = "pref.deviceid.key";
    private static final java.util.regex.Pattern b = null;
    private static final java.util.regex.Pattern c = null;
    private static final java.lang.String d = ".tcookieid";
    private static final java.lang.String e = ".tlocalcookieid";
    private static volatile java.lang.String f;
    private static java.lang.String g;
    private static java.lang.String h;

    static {
            java.lang.String r0 = "[0-4][0-9a-f]{24,32}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.tendcloud.tenddata.j.b = r0
            java.lang.String r0 = "[0-4][0-9a-f]{32}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.tendcloud.tenddata.j.c = r0
            java.lang.String r0 = "TD_Custom_Dev_Id"
            com.tendcloud.tenddata.j.g = r0
            r0 = 0
            com.tendcloud.tenddata.j.h = r0
            return
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized java.lang.String a(android.content.Context r2) {
            java.lang.Class<com.tendcloud.tenddata.j> r0 = com.tendcloud.tenddata.j.class
            monitor-enter(r0)
            java.lang.String r1 = com.tendcloud.tenddata.j.f     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Ld
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L11
            com.tendcloud.tenddata.j.f = r2     // Catch: java.lang.Throwable -> L11
        Ld:
            java.lang.String r2 = com.tendcloud.tenddata.j.f     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static java.lang.String a(android.content.Context r2, boolean r3, java.lang.String r4) {
            r0 = 23
            boolean r0 = com.tendcloud.tenddata.y.a(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = r2.checkSelfPermission(r0)
            if (r0 == 0) goto L12
            r2 = 0
            return r2
        L12:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L62
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            if (r3 == 0) goto L27
            goto L36
        L27:
            java.lang.StringBuilder r3 = p000.c4.m108(r4)
            java.lang.String r4 = c(r2)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
        L36:
            r0.<init>(r1, r4)
            java.lang.String r3 = a(r0)
            boolean r4 = com.tendcloud.tenddata.y.b(r3)
            if (r4 == 0) goto L61
            java.io.File r3 = new java.io.File
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = ".tid"
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.String r2 = c(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r4, r2)
            java.lang.String r3 = a(r3)
        L61:
            return r3
        L62:
            java.lang.String r2 = ""
            return r2
    }

    private static java.lang.String a(java.io.File r5) {
            r0 = 0
            boolean r1 = r5.exists()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L24
            boolean r1 = r5.canRead()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L24
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L24
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L24
            r5 = 128(0x80, float:1.8E-43)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L25
            int r2 = r1.read(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L25
            r4 = 0
            r3.<init>(r5, r4, r2)     // Catch: java.lang.Throwable -> L25
            r1.close()     // Catch: java.lang.Throwable -> L23
        L23:
            return r3
        L24:
            r1 = r0
        L25:
            if (r1 == 0) goto L2a
            r1.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            return r0
    }

    public static java.lang.String a(java.lang.String r10) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "/"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            java.io.File[] r1 = r1.listFiles()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L6d
            int r2 = r1.length     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L12
            goto L6d
        L12:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L6d
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r2) goto L6d
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L6d
            boolean r6 = r5.isDirectory()     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L6a
            java.lang.String r6 = "/sdcard"
            java.lang.String r7 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L6d
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L6d
            if (r6 != 0) goto L6a
            boolean r6 = r5.canWrite()     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L41
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L6d
            r6.<init>(r5, r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = a(r6)     // Catch: java.lang.Throwable -> L6d
            boolean r6 = com.tendcloud.tenddata.y.b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != 0) goto L41
            return r0
        L41:
            java.io.File[] r6 = r5.listFiles()     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L6a
            java.io.File[] r5 = r5.listFiles()     // Catch: java.lang.Throwable -> L6d
            int r6 = r5.length     // Catch: java.lang.Throwable -> L6d
            r7 = r3
        L4d:
            if (r7 >= r6) goto L6a
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L6d
            boolean r9 = r8.isDirectory()     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L67
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L6d
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = a(r9)     // Catch: java.lang.Throwable -> L6d
            boolean r8 = com.tendcloud.tenddata.y.b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L67
            return r0
        L67:
            int r7 = r7 + 1
            goto L4d
        L6a:
            int r4 = r4 + 1
            goto L15
        L6d:
            return r0
    }

    private static void a(android.content.Context r12, java.lang.String r13) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "/"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La2
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La2
            int r1 = r0.length     // Catch: java.lang.Throwable -> La2
            if (r1 != 0) goto L12
            goto La2
        L12:
            int r1 = r0.length     // Catch: java.lang.Throwable -> La2
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r1) goto La2
            r4 = r0[r3]     // Catch: java.lang.Throwable -> La2
            boolean r5 = r4.isDirectory()     // Catch: java.lang.Throwable -> La2
            if (r5 == 0) goto L9e
            java.lang.String r5 = "/sdcard"
            java.lang.String r6 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> La2
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> La2
            if (r5 != 0) goto L9e
            boolean r5 = r4.canWrite()     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = ".tcookieid"
            if (r5 == 0) goto L59
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r7.<init>()     // Catch: java.lang.Throwable -> La2
            r7.append(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.String r8 = c(r12)     // Catch: java.lang.Throwable -> La2
            r7.append(r8)     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La2
            r5.<init>(r4, r7)     // Catch: java.lang.Throwable -> La2
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> La2
            if (r5 != 0) goto L59
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> La2
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> La2
            a(r5, r13)     // Catch: java.lang.Throwable -> La2
        L59:
            java.io.File[] r5 = r4.listFiles()     // Catch: java.lang.Throwable -> La2
            if (r5 == 0) goto L9e
            java.io.File[] r4 = r4.listFiles()     // Catch: java.lang.Throwable -> La2
            int r5 = r4.length     // Catch: java.lang.Throwable -> La2
            r7 = r2
        L65:
            if (r7 >= r5) goto L9e
            r8 = r4[r7]     // Catch: java.lang.Throwable -> La2
            boolean r9 = r8.isDirectory()     // Catch: java.lang.Throwable -> La2
            if (r9 == 0) goto L9b
            boolean r9 = r8.canWrite()     // Catch: java.lang.Throwable -> La2
            if (r9 == 0) goto L9b
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r10.<init>()     // Catch: java.lang.Throwable -> La2
            r10.append(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.String r11 = c(r12)     // Catch: java.lang.Throwable -> La2
            r10.append(r11)     // Catch: java.lang.Throwable -> La2
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La2
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> La2
            boolean r9 = r9.exists()     // Catch: java.lang.Throwable -> La2
            if (r9 != 0) goto L9b
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> La2
            r9.<init>(r8, r6)     // Catch: java.lang.Throwable -> La2
            a(r9, r13)     // Catch: java.lang.Throwable -> La2
        L9b:
            int r7 = r7 + 1
            goto L65
        L9e:
            int r3 = r3 + 1
            goto L15
        La2:
            return
    }

    private static void a(android.content.Context r3, java.lang.String r4, boolean r5) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L24
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = ".tlocalcookieid"
            if (r5 == 0) goto Lb
            goto L1e
        Lb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r5.<init>()     // Catch: java.lang.Throwable -> L24
            r5.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = c(r3)     // Catch: java.lang.Throwable -> L24
            r5.append(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L24
        L1e:
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L24
            a(r0, r4)     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    private static void a(java.io.File r7, java.lang.String r8) {
            r0 = 0
            boolean r1 = r7.exists()     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L28
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = com.tendcloud.tenddata.y.b(r1, r2)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L28
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L8b
            r2 = 29
            boolean r1 = com.tendcloud.tenddata.y.a(r1, r2)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L21
            boolean r1 = com.tendcloud.tenddata.y.a(r2)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L28
        L21:
            boolean r1 = r7.createNewFile()     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L28
            return
        L28:
            boolean r1 = r7.canWrite()     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L85
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L8b
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Throwable -> L83
            r1.write(r8)     // Catch: java.lang.Throwable -> L83
            r8 = 9
            boolean r8 = com.tendcloud.tenddata.y.a(r8)     // Catch: java.lang.Throwable -> L83
            if (r8 == 0) goto L65
            java.lang.Class r8 = r7.getClass()     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = "setReadable"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L83
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L83
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L83
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Throwable -> L83
            java.lang.reflect.Method r8 = r8.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L83
            r0[r5] = r2     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L83
            r0[r6] = r2     // Catch: java.lang.Throwable -> L83
            r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L83
            goto L81
        L65:
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r0.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "chmod 444 "
            r0.append(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L83
            r0.append(r7)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L83
            r8.exec(r7)     // Catch: java.lang.Throwable -> L83
        L81:
            r0 = r1
            goto L85
        L83:
            r0 = r1
            goto L8b
        L85:
            if (r0 == 0) goto L8e
        L87:
            r0.close()     // Catch: java.lang.Throwable -> L8e
            goto L8e
        L8b:
            if (r0 == 0) goto L8e
            goto L87
        L8e:
            return
    }

    public static boolean a() {
            r0 = 9
            r1 = 1
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Le
            boolean r0 = android.os.Environment.isExternalStorageRemovable()     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            r0 = r0 ^ r1
            return r0
    }

    private static java.lang.String b() {
            java.lang.String r0 = "mac"
            java.lang.String r0 = com.tendcloud.tenddata.l.a(r0)
            boolean r1 = com.tendcloud.tenddata.y.b(r0)
            if (r1 == 0) goto L12
            java.lang.String r0 = "androidId"
            java.lang.String r0 = com.tendcloud.tenddata.l.a(r0)
        L12:
            boolean r1 = com.tendcloud.tenddata.y.b(r0)
            if (r1 == 0) goto L20
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
        L20:
            java.lang.String r1 = "4"
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 3
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = com.tendcloud.tenddata.y.c(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String b(android.content.Context r4) {
            java.lang.String r0 = "pref.deviceid.key"
            java.lang.String r1 = "tdid"
            r2 = 0
            java.lang.String r1 = com.tendcloud.tenddata.s.b(r4, r1, r0, r2)     // Catch: java.lang.Throwable -> L18
            boolean r3 = com.tendcloud.tenddata.y.b(r1)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L17
            android.content.SharedPreferences r4 = android.preference.PreferenceManager.getDefaultSharedPreferences(r4)     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = r4.getString(r0, r2)     // Catch: java.lang.Throwable -> L18
        L17:
            return r1
        L18:
            java.lang.String r4 = ""
            return r4
    }

    private static void b(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "tdid"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L15
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "pref.deviceid.key"
            r2.putString(r0, r3)     // Catch: java.lang.Throwable -> L15
            r2.apply()     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    public static java.lang.String c(android.content.Context r5) {
            java.lang.String r0 = com.tendcloud.tenddata.j.h
            if (r0 != 0) goto L85
            java.lang.String r0 = "sensor"
            java.lang.Object r5 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L85
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5     // Catch: java.lang.Throwable -> L85
            r0 = -1
            java.util.List r5 = r5.getSensorList(r0)     // Catch: java.lang.Throwable -> L85
            r0 = 64
            android.hardware.Sensor[] r1 = new android.hardware.Sensor[r0]     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L85
        L19:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L38
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L85
            android.hardware.Sensor r2 = (android.hardware.Sensor) r2     // Catch: java.lang.Throwable -> L85
            int r3 = r2.getType()     // Catch: java.lang.Throwable -> L85
            if (r3 >= r0) goto L19
            int r3 = r2.getType()     // Catch: java.lang.Throwable -> L85
            if (r3 < 0) goto L19
            int r3 = r2.getType()     // Catch: java.lang.Throwable -> L85
            r1[r3] = r2     // Catch: java.lang.Throwable -> L85
            goto L19
        L38:
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L85
            r5.<init>()     // Catch: java.lang.Throwable -> L85
            r2 = 0
        L3e:
            if (r2 >= r0) goto L77
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L74
            r5.append(r2)     // Catch: java.lang.Throwable -> L85
            r3 = 46
            r5.append(r3)     // Catch: java.lang.Throwable -> L85
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = r3.getVendor()     // Catch: java.lang.Throwable -> L85
            r5.append(r3)     // Catch: java.lang.Throwable -> L85
            r3 = 45
            r5.append(r3)     // Catch: java.lang.Throwable -> L85
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L85
            r5.append(r4)     // Catch: java.lang.Throwable -> L85
            r5.append(r3)     // Catch: java.lang.Throwable -> L85
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L85
            int r3 = r3.getVersion()     // Catch: java.lang.Throwable -> L85
            r5.append(r3)     // Catch: java.lang.Throwable -> L85
            r3 = 10
            r5.append(r3)     // Catch: java.lang.Throwable -> L85
        L74:
            int r2 = r2 + 1
            goto L3e
        L77:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L85
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L85
            com.tendcloud.tenddata.j.h = r5     // Catch: java.lang.Throwable -> L85
        L85:
            java.lang.String r5 = com.tendcloud.tenddata.j.h
            return r5
    }

    private static java.lang.String d(android.content.Context r8) {
            java.lang.String r0 = b(r8)
            boolean r1 = a()
            java.lang.String r2 = ".tlocalcookieid"
            java.lang.String r2 = a(r8, r1, r2)
            boolean r3 = com.tendcloud.tenddata.y.b(r0)
            if (r3 != 0) goto L22
            java.util.regex.Pattern r3 = com.tendcloud.tenddata.j.c
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L22
            r3 = r0
            goto L64
        L22:
            boolean r3 = com.tendcloud.tenddata.y.b(r2)
            if (r3 != 0) goto L36
            java.util.regex.Pattern r3 = com.tendcloud.tenddata.j.c
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L36
            r3 = r2
            goto L64
        L36:
            java.lang.String r3 = ".tcookieid"
            java.lang.String r4 = a(r3)
            java.lang.String r3 = a(r8, r1, r3)
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]
            r7 = 0
            r6[r7] = r4
            r4 = 1
            r6[r4] = r3
        L49:
            if (r7 >= r5) goto L63
            r3 = r6[r7]
            boolean r4 = com.tendcloud.tenddata.y.b(r3)
            if (r4 != 0) goto L60
            java.util.regex.Pattern r4 = com.tendcloud.tenddata.j.c
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L60
            goto L64
        L60:
            int r7 = r7 + 1
            goto L49
        L63:
            r3 = 0
        L64:
            boolean r4 = com.tendcloud.tenddata.y.b(r3)
            if (r4 == 0) goto L7b
            r3 = 29
            boolean r3 = com.tendcloud.tenddata.y.a(r3)
            if (r3 == 0) goto L77
            java.lang.String r3 = b()
            goto L7b
        L77:
            java.lang.String r3 = e(r8)
        L7b:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L84
            b(r8, r3)
        L84:
            boolean r0 = com.tendcloud.tenddata.y.b(r2)
            if (r0 == 0) goto L8d
            a(r8, r3, r1)
        L8d:
            return r3
    }

    private static java.lang.String e(android.content.Context r1) {
            java.lang.String r1 = f(r1)
            java.lang.String r0 = "3"
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.String r1 = com.tendcloud.tenddata.y.c(r1)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String f(android.content.Context r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = com.tendcloud.tenddata.l.f(r2)     // Catch: java.lang.Throwable -> L2b
            r0.append(r2)     // Catch: java.lang.Throwable -> L2b
            r2 = 45
            r0.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "mac"
            java.lang.String r1 = com.tendcloud.tenddata.l.a(r1)     // Catch: java.lang.Throwable -> L2b
            r0.append(r1)     // Catch: java.lang.Throwable -> L2b
            r0.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "androidId"
            java.lang.String r2 = com.tendcloud.tenddata.l.a(r2)     // Catch: java.lang.Throwable -> L2b
            r0.append(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            return r2
        L2b:
            java.lang.String r2 = ""
            return r2
    }
}
