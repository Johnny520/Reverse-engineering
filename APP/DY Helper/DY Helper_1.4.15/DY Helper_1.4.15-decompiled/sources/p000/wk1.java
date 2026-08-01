package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wk1 extends p000.t22 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11748;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f11749;

    public wk1(java.lang.String r2, p000.p70 r3) {
            r1 = this;
            r0 = 1
            r1.f11748 = r0
            r1.f11749 = r3
            r1.<init>(r2)
            return
    }

    public wk1(p000.xk1 r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f11748 = r0
            r1.f11749 = r2
            r1.<init>(r3)
            return
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: α */
    public final long mo2576() {
            r17 = this;
            r0 = r17
            int r1 = r0.f11748
            switch(r1) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r0.f11749
            p70 r0 = (p000.p70) r0
            r0.invoke()
            r0 = -1
            return r0
        L11:
            java.lang.Object r0 = r0.f11749
            xk1 r0 = (p000.xk1) r0
            long r1 = java.lang.System.nanoTime()
            long r3 = r0.f12201
            long r3 = r1 - r3
            r5 = 1
            long r3 = r3 + r5
            java.util.concurrent.ConcurrentLinkedQueue r5 = r0.f12204
            java.util.Iterator r5 = r5.iterator()
            r5.getClass()
            r6 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
            r11 = r6
            r12 = r11
            r10 = r9
        L33:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L61
            java.lang.Object r13 = r5.next()
            vk1 r13 = (p000.vk1) r13
            r13.getClass()
            monitor-enter(r13)
            int r14 = r0.m6681(r13, r1)     // Catch: java.lang.Throwable -> L5e
            if (r14 <= 0) goto L4c
            int r10 = r10 + 1
            goto L5c
        L4c:
            long r14 = r13.f11339     // Catch: java.lang.Throwable -> L5e
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 >= 0) goto L54
            r11 = r13
            r3 = r14
        L54:
            int r9 = r9 + 1
            int r16 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r16 >= 0) goto L5c
            r12 = r13
            r7 = r14
        L5c:
            monitor-exit(r13)
            goto L33
        L5e:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L61:
            r13 = -1
            if (r11 == 0) goto L67
            r6 = r11
            goto L6e
        L67:
            r3 = 5
            if (r9 <= r3) goto L6d
            r3 = r7
            r6 = r12
            goto L6e
        L6d:
            r3 = r13
        L6e:
            if (r6 == 0) goto Lb4
            monitor-enter(r6)
            java.util.ArrayList r1 = r6.f11338     // Catch: java.lang.Throwable -> Lb1
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb1
            r13 = 0
            if (r1 != 0) goto L7d
        L7b:
            monitor-exit(r6)
            goto Lc0
        L7d:
            long r1 = r6.f11339     // Catch: java.lang.Throwable -> Lb1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L84
            goto L7b
        L84:
            r1 = 1
            r6.f11332 = r1     // Catch: java.lang.Throwable -> Lb1
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f12204     // Catch: java.lang.Throwable -> Lb1
            r1.remove(r6)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r6)
            java.net.Socket r1 = r6.f11327
            p000.ud2.m5845(r1)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f12204
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lc0
            w22 r0 = r0.f12202
            x22 r1 = r0.f11548
            monitor-enter(r1)
            boolean r2 = r0.m6310()     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto Lad
            x22 r2 = r0.f11548     // Catch: java.lang.Throwable -> Lab
            r2.m6508(r0)     // Catch: java.lang.Throwable -> Lab
            goto Lad
        Lab:
            r0 = move-exception
            goto Laf
        Lad:
            monitor-exit(r1)
            goto Lc0
        Laf:
            monitor-exit(r1)
            throw r0
        Lb1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        Lb4:
            if (r12 == 0) goto Lbc
            long r3 = r0.f12201
            long r7 = r7 + r3
            long r13 = r7 - r1
            goto Lc0
        Lbc:
            if (r10 <= 0) goto Lc0
            long r13 = r0.f12201
        Lc0:
            return r13
    }
}
