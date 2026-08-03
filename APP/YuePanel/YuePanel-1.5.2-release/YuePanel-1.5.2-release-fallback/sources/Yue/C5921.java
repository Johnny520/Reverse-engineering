package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5921 extends Yue.AbstractC0733 implements Yue.InterfaceC5920 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f21586;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.String f21587;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.lang.String f21588;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f21589;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.String f21590;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f21591;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f21592;

    public C5921() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.f21586 = r0
            r2.f21587 = r0
            java.lang.String r0 = "UTF-8"
            r2.f21588 = r0
            r0 = 0
            r2.f21589 = r0
            java.lang.String r1 = "1.0"
            r2.f21590 = r1
            r2.f21591 = r0
            r2.f21592 = r0
            r2.m21988()
            return
    }

    @Override // Yue.InterfaceC5920
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.f21590
            return r0
    }

    @Override // Yue.AbstractC0733, Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ */
    public java.lang.String mo4230() {
            r1 = this;
            java.lang.String r0 = r1.f21586
            return r0
    }

    @Override // Yue.InterfaceC5920
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo21983() {
            r1 = this;
            boolean r0 = r1.f21592
            return r0
    }

    @Override // Yue.InterfaceC5920
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public java.lang.String mo21984() {
            r1 = this;
            java.lang.String r0 = r1.f21588
            return r0
    }

    @Override // Yue.InterfaceC5920
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo21985() {
            r1 = this;
            boolean r0 = r1.f21589
            return r0
    }

    @Override // Yue.InterfaceC5920
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo21986() {
            r1 = this;
            boolean r0 = r1.f21591
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<?xml version=\""
            r2.write(r0)
            java.lang.String r0 = r1.f21590
            r2.write(r0)
            java.lang.String r0 = "\" encoding='"
            r2.write(r0)
            java.lang.String r0 = r1.f21588
            r2.write(r0)
            r0 = 39
            r2.write(r0)
            boolean r0 = r1.f21592
            if (r0 == 0) goto L2e
            java.lang.String r0 = " standalone='"
            r2.write(r0)
            boolean r0 = r1.f21589
            if (r0 == 0) goto L29
            java.lang.String r0 = "yes'"
            goto L2b
        L29:
            java.lang.String r0 = "no'"
        L2b:
            r2.write(r0)
        L2e:
            java.lang.String r0 = "?>"
            r2.write(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m21987() {
            r1 = this;
            java.lang.String r0 = "UTF-8"
            r1.f21588 = r0
            r0 = 1
            r1.f21589 = r0
            java.lang.String r0 = "1.0"
            r1.f21590 = r0
            r0 = 0
            r1.f21591 = r0
            r1.f21592 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m21988() {
            r1 = this;
            r0 = 7
            r1.m4555(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m21989(java.lang.String r1) {
            r0 = this;
            r0.f21588 = r1
            r1 = 1
            r0.f21591 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m21990(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r2.f21592 = r0
            if (r3 != 0) goto L8
            r2.f21589 = r0
            return
        L8:
            java.lang.String r1 = "yes"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L13
            r2.f21589 = r0
            goto L16
        L13:
            r3 = 0
            r2.f21589 = r3
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m21991(boolean r2) {
            r1 = this;
            r0 = 1
            r1.f21592 = r0
            r1.f21589 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m21992(java.lang.String r1) {
            r0 = this;
            r0.f21590 = r1
            return
    }
}
