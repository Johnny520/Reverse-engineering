package defpackage;

/* JADX INFO: renamed from: ᛴᛷᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0716 extends defpackage.AbstractC1709 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f3368;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.regex.Pattern f3369;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3370;

    public C0716(java.lang.CharSequence r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r4 = r4.toString()
            r0 = 47
            int r1 = r4.indexOf(r0)
            int r0 = r4.lastIndexOf(r0)
            int r1 = r1 + 1
            java.lang.String r1 = r4.substring(r1, r0)
            r3.f3370 = r1
            int r0 = r0 + 1
            int r2 = r4.length()
            if (r2 <= r0) goto L26
            java.lang.String r4 = r4.substring(r0)
            goto L28
        L26:
            java.lang.String r4 = ""
        L28:
            r3.f3368 = r4
            char[] r4 = r4.toCharArray()
            int r4 = defpackage.AbstractC1124.m2148(r4)
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r1, r4)
            r3.f3369 = r4
            return
    }

    public C0716(java.util.regex.Pattern r8) {
            r7 = this;
            r7.<init>()
            java.lang.String r0 = r8.pattern()
            r7.f3370 = r0
            r7.f3369 = r8
            int r8 = r8.flags()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 7
            int[] r1 = defpackage.AbstractC0225.m825(r1)
            int r2 = r1.length
            r3 = 0
        L1b:
            if (r3 >= r2) goto L31
            r4 = r1[r3]
            int r5 = defpackage.AbstractC1124.m2147(r4)
            r6 = r5 & r8
            if (r6 != r5) goto L2e
            char r4 = defpackage.AbstractC1124.m2146(r4)
            r0.append(r4)
        L2e:
            int r3 = r3 + 1
            goto L1b
        L31:
            java.lang.String r8 = r0.toString()
            r7.f3368 = r8
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C0716
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛴᛷᲈᛱ r4 = (defpackage.C0716) r4
            java.util.regex.Pattern r4 = r4.f3369
            java.util.regex.Pattern r3 = r3.f3369
            if (r3 == 0) goto L19
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
            goto L1c
        L19:
            if (r4 != 0) goto L1c
        L1b:
            return r0
        L1c:
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.f3370
            java.lang.String r1 = "/"
            boolean r2 = r0.startsWith(r1)
            if (r2 != 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r3 = r3.f3368
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
        L1f:
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0716 mo1623() {
            r0 = this;
            return r0
    }
}
