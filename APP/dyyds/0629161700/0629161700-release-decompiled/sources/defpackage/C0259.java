package defpackage;

/* JADX INFO: renamed from: ᛲᛳᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0259 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0259 f1512 = null;

    static {
            r0 = -435930875207214(0xfffe7385ef0961d2, double:NaN)
            ᛲᛳᛱᛲ r0 = new ᛲᛳᛱᛲ
            r0.<init>()
            defpackage.C0259.f1512 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.io.OutputStream m885(android.content.Context r8, java.lang.String r9) {
            r0 = -434277312798254(0xfffe7506ef0961d2, double:NaN)
            r0 = -434311672536622(0xfffe74feef0961d2, double:NaN)
            ᛱᲇᲈᛵ r9 = m887(r9)
            r0 = 0
            if (r9 != 0) goto L18
            return r0
        L18:
            android.net.Uri r1 = r9.f1309
            java.lang.String r9 = r9.f1308
            r2 = 1
            char[] r3 = new char[r2]
            r4 = 47
            r5 = 0
            r3[r5] = r4
            java.util.List r9 = defpackage.AbstractC1347.m2502(r9, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r9.iterator()
        L31:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r9.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = defpackage.AbstractC1347.m2524(r5)
            if (r5 != 0) goto L31
            r3.add(r4)
            goto L31
        L48:
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L50
            r9 = r0
            goto L59
        L50:
            int r9 = r3.size()
            int r9 = r9 - r2
            java.lang.Object r9 = r3.get(r9)
        L59:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L10a
            java.util.List r2 = defpackage.AbstractC1107.m2120(r3)
            java.lang.String r3 = android.provider.DocumentsContract.getTreeDocumentId(r1)
            android.net.Uri r3 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r3)
            r4 = -435488493575726(0xfffe73ecef0961d2, double:NaN)
            java.util.Iterator r2 = r2.iterator()
        L75:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lb8
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = -435050406911534(0xfffe7452ef0961d2, double:NaN)
            java.lang.String r5 = "vnd.android.document/directory"
            ᛲᛳᛱᛲ r6 = defpackage.C0259.f1512
            r6.getClass()
            android.net.Uri r5 = m889(r8, r1, r3, r4, r5)
            if (r5 != 0) goto Lb6
            android.content.ContentResolver r5 = r8.getContentResolver()
            r6 = -435183550897710(0xfffe7433ef0961d2, double:NaN)
            java.lang.String r6 = "vnd.android.document/directory"
            android.net.Uri r3 = android.provider.DocumentsContract.createDocument(r5, r3, r6, r4)
            if (r3 == 0) goto La9
            goto L75
        La9:
            r8 = -435316694883886(0xfffe7414ef0961d2, double:NaN)
            java.lang.String r8 = "无法创建目录: "
            defpackage.C2264.m3674(r4, r8)
            return r0
        Lb6:
            r3 = r5
            goto L75
        Lb8:
            android.net.Uri r1 = m889(r8, r1, r3, r9, r0)
            if (r1 == 0) goto Lbf
            goto Ld8
        Lbf:
            java.lang.String r1 = java.net.URLConnection.guessContentTypeFromName(r9)
            if (r1 != 0) goto Lce
            r1 = -434904378023470(0xfffe7474ef0961d2, double:NaN)
            java.lang.String r1 = "application/octet-stream"
        Lce:
            android.content.ContentResolver r2 = r8.getContentResolver()
            android.net.Uri r1 = android.provider.DocumentsContract.createDocument(r2, r3, r1, r9)
            if (r1 == 0) goto Lf9
        Ld8:
            android.content.ContentResolver r8 = r8.getContentResolver()
            r2 = -434350327242286(0xfffe74f5ef0961d2, double:NaN)
            java.lang.String r9 = "rwt"
            java.io.OutputStream r8 = r8.openOutputStream(r1, r9)
            if (r8 == 0) goto Lec
            return r8
        Lec:
            r8 = -434367507111470(0xfffe74f1ef0961d2, double:NaN)
            java.lang.String r8 = "无法写入选择的文件夹"
            defpackage.C2264.m3676(r8)
            return r0
        Lf9:
            r1 = -435011752205870(0xfffe745bef0961d2, double:NaN)
            java.lang.String r8 = "无法创建文件: "
            java.lang.String r8 = r8.concat(r9)
            defpackage.C2264.m3676(r8)
            return r0
        L10a:
            r8 = -434878608219694(0xfffe747aef0961d2, double:NaN)
            java.lang.String r8 = "文件名为空"
            defpackage.C2264.m3676(r8)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.String m886(java.lang.String r3) {
            java.lang.CharSequence r3 = defpackage.AbstractC1347.m2521(r3)
            java.lang.String r3 = r3.toString()
            r0 = 92
            r1 = 47
            java.lang.String r3 = r3.replace(r0, r1)
            r0 = 1
            char[] r0 = new char[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r3 = defpackage.AbstractC1347.m2511(r3, r0)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0208 m887(java.lang.String r6) {
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5180
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221
            r2 = 76
            r2 = r1[r2]
            java.lang.Object r0 = r0.m3169(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = defpackage.AbstractC1347.m2524(r0)
            r3 = 0
            if (r2 != 0) goto L1b
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r0 != 0) goto L1f
            goto L79
        L1f:
            ᲀᲇᛸᛶ r2 = defpackage.C1141.f5206
            r4 = 77
            r1 = r1[r4]
            java.lang.Object r1 = r2.m3169(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = defpackage.AbstractC1347.m2524(r1)
            if (r2 != 0) goto L32
            goto L33
        L32:
            r1 = r3
        L33:
            if (r1 == 0) goto L79
            java.lang.String r1 = m886(r1)
            if (r1 == 0) goto L79
            java.lang.String r6 = m886(r6)
            java.lang.String r2 = "/"
            java.lang.String r4 = r1.concat(r2)
            boolean r4 = r6.startsWith(r4)
            if (r4 != 0) goto L4c
            goto L79
        L4c:
            java.lang.String r2 = r1.concat(r2)
            java.lang.String r6 = defpackage.AbstractC1347.m2513(r6, r2)
            r2 = 1
            char[] r2 = new char[r2]
            r4 = 47
            r5 = 0
            r2[r5] = r4
            java.lang.String r6 = defpackage.AbstractC1347.m2503(r6, r2)
            boolean r2 = defpackage.AbstractC1347.m2524(r6)
            if (r2 == 0) goto L67
            goto L79
        L67:
            ᛱᲇᲈᛵ r2 = new ᛱᲇᲈᛵ
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3 = -434831363579438(0xfffe7485ef0961d2, double:NaN)
            r2.<init>(r0, r1, r6)
            return r2
        L79:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m888(android.content.Context r7, java.lang.String r8) {
            r0 = -434414751751726(0xfffe74e6ef0961d2, double:NaN)
            r0 = -434449111490094(0xfffe74deef0961d2, double:NaN)
            ᛱᲇᲈᛵ r8 = m887(r8)
            if (r8 != 0) goto L18
            goto La1
        L18:
            android.net.Uri r0 = r8.f1309
            java.lang.String r8 = r8.f1308
            r1 = 1
            char[] r2 = new char[r1]
            r3 = 47
            r4 = 0
            r2[r4] = r3
            java.util.List r8 = defpackage.AbstractC1347.m2502(r8, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L31:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r8.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.AbstractC1347.m2524(r4)
            if (r4 != 0) goto L31
            r2.add(r3)
            goto L31
        L48:
            boolean r8 = r2.isEmpty()
            r3 = 0
            if (r8 == 0) goto L51
            r8 = r3
            goto L5a
        L51:
            int r8 = r2.size()
            int r8 = r8 - r1
            java.lang.Object r8 = r2.get(r8)
        L5a:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5f
            goto L9f
        L5f:
            java.util.List r1 = defpackage.AbstractC1107.m2120(r2)
            java.lang.String r2 = android.provider.DocumentsContract.getTreeDocumentId(r0)
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r0, r2)
            r4 = -435488493575726(0xfffe73ecef0961d2, double:NaN)
            java.util.Iterator r1 = r1.iterator()
        L77:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L98
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = -435355349589550(0xfffe740bef0961d2, double:NaN)
            java.lang.String r5 = "vnd.android.document/directory"
            ᛲᛳᛱᛲ r6 = defpackage.C0259.f1512
            r6.getClass()
            android.net.Uri r2 = m889(r7, r0, r2, r4, r5)
            if (r2 != 0) goto L77
            r2 = r3
        L98:
            if (r2 != 0) goto L9b
            goto L9f
        L9b:
            android.net.Uri r3 = m889(r7, r0, r2, r8, r3)
        L9f:
            if (r3 != 0) goto La2
        La1:
            return
        La2:
            android.content.ContentResolver r7 = r7.getContentResolver()
            android.provider.DocumentsContract.deleteDocument(r7, r3)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.net.Uri m889(android.content.Context r6, android.net.Uri r7, android.net.Uri r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r8 = android.provider.DocumentsContract.getDocumentId(r8)
            android.net.Uri r1 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r7, r8)
            r2 = -435621637561902(0xfffe73cdef0961d2, double:NaN)
            java.lang.String r8 = "document_id"
            r2 = -435673177169454(0xfffe73c1ef0961d2, double:NaN)
            java.lang.String r0 = "_display_name"
            r2 = -435733306711598(0xfffe73b3ef0961d2, double:NaN)
            java.lang.String r2 = "mime_type"
            java.lang.String[] r2 = new java.lang.String[]{r8, r0, r2}
            android.content.ContentResolver r0 = r6.getContentResolver()
            r4 = 0
            r5 = 0
            r3 = 0
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L92
            r0 = -435776256384558(0xfffe73a9ef0961d2, double:NaN)
            java.lang.String r8 = "document_id"     // Catch: java.lang.Throwable -> L78
            int r8 = r6.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L78
            r0 = -435827795992110(0xfffe739def0961d2, double:NaN)
            java.lang.String r0 = "_display_name"     // Catch: java.lang.Throwable -> L78
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L78
            r1 = -435887925534254(0xfffe738fef0961d2, double:NaN)
            java.lang.String r1 = "mime_type"     // Catch: java.lang.Throwable -> L78
            int r1 = r6.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L78
        L5b:
            boolean r2 = r6.moveToNext()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L87
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = r6.getString(r1)     // Catch: java.lang.Throwable -> L78
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r9)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L5b
            if (r10 == 0) goto L7b
            boolean r2 = defpackage.AbstractC0498.m1280(r3, r10)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L5b
            goto L7b
        L78:
            r0 = move-exception
            r7 = r0
            goto L8b
        L7b:
            java.lang.String r8 = r6.getString(r8)     // Catch: java.lang.Throwable -> L78
            android.net.Uri r7 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r7, r8)     // Catch: java.lang.Throwable -> L78
            r6.close()
            return r7
        L87:
            r6.close()
            goto L92
        L8b:
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r0 = move-exception
            r8 = r0
            defpackage.AbstractC2346.m3845(r6, r7)
            throw r8
        L92:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m890(java.lang.String r4, android.net.Uri r5) {
            r0 = -434096924171822(0xfffe7530ef0961d2, double:NaN)
            r0 = -434131283910190(0xfffe7528ef0961d2, double:NaN)
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            java.lang.String r5 = r5.toString()
            r1 = -434178528550446(0xfffe751def0961d2, double:NaN)
            r0.getClass()
            r0 = -18713457106478(0xffffeefaef0961d2, double:NaN)
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5180
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221
            r2 = 76
            r2 = r1[r2]
            r0.m3168(r2, r5)
            java.lang.String r4 = m886(r4)
            r2 = -18747816844846(0xffffeef2ef0961d2, double:NaN)
            ᲀᲇᛸᛶ r5 = defpackage.C1141.f5206
            r0 = 77
            r0 = r1[r0]
            r5.m3168(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.lang.String m891(android.net.Uri r5) {
            r0 = -434487766195758(0xfffe74d5ef0961d2, double:NaN)
            java.lang.String r0 = r5.getScheme()
            r1 = -434504946064942(0xfffe74d1ef0961d2, double:NaN)
            java.lang.String r1 = "file"
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.String r5 = r5.getPath()
            if (r5 == 0) goto L102
            java.lang.String r5 = m886(r5)
            return r5
        L27:
            java.lang.String r5 = android.provider.DocumentsContract.getTreeDocumentId(r5)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r5 = move-exception
            ᛴᛸᛲᲀ r0 = new ᛴᛸᛲᲀ
            r0.<init>(r5)
            r5 = r0
        L33:
            boolean r0 = r5 instanceof defpackage.C0723
            if (r0 == 0) goto L38
            r5 = r1
        L38:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L3e
            goto L102
        L3e:
            r2 = -434526420901422(0xfffe74ccef0961d2, double:NaN)
            java.lang.String r0 = "raw:"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L5f
            r0 = -434547895737902(0xfffe74c7ef0961d2, double:NaN)
            java.lang.String r0 = "raw:"
            java.lang.String r5 = defpackage.AbstractC1347.m2513(r5, r0)
            java.lang.String r5 = m886(r5)
            return r5
        L5f:
            r2 = -434569370574382(0xfffe74c2ef0961d2, double:NaN)
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r2 = 2
            java.util.List r5 = defpackage.AbstractC1347.m2519(r5, r0, r2)
            java.lang.Object r0 = defpackage.AbstractC1107.m2124(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L82
            r2 = -434577960508974(0xfffe74c0ef0961d2, double:NaN)
            java.lang.String r0 = ""
        L82:
            r2 = 1
            java.lang.Object r5 = defpackage.AbstractC1107.m2127(r2, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L94
            r3 = -434582255476270(0xfffe74bfef0961d2, double:NaN)
            java.lang.String r5 = ""
        L94:
            char[] r2 = new char[r2]
            r3 = 0
            r4 = 47
            r2[r3] = r4
            java.lang.String r5 = defpackage.AbstractC1347.m2503(r5, r2)
            r2 = -434586550443566(0xfffe74beef0961d2, double:NaN)
            java.lang.String r2 = "primary"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto Lb7
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            goto Le4
        Lb7:
            r2 = -434620910181934(0xfffe74b6ef0961d2, double:NaN)
            java.lang.String r2 = "home"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto Ld1
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOCUMENTS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            goto Le4
        Ld1:
            boolean r2 = defpackage.AbstractC1347.m2524(r0)
            if (r2 != 0) goto L102
            r1 = -434642385018414(0xfffe74b1ef0961d2, double:NaN)
            java.lang.String r1 = "/storage/"
            java.lang.String r0 = r1.concat(r0)
        Le4:
            boolean r1 = defpackage.AbstractC1347.m2524(r5)
            if (r1 == 0) goto Leb
            goto Lfd
        Leb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        Lfd:
            java.lang.String r5 = m886(r0)
            return r5
        L102:
            return r1
    }
}
