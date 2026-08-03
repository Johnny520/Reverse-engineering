package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0919 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C2736.C2740 f2666;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.os.Handler f2667;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۟$ۥ, reason: contains not printable characters */
    public class RunnableC0920 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2736.C2740 f2668;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.Typeface f2669;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0919 f2670;

        public RunnableC0920(Yue.C0919 r1, Yue.C2736.C2740 r2, android.graphics.Typeface r3) {
                r0 = this;
                r0.f2670 = r1
                r0.f2668 = r2
                r0.f2669 = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                Yue.ۥ۠ۢۦۢ$ۥ۟۟۟ r0 = r2.f2668
                android.graphics.Typeface r1 = r2.f2669
                r0.mo12018(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۟$ۥ۟, reason: contains not printable characters */
    public class RunnableC0921 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2736.C2740 f2671;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f2672;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0919 f2673;

        public RunnableC0921(Yue.C0919 r1, Yue.C2736.C2740 r2, int r3) {
                r0 = this;
                r0.f2673 = r1
                r0.f2671 = r2
                r0.f2672 = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                Yue.ۥ۠ۢۦۢ$ۥ۟۟۟ r0 = r2.f2671
                int r1 = r2.f2672
                r0.mo12017(r1)
                return
        }
    }

    public C0919(@Yue.InterfaceC4410 Yue.C2736.C2740 r1) {
            r0 = this;
            r0.<init>()
            r0.f2666 = r1
            android.os.Handler r1 = Yue.C0922.m5269()
            r0.f2667 = r1
            return
    }

    public C0919(@Yue.InterfaceC4410 Yue.C2736.C2740 r1, @Yue.InterfaceC4410 android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.f2666 = r1
            r0.f2667 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m5266(int r4) {
            r3 = this;
            Yue.ۥ۠ۢۦۢ$ۥ۟۟۟ r0 = r3.f2666
            android.os.Handler r1 = r3.f2667
            Yue.ۥۣ۟ۧ۟$ۥ۟ r2 = new Yue.ۥۣ۟ۧ۟$ۥ۟
            r2.<init>(r3, r0, r4)
            r1.post(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m5267(@Yue.InterfaceC4410 Yue.C2722.C2727 r2) {
            r1 = this;
            boolean r0 = r2.m11978()
            if (r0 == 0) goto Lc
            android.graphics.Typeface r2 = r2.f8965
            r1.m5268(r2)
            goto L11
        Lc:
            int r2 = r2.f8966
            r1.m5266(r2)
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m5268(@Yue.InterfaceC4410 android.graphics.Typeface r4) {
            r3 = this;
            Yue.ۥ۠ۢۦۢ$ۥ۟۟۟ r0 = r3.f2666
            android.os.Handler r1 = r3.f2667
            Yue.ۥۣ۟ۧ۟$ۥ r2 = new Yue.ۥۣ۟ۧ۟$ۥ
            r2.<init>(r3, r0, r4)
            r1.post(r2)
            return
    }
}
