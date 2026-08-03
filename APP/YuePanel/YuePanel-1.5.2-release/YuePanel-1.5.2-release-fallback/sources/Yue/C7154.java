package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7154 extends Yue.AbstractC7153 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C1468 f24708;

    public C7154() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟ۦۧ۟ r0 = new Yue.ۥ۟ۦۧ۟
            r0.<init>()
            r1.f24708 = r0
            return
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC7150 mo27522(java.io.OutputStream r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۡۦ r0 = new Yue.ۥۢۦۡۦ
            Yue.ۥۢۦۢۦ r2 = r1.mo27526(r2)
            r0.<init>(r2)
            return r0
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.InterfaceC7150 mo27523(java.io.OutputStream r2, java.lang.String r3) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۡۦ r0 = new Yue.ۥۢۦۡۦ
            Yue.ۥۢۦۢۦ r2 = r1.mo27527(r2, r3)
            r0.<init>(r2)
            return r0
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.InterfaceC7150 mo27524(java.io.Writer r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۡۦ r0 = new Yue.ۥۢۦۡۦ
            Yue.ۥۢۦۢۦ r2 = r1.mo27528(r2)
            r0.<init>(r2)
            return r0
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Yue.InterfaceC7150 mo27525(javax.xml.transform.Result r1) throws Yue.C7158 {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC7162 mo27526(java.io.OutputStream r3) throws Yue.C7158 {
            r2 = this;
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            r1.<init>(r3)
            r3 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r1, r3)
            Yue.ۥۢۦۢۦ r3 = r2.mo27528(r0)
            return r3
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Yue.InterfaceC7162 mo27527(java.io.OutputStream r4, java.lang.String r5) throws Yue.C7158 {
            r3 = this;
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.io.UnsupportedEncodingException -> L11
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.io.UnsupportedEncodingException -> L11
            r1.<init>(r4, r5)     // Catch: java.io.UnsupportedEncodingException -> L11
            r4 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r1, r4)     // Catch: java.io.UnsupportedEncodingException -> L11
            Yue.ۥۢۦۢۦ r4 = r3.mo27528(r0)     // Catch: java.io.UnsupportedEncodingException -> L11
            return r4
        L11:
            r4 = move-exception
            Yue.ۥۢۦۢۢ r0 = new Yue.ۥۢۦۢۢ
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Unsupported encoding "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Yue.InterfaceC7162 mo27528(java.io.Writer r2) throws Yue.C7158 {
            r1 = this;
            Yue.ۥۢۦۢۧ r0 = new Yue.ۥۢۦۢۧ
            r0.<init>(r2)
            Yue.ۥ۟ۦۧ۟ r2 = r1.f24708
            r0.m27593(r2)
            return r0
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.InterfaceC7162 mo27529(javax.xml.transform.Result r1) throws Yue.C7158 {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public java.lang.Object mo27530(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۟ۦۧ۟ r0 = r1.f24708
            java.lang.Object r2 = r0.m7180(r2)
            return r2
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo27531(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۟ۦۧ۟ r0 = r1.f24708
            boolean r2 = r0.m7187(r2)
            return r2
    }

    @Override // Yue.AbstractC7153
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo27532(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            Yue.ۥ۟ۦۧ۟ r0 = r1.f24708
            r0.m7196(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m27533() {
            r1 = this;
            Yue.ۥ۟ۦۧ۟ r0 = r1.f24708
            boolean r0 = r0.m7186()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m27534(boolean r2) {
            r1 = this;
            Yue.ۥ۟ۦۧ۟ r0 = r1.f24708
            r0.m7195(r2)
            return
    }
}
