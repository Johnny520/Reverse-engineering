package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6438 extends Yue.AbstractC6398 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f22685 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f22686 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f22687 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f22688 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f22689 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f22690 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.util.ArrayList<Yue.AbstractC6398> f22691;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f22692;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f22693;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f22694;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f22695;

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۡ$ۥ, reason: contains not printable characters */
    public class C6439 extends Yue.C6431 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC6398 f22696;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6438 f22697;

        public C6439(Yue.C6438 r1, Yue.AbstractC6398 r2) {
                r0 = this;
                r0.f22697 = r1
                r0.f22696 = r2
                r0.<init>()
                return
        }

        @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                Yue.ۥۢۢ۟ۧ r0 = r1.f22696
                r0.runAnimators()
                r2.removeListener(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۡ$ۥ۟, reason: contains not printable characters */
    public class C6440 extends Yue.C6431 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6438 f22698;

        public C6440(Yue.C6438 r1) {
                r0 = this;
                r0.f22698 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
        public void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r3) {
                r2 = this;
                Yue.ۥۢۢۡۡ r0 = r2.f22698
                java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r0.f22691
                r0.remove(r3)
                Yue.ۥۢۢۡۡ r3 = r2.f22698
                boolean r3 = r3.hasAnimators()
                if (r3 != 0) goto L21
                Yue.ۥۢۢۡۡ r3 = r2.f22698
                Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r0 = Yue.AbstractC6398.InterfaceC6409.f22652
                r1 = 0
                r3.notifyListeners(r0, r1)
                Yue.ۥۢۢۡۡ r3 = r2.f22698
                r0 = 1
                r3.mEnded = r0
                Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r0 = Yue.AbstractC6398.InterfaceC6409.f22651
                r3.notifyListeners(r0, r1)
            L21:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۡۡ$ۥ۟۟, reason: contains not printable characters */
    public static class C6441 extends Yue.C6431 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C6438 f22699;

        public C6441(Yue.C6438 r1) {
                r0 = this;
                r0.<init>()
                r0.f22699 = r1
                return
        }

        @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r3) {
                r2 = this;
                Yue.ۥۢۢۡۡ r0 = r2.f22699
                int r1 = r0.f22693
                int r1 = r1 + (-1)
                r0.f22693 = r1
                if (r1 != 0) goto L10
                r1 = 0
                r0.f22694 = r1
                r0.end()
            L10:
                r3.removeListener(r2)
                return
        }

        @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                Yue.ۥۢۢۡۡ r2 = r1.f22699
                boolean r0 = r2.f22694
                if (r0 != 0) goto Le
                r2.start()
                Yue.ۥۢۢۡۡ r2 = r1.f22699
                r0 = 1
                r2.f22694 = r0
            Le:
                return
        }
    }

    public C6438() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f22691 = r0
            r0 = 1
            r1.f22692 = r0
            r0 = 0
            r1.f22694 = r0
            r1.f22695 = r0
            return
    }

    public C6438(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f22691 = r0
            r0 = 1
            r2.f22692 = r0
            r0 = 0
            r2.f22694 = r0
            r2.f22695 = r0
            int[] r1 = Yue.C6019.f21794
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r1 = "transitionOrdering"
            int r4 = Yue.C6478.m23898(r3, r4, r1, r0, r0)
            r2.m23733(r4)
            r3.recycle()
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 addListener(@Yue.InterfaceC4410 Yue.AbstractC6398.InterfaceC6408 r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23714(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 addTarget(@Yue.InterfaceC3214 int r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23715(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 addTarget(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23716(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 addTarget(@Yue.InterfaceC4410 java.lang.Class r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23717(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 addTarget(@Yue.InterfaceC4410 java.lang.String r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23718(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void cancel() {
            r3 = this;
            super.cancel()
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.cancel()
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // Yue.AbstractC6398
    public void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r4) {
            r3 = this;
            android.view.View r0 = r4.f22709
            boolean r0 = r3.isValidTarget(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            android.view.View r2 = r4.f22709
            boolean r2 = r1.isValidTarget(r2)
            if (r2 == 0) goto Le
            r1.captureEndValues(r4)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r4.f22710
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // Yue.AbstractC6398
    public void capturePropagationValues(Yue.C6447 r4) {
            r3 = this;
            super.capturePropagationValues(r4)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.capturePropagationValues(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r4) {
            r3 = this;
            android.view.View r0 = r4.f22709
            boolean r0 = r3.isValidTarget(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            android.view.View r2 = r4.f22709
            boolean r2 = r1.isValidTarget(r2)
            if (r2 == 0) goto Le
            r1.captureStartValues(r4)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r4.f22710
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public Yue.AbstractC6398 clone() {
            r4 = this;
            Yue.ۥۢۢ۟ۧ r0 = super.clone()
            Yue.ۥۢۢۡۡ r0 = (Yue.C6438) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f22691 = r1
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r4.f22691
            int r1 = r1.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L28
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r3 = r4.f22691
            java.lang.Object r3 = r3.get(r2)
            Yue.ۥۢۢ۟ۧ r3 = (Yue.AbstractC6398) r3
            Yue.ۥۢۢ۟ۧ r3 = r3.clone()
            r0.m23720(r3)
            int r2 = r2 + 1
            goto L14
        L28:
            return r0
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo23642clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥۢۢ۟ۧ r0 = r1.clone()
            return r0
    }

    @Override // Yue.AbstractC6398
    public void createAnimators(@Yue.InterfaceC4410 android.view.ViewGroup r13, @Yue.InterfaceC4410 Yue.C6448 r14, @Yue.InterfaceC4410 Yue.C6448 r15, @Yue.InterfaceC4410 java.util.ArrayList<Yue.C6447> r16, @Yue.InterfaceC4410 java.util.ArrayList<Yue.C6447> r17) {
            r12 = this;
            r0 = r12
            long r1 = r12.getStartDelay()
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r3 = r0.f22691
            int r3 = r3.size()
            r4 = 0
        Lc:
            if (r4 >= r3) goto L40
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r5 = r0.f22691
            java.lang.Object r5 = r5.get(r4)
            r6 = r5
            Yue.ۥۢۢ۟ۧ r6 = (Yue.AbstractC6398) r6
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 <= 0) goto L33
            boolean r5 = r0.f22692
            if (r5 != 0) goto L23
            if (r4 != 0) goto L33
        L23:
            long r9 = r6.getStartDelay()
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L30
            long r9 = r9 + r1
            r6.setStartDelay(r9)
            goto L33
        L30:
            r6.setStartDelay(r1)
        L33:
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r6.createAnimators(r7, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto Lc
        L40:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(int r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(@Yue.InterfaceC4410 android.view.View r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(@Yue.InterfaceC4410 java.lang.Class<?> r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(@Yue.InterfaceC4410 java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.excludeTarget(r3, r4)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.excludeTarget(r3, r4)
            return r3
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void forceToEnd(android.view.ViewGroup r4) {
            r3 = this;
            super.forceToEnd(r4)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.forceToEnd(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // Yue.AbstractC6398
    public boolean hasAnimators() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            boolean r2 = r2.hasAnimators()
            if (r2 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    @Override // Yue.AbstractC6398
    public boolean isSeekingSupported() {
            r4 = this;
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r4.f22691
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r3 = r4.f22691
            java.lang.Object r3 = r3.get(r2)
            Yue.ۥۢۢ۟ۧ r3 = (Yue.AbstractC6398) r3
            boolean r3 = r3.isSeekingSupported()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void pause(@Yue.InterfaceC4544 android.view.View r4) {
            r3 = this;
            super.pause(r4)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.pause(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC5336(34)
    public void prepareAnimatorsForSeeking() {
            r7 = this;
            r0 = 0
            r7.mTotalDuration = r0
            Yue.ۥۢۢۡۡ$ۥ۟ r0 = new Yue.ۥۢۢۡۡ$ۥ۟
            r0.<init>(r7)
            r1 = 0
        La:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r7.f22691
            int r2 = r2.size()
            if (r1 >= r2) goto L3b
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r7.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.addListener(r0)
            r2.prepareAnimatorsForSeeking()
            long r3 = r2.getTotalDurationMillis()
            boolean r5 = r7.f22692
            if (r5 == 0) goto L31
            long r5 = r7.mTotalDuration
            long r2 = java.lang.Math.max(r5, r3)
            r7.mTotalDuration = r2
            goto L38
        L31:
            long r5 = r7.mTotalDuration
            r2.mSeekOffsetInParent = r5
            long r5 = r5 + r3
            r7.mTotalDuration = r5
        L38:
            int r1 = r1 + 1
            goto La
        L3b:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 removeListener(@Yue.InterfaceC4410 Yue.AbstractC6398.InterfaceC6408 r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23725(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 removeTarget(@Yue.InterfaceC3214 int r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23726(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 removeTarget(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23727(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 removeTarget(@Yue.InterfaceC4410 java.lang.Class r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23728(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 removeTarget(@Yue.InterfaceC4410 java.lang.String r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23729(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void resume(@Yue.InterfaceC4544 android.view.View r4) {
            r3 = this;
            super.resume(r4)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.resume(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void runAnimators() {
            r4 = this;
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r4.f22691
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            r4.start()
            r4.end()
            return
        Lf:
            r4.m23735()
            boolean r0 = r4.f22692
            if (r0 != 0) goto L4b
            r0 = 1
        L17:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r4.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L3c
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r4.f22691
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r4.f22691
            java.lang.Object r2 = r2.get(r0)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            Yue.ۥۢۢۡۡ$ۥ r3 = new Yue.ۥۢۢۡۡ$ۥ
            r3.<init>(r4, r2)
            r1.addListener(r3)
            int r0 = r0 + 1
            goto L17
        L3c:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r4.f22691
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۢۢ۟ۧ r0 = (Yue.AbstractC6398) r0
            if (r0 == 0) goto L61
            r0.runAnimators()
            goto L61
        L4b:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r4.f22691
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.runAnimators()
            goto L51
        L61:
            return
    }

    @Override // Yue.AbstractC6398
    public void setCanRemoveViews(boolean r4) {
            r3 = this;
            super.setCanRemoveViews(r4)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.setCanRemoveViews(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC5336(34)
    public void setCurrentPlayTimeMillis(long r19, long r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r5 = r18.getTotalDurationMillis()
            Yue.ۥۢۢۡۡ r7 = r0.mParent
            r8 = 0
            if (r7 == 0) goto L21
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto L20
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L21
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L21
        L20:
            return
        L21:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            if (r7 >= 0) goto L28
            r12 = 1
            goto L29
        L28:
            r12 = r10
        L29:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L31
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L39
        L31:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L40
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L40
        L39:
            r0.mEnded = r10
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r14 = Yue.AbstractC6398.InterfaceC6409.f22650
            r0.notifyListeners(r14, r12)
        L40:
            boolean r14 = r0.f22692
            if (r14 == 0) goto L5d
        L44:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r7 = r0.f22691
            int r7 = r7.size()
            if (r10 >= r7) goto L5a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r7 = r0.f22691
            java.lang.Object r7 = r7.get(r10)
            Yue.ۥۢۢ۟ۧ r7 = (Yue.AbstractC6398) r7
            r7.setCurrentPlayTimeMillis(r1, r3)
            int r10 = r10 + 1
            goto L44
        L5a:
            r16 = r12
            goto La5
        L5d:
            int r10 = r0.m23724(r3)
            if (r7 < 0) goto L88
        L63:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r7 = r0.f22691
            int r7 = r7.size()
            if (r10 >= r7) goto L5a
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r7 = r0.f22691
            java.lang.Object r7 = r7.get(r10)
            Yue.ۥۢۢ۟ۧ r7 = (Yue.AbstractC6398) r7
            long r14 = r7.mSeekOffsetInParent
            r16 = r12
            long r11 = r1 - r14
            int r17 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r17 >= 0) goto L7e
            goto La5
        L7e:
            long r14 = r3 - r14
            r7.setCurrentPlayTimeMillis(r11, r14)
            int r10 = r10 + 1
            r12 = r16
            goto L63
        L88:
            r16 = r12
        L8a:
            if (r10 < 0) goto La5
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r7 = r0.f22691
            java.lang.Object r7 = r7.get(r10)
            Yue.ۥۢۢ۟ۧ r7 = (Yue.AbstractC6398) r7
            long r11 = r7.mSeekOffsetInParent
            long r14 = r1 - r11
            long r11 = r3 - r11
            r7.setCurrentPlayTimeMillis(r14, r11)
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 < 0) goto La2
            goto La5
        La2:
            int r10 = r10 + (-1)
            goto L8a
        La5:
            Yue.ۥۢۢۡۡ r7 = r0.mParent
            if (r7 == 0) goto Lc3
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb1
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb7
        Lb1:
            if (r13 >= 0) goto Lc3
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 < 0) goto Lc3
        Lb7:
            if (r1 <= 0) goto Lbc
            r1 = 1
            r0.mEnded = r1
        Lbc:
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r1 = Yue.AbstractC6398.InterfaceC6409.f22651
            r11 = r16
            r0.notifyListeners(r1, r11)
        Lc3:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 setDuration(long r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23731(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    public void setEpicenterCallback(@Yue.InterfaceC4544 Yue.AbstractC6398.AbstractC6404 r4) {
            r3 = this;
            super.setEpicenterCallback(r4)
            int r0 = r3.f22695
            r0 = r0 | 8
            r3.f22695 = r0
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L20
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.setEpicenterCallback(r4)
            int r1 = r1 + 1
            goto L10
        L20:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 setInterpolator(@Yue.InterfaceC4544 android.animation.TimeInterpolator r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23732(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    public void setPathMotion(@Yue.InterfaceC4544 Yue.AbstractC4708 r3) {
            r2 = this;
            super.setPathMotion(r3)
            int r0 = r2.f22695
            r0 = r0 | 4
            r2.f22695 = r0
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r2.f22691
            if (r0 == 0) goto L24
            r0 = 0
        Le:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L24
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.setPathMotion(r3)
            int r0 = r0 + 1
            goto Le
        L24:
            return
    }

    @Override // Yue.AbstractC6398
    public void setPropagation(@Yue.InterfaceC4544 Yue.AbstractC6435 r4) {
            r3 = this;
            super.setPropagation(r4)
            int r0 = r3.f22695
            r0 = r0 | 2
            r3.f22695 = r0
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L20
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.setPropagation(r4)
            int r1 = r1 + 1
            goto L10
        L20:
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ Yue.AbstractC6398 setStartDelay(long r1) {
            r0 = this;
            Yue.ۥۢۢۡۡ r1 = r0.m23734(r1)
            return r1
    }

    @Override // Yue.AbstractC6398
    public java.lang.String toString(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = super.toString(r6)
            r1 = 0
        L5:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r5.f22691
            int r2 = r2.size()
            if (r1 >= r2) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r5.f22691
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۢۢ۟ۧ r0 = (Yue.AbstractC6398) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "  "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.toString(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L5
        L41:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C6438 m23714(@Yue.InterfaceC4410 Yue.AbstractC6398.InterfaceC6408 r1) {
            r0 = this;
            Yue.ۥۢۢ۟ۧ r1 = super.addListener(r1)
            Yue.ۥۢۢۡۡ r1 = (Yue.C6438) r1
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Yue.C6438 m23715(@Yue.InterfaceC3214 int r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.addTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Yue.C6438 m23716(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.addTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Yue.C6438 m23717(@Yue.InterfaceC4410 java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.addTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.C6438 m23718(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.addTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.addTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.C6438 m23719(@Yue.InterfaceC4410 Yue.AbstractC6398 r5) {
            r4 = this;
            r4.m23720(r5)
            long r0 = r4.mDuration
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto Le
            r5.setDuration(r0)
        Le:
            int r0 = r4.f22695
            r0 = r0 & 1
            if (r0 == 0) goto L1b
            android.animation.TimeInterpolator r0 = r4.getInterpolator()
            r5.setInterpolator(r0)
        L1b:
            int r0 = r4.f22695
            r0 = r0 & 2
            if (r0 == 0) goto L28
            Yue.ۥۢۢۡ r0 = r4.getPropagation()
            r5.setPropagation(r0)
        L28:
            int r0 = r4.f22695
            r0 = r0 & 4
            if (r0 == 0) goto L35
            Yue.ۥۣۡۨۡ r0 = r4.getPathMotion()
            r5.setPathMotion(r0)
        L35:
            int r0 = r4.f22695
            r0 = r0 & 8
            if (r0 == 0) goto L42
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟۠ r0 = r4.getEpicenterCallback()
            r5.setEpicenterCallback(r0)
        L42:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m23720(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r1.f22691
            r0.add(r2)
            r2.mParent = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public int m23721() {
            r1 = this;
            boolean r0 = r1.f22692
            r0 = r0 ^ 1
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Yue.AbstractC6398 m23722(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r1.f22691
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L14
        Lb:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r1.f22691
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int m23723() {
            r1 = this;
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r1.f22691
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final int m23724(long r5) {
            r4 = this;
            r0 = 1
            r1 = r0
        L2:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r4.f22691
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r4.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            long r2 = r2.mSeekOffsetInParent
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L1a
            int r1 = r1 - r0
            return r1
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r5 = r4.f22691
            int r5 = r5.size()
            int r5 = r5 - r0
            return r5
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public Yue.C6438 m23725(@Yue.InterfaceC4410 Yue.AbstractC6398.InterfaceC6408 r1) {
            r0 = this;
            Yue.ۥۢۢ۟ۧ r1 = super.removeListener(r1)
            Yue.ۥۢۢۡۡ r1 = (Yue.C6438) r1
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Yue.C6438 m23726(@Yue.InterfaceC3214 int r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.removeTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public Yue.C6438 m23727(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.removeTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public Yue.C6438 m23728(@Yue.InterfaceC4410 java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.removeTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Yue.C6438 m23729(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r2.f22691
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۢ۟ۧ r1 = (Yue.AbstractC6398) r1
            r1.removeTarget(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            Yue.ۥۢۢ۟ۧ r3 = super.removeTarget(r3)
            Yue.ۥۢۢۡۡ r3 = (Yue.C6438) r3
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public Yue.C6438 m23730(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r1.f22691
            r0.remove(r2)
            r0 = 0
            r2.mParent = r0
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public Yue.C6438 m23731(long r5) {
            r4 = this;
            super.setDuration(r5)
            long r0 = r4.mDuration
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L24
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r4.f22691
            if (r0 == 0) goto L24
            int r0 = r0.size()
            r1 = 0
        L14:
            if (r1 >= r0) goto L24
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r4.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.setDuration(r5)
            int r1 = r1 + 1
            goto L14
        L24:
            return r4
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public Yue.C6438 m23732(@Yue.InterfaceC4544 android.animation.TimeInterpolator r4) {
            r3 = this;
            int r0 = r3.f22695
            r0 = r0 | 1
            r3.f22695 = r0
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r2 = r3.f22691
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.setInterpolator(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            Yue.ۥۢۢ۟ۧ r4 = super.setInterpolator(r4)
            Yue.ۥۢۢۡۡ r4 = (Yue.C6438) r4
            return r4
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public Yue.C6438 m23733(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L20
            if (r4 != r0) goto L9
            r4 = 0
            r3.f22692 = r4
            goto L22
        L9:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid parameter for TransitionSet ordering: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L20:
            r3.f22692 = r0
        L22:
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public Yue.C6438 m23734(long r1) {
            r0 = this;
            Yue.ۥۢۢ۟ۧ r1 = super.setStartDelay(r1)
            Yue.ۥۢۢۡۡ r1 = (Yue.C6438) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final void m23735() {
            r3 = this;
            Yue.ۥۢۢۡۡ$ۥ۟۟ r0 = new Yue.ۥۢۢۡۡ$ۥ۟۟
            r0.<init>(r3)
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r1 = r3.f22691
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.next()
            Yue.ۥۢۢ۟ۧ r2 = (Yue.AbstractC6398) r2
            r2.addListener(r0)
            goto Lb
        L1b:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r0 = r3.f22691
            int r0 = r0.size()
            r3.f22693 = r0
            return
    }
}
