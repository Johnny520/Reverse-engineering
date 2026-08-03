package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1719 implements Yue.InterfaceC2164 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C5506 f5375;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C1696 f5376;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.Object f5377;

    public C1719(java.io.File r4) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.io.File r0 = r4.getParentFile()
            r3.f5377 = r0
            Yue.ۥۡۧۤۤ r0 = new Yue.ۥۡۧۤۤ
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.FileReader r2 = new java.io.FileReader
            r2.<init>(r4)
            r1.<init>(r2)
            r4 = 0
            r0.<init>(r1, r4, r3)
            r3.f5375 = r0
            Yue.ۥ۟ۨ۠ r4 = new Yue.ۥ۟ۨ۠
            r4.<init>()
            r3.f5376 = r4
            return
    }

    public C1719(java.io.File r4, boolean r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            java.io.File r0 = r4.getParentFile()
            r3.f5377 = r0
            Yue.ۥۡۧۤۤ r0 = new Yue.ۥۡۧۤۤ
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.FileReader r2 = new java.io.FileReader
            r2.<init>(r4)
            r1.<init>(r2)
            r0.<init>(r1, r5, r3)
            r3.f5375 = r0
            Yue.ۥ۟ۨ۠ r4 = new Yue.ۥ۟ۨ۠
            r4.<init>()
            r3.f5376 = r4
            return
    }

    public C1719(java.io.Reader r3) {
            r2 = this;
            r2.<init>()
            Yue.ۥۡۧۤۤ r0 = new Yue.ۥۡۧۤۤ
            r1 = 0
            r0.<init>(r3, r1, r2)
            r2.f5375 = r0
            Yue.ۥ۟ۨ۠ r3 = new Yue.ۥ۟ۨ۠
            r3.<init>()
            r2.f5376 = r3
            return
    }

    public C1719(java.io.Reader r2, boolean r3) {
            r1 = this;
            r1.<init>()
            Yue.ۥۡۧۤۤ r0 = new Yue.ۥۡۧۤۤ
            r0.<init>(r2, r3, r1)
            r1.f5375 = r0
            Yue.ۥ۟ۨ۠ r2 = new Yue.ۥ۟ۨ۠
            r2.<init>()
            r1.f5376 = r2
            return
    }

    public C1719(java.net.URL r8) throws java.io.IOException {
            r7 = this;
            r7.<init>()
            java.lang.String r0 = r8.getFile()
            java.net.URL r1 = new java.net.URL
            java.lang.String r2 = r8.getProtocol()
            java.lang.String r3 = r8.getHost()
            int r4 = r8.getPort()
            r5 = 47
            int r5 = r0.lastIndexOf(r5)
            int r5 = r5 + 1
            r6 = 0
            java.lang.String r0 = r0.substring(r6, r5)
            r1.<init>(r2, r3, r4, r0)
            r7.f5377 = r1
            Yue.ۥۡۧۤۤ r0 = new Yue.ۥۡۧۤۤ
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r8 = r8.openStream()
            r2.<init>(r8)
            r1.<init>(r2)
            r0.<init>(r1, r6, r7)
            r7.f5375 = r0
            Yue.ۥ۟ۨ۠ r8 = new Yue.ۥ۟ۨ۠
            r8.<init>()
            r7.f5376 = r8
            return
    }

    public C1719(java.net.URL r8, boolean r9) throws java.io.IOException {
            r7 = this;
            r7.<init>()
            java.lang.String r0 = r8.getFile()
            java.net.URL r1 = new java.net.URL
            java.lang.String r2 = r8.getProtocol()
            java.lang.String r3 = r8.getHost()
            int r4 = r8.getPort()
            r5 = 47
            int r5 = r0.lastIndexOf(r5)
            int r5 = r5 + 1
            r6 = 0
            java.lang.String r0 = r0.substring(r6, r5)
            r1.<init>(r2, r3, r4, r0)
            r7.f5377 = r1
            Yue.ۥۡۧۤۤ r0 = new Yue.ۥۡۧۤۤ
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r8 = r8.openStream()
            r2.<init>(r8)
            r1.<init>(r2)
            r0.<init>(r1, r9, r7)
            r7.f5375 = r0
            Yue.ۥ۟ۨ۠ r8 = new Yue.ۥ۟ۨ۠
            r8.<init>()
            r7.f5376 = r8
            return
    }

    @Override // Yue.InterfaceC2164
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C1707 mo8200(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۟ۨ۠ r0 = r1.f5376
            java.util.Hashtable r0 = r0.f5328
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥ۟ۨۡ r2 = (Yue.C1707) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6294 m8201(Yue.C6296 r7) throws java.io.IOException {
            r6 = this;
            Yue.ۥۡۧۤۤ r0 = r6.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20708()
            Yue.ۥۣۢۡۧ r1 = r0.f22393
            if (r1 == r7) goto L87
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = " instead of "
            java.lang.String r3 = "Expected "
            if (r1 != 0) goto L45
            Yue.ۥ۟ۨۢ r1 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r4 = r6.f5375
            java.lang.String r4 = r4.m20712()
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            r5.append(r3)
            java.lang.String r7 = r7.f22401
            r5.append(r7)
            r5.append(r2)
            Yue.ۥۣۢۡۧ r7 = r0.f22393
            java.lang.String r7 = r7.f22401
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            Yue.ۥۡۧۤۤ r0 = r6.f5375
            int r0 = r0.m20710()
            Yue.ۥۡۧۤۤ r2 = r6.f5375
            int r2 = r2.m20709()
            r1.<init>(r4, r7, r0, r2)
            throw r1
        L45:
            Yue.ۥ۟ۨۢ r1 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r4 = r6.f5375
            java.lang.String r4 = r4.m20712()
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            r5.append(r3)
            java.lang.String r7 = r7.f22401
            r5.append(r7)
            r5.append(r2)
            Yue.ۥۣۢۡۧ r7 = r0.f22393
            java.lang.String r7 = r7.f22401
            r5.append(r7)
            java.lang.String r7 = "("
            r5.append(r7)
            java.lang.String r7 = r0.f22394
            r5.append(r7)
            java.lang.String r7 = ")"
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            Yue.ۥۡۧۤۤ r0 = r6.f5375
            int r0 = r0.m20710()
            Yue.ۥۡۧۤۤ r2 = r6.f5375
            int r2 = r2.m20709()
            r1.<init>(r4, r7, r0, r2)
            throw r1
        L87:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C1696 m8202() throws java.io.IOException {
            r1 = this;
            r0 = 0
            Yue.ۥ۟ۨ۠ r0 = r1.m8203(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C1696 m8203(boolean r6) throws java.io.IOException {
            r5 = this;
        L0:
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20721()
            Yue.ۥۣۢۡۧ r0 = r0.f22393
            Yue.ۥۣۢۡۧ r1 = Yue.C5506.f20375
            if (r0 != r1) goto L87
            r0 = 0
            if (r6 == 0) goto L80
            java.util.Hashtable r6 = new java.util.Hashtable
            r6.<init>()
            Yue.ۥ۟ۨ۠ r1 = r5.f5376
            java.util.Hashtable r1 = r1.f5327
            java.util.Enumeration r1 = r1.elements()
        L1c:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.nextElement()
            Yue.ۥ۟ۨ۠ۧ r2 = (Yue.C1705) r2
            java.lang.String r3 = r2.f5353
            r6.put(r3, r2)
            goto L1c
        L2e:
            Yue.ۥ۟ۨ۠ r1 = r5.f5376
            java.util.Hashtable r1 = r1.f5327
            java.util.Enumeration r1 = r1.elements()
        L36:
            boolean r2 = r1.hasMoreElements()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r1.nextElement()
            Yue.ۥ۟ۨ۠ۧ r2 = (Yue.C1705) r2
            Yue.ۥ۟ۨۡۢ r2 = r2.f5355
            boolean r3 = r2 instanceof Yue.AbstractC1703
            if (r3 != 0) goto L49
            goto L36
        L49:
            Yue.ۥ۟ۨ۠ۥ r2 = (Yue.AbstractC1703) r2
            java.util.Vector r2 = r2.m8142()
            java.util.Enumeration r2 = r2.elements()
        L53:
            boolean r3 = r2.hasMoreElements()
            if (r3 == 0) goto L36
            Yue.ۥ۟ۨ۠ r3 = r5.f5376
            java.lang.Object r4 = r2.nextElement()
            Yue.ۥ۟ۨۡۢ r4 = (Yue.AbstractC1711) r4
            r5.m8219(r6, r3, r4)
            goto L53
        L65:
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L7b
            java.util.Enumeration r6 = r6.elements()
            Yue.ۥ۟ۨ۠ r0 = r5.f5376
            java.lang.Object r6 = r6.nextElement()
            Yue.ۥ۟ۨ۠ۧ r6 = (Yue.C1705) r6
            r0.f5332 = r6
            goto L84
        L7b:
            Yue.ۥ۟ۨ۠ r6 = r5.f5376
            r6.f5332 = r0
            goto L84
        L80:
            Yue.ۥ۟ۨ۠ r6 = r5.f5376
            r6.f5332 = r0
        L84:
            Yue.ۥ۟ۨ۠ r6 = r5.f5376
            return r6
        L87:
            r5.m8218()
            goto L0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m8204(Yue.C5506 r5, Yue.C1705 r6, Yue.C1698 r7) throws java.io.IOException {
            r4 = this;
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20361
            Yue.ۥۢۡۧۡ r1 = r4.m8201(r0)
            Yue.ۥ۟ۨ۠ۡ r2 = new Yue.ۥ۟ۨ۠ۡ
            java.lang.String r3 = r1.f22394
            r2.<init>(r3)
            java.util.Vector r7 = r7.f5334
            r7.addElement(r2)
            java.util.Hashtable r6 = r6.f5354
            java.lang.String r7 = r1.f22394
            r6.put(r7, r2)
            Yue.ۥۢۡۧۡ r6 = r5.m20708()
            Yue.ۥۣۢۡۧ r7 = r6.f22393
            if (r7 != r0) goto L37
            java.lang.String r7 = r6.f22394
            java.lang.String r1 = "NOTATION"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L32
            Yue.ۥ۟ۨۡۦ r6 = r4.m8217()
            r2.f5336 = r6
            goto L41
        L32:
            java.lang.String r6 = r6.f22394
            r2.f5336 = r6
            goto L41
        L37:
            Yue.ۥۣۢۡۧ r6 = Yue.C5506.f20363
            if (r7 != r6) goto L41
            Yue.ۥ۟ۨۡ۟ r6 = r4.m8214()
            r2.f5336 = r6
        L41:
            Yue.ۥۢۡۧۡ r6 = r5.m20721()
            Yue.ۥۣۢۡۧ r7 = r6.f22393
            if (r7 != r0) goto La6
            r5.m20708()
            java.lang.String r7 = r6.f22394
            java.lang.String r0 = "#FIXED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L63
            Yue.ۥ۟ۨ۠ۦ r6 = Yue.C1704.f5347
            r2.f5337 = r6
            Yue.ۥۢۡۧۡ r5 = r5.m20708()
            java.lang.String r5 = r5.f22394
            r2.f5338 = r5
            goto Lb5
        L63:
            java.lang.String r7 = r6.f22394
            java.lang.String r0 = "#REQUIRED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L72
            Yue.ۥ۟ۨ۠ۦ r5 = Yue.C1704.f5348
            r2.f5337 = r5
            goto Lb5
        L72:
            java.lang.String r7 = r6.f22394
            java.lang.String r0 = "#IMPLIED"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L81
            Yue.ۥ۟ۨ۠ۦ r5 = Yue.C1704.f5349
            r2.f5337 = r5
            goto Lb5
        L81:
            Yue.ۥ۟ۨۢ r7 = new Yue.ۥ۟ۨۢ
            java.lang.String r0 = r5.m20712()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Invalid token in attribute declaration: "
            r1.append(r2)
            java.lang.String r6 = r6.f22394
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            int r1 = r5.m20710()
            int r5 = r5.m20709()
            r7.<init>(r0, r6, r1, r5)
            throw r7
        La6:
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20366
            if (r7 != r0) goto Lb5
            r5.m20708()
            Yue.ۥ۟ۨ۠ۦ r5 = Yue.C1704.f5350
            r2.f5337 = r5
            java.lang.String r5 = r6.f22394
            r2.f5338 = r5
        Lb5:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m8205() throws java.io.IOException {
            r4 = this;
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20361
            Yue.ۥۢۡۧۡ r0 = r4.m8201(r0)
            Yue.ۥ۟ۨ۠ r1 = r4.f5376
            java.util.Hashtable r1 = r1.f5327
            java.lang.String r2 = r0.f22394
            java.lang.Object r1 = r1.get(r2)
            Yue.ۥ۟ۨ۠ۧ r1 = (Yue.C1705) r1
            Yue.ۥ۟ۨ۠۠ r2 = new Yue.ۥ۟ۨ۠۠
            java.lang.String r3 = r0.f22394
            r2.<init>(r3)
            Yue.ۥ۟ۨ۠ r3 = r4.f5376
            java.util.Vector r3 = r3.f5331
            r3.addElement(r2)
            if (r1 != 0) goto L32
            Yue.ۥ۟ۨ۠ۧ r1 = new Yue.ۥ۟ۨ۠ۧ
            java.lang.String r3 = r0.f22394
            r1.<init>(r3)
            Yue.ۥ۟ۨ۠ r3 = r4.f5376
            java.util.Hashtable r3 = r3.f5327
            java.lang.String r0 = r0.f22394
            r3.put(r0, r1)
        L32:
            Yue.ۥۡۧۤۤ r0 = r4.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20721()
        L38:
            Yue.ۥۣۢۡۧ r0 = r0.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20369
            if (r0 == r3) goto L4a
            Yue.ۥۡۧۤۤ r0 = r4.f5375
            r4.m8204(r0, r1, r2)
            Yue.ۥۡۧۤۤ r0 = r4.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20721()
            goto L38
        L4a:
            r4.m8201(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.AbstractC1711 m8206() throws java.io.IOException {
            r5 = this;
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20708()
            Yue.ۥۣۢۡۧ r1 = r0.f22393
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20361
            if (r1 != r2) goto L14
            Yue.ۥ۟ۨۡۤ r1 = new Yue.ۥ۟ۨۡۤ
            java.lang.String r0 = r0.f22394
            r1.<init>(r0)
            goto L1c
        L14:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20363
            if (r1 != r2) goto L23
            Yue.ۥ۟ۨ۠ۥ r1 = r5.m8209()
        L1c:
            Yue.ۥ۟ۨ۠ۢ r0 = r5.m8207()
            r1.f5367 = r0
            return r1
        L23:
            Yue.ۥ۟ۨۢ r1 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "Found invalid token in sequence: "
            r3.append(r4)
            Yue.ۥۣۢۡۧ r0 = r0.f22393
            java.lang.String r0 = r0.f22401
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r1.<init>(r2, r0, r3, r4)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C1700 m8207() throws java.io.IOException {
            r2 = this;
            Yue.ۥۡۧۤۤ r0 = r2.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20721()
            Yue.ۥۣۢۡۧ r0 = r0.f22393
            Yue.ۥۣۢۡۧ r1 = Yue.C5506.f20371
            if (r0 != r1) goto L14
            Yue.ۥۡۧۤۤ r0 = r2.f5375
            r0.m20708()
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5340
            return r0
        L14:
            Yue.ۥۣۢۡۧ r1 = Yue.C5506.f20373
            if (r0 != r1) goto L20
            Yue.ۥۡۧۤۤ r0 = r2.f5375
            r0.m20708()
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5341
            return r0
        L20:
            Yue.ۥۣۢۡۧ r1 = Yue.C5506.f20372
            if (r0 != r1) goto L2c
            Yue.ۥۡۧۤۤ r0 = r2.f5375
            r0.m20708()
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5342
            return r0
        L2c:
            Yue.ۥ۟ۨ۠ۢ r0 = Yue.C1700.f5339
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m8208(Yue.C1705 r4) throws java.io.IOException {
            r3 = this;
            Yue.ۥ۟ۨ۠ۥ r0 = r3.m8209()
            Yue.ۥۡۧۤۤ r1 = r3.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20721()
            Yue.ۥ۟ۨ۠ۢ r2 = r3.m8207()
            r0.f5367 = r2
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20371
            if (r1 != r2) goto L1b
            Yue.ۥ۟ۨ۠ۢ r1 = Yue.C1700.f5340
            r0.f5367 = r1
            goto L31
        L1b:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20373
            if (r1 != r2) goto L24
            Yue.ۥ۟ۨ۠ۢ r1 = Yue.C1700.f5341
            r0.f5367 = r1
            goto L31
        L24:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20372
            if (r1 != r2) goto L2d
            Yue.ۥ۟ۨ۠ۢ r1 = Yue.C1700.f5342
            r0.f5367 = r1
            goto L31
        L2d:
            Yue.ۥ۟ۨ۠ۢ r1 = Yue.C1700.f5339
            r0.f5367 = r1
        L31:
            r4.f5355 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.AbstractC1703 m8209() throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            Yue.ۥ۟ۨۡۢ r2 = r7.m8206()
            Yue.ۥۡۧۤۤ r3 = r7.f5375
            Yue.ۥۢۡۧۡ r3 = r3.m20708()
            Yue.ۥۣۢۡۧ r4 = r3.f22393
            Yue.ۥۣۢۡۧ r5 = Yue.C5506.f20370
            if (r4 == r5) goto L53
            Yue.ۥۣۢۡۧ r6 = Yue.C5506.f20365
            if (r4 != r6) goto L17
            goto L53
        L17:
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20364
            if (r4 != r0) goto L26
            if (r1 != 0) goto L22
            Yue.ۥ۟ۨۢۢ r1 = new Yue.ۥ۟ۨۢۢ
            r1.<init>()
        L22:
            r1.m8138(r2)
            return r1
        L26:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r1 = r7.f5375
            java.lang.String r1 = r1.m20712()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r4 = "Found invalid token in sequence: "
            r2.append(r4)
            Yue.ۥۣۢۡۧ r3 = r3.f22393
            java.lang.String r3 = r3.f22401
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            Yue.ۥۡۧۤۤ r3 = r7.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r7.f5375
            int r4 = r4.m20709()
            r0.<init>(r1, r2, r3, r4)
            throw r0
        L53:
            if (r0 == 0) goto L72
            if (r0 != r4) goto L58
            goto L72
        L58:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r1 = r7.f5375
            java.lang.String r1 = r1.m20712()
            Yue.ۥۡۧۤۤ r2 = r7.f5375
            int r2 = r2.m20710()
            Yue.ۥۡۧۤۤ r3 = r7.f5375
            int r3 = r3.m20709()
            java.lang.String r4 = "Can't mix separators in a choice/sequence"
            r0.<init>(r1, r4, r2, r3)
            throw r0
        L72:
            if (r1 != 0) goto L83
            if (r4 != r5) goto L7d
            Yue.ۥۣ۟ۨ۠ r0 = new Yue.ۥۣ۟ۨ۠
            r0.<init>()
        L7b:
            r1 = r0
            goto L83
        L7d:
            Yue.ۥ۟ۨۢۢ r0 = new Yue.ۥ۟ۨۢۢ
            r0.<init>()
            goto L7b
        L83:
            r1.m8138(r2)
            r0 = r4
            goto L2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m8210(Yue.C5506 r5, Yue.C1705 r6) throws java.io.IOException {
            r4 = this;
            Yue.ۥۢۡۧۡ r0 = r5.m20708()
            Yue.ۥۣۢۡۧ r1 = r0.f22393
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20361
            if (r1 != r2) goto L53
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = "EMPTY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1c
            Yue.ۥ۟ۨ۠ۨ r5 = new Yue.ۥ۟ۨ۠ۨ
            r5.<init>()
            r6.f5355 = r5
            goto L76
        L1c:
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = "ANY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2e
            Yue.ۥ۟ۨ۠۟ r5 = new Yue.ۥ۟ۨ۠۟
            r5.<init>()
            r6.f5355 = r5
            goto L76
        L2e:
            Yue.ۥ۟ۨۢ r6 = new Yue.ۥ۟ۨۢ
            java.lang.String r1 = r5.m20712()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "Invalid token in entity content spec "
            r2.append(r3)
            java.lang.String r0 = r0.f22394
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r2 = r5.m20710()
            int r5 = r5.m20709()
            r6.<init>(r1, r0, r2, r5)
            throw r6
        L53:
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20363
            if (r1 != r0) goto L76
            Yue.ۥۢۡۧۡ r5 = r5.m20721()
            Yue.ۥۣۢۡۧ r1 = r5.f22393
            if (r1 != r2) goto L71
            java.lang.String r5 = r5.f22394
            java.lang.String r0 = "#PCDATA"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L6d
            r4.m8215(r6)
            goto L76
        L6d:
            r4.m8208(r6)
            goto L76
        L71:
            if (r1 != r0) goto L76
            r4.m8208(r6)
        L76:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m8211() throws java.io.IOException {
            r5 = this;
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20361
            Yue.ۥۢۡۧۡ r0 = r5.m8201(r0)
            Yue.ۥ۟ۨ۠ r1 = r5.f5376
            java.util.Hashtable r1 = r1.f5327
            java.lang.String r2 = r0.f22394
            java.lang.Object r1 = r1.get(r2)
            Yue.ۥ۟ۨ۠ۧ r1 = (Yue.C1705) r1
            if (r1 != 0) goto L25
            Yue.ۥ۟ۨ۠ۧ r1 = new Yue.ۥ۟ۨ۠ۧ
            java.lang.String r0 = r0.f22394
            r1.<init>(r0)
            Yue.ۥ۟ۨ۠ r0 = r5.f5376
            java.util.Hashtable r0 = r0.f5327
            java.lang.String r2 = r1.f5353
            r0.put(r2, r1)
            goto L29
        L25:
            Yue.ۥ۟ۨۡۢ r2 = r1.f5355
            if (r2 != 0) goto L3b
        L29:
            Yue.ۥ۟ۨ۠ r0 = r5.f5376
            java.util.Vector r0 = r0.f5331
            r0.addElement(r1)
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            r5.m8210(r0, r1)
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20369
            r5.m8201(r0)
            return
        L3b:
            Yue.ۥ۟ۨۢ r1 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "Found second definition of element: "
            r3.append(r4)
            java.lang.String r0 = r0.f22394
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r1.<init>(r2, r0, r3, r4)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m8212() throws java.io.IOException {
            r6 = this;
            Yue.ۥۡۧۤۤ r0 = r6.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20708()
            Yue.ۥۣۢۡۧ r1 = r0.f22393
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20377
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L16
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20361
            Yue.ۥۢۡۧۡ r0 = r6.m8201(r0)
            r1 = r3
            goto L1b
        L16:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20361
            if (r1 != r2) goto L64
            r1 = r4
        L1b:
            Yue.ۥ۟ۨ۠ r2 = r6.f5376
            java.util.Hashtable r2 = r2.f5328
            java.lang.String r5 = r0.f22394
            java.lang.Object r2 = r2.get(r5)
            Yue.ۥ۟ۨۡ r2 = (Yue.C1707) r2
            if (r2 != 0) goto L3d
            Yue.ۥ۟ۨۡ r2 = new Yue.ۥ۟ۨۡ
            java.lang.String r0 = r0.f22394
            java.lang.Object r3 = r6.f5377
            r2.<init>(r0, r3)
            Yue.ۥ۟ۨ۠ r0 = r6.f5376
            java.util.Hashtable r0 = r0.f5328
            java.lang.String r3 = r2.f5356
            r0.put(r3, r2)
            r3 = r4
            goto L46
        L3d:
            Yue.ۥ۟ۨۡ r2 = new Yue.ۥ۟ۨۡ
            java.lang.String r0 = r0.f22394
            java.lang.Object r4 = r6.f5377
            r2.<init>(r0, r4)
        L46:
            Yue.ۥ۟ۨ۠ r0 = r6.f5376
            java.util.Vector r0 = r0.f5331
            r0.addElement(r2)
            r2.f5357 = r1
            r6.m8213(r2)
            boolean r0 = r2.f5357
            if (r0 == 0) goto L63
            java.lang.String r0 = r2.f5358
            if (r0 == 0) goto L63
            if (r3 != 0) goto L63
            Yue.ۥۡۧۤۤ r1 = r6.f5375
            java.lang.String r2 = r2.f5356
            r1.m20705(r2, r0)
        L63:
            return
        L64:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r1 = r6.f5375
            java.lang.String r1 = r1.m20712()
            Yue.ۥۡۧۤۤ r2 = r6.f5375
            int r2 = r2.m20710()
            Yue.ۥۡۧۤۤ r3 = r6.f5375
            int r3 = r3.m20709()
            java.lang.String r4 = "Invalid entity declaration"
            r0.<init>(r1, r4, r2, r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m8213(Yue.C1707 r6) throws java.io.IOException {
            r5 = this;
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20708()
            Yue.ۥۣۢۡۧ r1 = r0.f22393
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20366
            if (r1 != r2) goto L16
            java.lang.String r1 = r6.f5358
            if (r1 != 0) goto L95
            java.lang.String r0 = r0.f22394
            r6.f5358 = r0
            goto L95
        L16:
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20361
            if (r1 != r3) goto Lb5
            java.lang.String r1 = r0.f22394
            java.lang.String r4 = "SYSTEM"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L34
            Yue.ۥۣ۟ۨۢ r0 = new Yue.ۥۣ۟ۨۢ
            r0.<init>()
            Yue.ۥۢۡۧۡ r1 = r5.m8201(r2)
            java.lang.String r1 = r1.f22394
            r0.f5366 = r1
            r6.f5359 = r0
            goto L55
        L34:
            java.lang.String r0 = r0.f22394
            java.lang.String r1 = "PUBLIC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9b
            Yue.ۥ۟ۨۢۡ r0 = new Yue.ۥ۟ۨۢۡ
            r0.<init>()
            Yue.ۥۢۡۧۡ r1 = r5.m8201(r2)
            java.lang.String r1 = r1.f22394
            r0.f5379 = r1
            Yue.ۥۢۡۧۡ r1 = r5.m8201(r2)
            java.lang.String r1 = r1.f22394
            r0.f5366 = r1
            r6.f5359 = r0
        L55:
            boolean r0 = r6.f5357
            if (r0 != 0) goto L95
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20721()
            Yue.ۥۣۢۡۧ r1 = r0.f22393
            if (r1 != r3) goto L95
            java.lang.String r0 = r0.f22394
            java.lang.String r1 = "NDATA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7b
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            r0.m20708()
            Yue.ۥۢۡۧۡ r0 = r5.m8201(r3)
            java.lang.String r0 = r0.f22394
            r6.f5360 = r0
            goto L95
        L7b:
            Yue.ۥ۟ۨۢ r6 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            java.lang.String r0 = r0.m20712()
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            int r1 = r1.m20710()
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            int r2 = r2.m20709()
            java.lang.String r3 = "Invalid NData declaration"
            r6.<init>(r0, r3, r1, r2)
            throw r6
        L95:
            Yue.ۥۣۢۡۧ r6 = Yue.C5506.f20369
            r5.m8201(r6)
            return
        L9b:
            Yue.ۥ۟ۨۢ r6 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            java.lang.String r0 = r0.m20712()
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            int r1 = r1.m20710()
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            int r2 = r2.m20709()
            java.lang.String r3 = "Invalid External ID specification"
            r6.<init>(r0, r3, r1, r2)
            throw r6
        Lb5:
            Yue.ۥ۟ۨۢ r6 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            java.lang.String r0 = r0.m20712()
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            int r1 = r1.m20710()
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            int r2 = r2.m20709()
            java.lang.String r3 = "Invalid entity definition"
            r6.<init>(r0, r3, r1, r2)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Yue.C1708 m8214() throws java.io.IOException {
            r5 = this;
            Yue.ۥ۟ۨۡ۟ r0 = new Yue.ۥ۟ۨۡ۟
            r0.<init>()
        L5:
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20708()
            Yue.ۥۣۢۡۧ r2 = r1.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20361
            java.lang.String r4 = "Invalid token in enumeration: "
            if (r2 == r3) goto L43
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20380
            if (r2 != r3) goto L18
            goto L43
        L18:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r4)
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            java.lang.String r1 = r1.f22401
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r0.<init>(r2, r1, r3, r4)
            throw r0
        L43:
            java.lang.String r1 = r1.f22394
            r0.m8165(r1)
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20721()
            Yue.ۥۣۢۡۧ r2 = r1.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20364
            if (r2 != r3) goto L5a
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            r1.m20708()
            return r0
        L5a:
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20370
            if (r2 != r3) goto L64
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            r1.m20708()
            goto L5
        L64:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r4)
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            java.lang.String r1 = r1.f22401
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r0.<init>(r2, r1, r3, r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m8215(Yue.C1705 r5) throws java.io.IOException {
            r4 = this;
            Yue.ۥۣ۟ۨۡ r0 = new Yue.ۥۣ۟ۨۡ
            r0.<init>()
            Yue.ۥ۟ۨۡۨ r1 = new Yue.ۥ۟ۨۡۨ
            r1.<init>()
            r0.m8138(r1)
            Yue.ۥۡۧۤۤ r1 = r4.f5375
            r1.m20708()
            r5.f5355 = r0
            r5 = 1
        L15:
            Yue.ۥۡۧۤۤ r1 = r4.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20708()
            Yue.ۥۣۢۡۧ r2 = r1.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20364
            if (r2 != r3) goto L6b
            Yue.ۥۡۧۤۤ r1 = r4.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20721()
            Yue.ۥۣۢۡۧ r2 = r1.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20373
            if (r2 != r3) goto L37
            Yue.ۥۡۧۤۤ r5 = r4.f5375
            r5.m20708()
            Yue.ۥ۟ۨ۠ۢ r5 = Yue.C1700.f5341
            r0.f5367 = r5
            goto L3d
        L37:
            if (r5 == 0) goto L3e
            Yue.ۥ۟ۨ۠ۢ r5 = Yue.C1700.f5339
            r0.f5367 = r5
        L3d:
            return
        L3e:
            Yue.ۥ۟ۨۢ r5 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r0 = r4.f5375
            java.lang.String r0 = r0.m20712()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "Invalid token in Mixed content type, '*' required after (#PCDATA|xx ...): "
            r2.append(r3)
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            java.lang.String r1 = r1.f22401
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            Yue.ۥۡۧۤۤ r2 = r4.f5375
            int r2 = r2.m20710()
            Yue.ۥۡۧۤۤ r3 = r4.f5375
            int r3 = r3.m20709()
            r5.<init>(r0, r1, r2, r3)
            throw r5
        L6b:
            Yue.ۥۣۢۡۧ r5 = Yue.C5506.f20370
            if (r2 != r5) goto L81
            Yue.ۥۡۧۤۤ r5 = r4.f5375
            Yue.ۥۢۡۧۡ r5 = r5.m20708()
            Yue.ۥ۟ۨۡۤ r1 = new Yue.ۥ۟ۨۡۤ
            java.lang.String r5 = r5.f22394
            r1.<init>(r5)
            r0.m8138(r1)
            r5 = 0
            goto L15
        L81:
            Yue.ۥ۟ۨۢ r5 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r0 = r4.f5375
            java.lang.String r0 = r0.m20712()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "Invalid token in Mixed content type: "
            r2.append(r3)
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            java.lang.String r1 = r1.f22401
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            Yue.ۥۡۧۤۤ r2 = r4.f5375
            int r2 = r2.m20710()
            Yue.ۥۡۧۤۤ r3 = r4.f5375
            int r3 = r3.m20709()
            r5.<init>(r0, r1, r2, r3)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m8216() throws java.io.IOException {
            r4 = this;
            Yue.ۥ۟ۨۡۥ r0 = new Yue.ۥ۟ۨۡۥ
            r0.<init>()
            Yue.ۥۣۢۡۧ r1 = Yue.C5506.f20361
            Yue.ۥۢۡۧۡ r2 = r4.m8201(r1)
            java.lang.String r2 = r2.f22394
            r0.f5369 = r2
            Yue.ۥ۟ۨ۠ r3 = r4.f5376
            java.util.Hashtable r3 = r3.f5329
            r3.put(r2, r0)
            Yue.ۥ۟ۨ۠ r2 = r4.f5376
            java.util.Vector r2 = r2.f5331
            r2.addElement(r0)
            Yue.ۥۢۡۧۡ r1 = r4.m8201(r1)
            java.lang.String r2 = r1.f22394
            java.lang.String r3 = "SYSTEM"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3d
            Yue.ۥۣ۟ۨۢ r1 = new Yue.ۥۣ۟ۨۢ
            r1.<init>()
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20366
            Yue.ۥۢۡۧۡ r2 = r4.m8201(r2)
            java.lang.String r2 = r2.f22394
            r1.f5366 = r2
            r0.f5370 = r1
            goto L6f
        L3d:
            java.lang.String r1 = r1.f22394
            java.lang.String r2 = "PUBLIC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6f
            Yue.ۥ۟ۨۢۡ r1 = new Yue.ۥ۟ۨۢۡ
            r1.<init>()
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20366
            Yue.ۥۢۡۧۡ r3 = r4.m8201(r2)
            java.lang.String r3 = r3.f22394
            r1.f5379 = r3
            r3 = 0
            r1.f5366 = r3
            Yue.ۥۡۧۤۤ r3 = r4.f5375
            Yue.ۥۢۡۧۡ r3 = r3.m20721()
            Yue.ۥۣۢۡۧ r3 = r3.f22393
            if (r3 != r2) goto L6d
            Yue.ۥۡۧۤۤ r2 = r4.f5375
            Yue.ۥۢۡۧۡ r2 = r2.m20708()
            java.lang.String r2 = r2.f22394
            r1.f5366 = r2
        L6d:
            r0.f5370 = r1
        L6f:
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20369
            r4.m8201(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Yue.C1715 m8217() throws java.io.IOException {
            r5 = this;
            Yue.ۥ۟ۨۡۦ r0 = new Yue.ۥ۟ۨۡۦ
            r0.<init>()
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20708()
            Yue.ۥۣۢۡۧ r2 = r1.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20363
            java.lang.String r4 = "Invalid token in notation: "
            if (r2 != r3) goto L96
        L13:
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20708()
            Yue.ۥۣۢۡۧ r2 = r1.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20361
            if (r2 != r3) goto L6b
            java.lang.String r1 = r1.f22394
            r0.m8189(r1)
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            Yue.ۥۢۡۧۡ r1 = r1.m20721()
            Yue.ۥۣۢۡۧ r2 = r1.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20364
            if (r2 != r3) goto L36
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            r1.m20708()
            return r0
        L36:
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20370
            if (r2 != r3) goto L40
            Yue.ۥۡۧۤۤ r1 = r5.f5375
            r1.m20708()
            goto L13
        L40:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r4)
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            java.lang.String r1 = r1.f22401
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r0.<init>(r2, r1, r3, r4)
            throw r0
        L6b:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r4)
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            java.lang.String r1 = r1.f22401
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r0.<init>(r2, r1, r3, r4)
            throw r0
        L96:
            Yue.ۥ۟ۨۢ r0 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r4)
            Yue.ۥۣۢۡۧ r1 = r1.f22393
            java.lang.String r1 = r1.f22401
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r0.<init>(r2, r1, r3, r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m8218() throws java.io.IOException {
            r5 = this;
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20708()
            Yue.ۥۣۢۡۧ r1 = r0.f22393
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20360
            if (r1 != r2) goto L42
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L11:
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            r1 = 63
            java.lang.String r0 = r0.m20711(r1)
            r2.append(r0)
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20721()
            Yue.ۥۣۢۡۧ r0 = r0.f22393
            Yue.ۥۣۢۡۧ r3 = Yue.C5506.f20369
            if (r0 != r3) goto L3e
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            r0.m20708()
            Yue.ۥ۟ۨۢ۠ r0 = new Yue.ۥ۟ۨۢ۠
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            Yue.ۥ۟ۨ۠ r1 = r5.f5376
            java.util.Vector r1 = r1.f5331
            r1.addElement(r0)
            return
        L3e:
            r2.append(r1)
            goto L11
        L42:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20378
            if (r1 != r2) goto L9b
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20361
            Yue.ۥۢۡۧۡ r0 = r5.m8201(r0)
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = "IGNORE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            r0.m20726()
            goto Lfa
        L5d:
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = "INCLUDE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L70
            Yue.ۥۡۧۤۤ r0 = r5.f5375
            r1 = 91
            r0.m20727(r1)
            goto Lfa
        L70:
            Yue.ۥ۟ۨۢ r1 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "Invalid token in conditional: "
            r3.append(r4)
            java.lang.String r0 = r0.f22394
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r1.<init>(r2, r0, r3, r4)
            throw r1
        L9b:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20379
            if (r1 != r2) goto La0
            goto Lfa
        La0:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20376
            if (r1 != r2) goto Lb3
            Yue.ۥ۟ۨ۠ r1 = r5.f5376
            java.util.Vector r1 = r1.f5331
            Yue.ۥ۟ۨ۠ۤ r2 = new Yue.ۥ۟ۨ۠ۤ
            java.lang.String r0 = r0.f22394
            r2.<init>(r0)
            r1.addElement(r2)
            goto Lfa
        Lb3:
            Yue.ۥۣۢۡۧ r2 = Yue.C5506.f20368
            if (r1 != r2) goto Lfb
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20361
            Yue.ۥۢۡۧۡ r0 = r5.m8201(r0)
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = "ELEMENT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lcb
            r5.m8211()
            goto Lfa
        Lcb:
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = "ATTLIST"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Ld9
            r5.m8205()
            goto Lfa
        Ld9:
            java.lang.String r1 = r0.f22394
            java.lang.String r2 = "ENTITY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le7
            r5.m8212()
            goto Lfa
        Le7:
            java.lang.String r0 = r0.f22394
            java.lang.String r1 = "NOTATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf5
            r5.m8216()
            goto Lfa
        Lf5:
            Yue.ۥۣۢۡۧ r0 = Yue.C5506.f20369
            r5.m8220(r0)
        Lfa:
            return
        Lfb:
            Yue.ۥ۟ۨۢ r1 = new Yue.ۥ۟ۨۢ
            Yue.ۥۡۧۤۤ r2 = r5.f5375
            java.lang.String r2 = r2.m20712()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "Unexpected token: "
            r3.append(r4)
            Yue.ۥۣۢۡۧ r4 = r0.f22393
            java.lang.String r4 = r4.f22401
            r3.append(r4)
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.String r0 = r0.f22394
            r3.append(r0)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            Yue.ۥۡۧۤۤ r3 = r5.f5375
            int r3 = r3.m20710()
            Yue.ۥۡۧۤۤ r4 = r5.f5375
            int r4 = r4.m20709()
            r1.<init>(r2, r0, r3, r4)
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m8219(java.util.Hashtable r2, Yue.C1696 r3, Yue.AbstractC1711 r4) {
            r1 = this;
            boolean r0 = r4 instanceof Yue.C1713
            if (r0 == 0) goto Lc
            Yue.ۥ۟ۨۡۤ r4 = (Yue.C1713) r4
            java.lang.String r3 = r4.f5368
            r2.remove(r3)
            goto L2a
        Lc:
            boolean r0 = r4 instanceof Yue.AbstractC1703
            if (r0 == 0) goto L2a
            Yue.ۥ۟ۨ۠ۥ r4 = (Yue.AbstractC1703) r4
            java.util.Vector r4 = r4.m8142()
            java.util.Enumeration r4 = r4.elements()
        L1a:
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.nextElement()
            Yue.ۥ۟ۨۡۢ r0 = (Yue.AbstractC1711) r0
            r1.m8219(r2, r3, r0)
            goto L1a
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m8220(Yue.C6296 r2) throws java.io.IOException {
            r1 = this;
            Yue.ۥۡۧۤۤ r0 = r1.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20708()
        L6:
            Yue.ۥۣۢۡۧ r0 = r0.f22393
            if (r0 == r2) goto L11
            Yue.ۥۡۧۤۤ r0 = r1.f5375
            Yue.ۥۢۡۧۡ r0 = r0.m20708()
            goto L6
        L11:
            return
    }
}
