package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7159 implements Yue.InterfaceC7160 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.C2251 f24726;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C2250 f24727;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Yue.C4367 f24728;

    public C7159() {
            r1 = this;
            r1.<init>()
            Yue.ۥۡۢ۠ۦ r0 = new Yue.ۥۡۢ۠ۦ
            r0.<init>()
            r1.f24728 = r0
            return
    }

    public C7159(java.io.InputStream r4) {
            r3 = this;
            r3.<init>()
            Yue.ۥۡۢ۠ۦ r0 = new Yue.ۥۡۢ۠ۦ
            r0.<init>()
            r3.f24728 = r0
            Yue.ۥ۠ۡۢ r0 = new Yue.ۥ۠ۡۢ     // Catch: java.lang.Exception -> L31
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L31
            r1.<init>(r4)     // Catch: java.lang.Exception -> L31
            r0.<init>(r1)     // Catch: java.lang.Exception -> L31
            r3.f24727 = r0     // Catch: java.lang.Exception -> L31
            r3.next()     // Catch: java.lang.Exception -> L31
            int r0 = r3.mo15450()     // Catch: java.lang.Exception -> L31
            r1 = 7
            if (r0 != r1) goto L33
            java.lang.String r0 = r3.mo15444()     // Catch: java.lang.Exception -> L31
            Yue.ۥ۠ۡۢ r1 = new Yue.ۥ۠ۡۢ     // Catch: java.lang.Exception -> L31
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L31
            r2.<init>(r4, r0)     // Catch: java.lang.Exception -> L31
            r1.<init>(r2)     // Catch: java.lang.Exception -> L31
            r3.f24727 = r1     // Catch: java.lang.Exception -> L31
            goto L33
        L31:
            r4 = move-exception
            goto L34
        L33:
            return
        L34:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Unable to instantiate the XMLStreamPlayer"
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public C7159(java.io.Reader r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥۡۢ۠ۦ r0 = new Yue.ۥۡۢ۠ۦ
            r0.<init>()
            r1.f24728 = r0
            Yue.ۥ۠ۡۢ r0 = new Yue.ۥ۠ۡۢ     // Catch: java.lang.Exception -> L15
            r0.<init>(r2)     // Catch: java.lang.Exception -> L15
            r1.f24727 = r0     // Catch: java.lang.Exception -> L15
            r1.next()     // Catch: java.lang.Exception -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r2)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static void m27539(java.lang.String[] r3) throws java.lang.Exception {
            Yue.ۥۢۦۣۢ r0 = new Yue.ۥۢۦۣۢ
            java.io.FileReader r1 = new java.io.FileReader
            r2 = 0
            r3 = r3[r2]
            r1.<init>(r3)
            r0.<init>(r1)
            Yue.ۥۢۦۡۨ r3 = Yue.AbstractC7153.m27520()
            java.io.PrintStream r1 = java.lang.System.out
            Yue.ۥۢۦۢۦ r3 = r3.mo27526(r1)
            Yue.ۥۡۦ۠ r1 = new Yue.ۥۡۦ۠
            r1.<init>(r3)
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            r1.mo19667(r0)
            r0.next()
            goto L1c
        L29:
            r3.flush()
            return
    }

    @Override // Yue.InterfaceC7160
    public void close() throws Yue.C7158 {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC7160
    public Yue.C4996 getName() {
            r4 = this;
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            java.lang.String r1 = r4.mo15446()
            java.lang.String r2 = r4.mo15469()
            java.lang.String r3 = r4.getPrefix()
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // Yue.InterfaceC7160
    public java.lang.String getPrefix() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10401()
            return r0
    }

    @Override // Yue.InterfaceC7160
    public java.lang.Object getProperty(java.lang.String r1) throws java.lang.IllegalArgumentException {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // Yue.InterfaceC7160
    public java.lang.String getText() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10395()
            return r0
    }

    @Override // Yue.InterfaceC7160
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = "1.0"
            return r0
    }

    @Override // Yue.InterfaceC7160
    public boolean hasNext() throws Yue.C7158 {
            r2 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r2.f24726     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto L10
            int r0 = r0.m10402()     // Catch: java.lang.Exception -> Le
            r1 = 8
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        Le:
            r0 = move-exception
            goto L12
        L10:
            r0 = 0
        L11:
            return r0
        L12:
            Yue.ۥۢۦۢۢ r1 = new Yue.ۥۢۦۢۢ
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.InterfaceC7160
    public int next() throws Yue.C7158 {
            r4 = this;
            Yue.ۥ۠ۡۢ r0 = r4.f24727     // Catch: java.lang.Exception -> Ld
            boolean r0 = r0.m10367()     // Catch: java.lang.Exception -> Ld
            if (r0 != 0) goto Lf
            r0 = 0
            r4.f24726 = r0     // Catch: java.lang.Exception -> Ld
            r0 = -1
            return r0
        Ld:
            r0 = move-exception
            goto L53
        Lf:
            Yue.ۥ۠ۡۢ r0 = r4.f24727     // Catch: java.lang.Exception -> Ld
            Yue.ۥ۠ۡۢ۟ r0 = r0.m10377()     // Catch: java.lang.Exception -> Ld
            r4.f24726 = r0     // Catch: java.lang.Exception -> Ld
            boolean r0 = r4.mo15449()     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto L39
            Yue.ۥۡۢ۠ۦ r0 = r4.f24728     // Catch: java.lang.Exception -> Ld
            r0.m17201()     // Catch: java.lang.Exception -> Ld
            r0 = 0
        L23:
            int r1 = r4.mo15466()     // Catch: java.lang.Exception -> Ld
            if (r0 >= r1) goto L4c
            Yue.ۥۡۢ۠ۦ r1 = r4.f24728     // Catch: java.lang.Exception -> Ld
            java.lang.String r2 = r4.mo15458(r0)     // Catch: java.lang.Exception -> Ld
            java.lang.String r3 = r4.mo15471(r0)     // Catch: java.lang.Exception -> Ld
            r1.m17196(r2, r3)     // Catch: java.lang.Exception -> Ld
            int r0 = r0 + 1
            goto L23
        L39:
            boolean r0 = r4.mo15447()     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto L4c
            Yue.ۥۡۢ۠ۦ r0 = r4.f24728     // Catch: java.lang.Exception -> Ld
            int r0 = r0.m17199()     // Catch: java.lang.Exception -> Ld
            if (r0 <= 0) goto L4c
            Yue.ۥۡۢ۠ۦ r0 = r4.f24728     // Catch: java.lang.Exception -> Ld
            r0.m17197()     // Catch: java.lang.Exception -> Ld
        L4c:
            Yue.ۥ۠ۡۢ۟ r0 = r4.f24726     // Catch: java.lang.Exception -> Ld
            int r0 = r0.m10402()     // Catch: java.lang.Exception -> Ld
            return r0
        L53:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            r0.printStackTrace()
            Yue.ۥۢۦۢۢ r1 = new Yue.ۥۢۦۢۢ
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.InterfaceC4366 mo15438() {
            r1 = this;
            Yue.ۥۡۢ۠ۦ r0 = r1.f24728
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.String mo15439(java.lang.String r2) {
            r1 = this;
            Yue.ۥۡۢ۠ۦ r0 = r1.f24728
            java.lang.String r2 = r0.mo17192(r2)
            return r2
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public int mo15440() throws Yue.C7158 {
            r2 = this;
        L0:
            int r0 = r2.next()
            r1 = 8
            if (r0 == r1) goto L2e
            boolean r0 = r2.mo15443()
            if (r0 == 0) goto L1d
            boolean r0 = r2.mo15445()
            if (r0 == 0) goto L15
            goto L1d
        L15:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected text"
            r0.<init>(r1)
            throw r0
        L1d:
            boolean r0 = r2.mo15449()
            if (r0 != 0) goto L29
            boolean r0 = r2.mo15447()
            if (r0 == 0) goto L0
        L29:
            int r0 = r2.mo15450()
            return r0
        L2e:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected end of Document"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.String mo15441() throws Yue.C7158 {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r3.mo15450()
            r2 = 1
            if (r1 != r2) goto L42
        Lc:
            int r1 = r3.next()
            r2 = 8
            if (r1 == r2) goto L3a
            boolean r1 = r3.mo15449()
            if (r1 != 0) goto L32
            boolean r1 = r3.mo15443()
            if (r1 == 0) goto L27
            java.lang.String r1 = r3.getText()
            r0.append(r1)
        L27:
            boolean r1 = r3.mo15447()
            if (r1 == 0) goto Lc
            java.lang.String r0 = r0.toString()
            return r0
        L32:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected Element start"
            r0.<init>(r1)
            throw r0
        L3a:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Unexpected end of Document"
            r0.<init>(r1)
            throw r0
        L42:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Precondition for readText is getEventType() == START_ELEMENT"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo15442() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo15443() {
            r1 = this;
            int r0 = r1.mo15450()
            r0 = r0 & 4
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public java.lang.String mo15444() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo15445() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.String mo15446() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10399()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo15447() {
            r1 = this;
            int r0 = r1.mo15450()
            r0 = r0 & 2
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo15448() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public boolean mo15449() {
            r2 = this;
            int r0 = r2.mo15450()
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public int mo15450() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            if (r0 != 0) goto L7
            r0 = 8
            return r0
        L7:
            int r0 = r0.m10402()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Yue.InterfaceC3728 mo15451() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public java.lang.String mo15452(int r1) {
            r0 = this;
            Yue.ۥ۟ۢ۠ۡ r1 = r0.m27541(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.getValue()
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public char[] mo15453() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10395()
            char[] r0 = r0.toCharArray()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public java.lang.String mo15454(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mo15472()
            if (r0 >= r1) goto L36
            Yue.ۥ۟ۢ۠ۡ r1 = r3.m27541(r0)
            Yue.ۥۡۥۤۨ r2 = r1.getName()
            java.lang.String r2 = r2.m19420()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L33
            if (r4 != 0) goto L20
            java.lang.String r4 = r1.getValue()
            return r4
        L20:
            Yue.ۥۡۥۤۨ r2 = r1.getName()
            java.lang.String r2 = r2.m19421()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L33
            java.lang.String r4 = r1.getValue()
            return r4
        L33:
            int r0 = r0 + 1
            goto L1
        L36:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m27540() {
            r1 = this;
            Yue.ۥ۠ۡۢ r0 = r1.f24727
            boolean r0 = r0.m10363()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo15455() {
            r1 = this;
            int r0 = r1.mo15450()
            r0 = r0 & 11
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public java.lang.String mo15456() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10395()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public int mo15457() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10395()
            int r0 = r0.length()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public java.lang.String mo15458(int r1) {
            r0 = this;
            Yue.ۥ۟ۢ۠ۡ r1 = r0.m27542(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            Yue.ۥۡۥۤۨ r1 = r1.getName()
            java.lang.String r1 = r1.m19420()
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public Yue.C4996 mo15459(int r4) {
            r3 = this;
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            java.lang.String r1 = r3.mo15460(r4)
            java.lang.String r2 = r3.mo15465(r4)
            java.lang.String r4 = r3.mo15464(r4)
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public java.lang.String mo15460(int r1) {
            r0 = this;
            Yue.ۥ۟ۢ۠ۡ r1 = r0.m27541(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            Yue.ۥۡۥۤۨ r1 = r1.getName()
            java.lang.String r1 = r1.m19421()
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public int mo15461(int r1, char[] r2, int r3, int r4) throws Yue.C7158 {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public boolean mo15462() {
            r1 = this;
            int r0 = r1.mo15450()
            r0 = r0 & 15
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public boolean mo15463(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public java.lang.String mo15464(int r1) {
            r0 = this;
            Yue.ۥ۟ۢ۠ۡ r1 = r0.m27541(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            Yue.ۥۡۥۤۨ r1 = r1.getName()
            java.lang.String r1 = r1.m19422()
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public java.lang.String mo15465(int r1) {
            r0 = this;
            Yue.ۥ۟ۢ۠ۡ r1 = r0.m27541(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            Yue.ۥۡۥۤۨ r1 = r1.getName()
            java.lang.String r1 = r1.m19420()
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public int mo15466() {
            r1 = this;
            boolean r0 = r1.mo15449()
            if (r0 == 0) goto L11
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.util.List r0 = r0.m10400()
            int r0 = r0.size()
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public java.lang.String mo15467() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10396()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public void mo15468(int r1, java.lang.String r2, java.lang.String r3) throws Yue.C7158 {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public java.lang.String mo15469() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10397()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC0645 m27541(int r2) {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.util.List r0 = r0.m10394()
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥ۟ۢ۠ۡ r2 = (Yue.InterfaceC0645) r2
            return r2
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public int mo15470() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public java.lang.String mo15471(int r1) {
            r0 = this;
            Yue.ۥ۟ۢ۠ۡ r1 = r0.m27542(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.getValue()
            return r1
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public int mo15472() {
            r1 = this;
            boolean r0 = r1.mo15449()
            if (r0 == 0) goto L11
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.util.List r0 = r0.m10394()
            int r0 = r0.size()
            return r0
        L11:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final Yue.InterfaceC0645 m27542(int r2) {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.util.List r0 = r0.m10400()
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥ۟ۢ۠ۡ r2 = (Yue.InterfaceC0645) r2
            return r2
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public java.lang.String mo15473() {
            r1 = this;
            Yue.ۥ۠ۡۢ۟ r0 = r1.f24726
            java.lang.String r0 = r0.m10395()
            return r0
    }

    @Override // Yue.InterfaceC7160
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public java.lang.String mo15474(int r1) {
            r0 = this;
            java.lang.String r1 = "CDATA"
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public java.io.Reader m27543() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public Yue.InterfaceC7160 m27544() throws Yue.C7158 {
            r1 = this;
            r0 = 0
            return r0
    }
}
