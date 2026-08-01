package defpackage;

/* JADX INFO: renamed from: ᲈᲀᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2323 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2301 f9815 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0297 f9816 = null;

    static {
            ᲈᛸᛲᛵ r0 = new ᲈᛸᛲᛵ
            r1 = 2
            r0.<init>(r1)
            defpackage.AbstractC2323.f9815 = r0
            ᛲᛵᲁᲁ r0 = new ᛲᛵᲁᲁ
            r0.<init>()
            defpackage.AbstractC2323.f9816 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0275[] m3795(android.content.Context r20, defpackage.C1982 r21, java.lang.String r22) {
            r1 = r21
            r0 = r22
            java.lang.String r2 = "content"
            java.lang.String r3 = "FontProvider.query"
            defpackage.AbstractC2193.m3597(r3)
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
            defpackage.AbstractC2193.m3597(r0)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r8 = "query = ?"
            java.lang.String r0 = r1.f8577     // Catch: java.lang.Throwable -> L13c
            java.lang.String r9 = r1.f8574     // Catch: java.lang.Throwable -> L13c
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
            java.lang.String r12 = r1.f8577     // Catch: java.lang.Throwable -> Lda
            ᛲᛳᲈᲁ r13 = new ᛲᛳᲈᲁ     // Catch: java.lang.Throwable -> Lda
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
            ᛲᛳᲈᲁ[] r0 = new defpackage.C0275[r1]     // Catch: java.lang.Throwable -> L14c
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch: java.lang.Throwable -> L14c
            ᛲᛳᲈᲁ[] r0 = (defpackage.C0275[]) r0     // Catch: java.lang.Throwable -> L14c
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C2073 m3796(android.content.Context r7, java.util.List r8) {
            java.lang.String r0 = "FontProvider.getFontFamilyResult"
            defpackage.AbstractC2193.m3597(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            r1 = 0
            r2 = r1
        Lc:
            int r3 = r8.size()     // Catch: java.lang.Throwable -> L68
            r4 = 3
            if (r2 >= r3) goto L5f
            java.lang.Object r3 = r8.get(r2)     // Catch: java.lang.Throwable -> L68
            ᲇᛱᛸᛱ r3 = (defpackage.C1982) r3     // Catch: java.lang.Throwable -> L68
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L68
            r6 = 31
            if (r5 < r6) goto L3c
            java.lang.String r5 = r3.f8572     // Catch: java.lang.Throwable -> L68
            android.graphics.Typeface r6 = defpackage.AbstractC0796.m1723(r5)     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L3c
            android.graphics.fonts.Font r6 = defpackage.AbstractC0796.m1728(r6)     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L3c
            ᛲᛳᲈᲁ r4 = new ᛲᛳᲈᲁ     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = r3.f8577     // Catch: java.lang.Throwable -> L68
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L68
            ᛲᛳᲈᲁ[] r3 = new defpackage.C0275[]{r4}     // Catch: java.lang.Throwable -> L68
            r0.add(r3)     // Catch: java.lang.Throwable -> L68
            goto L5c
        L3c:
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L68
            android.content.res.Resources r6 = r7.getResources()     // Catch: java.lang.Throwable -> L68
            android.content.pm.ProviderInfo r5 = m3797(r5, r3, r6)     // Catch: java.lang.Throwable -> L68
            if (r5 != 0) goto L53
            ᲇᛶᲀᛸ r7 = new ᲇᛶᲀᛸ     // Catch: java.lang.Throwable -> L68
            r7.<init>(r4, r1)     // Catch: java.lang.Throwable -> L68
            android.os.Trace.endSection()
            return r7
        L53:
            java.lang.String r4 = r5.authority     // Catch: java.lang.Throwable -> L68
            ᛲᛳᲈᲁ[] r3 = m3795(r7, r3, r4)     // Catch: java.lang.Throwable -> L68
            r0.add(r3)     // Catch: java.lang.Throwable -> L68
        L5c:
            int r2 = r2 + 1
            goto Lc
        L5f:
            ᲇᛶᲀᛸ r7 = new ᲇᛶᲀᛸ     // Catch: java.lang.Throwable -> L68
            r7.<init>(r4, r0)     // Catch: java.lang.Throwable -> L68
            android.os.Trace.endSection()
            return r7
        L68:
            r7 = move-exception
            android.os.Trace.endSection()
            throw r7
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.content.pm.ProviderInfo m3797(android.content.pm.PackageManager r9, defpackage.C1982 r10, android.content.res.Resources r11) {
            ᛲᛵᲁᲁ r0 = defpackage.AbstractC2323.f9816
            ᲈᛸᛲᛵ r1 = defpackage.AbstractC2323.f9815
            java.lang.String r2 = "Found content provider "
            java.lang.String r3 = "No package found for authority: "
            java.lang.String r4 = "FontProvider.getProvider"
            defpackage.AbstractC2193.m3597(r4)
            java.util.List r4 = r10.f8573     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = r10.f8575
            java.lang.String r10 = r10.f8576
            r6 = 0
            if (r4 == 0) goto L17
            goto L1b
        L17:
            java.util.List r4 = defpackage.C0292.m939(r11, r6)     // Catch: java.lang.Throwable -> Ld9
        L1b:
            ᲀᛱᲈᲈ r11 = new ᲀᛱᲈᲈ     // Catch: java.lang.Throwable -> Ld9
            r11.<init>()     // Catch: java.lang.Throwable -> Ld9
            r11.f7219 = r5     // Catch: java.lang.Throwable -> Ld9
            r11.f7220 = r10     // Catch: java.lang.Throwable -> Ld9
            r11.f7218 = r4     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r7 = r1.m3732(r11)     // Catch: java.lang.Throwable -> Ld9
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
            r1.m3734(r11, r7)     // Catch: java.lang.Throwable -> Ld9
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
}
