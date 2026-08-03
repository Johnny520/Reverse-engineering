package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(19)
public class C1954 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f6123 = "DocumentFile";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f6124 = 512;

    public C1954() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m9014(android.content.Context r3, android.net.Uri r4) {
            r0 = 1
            int r1 = r3.checkCallingOrSelfUriPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.String r3 = m9020(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L14
            return r2
        L14:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m9015(android.content.Context r4, android.net.Uri r5) {
            r0 = 2
            int r1 = r4.checkCallingOrSelfUriPermission(r5, r0)
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.String r1 = m9020(r4, r5)
            java.lang.String r3 = "flags"
            int r4 = m9027(r4, r5, r3, r2)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L1a
            return r2
        L1a:
            r5 = r4 & 4
            r3 = 1
            if (r5 == 0) goto L20
            return r3
        L20:
            java.lang.String r5 = "vnd.android.document/directory"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2d
            r5 = r4 & 8
            if (r5 == 0) goto L2d
            return r3
        L2d:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L37
            r4 = r4 & r0
            if (r4 == 0) goto L37
            return r3
        L37:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m9016(@Yue.InterfaceC4544 java.lang.AutoCloseable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m9017(android.content.Context r7, android.net.Uri r8) {
            android.content.ContentResolver r0 = r7.getContentResolver()
            r7 = 0
            r6 = 0
            java.lang.String r1 = "document_id"
            java.lang.String[] r2 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r8
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            int r8 = r6.getCount()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r8 <= 0) goto L1b
            r7 = 1
        L1b:
            m9016(r6)
            return r7
        L1f:
            r7 = move-exception
            goto L3c
        L21:
            r8 = move-exception
            java.lang.String r0 = "DocumentFile"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "Failed query: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            r1.append(r8)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            android.util.Log.w(r0, r8)     // Catch: java.lang.Throwable -> L1f
            m9016(r6)
            return r7
        L3c:
            m9016(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m9018(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "flags"
            r1 = 0
            long r3 = m9028(r3, r4, r0, r1)
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String m9019(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "_display_name"
            r1 = 0
            java.lang.String r2 = m9029(r2, r3, r0, r1)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String m9020(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "mime_type"
            r1 = 0
            java.lang.String r2 = m9029(r2, r3, r0, r1)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m9021(android.content.Context r0, android.net.Uri r1) {
            java.lang.String r0 = m9020(r0, r1)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ld
            r0 = 0
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m9022(android.content.Context r1, android.net.Uri r2) {
            java.lang.String r0 = "vnd.android.document/directory"
            java.lang.String r1 = m9020(r1, r2)
            boolean r1 = r0.equals(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m9023(android.content.Context r0, android.net.Uri r1) {
            java.lang.String r0 = m9020(r0, r1)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m9024(android.content.Context r4, android.net.Uri r5) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r4, r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            long r4 = m9018(r4, r5)
            r2 = 512(0x200, double:2.53E-321)
            long r4 = r4 & r2
            r2 = 0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            r1 = 1
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static long m9025(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "last_modified"
            r1 = 0
            long r3 = m9028(r3, r4, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static long m9026(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "_size"
            r1 = 0
            long r3 = m9028(r3, r4, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m9027(android.content.Context r2, android.net.Uri r3, java.lang.String r4, int r5) {
            long r0 = (long) r5
            long r2 = m9028(r2, r3, r4, r0)
            int r2 = (int) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static long m9028(android.content.Context r6, android.net.Uri r7, java.lang.String r8, long r9) {
            android.content.ContentResolver r0 = r6.getContentResolver()
            r6 = 0
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r7
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r7 == 0) goto L2a
            r7 = 0
            boolean r8 = r6.isNull(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r8 != 0) goto L2a
            long r7 = r6.getLong(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            m9016(r6)
            return r7
        L26:
            r7 = move-exception
            goto L48
        L28:
            r7 = move-exception
            goto L2e
        L2a:
            m9016(r6)
            return r9
        L2e:
            java.lang.String r8 = "DocumentFile"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "Failed query: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L26
            r0.append(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L26
            android.util.Log.w(r8, r7)     // Catch: java.lang.Throwable -> L26
            m9016(r6)
            return r9
        L48:
            m9016(r6)
            throw r7
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.lang.String m9029(android.content.Context r6, android.net.Uri r7, java.lang.String r8, @Yue.InterfaceC4544 java.lang.String r9) {
            android.content.ContentResolver r0 = r6.getContentResolver()
            r6 = 0
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r7
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r7 == 0) goto L2a
            r7 = 0
            boolean r8 = r6.isNull(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            if (r8 != 0) goto L2a
            java.lang.String r7 = r6.getString(r7)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            m9016(r6)
            return r7
        L26:
            r7 = move-exception
            goto L48
        L28:
            r7 = move-exception
            goto L2e
        L2a:
            m9016(r6)
            return r9
        L2e:
            java.lang.String r8 = "DocumentFile"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "Failed query: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L26
            r0.append(r7)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L26
            android.util.Log.w(r8, r7)     // Catch: java.lang.Throwable -> L26
            m9016(r6)
            return r9
        L48:
            m9016(r6)
            throw r7
    }
}
