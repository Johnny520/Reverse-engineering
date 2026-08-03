package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends l5.a0 implements t5.k, t5.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7863d;

    public /* synthetic */ l(k5.u r1, f5.f r2, int r3, int r4) {
            r0 = this;
            r0.f7863d = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // t5.k
    public final int e() {
            r2 = this;
            int r0 = r2.f7863d
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r0 = r0[r1]
            int r0 = d6.d.d(r0)
            return r0
        L18:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 2
            int r0 = r0.O(r1)
            return r0
    }

    @Override // t5.n
    public final long g() {
            r2 = this;
            int r0 = r2.f7863d
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            int r0 = r2.k()
        L9:
            long r0 = (long) r0
            return r0
        Lb:
            int r0 = r2.k()
            goto L9
    }

    @Override // t5.g
    public final int h() {
            r2 = this;
            int r0 = r2.f7863d
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r0 = r0[r1]
            r0 = r0 & 15
            return r0
        L16:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 1
            int r0 = r0.O(r1)
            return r0
    }

    @Override // t5.e
    public final int k() {
            r2 = this;
            int r0 = r2.f7863d
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 2
            int r0 = r0.M(r1)
            return r0
        L12:
            k5.u r0 = r2.f7847a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7849c
            int r1 = r1 + 3
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r0 = r0[r1]
            return r0
    }
}
