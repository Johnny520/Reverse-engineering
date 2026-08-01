package defpackage;

/* JADX INFO: renamed from: ᛶᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1027 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1027 f4588 = null;

    static {
            ᛶᛲᲇ r0 = new ᛶᛲᲇ
            r0.<init>()
            defpackage.C1027.f4588 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String m1980(java.lang.Object r2) {
            boolean r0 = r2 instanceof defpackage.C1027
            if (r0 == 0) goto L5
            goto L37
        L5:
            boolean r0 = r2 instanceof java.lang.Class
            java.lang.Class<ᛶᛲᲇ> r1 = defpackage.C1027.class
            if (r0 == 0) goto L24
            ᛲᲀᲈᛳ r0 = defpackage.AbstractC1168.m2249(r1)
            java.lang.Class r0 = defpackage.AbstractC1533.m2785(r0)
            if (r0 != 0) goto L16
            goto L17
        L16:
            r1 = r0
        L17:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L37
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.toString()
            return r2
        L24:
            boolean r0 = r2 instanceof defpackage.C0355
            if (r0 == 0) goto L3a
            ᛲᲀᲈᛳ r0 = defpackage.AbstractC1168.m2249(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L37
            java.lang.String r2 = r2.toString()
            return r2
        L37:
            java.lang.String r2 = "VagueType"
            return r2
        L3a:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L68
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.AbstractC0575.m1369(r2)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L5e
            java.lang.String r1 = m1980(r1)
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r0.add(r1)
            goto L4d
        L63:
            java.lang.String r2 = r0.toString()
            return r2
        L68:
            java.lang.String r2 = r2.toString()
            return r2
    }
}
