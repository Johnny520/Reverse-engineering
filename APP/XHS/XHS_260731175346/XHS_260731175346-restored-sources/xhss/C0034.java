package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛴᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0034 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0144 f219 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0144 f220 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f221;

    static {
            xhss.ᛲᛳᛴᲁ r0 = new xhss.ᛲᛳᛴᲁ
            java.lang.String r1 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            r0.<init>(r1)
            xhss.C0034.f219 = r0
            xhss.ᛲᛳᛴᲁ r0 = new xhss.ᛲᛳᛴᲁ
            java.lang.String r1 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            r0.<init>(r1)
            xhss.C0034.f220 = r0
            return
    }

    public C0034(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f221 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0034
            if (r0 == 0) goto L12
            xhss.ᛱᛴᛲᛴ r2 = (xhss.C0034) r2
            java.lang.String r2 = r2.f221
            java.lang.String r1 = r1.f221
            boolean r1 = xhss.AbstractC0007.m97(r2, r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f221
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f221
            return r0
    }
}
