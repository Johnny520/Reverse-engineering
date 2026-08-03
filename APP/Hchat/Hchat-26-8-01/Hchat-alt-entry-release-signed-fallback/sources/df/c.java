package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mh.b f2211d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad.c f2212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f2213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f2214c;

    static {
            java.lang.Class<df.c> r0 = df.c.class
            mh.b r0 = mh.d.b(r0)
            df.c.f2211d = r0
            return
    }

    public c(ad.c r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f2213b = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f2214c = r1
            r2.f2212a = r3
            java.lang.String r3 = "/android/attrs.xml"
            org.w3c.dom.Document r3 = r2.a(r3)
            r2.b(r3)
            java.lang.String r3 = "/android/attrs_manifest.xml"
            org.w3c.dom.Document r3 = r2.a(r3)
            r2.b(r3)
            int r3 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            mh.b r0 = df.c.f2211d
            java.lang.String r1 = "Loaded android attributes count: {}"
            r0.x(r3, r1)
            return
    }

    public final org.w3c.dom.Document a(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = " not found in classpath"
            java.lang.Class<df.c> r1 = df.c.class
            java.io.InputStream r1 = r1.getResourceAsStream(r5)     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L34
            ad.c r0 = r4.f2212a     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r0.f225a     // Catch: java.lang.Throwable -> L32
            zc.a r2 = zc.a.f22659h     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L19
            javax.xml.parsers.DocumentBuilderFactory r0 = ad.a.f222a     // Catch: java.lang.Throwable -> L32
            goto L1b
        L19:
            javax.xml.parsers.DocumentBuilderFactory r0 = ad.b.f223a     // Catch: java.lang.Throwable -> L32
        L1b:
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L32
            org.w3c.dom.Document r0 = r0.parse(r1)     // Catch: java.lang.Exception -> L29 java.lang.Throwable -> L32
            r1.close()     // Catch: java.lang.Exception -> L27
            return r0
        L27:
            r0 = move-exception
            goto L49
        L29:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Failed to parse xml"
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            goto L3e
        L34:
            af.g r2 = new af.g     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.concat(r0)     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L3e:
            if (r1 == 0) goto L48
            r1.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L27
        L48:
            throw r0     // Catch: java.lang.Exception -> L27
        L49:
            af.g r1 = new af.g
            java.lang.String r2 = "Xml load error, file: "
            java.lang.String r5 = r2.concat(r5)
            r1.<init>(r5, r0)
            throw r1
    }

    public final void b(org.w3c.dom.Document r5) {
            r4 = this;
            org.w3c.dom.NodeList r5 = r5.getChildNodes()
            r0 = 0
        L5:
            int r1 = r5.getLength()
            if (r0 >= r1) goto L26
            org.w3c.dom.Node r1 = r5.item(r0)
            short r2 = r1.getNodeType()
            r3 = 1
            if (r2 != r3) goto L23
            boolean r2 = r1.hasChildNodes()
            if (r2 == 0) goto L23
            org.w3c.dom.NodeList r1 = r1.getChildNodes()
            r4.c(r1)
        L23:
            int r0 = r0 + 1
            goto L5
        L26:
            return
    }

    public final void c(org.w3c.dom.NodeList r14) {
            r13 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r14.getLength()
            if (r1 >= r2) goto Lf8
            org.w3c.dom.Node r2 = r14.item(r1)
            short r3 = r2.getNodeType()
            r4 = 1
            if (r3 != r4) goto Lf4
            boolean r3 = r2.hasAttributes()
            if (r3 == 0) goto Lf4
            boolean r3 = r2.hasChildNodes()
            if (r3 == 0) goto Lf4
            org.w3c.dom.NamedNodeMap r3 = r2.getAttributes()
            r5 = r0
        L24:
            int r6 = r3.getLength()
            java.lang.String r7 = "name"
            r8 = 0
            if (r5 >= r6) goto L43
            org.w3c.dom.Node r6 = r3.item(r5)
            java.lang.String r9 = r6.getNodeName()
            boolean r9 = r9.equals(r7)
            if (r9 == 0) goto L40
            java.lang.String r3 = r6.getNodeValue()
            goto L44
        L40:
            int r5 = r5 + 1
            goto L24
        L43:
            r3 = r8
        L44:
            if (r3 == 0) goto Led
            java.lang.String r5 = r2.getNodeName()
            java.lang.String r6 = "attr"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Led
            org.w3c.dom.NodeList r2 = r2.getChildNodes()
            r5 = r0
        L57:
            int r6 = r2.getLength()
            if (r5 >= r6) goto Lf4
            org.w3c.dom.Node r6 = r2.item(r5)
            short r9 = r6.getNodeType()
            if (r9 != r4) goto Le9
            boolean r9 = r6.hasAttributes()
            if (r9 == 0) goto Le9
            r9 = 2
            if (r8 != 0) goto La3
            java.lang.String r10 = r6.getNodeName()
            java.lang.String r11 = "enum"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L83
            a5.a r8 = new a5.a
            r10 = 2
            r8.<init>(r4, r10)
            goto L95
        L83:
            java.lang.String r10 = r6.getNodeName()
            java.lang.String r11 = "flag"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L95
            a5.a r8 = new a5.a
            r10 = 2
            r8.<init>(r9, r10)
        L95:
            if (r8 != 0) goto L98
            goto Lf4
        L98:
            java.lang.String r10 = "android:"
            java.lang.String r10 = r10.concat(r3)
            java.util.HashMap r11 = r13.f2213b
            r11.put(r10, r8)
        La3:
            org.w3c.dom.NamedNodeMap r6 = r6.getAttributes()
            org.w3c.dom.Node r10 = r6.getNamedItem(r7)
            if (r10 == 0) goto Le9
            java.lang.String r11 = "value"
            org.w3c.dom.Node r6 = r6.getNamedItem(r11)
            if (r6 == 0) goto Le9
            java.lang.String r6 = r6.getNodeValue()     // Catch: java.lang.NumberFormatException -> Lcc
            java.lang.String r11 = "0x"
            boolean r11 = r6.startsWith(r11)     // Catch: java.lang.NumberFormatException -> Lcc
            if (r11 == 0) goto Lce
            java.lang.String r6 = r6.substring(r9)     // Catch: java.lang.NumberFormatException -> Lcc
            r9 = 16
            long r11 = java.lang.Long.parseLong(r6, r9)     // Catch: java.lang.NumberFormatException -> Lcc
            goto Ld2
        Lcc:
            r6 = move-exception
            goto Le2
        Lce:
            long r11 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Lcc
        Ld2:
            java.lang.String r6 = r10.getNodeValue()     // Catch: java.lang.NumberFormatException -> Lcc
            java.lang.Object r9 = r8.f57i     // Catch: java.lang.NumberFormatException -> Lcc
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9     // Catch: java.lang.NumberFormatException -> Lcc
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch: java.lang.NumberFormatException -> Lcc
            r9.put(r10, r6)     // Catch: java.lang.NumberFormatException -> Lcc
            goto Le9
        Le2:
            mh.b r9 = df.c.f2211d
            java.lang.String r10 = "Failed parse manifest number"
            r9.t(r10, r6)
        Le9:
            int r5 = r5 + 1
            goto L57
        Led:
            org.w3c.dom.NodeList r2 = r2.getChildNodes()
            r13.c(r2)
        Lf4:
            int r1 = r1 + 1
            goto L2
        Lf8:
            return
    }

    public final void d(df.g r13) {
            r12 = this;
            java.util.HashMap r0 = r12.f2214c
            r0.clear()
            df.i r1 = r13.f2227e
            ef.d r2 = new ef.d
            df.a r13 = r13.f2228f
            java.util.HashMap r3 = r1.a()
            r2.<init>(r13, r3)
            java.util.ArrayList r13 = r1.f2231a
            java.util.Iterator r13 = r13.iterator()
        L18:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Ldd
            java.lang.Object r1 = r13.next()
            ef.c r1 = (ef.c) r1
            r1.getClass()
            java.lang.String r3 = r1.f2755c
            java.lang.String r4 = "attr"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L18
            java.util.ArrayList r3 = r1.f2759g
            int r3 = r3.size()
            r4 = 1
            if (r3 <= r4) goto L18
            java.util.ArrayList r3 = r1.f2759g
            r5 = 0
            java.lang.Object r3 = r3.get(r5)
            ef.b r3 = (ef.b) r3
            b5.k r3 = r3.f2752b
            int r3 = r3.f489c
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r5
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r6) goto L50
            r3 = 2
            goto L55
        L50:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 != r6) goto L18
            r3 = r4
        L55:
            a5.a r6 = new a5.a
            r7 = 2
            r6.<init>(r3, r7)
        L5b:
            java.util.ArrayList r3 = r1.f2759g
            int r3 = r3.size()
            if (r4 >= r3) goto Ld6
            java.util.ArrayList r3 = r1.f2759g
            java.lang.Object r3 = r3.get(r4)
            ef.b r3 = (ef.b) r3
            int r7 = r3.f2751a
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r7
            if (r8 == 0) goto L7e
            r8 = r7 & r5
            if (r8 != 0) goto L7e
            r8 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r7
            if (r8 != 0) goto L7f
            r7 = 0
            goto Lb6
        L7e:
            r8 = r7
        L7f:
            java.util.HashMap r9 = r2.f2762c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            r10 = 46
            r11 = 47
            if (r9 == 0) goto L96
            java.lang.String r7 = r9.replace(r11, r10)
            goto Lb6
        L96:
            java.util.HashMap r9 = ye.a.f22424a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto Laf
            java.lang.String r7 = r8.replace(r11, r10)
            java.lang.String r8 = "android:"
        Laa:
            java.lang.String r7 = wb.en.g(r8, r7)
            goto Lb6
        Laf:
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            java.lang.String r8 = "?0x"
            goto Laa
        Lb6:
            b5.k r3 = r3.f2752b
            int r3 = r3.f489c
            long r8 = (long) r3
            java.lang.String r3 = "id."
            boolean r3 = r7.startsWith(r3)
            if (r3 == 0) goto Lc8
            r3 = 3
            java.lang.String r7 = r7.substring(r3)
        Lc8:
            java.lang.Object r3 = r6.f57i
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r3.put(r8, r7)
            int r4 = r4 + 1
            goto L5b
        Ld6:
            java.lang.String r1 = r1.f2756d
            r0.put(r1, r6)
            goto L18
        Ldd:
            return
    }
}
