package defpackage;

/* JADX INFO: renamed from: ᲁᲀᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1919 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.regex.Pattern f8356;

    public C1919(java.lang.String r1) {
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r0.<init>()
            r0.f8356 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1326 m3350(defpackage.C1919 r0, java.lang.String r1) {
            java.util.regex.Pattern r0 = r0.f8356
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r1 = 0
            boolean r1 = r0.find(r1)
            if (r1 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ
            r1.<init>(r0)
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            java.util.regex.Pattern r0 = r0.f8356
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1326 m3351(java.lang.CharSequence r2, int r3) {
            r1 = this;
            java.util.regex.Pattern r1 = r1.f8356
            java.util.regex.Matcher r1 = r1.matcher(r2)
            r0 = 0
            java.util.regex.Matcher r1 = r1.useAnchoringBounds(r0)
            r0 = 1
            java.util.regex.Matcher r1 = r1.useTransparentBounds(r0)
            int r2 = r2.length()
            java.util.regex.Matcher r1 = r1.region(r3, r2)
            boolean r2 = r1.lookingAt()
            if (r2 == 0) goto L24
            ᛷᛸᛱᛸ r2 = new ᛷᛸᛱᛸ
            r2.<init>(r1)
            return r2
        L24:
            r1 = 0
            return r1
    }
}
