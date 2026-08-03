package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements k.o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k.q1 f7044b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k.q1 f7045c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7046a;

    static {
            k.q1 r0 = new k.q1
            r1 = 0
            r0.<init>(r1)
            k.q1.f7044b = r0
            k.q1 r0 = new k.q1
            r1 = 1
            r0.<init>(r1)
            k.q1.f7045c = r0
            return
    }

    public /* synthetic */ q1(int r1) {
            r0 = this;
            r0.f7046a = r1
            r0.<init>()
            return
    }

    @Override // k.o1
    public final boolean a() {
            r1 = this;
            int r0 = r1.f7046a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // k.o1
    public final k.n1 b(android.view.View r2, u2.c r3) {
            r1 = this;
            int r3 = r1.f7046a
            switch(r3) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            k.r1 r3 = new k.r1
            android.widget.Magnifier r0 = new android.widget.Magnifier
            r0.<init>(r2)
            r3.<init>(r0)
            return r3
        L10:
            k.p1 r3 = new k.p1
            android.widget.Magnifier r0 = new android.widget.Magnifier
            r0.<init>(r2)
            r3.<init>(r0)
            return r3
    }
}
