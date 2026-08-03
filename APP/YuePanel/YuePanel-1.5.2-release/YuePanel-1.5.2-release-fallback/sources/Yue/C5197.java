package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5197 extends Yue.AbstractC1952 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.io.File f19542;

    public C5197(@Yue.InterfaceC4544 Yue.AbstractC1952 r1, java.io.File r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f19542 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static boolean m19658(java.io.File r6) {
            java.io.File[] r6 = r6.listFiles()
            r0 = 1
            if (r6 == 0) goto L39
            int r1 = r6.length
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L39
            r4 = r6[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L19
            boolean r5 = m19658(r4)
            r0 = r0 & r5
        L19:
            boolean r5 = r4.delete()
            if (r5 != 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Failed to delete "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "DocumentFile"
            android.util.Log.w(r4, r0)
            r0 = r2
        L36:
            int r3 = r3 + 1
            goto La
        L39:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static java.lang.String m19659(java.lang.String r1) {
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L1d
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r1 = r1.toLowerCase()
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r0.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L1d
            return r1
        L1d:
            java.lang.String r1 = "application/octet-stream"
            return r1
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ */
    public boolean mo8990() {
            r1 = this;
            java.io.File r0 = r1.f19542
            boolean r0 = r0.canRead()
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo8991() {
            r1 = this;
            java.io.File r0 = r1.f19542
            boolean r0 = r0.canWrite()
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.AbstractC1952 mo8992(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.f19542
            r0.<init>(r1, r3)
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto L16
            boolean r3 = r0.mkdir()
            if (r3 == 0) goto L14
            goto L16
        L14:
            r3 = 0
            return r3
        L16:
            Yue.ۥۡۦ۟۟ r3 = new Yue.ۥۡۦ۟۟
            r3.<init>(r2, r0)
            return r3
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Yue.AbstractC1952 mo8993(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r0.getExtensionFromMimeType(r2)
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
        L1e:
            java.io.File r2 = new java.io.File
            java.io.File r0 = r1.f19542
            r2.<init>(r0, r3)
            r2.createNewFile()     // Catch: java.io.IOException -> L2e
            Yue.ۥۡۦ۟۟ r3 = new Yue.ۥۡۦ۟۟     // Catch: java.io.IOException -> L2e
            r3.<init>(r1, r2)     // Catch: java.io.IOException -> L2e
            return r3
        L2e:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Failed to createFile: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DocumentFile"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo8994() {
            r1 = this;
            java.io.File r0 = r1.f19542
            m19658(r0)
            java.io.File r0 = r1.f19542
            boolean r0 = r0.delete()
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo8995() {
            r1 = this;
            java.io.File r0 = r1.f19542
            boolean r0 = r0.exists()
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.String mo8997() {
            r1 = this;
            java.io.File r0 = r1.f19542
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public java.lang.String mo8999() {
            r1 = this;
            java.io.File r0 = r1.f19542
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.io.File r0 = r1.f19542
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = m19659(r0)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public android.net.Uri mo9000() {
            r1 = this;
            java.io.File r0 = r1.f19542
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo9001() {
            r1 = this;
            java.io.File r0 = r1.f19542
            boolean r0 = r0.isDirectory()
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo9002() {
            r1 = this;
            java.io.File r0 = r1.f19542
            boolean r0 = r0.isFile()
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo9003() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public long mo9004() {
            r2 = this;
            java.io.File r0 = r2.f19542
            long r0 = r0.lastModified()
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public long mo9005() {
            r2 = this;
            java.io.File r0 = r2.f19542
            long r0 = r0.length()
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public Yue.AbstractC1952[] mo9006() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r6.f19542
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L1e
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            Yue.ۥۡۦ۟۟ r5 = new Yue.ۥۡۦ۟۟
            r5.<init>(r6, r4)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L1e:
            int r1 = r0.size()
            Yue.ۥ۠۟ۧۦ[] r1 = new Yue.AbstractC1952[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            Yue.ۥ۠۟ۧۦ[] r0 = (Yue.AbstractC1952[]) r0
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo9007(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r2.f19542
            java.io.File r1 = r1.getParentFile()
            r0.<init>(r1, r3)
            java.io.File r3 = r2.f19542
            boolean r3 = r3.renameTo(r0)
            if (r3 == 0) goto L17
            r2.f19542 = r0
            r3 = 1
            return r3
        L17:
            r3 = 0
            return r3
    }
}
