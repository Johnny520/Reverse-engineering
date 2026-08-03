package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements og.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.regex.Matcher f9828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f9829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final og.h f9830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public og.g f9831d;

    public i(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f9828a = r1
            r0.f9829b = r2
            og.h r1 = new og.h
            r2 = 0
            r1.<init>(r0, r2)
            r0.f9830c = r1
            return
    }

    public final java.util.List a() {
            r1 = this;
            og.g r0 = r1.f9831d
            if (r0 != 0) goto Lb
            og.g r0 = new og.g
            r0.<init>(r1)
            r1.f9831d = r0
        Lb:
            og.g r0 = r1.f9831d
            r0.getClass()
            return r0
    }

    public final lg.d b() {
            r2 = this;
            java.util.regex.Matcher r0 = r2.f9828a
            int r1 = r0.start()
            int r0 = r0.end()
            lg.d r0 = r9.e0.r0(r1, r0)
            return r0
    }

    public final java.lang.String c() {
            r1 = this;
            java.util.regex.Matcher r0 = r1.f9828a
            java.lang.String r0 = r0.group()
            r0.getClass()
            return r0
    }

    public final og.i d() {
            r4 = this;
            java.util.regex.Matcher r0 = r4.f9828a
            int r1 = r0.end()
            int r2 = r0.end()
            int r3 = r0.start()
            if (r2 != r3) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            int r1 = r1 + r2
            java.lang.CharSequence r2 = r4.f9829b
            int r3 = r2.length()
            if (r1 > r3) goto L2c
            java.util.regex.Pattern r0 = r0.pattern()
            java.util.regex.Matcher r0 = r0.matcher(r2)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r1, r2)
            return r0
        L2c:
            r0 = 0
            return r0
    }
}
