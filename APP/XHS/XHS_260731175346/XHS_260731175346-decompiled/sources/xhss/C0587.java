package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛸᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0587 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f2043 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.List f2044;

    static {
            java.lang.String r0 = "\\s*,\\s*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            xhss.C0587.f2043 = r0
            return
    }

    public C0587(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.f2044 = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.List r3 = r3.f2044
            java.lang.String r1 = ""
            java.lang.String r2 = ","
            java.lang.String r3 = xhss.AbstractC0473.m868(r2, r1, r3)
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
