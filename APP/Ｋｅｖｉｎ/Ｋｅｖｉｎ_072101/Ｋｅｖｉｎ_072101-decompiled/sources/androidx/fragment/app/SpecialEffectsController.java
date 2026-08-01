package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
abstract class SpecialEffectsController {
    private final android.view.ViewGroup mContainer;
    boolean mIsContainerPostponed;
    boolean mOperationDirectionIsPop;
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mPendingOperations;
    final java.util.ArrayList<androidx.fragment.app.SpecialEffectsController.Operation> mRunningOperations;



    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$3 */
    static /* synthetic */ class C03103 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact */
        static final /* synthetic */ int[] f40xb9e640f0 = null;

        /* JADX INFO: renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State */
        static final /* synthetic */ int[] f41xe493b431 = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.SpecialEffectsController.C03103.f40xb9e640f0 = r0
                r0 = 1
                int[] r1 = androidx.fragment.app.SpecialEffectsController.C03103.f40xb9e640f0     // Catch: java.lang.NoSuchFieldError -> L15
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = androidx.fragment.app.SpecialEffectsController.C03103.f40xb9e640f0     // Catch: java.lang.NoSuchFieldError -> L22
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = androidx.fragment.app.SpecialEffectsController.C03103.f40xb9e640f0     // Catch: java.lang.NoSuchFieldError -> L2f
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                androidx.fragment.app.SpecialEffectsController.C03103.f41xe493b431 = r3
                int[] r3 = androidx.fragment.app.SpecialEffectsController.C03103.f41xe493b431     // Catch: java.lang.NoSuchFieldError -> L44
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r0 = move-exception
            L45:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.C03103.f41xe493b431     // Catch: java.lang.NoSuchFieldError -> L50
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L50
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r0 = move-exception
            L51:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.C03103.f41xe493b431     // Catch: java.lang.NoSuchFieldError -> L5c
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L5c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5c
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5c
                goto L5d
            L5c:
                r0 = move-exception
            L5d:
                int[] r0 = androidx.fragment.app.SpecialEffectsController.C03103.f41xe493b431     // Catch: java.lang.NoSuchFieldError -> L69
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
                goto L6a
            L69:
                r0 = move-exception
            L6a:
                return
        }
    }

    private static class FragmentStateManagerOperation extends androidx.fragment.app.SpecialEffectsController.Operation {
        private final androidx.fragment.app.FragmentStateManager mFragmentStateManager;

        FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State r2, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, androidx.fragment.app.FragmentStateManager r4, androidx.core.os.CancellationSignal r5) {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r4.getFragment()
                r1.<init>(r2, r3, r0, r5)
                r1.mFragmentStateManager = r4
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
                r1 = this;
                super.complete()
                androidx.fragment.app.FragmentStateManager r0 = r1.mFragmentStateManager
                r0.moveToExpectedState()
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        void onStart() {
                r5 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r5.getLifecycleImpact()
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                if (r0 != r1) goto L72
                androidx.fragment.app.FragmentStateManager r0 = r5.mFragmentStateManager
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r1 = r0.mView
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L42
                r0.setFocusedView(r1)
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L42
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "requestFocus: Saved focused view "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.String r3 = " for Fragment "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "FragmentManager"
                android.util.Log.v(r3, r2)
            L42:
                androidx.fragment.app.Fragment r2 = r5.getFragment()
                android.view.View r2 = r2.requireView()
                android.view.ViewParent r3 = r2.getParent()
                r4 = 0
                if (r3 != 0) goto L59
                androidx.fragment.app.FragmentStateManager r3 = r5.mFragmentStateManager
                r3.addViewToContainer()
                r2.setAlpha(r4)
            L59:
                float r3 = r2.getAlpha()
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L6b
                int r3 = r2.getVisibility()
                if (r3 != 0) goto L6b
                r3 = 4
                r2.setVisibility(r3)
            L6b:
                float r3 = r0.getPostOnViewCreatedAlpha()
                r2.setAlpha(r3)
            L72:
                return
        }
    }

    static class Operation {
        private final java.util.List<java.lang.Runnable> mCompletionListeners;
        private androidx.fragment.app.SpecialEffectsController.Operation.State mFinalState;
        private final androidx.fragment.app.Fragment mFragment;
        private boolean mIsCanceled;
        private boolean mIsComplete;
        private androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact mLifecycleImpact;
        private final java.util.HashSet<androidx.core.os.CancellationSignal> mSpecialEffectsSignals;


        enum LifecycleImpact extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact ADDING = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact NONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact REMOVING = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "ADDING"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "REMOVING"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = new androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[]{r0, r1, r2}
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES = r0
                    return
            }

            LifecycleImpact(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact> r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.class
                    java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact) r0
                    return r0
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[]) r0
                    return r0
            }
        }

        enum State extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.State> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.State[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State GONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State INVISIBLE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State REMOVED = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State VISIBLE = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "VISIBLE"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "GONE"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.GONE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "INVISIBLE"
                    r2 = 3
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = new androidx.fragment.app.SpecialEffectsController.Operation.State[]{r0, r1, r2, r3}
                    androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES = r0
                    return
            }

            State(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            static androidx.fragment.app.SpecialEffectsController.Operation.State from(int r3) {
                    switch(r3) {
                        case 0: goto L22;
                        case 4: goto L1f;
                        case 8: goto L1c;
                        default: goto L3;
                    }
                L3:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unknown visibility "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L1c:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                    return r0
                L1f:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r0
                L22:
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                    return r0
            }

            static androidx.fragment.app.SpecialEffectsController.Operation.State from(android.view.View r2) {
                    float r0 = r2.getAlpha()
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L12
                    int r0 = r2.getVisibility()
                    if (r0 != 0) goto L12
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    return r0
                L12:
                    int r0 = r2.getVisibility()
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = from(r0)
                    return r0
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$State> r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.class
                    java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = (androidx.fragment.app.SpecialEffectsController.Operation.State) r0
                    return r0
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.State[]) r0
                    return r0
            }

            void applyState(android.view.View r5) {
                    r4 = this;
                    int[] r0 = androidx.fragment.app.SpecialEffectsController.C03103.f41xe493b431
                    int r1 = r4.ordinal()
                    r0 = r0[r1]
                    java.lang.String r1 = "SpecialEffectsController: Setting view "
                    java.lang.String r2 = "FragmentManager"
                    r3 = 2
                    switch(r0) {
                        case 1: goto L83;
                        case 2: goto L5e;
                        case 3: goto L38;
                        case 4: goto L12;
                        default: goto L10;
                    }
                L10:
                    goto Lb4
                L12:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L32
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r5)
                    java.lang.String r1 = " to INVISIBLE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L32:
                    r0 = 4
                    r5.setVisibility(r0)
                    goto Lb4
                L38:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L58
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r5)
                    java.lang.String r1 = " to GONE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L58:
                    r0 = 8
                    r5.setVisibility(r0)
                    goto Lb4
                L5e:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r0 == 0) goto L7e
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r5)
                    java.lang.String r1 = " to VISIBLE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L7e:
                    r0 = 0
                    r5.setVisibility(r0)
                    goto Lb4
                L83:
                    android.view.ViewParent r0 = r5.getParent()
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    if (r0 == 0) goto Lb4
                    boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                    if (r1 == 0) goto Lb1
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r3 = "SpecialEffectsController: Removing view "
                    java.lang.StringBuilder r1 = r1.append(r3)
                    java.lang.StringBuilder r1 = r1.append(r5)
                    java.lang.String r3 = " from container "
                    java.lang.StringBuilder r1 = r1.append(r3)
                    java.lang.StringBuilder r1 = r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.v(r2, r1)
                Lb1:
                    r0.removeView(r5)
                Lb4:
                    return
            }
        }

        Operation(androidx.fragment.app.SpecialEffectsController.Operation.State r2, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, androidx.fragment.app.Fragment r4, androidx.core.os.CancellationSignal r5) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCompletionListeners = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mSpecialEffectsSignals = r0
                r0 = 0
                r1.mIsCanceled = r0
                r1.mIsComplete = r0
                r1.mFinalState = r2
                r1.mLifecycleImpact = r3
                r1.mFragment = r4
                androidx.fragment.app.SpecialEffectsController$Operation$1 r0 = new androidx.fragment.app.SpecialEffectsController$Operation$1
                r0.<init>(r1)
                r5.setOnCancelListener(r0)
                return
        }

        final void addCompletionListener(java.lang.Runnable r2) {
                r1 = this;
                java.util.List<java.lang.Runnable> r0 = r1.mCompletionListeners
                r0.add(r2)
                return
        }

        final void cancel() {
                r3 = this;
                boolean r0 = r3.isCanceled()
                if (r0 == 0) goto L7
                return
            L7:
                r0 = 1
                r3.mIsCanceled = r0
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r3.mSpecialEffectsSignals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L16
                r3.complete()
                goto L31
            L16:
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.HashSet<androidx.core.os.CancellationSignal> r1 = r3.mSpecialEffectsSignals
                r0.<init>(r1)
                java.util.Iterator r1 = r0.iterator()
            L21:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L31
                java.lang.Object r2 = r1.next()
                androidx.core.os.CancellationSignal r2 = (androidx.core.os.CancellationSignal) r2
                r2.cancel()
                goto L21
            L31:
                return
        }

        public void complete() {
                r2 = this;
                boolean r0 = r2.mIsComplete
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L2a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SpecialEffectsController: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = " has called complete."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L2a:
                r0 = 1
                r2.mIsComplete = r0
                java.util.List<java.lang.Runnable> r0 = r2.mCompletionListeners
                java.util.Iterator r0 = r0.iterator()
            L33:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L43
                java.lang.Object r1 = r0.next()
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r1.run()
                goto L33
            L43:
                return
        }

        public final void completeSpecialEffect(androidx.core.os.CancellationSignal r2) {
                r1 = this;
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                boolean r0 = r0.remove(r2)
                if (r0 == 0) goto L13
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L13
                r1.complete()
            L13:
                return
        }

        public androidx.fragment.app.SpecialEffectsController.Operation.State getFinalState() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r1.mFinalState
                return r0
        }

        public final androidx.fragment.app.Fragment getFragment() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.mFragment
                return r0
        }

        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r1.mLifecycleImpact
                return r0
        }

        final boolean isCanceled() {
                r1 = this;
                boolean r0 = r1.mIsCanceled
                return r0
        }

        final boolean isComplete() {
                r1 = this;
                boolean r0 = r1.mIsComplete
                return r0
        }

        public final void markStartedSpecialEffect(androidx.core.os.CancellationSignal r2) {
                r1 = this;
                r1.onStart()
                java.util.HashSet<androidx.core.os.CancellationSignal> r0 = r1.mSpecialEffectsSignals
                r0.add(r2)
                return
        }

        final void mergeWith(androidx.fragment.app.SpecialEffectsController.Operation.State r7, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r8) {
                r6 = this;
                int[] r0 = androidx.fragment.app.SpecialEffectsController.C03103.f40xb9e640f0
                int r1 = r8.ordinal()
                r0 = r0[r1]
                java.lang.String r1 = " mFinalState = "
                java.lang.String r2 = "SpecialEffectsController: For fragment "
                java.lang.String r3 = "FragmentManager"
                r4 = 2
                switch(r0) {
                    case 1: goto L95;
                    case 2: goto L54;
                    case 3: goto L14;
                    default: goto L12;
                }
            L12:
                goto Ld1
            L14:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r6.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r0 == r5) goto Ld1
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r2)
                androidx.fragment.app.Fragment r2 = r6.mFragment
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r6.mFinalState
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " -> "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.String r1 = ". "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r3, r0)
            L50:
                r6.mFinalState = r7
                goto Ld1
            L54:
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
                if (r0 == 0) goto L8c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r2)
                androidx.fragment.app.Fragment r2 = r6.mFragment
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r6.mFinalState
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " -> REMOVED. mLifecycleImpact  = "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r6.mLifecycleImpact
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " to REMOVING."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r3, r0)
            L8c:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                r6.mFinalState = r0
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                r6.mLifecycleImpact = r0
                goto Ld1
            L95:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r6.mFinalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r0 != r1) goto Ld1
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
                if (r0 == 0) goto Lc9
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r2)
                androidx.fragment.app.Fragment r1 = r6.mFragment
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r6.mLifecycleImpact
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " to ADDING."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r3, r0)
            Lc9:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r6.mFinalState = r0
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                r6.mLifecycleImpact = r0
            Ld1:
                return
        }

        void onStart() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Operation "
                r0.append(r1)
                java.lang.String r1 = "{"
                r0.append(r1)
                int r2 = java.lang.System.identityHashCode(r4)
                java.lang.String r2 = java.lang.Integer.toHexString(r2)
                r0.append(r2)
                java.lang.String r2 = "} "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mFinalState = "
                r0.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r4.mFinalState
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r3 = "mLifecycleImpact = "
                r0.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r4.mLifecycleImpact
                r0.append(r3)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "mFragment = "
                r0.append(r1)
                androidx.fragment.app.Fragment r1 = r4.mFragment
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    SpecialEffectsController(android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mPendingOperations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mRunningOperations = r0
            r0 = 0
            r1.mOperationDirectionIsPop = r0
            r1.mIsContainerPostponed = r0
            r1.mContainer = r2
            return
    }

    private void enqueue(androidx.fragment.app.SpecialEffectsController.Operation.State r6, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r7, androidx.fragment.app.FragmentStateManager r8) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r5.mPendingOperations
            monitor-enter(r0)
            androidx.core.os.CancellationSignal r1 = new androidx.core.os.CancellationSignal     // Catch: java.lang.Throwable -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L34
            androidx.fragment.app.Fragment r2 = r8.getFragment()     // Catch: java.lang.Throwable -> L34
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r5.findPendingOperation(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L18
            r2.mergeWith(r6, r7)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L18:
            androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation r3 = new androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation     // Catch: java.lang.Throwable -> L34
            r3.<init>(r6, r7, r8, r1)     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r5.mPendingOperations     // Catch: java.lang.Throwable -> L34
            r4.add(r3)     // Catch: java.lang.Throwable -> L34
            androidx.fragment.app.SpecialEffectsController$1 r4 = new androidx.fragment.app.SpecialEffectsController$1     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L34
            r3.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L34
            androidx.fragment.app.SpecialEffectsController$2 r4 = new androidx.fragment.app.SpecialEffectsController$2     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L34
            r3.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r1
    }

    private androidx.fragment.app.SpecialEffectsController.Operation findPendingOperation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L23
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L23
            return r1
        L23:
            goto L6
        L24:
            r0 = 0
            return r0
    }

    private androidx.fragment.app.SpecialEffectsController.Operation findRunningOperation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.mRunningOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L23
            boolean r2 = r1.isCanceled()
            if (r2 != 0) goto L23
            return r1
        L23:
            goto L6
        L24:
            r0 = 0
            return r0
    }

    static androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r2, androidx.fragment.app.FragmentManager r3) {
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r3.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r1 = getOrCreateController(r2, r0)
            return r1
    }

    static androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r3, androidx.fragment.app.SpecialEffectsControllerFactory r4) {
            int r0 = androidx.fragment.C0240R.id.special_effects_controller_view_tag
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.SpecialEffectsController
            if (r1 == 0) goto Le
            r1 = r0
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            return r1
        Le:
            androidx.fragment.app.SpecialEffectsController r1 = r4.createController(r3)
            int r2 = androidx.fragment.C0240R.id.special_effects_controller_view_tag
            r3.setTag(r2, r1)
            return r1
    }

    private void updateFinalState() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r6.mPendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = r1.getLifecycleImpact()
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r2 != r3) goto L2f
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r3 = r2.requireView()
            int r4 = r3.getVisibility()
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r4)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r5 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r1.mergeWith(r4, r5)
        L2f:
            goto L6
        L30:
            return
    }

    void enqueueAdd(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.FragmentStateManager r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing add operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L23:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            r2.enqueue(r3, r0, r4)
            return
    }

    void enqueueHide(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L23:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    void enqueueRemove(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L23:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            r2.enqueue(r0, r1, r3)
            return
    }

    void enqueueShow(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing show operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L23:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    abstract void executeOperations(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r1, boolean r2);

    void executePendingOperations() {
            r8 = this;
            boolean r0 = r8.mIsContainerPostponed
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r8.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            r1 = 0
            if (r0 != 0) goto L14
            r8.forceCompleteAllOperations()
            r8.mOperationDirectionIsPop = r1
            return
        L14:
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r8.mPendingOperations
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r8.mPendingOperations     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto L98
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r8.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r8.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r3.clear()     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L9a
        L2f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L69
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L9a
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4     // Catch: java.lang.Throwable -> L9a
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L5a
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r6.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = "SpecialEffectsController: Cancelling operation "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r6 = r6.append(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L9a
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> L9a
        L5a:
            r4.cancel()     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r4.isComplete()     // Catch: java.lang.Throwable -> L9a
            if (r5 != 0) goto L68
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r5 = r8.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r5.add(r4)     // Catch: java.lang.Throwable -> L9a
        L68:
            goto L2f
        L69:
            r8.updateFinalState()     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r8.mPendingOperations     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r8.mPendingOperations     // Catch: java.lang.Throwable -> L9a
            r4.clear()     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r8.mRunningOperations     // Catch: java.lang.Throwable -> L9a
            r4.addAll(r3)     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L9a
        L81:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L91
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L9a
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5     // Catch: java.lang.Throwable -> L9a
            r5.onStart()     // Catch: java.lang.Throwable -> L9a
            goto L81
        L91:
            boolean r4 = r8.mOperationDirectionIsPop     // Catch: java.lang.Throwable -> L9a
            r8.executeOperations(r3, r4)     // Catch: java.lang.Throwable -> L9a
            r8.mOperationDirectionIsPop = r1     // Catch: java.lang.Throwable -> L9a
        L98:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            return
        L9a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            throw r1
    }

    void forceCompleteAllOperations() {
            r11 = this;
            android.view.ViewGroup r0 = r11.mContainer
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r11.mPendingOperations
            monitor-enter(r1)
            r11.updateFinalState()     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r11.mPendingOperations     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Leb
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Leb
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3     // Catch: java.lang.Throwable -> Leb
            r3.onStart()     // Catch: java.lang.Throwable -> Leb
            goto L12
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r11.mRunningOperations     // Catch: java.lang.Throwable -> Leb
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> Leb
        L2d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Leb
            r5 = 2
            if (r4 == 0) goto L86
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Leb
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4     // Catch: java.lang.Throwable -> Leb
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)     // Catch: java.lang.Throwable -> Leb
            if (r5 == 0) goto L82
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r6.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = "SpecialEffectsController: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            if (r0 == 0) goto L52
            java.lang.String r7 = ""
            goto L6d
        L52:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r7.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r8 = "Container "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Leb
            android.view.ViewGroup r8 = r11.mContainer     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r8 = " is not attached to window. "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Leb
        L6d:
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r7 = "Cancelling running operation "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r6 = r6.append(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Leb
            android.util.Log.v(r5, r6)     // Catch: java.lang.Throwable -> Leb
        L82:
            r4.cancel()     // Catch: java.lang.Throwable -> Leb
            goto L2d
        L86:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r11.mPendingOperations     // Catch: java.lang.Throwable -> Leb
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> Leb
        L91:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r6 == 0) goto Le9
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Leb
            androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6     // Catch: java.lang.Throwable -> Leb
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto Le5
            java.lang.String r7 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r8.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r9 = "SpecialEffectsController: "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> Leb
            if (r0 == 0) goto Lb5
            java.lang.String r9 = ""
            goto Ld0
        Lb5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r9.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r10 = "Container "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> Leb
            android.view.ViewGroup r10 = r11.mContainer     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r10 = " is not attached to window. "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Leb
        Ld0:
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r9 = "Cancelling pending operation "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r8 = r8.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Leb
            android.util.Log.v(r7, r8)     // Catch: java.lang.Throwable -> Leb
        Le5:
            r6.cancel()     // Catch: java.lang.Throwable -> Leb
            goto L91
        Le9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Leb
            return
        Leb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Leb
            throw r2
    }

    void forcePostponedExecutePendingOperations() {
            r1 = this;
            boolean r0 = r1.mIsContainerPostponed
            if (r0 == 0) goto La
            r0 = 0
            r1.mIsContainerPostponed = r0
            r1.executePendingOperations()
        La:
            return
    }

    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(androidx.fragment.app.FragmentStateManager r5) {
            r4 = this;
            r0 = 0
            androidx.fragment.app.Fragment r1 = r5.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.findPendingOperation(r1)
            if (r1 == 0) goto Lf
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r1.getLifecycleImpact()
        Lf:
            androidx.fragment.app.Fragment r2 = r5.getFragment()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r4.findRunningOperation(r2)
            if (r2 == 0) goto L24
            if (r0 == 0) goto L1f
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            if (r0 != r3) goto L24
        L1f:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = r2.getLifecycleImpact()
            return r3
        L24:
            return r0
    }

    public android.view.ViewGroup getContainer() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mContainer
            return r0
    }

    void markPostponedState() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r6.mPendingOperations
            monitor-enter(r0)
            r6.updateFinalState()     // Catch: java.lang.Throwable -> L41
            r1 = 0
            r6.mIsContainerPostponed = r1     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r1 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L41
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L41
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L3f
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r6.mPendingOperations     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.Fragment r3 = r2.getFragment()     // Catch: java.lang.Throwable -> L41
            android.view.View r3 = r3.mView     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r3)     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r2.getFinalState()     // Catch: java.lang.Throwable -> L41
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L41
            if (r4 != r5) goto L3c
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L41
            if (r3 == r4) goto L3c
            androidx.fragment.app.Fragment r4 = r2.getFragment()     // Catch: java.lang.Throwable -> L41
            boolean r5 = r4.isPostponed()     // Catch: java.lang.Throwable -> L41
            r6.mIsContainerPostponed = r5     // Catch: java.lang.Throwable -> L41
            goto L3f
        L3c:
            int r1 = r1 + (-1)
            goto L11
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r1
    }

    void updateOperationDirection(boolean r1) {
            r0 = this;
            r0.mOperationDirectionIsPop = r1
            return
    }
}
