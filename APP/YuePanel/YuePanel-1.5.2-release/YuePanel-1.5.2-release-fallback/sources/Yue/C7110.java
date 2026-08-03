package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7110 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @java.lang.Deprecated
    public static final int f24635 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f24636 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @java.lang.Deprecated
    public static final int f24637 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f24638 = 2;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C7110.C7116 f24639;

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(20)
    public static class C7111 extends Yue.C7110.C7116 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.view.Window f24640;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final Yue.C5823 f24641;

        public C7111(@Yue.InterfaceC4410 android.view.Window r1, @Yue.InterfaceC4410 Yue.C5823 r2) {
                r0 = this;
                r0.<init>()
                r0.f24640 = r1
                r0.f24641 = r2
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo27416(Yue.C7110.InterfaceC7117 r1) {
                r0 = this;
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo27417(int r1, long r2, android.view.animation.Interpolator r4, android.os.CancellationSignal r5, Yue.InterfaceC7051 r6) {
                r0 = this;
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo27418() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo27419(int r3) {
                r2 = this;
                r0 = 1
            L1:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L10
                r1 = r3 & r0
                if (r1 != 0) goto La
                goto Ld
            La:
                r2.m27423(r0)
            Ld:
                int r0 = r0 << 1
                goto L1
            L10:
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo27420(@Yue.InterfaceC4410 Yue.C7110.InterfaceC7117 r1) {
                r0 = this;
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo27421(int r4) {
                r3 = this;
                if (r4 == 0) goto L1b
                r0 = 1
                r1 = 4096(0x1000, float:5.74E-42)
                r2 = 2048(0x800, float:2.87E-42)
                if (r4 == r0) goto L14
                r0 = 2
                if (r4 == r0) goto Ld
                goto L20
            Ld:
                r3.m27427(r2)
                r3.m27424(r1)
                goto L20
            L14:
                r3.m27427(r1)
                r3.m27424(r2)
                goto L20
            L1b:
                r4 = 6144(0x1800, float:8.61E-42)
                r3.m27427(r4)
            L20:
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo27422(int r3) {
                r2 = this;
                r0 = 1
            L1:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L10
                r1 = r3 & r0
                if (r1 != 0) goto La
                goto Ld
            La:
                r2.m27426(r0)
            Ld:
                int r0 = r0 << 1
                goto L1
            L10:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m27423(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L15
                r0 = 2
                if (r2 == r0) goto L11
                r0 = 8
                if (r2 == r0) goto Lb
                goto L10
            Lb:
                Yue.ۥۢ۟ۢۦ r2 = r1.f24641
                r2.m21669()
            L10:
                return
            L11:
                r1.m27424(r0)
                return
            L15:
                r2 = 4
                r1.m27424(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m27424(int r3) {
                r2 = this;
                android.view.Window r0 = r2.f24640
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                r3 = r3 | r1
                r0.setSystemUiVisibility(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m27425(int r2) {
                r1 = this;
                android.view.Window r0 = r1.f24640
                r0.addFlags(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m27426(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L15
                r0 = 2
                if (r2 == r0) goto L11
                r0 = 8
                if (r2 == r0) goto Lb
                goto L10
            Lb:
                Yue.ۥۢ۟ۢۦ r2 = r1.f24641
                r2.m21670()
            L10:
                return
            L11:
                r1.m27427(r0)
                return
            L15:
                r2 = 4
                r1.m27427(r2)
                r2 = 1024(0x400, float:1.435E-42)
                r1.m27428(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void m27427(int r3) {
                r2 = this;
                android.view.Window r0 = r2.f24640
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                int r3 = ~r3
                r3 = r3 & r1
                r0.setSystemUiVisibility(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public void m27428(int r2) {
                r1 = this;
                android.view.Window r0 = r1.f24640
                r0.clearFlags(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C7112 extends Yue.C7110.C7111 {
        public C7112(@Yue.InterfaceC4410 android.view.Window r1, @Yue.InterfaceC4410 Yue.C5823 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean mo27429() {
                r1 = this;
                android.view.Window r0 = r1.f24640
                android.view.View r0 = r0.getDecorView()
                int r0 = r0.getSystemUiVisibility()
                r0 = r0 & 8192(0x2000, float:1.148E-41)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo27430(boolean r2) {
                r1 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                if (r2 == 0) goto L12
                r2 = 67108864(0x4000000, float:1.5046328E-36)
                r1.m27428(r2)
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.m27425(r2)
                r1.m27424(r0)
                goto L15
            L12:
                r1.m27427(r0)
            L15:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C7113 extends Yue.C7110.C7112 {
        public C7113(@Yue.InterfaceC4410 android.view.Window r1, @Yue.InterfaceC4410 Yue.C5823 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo27431() {
                r1 = this;
                android.view.Window r0 = r1.f24640
                android.view.View r0 = r0.getDecorView()
                int r0 = r0.getSystemUiVisibility()
                r0 = r0 & 16
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo27432(boolean r2) {
                r1 = this;
                r0 = 16
                if (r2 == 0) goto L12
                r2 = 134217728(0x8000000, float:3.85186E-34)
                r1.m27428(r2)
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.m27425(r2)
                r1.m27424(r0)
                goto L15
            L12:
                r1.m27427(r0)
            L15:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C7114 extends Yue.C7110.C7116 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C7110 f24642;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.view.WindowInsetsController f24643;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C5823 f24644;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C5787<Yue.C7110.InterfaceC7117, android.view.WindowInsetsController.OnControllableInsetsChangedListener> f24645;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.view.Window f24646;

        /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        public class WindowInsetsAnimationControlListenerC7115 implements android.view.WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public Yue.C7062 f24647;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.InterfaceC7051 f24648;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.C7110.C7114 f24649;

            public WindowInsetsAnimationControlListenerC7115(Yue.C7110.C7114 r1, Yue.InterfaceC7051 r2) {
                    r0 = this;
                    r0.f24649 = r1
                    r0.f24648 = r2
                    r0.<init>()
                    r1 = 0
                    r0.f24647 = r1
                    return
            }

            public void onCancelled(@Yue.InterfaceC4544 android.view.WindowInsetsAnimationController r2) {
                    r1 = this;
                    Yue.ۥۢۥۤۨ r0 = r1.f24648
                    if (r2 != 0) goto L6
                    r2 = 0
                    goto L8
                L6:
                    Yue.ۥۢۥۥۨ r2 = r1.f24647
                L8:
                    r0.m27243(r2)
                    return
            }

            public void onFinished(@Yue.InterfaceC4410 android.view.WindowInsetsAnimationController r2) {
                    r1 = this;
                    Yue.ۥۢۥۤۨ r2 = r1.f24648
                    Yue.ۥۢۥۥۨ r0 = r1.f24647
                    r2.m27242(r0)
                    return
            }

            public void onReady(@Yue.InterfaceC4410 android.view.WindowInsetsAnimationController r2, int r3) {
                    r1 = this;
                    Yue.ۥۢۥۥۨ r0 = new Yue.ۥۢۥۥۨ
                    r0.<init>(r2)
                    r1.f24647 = r0
                    Yue.ۥۢۥۤۨ r2 = r1.f24648
                    r2.m27241(r0, r3)
                    return
            }
        }

        public C7114(@Yue.InterfaceC4410 android.view.Window r2, @Yue.InterfaceC4410 Yue.C7110 r3, @Yue.InterfaceC4410 Yue.C5823 r4) {
                r1 = this;
                android.view.WindowInsetsController r0 = Yue.C7120.m27440(r2)
                r1.<init>(r0, r3, r4)
                r1.f24646 = r2
                return
        }

        public C7114(@Yue.InterfaceC4410 android.view.WindowInsetsController r2, @Yue.InterfaceC4410 Yue.C7110 r3, @Yue.InterfaceC4410 Yue.C5823 r4) {
                r1 = this;
                r1.<init>()
                Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
                r0.<init>()
                r1.f24645 = r0
                r1.f24643 = r2
                r1.f24642 = r3
                r1.f24644 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static /* synthetic */ void m27433(Yue.C7110.C7114 r0, Yue.C7110.InterfaceC7117 r1, android.view.WindowInsetsController r2, int r3) {
                r0.m27434(r1, r2, r3)
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ */
        public void mo27416(@Yue.InterfaceC4410 Yue.C7110.InterfaceC7117 r3) {
                r2 = this;
                Yue.ۥۢ۟ۡ<Yue.ۥۢۥۨۦ$ۥ۟۟۟۠, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r0 = r2.f24645
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L9
                return
            L9:
                Yue.ۥۢۦ۟ۢ r0 = new Yue.ۥۢۦ۟ۢ
                r0.<init>(r2, r3)
                Yue.ۥۢ۟ۡ<Yue.ۥۢۥۨۦ$ۥ۟۟۟۠, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r1 = r2.f24645
                r1.put(r3, r0)
                android.view.WindowInsetsController r3 = r2.f24643
                Yue.C5830.m21680(r3, r0)
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo27417(int r8, long r9, @Yue.InterfaceC4544 android.view.animation.Interpolator r11, @Yue.InterfaceC4544 android.os.CancellationSignal r12, @Yue.InterfaceC4410 Yue.InterfaceC7051 r13) {
                r7 = this;
                Yue.ۥۢۥۨۦ$ۥ۟۟۟$ۥ r6 = new Yue.ۥۢۥۨۦ$ۥ۟۟۟$ۥ
                r6.<init>(r7, r13)
                android.view.WindowInsetsController r0 = r7.f24643
                r1 = r8
                r2 = r9
                r4 = r11
                r5 = r12
                Yue.C7121.m27441(r0, r1, r2, r4, r5, r6)
                return
        }

        @Override // Yue.C7110.C7116
        @android.annotation.SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo27418() {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.f24643
                int r0 = Yue.C7124.m27444(r0)
                return r0
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo27419(int r2) {
                r1 = this;
                r0 = r2 & 8
                if (r0 == 0) goto L9
                Yue.ۥۢ۟ۢۦ r0 = r1.f24644
                r0.m21669()
            L9:
                android.view.WindowInsetsController r0 = r1.f24643
                r2 = r2 & (-9)
                Yue.C5832.m21682(r0, r2)
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo27431() {
                r2 = this;
                android.view.WindowInsetsController r0 = r2.f24643
                r1 = 0
                Yue.C7118.m27438(r0, r1, r1)
                android.view.WindowInsetsController r0 = r2.f24643
                int r0 = Yue.C7119.m27439(r0)
                r0 = r0 & 16
                if (r0 == 0) goto L11
                r1 = 1
            L11:
                return r1
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo27429() {
                r2 = this;
                android.view.WindowInsetsController r0 = r2.f24643
                r1 = 0
                Yue.C7118.m27438(r0, r1, r1)
                android.view.WindowInsetsController r0 = r2.f24643
                int r0 = Yue.C7119.m27439(r0)
                r0 = r0 & 8
                if (r0 == 0) goto L11
                r1 = 1
            L11:
                return r1
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo27420(@Yue.InterfaceC4410 Yue.C7110.InterfaceC7117 r2) {
                r1 = this;
                Yue.ۥۢ۟ۡ<Yue.ۥۢۥۨۦ$ۥ۟۟۟۠, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r0 = r1.f24645
                java.lang.Object r2 = r0.remove(r2)
                android.view.WindowInsetsController$OnControllableInsetsChangedListener r2 = Yue.C7123.m27443(r2)
                if (r2 == 0) goto L11
                android.view.WindowInsetsController r0 = r1.f24643
                Yue.C5831.m21681(r0, r2)
            L11:
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo27432(boolean r3) {
                r2 = this;
                r0 = 16
                if (r3 == 0) goto L11
                android.view.Window r3 = r2.f24646
                if (r3 == 0) goto Lb
                r2.m27435(r0)
            Lb:
                android.view.WindowInsetsController r3 = r2.f24643
                Yue.C7118.m27438(r3, r0, r0)
                goto L1e
            L11:
                android.view.Window r3 = r2.f24646
                if (r3 == 0) goto L18
                r2.m27436(r0)
            L18:
                android.view.WindowInsetsController r3 = r2.f24643
                r1 = 0
                Yue.C7118.m27438(r3, r1, r0)
            L1e:
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo27430(boolean r3) {
                r2 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                r1 = 8
                if (r3 == 0) goto L13
                android.view.Window r3 = r2.f24646
                if (r3 == 0) goto Ld
                r2.m27435(r0)
            Ld:
                android.view.WindowInsetsController r3 = r2.f24643
                Yue.C7118.m27438(r3, r1, r1)
                goto L20
            L13:
                android.view.Window r3 = r2.f24646
                if (r3 == 0) goto L1a
                r2.m27436(r0)
            L1a:
                android.view.WindowInsetsController r3 = r2.f24643
                r0 = 0
                Yue.C7118.m27438(r3, r0, r1)
            L20:
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo27421(int r2) {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.f24643
                Yue.C7122.m27442(r0, r2)
                return
        }

        @Override // Yue.C7110.C7116
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo27422(int r2) {
                r1 = this;
                r0 = r2 & 8
                if (r0 == 0) goto L9
                Yue.ۥۢ۟ۢۦ r0 = r1.f24644
                r0.m21670()
            L9:
                android.view.WindowInsetsController r0 = r1.f24643
                r2 = r2 & (-9)
                Yue.C5829.m21679(r0, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final /* synthetic */ void m27434(Yue.C7110.InterfaceC7117 r2, android.view.WindowInsetsController r3, int r4) {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.f24643
                if (r0 != r3) goto L9
                Yue.ۥۢۥۨۦ r3 = r1.f24642
                r2.m27437(r3, r4)
            L9:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public void m27435(int r3) {
                r2 = this;
                android.view.Window r0 = r2.f24646
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                r3 = r3 | r1
                r0.setSystemUiVisibility(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public void m27436(int r3) {
                r2 = this;
                android.view.Window r0 = r2.f24646
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                int r3 = ~r3
                r3 = r3 & r1
                r0.setSystemUiVisibility(r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7116 {
        public C7116() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public void mo27416(Yue.C7110.InterfaceC7117 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo27417(int r1, long r2, android.view.animation.Interpolator r4, android.os.CancellationSignal r5, Yue.InterfaceC7051 r6) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo27418() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo27419(int r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo27431() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo27429() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo27420(@Yue.InterfaceC4410 Yue.C7110.InterfaceC7117 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo27432(boolean r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo27430(boolean r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo27421(int r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo27422(int r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۨۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC7117 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m27437(@Yue.InterfaceC4410 Yue.C7110 r1, int r2);
    }

    public C7110(@Yue.InterfaceC4410 android.view.Window r3, @Yue.InterfaceC4410 android.view.View r4) {
            r2 = this;
            r2.<init>()
            Yue.ۥۢ۟ۢۦ r0 = new Yue.ۥۢ۟ۢۦ
            r0.<init>(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r4 < r1) goto L16
            Yue.ۥۢۥۨۦ$ۥ۟۟۟ r4 = new Yue.ۥۢۥۨۦ$ۥ۟۟۟
            r4.<init>(r3, r2, r0)
            r2.f24639 = r4
            goto L1d
        L16:
            Yue.ۥۢۥۨۦ$ۥ۟۟ r4 = new Yue.ۥۢۥۨۦ$ۥ۟۟
            r4.<init>(r3, r0)
            r2.f24639 = r4
        L1d:
            return
    }

    @Yue.InterfaceC5336(30)
    @java.lang.Deprecated
    public C7110(@Yue.InterfaceC4410 android.view.WindowInsetsController r3) {
            r2 = this;
            r2.<init>()
            Yue.ۥۢۥۨۦ$ۥ۟۟۟ r0 = new Yue.ۥۢۥۨۦ$ۥ۟۟۟
            Yue.ۥۢ۟ۢۦ r1 = new Yue.ۥۢ۟ۢۦ
            r1.<init>(r3)
            r0.<init>(r3, r2, r1)
            r2.f24639 = r0
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(30)
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Yue.C7110 m27404(@Yue.InterfaceC4410 android.view.WindowInsetsController r1) {
            Yue.ۥۢۥۨۦ r0 = new Yue.ۥۢۥۨۦ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m27405(@Yue.InterfaceC4410 Yue.C7110.InterfaceC7117 r2) {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            r0.mo27416(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m27406(int r8, long r9, @Yue.InterfaceC4544 android.view.animation.Interpolator r11, @Yue.InterfaceC4544 android.os.CancellationSignal r12, @Yue.InterfaceC4410 Yue.InterfaceC7051 r13) {
            r7 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r7.f24639
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.mo27417(r1, r2, r4, r5, r6)
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m27407() {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            int r0 = r0.mo27418()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m27408(int r2) {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            r0.mo27419(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m27409() {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            boolean r0 = r0.mo27431()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m27410() {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            boolean r0 = r0.mo27429()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m27411(@Yue.InterfaceC4410 Yue.C7110.InterfaceC7117 r2) {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            r0.mo27420(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m27412(boolean r2) {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            r0.mo27432(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m27413(boolean r2) {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            r0.mo27430(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m27414(int r2) {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            r0.mo27421(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m27415(int r2) {
            r1 = this;
            Yue.ۥۢۥۨۦ$ۥ۟۟۟۟ r0 = r1.f24639
            r0.mo27422(r2)
            return
    }
}
