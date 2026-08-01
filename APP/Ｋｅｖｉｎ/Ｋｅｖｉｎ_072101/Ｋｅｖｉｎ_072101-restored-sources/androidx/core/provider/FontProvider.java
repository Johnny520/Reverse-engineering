package androidx.core.provider;

/* JADX INFO: loaded from: classes2.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = null;

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.database.Cursor query(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, java.lang.Object r13) {
                r6 = r13
                android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6)
                return r0
        }
    }

    static {
            androidx.core.provider.FontProvider$$ExternalSyntheticLambda0 r0 = new androidx.core.provider.FontProvider$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.core.provider.FontProvider.sByteArrayComparator = r0
            return
    }

    private FontProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r5[r2]
            byte[] r4 = r3.toByteArray()
            r0.add(r4)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r0 = 1
            return r0
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest r2, android.content.res.Resources r3) {
            java.util.List r0 = r2.getCertificates()
            if (r0 == 0) goto Lb
            java.util.List r0 = r2.getCertificates()
            return r0
        Lb:
            int r0 = r2.getCertificatesArrayResId()
            java.util.List r1 = androidx.core.content.res.FontResourcesParserCompat.readCerts(r3, r0)
            return r1
    }

    static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(android.content.Context r3, androidx.core.provider.FontRequest r4, android.os.CancellationSignal r5) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            android.content.res.Resources r1 = r3.getResources()
            android.content.pm.ProviderInfo r0 = getProvider(r0, r4, r1)
            if (r0 != 0) goto L16
            r1 = 1
            r2 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r1 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r1, r2)
            return r1
        L16:
            java.lang.String r1 = r0.authority
            androidx.core.provider.FontsContractCompat$FontInfo[] r1 = query(r3, r4, r1, r5)
            r2 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r2, r1)
            return r2
    }

    static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager r8, androidx.core.provider.FontRequest r9, android.content.res.Resources r10) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = r9.getProviderAuthority()
            r1 = 0
            android.content.pm.ProviderInfo r1 = r8.resolveContentProvider(r0, r1)
            if (r1 == 0) goto L78
            java.lang.String r2 = r1.packageName
            java.lang.String r3 = r9.getProviderPackage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L51
            java.lang.String r2 = r1.packageName
            r3 = 64
            android.content.pm.PackageInfo r2 = r8.getPackageInfo(r2, r3)
            android.content.pm.Signature[] r3 = r2.signatures
            java.util.List r3 = convertToByteArrayList(r3)
            java.util.Comparator<byte[]> r4 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r3, r4)
            java.util.List r4 = getCertificates(r9, r10)
            r5 = 0
        L2f:
            int r6 = r4.size()
            if (r5 >= r6) goto L4f
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object r7 = r4.get(r5)
            java.util.Collection r7 = (java.util.Collection) r7
            r6.<init>(r7)
            java.util.Comparator<byte[]> r7 = androidx.core.provider.FontProvider.sByteArrayComparator
            java.util.Collections.sort(r6, r7)
            boolean r7 = equalsByteArrayList(r3, r6)
            if (r7 == 0) goto L4c
            return r1
        L4c:
            int r5 = r5 + 1
            goto L2f
        L4f:
            r5 = 0
            return r5
        L51:
            android.content.pm.PackageManager$NameNotFoundException r2 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Found content provider "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = ", but package was not "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r9.getProviderPackage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L78:
            android.content.pm.PackageManager$NameNotFoundException r2 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No package found for authority: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static /* synthetic */ int lambda$static$0(byte[] r3, byte[] r4) {
            int r0 = r3.length
            int r1 = r4.length
            if (r0 == r1) goto L8
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 - r1
            return r0
        L8:
            r0 = 0
        L9:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            r1 = r3[r0]
            r2 = r4[r0]
            if (r1 == r2) goto L18
            r1 = r3[r0]
            r2 = r4[r0]
            int r1 = r1 - r2
            return r1
        L18:
            int r0 = r0 + 1
            goto L9
        L1b:
            r0 = 0
            return r0
    }

    static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context r22, androidx.core.provider.FontRequest r23, java.lang.String r24, android.os.CancellationSignal r25) {
            r1 = r24
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r0
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r3)
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r11 = r0.build()
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r3)
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r3 = r0.build()
            r12 = 0
            java.lang.String r4 = "_id"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "font_ttc_index"
            java.lang.String r7 = "font_variation_settings"
            java.lang.String r8 = "font_weight"
            java.lang.String r9 = "font_italic"
            java.lang.String r10 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L10e
            android.content.ContentResolver r4 = r22.getContentResolver()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r7 = "query = ?"
            java.lang.String r0 = r23.getQuery()     // Catch: java.lang.Throwable -> L10e
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L10e
            r9 = 0
            r5 = r11
            r10 = r25
            android.database.Cursor r0 = androidx.core.provider.FontProvider.Api16Impl.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L10e
            r12 = r0
            if (r12 == 0) goto Lfb
            int r5 = r12.getCount()     // Catch: java.lang.Throwable -> L10e
            if (r5 <= 0) goto Lfb
            java.lang.String r5 = "result_code"
            int r5 = r12.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L10e
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10e
            r7.<init>()     // Catch: java.lang.Throwable -> L10e
            r2 = r7
            java.lang.String r7 = "_id"
            int r7 = r12.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r8 = "file_id"
            int r8 = r12.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r9 = "font_ttc_index"
            int r9 = r12.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r10 = "font_weight"
            int r10 = r12.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r13 = "font_italic"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L10e
        L8f:
            boolean r14 = r12.moveToNext()     // Catch: java.lang.Throwable -> L10e
            if (r14 == 0) goto Lf6
            r14 = -1
            if (r5 == r14) goto La2
            int r15 = r12.getInt(r5)     // Catch: java.lang.Throwable -> L9d
            goto La3
        L9d:
            r0 = move-exception
            r18 = r3
            goto L111
        La2:
            r15 = 0
        La3:
            if (r9 == r14) goto Lab
            int r16 = r12.getInt(r9)     // Catch: java.lang.Throwable -> L9d
            goto Lad
        Lab:
            r16 = 0
        Lad:
            r17 = r16
            if (r8 != r14) goto Lc0
            long r18 = r12.getLong(r7)     // Catch: java.lang.Throwable -> L9d
            r20 = r18
            r0 = r20
            android.net.Uri r18 = android.content.ContentUris.withAppendedId(r11, r0)     // Catch: java.lang.Throwable -> L9d
            r0 = r18
            goto Lca
        Lc0:
            long r0 = r12.getLong(r8)     // Catch: java.lang.Throwable -> L10e
            android.net.Uri r18 = android.content.ContentUris.withAppendedId(r3, r0)     // Catch: java.lang.Throwable -> L10e
            r0 = r18
        Lca:
            if (r10 == r14) goto Ld1
            int r1 = r12.getInt(r10)     // Catch: java.lang.Throwable -> L9d
            goto Ld3
        Ld1:
            r1 = 400(0x190, float:5.6E-43)
        Ld3:
            if (r13 == r14) goto Ldf
            int r14 = r12.getInt(r13)     // Catch: java.lang.Throwable -> L10e
            r18 = r3
            r3 = 1
            if (r14 != r3) goto Le1
            goto Le2
        Ldf:
            r18 = r3
        Le1:
            r3 = 0
        Le2:
            r14 = r17
            r17 = r4
            androidx.core.provider.FontsContractCompat$FontInfo r4 = androidx.core.provider.FontsContractCompat.FontInfo.create(r0, r14, r1, r3, r15)     // Catch: java.lang.Throwable -> Lf4
            r2.add(r4)     // Catch: java.lang.Throwable -> Lf4
            r1 = r24
            r4 = r17
            r3 = r18
            goto L8f
        Lf4:
            r0 = move-exception
            goto L111
        Lf6:
            r18 = r3
            r17 = r4
            goto Lff
        Lfb:
            r18 = r3
            r17 = r4
        Lff:
            if (r12 == 0) goto L104
            r12.close()
        L104:
            r0 = 0
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
            return r0
        L10e:
            r0 = move-exception
            r18 = r3
        L111:
            if (r12 == 0) goto L116
            r12.close()
        L116:
            throw r0
    }
}
