package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4422 extends Yue.AbstractC0733 implements Yue.InterfaceC4421 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.String f13981;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.lang.String f13982;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final java.lang.String f13983;

    public C4422(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 14
            r1.<init>(r0)
            r1.f13981 = r2
            r1.f13982 = r3
            r1.f13983 = r4
            return
    }

    @Override // Yue.InterfaceC4421
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f13981
            return r0
    }

    @Override // Yue.AbstractC0733, Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ */
    public java.lang.String mo4230() {
            r1 = this;
            java.lang.String r0 = r1.f13983
            return r0
    }

    @Override // Yue.AbstractC0733, Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.lang.String mo4231() {
            r1 = this;
            java.lang.String r0 = r1.f13982
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "<!NOTATION "
            r3.write(r0)
            java.lang.String r0 = r2.getName()
            r3.write(r0)
            java.lang.String r0 = r2.f13982
            r1 = 34
            if (r0 == 0) goto L20
            java.lang.String r0 = " PUBLIC \""
            r3.write(r0)
            java.lang.String r0 = r2.f13982
            r3.write(r0)
            r3.write(r1)
            goto L29
        L20:
            java.lang.String r0 = r2.f13983
            if (r0 == 0) goto L29
            java.lang.String r0 = " SYSTEM"
            r3.write(r0)
        L29:
            java.lang.String r0 = r2.f13983
            if (r0 == 0) goto L3a
            java.lang.String r0 = " \""
            r3.write(r0)
            java.lang.String r0 = r2.f13983
            r3.write(r0)
            r3.write(r1)
        L3a:
            r0 = 62
            r3.write(r0)
            return
    }
}
