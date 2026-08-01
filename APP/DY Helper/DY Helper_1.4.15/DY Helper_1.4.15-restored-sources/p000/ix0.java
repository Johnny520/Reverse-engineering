package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ix0 {

    /* JADX INFO: renamed from: α */
    public final java.util.regex.Matcher f5234;

    /* JADX INFO: renamed from: β */
    public final java.lang.CharSequence f5235;

    /* JADX INFO: renamed from: γ */
    public final p000.hx0 f5236;

    /* JADX INFO: renamed from: δ */
    public p000.gx0 f5237;

    public ix0(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f5234 = r1
            r0.f5235 = r2
            hx0 r1 = new hx0
            r2 = 0
            r1.<init>(r2, r0)
            r0.f5236 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final java.util.List m2824() {
            r1 = this;
            gx0 r0 = r1.f5237
            if (r0 != 0) goto Lb
            gx0 r0 = new gx0
            r0.<init>(r1)
            r1.f5237 = r0
        Lb:
            gx0 r1 = r1.f5237
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final p000.xm0 m2825() {
            r1 = this;
            java.util.regex.Matcher r1 = r1.f5234
            int r0 = r1.start()
            int r1 = r1.end()
            xm0 r1 = p000.j81.m2893(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final p000.ix0 m2826() {
            r4 = this;
            java.util.regex.Matcher r0 = r4.f5234
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
            java.lang.CharSequence r4 = r4.f5235
            int r2 = r4.length()
            if (r1 > r2) goto L2c
            java.util.regex.Pattern r0 = r0.pattern()
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            ix0 r4 = p000.v71.m6032(r0, r1, r4)
            return r4
        L2c:
            r4 = 0
            return r4
    }
}
