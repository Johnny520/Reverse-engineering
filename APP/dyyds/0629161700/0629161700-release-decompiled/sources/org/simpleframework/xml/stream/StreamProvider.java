package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class StreamProvider implements org.simpleframework.xml.stream.Provider {
    private final defpackage.AbstractC0018 factory;

    public StreamProvider() {
            r8 = this;
            java.lang.Class<ᛵᲁᛳᲁ> r0 = defpackage.AbstractC0966.class
            r8.<init>()
            java.lang.String r8 = "javax.xml.stream.XMLInputFactory"
            boolean r1 = defpackage.AbstractC0966.f4287
            r1 = 0
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            java.lang.Class r3 = defpackage.AbstractC0966.f4288     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            if (r3 != 0) goto L16
            defpackage.AbstractC0966.f4288 = r0     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            r3 = r0
        L16:
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            r2.append(r3)     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            java.lang.String r3 = "$ClassLoaderFinderConcrete"
            r2.append(r3)     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            if (r2 != 0) goto L31
            throw r1     // Catch: java.lang.Exception -> L37
        L31:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            r2.<init>()     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
            throw r2     // Catch: java.lang.Exception -> L37 java.lang.ClassNotFoundException -> L42 java.lang.LinkageError -> L4f
        L37:
            r8 = move-exception
            ᛵᲀᛷᛴ r0 = new ᛵᲀᛷᛴ
            java.lang.String r1 = r8.toString()
            r0.<init>(r1, r8)
            throw r0
        L42:
            java.lang.Class r2 = defpackage.AbstractC0966.f4288
            if (r2 != 0) goto L49
            defpackage.AbstractC0966.f4288 = r0
            goto L4a
        L49:
            r0 = r2
        L4a:
            java.lang.ClassLoader r0 = r0.getClassLoader()
            goto L5b
        L4f:
            java.lang.Class r2 = defpackage.AbstractC0966.f4288
            if (r2 != 0) goto L56
            defpackage.AbstractC0966.f4288 = r0
            goto L57
        L56:
            r0 = r2
        L57:
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L5b:
            boolean r2 = defpackage.AbstractC0966.f4287
            java.lang.String r3 = "loaded from services: "
            java.lang.String r4 = "found java.home property "
            java.lang.String r5 = "found system property"
            java.lang.String r6 = java.lang.System.getProperty(r8)     // Catch: java.lang.SecurityException -> L76
            if (r6 == 0) goto L76
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.SecurityException -> L76
            defpackage.AbstractC0966.m1913(r5)     // Catch: java.lang.SecurityException -> L76
            java.lang.Object r8 = defpackage.AbstractC0966.m1914(r0, r6)     // Catch: java.lang.SecurityException -> L76
            goto L123
        L76:
            java.lang.String r5 = "java.home"
            java.lang.String r5 = java.lang.System.getProperty(r5)     // Catch: java.lang.Exception -> Lca
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> Lca
            r6.<init>()     // Catch: java.lang.Exception -> Lca
            r6.append(r5)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = java.io.File.separator     // Catch: java.lang.Exception -> Lca
            r6.append(r5)     // Catch: java.lang.Exception -> Lca
            java.lang.String r7 = "lib"
            r6.append(r7)     // Catch: java.lang.Exception -> Lca
            r6.append(r5)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = "jaxp.properties"
            r6.append(r5)     // Catch: java.lang.Exception -> Lca
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> Lca
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> Lca
            r6.<init>(r5)     // Catch: java.lang.Exception -> Lca
            boolean r5 = r6.exists()     // Catch: java.lang.Exception -> Lca
            if (r5 == 0) goto Ld0
            java.util.Properties r5 = new java.util.Properties     // Catch: java.lang.Exception -> Lca
            r5.<init>()     // Catch: java.lang.Exception -> Lca
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Lca
            r7.<init>(r6)     // Catch: java.lang.Exception -> Lca
            r5.load(r7)     // Catch: java.lang.Exception -> Lca
            java.lang.String r8 = r5.getProperty(r8)     // Catch: java.lang.Exception -> Lca
            if (r8 == 0) goto Ld0
            int r5 = r8.length()     // Catch: java.lang.Exception -> Lca
            if (r5 <= 0) goto Ld0
            java.lang.String r4 = r4.concat(r8)     // Catch: java.lang.Exception -> Lca
            defpackage.AbstractC0966.m1913(r4)     // Catch: java.lang.Exception -> Lca
            java.lang.Object r8 = defpackage.AbstractC0966.m1914(r0, r8)     // Catch: java.lang.Exception -> Lca
            goto L123
        Lca:
            r8 = move-exception
            if (r2 == 0) goto Ld0
            r8.printStackTrace()
        Ld0:
            java.lang.String r8 = "META-INF/services/javax.xml.stream.XMLInputFactory"
            if (r0 != 0) goto Ldb
            java.io.InputStream r8 = java.lang.ClassLoader.getSystemResourceAsStream(r8)     // Catch: java.lang.Exception -> Ld9
            goto Ldf
        Ld9:
            r8 = move-exception
            goto L10f
        Ldb:
            java.io.InputStream r8 = r0.getResourceAsStream(r8)     // Catch: java.lang.Exception -> Ld9
        Ldf:
            if (r8 == 0) goto L114
            java.lang.String r4 = "found META-INF/services/javax.xml.stream.XMLInputFactory"
            defpackage.AbstractC0966.m1913(r4)     // Catch: java.lang.Exception -> Ld9
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> Ld9
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> Ld9
            java.lang.String r6 = "UTF-8"
            r5.<init>(r8, r6)     // Catch: java.lang.Exception -> Ld9
            r4.<init>(r5)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r8 = r4.readLine()     // Catch: java.lang.Exception -> Ld9
            r4.close()     // Catch: java.lang.Exception -> Ld9
            if (r8 == 0) goto L114
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Exception -> Ld9
            if (r4 != 0) goto L114
            java.lang.String r3 = r3.concat(r8)     // Catch: java.lang.Exception -> Ld9
            defpackage.AbstractC0966.m1913(r3)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r8 = defpackage.AbstractC0966.m1914(r0, r8)     // Catch: java.lang.Exception -> Ld9
            goto L123
        L10f:
            if (r2 == 0) goto L114
            r8.printStackTrace()
        L114:
            java.lang.String r8 = "loaded from fallback value: "
            java.lang.String r2 = "com.bea.xml.stream.MXParserFactory"
            java.lang.String r8 = r8.concat(r2)
            defpackage.AbstractC0966.m1913(r8)
            java.lang.Object r8 = defpackage.AbstractC0966.m1914(r0, r2)
        L123:
            if (r8 != 0) goto L126
            return
        L126:
            defpackage.C2264.m3679()
            throw r1
    }

    private org.simpleframework.xml.stream.EventReader provide(defpackage.InterfaceC1076 r1) {
            r0 = this;
            org.simpleframework.xml.stream.StreamReader r0 = new org.simpleframework.xml.stream.StreamReader
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.InputStream r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // org.simpleframework.xml.stream.Provider
    public org.simpleframework.xml.stream.EventReader provide(java.io.Reader r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
