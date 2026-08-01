package androidx.documentfile.provider;

/* JADX INFO: loaded from: classes2.dex */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final java.lang.String TAG = "DocumentFile";

    private DocumentsContractApi19() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canRead(android.content.Context r3, android.net.Uri r4) {
            r0 = 1
            int r1 = r3.checkCallingOrSelfUriPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L9
            return r2
        L9:
            java.lang.String r1 = getRawType(r3, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L14
            return r2
        L14:
            return r0
    }

    public static boolean canWrite(android.content.Context r5, android.net.Uri r6) {
            r0 = 2
            int r0 = r5.checkCallingOrSelfUriPermission(r6, r0)
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = getRawType(r5, r6)
            java.lang.String r2 = "flags"
            int r2 = queryForInt(r5, r6, r2, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L1a
            return r1
        L1a:
            r3 = r2 & 4
            r4 = 1
            if (r3 == 0) goto L20
            return r4
        L20:
            java.lang.String r3 = "vnd.android.document/directory"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2d
            r3 = r2 & 8
            if (r3 == 0) goto L2d
            return r4
        L2d:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L38
            r3 = r2 & 2
            if (r3 == 0) goto L38
            return r4
        L38:
            return r1
    }

    private static void closeQuietly(java.lang.AutoCloseable r1) {
            if (r1 == 0) goto La
            r1.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L8
            goto La
        L6:
            r0 = move-exception
            goto La
        L8:
            r0 = move-exception
            throw r0
        La:
            return
    }

    public static boolean exists(android.content.Context r9, android.net.Uri r10) {
            android.content.ContentResolver r6 = r9.getContentResolver()
            r7 = 0
            r8 = 0
            java.lang.String r0 = "document_id"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r10
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r7 = r0
            int r0 = r7.getCount()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            if (r0 <= 0) goto L1d
            r8 = 1
        L1d:
            closeQuietly(r7)
            return r8
        L21:
            r0 = move-exception
            goto L41
        L23:
            r0 = move-exception
            java.lang.String r1 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "Failed query: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L21
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L21
            closeQuietly(r7)
            return r8
        L41:
            closeQuietly(r7)
            throw r0
    }

    public static long getFlags(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "flags"
            r1 = 0
            long r0 = queryForLong(r3, r4, r0, r1)
            return r0
    }

    public static java.lang.String getName(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "_display_name"
            r1 = 0
            java.lang.String r0 = queryForString(r2, r3, r0, r1)
            return r0
    }

    private static java.lang.String getRawType(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "mime_type"
            r1 = 0
            java.lang.String r0 = queryForString(r2, r3, r0, r1)
            return r0
    }

    public static java.lang.String getType(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = getRawType(r2, r3)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Le
            r1 = 0
            return r1
        Le:
            return r0
    }

    public static boolean isDirectory(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = "vnd.android.document/directory"
            java.lang.String r1 = getRawType(r2, r3)
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static boolean isFile(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = getRawType(r2, r3)
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static boolean isVirtual(android.content.Context r6, android.net.Uri r7) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r6, r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            long r2 = getFlags(r6, r7)
            r4 = 512(0x200, double:2.53E-321)
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L16
            r1 = 1
        L16:
            return r1
    }

    public static long lastModified(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "last_modified"
            r1 = 0
            long r0 = queryForLong(r3, r4, r0, r1)
            return r0
    }

    public static long length(android.content.Context r3, android.net.Uri r4) {
            java.lang.String r0 = "_size"
            r1 = 0
            long r0 = queryForLong(r3, r4, r0, r1)
            return r0
    }

    private static int queryForInt(android.content.Context r2, android.net.Uri r3, java.lang.String r4, int r5) {
            long r0 = (long) r5
            long r0 = queryForLong(r2, r3, r4, r0)
            int r0 = (int) r0
            return r0
    }

    private static long queryForLong(android.content.Context r8, android.net.Uri r9, java.lang.String r10, long r11) {
            android.content.ContentResolver r6 = r8.getContentResolver()
            r7 = 0
            java.lang.String[] r2 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r9
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r7 = r0
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r0 == 0) goto L28
            r0 = 0
            boolean r1 = r7.isNull(r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r1 != 0) goto L28
            long r0 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            closeQuietly(r7)
            return r0
        L28:
            closeQuietly(r7)
            return r11
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            r0 = move-exception
            java.lang.String r1 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Failed query: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L2d
            closeQuietly(r7)
            return r11
        L4d:
            closeQuietly(r7)
            throw r0
    }

    private static java.lang.String queryForString(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String r11) {
            android.content.ContentResolver r6 = r8.getContentResolver()
            r7 = 0
            java.lang.String[] r2 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r9
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r7 = r0
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r0 == 0) goto L28
            r0 = 0
            boolean r1 = r7.isNull(r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r1 != 0) goto L28
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            closeQuietly(r7)
            return r0
        L28:
            closeQuietly(r7)
            return r11
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            r0 = move-exception
            java.lang.String r1 = "DocumentFile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Failed query: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L2d
            closeQuietly(r7)
            return r11
        L4d:
            closeQuietly(r7)
            throw r0
    }
}
