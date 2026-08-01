package androidx.core.content;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends android.content.ContentProvider {

    /* JADX INFO: renamed from: θ */
    public static final java.lang.String[] f997 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.io.File f998 = null;

    /* JADX INFO: renamed from: κ */
    public static final java.util.HashMap f999 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f1000;

    /* JADX INFO: renamed from: ζ */
    public java.lang.String f1001;

    /* JADX INFO: renamed from: η */
    public p000.j30 f1002;

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.core.content.FileProvider.f997 = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            androidx.core.content.FileProvider.f998 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.content.FileProvider.f999 = r0
            return
    }

    public FileProvider() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f1000 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m413(java.lang.String r2) {
            int r0 = r2.length()
            if (r0 <= 0) goto L1f
            int r0 = r2.length()
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 47
            if (r0 != r1) goto L1f
            int r0 = r2.length()
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L1f:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static p000.j30 m414(android.content.Context r2, java.lang.String r3) {
            java.util.HashMap r0 = androidx.core.content.FileProvider.f999
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            j30 r1 = (p000.j30) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L27
            j30 r1 = m415(r2, r3)     // Catch: java.lang.Throwable -> L13 org.xmlpull.v1.XmlPullParserException -> L15 java.io.IOException -> L1e
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L13
            goto L27
        L13:
            r2 = move-exception
            goto L29
        L15:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L1e:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    /* JADX INFO: renamed from: δ */
    public static p000.j30 m415(android.content.Context r7, java.lang.String r8) {
            j30 r0 = new j30
            r0.<init>()
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r8, r2)
            if (r1 == 0) goto Le4
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            java.lang.String r2 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r8 = r1.loadXmlMetaData(r8, r2)
            if (r8 == 0) goto Lde
        L1d:
            int r1 = r8.next()
            r2 = 1
            if (r1 == r2) goto Ldd
            r2 = 2
            if (r1 != r2) goto L1d
            java.lang.String r1 = r8.getName()
            java.lang.String r2 = "name"
            r3 = 0
            java.lang.String r2 = r8.getAttributeValue(r3, r2)
            java.lang.String r4 = "path"
            java.lang.String r4 = r8.getAttributeValue(r3, r4)
            java.lang.String r5 = "root-path"
            boolean r5 = r5.equals(r1)
            r6 = 0
            if (r5 == 0) goto L44
            java.io.File r3 = androidx.core.content.FileProvider.f998
            goto La0
        L44:
            java.lang.String r5 = "files-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L51
            java.io.File r3 = r7.getFilesDir()
            goto La0
        L51:
            java.lang.String r5 = "cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5e
            java.io.File r3 = r7.getCacheDir()
            goto La0
        L5e:
            java.lang.String r5 = "external-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L6b
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            goto La0
        L6b:
            java.lang.String r5 = "external-files-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L7d
            java.io.File[] r1 = r7.getExternalFilesDirs(r3)
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r3 = r1[r6]
            goto La0
        L7d:
            java.lang.String r5 = "external-cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8f
            java.io.File[] r1 = r7.getExternalCacheDirs()
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r3 = r1[r6]
            goto La0
        L8f:
            java.lang.String r5 = "external-media-path"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La0
            java.io.File[] r1 = r7.getExternalMediaDirs()
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r3 = r1[r6]
        La0:
            if (r3 == 0) goto L1d
            java.lang.String[] r1 = new java.lang.String[]{r4}
            r1 = r1[r6]
            if (r1 == 0) goto Lb0
            java.io.File r4 = new java.io.File
            r4.<init>(r3, r1)
            r3 = r4
        Lb0:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto Ld6
            java.io.File r1 = r3.getCanonicalFile()     // Catch: java.io.IOException -> Lc1
            java.util.HashMap r3 = r0.f5304
            r3.put(r2, r1)
            goto L1d
        Lc1:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to resolve canonical path for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0, r7)
            throw r8
        Ld6:
            java.lang.String r7 = "Name must not be empty"
            p000.C1080.m7275(r7)
        Ldb:
            r7 = 0
            return r7
        Ldd:
            return r0
        Lde:
            java.lang.String r7 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            p000.C1080.m7275(r7)
            goto Ldb
        Le4:
            java.lang.String r7 = "Couldn't find meta-data for provider with authority "
            java.lang.String r7 = p000.lz1.m3687(r7, r8)
            p000.C1080.m7275(r7)
            goto Ldb
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context r1, android.content.pm.ProviderInfo r2) {
            r0 = this;
            super.attachInfo(r1, r2)
            boolean r1 = r2.exported
            if (r1 != 0) goto L48
            boolean r1 = r2.grantUriPermissions
            if (r1 == 0) goto L40
            java.lang.String r1 = r2.authority
            if (r1 == 0) goto L38
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L38
            java.lang.String r1 = r2.authority
            java.lang.String r2 = ";"
            java.lang.String[] r1 = r1.split(r2)
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r2 = r0.f1000
            monitor-enter(r2)
            r0.f1001 = r1     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r0 = androidx.core.content.FileProvider.f999
            monitor-enter(r0)
            r0.remove(r1)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
        L35:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must have a non-empty authority"
            r0.<init>(r1)
            throw r0
        L40:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must grant uri permissions"
            r0.<init>(r1)
            throw r0
        L48:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must not be exported"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            j30 r0 = r0.m416()
            java.io.File r0 = r0.m2848(r1)
            boolean r0 = r0.delete()
            return r0
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            j30 r1 = r1.m416()
            java.io.File r1 = r1.m2848(r2)
            java.lang.String r2 = r1.getName()
            r0 = 46
            int r2 = r2.lastIndexOf(r0)
            if (r2 < 0) goto L29
            java.lang.String r1 = r1.getName()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r2.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L29
            return r1
        L29:
            java.lang.String r1 = "application/octet-stream"
            return r1
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getTypeAnonymous(android.net.Uri r1) {
            r0 = this;
            java.lang.String r0 = "application/octet-stream"
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "No external inserts"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r1, java.lang.String r2) {
            r0 = this;
            j30 r0 = r0.m416()
            java.io.File r0 = r0.m2848(r1)
            java.lang.String r1 = "r"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L13
            r1 = 268435456(0x10000000, float:2.524355E-29)
            goto L52
        L13:
            java.lang.String r1 = "w"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L50
            java.lang.String r1 = "wt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L24
            goto L50
        L24:
            java.lang.String r1 = "wa"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            r1 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L52
        L2f:
            java.lang.String r1 = "rw"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3a
            r1 = 939524096(0x38000000, float:3.0517578E-5)
            goto L52
        L3a:
            java.lang.String r1 = "rwt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r1 = 1006632960(0x3c000000, float:0.0078125)
            goto L52
        L45:
            java.lang.String r0 = "Invalid mode: "
            java.lang.String r0 = p000.lz1.m3687(r0, r2)
            p000.C1080.m7275(r0)
            r0 = 0
            return r0
        L50:
            r1 = 738197504(0x2c000000, float:1.8189894E-12)
        L52:
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r0, r1)
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r7, java.lang.String[] r8, java.lang.String r9, java.lang.String[] r10, java.lang.String r11) {
            r6 = this;
            j30 r6 = r6.m416()
            java.io.File r6 = r6.m2848(r7)
            java.lang.String r9 = "displayName"
            java.lang.String r7 = r7.getQueryParameter(r9)
            if (r8 != 0) goto L12
            java.lang.String[] r8 = androidx.core.content.FileProvider.f997
        L12:
            int r9 = r8.length
            java.lang.String[] r9 = new java.lang.String[r9]
            int r10 = r8.length
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r11 = r8.length
            r0 = 0
            r1 = r0
            r2 = r1
        L1c:
            if (r1 >= r11) goto L52
            r3 = r8[r1]
            java.lang.String r4 = "_display_name"
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L38
            r9[r2] = r4
            int r3 = r2 + 1
            if (r7 != 0) goto L33
            java.lang.String r4 = r6.getName()
            goto L34
        L33:
            r4 = r7
        L34:
            r10[r2] = r4
        L36:
            r2 = r3
            goto L4f
        L38:
            java.lang.String r4 = "_size"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L4f
            r9[r2] = r4
            int r3 = r2 + 1
            long r4 = r6.length()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r10[r2] = r4
            goto L36
        L4f:
            int r1 = r1 + 1
            goto L1c
        L52:
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.System.arraycopy(r9, r0, r6, r0, r2)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.System.arraycopy(r10, r0, r7, r0, r2)
            android.database.MatrixCursor r8 = new android.database.MatrixCursor
            r9 = 1
            r8.<init>(r6, r9)
            r8.addRow(r7)
            return r8
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "No external updates"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: β */
    public final p000.j30 m416() {
            r3 = this;
            java.lang.Object r0 = r3.f1000
            monitor-enter(r0)
            java.lang.String r1 = r3.f1001     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?"
            if (r1 == 0) goto L20
            j30 r1 = r3.f1002     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r3.f1001     // Catch: java.lang.Throwable -> L1a
            j30 r1 = m414(r1, r2)     // Catch: java.lang.Throwable -> L1a
            r3.f1002 = r1     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            j30 r3 = r3.f1002     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L20:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1a
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
    }
}
