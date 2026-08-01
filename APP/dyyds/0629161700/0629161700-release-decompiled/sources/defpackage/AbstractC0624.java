package defpackage;

/* JADX INFO: renamed from: ᛴᛲᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0624 implements defpackage.InterfaceC2023 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ long f3089 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f3090 = 0;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛴᛲᛵᛵ> r1 = defpackage.AbstractC0624.class
            java.lang.String r2 = "_state$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.AbstractC0624.f3089 = r2
            java.lang.String r2 = "_parentHandle$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.AbstractC0624.f3090 = r0
            return
    }

    public AbstractC0624(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            ᲇᛷᛳᛷ r1 = defpackage.AbstractC1754.f7738
            goto La
        L8:
            ᲇᛷᛳᛷ r1 = defpackage.AbstractC1754.f7745
        La:
            r0._state$volatile = r1
            return
    }

    /* JADX INFO: renamed from: ᛴᛴᛲᲈ, reason: contains not printable characters */
    public static java.lang.String m1431(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.C0612
            if (r0 == 0) goto L18
            ᛴᛱᛷᛱ r1 = (defpackage.C0612) r1
            boolean r0 = r1.m1406()
            if (r0 == 0) goto Lf
            java.lang.String r1 = "Cancelling"
            return r1
        Lf:
            boolean r1 = r1.m1411()
            if (r1 == 0) goto L24
            java.lang.String r1 = "Completing"
            return r1
        L18:
            boolean r0 = r1 instanceof defpackage.InterfaceC0887
            if (r0 == 0) goto L2a
            ᛵᛵᛳᛷ r1 = (defpackage.InterfaceC0887) r1
            boolean r1 = r1.mo1409()
            if (r1 == 0) goto L27
        L24:
            java.lang.String r1 = "Active"
            return r1
        L27:
            java.lang.String r1 = "New"
            return r1
        L2a:
            boolean r1 = r1 instanceof defpackage.C0142
            if (r1 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            return r1
        L31:
            java.lang.String r1 = "Completed"
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public static defpackage.C0313 m1432(defpackage.AbstractC2372 r1) {
        L0:
            boolean r0 = r1.mo1753()
            if (r0 == 0) goto Lb
            ᲈᲈᲀᲀ r1 = r1.m3882()
            goto L0
        Lb:
            ᲈᲈᲀᲀ r1 = r1.m3880()
            boolean r0 = r1.mo1753()
            if (r0 != 0) goto Lb
            boolean r0 = r1 instanceof defpackage.C0313
            if (r0 == 0) goto L1c
            ᛲᛶᲁᛱ r1 = (defpackage.C0313) r1
            return r1
        L1c:
            boolean r0 = r1 instanceof defpackage.C0825
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1151
    public final defpackage.InterfaceC1192 getKey() {
            r0 = this;
            ᛷᲈᲀ r0 = defpackage.C1403.f6097
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r3.mo1446()
            r1.<init>(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.lang.Object r2 = r3.m1442()
            java.lang.String r2 = m1431(r2)
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r3 = defpackage.AbstractC0762.m1681(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public void mo1433(java.lang.Object r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛷ, reason: contains not printable characters */
    public final int m1434(java.lang.Object r10) {
            r9 = this;
            boolean r0 = r10 instanceof defpackage.C2086
            long r6 = defpackage.AbstractC0624.f3089
            r8 = 1
            if (r0 == 0) goto L25
            r0 = r10
            ᲇᛷᛳᛷ r0 = (defpackage.C2086) r0
            boolean r0 = r0.f8932
            if (r0 == 0) goto Lf
            goto L43
        Lf:
            ᲇᛷᛳᛷ r5 = defpackage.AbstractC1754.f7738
        L11:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0624.f3089
            r1 = r9
            r4 = r10
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L1e
            return r8
        L1e:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r10) goto L11
            goto L41
        L25:
            boolean r0 = r10 instanceof defpackage.C2176
            if (r0 == 0) goto L43
            r0 = r10
            ᲈᛱᲀ r0 = (defpackage.C2176) r0
            ᛵᛲᛴᛷ r5 = r0.f9253
        L2e:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0624.f3089
            r1 = r9
            r4 = r10
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L3b
            return r8
        L3b:
            java.lang.Object r0 = r0.getObjectVolatile(r9, r6)
            if (r0 == r10) goto L2e
        L41:
            r0 = -1
            return r0
        L43:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean m1435(java.lang.Object r13) {
            r12 = this;
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC1754.f7741
            boolean r1 = r12.mo1455()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3a
        La:
            java.lang.Object r0 = r12.m1442()
            boolean r1 = r0 instanceof defpackage.InterfaceC0887
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof defpackage.C0612
            if (r1 == 0) goto L20
            r1 = r0
            ᛴᛱᛷᛱ r1 = (defpackage.C0612) r1
            boolean r1 = r1.m1411()
            if (r1 == 0) goto L20
            goto L32
        L20:
            ᛱᛸᛳᛱ r1 = new ᛱᛸᛳᛱ
            java.lang.Throwable r4 = r12.m1439(r13)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r12.m1445(r0, r1)
            ᛳᛴᛵᛱ r1 = defpackage.AbstractC1754.f7748
            if (r0 == r1) goto La
            goto L34
        L32:
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC1754.f7741
        L34:
            ᛳᛴᛵᛱ r1 = defpackage.AbstractC1754.f7747
            if (r0 != r1) goto L3a
            goto Lf7
        L3a:
            ᛳᛴᛵᛱ r1 = defpackage.AbstractC1754.f7741
            if (r0 != r1) goto Led
            r0 = 0
            r1 = r0
        L40:
            java.lang.Object r4 = r12.m1442()
            boolean r5 = r4 instanceof defpackage.C0612
            if (r5 == 0) goto L92
            monitor-enter(r4)
            r5 = r4
            ᛴᛱᛷᛱ r5 = (defpackage.C0612) r5     // Catch: java.lang.Throwable -> L5f
            sun.misc.Unsafe r6 = defpackage.AbstractC0051.f569     // Catch: java.lang.Throwable -> L5f
            long r7 = defpackage.C0612.f3008     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r6.getObjectVolatile(r5, r7)     // Catch: java.lang.Throwable -> L5f
            ᛳᛴᛵᛱ r6 = defpackage.AbstractC1754.f7740     // Catch: java.lang.Throwable -> L5f
            if (r5 != r6) goto L62
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7737     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r4)
        L5b:
            r6 = r12
            r0 = r13
            goto Lee
        L5f:
            r0 = move-exception
            r12 = r0
            goto L90
        L62:
            r5 = r4
            ᛴᛱᛷᛱ r5 = (defpackage.C0612) r5     // Catch: java.lang.Throwable -> L5f
            boolean r5 = r5.m1406()     // Catch: java.lang.Throwable -> L5f
            if (r13 != 0) goto L6d
            if (r5 != 0) goto L79
        L6d:
            if (r1 != 0) goto L73
            java.lang.Throwable r1 = r12.m1439(r13)     // Catch: java.lang.Throwable -> L5f
        L73:
            r13 = r4
            ᛴᛱᛷᛱ r13 = (defpackage.C0612) r13     // Catch: java.lang.Throwable -> L5f
            r13.m1410(r1)     // Catch: java.lang.Throwable -> L5f
        L79:
            r13 = r4
            ᛴᛱᛷᛱ r13 = (defpackage.C0612) r13     // Catch: java.lang.Throwable -> L5f
            java.lang.Throwable r13 = r13.m1408()     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L83
            r0 = r13
        L83:
            monitor-exit(r4)
            if (r0 == 0) goto L8d
            ᛴᛱᛷᛱ r4 = (defpackage.C0612) r4
            ᛵᛲᛴᛷ r13 = r4.f3010
            r12.m1450(r13, r0)
        L8d:
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7741
            goto L5b
        L90:
            monitor-exit(r4)
            throw r12
        L92:
            boolean r5 = r4 instanceof defpackage.InterfaceC0887
            if (r5 == 0) goto Le9
            if (r1 != 0) goto L9c
            java.lang.Throwable r1 = r12.m1439(r13)
        L9c:
            r9 = r4
            ᛵᛵᛳᛷ r9 = (defpackage.InterfaceC0887) r9
            boolean r5 = r9.mo1409()
            if (r5 == 0) goto Lcd
            ᛵᛲᛴᛷ r11 = r12.m1440(r9)
            if (r11 != 0) goto Lad
            r6 = r12
            goto Le0
        Lad:
            ᛴᛱᛷᛱ r10 = new ᛴᛱᛷᛱ
            r10.<init>(r11, r1)
        Lb2:
            sun.misc.Unsafe r5 = defpackage.AbstractC0051.f569
            long r7 = defpackage.AbstractC0624.f3089
            r6 = r12
            boolean r12 = r5.compareAndSwapObject(r6, r7, r9, r10)
            if (r12 == 0) goto Lc4
            r6.m1450(r11, r1)
            ᛳᛴᛵᛱ r12 = defpackage.AbstractC1754.f7741
        Lc2:
            r0 = r12
            goto Lee
        Lc4:
            java.lang.Object r12 = r5.getObjectVolatile(r6, r7)
            if (r12 == r9) goto Lcb
            goto Le0
        Lcb:
            r12 = r6
            goto Lb2
        Lcd:
            r6 = r12
            ᛱᛸᛳᛱ r12 = new ᛱᛸᛳᛱ
            r12.<init>(r1, r2)
            java.lang.Object r12 = r6.m1445(r4, r12)
            ᛳᛴᛵᛱ r5 = defpackage.AbstractC1754.f7741
            if (r12 == r5) goto Le3
            ᛳᛴᛵᛱ r4 = defpackage.AbstractC1754.f7748
            if (r12 == r4) goto Le0
            goto Lc2
        Le0:
            r12 = r6
            goto L40
        Le3:
            java.lang.String r12 = "Cannot happen in "
            defpackage.C2264.m3681(r4, r12)
            return r2
        Le9:
            r6 = r12
            ᛳᛴᛵᛱ r12 = defpackage.AbstractC1754.f7737
            goto Lc2
        Led:
            r6 = r12
        Lee:
            ᛳᛴᛵᛱ r12 = defpackage.AbstractC1754.f7741
            if (r0 != r12) goto Lf3
            goto Lf7
        Lf3:
            ᛳᛴᛵᛱ r12 = defpackage.AbstractC1754.f7747
            if (r0 != r12) goto Lf8
        Lf7:
            return r3
        Lf8:
            ᛳᛴᛵᛱ r12 = defpackage.AbstractC1754.f7737
            if (r0 != r12) goto Lfd
            return r2
        Lfd:
            r6.mo1433(r0)
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ */
    public void mo916(defpackage.C1486 r1) {
            r0 = this;
            throw r1
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final java.lang.Object mo969(java.lang.Object r1, defpackage.InterfaceC2087 r2) {
            r0 = this;
            java.lang.Object r0 = r2.mo388(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void mo1436(java.lang.Object r1) {
            r0 = this;
            r0.mo1433(r1)
            return
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final java.lang.Object m1437(defpackage.C0612 r9, java.lang.Object r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C0142
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r10
            ᛱᛸᛳᛱ r0 = (defpackage.C0142) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Le
            java.lang.Throwable r1 = r0.f1092
        Le:
            monitor-enter(r9)
            r9.m1406()     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList r0 = r9.m1412(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.Throwable r2 = r8.m1460(r9, r0)     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto L57
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L53
            r4 = 1
            if (r3 > r4) goto L24
            goto L57
        L24:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L53
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L53
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L53
            java.util.Set r3 = java.util.Collections.newSetFromMap(r4)     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L53
        L35:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L57
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L53
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L53
            if (r4 == r2) goto L35
            if (r4 == r2) goto L35
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L35
            boolean r5 = r3.add(r4)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L35
            defpackage.AbstractC2193.m3595(r2, r4)     // Catch: java.lang.Throwable -> L53
            goto L35
        L53:
            r0 = move-exception
            r8 = r0
            r6 = r9
            goto Lb0
        L57:
            monitor-exit(r9)
            if (r2 != 0) goto L5b
            goto L64
        L5b:
            if (r2 != r1) goto L5e
            goto L64
        L5e:
            ᛱᛸᛳᛱ r10 = new ᛱᛸᛳᛱ
            r0 = 0
            r10.<init>(r2, r0)
        L64:
            if (r2 == 0) goto L81
            boolean r0 = r8.m1452(r2)
            if (r0 != 0) goto L72
            boolean r0 = r8.mo1453(r2)
            if (r0 == 0) goto L81
        L72:
            r2 = r10
            ᛱᛸᛳᛱ r2 = (defpackage.C0142) r2
            r2.getClass()
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r3 = defpackage.C0142.f1091
            r5 = 0
            r6 = 1
            r1.compareAndSwapInt(r2, r3, r5, r6)
        L81:
            r8.mo917(r10)
            boolean r0 = r10 instanceof defpackage.InterfaceC0887
            if (r0 == 0) goto L92
            ᲈᲁᲀᛷ r0 = new ᲈᲁᲀᛷ
            r1 = r10
            ᛵᛵᛳᛷ r1 = (defpackage.InterfaceC0887) r1
            r0.<init>(r1)
            r7 = r0
            goto L93
        L92:
            r7 = r10
        L93:
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            long r4 = defpackage.AbstractC0624.f3089
            r3 = r8
            r6 = r9
            boolean r8 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r8 == 0) goto La0
            goto La6
        La0:
            java.lang.Object r8 = r2.getObjectVolatile(r3, r4)
            if (r8 == r6) goto Laa
        La6:
            r3.m1457(r6, r10)
            return r10
        Laa:
            r8 = r3
            r9 = r6
            goto L93
        Lad:
            r0 = move-exception
            r6 = r9
            r8 = r0
        Lb0:
            monitor-exit(r6)
            throw r8
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public final java.lang.Object m1438(java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.m1442()
            java.lang.Object r0 = r3.m1445(r0, r4)
            ᛳᛴᛵᛱ r1 = defpackage.AbstractC1754.f7741
            if (r0 != r1) goto L35
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Job "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " is already complete or completing, but is being completed with "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            boolean r1 = r4 instanceof defpackage.C0142
            r2 = 0
            if (r1 == 0) goto L2c
            ᛱᛸᛳᛱ r4 = (defpackage.C0142) r4
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r4 == 0) goto L31
            java.lang.Throwable r2 = r4.f1092
        L31:
            r0.<init>(r3, r2)
            throw r0
        L35:
            ᛳᛴᛵᛱ r1 = defpackage.AbstractC1754.f7748
            if (r0 == r1) goto L0
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ */
    public void mo917(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public final defpackage.InterfaceC1151 mo970(defpackage.InterfaceC1192 r1) {
            r0 = this;
            ᛶᲁᛳᲈ r0 = defpackage.AbstractC1193.m2337(r0, r1)
            return r0
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final defpackage.InterfaceC0493 mo971(defpackage.InterfaceC0493 r1) {
            r0 = this;
            ᛳᛵᲈᛵ r0 = defpackage.AbstractC0397.m1146(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final java.lang.Throwable m1439(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r4 instanceof java.lang.Throwable
        L6:
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 != 0) goto L16
            ᛷᛲᛷᛷ r4 = new ᛷᛲᛷᛷ
            java.lang.String r0 = r3.mo919()
            r4.<init>(r0, r1, r3)
        L16:
            return r4
        L17:
            ᛴᛲᛵᛵ r4 = (defpackage.AbstractC0624) r4
            java.lang.Object r3 = r4.m1442()
            boolean r0 = r3 instanceof defpackage.C0612
            if (r0 == 0) goto L29
            r0 = r3
            ᛴᛱᛷᛱ r0 = (defpackage.C0612) r0
            java.lang.Throwable r0 = r0.m1408()
            goto L38
        L29:
            boolean r0 = r3 instanceof defpackage.C0142
            if (r0 == 0) goto L33
            r0 = r3
            ᛱᛸᛳᛱ r0 = (defpackage.C0142) r0
            java.lang.Throwable r0 = r0.f1092
            goto L38
        L33:
            boolean r0 = r3 instanceof defpackage.InterfaceC0887
            if (r0 != 0) goto L51
            r0 = r1
        L38:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L3f
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        L3f:
            if (r1 != 0) goto L50
            ᛷᛲᛷᛷ r1 = new ᛷᛲᛷᛷ
            java.lang.String r3 = m1431(r3)
            java.lang.String r2 = "Parent job is "
            java.lang.String r3 = r2.concat(r3)
            r1.<init>(r3, r0, r4)
        L50:
            return r1
        L51:
            java.lang.String r4 = "Cannot be cancelling child in this state: "
            defpackage.C2264.m3681(r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public final defpackage.C0825 m1440(defpackage.InterfaceC0887 r3) {
            r2 = this;
            ᛵᛲᛴᛷ r0 = r3.mo1407()
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof defpackage.C2086
            if (r0 == 0) goto L10
            ᛵᛲᛴᛷ r2 = new ᛵᛲᛴᛷ
            r2.<init>()
            return r2
        L10:
            boolean r0 = r3 instanceof defpackage.AbstractC1683
            r1 = 0
            if (r0 == 0) goto L1b
            ᲀᛶᛲᛱ r3 = (defpackage.AbstractC1683) r3
            r2.m1444(r3)
            return r1
        L1b:
            java.lang.String r2 = "State should have list: "
            defpackage.C2264.m3681(r3, r2)
            return r1
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛵᲀᛲ, reason: contains not printable characters */
    public final boolean m1441(defpackage.C0612 r4, defpackage.C0313 r5, java.lang.Object r6) {
            r3 = this;
        L0:
            ᛴᛲᛵᛵ r0 = r5.f1647
            ᛷᛶᲇ r1 = new ᛷᛶᲇ
            r1.<init>(r3, r4, r5, r6)
            r2 = 0
            ᛵᛲᲇᲇ r0 = defpackage.AbstractC0762.m1685(r0, r2, r1)
            ᲈᛲᛴᛱ r1 = defpackage.C2187.f9280
            if (r0 == r1) goto L12
            r3 = 1
            return r3
        L12:
            ᛲᛶᲁᛱ r5 = m1432(r5)
            if (r5 != 0) goto L0
            return r2
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final java.lang.Object m1442() {
            r3 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0624.f3089
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final void m1443(defpackage.InterfaceC2023 r10) {
            r9 = this;
            long r0 = defpackage.AbstractC0624.f3090
            ᲈᛲᛴᛱ r2 = defpackage.C2187.f9280
            if (r10 != 0) goto Lc
            sun.misc.Unsafe r10 = defpackage.AbstractC0051.f569
            r10.putObjectVolatile(r9, r0, r2)
            return
        Lc:
            r4 = r10
            ᛴᛲᛵᛵ r4 = (defpackage.AbstractC0624) r4
        Lf:
            java.lang.Object r10 = r4.m1442()
            int r10 = r4.m1434(r10)
            if (r10 == 0) goto L1d
            r3 = 1
            if (r10 == r3) goto L1d
            goto Lf
        L1d:
            ᛲᛶᲁᛱ r8 = new ᛲᛶᲁᛱ
            r8.<init>(r9)
            r8.f7495 = r4
        L24:
            java.lang.Object r7 = r4.m1442()
            boolean r10 = r7 instanceof defpackage.C2086
            if (r10 == 0) goto L4a
            r10 = r7
            ᲇᛷᛳᛷ r10 = (defpackage.C2086) r10
            boolean r3 = r10.f8932
            if (r3 == 0) goto L46
        L33:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.AbstractC0624.f3089
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L3f
            goto La2
        L3f:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r5)
            if (r10 == r7) goto L33
            goto L24
        L46:
            r4.m1451(r10)
            goto L24
        L4a:
            boolean r10 = r7 instanceof defpackage.InterfaceC0887
            r3 = 0
            if (r10 == 0) goto L8e
            r10 = r7
            ᛵᛵᛳᛷ r10 = (defpackage.InterfaceC0887) r10
            ᛵᛲᛴᛷ r10 = r10.mo1407()
            if (r10 != 0) goto L5e
            ᲀᛶᛲᛱ r7 = (defpackage.AbstractC1683) r7
            r4.m1444(r7)
            goto L24
        L5e:
            r5 = 7
            boolean r5 = r10.m3881(r8, r5)
            if (r5 == 0) goto L66
            goto La2
        L66:
            r5 = 3
            boolean r10 = r10.m3881(r8, r5)
            java.lang.Object r4 = r4.m1442()
            boolean r5 = r4 instanceof defpackage.C0612
            if (r5 == 0) goto L7a
            ᛴᛱᛷᛱ r4 = (defpackage.C0612) r4
            java.lang.Throwable r3 = r4.m1408()
            goto L86
        L7a:
            boolean r5 = r4 instanceof defpackage.C0142
            if (r5 == 0) goto L81
            ᛱᛸᛳᛱ r4 = (defpackage.C0142) r4
            goto L82
        L81:
            r4 = r3
        L82:
            if (r4 == 0) goto L86
            java.lang.Throwable r3 = r4.f1092
        L86:
            r8.mo988(r3)
            if (r10 == 0) goto L8c
            goto La2
        L8c:
            r8 = r2
            goto La2
        L8e:
            java.lang.Object r10 = r4.m1442()
            boolean r4 = r10 instanceof defpackage.C0142
            if (r4 == 0) goto L99
            ᛱᛸᛳᛱ r10 = (defpackage.C0142) r10
            goto L9a
        L99:
            r10 = r3
        L9a:
            if (r10 == 0) goto L9e
            java.lang.Throwable r3 = r10.f1092
        L9e:
            r8.mo988(r3)
            goto L8c
        La2:
            sun.misc.Unsafe r10 = defpackage.AbstractC0051.f569
            r10.putObjectVolatile(r9, r0, r8)
            java.lang.Object r3 = r9.m1442()
            boolean r3 = r3 instanceof defpackage.InterfaceC0887
            if (r3 != 0) goto Lb5
            r8.mo1182()
            r10.putObjectVolatile(r9, r0, r2)
        Lb5:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public final void m1444(defpackage.AbstractC1683 r15) {
            r14 = this;
            ᛵᛲᛴᛷ r5 = new ᛵᛲᛴᛷ
            r5.<init>()
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC2372.f10256
            r0.putObjectVolatile(r5, r1, r15)
            long r6 = defpackage.AbstractC2372.f10257
            r0.putObjectVolatile(r5, r6, r15)
        L11:
            java.lang.Object r0 = r15.m3879()
            if (r0 == r15) goto L19
            r1 = r15
            goto L28
        L19:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC2372.f10257
            r4 = r15
            r1 = r15
            boolean r15 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r15 == 0) goto L42
            r5.m3884(r1)
        L28:
            ᲈᲈᲀᲀ r13 = r1.m3880()
        L2c:
            sun.misc.Unsafe r8 = defpackage.AbstractC0051.f569
            long r10 = defpackage.AbstractC0624.f3089
            r9 = r14
            r12 = r1
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            if (r14 == 0) goto L39
            goto L3f
        L39:
            java.lang.Object r14 = r8.getObjectVolatile(r9, r10)
            if (r14 == r1) goto L40
        L3f:
            return
        L40:
            r14 = r9
            goto L2c
        L42:
            r9 = r14
            java.lang.Object r14 = r0.getObjectVolatile(r1, r6)
            r15 = r1
            if (r14 == r1) goto L4c
            r14 = r9
            goto L11
        L4c:
            r14 = r9
            goto L19
    }

    /* JADX INFO: renamed from: ᛷᛴᲈ, reason: contains not printable characters */
    public final java.lang.Object m1445(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            boolean r0 = r14 instanceof defpackage.InterfaceC0887
            if (r0 != 0) goto L7
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7741
            return r13
        L7:
            boolean r0 = r14 instanceof defpackage.C2086
            if (r0 != 0) goto L12
            boolean r0 = r14 instanceof defpackage.AbstractC1683
            if (r0 == 0) goto L10
            goto L12
        L10:
            r2 = r13
            goto L49
        L12:
            boolean r0 = r14 instanceof defpackage.C0313
            if (r0 != 0) goto L10
            boolean r0 = r15 instanceof defpackage.C0142
            if (r0 != 0) goto L10
            r5 = r14
            ᛵᛵᛳᛷ r5 = (defpackage.InterfaceC0887) r5
            boolean r14 = r15 instanceof defpackage.InterfaceC0887
            if (r14 == 0) goto L2b
            ᲈᲁᲀᛷ r14 = new ᲈᲁᲀᛷ
            r0 = r15
            ᛵᛵᛳᛷ r0 = (defpackage.InterfaceC0887) r0
            r14.<init>(r0)
            r6 = r14
            goto L2c
        L2b:
            r6 = r15
        L2c:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r3 = defpackage.AbstractC0624.f3089
            r2 = r13
            boolean r13 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r13 == 0) goto L3e
            r2.mo917(r15)
            r2.m1457(r5, r15)
            return r15
        L3e:
            java.lang.Object r13 = r1.getObjectVolatile(r2, r3)
            if (r13 == r5) goto L47
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7748
            return r13
        L47:
            r13 = r2
            goto L2c
        L49:
            r11 = r14
            ᛵᛵᛳᛷ r11 = (defpackage.InterfaceC0887) r11
            ᛵᛲᛴᛷ r13 = r2.m1440(r11)
            if (r13 != 0) goto L55
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7748
            return r13
        L55:
            boolean r14 = r11 instanceof defpackage.C0612
            r0 = 0
            if (r14 == 0) goto L5e
            r14 = r11
            ᛴᛱᛷᛱ r14 = (defpackage.C0612) r14
            goto L5f
        L5e:
            r14 = r0
        L5f:
            if (r14 != 0) goto L66
            ᛴᛱᛷᛱ r14 = new ᛴᛱᛷᛱ
            r14.<init>(r13, r0)
        L66:
            r12 = r14
            monitor-enter(r12)
            boolean r14 = r12.m1411()     // Catch: java.lang.Throwable -> L72
            if (r14 == 0) goto L76
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7741     // Catch: java.lang.Throwable -> L72
            monitor-exit(r12)
            return r13
        L72:
            r0 = move-exception
            r13 = r0
            goto Le4
        L76:
            sun.misc.Unsafe r14 = defpackage.AbstractC0051.f569     // Catch: java.lang.Throwable -> L72
            long r3 = defpackage.C0612.f3007     // Catch: java.lang.Throwable -> L72
            r1 = 1
            r14.putIntVolatile(r12, r3, r1)     // Catch: java.lang.Throwable -> L72
            if (r12 == r11) goto L97
        L80:
            sun.misc.Unsafe r7 = defpackage.AbstractC0051.f569     // Catch: java.lang.Throwable -> L72
            long r9 = defpackage.AbstractC0624.f3089     // Catch: java.lang.Throwable -> L72
            r8 = r2
            boolean r14 = r7.compareAndSwapObject(r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L72
            r2 = r8
            if (r14 == 0) goto L8d
            goto L97
        L8d:
            java.lang.Object r14 = r7.getObjectVolatile(r2, r9)     // Catch: java.lang.Throwable -> L72
            if (r14 == r11) goto L80
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7748     // Catch: java.lang.Throwable -> L72
            monitor-exit(r12)
            return r13
        L97:
            boolean r14 = r12.m1406()     // Catch: java.lang.Throwable -> L72
            boolean r1 = r15 instanceof defpackage.C0142     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto La3
            r1 = r15
            ᛱᛸᛳᛱ r1 = (defpackage.C0142) r1     // Catch: java.lang.Throwable -> L72
            goto La4
        La3:
            r1 = r0
        La4:
            if (r1 == 0) goto Lab
            java.lang.Throwable r1 = r1.f1092     // Catch: java.lang.Throwable -> L72
            r12.m1410(r1)     // Catch: java.lang.Throwable -> L72
        Lab:
            java.lang.Throwable r1 = r12.m1408()     // Catch: java.lang.Throwable -> L72
            if (r14 != 0) goto Lb2
            r0 = r1
        Lb2:
            monitor-exit(r12)
            if (r0 == 0) goto Lb8
            r2.m1450(r13, r0)
        Lb8:
            ᛲᛶᲁᛱ r14 = m1432(r13)
            if (r14 == 0) goto Lc7
            boolean r14 = r2.m1441(r12, r14, r15)
            if (r14 == 0) goto Lc7
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7747
            return r13
        Lc7:
            ᲇᛱᛷᛷ r14 = new ᲇᛱᛷᛷ
            r0 = 2
            r14.<init>(r0)
            r13.m3881(r14, r0)
            ᛲᛶᲁᛱ r13 = m1432(r13)
            if (r13 == 0) goto Ldf
            boolean r13 = r2.m1441(r12, r13, r15)
            if (r13 == 0) goto Ldf
            ᛳᛴᛵᛱ r13 = defpackage.AbstractC1754.f7747
            return r13
        Ldf:
            java.lang.Object r13 = r2.m1437(r12, r15)
            return r13
        Le4:
            monitor-exit(r12)
            throw r13
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public java.lang.String mo1446() {
            r0 = this;
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public boolean mo1447() {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.C1916
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final java.util.concurrent.CancellationException m1448() {
            r4 = this;
            java.lang.Object r0 = r4.m1442()
            boolean r1 = r0 instanceof defpackage.C0612
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L35
            ᛴᛱᛷᛱ r0 = (defpackage.C0612) r0
            java.lang.Throwable r0 = r0.m1408()
            if (r0 == 0) goto L31
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " is cancelling"
            java.lang.String r1 = r1.concat(r2)
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L28
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L28:
            if (r3 != 0) goto L30
            ᛷᛲᛷᛷ r2 = new ᛷᛲᛷᛷ
            r2.<init>(r1, r0, r4)
            return r2
        L30:
            return r3
        L31:
            defpackage.C2264.m3681(r4, r2)
            return r3
        L35:
            boolean r1 = r0 instanceof defpackage.InterfaceC0887
            if (r1 != 0) goto L69
            boolean r1 = r0 instanceof defpackage.C0142
            if (r1 == 0) goto L55
            ᛱᛸᛳᛱ r0 = (defpackage.C0142) r0
            java.lang.Throwable r0 = r0.f1092
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L48
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L48:
            if (r3 != 0) goto L54
            ᛷᛲᛷᛷ r1 = new ᛷᛲᛷᛷ
            java.lang.String r2 = r4.mo919()
            r1.<init>(r2, r0, r4)
            return r1
        L54:
            return r3
        L55:
            ᛷᛲᛷᛷ r0 = new ᛷᛲᛷᛷ
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " has completed normally"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1, r3, r4)
            return r0
        L69:
            defpackage.C2264.m3681(r4, r2)
            return r3
    }

    @Override // defpackage.InterfaceC2023
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean mo1449() {
            r1 = this;
            java.lang.Object r1 = r1.m1442()
            boolean r0 = r1 instanceof defpackage.InterfaceC0887
            if (r0 == 0) goto L12
            ᛵᛵᛳᛷ r1 = (defpackage.InterfaceC0887) r1
            boolean r1 = r1.mo1409()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public final void m1450(defpackage.C0825 r6, java.lang.Throwable r7) {
            r5 = this;
            ᲇᛱᛷᛷ r0 = new ᲇᛱᛷᛷ
            r1 = 4
            r0.<init>(r1)
            r6.m3881(r0, r1)
            java.lang.Object r0 = r6.m3879()
            ᲈᲈᲀᲀ r0 = (defpackage.AbstractC2372) r0
            r1 = 0
        L10:
            boolean r2 = defpackage.AbstractC0498.m1280(r0, r6)
            if (r2 != 0) goto L51
            boolean r2 = r0 instanceof defpackage.AbstractC1683
            if (r2 == 0) goto L4c
            r2 = r0
            ᲀᛶᛲᛱ r2 = (defpackage.AbstractC1683) r2
            boolean r2 = r2.mo987()
            if (r2 == 0) goto L4c
            r2 = r0
            ᲀᛶᛲᛱ r2 = (defpackage.AbstractC1683) r2     // Catch: java.lang.Throwable -> L2a
            r2.mo988(r7)     // Catch: java.lang.Throwable -> L2a
            goto L4c
        L2a:
            r2 = move-exception
            if (r1 == 0) goto L31
            defpackage.AbstractC2193.m3595(r1, r2)
            goto L4c
        L31:
            ᛸᛵᛳᲀ r1 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
        L4c:
            ᲈᲈᲀᲀ r0 = r0.m3880()
            goto L10
        L51:
            if (r1 == 0) goto L56
            r5.mo916(r1)
        L56:
            r5.m1452(r7)
            return
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public final void m1451(defpackage.C2086 r9) {
            r8 = this;
            ᛵᛲᛴᛷ r0 = new ᛵᛲᛴᛷ
            r0.<init>()
            boolean r1 = r9.f8932
            if (r1 == 0) goto Lb
            r7 = r0
            goto L11
        Lb:
            ᲈᛱᲀ r1 = new ᲈᛱᲀ
            r1.<init>(r0)
            r7 = r1
        L11:
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            long r4 = defpackage.AbstractC0624.f3089
            r3 = r8
            r6 = r9
            boolean r8 = r2.compareAndSwapObject(r3, r4, r6, r7)
            if (r8 == 0) goto L1e
            goto L24
        L1e:
            java.lang.Object r8 = r2.getObjectVolatile(r3, r4)
            if (r8 == r6) goto L25
        L24:
            return
        L25:
            r8 = r3
            r9 = r6
            goto L11
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final boolean m1452(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.mo1447()
            if (r0 == 0) goto L7
            goto L25
        L7:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0624.f3090
            java.lang.Object r4 = r1.getObjectVolatile(r4, r2)
            ᲀᲁᛸᛵ r4 = (defpackage.InterfaceC1757) r4
            if (r4 == 0) goto L27
            ᲈᛲᛴᛱ r1 = defpackage.C2187.f9280
            if (r4 != r1) goto L1a
            goto L27
        L1a:
            boolean r4 = r4.mo989(r5)
            if (r4 != 0) goto L25
            if (r0 == 0) goto L23
            goto L25
        L23:
            r4 = 0
            return r4
        L25:
            r4 = 1
            return r4
        L27:
            return r0
    }

    @Override // defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᲀᲀᛴᛳ */
    public final defpackage.InterfaceC0493 mo972(defpackage.InterfaceC1192 r1) {
            r0 = this;
            ᛳᛵᲈᛵ r0 = defpackage.AbstractC1193.m2325(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public boolean mo1453(java.lang.Throwable r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m1454() {
            r1 = this;
            java.lang.Object r1 = r1.m1442()
            boolean r0 = r1 instanceof defpackage.InterfaceC0887
            if (r0 != 0) goto L16
            boolean r0 = r1 instanceof defpackage.C0142
            if (r0 != 0) goto L11
            java.lang.Object r1 = defpackage.AbstractC1754.m3154(r1)
            return r1
        L11:
            ᛱᛸᛳᛱ r1 = (defpackage.C0142) r1
            java.lang.Throwable r1 = r1.f1092
            throw r1
        L16:
            java.lang.String r1 = "This job has not completed yet"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public boolean mo1455() {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.C0524
            return r0
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public boolean mo1456(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5
            goto L11
        L5:
            boolean r2 = r1.m1435(r2)
            if (r2 == 0) goto L13
            boolean r1 = r1.mo1458()
            if (r1 == 0) goto L13
        L11:
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final void m1457(defpackage.InterfaceC0887 r7, java.lang.Object r8) {
            r6 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0624.f3090
            java.lang.Object r3 = r0.getObjectVolatile(r6, r1)
            ᲀᲁᛸᛵ r3 = (defpackage.InterfaceC1757) r3
            if (r3 == 0) goto L14
            r3.mo1182()
            ᲈᛲᛴᛱ r3 = defpackage.C2187.f9280
            r0.putObjectVolatile(r6, r1, r3)
        L14:
            boolean r0 = r8 instanceof defpackage.C0142
            r1 = 0
            if (r0 == 0) goto L1c
            ᛱᛸᛳᛱ r8 = (defpackage.C0142) r8
            goto L1d
        L1c:
            r8 = r1
        L1d:
            if (r8 == 0) goto L22
            java.lang.Throwable r8 = r8.f1092
            goto L23
        L22:
            r8 = r1
        L23:
            boolean r0 = r7 instanceof defpackage.AbstractC1683
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L4e
            r0 = r7
            ᲀᛶᛲᛱ r0 = (defpackage.AbstractC1683) r0     // Catch: java.lang.Throwable -> L32
            r0.mo988(r8)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r8 = move-exception
            ᛸᛵᛳᲀ r0 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8)
            r6.mo916(r0)
            goto L9c
        L4e:
            ᛵᛲᛴᛷ r7 = r7.mo1407()
            if (r7 == 0) goto L9c
            ᲇᛱᛷᛷ r0 = new ᲇᛱᛷᛷ
            r4 = 1
            r0.<init>(r4)
            r7.m3881(r0, r4)
            java.lang.Object r0 = r7.m3879()
            ᲈᲈᲀᲀ r0 = (defpackage.AbstractC2372) r0
        L63:
            boolean r4 = defpackage.AbstractC0498.m1280(r0, r7)
            if (r4 != 0) goto L97
            boolean r4 = r0 instanceof defpackage.AbstractC1683
            if (r4 == 0) goto L92
            r4 = r0
            ᲀᛶᛲᛱ r4 = (defpackage.AbstractC1683) r4     // Catch: java.lang.Throwable -> L74
            r4.mo988(r8)     // Catch: java.lang.Throwable -> L74
            goto L92
        L74:
            r4 = move-exception
            if (r1 == 0) goto L7b
            defpackage.AbstractC2193.m3595(r1, r4)
            goto L92
        L7b:
            ᛸᛵᛳᲀ r1 = new ᛸᛵᛳᲀ
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
        L92:
            ᲈᲈᲀᲀ r0 = r0.m3880()
            goto L63
        L97:
            if (r1 == 0) goto L9c
            r6.mo916(r1)
        L9c:
            return
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public boolean mo1458() {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public void m1459() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public java.lang.String mo919() {
            r0 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public final java.lang.Throwable m1460(defpackage.C0612 r3, java.util.ArrayList r4) {
            r2 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r3 = r3.m1406()
            if (r3 == 0) goto L17
            ᛷᛲᛷᛷ r3 = new ᛷᛲᛷᛷ
            java.lang.String r4 = r2.mo919()
            r3.<init>(r4, r1, r2)
            return r3
        L17:
            return r1
        L18:
            java.util.Iterator r2 = r4.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L1c
            goto L2f
        L2e:
            r3 = r1
        L2f:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L34
            return r3
        L34:
            r2 = 0
            java.lang.Object r2 = r4.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r3 = r2 instanceof defpackage.C1742
            if (r3 == 0) goto L5c
            java.util.Iterator r3 = r4.iterator()
        L43:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r3.next()
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == r2) goto L43
            boolean r0 = r0 instanceof defpackage.C1742
            if (r0 == 0) goto L43
            r1 = r4
        L57:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L5c
            return r1
        L5c:
            return r2
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0843 m1461(boolean r7, defpackage.AbstractC1683 r8) {
            r6 = this;
            r8.f7495 = r6
        L2:
            java.lang.Object r4 = r6.m1442()
            boolean r0 = r4 instanceof defpackage.C2086
            if (r0 == 0) goto L2e
            r0 = r4
            ᲇᛷᛳᛷ r0 = (defpackage.C2086) r0
            boolean r1 = r0.f8932
            if (r1 == 0) goto L28
        L11:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0624.f3089
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L1e
            goto L6f
        L1e:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L25
            goto L70
        L25:
            r6 = r1
            r8 = r5
            goto L11
        L28:
            r1 = r6
            r5 = r8
            r1.m1451(r0)
            goto L70
        L2e:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.InterfaceC0887
            ᲈᛲᛴᛱ r8 = defpackage.C2187.f9280
            r0 = 0
            if (r6 == 0) goto L73
            r6 = r4
            ᛵᛵᛳᛷ r6 = (defpackage.InterfaceC0887) r6
            ᛵᛲᛴᛷ r2 = r6.mo1407()
            if (r2 != 0) goto L46
            ᲀᛶᛲᛱ r4 = (defpackage.AbstractC1683) r4
            r1.m1444(r4)
            goto L70
        L46:
            boolean r3 = r5.mo987()
            if (r3 == 0) goto L68
            boolean r3 = r6 instanceof defpackage.C0612
            if (r3 == 0) goto L53
            ᛴᛱᛷᛱ r6 = (defpackage.C0612) r6
            goto L54
        L53:
            r6 = r0
        L54:
            if (r6 == 0) goto L5a
            java.lang.Throwable r0 = r6.m1408()
        L5a:
            if (r0 != 0) goto L62
            r6 = 5
            boolean r6 = r2.m3881(r5, r6)
            goto L6d
        L62:
            if (r7 == 0) goto L88
            r5.mo988(r0)
            return r8
        L68:
            r6 = 1
            boolean r6 = r2.m3881(r5, r6)
        L6d:
            if (r6 == 0) goto L70
        L6f:
            return r5
        L70:
            r6 = r1
            r8 = r5
            goto L2
        L73:
            if (r7 == 0) goto L88
            java.lang.Object r6 = r1.m1442()
            boolean r7 = r6 instanceof defpackage.C0142
            if (r7 == 0) goto L80
            ᛱᛸᛳᛱ r6 = (defpackage.C0142) r6
            goto L81
        L80:
            r6 = r0
        L81:
            if (r6 == 0) goto L85
            java.lang.Throwable r0 = r6.f1092
        L85:
            r5.mo988(r0)
        L88:
            return r8
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.Object m1462() {
            r0 = this;
            java.lang.Object r0 = r0.m1454()
            return r0
    }
}
