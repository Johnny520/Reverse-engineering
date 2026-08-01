package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public class FileProvider extends android.content.ContentProvider {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PATH = "path";
    private static final java.lang.String[] COLUMNS = null;
    private static final java.io.File DEVICE_ROOT = null;
    private static final java.lang.String DISPLAYNAME_FIELD = "displayName";
    private static final java.lang.String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final java.lang.String TAG_CACHE_PATH = "cache-path";
    private static final java.lang.String TAG_EXTERNAL = "external-path";
    private static final java.lang.String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final java.lang.String TAG_EXTERNAL_FILES = "external-files-path";
    private static final java.lang.String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final java.lang.String TAG_FILES_PATH = "files-path";
    private static final java.lang.String TAG_ROOT_PATH = "root-path";
    private static final java.util.HashMap<java.lang.String, androidx.core.content.FileProvider.PathStrategy> sCache = null;
    private java.lang.String mAuthority;
    private androidx.core.content.FileProvider.PathStrategy mLocalPathStrategy;
    private int mResourceId;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.io.File[] getExternalMediaDirs(android.content.Context r1) {
                java.io.File[] r0 = r1.getExternalMediaDirs()
                return r0
        }
    }

    interface PathStrategy {
        java.io.File getFileForUri(android.net.Uri r1);

        android.net.Uri getUriForFile(java.io.File r1);
    }

    static class SimplePathStrategy implements androidx.core.content.FileProvider.PathStrategy {
        private final java.lang.String mAuthority;
        private final java.util.HashMap<java.lang.String, java.io.File> mRoots;

        SimplePathStrategy(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mRoots = r0
                r1.mAuthority = r2
                return
        }

        void addRoot(java.lang.String r5, java.io.File r6) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L2c
                java.io.File r0 = r6.getCanonicalFile()     // Catch: java.io.IOException -> L12
                r6 = r0
                java.util.HashMap<java.lang.String, java.io.File> r0 = r4.mRoots
                r0.put(r5, r6)
                return
            L12:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to resolve canonical path for "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L2c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Name must not be empty"
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public java.io.File getFileForUri(android.net.Uri r10) {
                r9 = this;
                java.lang.String r0 = r10.getEncodedPath()
                r1 = 47
                r2 = 1
                int r1 = r0.indexOf(r1, r2)
                java.lang.String r2 = r0.substring(r2, r1)
                java.lang.String r2 = android.net.Uri.decode(r2)
                int r3 = r1 + 1
                java.lang.String r3 = r0.substring(r3)
                java.lang.String r0 = android.net.Uri.decode(r3)
                java.util.HashMap<java.lang.String, java.io.File> r3 = r9.mRoots
                java.lang.Object r3 = r3.get(r2)
                java.io.File r3 = (java.io.File) r3
                if (r3 == 0) goto L63
                java.io.File r4 = new java.io.File
                r4.<init>(r3, r0)
                java.io.File r5 = r4.getCanonicalFile()     // Catch: java.io.IOException -> L49
                r4 = r5
                java.lang.String r5 = r4.getPath()
                java.lang.String r6 = r3.getPath()
                boolean r5 = r5.startsWith(r6)
                if (r5 == 0) goto L41
                return r4
            L41:
                java.lang.SecurityException r5 = new java.lang.SecurityException
                java.lang.String r6 = "Resolved path jumped beyond configured root"
                r5.<init>(r6)
                throw r5
            L49:
                r5 = move-exception
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Failed to resolve canonical path for "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r4)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L63:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Unable to find configured root for "
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.StringBuilder r5 = r5.append(r10)
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public android.net.Uri getUriForFile(java.io.File r8) {
                r7 = this;
                java.lang.String r0 = r8.getCanonicalPath()     // Catch: java.io.IOException -> Lc3
                r1 = 0
                java.util.HashMap<java.lang.String, java.io.File> r2 = r7.mRoots
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L10:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L44
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getValue()
                java.io.File r4 = (java.io.File) r4
                java.lang.String r4 = r4.getPath()
                boolean r5 = r0.startsWith(r4)
                if (r5 == 0) goto L43
                if (r1 == 0) goto L42
                int r5 = r4.length()
                java.lang.Object r6 = r1.getValue()
                java.io.File r6 = (java.io.File) r6
                java.lang.String r6 = r6.getPath()
                int r6 = r6.length()
                if (r5 <= r6) goto L43
            L42:
                r1 = r3
            L43:
                goto L10
            L44:
                if (r1 == 0) goto Laa
                java.lang.Object r2 = r1.getValue()
                java.io.File r2 = (java.io.File) r2
                java.lang.String r2 = r2.getPath()
                java.lang.String r3 = "/"
                boolean r4 = r2.endsWith(r3)
                if (r4 == 0) goto L61
                int r4 = r2.length()
                java.lang.String r0 = r0.substring(r4)
                goto L6b
            L61:
                int r4 = r2.length()
                int r4 = r4 + 1
                java.lang.String r0 = r0.substring(r4)
            L6b:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.Object r5 = r1.getKey()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r5 = android.net.Uri.encode(r5)
                java.lang.StringBuilder r4 = r4.append(r5)
                r5 = 47
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r3 = android.net.Uri.encode(r0, r3)
                java.lang.StringBuilder r3 = r4.append(r3)
                java.lang.String r0 = r3.toString()
                android.net.Uri$Builder r3 = new android.net.Uri$Builder
                r3.<init>()
                java.lang.String r4 = "content"
                android.net.Uri$Builder r3 = r3.scheme(r4)
                java.lang.String r4 = r7.mAuthority
                android.net.Uri$Builder r3 = r3.authority(r4)
                android.net.Uri$Builder r3 = r3.encodedPath(r0)
                android.net.Uri r3 = r3.build()
                return r3
            Laa:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed to find configured root that contains "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            Lc3:
                r0 = move-exception
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to resolve canonical path for "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r8)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.core.content.FileProvider.COLUMNS = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            androidx.core.content.FileProvider.DEVICE_ROOT = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.content.FileProvider.sCache = r0
            return
    }

    public FileProvider() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mResourceId = r0
            return
    }

    protected FileProvider(int r1) {
            r0 = this;
            r0.<init>()
            r0.mResourceId = r1
            return
    }

    private static java.io.File buildPath(java.io.File r5, java.lang.String... r6) {
            r0 = r5
            int r1 = r6.length
            r2 = 0
        L3:
            if (r2 >= r1) goto L12
            r3 = r6[r2]
            if (r3 == 0) goto Lf
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r3)
            r0 = r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r0
    }

    private static java.lang.Object[] copyOf(java.lang.Object[] r2, int r3) {
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    private static java.lang.String[] copyOf(java.lang.String[] r2, int r3) {
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    static android.content.res.XmlResourceParser getFileProviderPathsMetaData(android.content.Context r3, java.lang.String r4, android.content.pm.ProviderInfo r5, int r6) {
            if (r5 == 0) goto L2b
            android.os.Bundle r0 = r5.metaData
            java.lang.String r1 = "android.support.FILE_PROVIDER_PATHS"
            if (r0 != 0) goto L17
            if (r6 == 0) goto L17
            android.os.Bundle r0 = new android.os.Bundle
            r2 = 1
            r0.<init>(r2)
            r5.metaData = r0
            android.os.Bundle r0 = r5.metaData
            r0.putInt(r1, r6)
        L17:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            android.content.res.XmlResourceParser r0 = r5.loadXmlMetaData(r0, r1)
            if (r0 == 0) goto L23
            return r0
        L23:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r1.<init>(r2)
            throw r1
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Couldn't find meta-data for provider with authority "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private androidx.core.content.FileProvider.PathStrategy getLocalPathStrategy() {
            r3 = this;
            monitor-enter(r3)
            androidx.core.content.FileProvider$PathStrategy r0 = r3.mLocalPathStrategy     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = r3.mAuthority     // Catch: java.lang.Throwable -> L17
            int r2 = r3.mResourceId     // Catch: java.lang.Throwable -> L17
            androidx.core.content.FileProvider$PathStrategy r0 = getPathStrategy(r0, r1, r2)     // Catch: java.lang.Throwable -> L17
            r3.mLocalPathStrategy = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.core.content.FileProvider$PathStrategy r0 = r3.mLocalPathStrategy     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    private static androidx.core.content.FileProvider.PathStrategy getPathStrategy(android.content.Context r5, java.lang.String r6, int r7) {
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r0 = androidx.core.content.FileProvider.sCache
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r1 = androidx.core.content.FileProvider.sCache     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L2d
            androidx.core.content.FileProvider$PathStrategy r1 = (androidx.core.content.FileProvider.PathStrategy) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L2b
            androidx.core.content.FileProvider$PathStrategy r2 = parsePathStrategy(r5, r6, r7)     // Catch: org.xmlpull.v1.XmlPullParserException -> L19 java.io.IOException -> L22 java.lang.Throwable -> L2d
            r1 = r2
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r2 = androidx.core.content.FileProvider.sCache     // Catch: java.lang.Throwable -> L2d
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L2d
            goto L2b
        L19:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L22:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L2d
            throw r3     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r1
    }

    public static android.net.Uri getUriForFile(android.content.Context r2, java.lang.String r3, java.io.File r4) {
            r0 = 0
            androidx.core.content.FileProvider$PathStrategy r0 = getPathStrategy(r2, r3, r0)
            android.net.Uri r1 = r0.getUriForFile(r4)
            return r1
    }

    public static android.net.Uri getUriForFile(android.content.Context r3, java.lang.String r4, java.io.File r5, java.lang.String r6) {
            android.net.Uri r0 = getUriForFile(r3, r4, r5)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r2 = "displayName"
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r6)
            android.net.Uri r1 = r1.build()
            return r1
    }

    private static int modeToMode(java.lang.String r3) {
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            r0 = 268435456(0x10000000, float:2.524355E-29)
            goto L58
        Lb:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L56
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            goto L56
        L1c:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L27
            r0 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L58
        L27:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L32
            r0 = 939524096(0x38000000, float:3.0517578E-5)
            goto L58
        L32:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3d
            r0 = 1006632960(0x3c000000, float:0.0078125)
            goto L58
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid mode: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            r0 = 738197504(0x2c000000, float:1.8189894E-12)
        L58:
            return r0
    }

    private static androidx.core.content.FileProvider.PathStrategy parsePathStrategy(android.content.Context r11, java.lang.String r12, int r13) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            androidx.core.content.FileProvider$SimplePathStrategy r0 = new androidx.core.content.FileProvider$SimplePathStrategy
            r0.<init>(r12)
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r12, r2)
            android.content.res.XmlResourceParser r2 = getFileProviderPathsMetaData(r11, r12, r1, r13)
        L13:
            int r3 = r2.next()
            r4 = r3
            r5 = 1
            if (r3 == r5) goto La8
            r3 = 2
            if (r4 != r3) goto L13
            java.lang.String r3 = r2.getName()
            java.lang.String r5 = "name"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)
            java.lang.String r7 = "path"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)
            r8 = 0
            java.lang.String r9 = "root-path"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L3b
            java.io.File r8 = androidx.core.content.FileProvider.DEVICE_ROOT
            goto L99
        L3b:
            java.lang.String r9 = "files-path"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L48
            java.io.File r8 = r11.getFilesDir()
            goto L99
        L48:
            java.lang.String r9 = "cache-path"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L55
            java.io.File r8 = r11.getCacheDir()
            goto L99
        L55:
            java.lang.String r9 = "external-path"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L62
            java.io.File r8 = android.os.Environment.getExternalStorageDirectory()
            goto L99
        L62:
            java.lang.String r9 = "external-files-path"
            boolean r9 = r9.equals(r3)
            r10 = 0
            if (r9 == 0) goto L75
            java.io.File[] r6 = androidx.core.content.ContextCompat.getExternalFilesDirs(r11, r6)
            int r9 = r6.length
            if (r9 <= 0) goto L74
            r8 = r6[r10]
        L74:
            goto L99
        L75:
            java.lang.String r6 = "external-cache-path"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L87
            java.io.File[] r6 = androidx.core.content.ContextCompat.getExternalCacheDirs(r11)
            int r9 = r6.length
            if (r9 <= 0) goto L86
            r8 = r6[r10]
        L86:
            goto L99
        L87:
            java.lang.String r6 = "external-media-path"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L99
            java.io.File[] r6 = androidx.core.content.FileProvider.Api21Impl.getExternalMediaDirs(r11)
            int r9 = r6.length
            if (r9 <= 0) goto L99
            r8 = r6[r10]
        L99:
            if (r8 == 0) goto La6
            java.lang.String[] r6 = new java.lang.String[]{r7}
            java.io.File r6 = buildPath(r8, r6)
            r0.addRoot(r5, r6)
        La6:
            goto L13
        La8:
            return r0
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context r4, android.content.pm.ProviderInfo r5) {
            r3 = this;
            super.attachInfo(r4, r5)
            boolean r0 = r5.exported
            if (r0 != 0) goto L2f
            boolean r0 = r5.grantUriPermissions
            if (r0 == 0) goto L27
            java.lang.String r0 = r5.authority
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            r1 = 0
            r0 = r0[r1]
            r3.mAuthority = r0
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r0 = androidx.core.content.FileProvider.sCache
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$PathStrategy> r1 = androidx.core.content.FileProvider.sCache     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r3.mAuthority     // Catch: java.lang.Throwable -> L24
            r1.remove(r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
        L27:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must grant uri permissions"
            r0.<init>(r1)
            throw r0
        L2f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Provider must not be exported"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r2.getLocalPathStrategy()
            java.io.File r0 = r0.getFileForUri(r3)
            boolean r1 = r0.delete()
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r5) {
            r4 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r4.getLocalPathStrategy()
            java.io.File r0 = r0.getFileForUri(r5)
            java.lang.String r1 = r0.getName()
            r2 = 46
            int r1 = r1.lastIndexOf(r2)
            if (r1 < 0) goto L29
            java.lang.String r2 = r0.getName()
            int r3 = r1 + 1
            java.lang.String r2 = r2.substring(r3)
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r3.getMimeTypeFromExtension(r2)
            if (r3 == 0) goto L29
            return r3
        L29:
            java.lang.String r2 = "application/octet-stream"
            return r2
    }

    @Override // android.content.ContentProvider
    public java.lang.String getTypeAnonymous(android.net.Uri r2) {
            r1 = this;
            java.lang.String r0 = "application/octet-stream"
            return r0
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r3, android.content.ContentValues r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "No external inserts"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r4, java.lang.String r5) throws java.io.FileNotFoundException {
            r3 = this;
            androidx.core.content.FileProvider$PathStrategy r0 = r3.getLocalPathStrategy()
            java.io.File r0 = r0.getFileForUri(r4)
            int r1 = modeToMode(r5)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r0, r1)
            return r2
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r14, java.lang.String[] r15, java.lang.String r16, java.lang.String[] r17, java.lang.String r18) {
            r13 = this;
            r0 = r14
            androidx.core.content.FileProvider$PathStrategy r1 = r13.getLocalPathStrategy()
            java.io.File r1 = r1.getFileForUri(r14)
            java.lang.String r2 = "displayName"
            java.lang.String r2 = r14.getQueryParameter(r2)
            if (r15 != 0) goto L14
            java.lang.String[] r3 = androidx.core.content.FileProvider.COLUMNS
            goto L15
        L14:
            r3 = r15
        L15:
            int r4 = r3.length
            java.lang.String[] r4 = new java.lang.String[r4]
            int r5 = r3.length
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            int r7 = r3.length
            r8 = 0
        L1e:
            if (r8 >= r7) goto L54
            r9 = r3[r8]
            java.lang.String r10 = "_display_name"
            boolean r11 = r10.equals(r9)
            if (r11 == 0) goto L3a
            r4[r6] = r10
            int r10 = r6 + 1
            if (r2 != 0) goto L35
            java.lang.String r11 = r1.getName()
            goto L36
        L35:
            r11 = r2
        L36:
            r5[r6] = r11
            r6 = r10
            goto L51
        L3a:
            java.lang.String r10 = "_size"
            boolean r11 = r10.equals(r9)
            if (r11 == 0) goto L51
            r4[r6] = r10
            int r10 = r6 + 1
            long r11 = r1.length()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r5[r6] = r11
            r6 = r10
        L51:
            int r8 = r8 + 1
            goto L1e
        L54:
            java.lang.String[] r4 = copyOf(r4, r6)
            java.lang.Object[] r5 = copyOf(r5, r6)
            android.database.MatrixCursor r7 = new android.database.MatrixCursor
            r8 = 1
            r7.<init>(r4, r8)
            r7.addRow(r5)
            return r7
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r3, android.content.ContentValues r4, java.lang.String r5, java.lang.String[] r6) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "No external updates"
            r0.<init>(r1)
            throw r0
    }
}
