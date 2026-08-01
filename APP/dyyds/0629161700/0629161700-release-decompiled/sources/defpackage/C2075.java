package defpackage;

/* JADX INFO: renamed from: ᲇᛶᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2075 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8905;

    public C2075(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f8905 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C2075
            if (r0 == 0) goto Lf
            ᲇᛶᲁᛲ r2 = (defpackage.C2075) r2
            java.lang.String r1 = r1.f8905
            java.lang.String r2 = r2.f8905
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f8905
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StringHeaderFactory{value='"
            r0.<init>(r1)
            java.lang.String r2 = r2.f8905
            r0.append(r2)
            java.lang.String r2 = "'}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
