package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0251 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f1462;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.io.File[] f1463;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.File[] f1464;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f1465;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long[] f1466;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0703 f1467;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0246 f1468;

    public C0251(defpackage.C0246 r7, java.lang.String r8) {
            r6 = this;
            r6.<init>()
            r6.f1468 = r7
            r6.f1465 = r8
            int r0 = r7.f1442
            java.io.File r7 = r7.f1447
            long[] r1 = new long[r0]
            r6.f1466 = r1
            java.io.File[] r1 = new java.io.File[r0]
            r6.f1464 = r1
            java.io.File[] r1 = new java.io.File[r0]
            r6.f1463 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r8 = 46
            r1.append(r8)
            int r8 = r1.length()
            r2 = 0
        L26:
            if (r2 >= r0) goto L50
            r1.append(r2)
            java.io.File[] r3 = r6.f1464
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r1.toString()
            r4.<init>(r7, r5)
            r3[r2] = r4
            java.lang.String r3 = ".tmp"
            r1.append(r3)
            java.io.File[] r3 = r6.f1463
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r1.toString()
            r4.<init>(r7, r5)
            r3[r2] = r4
            r1.setLength(r8)
            int r2 = r2 + 1
            goto L26
        L50:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String m874() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long[] r6 = r6.f1466
            int r1 = r6.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L18
            r3 = r6[r2]
            r5 = 32
            r0.append(r5)
            r0.append(r3)
            int r2 = r2 + 1
            goto L9
        L18:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
