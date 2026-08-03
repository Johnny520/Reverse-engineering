package ug;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends tg.r implements tg.z {
    @Override // tg.z
    public final java.lang.Object getValue() {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object[] r0 = r7.f13240n     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            long r1 = r7.f13241o     // Catch: java.lang.Throwable -> L2c
            long r3 = r7.n()     // Catch: java.lang.Throwable -> L2c
            int r5 = r7.f13243q     // Catch: java.lang.Throwable -> L2c
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L2c
            long r3 = r3 + r5
            long r5 = r7.f13241o     // Catch: java.lang.Throwable -> L2c
            long r3 = r3 - r5
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L2c
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2c
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L2c
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2c
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2c
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r7)
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    public final void v(int r8) {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object[] r0 = r7.f13240n     // Catch: java.lang.Throwable -> L30
            r0.getClass()     // Catch: java.lang.Throwable -> L30
            long r1 = r7.f13241o     // Catch: java.lang.Throwable -> L30
            long r3 = r7.n()     // Catch: java.lang.Throwable -> L30
            int r5 = r7.f13243q     // Catch: java.lang.Throwable -> L30
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L30
            long r3 = r3 + r5
            long r5 = r7.f13241o     // Catch: java.lang.Throwable -> L30
            long r3 = r3 - r5
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L30
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L30
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L30
            int r2 = r0.length     // Catch: java.lang.Throwable -> L30
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L30
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L30
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L30
            int r0 = r0 + r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            r7.p(r8)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r7)
            return
        L30:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }
}
