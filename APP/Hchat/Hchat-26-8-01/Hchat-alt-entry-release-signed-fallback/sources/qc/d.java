package qc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f10862c;

    public /* synthetic */ d(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f10860a = r2
            r0.f10862c = r3
            r0.f10861b = r1
            r0.<init>()
            return
    }

    private final void c() {
            r0 = this;
            return
    }

    public final jf.h a() {
            r1 = this;
            int r0 = r1.f10860a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f10862c
            jf.h r0 = (jf.h) r0
            return r0
        La:
            r0 = 0
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.f10860a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r0 = r1.f10861b
            return r0
        L8:
            int r0 = r1.f10861b
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f10860a
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            int r0 = r3.f10861b
            java.lang.String r0 = j8.b.v(r0)
            java.lang.Object r1 = r3.f10862c
            jf.h r1 = (jf.h) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ": "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
        L1a:
            int r0 = r3.f10861b
            java.lang.String r0 = j8.b.v(r0)
            java.lang.Object r1 = r3.f10862c
            jf.d r1 = (jf.d) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ": "
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
