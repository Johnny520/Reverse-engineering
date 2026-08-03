package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends android.content.ContentProvider {
    public static final java.lang.String[] d = null;
    public static final java.io.File e = null;
    public static final java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.b> f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f882a;
    public java.lang.String b;
    public androidx.core.content.FileProvider.b c;

    public static class a {
        public static java.io.File[] a(android.content.Context r0) {
                java.io.File[] r0 = r0.getExternalMediaDirs()
                return r0
        }
    }

    public interface b {
        java.io.File a(android.net.Uri r1);
    }

    public static class c implements androidx.core.content.FileProvider.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.HashMap<java.lang.String, java.io.File> f883a;

        public c() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f883a = r0
                return
        }

        @Override // androidx.core.content.FileProvider.b
        public final java.io.File a(android.net.Uri r6) {
                r5 = this;
                java.lang.String r0 = r6.getEncodedPath()
                r1 = 47
                r2 = 1
                int r3 = r0.indexOf(r1, r2)
                java.lang.String r4 = r0.substring(r2, r3)
                java.lang.String r4 = android.net.Uri.decode(r4)
                int r3 = r3 + r2
                java.lang.String r0 = r0.substring(r3)
                java.lang.String r0 = android.net.Uri.decode(r0)
                java.util.HashMap<java.lang.String, java.io.File> r2 = r5.f883a
                java.lang.Object r2 = r2.get(r4)
                java.io.File r2 = (java.io.File) r2
                if (r2 == 0) goto L78
                java.io.File r6 = new java.io.File
                r6.<init>(r2, r0)
                java.io.File r6 = r6.getCanonicalFile()     // Catch: java.io.IOException -> L64
                java.lang.String r0 = r6.getPath()
                java.lang.String r2 = r2.getPath()
                java.lang.String r0 = androidx.core.content.FileProvider.a(r0)
                java.lang.String r2 = androidx.core.content.FileProvider.a(r2)
                boolean r3 = r0.equals(r2)
                if (r3 != 0) goto L63
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L5b
                goto L63
            L5b:
                java.lang.SecurityException r6 = new java.lang.SecurityException
                java.lang.String r0 = "Resolved path jumped beyond configured root"
                r6.<init>(r0)
                throw r6
            L63:
                return r6
            L64:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
            L78:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to find configured root for "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }
    }

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.core.content.FileProvider.d = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            androidx.core.content.FileProvider.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.content.FileProvider.f = r0
            return
    }

    public FileProvider() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f882a = r0
            return
    }

    public static java.lang.String a(java.lang.String r2) {
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

    public static androidx.core.content.FileProvider.b c(android.content.Context r2, java.lang.String r3) {
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$b> r0 = androidx.core.content.FileProvider.f
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            androidx.core.content.FileProvider$b r1 = (androidx.core.content.FileProvider.b) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L27
            androidx.core.content.FileProvider$c r1 = d(r2, r3)     // Catch: java.lang.Throwable -> L13 org.xmlpull.v1.XmlPullParserException -> L15 java.io.IOException -> L1e
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

    public static androidx.core.content.FileProvider.c d(android.content.Context r7, java.lang.String r8) {
            androidx.core.content.FileProvider$c r0 = new androidx.core.content.FileProvider$c
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
            r2 = 0
            java.lang.String r3 = "name"
            java.lang.String r3 = r8.getAttributeValue(r2, r3)
            java.lang.String r4 = "path"
            java.lang.String r4 = r8.getAttributeValue(r2, r4)
            java.lang.String r5 = "root-path"
            boolean r5 = r5.equals(r1)
            r6 = 0
            if (r5 == 0) goto L44
            java.io.File r2 = androidx.core.content.FileProvider.e
            goto La0
        L44:
            java.lang.String r5 = "files-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L51
            java.io.File r2 = r7.getFilesDir()
            goto La0
        L51:
            java.lang.String r5 = "cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5e
            java.io.File r2 = r7.getCacheDir()
            goto La0
        L5e:
            java.lang.String r5 = "external-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L6b
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            goto La0
        L6b:
            java.lang.String r5 = "external-files-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L7d
            java.io.File[] r1 = r7.getExternalFilesDirs(r2)
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r2 = r1[r6]
            goto La0
        L7d:
            java.lang.String r5 = "external-cache-path"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8f
            java.io.File[] r1 = r7.getExternalCacheDirs()
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r2 = r1[r6]
            goto La0
        L8f:
            java.lang.String r5 = "external-media-path"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La0
            java.io.File[] r1 = androidx.core.content.FileProvider.a.a(r7)
            int r5 = r1.length
            if (r5 <= 0) goto La0
            r2 = r1[r6]
        La0:
            if (r2 == 0) goto L1d
            java.lang.String[] r1 = new java.lang.String[]{r4}
            r1 = r1[r6]
            if (r1 == 0) goto Lb0
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r1)
            r2 = r4
        Lb0:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto Ld6
            java.io.File r1 = r2.getCanonicalFile()     // Catch: java.io.IOException -> Lc1
            java.util.HashMap<java.lang.String, java.io.File> r2 = r0.f883a
            r2.put(r3, r1)
            goto L1d
        Lc1:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to resolve canonical path for "
            r0.<init>(r1)
            r0.append(r2)
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
            java.lang.String r0 = "Couldn't find meta-data for provider with authority "
            java.lang.String r8 = a.C0487z.k(r0, r8)
            r7.<init>(r8)
            throw r7
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context r2, android.content.pm.ProviderInfo r3) {
            r1 = this;
            super.attachInfo(r2, r3)
            boolean r2 = r3.exported
            if (r2 != 0) goto L32
            boolean r2 = r3.grantUriPermissions
            if (r2 == 0) goto L2a
            java.lang.String r2 = r3.authority
            java.lang.String r3 = ";"
            java.lang.String[] r2 = r2.split(r3)
            r3 = 0
            r2 = r2[r3]
            java.lang.Object r3 = r1.f882a
            monitor-enter(r3)
            r1.b = r2     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$b> r0 = androidx.core.content.FileProvider.f
            monitor-enter(r0)
            r0.remove(r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r2
        L27:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r2
        L2a:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must grant uri permissions"
            r2.<init>(r3)
            throw r2
        L32:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.String r3 = "Provider must not be exported"
            r2.<init>(r3)
            throw r2
    }

    public final androidx.core.content.FileProvider.b b() {
            r3 = this;
            java.lang.Object r0 = r3.f882a
            monitor-enter(r0)
            java.lang.String r1 = r3.b     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?"
            if (r1 == 0) goto L20
            androidx.core.content.FileProvider$b r1 = r3.c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            android.content.Context r1 = r3.getContext()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r3.b     // Catch: java.lang.Throwable -> L1a
            androidx.core.content.FileProvider$b r1 = c(r1, r2)     // Catch: java.lang.Throwable -> L1a
            r3.c = r1     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L26
        L1c:
            androidx.core.content.FileProvider$b r1 = r3.c     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            androidx.core.content.FileProvider$b r2 = r0.b()
            java.io.File r1 = r2.a(r1)
            boolean r1 = r1.delete()
            return r1
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r3) {
            r2 = this;
            androidx.core.content.FileProvider$b r0 = r2.b()
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L29
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L29
            return r3
        L29:
            java.lang.String r3 = "application/octet-stream"
            return r3
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getTypeAnonymous(android.net.Uri r1) {
            r0 = this;
            java.lang.String r1 = "application/octet-stream"
            return r1
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
    @android.annotation.SuppressLint({"UnknownNullness"})
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r2, java.lang.String r3) {
            r1 = this;
            androidx.core.content.FileProvider$b r0 = r1.b()
            java.io.File r2 = r0.a(r2)
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L13
            r3 = 268435456(0x10000000, float:2.524355E-29)
            goto L53
        L13:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L51
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L24
            goto L51
        L24:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2f
            r3 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L53
        L2f:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3a
            r3 = 939524096(0x38000000, float:3.0517578E-5)
            goto L53
        L3a:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L45
            r3 = 1006632960(0x3c000000, float:0.0078125)
            goto L53
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid mode: "
            java.lang.String r3 = a.C0487z.k(r0, r3)
            r2.<init>(r3)
            throw r2
        L51:
            r3 = 738197504(0x2c000000, float:1.8189894E-12)
        L53:
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r3)
            return r2
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
            r7 = this;
            androidx.core.content.FileProvider$b r10 = r7.b()
            java.io.File r10 = r10.a(r8)
            java.lang.String r11 = "displayName"
            java.lang.String r8 = r8.getQueryParameter(r11)
            if (r9 != 0) goto L12
            java.lang.String[] r9 = androidx.core.content.FileProvider.d
        L12:
            int r11 = r9.length
            java.lang.String[] r11 = new java.lang.String[r11]
            int r12 = r9.length
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r0 = r9.length
            r1 = 0
            r2 = r1
            r3 = r2
        L1c:
            if (r2 >= r0) goto L52
            r4 = r9[r2]
            java.lang.String r5 = "_display_name"
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto L38
            r11[r3] = r5
            int r4 = r3 + 1
            if (r8 != 0) goto L33
            java.lang.String r5 = r10.getName()
            goto L34
        L33:
            r5 = r8
        L34:
            r12[r3] = r5
        L36:
            r3 = r4
            goto L4f
        L38:
            java.lang.String r5 = "_size"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L4f
            r11[r3] = r5
            int r4 = r3 + 1
            long r5 = r10.length()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r12[r3] = r5
            goto L36
        L4f:
            int r2 = r2 + 1
            goto L1c
        L52:
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
