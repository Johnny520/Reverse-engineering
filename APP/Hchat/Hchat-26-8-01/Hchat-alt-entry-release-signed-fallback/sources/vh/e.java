package vh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f1.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14385b;

    public /* synthetic */ e(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f14384a = r2
            r0.f14385b = r1
            r0.<init>()
            return
    }

    @Override // f1.r0
    public final f1.c0 a(long r5, u2.m r7, u2.c r8) {
            r4 = this;
            int r0 = r4.f14384a
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            f1.j0 r5 = new f1.j0
            java.lang.Object r6 = r4.f14385b
            f1.j r6 = (f1.j) r6
            r5.<init>(r6)
            return r5
        Lf:
            r7.getClass()
            r8.getClass()
            java.lang.Object r0 = r4.f14385b
            vh.f r0 = (vh.f) r0
            java.lang.Object r1 = r0.f14388c
            fg.a r1 = (fg.a) r1
            java.lang.Object r1 = r1.invoke()
            f1.r0 r1 = (f1.r0) r1
            java.lang.Object r2 = r0.f14389d
            f1.r0 r2 = (f1.r0) r2
            boolean r2 = gg.l.a(r2, r1)
            if (r2 != 0) goto L32
            r0.f14389d = r1
            r2 = 0
            r0.f14390e = r2
        L32:
            java.lang.Object r2 = r0.f14390e
            f1.c0 r2 = (f1.c0) r2
            if (r2 == 0) goto L57
            long r2 = r0.f14387b
            boolean r2 = e1.e.a(r2, r5)
            if (r2 == 0) goto L57
            u2.m r2 = r0.f14386a
            if (r2 != r7) goto L57
            java.lang.Object r2 = r0.f14391f
            java.lang.Float r2 = (java.lang.Float) r2
            float r3 = r8.d()
            if (r2 == 0) goto L57
            float r2 = r2.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L57
            goto L6b
        L57:
            r0.f14387b = r5
            r0.f14386a = r7
            float r2 = r8.d()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.f14391f = r2
            f1.c0 r5 = r1.a(r5, r7, r8)
            r0.f14390e = r5
        L6b:
            java.lang.Object r5 = r0.f14390e
            f1.c0 r5 = (f1.c0) r5
            r5.getClass()
            return r5
    }
}
