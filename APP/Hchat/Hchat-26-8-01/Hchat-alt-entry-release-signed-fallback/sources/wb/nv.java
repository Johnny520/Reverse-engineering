package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class nv implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17989h;

    public nv(java.util.List r2) {
            r1 = this;
            r0 = 1
            r1.f17988g = r0
            r1.<init>()
            r1.f17989h = r2
            return
    }

    public nv(wb.sr r1, java.util.List r2) {
            r0 = this;
            r1 = 0
            r0.f17988g = r1
            r0.<init>()
            r0.f17989h = r2
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f17988g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.util.List r0 = r1.f17989h
            r0.get(r2)
            r2 = 0
            return r2
        L12:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.util.List r0 = r1.f17989h
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            return r2
    }
}
