package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0098 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public static Yue.AbstractC0097 f181;

    static {
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long m538() {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto Lb
            long r0 = r0.m529()
            goto Lf
        Lb:
            long r0 = java.lang.System.currentTimeMillis()
        Lf:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.AbstractC0097 m539() {
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.f181
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m540() {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto Lb
            long r0 = r0.m530()
            goto Lf
        Lb:
            long r0 = java.lang.System.nanoTime()
        Lf:
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m541(java.lang.Object r1, long r2) {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto Lc
            r0.m531(r1, r2)
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r2)
        L12:
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m542() {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto L9
            r0.m532()
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m543(@Yue.InterfaceC4543 Yue.AbstractC0097 r0) {
            Yue.C0098.f181 = r0
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m544() {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto L9
            r0.m533()
        L9:
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m545() {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto L9
            r0.m534()
        L9:
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final void m546(java.lang.Thread r1) {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto Lc
            r0.m535(r1)
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L12
            java.util.concurrent.locks.LockSupport.unpark(r1)
        L12:
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m547() {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto L9
            r0.m536()
        L9:
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.Runnable m548(java.lang.Runnable r1) {
            Yue.ۥ۟۟ۢۧ r0 = m539()
            if (r0 == 0) goto Le
            java.lang.Runnable r0 = r0.m537(r1)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            return r1
    }
}
