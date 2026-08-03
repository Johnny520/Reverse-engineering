package d5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d5.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1982j;

    public /* synthetic */ a(b5.i r1, int r2, t5.d r3, int r4) {
            r0 = this;
            r0.f1982j = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // d5.e, b5.j
    public final boolean c(e5.a r8) {
            r7 = this;
            int r0 = r7.f1982j
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "#Replaced unresolvable odex instruction with a throw\n"
            r8.write(r0)
            java.lang.String r0 = "throw "
            r8.write(r0)
            t5.d r0 = r7.f1990i
            g5.a r0 = (g5.a) r0
            r0.getClass()
            r0 = 0
            r7.l(r8, r0)
            r8 = 1
            return r8
        L1c:
            t5.d r0 = r7.f1990i
            l5.b r0 = (l5.b) r0
            int r1 = r0.t()
            java.lang.String r2 = ".array-data "
            r8.write(r2)
            int r2 = r0.t()
            r8.z(r2)
            r2 = 10
            r8.write(r2)
            r8.w()
            int r2 = r0.f7849c
            r3 = 8
            int r2 = r2 + r3
            int r4 = r0.f7852e
            if (r4 != 0) goto L44
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            goto L7f
        L44:
            int r4 = r0.f7851d
            r5 = 1
            if (r4 == r5) goto L78
            r5 = 2
            if (r4 == r5) goto L71
            r5 = 4
            if (r4 == r5) goto L6a
            if (r4 != r3) goto L59
            l5.a r3 = new l5.a
            r4 = 3
            r3.<init>(r0, r2, r4)
        L57:
            r0 = r3
            goto L7f
        L59:
            d6.f r8 = new d6.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 0
            java.lang.String r2 = "Invalid element width: %d"
            r8.<init>(r1, r2, r0)
            throw r8
        L6a:
            l5.a r3 = new l5.a
            r4 = 2
            r3.<init>(r0, r2, r4)
            goto L57
        L71:
            l5.a r3 = new l5.a
            r4 = 1
            r3.<init>(r0, r2, r4)
            goto L57
        L78:
            l5.a r3 = new l5.a
            r4 = 0
            r3.<init>(r0, r2, r4)
            goto L57
        L7f:
            r2 = 1
            if (r1 == r2) goto L8b
            r3 = 2
            if (r1 == r3) goto L88
            java.lang.String r3 = ""
            goto L8d
        L88:
            java.lang.String r3 = "s"
            goto L8d
        L8b:
            java.lang.String r3 = "t"
        L8d:
            java.util.Iterator r0 = r0.iterator()
        L91:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lc9
            java.lang.Object r4 = r0.next()
            java.lang.Number r4 = (java.lang.Number) r4
            long r5 = r4.longValue()
            r8.A(r5)
            r8.write(r3)
            r5 = 8
            if (r1 != r5) goto Lb3
            long r4 = r4.longValue()
            d5.e.d(r8, r4)
            goto Lc3
        Lb3:
            r5 = 4
            if (r1 != r5) goto Lc3
            int r4 = r4.intValue()
            boolean r5 = r7.f(r8, r4)
            if (r5 != 0) goto Lc3
            d5.e.e(r8, r4)
        Lc3:
            java.lang.String r4 = "\n"
            r8.write(r4)
            goto L91
        Lc9:
            r8.u()
            java.lang.String r0 = ".end array-data"
            r8.write(r0)
            return r2
    }
}
