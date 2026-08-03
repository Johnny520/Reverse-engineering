package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l5.a0 implements t5.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7856d;

    public /* synthetic */ c(k5.u r1, f5.f r2, int r3, int r4) {
            r0 = this;
            r0.f7856d = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // t5.f
    public final int l() {
            r2 = this;
            int r0 = r2.f7856d
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 2
            int r0 = r0.J(r1)
            return r0
        L12:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 2
            int r0 = r0.M(r1)
            return r0
        L1f:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r0 = r0[r1]
            return r0
    }
}
