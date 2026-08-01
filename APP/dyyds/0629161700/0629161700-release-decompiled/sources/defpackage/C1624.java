package defpackage;

/* JADX INFO: renamed from: ᲀᛱᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1624 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.util.List f7218;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public java.lang.String f7219;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.String f7220;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1624
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲀᛱᲈᲈ r5 = (defpackage.C1624) r5
            java.lang.String r1 = r4.f7219
            java.lang.String r3 = r5.f7219
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f7220
            java.lang.String r3 = r5.f7220
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.util.List r4 = r4.f7218
            java.util.List r5 = r5.f7218
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f7219
            java.lang.String r1 = r2.f7220
            java.util.List r2 = r2.f7218
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = java.util.Objects.hash(r2)
            return r2
    }
}
