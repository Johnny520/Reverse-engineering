package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1476<E> extends Yue.AbstractC0028<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.locks.ReentrantLock f4620;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.lang.Object f4621;

    public C1476(@Yue.InterfaceC4543 Yue.InterfaceC2825<? super E, Yue.C6593> r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.f4620 = r1
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f94
            r0.f4621 = r1
            return
    }

    @Override // Yue.AbstractC0028, Yue.InterfaceC5242
    public boolean isEmpty() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.f4620
            r0.lock()
            boolean r1 = r2.m329()     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r1
        Ld:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public java.lang.String mo481() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f4620
            r0.lock()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "(value="
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r3.f4621     // Catch: java.lang.Throwable -> L21
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            r2 = 41
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            return r1
        L21:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public final boolean mo493() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public final boolean mo494() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public java.lang.Object mo497(E r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f4620
            r0.lock()
            Yue.ۥ۟ۥ r1 = r3.m483()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            java.lang.Object r1 = r3.f4621     // Catch: java.lang.Throwable -> L3b
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L3b
            if (r1 != r2) goto L3d
        L15:
            Yue.ۥۡۦۡۢ r1 = r3.mo320()     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L1c
            goto L3d
        L1c:
            boolean r2 = r1 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L24
            r0.unlock()
            return r1
        L24:
            Yue.C3329.m13903(r1)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            Yue.ۥۢ۠ۦۢ r2 = r1.mo347(r4, r2)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L15
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L3b
            r0.unlock()
            r1.mo348(r4)
            java.lang.Object r4 = r1.mo6116()
            return r4
        L3b:
            r4 = move-exception
            goto L4a
        L3d:
            Yue.ۥۣۢ۟ۨ r4 = r3.m7216(r4)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L49
            Yue.ۥۢ۠ۦۢ r4 = Yue.C0040.f95     // Catch: java.lang.Throwable -> L3b
            r0.unlock()
            return r4
        L49:
            throw r4     // Catch: java.lang.Throwable -> L3b
        L4a:
            r0.unlock()
            throw r4
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public java.lang.Object mo500(E r4, @Yue.InterfaceC4418 Yue.InterfaceC5564<?> r5) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f4620
            r0.lock()
            Yue.ۥ۟ۥ r1 = r3.m483()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto Lf
            r0.unlock()
            return r1
        Lf:
            java.lang.Object r1 = r3.f4621     // Catch: java.lang.Throwable -> L35
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L35
            if (r1 != r2) goto L69
        L15:
            Yue.ۥ۟۟ۢۢ$ۥ۟۟۟ r1 = r3.m479(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.mo20843(r1)     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L37
            java.lang.Object r5 = r1.m15192()     // Catch: java.lang.Throwable -> L35
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L35
            r0.unlock()
            Yue.C3329.m13903(r5)
            Yue.ۥۡۦۡۢ r5 = (Yue.InterfaceC5247) r5
            r5.mo348(r4)
            java.lang.Object r4 = r5.mo6116()
            return r4
        L35:
            r4 = move-exception
            goto L84
        L37:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f96     // Catch: java.lang.Throwable -> L35
            if (r2 == r1) goto L69
            java.lang.Object r1 = Yue.C0640.f1626     // Catch: java.lang.Throwable -> L35
            if (r2 == r1) goto L15
            java.lang.Object r4 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L35
            if (r2 == r4) goto L65
            boolean r4 = r2 instanceof Yue.C1174     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L4a
            goto L65
        L4a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r5.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r5.append(r1)     // Catch: java.lang.Throwable -> L35
            r5.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L35
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L65:
            r0.unlock()
            return r2
        L69:
            boolean r5 = r5.mo20844()     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L77
            java.lang.Object r4 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L35
            r0.unlock()
            return r4
        L77:
            Yue.ۥۣۢ۟ۨ r4 = r3.m7216(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L83
            Yue.ۥۢ۠ۦۢ r4 = Yue.C0040.f95     // Catch: java.lang.Throwable -> L35
            r0.unlock()
            return r4
        L83:
            throw r4     // Catch: java.lang.Throwable -> L35
        L84:
            r0.unlock()
            throw r4
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public boolean mo324(@Yue.InterfaceC4418 Yue.AbstractC5241<? super E> r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.f4620
            r0.lock()
            boolean r2 = super.mo324(r2)     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return r2
        Ld:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public final boolean mo327() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public final boolean mo328() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f4620
            r0.lock()
            java.lang.Object r1 = r3.f4621     // Catch: java.lang.Throwable -> L12
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L12
            if (r1 != r2) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r0.unlock()
            return r1
        L12:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo330(boolean r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f4620
            r0.lock()
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L17
            Yue.ۥۣۢ۟ۨ r1 = r3.m7216(r1)     // Catch: java.lang.Throwable -> L17
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L17
            r0.unlock()
            super.mo330(r4)
            if (r1 != 0) goto L16
            return
        L16:
            throw r1
        L17:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @Override // Yue.AbstractC0028
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public java.lang.Object mo334() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f4620
            r0.lock()
            java.lang.Object r1 = r3.f4621     // Catch: java.lang.Throwable -> L14
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto L1a
            Yue.ۥ۟ۥ r1 = r3.m483()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L22
        L16:
            r0.unlock()
            return r1
        L1a:
            r3.f4621 = r2     // Catch: java.lang.Throwable -> L14
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L14
            r0.unlock()
            return r1
        L22:
            r0.unlock()
            throw r1
    }

    @Override // Yue.AbstractC0028
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public java.lang.Object mo335(@Yue.InterfaceC4418 Yue.InterfaceC5564<?> r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f4620
            r0.lock()
            java.lang.Object r1 = r3.f4621     // Catch: java.lang.Throwable -> L14
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f94     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto L1a
            Yue.ۥ۟ۥ r4 = r3.m483()     // Catch: java.lang.Throwable -> L14
            if (r4 != 0) goto L16
            Yue.ۥۢ۠ۦۢ r4 = Yue.C0040.f97     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r4 = move-exception
            goto L32
        L16:
            r0.unlock()
            return r4
        L1a:
            boolean r4 = r4.mo20844()     // Catch: java.lang.Throwable -> L14
            if (r4 != 0) goto L28
            java.lang.Object r4 = Yue.C5566.m20861()     // Catch: java.lang.Throwable -> L14
            r0.unlock()
            return r4
        L28:
            java.lang.Object r4 = r3.f4621     // Catch: java.lang.Throwable -> L14
            r3.f4621 = r2     // Catch: java.lang.Throwable -> L14
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L14
            r0.unlock()
            return r4
        L32:
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final Yue.C6585 m7216(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.f4621
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f94
            r2 = 0
            if (r0 != r1) goto L8
            goto L11
        L8:
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r1 = r4.f165
            if (r1 == 0) goto L11
            r3 = 2
            Yue.ۥۣۢ۟ۨ r2 = Yue.C4622.m18435(r1, r0, r2, r3, r2)
        L11:
            r4.f4621 = r5
            return r2
    }
}
