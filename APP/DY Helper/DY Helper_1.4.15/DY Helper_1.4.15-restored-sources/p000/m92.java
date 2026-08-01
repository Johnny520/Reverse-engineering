package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class m92 {

    /* JADX INFO: renamed from: α */
    public final p000.n92 f7040;

    public m92() {
            r1 = this;
            r1.<init>()
            n92 r0 = new n92
            r0.<init>()
            r1.f7040 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m3800() {
            r4 = this;
            n92 r0 = r4.f7040
            if (r0 == 0) goto L4a
            boolean r1 = r0.f7480
            if (r1 == 0) goto L9
            goto L4a
        L9:
            r1 = 1
            r0.f7480 = r1
            zz1 r1 = r0.f7477
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = r0.f7478     // Catch: java.lang.Throwable -> L29
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L29
        L19:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L29
            java.lang.AutoCloseable r3 = (java.lang.AutoCloseable) r3     // Catch: java.lang.Throwable -> L29
            p000.n92.m4016(r3)     // Catch: java.lang.Throwable -> L29
            goto L19
        L29:
            r4 = move-exception
            goto L48
        L2b:
            java.util.LinkedHashSet r2 = r0.f7479     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L29
        L31:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L29
            java.lang.AutoCloseable r3 = (java.lang.AutoCloseable) r3     // Catch: java.lang.Throwable -> L29
            p000.n92.m4016(r3)     // Catch: java.lang.Throwable -> L29
            goto L31
        L41:
            java.util.LinkedHashSet r0 = r0.f7479     // Catch: java.lang.Throwable -> L29
            r0.clear()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            goto L4a
        L48:
            monitor-exit(r1)
            throw r4
        L4a:
            r4.mo1853()
            return
    }

    /* JADX INFO: renamed from: β */
    public void mo1853() {
            r0 = this;
            return
    }
}
