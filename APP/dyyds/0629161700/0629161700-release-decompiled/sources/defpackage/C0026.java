package defpackage;

/* JADX INFO: renamed from: ᛱᛱᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0026 extends java.lang.Exception {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f482;

    public C0026(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            java.lang.String r1 = m332(r1, r2, r3)
            r0.<init>(r1)
            r0.f482 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String m332(int r4, int r5, java.lang.Object r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "."
            if (r5 != 0) goto L1e
            java.lang.String r5 = "Unexpected character ("
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = ") at position "
            r0.append(r5)
            r0.append(r4)
            r0.append(r1)
            goto Lc1
        L1e:
            r2 = 1
            java.lang.String r3 = " at position "
            if (r5 != r2) goto L36
            java.lang.String r5 = "Unexpected token "
            r0.append(r5)
            r0.append(r6)
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            goto Lc1
        L36:
            r2 = 2
            if (r5 != r2) goto L4e
            java.lang.String r5 = "Unexpected exception "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = " occur at position "
            r0.append(r5)
            r0.append(r4)
            r0.append(r1)
            goto Lc1
        L4e:
            r2 = 3
            if (r5 != r2) goto L62
            java.lang.String r5 = "Unexpected End Of File position "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            r0.append(r6)
            goto Lc1
        L62:
            r2 = 4
            if (r5 != r2) goto L77
            java.lang.String r5 = "Unexpected unicode escape sequence "
            r0.append(r5)
            r0.append(r6)
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            goto Lc1
        L77:
            r2 = 5
            if (r5 != r2) goto L8c
            java.lang.String r5 = "Unexpected duplicate key:"
            r0.append(r5)
            r0.append(r6)
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            goto Lc1
        L8c:
            r2 = 6
            if (r5 != r2) goto La1
            java.lang.String r5 = "Unexpected leading 0 in digit for token:"
            r0.append(r5)
            r0.append(r6)
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            goto Lc1
        La1:
            r2 = 7
            if (r5 != r2) goto Lb6
            java.lang.String r5 = "Malicious payload, having non natural depths, parsing stoped on "
            r0.append(r5)
            r0.append(r6)
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            goto Lc1
        Lb6:
            java.lang.String r5 = "Unkown error at position "
            r0.append(r5)
            r0.append(r4)
            r0.append(r1)
        Lc1:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
