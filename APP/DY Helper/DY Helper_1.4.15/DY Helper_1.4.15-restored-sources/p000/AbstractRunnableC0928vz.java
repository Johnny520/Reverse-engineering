package p000;

/* JADX INFO: renamed from: vz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0928vz implements java.lang.Runnable, java.lang.Comparable, p000.InterfaceC0922vt {
    private volatile java.lang.Object _heap;

    /* JADX INFO: renamed from: ε */
    public long f11492;

    /* JADX INFO: renamed from: ζ */
    public int f11493;

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            vz r3 = (p000.AbstractRunnableC0928vz) r3
            long r0 = r2.f11492
            long r2 = r3.f11492
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r2 = 1
            return r2
        Lf:
            if (r2 >= 0) goto L13
            r2 = -1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Delayed[nanos="
            r0.<init>(r1)
            long r1 = r3.f11492
            r0.append(r1)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p000.InterfaceC0922vt
    /* JADX INFO: renamed from: α */
    public final void mo1276() {
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5._heap     // Catch: java.lang.Throwable -> L11
            uy r1 = p000.AbstractC1021yh.f12619     // Catch: java.lang.Throwable -> L11
            if (r0 != r1) goto L9
            monitor-exit(r5)
            return
        L9:
            boolean r2 = r0 instanceof p000.C0965wz     // Catch: java.lang.Throwable -> L11
            r3 = 0
            if (r2 == 0) goto L13
            wz r0 = (p000.C0965wz) r0     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r0 = move-exception
            goto L31
        L13:
            r0 = r3
        L14:
            if (r0 == 0) goto L2d
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r5._heap     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r2 instanceof p000.f42     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L20
            r3 = r2
            f42 r3 = (p000.f42) r3     // Catch: java.lang.Throwable -> L2a
        L20:
            if (r3 != 0) goto L23
            goto L28
        L23:
            int r2 = r5.f11493     // Catch: java.lang.Throwable -> L2a
            r0.m2037(r2)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L2d
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L2d:
            r5._heap = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r5)
            return
        L31:
            monitor-exit(r5)
            throw r0
    }

    /* JADX INFO: renamed from: β */
    public final int m6287(long r9, p000.C0965wz r11, kotlinx.coroutines.AbstractC0481 r12) {
            r8 = this;
            monitor-enter(r8)
            java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L25
            uy r1 = p000.AbstractC1021yh.f12619     // Catch: java.lang.Throwable -> L25
            if (r0 != r1) goto La
            monitor-exit(r8)
            r8 = 2
            return r8
        La:
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L25
            vz[] r0 = r11.f3751     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2e
            goto L14
        L13:
            r0 = 0
        L14:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.AbstractC0481.f6071     // Catch: java.lang.Throwable -> L2e
            int r12 = r2.get(r12)     // Catch: java.lang.Throwable -> L2e
            r2 = 1
            if (r12 == 0) goto L1f
            r12 = r2
            goto L20
        L1f:
            r12 = r1
        L20:
            if (r12 == 0) goto L27
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            return r2
        L25:
            r9 = move-exception
            goto L57
        L27:
            r2 = 0
            if (r0 != 0) goto L30
            r11.f11907 = r9     // Catch: java.lang.Throwable -> L2e
            goto L44
        L2e:
            r9 = move-exception
            goto L55
        L30:
            long r4 = r0.f11492     // Catch: java.lang.Throwable -> L2e
            long r6 = r4 - r9
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 < 0) goto L39
            goto L3a
        L39:
            r9 = r4
        L3a:
            long r4 = r11.f11907     // Catch: java.lang.Throwable -> L2e
            long r4 = r9 - r4
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 <= 0) goto L44
            r11.f11907 = r9     // Catch: java.lang.Throwable -> L2e
        L44:
            long r9 = r8.f11492     // Catch: java.lang.Throwable -> L2e
            long r4 = r11.f11907     // Catch: java.lang.Throwable -> L2e
            long r9 = r9 - r4
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L4f
            r8.f11492 = r4     // Catch: java.lang.Throwable -> L2e
        L4f:
            r11.m2036(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r8)
            return r1
        L55:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L57:
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: δ */
    public final void m6288(p000.C0965wz r3) {
            r2 = this;
            java.lang.Object r0 = r2._heap
            uy r1 = p000.AbstractC1021yh.f12619
            if (r0 == r1) goto L9
            r2._heap = r3
            return
        L9:
            java.lang.String r2 = "Failed requirement."
            p000.C1080.m7275(r2)
            return
    }
}
