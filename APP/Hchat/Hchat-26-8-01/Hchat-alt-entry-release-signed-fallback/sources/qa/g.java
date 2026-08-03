package qa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final og.k f10796a = null;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "[+-]?\\d+(?:\\.\\d+)?"
            r0.<init>(r1)
            qa.g.f10796a = r0
            return
    }

    public static java.math.BigDecimal a(java.lang.String r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            r3 = r0
        L5:
            java.lang.String r1 = ","
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r1, r0, r2)
            og.k r0 = qa.g.f10796a
            og.i r3 = og.k.b(r0, r3)
            r0 = 2
            if (r3 == 0) goto L3d
            java.lang.String r3 = r3.c()
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: java.lang.Throwable -> L25
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L25
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.Throwable -> L25
            java.math.BigDecimal r3 = r1.setScale(r0, r3)     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r3 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r3)
            r3 = r1
        L2c:
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            java.math.BigDecimal r0 = r1.setScale(r0)
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L37
            r3 = r0
        L37:
            r3.getClass()
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            return r3
        L3d:
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            java.math.BigDecimal r3 = r3.setScale(r0)
            r3.getClass()
            return r3
    }

    public static java.lang.String b(android.content.SharedPreferences r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1.getClass()
            r2.getClass()
            r4.getClass()
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L18
            java.lang.String r1 = r1.getString(r2, r4)
            java.lang.String r1 = e(r1, r4)
            return r1
        L18:
            java.lang.String r1 = ""
            if (r3 != 0) goto L1d
            r3 = r1
        L1d:
            java.lang.String r2 = ","
            r0 = 0
            java.lang.String r2 = og.t.a0(r3, r2, r1, r0)
            java.lang.String r3 = "¥"
            java.lang.String r2 = og.t.a0(r2, r3, r1, r0)
            java.lang.String r3 = "￥"
            java.lang.String r1 = og.t.a0(r2, r3, r1, r0)
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            r2 = 43
            boolean r2 = og.m.I0(r1, r2)
            if (r2 == 0) goto L43
            java.lang.String r1 = "increase"
            return r1
        L43:
            r2 = 45
            boolean r1 = og.m.I0(r1, r2)
            if (r1 == 0) goto L4e
            java.lang.String r1 = "decrease"
            return r1
        L4e:
            java.lang.String r1 = "fixed"
            java.lang.String r1 = e(r4, r1)
            return r1
    }

    public static boolean c(android.content.SharedPreferences r2, java.lang.String r3) {
            r2.getClass()
            boolean r0 = r2.contains(r3)
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r2 = r2.getBoolean(r3, r1)
            return r2
        Lf:
            java.lang.String r3 = "fake_wallet_balance_enable"
            boolean r2 = r2.getBoolean(r3, r1)
            return r2
    }

    public static java.lang.String d(java.lang.String r2) {
            java.math.BigDecimal r2 = a(r2)
            java.math.BigDecimal r2 = r2.abs()
            r0 = 2
            java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r2 = r2.setScale(r0, r1)
            java.lang.String r2 = r2.toPlainString()
            r2.getClass()
            return r2
    }

    public static java.lang.String e(java.lang.String r1, java.lang.String r2) {
            if (r1 == 0) goto L25
            java.lang.String r0 = "fixed"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "increase"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            java.lang.String r0 = "decrease"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L25
            return r1
        L25:
            return r2
    }
}
