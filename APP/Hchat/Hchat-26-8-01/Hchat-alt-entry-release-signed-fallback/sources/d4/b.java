package d4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1981d;

    public /* synthetic */ b(ff.a r2, java.lang.String r3, byte[] r4) {
            r1 = this;
            r0 = 1
            r1.f1978a = r0
            r1.<init>()
            r1.f1981d = r2
            r1.f1979b = r3
            r1.f1980c = r4
            return
    }

    public /* synthetic */ b(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f1978a = r4
            r0.f1979b = r1
            r0.f1980c = r2
            r0.f1981d = r3
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f1978a
            switch(r0) {
                case 0: goto L93;
                case 1: goto L7c;
                case 2: goto L5f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.f1979b
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r1 = r6.f1980c
            nd.b0 r1 = (nd.b0) r1
            java.lang.Object r2 = r6.f1981d
            qd.j r2 = (qd.j) r2
            qd.j r7 = (qd.j) r7
            r7.getClass()
            boolean r3 = r7 instanceof qd.c
            if (r3 == 0) goto L5d
            java.lang.String r3 = r7.l()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r0.next()
            qd.j r4 = (qd.j) r4
            java.lang.String r5 = r4.l()
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L22
            java.util.List r0 = r4.i()
            r7.B(r0)
            goto L5d
        L40:
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown type variable: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = " in type: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r1.L(r7)
        L5d:
            r7 = 0
            return r7
        L5f:
            java.lang.Object r0 = r6.f1979b
            fe.a r0 = (fe.a) r0
            java.lang.Object r1 = r6.f1980c
            qd.j r1 = (qd.j) r1
            java.lang.Object r2 = r6.f1981d
            java.util.List r2 = (java.util.List) r2
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r7 = r2.get(r7)
            qd.j r7 = (qd.j) r7
            qd.j r7 = r0.l(r1, r1, r7)
            return r7
        L7c:
            java.lang.Object r0 = r6.f1981d
            ff.a r0 = (ff.a) r0
            java.lang.Object r1 = r6.f1979b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.f1980c
            byte[] r2 = (byte[]) r2
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            ff.e r7 = r0.e(r1, r2, r7)
            return r7
        L93:
            java.lang.Object r0 = r6.f1979b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r6.f1980c
            byte[] r1 = (byte[]) r1
            java.lang.Object r2 = r6.f1981d
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class r7 = bsh.loader.BshLoaderHelper.a(r0, r1, r2, r7)
            return r7
    }
}
