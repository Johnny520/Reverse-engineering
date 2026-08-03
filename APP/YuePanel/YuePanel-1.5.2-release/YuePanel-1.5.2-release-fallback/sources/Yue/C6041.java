package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6041 extends Yue.C5742<java.lang.Integer> implements Yue.InterfaceC5941<java.lang.Integer> {
    public C6041(int r4) {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            Yue.ۥۣۣ۟ r1 = Yue.EnumC0847.f2390
            r2 = 1
            r3.<init>(r2, r0, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo16927(r4)
            return
    }

    @Override // Yue.InterfaceC5941
    public /* bridge */ /* synthetic */ java.lang.Integer getValue() {
            r1 = this;
            java.lang.Integer r0 = r1.m22716()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public java.lang.Integer m22716() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.m21458()     // Catch: java.lang.Throwable -> L11
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L11
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m22717(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.m21458()     // Catch: java.lang.Throwable -> L16
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L16
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.mo16927(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
