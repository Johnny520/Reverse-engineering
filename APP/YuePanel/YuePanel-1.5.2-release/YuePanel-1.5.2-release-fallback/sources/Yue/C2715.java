package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2715 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.Comparator<byte[]> f8940 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ$ۥ, reason: contains not printable characters */
    public interface InterfaceC2716 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        static Yue.C2715.InterfaceC2716 m11958(android.content.Context r1, android.net.Uri r2) {
                Yue.ۥ۠ۢۥۦ$ۥ۟۟ r0 = new Yue.ۥ۠ۢۥۦ$ۥ۟۟
                r0.<init>(r1, r2)
                return r0
        }

        void close();

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        android.database.Cursor mo11959(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, android.os.CancellationSignal r6);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ$ۥ۟, reason: contains not printable characters */
    public static class C2717 implements Yue.C2715.InterfaceC2716 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.ContentProviderClient f8941;

        public C2717(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                android.content.ContentResolver r1 = r1.getContentResolver()
                android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r2)
                r0.f8941 = r1
                return
        }

        @Override // Yue.C2715.InterfaceC2716
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.f8941
                if (r0 == 0) goto L7
                r0.release()
            L7:
                return
        }

        @Override // Yue.C2715.InterfaceC2716
        /* JADX INFO: renamed from: ۥ۟ */
        public android.database.Cursor mo11959(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, android.os.CancellationSignal r14) {
                r8 = this;
                android.content.ContentProviderClient r0 = r8.f8941
                r7 = 0
                if (r0 != 0) goto L6
                return r7
            L6:
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L11
                return r9
            L11:
                r9 = move-exception
                java.lang.String r10 = "FontsProvider"
                java.lang.String r11 = "Unable to query the content provider"
                android.util.Log.w(r10, r11, r9)
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥۦ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C2718 implements Yue.C2715.InterfaceC2716 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.ContentProviderClient f8942;

        public C2718(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                android.content.ContentResolver r1 = r1.getContentResolver()
                android.content.ContentProviderClient r1 = r1.acquireUnstableContentProviderClient(r2)
                r0.f8942 = r1
                return
        }

        @Override // Yue.C2715.InterfaceC2716
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.f8942
                if (r0 == 0) goto L7
                r0.close()
            L7:
                return
        }

        @Override // Yue.C2715.InterfaceC2716
        /* JADX INFO: renamed from: ۥ۟ */
        public android.database.Cursor mo11959(android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, android.os.CancellationSignal r14) {
                r8 = this;
                android.content.ContentProviderClient r0 = r8.f8942
                r7 = 0
                if (r0 != 0) goto L6
                return r7
            L6:
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch: android.os.RemoteException -> L11
                return r9
            L11:
                r9 = move-exception
                java.lang.String r10 = "FontsProvider"
                java.lang.String r11 = "Unable to query the content provider"
                android.util.Log.w(r10, r11, r9)
                return r7
        }
    }

    static {
            Yue.ۥ۠ۢۥۥ r0 = new Yue.ۥ۠ۢۥۥ
            r0.<init>()
            Yue.C2715.f8940 = r0
            return
    }

    public C2715() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ int m11950(byte[] r0, byte[] r1) {
            int r0 = m11956(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.List<byte[]> m11951(android.content.pm.Signature[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r4[r2]
            byte[] r3 = r3.toByteArray()
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m11952(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = r2
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
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.util.List<java.util.List<byte[]>> m11953(Yue.C2719 r1, android.content.res.Resources r2) {
            java.util.List r0 = r1.m11961()
            if (r0 == 0) goto Lb
            java.util.List r1 = r1.m11961()
            return r1
        Lb:
            int r1 = r1.m11962()
            java.util.List r1 = Yue.C2729.m11981(r2, r1)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C2736.C2738 m11954(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 Yue.C2719 r3, @Yue.InterfaceC4544 android.os.CancellationSignal r4) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.res.Resources r1 = r2.getResources()
            android.content.pm.ProviderInfo r0 = m11955(r0, r3, r1)
            if (r0 != 0) goto L15
            r2 = 1
            r3 = 0
            Yue.ۥ۠ۢۦۢ$ۥ۟ r2 = Yue.C2736.C2738.m12008(r2, r3)
            return r2
        L15:
            java.lang.String r0 = r0.authority
            Yue.ۥ۠ۢۦۢ$ۥ۟۟[] r2 = m11957(r2, r3, r0, r4)
            r3 = 0
            Yue.ۥ۠ۢۦۢ$ۥ۟ r2 = Yue.C2736.C2738.m12008(r3, r2)
            return r2
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.content.pm.ProviderInfo m11955(@Yue.InterfaceC4410 android.content.pm.PackageManager r5, @Yue.InterfaceC4410 Yue.C2719 r6, @Yue.InterfaceC4544 android.content.res.Resources r7) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = r6.m11965()
            r1 = 0
            android.content.pm.ProviderInfo r2 = r5.resolveContentProvider(r0, r1)
            if (r2 == 0) goto L73
            java.lang.String r3 = r2.packageName
            java.lang.String r4 = r6.m11966()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L50
            java.lang.String r0 = r2.packageName
            r3 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r3)
            android.content.pm.Signature[] r5 = r5.signatures
            java.util.List r5 = m11951(r5)
            java.util.Comparator<byte[]> r0 = Yue.C2715.f8940
            java.util.Collections.sort(r5, r0)
            java.util.List r6 = m11953(r6, r7)
        L2e:
            int r7 = r6.size()
            if (r1 >= r7) goto L4e
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            java.util.Comparator<byte[]> r0 = Yue.C2715.f8940
            java.util.Collections.sort(r7, r0)
            boolean r7 = m11952(r5, r7)
            if (r7 == 0) goto L4b
            return r2
        L4b:
            int r1 = r1 + 1
            goto L2e
        L4e:
            r5 = 0
            return r5
        L50:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Found content provider "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = ", but package was not "
            r7.append(r0)
            java.lang.String r6 = r6.m11966()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L73:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No package found for authority: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ int m11956(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L8
            int r4 = r4.length
            int r5 = r5.length
            int r4 = r4 - r5
            return r4
        L8:
            r0 = 0
            r1 = r0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L18
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L15
            int r2 = r2 - r3
            return r2
        L15:
            int r1 = r1 + 1
            goto La
        L18:
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Yue.C2736.C2739[] m11957(android.content.Context r16, Yue.C2719 r17, java.lang.String r18, android.os.CancellationSignal r19) {
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            r3 = r16
            Yue.ۥ۠ۢۥۦ$ۥ r3 = Yue.C2715.InterfaceC2716.m11958(r3, r2)
            r11 = 0
            java.lang.String r4 = "_id"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "font_ttc_index"
            java.lang.String r7 = "font_variation_settings"
            java.lang.String r8 = "font_weight"
            java.lang.String r9 = "font_italic"
            java.lang.String r10 = "result_code"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "query = ?"
            java.lang.String r4 = r17.m11967()     // Catch: java.lang.Throwable -> L9c
            java.lang.String[] r8 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L9c
            r9 = 0
            r4 = r3
            r5 = r2
            r10 = r19
            android.database.Cursor r11 = r4.mo11959(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9c
            if (r11 == 0) goto Ldd
            int r5 = r11.getCount()     // Catch: java.lang.Throwable -> L9c
            if (r5 <= 0) goto Ldd
            java.lang.String r1 = "result_code"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L9c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            r5.<init>()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = "_id"
            int r6 = r11.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "file_id"
            int r7 = r11.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = "font_ttc_index"
            int r8 = r11.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r9 = "font_weight"
            int r9 = r11.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = "font_italic"
            int r10 = r11.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L9c
        L8e:
            boolean r12 = r11.moveToNext()     // Catch: java.lang.Throwable -> L9c
            if (r12 == 0) goto Ldc
            r12 = -1
            if (r1 == r12) goto L9e
            int r13 = r11.getInt(r1)     // Catch: java.lang.Throwable -> L9c
            goto L9f
        L9c:
            r0 = move-exception
            goto Lef
        L9e:
            r13 = 0
        L9f:
            if (r8 == r12) goto La6
            int r14 = r11.getInt(r8)     // Catch: java.lang.Throwable -> L9c
            goto La7
        La6:
            r14 = 0
        La7:
            if (r7 != r12) goto Lb4
            r17 = r5
            long r4 = r11.getLong(r6)     // Catch: java.lang.Throwable -> L9c
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r2, r4)     // Catch: java.lang.Throwable -> L9c
            goto Lbe
        Lb4:
            r17 = r5
            long r4 = r11.getLong(r7)     // Catch: java.lang.Throwable -> L9c
            android.net.Uri r4 = android.content.ContentUris.withAppendedId(r0, r4)     // Catch: java.lang.Throwable -> L9c
        Lbe:
            if (r9 == r12) goto Lc5
            int r5 = r11.getInt(r9)     // Catch: java.lang.Throwable -> L9c
            goto Lc7
        Lc5:
            r5 = 400(0x190, float:5.6E-43)
        Lc7:
            if (r10 == r12) goto Ld1
            int r12 = r11.getInt(r10)     // Catch: java.lang.Throwable -> L9c
            r15 = 1
            if (r12 != r15) goto Ld1
            goto Ld2
        Ld1:
            r15 = 0
        Ld2:
            Yue.ۥ۠ۢۦۢ$ۥ۟۟ r4 = Yue.C2736.C2739.m12011(r4, r14, r5, r15, r13)     // Catch: java.lang.Throwable -> L9c
            r5 = r17
            r5.add(r4)     // Catch: java.lang.Throwable -> L9c
            goto L8e
        Ldc:
            r1 = r5
        Ldd:
            if (r11 == 0) goto Le2
            r11.close()
        Le2:
            r3.close()
            r0 = 0
            Yue.ۥ۠ۢۦۢ$ۥ۟۟[] r0 = new Yue.C2736.C2739[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            Yue.ۥ۠ۢۦۢ$ۥ۟۟[] r0 = (Yue.C2736.C2739[]) r0
            return r0
        Lef:
            if (r11 == 0) goto Lf4
            r11.close()
        Lf4:
            r3.close()
            throw r0
    }
}
