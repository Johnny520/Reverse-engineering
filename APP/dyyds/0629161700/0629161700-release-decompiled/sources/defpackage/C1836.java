package defpackage;

/* JADX INFO: renamed from: ᲁᛳᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1836 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0389 f8024 = null;

    static {
            ᛷᛸᛵ r0 = new ᛷᛸᛵ
            r1 = 24
            r0.<init>(r1)
            ᛲᲈᛶᲈ r1 = new ᛲᲈᛶᲈ
            r1.<init>(r0)
            defpackage.C1836.f8024 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3231(android.content.Context r3, java.lang.String r4) {
            r0 = -498530023546414(0xfffe3a96ef0961d2, double:NaN)
            if (r3 == 0) goto L23
            boolean r0 = defpackage.AbstractC1347.m2524(r4)
            if (r0 == 0) goto L11
            goto L23
        L11:
            ᛲᲈᛶᲈ r0 = defpackage.C1836.f8024
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            ᛸᛳᛴᲁ r1 = new ᛸᛳᛴᲁ
            r2 = 9
            r1.<init>(r3, r2, r4)
            r0.post(r1)
        L23:
            return
    }
}
