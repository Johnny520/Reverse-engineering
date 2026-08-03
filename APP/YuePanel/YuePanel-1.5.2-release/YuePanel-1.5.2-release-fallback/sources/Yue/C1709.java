package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1709 extends Yue.AbstractC0733 implements Yue.InterfaceC1695 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f5363;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.util.List f5364;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.util.List f5365;

    public C1709() {
            r0 = this;
            r0.<init>()
            r0.m8175()
            return
    }

    public C1709(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.m8175()
            r0.m8176(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static Yue.InterfaceC2162 m8173(Yue.C1707 r2) {
            Yue.ۥ۠ۡ۟ۢ r0 = new Yue.ۥ۠ۡ۟ۢ
            java.lang.String r1 = r2.m8154()
            java.lang.String r2 = r2.m8158()
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static Yue.InterfaceC4421 m8174(Yue.C1714 r3) {
            Yue.ۥ۟ۨۡۡ r0 = r3.m8185()
            java.lang.String r1 = r0.m8179()
            boolean r2 = r0 instanceof Yue.C1721
            if (r2 == 0) goto L13
            Yue.ۥ۟ۨۢۡ r0 = (Yue.C1721) r0
            java.lang.String r0 = r0.m8223()
            goto L14
        L13:
            r0 = 0
        L14:
            Yue.ۥۡۢۥۤ r2 = new Yue.ۥۡۢۥۤ
            java.lang.String r3 = r3.m8186()
            r2.<init>(r3, r0, r1)
            return r2
    }

    @Override // Yue.InterfaceC1695
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public java.util.List mo8112() {
            r1 = this;
            java.util.List r0 = r1.f5364
            return r0
    }

    @Override // Yue.InterfaceC1695
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.lang.Object mo8113() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC1695
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public java.util.List mo8114() {
            r1 = this;
            java.util.List r0 = r1.f5365
            return r0
    }

    @Override // Yue.InterfaceC1695
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟ */
    public java.lang.String mo8115() {
            r1 = this;
            java.lang.String r0 = r1.f5363
            return r0
    }

    @Override // Yue.AbstractC0733
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo4548(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "<!DOCTYPE "
            r2.write(r0)
            java.lang.String r0 = r1.f5363
            if (r0 == 0) goto L1e
            int r0 = r0.length()
            if (r0 <= 0) goto L1e
            r0 = 91
            r2.write(r0)
            java.lang.String r0 = r1.f5363
            r2.write(r0)
            r0 = 93
            r2.write(r0)
        L1e:
            r0 = 62
            r2.write(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m8175() {
            r1 = this;
            r0 = 11
            r1.m4555(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m8176(java.lang.String r1) {
            r0 = this;
            r0.f5363 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m8177(java.util.List r1) {
            r0 = this;
            r0.f5365 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m8178(java.util.List r1) {
            r0 = this;
            r0.f5364 = r1
            return
    }
}
