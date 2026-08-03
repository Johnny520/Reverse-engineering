package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends p000.o4 implements p000.g3, p000.f3 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.k2 f636 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final p000.k2 f637 = null;

    static {
            ۟.k2 r0 = new ۟.k2
            r0.<init>()
            p000.k2.f636 = r0
            ۟.k2 r0 = new ۟.k2
            r0.<init>()
            p000.k2.f637 = r0
            return
    }

    public /* synthetic */ k2() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p000.f3
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo11() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.Object mo12(java.lang.Object r6) {
            r5 = this;
            ۟.a0 r6 = (p000.a0) r6
            if (r6 != 0) goto L6
            goto Lbd
        L6:
            ۟.n8 r0 = p000.n8.f823
            r0.getClass()
            java.lang.String r0 = p000.n8.m295()
            java.lang.CharSequence r0 = p000.va.m445(r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L26
            goto Lbd
        L26:
            java.lang.Integer r0 = r6.f84
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            int r0 = r0.intValue()
            if (r0 == r2) goto L44
        L31:
            java.util.List<java.lang.String> r6 = r6.f85
            if (r6 == 0) goto L41
            java.lang.String r0 = p000.n8.m295()
            boolean r6 = r6.contains(r0)
            if (r6 != r2) goto L41
            r6 = r2
            goto L42
        L41:
            r6 = r1
        L42:
            if (r6 == 0) goto Lbd
        L44:
            ۟.o7 r6 = p000.o7.f856
            java.lang.String r0 = p000.l3.m267()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ada"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.m330(r0)
            java.lang.String r0 = p000.l3.m267()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "v"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.m330(r0)
            r0 = 9
            byte[] r0 = new byte[r0]
            r0 = {x00c0: FILL_ARRAY_DATA , data: [29, 121, -18, -17, -9, 45, 17, 114, -31} // fill-array
            r3 = 6
            byte[] r4 = new byte[r3]
            r4 = {x00ca: FILL_ARRAY_DATA , data: [124, 29, -113, -116, -104, 64} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r4)
            r6.m330(r0)
            byte[] r0 = new byte[r2]
            r4 = -105(0xffffffffffffff97, float:NaN)
            r0[r1] = r4
            byte[] r4 = new byte[r3]
            r4 = {x00d2: FILL_ARRAY_DATA , data: [-28, -65, 60, -34, -34, -110} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r4)
            byte[] r2 = new byte[r2]
            r4 = -42
            r2[r1] = r4
            byte[] r1 = new byte[r3]
            r1 = {x00da: FILL_ARRAY_DATA , data: [-25, -41, 119, 82, -39, 16} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            r6.m331(r0, r1)
            r6 = 7
            byte[] r6 = new byte[r6]
            r6 = {x00e2: FILL_ARRAY_DATA , data: [51, 88, -49, 109, -57, 107, 43} // fill-array
            byte[] r0 = new byte[r3]
            r0 = {x00ea: FILL_ARRAY_DATA , data: [69, 59, -96, 0, -86, 4} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r0)
            p000.o7.m328(r6)
        Lbd:
            ۟.vb r6 = p000.vb.f1114
            return r6
    }
}
