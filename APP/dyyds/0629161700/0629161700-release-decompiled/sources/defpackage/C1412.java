package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1412 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0150 f6182 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.HashMap f6183;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1184 f6184;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object f6185;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f6186;

    static {
            java.lang.Class<ᛸᛱᛲ> r0 = defpackage.C1412.class
            ᛱᛸᲀᛱ r0 = defpackage.AbstractC1011.m1965(r0)
            defpackage.C1412.f6182 = r0
            return
    }

    public C1412(java.lang.Object r1, java.lang.Object r2, defpackage.C1184 r3, java.util.HashMap r4) {
            r0 = this;
            r0.<init>()
            r0.f6185 = r1
            r0.f6186 = r2
            r0.f6184 = r3
            r0.f6183 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object m2597(defpackage.C1003 r5) {
            r4 = this;
            boolean r0 = r5.f4462
            r1 = 1
            ᛶᲈᛵᛲ r2 = r4.f6184
            java.lang.Object r3 = r4.f6186
            if (r0 == 0) goto L3b
            java.util.HashMap r4 = r4.f6183
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L2f
            ᲀᛳᲁᛵ r0 = r5.f4461
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Using cached result for root path: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            ᛱᛸᲀᛱ r1 = defpackage.C1412.f6182
            r1.mo673(r0)
            java.lang.Object r4 = r4.get(r5)
            return r4
        L2f:
            ᛲᛷᛸ r0 = r5.m1958(r3, r3, r2)
            java.lang.Object r0 = r0.m995(r1)
            r4.put(r5, r0)
            return r0
        L3b:
            java.lang.Object r4 = r4.f6185
            ᛲᛷᛸ r4 = r5.m1958(r4, r3, r2)
            java.lang.Object r4 = r4.m995(r1)
            return r4
    }
}
