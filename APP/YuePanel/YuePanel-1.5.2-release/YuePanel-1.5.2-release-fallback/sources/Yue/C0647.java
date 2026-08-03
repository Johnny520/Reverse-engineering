package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0647 implements Yue.InterfaceC0645, Yue.InterfaceC3728 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.lang.String f1636;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C4996 f1637;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Yue.C4996 f1638;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public java.lang.String f1639;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f1640;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f1641;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f1642;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f1643;

    public C0647(Yue.C4996 r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1640 = r0
            r1.f1641 = r0
            r1.f1642 = r0
            r0 = 0
            r1.f1643 = r0
            r1.f1637 = r2
            r1.f1636 = r3
            return
    }

    public C0647(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f1640 = r0
            r2.f1641 = r0
            r2.f1642 = r0
            r0 = 0
            r2.f1643 = r0
            java.lang.String r0 = ""
            if (r3 != 0) goto L12
            r3 = r0
        L12:
            Yue.ۥۡۥۤۨ r1 = new Yue.ۥۡۥۤۨ
            r1.<init>(r0, r4, r3)
            r2.f1637 = r1
            r2.f1636 = r5
            return
    }

    public C0647(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1640 = r0
            r1.f1641 = r0
            r1.f1642 = r0
            r0 = 0
            r1.f1643 = r0
            if (r2 != 0) goto L11
            java.lang.String r2 = ""
        L11:
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            r0.<init>(r3, r4, r2)
            r1.f1637 = r0
            r1.f1636 = r5
            Yue.ۥۡۥۤۨ r2 = new Yue.ۥۡۥۤۨ
            r2.<init>(r6)
            r1.f1638 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static void m4229(java.io.Writer r1, char r2) throws java.io.IOException {
            java.lang.String r0 = "&#"
            r1.write(r0)
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r1.write(r2)
            r2 = 59
            r1.write(r2)
            return
    }

    @Override // Yue.InterfaceC0645
    public Yue.C4996 getName() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f1637
            return r0
    }

    @Override // Yue.InterfaceC0645
    public java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.f1636
            return r0
    }

    @Override // Yue.InterfaceC7142
    public boolean isAttribute() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            Yue.ۥۡۥۤۨ r0 = r4.f1637
            java.lang.String r0 = r0.m19422()
            java.lang.String r1 = "'"
            java.lang.String r2 = "='"
            if (r0 == 0) goto L59
            Yue.ۥۡۥۤۨ r0 = r4.f1637
            java.lang.String r0 = r0.m19422()
            java.lang.String r3 = ""
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L59
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = "['"
            r0.append(r3)
            Yue.ۥۡۥۤۨ r3 = r4.f1637
            java.lang.String r3 = r3.m19421()
            r0.append(r3)
            java.lang.String r3 = "']:"
            r0.append(r3)
            Yue.ۥۡۥۤۨ r3 = r4.f1637
            java.lang.String r3 = r3.m19422()
            r0.append(r3)
            java.lang.String r3 = ":"
            r0.append(r3)
            Yue.ۥۡۥۤۨ r3 = r4.f1637
            java.lang.String r3 = r3.m19420()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r4.f1636
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L59:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            Yue.ۥۡۥۤۨ r3 = r4.f1637
            java.lang.String r3 = r3.m19420()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r4.f1636
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String mo4230() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String mo4231() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo4232() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.String mo4233() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f1637
            java.lang.String r0 = r0.m19421()
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo4234() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean mo4235() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int mo4236() {
            r1 = this;
            r0 = 10
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.InterfaceC3728 mo4237() {
            r0 = this;
            return r0
    }

    @Override // Yue.InterfaceC0645
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public boolean mo4209() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int mo4238() {
            r1 = this;
            int r0 = r1.f1642
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m4239() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f1637
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean mo4240() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void mo4241(java.io.Writer r10) throws Yue.C7158 {
            r9 = this;
            Yue.ۥۡۥۤۨ r0 = r9.f1637     // Catch: java.io.IOException -> L17
            java.lang.String r0 = r0.m19422()     // Catch: java.io.IOException -> L17
            if (r0 == 0) goto L1a
            int r1 = r0.length()     // Catch: java.io.IOException -> L17
            if (r1 <= 0) goto L1a
            r10.write(r0)     // Catch: java.io.IOException -> L17
            r0 = 58
            r10.write(r0)     // Catch: java.io.IOException -> L17
            goto L1a
        L17:
            r10 = move-exception
            goto L85
        L1a:
            Yue.ۥۡۥۤۨ r0 = r9.f1637     // Catch: java.io.IOException -> L17
            java.lang.String r0 = r0.m19420()     // Catch: java.io.IOException -> L17
            r10.write(r0)     // Catch: java.io.IOException -> L17
            java.lang.String r0 = "=\""
            r10.write(r0)     // Catch: java.io.IOException -> L17
            java.lang.String r0 = r9.f1636     // Catch: java.io.IOException -> L17
            int r1 = r0.length()     // Catch: java.io.IOException -> L17
            r2 = 34
            if (r1 <= 0) goto L81
            r3 = 0
            r4 = r3
        L34:
            r5 = 32
            r6 = 60
            r7 = 38
            if (r4 >= r1) goto L4c
            char r8 = r0.charAt(r4)     // Catch: java.io.IOException -> L17
            if (r8 == r2) goto L4c
            if (r8 == r7) goto L4c
            if (r8 == r6) goto L4c
            if (r8 >= r5) goto L49
            goto L4c
        L49:
            int r4 = r4 + 1
            goto L34
        L4c:
            if (r4 != r1) goto L52
            r10.write(r0)     // Catch: java.io.IOException -> L17
            goto L81
        L52:
            if (r4 <= 0) goto L57
            r10.write(r0, r3, r4)     // Catch: java.io.IOException -> L17
        L57:
            if (r4 >= r1) goto L81
            char r3 = r0.charAt(r4)     // Catch: java.io.IOException -> L17
            if (r3 == r2) goto L79
            if (r3 == r7) goto L73
            if (r3 == r6) goto L6d
            if (r3 >= r5) goto L69
            m4229(r10, r3)     // Catch: java.io.IOException -> L17
            goto L7e
        L69:
            r10.write(r3)     // Catch: java.io.IOException -> L17
            goto L7e
        L6d:
            java.lang.String r3 = "&lt;"
            r10.write(r3)     // Catch: java.io.IOException -> L17
            goto L7e
        L73:
            java.lang.String r3 = "&amp;"
            r10.write(r3)     // Catch: java.io.IOException -> L17
            goto L7e
        L79:
            java.lang.String r3 = "&quot;"
            r10.write(r3)     // Catch: java.io.IOException -> L17
        L7e:
            int r4 = r4 + 1
            goto L57
        L81:
            r10.write(r2)     // Catch: java.io.IOException -> L17
            return
        L85:
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            r0.<init>(r10)
            throw r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public Yue.C4996 mo4242() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public boolean mo4243() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public java.lang.String m4244() {
            r1 = this;
            Yue.ۥۡۥۤۨ r0 = r1.f1637
            java.lang.String r0 = r0.m19420()
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public Yue.InterfaceC2155 mo4245() {
            r2 = this;
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            java.lang.String r1 = "cannnot cast AttributeBase to EndElement"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int mo4246() {
            r1 = this;
            int r0 = r1.f1641
            return r0
    }

    @Override // Yue.InterfaceC0645
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public java.lang.String mo4210() {
            r1 = this;
            java.lang.String r0 = "CDATA"
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public Yue.InterfaceC1093 mo4247() {
            r2 = this;
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            java.lang.String r1 = "cannnot cast AttributeBase to Characters"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public Yue.InterfaceC5922 mo4248() {
            r2 = this;
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            java.lang.String r1 = "cannnot cast AttributeBase to StartElement"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public int mo4249() {
            r1 = this;
            int r0 = r1.f1643
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean mo4250() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public boolean mo4251() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public boolean mo4252() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public java.lang.String m4253() {
            r1 = this;
            java.lang.String r0 = r1.f1639
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public java.lang.String m4254() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean m4255() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public boolean m4256() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public boolean m4257() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public boolean m4258() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m4259() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m4260(int r1) {
            r0 = this;
            r0.f1643 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m4261(int r1) {
            r0 = this;
            r0.f1642 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m4262(int r1) {
            r0 = this;
            r0.f1641 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m4263(java.lang.String r1) {
            r0 = this;
            r0.f1639 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m4264(java.lang.String r3) {
            r2 = this;
            Yue.ۥۡۥۤۨ r0 = new Yue.ۥۡۥۤۨ
            Yue.ۥۡۥۤۨ r1 = r2.f1637
            java.lang.String r1 = r1.m19420()
            r0.<init>(r3, r1)
            r2.f1637 = r0
            return
    }
}
