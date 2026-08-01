package p000;

/* JADX INFO: renamed from: ey */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0265ey extends p000.pd2 {

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.C0302fy f3680;

    public C0265ey(p000.C0302fy r1) {
            r0 = this;
            r0.<init>()
            r0.f3680 = r1
            return
    }

    @Override // p000.pd2
    /* JADX INFO: renamed from: Ε */
    public final void mo1978(java.lang.Throwable r1) {
            r0 = this;
            fy r0 = r0.f3680
            jy r0 = r0.f4165
            r0.m3075(r1)
            return
    }

    @Override // p000.pd2
    /* JADX INFO: renamed from: Ζ */
    public final void mo1979(p000.C0379i0 r6) {
            r5 = this;
            fy r5 = r5.f3680
            r5.f4167 = r6
            m6 r6 = new m6
            i0 r0 = r5.f4167
            jy r1 = r5.f4165
            i2 r2 = r1.f5656
            cr r1 = r1.f5658
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L19
            java.util.Set r3 = p000.AbstractC0667oy.m4336()
            goto L1d
        L19:
            java.util.Set r3 = p000.AbstractC0782s1.m5334()
        L1d:
            r6.<init>(r0, r2, r1, r3)
            r5.f4166 = r6
            jy r5 = r5.f4165
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f5650
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            r0 = 1
            r5.f5652 = r0     // Catch: java.lang.Throwable -> L56
            d7 r0 = r5.f5651     // Catch: java.lang.Throwable -> L56
            r6.addAll(r0)     // Catch: java.lang.Throwable -> L56
            d7 r0 = r5.f5651     // Catch: java.lang.Throwable -> L56
            r0.clear()     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f5650
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            android.os.Handler r0 = r5.f5653
            hy r1 = new hy
            int r5 = r5.f5652
            r2 = 0
            r1.<init>(r6, r5, r2)
            r0.post(r1)
            return
        L56:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.f5650
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            throw r6
    }
}
