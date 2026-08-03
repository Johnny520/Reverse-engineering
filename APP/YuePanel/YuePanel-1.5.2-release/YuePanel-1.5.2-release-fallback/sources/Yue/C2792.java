package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public class C2792 extends Yue.AbstractC2798 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ, reason: contains not printable characters */
    public class C2793 extends android.transition.Transition.EpicenterCallback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.Rect f9116;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2792 f9117;

        public C2793(Yue.C2792 r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f9117 = r1
                r0.f9116 = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f9116
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟, reason: contains not printable characters */
    public class C2794 implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f9118;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9119;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2792 f9120;

        public C2794(Yue.C2792 r1, android.view.View r2, java.util.ArrayList r3) {
                r0 = this;
                r0.f9120 = r1
                r0.f9118 = r2
                r0.f9119 = r3
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r4) {
                r3 = this;
                r4.removeListener(r3)
                android.view.View r4 = r3.f9118
                r0 = 8
                r4.setVisibility(r0)
                java.util.ArrayList r4 = r3.f9119
                int r4 = r4.size()
                r0 = 0
                r1 = r0
            L12:
                if (r1 >= r4) goto L22
                java.util.ArrayList r2 = r3.f9119
                java.lang.Object r2 = r2.get(r1)
                android.view.View r2 = (android.view.View) r2
                r2.setVisibility(r0)
                int r1 = r1 + 1
                goto L12
            L22:
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r1) {
                r0 = this;
                r1.removeListener(r0)
                r1.addListener(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public class C2795 implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f9121;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9122;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f9123;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9124;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Object f9125;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f9126;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2792 f9127;

        public C2795(Yue.C2792 r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5, java.lang.Object r6, java.util.ArrayList r7) {
                r0 = this;
                r0.f9127 = r1
                r0.f9121 = r2
                r0.f9122 = r3
                r0.f9123 = r4
                r0.f9124 = r5
                r0.f9125 = r6
                r0.f9126 = r7
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r1) {
                r0 = this;
                r1.removeListener(r0)
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r4) {
                r3 = this;
                java.lang.Object r4 = r3.f9121
                r0 = 0
                if (r4 == 0) goto Lc
                Yue.ۥۣ۠۟ۥ r1 = r3.f9127
                java.util.ArrayList r2 = r3.f9122
                r1.mo12216(r4, r2, r0)
            Lc:
                java.lang.Object r4 = r3.f9123
                if (r4 == 0) goto L17
                Yue.ۥۣ۠۟ۥ r1 = r3.f9127
                java.util.ArrayList r2 = r3.f9124
                r1.mo12216(r4, r2, r0)
            L17:
                java.lang.Object r4 = r3.f9125
                if (r4 == 0) goto L22
                Yue.ۥۣ۠۟ۥ r1 = r3.f9127
                java.util.ArrayList r2 = r3.f9126
                r1.mo12216(r4, r2, r0)
            L22:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟۟۟, reason: contains not printable characters */
    public class C2796 implements android.transition.Transition.TransitionListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.Runnable f9128;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2792 f9129;

        public C2796(Yue.C2792 r1, java.lang.Runnable r2) {
                r0 = this;
                r0.f9129 = r1
                r0.f9128 = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition r1) {
                r0 = this;
                java.lang.Runnable r1 = r0.f9128
                r1.run()
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition r1) {
                r0 = this;
                return
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C2797 extends android.transition.Transition.EpicenterCallback {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.Rect f9130;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2792 f9131;

        public C2797(Yue.C2792 r1, android.graphics.Rect r2) {
                r0 = this;
                r0.f9131 = r1
                r0.f9130 = r2
                r0.<init>()
                return
        }

        @Override // android.transition.Transition.EpicenterCallback
        public android.graphics.Rect onGetEpicenter(android.transition.Transition r1) {
                r0 = this;
                android.graphics.Rect r1 = r0.f9130
                if (r1 == 0) goto Le
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto Lb
                goto Le
            Lb:
                android.graphics.Rect r1 = r0.f9130
                return r1
            Le:
                r1 = 0
                return r1
        }
    }

    public C2792() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static boolean m12207(android.transition.Transition r1) {
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

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo12208(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.addTarget(r2)
        L7:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo12209(@Yue.InterfaceC4410 java.lang.Object r4, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r5) {
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r4 != 0) goto L5
            return
        L5:
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L1c
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r0 = r4.getTransitionCount()
        L10:
            if (r1 >= r0) goto L3e
            android.transition.Transition r2 = r4.getTransitionAt(r1)
            r3.mo12209(r2, r5)
            int r1 = r1 + 1
            goto L10
        L1c:
            boolean r0 = m12207(r4)
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
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo12210(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4544 java.lang.Object r2) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.TransitionManager.beginDelayedTransition(r1, r2)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean mo12211(@Yue.InterfaceC4410 java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.transition.Transition
            return r1
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Object mo12212(@Yue.InterfaceC4544 java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L9
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition r1 = r1.clone()
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.lang.Object mo12213(@Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.lang.Object r3, @Yue.InterfaceC4544 java.lang.Object r4) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r3 = (android.transition.Transition) r3
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.TransitionSet r2 = r0.addTransition(r2)
            android.transition.TransitionSet r2 = r2.addTransition(r3)
            r3 = 1
            android.transition.TransitionSet r2 = r2.setOrdering(r3)
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
            android.transition.TransitionSet r3 = new android.transition.TransitionSet
            r3.<init>()
            if (r2 == 0) goto L31
            r3.addTransition(r2)
        L31:
            r3.addTransition(r4)
            return r3
        L35:
            return r2
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.Object mo12214(@Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.lang.Object r3, @Yue.InterfaceC4544 java.lang.Object r4) {
            r1 = this;
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            if (r2 == 0) goto Lc
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
        Lc:
            if (r3 == 0) goto L13
            android.transition.Transition r3 = (android.transition.Transition) r3
            r0.addTransition(r3)
        L13:
            if (r4 == 0) goto L1a
            android.transition.Transition r4 = (android.transition.Transition) r4
            r0.addTransition(r4)
        L1a:
            return r0
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo12215(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.View r2) {
            r0 = this;
            if (r1 == 0) goto L7
            android.transition.Transition r1 = (android.transition.Transition) r1
            r1.removeTarget(r2)
        L7:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo12216(@Yue.InterfaceC4410 java.lang.Object r5, @android.annotation.SuppressLint({"UnknownNullness"}) java.util.ArrayList<android.view.View> r6, @android.annotation.SuppressLint({"UnknownNullness"}) java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            android.transition.Transition r5 = (android.transition.Transition) r5
            boolean r0 = r5 instanceof android.transition.TransitionSet
            r1 = 0
            if (r0 == 0) goto L19
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            int r0 = r5.getTransitionCount()
        Ld:
            if (r1 >= r0) goto L5f
            android.transition.Transition r2 = r5.getTransitionAt(r1)
            r4.mo12216(r2, r6, r7)
            int r1 = r1 + 1
            goto Ld
        L19:
            boolean r0 = m12207(r5)
            if (r0 != 0) goto L5f
            java.util.List r0 = r5.getTargets()
            if (r0 == 0) goto L5f
            int r2 = r0.size()
            int r3 = r6.size()
            if (r2 != r3) goto L5f
            boolean r0 = r0.containsAll(r6)
            if (r0 == 0) goto L5f
            if (r7 != 0) goto L39
            r0 = r1
            goto L3d
        L39:
            int r0 = r7.size()
        L3d:
            if (r1 >= r0) goto L4b
            java.lang.Object r2 = r7.get(r1)
            android.view.View r2 = (android.view.View) r2
            r5.addTarget(r2)
            int r1 = r1 + 1
            goto L3d
        L4b:
            int r7 = r6.size()
            int r7 = r7 + (-1)
        L51:
            if (r7 < 0) goto L5f
            java.lang.Object r0 = r6.get(r7)
            android.view.View r0 = (android.view.View) r0
            r5.removeTarget(r0)
            int r7 = r7 + (-1)
            goto L51
        L5f:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo12217(@Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            Yue.ۥۣ۠۟ۥ$ۥ۟ r0 = new Yue.ۥۣ۠۟ۥ$ۥ۟
            r0.<init>(r1, r3, r4)
            r2.addListener(r0)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void mo12218(@Yue.InterfaceC4410 java.lang.Object r11, @Yue.InterfaceC4544 java.lang.Object r12, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r13, @Yue.InterfaceC4544 java.lang.Object r14, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r15, @Yue.InterfaceC4544 java.lang.Object r16, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r17) {
            r10 = this;
            r0 = r11
            android.transition.Transition r0 = (android.transition.Transition) r0
            Yue.ۥۣ۠۟ۥ$ۥ۟۟ r9 = new Yue.ۥۣ۠۟ۥ$ۥ۟۟
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
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo12219(@Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4410 android.graphics.Rect r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.transition.Transition r2 = (android.transition.Transition) r2
            Yue.ۥۣ۠۟ۥ$ۥ۟۟۟۟ r0 = new Yue.ۥۣ۠۟ۥ$ۥ۟۟۟۟
            r0.<init>(r1, r3)
            r2.setEpicenterCallback(r0)
        Lc:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo12220(@Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4544 android.view.View r3) {
            r1 = this;
            if (r3 == 0) goto L14
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.m12228(r3, r0)
            Yue.ۥۣ۠۟ۥ$ۥ r3 = new Yue.ۥۣ۠۟ۥ$ۥ
            r3.<init>(r1, r0)
            r2.setEpicenterCallback(r3)
        L14:
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo12221(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1, @Yue.InterfaceC4410 java.lang.Object r2, @Yue.InterfaceC4410 Yue.C0943 r3, @Yue.InterfaceC4410 java.lang.Runnable r4) {
            r0 = this;
            android.transition.Transition r2 = (android.transition.Transition) r2
            Yue.ۥۣ۠۟ۥ$ۥ۟۟۟ r1 = new Yue.ۥۣ۠۟ۥ$ۥ۟۟۟
            r1.<init>(r0, r4)
            r2.addListener(r1)
            return
    }

    @Override // Yue.AbstractC2798
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void mo12222(@Yue.InterfaceC4410 java.lang.Object r5, @Yue.InterfaceC4410 android.view.View r6, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r7) {
            r4 = this;
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
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
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void mo12223(@Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r3, @Yue.InterfaceC4544 java.util.ArrayList<android.view.View> r4) {
            r1 = this;
            android.transition.TransitionSet r2 = (android.transition.TransitionSet) r2
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
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.lang.Object mo12224(@Yue.InterfaceC4544 java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.Transition r2 = (android.transition.Transition) r2
            r0.addTransition(r2)
            return r0
    }
}
