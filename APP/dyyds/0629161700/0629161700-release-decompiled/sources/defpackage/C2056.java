package defpackage;

/* JADX INFO: renamed from: ᲇᛵᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2056 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f8851 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.List f8852;

    static {
            java.lang.String r0 = "\\s*,\\s*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.C2056.f8851 = r0
            return
    }

    public C2056(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.f8852 = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.List r3 = r3.f8852
            java.lang.String r1 = ""
            java.lang.String r2 = ","
            java.lang.String r3 = defpackage.AbstractC1849.m3251(r2, r1, r3)
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
