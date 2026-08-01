package defpackage;

/* JADX INFO: renamed from: ᲇᲈᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2168 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.Set f9238;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String[] f9239;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0682 f9240;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int[] f9241;

    public C2168(defpackage.C0682 r1, int[] r2, java.lang.String[] r3) {
            r0 = this;
            r0.<init>()
            r0.f9240 = r1
            r0.f9241 = r2
            r0.f9239 = r3
            int r1 = r2.length
            int r2 = r3.length
            if (r1 != r2) goto L22
            int r1 = r3.length
            r2 = 0
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = r2
        L14:
            if (r1 != 0) goto L1d
            r1 = r3[r2]
            java.util.Set r1 = java.util.Collections.singleton(r1)
            goto L1f
        L1d:
            ᛵᲈᛳᲀ r1 = defpackage.C0993.f4434
        L1f:
            r0.f9238 = r1
            return
        L22:
            java.lang.String r0 = "Check failed."
            defpackage.C2264.m3676(r0)
            r0 = 0
            throw r0
    }
}
