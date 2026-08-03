package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q7 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18580i;

    public /* synthetic */ q7(int r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f18578g = r3
            r0.f18579h = r1
            r0.f18580i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f18578g
            switch(r0) {
                case 0: goto L59;
                case 1: goto L2b;
                case 2: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            i0.a1 r0 = r3.f18580i
            java.lang.Object r1 = r0.getValue()
            db.c r1 = (db.c) r1
            int r2 = r3.f18579h
            db.c r4 = wb.ho.m7(r1, r2, r4)
            r0.setValue(r4)
        L1b:
            sf.n r4 = sf.n.f12433a
            return r4
        L1e:
            x8.s r4 = (x8.s) r4
            r4.getClass()
            i0.a1 r0 = r3.f18580i
            int r1 = r3.f18579h
            wb.ho.H(r0, r1, r4)
            goto L1b
        L2b:
            na.h r4 = (na.h) r4
            r4.getClass()
            int r0 = r3.f18579h
            if (r0 < 0) goto L56
            i0.a1 r1 = r3.f18580i
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            if (r0 >= r2) goto L56
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = tf.m.R1(r2)
            na.h r4 = wb.ho.q6(r4)
            r2.set(r0, r4)
            r1.setValue(r2)
        L56:
            sf.n r4 = sf.n.f12433a
            return r4
        L59:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            i0.a1 r0 = r3.f18580i
            java.lang.Object r1 = r0.getValue()
            db.c r1 = (db.c) r1
            int r2 = r3.f18579h
            db.c r4 = wb.ho.m7(r1, r2, r4)
            r0.setValue(r4)
            goto L1b
    }
}
