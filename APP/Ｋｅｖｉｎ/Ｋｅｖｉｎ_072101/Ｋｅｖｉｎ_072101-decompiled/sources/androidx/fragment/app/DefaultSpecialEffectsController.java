package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {


    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10 */
    static /* synthetic */ class C024310 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State */
        static final /* synthetic */ int[] f39xe493b431 = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.DefaultSpecialEffectsController.C024310.f39xe493b431 = r0
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.C024310.f39xe493b431     // Catch: java.lang.NoSuchFieldError -> L15
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.C024310.f39xe493b431     // Catch: java.lang.NoSuchFieldError -> L22
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.C024310.f39xe493b431     // Catch: java.lang.NoSuchFieldError -> L2f
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = androidx.fragment.app.DefaultSpecialEffectsController.C024310.f39xe493b431     // Catch: java.lang.NoSuchFieldError -> L3c
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }









    private static class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.core.os.CancellationSignal r3, boolean r4) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mLoadedAnim = r0
                r1.mIsPop = r4
                return
        }

        androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(android.content.Context r5) {
                r4 = this;
                boolean r0 = r4.mLoadedAnim
                if (r0 == 0) goto L7
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r4.mAnimation
                return r0
            L7:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L1f
                r1 = r3
                goto L20
            L1f:
                r1 = 0
            L20:
                boolean r2 = r4.mIsPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r4.mAnimation = r0
                r4.mLoadedAnim = r3
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r4.mAnimation
                return r0
        }
    }

    private static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation mOperation;
        private final androidx.core.os.CancellationSignal mSignal;

        SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.core.os.CancellationSignal r2) {
                r0 = this;
                r0.<init>()
                r0.mOperation = r1
                r0.mSignal = r2
                return
        }

        void completeSpecialEffect() {
                r2 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r2.mOperation
                androidx.core.os.CancellationSignal r1 = r2.mSignal
                r0.completeSpecialEffect(r1)
                return
        }

        androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.mOperation
                return r0
        }

        androidx.core.os.CancellationSignal getSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.mSignal
                return r0
        }

        boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.mOperation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.mOperation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L1f
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L1d
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r1 == r2) goto L1d
                goto L1f
            L1d:
                r2 = 0
                goto L20
            L1f:
                r2 = 1
            L20:
                return r2
        }
    }

    private static class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final java.lang.Object mSharedElementTransition;
        private final java.lang.Object mTransition;

        TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation r3, androidx.core.os.CancellationSignal r4, boolean r5, boolean r6) {
                r2 = this;
                r2.<init>(r3, r4)
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r3.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 != r1) goto L36
                if (r5 == 0) goto L16
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getReenterTransition()
                goto L1e
            L16:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getEnterTransition()
            L1e:
                r2.mTransition = r0
                if (r5 == 0) goto L2b
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                boolean r0 = r0.getAllowReturnTransitionOverlap()
                goto L33
            L2b:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                boolean r0 = r0.getAllowEnterTransitionOverlap()
            L33:
                r2.mOverlapAllowed = r0
                goto L4e
            L36:
                if (r5 == 0) goto L41
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getReturnTransition()
                goto L49
            L41:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getExitTransition()
            L49:
                r2.mTransition = r0
                r0 = 1
                r2.mOverlapAllowed = r0
            L4e:
                if (r6 == 0) goto L6a
                if (r5 == 0) goto L5e
            L53:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getSharedElementReturnTransition()
                r2.mSharedElementTransition = r0
                goto L6d
            L5e:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getSharedElementEnterTransition()
                r2.mSharedElementTransition = r0
                goto L6d
            L6a:
                r0 = 0
                r2.mSharedElementTransition = r0
            L6d:
                return
        }

        private androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r0 = 0
                return r0
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                return r0
            L13:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                return r0
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r2 = " for fragment "
                java.lang.StringBuilder r1 = r1.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " is not a valid framework Transition or AndroidX Transition"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r5 = this;
                java.lang.Object r0 = r5.mTransition
                androidx.fragment.app.FragmentTransitionImpl r0 = r5.getHandlingImpl(r0)
                java.lang.Object r1 = r5.mSharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r5.getHandlingImpl(r1)
                if (r0 == 0) goto L4c
                if (r1 == 0) goto L4c
                if (r0 != r1) goto L13
                goto L4c
            L13:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                java.lang.StringBuilder r3 = r3.append(r4)
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r5.getOperation()
                androidx.fragment.app.Fragment r4 = r4.getFragment()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " returned Transition "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Object r4 = r5.mTransition
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " which uses a different Transition  type than its shared element transition "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Object r4 = r5.mSharedElementTransition
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L4c:
                if (r0 == 0) goto L50
                r2 = r0
                goto L51
            L50:
                r2 = r1
            L51:
                return r2
        }

        public java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                return r0
        }

        java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mTransition
                return r0
        }

        public boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.mSharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.mOverlapAllowed
                return r0
        }
    }

    DefaultSpecialEffectsController(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void startAnimations(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r23, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r24, boolean r25, java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> r26) {
            r22 = this;
            r7 = r22
            android.view.ViewGroup r8 = r22.getContainer()
            android.content.Context r9 = r8.getContext()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10 = r0
            r0 = 0
            java.util.Iterator r11 = r23.iterator()
        L15:
            boolean r1 = r11.hasNext()
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto Ld2
            java.lang.Object r1 = r11.next()
            r12 = r1
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r12 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r12
            boolean r1 = r12.isVisibilityUnchanged()
            if (r1 == 0) goto L31
            r12.completeSpecialEffect()
            r5 = r26
            goto L15
        L31:
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r13 = r12.getAnimation(r9)
            if (r13 != 0) goto L3d
            r12.completeSpecialEffect()
            r5 = r26
            goto L15
        L3d:
            android.animation.Animator r14 = r13.animator
            if (r14 != 0) goto L47
            r10.add(r12)
            r5 = r26
            goto L15
        L47:
            androidx.fragment.app.SpecialEffectsController$Operation r15 = r12.getOperation()
            androidx.fragment.app.Fragment r6 = r15.getFragment()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5 = r26
            java.lang.Object r4 = r5.get(r15)
            boolean r16 = r1.equals(r4)
            if (r16 == 0) goto L83
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r1 == 0) goto L7f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Ignoring Animator set on "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r3 = " as this Fragment was involved in a Transition."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L7f:
            r12.completeSpecialEffect()
            goto L15
        L83:
            r17 = 1
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r15.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r0 != r1) goto L8f
            r0 = 1
            goto L90
        L8f:
            r0 = 0
        L90:
            r18 = r0
            if (r18 == 0) goto L9a
            r4 = r24
            r4.remove(r15)
            goto L9c
        L9a:
            r4 = r24
        L9c:
            android.view.View r3 = r6.mView
            r8.startViewTransition(r3)
            androidx.fragment.app.DefaultSpecialEffectsController$2 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$2
            r0 = r2
            r1 = r22
            r19 = r11
            r11 = r2
            r2 = r8
            r20 = r3
            r4 = r18
            r5 = r15
            r21 = r6
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.addListener(r11)
            r0 = r20
            r14.setTarget(r0)
            r14.start()
            androidx.core.os.CancellationSignal r1 = r12.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$3 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$3
            r2.<init>(r7, r14)
            r1.setOnCancelListener(r2)
            r0 = r17
            r11 = r19
            goto L15
        Ld2:
            java.util.Iterator r1 = r10.iterator()
        Ld6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L17d
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r4 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = r4.getOperation()
            androidx.fragment.app.Fragment r6 = r5.getFragment()
            java.lang.String r11 = "Ignoring Animation set on "
            if (r25 == 0) goto L112
            boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r12 == 0) goto L10e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.StringBuilder r11 = r11.append(r6)
            java.lang.String r12 = " as Animations cannot run alongside Transitions."
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r2, r11)
        L10e:
            r4.completeSpecialEffect()
            goto Ld6
        L112:
            if (r0 == 0) goto L138
            boolean r12 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r12 == 0) goto L134
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.StringBuilder r11 = r11.append(r6)
            java.lang.String r12 = " as Animations cannot run alongside Animators."
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r2, r11)
        L134:
            r4.completeSpecialEffect()
            goto Ld6
        L138:
            android.view.View r11 = r6.mView
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r12 = r4.getAnimation(r9)
            java.lang.Object r12 = androidx.core.util.Preconditions.checkNotNull(r12)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r12 = (androidx.fragment.app.FragmentAnim.AnimationOrAnimator) r12
            android.view.animation.Animation r12 = r12.animation
            java.lang.Object r12 = androidx.core.util.Preconditions.checkNotNull(r12)
            android.view.animation.Animation r12 = (android.view.animation.Animation) r12
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = r5.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r13 == r14) goto L15c
            r11.startAnimation(r12)
            r4.completeSpecialEffect()
            goto L16f
        L15c:
            r8.startViewTransition(r11)
            androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r14 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
            r14.<init>(r12, r8, r11)
            androidx.fragment.app.DefaultSpecialEffectsController$4 r15 = new androidx.fragment.app.DefaultSpecialEffectsController$4
            r15.<init>(r7, r8, r11, r4)
            r14.setAnimationListener(r15)
            r11.startAnimation(r14)
        L16f:
            androidx.core.os.CancellationSignal r14 = r4.getSignal()
            androidx.fragment.app.DefaultSpecialEffectsController$5 r15 = new androidx.fragment.app.DefaultSpecialEffectsController$5
            r15.<init>(r7, r11, r8, r4)
            r14.setOnCancelListener(r15)
            goto Ld6
        L17d:
            return
    }

    private java.util.Map<androidx.fragment.app.SpecialEffectsController.Operation, java.lang.Boolean> startTransitions(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r39, java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r40, boolean r41, androidx.fragment.app.SpecialEffectsController.Operation r42, androidx.fragment.app.SpecialEffectsController.Operation r43) {
            r38 = this;
            r6 = r38
            r7 = r41
            r8 = r42
            r9 = r43
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r10 = r0
            r0 = 0
            java.util.Iterator r1 = r39.iterator()
            r15 = r0
        L14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r1.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r0 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r0
            boolean r2 = r0.isVisibilityUnchanged()
            if (r2 == 0) goto L27
            goto L14
        L27:
            androidx.fragment.app.FragmentTransitionImpl r2 = r0.getHandlingImpl()
            if (r15 != 0) goto L30
            r3 = r2
            r15 = r3
            goto L6a
        L30:
            if (r2 == 0) goto L6a
            if (r15 != r2) goto L35
            goto L6a
        L35:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            androidx.fragment.app.SpecialEffectsController$Operation r4 = r0.getOperation()
            androidx.fragment.app.Fragment r4 = r4.getFragment()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " returned Transition "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.Object r4 = r0.getTransition()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " which uses a different Transition  type than other Fragments."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        L6a:
            goto L14
        L6b:
            r14 = 0
            if (r15 != 0) goto L8e
            java.util.Iterator r0 = r39.iterator()
        L72:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.getOperation()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            r10.put(r2, r3)
            r1.completeSpecialEffect()
            goto L72
        L8d:
            return r10
        L8e:
            android.view.View r0 = new android.view.View
            android.view.ViewGroup r1 = r38.getContainer()
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r13 = r0
            r0 = 0
            r1 = 0
            r2 = 0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r12 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = r3
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            r4 = r3
            java.util.Iterator r19 = r39.iterator()
            r3 = r1
            r20 = r2
        Lbe:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L372
            java.lang.Object r1 = r19.next()
            r21 = r1
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r21 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r21
            boolean r22 = r21.hasSharedElementTransition()
            if (r22 == 0) goto L34e
            if (r8 == 0) goto L34e
            if (r9 == 0) goto L34e
        Ld7:
            java.lang.Object r1 = r21.getSharedElementTransition()
            java.lang.Object r1 = r15.cloneTransition(r1)
            java.lang.Object r1 = r15.wrapTransitionInSet(r1)
            androidx.fragment.app.Fragment r0 = r43.getFragment()
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r16 = r42.getFragment()
            java.util.ArrayList r14 = r16.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r16 = r42.getFragment()
            java.util.ArrayList r2 = r16.getSharedElementTargetNames()
            r16 = 0
            r23 = r1
            r1 = r16
        L101:
            r16 = r3
            int r3 = r2.size()
            if (r1 >= r3) goto L124
            java.lang.Object r3 = r2.get(r1)
            int r3 = r0.indexOf(r3)
            r24 = r2
            r2 = -1
            if (r3 == r2) goto L11d
            java.lang.Object r2 = r14.get(r1)
            r0.set(r3, r2)
        L11d:
            int r1 = r1 + 1
            r3 = r16
            r2 = r24
            goto L101
        L124:
            r24 = r2
            androidx.fragment.app.Fragment r1 = r43.getFragment()
            java.util.ArrayList r3 = r1.getSharedElementTargetNames()
            if (r7 != 0) goto L146
            androidx.fragment.app.Fragment r1 = r42.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getExitTransitionCallback()
            androidx.fragment.app.Fragment r2 = r43.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getEnterTransitionCallback()
            r37 = r2
            r2 = r1
            r1 = r37
            goto L15b
        L146:
            androidx.fragment.app.Fragment r1 = r42.getFragment()
            androidx.core.app.SharedElementCallback r1 = r1.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r2 = r43.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getExitTransitionCallback()
            r37 = r2
            r2 = r1
            r1 = r37
        L15b:
            r25 = r14
            int r14 = r0.size()
            r26 = 0
            r9 = r26
        L165:
            if (r9 >= r14) goto L183
            java.lang.Object r26 = r0.get(r9)
            r27 = r14
            r14 = r26
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r26 = r3.get(r9)
            r8 = r26
            java.lang.String r8 = (java.lang.String) r8
            r4.put(r14, r8)
            int r9 = r9 + 1
            r8 = r42
            r14 = r27
            goto L165
        L183:
            r27 = r14
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            androidx.fragment.app.Fragment r9 = r42.getFragment()
            android.view.View r9 = r9.mView
            r6.findNamedViews(r8, r9)
            r8.retainAll(r0)
            if (r2 == 0) goto L1e3
            r2.onMapSharedElements(r0, r8)
            int r9 = r0.size()
            r14 = 1
            int r9 = r9 - r14
        L1a1:
            if (r9 < 0) goto L1de
            java.lang.Object r14 = r0.get(r9)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r26 = r8.get(r14)
            android.view.View r26 = (android.view.View) r26
            if (r26 != 0) goto L1b9
            r4.remove(r14)
            r28 = r0
            r29 = r2
            goto L1d7
        L1b9:
            r28 = r0
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r26)
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L1d5
            java.lang.Object r0 = r4.remove(r14)
            java.lang.String r0 = (java.lang.String) r0
            r29 = r2
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r26)
            r4.put(r2, r0)
            goto L1d7
        L1d5:
            r29 = r2
        L1d7:
            int r9 = r9 + (-1)
            r0 = r28
            r2 = r29
            goto L1a1
        L1de:
            r28 = r0
            r29 = r2
            goto L1ee
        L1e3:
            r28 = r0
            r29 = r2
            java.util.Set r0 = r8.keySet()
            r4.retainAll(r0)
        L1ee:
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r9 = r0
            androidx.fragment.app.Fragment r0 = r43.getFragment()
            android.view.View r0 = r0.mView
            r6.findNamedViews(r9, r0)
            r9.retainAll(r3)
            java.util.Collection r0 = r4.values()
            r9.retainAll(r0)
            if (r1 == 0) goto L258
            r1.onMapSharedElements(r3, r9)
            int r0 = r3.size()
            r2 = 1
            int r0 = r0 - r2
        L212:
            if (r0 < 0) goto L255
            java.lang.Object r2 = r3.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r14 = r9.get(r2)
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L22e
            r26 = r1
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r4, r2)
            if (r1 == 0) goto L22d
            r4.remove(r1)
        L22d:
            goto L250
        L22e:
            r26 = r1
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r14)
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L24e
            java.lang.String r1 = androidx.fragment.app.FragmentTransition.findKeyForValue(r4, r2)
            if (r1 == 0) goto L24b
        L241:
            r30 = r2
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r14)
            r4.put(r1, r2)
            goto L250
        L24b:
            r30 = r2
            goto L250
        L24e:
            r30 = r2
        L250:
            int r0 = r0 + (-1)
            r1 = r26
            goto L212
        L255:
            r26 = r1
            goto L25d
        L258:
            r26 = r1
            androidx.fragment.app.FragmentTransition.retainValues(r4, r9)
        L25d:
            java.util.Set r0 = r4.keySet()
            r6.retainMatchingViews(r8, r0)
            java.util.Collection r0 = r4.values()
            r6.retainMatchingViews(r9, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L28c
            r0 = 0
            r11.clear()
            r5.clear()
            r33 = r4
            r30 = r5
            r14 = r10
            r10 = r11
            r34 = r12
            r2 = r13
            r35 = r15
            r3 = r16
            r5 = 0
            r15 = r42
            r13 = r43
            goto L360
        L28c:
            androidx.fragment.app.Fragment r0 = r43.getFragment()
            androidx.fragment.app.Fragment r1 = r42.getFragment()
            r2 = 1
            androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r0, r1, r7, r8, r2)
            android.view.ViewGroup r14 = r38.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$6 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$6
            r30 = r28
            r0 = r1
            r7 = r23
            r23 = r26
            r26 = r10
            r10 = r1
            r1 = r38
            r28 = r29
            r29 = r2
            r2 = r43
            r32 = r3
            r31 = r16
            r3 = r42
            r33 = r4
            r4 = r41
            r16 = r13
            r13 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.core.view.OneShotPreDrawListener.add(r14, r10)
            java.util.Collection r0 = r8.values()
            r11.addAll(r0)
            boolean r0 = r30.isEmpty()
            if (r0 != 0) goto L2e7
            r0 = r30
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            r15.setEpicenter(r7, r3)
            goto L2eb
        L2e7:
            r0 = r30
            r3 = r31
        L2eb:
            java.util.Collection r1 = r9.values()
            r13.addAll(r1)
            boolean r1 = r32.isEmpty()
            if (r1 != 0) goto L319
            r1 = r32
            r2 = 0
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r9.get(r4)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L31b
            r20 = 1
            r10 = r15
            android.view.ViewGroup r14 = r38.getContainer()
            androidx.fragment.app.DefaultSpecialEffectsController$7 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$7
            r2.<init>(r6, r10, r5, r12)
            androidx.core.view.OneShotPreDrawListener.add(r14, r2)
            goto L31b
        L319:
            r1 = r32
        L31b:
            r2 = r16
            r15.setSharedElementTargets(r7, r2, r11)
            r4 = 0
            r16 = 0
            r5 = 0
            r14 = 0
            r10 = r11
            r11 = r15
            r34 = r12
            r12 = r7
            r30 = r13
            r13 = r5
            r5 = 0
            r35 = r15
            r15 = r4
            r17 = r7
            r18 = r30
            r11.scheduleRemoveTargets(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r29)
            r15 = r42
            r14 = r26
            r14.put(r15, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r29)
            r13 = r43
            r14.put(r13, r4)
            r0 = r7
            goto L360
        L34e:
            r31 = r3
            r33 = r4
            r30 = r5
            r34 = r12
            r2 = r13
            r5 = r14
            r35 = r15
            r15 = r8
            r13 = r9
            r14 = r10
            r10 = r11
            r3 = r31
        L360:
            r7 = r41
            r11 = r10
            r9 = r13
            r10 = r14
            r8 = r15
            r4 = r33
            r12 = r34
            r15 = r35
            r13 = r2
            r14 = r5
            r5 = r30
            goto Lbe
        L372:
            r31 = r3
            r33 = r4
            r30 = r5
            r34 = r12
            r2 = r13
            r5 = r14
            r35 = r15
            r29 = 1
            r15 = r8
            r13 = r9
            r14 = r10
            r10 = r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            r4 = 0
            java.util.Iterator r7 = r39.iterator()
        L38f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L4d4
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r8 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r8
            boolean r9 = r8.isVisibilityUnchanged()
            if (r9 == 0) goto L3b0
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r8.getOperation()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            r14.put(r9, r11)
            r8.completeSpecialEffect()
            goto L38f
        L3b0:
            java.lang.Object r9 = r8.getTransition()
            r12 = r35
            java.lang.Object r9 = r12.cloneTransition(r9)
            androidx.fragment.app.SpecialEffectsController$Operation r11 = r8.getOperation()
            if (r0 == 0) goto L3c7
            if (r11 == r15) goto L3c4
            if (r11 != r13) goto L3c7
        L3c4:
            r16 = r29
            goto L3c9
        L3c7:
            r16 = r5
        L3c9:
            r19 = r16
            if (r9 != 0) goto L3ef
            if (r19 != 0) goto L3dc
            r21 = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            r14.put(r11, r7)
            r8.completeSpecialEffect()
            goto L3de
        L3dc:
            r21 = r7
        L3de:
            r25 = r2
            r26 = r10
            r2 = r14
            r10 = r15
            r5 = r30
            r13 = r34
            r15 = r40
            r14 = r12
            r12 = r31
            goto L4bf
        L3ef:
            r21 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            androidx.fragment.app.Fragment r5 = r11.getFragment()
            android.view.View r5 = r5.mView
            r6.captureTransitioningViews(r7, r5)
            if (r19 == 0) goto L410
            if (r11 != r15) goto L40a
            r7.removeAll(r10)
            r5 = r30
            goto L412
        L40a:
            r5 = r30
            r7.removeAll(r5)
            goto L412
        L410:
            r5 = r30
        L412:
            boolean r16 = r7.isEmpty()
            if (r16 == 0) goto L425
            r12.addTarget(r9, r2)
            r25 = r2
            r26 = r10
            r2 = r14
            r10 = r15
            r15 = r40
            r14 = r12
            goto L483
        L425:
            r12.addTargets(r9, r7)
            r17 = 0
            r18 = 0
            r16 = 0
            r23 = 0
            r24 = r11
            r11 = r12
            r36 = r12
            r12 = r9
            r13 = r9
            r25 = r2
            r2 = r14
            r14 = r7
            r26 = r10
            r10 = r15
            r15 = r16
            r16 = r23
            r11.scheduleRemoveTargets(r12, r13, r14, r15, r16, r17, r18)
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = r24.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r11 != r12) goto L47d
            r15 = r40
            r11 = r24
            r15.remove(r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r7)
            androidx.fragment.app.Fragment r13 = r11.getFragment()
            android.view.View r13 = r13.mView
            r12.remove(r13)
            androidx.fragment.app.Fragment r13 = r11.getFragment()
            android.view.View r13 = r13.mView
            r14 = r36
            r14.scheduleHideFragmentView(r9, r13, r12)
            android.view.ViewGroup r13 = r38.getContainer()
            r16 = r12
            androidx.fragment.app.DefaultSpecialEffectsController$8 r12 = new androidx.fragment.app.DefaultSpecialEffectsController$8
            r12.<init>(r6, r7)
            androidx.core.view.OneShotPreDrawListener.add(r13, r12)
            goto L483
        L47d:
            r15 = r40
            r11 = r24
            r14 = r36
        L483:
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r11.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r12 != r13) goto L49d
            r1.addAll(r7)
            if (r20 == 0) goto L498
            r13 = r34
            r14.setEpicenter(r9, r13)
            r12 = r31
            goto L4a4
        L498:
            r13 = r34
            r12 = r31
            goto L4a4
        L49d:
            r13 = r34
            r12 = r31
            r14.setEpicenter(r9, r12)
        L4a4:
            r16 = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r29)
            r2.put(r11, r7)
            boolean r7 = r8.isOverlapAllowed()
            r17 = r8
            r8 = 0
            if (r7 == 0) goto L4bb
            java.lang.Object r3 = r14.mergeTransitionsTogether(r3, r9, r8)
            goto L4bf
        L4bb:
            java.lang.Object r4 = r14.mergeTransitionsTogether(r4, r9, r8)
        L4bf:
            r30 = r5
            r15 = r10
            r31 = r12
            r34 = r13
            r35 = r14
            r7 = r21
            r10 = r26
            r5 = 0
            r13 = r43
            r14 = r2
            r2 = r25
            goto L38f
        L4d4:
            r25 = r2
            r26 = r10
            r2 = r14
            r10 = r15
            r5 = r30
            r12 = r31
            r13 = r34
            r14 = r35
            r15 = r40
            java.lang.Object r3 = r14.mergeTransitionsInSequence(r3, r4, r0)
            java.util.Iterator r7 = r39.iterator()
        L4ec:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L586
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r8 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r8
            boolean r9 = r8.isVisibilityUnchanged()
            if (r9 == 0) goto L4ff
            goto L4ec
        L4ff:
            java.lang.Object r9 = r8.getTransition()
            androidx.fragment.app.SpecialEffectsController$Operation r11 = r8.getOperation()
            if (r0 == 0) goto L519
            if (r11 == r10) goto L512
            r17 = r4
            r4 = r43
            if (r11 != r4) goto L51d
            goto L516
        L512:
            r17 = r4
            r4 = r43
        L516:
            r16 = r29
            goto L51f
        L519:
            r17 = r4
            r4 = r43
        L51d:
            r16 = 0
        L51f:
            if (r9 != 0) goto L527
            if (r16 == 0) goto L524
            goto L527
        L524:
            r18 = r7
            goto L580
        L527:
            android.view.ViewGroup r18 = r38.getContainer()
            boolean r18 = androidx.core.view.ViewCompat.isLaidOut(r18)
            if (r18 != 0) goto L568
            r18 = 2
            boolean r18 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r18)
            if (r18 == 0) goto L562
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r18 = r7
            java.lang.String r7 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r4 = r4.append(r7)
            android.view.ViewGroup r7 = r38.getContainer()
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r7 = " has not been laid out. Completing operation "
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.StringBuilder r4 = r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "FragmentManager"
            android.util.Log.v(r7, r4)
            goto L564
        L562:
            r18 = r7
        L564:
            r8.completeSpecialEffect()
            goto L580
        L568:
            r18 = r7
            androidx.fragment.app.SpecialEffectsController$Operation r4 = r8.getOperation()
            androidx.fragment.app.Fragment r4 = r4.getFragment()
            androidx.core.os.CancellationSignal r7 = r8.getSignal()
            r19 = r9
            androidx.fragment.app.DefaultSpecialEffectsController$9 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$9
            r9.<init>(r6, r8)
            r14.setListenerForTransitionEnd(r4, r3, r7, r9)
        L580:
            r4 = r17
            r7 = r18
            goto L4ec
        L586:
            r17 = r4
            android.view.ViewGroup r4 = r38.getContainer()
            boolean r4 = androidx.core.view.ViewCompat.isLaidOut(r4)
            if (r4 != 0) goto L593
            return r2
        L593:
            r4 = 4
            androidx.fragment.app.FragmentTransition.setViewVisibility(r1, r4)
            java.util.ArrayList r4 = r14.prepareSetNameOverridesReordered(r5)
            android.view.ViewGroup r7 = r38.getContainer()
            r14.beginDelayedTransition(r7, r3)
            android.view.ViewGroup r7 = r38.getContainer()
            r11 = r14
            r8 = r12
            r12 = r7
            r7 = r13
            r13 = r26
            r9 = r14
            r14 = r5
            r15 = r4
            r16 = r33
            r11.setNameOverridesReordered(r12, r13, r14, r15, r16)
            r11 = 0
            androidx.fragment.app.FragmentTransition.setViewVisibility(r1, r11)
            r11 = r26
            r9.swapSharedElementTargets(r0, r11, r5)
            return r2
    }

    void applyContainerChanges(androidx.fragment.app.SpecialEffectsController.Operation r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            android.view.View r0 = r0.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r3.getFinalState()
            r1.applyState(r0)
            return
    }

    void captureTransitioningViews(java.util.ArrayList<android.view.View> r6, android.view.View r7) {
            r5 = this;
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2f
            r0 = r7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
            if (r1 == 0) goto L17
            boolean r1 = r6.contains(r7)
            if (r1 != 0) goto L2e
            r6.add(r0)
            goto L2e
        L17:
            int r1 = r0.getChildCount()
            r2 = 0
        L1c:
            if (r2 >= r1) goto L2e
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L2b
            r5.captureTransitioningViews(r6, r3)
        L2b:
            int r2 = r2 + 1
            goto L1c
        L2e:
            goto L38
        L2f:
            boolean r0 = r6.contains(r7)
            if (r0 != 0) goto L38
            r6.add(r7)
        L38:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r13, boolean r14) {
            r12 = this;
            r0 = 0
            r1 = 0
            java.util.Iterator r2 = r13.iterator()
        L6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
            androidx.fragment.app.Fragment r4 = r3.getFragment()
            android.view.View r4 = r4.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r4)
            int[] r5 = androidx.fragment.app.DefaultSpecialEffectsController.C024310.f39xe493b431
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r3.getFinalState()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto L32;
                case 2: goto L32;
                case 3: goto L32;
                case 4: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L39
        L2c:
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 == r5) goto L39
            r1 = r3
            goto L39
        L32:
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r4 != r5) goto L39
            if (r0 != 0) goto L39
            r0 = r3
        L39:
            goto L6
        L3a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r9 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r13)
            r10 = r3
            java.util.Iterator r3 = r13.iterator()
        L4f:
            boolean r4 = r3.hasNext()
            r11 = 1
            if (r4 == 0) goto L8f
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            androidx.core.os.CancellationSignal r5 = new androidx.core.os.CancellationSignal
            r5.<init>()
            r4.markStartedSpecialEffect(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r6 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r6.<init>(r4, r5, r14)
            r2.add(r6)
            androidx.core.os.CancellationSignal r6 = new androidx.core.os.CancellationSignal
            r6.<init>()
            r4.markStartedSpecialEffect(r6)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r7 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r8 = 0
            if (r14 == 0) goto L7c
            if (r4 != r0) goto L7f
            goto L7e
        L7c:
            if (r4 != r1) goto L7f
        L7e:
            goto L80
        L7f:
            r11 = r8
        L80:
            r7.<init>(r4, r6, r14, r11)
            r9.add(r7)
            androidx.fragment.app.DefaultSpecialEffectsController$1 r7 = new androidx.fragment.app.DefaultSpecialEffectsController$1
            r7.<init>(r12, r10, r4)
            r4.addCompletionListener(r7)
            goto L4f
        L8f:
            r3 = r12
            r4 = r9
            r5 = r10
            r6 = r14
            r7 = r0
            r8 = r1
            java.util.Map r3 = r3.startTransitions(r4, r5, r6, r7, r8)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            boolean r4 = r3.containsValue(r4)
            r12.startAnimations(r2, r10, r4, r3)
            java.util.Iterator r5 = r10.iterator()
        La8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6
            r12.applyContainerChanges(r6)
            goto La8
        Lb8:
            r10.clear()
            return
    }

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> r7, android.view.View r8) {
            r6 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r8)
            if (r0 == 0) goto L9
            r7.put(r0, r8)
        L9:
            boolean r1 = r8 instanceof android.view.ViewGroup
            if (r1 == 0) goto L27
            r1 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
        L15:
            if (r3 >= r2) goto L27
            android.view.View r4 = r1.getChildAt(r3)
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L24
            r6.findNamedViews(r7, r4)
        L24:
            int r3 = r3 + 1
            goto L15
        L27:
            return
    }

    void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> r4, java.util.Collection<java.lang.String> r5) {
            r3 = this;
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            android.view.View r2 = (android.view.View) r2
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r2)
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L27
            r0.remove()
        L27:
            goto L8
        L28:
            return
    }
}
