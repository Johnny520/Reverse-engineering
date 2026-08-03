package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1707 implements Yue.InterfaceC1716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f5356;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f5357;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String f5358;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.AbstractC1710 f5359;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String f5360;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Object f5361;

    public C1707() {
            r0 = this;
            r0.<init>()
            return
    }

    public C1707(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5356 = r1
            return
    }

    public C1707(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f5356 = r1
            r0.f5361 = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C1707
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۟ۨۡ r5 = (Yue.C1707) r5
            java.lang.String r1 = r4.f5356
            if (r1 != 0) goto L15
            java.lang.String r1 = r5.f5356
            if (r1 == 0) goto L1e
            return r2
        L15:
            java.lang.String r3 = r5.f5356
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f5357
            boolean r3 = r5.f5357
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r4.f5358
            if (r1 != 0) goto L2e
            java.lang.String r1 = r5.f5358
            if (r1 == 0) goto L37
            return r2
        L2e:
            java.lang.String r3 = r5.f5358
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L37
            return r2
        L37:
            Yue.ۥ۟ۨۡۡ r1 = r4.f5359
            if (r1 != 0) goto L40
            Yue.ۥ۟ۨۡۡ r1 = r5.f5359
            if (r1 == 0) goto L49
            return r2
        L40:
            Yue.ۥ۟ۨۡۡ r3 = r5.f5359
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L49
            return r2
        L49:
            java.lang.String r1 = r4.f5360
            if (r1 != 0) goto L52
            java.lang.String r5 = r5.f5360
            if (r5 == 0) goto L5b
            return r2
        L52:
            java.lang.String r5 = r5.f5360
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L5b
            return r2
        L5b:
            return r0
    }

    @Override // Yue.InterfaceC1716
    /* JADX INFO: renamed from: ۥ */
    public void mo8116(java.io.PrintWriter r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "<!ENTITY "
            r3.print(r0)
            boolean r0 = r2.f5357
            if (r0 == 0) goto Le
            java.lang.String r0 = " % "
            r3.print(r0)
        Le:
            java.lang.String r0 = r2.f5356
            r3.print(r0)
            java.lang.String r0 = r2.f5358
            if (r0 == 0) goto L2d
            r1 = 34
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L21
            r1 = 39
        L21:
            r3.print(r1)
            java.lang.String r0 = r2.f5358
            r3.print(r0)
            r3.print(r1)
            goto L40
        L2d:
            Yue.ۥ۟ۨۡۡ r0 = r2.f5359
            r0.mo8116(r3)
            java.lang.String r0 = r2.f5360
            if (r0 == 0) goto L40
            java.lang.String r0 = " NDATA "
            r3.print(r0)
            java.lang.String r0 = r2.f5360
            r3.print(r0)
        L40:
            java.lang.String r0 = ">"
            r3.println(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.AbstractC1710 m8152() {
            r1 = this;
            Yue.ۥ۟ۨۡۡ r0 = r1.f5359
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m8153() {
            r1 = this;
            Yue.ۥ۟ۨۡۡ r0 = r1.f5359
            java.lang.String r0 = r0.f5366
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m8154() {
            r1 = this;
            java.lang.String r0 = r1.f5356
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String m8155() {
            r1 = this;
            java.lang.String r0 = r1.f5360
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.io.Reader m8156() throws java.io.IOException {
            r1 = this;
            Yue.ۥ۟ۨۡۡ r0 = r1.f5359
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.f5366
            java.io.Reader r0 = r1.m8157(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.io.Reader m8157(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f5361     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L36
            boolean r1 = r0 instanceof java.io.File     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L1a
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L41
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L41
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Exception -> L41
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L41
            r3.<init>(r0, r5)     // Catch: java.lang.Exception -> L41
            r2.<init>(r3)     // Catch: java.lang.Exception -> L41
            r1.<init>(r2)     // Catch: java.lang.Exception -> L41
            return r1
        L1a:
            boolean r0 = r0 instanceof java.net.URL     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L36
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L41
            java.lang.Object r1 = r4.f5361     // Catch: java.lang.Exception -> L41
            java.net.URL r1 = (java.net.URL) r1     // Catch: java.lang.Exception -> L41
            r0.<init>(r1, r5)     // Catch: java.lang.Exception -> L41
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L41
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L41
            java.io.InputStream r0 = r0.openStream()     // Catch: java.lang.Exception -> L41
            r2.<init>(r0)     // Catch: java.lang.Exception -> L41
            r1.<init>(r2)     // Catch: java.lang.Exception -> L41
            return r1
        L36:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L41
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Exception -> L41
            r1.<init>(r5)     // Catch: java.lang.Exception -> L41
            r0.<init>(r1)     // Catch: java.lang.Exception -> L41
            return r0
        L41:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L55
            r0.<init>(r5)     // Catch: java.lang.Exception -> L55
            java.io.InputStream r5 = r0.openStream()     // Catch: java.lang.Exception -> L55
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L55
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L55
            r1.<init>(r5)     // Catch: java.lang.Exception -> L55
            r0.<init>(r1)     // Catch: java.lang.Exception -> L55
            return r0
        L55:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String m8158() {
            r1 = this;
            java.lang.String r0 = r1.f5358
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m8159() {
            r1 = this;
            boolean r0 = r1.f5357
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m8160(Yue.AbstractC1710 r1) {
            r0 = this;
            r0.f5359 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m8161(boolean r1) {
            r0 = this;
            r0.f5357 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m8162(java.lang.String r1) {
            r0 = this;
            r0.f5356 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m8163(java.lang.String r1) {
            r0 = this;
            r0.f5360 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m8164(java.lang.String r1) {
            r0 = this;
            r0.f5358 = r1
            return
    }
}
