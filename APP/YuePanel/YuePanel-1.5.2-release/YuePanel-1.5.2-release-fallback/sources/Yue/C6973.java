package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6973 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f24322 = "jsoupSource";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f24323 = "jsoupContextSource";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f24324 = "jsoupContextNode";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f24325 = "javax.xml.xpath.XPathFactory:jsoup";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public javax.xml.parsers.DocumentBuilderFactory f24326;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f24327;

    /* JADX INFO: renamed from: Yue.ۥۢۥ۠ۥ$ۥ, reason: contains not printable characters */
    public static class C6974 implements Yue.InterfaceC4406 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final java.lang.String f24328 = "xmlns";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final java.lang.String f24329 = "xmlns:";

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final org.w3c.dom.Document f24330;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f24331;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.Stack<java.util.HashMap<java.lang.String, java.lang.String>> f24332;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public org.w3c.dom.Node f24333;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C1948.C1949.EnumC1950 f24334;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Yue.C2104 f24335;

        public C6974(org.w3c.dom.Document r3) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.f24331 = r0
                java.util.Stack r0 = new java.util.Stack
                r0.<init>()
                r2.f24332 = r0
                Yue.ۥ۠۟ۧۥ$ۥ$ۥ r1 = Yue.C1948.C1949.EnumC1950.f6109
                r2.f24334 = r1
                r2.f24330 = r3
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.push(r1)
                r2.f24333 = r3
                java.lang.String r1 = "jsoupContextSource"
                java.lang.Object r3 = r3.getUserData(r1)
                Yue.ۥ۠۠ۥۥ r3 = (Yue.C2104) r3
                r2.f24335 = r3
                Yue.ۥ۠۟ۧۥ r3 = r3.m17287()
                boolean r1 = r2.f24331
                if (r1 == 0) goto L4a
                if (r3 == 0) goto L4a
                Yue.ۥۣۡۧۦ r3 = r3.m8958()
                Yue.ۥۢۢۡۧ r3 = r3.m18627()
                boolean r3 = r3 instanceof Yue.C3087
                if (r3 == 0) goto L4a
                java.lang.Object r3 = r0.peek()
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.lang.String r0 = ""
                java.lang.String r1 = "http://www.w3.org/1999/xhtml"
                r3.put(r0, r1)
            L4a:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m26924(Yue.C6973.C6974 r0, boolean r1) {
                r0.f24331 = r1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ Yue.C1948.C1949.EnumC1950 m26925(Yue.C6973.C6974 r0, Yue.C1948.C1949.EnumC1950 r1) {
                r0.f24334 = r1
                return r1
        }

        @Override // Yue.InterfaceC4406
        /* JADX INFO: renamed from: ۥ */
        public void mo6058(Yue.AbstractC4398 r5, int r6) {
                r4 = this;
                java.util.Stack<java.util.HashMap<java.lang.String, java.lang.String>> r6 = r4.f24332
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Stack<java.util.HashMap<java.lang.String, java.lang.String>> r1 = r4.f24332
                java.lang.Object r1 = r1.peek()
                java.util.Map r1 = (java.util.Map) r1
                r0.<init>(r1)
                r6.push(r0)
                boolean r6 = r5 instanceof Yue.C2104
                if (r6 == 0) goto L7b
                Yue.ۥ۠۠ۥۥ r5 = (Yue.C2104) r5
                java.lang.String r6 = r4.m26928(r5)
                boolean r0 = r4.f24331
                r1 = 0
                if (r0 == 0) goto L30
                java.util.Stack<java.util.HashMap<java.lang.String, java.lang.String>> r0 = r4.f24332
                java.lang.Object r0 = r0.peek()
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.Object r6 = r0.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                goto L31
            L30:
                r6 = r1
            L31:
                java.lang.String r0 = r5.m9924()
                if (r6 != 0) goto L41
                java.lang.String r2 = ":"
                boolean r2 = r0.contains(r2)     // Catch: org.w3c.dom.DOMException -> L5b
                if (r2 == 0) goto L41
                java.lang.String r6 = ""
            L41:
                org.w3c.dom.Document r2 = r4.f24330     // Catch: org.w3c.dom.DOMException -> L5b
                org.w3c.dom.Element r6 = r2.createElementNS(r6, r0)     // Catch: org.w3c.dom.DOMException -> L5b
                r4.m26927(r5, r6)     // Catch: org.w3c.dom.DOMException -> L5b
                r4.m26926(r6, r5)     // Catch: org.w3c.dom.DOMException -> L5b
                Yue.ۥ۠۠ۥۥ r2 = r4.f24335     // Catch: org.w3c.dom.DOMException -> L5b
                if (r5 != r2) goto L58
                org.w3c.dom.Document r2 = r4.f24330     // Catch: org.w3c.dom.DOMException -> L5b
                java.lang.String r3 = "jsoupContextNode"
                r2.setUserData(r3, r6, r1)     // Catch: org.w3c.dom.DOMException -> L5b
            L58:
                r4.f24333 = r6     // Catch: org.w3c.dom.DOMException -> L5b
                goto Lb6
            L5b:
                org.w3c.dom.Document r6 = r4.f24330
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "<"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = ">"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                org.w3c.dom.Text r6 = r6.createTextNode(r0)
                r4.m26926(r6, r5)
                goto Lb6
            L7b:
                boolean r6 = r5 instanceof Yue.C6151
                if (r6 == 0) goto L8f
                Yue.ۥۢۡ۠ۦ r5 = (Yue.C6151) r5
                org.w3c.dom.Document r6 = r4.f24330
                java.lang.String r0 = r5.m23014()
                org.w3c.dom.Text r6 = r6.createTextNode(r0)
                r4.m26926(r6, r5)
                goto Lb6
            L8f:
                boolean r6 = r5 instanceof Yue.C1274
                if (r6 == 0) goto La3
                Yue.ۥ۟ۥۤۤ r5 = (Yue.C1274) r5
                org.w3c.dom.Document r6 = r4.f24330
                java.lang.String r0 = r5.m6696()
                org.w3c.dom.Comment r6 = r6.createComment(r0)
                r4.m26926(r6, r5)
                goto Lb6
            La3:
                boolean r6 = r5 instanceof Yue.C1725
                if (r6 == 0) goto Lb6
                Yue.ۥ۟ۨۢۥ r5 = (Yue.C1725) r5
                org.w3c.dom.Document r6 = r4.f24330
                java.lang.String r0 = r5.m8226()
                org.w3c.dom.Text r6 = r6.createTextNode(r0)
                r4.m26926(r6, r5)
            Lb6:
                return
        }

        @Override // Yue.InterfaceC4406
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo6059(Yue.AbstractC4398 r1, int r2) {
                r0 = this;
                boolean r1 = r1 instanceof Yue.C2104
                if (r1 == 0) goto L16
                org.w3c.dom.Node r1 = r0.f24333
                org.w3c.dom.Node r1 = r1.getParentNode()
                boolean r1 = r1 instanceof org.w3c.dom.Element
                if (r1 == 0) goto L16
                org.w3c.dom.Node r1 = r0.f24333
                org.w3c.dom.Node r1 = r1.getParentNode()
                r0.f24333 = r1
            L16:
                java.util.Stack<java.util.HashMap<java.lang.String, java.lang.String>> r1 = r0.f24332
                r1.pop()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m26926(org.w3c.dom.Node r3, Yue.AbstractC4398 r4) {
                r2 = this;
                java.lang.String r0 = "jsoupSource"
                r1 = 0
                r3.setUserData(r0, r4, r1)
                org.w3c.dom.Node r4 = r2.f24333
                r4.appendChild(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m26927(Yue.AbstractC4398 r4, org.w3c.dom.Element r5) {
                r3 = this;
                Yue.ۥ۟ۢ۠ۤ r4 = r4.mo9793()
                java.util.Iterator r4 = r4.iterator()
            L8:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L28
                java.lang.Object r0 = r4.next()
                Yue.ۥ۟ۢ۠ۢ r0 = (Yue.C0646) r0
                java.lang.String r1 = r0.m4219()
                Yue.ۥ۠۟ۧۥ$ۥ$ۥ r2 = r3.f24334
                java.lang.String r1 = Yue.C0646.m4212(r1, r2)
                if (r1 == 0) goto L8
                java.lang.String r0 = r0.m4220()
                r5.setAttribute(r1, r0)
                goto L8
            L28:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final java.lang.String m26928(Yue.C2104 r6) {
                r5 = this;
                Yue.ۥ۟ۢ۠ۤ r0 = r6.mo9793()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                java.lang.String r2 = ""
                if (r1 == 0) goto L40
                java.lang.Object r1 = r0.next()
                Yue.ۥ۟ۢ۠ۢ r1 = (Yue.C0646) r1
                java.lang.String r3 = r1.m4219()
                java.lang.String r4 = "xmlns"
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L23
                goto L30
            L23:
                java.lang.String r2 = "xmlns:"
                boolean r2 = r3.startsWith(r2)
                if (r2 == 0) goto L8
                r2 = 6
                java.lang.String r2 = r3.substring(r2)
            L30:
                java.util.Stack<java.util.HashMap<java.lang.String, java.lang.String>> r3 = r5.f24332
                java.lang.Object r3 = r3.peek()
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.lang.String r1 = r1.m4220()
                r3.put(r2, r1)
                goto L8
            L40:
                java.lang.String r0 = r6.m9924()
                r1 = 58
                int r0 = r0.indexOf(r1)
                if (r0 <= 0) goto L55
                java.lang.String r6 = r6.m9924()
                r1 = 0
                java.lang.String r2 = r6.substring(r1, r0)
            L55:
                return r2
        }
    }

    public C6973() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f24327 = r0
            javax.xml.parsers.DocumentBuilderFactory r1 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r2.f24326 = r1
            r1.setNamespaceAware(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.HashMap<java.lang.String, java.lang.String> m26907() {
            java.lang.String r0 = "html"
            java.util.HashMap r0 = m26911(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.HashMap<java.lang.String, java.lang.String> m26908() {
            java.lang.String r0 = "xml"
            java.util.HashMap r0 = m26911(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m26909(org.w3c.dom.Document r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            javax.xml.transform.dom.DOMSource r0 = new javax.xml.transform.dom.DOMSource     // Catch: javax.xml.transform.TransformerException -> L21
            r0.<init>(r6)     // Catch: javax.xml.transform.TransformerException -> L21
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: javax.xml.transform.TransformerException -> L21
            r1.<init>()     // Catch: javax.xml.transform.TransformerException -> L21
            javax.xml.transform.stream.StreamResult r2 = new javax.xml.transform.stream.StreamResult     // Catch: javax.xml.transform.TransformerException -> L21
            r2.<init>(r1)     // Catch: javax.xml.transform.TransformerException -> L21
            javax.xml.transform.TransformerFactory r3 = javax.xml.transform.TransformerFactory.newInstance()     // Catch: javax.xml.transform.TransformerException -> L21
            javax.xml.transform.Transformer r3 = r3.newTransformer()     // Catch: javax.xml.transform.TransformerException -> L21
            if (r7 == 0) goto L23
            java.util.Properties r7 = m26912(r7)     // Catch: javax.xml.transform.TransformerException -> L21
            r3.setOutputProperties(r7)     // Catch: javax.xml.transform.TransformerException -> L21
            goto L23
        L21:
            r6 = move-exception
            goto L81
        L23:
            org.w3c.dom.DocumentType r7 = r6.getDoctype()     // Catch: javax.xml.transform.TransformerException -> L21
            if (r7 == 0) goto L79
            org.w3c.dom.DocumentType r6 = r6.getDoctype()     // Catch: javax.xml.transform.TransformerException -> L21
            java.lang.String r7 = r6.getPublicId()     // Catch: javax.xml.transform.TransformerException -> L21
            boolean r7 = Yue.C5973.m22118(r7)     // Catch: javax.xml.transform.TransformerException -> L21
            if (r7 != 0) goto L40
            java.lang.String r7 = "doctype-public"
            java.lang.String r4 = r6.getPublicId()     // Catch: javax.xml.transform.TransformerException -> L21
            r3.setOutputProperty(r7, r4)     // Catch: javax.xml.transform.TransformerException -> L21
        L40:
            java.lang.String r7 = r6.getSystemId()     // Catch: javax.xml.transform.TransformerException -> L21
            boolean r7 = Yue.C5973.m22118(r7)     // Catch: javax.xml.transform.TransformerException -> L21
            java.lang.String r4 = "doctype-system"
            if (r7 != 0) goto L54
            java.lang.String r6 = r6.getSystemId()     // Catch: javax.xml.transform.TransformerException -> L21
            r3.setOutputProperty(r4, r6)     // Catch: javax.xml.transform.TransformerException -> L21
            goto L79
        L54:
            java.lang.String r7 = r6.getName()     // Catch: javax.xml.transform.TransformerException -> L21
            java.lang.String r5 = "html"
            boolean r7 = r7.equalsIgnoreCase(r5)     // Catch: javax.xml.transform.TransformerException -> L21
            if (r7 == 0) goto L79
            java.lang.String r7 = r6.getPublicId()     // Catch: javax.xml.transform.TransformerException -> L21
            boolean r7 = Yue.C5973.m22118(r7)     // Catch: javax.xml.transform.TransformerException -> L21
            if (r7 == 0) goto L79
            java.lang.String r6 = r6.getSystemId()     // Catch: javax.xml.transform.TransformerException -> L21
            boolean r6 = Yue.C5973.m22118(r6)     // Catch: javax.xml.transform.TransformerException -> L21
            if (r6 == 0) goto L79
            java.lang.String r6 = "about:legacy-compat"
            r3.setOutputProperty(r4, r6)     // Catch: javax.xml.transform.TransformerException -> L21
        L79:
            r3.transform(r0, r2)     // Catch: javax.xml.transform.TransformerException -> L21
            java.lang.String r6 = r1.toString()     // Catch: javax.xml.transform.TransformerException -> L21
            return r6
        L81:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static org.w3c.dom.Document m26910(Yue.C1948 r1) {
            Yue.ۥۢۥ۠ۥ r0 = new Yue.ۥۢۥ۠ۥ
            r0.<init>()
            org.w3c.dom.Document r1 = r0.m26917(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.util.HashMap<java.lang.String, java.lang.String> m26911(java.lang.String r2) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "method"
            r0.put(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static java.util.Properties m26912(java.util.Map<java.lang.String, java.lang.String> r1) {
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r0.putAll(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m26913(org.w3c.dom.Document r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = m26909(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public org.w3c.dom.Node m26914(org.w3c.dom.Document r2) {
            r1 = this;
            java.lang.String r0 = "jsoupContextNode"
            java.lang.Object r2 = r2.getUserData(r0)
            org.w3c.dom.Node r2 = (org.w3c.dom.Node) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m26915(Yue.C1948 r1, org.w3c.dom.Document r2) {
            r0 = this;
            r0.m26916(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m26916(Yue.C2104 r4, org.w3c.dom.Document r5) {
            r3 = this;
            Yue.ۥۢۥ۠ۥ$ۥ r0 = new Yue.ۥۢۥ۠ۥ$ۥ
            r0.<init>(r5)
            boolean r1 = r3.f24327
            Yue.C6973.C6974.m26924(r0, r1)
            Yue.ۥ۠۟ۧۥ r1 = r4.m17287()
            if (r1 == 0) goto L2c
            java.lang.String r2 = r1.m8954()
            boolean r2 = Yue.C5973.m22118(r2)
            if (r2 != 0) goto L21
            java.lang.String r2 = r1.m8954()
            r5.setDocumentURI(r2)
        L21:
            Yue.ۥ۠۟ۧۥ$ۥ r5 = r1.m8955()
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r5 = r5.m8982()
            Yue.C6973.C6974.m26925(r0, r5)
        L2c:
            boolean r5 = r4 instanceof Yue.C1948
            if (r5 == 0) goto L34
            Yue.ۥ۠۠ۥۥ r4 = r4.m9852()
        L34:
            Yue.C4404.m17315(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public org.w3c.dom.Document m26917(Yue.C1948 r1) {
            r0 = this;
            org.w3c.dom.Document r1 = r0.m26918(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public org.w3c.dom.Document m26918(Yue.C2104 r8) {
            r7 = this;
            Yue.C6657.m25635(r8)
            javax.xml.parsers.DocumentBuilderFactory r0 = r7.f24326     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            org.w3c.dom.DOMImplementation r1 = r0.getDOMImplementation()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            org.w3c.dom.Document r0 = r0.newDocument()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            Yue.ۥ۠۟ۧۥ r2 = r8.m17287()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            r3 = 0
            if (r2 == 0) goto L1f
            Yue.ۥ۠۟ۧۧ r4 = r2.m8948()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            goto L20
        L1d:
            r8 = move-exception
            goto L4f
        L1f:
            r4 = r3
        L20:
            if (r4 == 0) goto L35
            java.lang.String r5 = r4.m9009()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d org.w3c.dom.DOMException -> L35
            java.lang.String r6 = r4.m9010()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d org.w3c.dom.DOMException -> L35
            java.lang.String r4 = r4.m9012()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d org.w3c.dom.DOMException -> L35
            org.w3c.dom.DocumentType r1 = r1.createDocumentType(r5, r6, r4)     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d org.w3c.dom.DOMException -> L35
            r0.appendChild(r1)     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d org.w3c.dom.DOMException -> L35
        L35:
            r1 = 1
            r0.setXmlStandalone(r1)     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            boolean r1 = r8 instanceof Yue.C1948     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            if (r1 == 0) goto L42
            Yue.ۥ۠۠ۥۥ r1 = r8.m9852()     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            goto L43
        L42:
            r1 = r8
        L43:
            java.lang.String r4 = "jsoupContextSource"
            r0.setUserData(r4, r1, r3)     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            if (r2 == 0) goto L4b
            r8 = r2
        L4b:
            r7.m26916(r8, r0)     // Catch: javax.xml.parsers.ParserConfigurationException -> L1d
            return r0
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C6973 m26919(boolean r2) {
            r1 = this;
            r1.f24327 = r2
            javax.xml.parsers.DocumentBuilderFactory r0 = r1.f24326
            r0.setNamespaceAware(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m26920() {
            r1 = this;
            boolean r0 = r1.f24327
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public org.w3c.dom.NodeList m26921(java.lang.String r1, org.w3c.dom.Document r2) {
            r0 = this;
            org.w3c.dom.NodeList r1 = r0.m26922(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public org.w3c.dom.NodeList m26922(java.lang.String r3, org.w3c.dom.Node r4) {
            r2 = this;
            java.lang.String r0 = "xpath"
            Yue.C6657.m25634(r3, r0)
            java.lang.String r0 = "contextNode"
            Yue.C6657.m25637(r4, r0)
            java.lang.String r0 = "javax.xml.xpath.XPathFactory:jsoup"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            if (r0 == 0) goto L1d
            java.lang.String r0 = "jsoup"
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance(r0)     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            goto L21
        L19:
            r4 = move-exception
            goto L35
        L1b:
            r4 = move-exception
            goto L35
        L1d:
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
        L21:
            javax.xml.xpath.XPath r0 = r0.newXPath()     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            javax.xml.xpath.XPathExpression r0 = r0.compile(r3)     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            java.lang.Object r4 = r0.evaluate(r4, r1)     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            org.w3c.dom.NodeList r4 = (org.w3c.dom.NodeList) r4     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            Yue.C6657.m25635(r4)     // Catch: javax.xml.xpath.XPathFactoryConfigurationException -> L19 javax.xml.xpath.XPathExpressionException -> L1b
            return r4
        L35:
            Yue.ۥۡۨ۟ۡ$ۥ r0 = new Yue.ۥۡۨ۟ۡ$ۥ
            java.lang.String r1 = r4.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            java.lang.String r1 = "Could not evaluate XPath query [%s]: %s"
            r0.<init>(r4, r1, r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public <T extends Yue.AbstractC4398> java.util.List<T> m26923(org.w3c.dom.NodeList r5, java.lang.Class<T> r6) {
            r4 = this;
            Yue.C6657.m25635(r5)
            Yue.C6657.m25635(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.getLength()
            r0.<init>(r1)
            r1 = 0
        L10:
            int r2 = r5.getLength()
            if (r1 >= r2) goto L32
            org.w3c.dom.Node r2 = r5.item(r1)
            java.lang.String r3 = "jsoupSource"
            java.lang.Object r2 = r2.getUserData(r3)
            boolean r3 = r6.isInstance(r2)
            if (r3 == 0) goto L2f
            java.lang.Object r2 = r6.cast(r2)
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            r0.add(r2)
        L2f:
            int r1 = r1 + 1
            goto L10
        L32:
            return r0
    }
}
