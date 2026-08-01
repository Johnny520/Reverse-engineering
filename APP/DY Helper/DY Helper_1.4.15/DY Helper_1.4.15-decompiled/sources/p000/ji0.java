package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.li0 f5477;

    public /* synthetic */ ji0(p000.li0 r1) {
            r0 = this;
            r0.f5477 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public void m2960(int r7, int r8, p000.hj0 r9) {
            r6 = this;
            yi0 r0 = r9.f4748
            yi0 r1 = p000.yi0.f12635
            if (r0 != r1) goto L99
            vh0 r0 = p000.vh0.f11270
            xi0 r0 = r9.f4747
            java.lang.String r0 = r0.f12180
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L14
            goto L99
        L14:
            java.lang.String r1 = "cid:"
            java.lang.String r1 = r1.concat(r0)
            java.util.concurrent.ConcurrentHashMap r2 = p000.vh0.f11278
            java.lang.Object r1 = r2.remove(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L26
            r1 = r3
            goto L27
        L26:
            r1 = r2
        L27:
            java.lang.String r4 = "#"
            java.lang.String r0 = r0.concat(r4)
            java.util.concurrent.ConcurrentHashMap r4 = p000.vh0.f11281
            java.util.Set r4 = r4.keySet()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r5 = p000.x02.m6485(r5, r0, r2)
            if (r5 != r3) goto L3c
            r4.remove()
            goto L3c
        L55:
            java.util.concurrent.ConcurrentHashMap r4 = p000.vh0.f11282
            java.util.Set r4 = r4.keySet()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L64:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r5 = p000.x02.m6485(r5, r0, r2)
            if (r5 != r3) goto L64
            r4.remove()
            goto L64
        L7d:
            if (r1 == 0) goto L99
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.vh0.f11284
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L88
            goto L99
        L88:
            h22 r0 = p000.vh0.f11279
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            fb0 r1 = new fb0
            r2 = 4
            r1.<init>(r2)
            r0.post(r1)
        L99:
            yf0 r0 = new yf0
            li0 r6 = r6.f5477
            r0.<init>(r6, r7, r8, r9)
            r6.m3571(r0)
            return
    }
}
