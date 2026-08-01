package p000;

/* JADX INFO: renamed from: к */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1112 {

    /* JADX INFO: renamed from: ε */
    public p000.AbstractC1113[] f13442;

    /* JADX INFO: renamed from: ζ */
    public int f13443;

    /* JADX INFO: renamed from: η */
    public int f13444;

    /* JADX INFO: renamed from: θ */
    public p000.k12 f13445;

    /* JADX INFO: renamed from: α */
    public final p000.AbstractC1113 m7287() {
            r4 = this;
            monitor-enter(r4)
            л[] r0 = r4.f13442     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            л[] r0 = r4.mo1986()     // Catch: java.lang.Throwable -> Lc
            r4.f13442 = r0     // Catch: java.lang.Throwable -> Lc
            goto L21
        Lc:
            r0 = move-exception
            goto L4a
        Le:
            int r1 = r4.f13443     // Catch: java.lang.Throwable -> Lc
            int r2 = r0.length     // Catch: java.lang.Throwable -> Lc
            if (r1 < r2) goto L21
            int r1 = r0.length     // Catch: java.lang.Throwable -> Lc
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> Lc
            r1 = r0
            л[] r1 = (p000.AbstractC1113[]) r1     // Catch: java.lang.Throwable -> Lc
            r4.f13442 = r1     // Catch: java.lang.Throwable -> Lc
            л[] r0 = (p000.AbstractC1113[]) r0     // Catch: java.lang.Throwable -> Lc
        L21:
            int r1 = r4.f13444     // Catch: java.lang.Throwable -> Lc
        L23:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> Lc
            if (r2 != 0) goto L2d
            л r2 = r4.mo1984()     // Catch: java.lang.Throwable -> Lc
            r0[r1] = r2     // Catch: java.lang.Throwable -> Lc
        L2d:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> Lc
            if (r1 < r3) goto L33
            r1 = 0
        L33:
            boolean r3 = r2.mo616(r4)     // Catch: java.lang.Throwable -> Lc
            if (r3 == 0) goto L23
            r4.f13444 = r1     // Catch: java.lang.Throwable -> Lc
            int r0 = r4.f13443     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            int r0 = r0 + r1
            r4.f13443 = r0     // Catch: java.lang.Throwable -> Lc
            k12 r0 = r4.f13445     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r4)
            if (r0 == 0) goto L49
            r0.m3116(r1)
        L49:
            return r2
        L4a:
            monitor-exit(r4)
            throw r0
    }

    /* JADX INFO: renamed from: β */
    public abstract p000.AbstractC1113 mo1984();

    /* JADX INFO: renamed from: ε */
    public abstract p000.AbstractC1113[] mo1986();

    /* JADX INFO: renamed from: ζ */
    public final void m7288(p000.AbstractC1113 r6) {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f13443     // Catch: java.lang.Throwable -> Lf
            r1 = -1
            int r0 = r0 + r1
            r5.f13443 = r0     // Catch: java.lang.Throwable -> Lf
            k12 r2 = r5.f13445     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            if (r0 != 0) goto L11
            r5.f13444 = r3     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r6 = move-exception
            goto L2e
        L11:
            r6.getClass()     // Catch: java.lang.Throwable -> Lf
            op[] r6 = r6.mo617(r5)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            int r5 = r6.length
        L1a:
            if (r3 >= r5) goto L28
            r0 = r6[r3]
            if (r0 == 0) goto L25
            s62 r4 = p000.s62.f9751
            r0.mo75(r4)
        L25:
            int r3 = r3 + 1
            goto L1a
        L28:
            if (r2 == 0) goto L2d
            r2.m3116(r1)
        L2d:
            return
        L2e:
            monitor-exit(r5)
            throw r6
    }

    /* JADX INFO: renamed from: η */
    public final p000.k12 m7289() {
            r2 = this;
            monitor-enter(r2)
            k12 r0 = r2.f13445     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            k12 r0 = new k12     // Catch: java.lang.Throwable -> Lf
            int r1 = r2.f13443     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            r2.f13445 = r0     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r2)
            return r0
        L13:
            monitor-exit(r2)
            throw r0
    }
}
