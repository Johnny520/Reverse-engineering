package defpackage;

/* JADX INFO: renamed from: ᲀᲈᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1782 implements defpackage.InterfaceC0190 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1180 f7857;

    public /* synthetic */ C1782(defpackage.C1180 r1) {
            r0 = this;
            r0.<init>()
            r0.f7857 = r1
            return
    }

    @Override // defpackage.InterfaceC0190
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final java.lang.Object mo737(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r5 = this;
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            android.database.sqlite.SQLiteCursorDriver r7 = (android.database.sqlite.SQLiteCursorDriver) r7
            java.lang.String r8 = (java.lang.String) r8
            android.database.sqlite.SQLiteQuery r9 = (android.database.sqlite.SQLiteQuery) r9
            ᲈᛵᛵᲁ r6 = new ᲈᛵᛵᲁ
            r6.<init>(r9)
            ᛶᲈᛱᲈ r5 = r5.f7857
            java.lang.Object r5 = r5.f5356
            ᛷᲀᛵ r5 = (defpackage.C1351) r5
            int[] r0 = r5.f5933
            int r0 = r0.length
            r1 = 1
            r2 = r1
        L18:
            if (r2 >= r0) goto L53
            int[] r3 = r5.f5933
            r3 = r3[r2]
            if (r3 == r1) goto L49
            r4 = 2
            if (r3 == r4) goto L41
            r4 = 3
            if (r3 == r4) goto L39
            r4 = 4
            if (r3 == r4) goto L31
            r4 = 5
            if (r3 == r4) goto L2d
            goto L50
        L2d:
            r6.mo1288(r2)
            goto L50
        L31:
            byte[][] r3 = r5.f5932
            r3 = r3[r2]
            r6.mo1287(r2, r3)
            goto L50
        L39:
            java.lang.String[] r3 = r5.f5931
            r3 = r3[r2]
            r6.mo1286(r2, r3)
            goto L50
        L41:
            double[] r3 = r5.f5929
            r3 = r3[r2]
            r6.mo1284(r2, r3)
            goto L50
        L49:
            long[] r3 = r5.f5934
            r3 = r3[r2]
            r6.mo1285(r3, r2)
        L50:
            int r2 = r2 + 1
            goto L18
        L53:
            android.database.sqlite.SQLiteCursor r5 = new android.database.sqlite.SQLiteCursor
            r5.<init>(r7, r8, r9)
            return r5
    }
}
