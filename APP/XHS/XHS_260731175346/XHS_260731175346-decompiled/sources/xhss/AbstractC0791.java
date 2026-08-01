package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛸᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0791 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0174 f2579 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C1084 f2580 = null;

    static {
            xhss.ᲇᲀᲈᛲ r0 = new xhss.ᲇᲀᲈᛲ
            r1 = 2
            r0.<init>(r1)
            xhss.AbstractC0791.f2580 = r0
            xhss.ᛲᛶᛴᲀ r0 = new xhss.ᛲᛶᛴᲀ
            r1 = 0
            r0.<init>(r1)
            xhss.AbstractC0791.f2579 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static android.content.pm.ProviderInfo m1357(android.content.pm.PackageManager r9, xhss.C0622 r10, android.content.res.Resources r11) {
            xhss.ᛲᛶᛴᲀ r0 = xhss.AbstractC0791.f2579
            xhss.ᲇᲀᲈᛲ r1 = xhss.AbstractC0791.f2580
            java.lang.String r2 = "Found content provider "
            java.lang.String r3 = "No package found for authority: "
            java.lang.String r4 = "FontProvider.getProvider"
            xhss.AbstractC0060.m180(r4)
            java.util.List r4 = r10.f2146     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = r10.f2144
            java.lang.String r10 = r10.f2141
            r6 = 0
            if (r4 == 0) goto L17
            goto L1b
        L17:
            java.util.List r4 = xhss.C0915.m1491(r11, r6)     // Catch: java.lang.Throwable -> Ld9
        L1b:
            xhss.ᛴᛲᛷᛸ r11 = new xhss.ᛴᛲᛷᛸ     // Catch: java.lang.Throwable -> Ld9
            r11.<init>()     // Catch: java.lang.Throwable -> Ld9
            r11.f1267 = r5     // Catch: java.lang.Throwable -> Ld9
            r11.f1265 = r10     // Catch: java.lang.Throwable -> Ld9
            r11.f1266 = r4     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r7 = r1.m1745(r11)     // Catch: java.lang.Throwable -> Ld9
            android.content.pm.ProviderInfo r7 = (android.content.pm.ProviderInfo) r7     // Catch: java.lang.Throwable -> Ld9
            if (r7 == 0) goto L32
            android.os.Trace.endSection()
            return r7
        L32:
            android.content.pm.ProviderInfo r7 = r9.resolveContentProvider(r5, r6)     // Catch: java.lang.Throwable -> Ld9
            if (r7 == 0) goto Lc7
            java.lang.String r3 = r7.packageName     // Catch: java.lang.Throwable -> Ld9
            boolean r3 = r3.equals(r10)     // Catch: java.lang.Throwable -> Ld9
            if (r3 == 0) goto Lad
            java.lang.String r10 = r7.packageName     // Catch: java.lang.Throwable -> Ld9
            r2 = 64
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r10, r2)     // Catch: java.lang.Throwable -> Ld9
            android.content.pm.Signature[] r9 = r9.signatures     // Catch: java.lang.Throwable -> Ld9
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld9
            r10.<init>()     // Catch: java.lang.Throwable -> Ld9
            int r2 = r9.length     // Catch: java.lang.Throwable -> Ld9
            r3 = r6
        L51:
            if (r3 >= r2) goto L5f
            r5 = r9[r3]     // Catch: java.lang.Throwable -> Ld9
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> Ld9
            r10.add(r5)     // Catch: java.lang.Throwable -> Ld9
            int r3 = r3 + 1
            goto L51
        L5f:
            java.util.Collections.sort(r10, r0)     // Catch: java.lang.Throwable -> Ld9
            r9 = r6
        L63:
            int r2 = r4.size()     // Catch: java.lang.Throwable -> Ld9
            if (r9 >= r2) goto La8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r3 = r4.get(r9)     // Catch: java.lang.Throwable -> Ld9
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> Ld9
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ld9
            java.util.Collections.sort(r2, r0)     // Catch: java.lang.Throwable -> Ld9
            int r3 = r10.size()     // Catch: java.lang.Throwable -> Ld9
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Ld9
            if (r3 == r5) goto L82
            goto L9b
        L82:
            r3 = r6
        L83:
            int r5 = r10.size()     // Catch: java.lang.Throwable -> Ld9
            if (r3 >= r5) goto La1
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> Ld9
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r8 = r2.get(r3)     // Catch: java.lang.Throwable -> Ld9
            byte[] r8 = (byte[]) r8     // Catch: java.lang.Throwable -> Ld9
            boolean r5 = java.util.Arrays.equals(r5, r8)     // Catch: java.lang.Throwable -> Ld9
            if (r5 != 0) goto L9e
        L9b:
            int r9 = r9 + 1
            goto L63
        L9e:
            int r3 = r3 + 1
            goto L83
        La1:
            r1.m1744(r11, r7)     // Catch: java.lang.Throwable -> Ld9
            android.os.Trace.endSection()
            return r7
        La8:
            android.os.Trace.endSection()
            r9 = 0
            return r9
        Lad:
            android.content.pm.PackageManager$NameNotFoundException r9 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Ld9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r11.<init>(r2)     // Catch: java.lang.Throwable -> Ld9
            r11.append(r5)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = ", but package was not "
            r11.append(r0)     // Catch: java.lang.Throwable -> Ld9
            r11.append(r10)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Ld9
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Ld9
            throw r9     // Catch: java.lang.Throwable -> Ld9
        Lc7:
            android.content.pm.PackageManager$NameNotFoundException r9 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Ld9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9
            r10.<init>(r3)     // Catch: java.lang.Throwable -> Ld9
            r10.append(r5)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Ld9
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Ld9
            throw r9     // Catch: java.lang.Throwable -> Ld9
        Ld9:
            r9 = move-exception
            android.os.Trace.endSection()
            throw r9
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static xhss.C0486[] m1358(android.content.Context r20, xhss.C0622 r21, java.lang.String r22) {
            r1 = r21
            r0 = r22
            java.lang.String r2 = "content"
            java.lang.String r3 = "FontProvider.query"
            xhss.AbstractC0060.m180(r3)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14c
            r3.<init>()     // Catch: java.lang.Throwable -> L14c
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L14c
            r4.<init>()     // Catch: java.lang.Throwable -> L14c
            android.net.Uri$Builder r4 = r4.scheme(r2)     // Catch: java.lang.Throwable -> L14c
            android.net.Uri$Builder r4 = r4.authority(r0)     // Catch: java.lang.Throwable -> L14c
            android.net.Uri r6 = r4.build()     // Catch: java.lang.Throwable -> L14c
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L14c
            r4.<init>()     // Catch: java.lang.Throwable -> L14c
            android.net.Uri$Builder r2 = r4.scheme(r2)     // Catch: java.lang.Throwable -> L14c
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch: java.lang.Throwable -> L14c
            java.lang.String r2 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r2)     // Catch: java.lang.Throwable -> L14c
            android.net.Uri r2 = r0.build()     // Catch: java.lang.Throwable -> L14c
            android.content.ContentResolver r0 = r20.getContentResolver()     // Catch: java.lang.Throwable -> L14c
            android.content.ContentProviderClient r5 = r0.acquireUnstableContentProviderClient(r6)     // Catch: java.lang.Throwable -> L14c
            r4 = 0
            java.lang.String r7 = "_id"
            java.lang.String r8 = "file_id"
            java.lang.String r9 = "font_ttc_index"
            java.lang.String r10 = "font_variation_settings"
            java.lang.String r11 = "font_weight"
            java.lang.String r12 = "font_italic"
            java.lang.String r13 = "result_code"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> Lda
            java.lang.String r0 = "ContentQueryWrapper.query"
            xhss.AbstractC0060.m180(r0)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r8 = "query = ?"
            java.lang.String r0 = r1.f2147     // Catch: java.lang.Throwable -> L13c
            java.lang.String r9 = r1.f2142     // Catch: java.lang.Throwable -> L13c
            if (r0 == 0) goto L7f
            int r10 = r0.length()     // Catch: java.lang.Throwable -> L13c
            r11 = 0
        L65:
            if (r11 >= r10) goto L7f
            int r13 = r0.codePointAt(r11)     // Catch: java.lang.Throwable -> L13c
            boolean r14 = java.lang.Character.isWhitespace(r13)     // Catch: java.lang.Throwable -> L13c
            if (r14 != 0) goto L79
            java.lang.String r0 = "VF"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0}     // Catch: java.lang.Throwable -> L13c
        L77:
            r9 = r0
            goto L84
        L79:
            int r13 = java.lang.Character.charCount(r13)     // Catch: java.lang.Throwable -> L13c
            int r11 = r11 + r13
            goto L65
        L7f:
            java.lang.String[] r0 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L13c
            goto L77
        L84:
            if (r5 != 0) goto L87
            goto L96
        L87:
            r11 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L8e java.lang.Throwable -> L13c
            goto L96
        L8e:
            r0 = move-exception
            java.lang.String r7 = "FontsProvider"
            java.lang.String r8 = "Unable to query the content provider"
            android.util.Log.w(r7, r8, r0)     // Catch: java.lang.Throwable -> L13c
        L96:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lda
            if (r4 == 0) goto L125
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> Lda
            if (r0 <= 0) goto L125
            java.lang.String r0 = "result_code"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> Lda
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lda
            r3.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r7 = "_id"
            int r7 = r4.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r8 = "file_id"
            int r8 = r4.getColumnIndex(r8)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r9 = "font_ttc_index"
            int r9 = r4.getColumnIndex(r9)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r10 = "font_weight"
            int r10 = r4.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r11 = "font_italic"
            int r11 = r4.getColumnIndex(r11)     // Catch: java.lang.Throwable -> Lda
        Lca:
            boolean r13 = r4.moveToNext()     // Catch: java.lang.Throwable -> Lda
            if (r13 == 0) goto L125
            r13 = -1
            if (r0 == r13) goto Ldd
            int r14 = r4.getInt(r0)     // Catch: java.lang.Throwable -> Lda
            r19 = r14
            goto Ldf
        Lda:
            r0 = move-exception
            goto L141
        Ldd:
            r19 = 0
        Ldf:
            if (r9 == r13) goto Le7
            int r14 = r4.getInt(r9)     // Catch: java.lang.Throwable -> Lda
            r15 = r14
            goto Le8
        Le7:
            r15 = 0
        Le8:
            if (r8 != r13) goto Lf5
            long r12 = r4.getLong(r7)     // Catch: java.lang.Throwable -> Lda
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r6, r12)     // Catch: java.lang.Throwable -> Lda
        Lf2:
            r14 = r12
            r12 = -1
            goto Lfe
        Lf5:
            long r12 = r4.getLong(r8)     // Catch: java.lang.Throwable -> Lda
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r2, r12)     // Catch: java.lang.Throwable -> Lda
            goto Lf2
        Lfe:
            if (r10 == r12) goto L107
            int r13 = r4.getInt(r10)     // Catch: java.lang.Throwable -> Lda
        L104:
            r16 = r13
            goto L10a
        L107:
            r13 = 400(0x190, float:5.6E-43)
            goto L104
        L10a:
            if (r11 == r12) goto L116
            int r12 = r4.getInt(r11)     // Catch: java.lang.Throwable -> Lda
            r13 = 1
            if (r12 != r13) goto L116
            r17 = r13
            goto L118
        L116:
            r17 = 0
        L118:
            java.lang.String r12 = r1.f2147     // Catch: java.lang.Throwable -> Lda
            xhss.ᛵᛶᲈᛳ r13 = new xhss.ᛵᛶᲈᛳ     // Catch: java.lang.Throwable -> Lda
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lda
            r3.add(r13)     // Catch: java.lang.Throwable -> Lda
            goto Lca
        L125:
            if (r4 == 0) goto L12a
            r4.close()     // Catch: java.lang.Throwable -> L14c
        L12a:
            if (r5 == 0) goto L12f
            r5.close()     // Catch: java.lang.Throwable -> L14c
        L12f:
            r1 = 0
            xhss.ᛵᛶᲈᛳ[] r0 = new xhss.C0486[r1]     // Catch: java.lang.Throwable -> L14c
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch: java.lang.Throwable -> L14c
            xhss.ᛵᛶᲈᛳ[] r0 = (xhss.C0486[]) r0     // Catch: java.lang.Throwable -> L14c
            android.os.Trace.endSection()
            return r0
        L13c:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lda
            throw r0     // Catch: java.lang.Throwable -> Lda
        L141:
            if (r4 == 0) goto L146
            r4.close()     // Catch: java.lang.Throwable -> L14c
        L146:
            if (r5 == 0) goto L14b
            r5.close()     // Catch: java.lang.Throwable -> L14c
        L14b:
            throw r0     // Catch: java.lang.Throwable -> L14c
        L14c:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0107 m1359(android.content.Context r6, java.util.List r7) {
            java.lang.String r0 = "FontProvider.getFontFamilyResult"
            xhss.AbstractC0060.m180(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L67
            r0.<init>()     // Catch: java.lang.Throwable -> L67
            r1 = 0
        Lb:
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L67
            r3 = 2
            if (r1 >= r2) goto L5e
            java.lang.Object r2 = r7.get(r1)     // Catch: java.lang.Throwable -> L67
            xhss.ᛷᛱᛲᲇ r2 = (xhss.C0622) r2     // Catch: java.lang.Throwable -> L67
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L67
            r5 = 31
            if (r4 < r5) goto L3b
            java.lang.String r4 = r2.f2143     // Catch: java.lang.Throwable -> L67
            android.graphics.Typeface r5 = xhss.AbstractC0101.m269(r4)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L3b
            android.graphics.fonts.Font r5 = xhss.AbstractC0101.m272(r5)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L3b
            xhss.ᛵᛶᲈᛳ r3 = new xhss.ᛵᛶᲈᛳ     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r2.f2147     // Catch: java.lang.Throwable -> L67
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L67
            xhss.ᛵᛶᲈᛳ[] r2 = new xhss.C0486[]{r3}     // Catch: java.lang.Throwable -> L67
            r0.add(r2)     // Catch: java.lang.Throwable -> L67
            goto L5b
        L3b:
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L67
            android.content.res.Resources r5 = r6.getResources()     // Catch: java.lang.Throwable -> L67
            android.content.pm.ProviderInfo r4 = m1357(r4, r2, r5)     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L52
            xhss.ᛱᲇᛴᲇ r6 = new xhss.ᛱᲇᛴᲇ     // Catch: java.lang.Throwable -> L67
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L67
            android.os.Trace.endSection()
            return r6
        L52:
            java.lang.String r3 = r4.authority     // Catch: java.lang.Throwable -> L67
            xhss.ᛵᛶᲈᛳ[] r2 = m1358(r6, r2, r3)     // Catch: java.lang.Throwable -> L67
            r0.add(r2)     // Catch: java.lang.Throwable -> L67
        L5b:
            int r1 = r1 + 1
            goto Lb
        L5e:
            xhss.ᛱᲇᛴᲇ r6 = new xhss.ᛱᲇᛴᲇ     // Catch: java.lang.Throwable -> L67
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L67
            android.os.Trace.endSection()
            return r6
        L67:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
    }
}
