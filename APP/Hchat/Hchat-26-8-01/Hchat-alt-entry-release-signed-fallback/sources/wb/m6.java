package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m6 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f17599h;

    public /* synthetic */ m6(int r1, boolean r2) {
            r0 = this;
            r0.f17598g = r1
            r0.f17599h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f17598g
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L3e;
                case 2: goto L30;
                case 3: goto L24;
                case 4: goto L17;
                default: goto Lb;
            }
        Lb:
            boolean r0 = r1.f17599h
            if (r0 == 0) goto L12
            int r2 = -r2
            int r2 = r2 / 4
        L12:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L17:
            boolean r0 = r1.f17599h
            if (r0 == 0) goto L1c
            goto L1f
        L1c:
            int r2 = -r2
            int r2 = r2 / 4
        L1f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L24:
            boolean r0 = r1.f17599h
            if (r0 == 0) goto L29
            int r2 = -r2
        L29:
            int r2 = r2 / 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L30:
            boolean r0 = r1.f17599h
            if (r0 == 0) goto L37
        L34:
            int r2 = r2 / 3
            goto L39
        L37:
            int r2 = -r2
            goto L34
        L39:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L3e:
            boolean r0 = r1.f17599h
            if (r0 == 0) goto L45
            int r2 = -r2
            int r2 = r2 / 4
        L45:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L4a:
            boolean r0 = r1.f17599h
            if (r0 == 0) goto L4f
            goto L52
        L4f:
            int r2 = -r2
            int r2 = r2 / 4
        L52:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }
}
