package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements java.util.function.BiFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.p f2671b;

    public /* synthetic */ v(int r1, fg.p r2) {
            r0 = this;
            r0.f2670a = r1
            r0.f2671b = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f2670a
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1b;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            fg.p r0 = r1.f2671b
            og.u r0 = (og.u) r0
            java.lang.Object r2 = r0.invoke(r2, r3)
            java.util.List r2 = (java.util.List) r2
            return r2
        L10:
            fg.p r0 = r1.f2671b
            i2.y r0 = (i2.y) r0
            java.lang.Object r2 = r0.invoke(r2, r3)
            p8.c0 r2 = (p8.c0) r2
            return r2
        L1b:
            fg.p r0 = r1.f2671b
            o9.d r0 = (o9.d) r0
            java.lang.Object r2 = r0.invoke(r2, r3)
            o9.l r2 = (o9.l) r2
            return r2
        L26:
            fg.p r0 = r1.f2671b
            eb.u r0 = (eb.u) r0
            java.lang.Long r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.b(r0, r2, r3)
            return r2
    }
}
