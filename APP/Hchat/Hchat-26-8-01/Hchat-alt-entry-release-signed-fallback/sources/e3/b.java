package e3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f.r f2342a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b8.c f2343b = null;

    static {
            f.r r0 = new f.r
            r1 = 2
            r0.<init>(r1)
            e3.b.f2342a = r0
            b8.c r0 = new b8.c
            r0.<init>(r1)
            e3.b.f2343b = r0
            return
    }

    public static a5.a a(android.content.Context r5, java.util.List r6) {
            java.lang.String r0 = "FontProvider.getFontFamilyResult"
            a.a.o(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            r1 = 0
        Lb:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L43
            if (r1 >= r2) goto L3a
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Throwable -> L43
            e3.c r2 = (e3.c) r2     // Catch: java.lang.Throwable -> L43
            android.content.pm.PackageManager r3 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L43
            android.content.res.Resources r4 = r5.getResources()     // Catch: java.lang.Throwable -> L43
            android.content.pm.ProviderInfo r3 = b(r3, r2, r4)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L2e
            a5.a r5 = new a5.a     // Catch: java.lang.Throwable -> L43
            r5.<init>()     // Catch: java.lang.Throwable -> L43
            android.os.Trace.endSection()
            return r5
        L2e:
            java.lang.String r3 = r3.authority     // Catch: java.lang.Throwable -> L43
            e3.d[] r2 = c(r5, r2, r3)     // Catch: java.lang.Throwable -> L43
            r0.add(r2)     // Catch: java.lang.Throwable -> L43
            int r1 = r1 + 1
            goto Lb
        L3a:
            a5.a r5 = new a5.a     // Catch: java.lang.Throwable -> L43
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L43
            android.os.Trace.endSection()
            return r5
        L43:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
    }

    public static android.content.pm.ProviderInfo b(android.content.pm.PackageManager r9, e3.c r10, android.content.res.Resources r11) {
            b8.c r0 = e3.b.f2343b
            f.r r1 = e3.b.f2342a
            java.lang.String r2 = "Found content provider "
            java.lang.String r3 = "No package found for authority: "
            java.lang.String r4 = "FontProvider.getProvider"
            a.a.o(r4)
            java.util.List r4 = r10.f2347d     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = r10.f2344a
            java.lang.String r10 = r10.f2345b
            r6 = 0
            if (r4 == 0) goto L17
            goto L1b
        L17:
            java.util.List r4 = ac.p.J(r11, r6)     // Catch: java.lang.Throwable -> Ld9
        L1b:
            e3.a r11 = new e3.a     // Catch: java.lang.Throwable -> Ld9
            r11.<init>()     // Catch: java.lang.Throwable -> Ld9
            r11.f2339a = r5     // Catch: java.lang.Throwable -> Ld9
            r11.f2340b = r10     // Catch: java.lang.Throwable -> Ld9
            r11.f2341c = r4     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r7 = r1.a(r11)     // Catch: java.lang.Throwable -> Ld9
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
            r1.b(r11, r7)     // Catch: java.lang.Throwable -> Ld9
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

    public static e3.d[] c(android.content.Context r18, e3.c r19, java.lang.String r20) {
            r0 = r20
            java.lang.String r1 = "content"
            java.lang.String r2 = "FontProvider.query"
            a.a.o(r2)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L121
            r2.<init>()     // Catch: java.lang.Throwable -> L121
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L121
            r3.<init>()     // Catch: java.lang.Throwable -> L121
            android.net.Uri$Builder r3 = r3.scheme(r1)     // Catch: java.lang.Throwable -> L121
            android.net.Uri$Builder r3 = r3.authority(r0)     // Catch: java.lang.Throwable -> L121
            android.net.Uri r5 = r3.build()     // Catch: java.lang.Throwable -> L121
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L121
            r3.<init>()     // Catch: java.lang.Throwable -> L121
            android.net.Uri$Builder r1 = r3.scheme(r1)     // Catch: java.lang.Throwable -> L121
            android.net.Uri$Builder r0 = r1.authority(r0)     // Catch: java.lang.Throwable -> L121
            java.lang.String r1 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r1)     // Catch: java.lang.Throwable -> L121
            android.net.Uri r1 = r0.build()     // Catch: java.lang.Throwable -> L121
            android.content.ContentResolver r0 = r18.getContentResolver()     // Catch: java.lang.Throwable -> L121
            android.content.ContentProviderClient r4 = r0.acquireUnstableContentProviderClient(r5)     // Catch: java.lang.Throwable -> L121
            r3 = 0
            java.lang.String r6 = "_id"
            java.lang.String r7 = "file_id"
            java.lang.String r8 = "font_ttc_index"
            java.lang.String r9 = "font_variation_settings"
            java.lang.String r10 = "font_weight"
            java.lang.String r11 = "font_italic"
            java.lang.String r12 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "ContentQueryWrapper.query"
            a.a.o(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = "query = ?"
            r0 = r19
            java.lang.String r0 = r0.f2346c     // Catch: java.lang.Throwable -> L111
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L111
            if (r4 != 0) goto L63
            goto L72
        L63:
            r10 = 0
            r9 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch: android.os.RemoteException -> L6a java.lang.Throwable -> L111
            goto L72
        L6a:
            r0 = move-exception
            java.lang.String r6 = "FontsProvider"
            java.lang.String r7 = "Unable to query the content provider"
            android.util.Log.w(r6, r7, r0)     // Catch: java.lang.Throwable -> L111
        L72:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto Lfa
            int r6 = r3.getCount()     // Catch: java.lang.Throwable -> Lb6
            if (r6 <= 0) goto Lfa
            java.lang.String r2 = "result_code"
            int r2 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb6
            r6.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = "_id"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "file_id"
            int r8 = r3.getColumnIndex(r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = "font_ttc_index"
            int r9 = r3.getColumnIndex(r9)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r10 = "font_weight"
            int r10 = r3.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r11 = "font_italic"
            int r11 = r3.getColumnIndex(r11)     // Catch: java.lang.Throwable -> Lb6
        La6:
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> Lb6
            if (r12 == 0) goto Lf9
            r12 = -1
            if (r2 == r12) goto Lb8
            int r13 = r3.getInt(r2)     // Catch: java.lang.Throwable -> Lb6
            r17 = r13
            goto Lba
        Lb6:
            r0 = move-exception
            goto L116
        Lb8:
            r17 = 0
        Lba:
            if (r9 == r12) goto Lc2
            int r13 = r3.getInt(r9)     // Catch: java.lang.Throwable -> Lb6
            r14 = r13
            goto Lc3
        Lc2:
            r14 = 0
        Lc3:
            if (r8 != r12) goto Ld0
            long r12 = r3.getLong(r7)     // Catch: java.lang.Throwable -> Lb6
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r5, r12)     // Catch: java.lang.Throwable -> Lb6
        Lcd:
            r13 = r12
            r12 = -1
            goto Ld9
        Ld0:
            long r12 = r3.getLong(r8)     // Catch: java.lang.Throwable -> Lb6
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r1, r12)     // Catch: java.lang.Throwable -> Lb6
            goto Lcd
        Ld9:
            if (r10 == r12) goto Le0
            int r15 = r3.getInt(r10)     // Catch: java.lang.Throwable -> Lb6
            goto Le2
        Le0:
            r15 = 400(0x190, float:5.6E-43)
        Le2:
            if (r11 == r12) goto Lee
            int r12 = r3.getInt(r11)     // Catch: java.lang.Throwable -> Lb6
            r0 = 1
            if (r12 != r0) goto Lee
            r16 = r0
            goto Lf0
        Lee:
            r16 = 0
        Lf0:
            e3.d r12 = new e3.d     // Catch: java.lang.Throwable -> Lb6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lb6
            r6.add(r12)     // Catch: java.lang.Throwable -> Lb6
            goto La6
        Lf9:
            r2 = r6
        Lfa:
            if (r3 == 0) goto Lff
            r3.close()     // Catch: java.lang.Throwable -> L121
        Lff:
            if (r4 == 0) goto L104
            r4.close()     // Catch: java.lang.Throwable -> L121
        L104:
            r0 = 0
            e3.d[] r0 = new e3.d[r0]     // Catch: java.lang.Throwable -> L121
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch: java.lang.Throwable -> L121
            e3.d[] r0 = (e3.d[]) r0     // Catch: java.lang.Throwable -> L121
            android.os.Trace.endSection()
            return r0
        L111:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb6
            throw r0     // Catch: java.lang.Throwable -> Lb6
        L116:
            if (r3 == 0) goto L11b
            r3.close()     // Catch: java.lang.Throwable -> L121
        L11b:
            if (r4 == 0) goto L120
            r4.close()     // Catch: java.lang.Throwable -> L121
        L120:
            throw r0     // Catch: java.lang.Throwable -> L121
        L121:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }
}
