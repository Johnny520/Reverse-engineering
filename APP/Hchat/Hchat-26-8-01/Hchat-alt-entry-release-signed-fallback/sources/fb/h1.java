package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements java.io.FileFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3542a;

    public /* synthetic */ h1(int r1) {
            r0 = this;
            r0.f3542a = r1
            r0.<init>()
            return
    }

    @Override // java.io.FileFilter
    public final boolean accept(java.io.File r3) {
            r2 = this;
            int r0 = r2.f3542a
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L22
            java.util.Set r0 = x8.q.f21340l
            java.lang.String r3 = dg.l.c0(r3)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r3.getClass()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            return r3
        L24:
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L38
            java.lang.String r3 = dg.l.c0(r3)
            java.lang.String r0 = "json"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L38
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            return r3
    }
}
