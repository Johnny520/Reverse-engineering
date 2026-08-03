package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6432 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f22675 = "TransitionManager";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC6398 f22676;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.ThreadLocal<java.lang.ref.WeakReference<Yue.C0573<android.view.ViewGroup, java.util.ArrayList<Yue.AbstractC6398>>>> f22677;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.util.ArrayList<android.view.ViewGroup> f22678;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C0573<Yue.C5508, Yue.AbstractC6398> f22679;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C0573<Yue.C5508, Yue.C0573<Yue.C5508, Yue.AbstractC6398>> f22680;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۠ۨ$ۥ, reason: contains not printable characters */
    public static class ViewTreeObserverOnPreDrawListenerC6433 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Yue.AbstractC6398 f22681;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public android.view.ViewGroup f22682;

        /* JADX INFO: renamed from: Yue.ۥۢۢ۠ۨ$ۥ$ۥ, reason: contains not printable characters */
        public class C6434 extends Yue.C6431 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0573 f22683;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.C6432.ViewTreeObserverOnPreDrawListenerC6433 f22684;

            public C6434(Yue.C6432.ViewTreeObserverOnPreDrawListenerC6433 r1, Yue.C0573 r2) {
                    r0 = this;
                    r0.f22684 = r1
                    r0.f22683 = r2
                    r0.<init>()
                    return
            }

            @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
            public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r3) {
                    r2 = this;
                    Yue.ۥ۟ۡۨۡ r0 = r2.f22683
                    Yue.ۥۢۢ۠ۨ$ۥ r1 = r2.f22684
                    android.view.ViewGroup r1 = r1.f22682
                    java.lang.Object r0 = r0.get(r1)
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    r0.remove(r3)
                    r3.removeListener(r2)
                    return
            }
        }

        public ViewTreeObserverOnPreDrawListenerC6433(Yue.AbstractC6398 r1, android.view.ViewGroup r2) {
                r0 = this;
                r0.<init>()
                r0.f22681 = r1
                r0.f22682 = r2
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r5 = this;
                r5.m23711()
                java.util.ArrayList<android.view.ViewGroup> r0 = Yue.C6432.f22678
                android.view.ViewGroup r1 = r5.f22682
                boolean r0 = r0.remove(r1)
                r1 = 1
                if (r0 != 0) goto Lf
                return r1
            Lf:
                Yue.ۥ۟ۡۨۡ r0 = Yue.C6432.m23702()
                android.view.ViewGroup r2 = r5.f22682
                java.lang.Object r2 = r0.get(r2)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r3 = 0
                if (r2 != 0) goto L29
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                android.view.ViewGroup r4 = r5.f22682
                r0.put(r4, r2)
                goto L34
            L29:
                int r4 = r2.size()
                if (r4 <= 0) goto L34
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r2)
            L34:
                Yue.ۥۢۢ۟ۧ r4 = r5.f22681
                r2.add(r4)
                Yue.ۥۢۢ۟ۧ r2 = r5.f22681
                Yue.ۥۢۢ۠ۨ$ۥ$ۥ r4 = new Yue.ۥۢۢ۠ۨ$ۥ$ۥ
                r4.<init>(r5, r0)
                r2.addListener(r4)
                Yue.ۥۢۢ۟ۧ r0 = r5.f22681
                android.view.ViewGroup r2 = r5.f22682
                r4 = 0
                r0.captureValues(r2, r4)
                if (r3 == 0) goto L63
                java.util.Iterator r0 = r3.iterator()
            L51:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L63
                java.lang.Object r2 = r0.next()
                Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
                android.view.ViewGroup r3 = r5.f22682
                r2.resume(r3)
                goto L51
            L63:
                Yue.ۥۢۢ۟ۧ r0 = r5.f22681
                android.view.ViewGroup r2 = r5.f22682
                r0.playTransition(r2)
                return r1
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                r2.m23711()
                java.util.ArrayList<android.view.ViewGroup> r3 = Yue.C6432.f22678
                android.view.ViewGroup r0 = r2.f22682
                r3.remove(r0)
                Yue.ۥ۟ۡۨۡ r3 = Yue.C6432.m23702()
                android.view.ViewGroup r0 = r2.f22682
                java.lang.Object r3 = r3.get(r0)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 == 0) goto L34
                int r0 = r3.size()
                if (r0 <= 0) goto L34
                java.util.Iterator r3 = r3.iterator()
            L22:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L34
                java.lang.Object r0 = r3.next()
                Yue.ۥۢۢ۟ۧ r0 = (Yue.AbstractC6398) r0
                android.view.ViewGroup r1 = r2.f22682
                r0.resume(r1)
                goto L22
            L34:
                Yue.ۥۢۢ۟ۧ r3 = r2.f22681
                r0 = 1
                r3.clearValues(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m23711() {
                r1 = this;
                android.view.ViewGroup r0 = r1.f22682
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r1)
                android.view.ViewGroup r0 = r1.f22682
                r0.removeOnAttachStateChangeListener(r1)
                return
        }
    }

    static {
            Yue.ۥ۟ۢۤۡ r0 = new Yue.ۥ۟ۢۤۡ
            r0.<init>()
            Yue.C6432.f22676 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.C6432.f22677 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.C6432.f22678 = r0
            return
    }

    public C6432() {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            r1.f22679 = r0
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            r1.f22680 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23696(@Yue.InterfaceC4410 android.view.ViewGroup r1) {
            r0 = 0
            m23697(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m23697(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4544 Yue.AbstractC6398 r2) {
            java.util.ArrayList<android.view.ViewGroup> r0 = Yue.C6432.f22678
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L25
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto L25
            java.util.ArrayList<android.view.ViewGroup> r0 = Yue.C6432.f22678
            r0.add(r1)
            if (r2 != 0) goto L17
            Yue.ۥۢۢ۟ۧ r2 = Yue.C6432.f22676
        L17:
            Yue.ۥۢۢ۟ۧ r2 = r2.clone()
            m23706(r1, r2)
            r0 = 0
            Yue.C5508.m20730(r1, r0)
            m23705(r1, r2)
        L25:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23698(Yue.C5508 r3, Yue.AbstractC6398 r4) {
            android.view.ViewGroup r0 = r3.m20733()
            java.util.ArrayList<android.view.ViewGroup> r1 = Yue.C6432.f22678
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L39
            Yue.ۥۡۧۤۥ r1 = Yue.C5508.m20728(r0)
            if (r4 != 0) goto L1b
            if (r1 == 0) goto L17
            r1.m20732()
        L17:
            r3.m20731()
            goto L39
        L1b:
            java.util.ArrayList<android.view.ViewGroup> r2 = Yue.C6432.f22678
            r2.add(r0)
            Yue.ۥۢۢ۟ۧ r4 = r4.clone()
            if (r1 == 0) goto L30
            boolean r1 = r1.m20734()
            if (r1 == 0) goto L30
            r1 = 1
            r4.setCanRemoveViews(r1)
        L30:
            m23706(r0, r4)
            r3.m20731()
            m23705(r0, r4)
        L39:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.InterfaceC6437 m23699(@Yue.InterfaceC4410 android.view.ViewGroup r3, @Yue.InterfaceC4410 Yue.AbstractC6398 r4) {
            java.util.ArrayList<android.view.ViewGroup> r0 = Yue.C6432.f22678
            boolean r0 = r0.contains(r3)
            r1 = 0
            if (r0 != 0) goto L46
            boolean r0 = r3.isLaidOut()
            if (r0 == 0) goto L46
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 >= r2) goto L16
            goto L46
        L16:
            boolean r0 = r4.isSeekingSupported()
            if (r0 == 0) goto L3e
            java.util.ArrayList<android.view.ViewGroup> r0 = Yue.C6432.f22678
            r0.add(r3)
            Yue.ۥۢۢ۟ۧ r4 = r4.clone()
            Yue.ۥۢۢۡۡ r0 = new Yue.ۥۢۢۡۡ
            r0.<init>()
            r0.m23719(r4)
            m23706(r3, r0)
            Yue.C5508.m20730(r3, r1)
            m23705(r3, r0)
            r3.invalidate()
            Yue.ۥۢۢۡ۠ r3 = r0.createSeekController()
            return r3
        L3e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The Transition must support seeking."
            r3.<init>(r4)
            throw r3
        L46:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.InterfaceC6437 m23700(@Yue.InterfaceC4410 Yue.C5508 r5, @Yue.InterfaceC4410 Yue.AbstractC6398 r6) {
            android.view.ViewGroup r0 = r5.m20733()
            boolean r1 = r6.isSeekingSupported()
            if (r1 == 0) goto L59
            java.util.ArrayList<android.view.ViewGroup> r1 = Yue.C6432.f22678
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L14
            return r2
        L14:
            Yue.ۥۡۧۤۥ r1 = Yue.C5508.m20728(r0)
            boolean r3 = r0.isLaidOut()
            if (r3 == 0) goto L50
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 >= r4) goto L25
            goto L50
        L25:
            java.util.ArrayList<android.view.ViewGroup> r2 = Yue.C6432.f22678
            r2.add(r0)
            Yue.ۥۢۢ۟ۧ r6 = r6.clone()
            Yue.ۥۢۢۡۡ r2 = new Yue.ۥۢۢۡۡ
            r2.<init>()
            r2.m23719(r6)
            if (r1 == 0) goto L42
            boolean r6 = r1.m20734()
            if (r6 == 0) goto L42
            r6 = 1
            r2.setCanRemoveViews(r6)
        L42:
            m23706(r0, r2)
            r5.m20731()
            m23705(r0, r2)
            Yue.ۥۢۢۡ۠ r5 = r2.createSeekController()
            return r5
        L50:
            if (r1 == 0) goto L55
            r1.m20732()
        L55:
            r5.m20731()
            return r2
        L59:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The Transition must support seeking."
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m23701(@Yue.InterfaceC4544 android.view.ViewGroup r3) {
            java.util.ArrayList<android.view.ViewGroup> r0 = Yue.C6432.f22678
            r0.remove(r3)
            Yue.ۥ۟ۡۨۡ r0 = m23702()
            java.lang.Object r0 = r0.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L30
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            int r0 = r1.size()
            int r0 = r0 + (-1)
        L22:
            if (r0 < 0) goto L30
            java.lang.Object r2 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.forceToEnd(r3)
            int r0 = r0 + (-1)
            goto L22
        L30:
            return
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C0573<android.view.ViewGroup, java.util.ArrayList<Yue.AbstractC6398>> m23702() {
            java.lang.ThreadLocal<java.lang.ref.WeakReference<Yue.ۥ۟ۡۨۡ<android.view.ViewGroup, java.util.ArrayList<Yue.ۥۢۢ۟ۧ>>>> r0 = Yue.C6432.f22677
            java.lang.Object r0 = r0.get()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            Yue.ۥ۟ۡۨۡ r0 = (Yue.C0573) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            java.lang.ThreadLocal<java.lang.ref.WeakReference<Yue.ۥ۟ۡۨۡ<android.view.ViewGroup, java.util.ArrayList<Yue.ۥۢۢ۟ۧ>>>> r2 = Yue.C6432.f22677
            r2.set(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m23703(@Yue.InterfaceC4410 Yue.C5508 r1) {
            Yue.ۥۢۢ۟ۧ r0 = Yue.C6432.f22676
            m23698(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m23704(@Yue.InterfaceC4410 Yue.C5508 r0, @Yue.InterfaceC4544 Yue.AbstractC6398 r1) {
            m23698(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m23705(android.view.ViewGroup r1, Yue.AbstractC6398 r2) {
            if (r2 == 0) goto L13
            if (r1 == 0) goto L13
            Yue.ۥۢۢ۠ۨ$ۥ r0 = new Yue.ۥۢۢ۠ۨ$ۥ
            r0.<init>(r2, r1)
            r1.addOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.addOnPreDrawListener(r0)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m23706(android.view.ViewGroup r2, Yue.AbstractC6398 r3) {
            Yue.ۥ۟ۡۨۡ r0 = m23702()
            java.lang.Object r0 = r0.get(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L26
            int r1 = r0.size()
            if (r1 <= 0) goto L26
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.pause(r2)
            goto L16
        L26:
            if (r3 == 0) goto L2c
            r0 = 1
            r3.captureValues(r2, r0)
        L2c:
            Yue.ۥۡۧۤۥ r2 = Yue.C5508.m20728(r2)
            if (r2 == 0) goto L35
            r2.m20732()
        L35:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.AbstractC6398 m23707(Yue.C5508 r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.m20733()
            Yue.ۥۡۧۤۥ r0 = Yue.C5508.m20728(r0)
            if (r0 == 0) goto L1d
            Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥۢۢ۟ۧ>> r1 = r2.f22680
            java.lang.Object r1 = r1.get(r3)
            Yue.ۥ۟ۡۨۡ r1 = (Yue.C0573) r1
            if (r1 == 0) goto L1d
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r0 = (Yue.AbstractC6398) r0
            if (r0 == 0) goto L1d
            return r0
        L1d:
            Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥۢۢ۟ۧ> r0 = r2.f22679
            java.lang.Object r3 = r0.get(r3)
            Yue.ۥۢۢ۟ۧ r3 = (Yue.AbstractC6398) r3
            if (r3 == 0) goto L28
            goto L2a
        L28:
            Yue.ۥۢۢ۟ۧ r3 = Yue.C6432.f22676
        L2a:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m23708(@Yue.InterfaceC4410 Yue.C5508 r3, @Yue.InterfaceC4410 Yue.C5508 r4, @Yue.InterfaceC4544 Yue.AbstractC6398 r5) {
            r2 = this;
            Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥۢۢ۟ۧ>> r0 = r2.f22680
            java.lang.Object r0 = r0.get(r4)
            Yue.ۥ۟ۡۨۡ r0 = (Yue.C0573) r0
            if (r0 != 0) goto L14
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥۢۢ۟ۧ>> r1 = r2.f22680
            r1.put(r4, r0)
        L14:
            r0.put(r3, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m23709(@Yue.InterfaceC4410 Yue.C5508 r2, @Yue.InterfaceC4544 Yue.AbstractC6398 r3) {
            r1 = this;
            Yue.ۥ۟ۡۨۡ<Yue.ۥۡۧۤۥ, Yue.ۥۢۢ۟ۧ> r0 = r1.f22679
            r0.put(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m23710(@Yue.InterfaceC4410 Yue.C5508 r2) {
            r1 = this;
            Yue.ۥۢۢ۟ۧ r0 = r1.m23707(r2)
            m23698(r2, r0)
            return
    }
}
