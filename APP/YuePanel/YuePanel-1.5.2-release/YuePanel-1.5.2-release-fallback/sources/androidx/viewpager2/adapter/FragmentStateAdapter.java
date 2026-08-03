package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends androidx.recyclerview.widget.RecyclerView.AbstractC7678<Yue.C2807> implements Yue.InterfaceC5948 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f30148 = "f#";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f30149 = "s#";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long f30150 = 10000;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.lifecycle.Lifecycle f30151;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.fragment.app.FragmentManager f30152;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C3827<androidx.fragment.app.Fragment> f30153;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C3827<androidx.fragment.app.Fragment.C7570> f30154;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.C3827<java.lang.Integer> f30155;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer f30156;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f30157;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f30158;



    public class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C6875.AbstractC6885 f30164;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7680 f30165;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public androidx.lifecycle.LifecycleEventObserver f30166;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C6875 f30167;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public long f30168;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.viewpager2.adapter.FragmentStateAdapter f30169;


        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ, reason: contains not printable characters */
        public class C7821 extends Yue.C6875.AbstractC6885 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer f30171;

            public C7821(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer r1) {
                    r0 = this;
                    r0.f30171 = r1
                    r0.<init>()
                    return
            }

            @Override // Yue.C6875.AbstractC6885
            public void onPageScrollStateChanged(int r2) {
                    r1 = this;
                    androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r2 = r1.f30171
                    r0 = 0
                    r2.m30396(r0)
                    return
            }

            @Override // Yue.C6875.AbstractC6885
            public void onPageSelected(int r2) {
                    r1 = this;
                    androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r2 = r1.f30171
                    r0 = 0
                    r2.m30396(r0)
                    return
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ۟, reason: contains not printable characters */
        public class C7822 extends androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC7826 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer f30172;

            public C7822(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer r1) {
                    r0 = this;
                    r0.f30172 = r1
                    r1 = 0
                    r0.<init>(r1)
                    return
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC7826, androidx.recyclerview.widget.RecyclerView.AbstractC7680
            public void onChanged() {
                    r2 = this;
                    androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r0 = r2.f30172
                    r1 = 1
                    r0.m30396(r1)
                    return
            }
        }

        public FragmentMaxLifecycleEnforcer(androidx.viewpager2.adapter.FragmentStateAdapter r3) {
                r2 = this;
                r2.f30169 = r3
                r2.<init>()
                r0 = -1
                r2.f30168 = r0
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C6875 m30393(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r4) {
                r3 = this;
                android.view.ViewParent r4 = r4.getParent()
                boolean r0 = r4 instanceof Yue.C6875
                if (r0 == 0) goto Lb
                Yue.ۥۢۤۦۢ r4 = (Yue.C6875) r4
                return r4
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected ViewPager2 instance. Got: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m30394(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r2 = r1.m30393(r2)
                r1.f30167 = r2
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ r2 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ
                r2.<init>(r1)
                r1.f30164 = r2
                Yue.ۥۢۤۦۢ r0 = r1.f30167
                r0.m26646(r2)
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ۟ r2 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$ۥ۟
                r2.<init>(r1)
                r1.f30165 = r2
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r1.f30169
                r0.registerAdapterDataObserver(r2)
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 r2 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                r2.<init>(r1)
                r1.f30166 = r2
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r1.f30169
                androidx.lifecycle.Lifecycle r0 = r0.f30151
                r0.addObserver(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30395(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r2 = r1.m30393(r2)
                Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ r0 = r1.f30164
                r2.m26656(r0)
                androidx.viewpager2.adapter.FragmentStateAdapter r2 = r1.f30169
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r0 = r1.f30165
                r2.unregisterAdapterDataObserver(r0)
                androidx.viewpager2.adapter.FragmentStateAdapter r2 = r1.f30169
                androidx.lifecycle.Lifecycle r2 = r2.f30151
                androidx.lifecycle.LifecycleEventObserver r0 = r1.f30166
                r2.removeObserver(r0)
                r2 = 0
                r1.f30167 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30396(boolean r9) {
                r8 = this;
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r8.f30169
                boolean r0 = r0.m30392()
                if (r0 == 0) goto L9
                return
            L9:
                Yue.ۥۢۤۦۢ r0 = r8.f30167
                int r0 = r0.getScrollState()
                if (r0 == 0) goto L12
                return
            L12:
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r8.f30169
                Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r0 = r0.f30153
                boolean r0 = r0.m15320()
                if (r0 != 0) goto Lb3
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r8.f30169
                int r0 = r0.getItemCount()
                if (r0 != 0) goto L26
                goto Lb3
            L26:
                Yue.ۥۢۤۦۢ r0 = r8.f30167
                int r0 = r0.getCurrentItem()
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r8.f30169
                int r1 = r1.getItemCount()
                if (r0 < r1) goto L35
                return
            L35:
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r8.f30169
                long r0 = r1.getItemId(r0)
                long r2 = r8.f30168
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L44
                if (r9 != 0) goto L44
                return
            L44:
                androidx.viewpager2.adapter.FragmentStateAdapter r9 = r8.f30169
                Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r9 = r9.f30153
                java.lang.Object r9 = r9.m15316(r0)
                androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
                if (r9 == 0) goto Lb3
                boolean r9 = r9.isAdded()
                if (r9 != 0) goto L57
                goto Lb3
            L57:
                r8.f30168 = r0
                androidx.viewpager2.adapter.FragmentStateAdapter r9 = r8.f30169
                androidx.fragment.app.FragmentManager r9 = r9.f30152
                androidx.fragment.app.ۥ۟۟۠۟ r9 = r9.m29100()
                r0 = 0
                r1 = 0
                r2 = r0
            L64:
                androidx.viewpager2.adapter.FragmentStateAdapter r3 = r8.f30169
                Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r3 = r3.f30153
                int r3 = r3.m15331()
                if (r2 >= r3) goto La3
                androidx.viewpager2.adapter.FragmentStateAdapter r3 = r8.f30169
                Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r3 = r3.f30153
                long r3 = r3.m15321(r2)
                androidx.viewpager2.adapter.FragmentStateAdapter r5 = r8.f30169
                Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r5 = r5.f30153
                java.lang.Object r5 = r5.m15332(r2)
                androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
                boolean r6 = r5.isAdded()
                if (r6 != 0) goto L87
                goto La0
            L87:
                long r6 = r8.f30168
                int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r6 == 0) goto L93
                androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
                r9.mo29277(r5, r6)
                goto L94
            L93:
                r1 = r5
            L94:
                long r6 = r8.f30168
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 != 0) goto L9c
                r3 = 1
                goto L9d
            L9c:
                r3 = r0
            L9d:
                r5.setMenuVisibility(r3)
            La0:
                int r2 = r2 + 1
                goto L64
            La3:
                if (r1 == 0) goto Laa
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
                r9.mo29277(r1, r0)
            Laa:
                boolean r0 = r9.mo29275()
                if (r0 != 0) goto Lb3
                r9.mo29270()
            Lb3:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ, reason: contains not printable characters */
    public class ViewOnLayoutChangeListenerC7823 implements android.view.View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.widget.FrameLayout f30173;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2807 f30174;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.viewpager2.adapter.FragmentStateAdapter f30175;

        public ViewOnLayoutChangeListenerC7823(androidx.viewpager2.adapter.FragmentStateAdapter r1, android.widget.FrameLayout r2, Yue.C2807 r3) {
                r0 = this;
                r0.f30175 = r1
                r0.f30173 = r2
                r0.f30174 = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                r0 = this;
                android.widget.FrameLayout r1 = r0.f30173
                android.view.ViewParent r1 = r1.getParent()
                if (r1 == 0) goto L14
                android.widget.FrameLayout r1 = r0.f30173
                r1.removeOnLayoutChangeListener(r0)
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r0.f30175
                Yue.ۥۣ۠۠ r2 = r0.f30174
                r1.m30388(r2)
            L14:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟, reason: contains not printable characters */
    public class C7824 extends androidx.fragment.app.FragmentManager.AbstractC7586 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.Fragment f30176;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.widget.FrameLayout f30177;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.viewpager2.adapter.FragmentStateAdapter f30178;

        public C7824(androidx.viewpager2.adapter.FragmentStateAdapter r1, androidx.fragment.app.Fragment r2, android.widget.FrameLayout r3) {
                r0 = this;
                r0.f30178 = r1
                r0.f30176 = r2
                r0.f30177 = r3
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC7586
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo29259(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r1, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
                r0 = this;
                androidx.fragment.app.Fragment r4 = r0.f30176
                if (r2 != r4) goto Le
                r1.m29234(r0)
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r0.f30178
                android.widget.FrameLayout r2 = r0.f30177
                r1.m30376(r3, r2)
            Le:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC7825 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.viewpager2.adapter.FragmentStateAdapter f30179;

        public RunnableC7825(androidx.viewpager2.adapter.FragmentStateAdapter r1) {
                r0 = this;
                r0.f30179 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r2.f30179
                r1 = 0
                r0.f30157 = r1
                r0.m30380()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7826 extends androidx.recyclerview.widget.RecyclerView.AbstractC7680 {
        public AbstractC7826() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AbstractC7826(androidx.viewpager2.adapter.FragmentStateAdapter.ViewOnLayoutChangeListenerC7823 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeChanged(int r1, int r2, @Yue.InterfaceC4544 java.lang.Object r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }
    }

    public FragmentStateAdapter(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r2.getChildFragmentManager()
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.<init>(r0, r2)
            return
    }

    public FragmentStateAdapter(@Yue.InterfaceC4410 androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.<init>(r0, r2)
            return
    }

    public FragmentStateAdapter(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle r3) {
            r1 = this;
            r1.<init>()
            Yue.ۥۣ۠ۨۢ r0 = new Yue.ۥۣ۠ۨۢ
            r0.<init>()
            r1.f30153 = r0
            Yue.ۥۣ۠ۨۢ r0 = new Yue.ۥۣ۠ۨۢ
            r0.<init>()
            r1.f30154 = r0
            Yue.ۥۣ۠ۨۢ r0 = new Yue.ۥۣ۠ۨۢ
            r0.<init>()
            r1.f30155 = r0
            r0 = 0
            r1.f30157 = r0
            r1.f30158 = r0
            r1.f30152 = r2
            r1.f30151 = r3
            r2 = 1
            super.setHasStableIds(r2)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m30373(@Yue.InterfaceC4410 java.lang.String r1, long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m30374(@Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4410 java.lang.String r2) {
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L12
            int r1 = r1.length()
            int r2 = r2.length()
            if (r1 <= r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static long m30375(@Yue.InterfaceC4410 java.lang.String r0, @Yue.InterfaceC4410 java.lang.String r1) {
            int r1 = r1.length()
            java.lang.String r0 = r0.substring(r1)
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    @Yue.InterfaceC0907
    public void onAttachedToRecyclerView(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r0 = r1.f30156
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            Yue.C4868.m19170(r0)
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r0 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer
            r0.<init>(r1)
            r1.f30156 = r0
            r0.m30394(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public /* bridge */ /* synthetic */ void onBindViewHolder(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, int r2) {
            r0 = this;
            Yue.ۥۣ۠۠ r1 = (Yue.C2807) r1
            r0.m30383(r1, r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC7716 onCreateViewHolder(@Yue.InterfaceC4410 android.view.ViewGroup r1, int r2) {
            r0 = this;
            Yue.ۥۣ۠۠ r1 = r0.m30384(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    @Yue.InterfaceC0907
    public void onDetachedFromRecyclerView(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r0 = r1.f30156
            r0.m30395(r2)
            r2 = 0
            r1.f30156 = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            Yue.ۥۣ۠۠ r1 = (Yue.C2807) r1
            boolean r1 = r0.m30385(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            Yue.ۥۣ۠۠ r1 = (Yue.C2807) r1
            r0.m30386(r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public /* bridge */ /* synthetic */ void onViewRecycled(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
            r0 = this;
            Yue.ۥۣ۠۠ r1 = (Yue.C2807) r1
            r0.m30387(r1)
            return
    }

    @Override // Yue.InterfaceC5948
    @Yue.InterfaceC4410
    public final android.os.Parcelable saveState() {
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r1 = r7.f30153
            int r1 = r1.m15331()
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r2 = r7.f30154
            int r2 = r2.m15331()
            int r1 = r1 + r2
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L14:
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r3 = r7.f30153
            int r3 = r3.m15331()
            if (r2 >= r3) goto L40
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r3 = r7.f30153
            long r3 = r3.m15321(r2)
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r5 = r7.f30153
            java.lang.Object r5 = r5.m15316(r3)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 == 0) goto L3d
            boolean r6 = r5.isAdded()
            if (r6 == 0) goto L3d
            java.lang.String r6 = "f#"
            java.lang.String r3 = m30373(r6, r3)
            androidx.fragment.app.FragmentManager r4 = r7.f30152
            r4.m29204(r0, r3, r5)
        L3d:
            int r2 = r2 + 1
            goto L14
        L40:
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r2 = r7.f30154
            int r2 = r2.m15331()
            if (r1 >= r2) goto L68
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r2 = r7.f30154
            long r2 = r2.m15321(r1)
            boolean r4 = r7.m30377(r2)
            if (r4 == 0) goto L65
            java.lang.String r4 = "s#"
            java.lang.String r4 = m30373(r4, r2)
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r5 = r7.f30154
            java.lang.Object r2 = r5.m15316(r2)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r0.putParcelable(r4, r2)
        L65:
            int r1 = r1 + 1
            goto L40
        L68:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7678
    public final void setHasStableIds(boolean r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag."
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.InterfaceC5948
    /* JADX INFO: renamed from: ۥ */
    public final void mo22064(@Yue.InterfaceC4410 android.os.Parcelable r6) {
            r5 = this;
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r0 = r5.f30154
            boolean r0 = r0.m15320()
            if (r0 == 0) goto L98
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r0 = r5.f30153
            boolean r0 = r0.m15320()
            if (r0 == 0) goto L98
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.ClassLoader r0 = r6.getClassLoader()
            if (r0 != 0) goto L23
            java.lang.Class r0 = r5.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r6.setClassLoader(r0)
        L23:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "f#"
            boolean r3 = m30374(r1, r2)
            if (r3 == 0) goto L4f
            long r2 = m30375(r1, r2)
            androidx.fragment.app.FragmentManager r4 = r5.f30152
            androidx.fragment.app.Fragment r1 = r4.m29158(r6, r1)
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r4 = r5.f30153
            r4.m15322(r2, r1)
            goto L2b
        L4f:
            java.lang.String r2 = "s#"
            boolean r3 = m30374(r1, r2)
            if (r3 == 0) goto L6d
            long r2 = m30375(r1, r2)
            android.os.Parcelable r1 = r6.getParcelable(r1)
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r1 = (androidx.fragment.app.Fragment.C7570) r1
            boolean r4 = r5.m30377(r2)
            if (r4 == 0) goto L2b
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r4 = r5.f30154
            r4.m15322(r2, r1)
            goto L2b
        L6d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unexpected key in savedState: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L84:
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r6 = r5.f30153
            boolean r6 = r6.m15320()
            if (r6 != 0) goto L97
            r6 = 1
            r5.f30158 = r6
            r5.f30157 = r6
            r5.m30380()
            r5.m30390()
        L97:
            return
        L98:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected the adapter to be 'fresh' while restoring state."
            r6.<init>(r0)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m30376(@Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.widget.FrameLayout r4) {
            r2 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            if (r0 > r1) goto L2a
            android.view.ViewParent r0 = r3.getParent()
            if (r0 != r4) goto Le
            return
        Le:
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L17
            r4.removeAllViews()
        L17:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L26
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r3)
        L26:
            r4.addView(r3)
            return
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Design assumption violated."
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m30377(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            int r0 = r2.getItemCount()
            long r0 = (long) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract androidx.fragment.app.Fragment m30378(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30379(int r4) {
            r3 = this;
            long r0 = r3.getItemId(r4)
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r2 = r3.f30153
            boolean r2 = r2.m15312(r0)
            if (r2 != 0) goto L20
            androidx.fragment.app.Fragment r4 = r3.m30378(r4)
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r2 = r3.f30154
            java.lang.Object r2 = r2.m15316(r0)
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r2 = (androidx.fragment.app.Fragment.C7570) r2
            r4.setInitialSavedState(r2)
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r2 = r3.f30153
            r2.m15322(r0, r4)
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m30380() {
            r6 = this;
            boolean r0 = r6.f30158
            if (r0 == 0) goto L71
            boolean r0 = r6.m30392()
            if (r0 == 0) goto Lb
            goto L71
        Lb:
            Yue.ۥ۟ۡۨۦ r0 = new Yue.ۥ۟ۡۨۦ
            r0.<init>()
            r1 = 0
            r2 = r1
        L12:
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r3 = r6.f30153
            int r3 = r3.m15331()
            if (r2 >= r3) goto L35
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r3 = r6.f30153
            long r3 = r3.m15321(r2)
            boolean r5 = r6.m30377(r3)
            if (r5 != 0) goto L32
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r0.add(r5)
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r5 = r6.f30155
            r5.m15325(r3)
        L32:
            int r2 = r2 + 1
            goto L12
        L35:
            boolean r2 = r6.f30157
            if (r2 != 0) goto L59
            r6.f30158 = r1
        L3b:
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r2 = r6.f30153
            int r2 = r2.m15331()
            if (r1 >= r2) goto L59
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r2 = r6.f30153
            long r2 = r2.m15321(r1)
            boolean r4 = r6.m30381(r2)
            if (r4 != 0) goto L56
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.add(r2)
        L56:
            int r1 = r1 + 1
            goto L3b
        L59:
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.m30389(r1)
            goto L5d
        L71:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m30381(long r3) {
            r2 = this;
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r0 = r2.f30155
            boolean r0 = r0.m15312(r3)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r0 = r2.f30153
            java.lang.Object r3 = r0.m15316(r3)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r4 = 0
            if (r3 != 0) goto L16
            return r4
        L16:
            android.view.View r3 = r3.getView()
            if (r3 != 0) goto L1d
            return r4
        L1d:
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L24
            goto L25
        L24:
            r1 = r4
        L25:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.lang.Long m30382(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r2 = r4.f30155
            int r2 = r2.m15331()
            if (r1 >= r2) goto L30
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r2 = r4.f30155
            java.lang.Object r2 = r2.m15332(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L2d
            if (r0 != 0) goto L25
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r0 = r4.f30155
            long r2 = r0.m15321(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L2d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Design assumption violated: a ViewHolder can only be bound to one item at a time."
            r5.<init>(r0)
            throw r5
        L2d:
            int r1 = r1 + 1
            goto L2
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m30383(@Yue.InterfaceC4410 Yue.C2807 r8, int r9) {
            r7 = this;
            long r0 = r8.getItemId()
            android.widget.FrameLayout r2 = r8.m12243()
            int r2 = r2.getId()
            java.lang.Long r3 = r7.m30382(r2)
            if (r3 == 0) goto L2a
            long r4 = r3.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L2a
            long r4 = r3.longValue()
            r7.m30389(r4)
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r4 = r7.f30155
            long r5 = r3.longValue()
            r4.m15325(r5)
        L2a:
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r3 = r7.f30155
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.m15322(r0, r2)
            r7.m30379(r9)
            android.widget.FrameLayout r9 = r8.m12243()
            boolean r0 = Yue.C6794.m26181(r9)
            if (r0 == 0) goto L57
            android.view.ViewParent r0 = r9.getParent()
            if (r0 != 0) goto L4f
            androidx.viewpager2.adapter.FragmentStateAdapter$ۥ r0 = new androidx.viewpager2.adapter.FragmentStateAdapter$ۥ
            r0.<init>(r7, r9, r8)
            r9.addOnLayoutChangeListener(r0)
            goto L57
        L4f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Design assumption violated."
            r8.<init>(r9)
            throw r8
        L57:
            r7.m30380()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Yue.C2807 m30384(@Yue.InterfaceC4410 android.view.ViewGroup r1, int r2) {
            r0 = this;
            Yue.ۥۣ۠۠ r1 = Yue.C2807.m12242(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m30385(@Yue.InterfaceC4410 Yue.C2807 r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m30386(@Yue.InterfaceC4410 Yue.C2807 r1) {
            r0 = this;
            r0.m30388(r1)
            r0.m30380()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m30387(@Yue.InterfaceC4410 Yue.C2807 r4) {
            r3 = this;
            android.widget.FrameLayout r4 = r4.m12243()
            int r4 = r4.getId()
            java.lang.Long r4 = r3.m30382(r4)
            if (r4 == 0) goto L1e
            long r0 = r4.longValue()
            r3.m30389(r0)
            Yue.ۥۣ۠ۨۢ<java.lang.Integer> r0 = r3.f30155
            long r1 = r4.longValue()
            r0.m15325(r1)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m30388(@Yue.InterfaceC4410 Yue.C2807 r6) {
            r5 = this;
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r0 = r5.f30153
            long r1 = r6.getItemId()
            java.lang.Object r0 = r0.m15316(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r1 = "Design assumption violated."
            if (r0 == 0) goto L9f
            android.widget.FrameLayout r2 = r6.m12243()
            android.view.View r3 = r0.getView()
            boolean r4 = r0.isAdded()
            if (r4 != 0) goto L27
            if (r3 != 0) goto L21
            goto L27
        L21:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L27:
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L33
            if (r3 != 0) goto L33
            r5.m30391(r0, r2)
            return
        L33:
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L49
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L49
            android.view.ViewParent r6 = r3.getParent()
            if (r6 == r2) goto L48
            r5.m30376(r3, r2)
        L48:
            return
        L49:
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L53
            r5.m30376(r3, r2)
            return
        L53:
            boolean r1 = r5.m30392()
            if (r1 != 0) goto L8b
            r5.m30391(r0, r2)
            androidx.fragment.app.FragmentManager r1 = r5.f30152
            androidx.fragment.app.ۥ۟۟۠۟ r1 = r1.m29100()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "f"
            r2.append(r3)
            long r3 = r6.getItemId()
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            androidx.fragment.app.ۥ۟۟۠۟ r6 = r1.m29437(r0, r6)
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            androidx.fragment.app.ۥ۟۟۠۟ r6 = r6.mo29277(r0, r1)
            r6.mo29270()
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r6 = r5.f30156
            r0 = 0
            r6.m30396(r0)
            goto L9e
        L8b:
            androidx.fragment.app.FragmentManager r0 = r5.f30152
            boolean r0 = r0.m29174()
            if (r0 == 0) goto L94
            return
        L94:
            androidx.lifecycle.Lifecycle r0 = r5.f30151
            androidx.viewpager2.adapter.FragmentStateAdapter$2 r1 = new androidx.viewpager2.adapter.FragmentStateAdapter$2
            r1.<init>(r5, r6)
            r0.addObserver(r1)
        L9e:
            return
        L9f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m30389(long r4) {
            r3 = this;
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r0 = r3.f30153
            java.lang.Object r0 = r0.m15316(r4)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L20
            android.view.View r1 = r0.getView()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L20
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.removeAllViews()
        L20:
            boolean r1 = r3.m30377(r4)
            if (r1 != 0) goto L2b
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r1 = r3.f30154
            r1.m15325(r4)
        L2b:
            boolean r1 = r0.isAdded()
            if (r1 != 0) goto L37
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r0 = r3.f30153
            r0.m15325(r4)
            return
        L37:
            boolean r1 = r3.m30392()
            if (r1 == 0) goto L41
            r4 = 1
            r3.f30158 = r4
            return
        L41:
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L58
            boolean r1 = r3.m30377(r4)
            if (r1 == 0) goto L58
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment$ۥ۟۟۟ۨ> r1 = r3.f30154
            androidx.fragment.app.FragmentManager r2 = r3.f30152
            androidx.fragment.app.Fragment$ۥ۟۟۟ۨ r2 = r2.m29222(r0)
            r1.m15322(r4, r2)
        L58:
            androidx.fragment.app.FragmentManager r1 = r3.f30152
            androidx.fragment.app.ۥ۟۟۠۟ r1 = r1.m29100()
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r1.mo29276(r0)
            r0.mo29270()
            Yue.ۥۣ۠ۨۢ<androidx.fragment.app.Fragment> r0 = r3.f30153
            r0.m15325(r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m30390() {
            r4 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟۟ r1 = new androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟۟
            r1.<init>(r4)
            androidx.lifecycle.Lifecycle r2 = r4.f30151
            androidx.viewpager2.adapter.FragmentStateAdapter$5 r3 = new androidx.viewpager2.adapter.FragmentStateAdapter$5
            r3.<init>(r4, r0, r1)
            r2.addObserver(r3)
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m30391(androidx.fragment.app.Fragment r3, @Yue.InterfaceC4410 android.widget.FrameLayout r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.f30152
            androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟ r1 = new androidx.viewpager2.adapter.FragmentStateAdapter$ۥ۟
            r1.<init>(r2, r3, r4)
            r3 = 0
            r0.m29205(r1, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m30392() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.f30152
            boolean r0 = r0.m29181()
            return r0
    }
}
