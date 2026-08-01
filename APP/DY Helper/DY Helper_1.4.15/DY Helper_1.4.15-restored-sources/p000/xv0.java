package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 {

    /* JADX INFO: renamed from: α */
    public static final p000.xv0 f12327 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.ArrayList f12328 = null;

    static {
            xv0 r0 = new xv0
            r0.<init>()
            p000.xv0.f12327 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000.xv0.f12328 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final synchronized java.util.List m6784(p000.mv0 r4, p000.qv0 r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = p000.xv0.f12328     // Catch: java.lang.Throwable -> L74
            f7 r0 = p000.AbstractC0984xh.m6661(r0)     // Catch: java.lang.Throwable -> L74
            θ r1 = new θ     // Catch: java.lang.Throwable -> L74
            r2 = 24
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L74
            y30 r4 = new y30     // Catch: java.lang.Throwable -> L74
            r2 = 1
            r4.<init>(r0, r2, r1)     // Catch: java.lang.Throwable -> L74
            wv0 r0 = new wv0     // Catch: java.lang.Throwable -> L74
            r1 = 0
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L74
            y30 r1 = new y30     // Catch: java.lang.Throwable -> L74
            r1.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L74
            wv0 r4 = new wv0     // Catch: java.lang.Throwable -> L74
            r0 = 1
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L74
            y30 r5 = new y30     // Catch: java.lang.Throwable -> L74
            r5.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L74
            uh0 r4 = new uh0     // Catch: java.lang.Throwable -> L74
            r0 = 14
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L74
            ye r0 = new ye     // Catch: java.lang.Throwable -> L74
            r1 = 27
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L74
            java.util.List r4 = p000.us1.m5949(r5)     // Catch: java.lang.Throwable -> L74
            p000.AbstractC0019ai.m168(r4, r0)     // Catch: java.lang.Throwable -> L74
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L74
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L4c
            jz r4 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L74
            goto L72
        L4c:
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L74
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L5b
            java.util.List r4 = p000.AbstractC1021yh.m6896(r5)     // Catch: java.lang.Throwable -> L74
            goto L72
        L5b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            r0.add(r5)     // Catch: java.lang.Throwable -> L74
        L63:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r5 == 0) goto L71
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L74
            r0.add(r5)     // Catch: java.lang.Throwable -> L74
            goto L63
        L71:
            r4 = r0
        L72:
            monitor-exit(r3)
            return r4
        L74:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            throw r4
    }

    /* JADX INFO: renamed from: β */
    public final synchronized void m6785(p000.nv0 r7) {
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = p000.xv0.f12328     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
            r1 = 0
        L8:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L22
            nv0 r2 = (p000.nv0) r2     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r2.f7758     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r7.f7758     // Catch: java.lang.Throwable -> L22
            boolean r2 = p000.ln0.m3626(r2, r3)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L1f
            goto L25
        L1f:
            int r1 = r1 + 1
            goto L8
        L22:
            r7 = move-exception
            goto L7a
        L24:
            r1 = -1
        L25:
            r0 = 4
            r2 = 0
            if (r1 < 0) goto L51
            java.util.ArrayList r3 = p000.xv0.f12328     // Catch: java.lang.Throwable -> L22
            r3.set(r1, r7)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "r261e4968bb6c4671"
            java.lang.String r3 = r7.f7758     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = r7.f7759     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r4.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "replace action id="
            r4.append(r5)     // Catch: java.lang.Throwable -> L22
            r4.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = ", title="
            r4.append(r3)     // Catch: java.lang.Throwable -> L22
            r4.append(r7)     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L22
            p000.C0888ux.m5988(r1, r7, r2, r0, r2)     // Catch: java.lang.Throwable -> L22
            goto L78
        L51:
            java.util.ArrayList r1 = p000.xv0.f12328     // Catch: java.lang.Throwable -> L22
            r1.add(r7)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "r261e4968bb6c4671"
            java.lang.String r3 = r7.f7758     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = r7.f7759     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r4.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "register action id="
            r4.append(r5)     // Catch: java.lang.Throwable -> L22
            r4.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = ", title="
            r4.append(r3)     // Catch: java.lang.Throwable -> L22
            r4.append(r7)     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L22
            p000.C0888ux.m5988(r1, r7, r2, r0, r2)     // Catch: java.lang.Throwable -> L22
        L78:
            monitor-exit(r6)
            return
        L7a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L22
            throw r7
    }
}
