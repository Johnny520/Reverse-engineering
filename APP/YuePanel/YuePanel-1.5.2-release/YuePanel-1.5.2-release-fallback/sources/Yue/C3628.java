package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3628 extends androidx.fragment.app.Fragment {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f11548 = 16711681;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f11549 = 16711682;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f11550 = 16711683;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.os.Handler f11551;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.lang.Runnable f11552;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final android.widget.AdapterView.OnItemClickListener f11553;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.widget.ListAdapter f11554;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public android.widget.ListView f11555;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.view.View f11556;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public android.widget.TextView f11557;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public android.view.View f11558;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.view.View f11559;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.lang.CharSequence f11560;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f11561;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ, reason: contains not printable characters */
    public class RunnableC3629 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3628 f11562;

        public RunnableC3629(Yue.C3628 r1) {
                r0 = this;
                r0.f11562 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                Yue.ۥۣ۠ۧۢ r0 = r1.f11562
                android.widget.ListView r0 = r0.f11555
                r0.focusableViewAvailable(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ۟, reason: contains not printable characters */
    public class C3630 implements android.widget.AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3628 f11563;

        public C3630(Yue.C3628 r1) {
                r0 = this;
                r0.f11563 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r7, android.view.View r8, int r9, long r10) {
                r6 = this;
                Yue.ۥۣ۠ۧۢ r0 = r6.f11563
                r1 = r7
                android.widget.ListView r1 = (android.widget.ListView) r1
                r2 = r8
                r3 = r9
                r4 = r10
                r0.m14682(r1, r2, r3, r4)
                return
        }
    }

    public C3628() {
            r1 = this;
            r1.<init>()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.f11551 = r0
            Yue.ۥۣ۠ۧۢ$ۥ r0 = new Yue.ۥۣ۠ۧۢ$ۥ
            r0.<init>(r1)
            r1.f11552 = r0
            Yue.ۥۣ۠ۧۢ$ۥ۟ r0 = new Yue.ۥۣ۠ۧۢ$ۥ۟
            r0.<init>(r1)
            r1.f11553 = r0
            return
    }

    @Override // androidx.fragment.app.Fragment
    @Yue.InterfaceC4544
    public android.view.View onCreateView(@Yue.InterfaceC4410 android.view.LayoutInflater r5, @Yue.InterfaceC4544 android.view.ViewGroup r6, @Yue.InterfaceC4544 android.os.Bundle r7) {
            r4 = this;
            android.content.Context r5 = r4.requireContext()
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r5)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r5)
            r0 = 16711682(0xff0002, float:2.3418054E-38)
            r7.setId(r0)
            r0 = 1
            r7.setOrientation(r0)
            r0 = 8
            r7.setVisibility(r0)
            r0 = 17
            r7.setGravity(r0)
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r2 = 0
            r3 = 16842874(0x101007a, float:2.36939E-38)
            r1.<init>(r5, r2, r3)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r2.<init>(r3, r3)
            r7.addView(r1, r2)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r6.addView(r7, r1)
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r5)
            r1 = 16711683(0xff0003, float:2.3418056E-38)
            r7.setId(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r5)
            r3 = 16711681(0xff0001, float:2.3418053E-38)
            r1.setId(r3)
            r1.setGravity(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2)
            r7.addView(r1, r0)
            android.widget.ListView r0 = new android.widget.ListView
            r0.<init>(r5)
            r5 = 16908298(0x102000a, float:2.3877257E-38)
            r0.setId(r5)
            r5 = 0
            r0.setDrawSelectorOnTop(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r2, r2)
            r7.addView(r0, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r2, r2)
            r6.addView(r7, r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r2, r2)
            r6.setLayoutParams(r5)
            return r6
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r2 = this;
            android.os.Handler r0 = r2.f11551
            java.lang.Runnable r1 = r2.f11552
            r0.removeCallbacks(r1)
            r0 = 0
            r2.f11555 = r0
            r1 = 0
            r2.f11561 = r1
            r2.f11559 = r0
            r2.f11558 = r0
            r2.f11556 = r0
            r2.f11557 = r0
            super.onDestroyView()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4544 android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            r0.m14677()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m14677() {
            r3 = this;
            android.widget.ListView r0 = r3.f11555
            if (r0 == 0) goto L5
            return
        L5:
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto La0
            boolean r1 = r0 instanceof android.widget.ListView
            if (r1 == 0) goto L14
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.f11555 = r0
            goto L7b
        L14:
            r1 = 16711681(0xff0001, float:2.3418053E-38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3.f11557 = r1
            if (r1 != 0) goto L2b
            r1 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r1 = r0.findViewById(r1)
            r3.f11556 = r1
            goto L30
        L2b:
            r2 = 8
            r1.setVisibility(r2)
        L30:
            r1 = 16711682(0xff0002, float:2.3418054E-38)
            android.view.View r1 = r0.findViewById(r1)
            r3.f11558 = r1
            r1 = 16711683(0xff0003, float:2.3418056E-38)
            android.view.View r1 = r0.findViewById(r1)
            r3.f11559 = r1
            r1 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = r0.findViewById(r1)
            boolean r1 = r0 instanceof android.widget.ListView
            if (r1 != 0) goto L5f
            if (r0 != 0) goto L57
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Your content must have a ListView whose id attribute is 'android.R.id.list'"
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Content has view with id attribute 'android.R.id.list' that is not a ListView class"
            r0.<init>(r1)
            throw r0
        L5f:
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.f11555 = r0
            android.view.View r1 = r3.f11556
            if (r1 == 0) goto L6b
            r0.setEmptyView(r1)
            goto L7b
        L6b:
            java.lang.CharSequence r0 = r3.f11560
            if (r0 == 0) goto L7b
            android.widget.TextView r1 = r3.f11557
            r1.setText(r0)
            android.widget.ListView r0 = r3.f11555
            android.widget.TextView r1 = r3.f11557
            r0.setEmptyView(r1)
        L7b:
            r0 = 1
            r3.f11561 = r0
            android.widget.ListView r0 = r3.f11555
            android.widget.AdapterView$OnItemClickListener r1 = r3.f11553
            r0.setOnItemClickListener(r1)
            android.widget.ListAdapter r0 = r3.f11554
            if (r0 == 0) goto L90
            r1 = 0
            r3.f11554 = r1
            r3.m14685(r0)
            goto L98
        L90:
            android.view.View r0 = r3.f11558
            if (r0 == 0) goto L98
            r0 = 0
            r3.m14687(r0, r0)
        L98:
            android.os.Handler r0 = r3.f11551
            java.lang.Runnable r1 = r3.f11552
            r0.post(r1)
            return
        La0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Content view not yet created"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.widget.ListAdapter m14678() {
            r1 = this;
            android.widget.ListAdapter r0 = r1.f11554
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public android.widget.ListView m14679() {
            r1 = this;
            r1.m14677()
            android.widget.ListView r0 = r1.f11555
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public long m14680() {
            r2 = this;
            r2.m14677()
            android.widget.ListView r0 = r2.f11555
            long r0 = r0.getSelectedItemId()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m14681() {
            r1 = this;
            r1.m14677()
            android.widget.ListView r0 = r1.f11555
            int r0 = r0.getSelectedItemPosition()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m14682(@Yue.InterfaceC4410 android.widget.ListView r1, @Yue.InterfaceC4410 android.view.View r2, int r3, long r4) {
            r0 = this;
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final android.widget.ListAdapter m14683() {
            r3 = this;
            android.widget.ListAdapter r0 = r3.m14678()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ListFragment "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " does not have a ListAdapter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m14684(@Yue.InterfaceC4544 java.lang.CharSequence r3) {
            r2 = this;
            r2.m14677()
            android.widget.TextView r0 = r2.f11557
            if (r0 == 0) goto L18
            r0.setText(r3)
            java.lang.CharSequence r0 = r2.f11560
            if (r0 != 0) goto L15
            android.widget.ListView r0 = r2.f11555
            android.widget.TextView r1 = r2.f11557
            r0.setEmptyView(r1)
        L15:
            r2.f11560 = r3
            return
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't be used with a custom content view"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m14685(@Yue.InterfaceC4544 android.widget.ListAdapter r5) {
            r4 = this;
            android.widget.ListAdapter r0 = r4.f11554
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r4.f11554 = r5
            android.widget.ListView r3 = r4.f11555
            if (r3 == 0) goto L26
            r3.setAdapter(r5)
            boolean r5 = r4.f11561
            if (r5 != 0) goto L26
            if (r0 != 0) goto L26
            android.view.View r5 = r4.requireView()
            android.os.IBinder r5 = r5.getWindowToken()
            if (r5 == 0) goto L23
            r1 = r2
        L23:
            r4.m14687(r2, r1)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m14686(boolean r2) {
            r1 = this;
            r0 = 1
            r1.m14687(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m14687(boolean r6, boolean r7) {
            r5 = this;
            r5.m14677()
            android.view.View r0 = r5.f11558
            if (r0 == 0) goto L74
            boolean r1 = r5.f11561
            if (r1 != r6) goto Lc
            return
        Lc:
            r5.f11561 = r6
            r1 = 0
            r2 = 8
            r3 = 17432576(0x10a0000, float:2.5346597E-38)
            r4 = 17432577(0x10a0001, float:2.53466E-38)
            if (r6 == 0) goto L46
            if (r7 == 0) goto L33
            android.content.Context r6 = r5.getContext()
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r4)
            r0.startAnimation(r6)
            android.view.View r6 = r5.f11559
            android.content.Context r7 = r5.getContext()
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r7, r3)
            r6.startAnimation(r7)
            goto L3b
        L33:
            r0.clearAnimation()
            android.view.View r6 = r5.f11559
            r6.clearAnimation()
        L3b:
            android.view.View r6 = r5.f11558
            r6.setVisibility(r2)
            android.view.View r6 = r5.f11559
            r6.setVisibility(r1)
            goto L73
        L46:
            if (r7 == 0) goto L61
            android.content.Context r6 = r5.getContext()
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r3)
            r0.startAnimation(r6)
            android.view.View r6 = r5.f11559
            android.content.Context r7 = r5.getContext()
            android.view.animation.Animation r7 = android.view.animation.AnimationUtils.loadAnimation(r7, r4)
            r6.startAnimation(r7)
            goto L69
        L61:
            r0.clearAnimation()
            android.view.View r6 = r5.f11559
            r6.clearAnimation()
        L69:
            android.view.View r6 = r5.f11558
            r6.setVisibility(r1)
            android.view.View r6 = r5.f11559
            r6.setVisibility(r2)
        L73:
            return
        L74:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Can't be used with a custom content view"
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m14688(boolean r2) {
            r1 = this;
            r0 = 0
            r1.m14687(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m14689(int r2) {
            r1 = this;
            r1.m14677()
            android.widget.ListView r0 = r1.f11555
            r0.setSelection(r2)
            return
    }
}
