package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p4.t f14626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p4.t f14627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Long f14629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14630e;

    public final void a(n2.s r5) {
            r4 = this;
            r0 = 0
            r4.f14630e = r0
            p4.t r0 = r4.f14626a
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f10225i
            n2.s r0 = (n2.s) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            boolean r0 = gg.l.a(r5, r0)
            if (r0 == 0) goto L16
            goto L7a
        L16:
            i2.g r0 = r5.f8976a
            java.lang.String r0 = r0.f6314h
            p4.t r2 = r4.f14626a
            if (r2 == 0) goto L29
            java.lang.Object r2 = r2.f10225i
            n2.s r2 = (n2.s) r2
            if (r2 == 0) goto L29
            i2.g r2 = r2.f8976a
            java.lang.String r2 = r2.f6314h
            goto L2a
        L29:
            r2 = r1
        L2a:
            boolean r0 = gg.l.a(r0, r2)
            p4.t r2 = r4.f14626a
            if (r0 == 0) goto L37
            if (r2 == 0) goto L7a
            r2.f10225i = r5
            return
        L37:
            p4.t r0 = new p4.t
            r3 = 14
            r0.<init>(r2, r3, r5)
            r4.f14626a = r0
            r4.f14627b = r1
            int r0 = r4.f14628c
            i2.g r5 = r5.f8976a
            java.lang.String r5 = r5.f6314h
            int r5 = r5.length()
            int r5 = r5 + r0
            r4.f14628c = r5
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r5 <= r0) goto L7a
            p4.t r5 = r4.f14626a
            if (r5 == 0) goto L5d
            java.lang.Object r0 = r5.f10224h
            p4.t r0 = (p4.t) r0
            goto L5e
        L5d:
            r0 = r1
        L5e:
            if (r0 != 0) goto L61
            goto L7a
        L61:
            if (r5 == 0) goto L6e
            java.lang.Object r0 = r5.f10224h
            p4.t r0 = (p4.t) r0
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r0.f10224h
            p4.t r0 = (p4.t) r0
            goto L6f
        L6e:
            r0 = r1
        L6f:
            if (r0 == 0) goto L76
            java.lang.Object r5 = r5.f10224h
            p4.t r5 = (p4.t) r5
            goto L61
        L76:
            if (r5 == 0) goto L7a
            r5.f10224h = r1
        L7a:
            return
    }
}
