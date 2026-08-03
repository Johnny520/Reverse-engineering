package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7741 extends androidx.recyclerview.widget.AbstractC7799 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final boolean f29797 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static android.animation.TimeInterpolator f29798;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29799;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29800;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.C7741.C7751> f29801;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.C7741.C7750> f29802;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716>> f29803;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.C7741.C7751>> f29804;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.C7741.C7750>> f29805;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29806;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29807;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29808;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29809;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
    public class RunnableC7742 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f29810;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29811;

        public RunnableC7742(androidx.recyclerview.widget.C7741 r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f29811 = r1
                r0.f29810 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.util.ArrayList r0 = r8.f29810
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ r1 = (androidx.recyclerview.widget.C7741.C7751) r1
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r8.f29811
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r1.f29844
                int r4 = r1.f29845
                int r5 = r1.f29846
                int r6 = r1.f29847
                int r7 = r1.f29848
                r2.m30076(r3, r4, r5, r6, r7)
                goto L6
            L22:
                java.util.ArrayList r0 = r8.f29810
                r0.clear()
                androidx.recyclerview.widget.ۥ۟۟۟۠ r0 = r8.f29811
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r0 = r0.f29804
                java.util.ArrayList r1 = r8.f29810
                r0.remove(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟, reason: contains not printable characters */
    public class RunnableC7743 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f29812;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29813;

        public RunnableC7743(androidx.recyclerview.widget.C7741 r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f29813 = r1
                r0.f29812 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.ArrayList r0 = r3.f29812
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r1 = (androidx.recyclerview.widget.C7741.C7750) r1
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r3.f29813
                r2.m30075(r1)
                goto L6
            L18:
                java.util.ArrayList r0 = r3.f29812
                r0.clear()
                androidx.recyclerview.widget.ۥ۟۟۟۠ r0 = r3.f29813
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r0 = r0.f29805
                java.util.ArrayList r1 = r3.f29812
                r0.remove(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC7744 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.ArrayList f29814;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29815;

        public RunnableC7744(androidx.recyclerview.widget.C7741 r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f29815 = r1
                r0.f29814 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.ArrayList r0 = r3.f29814
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r1
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r3.f29815
                r2.m30074(r1)
                goto L6
            L18:
                java.util.ArrayList r0 = r3.f29814
                r0.clear()
                androidx.recyclerview.widget.ۥ۟۟۟۠ r0 = r3.f29815
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r0 = r0.f29803
                java.util.ArrayList r1 = r3.f29814
                r0.remove(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
    public class C7745 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC7716 f29816;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewPropertyAnimator f29817;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29818;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29819;

        public C7745(androidx.recyclerview.widget.C7741 r1, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
                r0 = this;
                r0.f29819 = r1
                r0.f29816 = r2
                r0.f29817 = r3
                r0.f29818 = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewPropertyAnimator r2 = r1.f29817
                r0 = 0
                r2.setListener(r0)
                android.view.View r2 = r1.f29818
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29819
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29816
                r2.m30276(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29819
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r2.f29808
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29816
                r2.remove(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29819
                r2.m30079()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29819
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29816
                r2.m30277(r0)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7746 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC7716 f29820;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29821;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewPropertyAnimator f29822;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29823;

        public C7746(androidx.recyclerview.widget.C7741 r1, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, android.view.View r3, android.view.ViewPropertyAnimator r4) {
                r0 = this;
                r0.f29823 = r1
                r0.f29820 = r2
                r0.f29821 = r3
                r0.f29822 = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.f29821
                r0 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewPropertyAnimator r2 = r1.f29822
                r0 = 0
                r2.setListener(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29823
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29820
                r2.m30270(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29823
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r2.f29806
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29820
                r2.remove(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29823
                r2.m30079()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29823
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29820
                r2.m30271(r0)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C7747 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC7716 f29824;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ int f29825;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29826;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f29827;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewPropertyAnimator f29828;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29829;

        public C7747(androidx.recyclerview.widget.C7741 r1, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, int r3, android.view.View r4, int r5, android.view.ViewPropertyAnimator r6) {
                r0 = this;
                r0.f29829 = r1
                r0.f29824 = r2
                r0.f29825 = r3
                r0.f29826 = r4
                r0.f29827 = r5
                r0.f29828 = r6
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                int r2 = r1.f29825
                r0 = 0
                if (r2 == 0) goto La
                android.view.View r2 = r1.f29826
                r2.setTranslationX(r0)
            La:
                int r2 = r1.f29827
                if (r2 == 0) goto L13
                android.view.View r2 = r1.f29826
                r2.setTranslationY(r0)
            L13:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewPropertyAnimator r2 = r1.f29828
                r0 = 0
                r2.setListener(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29829
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29824
                r2.m30274(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29829
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r2.f29807
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29824
                r2.remove(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29829
                r2.m30079()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۠ r2 = r1.f29829
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29824
                r2.m30275(r0)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C7748 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741.C7750 f29830;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewPropertyAnimator f29831;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29832;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29833;

        public C7748(androidx.recyclerview.widget.C7741 r1, androidx.recyclerview.widget.C7741.C7750 r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
                r0 = this;
                r0.f29833 = r1
                r0.f29830 = r2
                r0.f29831 = r3
                r0.f29832 = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.ViewPropertyAnimator r3 = r2.f29831
                r0 = 0
                r3.setListener(r0)
                android.view.View r3 = r2.f29832
                r0 = 1065353216(0x3f800000, float:1.0)
                r3.setAlpha(r0)
                android.view.View r3 = r2.f29832
                r0 = 0
                r3.setTranslationX(r0)
                android.view.View r3 = r2.f29832
                r3.setTranslationY(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29833
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r0 = r2.f29830
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.f29838
                r1 = 1
                r3.m30272(r0, r1)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29833
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r3.f29809
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r0 = r2.f29830
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.f29838
                r3.remove(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29833
                r3.m30079()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29833
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r0 = r2.f29830
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.f29838
                r1 = 1
                r3.m30273(r0, r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C7749 extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741.C7750 f29834;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewPropertyAnimator f29835;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.view.View f29836;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.C7741 f29837;

        public C7749(androidx.recyclerview.widget.C7741 r1, androidx.recyclerview.widget.C7741.C7750 r2, android.view.ViewPropertyAnimator r3, android.view.View r4) {
                r0 = this;
                r0.f29837 = r1
                r0.f29834 = r2
                r0.f29835 = r3
                r0.f29836 = r4
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                android.view.ViewPropertyAnimator r3 = r2.f29835
                r0 = 0
                r3.setListener(r0)
                android.view.View r3 = r2.f29836
                r0 = 1065353216(0x3f800000, float:1.0)
                r3.setAlpha(r0)
                android.view.View r3 = r2.f29836
                r0 = 0
                r3.setTranslationX(r0)
                android.view.View r3 = r2.f29836
                r3.setTranslationY(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29837
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r0 = r2.f29834
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.f29839
                r1 = 0
                r3.m30272(r0, r1)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29837
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r3.f29809
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r0 = r2.f29834
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.f29839
                r3.remove(r0)
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29837
                r3.m30079()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۠ r3 = r2.f29837
                androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r0 = r2.f29834
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.f29839
                r1 = 0
                r3.m30273(r0, r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C7750 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 f29838;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 f29839;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29840;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29841;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29842;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29843;

        public C7750(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
                r0 = this;
                r0.<init>()
                r0.f29838 = r1
                r0.f29839 = r2
                return
        }

        public C7750(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f29840 = r3
                r0.f29841 = r4
                r0.f29842 = r5
                r0.f29843 = r6
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ChangeInfo{oldHolder="
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r2.f29838
                r0.append(r1)
                java.lang.String r1 = ", newHolder="
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r2.f29839
                r0.append(r1)
                java.lang.String r1 = ", fromX="
                r0.append(r1)
                int r1 = r2.f29840
                r0.append(r1)
                java.lang.String r1 = ", fromY="
                r0.append(r1)
                int r1 = r2.f29841
                r0.append(r1)
                java.lang.String r1 = ", toX="
                r0.append(r1)
                int r1 = r2.f29842
                r0.append(r1)
                java.lang.String r1 = ", toY="
                r0.append(r1)
                int r1 = r2.f29843
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C7751 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 f29844;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29845;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29846;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29847;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29848;

        public C7751(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f29844 = r1
                r0.f29845 = r2
                r0.f29846 = r3
                r0.f29847 = r4
                r0.f29848 = r5
                return
        }
    }

    public C7741() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29799 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29800 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29801 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29802 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29803 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29804 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29805 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29806 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29807 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29808 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29809 = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo29732(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, @Yue.InterfaceC4410 java.util.List<java.lang.Object> r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf
            boolean r2 = super.mo29732(r2, r3)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo29736(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r8) {
            r7 = this;
            android.view.View r0 = r8.itemView
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r1.cancel()
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r1 = r7.f29801
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L11:
            r2 = 0
            if (r1 < 0) goto L31
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r3 = r7.f29801
            java.lang.Object r3 = r3.get(r1)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ r3 = (androidx.recyclerview.widget.C7741.C7751) r3
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r3.f29844
            if (r3 != r8) goto L2e
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.m30274(r8)
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r2 = r7.f29801
            r2.remove(r1)
        L2e:
            int r1 = r1 + (-1)
            goto L11
        L31:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r1 = r7.f29802
            r7.m30080(r1, r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r7.f29799
            boolean r1 = r1.remove(r8)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L46
            r0.setAlpha(r3)
            r7.m30276(r8)
        L46:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r7.f29800
            boolean r1 = r1.remove(r8)
            if (r1 == 0) goto L54
            r0.setAlpha(r3)
            r7.m30270(r8)
        L54:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r1 = r7.f29805
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L5c:
            if (r1 < 0) goto L77
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r4 = r7.f29805
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r7.m30080(r4, r8)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L74
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r4 = r7.f29805
            r4.remove(r1)
        L74:
            int r1 = r1 + (-1)
            goto L5c
        L77:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r1 = r7.f29804
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L7f:
            if (r1 < 0) goto Lb9
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r4 = r7.f29804
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L8f:
            if (r5 < 0) goto Lb6
            java.lang.Object r6 = r4.get(r5)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ r6 = (androidx.recyclerview.widget.C7741.C7751) r6
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r6 = r6.f29844
            if (r6 != r8) goto Lb3
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.m30274(r8)
            r4.remove(r5)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lb6
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r4 = r7.f29804
            r4.remove(r1)
            goto Lb6
        Lb3:
            int r5 = r5 + (-1)
            goto L8f
        Lb6:
            int r1 = r1 + (-1)
            goto L7f
        Lb9:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r1 = r7.f29803
            int r1 = r1.size()
            int r1 = r1 + (-1)
        Lc1:
            if (r1 < 0) goto Le5
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r2 = r7.f29803
            java.lang.Object r2 = r2.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.remove(r8)
            if (r4 == 0) goto Le2
            r0.setAlpha(r3)
            r7.m30270(r8)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le2
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r2 = r7.f29803
            r2.remove(r1)
        Le2:
            int r1 = r1 + (-1)
            goto Lc1
        Le5:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29808
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29806
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29809
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29807
            r0.remove(r8)
            r7.m30079()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo29737() {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r0 = r7.f29801
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            r1 = 0
            if (r0 < 0) goto L2a
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r2 = r7.f29801
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ r2 = (androidx.recyclerview.widget.C7741.C7751) r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r2.f29844
            android.view.View r3 = r3.itemView
            r3.setTranslationY(r1)
            r3.setTranslationX(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r2.f29844
            r7.m30274(r1)
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r1 = r7.f29801
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto L8
        L2a:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29799
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L32:
            if (r0 < 0) goto L47
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r7.f29799
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
            r7.m30276(r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r7.f29799
            r2.remove(r0)
            int r0 = r0 + (-1)
            goto L32
        L47:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29800
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L4f:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto L6b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r7.f29800
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r3
            android.view.View r4 = r3.itemView
            r4.setAlpha(r2)
            r7.m30270(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r7.f29800
            r2.remove(r0)
            int r0 = r0 + (-1)
            goto L4f
        L6b:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r0 = r7.f29802
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L73:
            if (r0 < 0) goto L83
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r3 = r7.f29802
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r3 = (androidx.recyclerview.widget.C7741.C7750) r3
            r7.m30081(r3)
            int r0 = r0 + (-1)
            goto L73
        L83:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r0 = r7.f29802
            r0.clear()
            boolean r0 = r7.mo29742()
            if (r0 != 0) goto L8f
            return
        L8f:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r0 = r7.f29804
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L97:
            if (r0 < 0) goto Ld2
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r3 = r7.f29804
            java.lang.Object r3 = r3.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 + (-1)
        La7:
            if (r4 < 0) goto Lcf
            java.lang.Object r5 = r3.get(r4)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ r5 = (androidx.recyclerview.widget.C7741.C7751) r5
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r6 = r5.f29844
            android.view.View r6 = r6.itemView
            r6.setTranslationY(r1)
            r6.setTranslationX(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r5 = r5.f29844
            r7.m30274(r5)
            r3.remove(r4)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto Lcc
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r5 = r7.f29804
            r5.remove(r3)
        Lcc:
            int r4 = r4 + (-1)
            goto La7
        Lcf:
            int r0 = r0 + (-1)
            goto L97
        Ld2:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r0 = r7.f29803
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lda:
            if (r0 < 0) goto L10e
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r1 = r7.f29803
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            int r3 = r3 + (-1)
        Lea:
            if (r3 < 0) goto L10b
            java.lang.Object r4 = r1.get(r3)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r4
            android.view.View r5 = r4.itemView
            r5.setAlpha(r2)
            r7.m30270(r4)
            r1.remove(r3)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L108
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r4 = r7.f29803
            r4.remove(r1)
        L108:
            int r3 = r3 + (-1)
            goto Lea
        L10b:
            int r0 = r0 + (-1)
            goto Lda
        L10e:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r0 = r7.f29805
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L116:
            if (r0 < 0) goto L142
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r1 = r7.f29805
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L126:
            if (r2 < 0) goto L13f
            java.lang.Object r3 = r1.get(r2)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r3 = (androidx.recyclerview.widget.C7741.C7750) r3
            r7.m30081(r3)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L13c
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r3 = r7.f29805
            r3.remove(r1)
        L13c:
            int r2 = r2 + (-1)
            goto L126
        L13f:
            int r0 = r0 + (-1)
            goto L116
        L142:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29808
            r7.m30078(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29807
            r7.m30078(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29806
            r7.m30078(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r7.f29809
            r7.m30078(r0)
            r7.m29735()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public boolean mo29742() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29800
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r0 = r1.f29802
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r0 = r1.f29801
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29799
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29807
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29808
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29806
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29809
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r0 = r1.f29804
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r0 = r1.f29803
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r0 = r1.f29805
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L59
            goto L5b
        L59:
            r0 = 0
            goto L5c
        L5b:
            r0 = 1
        L5c:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo29749() {
            r10 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r10.f29799
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r1 = r10.f29801
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r2 = r10.f29802
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r10.f29800
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r0 != 0) goto L29
            if (r1 != 0) goto L29
            if (r3 != 0) goto L29
            if (r2 != 0) goto L29
            return
        L29:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r4 = r10.f29799
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r4.next()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r5 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r5
            r10.m30077(r5)
            goto L2f
        L3f:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r4 = r10.f29799
            r4.clear()
            r4 = 0
            if (r1 == 0) goto L77
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r6 = r10.f29801
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ>> r6 = r10.f29804
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r6 = r10.f29801
            r6.clear()
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ r6 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ
            r6.<init>(r10, r5)
            if (r0 == 0) goto L74
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ r5 = (androidx.recyclerview.widget.C7741.C7751) r5
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r5 = r5.f29844
            android.view.View r5 = r5.itemView
            long r7 = r10.m29741()
            Yue.C6794.m26212(r5, r6, r7)
            goto L77
        L74:
            r6.run()
        L77:
            if (r2 == 0) goto La9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r6 = r10.f29802
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟>> r6 = r10.f29805
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r6 = r10.f29802
            r6.clear()
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟ r6 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟
            r6.<init>(r10, r5)
            if (r0 == 0) goto La6
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r5 = (androidx.recyclerview.widget.C7741.C7750) r5
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r5 = r5.f29838
            android.view.View r5 = r5.itemView
            long r7 = r10.m29741()
            Yue.C6794.m26212(r5, r6, r7)
            goto La9
        La6:
            r6.run()
        La9:
            if (r3 == 0) goto Lf7
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r5 = r10.f29800
            r3.addAll(r5)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ>> r5 = r10.f29803
            r5.add(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r5 = r10.f29800
            r5.clear()
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟ r5 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟
            r5.<init>(r10, r3)
            if (r0 != 0) goto Lcf
            if (r1 != 0) goto Lcf
            if (r2 == 0) goto Lcb
            goto Lcf
        Lcb:
            r5.run()
            goto Lf7
        Lcf:
            r6 = 0
            if (r0 == 0) goto Ld8
            long r8 = r10.m29741()
            goto Ld9
        Ld8:
            r8 = r6
        Ld9:
            if (r1 == 0) goto Le0
            long r0 = r10.m29740()
            goto Le1
        Le0:
            r0 = r6
        Le1:
            if (r2 == 0) goto Le7
            long r6 = r10.m29739()
        Le7:
            long r0 = java.lang.Math.max(r0, r6)
            long r8 = r8 + r0
            java.lang.Object r0 = r3.get(r4)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r0
            android.view.View r0 = r0.itemView
            Yue.C6794.m26212(r0, r5, r8)
        Lf7:
            return
    }

    @Override // androidx.recyclerview.widget.AbstractC7799
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean mo30070(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
            r2 = this;
            r2.m30083(r3)
            android.view.View r0 = r3.itemView
            r1 = 0
            r0.setAlpha(r1)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.f29800
            r0.add(r3)
            r3 = 1
            return r3
    }

    @Override // androidx.recyclerview.widget.AbstractC7799
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean mo30071(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r10, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r11, int r12, int r13, int r14, int r15) {
            r9 = this;
            if (r10 != r11) goto Ld
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            boolean r10 = r0.mo30072(r1, r2, r3, r4, r5)
            return r10
        Ld:
            android.view.View r0 = r10.itemView
            float r0 = r0.getTranslationX()
            android.view.View r1 = r10.itemView
            float r1 = r1.getTranslationY()
            android.view.View r2 = r10.itemView
            float r2 = r2.getAlpha()
            r9.m30083(r10)
            int r3 = r14 - r12
            float r3 = (float) r3
            float r3 = r3 - r0
            int r3 = (int) r3
            int r4 = r15 - r13
            float r4 = (float) r4
            float r4 = r4 - r1
            int r4 = (int) r4
            android.view.View r5 = r10.itemView
            r5.setTranslationX(r0)
            android.view.View r0 = r10.itemView
            r0.setTranslationY(r1)
            android.view.View r0 = r10.itemView
            r0.setAlpha(r2)
            if (r11 == 0) goto L54
            r9.m30083(r11)
            android.view.View r0 = r11.itemView
            int r1 = -r3
            float r1 = (float) r1
            r0.setTranslationX(r1)
            android.view.View r0 = r11.itemView
            int r1 = -r4
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.view.View r0 = r11.itemView
            r1 = 0
            r0.setAlpha(r1)
        L54:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟> r0 = r9.f29802
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r8 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r8)
            r10 = 1
            return r10
    }

    @Override // androidx.recyclerview.widget.AbstractC7799
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean mo30072(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            android.view.View r0 = r9.itemView
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r4 = r10 + r1
            android.view.View r10 = r9.itemView
            float r10 = r10.getTranslationY()
            int r10 = (int) r10
            int r5 = r11 + r10
            r8.m30083(r9)
            int r10 = r12 - r4
            int r11 = r13 - r5
            if (r10 != 0) goto L22
            if (r11 != 0) goto L22
            r8.m30274(r9)
            r9 = 0
            return r9
        L22:
            if (r10 == 0) goto L29
            int r10 = -r10
            float r10 = (float) r10
            r0.setTranslationX(r10)
        L29:
            if (r11 == 0) goto L30
            int r10 = -r11
            float r10 = (float) r10
            r0.setTranslationY(r10)
        L30:
            java.util.ArrayList<androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ> r10 = r8.f29801
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ r11 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۤ
            r2 = r11
            r3 = r9
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r10.add(r11)
            r9 = 1
            return r9
    }

    @Override // androidx.recyclerview.widget.AbstractC7799
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean mo30073(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
            r1 = this;
            r1.m30083(r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29799
            r0.add(r2)
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m30074(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r6) {
            r5 = this;
            android.view.View r0 = r6.itemView
            android.view.ViewPropertyAnimator r1 = r0.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r5.f29806
            r2.add(r6)
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r2)
            long r3 = r5.m29738()
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۟ r3 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۟
            r3.<init>(r5, r6, r0, r1)
            android.view.ViewPropertyAnimator r6 = r2.setListener(r3)
            r6.start()
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m30075(androidx.recyclerview.widget.C7741.C7750 r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r7.f29838
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto L9
        L7:
            android.view.View r0 = r0.itemView
        L9:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r7.f29839
            if (r2 == 0) goto Lf
            android.view.View r1 = r2.itemView
        Lf:
            r2 = 0
            if (r0 == 0) goto L47
            android.view.ViewPropertyAnimator r3 = r0.animate()
            long r4 = r6.m29739()
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r4)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r4 = r6.f29809
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r5 = r7.f29838
            r4.add(r5)
            int r4 = r7.f29842
            int r5 = r7.f29840
            int r4 = r4 - r5
            float r4 = (float) r4
            r3.translationX(r4)
            int r4 = r7.f29843
            int r5 = r7.f29841
            int r4 = r4 - r5
            float r4 = (float) r4
            r3.translationY(r4)
            android.view.ViewPropertyAnimator r4 = r3.alpha(r2)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۡ r5 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۡ
            r5.<init>(r6, r7, r3, r0)
            android.view.ViewPropertyAnimator r0 = r4.setListener(r5)
            r0.start()
        L47:
            if (r1 == 0) goto L76
            android.view.ViewPropertyAnimator r0 = r1.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r6.f29809
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = r7.f29839
            r3.add(r4)
            android.view.ViewPropertyAnimator r3 = r0.translationX(r2)
            android.view.ViewPropertyAnimator r2 = r3.translationY(r2)
            long r3 = r6.m29739()
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۢ r3 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ۢ
            r3.<init>(r6, r7, r0, r1)
            android.view.ViewPropertyAnimator r7 = r2.setListener(r3)
            r7.start()
        L76:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m30076(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            android.view.View r4 = r8.itemView
            int r3 = r11 - r9
            int r5 = r12 - r10
            r9 = 0
            if (r3 == 0) goto L10
            android.view.ViewPropertyAnimator r10 = r4.animate()
            r10.translationX(r9)
        L10:
            if (r5 == 0) goto L19
            android.view.ViewPropertyAnimator r10 = r4.animate()
            r10.translationY(r9)
        L19:
            android.view.ViewPropertyAnimator r6 = r4.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r9 = r7.f29807
            r9.add(r8)
            long r9 = r7.m29740()
            android.view.ViewPropertyAnimator r9 = r6.setDuration(r9)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۠ r10 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟۠
            r0 = r10
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.view.ViewPropertyAnimator r8 = r9.setListener(r10)
            r8.start()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final void m30077(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r5) {
            r4 = this;
            android.view.View r0 = r5.itemView
            android.view.ViewPropertyAnimator r1 = r0.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r4.f29808
            r2.add(r5)
            long r2 = r4.m29741()
            android.view.ViewPropertyAnimator r2 = r1.setDuration(r2)
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟ r3 = new androidx.recyclerview.widget.ۥ۟۟۟۠$ۥ۟۟۟
            r3.<init>(r4, r5, r1, r0)
            android.view.ViewPropertyAnimator r5 = r2.setListener(r3)
            r5.start()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m30078(java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC7716> r3) {
            r2 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r3.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r1
            android.view.View r1 = r1.itemView
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m30079() {
            r1 = this;
            boolean r0 = r1.mo29742()
            if (r0 != 0) goto L9
            r1.m29735()
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public final void m30080(java.util.List<androidx.recyclerview.widget.C7741.C7750> r4, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r5) {
            r3 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L22
            java.lang.Object r1 = r4.get(r0)
            androidx.recyclerview.widget.ۥ۟۟۟۠$ۥۣ۟۟۟ r1 = (androidx.recyclerview.widget.C7741.C7750) r1
            boolean r2 = r3.m30082(r1, r5)
            if (r2 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r1.f29838
            if (r2 != 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r1.f29839
            if (r2 != 0) goto L1f
            r4.remove(r1)
        L1f:
            int r0 = r0 + (-1)
            goto L6
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m30081(androidx.recyclerview.widget.C7741.C7750 r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r2.f29838
            if (r0 == 0) goto L7
            r1.m30082(r2, r0)
        L7:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r2.f29839
            if (r0 == 0) goto Le
            r1.m30082(r2, r0)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final boolean m30082(androidx.recyclerview.widget.C7741.C7750 r5, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r5.f29839
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto La
            r5.f29839 = r2
            goto L11
        La:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r5.f29838
            if (r0 != r6) goto L27
            r5.f29838 = r2
            r3 = r1
        L11:
            android.view.View r5 = r6.itemView
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            android.view.View r5 = r6.itemView
            r0 = 0
            r5.setTranslationX(r0)
            android.view.View r5 = r6.itemView
            r5.setTranslationY(r0)
            r4.m30272(r6, r3)
            return r1
        L27:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m30083(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = androidx.recyclerview.widget.C7741.f29798
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            androidx.recyclerview.widget.C7741.f29798 = r0
        Lf:
            android.view.View r0 = r3.itemView
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = androidx.recyclerview.widget.C7741.f29798
            r0.setInterpolator(r1)
            r2.mo29736(r3)
            return
    }
}
