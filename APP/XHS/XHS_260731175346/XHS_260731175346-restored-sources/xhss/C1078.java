package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲀᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1078 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0623 f3472;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f3473;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.ArrayList f3474;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3475;

    public C1078(xhss.C0623 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3474 = r0
            r0 = -1
            r1.f3475 = r0
            r1.f3472 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.f3475
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r2 = r2.f3475
            r0.append(r2)
        L25:
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
