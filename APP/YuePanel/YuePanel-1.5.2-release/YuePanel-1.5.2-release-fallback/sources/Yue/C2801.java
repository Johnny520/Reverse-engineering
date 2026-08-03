package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C2801 extends Yue.AbstractC2798 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ, reason: contains not printable characters */
    public class C2802 extends Yue.AbstractC6398.AbstractC6404 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.Rect f9141;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2801 f9142;

        public C2802(Yue.C2801 r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f9142 = r1
                r0.f9141 = r2
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6398.AbstractC6404
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.Rect mo12241(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f9141
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟, reason: contains not printable characters */
    public class C2803 implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f9143;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9144;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2801 f9145;

        public C2803(Yue.C2801 r1, android.view.View r2, java.util.ArrayList r3) {
                r0 = this;
                r0.f9145 = r1
                r0.f9143 = r2
                r0.f9144 = r3
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r4) {
                r3 = this;
                r4.removeListener(r3)
                android.view.View r4 = r3.f9143
                r0 = 8
                r4.setVisibility(r0)
                java.util.ArrayList r4 = r3.f9144
                int r4 = r4.size()
                r0 = 0
                r1 = r0
            L12:
                if (r1 >= r4) goto L22
                java.util.ArrayList r2 = r3.f9144
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r0)
                int r1 = r1 + 1
                goto L12
            L22:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                r1.removeListener(r0)
                r1.addListener(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟۟, reason: contains not printable characters */
    public class C2804 extends Yue.C6431 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f9146;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9147;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f9148;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9149;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f9150;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9151;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2801 f9152;

        public C2804(Yue.C2801 r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5, java.lang.Object r6, java.util.ArrayList r7) {
                r0 = this;
                r0.f9152 = r1
                r0.f9146 = r2
                r0.f9147 = r3
                r0.f9148 = r4
                r0.f9149 = r5
                r0.f9150 = r6
                r0.f9151 = r7
                r0.<init>()
                return
        }

        @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                r1.removeListener(r0)
                return
        }

        @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r4) {
                r3 = this;
                java.lang.Object r4 = r3.f9146
                r0 = 0
                if (r4 == 0) goto Lc
                Yue.ۥۣ۠۟ۨ r1 = r3.f9152
                java.util.ArrayList r2 = r3.f9147
                r1.mo12216(r4, r2, r0)
            Lc:
                java.lang.Object r4 = r3.f9148
                if (r4 == 0) goto L17
                Yue.ۥۣ۠۟ۨ r1 = r3.f9152
                java.util.ArrayList r2 = r3.f9149
                r1.mo12216(r4, r2, r0)
            L17:
                java.lang.Object r4 = r3.f9150
                if (r4 == 0) goto L22
                Yue.ۥۣ۠۟ۨ r1 = r3.f9152
                java.util.ArrayList r2 = r3.f9151
                r1.mo12216(r4, r2, r0)
            L22:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟۟۟, reason: contains not printable characters */
    public class C2805 implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Runnable f9153;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2801 f9154;

        public C2805(Yue.C2801 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f9154 = r1
                r0.f9153 = r2
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                java.lang.Runnable r1 = r0.f9153
                r1.run()
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C2806 extends Yue.AbstractC6398.AbstractC6404 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.Rect f9155;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2801 f9156;

        public C2806(Yue.C2801 r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f9156 = r1
                r0.f9155 = r2
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6398.AbstractC6404
        /* JADX INFO: renamed from: ۥ */
        public android.graphics.Rect mo12241(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f9155
                if (r1 == 0) goto Le
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto Lb
                goto Le
            Lb:
                android.graphics.Rect r1 = r0.f9155
                return r1
            Le:
                r1 = 0
                return r1
        }
    }

    public C2801() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m12231(java.lang.Runnable r0, Yue.AbstractC6398 r1, java.lang.Runnable r2) {
            m12233(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static boolean m12232(Yue.AbstractC6398 r1) {
            java.util.List r0 = r1.getTargetIds()
            boolean r0 = Yue.AbstractC2798.m12227(r0)
            if (r0 == 0) goto L21
            java.util.List r0 = r1.getTargetNames()
            boolean r0 = Yue.AbstractC2798.m12227(r0)
            if (r0 == 0) goto L21
            java.util.List r1 = r1.getTargetTypes()
            boolean r1 = Yue.AbstractC2798.m12227(r1)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12233(java.lang.Runnable r0, Yue.AbstractC6398 r1, java.lang.Runnable r2) {
            if (r0 != 0) goto L9
            r1.cancel()
            r2.run()
            goto Lc
        L9:
            r0.run()
        Lc:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ */
    public void mo12208(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.addTarget(r2)
        L7:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo12209(@Yue.InterfaceC4410 java.lang.Object r4, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r5) {
            r3 = this;
            Yue.ۥۢۢ۟ۧ r4 = (Yue.AbstractC6398) r4
            if (r4 != 0) goto L5
            return
        L5:
            boolean r0 = r4 instanceof Yue.C6438
            r1 = 0
            if (r0 == 0) goto L1c
            Yue.ۥۢۢۡۡ r4 = (Yue.C6438) r4
            int r0 = r4.m23723()
        L10:
            if (r1 >= r0) goto L3e
            Yue.ۥۢۢ۟ۧ r2 = r4.m23722(r1)
            r3.mo12209(r2, r5)
            int r1 = r1 + 1
            goto L10
        L1c:
            boolean r0 = m12232(r4)
            if (r0 != 0) goto L3e
            java.util.List r0 = r4.getTargets()
            boolean r0 = Yue.AbstractC2798.m12227(r0)
            if (r0 == 0) goto L3e
            int r0 = r5.size()
        L30:
            if (r1 >= r0) goto L3e
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            r4.addTarget(r2)
            int r1 = r1 + 1
            goto L30
        L3e:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo12210(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4544 java.lang.Object r2) {
            r0 = this;
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            Yue.C6432.m23697(r1, r2)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo12211(@Yue.InterfaceC4410 java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof Yue.AbstractC6398
            return r1
    }

    @Override // Yue.AbstractC2798
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.Object mo12212(@Yue.InterfaceC4544 java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            Yue.ۥۢۢ۟ۧ r1 = r1.clone()
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // Yue.AbstractC2798
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.Object mo12213(@Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.lang.Object r3, @Yue.InterfaceC4544 java.lang.Object r4) {
            r1 = this;
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            Yue.ۥۢۢ۟ۧ r3 = (Yue.AbstractC6398) r3
            Yue.ۥۢۢ۟ۧ r4 = (Yue.AbstractC6398) r4
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            Yue.ۥۢۢۡۡ r0 = new Yue.ۥۢۢۡۡ
            r0.<init>()
            Yue.ۥۢۢۡۡ r2 = r0.m23719(r2)
            Yue.ۥۢۢۡۡ r2 = r2.m23719(r3)
            r3 = 1
            Yue.ۥۢۢۡۡ r2 = r2.m23733(r3)
            goto L25
        L1d:
            if (r2 == 0) goto L20
            goto L25
        L20:
            if (r3 == 0) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = 0
        L25:
            if (r4 == 0) goto L35
            Yue.ۥۢۢۡۡ r3 = new Yue.ۥۢۢۡۡ
            r3.<init>()
            if (r2 == 0) goto L31
            r3.m23719(r2)
        L31:
            r3.m23719(r4)
            return r3
        L35:
            return r2
    }

    @Override // Yue.AbstractC2798
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public java.lang.Object mo12214(@Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.lang.Object r3, @Yue.InterfaceC4544 java.lang.Object r4) {
            r1 = this;
            Yue.ۥۢۢۡۡ r0 = new Yue.ۥۢۢۡۡ
            r0.<init>()
            if (r2 == 0) goto Lc
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r0.m23719(r2)
        Lc:
            if (r3 == 0) goto L13
            Yue.ۥۢۢ۟ۧ r3 = (Yue.AbstractC6398) r3
            r0.m23719(r3)
        L13:
            if (r4 == 0) goto L1a
            Yue.ۥۢۢ۟ۧ r4 = (Yue.AbstractC6398) r4
            r0.m23719(r4)
        L1a:
            return r0
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo12215(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.removeTarget(r2)
        L7:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo12216(@Yue.InterfaceC4410 java.lang.Object r5, @android.annotation.SuppressLint({"UnknownNullness"}) java.util.ArrayList<android.view.View> r6, @android.annotation.SuppressLint({"UnknownNullness"}) java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            Yue.ۥۢۢ۟ۧ r5 = (Yue.AbstractC6398) r5
            boolean r0 = r5 instanceof Yue.C6438
            r1 = 0
            if (r0 == 0) goto L19
            Yue.ۥۢۢۡۡ r5 = (Yue.C6438) r5
            int r0 = r5.m23723()
        Ld:
            if (r1 >= r0) goto L5d
            Yue.ۥۢۢ۟ۧ r2 = r5.m23722(r1)
            r4.mo12216(r2, r6, r7)
            int r1 = r1 + 1
            goto Ld
        L19:
            boolean r0 = m12232(r5)
            if (r0 != 0) goto L5d
            java.util.List r0 = r5.getTargets()
            int r2 = r0.size()
            int r3 = r6.size()
            if (r2 != r3) goto L5d
            boolean r0 = r0.containsAll(r6)
            if (r0 == 0) goto L5d
            if (r7 != 0) goto L37
            r0 = r1
            goto L3b
        L37:
            int r0 = r7.size()
        L3b:
            if (r1 >= r0) goto L49
            java.lang.Object r2 = r7.get(r1)
            android.view.View r2 = (android.view.View) r2
            r5.addTarget(r2)
            int r1 = r1 + 1
            goto L3b
        L49:
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L4f:
            if (r7 < 0) goto L5d
            java.lang.Object r0 = r6.get(r7)
            android.view.View r0 = (android.view.View) r0
            r5.removeTarget(r0)
            int r7 = r7 + (-1)
            goto L4f
        L5d:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo12217(@Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            Yue.ۥۣ۠۟ۨ$ۥ۟ r0 = new Yue.ۥۣ۠۟ۨ$ۥ۟
            r0.<init>(r1, r3, r4)
            r2.addListener(r0)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo12218(@Yue.InterfaceC4410 java.lang.Object r11, @Yue.InterfaceC4544 java.lang.Object r12, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r13, @Yue.InterfaceC4544 java.lang.Object r14, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r15, @Yue.InterfaceC4544 java.lang.Object r16, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r17) {
            r10 = this;
            r0 = r11
            Yue.ۥۢۢ۟ۧ r0 = (Yue.AbstractC6398) r0
            Yue.ۥۣ۠۟ۨ$ۥ۟۟ r9 = new Yue.ۥۣ۠۟ۨ$ۥ۟۟
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.addListener(r9)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo12219(@Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4410 android.graphics.Rect r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            Yue.ۥۣ۠۟ۨ$ۥ۟۟۟۟ r0 = new Yue.ۥۣ۠۟ۨ$ۥ۟۟۟۟
            r0.<init>(r1, r3)
            r2.setEpicenterCallback(r0)
        Lc:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo12220(@Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4544 android.view.View r3) {
            r1 = this;
            if (r3 == 0) goto L14
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.m12228(r3, r0)
            Yue.ۥۣ۠۟ۨ$ۥ r3 = new Yue.ۥۣ۠۟ۨ$ۥ
            r3.<init>(r1, r0)
            r2.setEpicenterCallback(r3)
        L14:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo12221(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r7, @Yue.InterfaceC4410 java.lang.Object r8, @Yue.InterfaceC4410 Yue.C0943 r9, @Yue.InterfaceC4410 java.lang.Runnable r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.m12240(r1, r2, r3, r4, r5)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo12222(@Yue.InterfaceC4410 java.lang.Object r5, @Yue.InterfaceC4410 android.view.View r6, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            Yue.ۥۢۢۡۡ r5 = (Yue.C6438) r5
            java.util.List r0 = r5.getTargets()
            r0.clear()
            int r1 = r7.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L1c
            java.lang.Object r3 = r7.get(r2)
            android.view.View r3 = (android.view.View) r3
            Yue.AbstractC2798.m12225(r0, r3)
            int r2 = r2 + 1
            goto Le
        L1c:
            r0.add(r6)
            r7.add(r6)
            r4.mo12209(r5, r7)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo12223(@Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r3, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            Yue.ۥۢۢۡۡ r2 = (Yue.C6438) r2
            if (r2 == 0) goto L15
            java.util.List r0 = r2.getTargets()
            r0.clear()
            java.util.List r0 = r2.getTargets()
            r0.addAll(r4)
            r1.mo12216(r2, r3, r4)
        L15:
            return
    }

    @Override // Yue.AbstractC2798
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public java.lang.Object mo12224(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            Yue.ۥۢۢۡۡ r0 = new Yue.ۥۢۢۡۡ
            r0.<init>()
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r0.m23719(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m12234(@Yue.InterfaceC4410 java.lang.Object r1) {
            r0 = this;
            Yue.ۥۢۢۡ۠ r1 = (Yue.InterfaceC6437) r1
            r1.mo23653()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m12235(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 java.lang.Runnable r2) {
            r0 = this;
            Yue.ۥۢۢۡ۠ r1 = (Yue.InterfaceC6437) r1
            r1.mo23654(r2)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.lang.Object m12236(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 java.lang.Object r2) {
            r0 = this;
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            Yue.ۥۢۢۡ۠ r1 = Yue.C6432.m23699(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m12237() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m12238(@Yue.InterfaceC4410 java.lang.Object r4) {
            r3 = this;
            r0 = r4
            Yue.ۥۢۢ۟ۧ r0 = (Yue.AbstractC6398) r0
            boolean r0 = r0.isSeekingSupported()
            if (r0 != 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Predictive back not available for AndroidX Transition "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r4)
        L24:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m12239(@Yue.InterfaceC4410 java.lang.Object r7, float r8) {
            r6 = this;
            Yue.ۥۢۢۡ۠ r7 = (Yue.InterfaceC6437) r7
            boolean r0 = r7.mo23651()
            if (r0 == 0) goto L28
            long r0 = r7.mo23659()
            float r0 = (float) r0
            float r8 = r8 * r0
            long r0 = (long) r8
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 1
            if (r8 != 0) goto L18
            r0 = r2
        L18:
            long r4 = r7.mo23659()
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L25
            long r0 = r7.mo23659()
            long r0 = r0 - r2
        L25:
            r7.mo23652(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m12240(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1, @Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4410 Yue.C0943 r3, @Yue.InterfaceC4544 java.lang.Runnable r4, @Yue.InterfaceC4410 java.lang.Runnable r5) {
            r0 = this;
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            Yue.ۥۣ۠۟ۧ r1 = new Yue.ۥۣ۠۟ۧ
            r1.<init>(r4, r2, r5)
            r3.m5365(r1)
            Yue.ۥۣ۠۟ۨ$ۥ۟۟۟ r1 = new Yue.ۥۣ۠۟ۨ$ۥ۟۟۟
            r1.<init>(r0, r5)
            r2.addListener(r1)
            return
    }
}
