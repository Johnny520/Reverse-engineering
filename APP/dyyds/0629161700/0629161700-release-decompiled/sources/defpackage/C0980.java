package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0980 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C2223 f4390 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile byte[] f4391;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f4392;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object f4393;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0468 f4394;

    static {
            ᲈᛴᛵᲈ r0 = new ᲈᛴᛵᲈ
            r1 = 3
            r0.<init>(r1)
            defpackage.C0980.f4390 = r0
            return
    }

    public C0980(java.lang.String r2, java.lang.Object r3, defpackage.InterfaceC0468 r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L10
            r1.f4392 = r2
            r1.f4393 = r3
            r1.f4394 = r4
            return
        L10:
            java.lang.String r1 = "Must not be null or empty"
            defpackage.C2264.m3684(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0980 m1921(java.lang.Object r2, java.lang.String r3) {
            ᛵᲇᛳᲇ r0 = new ᛵᲇᛳᲇ
            ᲈᛴᛵᲈ r1 = defpackage.C0980.f4390
            r0.<init>(r3, r2, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0980
            if (r0 == 0) goto Lf
            ᛵᲇᛳᲇ r2 = (defpackage.C0980) r2
            java.lang.String r1 = r1.f4392
            java.lang.String r2 = r2.f4392
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f4392
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Option{key='"
            r0.<init>(r1)
            java.lang.String r2 = r2.f4392
            r0.append(r2)
            java.lang.String r2 = "'}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
