package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(19)
public class C5793 extends Yue.AbstractC1952 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.Context f21286;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.net.Uri f21287;

    public C5793(@Yue.InterfaceC4544 Yue.AbstractC1952 r1, android.content.Context r2, android.net.Uri r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f21286 = r2
            r0.f21287 = r3
            return
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ */
    public boolean mo8990() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            boolean r0 = Yue.C1954.m9014(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo8991() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            boolean r0 = Yue.C1954.m9015(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.AbstractC1952 mo8992(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Yue.AbstractC1952 mo8993(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo8994() {
            r2 = this;
            android.content.Context r0 = r2.f21286     // Catch: java.lang.Exception -> Ld
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Ld
            android.net.Uri r1 = r2.f21287     // Catch: java.lang.Exception -> Ld
            boolean r0 = android.provider.DocumentsContract.deleteDocument(r0, r1)     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo8995() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            boolean r0 = Yue.C1954.m9017(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.String mo8997() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            java.lang.String r0 = Yue.C1954.m9019(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public java.lang.String mo8999() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            java.lang.String r0 = Yue.C1954.m9021(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public android.net.Uri mo9000() {
            r1 = this;
            android.net.Uri r0 = r1.f21287
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo9001() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            boolean r0 = Yue.C1954.m9022(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo9002() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            boolean r0 = Yue.C1954.m9023(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo9003() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            boolean r0 = Yue.C1954.m9024(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public long mo9004() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            long r0 = Yue.C1954.m9025(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public long mo9005() {
            r2 = this;
            android.content.Context r0 = r2.f21286
            android.net.Uri r1 = r2.f21287
            long r0 = Yue.C1954.m9026(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public Yue.AbstractC1952[] mo9006() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo9007(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
