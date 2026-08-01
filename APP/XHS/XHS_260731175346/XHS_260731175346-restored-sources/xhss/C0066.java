package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0066 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public long f360;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0976 f361;

    public C0066(xhss.C0976 r3) {
            r2 = this;
            r2.<init>()
            r2.f361 = r3
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.f360 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0972 m214() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
        L7:
            xhss.ᲁᛸᛵᛳ r1 = r7.f361
            long r2 = r7.f360
            java.lang.String r1 = r1.m1616(r2)
            long r2 = r7.f360
            int r4 = r1.length()
            long r4 = (long) r4
            long r2 = r2 - r4
            r7.f360 = r2
            int r2 = r1.length()
            r3 = 0
            if (r2 != 0) goto L2e
            xhss.ᲁᛸᛱᛵ r7 = new xhss.ᲁᛸᛱᛵ
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r7.<init>(r0)
            return r7
        L2e:
            r2 = 4
            r4 = 58
            r5 = 1
            int r2 = xhss.AbstractC0120.m351(r1, r4, r5, r2)
            r6 = -1
            if (r2 == r6) goto L52
            java.lang.String r3 = r1.substring(r3, r2)
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            r0.add(r3)
            java.lang.CharSequence r1 = xhss.AbstractC0120.m346(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L7
        L52:
            char r2 = r1.charAt(r3)
            java.lang.String r3 = ""
            if (r2 != r4) goto L6d
            java.lang.String r1 = r1.substring(r5)
            r0.add(r3)
            java.lang.CharSequence r1 = xhss.AbstractC0120.m346(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L7
        L6d:
            r0.add(r3)
            java.lang.CharSequence r1 = xhss.AbstractC0120.m346(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L7
    }
}
