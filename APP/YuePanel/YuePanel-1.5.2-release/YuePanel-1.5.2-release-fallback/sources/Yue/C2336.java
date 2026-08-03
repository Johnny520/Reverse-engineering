package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2336 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C2336 f7601 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f7602 = "META-INF/services/";

    static {
            Yue.ۥ۠ۡۦۧ r0 = new Yue.ۥ۠ۡۦۧ
            r0.<init>()
            Yue.C2336.f7601 = r0
            return
    }

    public C2336() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC3871 m10714(java.lang.Class<Yue.InterfaceC3871> r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L19
            r2 = 1
            java.lang.Class r5 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L19
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r0)     // Catch: java.lang.ClassNotFoundException -> L19
            java.lang.Object r5 = r5.newInstance(r0)     // Catch: java.lang.ClassNotFoundException -> L19
            java.lang.Object r4 = r4.cast(r5)     // Catch: java.lang.ClassNotFoundException -> L19
            Yue.ۥ۠ۨۦۡ r4 = (Yue.InterfaceC3871) r4     // Catch: java.lang.ClassNotFoundException -> L19
            r0 = r4
        L19:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final <S> S m10715(java.lang.String r2, java.lang.ClassLoader r3, java.lang.Class<S> r4) {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)
            boolean r3 = r4.isAssignableFrom(r2)
            if (r3 == 0) goto L19
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)
            java.lang.Object r2 = r2.newInstance(r3)
            java.lang.Object r2 = r4.cast(r2)
            return r2
        L19:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Expected service of class "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = ", but found "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final <S> java.util.List<S> m10716(java.lang.Class<S> r1, java.lang.ClassLoader r2) {
            r0 = this;
            java.util.List r1 = r0.m10718(r1, r2)     // Catch: java.lang.Throwable -> L5
            goto Ld
        L5:
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)
            java.util.List r1 = Yue.C1219.m6537(r1)
        Ld:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.List<Yue.InterfaceC3871> m10717() {
            r6 = this;
            boolean r0 = Yue.C2337.m10722()
            java.lang.Class<Yue.ۥ۠ۨۦۡ> r1 = Yue.InterfaceC3871.class
            if (r0 != 0) goto L11
            java.lang.ClassLoader r0 = r1.getClassLoader()
            java.util.List r0 = r6.m10716(r1, r0)
            return r0
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57
            r2 = 2
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Yue.ۥ۟۠ۤۧ"
            r3 = 1
            r4 = 0
            java.lang.ClassLoader r5 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L57
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L57
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L57
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L57
            java.lang.Object r2 = r1.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L57
            Yue.ۥ۠ۨۦۡ r2 = (Yue.InterfaceC3871) r2     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L57
            goto L33
        L32:
            r2 = r4
        L33:
            if (r2 == 0) goto L38
            r0.add(r2)     // Catch: java.lang.Throwable -> L57
        L38:
            java.lang.String r2 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r5 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L51 java.lang.Throwable -> L57
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.ClassNotFoundException -> L51 java.lang.Throwable -> L57
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.ClassNotFoundException -> L51 java.lang.Throwable -> L57
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.ClassNotFoundException -> L51 java.lang.Throwable -> L57
            java.lang.Object r2 = r1.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L51 java.lang.Throwable -> L57
            Yue.ۥ۠ۨۦۡ r2 = (Yue.InterfaceC3871) r2     // Catch: java.lang.ClassNotFoundException -> L51 java.lang.Throwable -> L57
            r4 = r2
        L51:
            if (r4 == 0) goto L5f
            r0.add(r4)     // Catch: java.lang.Throwable -> L57
            goto L5f
        L57:
            java.lang.ClassLoader r0 = r1.getClassLoader()
            java.util.List r0 = r6.m10716(r1, r0)
        L5f:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final <S> java.util.List<S> m10718(@Yue.InterfaceC4418 java.lang.Class<S> r5, @Yue.InterfaceC4418 java.lang.ClassLoader r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "META-INF/services/"
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Enumeration r0 = r6.getResources(r0)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            java.lang.String r1 = "list(this)"
            Yue.C3329.m13905(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()
            java.net.URL r2 = (java.net.URL) r2
            Yue.ۥ۠ۡۦۧ r3 = Yue.C2336.f7601
            java.util.List r2 = r3.m10719(r2)
            Yue.C1216.m6247(r1, r2)
            goto L2b
        L41:
            java.util.Set r0 = Yue.C1219.m6542(r1)
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L73
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = Yue.C1210.m6231(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            Yue.ۥ۠ۡۦۧ r3 = Yue.C2336.f7601
            java.lang.Object r2 = r3.m10715(r2, r6, r5)
            r1.add(r2)
            goto L5c
        L72:
            return r1
        L73:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No providers were loaded with FastServiceLoader"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m10719(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = Yue.C5988.m22315(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L5c
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = Yue.C5989.m22466(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = Yue.C5989.m22473(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = Yue.C5989.m22466(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L48
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L48
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L48
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L48
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L48
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L48
            Yue.ۥ۠ۡۦۧ r0 = Yue.C2336.f7601     // Catch: java.lang.Throwable -> L4a
            java.util.List r0 = r0.m10720(r6)     // Catch: java.lang.Throwable -> L4a
            Yue.C1173.m6114(r6, r4)     // Catch: java.lang.Throwable -> L48
            r1.close()
            return r0
        L48:
            r6 = move-exception
            goto L51
        L4a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r2 = move-exception
            Yue.C1173.m6114(r6, r0)     // Catch: java.lang.Throwable -> L48
            throw r2     // Catch: java.lang.Throwable -> L48
        L51:
            throw r6     // Catch: java.lang.Throwable -> L52
        L52:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L57
            throw r0
        L57:
            r0 = move-exception
            Yue.C2268.m10468(r6, r0)
            throw r6
        L5c:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            Yue.ۥ۠ۡۦۧ r6 = Yue.C2336.f7601     // Catch: java.lang.Throwable -> L74
            java.util.List r6 = r6.m10720(r0)     // Catch: java.lang.Throwable -> L74
            Yue.C1173.m6114(r0, r4)
            return r6
        L74:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L76
        L76:
            r1 = move-exception
            Yue.C1173.m6114(r0, r6)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m10720(java.io.BufferedReader r6) {
            r5 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L5:
            java.lang.String r1 = r6.readLine()
            if (r1 != 0) goto L10
            java.util.List r6 = Yue.C1219.m6537(r0)
            return r6
        L10:
            java.lang.String r2 = "#"
            r3 = 2
            r4 = 0
            java.lang.String r1 = Yue.C5989.m22474(r1, r2, r4, r3, r4)
            java.lang.CharSequence r1 = Yue.C5989.m22481(r1)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L21:
            int r3 = r1.length()
            if (r2 >= r3) goto L54
            char r3 = r1.charAt(r2)
            r4 = 46
            if (r3 == r4) goto L51
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 == 0) goto L36
            goto L51
        L36:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Illegal service provider class name: "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L51:
            int r2 = r2 + 1
            goto L21
        L54:
            int r2 = r1.length()
            if (r2 <= 0) goto L5
            r0.add(r1)
            goto L5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final <R> R m10721(java.util.jar.JarFile r3, Yue.InterfaceC2825<? super java.util.jar.JarFile, ? extends R> r4) {
            r2 = this;
            r0 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> Lf
            Yue.C3249.m13687(r0)
            r3.close()
            Yue.C3249.m13686(r0)
            return r4
        Lf:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L11
        L11:
            r1 = move-exception
            Yue.C3249.m13687(r0)
            r3.close()     // Catch: java.lang.Throwable -> L1c
            Yue.C3249.m13686(r0)
            throw r1
        L1c:
            r3 = move-exception
            Yue.C2268.m10468(r4, r3)
            throw r4
    }
}
