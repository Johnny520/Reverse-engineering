package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2250 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.io.Reader f6936;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public char f6937;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f6938;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f6939;

    public C2250() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6938 = r0
            r1.f6939 = r0
            return
    }

    public C2250(java.io.Reader r2) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6938 = r0
            r1.f6939 = r0
            r1.m10389(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m10362(java.lang.String[] r3) throws java.lang.Exception {
            Yue.ۥ۠ۡۢ r0 = new Yue.ۥ۠ۡۢ
            java.io.FileReader r1 = new java.io.FileReader
            r2 = 0
            r3 = r3[r2]
            r1.<init>(r3)
            r0.<init>(r1)
        Ld:
            boolean r3 = r0.m10367()
            if (r3 == 0) goto L1d
            java.io.PrintStream r3 = java.lang.System.out
            Yue.ۥ۠ۡۢ۟ r1 = r0.m10377()
            r3.println(r1)
            goto Ld
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m10363() {
            r1 = this;
            boolean r0 = r1.f6939
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public char m10364() {
            r1 = this;
            char r0 = r1.f6937
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m10365(java.lang.String r3) {
            r2 = this;
            r0 = 58
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto La
            return r3
        La:
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m10366(java.lang.String r3) {
            r2 = this;
            r0 = 58
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto Lb
            r3 = 0
            return r3
        Lb:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m10367() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.f6936
            boolean r0 = r0.ready()
            if (r0 == 0) goto Le
            boolean r0 = r1.f6939
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public char m10368() throws java.io.IOException {
            r2 = this;
            java.io.Reader r0 = r2.f6936
            int r0 = r0.read()
            char r0 = (char) r0
            r2.f6937 = r0
            r1 = 10
            if (r0 != r1) goto L13
            int r1 = r2.f6938
            int r1 = r1 + 1
            r2.f6938 = r1
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public char m10369(char r4) throws Yue.C7158, java.io.IOException {
            r3 = this;
            char r0 = r3.f6937
            if (r0 != r4) goto L9
            char r4 = r3.m10368()
            return r4
        L9:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Unexpected character '"
            r1.append(r2)
            char r2 = r3.f6937
            r1.append(r2)
            java.lang.String r2 = "' , expected '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "' at line "
            r1.append(r4)
            int r4 = r3.f6938
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m10370(java.lang.String r3) throws Yue.C7158, java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r3.length()
            if (r0 >= r1) goto L11
            char r1 = r3.charAt(r0)
            r2.m10369(r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.InterfaceC0645 m10371() throws Yue.C7158, java.io.IOException {
            r4 = this;
            r0 = 91
            r4.m10369(r0)
            r4.m10369(r0)
            r0 = 93
            java.lang.String r1 = r4.m10387(r0)
            r4.m10369(r0)
            Yue.ۥۡۥۤۨ r2 = r4.m10381()
            java.lang.String r3 = "=["
            r4.m10370(r3)
            java.lang.String r3 = r4.m10387(r0)
            r4.m10369(r0)
            r4.m10369(r0)
            java.lang.String r0 = "ATTRIBUTE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            Yue.ۥۣ۟ۢ۠ r0 = new Yue.ۥۣ۟ۢ۠
            r0.<init>(r2, r3)
            return r0
        L32:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L40
            Yue.ۥۡۢ۠ۤ r0 = new Yue.ۥۡۢ۠ۤ
            r0.<init>(r3)
            return r0
        L40:
            java.lang.String r0 = "NAMESPACE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L52
            Yue.ۥۡۢ۠ۤ r0 = new Yue.ۥۡۢ۠ۤ
            java.lang.String r1 = r2.m19420()
            r0.<init>(r1, r3)
            return r0
        L52:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.String r1 = "Parser Error expected (ATTRIBUTE||DEFAULT|NAMESPACE"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.util.List m10372() throws Yue.C7158, java.io.IOException {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            char r1 = r3.m10364()
            r2 = 91
            if (r1 != r2) goto L15
            Yue.ۥ۟ۢ۠ۡ r1 = r3.m10371()
            r0.add(r1)
            goto L5
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C2251 m10373() throws Yue.C7158, java.io.IOException {
            r2 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 12
            r0.<init>(r1)
            r1 = 91
            r2.m10369(r1)
            r1 = 93
            r2.m10387(r1)
            r2.m10369(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C2251 m10374() throws Yue.C7158, java.io.IOException {
            r3 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 4
            r0.<init>(r1)
            r1 = 91
            r3.m10369(r1)
            r1 = 93
            java.lang.String r2 = r3.m10387(r1)
            r0.m10404(r2)
            r3.m10369(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C2251 m10375() throws Yue.C7158, java.io.IOException {
            r3 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 5
            r0.<init>(r1)
            r1 = 91
            r3.m10369(r1)
            r1 = 93
            java.lang.String r2 = r3.m10387(r1)
            r0.m10404(r2)
            r3.m10369(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Yue.C2251 m10376() throws Yue.C7158, java.io.IOException {
            r3 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 11
            r0.<init>(r1)
            r1 = 91
            r3.m10369(r1)
            r1 = 93
            java.lang.String r2 = r3.m10387(r1)
            r3.m10369(r1)
            r0.m10404(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.C2251 m10377() throws Yue.C7158, java.io.IOException {
            r4 = this;
            int r0 = r4.m10388()
            switch(r0) {
                case 1: goto L58;
                case 2: goto L53;
                case 3: goto L4e;
                case 4: goto L49;
                case 5: goto L44;
                case 6: goto L3f;
                case 7: goto L3a;
                case 8: goto L32;
                case 9: goto L2d;
                case 10: goto L7;
                case 11: goto L28;
                case 12: goto L23;
                default: goto L7;
            }
        L7:
            Yue.ۥۢۦۢۢ r1 = new Yue.ۥۢۦۢۢ
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "Attempt to read unknown element ["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L23:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10373()
            goto L5c
        L28:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10376()
            goto L5c
        L2d:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10380()
            goto L5c
        L32:
            r0 = 1
            r4.f6939 = r0
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10378()
            goto L5c
        L3a:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10385()
            goto L5c
        L3f:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10384()
            goto L5c
        L44:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10375()
            goto L5c
        L49:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10374()
            goto L5c
        L4e:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10383()
            goto L5c
        L53:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10379()
            goto L5c
        L58:
            Yue.ۥ۠ۡۢ۟ r0 = r4.m10386()
        L5c:
            r1 = 59
            r4.m10369(r1)
            r4.m10390()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C2251 m10378() throws Yue.C7158 {
            r2 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 8
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Yue.C2251 m10379() throws Yue.C7158, java.io.IOException {
            r2 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 2
            r0.<init>(r1)
            r1 = 91
            r2.m10369(r1)
            Yue.ۥۡۥۤۨ r1 = r2.m10381()
            r0.m10406(r1)
            r1 = 93
            r2.m10369(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Yue.C2251 m10380() throws Yue.C7158, java.io.IOException {
            r3 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 9
            r0.<init>(r1)
            r1 = 91
            r3.m10369(r1)
            r1 = 93
            java.lang.String r2 = r3.m10387(r1)
            r0.m10404(r2)
            r3.m10369(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C4996 m10381() throws Yue.C7158, java.io.IOException {
            r2 = this;
            r0 = 91
            r2.m10369(r0)
            r0 = 93
            Yue.ۥۡۥۤۨ r1 = r2.m10382(r0)
            r2.m10369(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.C4996 m10382(char r4) throws Yue.C7158, java.io.IOException {
            r3 = this;
            char r0 = r3.m10364()
            java.lang.String r1 = ""
            r2 = 39
            if (r0 != r2) goto L1a
            r3.m10369(r2)
            java.lang.String r0 = r3.m10387(r2)
            r3.m10369(r2)
            r2 = 58
            r3.m10369(r2)
            goto L1b
        L1a:
            r0 = r1
        L1b:
            java.lang.String r4 = r3.m10387(r4)
            java.lang.String r2 = r3.m10366(r4)
            if (r2 != 0) goto L26
            goto L27
        L26:
            r1 = r2
        L27:
            java.lang.String r4 = r3.m10365(r4)
            Yue.ۥۡۥۤۨ r2 = new Yue.ۥۡۥۤۨ
            r2.<init>(r0, r4, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.C2251 m10383() throws Yue.C7158, java.io.IOException {
            r5 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 3
            r0.<init>(r1)
            r1 = 91
            r5.m10369(r1)
            r1 = 93
            java.lang.String r2 = r5.m10387(r1)
            r5.m10369(r1)
            char r3 = r5.m10364()
            r4 = 44
            if (r3 != r4) goto L29
            java.lang.String r3 = ",["
            r5.m10370(r3)
            java.lang.String r3 = r5.m10387(r1)
            r5.m10369(r1)
            goto L2a
        L29:
            r3 = 0
        L2a:
            r0.m10404(r2)
            r0.m10405(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Yue.C2251 m10384() throws Yue.C7158, java.io.IOException {
            r3 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 6
            r0.<init>(r1)
            r1 = 91
            r3.m10369(r1)
            r1 = 93
            java.lang.String r2 = r3.m10387(r1)
            r3.m10369(r1)
            r0.m10404(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.C2251 m10385() throws Yue.C7158, java.io.IOException {
            r5 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 7
            r0.<init>(r1)
            char r1 = r5.m10364()
            r2 = 59
            if (r1 == r2) goto L37
            r1 = 91
            r5.m10369(r1)
            r5.m10369(r1)
            r2 = 93
            java.lang.String r3 = r5.m10387(r2)
            r5.m10369(r2)
            r4 = 44
            r5.m10369(r4)
            r5.m10369(r1)
            java.lang.String r1 = r5.m10387(r2)
            r5.m10369(r2)
            r5.m10369(r2)
            r0.m10404(r3)
            r0.m10405(r1)
        L37:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C2251 m10386() throws Yue.C7158, java.io.IOException {
            r4 = this;
            Yue.ۥ۠ۡۢ۟ r0 = new Yue.ۥ۠ۡۢ۟
            r1 = 1
            r0.<init>(r1)
            r1 = 91
            r4.m10369(r1)
            Yue.ۥۡۥۤۨ r2 = r4.m10381()
            r0.m10406(r2)
            char r2 = r4.m10364()
            if (r2 != r1) goto L36
            java.util.List r1 = r4.m10372()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            boolean r3 = r2 instanceof Yue.InterfaceC4364
            if (r3 == 0) goto L32
            r0.m10392(r2)
            goto L20
        L32:
            r0.m10391(r2)
            goto L20
        L36:
            r1 = 93
            r4.m10369(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.lang.String m10387(char r4) throws java.io.IOException, Yue.C7158 {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            char r1 = r3.m10364()
            if (r1 == r4) goto L3c
            char r1 = r3.m10364()
            r2 = 91
            if (r1 != r2) goto L31
            r1 = 93
            if (r4 != r1) goto L31
            r3.m10368()
            r0.append(r2)
            char r2 = r3.m10364()
            if (r2 == r1) goto L2a
            java.lang.String r2 = r3.m10387(r1)
            r0.append(r2)
        L2a:
            r0.append(r1)
            r3.m10369(r1)
            goto L5
        L31:
            char r1 = r3.m10364()
            r0.append(r1)
            r3.m10368()
            goto L5
        L3c:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int m10388() throws Yue.C7158, java.io.IOException {
            r2 = this;
            r0 = 91
            r2.m10369(r0)
            r0 = 93
            java.lang.String r1 = r2.m10387(r0)
            int r1 = Yue.C2107.m9934(r1)
            r2.m10369(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m10389(java.io.Reader r1) throws java.io.IOException {
            r0 = this;
            r0.f6936 = r1
            r0.m10368()
            r0.m10390()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m10390() throws java.io.IOException {
            r5 = this;
        L0:
            char r0 = r5.f6937
            r1 = 32
            r2 = 0
            r3 = 1
            if (r0 != r1) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            r4 = 10
            if (r0 != r4) goto L11
            r4 = r3
            goto L12
        L11:
            r4 = r2
        L12:
            r1 = r1 | r4
            r4 = 9
            if (r0 != r4) goto L19
            r4 = r3
            goto L1a
        L19:
            r4 = r2
        L1a:
            r1 = r1 | r4
            r4 = 13
            if (r0 != r4) goto L20
            r2 = r3
        L20:
            r0 = r1 | r2
            if (r0 == 0) goto L28
            r5.m10368()
            goto L0
        L28:
            return
    }
}
