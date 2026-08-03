package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class av {
    private static final java.lang.String a = "mPBE";
    private static final java.lang.String b = "_Ladder_Project";
    private static final java.lang.String c = "Pythagoras_phase";

    private av() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r6) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = "Pythagoras_phase"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = ""
            java.lang.String r2 = r0.getString(r6, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = com.tendcloud.tenddata.ab.g
            java.io.File r4 = r4.getFilesDir()
            r3.append(r4)
            java.lang.String r4 = java.io.File.separator
            r3.append(r4)
            java.lang.String r4 = "_Ladder_Project"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = d(r3, r6)
            boolean r5 = com.tendcloud.tenddata.y.b(r4)
            if (r5 == 0) goto L4a
            boolean r5 = com.tendcloud.tenddata.y.b(r2)
            if (r5 != 0) goto L4a
            a(r3, r6, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r6 = r0.putString(r6, r1)
            r6.apply()
            goto L4b
        L4a:
            r2 = r4
        L4b:
            return r2
    }

    public static void a(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.io.File r1 = r1.getFilesDir()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = "_Ladder_Project"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            a(r0, r2, r3)
            return
    }

    private static void a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L19
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L19
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L19
            return
        L19:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L3c
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L2b
            boolean r3 = r2.createNewFile()     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L2b
            return
        L2b:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            byte[] r2 = r4.getBytes()     // Catch: java.lang.Throwable -> L3b
            r3.write(r2)     // Catch: java.lang.Throwable -> L3b
            r3.close()     // Catch: java.lang.Throwable -> L41
            goto L41
        L3b:
            r0 = r3
        L3c:
            if (r0 == 0) goto L41
            r0.close()     // Catch: java.lang.Throwable -> L41
        L41:
            return
    }

    public static void a(java.lang.String r4, byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L16
            r3 = r5[r2]
            r0.append(r3)
            java.lang.String r3 = ","
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L16:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.io.File r1 = r1.getFilesDir()
            r5.append(r1)
            java.lang.String r1 = java.io.File.separator
            r5.append(r1)
            java.lang.String r1 = "mPBE"
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = r0.toString()
            a(r5, r4, r0)
            return
    }

    private static byte[] a(int r2, java.lang.String r3) {
            boolean r0 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1e
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = ","
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.Throwable -> L1e
            r0 = 0
        Lf:
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1e
            if (r0 >= r1) goto L1d
            r1 = r3[r0]     // Catch: java.lang.Throwable -> L1e
            byte r1 = java.lang.Byte.parseByte(r1)     // Catch: java.lang.Throwable -> L1e
            r2[r0] = r1     // Catch: java.lang.Throwable -> L1e
            int r0 = r0 + 1
            goto Lf
        L1d:
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static byte[] a(java.lang.String r6, int r7) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = "mPBE"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r2 = ""
            java.lang.String r3 = r0.getString(r6, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = com.tendcloud.tenddata.ab.g
            java.io.File r5 = r5.getFilesDir()
            r4.append(r5)
            java.lang.String r5 = java.io.File.separator
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = d(r1, r6)
            boolean r5 = com.tendcloud.tenddata.y.b(r4)
            if (r5 == 0) goto L4e
            boolean r4 = com.tendcloud.tenddata.y.b(r3)
            if (r4 != 0) goto L4c
            a(r1, r6, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r6 = r0.putString(r6, r2)
            r6.apply()
            byte[] r6 = a(r7, r3)
            goto L52
        L4c:
            r6 = 0
            goto L52
        L4e:
            byte[] r6 = a(r7, r4)
        L52:
            return r6
    }

    public static java.lang.String b(java.lang.String r1) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = d(r0, r1)
            return r1
    }

    public static void b(java.lang.String r1, java.lang.String r2) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r0 = r0.getPath()
            a(r0, r1, r2)
            return
    }

    public static java.lang.String c(java.lang.String r1) {
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = r0.getProperty(r1)
            return r1
    }

    public static void c(java.lang.String r1, java.lang.String r2) {
            java.util.Properties r0 = java.lang.System.getProperties()
            r0.setProperty(r1, r2)
            return
    }

    private static java.lang.String d(java.lang.String r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            java.lang.String r1 = ""
            if (r4 != 0) goto L1a
            boolean r4 = r0.isDirectory()
            if (r4 != 0) goto L1a
            boolean r4 = r0.mkdirs()
            if (r4 != 0) goto L1a
            return r1
        L1a:
            r4 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r0, r5)     // Catch: java.lang.Throwable -> L4f
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L42
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            long r2 = r2.length()     // Catch: java.lang.Throwable -> L40
            int r4 = (int) r2     // Catch: java.lang.Throwable -> L40
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L40
            int r0 = r5.read(r4)     // Catch: java.lang.Throwable -> L40
            if (r0 <= 0) goto L3e
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L40
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L40
            r1 = r0
        L3e:
            r4 = r5
            goto L49
        L40:
            r4 = r5
            goto L4f
        L42:
            boolean r5 = r2.createNewFile()     // Catch: java.lang.Throwable -> L4f
            if (r5 != 0) goto L49
            return r1
        L49:
            if (r4 == 0) goto L52
        L4b:
            r4.close()     // Catch: java.lang.Throwable -> L52
            goto L52
        L4f:
            if (r4 == 0) goto L52
            goto L4b
        L52:
            return r1
    }
}
