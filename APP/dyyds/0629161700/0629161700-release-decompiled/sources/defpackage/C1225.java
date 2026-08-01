package defpackage;

/* JADX INFO: renamed from: ᛷᛲᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1225 extends defpackage.C2099 implements defpackage.InterfaceC0807 {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f5516 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final /* synthetic */ long f5517 = 0;
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    static {
            java.lang.Class<ᛷᛲᛳᲈ> r0 = defpackage.C1225.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "owner$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.C1225.f5516 = r1
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.C1225.f5517 = r0
            return
    }

    public C1225() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC1193.f5390
            r1.owner$volatile = r0
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Mutex@"
            r0.<init>(r1)
            java.lang.String r1 = defpackage.AbstractC0762.m1681(r4)
            r0.append(r1)
            java.lang.String r1 = "[isLocked="
            r0.append(r1)
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2099.f8999
            int r2 = r1.getIntVolatile(r4, r2)
            r3 = 0
            int r2 = java.lang.Math.max(r2, r3)
            if (r2 != 0) goto L23
            r3 = 1
        L23:
            r0.append(r3)
            java.lang.String r2 = ",owner="
            r0.append(r2)
            long r2 = defpackage.C1225.f5517
            java.lang.Object r4 = r1.getObjectVolatile(r4, r2)
            r0.append(r4)
            r4 = 93
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // defpackage.InterfaceC0807
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo1166(java.lang.Object r10) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C2099.f8999
            int r1 = r0.getIntVolatile(r9, r1)
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            if (r1 != 0) goto L5c
            long r1 = defpackage.C1225.f5517
            java.lang.Object r7 = r0.getObjectVolatile(r9, r1)
            ᛳᛴᛵᛱ r8 = defpackage.AbstractC1193.f5390
            if (r7 == r8) goto L0
            if (r7 == r10) goto L43
            if (r10 != 0) goto L1e
            goto L43
        L1e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "This mutex is locked by "
            r9.<init>(r0)
            r9.append(r7)
            java.lang.String r0 = ", but "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r10 = " is expected"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L43:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C1225.f5517
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L52
            r4.m3521()
            return
        L52:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L5a
            r9 = r4
            goto L0
        L5a:
            r9 = r4
            goto L43
        L5c:
            java.lang.String r9 = "This mutex is not locked"
            defpackage.C2264.m3676(r9)
            return
    }

    @Override // defpackage.InterfaceC0807
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final java.lang.Object mo1167(defpackage.AbstractC1016 r12) {
            r11 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2099.f8999
            int r4 = r0.getIntVolatile(r11, r2)
            int r1 = r11.f9006
            if (r4 <= r1) goto L24
        Lc:
            sun.misc.Unsafe r5 = defpackage.AbstractC0051.f569
            long r7 = defpackage.C2099.f8999
            int r9 = r5.getIntVolatile(r11, r7)
            int r10 = r11.f9006
            r6 = r11
            if (r9 <= r10) goto L22
            boolean r11 = r5.compareAndSwapInt(r6, r7, r9, r10)
            if (r11 == 0) goto L20
            goto L22
        L20:
            r11 = r6
            goto Lc
        L22:
            r11 = r6
            goto L0
        L24:
            r6 = r11
            ᲁᲀᛱᲁ r11 = defpackage.C1907.f8270
            if (r4 > 0) goto L60
            ᛱᛸᛲᲀ r12 = defpackage.AbstractC0397.m1142(r12)
            ᲈᛶᛳᛷ r12 = defpackage.AbstractC1628.m2940(r12)
            ᛸᛸᛱ r0 = new ᛸᛸᛱ     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r6, r12)     // Catch: java.lang.Throwable -> L5a
        L36:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.C2099.f9004     // Catch: java.lang.Throwable -> L5a
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L5a
            if (r2 > r1) goto L36
            if (r2 <= 0) goto L46
            ᲁᲀᛷᛴ r1 = r6.f9005     // Catch: java.lang.Throwable -> L5a
            r0.mo2004(r1)     // Catch: java.lang.Throwable -> L5a
            goto L4c
        L46:
            boolean r2 = r6.m3522(r0)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L36
        L4c:
            java.lang.Object r12 = r12.m3654()
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            if (r12 != r0) goto L55
            goto L56
        L55:
            r12 = r11
        L56:
            if (r12 != r0) goto L59
            return r12
        L59:
            return r11
        L5a:
            r0 = move-exception
            r11 = r0
            r12.m3657()
            throw r11
        L60:
            int r5 = r4 + (-1)
            r1 = r6
            boolean r2 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r2 == 0) goto L22
            long r1 = defpackage.C1225.f5517
            r12 = 0
            r0.putObjectVolatile(r6, r1, r12)
            return r11
    }
}
