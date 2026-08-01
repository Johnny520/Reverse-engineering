package defpackage;

/* JADX INFO: renamed from: ᛷᛱᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1213 {
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String[] m2350(android.view.View r0) {
            java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0406 m2351(android.view.View r1, defpackage.C0406 r2) {
            ᛴᲇᛸᛷ r0 = r2.f2063
            android.view.ContentInfo r0 = r0.mo1705()
            android.view.ContentInfo r1 = r1.performReceiveContent(r0)
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            if (r1 != r0) goto L11
            return r2
        L11:
            ᛳᛱᛴᛸ r2 = new ᛳᛱᛴᛸ
            ᛸᲈᛸᲈ r0 = new ᛸᲈᛸᲈ
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
    }
}
