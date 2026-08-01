package defpackage;

/* JADX INFO: renamed from: ᛱᲇᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0195 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.EnumC2042 f1263;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f1264;

    public C0195(defpackage.EnumC2042 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f1263 = r1
            r0.f1264 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C0195
            if (r0 == 0) goto L1c
            ᛱᲇᛳᲇ r3 = (defpackage.C0195) r3
            ᲇᛴᲀᛸ r0 = r2.f1263
            ᲇᛴᲀᛸ r1 = r3.f1263
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.lang.String r2 = r2.f1264
            java.lang.String r3 = r3.f1264
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            ᲇᛴᲀᛸ r0 = r1.f1263
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f1264
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            ᲇᛴᲀᛸ r2 = r5.f1263
            r0[r1] = r2
            r2 = 1
            java.lang.String r5 = r5.f1264
            r0[r2] = r5
            java.lang.String r5 = "ᛷᲁᛳᛳ;ᲇᛶᛵᲇ"
            int r3 = r5.length()
            if (r3 != 0) goto L18
            java.lang.String[] r5 = new java.lang.String[r1]
            goto L1e
        L18:
            java.lang.String r3 = ";"
            java.lang.String[] r5 = r5.split(r3)
        L1e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.Class<ᛱᲇᛳᲇ> r4 = defpackage.C0195.class
            java.lang.String r4 = r4.getSimpleName()
            r3.<init>(r4)
            java.lang.String r4 = "["
            r3.append(r4)
        L2e:
            int r4 = r5.length
            if (r1 >= r4) goto L4c
            r4 = r5[r1]
            r3.append(r4)
            java.lang.String r4 = "="
            r3.append(r4)
            r4 = r0[r1]
            r3.append(r4)
            int r4 = r5.length
            int r4 = r4 - r2
            if (r1 == r4) goto L49
            java.lang.String r4 = ", "
            r3.append(r4)
        L49:
            int r1 = r1 + 1
            goto L2e
        L4c:
            java.lang.String r5 = "]"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
