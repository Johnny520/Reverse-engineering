package h6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h6.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5104a;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f5104a = r1
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f5104a
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto Ld
            r4.l()
            goto L21
        Ld:
            float r0 = r5.floatValue()
            double r1 = (double) r0
            h6.f.a(r1)
            boolean r1 = r5 instanceof java.lang.Float
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
        L1e:
            r4.w(r5)
        L21:
            return
        L22:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto L2a
            r4.l()
            goto L34
        L2a:
            double r0 = r5.doubleValue()
            h6.f.a(r0)
            r4.t(r0)
        L34:
            return
    }
}
