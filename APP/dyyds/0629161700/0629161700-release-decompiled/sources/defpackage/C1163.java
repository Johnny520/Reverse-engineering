package defpackage;

/* JADX INFO: renamed from: ᛶᲁᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1163 implements defpackage.InterfaceC0191, defpackage.InterfaceC1300 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public volatile defpackage.C0402 f5272;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public volatile defpackage.C2189 f5273;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public volatile int f5274;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.RunnableC1425 f5275;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0684 f5276;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public volatile defpackage.C1368 f5277;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public volatile java.lang.Object f5278;

    public C1163(defpackage.C0684 r1, defpackage.RunnableC1425 r2) {
            r0 = this;
            r0.<init>()
            r0.f5276 = r1
            r0.f5275 = r2
            return
    }

    @Override // defpackage.InterfaceC0191
    public final void cancel() {
            r0 = this;
            ᛳᛱᛱᛲ r0 = r0.f5272
            if (r0 == 0) goto L9
            ᛱᲇᲀᛴ r0 = r0.f2058
            r0.cancel()
        L9:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m2245(java.lang.Object r14) {
            r13 = this;
            java.lang.String r0 = "SourceGenerator"
            java.lang.String r1 = "Attempt to write: "
            java.lang.String r2 = "Finished encoding source to cache, key: "
            int r3 = defpackage.AbstractC1856.f8102
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            r5 = 0
            ᛴᛶᛱᛲ r6 = r13.f5276     // Catch: java.lang.Throwable -> L76
            ᛵᛶᛳᲇ r6 = r6.f3296     // Catch: java.lang.Throwable -> L76
            ᲈᲈᛲᲇ r6 = r6.m1877()     // Catch: java.lang.Throwable -> L76
            ᛳᲈᛴᛷ r6 = r6.m3873(r14)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r6.mo229()     // Catch: java.lang.Throwable -> L76
            ᛴᛶᛱᛲ r8 = r13.f5276     // Catch: java.lang.Throwable -> L76
            ᛷᲇᲇᛴ r8 = r8.m1570(r7)     // Catch: java.lang.Throwable -> L76
            ᛷᛸᛱᛸ r9 = new ᛷᛸᛱᛸ     // Catch: java.lang.Throwable -> L76
            ᛴᛶᛱᛲ r10 = r13.f5276     // Catch: java.lang.Throwable -> L76
            ᛳᛸᲁᛶ r10 = r10.f3291     // Catch: java.lang.Throwable -> L76
            r11 = 7
            r9.<init>(r8, r7, r10, r11)     // Catch: java.lang.Throwable -> L76
            ᲈᛲᛴᲀ r7 = new ᲈᛲᛴᲀ     // Catch: java.lang.Throwable -> L76
            ᛳᛱᛱᛲ r10 = r13.f5272     // Catch: java.lang.Throwable -> L76
            ᲀᛷᛶᲈ r10 = r10.f2057     // Catch: java.lang.Throwable -> L76
            ᛴᛶᛱᛲ r11 = r13.f5276     // Catch: java.lang.Throwable -> L76
            ᲀᛷᛶᲈ r12 = r11.f3299     // Catch: java.lang.Throwable -> L76
            r7.<init>(r10, r12)     // Catch: java.lang.Throwable -> L76
            ᲈᛵᛷᛱ r10 = r11.f3288     // Catch: java.lang.Throwable -> L76
            ᛲᲇᛵᲈ r10 = r10.m3632()     // Catch: java.lang.Throwable -> L76
            r10.mo960(r7, r9)     // Catch: java.lang.Throwable -> L76
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L76
            java.lang.String r11 = ", data: "
            if (r9 == 0) goto L79
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L76
            r9.append(r7)     // Catch: java.lang.Throwable -> L76
            r9.append(r11)     // Catch: java.lang.Throwable -> L76
            r9.append(r14)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = ", encoder: "
            r9.append(r2)     // Catch: java.lang.Throwable -> L76
            r9.append(r8)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = ", duration: "
            r9.append(r2)     // Catch: java.lang.Throwable -> L76
            double r2 = defpackage.AbstractC1856.m3272(r3)     // Catch: java.lang.Throwable -> L76
            r9.append(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r9.toString()     // Catch: java.lang.Throwable -> L76
            android.util.Log.v(r0, r2)     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            r0 = move-exception
            r14 = r0
            goto Le0
        L79:
            java.io.File r2 = r10.mo962(r7)     // Catch: java.lang.Throwable -> L76
            r3 = 1
            if (r2 == 0) goto L9b
            r13.f5273 = r7     // Catch: java.lang.Throwable -> L76
            ᛷᲁᛴᲀ r14 = new ᛷᲁᛴᲀ     // Catch: java.lang.Throwable -> L76
            ᛳᛱᛱᛲ r0 = r13.f5272     // Catch: java.lang.Throwable -> L76
            ᲀᛷᛶᲈ r0 = r0.f2057     // Catch: java.lang.Throwable -> L76
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Throwable -> L76
            ᛴᛶᛱᛲ r1 = r13.f5276     // Catch: java.lang.Throwable -> L76
            r14.<init>(r0, r1, r13)     // Catch: java.lang.Throwable -> L76
            r13.f5277 = r14     // Catch: java.lang.Throwable -> L76
            ᛳᛱᛱᛲ r13 = r13.f5272
            ᛱᲇᲀᛴ r13 = r13.f2058
            r13.mo754()
            return r3
        L9b:
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto Lbe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L76
            ᲈᛲᛴᲀ r1 = r13.f5273     // Catch: java.lang.Throwable -> L76
            r2.append(r1)     // Catch: java.lang.Throwable -> L76
            r2.append(r11)     // Catch: java.lang.Throwable -> L76
            r2.append(r14)     // Catch: java.lang.Throwable -> L76
            java.lang.String r14 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r2.append(r14)     // Catch: java.lang.Throwable -> L76
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> L76
            android.util.Log.d(r0, r14)     // Catch: java.lang.Throwable -> L76
        Lbe:
            r14 = r6
            ᛸᛱᲁᛵ r6 = r13.f5275     // Catch: java.lang.Throwable -> Ldd
            ᛳᛱᛱᛲ r0 = r13.f5272     // Catch: java.lang.Throwable -> Ldd
            ᲀᛷᛶᲈ r7 = r0.f2057     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r8 = r14.mo229()     // Catch: java.lang.Throwable -> Ldd
            ᛳᛱᛱᛲ r14 = r13.f5272     // Catch: java.lang.Throwable -> Ldd
            ᛱᲇᲀᛴ r9 = r14.f2058     // Catch: java.lang.Throwable -> Ldd
            ᛳᛱᛱᛲ r14 = r13.f5272     // Catch: java.lang.Throwable -> Ldd
            ᛱᲇᲀᛴ r14 = r14.f2058     // Catch: java.lang.Throwable -> Ldd
            int r10 = r14.mo755()     // Catch: java.lang.Throwable -> Ldd
            ᛳᛱᛱᛲ r14 = r13.f5272     // Catch: java.lang.Throwable -> Ldd
            ᲀᛷᛶᲈ r11 = r14.f2057     // Catch: java.lang.Throwable -> Ldd
            r6.mo2246(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ldd
            return r5
        Ldd:
            r0 = move-exception
            r14 = r0
            r5 = r3
        Le0:
            if (r5 != 0) goto Le9
            ᛳᛱᛱᛲ r13 = r13.f5272
            ᛱᲇᲀᛴ r13 = r13.f2058
            r13.mo754()
        Le9:
            throw r14
    }

    @Override // defpackage.InterfaceC1300
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo2246(defpackage.InterfaceC1711 r1, java.lang.Object r2, defpackage.InterfaceC0204 r3, int r4, defpackage.InterfaceC1711 r5) {
            r0 = this;
            r4 = r0
            ᛸᛱᲁᛵ r0 = r4.f5275
            ᛳᛱᛱᛲ r4 = r4.f5272
            ᛱᲇᲀᛴ r4 = r4.f2058
            int r4 = r4.mo755()
            r5 = r1
            r0.mo2246(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.InterfaceC1300
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo2247(defpackage.InterfaceC1711 r1, java.lang.Exception r2, defpackage.InterfaceC0204 r3, int r4) {
            r0 = this;
            ᛸᛱᲁᛵ r4 = r0.f5275
            ᛳᛱᛱᛲ r0 = r0.f5272
            ᛱᲇᲀᛴ r0 = r0.f2058
            int r0 = r0.mo755()
            r4.mo2247(r1, r2, r3, r0)
            return
    }

    @Override // defpackage.InterfaceC0191
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo738() {
            r6 = this;
            java.lang.Object r0 = r6.f5278
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r6.f5278
            r6.f5278 = r1
            boolean r0 = r6.m2245(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            ᛷᲁᛴᲀ r0 = r6.f5277
            if (r0 == 0) goto L2d
            ᛷᲁᛴᲀ r0 = r6.f5277
            boolean r0 = r0.mo738()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r6.f5277 = r1
            r6.f5272 = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L92
            int r1 = r6.f5274
            ᛴᛶᛱᛲ r3 = r6.f5276
            java.util.ArrayList r3 = r3.m1573()
            int r3 = r3.size()
            if (r1 >= r3) goto L92
            ᛴᛶᛱᛲ r1 = r6.f5276
            java.util.ArrayList r1 = r1.m1573()
            int r3 = r6.f5274
            int r4 = r3 + 1
            r6.f5274 = r4
            java.lang.Object r1 = r1.get(r3)
            ᛳᛱᛱᛲ r1 = (defpackage.C0402) r1
            r6.f5272 = r1
            ᛳᛱᛱᛲ r1 = r6.f5272
            if (r1 == 0) goto L32
            ᛴᛶᛱᛲ r1 = r6.f5276
            ᛸᛶᛵᛲ r1 = r1.f3304
            ᛳᛱᛱᛲ r3 = r6.f5272
            ᛱᲇᲀᛴ r3 = r3.f2058
            int r3 = r3.mo755()
            boolean r1 = r1.m2735(r3)
            if (r1 != 0) goto L7c
            ᛴᛶᛱᛲ r1 = r6.f5276
            ᛳᛱᛱᛲ r3 = r6.f5272
            ᛱᲇᲀᛴ r3 = r3.f2058
            java.lang.Class r3 = r3.mo646()
            ᛱᛱᛶᛴ r1 = r1.m1571(r3)
            if (r1 == 0) goto L32
        L7c:
            ᛳᛱᛱᛲ r0 = r6.f5272
            ᛳᛱᛱᛲ r1 = r6.f5272
            ᛱᲇᲀᛴ r1 = r1.f2058
            ᛴᛶᛱᛲ r3 = r6.f5276
            ᛷᛷᛱᛴ r3 = r3.f3292
            ᲁᛷᛵ r4 = new ᲁᛷᛵ
            r5 = 8
            r4.<init>(r6, r5, r0)
            r1.mo753(r3, r4)
            r0 = r2
            goto L32
        L92:
            return r0
    }
}
