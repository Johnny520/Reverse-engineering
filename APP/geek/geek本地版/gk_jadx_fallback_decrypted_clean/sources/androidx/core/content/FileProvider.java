package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends android.content.ContentProvider {
    public static final java.lang.String[] b = null;
    public static final java.io.File c = null;
    public static final java.util.HashMap d = null;
    public defpackage.zj a;

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.core.content.FileProvider.b = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            androidx.core.content.FileProvider.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.content.FileProvider.d = r0
            return
    }

    public FileProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public static defpackage.zj a(android.content.Context r7, java.lang.String r8) {
            zj r0 = new zj
            r0.<init>()
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r8, r2)
            if (r1 == 0) goto Le7
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            java.lang.String r2 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r8 = r1.loadXmlMetaData(r8, r2)
            if (r8 == 0) goto Ldf
        L1d:
            int r1 = r8.next()
            r2 = 1
            if (r1 == r2) goto Lde
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
            java.io.File r3 = androidx.core.content.FileProvider.c
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
            java.io.File[] r1 = defpackage.fd.b(r7, r3)
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r3 = r1[r6]
            goto La0
        L7d:
            java.lang.String r5 = "external-cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8f
            java.io.File[] r1 = defpackage.fd.a(r7)
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r3 = r1[r6]
            goto La0
        L8f:
            java.lang.String r5 = "external-media-path"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La0
            java.io.File[] r1 = defpackage.yj.a(r7)
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
            java.util.HashMap r3 = r0.a
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
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Name must not be empty"
            r7.<init>(r8)
            throw r7
        Lde:
            return r0
        Ldf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r7.<init>(r8)
            throw r7
        Le7:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Couldn't find meta-data for provider with authority "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context r3, android.content.pm.ProviderInfo r4) {
            r2 = this;
            super.attachInfo(r3, r4)
            boolean r0 = r4.exported
            if (r0 != 0) goto L53
            boolean r0 = r4.grantUriPermissions
            if (r0 == 0) goto L4b
            java.lang.String r4 = r4.authority
            java.lang.String r0 = ";"
            java.lang.String[] r4 = r4.split(r0)
            r0 = 0
            r4 = r4[r0]
            java.util.HashMap r0 = androidx.core.content.FileProvider.d
            monitor-enter(r0)
            r0.remove(r4)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L2e
            zj r1 = (defpackage.zj) r1     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L42
            zj r1 = a(r3, r4)     // Catch: java.lang.Throwable -> L2e org.xmlpull.v1.XmlPullParserException -> L30 java.io.IOException -> L39
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L2e
            goto L42
        L2e:
            r3 = move-exception
            goto L46
        L30:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L39:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r2.a = r1
            return
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r3
        L48:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4b:
            java.lang.SecurityException r3 = new java.lang.SecurityException
            java.lang.String r4 = "Provider must grant uri permissions"
            r3.<init>(r4)
            throw r3
        L53:
            java.lang.SecurityException r3 = new java.lang.SecurityException
            java.lang.String r4 = "Provider must not be exported"
            r3.<init>(r4)
            throw r3
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            zj r2 = r0.a
            java.io.File r1 = r2.a(r1)
            boolean r1 = r1.delete()
            return r1
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r3) {
            r2 = this;
            zj r0 = r2.a
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L27
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L27
            return r3
        L27:
            java.lang.String r3 = "application/octet-stream"
            return r3
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external inserts"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r3, java.lang.String r4) {
            r2 = this;
            zj r0 = r2.a
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L11
            r4 = 268435456(0x10000000, float:2.524355E-29)
            goto L59
        L11:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L57
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L22
            goto L57
        L22:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L2d
            r4 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L59
        L2d:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L38
            r4 = 939524096(0x38000000, float:3.0517578E-5)
            goto L59
        L38:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L43
            r4 = 1006632960(0x3c000000, float:0.0078125)
            goto L59
        L43:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid mode: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L57:
            r4 = 738197504(0x2c000000, float:1.8189894E-12)
        L59:
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r3, r4)
            return r3
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
            r7 = this;
            zj r10 = r7.a
            java.io.File r10 = r10.a(r8)
            java.lang.String r11 = "displayName"
            java.lang.String r8 = r8.getQueryParameter(r11)
            if (r9 != 0) goto L10
            java.lang.String[] r9 = androidx.core.content.FileProvider.b
        L10:
            int r11 = r9.length
            java.lang.String[] r11 = new java.lang.String[r11]
            int r12 = r9.length
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r0 = r9.length
            r1 = 0
            r2 = r1
            r3 = r2
        L1a:
            if (r2 >= r0) goto L50
            r4 = r9[r2]
            java.lang.String r5 = "_display_name"
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto L36
            r11[r3] = r5
            int r4 = r3 + 1
            if (r8 != 0) goto L31
            java.lang.String r5 = r10.getName()
            goto L32
        L31:
            r5 = r8
        L32:
            r12[r3] = r5
        L34:
            r3 = r4
            goto L4d
        L36:
            java.lang.String r5 = "_size"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L4d
            r11[r3] = r5
            int r4 = r3 + 1
            long r5 = r10.length()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r12[r3] = r5
            goto L34
        L4d:
            int r2 = r2 + 1
            goto L1a
        L50:
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.System.arraycopy(r11, r1, r8, r1, r3)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.System.arraycopy(r12, r1, r9, r1, r3)
            android.database.MatrixCursor r10 = new android.database.MatrixCursor
            r11 = 1
            r10.<init>(r8, r11)
            r10.addRow(r9)
            return r10
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external updates"
            r1.<init>(r2)
            throw r1
    }
}
