package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface m extends oc.b {
    @Override // oc.b
    /* bridge */ /* synthetic */ default oc.a a() {
            r1 = this;
            md.b r0 = md.b.I
            return r0
    }

    java.util.List c();

    @Override // oc.b
    default java.lang.String d() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MD:"
            r0.<init>(r1)
            java.util.List r1 = r4.getTypeParameters()
            boolean r1 = xe.s.n(r1)
            java.lang.String r2 = ", "
            if (r1 == 0) goto L28
            r1 = 60
            r0.append(r1)
            java.util.List r1 = r4.getTypeParameters()
            java.lang.String r1 = xe.s.j(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ">:"
            r0.append(r1)
        L28:
            r1 = 40
            r0.append(r1)
            java.util.List r1 = r4.c()
            java.lang.String r1 = xe.s.j(r1, r2)
            r0.append(r1)
            java.lang.String r1 = "):"
            r0.append(r1)
            qd.j r1 = r4.e()
            r0.append(r1)
            boolean r1 = r4.v()
            if (r1 == 0) goto L4f
            java.lang.String r1 = " VARARG"
            r0.append(r1)
        L4f:
            java.util.List r1 = r4.s()
            boolean r3 = xe.s.n(r1)
            if (r3 == 0) goto L65
            java.lang.String r3 = " throws "
            r0.append(r3)
            java.lang.String r1 = xe.s.j(r1, r2)
            r0.append(r1)
        L65:
            java.lang.String r0 = r0.toString()
            return r0
    }

    qd.j e();

    java.util.List getTypeParameters();

    int o();

    od.d q();

    java.util.List s();

    boolean v();
}
