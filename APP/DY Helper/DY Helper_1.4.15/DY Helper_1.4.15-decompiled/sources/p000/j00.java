package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j00 implements p000.c00 {

    /* JADX INFO: renamed from: ε */
    public final p000.al1 f5281;

    /* JADX INFO: renamed from: ζ */
    public final p000.x22 f5282;

    /* JADX INFO: renamed from: η */
    public long f5283;

    /* JADX INFO: renamed from: θ */
    public final java.util.concurrent.CopyOnWriteArrayList f5284;

    /* JADX INFO: renamed from: ι */
    public final java.util.concurrent.LinkedBlockingDeque f5285;

    public j00(p000.al1 r1, p000.x22 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f5281 = r1
            r0.f5282 = r2
            r1 = -9223372036854775808
            r0.f5283 = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.f5284 = r1
            java.util.concurrent.LinkedBlockingDeque r1 = new java.util.concurrent.LinkedBlockingDeque
            r1.<init>()
            r0.f5285 = r1
            return
    }

    @Override // p000.c00
    /* JADX INFO: renamed from: α */
    public final p000.vk1 mo1093() {
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.f5284     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1d
            al1 r2 = r8.f5281     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r2.m173(r0)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L13
            goto L1d
        L13:
            r8.m2844()
            r1.getClass()
            throw r1
        L1a:
            r0 = move-exception
            goto Lcb
        L1d:
            al1 r2 = r8.f5281     // Catch: java.lang.Throwable -> L1a
            uk1 r2 = r2.f318     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r2.f10903     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto Lc3
            x22 r2 = r8.f5282     // Catch: java.lang.Throwable -> L1a
            y21 r2 = r2.f12009     // Catch: java.lang.Throwable -> L1a
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r4 = r8.f5283     // Catch: java.lang.Throwable -> L1a
            long r4 = r4 - r2
            java.util.concurrent.CopyOnWriteArrayList r6 = r8.f5284     // Catch: java.lang.Throwable -> L1a
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r6 != 0) goto L42
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L3f
            goto L42
        L3f:
            r5 = r4
            r4 = r0
            goto L4c
        L42:
            ap1 r4 = r8.m2845()     // Catch: java.lang.Throwable -> L1a
            r5 = 250000000(0xee6b280, double:1.235164115E-315)
            long r2 = r2 + r5
            r8.f5283 = r2     // Catch: java.lang.Throwable -> L1a
        L4c:
            if (r4 != 0) goto L6e
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.CopyOnWriteArrayList r3 = r8.f5284     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L5a
        L58:
            r4 = r0
            goto L6b
        L5a:
            java.util.concurrent.LinkedBlockingDeque r4 = r8.f5285     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r4.poll(r5, r2)     // Catch: java.lang.Throwable -> L1a
            ap1 r2 = (p000.ap1) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L65
            goto L58
        L65:
            bp1 r4 = r2.f1270     // Catch: java.lang.Throwable -> L1a
            r3.remove(r4)     // Catch: java.lang.Throwable -> L1a
            r4 = r2
        L6b:
            if (r4 != 0) goto L6e
            goto L2
        L6e:
            bp1 r2 = r4.f1271     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L7a
            java.lang.Throwable r2 = r4.f1272     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L7a
            r2 = r5
            goto L7b
        L7a:
            r2 = r3
        L7b:
            if (r2 == 0) goto La3
            r8.m2844()     // Catch: java.lang.Throwable -> L1a
            bp1 r2 = r4.f1270     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r2.mo991()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L8e
            bp1 r2 = r4.f1270     // Catch: java.lang.Throwable -> L1a
            ap1 r4 = r2.mo989()     // Catch: java.lang.Throwable -> L1a
        L8e:
            bp1 r2 = r4.f1271     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L97
            java.lang.Throwable r2 = r4.f1272     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L97
            r3 = r5
        L97:
            if (r3 == 0) goto La3
            bp1 r0 = r4.f1270     // Catch: java.lang.Throwable -> L1a
            vk1 r0 = r0.mo990()     // Catch: java.lang.Throwable -> L1a
            r8.m2844()
            return r0
        La3:
            java.lang.Throwable r2 = r4.f1272     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto Lb6
            boolean r3 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto Lb5
            if (r1 != 0) goto Lb1
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L1a
            r1 = r2
            goto Lb6
        Lb1:
            p000.ln0.m3624(r1, r2)     // Catch: java.lang.Throwable -> L1a
            goto Lb6
        Lb5:
            throw r2     // Catch: java.lang.Throwable -> L1a
        Lb6:
            bp1 r2 = r4.f1271     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L2
            al1 r3 = r8.f5281     // Catch: java.lang.Throwable -> L1a
            w6 r3 = r3.f323     // Catch: java.lang.Throwable -> L1a
            r3.addFirst(r2)     // Catch: java.lang.Throwable -> L1a
            goto L2
        Lc3:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        Lcb:
            r8.m2844()
            throw r0
    }

    @Override // p000.c00
    /* JADX INFO: renamed from: β */
    public final p000.al1 mo1094() {
            r0 = this;
            al1 r0 = r0.f5281
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m2844() {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f5284
            java.util.Iterator r1 = r0.iterator()
            r1.getClass()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            bp1 r2 = (p000.bp1) r2
            r2.cancel()
            bp1 r2 = r2.mo988()
            if (r2 != 0) goto L1f
            goto L9
        L1f:
            al1 r3 = r4.f5281
            w6 r3 = r3.f323
            r3.addLast(r2)
            goto L9
        L27:
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final p000.ap1 m2845() {
            r7 = this;
            al1 r0 = r7.f5281
            r1 = 0
            boolean r2 = r0.m173(r1)
            if (r2 == 0) goto L5e
            bp1 r2 = r0.m174()     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r2 = move-exception
            g00 r3 = new g00
            r3.<init>(r2)
            r2 = r3
        L15:
            boolean r3 = r2.mo991()
            if (r3 == 0) goto L22
            ap1 r7 = new ap1
            r0 = 6
            r7.<init>(r2, r1, r0)
            return r7
        L22:
            boolean r3 = r2 instanceof p000.g00
            if (r3 == 0) goto L2b
            g00 r2 = (p000.g00) r2
            ap1 r7 = r2.f4183
            return r7
        L2b:
            java.util.concurrent.CopyOnWriteArrayList r3 = r7.f5284
            r3.add(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = p000.ud2.f10710
            r3.append(r4)
            java.lang.String r4 = " connect "
            r3.append(r4)
            p r0 = r0.f316
            og0 r0 = r0.f8371
            java.lang.String r0 = r0.m4235()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            x22 r3 = r7.f5282
            w22 r3 = r3.m6509()
            i00 r4 = new i00
            r4.<init>(r0, r2, r7)
            r5 = 0
            r3.m6311(r4, r5)
        L5e:
            return r1
    }
}
