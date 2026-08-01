package defpackage;

/* JADX INFO: renamed from: ᛵᛵᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0889 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.res.Resources f4009;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.content.res.Resources.Theme f4010;

    public C0889(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>()
            r0.f4009 = r1
            r0.f4010 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<ᛵᛵᛶᛴ> r2 = defpackage.C0889.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            ᛵᛵᛶᛴ r5 = (defpackage.C0889) r5
            android.content.res.Resources r2 = r4.f4009
            android.content.res.Resources r3 = r5.f4009
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            android.content.res.Resources$Theme r4 = r4.f4010
            android.content.res.Resources$Theme r5 = r5.f4010
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            android.content.res.Resources r0 = r1.f4009
            android.content.res.Resources$Theme r1 = r1.f4010
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            int r1 = java.util.Objects.hash(r1)
            return r1
    }
}
