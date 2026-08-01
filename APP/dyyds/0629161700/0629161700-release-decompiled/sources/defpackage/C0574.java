package defpackage;

/* JADX INFO: renamed from: ᛳᲇᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1622 f2846;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.Executor f2847;

    public C0574(defpackage.C1622 r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.<init>()
            r0.f2846 = r1
            r0.f2847 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C0574
            r1 = 0
            if (r0 == 0) goto L10
            ᛳᲇᛶᛳ r3 = (defpackage.C0574) r3
            ᲀᛱᲇᛶ r2 = r2.f2846
            ᲀᛱᲇᛶ r3 = r3.f2846
            if (r2 == r3) goto Le
            return r1
        Le:
            r2 = 1
            return r2
        L10:
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ᲀᛱᲇᛶ r0 = r0.f2846
            int r0 = r0.hashCode()
            return r0
    }
}
