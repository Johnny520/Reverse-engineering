package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public class C6452 extends Yue.AbstractC1952 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.Context f22735;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.net.Uri f22736;

    public C6452(@Yue.InterfaceC4544 Yue.AbstractC1952 r1, android.content.Context r2, android.net.Uri r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f22735 = r2
            r0.f22736 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m23766(@Yue.InterfaceC4544 java.lang.AutoCloseable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static android.net.Uri m23767(android.content.Context r0, android.net.Uri r1, java.lang.String r2, java.lang.String r3) {
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L9
            android.net.Uri r0 = android.provider.DocumentsContract.createDocument(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ */
    public boolean mo8990() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            boolean r0 = Yue.C1954.m9014(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo8991() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            boolean r0 = Yue.C1954.m9015(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.AbstractC1952 mo8992(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.f22735
            android.net.Uri r1 = r3.f22736
            java.lang.String r2 = "vnd.android.document/directory"
            android.net.Uri r4 = m23767(r0, r1, r2, r4)
            if (r4 == 0) goto L14
            Yue.ۥۢۢۡۨ r0 = new Yue.ۥۢۢۡۨ
            android.content.Context r1 = r3.f22735
            r0.<init>(r3, r1, r4)
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Yue.AbstractC1952 mo8993(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            android.net.Uri r3 = m23767(r0, r1, r3, r4)
            if (r3 == 0) goto L12
            Yue.ۥۢۢۡۨ r4 = new Yue.ۥۢۢۡۨ
            android.content.Context r0 = r2.f22735
            r4.<init>(r2, r0, r3)
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo8994() {
            r2 = this;
            android.content.Context r0 = r2.f22735     // Catch: java.lang.Exception -> Ld
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> Ld
            android.net.Uri r1 = r2.f22736     // Catch: java.lang.Exception -> Ld
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
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            boolean r0 = Yue.C1954.m9017(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.String mo8997() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            java.lang.String r0 = Yue.C1954.m9019(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public java.lang.String mo8999() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            java.lang.String r0 = Yue.C1954.m9021(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public android.net.Uri mo9000() {
            r1 = this;
            android.net.Uri r0 = r1.f22736
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo9001() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            boolean r0 = Yue.C1954.m9022(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo9002() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            boolean r0 = Yue.C1954.m9023(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo9003() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            boolean r0 = Yue.C1954.m9024(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public long mo9004() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            long r0 = Yue.C1954.m9025(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public long mo9005() {
            r2 = this;
            android.content.Context r0 = r2.f22735
            android.net.Uri r1 = r2.f22736
            long r0 = Yue.C1954.m9026(r0, r1)
            return r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public Yue.AbstractC1952[] mo9006() {
            r9 = this;
            android.content.Context r0 = r9.f22735
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri r0 = r9.f22736
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r2 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = 0
            r8 = 0
            java.lang.String r3 = "document_id"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r5 = 0
            r6 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
        L24:
            boolean r1 = r8.moveToNext()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            if (r1 == 0) goto L3c
            java.lang.String r1 = r8.getString(r7)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            android.net.Uri r2 = r9.f22736     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            android.net.Uri r1 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r2, r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r0.add(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            goto L24
        L38:
            r0 = move-exception
            goto L78
        L3a:
            r1 = move-exception
            goto L40
        L3c:
            m23766(r8)
            goto L57
        L40:
            java.lang.String r2 = "DocumentFile"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "Failed query: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L38
            r3.append(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L38
            goto L3c
        L57:
            int r1 = r0.size()
            android.net.Uri[] r1 = new android.net.Uri[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            int r1 = r0.length
            Yue.ۥ۠۟ۧۦ[] r1 = new Yue.AbstractC1952[r1]
        L66:
            int r2 = r0.length
            if (r7 >= r2) goto L77
            Yue.ۥۢۢۡۨ r2 = new Yue.ۥۢۢۡۨ
            android.content.Context r3 = r9.f22735
            r4 = r0[r7]
            r2.<init>(r9, r3, r4)
            r1[r7] = r2
            int r7 = r7 + 1
            goto L66
        L77:
            return r1
        L78:
            m23766(r8)
            throw r0
    }

    @Override // Yue.AbstractC1952
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public boolean mo9007(java.lang.String r4) {
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.f22735     // Catch: java.lang.Exception -> L13
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L13
            android.net.Uri r2 = r3.f22736     // Catch: java.lang.Exception -> L13
            android.net.Uri r4 = android.provider.DocumentsContract.renameDocument(r1, r2, r4)     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L13
            r3.f22736 = r4     // Catch: java.lang.Exception -> L13
            r4 = 1
            return r4
        L13:
            return r0
    }
}
