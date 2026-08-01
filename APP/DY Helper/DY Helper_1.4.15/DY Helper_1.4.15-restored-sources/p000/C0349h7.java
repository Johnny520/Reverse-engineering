package p000;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0349h7 extends java.lang.Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r2 = this;
        L0:
            v r2 = p000.C0386i7.f4931     // Catch: java.lang.InterruptedException -> L0
            java.util.concurrent.locks.ReentrantLock r2 = p000.C0386i7.f4933     // Catch: java.lang.InterruptedException -> L0
            r2.lock()     // Catch: java.lang.InterruptedException -> L0
            i7 r0 = p000.C0381i2.m2588()     // Catch: java.lang.Throwable -> L16
            i7 r1 = p000.C0386i7.f4932     // Catch: java.lang.Throwable -> L16
            if (r0 != r1) goto L18
            r0 = 0
            p000.C0386i7.f4932 = r0     // Catch: java.lang.Throwable -> L16
            r2.unlock()     // Catch: java.lang.InterruptedException -> L0
            return
        L16:
            r0 = move-exception
            goto L21
        L18:
            r2.unlock()     // Catch: java.lang.InterruptedException -> L0
            if (r0 == 0) goto L0
            r0.mo2631()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L21:
            r2.unlock()     // Catch: java.lang.InterruptedException -> L0
            throw r0     // Catch: java.lang.InterruptedException -> L0
    }
}
