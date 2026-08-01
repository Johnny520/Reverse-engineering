package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1332 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.ArrayList f5898;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.ArrayList f5899;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5900;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f5901;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5902;

    public C1332(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.ArrayList r4, java.util.ArrayList r5) {
            r0 = this;
            r0.<init>()
            r0.f5901 = r1
            r0.f5902 = r2
            r0.f5900 = r3
            r0.f5899 = r4
            r0.f5898 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r3 instanceof defpackage.C1332
            if (r0 != 0) goto L9
            goto L36
        L9:
            ᛷᛸᛴᛲ r3 = (defpackage.C1332) r3
            java.lang.String r0 = r3.f5901
            java.lang.String r1 = r2.f5901
            boolean r0 = defpackage.AbstractC0498.m1280(r1, r0)
            if (r0 != 0) goto L16
            goto L36
        L16:
            java.lang.String r0 = r2.f5902
            java.lang.String r1 = r3.f5902
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L21
            goto L36
        L21:
            java.lang.String r0 = r2.f5900
            java.lang.String r1 = r3.f5900
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L2c
            goto L36
        L2c:
            java.util.ArrayList r0 = r2.f5899
            java.util.ArrayList r1 = r3.f5899
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
        L36:
            r2 = 0
            return r2
        L38:
            java.util.ArrayList r2 = r2.f5898
            java.util.ArrayList r3 = r3.f5898
            boolean r2 = r2.equals(r3)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5901
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f5902
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r3.f5900
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.util.ArrayList r2 = r3.f5899
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.ArrayList r3 = r3.f5898
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |ForeignKey {\n            |   referenceTable = '"
            r0.<init>(r1)
            java.lang.String r1 = r8.f5901
            r0.append(r1)
            java.lang.String r1 = "',\n            |   onDelete = '"
            r0.append(r1)
            java.lang.String r1 = r8.f5902
            r0.append(r1)
            java.lang.String r1 = "',\n            |   onUpdate = '"
            r0.append(r1)
            java.lang.String r1 = r8.f5900
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columnNames = {"
            r0.append(r1)
            java.util.ArrayList r1 = r8.f5899
            java.util.List r2 = defpackage.AbstractC1107.m2111(r1)
            r6 = 0
            r7 = 62
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            java.lang.String r1 = defpackage.AbstractC1107.m2125(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = defpackage.AbstractC1171.m2268(r1)
            java.lang.String r2 = "},"
            java.lang.String r2 = defpackage.AbstractC1171.m2268(r2)
            java.lang.String r1 = r1.concat(r2)
            r0.append(r1)
            java.lang.String r1 = "\n            |   referenceColumnNames = {"
            r0.append(r1)
            java.util.ArrayList r8 = r8.f5898
            java.util.List r1 = defpackage.AbstractC1107.m2111(r8)
            r6 = 62
            java.lang.String r2 = ","
            r3 = 0
            java.lang.String r8 = defpackage.AbstractC1107.m2125(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = defpackage.AbstractC1171.m2268(r8)
            java.lang.String r1 = " }"
            java.lang.String r1 = defpackage.AbstractC1171.m2268(r1)
            java.lang.String r8 = r8.concat(r1)
            r0.append(r8)
            java.lang.String r8 = "\n            |}\n        "
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r8 = defpackage.AbstractC1171.m2262(r8)
            java.lang.String r8 = defpackage.AbstractC1171.m2268(r8)
            return r8
    }
}
