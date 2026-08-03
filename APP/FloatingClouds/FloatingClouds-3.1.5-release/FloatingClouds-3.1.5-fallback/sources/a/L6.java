package a;

/* JADX INFO: loaded from: classes.dex */
public final class L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.K6 f162a = null;

    static {
            a.K6 r0 = new a.K6
            r0.<init>()
            a.L6.f162a = r0
            return
    }

    public static a.Cc a(android.content.Context r19, a.M6 r20) {
            r0 = r20
            android.content.pm.PackageManager r1 = r19.getPackageManager()
            android.content.res.Resources r2 = r19.getResources()
            java.lang.String r3 = r0.f173a
            r4 = 0
            android.content.pm.ProviderInfo r5 = r1.resolveContentProvider(r3, r4)
            if (r5 == 0) goto L1bb
            java.lang.String r6 = r5.packageName
            java.lang.String r7 = r0.b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L19f
            java.lang.String r3 = r5.packageName
            r6 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r6)
            android.content.pm.Signature[] r1 = r1.signatures
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r1.length
            r7 = r4
        L2e:
            if (r7 >= r6) goto L3c
            r8 = r1[r7]
            byte[] r8 = r8.toByteArray()
            r3.add(r8)
            int r7 = r7 + 1
            goto L2e
        L3c:
            a.K6 r1 = a.L6.f162a
            java.util.Collections.sort(r3, r1)
            java.util.List<java.util.List<byte[]>> r6 = r0.d
            if (r6 == 0) goto L46
            goto L4a
        L46:
            java.util.List r6 = a.S6.b(r2, r4)
        L4a:
            r2 = r4
        L4b:
            int r7 = r6.size()
            r8 = 0
            if (r2 >= r7) goto L8a
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r9 = r6.get(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            r7.<init>(r9)
            java.util.Collections.sort(r7, r1)
            int r9 = r3.size()
            int r10 = r7.size()
            if (r9 == r10) goto L6b
            goto L84
        L6b:
            r9 = r4
        L6c:
            int r10 = r3.size()
            if (r9 >= r10) goto L8b
            java.lang.Object r10 = r3.get(r9)
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r7.get(r9)
            byte[] r11 = (byte[]) r11
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 != 0) goto L87
        L84:
            int r2 = r2 + 1
            goto L4b
        L87:
            int r9 = r9 + 1
            goto L6c
        L8a:
            r5 = r8
        L8b:
            r1 = 1
            if (r5 != 0) goto L94
            a.Cc r0 = new a.Cc
            r0.<init>(r1, r8)
            return r0
        L94:
            java.lang.String r2 = r5.authority
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            android.net.Uri$Builder r5 = r5.authority(r2)
            android.net.Uri r10 = r5.build()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            android.net.Uri$Builder r5 = r5.scheme(r6)
            android.net.Uri$Builder r2 = r5.authority(r2)
            java.lang.String r5 = "file"
            android.net.Uri$Builder r2 = r2.appendPath(r5)
            android.net.Uri r2 = r2.build()
            android.content.ContentResolver r5 = r19.getContentResolver()
            android.content.ContentProviderClient r9 = r5.acquireUnstableContentProviderClient(r10)
            java.lang.String r11 = "_id"
            java.lang.String r12 = "file_id"
            java.lang.String r13 = "font_ttc_index"
            java.lang.String r14 = "font_variation_settings"
            java.lang.String r15 = "font_weight"
            java.lang.String r16 = "font_italic"
            java.lang.String r17 = "result_code"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17}     // Catch: java.lang.Throwable -> L13a
            java.lang.String r12 = "query = ?"
            java.lang.String r0 = r0.c     // Catch: java.lang.Throwable -> L13a
            java.lang.String[] r13 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L13a
            if (r9 != 0) goto Lea
            goto Lf9
        Lea:
            r14 = 0
            r15 = 0
            android.database.Cursor r8 = r9.query(r10, r11, r12, r13, r14, r15)     // Catch: android.os.RemoteException -> Lf1 java.lang.Throwable -> L13a
            goto Lf9
        Lf1:
            r0 = move-exception
            java.lang.String r5 = "FontsProvider"
            java.lang.String r6 = "Unable to query the content provider"
            android.util.Log.w(r5, r6, r0)     // Catch: java.lang.Throwable -> L13a
        Lf9:
            if (r8 == 0) goto L17c
            int r0 = r8.getCount()     // Catch: java.lang.Throwable -> L13a
            if (r0 <= 0) goto L17c
            java.lang.String r0 = "result_code"
            int r0 = r8.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L13a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13a
            r3.<init>()     // Catch: java.lang.Throwable -> L13a
            java.lang.String r5 = "_id"
            int r5 = r8.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r6 = "file_id"
            int r6 = r8.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r7 = "font_ttc_index"
            int r7 = r8.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r11 = "font_weight"
            int r11 = r8.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L13a
            java.lang.String r12 = "font_italic"
            int r12 = r8.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L13a
        L12a:
            boolean r13 = r8.moveToNext()     // Catch: java.lang.Throwable -> L13a
            if (r13 == 0) goto L17c
            r13 = -1
            if (r0 == r13) goto L13c
            int r14 = r8.getInt(r0)     // Catch: java.lang.Throwable -> L13a
            r18 = r14
            goto L13e
        L13a:
            r0 = move-exception
            goto L194
        L13c:
            r18 = r4
        L13e:
            if (r7 == r13) goto L146
            int r14 = r8.getInt(r7)     // Catch: java.lang.Throwable -> L13a
            r15 = r14
            goto L147
        L146:
            r15 = r4
        L147:
            if (r6 != r13) goto L154
            long r13 = r8.getLong(r5)     // Catch: java.lang.Throwable -> L13a
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r10, r13)     // Catch: java.lang.Throwable -> L13a
        L151:
            r14 = r13
            r13 = -1
            goto L15d
        L154:
            long r13 = r8.getLong(r6)     // Catch: java.lang.Throwable -> L13a
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r2, r13)     // Catch: java.lang.Throwable -> L13a
            goto L151
        L15d:
            if (r11 == r13) goto L164
            int r16 = r8.getInt(r11)     // Catch: java.lang.Throwable -> L13a
            goto L166
        L164:
            r16 = 400(0x190, float:5.6E-43)
        L166:
            if (r12 == r13) goto L171
            int r13 = r8.getInt(r12)     // Catch: java.lang.Throwable -> L13a
            if (r13 != r1) goto L171
            r17 = r1
            goto L173
        L171:
            r17 = r4
        L173:
            a.T6 r13 = new a.T6     // Catch: java.lang.Throwable -> L13a
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L13a
            r3.add(r13)     // Catch: java.lang.Throwable -> L13a
            goto L12a
        L17c:
            if (r8 == 0) goto L181
            r8.close()
        L181:
            if (r9 == 0) goto L186
            r9.close()
        L186:
            a.T6[] r0 = new a.T6[r4]
            java.lang.Object[] r0 = r3.toArray(r0)
            a.T6[] r0 = (a.T6[]) r0
            a.Cc r1 = new a.Cc
            r1.<init>(r4, r0)
            return r1
        L194:
            if (r8 == 0) goto L199
            r8.close()
        L199:
            if (r9 == 0) goto L19e
            r9.close()
        L19e:
            throw r0
        L19f:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found content provider "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ", but package was not "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1bb:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r1 = "No package found for authority: "
            java.lang.String r1 = a.C0487z.k(r1, r3)
            r0.<init>(r1)
            throw r0
    }
}
