package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d9 implements p000.bb, p000.j1 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public p000.f1 f294;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f295;

    @Override // p000.bb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L3
        L3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // p000.bb
    public final java.lang.String getDatabaseName() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.bb
    public final void setWriteAheadLoggingEnabled(boolean r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // p000.j1
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final p000.bb mo125() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final void m126(java.io.File r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r2.<init>(r0)
            throw r2
    }

    @Override // p000.bb
    /* JADX INFO: renamed from: ۥ۠ۡ */
    public final synchronized p000.ab mo84() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f295     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lb
            r0 = 1
            r1.m127(r0)     // Catch: java.lang.Throwable -> Ld
            r1.f295 = r0     // Catch: java.lang.Throwable -> Ld
        Lb:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Ld
        Ld:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m127(boolean r1) {
            r0 = this;
            r0.getDatabaseName()
            r1 = 0
            throw r1
    }
}
