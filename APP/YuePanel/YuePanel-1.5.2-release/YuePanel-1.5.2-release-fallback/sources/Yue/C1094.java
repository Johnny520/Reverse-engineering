package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1094 extends Yue.AbstractC0733 implements Yue.InterfaceC1093 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f3254;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f3255;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f3256;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f3257;

    public C1094() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3255 = r0
            r1.f3256 = r0
            r1.f3257 = r0
            r1.mo5838()
            return
    }

    public C1094(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3255 = r0
            r1.f3256 = r0
            r1.f3257 = r0
            r1.mo5838()
            r1.m5839(r2)
            return
    }

    public C1094(java.lang.String r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3255 = r0
            r1.f3256 = r0
            r1.f3257 = r0
            r1.mo5838()
            r1.m5839(r2)
            r1.f3255 = r3
            return
    }

    @Override // Yue.InterfaceC1093
    public java.lang.String getData() {
            r1 = this;
            java.lang.String r0 = r1.f3254
            return r0
    }

    @Override // Yue.InterfaceC1093
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo5833() {
            r1 = this;
            boolean r0 = r1.f3256
            return r0
    }

    @Override // Yue.InterfaceC1093
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public boolean mo5834() {
            r1 = this;
            boolean r0 = r1.f3255
            return r0
    }

    @Override // Yue.InterfaceC1093
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public boolean mo5835() {
            r1 = this;
            boolean r0 = r1.f3257
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r9) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.f3255
            if (r0 == 0) goto L16
            java.lang.String r0 = "<![CDATA["
            r9.write(r0)
            java.lang.String r0 = r8.getData()
            r9.write(r0)
            java.lang.String r0 = "]]>"
            r9.write(r0)
            goto L66
        L16:
            java.lang.String r0 = r8.getData()
            int r1 = r0.length()
            if (r1 <= 0) goto L66
            r2 = 0
            r3 = r2
        L22:
            r4 = 62
            r5 = 60
            r6 = 38
            if (r3 >= r1) goto L37
            char r7 = r0.charAt(r3)
            if (r7 == r6) goto L37
            if (r7 == r5) goto L37
            if (r7 == r4) goto L37
            int r3 = r3 + 1
            goto L22
        L37:
            if (r3 != r1) goto L3d
            r9.write(r0)
            goto L66
        L3d:
            if (r3 <= 0) goto L42
            r9.write(r0, r2, r3)
        L42:
            if (r3 >= r1) goto L66
            char r2 = r0.charAt(r3)
            if (r2 == r6) goto L5e
            if (r2 == r5) goto L58
            if (r2 == r4) goto L52
            r9.write(r2)
            goto L63
        L52:
            java.lang.String r2 = "&gt;"
            r9.write(r2)
            goto L63
        L58:
            java.lang.String r2 = "&lt;"
            r9.write(r2)
            goto L63
        L5e:
            java.lang.String r2 = "&amp;"
            r9.write(r2)
        L63:
            int r3 = r3 + 1
            goto L42
        L66:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public char[] m5836() {
            r1 = this;
            java.lang.String r0 = r1.f3254
            char[] r0 = r0.toCharArray()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public boolean m5837() {
            r1 = this;
            java.lang.String r0 = r1.f3254
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void mo5838() {
            r1 = this;
            r0 = 4
            r1.m4555(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m5839(java.lang.String r1) {
            r0 = this;
            r0.f3254 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m5840(boolean r1) {
            r0 = this;
            r0.f3257 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m5841(boolean r1) {
            r0 = this;
            r0.f3256 = r1
            return
    }
}
