package p000;

/* JADX INFO: renamed from: xz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1002xz implements p000.iw1 {

    /* JADX INFO: renamed from: ε */
    public final p000.iw1 f12395;

    /* JADX INFO: renamed from: ζ */
    public final long f12396;

    /* JADX INFO: renamed from: η */
    public final boolean f12397;

    /* JADX INFO: renamed from: θ */
    public boolean f12398;

    /* JADX INFO: renamed from: ι */
    public long f12399;

    /* JADX INFO: renamed from: κ */
    public boolean f12400;

    /* JADX INFO: renamed from: λ */
    public boolean f12401;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.C1076zz f12402;

    public C1002xz(p000.C1076zz r1, p000.iw1 r2, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r0.f12402 = r1
            r0.f12395 = r2
            r0.f12396 = r3
            r0.f12397 = r5
            r0.f12400 = r5
            return
    }

    @Override // p000.iw1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            boolean r0 = r4.f12401
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f12401 = r0
            r0 = -1
            long r2 = r4.f12396
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1f
            long r0 = r4.f12399
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            goto L1f
        L17:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            java.lang.String r0 = "unexpected end of stream"
            r4.<init>(r0)
            throw r4
        L1f:
            r4.m6800()     // Catch: java.io.IOException -> L27
            r0 = 0
            r4.m6801(r0)     // Catch: java.io.IOException -> L27
            return
        L27:
            r0 = move-exception
            java.io.IOException r4 = r4.m6801(r0)
            r4.getClass()
            throw r4
    }

    @Override // p000.iw1, java.io.Flushable
    public final void flush() {
            r1 = this;
            r1.m6802()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.IOException r1 = r1.m6801(r0)
            r1.getClass()
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<xz> r1 = p000.C1002xz.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            iw1 r2 = r2.f12395
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2505() {
            r0 = this;
            iw1 r0 = r0.f12395
            m42 r0 = r0.mo2505()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m6800() {
            r0 = this;
            iw1 r0 = r0.f12395
            r0.close()
            return
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: ζ */
    public final void mo2507(long r5, p000.C0793sc r7) {
            r4 = this;
            boolean r0 = r4.f12401
            if (r0 != 0) goto L50
            r0 = -1
            long r2 = r4.f12396
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L33
            long r0 = r4.f12399
            long r0 = r0 + r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L14
            goto L33
        L14:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            long r0 = r4.f12399
            long r0 = r0 + r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "expected "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = " bytes but received "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r7.<init>(r4)
            throw r7
        L33:
            boolean r0 = r4.f12400     // Catch: java.io.IOException -> L3b
            if (r0 == 0) goto L3d
            r0 = 0
            r4.f12400 = r0     // Catch: java.io.IOException -> L3b
            goto L3d
        L3b:
            r5 = move-exception
            goto L48
        L3d:
            iw1 r0 = r4.f12395     // Catch: java.io.IOException -> L3b
            r0.mo2507(r5, r7)     // Catch: java.io.IOException -> L3b
            long r0 = r4.f12399     // Catch: java.io.IOException -> L3b
            long r0 = r0 + r5
            r4.f12399 = r0     // Catch: java.io.IOException -> L3b
            return
        L48:
            java.io.IOException r4 = r4.m6801(r5)
            r4.getClass()
            throw r4
        L50:
            java.lang.String r4 = "closed"
            p000.C1080.m7279(r4)
            return
    }

    /* JADX INFO: renamed from: η */
    public final java.io.IOException m6801(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.f12398
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.f12398 = r0
            boolean r0 = r2.f12397
            r1 = 4
            zz r2 = r2.f12402
            java.io.IOException r2 = p000.C1076zz.m7252(r2, r0, r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final void m6802() {
            r0 = this;
            iw1 r0 = r0.f12395
            r0.flush()
            return
    }
}
