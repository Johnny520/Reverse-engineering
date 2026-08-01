package defpackage;

/* JADX INFO: renamed from: ᲁᛸᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1898 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f8250;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f8251;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f8252;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8253;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8254;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f8255;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f8256;

    public C1898(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f8253 = r1
            r0.f8254 = r2
            r0.f8252 = r3
            r0.f8251 = r4
            r0.f8250 = r5
            r0.f8255 = r6
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toUpperCase(r1)
            java.lang.String r2 = "INT"
            r3 = 0
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 == 0) goto L20
            r1 = 3
            goto L61
        L20:
            java.lang.String r2 = "CHAR"
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 != 0) goto L60
            java.lang.String r2 = "CLOB"
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 != 0) goto L60
            java.lang.String r2 = "TEXT"
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 == 0) goto L39
            goto L60
        L39:
            java.lang.String r2 = "BLOB"
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 == 0) goto L43
            r1 = 5
            goto L61
        L43:
            java.lang.String r2 = "REAL"
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 != 0) goto L5e
            java.lang.String r2 = "FLOA"
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 != 0) goto L5e
            java.lang.String r2 = "DOUB"
            boolean r1 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r1 == 0) goto L5c
            goto L5e
        L5c:
            r1 = 1
            goto L61
        L5e:
            r1 = 4
            goto L61
        L60:
            r1 = 2
        L61:
            r0.f8256 = r1
            return
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L6a
        L5:
            boolean r1 = r9 instanceof defpackage.C1898
            r2 = 0
            if (r1 != 0) goto Lc
            goto L6b
        Lc:
            int r1 = r8.f8251
            if (r1 <= 0) goto L12
            r1 = r0
            goto L13
        L12:
            r1 = r2
        L13:
            ᲁᛸᛴᛵ r9 = (defpackage.C1898) r9
            int r3 = r9.f8255
            int r4 = r9.f8251
            if (r4 <= 0) goto L1d
            r4 = r0
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r1 == r4) goto L21
            goto L6b
        L21:
            java.lang.String r1 = r8.f8253
            java.lang.String r4 = r9.f8253
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r4)
            if (r1 != 0) goto L2c
            goto L6b
        L2c:
            boolean r1 = r8.f8252
            boolean r4 = r9.f8252
            if (r1 == r4) goto L33
            goto L6b
        L33:
            java.lang.String r1 = r9.f8250
            r4 = 2
            int r5 = r8.f8255
            java.lang.String r6 = r8.f8250
            if (r5 != r0) goto L47
            if (r3 != r4) goto L47
            if (r6 == 0) goto L47
            boolean r7 = defpackage.AbstractC1193.m2332(r6, r1)
            if (r7 != 0) goto L47
            goto L6b
        L47:
            if (r5 != r4) goto L54
            if (r3 != r0) goto L54
            if (r1 == 0) goto L54
            boolean r4 = defpackage.AbstractC1193.m2332(r1, r6)
            if (r4 != 0) goto L54
            goto L6b
        L54:
            if (r5 == 0) goto L64
            if (r5 != r3) goto L64
            if (r6 == 0) goto L61
            boolean r1 = defpackage.AbstractC1193.m2332(r6, r1)
            if (r1 != 0) goto L64
            goto L6b
        L61:
            if (r1 == 0) goto L64
            goto L6b
        L64:
            int r8 = r8.f8256
            int r9 = r9.f8256
            if (r8 != r9) goto L6b
        L6a:
            return r0
        L6b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f8253
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f8256
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f8252
            if (r1 == 0) goto L14
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L16
        L14:
            r1 = 1237(0x4d5, float:1.733E-42)
        L16:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f8251
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |Column {\n            |   name = '"
            r0.<init>(r1)
            java.lang.String r1 = r2.f8253
            r0.append(r1)
            java.lang.String r1 = "',\n            |   type = '"
            r0.append(r1)
            java.lang.String r1 = r2.f8254
            r0.append(r1)
            java.lang.String r1 = "',\n            |   affinity = '"
            r0.append(r1)
            int r1 = r2.f8256
            r0.append(r1)
            java.lang.String r1 = "',\n            |   notNull = '"
            r0.append(r1)
            boolean r1 = r2.f8252
            r0.append(r1)
            java.lang.String r1 = "',\n            |   primaryKeyPosition = '"
            r0.append(r1)
            int r1 = r2.f8251
            r0.append(r1)
            java.lang.String r1 = "',\n            |   defaultValue = '"
            r0.append(r1)
            java.lang.String r2 = r2.f8250
            if (r2 != 0) goto L3f
            java.lang.String r2 = "undefined"
        L3f:
            r0.append(r2)
            java.lang.String r2 = "'\n            |}\n        "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = defpackage.AbstractC1171.m2262(r2)
            java.lang.String r2 = defpackage.AbstractC1171.m2268(r2)
            return r2
    }
}
