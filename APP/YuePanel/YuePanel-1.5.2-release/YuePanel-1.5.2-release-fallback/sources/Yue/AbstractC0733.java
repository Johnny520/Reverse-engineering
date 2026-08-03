package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0733 implements Yue.InterfaceC7142, Yue.InterfaceC3728 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int f2042;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f2043;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int f2044;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f2045;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String f2046;

    public AbstractC0733() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2042 = r0
            r1.f2043 = r0
            r1.f2044 = r0
            r0 = 0
            r1.f2045 = r0
            return
    }

    public AbstractC0733(int r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2043 = r0
            r1.f2044 = r0
            r0 = 0
            r1.f2045 = r0
            r1.f2042 = r2
            return
    }

    @Override // Yue.InterfaceC7142
    public boolean isAttribute() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 10
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = 64
            r0.<init>(r1)
            r3.mo4241(r0)     // Catch: Yue.C7158 -> Lb
            goto L1d
        Lb:
            r1 = move-exception
            java.lang.String r2 = "[ERROR: "
            r0.write(r2)
            java.lang.String r1 = r1.toString()
            r0.write(r1)
            java.lang.String r1 = "]"
            r0.write(r1)
        L1d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ */
    public java.lang.String mo4230() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.lang.String mo4231() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo4232() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo4234() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public boolean mo4235() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public int mo4236() {
            r1 = this;
            int r0 = r1.f2042
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Yue.InterfaceC3728 mo4237() {
            r0 = this;
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public int mo4238() {
            r1 = this;
            int r0 = r1.f2044
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public boolean mo4240() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 13
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public final void mo4241(java.io.Writer r2) throws Yue.C7158 {
            r1 = this;
            r1.mo4548(r2)     // Catch: java.io.IOException -> L4
            return
        L4:
            r2 = move-exception
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            r0.<init>(r2)
            throw r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public Yue.C4996 mo4242() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public boolean mo4243() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 7
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public Yue.InterfaceC2155 mo4245() {
            r1 = this;
            r0 = r1
            Yue.ۥ۠ۡ r0 = (Yue.InterfaceC2155) r0
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public int mo4246() {
            r1 = this;
            int r0 = r1.f2043
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public Yue.InterfaceC1093 mo4247() {
            r1 = this;
            r0 = r1
            Yue.ۥۣ۟ۤۥ r0 = (Yue.InterfaceC1093) r0
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public Yue.InterfaceC5922 mo4248() {
            r1 = this;
            r0 = r1
            Yue.ۥۢ۟ۨۤ r0 = (Yue.InterfaceC5922) r0
            return r0
    }

    @Override // Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public int mo4249() {
            r1 = this;
            int r0 = r1.f2045
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public boolean mo4250() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public boolean mo4251() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // Yue.InterfaceC7142
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
    public boolean mo4252() {
            r2 = this;
            int r0 = r2.f2042
            r1 = 9
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public abstract void mo4548(java.io.Writer r1) throws java.io.IOException, Yue.C7158;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public java.lang.String m4549() {
            r1 = this;
            java.lang.String r0 = r1.f2046
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public java.lang.String m4550() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public java.lang.String m4551() {
            r1 = this;
            int r0 = r1.f2042
            java.lang.String r0 = Yue.C2107.m9935(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public void m4552() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m4553(int r1) {
            r0 = this;
            r0.f2045 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m4554(int r1) {
            r0 = this;
            r0.f2044 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m4555(int r1) {
            r0 = this;
            r0.f2042 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m4556(int r1) {
            r0 = this;
            r0.f2043 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m4557(java.lang.String r1) {
            r0 = this;
            r0.f2046 = r1
            return
    }
}
