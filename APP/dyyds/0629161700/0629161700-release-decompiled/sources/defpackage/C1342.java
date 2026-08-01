package defpackage;

/* JADX INFO: renamed from: ᛷᛸᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1342 implements java.lang.Cloneable {
    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            ᛷᛸᲁᛴ r0 = r0.m2493()
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1342
            if (r0 == 0) goto Lc
            boolean r1 = r1.m2494(r2)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ᛸᛵᛴᛲ r0 = defpackage.C2037.f8775
            int r0 = r0.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1342 m2493() {
            r1 = this;
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            ᛷᛸᲁᛴ r1 = (defpackage.C1342) r1     // Catch: java.lang.CloneNotSupportedException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m2494(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C1342
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
