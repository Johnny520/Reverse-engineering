package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6398 implements java.lang.Cloneable {
    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = null;
    private static final android.animation.Animator[] EMPTY_ANIMATOR_ARRAY = null;
    private static final java.lang.String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final java.lang.String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final java.lang.String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final java.lang.String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final java.lang.String MATCH_NAME_STR = "name";
    private static final Yue.AbstractC4708 STRAIGHT_PATH_MOTION = null;
    private static java.lang.ThreadLocal<Yue.C0573<android.animation.Animator, Yue.AbstractC6398.C6402>> sRunningAnimators;
    private android.animation.Animator[] mAnimatorCache;
    java.util.ArrayList<android.animation.Animator> mAnimators;
    boolean mCanRemoveViews;
    private Yue.AbstractC6398 mCloneParent;
    java.util.ArrayList<android.animation.Animator> mCurrentAnimators;
    long mDuration;
    private Yue.C6448 mEndValues;
    private java.util.ArrayList<Yue.C6447> mEndValuesList;
    boolean mEnded;
    private Yue.AbstractC6398.AbstractC6404 mEpicenterCallback;
    private android.animation.TimeInterpolator mInterpolator;
    private java.util.ArrayList<Yue.AbstractC6398.InterfaceC6408> mListeners;
    private Yue.AbstractC6398.InterfaceC6408[] mListenersCache;
    private int[] mMatchOrder;
    private java.lang.String mName;
    private Yue.C0573<java.lang.String, java.lang.String> mNameOverrides;
    int mNumInstances;
    Yue.C6438 mParent;
    private Yue.AbstractC4708 mPathMotion;
    private boolean mPaused;
    Yue.AbstractC6435 mPropagation;
    Yue.AbstractC6398.C6407 mSeekController;
    long mSeekOffsetInParent;
    private long mStartDelay;
    private Yue.C6448 mStartValues;
    private java.util.ArrayList<Yue.C6447> mStartValuesList;
    private java.util.ArrayList<android.view.View> mTargetChildExcludes;
    private java.util.ArrayList<android.view.View> mTargetExcludes;
    private java.util.ArrayList<java.lang.Integer> mTargetIdChildExcludes;
    private java.util.ArrayList<java.lang.Integer> mTargetIdExcludes;
    java.util.ArrayList<java.lang.Integer> mTargetIds;
    private java.util.ArrayList<java.lang.String> mTargetNameExcludes;
    private java.util.ArrayList<java.lang.String> mTargetNames;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeChildExcludes;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypeExcludes;
    private java.util.ArrayList<java.lang.Class<?>> mTargetTypes;
    java.util.ArrayList<android.view.View> mTargets;
    long mTotalDuration;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ, reason: contains not printable characters */
    public class C6399 extends Yue.AbstractC4708 {
        public C6399() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC4708
        @Yue.InterfaceC4410
        public android.graphics.Path getPath(float r2, float r3, float r4, float r5) {
                r1 = this;
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r0.moveTo(r2, r3)
                r0.lineTo(r4, r5)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟, reason: contains not printable characters */
    public class C6400 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0573 f22631;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC6398 f22632;

        public C6400(Yue.AbstractC6398 r1, Yue.C0573 r2) {
                r0 = this;
                r0.f22632 = r1
                r0.f22631 = r2
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                Yue.ۥ۟ۡۨۡ r0 = r1.f22631
                r0.remove(r2)
                Yue.ۥۢۢ۟ۧ r0 = r1.f22632
                java.util.ArrayList<android.animation.Animator> r0 = r0.mCurrentAnimators
                r0.remove(r2)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                Yue.ۥۢۢ۟ۧ r0 = r1.f22632
                java.util.ArrayList<android.animation.Animator> r0 = r0.mCurrentAnimators
                r0.add(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public class C6401 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC6398 f22633;

        public C6401(Yue.AbstractC6398 r1) {
                r0 = this;
                r0.f22633 = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                Yue.ۥۢۢ۟ۧ r0 = r1.f22633
                r0.end()
                r2.removeListener(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6402 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.View f22634;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.String f22635;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C6447 f22636;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.view.WindowId f22637;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.AbstractC6398 f22638;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public android.animation.Animator f22639;

        public C6402(android.view.View r1, java.lang.String r2, Yue.AbstractC6398 r3, android.view.WindowId r4, Yue.C6447 r5, android.animation.Animator r6) {
                r0 = this;
                r0.<init>()
                r0.f22634 = r1
                r0.f22635 = r2
                r0.f22636 = r5
                r0.f22637 = r4
                r0.f22638 = r3
                r0.f22639 = r6
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C6403 {
        public C6403() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static <T> java.util.ArrayList<T> m23643(java.util.ArrayList<T> r1, T r2) {
                if (r1 != 0) goto L7
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L7:
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto L10
                r1.add(r2)
            L10:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static <T> java.util.ArrayList<T> m23644(java.util.ArrayList<T> r0, T r1) {
                if (r0 == 0) goto Lc
                r0.remove(r1)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto Lc
                r0 = 0
            Lc:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC6404 {
        public AbstractC6404() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ */
        public abstract android.graphics.Rect mo12241(@Yue.InterfaceC4410 Yue.AbstractC6398 r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C6405 {
        public C6405() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static long m23645(android.animation.Animator r2) {
                long r0 = r2.getTotalDuration()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m23646(android.animation.Animator r0, long r1) {
                android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
                r0.setCurrentPlayTime(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6406 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public class C6407 extends Yue.C6431 implements Yue.InterfaceC6437, Yue.AbstractC2058.InterfaceC2076 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public long f22640;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.ArrayList<Yue.InterfaceC1535<Yue.InterfaceC6437>> f22641;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.util.ArrayList<Yue.InterfaceC1535<Yue.InterfaceC6437>> f22642;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f22643;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f22644;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C5907 f22645;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.InterfaceC1535<Yue.InterfaceC6437>[] f22646;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Yue.C6672 f22647;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public java.lang.Runnable f22648;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC6398 f22649;

        public C6407(Yue.AbstractC6398 r3) {
                r2 = this;
                r2.f22649 = r3
                r2.<init>()
                r0 = -1
                r2.f22640 = r0
                r3 = 0
                r2.f22641 = r3
                r2.f22642 = r3
                r2.f22646 = r3
                Yue.ۥۣۢۥۦ r3 = new Yue.ۥۣۢۥۦ
                r3.<init>()
                r2.f22647 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static /* synthetic */ void m23647(Yue.AbstractC6398.C6407 r0, Yue.AbstractC2058 r1, boolean r2, float r3, float r4) {
                r0.m23663(r1, r2, r3, r4)
                return
        }

        @Override // Yue.C6431, Yue.AbstractC6398.InterfaceC6408
        public void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                r1 = 1
                r0.f22644 = r1
                return
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo23648(float r3) {
                r2 = this;
                Yue.ۥۢ۟ۧۡ r0 = r2.f22645
                if (r0 != 0) goto Lf
                long r0 = r2.mo23659()
                float r0 = (float) r0
                float r3 = r3 * r0
                long r0 = (long) r3
                r2.mo23652(r0)
                return
            Lf:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "setCurrentFraction() called after animation has been started"
                r3.<init>(r0)
                throw r3
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public long mo23649() {
                r6 = this;
                long r0 = r6.mo23659()
                r2 = 0
                long r4 = r6.f22640
                long r2 = java.lang.Math.max(r2, r4)
                long r0 = java.lang.Math.min(r0, r2)
                return r0
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo23650(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.InterfaceC6437> r2) {
                r1 = this;
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r1.f22641
                if (r0 == 0) goto L12
                r0.remove(r2)
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r2 = r1.f22641
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L12
                r2 = 0
                r1.f22641 = r2
            L12:
                return
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo23651() {
                r1 = this;
                boolean r0 = r1.f22643
                return r0
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo23652(long r5) {
                r4 = this;
                Yue.ۥۢ۟ۧۡ r0 = r4.f22645
                if (r0 != 0) goto L50
                long r0 = r4.f22640
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 == 0) goto L4f
                boolean r0 = r4.mo23651()
                if (r0 != 0) goto L11
                goto L4f
            L11:
                boolean r0 = r4.f22644
                if (r0 != 0) goto L42
                r0 = 0
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L24
                long r2 = r4.f22640
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 <= 0) goto L24
                r5 = -1
                goto L35
            L24:
                long r0 = r4.mo23659()
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 != 0) goto L35
                long r2 = r4.f22640
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 >= 0) goto L35
                r5 = 1
                long r5 = r5 + r0
            L35:
                long r0 = r4.f22640
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto L42
                Yue.ۥۢۢ۟ۧ r2 = r4.f22649
                r2.setCurrentPlayTimeMillis(r5, r0)
                r4.f22640 = r5
            L42:
                r4.m23660()
                Yue.ۥۣۢۥۦ r0 = r4.f22647
                long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r5 = (float) r5
                r0.m25696(r1, r5)
            L4f:
                return
            L50:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "setCurrentPlayTimeMillis() called after animation has been started"
                r5.<init>(r6)
                throw r5
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo23653() {
                r5 = this;
                r5.m23661()
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                long r1 = r5.mo23659()
                r3 = 1
                long r1 = r1 + r3
                float r1 = (float) r1
                r0.m21928(r1)
                return
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo23654(@Yue.InterfaceC4410 java.lang.Runnable r2) {
                r1 = this;
                r1.f22648 = r2
                r1.m23661()
                Yue.ۥۢ۟ۧۡ r2 = r1.f22645
                r0 = 0
                r2.m21928(r0)
                return
        }

        @Override // Yue.AbstractC2058.InterfaceC2076
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo9722(Yue.AbstractC2058 r5, float r6, float r7) {
                r4 = this;
                long r0 = r4.mo23659()
                r2 = 1
                long r0 = r0 + r2
                double r5 = (double) r6
                long r5 = java.lang.Math.round(r5)
                long r5 = java.lang.Math.min(r0, r5)
                r0 = -1
                long r5 = java.lang.Math.max(r0, r5)
                Yue.ۥۢۢ۟ۧ r7 = r4.f22649
                long r0 = r4.f22640
                r7.setCurrentPlayTimeMillis(r5, r0)
                r4.f22640 = r5
                r4.m23660()
                return
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo23655(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.InterfaceC6437> r2) {
                r1 = this;
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r1.f22642
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f22642 = r0
            Lb:
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r1.f22642
                r0.add(r2)
                return
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void mo23656(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.InterfaceC6437> r2) {
                r1 = this;
                boolean r0 = r1.mo23651()
                if (r0 == 0) goto La
                r2.accept(r1)
                return
            La:
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r1.f22641
                if (r0 != 0) goto L15
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f22641 = r0
            L15:
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r1.f22641
                r0.add(r2)
                return
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo23657(@Yue.InterfaceC4410 Yue.InterfaceC1535<Yue.InterfaceC6437> r2) {
                r1 = this;
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r1.f22642
                if (r0 == 0) goto L7
                r0.remove(r2)
            L7:
                return
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public float mo23658() {
                r3 = this;
                long r0 = r3.mo23649()
                float r0 = (float) r0
                long r1 = r3.mo23659()
                float r1 = (float) r1
                float r0 = r0 / r1
                return r0
        }

        @Override // Yue.InterfaceC6437
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public long mo23659() {
                r2 = this;
                Yue.ۥۢۢ۟ۧ r0 = r2.f22649
                long r0 = r0.getTotalDurationMillis()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m23660() {
                r5 = this;
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r5.f22642
                if (r0 == 0) goto L35
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lb
                goto L35
            Lb:
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r5.f22642
                int r0 = r0.size()
                Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>[] r1 = r5.f22646
                if (r1 != 0) goto L19
                Yue.ۥ۟ۧ۠ۧ[] r1 = new Yue.InterfaceC1535[r0]
                r5.f22646 = r1
            L19:
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r1 = r5.f22642
                Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>[] r2 = r5.f22646
                java.lang.Object[] r1 = r1.toArray(r2)
                Yue.ۥ۟ۧ۠ۧ[] r1 = (Yue.InterfaceC1535[]) r1
                r2 = 0
                r5.f22646 = r2
                r3 = 0
            L27:
                if (r3 >= r0) goto L33
                r4 = r1[r3]
                r4.accept(r5)
                r1[r3] = r2
                int r3 = r3 + 1
                goto L27
            L33:
                r5.f22646 = r1
            L35:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m23661() {
                r5 = this;
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                if (r0 == 0) goto L5
                return
            L5:
                Yue.ۥۣۢۥۦ r0 = r5.f22647
                long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r3 = r5.f22640
                float r3 = (float) r3
                r0.m25696(r1, r3)
                Yue.ۥۢ۟ۧۡ r0 = new Yue.ۥۢ۟ۧۡ
                Yue.ۥۣ۠ۢ r1 = new Yue.ۥۣ۠ۢ
                r1.<init>()
                r0.<init>(r1)
                r5.f22645 = r0
                Yue.ۥۢ۟ۧۢ r0 = new Yue.ۥۢ۟ۧۢ
                r0.<init>()
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.m21938(r1)
                r1 = 1128792064(0x43480000, float:200.0)
                r0.m21940(r1)
                Yue.ۥۢ۟ۧۡ r1 = r5.f22645
                r1.m21932(r0)
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                long r1 = r5.f22640
                float r1 = (float) r1
                r0.m9687(r1)
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                r0.m9672(r5)
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                Yue.ۥۣۢۥۦ r1 = r5.f22647
                float r1 = r1.m25697()
                r0.mo9688(r1)
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                long r1 = r5.mo23659()
                r3 = 1
                long r1 = r1 + r3
                float r1 = (float) r1
                r0.mo9683(r1)
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r0.mo9684(r1)
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                r1 = 1082130432(0x40800000, float:4.0)
                r0.m9685(r1)
                Yue.ۥۢ۟ۧۡ r0 = r5.f22645
                Yue.ۥۢۢ۟ۨ r1 = new Yue.ۥۢۢ۟ۨ
                r1.<init>(r5)
                r0.m9671(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void m23662() {
                r6 = this;
                long r0 = r6.mo23659()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lc
                r2 = 1
            Lc:
                Yue.ۥۢۢ۟ۧ r0 = r6.f22649
                long r4 = r6.f22640
                r0.setCurrentPlayTimeMillis(r2, r4)
                r6.f22640 = r2
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m23663(Yue.AbstractC2058 r5, boolean r6, float r7, float r8) {
                r4 = this;
                if (r6 != 0) goto L4b
                r5 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                r6 = 0
                if (r5 >= 0) goto L44
                long r7 = r4.mo23659()
                Yue.ۥۢۢ۟ۧ r5 = r4.f22649
                Yue.ۥۢۢۡۡ r5 = (Yue.C6438) r5
                Yue.ۥۢۢ۟ۧ r5 = r5.m23722(r6)
                Yue.ۥۢۢ۟ۧ r6 = Yue.AbstractC6398.access$000(r5)
                r0 = 0
                Yue.AbstractC6398.access$002(r5, r0)
                Yue.ۥۢۢ۟ۧ r5 = r4.f22649
                long r0 = r4.f22640
                r2 = -1
                r5.setCurrentPlayTimeMillis(r2, r0)
                Yue.ۥۢۢ۟ۧ r5 = r4.f22649
                r5.setCurrentPlayTimeMillis(r7, r2)
                r4.f22640 = r7
                java.lang.Runnable r5 = r4.f22648
                if (r5 == 0) goto L34
                r5.run()
            L34:
                Yue.ۥۢۢ۟ۧ r5 = r4.f22649
                java.util.ArrayList<android.animation.Animator> r5 = r5.mAnimators
                r5.clear()
                if (r6 == 0) goto L4b
                Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r5 = Yue.AbstractC6398.InterfaceC6409.f22651
                r7 = 1
                r6.notifyListeners(r5, r7)
                goto L4b
            L44:
                Yue.ۥۢۢ۟ۧ r5 = r4.f22649
                Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r7 = Yue.AbstractC6398.InterfaceC6409.f22651
                r5.notifyListeners(r7, r6)
            L4b:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void m23664() {
                r3 = this;
                r0 = 1
                r3.f22643 = r0
                java.util.ArrayList<Yue.ۥ۟ۧ۠ۧ<Yue.ۥۢۢۡ۠>> r0 = r3.f22641
                if (r0 == 0) goto L1d
                r1 = 0
                r3.f22641 = r1
                r1 = 0
            Lb:
                int r2 = r0.size()
                if (r1 >= r2) goto L1d
                java.lang.Object r2 = r0.get(r1)
                Yue.ۥ۟ۧ۠ۧ r2 = (Yue.InterfaceC1535) r2
                r2.accept(r3)
                int r1 = r1 + 1
                goto Lb
            L1d:
                r3.m23660()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC6408 {
        void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r1);

        void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r1);

        void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r1);

        void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r1);

        void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        default void mo23665(@Yue.InterfaceC4410 Yue.AbstractC6398 r1, boolean r2) {
                r0 = this;
                r0.onTransitionEnd(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        default void mo10702(@Yue.InterfaceC4410 Yue.AbstractC6398 r1, boolean r2) {
                r0 = this;
                r0.onTransitionStart(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public interface InterfaceC6409 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final Yue.AbstractC6398.InterfaceC6409 f22650 = null;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final Yue.AbstractC6398.InterfaceC6409 f22651 = null;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final Yue.AbstractC6398.InterfaceC6409 f22652 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final Yue.AbstractC6398.InterfaceC6409 f22653 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final Yue.AbstractC6398.InterfaceC6409 f22654 = null;

        static {
                Yue.ۥۢۢ۠ r0 = new Yue.ۥۢۢ۠
                r0.<init>()
                Yue.AbstractC6398.InterfaceC6409.f22650 = r0
                Yue.ۥۢۢ۠۟ r0 = new Yue.ۥۢۢ۠۟
                r0.<init>()
                Yue.AbstractC6398.InterfaceC6409.f22651 = r0
                Yue.ۥۢۢ۠۠ r0 = new Yue.ۥۢۢ۠۠
                r0.<init>()
                Yue.AbstractC6398.InterfaceC6409.f22652 = r0
                Yue.ۥۢۢ۠ۡ r0 = new Yue.ۥۢۢ۠ۡ
                r0.<init>()
                Yue.AbstractC6398.InterfaceC6409.f22653 = r0
                Yue.ۥۢۢ۠ۢ r0 = new Yue.ۥۢۢ۠ۢ
                r0.<init>()
                Yue.AbstractC6398.InterfaceC6409.f22654 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        static /* synthetic */ void m23666(Yue.AbstractC6398.InterfaceC6408 r0, Yue.AbstractC6398 r1, boolean r2) {
                m23667(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        static /* synthetic */ void m23667(Yue.AbstractC6398.InterfaceC6408 r0, Yue.AbstractC6398 r1, boolean r2) {
                r0.onTransitionCancel(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        static /* synthetic */ void m23668(Yue.AbstractC6398.InterfaceC6408 r0, Yue.AbstractC6398 r1, boolean r2) {
                m23671(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        static /* synthetic */ void m23669(Yue.AbstractC6398.InterfaceC6408 r0, Yue.AbstractC6398 r1, boolean r2) {
                m23670(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        static /* synthetic */ void m23670(Yue.AbstractC6398.InterfaceC6408 r0, Yue.AbstractC6398 r1, boolean r2) {
                r0.onTransitionPause(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        static /* synthetic */ void m23671(Yue.AbstractC6398.InterfaceC6408 r0, Yue.AbstractC6398 r1, boolean r2) {
                r0.onTransitionResume(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo23672(@Yue.InterfaceC4410 Yue.AbstractC6398.InterfaceC6408 r1, @Yue.InterfaceC4410 Yue.AbstractC6398 r2, boolean r3);
    }

    static {
            r0 = 0
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            Yue.AbstractC6398.EMPTY_ANIMATOR_ARRAY = r0
            r0 = 3
            r1 = 4
            r2 = 2
            r3 = 1
            int[] r0 = new int[]{r2, r3, r0, r1}
            Yue.AbstractC6398.DEFAULT_MATCH_ORDER = r0
            Yue.ۥۢۢ۟ۧ$ۥ r0 = new Yue.ۥۢۢ۟ۧ$ۥ
            r0.<init>()
            Yue.AbstractC6398.STRAIGHT_PATH_MOTION = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.AbstractC6398.sRunningAnimators = r0
            return
    }

    public AbstractC6398() {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r3.mName = r0
            r0 = -1
            r3.mStartDelay = r0
            r3.mDuration = r0
            r0 = 0
            r3.mInterpolator = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.mTargetIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.mTargets = r1
            r3.mTargetNames = r0
            r3.mTargetTypes = r0
            r3.mTargetIdExcludes = r0
            r3.mTargetExcludes = r0
            r3.mTargetTypeExcludes = r0
            r3.mTargetNameExcludes = r0
            r3.mTargetIdChildExcludes = r0
            r3.mTargetChildExcludes = r0
            r3.mTargetTypeChildExcludes = r0
            Yue.ۥۢۢۡۥ r1 = new Yue.ۥۢۢۡۥ
            r1.<init>()
            r3.mStartValues = r1
            Yue.ۥۢۢۡۥ r1 = new Yue.ۥۢۢۡۥ
            r1.<init>()
            r3.mEndValues = r1
            r3.mParent = r0
            int[] r1 = Yue.AbstractC6398.DEFAULT_MATCH_ORDER
            r3.mMatchOrder = r1
            r1 = 0
            r3.mCanRemoveViews = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mCurrentAnimators = r2
            android.animation.Animator[] r2 = Yue.AbstractC6398.EMPTY_ANIMATOR_ARRAY
            r3.mAnimatorCache = r2
            r3.mNumInstances = r1
            r3.mPaused = r1
            r3.mEnded = r1
            r3.mCloneParent = r0
            r3.mListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mAnimators = r0
            Yue.ۥۣۡۨۡ r0 = Yue.AbstractC6398.STRAIGHT_PATH_MOTION
            r3.mPathMotion = r0
            return
    }

    public AbstractC6398(@Yue.InterfaceC4410 android.content.Context r9, @Yue.InterfaceC4410 android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getName()
            r8.mName = r0
            r0 = -1
            r8.mStartDelay = r0
            r8.mDuration = r0
            r0 = 0
            r8.mInterpolator = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mTargetIds = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mTargets = r1
            r8.mTargetNames = r0
            r8.mTargetTypes = r0
            r8.mTargetIdExcludes = r0
            r8.mTargetExcludes = r0
            r8.mTargetTypeExcludes = r0
            r8.mTargetNameExcludes = r0
            r8.mTargetIdChildExcludes = r0
            r8.mTargetChildExcludes = r0
            r8.mTargetTypeChildExcludes = r0
            Yue.ۥۢۢۡۥ r1 = new Yue.ۥۢۢۡۥ
            r1.<init>()
            r8.mStartValues = r1
            Yue.ۥۢۢۡۥ r1 = new Yue.ۥۢۢۡۥ
            r1.<init>()
            r8.mEndValues = r1
            r8.mParent = r0
            int[] r1 = Yue.AbstractC6398.DEFAULT_MATCH_ORDER
            r8.mMatchOrder = r1
            r1 = 0
            r8.mCanRemoveViews = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8.mCurrentAnimators = r2
            android.animation.Animator[] r2 = Yue.AbstractC6398.EMPTY_ANIMATOR_ARRAY
            r8.mAnimatorCache = r2
            r8.mNumInstances = r1
            r8.mPaused = r1
            r8.mEnded = r1
            r8.mCloneParent = r0
            r8.mListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.mAnimators = r0
            Yue.ۥۣۡۨۡ r0 = Yue.AbstractC6398.STRAIGHT_PATH_MOTION
            r8.mPathMotion = r0
            int[] r0 = Yue.C6019.f21788
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0)
            android.content.res.XmlResourceParser r10 = (android.content.res.XmlResourceParser) r10
            java.lang.String r2 = "duration"
            r3 = 1
            r4 = -1
            int r2 = Yue.C6478.m23898(r0, r10, r2, r3, r4)
            long r2 = (long) r2
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L87
            r8.setDuration(r2)
        L87:
            java.lang.String r2 = "startDelay"
            r3 = 2
            int r2 = Yue.C6478.m23898(r0, r10, r2, r3, r4)
            long r2 = (long) r2
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L96
            r8.setStartDelay(r2)
        L96:
            java.lang.String r2 = "interpolator"
            int r1 = Yue.C6478.m23899(r0, r10, r2, r1, r1)
            if (r1 <= 0) goto La5
            android.view.animation.Interpolator r9 = android.view.animation.AnimationUtils.loadInterpolator(r9, r1)
            r8.setInterpolator(r9)
        La5:
            java.lang.String r9 = "matchOrder"
            r1 = 3
            java.lang.String r9 = Yue.C6478.m23900(r0, r10, r9, r1)
            if (r9 == 0) goto Lb5
            int[] r9 = m23629(r9)
            r8.setMatchOrder(r9)
        Lb5:
            r0.recycle()
            return
    }

    public static /* synthetic */ Yue.AbstractC6398 access$000(Yue.AbstractC6398 r0) {
            Yue.ۥۢۢ۟ۧ r0 = r0.mCloneParent
            return r0
    }

    public static /* synthetic */ Yue.AbstractC6398 access$002(Yue.AbstractC6398 r0, Yue.AbstractC6398 r1) {
            r0.mCloneParent = r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m23623(Yue.C6448 r3, android.view.View r4, Yue.C6447 r5) {
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r0 = r3.f22711
            r0.put(r4, r5)
            int r5 = r4.getId()
            r0 = 0
            if (r5 < 0) goto L1f
            android.util.SparseArray<android.view.View> r1 = r3.f22712
            int r1 = r1.indexOfKey(r5)
            if (r1 < 0) goto L1a
            android.util.SparseArray<android.view.View> r1 = r3.f22712
            r1.put(r5, r0)
            goto L1f
        L1a:
            android.util.SparseArray<android.view.View> r1 = r3.f22712
            r1.put(r5, r4)
        L1f:
            java.lang.String r5 = Yue.C6794.m26164(r4)
            if (r5 == 0) goto L38
            Yue.ۥ۟ۡۨۡ<java.lang.String, android.view.View> r1 = r3.f22714
            boolean r1 = r1.containsKey(r5)
            if (r1 == 0) goto L33
            Yue.ۥ۟ۡۨۡ<java.lang.String, android.view.View> r1 = r3.f22714
            r1.put(r5, r0)
            goto L38
        L33:
            Yue.ۥ۟ۡۨۡ<java.lang.String, android.view.View> r1 = r3.f22714
            r1.put(r5, r4)
        L38:
            android.view.ViewParent r5 = r4.getParent()
            boolean r5 = r5 instanceof android.widget.ListView
            if (r5 == 0) goto L7d
            android.view.ViewParent r5 = r4.getParent()
            android.widget.ListView r5 = (android.widget.ListView) r5
            android.widget.ListAdapter r1 = r5.getAdapter()
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L7d
            int r1 = r5.getPositionForView(r4)
            long r1 = r5.getItemIdAtPosition(r1)
            Yue.ۥۣ۠ۨۢ<android.view.View> r5 = r3.f22713
            int r5 = r5.m15318(r1)
            if (r5 < 0) goto L74
            Yue.ۥۣ۠ۨۢ<android.view.View> r4 = r3.f22713
            java.lang.Object r4 = r4.m15316(r1)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L7d
            r5 = 0
            r4.setHasTransientState(r5)
            Yue.ۥۣ۠ۨۢ<android.view.View> r3 = r3.f22713
            r3.m15322(r1, r0)
            goto L7d
        L74:
            r5 = 1
            r4.setHasTransientState(r5)
            Yue.ۥۣ۠ۨۢ<android.view.View> r3 = r3.f22713
            r3.m15322(r1, r4)
        L7d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m23624(int[] r4, int r5) {
            r0 = r4[r5]
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r5) goto Lf
            r3 = r4[r2]
            if (r3 != r0) goto Lc
            r4 = 1
            return r4
        Lc:
            int r2 = r2 + 1
            goto L4
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static <T> java.util.ArrayList<T> m23625(java.util.ArrayList<T> r0, T r1, boolean r2) {
            if (r1 == 0) goto Ld
            if (r2 == 0) goto L9
            java.util.ArrayList r0 = Yue.AbstractC6398.C6403.m23643(r0, r1)
            goto Ld
        L9:
            java.util.ArrayList r0 = Yue.AbstractC6398.C6403.m23644(r0, r1)
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Yue.C0573<android.animation.Animator, Yue.AbstractC6398.C6402> m23626() {
            java.lang.ThreadLocal<Yue.ۥ۟ۡۨۡ<android.animation.Animator, Yue.ۥۢۢ۟ۧ$ۥ۟۟۟>> r0 = Yue.AbstractC6398.sRunningAnimators
            java.lang.Object r0 = r0.get()
            Yue.ۥ۟ۡۨۡ r0 = (Yue.C0573) r0
            if (r0 != 0) goto L14
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            java.lang.ThreadLocal<Yue.ۥ۟ۡۨۡ<android.animation.Animator, Yue.ۥۢۢ۟ۧ$ۥ۟۟۟>> r1 = Yue.AbstractC6398.sRunningAnimators
            r1.set(r0)
        L14:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m23627(int r2) {
            r0 = 1
            if (r2 < r0) goto L7
            r1 = 4
            if (r2 > r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m23628(Yue.C6447 r0, Yue.C6447 r1, java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f22708
            java.lang.Object r0 = r0.get(r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f22708
            java.lang.Object r1 = r1.get(r2)
            if (r0 != 0) goto L12
            if (r1 != 0) goto L12
            r0 = 0
            goto L1f
        L12:
            r2 = 1
            if (r0 == 0) goto L1e
            if (r1 != 0) goto L18
            goto L1e
        L18:
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ r2
            goto L1f
        L1e:
            r0 = r2
        L1f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static int[] m23629(java.lang.String r6) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = ","
            r0.<init>(r6, r1)
            int r6 = r0.countTokens()
            int[] r6 = new int[r6]
            r1 = 0
            r2 = r1
        Lf:
            boolean r3 = r0.hasMoreTokens()
            if (r3 == 0) goto L7b
            java.lang.String r3 = r0.nextToken()
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = "id"
            boolean r4 = r4.equalsIgnoreCase(r3)
            r5 = 1
            if (r4 == 0) goto L2a
            r3 = 3
            r6[r2] = r3
            goto L5d
        L2a:
            java.lang.String r4 = "instance"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L35
            r6[r2] = r5
            goto L5d
        L35:
            java.lang.String r4 = "name"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L41
            r3 = 2
            r6[r2] = r3
            goto L5d
        L41:
            java.lang.String r4 = "itemId"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 == 0) goto L4d
            r3 = 4
            r6[r2] = r3
            goto L5d
        L4d:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L5f
            int r3 = r6.length
            int r3 = r3 - r5
            int[] r3 = new int[r3]
            java.lang.System.arraycopy(r6, r1, r3, r1, r2)
            int r2 = r2 + (-1)
            r6 = r3
        L5d:
            int r2 = r2 + r5
            goto Lf
        L5f:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown match type in matchOrder: '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L7b:
            return r6
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 addListener(@Yue.InterfaceC4410 Yue.AbstractC6398.InterfaceC6408 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ> r0 = r1.mListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mListeners = r0
        Lb:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ> r0 = r1.mListeners
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 addTarget(@Yue.InterfaceC3214 int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        Lb:
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 addTarget(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 addTarget(@Yue.InterfaceC4410 java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTargetTypes = r0
        Lb:
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 addTarget(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTargetNames = r0
        Lb:
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            r0.add(r2)
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void animate(@Yue.InterfaceC4544 android.animation.Animator r5) {
            r4 = this;
            if (r5 != 0) goto L6
            r4.end()
            goto L43
        L6:
            long r0 = r4.getDuration()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L17
            long r0 = r4.getDuration()
            r5.setDuration(r0)
        L17:
            long r0 = r4.getStartDelay()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L2b
            long r0 = r4.getStartDelay()
            long r2 = r5.getStartDelay()
            long r0 = r0 + r2
            r5.setStartDelay(r0)
        L2b:
            android.animation.TimeInterpolator r0 = r4.getInterpolator()
            if (r0 == 0) goto L38
            android.animation.TimeInterpolator r0 = r4.getInterpolator()
            r5.setInterpolator(r0)
        L38:
            Yue.ۥۢۢ۟ۧ$ۥ۟۟ r0 = new Yue.ۥۢۢ۟ۧ$ۥ۟۟
            r0.<init>(r4)
            r5.addListener(r0)
            r5.start()
        L43:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void cancel() {
            r4 = this;
            java.util.ArrayList<android.animation.Animator> r0 = r4.mCurrentAnimators
            int r0 = r0.size()
            java.util.ArrayList<android.animation.Animator> r1 = r4.mCurrentAnimators
            android.animation.Animator[] r2 = r4.mAnimatorCache
            java.lang.Object[] r1 = r1.toArray(r2)
            android.animation.Animator[] r1 = (android.animation.Animator[]) r1
            android.animation.Animator[] r2 = Yue.AbstractC6398.EMPTY_ANIMATOR_ARRAY
            r4.mAnimatorCache = r2
            int r0 = r0 + (-1)
        L16:
            if (r0 < 0) goto L23
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            r2.cancel()
            int r0 = r0 + (-1)
            goto L16
        L23:
            r4.mAnimatorCache = r1
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r0 = Yue.AbstractC6398.InterfaceC6409.f22652
            r1 = 0
            r4.notifyListeners(r0, r1)
            return
    }

    public abstract void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r1);

    public void capturePropagationValues(Yue.C6447 r5) {
            r4 = this;
            Yue.ۥۢۢۡ r0 = r4.mPropagation
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f22708
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2c
            Yue.ۥۢۢۡ r0 = r4.mPropagation
            java.lang.String[] r0 = r0.mo23713()
            if (r0 != 0) goto L15
            return
        L15:
            r1 = 0
        L16:
            int r2 = r0.length
            if (r1 >= r2) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f22708
            r3 = r0[r1]
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L29
            Yue.ۥۢۢۡ r0 = r4.mPropagation
            r0.mo23712(r5)
            goto L2c
        L29:
            int r1 = r1 + 1
            goto L16
        L2c:
            return
    }

    public abstract void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r1);

    public void captureValues(@Yue.InterfaceC4410 android.view.ViewGroup r6, boolean r7) {
            r5 = this;
            r5.clearValues(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.mTargetIds
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L14
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            int r0 = r0.size()
            if (r0 <= 0) goto L29
        L14:
            java.util.ArrayList<java.lang.String> r0 = r5.mTargetNames
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
        L1e:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypes
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L29
            goto L2e
        L29:
            r5.m23631(r6, r7)
            goto La6
        L2e:
            r0 = r1
        L2f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.mTargetIds
            int r2 = r2.size()
            if (r0 >= r2) goto L6f
            java.util.ArrayList<java.lang.Integer> r2 = r5.mTargetIds
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L6c
            Yue.ۥۢۢۡۤ r3 = new Yue.ۥۢۢۡۤ
            r3.<init>(r2)
            if (r7 == 0) goto L54
            r5.captureStartValues(r3)
            goto L57
        L54:
            r5.captureEndValues(r3)
        L57:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r4 = r3.f22710
            r4.add(r5)
            r5.capturePropagationValues(r3)
            if (r7 == 0) goto L67
            Yue.ۥۢۢۡۥ r4 = r5.mStartValues
            m23623(r4, r2, r3)
            goto L6c
        L67:
            Yue.ۥۢۢۡۥ r4 = r5.mEndValues
            m23623(r4, r2, r3)
        L6c:
            int r0 = r0 + 1
            goto L2f
        L6f:
            r6 = r1
        L70:
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            int r0 = r0.size()
            if (r6 >= r0) goto La6
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            Yue.ۥۢۢۡۤ r2 = new Yue.ۥۢۢۡۤ
            r2.<init>(r0)
            if (r7 == 0) goto L8b
            r5.captureStartValues(r2)
            goto L8e
        L8b:
            r5.captureEndValues(r2)
        L8e:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r3 = r2.f22710
            r3.add(r5)
            r5.capturePropagationValues(r2)
            if (r7 == 0) goto L9e
            Yue.ۥۢۢۡۥ r3 = r5.mStartValues
            m23623(r3, r0, r2)
            goto La3
        L9e:
            Yue.ۥۢۢۡۥ r3 = r5.mEndValues
            m23623(r3, r0, r2)
        La3:
            int r6 = r6 + 1
            goto L70
        La6:
            if (r7 != 0) goto Lec
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.String> r6 = r5.mNameOverrides
            if (r6 == 0) goto Lec
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = r1
        Lb6:
            if (r0 >= r6) goto Ld0
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.String> r2 = r5.mNameOverrides
            java.lang.Object r2 = r2.keyAt(r0)
            java.lang.String r2 = (java.lang.String) r2
            Yue.ۥۢۢۡۥ r3 = r5.mStartValues
            Yue.ۥ۟ۡۨۡ<java.lang.String, android.view.View> r3 = r3.f22714
            java.lang.Object r2 = r3.remove(r2)
            android.view.View r2 = (android.view.View) r2
            r7.add(r2)
            int r0 = r0 + 1
            goto Lb6
        Ld0:
            if (r1 >= r6) goto Lec
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Le9
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.String> r2 = r5.mNameOverrides
            java.lang.Object r2 = r2.valueAt(r1)
            java.lang.String r2 = (java.lang.String) r2
            Yue.ۥۢۢۡۥ r3 = r5.mStartValues
            Yue.ۥ۟ۡۨۡ<java.lang.String, android.view.View> r3 = r3.f22714
            r3.put(r2, r0)
        Le9:
            int r1 = r1 + 1
            goto Ld0
        Lec:
            return
    }

    public void clearValues(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L18
            Yue.ۥۢۢۡۥ r1 = r0.mStartValues
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r1 = r1.f22711
            r1.clear()
            Yue.ۥۢۢۡۥ r1 = r0.mStartValues
            android.util.SparseArray<android.view.View> r1 = r1.f22712
            r1.clear()
            Yue.ۥۢۢۡۥ r1 = r0.mStartValues
            Yue.ۥۣ۠ۨۢ<android.view.View> r1 = r1.f22713
            r1.m15310()
            goto L2d
        L18:
            Yue.ۥۢۢۡۥ r1 = r0.mEndValues
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r1 = r1.f22711
            r1.clear()
            Yue.ۥۢۢۡۥ r1 = r0.mEndValues
            android.util.SparseArray<android.view.View> r1 = r1.f22712
            r1.clear()
            Yue.ۥۢۢۡۥ r1 = r0.mEndValues
            Yue.ۥۣ۠ۨۢ<android.view.View> r1 = r1.f22713
            r1.m15310()
        L2d:
            return
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L27
            Yue.ۥۢۢ۟ۧ r0 = (Yue.AbstractC6398) r0     // Catch: java.lang.CloneNotSupportedException -> L27
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L27
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mAnimators = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            Yue.ۥۢۢۡۥ r1 = new Yue.ۥۢۢۡۥ     // Catch: java.lang.CloneNotSupportedException -> L27
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mStartValues = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            Yue.ۥۢۢۡۥ r1 = new Yue.ۥۢۢۡۥ     // Catch: java.lang.CloneNotSupportedException -> L27
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mEndValues = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r1 = 0
            r0.mStartValuesList = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mEndValuesList = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mSeekController = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mCloneParent = r2     // Catch: java.lang.CloneNotSupportedException -> L27
            r0.mListeners = r1     // Catch: java.lang.CloneNotSupportedException -> L27
            return r0
        L27:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo23642clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥۢۢ۟ۧ r0 = r1.clone()
            return r0
    }

    @Yue.InterfaceC4544
    public android.animation.Animator createAnimator(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4544 Yue.C6447 r2, @Yue.InterfaceC4544 Yue.C6447 r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void createAnimators(@Yue.InterfaceC4410 android.view.ViewGroup r21, @Yue.InterfaceC4410 Yue.C6448 r22, @Yue.InterfaceC4410 Yue.C6448 r23, @Yue.InterfaceC4410 java.util.ArrayList<Yue.C6447> r24, @Yue.InterfaceC4410 java.util.ArrayList<Yue.C6447> r25) {
            r20 = this;
            r7 = r20
            r8 = r21
            Yue.ۥ۟ۡۨۡ r9 = m23626()
            android.util.SparseIntArray r10 = new android.util.SparseIntArray
            r10.<init>()
            int r11 = r24.size()
            Yue.ۥۢۢ۟ۧ r0 = r20.getRootTransition()
            Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟ r0 = r0.mSeekController
            if (r0 == 0) goto L1c
            r0 = 1
            r13 = r0
            goto L1d
        L1c:
            r13 = 0
        L1d:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = 0
        L23:
            if (r14 >= r11) goto L133
            r15 = r24
            java.lang.Object r2 = r15.get(r14)
            Yue.ۥۢۢۡۤ r2 = (Yue.C6447) r2
            r6 = r25
            java.lang.Object r3 = r6.get(r14)
            Yue.ۥۢۢۡۤ r3 = (Yue.C6447) r3
            if (r2 == 0) goto L40
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r5 = r2.f22710
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L40
            r2 = 0
        L40:
            if (r3 == 0) goto L4b
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r5 = r3.f22710
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L4b
            r3 = 0
        L4b:
            if (r2 != 0) goto L55
            if (r3 != 0) goto L55
        L4f:
            r17 = r11
            r18 = r14
            goto L12d
        L55:
            if (r2 == 0) goto L5f
            if (r3 == 0) goto L5f
            boolean r5 = r7.isTransitionRequired(r2, r3)
            if (r5 == 0) goto L4f
        L5f:
            android.animation.Animator r5 = r7.createAnimator(r8, r2, r3)
            if (r5 == 0) goto L4f
            if (r3 == 0) goto Le2
            android.view.View r4 = r3.f22709
            java.lang.String[] r12 = r20.getTransitionProperties()
            r16 = r5
            if (r12 == 0) goto Lda
            int r5 = r12.length
            if (r5 <= 0) goto Lda
            Yue.ۥۢۢۡۤ r5 = new Yue.ۥۢۢۡۤ
            r5.<init>(r4)
            r17 = r11
            r11 = r23
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r6 = r11.f22711
            java.lang.Object r6 = r6.get(r4)
            Yue.ۥۢۢۡۤ r6 = (Yue.C6447) r6
            if (r6 == 0) goto La3
            r11 = 0
        L88:
            int r15 = r12.length
            if (r11 >= r15) goto La3
            java.util.Map<java.lang.String, java.lang.Object> r15 = r5.f22708
            r18 = r14
            r14 = r12[r11]
            r19 = r12
            java.util.Map<java.lang.String, java.lang.Object> r12 = r6.f22708
            java.lang.Object r12 = r12.get(r14)
            r15.put(r14, r12)
            int r11 = r11 + 1
            r14 = r18
            r12 = r19
            goto L88
        La3:
            r18 = r14
            int r6 = r9.size()
            r11 = 0
        Laa:
            if (r11 >= r6) goto Ldf
            java.lang.Object r12 = r9.keyAt(r11)
            android.animation.Animator r12 = (android.animation.Animator) r12
            java.lang.Object r12 = r9.get(r12)
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ r12 = (Yue.AbstractC6398.C6402) r12
            Yue.ۥۢۢۡۤ r14 = r12.f22636
            if (r14 == 0) goto Ld7
            android.view.View r14 = r12.f22634
            if (r14 != r4) goto Ld7
            java.lang.String r14 = r12.f22635
            java.lang.String r15 = r20.getName()
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto Ld7
            Yue.ۥۢۢۡۤ r12 = r12.f22636
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto Ld7
            r16 = 0
            goto Ldf
        Ld7:
            int r11 = r11 + 1
            goto Laa
        Lda:
            r17 = r11
            r18 = r14
            r5 = 0
        Ldf:
            r11 = r16
            goto Led
        Le2:
            r16 = r5
            r17 = r11
            r18 = r14
            android.view.View r4 = r2.f22709
            r11 = r16
            r5 = 0
        Led:
            if (r11 == 0) goto L12d
            Yue.ۥۢۢۡ r6 = r7.mPropagation
            if (r6 == 0) goto L105
            long r2 = r6.mo5987(r8, r7, r2, r3)
            java.util.ArrayList<android.animation.Animator> r6 = r7.mAnimators
            int r6 = r6.size()
            int r12 = (int) r2
            r10.put(r6, r12)
            long r0 = java.lang.Math.min(r2, r0)
        L105:
            r14 = r0
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ r12 = new Yue.ۥۢۢ۟ۧ$ۥ۟۟۟
            java.lang.String r2 = r20.getName()
            android.view.WindowId r6 = r21.getWindowId()
            r0 = r12
            r1 = r4
            r3 = r20
            r4 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r13 == 0) goto L124
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.play(r11)
            r11 = r0
        L124:
            r9.put(r11, r12)
            java.util.ArrayList<android.animation.Animator> r0 = r7.mAnimators
            r0.add(r11)
            r0 = r14
        L12d:
            int r14 = r18 + 1
            r11 = r17
            goto L23
        L133:
            int r2 = r10.size()
            if (r2 == 0) goto L167
            r12 = 0
        L13a:
            int r2 = r10.size()
            if (r12 >= r2) goto L167
            int r2 = r10.keyAt(r12)
            java.util.ArrayList<android.animation.Animator> r3 = r7.mAnimators
            java.lang.Object r2 = r3.get(r2)
            android.animation.Animator r2 = (android.animation.Animator) r2
            java.lang.Object r2 = r9.get(r2)
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ r2 = (Yue.AbstractC6398.C6402) r2
            int r3 = r10.valueAt(r12)
            long r3 = (long) r3
            long r3 = r3 - r0
            android.animation.Animator r5 = r2.f22639
            long r5 = r5.getStartDelay()
            long r3 = r3 + r5
            android.animation.Animator r2 = r2.f22639
            r2.setStartDelay(r3)
            int r12 = r12 + 1
            goto L13a
        L167:
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(34)
    public Yue.InterfaceC6437 createSeekController() {
            r1 = this;
            Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟ r0 = new Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟
            r0.<init>(r1)
            r1.mSeekController = r0
            r1.addListener(r0)
            Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟ r0 = r1.mSeekController
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void end() {
            r4 = this;
            int r0 = r4.mNumInstances
            r1 = 1
            int r0 = r0 - r1
            r4.mNumInstances = r0
            if (r0 != 0) goto L4a
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r0 = Yue.AbstractC6398.InterfaceC6409.f22651
            r2 = 0
            r4.notifyListeners(r0, r2)
            r0 = r2
        Lf:
            Yue.ۥۢۢۡۥ r3 = r4.mStartValues
            Yue.ۥۣ۠ۨۢ<android.view.View> r3 = r3.f22713
            int r3 = r3.m15331()
            if (r0 >= r3) goto L2b
            Yue.ۥۢۢۡۥ r3 = r4.mStartValues
            Yue.ۥۣ۠ۨۢ<android.view.View> r3 = r3.f22713
            java.lang.Object r3 = r3.m15332(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L28
            r3.setHasTransientState(r2)
        L28:
            int r0 = r0 + 1
            goto Lf
        L2b:
            r0 = r2
        L2c:
            Yue.ۥۢۢۡۥ r3 = r4.mEndValues
            Yue.ۥۣ۠ۨۢ<android.view.View> r3 = r3.f22713
            int r3 = r3.m15331()
            if (r0 >= r3) goto L48
            Yue.ۥۢۢۡۥ r3 = r4.mEndValues
            Yue.ۥۣ۠ۨۢ<android.view.View> r3 = r3.f22713
            java.lang.Object r3 = r3.m15332(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L45
            r3.setHasTransientState(r2)
        L45:
            int r0 = r0 + 1
            goto L2c
        L48:
            r4.mEnded = r1
        L4a:
            return
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeChildren(@Yue.InterfaceC3214 int r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIdChildExcludes
            java.util.ArrayList r2 = r1.m23632(r0, r2, r3)
            r1.mTargetIdChildExcludes = r2
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeChildren(@Yue.InterfaceC4410 android.view.View r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargetChildExcludes
            java.util.ArrayList r2 = r1.m23634(r0, r2, r3)
            r1.mTargetChildExcludes = r2
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeChildren(@Yue.InterfaceC4410 java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypeChildExcludes
            java.util.ArrayList r2 = r1.m23633(r0, r2, r3)
            r1.mTargetTypeChildExcludes = r2
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(@Yue.InterfaceC3214 int r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIdExcludes
            java.util.ArrayList r2 = r1.m23632(r0, r2, r3)
            r1.mTargetIdExcludes = r2
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(@Yue.InterfaceC4410 android.view.View r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargetExcludes
            java.util.ArrayList r2 = r1.m23634(r0, r2, r3)
            r1.mTargetExcludes = r2
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(@Yue.InterfaceC4410 java.lang.Class<?> r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypeExcludes
            java.util.ArrayList r2 = r1.m23633(r0, r2, r3)
            r1.mTargetTypeExcludes = r2
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 excludeTarget(@Yue.InterfaceC4410 java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNameExcludes
            java.util.ArrayList r2 = m23625(r0, r2, r3)
            r1.mTargetNameExcludes = r2
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void forceToEnd(@Yue.InterfaceC4544 android.view.ViewGroup r5) {
            r4 = this;
            Yue.ۥ۟ۡۨۡ r0 = m23626()
            int r1 = r0.size()
            if (r5 == 0) goto L3b
            if (r1 != 0) goto Ld
            goto L3b
        Ld:
            android.view.WindowId r5 = r5.getWindowId()
            Yue.ۥ۟ۡۨۡ r2 = new Yue.ۥ۟ۡۨۡ
            r2.<init>(r0)
            r0.clear()
            int r1 = r1 + (-1)
        L1b:
            if (r1 < 0) goto L3b
            java.lang.Object r0 = r2.valueAt(r1)
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ r0 = (Yue.AbstractC6398.C6402) r0
            android.view.View r3 = r0.f22634
            if (r3 == 0) goto L38
            android.view.WindowId r0 = r0.f22637
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L38
            java.lang.Object r0 = r2.keyAt(r1)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.end()
        L38:
            int r1 = r1 + (-1)
            goto L1b
        L3b:
            return
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.mDuration
            return r0
    }

    @Yue.InterfaceC4544
    public android.graphics.Rect getEpicenter() {
            r1 = this;
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟۠ r0 = r1.mEpicenterCallback
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.graphics.Rect r0 = r0.mo12241(r1)
            return r0
    }

    @Yue.InterfaceC4544
    public Yue.AbstractC6398.AbstractC6404 getEpicenterCallback() {
            r1 = this;
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟۠ r0 = r1.mEpicenterCallback
            return r0
    }

    @Yue.InterfaceC4544
    public android.animation.TimeInterpolator getInterpolator() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.mInterpolator
            return r0
    }

    public Yue.C6447 getMatchedTransitionValues(android.view.View r6, boolean r7) {
            r5 = this;
            Yue.ۥۢۢۡۡ r0 = r5.mParent
            if (r0 == 0) goto L9
            Yue.ۥۢۢۡۤ r6 = r0.getMatchedTransitionValues(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r0 = r5.mStartValuesList
            goto L10
        Le:
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r0 = r5.mEndValuesList
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            Yue.ۥۢۢۡۤ r4 = (Yue.C6447) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f22709
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r6 = r5.mEndValuesList
            goto L36
        L34:
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r6 = r5.mStartValuesList
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            Yue.ۥۢۢۡۤ r1 = (Yue.C6447) r1
        L3d:
            return r1
    }

    @Yue.InterfaceC4410
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC4708 getPathMotion() {
            r1 = this;
            Yue.ۥۣۡۨۡ r0 = r1.mPathMotion
            return r0
    }

    @Yue.InterfaceC4544
    public Yue.AbstractC6435 getPropagation() {
            r1 = this;
            Yue.ۥۢۢۡ r0 = r1.mPropagation
            return r0
    }

    @Yue.InterfaceC4410
    public final Yue.AbstractC6398 getRootTransition() {
            r1 = this;
            Yue.ۥۢۢۡۡ r0 = r1.mParent
            if (r0 == 0) goto L9
            Yue.ۥۢۢ۟ۧ r0 = r0.getRootTransition()
            return r0
        L9:
            return r1
    }

    public long getStartDelay() {
            r2 = this;
            long r0 = r2.mStartDelay
            return r0
    }

    @Yue.InterfaceC4410
    public java.util.List<java.lang.Integer> getTargetIds() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            return r0
    }

    @Yue.InterfaceC4544
    public java.util.List<java.lang.String> getTargetNames() {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            return r0
    }

    @Yue.InterfaceC4544
    public java.util.List<java.lang.Class<?>> getTargetTypes() {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            return r0
    }

    @Yue.InterfaceC4410
    public java.util.List<android.view.View> getTargets() {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            return r0
    }

    public final long getTotalDurationMillis() {
            r2 = this;
            long r0 = r2.mTotalDuration
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4544
    public Yue.C6447 getTransitionValues(@Yue.InterfaceC4410 android.view.View r2, boolean r3) {
            r1 = this;
            Yue.ۥۢۢۡۡ r0 = r1.mParent
            if (r0 == 0) goto L9
            Yue.ۥۢۢۡۤ r2 = r0.getTransitionValues(r2, r3)
            return r2
        L9:
            if (r3 == 0) goto Le
            Yue.ۥۢۢۡۥ r3 = r1.mStartValues
            goto L10
        Le:
            Yue.ۥۢۢۡۥ r3 = r1.mEndValues
        L10:
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r3 = r3.f22711
            java.lang.Object r2 = r3.get(r2)
            Yue.ۥۢۢۡۤ r2 = (Yue.C6447) r2
            return r2
    }

    public boolean hasAnimators() {
            r1 = this;
            java.util.ArrayList<android.animation.Animator> r0 = r1.mCurrentAnimators
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isTransitionRequired(@Yue.InterfaceC4544 Yue.C6447 r7, @Yue.InterfaceC4544 Yue.C6447 r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L39
            if (r8 == 0) goto L39
            java.lang.String[] r1 = r6.getTransitionProperties()
            r2 = 1
            if (r1 == 0) goto L1c
            int r3 = r1.length
            r4 = r0
        Le:
            if (r4 >= r3) goto L39
            r5 = r1[r4]
            boolean r5 = m23628(r7, r8, r5)
            if (r5 == 0) goto L19
            goto L38
        L19:
            int r4 = r4 + 1
            goto Le
        L1c:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f22708
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = m23628(r7, r8, r3)
            if (r3 == 0) goto L26
        L38:
            r0 = r2
        L39:
            return r0
    }

    public boolean isValidTarget(android.view.View r6) {
            r5 = this;
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdExcludes
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.ArrayList<android.view.View> r1 = r5.mTargetExcludes
            if (r1 == 0) goto L1f
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L1f
            return r2
        L1f:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypeExcludes
            if (r1 == 0) goto L3c
            int r1 = r1.size()
            r3 = r2
        L28:
            if (r3 >= r1) goto L3c
            java.util.ArrayList<java.lang.Class<?>> r4 = r5.mTargetTypeExcludes
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L39
            return r2
        L39:
            int r3 = r3 + 1
            goto L28
        L3c:
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNameExcludes
            if (r1 == 0) goto L53
            java.lang.String r1 = Yue.C6794.m26164(r6)
            if (r1 == 0) goto L53
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNameExcludes
            java.lang.String r3 = Yue.C6794.m26164(r6)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L53
            return r2
        L53:
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIds
            int r1 = r1.size()
            r3 = 1
            if (r1 != 0) goto L79
            java.util.ArrayList<android.view.View> r1 = r5.mTargets
            int r1 = r1.size()
            if (r1 != 0) goto L79
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            if (r1 == 0) goto L6e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L79
        L6e:
            java.util.ArrayList<java.lang.String> r1 = r5.mTargetNames
            if (r1 == 0) goto L78
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L79
        L78:
            return r3
        L79:
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIds
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lbd
            java.util.ArrayList<android.view.View> r0 = r5.mTargets
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L8e
            goto Lbd
        L8e:
            java.util.ArrayList<java.lang.String> r0 = r5.mTargetNames
            if (r0 == 0) goto L9d
            java.lang.String r1 = Yue.C6794.m26164(r6)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L9d
            return r3
        L9d:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypes
            if (r0 == 0) goto Lbc
            r0 = r2
        La2:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            int r1 = r1.size()
            if (r0 >= r1) goto Lbc
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypes
            java.lang.Object r1 = r1.get(r0)
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r6)
            if (r1 == 0) goto Lb9
            return r3
        Lb9:
            int r0 = r0 + 1
            goto La2
        Lbc:
            return r2
        Lbd:
            return r3
    }

    public void notifyListeners(Yue.AbstractC6398.InterfaceC6409 r1, boolean r2) {
            r0 = this;
            r0.m23640(r0, r1, r2)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void pause(@Yue.InterfaceC4544 android.view.View r5) {
            r4 = this;
            boolean r5 = r4.mEnded
            if (r5 != 0) goto L31
            java.util.ArrayList<android.animation.Animator> r5 = r4.mCurrentAnimators
            int r5 = r5.size()
            java.util.ArrayList<android.animation.Animator> r0 = r4.mCurrentAnimators
            android.animation.Animator[] r1 = r4.mAnimatorCache
            java.lang.Object[] r0 = r0.toArray(r1)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            android.animation.Animator[] r1 = Yue.AbstractC6398.EMPTY_ANIMATOR_ARRAY
            r4.mAnimatorCache = r1
            r1 = 1
            int r5 = r5 - r1
        L1a:
            if (r5 < 0) goto L27
            r2 = r0[r5]
            r3 = 0
            r0[r5] = r3
            r2.pause()
            int r5 = r5 + (-1)
            goto L1a
        L27:
            r4.mAnimatorCache = r0
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r5 = Yue.AbstractC6398.InterfaceC6409.f22653
            r0 = 0
            r4.notifyListeners(r5, r0)
            r4.mPaused = r1
        L31:
            return
    }

    public void playTransition(@Yue.InterfaceC4410 android.view.ViewGroup r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mStartValuesList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mEndValuesList = r0
            Yue.ۥۢۢۡۥ r0 = r10.mStartValues
            Yue.ۥۢۢۡۥ r1 = r10.mEndValues
            r10.m23639(r0, r1)
            Yue.ۥ۟ۡۨۡ r0 = m23626()
            int r1 = r0.size()
            android.view.WindowId r2 = r11.getWindowId()
            r3 = 1
            int r1 = r1 - r3
        L23:
            if (r1 < 0) goto Laf
            java.lang.Object r4 = r0.keyAt(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto Lab
            java.lang.Object r5 = r0.get(r4)
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ r5 = (Yue.AbstractC6398.C6402) r5
            if (r5 == 0) goto Lab
            android.view.View r6 = r5.f22634
            if (r6 == 0) goto Lab
            android.view.WindowId r6 = r5.f22637
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Lab
            Yue.ۥۢۢۡۤ r6 = r5.f22636
            android.view.View r7 = r5.f22634
            Yue.ۥۢۢۡۤ r8 = r10.getTransitionValues(r7, r3)
            Yue.ۥۢۢۡۤ r9 = r10.getMatchedTransitionValues(r7, r3)
            if (r8 != 0) goto L5c
            if (r9 != 0) goto L5c
            Yue.ۥۢۢۡۥ r9 = r10.mEndValues
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r9 = r9.f22711
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            Yue.ۥۢۢۡۤ r9 = (Yue.C6447) r9
        L5c:
            if (r8 != 0) goto L60
            if (r9 == 0) goto Lab
        L60:
            Yue.ۥۢۢ۟ۧ r7 = r5.f22638
            boolean r6 = r7.isTransitionRequired(r6, r9)
            if (r6 == 0) goto Lab
            Yue.ۥۢۢ۟ۧ r5 = r5.f22638
            Yue.ۥۢۢ۟ۧ r6 = r5.getRootTransition()
            Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟ r6 = r6.mSeekController
            if (r6 == 0) goto L97
            r4.cancel()
            java.util.ArrayList<android.animation.Animator> r6 = r5.mCurrentAnimators
            r6.remove(r4)
            r0.remove(r4)
            java.util.ArrayList<android.animation.Animator> r4 = r5.mCurrentAnimators
            int r4 = r4.size()
            if (r4 != 0) goto Lab
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r4 = Yue.AbstractC6398.InterfaceC6409.f22652
            r6 = 0
            r5.notifyListeners(r4, r6)
            boolean r4 = r5.mEnded
            if (r4 != 0) goto Lab
            r5.mEnded = r3
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r4 = Yue.AbstractC6398.InterfaceC6409.f22651
            r5.notifyListeners(r4, r6)
            goto Lab
        L97:
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto La8
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto La4
            goto La8
        La4:
            r0.remove(r4)
            goto Lab
        La8:
            r4.cancel()
        Lab:
            int r1 = r1 + (-1)
            goto L23
        Laf:
            Yue.ۥۢۢۡۥ r6 = r10.mStartValues
            Yue.ۥۢۢۡۥ r7 = r10.mEndValues
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r8 = r10.mStartValuesList
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r9 = r10.mEndValuesList
            r4 = r10
            r5 = r11
            r4.createAnimators(r5, r6, r7, r8, r9)
            Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟ r11 = r10.mSeekController
            if (r11 != 0) goto Lc4
            r10.runAnimators()
            goto Ld7
        Lc4:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r11 < r0) goto Ld7
            r10.prepareAnimatorsForSeeking()
            Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟ r11 = r10.mSeekController
            r11.m23662()
            Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟ r11 = r10.mSeekController
            r11.m23664()
        Ld7:
            return
    }

    @Yue.InterfaceC5336(34)
    public void prepareAnimatorsForSeeking() {
            r11 = this;
            Yue.ۥ۟ۡۨۡ r0 = m23626()
            r1 = 0
            r11.mTotalDuration = r1
            r3 = 0
        L9:
            java.util.ArrayList<android.animation.Animator> r4 = r11.mAnimators
            int r4 = r4.size()
            if (r3 >= r4) goto L6f
            java.util.ArrayList<android.animation.Animator> r4 = r11.mAnimators
            java.lang.Object r4 = r4.get(r3)
            android.animation.Animator r4 = (android.animation.Animator) r4
            java.lang.Object r5 = r0.get(r4)
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ r5 = (Yue.AbstractC6398.C6402) r5
            if (r4 == 0) goto L6c
            if (r5 == 0) goto L6c
            long r6 = r11.getDuration()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 < 0) goto L34
            android.animation.Animator r6 = r5.f22639
            long r7 = r11.getDuration()
            r6.setDuration(r7)
        L34:
            long r6 = r11.getStartDelay()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 < 0) goto L4c
            android.animation.Animator r6 = r5.f22639
            long r7 = r11.getStartDelay()
            android.animation.Animator r9 = r5.f22639
            long r9 = r9.getStartDelay()
            long r7 = r7 + r9
            r6.setStartDelay(r7)
        L4c:
            android.animation.TimeInterpolator r6 = r11.getInterpolator()
            if (r6 == 0) goto L5b
            android.animation.Animator r5 = r5.f22639
            android.animation.TimeInterpolator r6 = r11.getInterpolator()
            r5.setInterpolator(r6)
        L5b:
            java.util.ArrayList<android.animation.Animator> r5 = r11.mCurrentAnimators
            r5.add(r4)
            long r5 = r11.mTotalDuration
            long r7 = Yue.AbstractC6398.C6405.m23645(r4)
            long r4 = java.lang.Math.max(r5, r7)
            r11.mTotalDuration = r4
        L6c:
            int r3 = r3 + 1
            goto L9
        L6f:
            java.util.ArrayList<android.animation.Animator> r0 = r11.mAnimators
            r0.clear()
            return
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 removeListener(@Yue.InterfaceC4410 Yue.AbstractC6398.InterfaceC6408 r2) {
            r1 = this;
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ> r0 = r1.mListeners
            if (r0 != 0) goto L5
            return r1
        L5:
            boolean r0 = r0.remove(r2)
            if (r0 != 0) goto L12
            Yue.ۥۢۢ۟ۧ r0 = r1.mCloneParent
            if (r0 == 0) goto L12
            r0.removeListener(r2)
        L12:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ> r2 = r1.mListeners
            int r2 = r2.size()
            if (r2 != 0) goto L1d
            r2 = 0
            r1.mListeners = r2
        L1d:
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 removeTarget(@Yue.InterfaceC3214 int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            java.util.ArrayList<java.lang.Integer> r0 = r1.mTargetIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
        Lb:
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 removeTarget(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            java.util.ArrayList<android.view.View> r0 = r1.mTargets
            r0.remove(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 removeTarget(@Yue.InterfaceC4410 java.lang.Class<?> r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Class<?>> r0 = r1.mTargetTypes
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return r1
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 removeTarget(@Yue.InterfaceC4410 java.lang.String r2) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.mTargetNames
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void resume(@Yue.InterfaceC4544 android.view.View r5) {
            r4 = this;
            boolean r5 = r4.mPaused
            if (r5 == 0) goto L35
            boolean r5 = r4.mEnded
            r0 = 0
            if (r5 != 0) goto L33
            java.util.ArrayList<android.animation.Animator> r5 = r4.mCurrentAnimators
            int r5 = r5.size()
            java.util.ArrayList<android.animation.Animator> r1 = r4.mCurrentAnimators
            android.animation.Animator[] r2 = r4.mAnimatorCache
            java.lang.Object[] r1 = r1.toArray(r2)
            android.animation.Animator[] r1 = (android.animation.Animator[]) r1
            android.animation.Animator[] r2 = Yue.AbstractC6398.EMPTY_ANIMATOR_ARRAY
            r4.mAnimatorCache = r2
            int r5 = r5 + (-1)
        L1f:
            if (r5 < 0) goto L2c
            r2 = r1[r5]
            r3 = 0
            r1[r5] = r3
            r2.resume()
            int r5 = r5 + (-1)
            goto L1f
        L2c:
            r4.mAnimatorCache = r1
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r5 = Yue.AbstractC6398.InterfaceC6409.f22654
            r4.notifyListeners(r5, r0)
        L33:
            r4.mPaused = r0
        L35:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void runAnimators() {
            r4 = this;
            r4.start()
            Yue.ۥ۟ۡۨۡ r0 = m23626()
            java.util.ArrayList<android.animation.Animator> r1 = r4.mAnimators
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            android.animation.Animator r2 = (android.animation.Animator) r2
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto Ld
            r4.start()
            r4.m23641(r2, r0)
            goto Ld
        L26:
            java.util.ArrayList<android.animation.Animator> r0 = r4.mAnimators
            r0.clear()
            r4.end()
            return
    }

    public void setCanRemoveViews(boolean r1) {
            r0 = this;
            r0.mCanRemoveViews = r1
            return
    }

    @Yue.InterfaceC5336(34)
    public void setCurrentPlayTimeMillis(long r19, long r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            long r3 = r18.getTotalDurationMillis()
            int r5 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 >= 0) goto L10
            r5 = r7
            goto L11
        L10:
            r5 = r6
        L11:
            r8 = 0
            int r10 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r10 >= 0) goto L1b
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 >= 0) goto L23
        L1b:
            int r11 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r11 <= 0) goto L2a
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 > 0) goto L2a
        L23:
            r0.mEnded = r6
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r11 = Yue.AbstractC6398.InterfaceC6409.f22650
            r0.notifyListeners(r11, r5)
        L2a:
            java.util.ArrayList<android.animation.Animator> r11 = r0.mCurrentAnimators
            int r11 = r11.size()
            java.util.ArrayList<android.animation.Animator> r12 = r0.mCurrentAnimators
            android.animation.Animator[] r13 = r0.mAnimatorCache
            java.lang.Object[] r12 = r12.toArray(r13)
            android.animation.Animator[] r12 = (android.animation.Animator[]) r12
            android.animation.Animator[] r13 = Yue.AbstractC6398.EMPTY_ANIMATOR_ARRAY
            r0.mAnimatorCache = r13
        L3e:
            if (r6 >= r11) goto L5f
            r13 = r12[r6]
            r14 = 0
            r12[r6] = r14
            long r14 = Yue.AbstractC6398.C6405.m23645(r13)
            r16 = r10
            r17 = r11
            long r10 = java.lang.Math.max(r8, r1)
            long r10 = java.lang.Math.min(r10, r14)
            Yue.AbstractC6398.C6405.m23646(r13, r10)
            int r6 = r6 + 1
            r10 = r16
            r11 = r17
            goto L3e
        L5f:
            r16 = r10
            r0.mAnimatorCache = r12
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L6b
            int r3 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r3 <= 0) goto L71
        L6b:
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L7a
            if (r16 < 0) goto L7a
        L71:
            if (r6 <= 0) goto L75
            r0.mEnded = r7
        L75:
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r1 = Yue.AbstractC6398.InterfaceC6409.f22651
            r0.notifyListeners(r1, r5)
        L7a:
            return
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 setDuration(long r1) {
            r0 = this;
            r0.mDuration = r1
            return r0
    }

    public void setEpicenterCallback(@Yue.InterfaceC4544 Yue.AbstractC6398.AbstractC6404 r1) {
            r0 = this;
            r0.mEpicenterCallback = r1
            return
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 setInterpolator(@Yue.InterfaceC4544 android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.mInterpolator = r1
            return r0
    }

    public void setMatchOrder(@Yue.InterfaceC4544 int... r3) {
            r2 = this;
            if (r3 == 0) goto L34
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L34
        L6:
            r0 = 0
        L7:
            int r1 = r3.length
            if (r0 >= r1) goto L2b
            r1 = r3[r0]
            boolean r1 = m23627(r1)
            if (r1 == 0) goto L23
            boolean r1 = m23624(r3, r0)
            if (r1 != 0) goto L1b
            int r0 = r0 + 1
            goto L7
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "matches contains a duplicate value"
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "matches contains invalid value"
            r3.<init>(r0)
            throw r3
        L2b:
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            r2.mMatchOrder = r3
            goto L38
        L34:
            int[] r3 = Yue.AbstractC6398.DEFAULT_MATCH_ORDER
            r2.mMatchOrder = r3
        L38:
            return
    }

    public void setPathMotion(@Yue.InterfaceC4544 Yue.AbstractC4708 r1) {
            r0 = this;
            if (r1 != 0) goto L7
            Yue.ۥۣۡۨۡ r1 = Yue.AbstractC6398.STRAIGHT_PATH_MOTION
            r0.mPathMotion = r1
            goto L9
        L7:
            r0.mPathMotion = r1
        L9:
            return
    }

    public void setPropagation(@Yue.InterfaceC4544 Yue.AbstractC6435 r1) {
            r0 = this;
            r0.mPropagation = r1
            return
    }

    @Yue.InterfaceC4410
    public Yue.AbstractC6398 setStartDelay(long r1) {
            r0 = this;
            r0.mStartDelay = r1
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void start() {
            r2 = this;
            int r0 = r2.mNumInstances
            if (r0 != 0) goto Lc
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ r0 = Yue.AbstractC6398.InterfaceC6409.f22650
            r1 = 0
            r2.notifyListeners(r0, r1)
            r2.mEnded = r1
        Lc:
            int r0 = r2.mNumInstances
            int r0 = r0 + 1
            r2.mNumInstances = r0
            return
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    public java.lang.String toString(java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r0.append(r8)
            java.lang.String r8 = "@"
            r0.append(r8)
            int r8 = r7.hashCode()
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r0.append(r8)
            java.lang.String r8 = ": "
            r0.append(r8)
            long r1 = r7.mDuration
            r3 = -1
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r1 = ") "
            if (r8 == 0) goto L3c
            java.lang.String r8 = "dur("
            r0.append(r8)
            long r5 = r7.mDuration
            r0.append(r5)
            r0.append(r1)
        L3c:
            long r5 = r7.mStartDelay
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L4f
            java.lang.String r8 = "dly("
            r0.append(r8)
            long r2 = r7.mStartDelay
            r0.append(r2)
            r0.append(r1)
        L4f:
            android.animation.TimeInterpolator r8 = r7.mInterpolator
            if (r8 == 0) goto L60
            java.lang.String r8 = "interp("
            r0.append(r8)
            android.animation.TimeInterpolator r8 = r7.mInterpolator
            r0.append(r8)
            r0.append(r1)
        L60:
            java.util.ArrayList<java.lang.Integer> r8 = r7.mTargetIds
            int r8 = r8.size()
            if (r8 > 0) goto L70
            java.util.ArrayList<android.view.View> r8 = r7.mTargets
            int r8 = r8.size()
            if (r8 <= 0) goto Lc0
        L70:
            java.lang.String r8 = "tgts("
            r0.append(r8)
            java.util.ArrayList<java.lang.Integer> r8 = r7.mTargetIds
            int r8 = r8.size()
            java.lang.String r1 = ", "
            r2 = 0
            if (r8 <= 0) goto L9a
            r8 = r2
        L81:
            java.util.ArrayList<java.lang.Integer> r3 = r7.mTargetIds
            int r3 = r3.size()
            if (r8 >= r3) goto L9a
            if (r8 <= 0) goto L8e
            r0.append(r1)
        L8e:
            java.util.ArrayList<java.lang.Integer> r3 = r7.mTargetIds
            java.lang.Object r3 = r3.get(r8)
            r0.append(r3)
            int r8 = r8 + 1
            goto L81
        L9a:
            java.util.ArrayList<android.view.View> r8 = r7.mTargets
            int r8 = r8.size()
            if (r8 <= 0) goto Lbb
        La2:
            java.util.ArrayList<android.view.View> r8 = r7.mTargets
            int r8 = r8.size()
            if (r2 >= r8) goto Lbb
            if (r2 <= 0) goto Laf
            r0.append(r1)
        Laf:
            java.util.ArrayList<android.view.View> r8 = r7.mTargets
            java.lang.Object r8 = r8.get(r2)
            r0.append(r8)
            int r2 = r2 + 1
            goto La2
        Lbb:
            java.lang.String r8 = ")"
            r0.append(r8)
        Lc0:
            java.lang.String r8 = r0.toString()
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m23630(Yue.C0573<android.view.View, Yue.C6447> r6, Yue.C0573<android.view.View, Yue.C6447> r7) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            r3 = 0
            if (r1 >= r2) goto L24
            java.lang.Object r2 = r6.valueAt(r1)
            Yue.ۥۢۢۡۤ r2 = (Yue.C6447) r2
            android.view.View r4 = r2.f22709
            boolean r4 = r5.isValidTarget(r4)
            if (r4 == 0) goto L21
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r4 = r5.mStartValuesList
            r4.add(r2)
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r2 = r5.mEndValuesList
            r2.add(r3)
        L21:
            int r1 = r1 + 1
            goto L2
        L24:
            int r6 = r7.size()
            if (r0 >= r6) goto L45
            java.lang.Object r6 = r7.valueAt(r0)
            Yue.ۥۢۢۡۤ r6 = (Yue.C6447) r6
            android.view.View r1 = r6.f22709
            boolean r1 = r5.isValidTarget(r1)
            if (r1 == 0) goto L42
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r1 = r5.mEndValuesList
            r1.add(r6)
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r6 = r5.mStartValuesList
            r6.add(r3)
        L42:
            int r0 = r0 + 1
            goto L24
        L45:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m23631(android.view.View r6, boolean r7) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r6.getId()
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdExcludes
            if (r1 == 0) goto L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L16
            return
        L16:
            java.util.ArrayList<android.view.View> r1 = r5.mTargetExcludes
            if (r1 == 0) goto L21
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L21
            return
        L21:
            java.util.ArrayList<java.lang.Class<?>> r1 = r5.mTargetTypeExcludes
            r2 = 0
            if (r1 == 0) goto L3f
            int r1 = r1.size()
            r3 = r2
        L2b:
            if (r3 >= r1) goto L3f
            java.util.ArrayList<java.lang.Class<?>> r4 = r5.mTargetTypeExcludes
            java.lang.Object r4 = r4.get(r3)
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L3c
            return
        L3c:
            int r3 = r3 + 1
            goto L2b
        L3f:
            android.view.ViewParent r1 = r6.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L6a
            Yue.ۥۢۢۡۤ r1 = new Yue.ۥۢۢۡۤ
            r1.<init>(r6)
            if (r7 == 0) goto L52
            r5.captureStartValues(r1)
            goto L55
        L52:
            r5.captureEndValues(r1)
        L55:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ> r3 = r1.f22710
            r3.add(r5)
            r5.capturePropagationValues(r1)
            if (r7 == 0) goto L65
            Yue.ۥۢۢۡۥ r3 = r5.mStartValues
            m23623(r3, r6, r1)
            goto L6a
        L65:
            Yue.ۥۢۢۡۥ r3 = r5.mEndValues
            m23623(r3, r6, r1)
        L6a:
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lb7
            java.util.ArrayList<java.lang.Integer> r1 = r5.mTargetIdChildExcludes
            if (r1 == 0) goto L7d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L7d
            return
        L7d:
            java.util.ArrayList<android.view.View> r0 = r5.mTargetChildExcludes
            if (r0 == 0) goto L88
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L88
            return
        L88:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.mTargetTypeChildExcludes
            if (r0 == 0) goto La5
            int r0 = r0.size()
            r1 = r2
        L91:
            if (r1 >= r0) goto La5
            java.util.ArrayList<java.lang.Class<?>> r3 = r5.mTargetTypeChildExcludes
            java.lang.Object r3 = r3.get(r1)
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isInstance(r6)
            if (r3 == 0) goto La2
            return
        La2:
            int r1 = r1 + 1
            goto L91
        La5:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        La7:
            int r0 = r6.getChildCount()
            if (r2 >= r0) goto Lb7
            android.view.View r0 = r6.getChildAt(r2)
            r5.m23631(r0, r7)
            int r2 = r2 + 1
            goto La7
        Lb7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.ArrayList<java.lang.Integer> m23632(java.util.ArrayList<java.lang.Integer> r1, int r2, boolean r3) {
            r0 = this;
            if (r2 <= 0) goto L15
            if (r3 == 0) goto Ld
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r1 = Yue.AbstractC6398.C6403.m23643(r1, r2)
            goto L15
        Ld:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r1 = Yue.AbstractC6398.C6403.m23644(r1, r2)
        L15:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.util.ArrayList<java.lang.Class<?>> m23633(java.util.ArrayList<java.lang.Class<?>> r1, java.lang.Class<?> r2, boolean r3) {
            r0 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = Yue.AbstractC6398.C6403.m23643(r1, r2)
            goto Ld
        L9:
            java.util.ArrayList r1 = Yue.AbstractC6398.C6403.m23644(r1, r2)
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.util.ArrayList<android.view.View> m23634(java.util.ArrayList<android.view.View> r1, android.view.View r2, boolean r3) {
            r0 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = Yue.AbstractC6398.C6403.m23643(r1, r2)
            goto Ld
        L9:
            java.util.ArrayList r1 = Yue.AbstractC6398.C6403.m23644(r1, r2)
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m23635(Yue.C0573<android.view.View, Yue.C6447> r8, Yue.C0573<android.view.View, Yue.C6447> r9, android.util.SparseArray<android.view.View> r10, android.util.SparseArray<android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            int r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            Yue.ۥۢۢۡۤ r4 = (Yue.C6447) r4
            java.lang.Object r5 = r9.get(r3)
            Yue.ۥۢۢۡۤ r5 = (Yue.C6447) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m23636(Yue.C0573<android.view.View, Yue.C6447> r5, Yue.C0573<android.view.View, Yue.C6447> r6) {
            r4 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L39
            java.lang.Object r1 = r5.keyAt(r0)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L36
            boolean r2 = r4.isValidTarget(r1)
            if (r2 == 0) goto L36
            java.lang.Object r1 = r6.remove(r1)
            Yue.ۥۢۢۡۤ r1 = (Yue.C6447) r1
            if (r1 == 0) goto L36
            android.view.View r2 = r1.f22709
            boolean r2 = r4.isValidTarget(r2)
            if (r2 == 0) goto L36
            java.lang.Object r2 = r5.removeAt(r0)
            Yue.ۥۢۢۡۤ r2 = (Yue.C6447) r2
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r3 = r4.mStartValuesList
            r3.add(r2)
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r2 = r4.mEndValuesList
            r2.add(r1)
        L36:
            int r0 = r0 + (-1)
            goto L6
        L39:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m23637(Yue.C0573<android.view.View, Yue.C6447> r8, Yue.C0573<android.view.View, Yue.C6447> r9, Yue.C3827<android.view.View> r10, Yue.C3827<android.view.View> r11) {
            r7 = this;
            int r0 = r10.m15331()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.m15332(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            long r3 = r10.m15321(r1)
            java.lang.Object r3 = r11.m15316(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            Yue.ۥۢۢۡۤ r4 = (Yue.C6447) r4
            java.lang.Object r5 = r9.get(r3)
            Yue.ۥۢۢۡۤ r5 = (Yue.C6447) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m23638(Yue.C0573<android.view.View, Yue.C6447> r8, Yue.C0573<android.view.View, Yue.C6447> r9, Yue.C0573<java.lang.String, android.view.View> r10, Yue.C0573<java.lang.String, android.view.View> r11) {
            r7 = this;
            int r0 = r10.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r10.valueAt(r1)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L47
            boolean r3 = r7.isValidTarget(r2)
            if (r3 == 0) goto L47
            java.lang.Object r3 = r10.keyAt(r1)
            java.lang.Object r3 = r11.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L47
            boolean r4 = r7.isValidTarget(r3)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r8.get(r2)
            Yue.ۥۢۢۡۤ r4 = (Yue.C6447) r4
            java.lang.Object r5 = r9.get(r3)
            Yue.ۥۢۢۡۤ r5 = (Yue.C6447) r5
            if (r4 == 0) goto L47
            if (r5 == 0) goto L47
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r6 = r7.mStartValuesList
            r6.add(r4)
            java.util.ArrayList<Yue.ۥۢۢۡۤ> r4 = r7.mEndValuesList
            r4.add(r5)
            r8.remove(r2)
            r9.remove(r3)
        L47:
            int r1 = r1 + 1
            goto L5
        L4a:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m23639(Yue.C6448 r6, Yue.C6448 r7) {
            r5 = this;
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r1 = r6.f22711
            r0.<init>(r1)
            Yue.ۥ۟ۡۨۡ r1 = new Yue.ۥ۟ۡۨۡ
            Yue.ۥ۟ۡۨۡ<android.view.View, Yue.ۥۢۢۡۤ> r2 = r7.f22711
            r1.<init>(r2)
            r2 = 0
        Lf:
            int[] r3 = r5.mMatchOrder
            int r4 = r3.length
            if (r2 >= r4) goto L41
            r3 = r3[r2]
            r4 = 1
            if (r3 == r4) goto L3b
            r4 = 2
            if (r3 == r4) goto L33
            r4 = 3
            if (r3 == r4) goto L2b
            r4 = 4
            if (r3 == r4) goto L23
            goto L3e
        L23:
            Yue.ۥۣ۠ۨۢ<android.view.View> r3 = r6.f22713
            Yue.ۥۣ۠ۨۢ<android.view.View> r4 = r7.f22713
            r5.m23637(r0, r1, r3, r4)
            goto L3e
        L2b:
            android.util.SparseArray<android.view.View> r3 = r6.f22712
            android.util.SparseArray<android.view.View> r4 = r7.f22712
            r5.m23635(r0, r1, r3, r4)
            goto L3e
        L33:
            Yue.ۥ۟ۡۨۡ<java.lang.String, android.view.View> r3 = r6.f22714
            Yue.ۥ۟ۡۨۡ<java.lang.String, android.view.View> r4 = r7.f22714
            r5.m23638(r0, r1, r3, r4)
            goto L3e
        L3b:
            r5.m23636(r0, r1)
        L3e:
            int r2 = r2 + 1
            goto Lf
        L41:
            r5.m23630(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m23640(Yue.AbstractC6398 r6, Yue.AbstractC6398.InterfaceC6409 r7, boolean r8) {
            r5 = this;
            Yue.ۥۢۢ۟ۧ r0 = r5.mCloneParent
            if (r0 == 0) goto L7
            r0.m23640(r6, r7, r8)
        L7:
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ> r0 = r5.mListeners
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ> r0 = r5.mListeners
            int r0 = r0.size()
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ[] r1 = r5.mListenersCache
            if (r1 != 0) goto L1d
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ[] r1 = new Yue.AbstractC6398.InterfaceC6408[r0]
        L1d:
            r2 = 0
            r5.mListenersCache = r2
            java.util.ArrayList<Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ> r3 = r5.mListeners
            java.lang.Object[] r1 = r3.toArray(r1)
            Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ[] r1 = (Yue.AbstractC6398.InterfaceC6408[]) r1
            r3 = 0
        L29:
            if (r3 >= r0) goto L35
            r4 = r1[r3]
            r7.mo23672(r4, r6, r8)
            r1[r3] = r2
            int r3 = r3 + 1
            goto L29
        L35:
            r5.mListenersCache = r1
        L37:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m23641(android.animation.Animator r2, Yue.C0573<android.animation.Animator, Yue.AbstractC6398.C6402> r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            Yue.ۥۢۢ۟ۧ$ۥ۟ r0 = new Yue.ۥۢۢ۟ۧ$ۥ۟
            r0.<init>(r1, r3)
            r2.addListener(r0)
            r1.animate(r2)
        Ld:
            return
    }
}
