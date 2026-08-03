package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends l5.a0 implements t5.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7861d;

    public /* synthetic */ g(k5.u r1, f5.f r2, int r3, int r4) {
            r0 = this;
            r0.f7861d = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // t5.k
    public final int e() {
            r2 = this;
            int r0 = r2.f7861d
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 4
            int r0 = r0.P(r1)
            return r0
        L12:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 2
            int r0 = r0.P(r1)
            return r0
        L1f:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r0 = r0[r1]
            int r0 = d6.d.d(r0)
            return r0
    }

    @Override // t5.g
    public final int h() {
            r2 = this;
            int r0 = r2.f7861d
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
            int r0 = r0.P(r1)
            return r0
        L12:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            int r0 = r0.O(r1)
            return r0
        L1f:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r0 = r0[r1]
            r0 = r0 & 15
            return r0
    }
}
