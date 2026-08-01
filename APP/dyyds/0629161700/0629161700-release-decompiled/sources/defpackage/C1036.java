package defpackage;

/* JADX INFO: renamed from: ᛶᛳᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1036 extends defpackage.AbstractC0638 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0977 f4609;

    public C1036() {
            r2 = this;
            r2.<init>()
            ᛵᲇᛳᛳ r0 = new ᛵᲇᛳᛳ
            ᲇᛵᲀᲇ r1 = defpackage.C0977.f4370
            r1 = 0
            r0.<init>(r1)
            r2.f4609 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof defpackage.C1036
            if (r0 == 0) goto L13
            ᛶᛳᛵᛷ r2 = (defpackage.C1036) r2
            ᛵᲇᛳᛳ r2 = r2.f4609
            ᛵᲇᛳᛳ r1 = r1.f4609
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ᛵᲇᛳᛳ r0 = r0.f4609
            int r0 = r0.hashCode()
            return r0
    }
}
