package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1509 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1509 f6669 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0586 f6670;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r0)
            ᛸᛶᛶᛸ r0 = new ᛸᛶᛶᛸ
            ᛳᲈᛲᛳ r2 = new ᛳᲈᛲᛳ
            r2.<init>(r1)
            r0.<init>(r2)
            defpackage.C1509.f6669 = r0
            return
    }

    public C1509(defpackage.C0586 r1) {
            r0 = this;
            r0.<init>()
            r0.f6670 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1509 m2743(java.lang.String r4) {
            if (r4 == 0) goto L31
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L31
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r4 = r4.split(r0, r1)
            int r0 = r4.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L21
            r3 = r4[r2]
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L21:
            android.os.LocaleList r4 = new android.os.LocaleList
            r4.<init>(r1)
            ᛸᛶᛶᛸ r0 = new ᛸᛶᛶᛸ
            ᛳᲈᛲᛳ r1 = new ᛳᲈᛲᛳ
            r1.<init>(r4)
            r0.<init>(r1)
            return r0
        L31:
            ᛸᛶᛶᛸ r4 = defpackage.C1509.f6669
            return r4
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1509
            if (r0 == 0) goto L12
            ᛸᛶᛶᛸ r2 = (defpackage.C1509) r2
            ᛳᲈᛲᛳ r2 = r2.f6670
            ᛳᲈᛲᛳ r1 = r1.f6670
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ᛳᲈᛲᛳ r0 = r0.f6670
            android.os.LocaleList r0 = r0.f2923
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            ᛳᲈᛲᛳ r0 = r0.f6670
            android.os.LocaleList r0 = r0.f2923
            java.lang.String r0 = r0.toString()
            return r0
    }
}
