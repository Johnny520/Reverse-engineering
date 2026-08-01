package p000;

/* JADX INFO: renamed from: ea */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0241ea implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3452;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f3453;

    public /* synthetic */ RunnableC0241ea(java.lang.String r1, int r2) {
            r0 = this;
            r0.f3452 = r2
            r0.f3453 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f3452
            r1 = 0
            r2 = 0
            java.lang.String r10 = r10.f3453
            switch(r0) {
                case 0: goto L147;
                case 1: goto L12f;
                case 2: goto Lbd;
                case 3: goto La9;
                case 4: goto L95;
                default: goto L9;
            }
        L9:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.o22.f7905
            r0.set(r2)
            o22 r0 = p000.o22.f7889
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L22
            p000.o22.m4165(r10)
            goto L92
        L22:
            java.util.Map r0 = p000.o22.f7898
            r0.getClass()
            monitor-enter(r0)
            java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L5a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5a
        L3d:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L5a
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L5a
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L5a
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L5a
            r2.add(r5)     // Catch: java.lang.Throwable -> L5a
            goto L3d
        L5a:
            r10 = move-exception
            goto L93
        L5c:
            monitor-exit(r0)
            java.util.Iterator r0 = r2.iterator()
        L61:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r0.next()
            l91 r1 = (p000.l91) r1
            java.lang.Object r2 = r1.f6502
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r1.f6503
            m22 r1 = (p000.m22) r1
            o22 r3 = p000.o22.f7889
            java.lang.String r4 = r1.f6911
            boolean r4 = p000.o22.m4166(r4)
            if (r4 == 0) goto L88
            r2.getClass()
            java.lang.String r1 = r1.f6911
            r3.m4191(r2, r1, r10)
            goto L61
        L88:
            r2.getClass()
            p000.o22.m4163(r2, r1)
            p000.o22.m4164(r2)
            goto L61
        L92:
            return
        L93:
            monitor-exit(r0)
            throw r10
        L95:
            android.os.Handler r0 = p000.ah0.f229
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "profile:"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            p000.ah0.m167(r10)
            return
        La9:
            android.os.Handler r0 = p000.ah0.f229
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "config:"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            p000.ah0.m167(r10)
            return
        Lbd:
            java.lang.Object r0 = p000.C0696pq.f8656
            monitor-enter(r0)
            java.util.HashMap r2 = p000.C0696pq.f8658     // Catch: java.lang.Throwable -> L12c
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> L12c
            jq r2 = (p000.C0441jq) r2     // Catch: java.lang.Throwable -> L12c
            monitor-exit(r0)
            if (r2 != 0) goto Lcc
            goto L129
        Lcc:
            java.util.concurrent.atomic.AtomicReference r0 = p000.b10.f1403     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r0 = r2.f5543     // Catch: java.lang.Throwable -> Ld5
            f8 r0 = p000.b10.m673(r0)     // Catch: java.lang.Throwable -> Ld5
            goto Ldc
        Ld5:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        Ldc:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 != 0) goto Le3
            goto Lee
        Le3:
            java.lang.String r0 = r2.getMessage()
            java.lang.String r2 = "DYHelper: CurrentAwemeContext: 异步解析失败: "
            p000.AbstractC0602nx.m4142(r2, r0)
            f8 r0 = p000.C0276f8.f3771
        Lee:
            f8 r0 = (p000.C0276f8) r0
            java.lang.Object r2 = p000.C0696pq.f8656
            monitor-enter(r2)
            java.util.HashMap r3 = p000.C0696pq.f8658     // Catch: java.lang.Throwable -> L100
            java.lang.Object r3 = r3.remove(r10)     // Catch: java.lang.Throwable -> L100
            jq r3 = (p000.C0441jq) r3     // Catch: java.lang.Throwable -> L100
            if (r3 == 0) goto L102
            java.util.ArrayList r1 = r3.f5544     // Catch: java.lang.Throwable -> L100
            goto L102
        L100:
            r10 = move-exception
            goto L12a
        L102:
            if (r1 != 0) goto L106
            jz r1 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L100
        L106:
            nq r3 = p000.C0696pq.f8657     // Catch: java.lang.Throwable -> L100
            iq r4 = new iq     // Catch: java.lang.Throwable -> L100
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L100
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L100
            r3.put(r10, r4)     // Catch: java.lang.Throwable -> L100
            monitor-exit(r2)
            java.util.Iterator r10 = r1.iterator()
        L119:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L129
            java.lang.Object r1 = r10.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r0)
            goto L119
        L129:
            return
        L12a:
            monitor-exit(r2)
            throw r10
        L12c:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L12f:
            tg r0 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5656()
            java.lang.String r0 = "feed selection changed generation="
            java.lang.String r1 = r0.concat(r10)
            p000.C0834tg.m5654(r1)
            java.lang.String r10 = r0.concat(r10)
            r0 = 8
            p000.C0834tg.m5657(r2, r10, r2, r0)
            return
        L147:
            java.lang.String r0 = "rc2b948eb05c3593c"
            java.lang.String r2 = "blacklist check failed: "
            java.lang.String r3 = "blacklist verification pending reason="
            r4 = 4
            com.example.dyhelper.beta.BlacklistVerifier r5 = com.example.dyhelper.beta.BlacklistVerifier.f2226     // Catch: java.lang.Throwable -> L17f
            fa r6 = r5.m1309(r10)     // Catch: java.lang.Throwable -> L17f
            boolean r7 = r6.f3835     // Catch: java.lang.Throwable -> L17f
            if (r7 == 0) goto L181
            boolean r3 = r6.f3833     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = r6.f3834     // Catch: java.lang.Throwable -> L17f
            java.lang.CharSequence r8 = p000.q02.m4660(r10)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L17f
            java.lang.CharSequence r7 = p000.q02.m4660(r7)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L17f
            com.example.dyhelper.beta.BlacklistVerifier.f2237 = r3     // Catch: java.lang.Throwable -> L17f
            com.example.dyhelper.beta.BlacklistVerifier.f2238 = r7     // Catch: java.lang.Throwable -> L17f
            boolean r9 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L17f
            if (r9 == 0) goto L179
            p000.ui1.m5878(r8, r7, r3)     // Catch: java.lang.Throwable -> L17f
        L179:
            java.lang.String r8 = "persistResult"
            r5.m1314(r7, r8, r3)     // Catch: java.lang.Throwable -> L17f
            goto L192
        L17f:
            r3 = move-exception
            goto L19f
        L181:
            java.lang.String r5 = r6.f3834     // Catch: java.lang.Throwable -> L17f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17f
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L17f
            r7.append(r5)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L17f
            p000.C0888ux.m5988(r0, r3, r1, r4, r1)     // Catch: java.lang.Throwable -> L17f
        L192:
            boolean r3 = r6.f3833     // Catch: java.lang.Throwable -> L17f
            if (r3 == 0) goto L199
            com.example.dyhelper.beta.BlacklistVerifier.m1305()     // Catch: java.lang.Throwable -> L17f
        L199:
            java.util.Set r0 = com.example.dyhelper.beta.BlacklistVerifier.f2232
            r0.remove(r10)
            goto L1b3
        L19f:
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L1b4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b4
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L1b4
            r5.append(r3)     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L1b4
            p000.C0888ux.m5988(r0, r2, r1, r4, r1)     // Catch: java.lang.Throwable -> L1b4
            goto L199
        L1b3:
            return
        L1b4:
            r0 = move-exception
            java.util.Set r1 = com.example.dyhelper.beta.BlacklistVerifier.f2232
            r1.remove(r10)
            throw r0
    }
}
