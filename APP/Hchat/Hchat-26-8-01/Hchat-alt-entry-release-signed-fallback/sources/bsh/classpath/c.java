package bsh.classpath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.AbstractCollection f933b;

    public /* synthetic */ c(java.util.AbstractCollection r1, int r2) {
            r0 = this;
            r0.f932a = r2
            r0.f933b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f932a
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.util.AbstractCollection r0 = r1.f933b
            java.util.HashSet r0 = (java.util.HashSet) r0
            bsh.classpath.BshClassPath r2 = (bsh.classpath.BshClassPath) r2
            bsh.classpath.BshClassPath.f(r0, r2)
            return
        Lf:
            java.util.AbstractCollection r0 = r1.f933b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            bsh.classpath.BshClassPath r2 = (bsh.classpath.BshClassPath) r2
            bsh.classpath.BshClassPath.a(r0, r2)
            return
    }
}
