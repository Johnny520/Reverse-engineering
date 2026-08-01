package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1675 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C1217 f7467;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.ServiceConnectionC0231 f7468;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0682 f7469;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f7470;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC1399 f7471;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f7472;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f7473;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.BinderC0079 f7474;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1541 f7475;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f7476;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC0228 f7477;

    public C1675(android.content.Context r2, java.lang.String r3, defpackage.C1541 r4) {
            r1 = this;
            r1.<init>()
            r1.f7473 = r3
            r1.f7475 = r4
            android.content.Context r2 = r2.getApplicationContext()
            r1.f7472 = r2
            com.ss.android.ugc.awemes.WardDatabase_Impl r2 = r4.f6843
            ᛳᲁᛳᛴ r2 = r2.f436
            if (r2 != 0) goto L14
            r2 = 0
        L14:
            r1.f7471 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 1
            r2.<init>(r3)
            r1.f7470 = r2
            ᛷᛱᲈᛳ r2 = new ᛷᛱᲈᛳ
            r2.<init>()
            r1.f7467 = r2
            java.lang.String[] r2 = r4.f6845
            ᛴᛵᲇᲇ r3 = new ᛴᛵᲇᲇ
            r4 = 28
            r0 = 0
            r3.<init>(r1, r2, r4, r0)
            r1.f7469 = r3
            ᛱᛴᛷᛳ r2 = new ᛱᛴᛷᛳ
            r2.<init>(r1)
            r1.f7474 = r2
            ᛲᛱᛳᛵ r2 = new ᛲᛱᛳᛵ
            r2.<init>(r1)
            r1.f7468 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3069(android.content.Intent r12) {
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f7470
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lee
            android.content.Context r0 = r11.f7472
            ᛲᛱᛳᛵ r3 = r11.f7468
            r0.bindService(r12, r3, r1)
            ᛸᛸᛶᲈ r12 = r11.f7475
            ᛴᛵᲇᲇ r11 = r11.f7469
            ᛶᛲᛵᲀ r0 = r12.f6842
            java.lang.Object r3 = r11.f3286
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.getClass()
            ᛸᲇᲈᲀ r4 = new ᛸᲇᲈᲀ
            r4.<init>()
            int r5 = r3.length
            r6 = r2
        L25:
            if (r6 >= r5) goto L43
            r7 = r3[r6]
            java.util.LinkedHashMap r8 = r0.f4575
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r9 = r7.toLowerCase(r9)
            java.lang.Object r8 = r8.get(r9)
            java.util.Set r8 = (java.util.Set) r8
            if (r8 == 0) goto L3d
            r4.addAll(r8)
            goto L40
        L3d:
            r4.add(r7)
        L40:
            int r6 = r6 + 1
            goto L25
        L43:
            ᛸᲇᲈᲀ r3 = defpackage.AbstractC0425.m1192(r4)
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r4 = r3.length
            int[] r5 = new int[r4]
            r6 = r2
        L53:
            if (r6 >= r4) goto L7a
            r7 = r3[r6]
            java.util.LinkedHashMap r8 = r0.f4579
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r9 = r7.toLowerCase(r9)
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L70
            int r7 = r8.intValue()
            r5[r6] = r7
            int r6 = r6 + 1
            goto L53
        L70:
            java.lang.String r11 = "There is no table with name "
            java.lang.String r11 = r11.concat(r7)
            defpackage.C2264.m3684(r11)
            return
        L7a:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r5)
            java.lang.Object r3 = r0.component1()
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r0 = r0.component2()
            int[] r0 = (int[]) r0
            ᲇᲈᲇᛲ r4 = new ᲇᲈᲇᛲ
            r4.<init>(r11, r0, r3)
            java.util.concurrent.locks.ReentrantLock r3 = r12.f6840
            r3.lock()
            java.util.LinkedHashMap r5 = r12.f6841     // Catch: java.lang.Throwable -> La6
            boolean r5 = r5.containsKey(r11)     // Catch: java.lang.Throwable -> La6
            java.util.LinkedHashMap r6 = r12.f6841
            if (r5 == 0) goto La8
            java.lang.Object r11 = defpackage.AbstractC1893.m3322(r6, r11)     // Catch: java.lang.Throwable -> La6
            ᲇᲈᲇᛲ r11 = (defpackage.C2168) r11     // Catch: java.lang.Throwable -> La6
            goto Lae
        La6:
            r11 = move-exception
            goto Lea
        La8:
            java.lang.Object r11 = r6.put(r11, r4)     // Catch: java.lang.Throwable -> La6
            ᲇᲈᲇᛲ r11 = (defpackage.C2168) r11     // Catch: java.lang.Throwable -> La6
        Lae:
            r3.unlock()
            if (r11 != 0) goto Lee
            ᛶᛲᛵᲀ r11 = r12.f6842
            ᲁᛴᛵᛱ r11 = r11.f4570
            java.util.concurrent.locks.ReentrantLock r12 = r11.f8043
            r12.lock()
            int r3 = r0.length     // Catch: java.lang.Throwable -> Ld5
            r4 = r2
        Lbe:
            if (r2 >= r3) goto Lda
            r5 = r0[r2]     // Catch: java.lang.Throwable -> Ld5
            long[] r6 = r11.f8044     // Catch: java.lang.Throwable -> Ld5
            r7 = r6[r5]     // Catch: java.lang.Throwable -> Ld5
            r9 = 1
            long r9 = r9 + r7
            r6[r5] = r9     // Catch: java.lang.Throwable -> Ld5
            r5 = 0
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto Ld7
            r11.f8041 = r1     // Catch: java.lang.Throwable -> Ld5
            r4 = r1
            goto Ld7
        Ld5:
            r11 = move-exception
            goto Le6
        Ld7:
            int r2 = r2 + 1
            goto Lbe
        Lda:
            if (r4 != 0) goto Le2
            boolean r0 = r11.f8041     // Catch: java.lang.Throwable -> Ld5
            if (r0 != 0) goto Le2
            boolean r11 = r11.f8045     // Catch: java.lang.Throwable -> Ld5
        Le2:
            r12.unlock()
            return
        Le6:
            r12.unlock()
            throw r11
        Lea:
            r3.unlock()
            throw r11
        Lee:
            return
    }
}
