package bsh.classpath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bsh.classpath.BshClassPath.UnqualifiedNameTable f930b;

    public /* synthetic */ a(bsh.classpath.BshClassPath.UnqualifiedNameTable r1, int r2) {
            r0 = this;
            r0.f929a = r2
            r0.f930b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f929a
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r1.f930b
            java.lang.String r2 = (java.lang.String) r2
            bsh.classpath.BshClassPath.g(r0, r2)
            return
        Ld:
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r1.f930b
            java.lang.String r2 = (java.lang.String) r2
            bsh.classpath.BshClassPath.j(r0, r2)
            return
        L15:
            bsh.classpath.BshClassPath$UnqualifiedNameTable r0 = r1.f930b
            bsh.classpath.BshClassPath r2 = (bsh.classpath.BshClassPath) r2
            bsh.classpath.BshClassPath.c(r0, r2)
            return
    }
}
