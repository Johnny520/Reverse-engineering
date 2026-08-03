package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0638 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f1621 = "AtomicFile";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.io.File f1622;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.io.File f1623;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.io.File f1624;

    public C0638(@Yue.InterfaceC4410 java.io.File r4) {
            r3 = this;
            r3.<init>()
            r3.f1622 = r4
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getPath()
            r1.append(r2)
            java.lang.String r2 = ".new"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.f1623 = r0
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r4.getPath()
            r1.append(r4)
            java.lang.String r4 = ".bak"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            r3.f1624 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m4184(@Yue.InterfaceC4410 java.io.File r3, @Yue.InterfaceC4410 java.io.File r4) {
            boolean r0 = r4.isDirectory()
            java.lang.String r1 = "AtomicFile"
            if (r0 == 0) goto L22
            boolean r0 = r4.delete()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to delete file which is a directory "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
        L22:
            boolean r0 = r3.renameTo(r4)
            if (r0 != 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to rename "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            android.util.Log.e(r1, r3)
        L44:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m4185(@Yue.InterfaceC4410 java.io.FileOutputStream r0) {
            java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.io.IOException -> L9
            r0.sync()     // Catch: java.io.IOException -> L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m4186() {
            r1 = this;
            java.io.File r0 = r1.f1622
            r0.delete()
            java.io.File r0 = r1.f1623
            r0.delete()
            java.io.File r0 = r1.f1624
            r0.delete()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m4187(@Yue.InterfaceC4544 java.io.FileOutputStream r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = m4185(r3)
            java.lang.String r1 = "AtomicFile"
            if (r0 != 0) goto L10
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r1, r0)
        L10:
            r3.close()     // Catch: java.io.IOException -> L14
            goto L1a
        L14:
            r3 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r1, r0, r3)
        L1a:
            java.io.File r3 = r2.f1623
            boolean r3 = r3.delete()
            if (r3 != 0) goto L38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Failed to delete new file "
            r3.append(r0)
            java.io.File r0 = r2.f1623
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r1, r3)
        L38:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m4188(@Yue.InterfaceC4544 java.io.FileOutputStream r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = m4185(r3)
            java.lang.String r1 = "AtomicFile"
            if (r0 != 0) goto L10
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r1, r0)
        L10:
            r3.close()     // Catch: java.io.IOException -> L14
            goto L1a
        L14:
            r3 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r1, r0, r3)
        L1a:
            java.io.File r3 = r2.f1623
            java.io.File r0 = r2.f1622
            m4184(r3, r0)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.io.File m4189() {
            r1 = this;
            java.io.File r0 = r1.f1622
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.io.FileInputStream m4190() throws java.io.FileNotFoundException {
            r2 = this;
            java.io.File r0 = r2.f1624
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lf
            java.io.File r0 = r2.f1624
            java.io.File r1 = r2.f1622
            m4184(r0, r1)
        Lf:
            java.io.File r0 = r2.f1623
            boolean r0 = r0.exists()
            if (r0 == 0) goto L3f
            java.io.File r0 = r2.f1622
            boolean r0 = r0.exists()
            if (r0 == 0) goto L3f
            java.io.File r0 = r2.f1623
            boolean r0 = r0.delete()
            if (r0 != 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to delete outdated new file "
            r0.append(r1)
            java.io.File r1 = r2.f1623
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AtomicFile"
            android.util.Log.e(r1, r0)
        L3f:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.f1622
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public byte[] m4191() throws java.io.IOException {
            r6 = this;
            java.io.FileInputStream r0 = r6.m4190()
            int r1 = r0.available()     // Catch: java.lang.Throwable -> L29
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r3 = r2
        Lc:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L29
            int r4 = r4 - r3
            int r4 = r0.read(r1, r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r4 > 0) goto L18
            r0.close()
            return r1
        L18:
            int r3 = r3 + r4
            int r4 = r0.available()     // Catch: java.lang.Throwable -> L29
            int r5 = r1.length     // Catch: java.lang.Throwable -> L29
            int r5 = r5 - r3
            if (r4 <= r5) goto Lc
            int r4 = r4 + r3
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L29
            java.lang.System.arraycopy(r1, r2, r4, r2, r3)     // Catch: java.lang.Throwable -> L29
            r1 = r4
            goto Lc
        L29:
            r1 = move-exception
            r0.close()
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.io.FileOutputStream m4192() throws java.io.IOException {
            r4 = this;
            java.io.File r0 = r4.f1624
            boolean r0 = r0.exists()
            if (r0 == 0) goto Lf
            java.io.File r0 = r4.f1624
            java.io.File r1 = r4.f1622
            m4184(r0, r1)
        Lf:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L17
            java.io.File r1 = r4.f1623     // Catch: java.io.FileNotFoundException -> L17
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L17
            return r0
        L17:
            java.io.File r0 = r4.f1623
            java.io.File r0 = r0.getParentFile()
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L45
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L2b
            java.io.File r1 = r4.f1623     // Catch: java.io.FileNotFoundException -> L2b
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L2b
            return r0
        L2b:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to create new file "
            r2.append(r3)
            java.io.File r3 = r4.f1623
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L45:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create directory for "
            r1.append(r2)
            java.io.File r2 = r4.f1623
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
