package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3326 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f10769 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f10770 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f10771 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f10772 = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C3327<T> extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super T>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f10773;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f10774;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2823<T> f10775;

        public C3327(Yue.InterfaceC2823<? extends T> r1, Yue.InterfaceC1598<? super Yue.C3326.C3327> r2) {
                r0 = this;
                r0.f10775 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥ۠ۥۧ$ۥ r0 = new Yue.ۥ۠ۥۧ$ۥ
                Yue.ۥۣ۠۠ۨ<T> r1 = r2.f10775
                r0.<init>(r1, r4)
                r0.f10774 = r3
                return r0
        }

        @Yue.InterfaceC4543
        public final java.lang.Object invoke(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super T> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۠ۥۧ$ۥ r1 = (Yue.C3326.C3327) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, java.lang.Object r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                Yue.C3341.m13947()
                int r0 = r1.f10773
                if (r0 != 0) goto L19
                Yue.C5391.m20403(r2)
                java.lang.Object r2 = r1.f10774
                Yue.ۥ۟ۧۧۥ r2 = (Yue.InterfaceC1662) r2
                Yue.ۥ۟ۧۦۥ r2 = r2.getCoroutineContext()
                Yue.ۥۣ۠۠ۨ<T> r0 = r1.f10775
                java.lang.Object r2 = Yue.C3326.m13887(r2, r0)
                return r2
            L19:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m13887(Yue.InterfaceC1632 r0, Yue.InterfaceC2823 r1) {
            java.lang.Object r0 = m13890(r0, r1)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m13888(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r4) {
            Yue.ۥ۠ۥۧ$ۥ r0 = new Yue.ۥ۠ۥۧ$ۥ
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r2 = Yue.C0862.m4974(r2, r0, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m13889(Yue.InterfaceC1632 r0, Yue.InterfaceC2823 r1, Yue.InterfaceC1598 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
        L6:
            java.lang.Object r0 = m13888(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m13890(Yue.InterfaceC1632 r1, Yue.InterfaceC2823<? extends T> r2) {
            Yue.ۥۢۡۢۥ r0 = new Yue.ۥۢۡۢۥ     // Catch: java.lang.InterruptedException -> L14
            Yue.ۥ۠ۦ۟ۡ r1 = Yue.C3399.m14047(r1)     // Catch: java.lang.InterruptedException -> L14
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L14
            r0.m23170()     // Catch: java.lang.InterruptedException -> L14
            java.lang.Object r1 = r2.invoke()     // Catch: java.lang.Throwable -> L16
            r0.m23167()     // Catch: java.lang.InterruptedException -> L14
            return r1
        L14:
            r1 = move-exception
            goto L1b
        L16:
            r1 = move-exception
            r0.m23167()     // Catch: java.lang.InterruptedException -> L14
            throw r1     // Catch: java.lang.InterruptedException -> L14
        L1b:
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r2.<init>(r0)
            java.lang.Throwable r1 = r2.initCause(r1)
            throw r1
    }
}
