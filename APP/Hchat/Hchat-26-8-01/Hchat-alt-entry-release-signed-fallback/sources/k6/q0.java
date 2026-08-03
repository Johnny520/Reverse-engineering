package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends h6.n {
    public q0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r3, java.lang.Object r4) {
            r2 = this;
            java.util.Calendar r4 = (java.util.Calendar) r4
            if (r4 != 0) goto L8
            r3.l()
            return
        L8:
            r3.c()
            java.lang.String r0 = "year"
            r3.i(r0)
            r0 = 1
            int r0 = r4.get(r0)
            long r0 = (long) r0
            r3.u(r0)
            java.lang.String r0 = "month"
            r3.i(r0)
            r0 = 2
            int r0 = r4.get(r0)
            long r0 = (long) r0
            r3.u(r0)
            java.lang.String r0 = "dayOfMonth"
            r3.i(r0)
            r0 = 5
            int r0 = r4.get(r0)
            long r0 = (long) r0
            r3.u(r0)
            java.lang.String r0 = "hourOfDay"
            r3.i(r0)
            r0 = 11
            int r0 = r4.get(r0)
            long r0 = (long) r0
            r3.u(r0)
            java.lang.String r0 = "minute"
            r3.i(r0)
            r0 = 12
            int r0 = r4.get(r0)
            long r0 = (long) r0
            r3.u(r0)
            java.lang.String r0 = "second"
            r3.i(r0)
            r0 = 13
            int r4 = r4.get(r0)
            long r0 = (long) r4
            r3.u(r0)
            r3.h()
            return
    }
}
