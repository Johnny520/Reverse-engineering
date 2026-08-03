package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2362 extends android.content.ContentProvider {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.lang.String[] f7730 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.lang.String f7731 = "android.support.FILE_PROVIDER_PATHS";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f7732 = "root-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.String f7733 = "files-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.lang.String f7734 = "cache-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.String f7735 = "external-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f7736 = "external-files-path";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f7737 = "external-cache-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final java.lang.String f7738 = "external-media-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final java.lang.String f7739 = "name";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.String f7740 = "path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final java.lang.String f7741 = "displayName";

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final java.io.File f7742 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC2947("sCache")
    public static final java.util.HashMap<java.lang.String, Yue.C2362.InterfaceC2364> f7743 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.lang.Object f7744;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC2947("mLock")
    public java.lang.String f7745;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC2947("mLock")
    @Yue.InterfaceC4544
    public Yue.C2362.InterfaceC2364 f7746;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int f7747;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C2363 {
        public C2363() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.io.File[] m10890(android.content.Context r0) {
                java.io.File[] r0 = r0.getExternalMediaDirs()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC2364 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        java.io.File mo10891(android.net.Uri r1);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        android.net.Uri mo10892(java.io.File r1);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۡ$ۥ۟۟, reason: contains not printable characters */
    public static class C2365 implements Yue.C2362.InterfaceC2364 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f7748;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.HashMap<java.lang.String, java.io.File> f7749;

        public C2365(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f7749 = r0
                r1.f7748 = r2
                return
        }

        @Override // Yue.C2362.InterfaceC2364
        /* JADX INFO: renamed from: ۥ */
        public java.io.File mo10891(android.net.Uri r5) {
                r4 = this;
                java.lang.String r0 = r5.getEncodedPath()
                r1 = 47
                r2 = 1
                int r1 = r0.indexOf(r1, r2)
                java.lang.String r3 = r0.substring(r2, r1)
                java.lang.String r3 = android.net.Uri.decode(r3)
                int r1 = r1 + r2
                java.lang.String r0 = r0.substring(r1)
                java.lang.String r0 = android.net.Uri.decode(r0)
                java.util.HashMap<java.lang.String, java.io.File> r1 = r4.f7749
                java.lang.Object r1 = r1.get(r3)
                java.io.File r1 = (java.io.File) r1
                if (r1 == 0) goto L5d
                java.io.File r5 = new java.io.File
                r5.<init>(r1, r0)
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L46
                java.lang.String r0 = r5.getPath()
                java.lang.String r1 = r1.getPath()
                boolean r0 = r4.m10894(r0, r1)
                if (r0 == 0) goto L3e
                return r5
            L3e:
                java.lang.SecurityException r5 = new java.lang.SecurityException
                java.lang.String r0 = "Resolved path jumped beyond configured root"
                r5.<init>(r0)
                throw r5
            L46:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L5d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unable to find configured root for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        @Override // Yue.C2362.InterfaceC2364
        /* JADX INFO: renamed from: ۥ۟ */
        public android.net.Uri mo10892(java.io.File r6) {
                r5 = this;
                java.lang.String r6 = r6.getCanonicalPath()     // Catch: java.io.IOException -> Lbd
                java.util.HashMap<java.lang.String, java.io.File> r0 = r5.f7749
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lf:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L43
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                java.io.File r3 = (java.io.File) r3
                java.lang.String r3 = r3.getPath()
                boolean r4 = r5.m10894(r6, r3)
                if (r4 == 0) goto Lf
                if (r1 == 0) goto L41
                int r3 = r3.length()
                java.lang.Object r4 = r1.getValue()
                java.io.File r4 = (java.io.File) r4
                java.lang.String r4 = r4.getPath()
                int r4 = r4.length()
                if (r3 <= r4) goto Lf
            L41:
                r1 = r2
                goto Lf
            L43:
                if (r1 == 0) goto La6
                java.lang.Object r0 = r1.getValue()
                java.io.File r0 = (java.io.File) r0
                java.lang.String r0 = r0.getPath()
                java.lang.String r2 = "/"
                boolean r3 = r0.endsWith(r2)
                if (r3 == 0) goto L60
                int r0 = r0.length()
                java.lang.String r6 = r6.substring(r0)
                goto L6a
            L60:
                int r0 = r0.length()
                int r0 = r0 + 1
                java.lang.String r6 = r6.substring(r0)
            L6a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r1.getKey()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = android.net.Uri.encode(r1)
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                java.lang.String r6 = android.net.Uri.encode(r6, r2)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                android.net.Uri$Builder r0 = new android.net.Uri$Builder
                r0.<init>()
                java.lang.String r1 = "content"
                android.net.Uri$Builder r0 = r0.scheme(r1)
                java.lang.String r1 = r5.f7748
                android.net.Uri$Builder r0 = r0.authority(r1)
                android.net.Uri$Builder r6 = r0.encodedPath(r6)
                android.net.Uri r6 = r6.build()
                return r6
            La6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to find configured root that contains "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
            Lbd:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m10893(java.lang.String r4, java.io.File r5) {
                r3 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 != 0) goto L28
                java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L10
                java.util.HashMap<java.lang.String, java.io.File> r0 = r3.f7749
                r0.put(r4, r5)
                return
            L10:
                r4 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to resolve canonical path for "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5, r4)
                throw r0
            L28:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Name must not be empty"
                r4.<init>(r5)
                throw r4
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m10894(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3) {
                r1 = this;
                java.lang.String r2 = Yue.C2362.m10878(r2)
                java.lang.String r3 = Yue.C2362.m10878(r3)
                boolean r0 = r2.equals(r3)
                if (r0 != 0) goto L28
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r3 = 47
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L26
                goto L28
            L26:
                r2 = 0
                goto L29
            L28:
                r2 = 1
            L29:
                return r2
        }
    }

    static {
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_size"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            Yue.C2362.f7730 = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/"
            r0.<init>(r1)
            Yue.C2362.f7742 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            Yue.C2362.f7743 = r0
            return
    }

    public C2362() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public C2362(@Yue.InterfaceC7171 int r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f7744 = r0
            r1.f7747 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m10878(java.lang.String r0) {
            java.lang.String r0 = m10888(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.io.File m10879(java.io.File r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L11
            r2 = r5[r1]
            if (r2 == 0) goto Le
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r2)
            r4 = r3
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.Object[] m10880(java.lang.Object[] r2, int r3) {
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String[] m10881(java.lang.String[] r2, int r3) {
            java.lang.String[] r0 = new java.lang.String[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.content.res.XmlResourceParser m10882(android.content.Context r2, java.lang.String r3, @Yue.InterfaceC4544 android.content.pm.ProviderInfo r4, int r5) {
            if (r4 == 0) goto L28
            android.os.Bundle r3 = r4.metaData
            java.lang.String r0 = "android.support.FILE_PROVIDER_PATHS"
            if (r3 != 0) goto L15
            if (r5 == 0) goto L15
            android.os.Bundle r3 = new android.os.Bundle
            r1 = 1
            r3.<init>(r1)
            r4.metaData = r3
            r3.putInt(r0, r5)
        L15:
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.res.XmlResourceParser r2 = r4.loadXmlMetaData(r2, r0)
            if (r2 == 0) goto L20
            return r2
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r2.<init>(r3)
            throw r2
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Couldn't find meta-data for provider with authority "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C2362.InterfaceC2364 m10883(android.content.Context r2, java.lang.String r3, int r4) {
            java.util.HashMap<java.lang.String, Yue.ۥ۠ۡۨۡ$ۥ۟> r0 = Yue.C2362.f7743
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L13
            Yue.ۥ۠ۡۨۡ$ۥ۟ r1 = (Yue.C2362.InterfaceC2364) r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L27
            Yue.ۥ۠ۡۨۡ$ۥ۟ r1 = m10887(r2, r3, r4)     // Catch: java.lang.Throwable -> L13 org.xmlpull.v1.XmlPullParserException -> L15 java.io.IOException -> L1e
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L13
            goto L27
        L13:
            r2 = move-exception
            goto L29
        L15:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L1e:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.net.Uri m10884(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.io.File r3) {
            r0 = 0
            Yue.ۥ۠ۡۨۡ$ۥ۟ r1 = m10883(r1, r2, r0)
            android.net.Uri r1 = r1.mo10892(r3)
            return r1
    }

    @Yue.InterfaceC4410
    @android.annotation.SuppressLint({"StreamFiles"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.net.Uri m10885(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4410 java.io.File r2, @Yue.InterfaceC4410 java.lang.String r3) {
            android.net.Uri r0 = m10884(r0, r1, r2)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "displayName"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r3)
            android.net.Uri r0 = r0.build()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m10886(java.lang.String r3) {
            java.lang.String r0 = "r"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            r3 = 268435456(0x10000000, float:2.524355E-29)
            goto L56
        Lb:
            java.lang.String r0 = "w"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L54
            java.lang.String r0 = "wt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1c
            goto L54
        L1c:
            java.lang.String r0 = "wa"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L27
            r3 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L56
        L27:
            java.lang.String r0 = "rw"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L32
            r3 = 939524096(0x38000000, float:3.0517578E-5)
            goto L56
        L32:
            java.lang.String r0 = "rwt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3d
            r3 = 1006632960(0x3c000000, float:0.0078125)
            goto L56
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid mode: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L54:
            r3 = 738197504(0x2c000000, float:1.8189894E-12)
        L56:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Yue.C2362.InterfaceC2364 m10887(android.content.Context r6, java.lang.String r7, int r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            Yue.ۥ۠ۡۨۡ$ۥ۟۟ r0 = new Yue.ۥ۠ۡۨۡ$ۥ۟۟
            r0.<init>(r7)
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r7, r2)
            android.content.res.XmlResourceParser r7 = m10882(r6, r7, r1, r8)
        L13:
            int r8 = r7.next()
            r1 = 1
            if (r8 == r1) goto La5
            r1 = 2
            if (r8 != r1) goto L13
            java.lang.String r8 = r7.getName()
            java.lang.String r1 = "name"
            r2 = 0
            java.lang.String r1 = r7.getAttributeValue(r2, r1)
            java.lang.String r3 = "path"
            java.lang.String r3 = r7.getAttributeValue(r2, r3)
            java.lang.String r4 = "root-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L39
            java.io.File r2 = Yue.C2362.f7742
            goto L96
        L39:
            java.lang.String r4 = "files-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L46
            java.io.File r2 = r6.getFilesDir()
            goto L96
        L46:
            java.lang.String r4 = "cache-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L53
            java.io.File r2 = r6.getCacheDir()
            goto L96
        L53:
            java.lang.String r4 = "external-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L60
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            goto L96
        L60:
            java.lang.String r4 = "external-files-path"
            boolean r4 = r4.equals(r8)
            r5 = 0
            if (r4 == 0) goto L73
            java.io.File[] r8 = Yue.C1584.m7768(r6, r2)
            int r4 = r8.length
            if (r4 <= 0) goto L96
            r2 = r8[r5]
            goto L96
        L73:
            java.lang.String r4 = "external-cache-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L85
            java.io.File[] r8 = Yue.C1584.m7767(r6)
            int r4 = r8.length
            if (r4 <= 0) goto L96
            r2 = r8[r5]
            goto L96
        L85:
            java.lang.String r4 = "external-media-path"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L96
            java.io.File[] r8 = Yue.C2362.C2363.m10890(r6)
            int r4 = r8.length
            if (r4 <= 0) goto L96
            r2 = r8[r5]
        L96:
            if (r2 == 0) goto L13
            java.lang.String[] r8 = new java.lang.String[]{r3}
            java.io.File r8 = m10879(r2, r8)
            r0.m10893(r1, r8)
            goto L13
        La5:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m10888(@Yue.InterfaceC4410 java.lang.String r2) {
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

    @Override // android.content.ContentProvider
    @Yue.InterfaceC0907
    public void attachInfo(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.content.pm.ProviderInfo r3) {
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
            java.lang.Object r3 = r1.f7744
            monitor-enter(r3)
            r1.f7745 = r2     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            java.util.HashMap<java.lang.String, Yue.ۥ۠ۡۨۡ$ۥ۟> r0 = Yue.C2362.f7743
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

    @Override // android.content.ContentProvider
    public int delete(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4544 java.lang.String r2, @Yue.InterfaceC4544 java.lang.String[] r3) {
            r0 = this;
            Yue.ۥ۠ۡۨۡ$ۥ۟ r2 = r0.m10889()
            java.io.File r1 = r2.mo10891(r1)
            boolean r1 = r1.delete()
            return r1
    }

    @Override // android.content.ContentProvider
    @Yue.InterfaceC4544
    public java.lang.String getType(@Yue.InterfaceC4410 android.net.Uri r3) {
            r2 = this;
            Yue.ۥ۠ۡۨۡ$ۥ۟ r0 = r2.m10889()
            java.io.File r3 = r0.mo10891(r3)
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
    @Yue.InterfaceC4544
    public java.lang.String getTypeAnonymous(@Yue.InterfaceC4410 android.net.Uri r1) {
            r0 = this;
            java.lang.String r1 = "application/octet-stream"
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 android.content.ContentValues r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external inserts"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.os.ParcelFileDescriptor openFile(@Yue.InterfaceC4410 android.net.Uri r2, @Yue.InterfaceC4410 java.lang.String r3) throws java.io.FileNotFoundException {
            r1 = this;
            Yue.ۥ۠ۡۨۡ$ۥ۟ r0 = r1.m10889()
            java.io.File r2 = r0.mo10891(r2)
            int r3 = m10886(r3)
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r2, r3)
            return r2
    }

    @Override // android.content.ContentProvider
    @Yue.InterfaceC4410
    public android.database.Cursor query(@Yue.InterfaceC4410 android.net.Uri r7, @Yue.InterfaceC4544 java.lang.String[] r8, @Yue.InterfaceC4544 java.lang.String r9, @Yue.InterfaceC4544 java.lang.String[] r10, @Yue.InterfaceC4544 java.lang.String r11) {
            r6 = this;
            Yue.ۥ۠ۡۨۡ$ۥ۟ r9 = r6.m10889()
            java.io.File r9 = r9.mo10891(r7)
            java.lang.String r10 = "displayName"
            java.lang.String r7 = r7.getQueryParameter(r10)
            if (r8 != 0) goto L12
            java.lang.String[] r8 = Yue.C2362.f7730
        L12:
            int r10 = r8.length
            java.lang.String[] r10 = new java.lang.String[r10]
            int r11 = r8.length
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L1b:
            if (r1 >= r0) goto L51
            r3 = r8[r1]
            java.lang.String r4 = "_display_name"
            boolean r5 = r4.equals(r3)
            if (r5 == 0) goto L37
            r10[r2] = r4
            int r3 = r2 + 1
            if (r7 != 0) goto L32
            java.lang.String r4 = r9.getName()
            goto L33
        L32:
            r4 = r7
        L33:
            r11[r2] = r4
        L35:
            r2 = r3
            goto L4e
        L37:
            java.lang.String r4 = "_size"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L4e
            r10[r2] = r4
            int r3 = r2 + 1
            long r4 = r9.length()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r11[r2] = r4
            goto L35
        L4e:
            int r1 = r1 + 1
            goto L1b
        L51:
            java.lang.String[] r7 = m10881(r10, r2)
            java.lang.Object[] r8 = m10880(r11, r2)
            android.database.MatrixCursor r9 = new android.database.MatrixCursor
            r10 = 1
            r9.<init>(r7, r10)
            r9.addRow(r8)
            return r9
    }

    @Override // android.content.ContentProvider
    public int update(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 android.content.ContentValues r2, @Yue.InterfaceC4544 java.lang.String r3, @Yue.InterfaceC4544 java.lang.String[] r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No external updates"
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C2362.InterfaceC2364 m10889() {
            r4 = this;
            java.lang.Object r0 = r4.f7744
            monitor-enter(r0)
            java.lang.String r1 = r4.f7745     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?"
            Yue.C4554.m18128(r1, r2)     // Catch: java.lang.Throwable -> L1d
            Yue.ۥ۠ۡۨۡ$ۥ۟ r1 = r4.f7746     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r4.f7745     // Catch: java.lang.Throwable -> L1d
            int r3 = r4.f7747     // Catch: java.lang.Throwable -> L1d
            Yue.ۥ۠ۡۨۡ$ۥ۟ r1 = m10883(r1, r2, r3)     // Catch: java.lang.Throwable -> L1d
            r4.f7746 = r1     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L23
        L1f:
            Yue.ۥ۠ۡۨۡ$ۥ۟ r1 = r4.f7746     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }
}
