package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2163 extends Yue.AbstractC0733 implements Yue.InterfaceC2162 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.String f6775;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final java.lang.String f6776;

    public C2163(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 15
            r1.<init>(r0)
            r1.f6775 = r2
            r1.f6776 = r3
            return
    }

    @Override // Yue.InterfaceC2162
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f6775
            return r0
    }

    @Override // Yue.AbstractC0733, Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ */
    public java.lang.String mo4230() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0733, Yue.InterfaceC3728
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.lang.String mo4231() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC2162
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public java.lang.String mo10143() {
            r1 = this;
            java.lang.String r0 = r1.f6776
            return r0
    }

    @Override // Yue.InterfaceC2162
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public java.lang.String mo10144() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC2162
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public java.lang.String mo10145() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<!ENTITY "
            r2.write(r0)
            java.lang.String r0 = r1.getName()
            r2.write(r0)
            r0 = 34
            r2.write(r0)
            java.lang.String r0 = r1.mo10143()
            r2.write(r0)
            java.lang.String r0 = "\">"
            r2.write(r0)
            return
    }
}
