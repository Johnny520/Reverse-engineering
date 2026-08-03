package Yue;

import Yue.AbstractC0096;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0094<S extends Yue.AbstractC0096<?>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public S[] f176;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f177;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f178;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C6041 f179;

    public AbstractC0094() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m515(Yue.AbstractC0094 r0) {
            int r0 = r0.f177
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.AbstractC0096[] m516(Yue.AbstractC0094 r0) {
            S extends Yue.ۥ۟۟ۢۦ<?>[] r0 = r0.f176
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m517() {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final S m518() {
            r4 = this;
            monitor-enter(r4)
            S extends Yue.ۥ۟۟ۢۦ<?>[] r0 = r4.f176     // Catch: java.lang.Throwable -> Ld
            r1 = 2
            if (r0 != 0) goto Lf
            Yue.ۥ۟۟ۢۦ[] r0 = r4.mo520(r1)     // Catch: java.lang.Throwable -> Ld
            r4.f176 = r0     // Catch: java.lang.Throwable -> Ld
            goto L26
        Ld:
            r0 = move-exception
            goto L4f
        Lf:
            int r2 = r4.f177     // Catch: java.lang.Throwable -> Ld
            int r3 = r0.length     // Catch: java.lang.Throwable -> Ld
            if (r2 < r3) goto L26
            int r2 = r0.length     // Catch: java.lang.Throwable -> Ld
            int r2 = r2 * r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Throwable -> Ld
            r1 = r0
            Yue.ۥ۟۟ۢۦ[] r1 = (Yue.AbstractC0096[]) r1     // Catch: java.lang.Throwable -> Ld
            r4.f176 = r1     // Catch: java.lang.Throwable -> Ld
            Yue.ۥ۟۟ۢۦ[] r0 = (Yue.AbstractC0096[]) r0     // Catch: java.lang.Throwable -> Ld
        L26:
            int r1 = r4.f178     // Catch: java.lang.Throwable -> Ld
        L28:
            r2 = r0[r1]     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L32
            Yue.ۥ۟۟ۢۦ r2 = r4.mo519()     // Catch: java.lang.Throwable -> Ld
            r0[r1] = r2     // Catch: java.lang.Throwable -> Ld
        L32:
            int r1 = r1 + 1
            int r3 = r0.length     // Catch: java.lang.Throwable -> Ld
            if (r1 < r3) goto L38
            r1 = 0
        L38:
            boolean r3 = r2.mo527(r4)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L28
            r4.f178 = r1     // Catch: java.lang.Throwable -> Ld
            int r0 = r4.f177     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            int r0 = r0 + r1
            r4.f177 = r0     // Catch: java.lang.Throwable -> Ld
            Yue.ۥۢ۠ۤ۟ r0 = r4.f179     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r4)
            if (r0 == 0) goto L4e
            r0.m22717(r1)
        L4e:
            return r2
        L4f:
            monitor-exit(r4)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract S mo519();

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract S[] mo520(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m521(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super S, Yue.C6593> r5) {
            r4 = this;
            int r0 = m515(r4)
            if (r0 != 0) goto L7
            return
        L7:
            Yue.ۥ۟۟ۢۦ[] r0 = m516(r4)
            if (r0 == 0) goto L1b
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            if (r3 == 0) goto L18
            r5.invoke(r3)
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m522(@Yue.InterfaceC4418 S r7) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f177     // Catch: java.lang.Throwable -> Lf
            r1 = -1
            int r0 = r0 + r1
            r6.f177 = r0     // Catch: java.lang.Throwable -> Lf
            Yue.ۥۢ۠ۤ۟ r2 = r6.f179     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            if (r0 != 0) goto L11
            r6.f178 = r3     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r7 = move-exception
            goto L31
        L11:
            Yue.ۥ۟ۧۤۢ[] r7 = r7.mo528(r6)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r6)
            int r0 = r7.length
        L17:
            if (r3 >= r0) goto L2b
            r4 = r7[r3]
            if (r4 == 0) goto L28
            Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            java.lang.Object r5 = Yue.C5388.m20377(r5)
            r4.resumeWith(r5)
        L28:
            int r3 = r3 + 1
            goto L17
        L2b:
            if (r2 == 0) goto L30
            r2.m22717(r1)
        L30:
            return
        L31:
            monitor-exit(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m523() {
            r1 = this;
            int r0 = r1.f177
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final S[] m524() {
            r1 = this;
            S extends Yue.ۥ۟۟ۢۦ<?>[] r0 = r1.f176
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC5941<java.lang.Integer> m525() {
            r2 = this;
            monitor-enter(r2)
            Yue.ۥۢ۠ۤ۟ r0 = r2.f179     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            Yue.ۥۢ۠ۤ۟ r0 = new Yue.ۥۢ۠ۤ۟     // Catch: java.lang.Throwable -> Lf
            int r1 = r2.f177     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            r2.f179 = r0     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r2)
            return r0
        L13:
            monitor-exit(r2)
            throw r0
    }
}
