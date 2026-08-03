package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements java.util.function.Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f937a;

    public /* synthetic */ h(int r1) {
            r0 = this;
            r0.f937a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
            r1 = this;
            int r0 = r1.f937a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.util.Map r0 = bsh.This.b()
            return r0
        La:
            java.lang.Boolean r0 = bsh.Interpreter.a()
            return r0
    }
}
