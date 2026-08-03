package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2325 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f7581;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Class f7582;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦ۠$ۥ, reason: contains not printable characters */
    public static abstract class AbstractC2326 {
        public AbstractC2326() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AbstractC2326(Yue.C2324 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract java.lang.ClassLoader mo10699();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦ۠$ۥ۟, reason: contains not printable characters */
    public static class C2327 extends Yue.C2325.AbstractC2326 {
        public C2327() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // Yue.C2325.AbstractC2326
        /* JADX INFO: renamed from: ۥ */
        public java.lang.ClassLoader mo10699() {
                r1 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.ClassLoader r0 = r0.getContextClassLoader()
                return r0
        }
    }

    static {
            java.lang.String r0 = "xml.stream.debug"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            Yue.C2325.f7581 = r0     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    public C2325() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Class m10692(java.lang.String r1) {
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.NoClassDefFoundError r0 = new java.lang.NoClassDefFoundError
            java.lang.String r1 = r1.getMessage()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m10693(java.lang.String r3) {
            boolean r0 = Yue.C2325.f7581
            if (r0 == 0) goto L1a
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "STREAM: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.Object m10694(java.lang.String r1) throws Yue.C2323 {
            r0 = 0
            java.lang.Object r1 = m10695(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.Object m10695(java.lang.String r1, java.lang.String r2) throws Yue.C2323 {
            java.lang.ClassLoader r0 = m10697()
            java.lang.Object r1 = m10696(r1, r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.Object m10696(java.lang.String r4, java.lang.String r5, java.lang.ClassLoader r6) throws Yue.C2323 {
            java.lang.String r0 = java.lang.System.getProperty(r4)     // Catch: java.lang.SecurityException -> L1f
            if (r0 == 0) goto L1f
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.SecurityException -> L1f
            r1.<init>()     // Catch: java.lang.SecurityException -> L1f
            java.lang.String r2 = "found system property"
            r1.append(r2)     // Catch: java.lang.SecurityException -> L1f
            r1.append(r0)     // Catch: java.lang.SecurityException -> L1f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.SecurityException -> L1f
            m10693(r1)     // Catch: java.lang.SecurityException -> L1f
            java.lang.Object r4 = m10698(r0, r6)     // Catch: java.lang.SecurityException -> L1f
            return r4
        L1f:
            java.lang.String r0 = "java.home"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L80
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L80
            r1.<init>()     // Catch: java.lang.Exception -> L80
            r1.append(r0)     // Catch: java.lang.Exception -> L80
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Exception -> L80
            r1.append(r0)     // Catch: java.lang.Exception -> L80
            java.lang.String r2 = "lib"
            r1.append(r2)     // Catch: java.lang.Exception -> L80
            r1.append(r0)     // Catch: java.lang.Exception -> L80
            java.lang.String r0 = "jaxp.properties"
            r1.append(r0)     // Catch: java.lang.Exception -> L80
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L80
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L80
            r1.<init>(r0)     // Catch: java.lang.Exception -> L80
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L88
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Exception -> L80
            r0.<init>()     // Catch: java.lang.Exception -> L80
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L80
            r2.<init>(r1)     // Catch: java.lang.Exception -> L80
            r0.load(r2)     // Catch: java.lang.Exception -> L80
            java.lang.String r0 = r0.getProperty(r4)     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L88
            int r1 = r0.length()     // Catch: java.lang.Exception -> L80
            if (r1 <= 0) goto L88
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L80
            r1.<init>()     // Catch: java.lang.Exception -> L80
            java.lang.String r2 = "found java.home property "
            r1.append(r2)     // Catch: java.lang.Exception -> L80
            r1.append(r0)     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L80
            m10693(r1)     // Catch: java.lang.Exception -> L80
            java.lang.Object r4 = m10698(r0, r6)     // Catch: java.lang.Exception -> L80
            return r4
        L80:
            r0 = move-exception
            boolean r1 = Yue.C2325.f7581
            if (r1 == 0) goto L88
            r0.printStackTrace()
        L88:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "META-INF/services/"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            if (r6 != 0) goto La2
            java.io.InputStream r1 = java.lang.ClassLoader.getSystemResourceAsStream(r0)     // Catch: java.lang.Exception -> La0
            goto La6
        La0:
            r0 = move-exception
            goto Lf2
        La2:
            java.io.InputStream r1 = r6.getResourceAsStream(r0)     // Catch: java.lang.Exception -> La0
        La6:
            if (r1 == 0) goto Lf9
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> La0
            r2.<init>()     // Catch: java.lang.Exception -> La0
            java.lang.String r3 = "found "
            r2.append(r3)     // Catch: java.lang.Exception -> La0
            r2.append(r0)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> La0
            m10693(r0)     // Catch: java.lang.Exception -> La0
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> La0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> La0
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> La0
            r0.<init>(r2)     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Exception -> La0
            r0.close()     // Catch: java.lang.Exception -> La0
            if (r1 == 0) goto Lf9
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La0
            if (r0 != 0) goto Lf9
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> La0
            r0.<init>()     // Catch: java.lang.Exception -> La0
            java.lang.String r2 = "loaded from services: "
            r0.append(r2)     // Catch: java.lang.Exception -> La0
            r0.append(r1)     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La0
            m10693(r0)     // Catch: java.lang.Exception -> La0
            java.lang.Object r4 = m10698(r1, r6)     // Catch: java.lang.Exception -> La0
            return r4
        Lf2:
            boolean r1 = Yue.C2325.f7581
            if (r1 == 0) goto Lf9
            r0.printStackTrace()
        Lf9:
            if (r5 == 0) goto L114
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r0 = "loaded from fallback value: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            m10693(r4)
            java.lang.Object r4 = m10698(r5, r6)
            return r4
        L114:
            Yue.ۥ۠ۡۦ r5 = new Yue.ۥ۠ۡۦ
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r0 = "Provider for "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = " cannot be found"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r6 = 0
            r5.<init>(r4, r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.ClassLoader m10697() throws Yue.C2323 {
            java.lang.String r0 = "javax.xml.stream.FactoryFinder"
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            r1.<init>()     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            java.lang.Class r2 = Yue.C2325.f7582     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            if (r2 != 0) goto L14
            java.lang.Class r2 = m10692(r0)     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            Yue.C2325.f7582 = r2     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            goto L14
        L12:
            r0 = move-exception
            goto L33
        L14:
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            r1.append(r2)     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            java.lang.String r2 = "$ClassLoaderFinderConcrete"
            r1.append(r2)     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            Yue.ۥ۠ۡۦ۠$ۥ r1 = (Yue.C2325.AbstractC2326) r1     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            java.lang.ClassLoader r0 = r1.mo10699()     // Catch: java.lang.Exception -> L12 java.lang.ClassNotFoundException -> L3d java.lang.LinkageError -> L4c
            goto L5a
        L33:
            Yue.ۥ۠ۡۦ r1 = new Yue.ۥ۠ۡۦ
            java.lang.String r2 = r0.toString()
            r1.<init>(r2, r0)
            throw r1
        L3d:
            java.lang.Class r1 = Yue.C2325.f7582
            if (r1 != 0) goto L47
            java.lang.Class r1 = m10692(r0)
            Yue.C2325.f7582 = r1
        L47:
            java.lang.ClassLoader r0 = r1.getClassLoader()
            goto L5a
        L4c:
            java.lang.Class r1 = Yue.C2325.f7582
            if (r1 != 0) goto L56
            java.lang.Class r1 = m10692(r0)
            Yue.C2325.f7582 = r1
        L56:
            java.lang.ClassLoader r0 = r1.getClassLoader()
        L5a:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.Object m10698(java.lang.String r3, java.lang.ClassLoader r4) throws Yue.C2323 {
            java.lang.String r0 = "Provider "
            if (r4 != 0) goto Ld
            java.lang.Class r4 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L9 java.lang.ClassNotFoundException -> Lb
            goto L11
        L9:
            r4 = move-exception
            goto L16
        Lb:
            r4 = move-exception
            goto L33
        Ld:
            java.lang.Class r4 = r4.loadClass(r3)     // Catch: java.lang.Exception -> L9 java.lang.ClassNotFoundException -> Lb
        L11:
            java.lang.Object r3 = r4.newInstance()     // Catch: java.lang.Exception -> L9 java.lang.ClassNotFoundException -> Lb
            return r3
        L16:
            Yue.ۥ۠ۡۦ r1 = new Yue.ۥ۠ۡۦ
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " could not be instantiated: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3, r4)
            throw r1
        L33:
            Yue.ۥ۠ۡۦ r1 = new Yue.ۥ۠ۡۦ
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = " not found"
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3, r4)
            throw r1
    }
}
