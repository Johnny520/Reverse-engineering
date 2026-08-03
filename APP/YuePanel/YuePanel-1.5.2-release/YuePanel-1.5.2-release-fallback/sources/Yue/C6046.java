package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6046 implements org.slf4j.ILoggerFactory {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f21850;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, Yue.C6045> f21851;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.concurrent.LinkedBlockingQueue<Yue.C6047> f21852;

    public C6046() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f21850 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f21851 = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.f21852 = r0
            return
    }

    @Override // org.slf4j.ILoggerFactory
    /* JADX INFO: renamed from: ۥ */
    public synchronized Yue.InterfaceC3804 mo17186(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, Yue.ۥۢ۠ۤۢ> r0 = r3.f21851     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1a
            Yue.ۥۢ۠ۤۢ r0 = (Yue.C6045) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            Yue.ۥۢ۠ۤۢ r0 = new Yue.ۥۢ۠ۤۢ     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.LinkedBlockingQueue<Yue.ۥۢ۠ۤۤ> r1 = r3.f21852     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r3.f21850     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.Map<java.lang.String, Yue.ۥۢ۠ۤۢ> r1 = r3.f21851     // Catch: java.lang.Throwable -> L1a
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r3)
            return r0
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m22727() {
            r1 = this;
            java.util.Map<java.lang.String, Yue.ۥۢ۠ۤۢ> r0 = r1.f21851
            r0.clear()
            java.util.concurrent.LinkedBlockingQueue<Yue.ۥۢ۠ۤۤ> r0 = r1.f21852
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.concurrent.LinkedBlockingQueue<Yue.C6047> m22728() {
            r1 = this;
            java.util.concurrent.LinkedBlockingQueue<Yue.ۥۢ۠ۤۤ> r0 = r1.f21852
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.List<java.lang.String> m22729() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, Yue.ۥۢ۠ۤۢ> r1 = r2.f21851
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.List<Yue.C6045> m22730() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, Yue.ۥۢ۠ۤۢ> r1 = r2.f21851
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m22731() {
            r1 = this;
            r0 = 1
            r1.f21850 = r0
            return
    }
}
