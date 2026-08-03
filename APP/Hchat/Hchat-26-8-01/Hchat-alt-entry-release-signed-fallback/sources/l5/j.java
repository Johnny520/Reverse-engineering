package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l5.a0 implements t5.g, t5.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7862d;

    public /* synthetic */ j(k5.u r1, f5.f r2, int r3, int r4) {
            r0 = this;
            r0.f7862d = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // t5.n
    public final long g() {
            r3 = this;
            int r0 = r3.f7862d
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            k5.u r0 = r3.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r3.f7849c
            int r1 = r1 + 2
            long r0 = r0.K(r1)
            return r0
        L12:
            k5.u r0 = r3.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r3.f7849c
            int r1 = r1 + 2
            int r0 = r0.M(r1)
            short r0 = (short) r0
            long r0 = (long) r0
            r2 = 48
            long r0 = r0 << r2
            return r0
    }

    @Override // t5.g
    public final int h() {
            r2 = this;
            int r0 = r2.f7862d
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            int r0 = r0.O(r1)
            return r0
        L12:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            int r0 = r0.O(r1)
            return r0
    }
}
