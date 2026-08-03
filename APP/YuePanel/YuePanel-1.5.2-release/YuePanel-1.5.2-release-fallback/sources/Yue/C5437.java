package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5437 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Set<Yue.C5436> f20163;

    public C5437() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f20163 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final synchronized void m20516(@Yue.InterfaceC4418 Yue.C5436 r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "route"
            Yue.C3329.m13906(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.Set<Yue.ۥۣۡۧ۠> r0 = r1.f20163     // Catch: java.lang.Throwable -> Ld
            r0.remove(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final synchronized void m20517(@Yue.InterfaceC4418 Yue.C5436 r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "failedRoute"
            Yue.C3329.m13906(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.Set<Yue.ۥۣۡۧ۠> r0 = r1.f20163     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final synchronized boolean m20518(@Yue.InterfaceC4418 Yue.C5436 r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "route"
            Yue.C3329.m13906(r2, r0)     // Catch: java.lang.Throwable -> Le
            java.util.Set<Yue.ۥۣۡۧ۠> r0 = r1.f20163     // Catch: java.lang.Throwable -> Le
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r2
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }
}
