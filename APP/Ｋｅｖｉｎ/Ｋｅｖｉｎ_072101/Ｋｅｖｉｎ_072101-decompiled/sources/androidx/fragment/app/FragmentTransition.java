package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class FragmentTransition {
    private static final int[] INVERSE_OPS = null;
    static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = null;
    static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = null;







    interface Callback {
        void onComplete(androidx.fragment.app.Fragment r1, androidx.core.os.CancellationSignal r2);

        void onStart(androidx.fragment.app.Fragment r1, androidx.core.os.CancellationSignal r2);
    }

    static class FragmentContainerTransition {
        public androidx.fragment.app.Fragment firstOut;
        public boolean firstOutIsPop;
        public androidx.fragment.app.BackStackRecord firstOutTransaction;
        public androidx.fragment.app.Fragment lastIn;
        public boolean lastInIsPop;
        public androidx.fragment.app.BackStackRecord lastInTransaction;

        FragmentContainerTransition() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 11
            int[] r0 = new int[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10} // fill-array
            androidx.fragment.app.FragmentTransition.INVERSE_OPS = r0
            androidx.fragment.app.FragmentTransitionCompat21 r0 = new androidx.fragment.app.FragmentTransitionCompat21
            r0.<init>()
            androidx.fragment.app.FragmentTransition.PLATFORM_IMPL = r0
            androidx.fragment.app.FragmentTransitionImpl r0 = resolveSupportImpl()
            androidx.fragment.app.FragmentTransition.SUPPORT_IMPL = r0
            return
    }

    private FragmentTransition() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addSharedElementsWithMatchingNames(java.util.ArrayList<android.view.View> r3, androidx.collection.ArrayMap<java.lang.String, android.view.View> r4, java.util.Collection<java.lang.String> r5) {
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1e
            java.lang.Object r1 = r4.valueAt(r0)
            android.view.View r1 = (android.view.View) r1
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L1b
            r3.add(r1)
        L1b:
            int r0 = r0 + (-1)
            goto L6
        L1e:
            return
    }

    private static void addToFirstInLastOut(androidx.fragment.app.BackStackRecord r16, androidx.fragment.app.FragmentTransaction.C0291Op r17, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r18, boolean r19, boolean r20) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r4 = r1.mFragment
            if (r4 != 0) goto Ld
            return
        Ld:
            int r5 = r4.mContainerId
            if (r5 != 0) goto L12
            return
        L12:
            if (r3 == 0) goto L1b
            int[] r6 = androidx.fragment.app.FragmentTransition.INVERSE_OPS
            int r7 = r1.mCmd
            r6 = r6[r7]
            goto L1d
        L1b:
            int r6 = r1.mCmd
        L1d:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            switch(r6) {
                case 1: goto L88;
                case 2: goto L26;
                case 3: goto L5e;
                case 4: goto L3f;
                case 5: goto L28;
                case 6: goto L5e;
                case 7: goto L88;
                default: goto L26;
            }
        L26:
            goto L9a
        L28:
            if (r20 == 0) goto L3a
            boolean r13 = r4.mHiddenChanged
            if (r13 == 0) goto L37
            boolean r13 = r4.mHidden
            if (r13 != 0) goto L37
            boolean r13 = r4.mAdded
            if (r13 == 0) goto L37
            goto L38
        L37:
            r11 = r12
        L38:
            r7 = r11
            goto L3c
        L3a:
            boolean r7 = r4.mHidden
        L3c:
            r10 = 1
            goto L9a
        L3f:
            if (r20 == 0) goto L51
            boolean r13 = r4.mHiddenChanged
            if (r13 == 0) goto L4e
            boolean r13 = r4.mAdded
            if (r13 == 0) goto L4e
            boolean r13 = r4.mHidden
            if (r13 == 0) goto L4e
            goto L4f
        L4e:
            r11 = r12
        L4f:
            r9 = r11
            goto L5c
        L51:
            boolean r13 = r4.mAdded
            if (r13 == 0) goto L5a
            boolean r13 = r4.mHidden
            if (r13 != 0) goto L5a
            goto L5b
        L5a:
            r11 = r12
        L5b:
            r9 = r11
        L5c:
            r8 = 1
            goto L9a
        L5e:
            if (r20 == 0) goto L7b
            boolean r13 = r4.mAdded
            if (r13 != 0) goto L78
            android.view.View r13 = r4.mView
            if (r13 == 0) goto L78
            android.view.View r13 = r4.mView
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L78
            float r13 = r4.mPostponedAlpha
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 < 0) goto L78
            goto L79
        L78:
            r11 = r12
        L79:
            r9 = r11
            goto L86
        L7b:
            boolean r13 = r4.mAdded
            if (r13 == 0) goto L84
            boolean r13 = r4.mHidden
            if (r13 != 0) goto L84
            goto L85
        L84:
            r11 = r12
        L85:
            r9 = r11
        L86:
            r8 = 1
            goto L9a
        L88:
            if (r20 == 0) goto L8d
            boolean r7 = r4.mIsNewlyAdded
            goto L98
        L8d:
            boolean r13 = r4.mAdded
            if (r13 != 0) goto L96
            boolean r13 = r4.mHidden
            if (r13 != 0) goto L96
            goto L97
        L96:
            r11 = r12
        L97:
            r7 = r11
        L98:
            r10 = 1
        L9a:
            java.lang.Object r11 = r2.get(r5)
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r11 = (androidx.fragment.app.FragmentTransition.FragmentContainerTransition) r11
            if (r7 == 0) goto Lad
        La3:
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r11 = ensureContainer(r11, r2, r5)
            r11.lastIn = r4
            r11.lastInIsPop = r3
            r11.lastInTransaction = r0
        Lad:
            r12 = 0
            if (r20 != 0) goto Lcf
            if (r10 == 0) goto Lcf
            if (r11 == 0) goto Lba
            androidx.fragment.app.Fragment r13 = r11.firstOut
            if (r13 != r4) goto Lba
            r11.firstOut = r12
        Lba:
            boolean r13 = r0.mReorderingAllowed
            if (r13 != 0) goto Lcf
            androidx.fragment.app.FragmentManager r13 = r0.mManager
            androidx.fragment.app.FragmentStateManager r14 = r13.createOrGetFragmentStateManager(r4)
            androidx.fragment.app.FragmentStore r15 = r13.getFragmentStore()
            r15.makeActive(r14)
            r13.moveToState(r4)
        Lcf:
            if (r9 == 0) goto Le2
            if (r11 == 0) goto Ld7
            androidx.fragment.app.Fragment r13 = r11.firstOut
            if (r13 != 0) goto Le2
        Ld7:
        Ld8:
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r11 = ensureContainer(r11, r2, r5)
            r11.firstOut = r4
            r11.firstOutIsPop = r3
            r11.firstOutTransaction = r0
        Le2:
            if (r20 != 0) goto Lee
            if (r8 == 0) goto Lee
            if (r11 == 0) goto Lee
            androidx.fragment.app.Fragment r13 = r11.lastIn
            if (r13 != r4) goto Lee
            r11.lastIn = r12
        Lee:
            return
    }

    public static void calculateFragments(androidx.fragment.app.BackStackRecord r4, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r5, boolean r6) {
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r4.mOps
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L18
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r4.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0291Op) r2
            r3 = 0
            addToFirstInLastOut(r4, r2, r5, r3, r6)
            int r1 = r1 + 1
            goto L7
        L18:
            return
    }

    private static androidx.collection.ArrayMap<java.lang.String, java.lang.String> calculateNameOverrides(int r11, java.util.ArrayList<androidx.fragment.app.BackStackRecord> r12, java.util.ArrayList<java.lang.Boolean> r13, int r14, int r15) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            int r1 = r15 + (-1)
        L7:
            if (r1 < r14) goto L59
            java.lang.Object r2 = r12.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            boolean r3 = r2.interactsWith(r11)
            if (r3 != 0) goto L16
            goto L56
        L16:
            java.lang.Object r3 = r13.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.util.ArrayList<java.lang.String> r4 = r2.mSharedElementSourceNames
            if (r4 == 0) goto L56
            java.util.ArrayList<java.lang.String> r4 = r2.mSharedElementSourceNames
            int r4 = r4.size()
            if (r3 == 0) goto L31
            java.util.ArrayList<java.lang.String> r5 = r2.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r6 = r2.mSharedElementTargetNames
            goto L35
        L31:
            java.util.ArrayList<java.lang.String> r6 = r2.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r5 = r2.mSharedElementTargetNames
        L35:
            r7 = 0
        L36:
            if (r7 >= r4) goto L56
            java.lang.Object r8 = r6.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.remove(r9)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L50
            r0.put(r8, r10)
            goto L53
        L50:
            r0.put(r8, r9)
        L53:
            int r7 = r7 + 1
            goto L36
        L56:
            int r1 = r1 + (-1)
            goto L7
        L59:
            return r0
    }

    public static void calculatePopFragments(androidx.fragment.app.BackStackRecord r4, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r5, boolean r6) {
            androidx.fragment.app.FragmentManager r0 = r4.mManager
            androidx.fragment.app.FragmentContainer r0 = r0.getContainer()
            boolean r0 = r0.onHasView()
            if (r0 != 0) goto Ld
            return
        Ld:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r4.mOps
            int r0 = r0.size()
            int r1 = r0 + (-1)
        L15:
            if (r1 < 0) goto L26
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r4.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.C0291Op) r2
            r3 = 1
            addToFirstInLastOut(r4, r2, r5, r3, r6)
            int r1 = r1 + (-1)
            goto L15
        L26:
            return
    }

    static void callSharedElementStartEnd(androidx.fragment.app.Fragment r6, androidx.fragment.app.Fragment r7, boolean r8, androidx.collection.ArrayMap<java.lang.String, android.view.View> r9, boolean r10) {
            if (r8 == 0) goto L7
            androidx.core.app.SharedElementCallback r0 = r7.getEnterTransitionCallback()
            goto Lb
        L7:
            androidx.core.app.SharedElementCallback r0 = r6.getEnterTransitionCallback()
        Lb:
            if (r0 == 0) goto L3e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r9 != 0) goto L1c
            r3 = 0
            goto L20
        L1c:
            int r3 = r9.size()
        L20:
            r4 = 0
        L21:
            if (r4 >= r3) goto L34
            java.lang.Object r5 = r9.keyAt(r4)
            r2.add(r5)
            java.lang.Object r5 = r9.valueAt(r4)
            r1.add(r5)
            int r4 = r4 + 1
            goto L21
        L34:
            r4 = 0
            if (r10 == 0) goto L3b
            r0.onSharedElementStart(r2, r1, r4)
            goto L3e
        L3b:
            r0.onSharedElementEnd(r2, r1, r4)
        L3e:
            return
    }

    private static boolean canHandleAll(androidx.fragment.app.FragmentTransitionImpl r3, java.util.List<java.lang.Object> r4) {
            r0 = 0
            int r1 = r4.size()
        L5:
            if (r0 >= r1) goto L16
            java.lang.Object r2 = r4.get(r0)
            boolean r2 = r3.canHandle(r2)
            if (r2 != 0) goto L13
            r2 = 0
            return r2
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            r0 = 1
            return r0
    }

    static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureInSharedElements(androidx.fragment.app.FragmentTransitionImpl r11, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r12, java.lang.Object r13, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r14) {
            androidx.fragment.app.Fragment r0 = r14.lastIn
            android.view.View r1 = r0.getView()
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L7f
            if (r13 == 0) goto L7f
            if (r1 != 0) goto L12
            goto L7f
        L12:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r11.findNamedViews(r2, r1)
            androidx.fragment.app.BackStackRecord r3 = r14.lastInTransaction
            boolean r4 = r14.lastInIsPop
            if (r4 == 0) goto L27
            androidx.core.app.SharedElementCallback r4 = r0.getExitTransitionCallback()
            java.util.ArrayList<java.lang.String> r5 = r3.mSharedElementSourceNames
            goto L2d
        L27:
            androidx.core.app.SharedElementCallback r4 = r0.getEnterTransitionCallback()
            java.util.ArrayList<java.lang.String> r5 = r3.mSharedElementTargetNames
        L2d:
            if (r5 == 0) goto L39
            r2.retainAll(r5)
            java.util.Collection r6 = r12.values()
            r2.retainAll(r6)
        L39:
            if (r4 == 0) goto L7b
            r4.onMapSharedElements(r5, r2)
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L44:
            if (r6 < 0) goto L7a
            java.lang.Object r7 = r5.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.get(r7)
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L5e
            java.lang.String r9 = findKeyForValue(r12, r7)
            if (r9 == 0) goto L76
            r12.remove(r9)
            goto L76
        L5e:
            java.lang.String r9 = androidx.core.view.ViewCompat.getTransitionName(r8)
            boolean r9 = r7.equals(r9)
            if (r9 != 0) goto L76
            java.lang.String r9 = findKeyForValue(r12, r7)
            if (r9 == 0) goto L77
            java.lang.String r10 = androidx.core.view.ViewCompat.getTransitionName(r8)
            r12.put(r9, r10)
            goto L77
        L76:
        L77:
            int r6 = r6 + (-1)
            goto L44
        L7a:
            goto L7e
        L7b:
            retainValues(r12, r2)
        L7e:
            return r2
        L7f:
            r12.clear()
            r2 = 0
            return r2
    }

    private static androidx.collection.ArrayMap<java.lang.String, android.view.View> captureOutSharedElements(androidx.fragment.app.FragmentTransitionImpl r10, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r11, java.lang.Object r12, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r13) {
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L71
            if (r12 != 0) goto L9
            goto L71
        L9:
            androidx.fragment.app.Fragment r0 = r13.firstOut
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            android.view.View r2 = r0.requireView()
            r10.findNamedViews(r1, r2)
            androidx.fragment.app.BackStackRecord r2 = r13.firstOutTransaction
            boolean r3 = r13.firstOutIsPop
            if (r3 == 0) goto L24
            androidx.core.app.SharedElementCallback r3 = r0.getEnterTransitionCallback()
            java.util.ArrayList<java.lang.String> r4 = r2.mSharedElementTargetNames
            goto L2a
        L24:
            androidx.core.app.SharedElementCallback r3 = r0.getExitTransitionCallback()
            java.util.ArrayList<java.lang.String> r4 = r2.mSharedElementSourceNames
        L2a:
            if (r4 == 0) goto L2f
            r1.retainAll(r4)
        L2f:
            if (r3 == 0) goto L69
            r3.onMapSharedElements(r4, r1)
            int r5 = r4.size()
            int r5 = r5 + (-1)
        L3a:
            if (r5 < 0) goto L68
            java.lang.Object r6 = r4.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.get(r6)
            android.view.View r7 = (android.view.View) r7
            if (r7 != 0) goto L4e
            r11.remove(r6)
            goto L65
        L4e:
            java.lang.String r8 = androidx.core.view.ViewCompat.getTransitionName(r7)
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L65
            java.lang.Object r8 = r11.remove(r6)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = androidx.core.view.ViewCompat.getTransitionName(r7)
            r11.put(r9, r8)
        L65:
            int r5 = r5 + (-1)
            goto L3a
        L68:
            goto L70
        L69:
            java.util.Set r5 = r1.keySet()
            r11.retainAll(r5)
        L70:
            return r1
        L71:
            r11.clear()
            r0 = 0
            return r0
    }

    private static androidx.fragment.app.FragmentTransitionImpl chooseImpl(androidx.fragment.app.Fragment r4, androidx.fragment.app.Fragment r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L22
            java.lang.Object r1 = r4.getExitTransition()
            if (r1 == 0) goto L10
            r0.add(r1)
        L10:
            java.lang.Object r2 = r4.getReturnTransition()
            if (r2 == 0) goto L19
            r0.add(r2)
        L19:
            java.lang.Object r3 = r4.getSharedElementReturnTransition()
            if (r3 == 0) goto L22
            r0.add(r3)
        L22:
            if (r5 == 0) goto L3f
            java.lang.Object r1 = r5.getEnterTransition()
            if (r1 == 0) goto L2d
            r0.add(r1)
        L2d:
            java.lang.Object r2 = r5.getReenterTransition()
            if (r2 == 0) goto L36
            r0.add(r2)
        L36:
            java.lang.Object r3 = r5.getSharedElementEnterTransition()
            if (r3 == 0) goto L3f
            r0.add(r3)
        L3f:
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L47
            return r2
        L47:
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r1 == 0) goto L56
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            boolean r1 = canHandleAll(r1, r0)
            if (r1 == 0) goto L56
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            return r1
        L56:
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r1 == 0) goto L65
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            boolean r1 = canHandleAll(r1, r0)
            if (r1 == 0) goto L65
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            return r1
        L65:
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r1 != 0) goto L6e
            androidx.fragment.app.FragmentTransitionImpl r1 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r1 != 0) goto L6e
            return r2
        L6e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid Transition types"
            r1.<init>(r2)
            throw r1
    }

    static java.util.ArrayList<android.view.View> configureEnteringExitingViews(androidx.fragment.app.FragmentTransitionImpl r3, java.lang.Object r4, androidx.fragment.app.Fragment r5, java.util.ArrayList<android.view.View> r6, android.view.View r7) {
            r0 = 0
            if (r4 == 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r1
            android.view.View r1 = r5.getView()
            if (r1 == 0) goto L12
            r3.captureTransitioningViews(r0, r1)
        L12:
            if (r6 == 0) goto L17
            r0.removeAll(r6)
        L17:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L23
            r0.add(r7)
            r3.addTargets(r4, r0)
        L23:
            return r0
    }

    private static java.lang.Object configureSharedElementsOrdered(androidx.fragment.app.FragmentTransitionImpl r22, android.view.ViewGroup r23, android.view.View r24, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r25, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r26, java.util.ArrayList<android.view.View> r27, java.util.ArrayList<android.view.View> r28, java.lang.Object r29, java.lang.Object r30) {
            r13 = r22
            r14 = r26
            r15 = r27
            r12 = r29
            androidx.fragment.app.Fragment r11 = r14.lastIn
            androidx.fragment.app.Fragment r10 = r14.firstOut
            r0 = 0
            if (r11 == 0) goto La4
            if (r10 != 0) goto L19
            r1 = r23
            r20 = r10
            r21 = r11
            goto Laa
        L19:
            boolean r9 = r14.lastInIsPop
            boolean r1 = r25.isEmpty()
            if (r1 == 0) goto L23
            r1 = r0
            goto L27
        L23:
            java.lang.Object r1 = getSharedElementTransition(r13, r11, r10, r9)
        L27:
            r8 = r25
            androidx.collection.ArrayMap r7 = captureOutSharedElements(r13, r8, r1, r14)
            boolean r2 = r25.isEmpty()
            if (r2 == 0) goto L37
            r1 = 0
            r6 = r1
            goto L3f
        L37:
            java.util.Collection r2 = r7.values()
            r15.addAll(r2)
            r6 = r1
        L3f:
            if (r12 != 0) goto L46
            if (r30 != 0) goto L46
            if (r6 != 0) goto L46
            return r0
        L46:
            r0 = 1
            callSharedElementStartEnd(r11, r10, r9, r7, r0)
            if (r6 == 0) goto L77
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5 = r0
            r4 = r24
            r13.setSharedElementTargets(r6, r4, r15)
            boolean r3 = r14.firstOutIsPop
            androidx.fragment.app.BackStackRecord r2 = r14.firstOutTransaction
            r0 = r22
            r1 = r6
            r16 = r2
            r2 = r30
            r17 = r3
            r3 = r7
            r4 = r17
            r18 = r7
            r7 = r5
            r5 = r16
            setOutEpicenter(r0, r1, r2, r3, r4, r5)
            if (r12 == 0) goto L74
            r13.setEpicenter(r12, r7)
        L74:
            r16 = r7
            goto L7c
        L77:
            r18 = r7
            r5 = 0
            r16 = r5
        L7c:
            r3 = r6
            androidx.fragment.app.FragmentTransition$6 r7 = new androidx.fragment.app.FragmentTransition$6
            r0 = r7
            r1 = r22
            r2 = r25
            r4 = r26
            r5 = r28
            r17 = r6
            r6 = r24
            r13 = r7
            r7 = r11
            r8 = r10
            r19 = r9
            r20 = r10
            r10 = r27
            r21 = r11
            r11 = r29
            r12 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r23
            androidx.core.view.OneShotPreDrawListener.add(r1, r13)
            return r17
        La4:
            r1 = r23
            r20 = r10
            r21 = r11
        Laa:
            return r0
    }

    private static java.lang.Object configureSharedElementsReordered(androidx.fragment.app.FragmentTransitionImpl r22, android.view.ViewGroup r23, android.view.View r24, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r25, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r26, java.util.ArrayList<android.view.View> r27, java.util.ArrayList<android.view.View> r28, java.lang.Object r29, java.lang.Object r30) {
            r8 = r22
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            androidx.fragment.app.Fragment r15 = r11.lastIn
            androidx.fragment.app.Fragment r7 = r11.firstOut
            if (r15 == 0) goto L1c
            android.view.View r0 = r15.requireView()
            r1 = 0
            r0.setVisibility(r1)
        L1c:
            r0 = 0
            if (r15 == 0) goto Lc8
            if (r7 != 0) goto L27
            r1 = r23
            r21 = r7
            goto Lcc
        L27:
            boolean r6 = r11.lastInIsPop
            boolean r1 = r25.isEmpty()
            if (r1 == 0) goto L31
            r1 = r0
            goto L35
        L31:
            java.lang.Object r1 = getSharedElementTransition(r8, r15, r7, r6)
        L35:
            androidx.collection.ArrayMap r5 = captureOutSharedElements(r8, r10, r1, r11)
            androidx.collection.ArrayMap r4 = captureInSharedElements(r8, r10, r1, r11)
            boolean r2 = r25.isEmpty()
            if (r2 == 0) goto L51
            r1 = 0
            if (r5 == 0) goto L4a
            r5.clear()
        L4a:
            if (r4 == 0) goto L4f
            r4.clear()
        L4f:
            r3 = r1
            goto L62
        L51:
            java.util.Set r2 = r25.keySet()
            addSharedElementsWithMatchingNames(r12, r5, r2)
            java.util.Collection r2 = r25.values()
            addSharedElementsWithMatchingNames(r13, r4, r2)
            r3 = r1
        L62:
            if (r14 != 0) goto L69
            if (r30 != 0) goto L69
            if (r3 != 0) goto L69
            return r0
        L69:
            r0 = 1
            callSharedElementStartEnd(r15, r7, r6, r5, r0)
            if (r3 == 0) goto La2
            r13.add(r9)
            r8.setSharedElementTargets(r3, r9, r12)
            boolean r2 = r11.firstOutIsPop
            androidx.fragment.app.BackStackRecord r1 = r11.firstOutTransaction
            r0 = r22
            r16 = r1
            r1 = r3
            r17 = r2
            r2 = r30
            r18 = r3
            r3 = r5
            r9 = r4
            r4 = r17
            r19 = r5
            r5 = r16
            setOutEpicenter(r0, r1, r2, r3, r4, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r1 = getInEpicenterView(r9, r11, r14, r6)
            if (r1 == 0) goto L9d
            r8.setEpicenter(r14, r0)
        L9d:
            r16 = r0
            r17 = r1
            goto Lad
        La2:
            r18 = r3
            r9 = r4
            r19 = r5
            r0 = 0
            r1 = 0
            r16 = r0
            r17 = r1
        Lad:
            androidx.fragment.app.FragmentTransition$5 r5 = new androidx.fragment.app.FragmentTransition$5
            r0 = r5
            r1 = r15
            r2 = r7
            r3 = r6
            r4 = r9
            r8 = r5
            r5 = r17
            r20 = r6
            r6 = r22
            r21 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r23
            androidx.core.view.OneShotPreDrawListener.add(r1, r8)
            return r18
        Lc8:
            r1 = r23
            r21 = r7
        Lcc:
            return r0
    }

    private static void configureTransitionsOrdered(android.view.ViewGroup r30, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r31, android.view.View r32, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r33, androidx.fragment.app.FragmentTransition.Callback r34) {
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            androidx.fragment.app.Fragment r14 = r10.lastIn
            androidx.fragment.app.Fragment r15 = r10.firstOut
            androidx.fragment.app.FragmentTransitionImpl r8 = chooseImpl(r15, r14)
            if (r8 != 0) goto L15
            return
        L15:
            boolean r7 = r10.lastInIsPop
            boolean r6 = r10.firstOutIsPop
            java.lang.Object r5 = getEnterTransition(r8, r14, r7)
            java.lang.Object r4 = getExitTransition(r8, r15, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r0
            r0 = r8
            r1 = r30
            r24 = r2
            r2 = r32
            r25 = r3
            r3 = r33
            r16 = r4
            r4 = r31
            r26 = r5
            r5 = r25
            r27 = r6
            r6 = r24
            r28 = r7
            r7 = r26
            r9 = r8
            r8 = r16
            java.lang.Object r29 = configureSharedElementsOrdered(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r8 = r26
            if (r8 != 0) goto L5a
            if (r29 != 0) goto L5a
            r0 = r16
            if (r0 != 0) goto L5c
            return
        L5a:
            r0 = r16
        L5c:
            r7 = r25
            java.util.ArrayList r25 = configureEnteringExitingViews(r9, r0, r15, r7, r11)
            if (r25 == 0) goto L6e
            boolean r1 = r25.isEmpty()
            if (r1 == 0) goto L6b
            goto L6e
        L6b:
            r26 = r0
            goto L71
        L6e:
            r4 = 0
            r26 = r4
        L71:
            r9.addTarget(r8, r11)
            boolean r5 = r10.lastInIsPop
            r0 = r9
            r1 = r8
            r2 = r26
            r3 = r29
            r4 = r14
            java.lang.Object r6 = mergeTransitions(r0, r1, r2, r3, r4, r5)
            if (r15 == 0) goto La1
            if (r25 == 0) goto La1
            int r0 = r25.size()
            if (r0 > 0) goto L91
            int r0 = r7.size()
            if (r0 <= 0) goto La1
        L91:
            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
            r0.<init>()
            r13.onStart(r15, r0)
            androidx.fragment.app.FragmentTransition$3 r1 = new androidx.fragment.app.FragmentTransition$3
            r1.<init>(r13, r15, r0)
            r9.setListenerForTransitionEnd(r15, r6, r0, r1)
        La1:
            if (r6 == 0) goto Lde
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            r16 = r9
            r17 = r6
            r18 = r8
            r20 = r26
            r21 = r25
            r22 = r29
            r23 = r24
            r16.scheduleRemoveTargets(r17, r18, r19, r20, r21, r22, r23)
            r0 = r9
            r1 = r30
            r2 = r14
            r3 = r32
            r4 = r24
            r5 = r8
            r9 = r6
            r6 = r19
            r17 = r7
            r7 = r26
            r8 = r25
            scheduleTargetChange(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r30
            r1 = r16
            r2 = r24
            r1.setNameOverridesOrdered(r0, r2, r12)
            r1.beginDelayedTransition(r0, r9)
            r1.scheduleNameReset(r0, r2, r12)
            goto Le8
        Lde:
            r0 = r30
            r17 = r7
            r18 = r8
            r1 = r9
            r2 = r24
            r9 = r6
        Le8:
            return
    }

    private static void configureTransitionsReordered(android.view.ViewGroup r22, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r23, android.view.View r24, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r25, androidx.fragment.app.FragmentTransition.Callback r26) {
            r9 = r23
            r10 = r24
            r11 = r26
            androidx.fragment.app.Fragment r12 = r9.lastIn
            androidx.fragment.app.Fragment r13 = r9.firstOut
            androidx.fragment.app.FragmentTransitionImpl r14 = chooseImpl(r13, r12)
            if (r14 != 0) goto L11
            return
        L11:
            boolean r15 = r9.lastInIsPop
            boolean r8 = r9.firstOutIsPop
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6 = r0
            java.lang.Object r5 = getEnterTransition(r14, r12, r15)
            java.lang.Object r4 = getExitTransition(r14, r13, r8)
            r0 = r14
            r1 = r22
            r2 = r24
            r3 = r25
            r16 = r4
            r4 = r23
            r17 = r5
            r5 = r6
            r9 = r6
            r6 = r7
            r11 = r7
            r7 = r17
            r18 = r8
            r8 = r16
            java.lang.Object r8 = configureSharedElementsReordered(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r7 != 0) goto L4e
            if (r8 != 0) goto L4e
            r6 = r16
            if (r6 != 0) goto L50
            return
        L4e:
            r6 = r16
        L50:
            java.util.ArrayList r5 = configureEnteringExitingViews(r14, r6, r13, r9, r10)
            java.util.ArrayList r4 = configureEnteringExitingViews(r14, r7, r12, r11, r10)
            r0 = 4
            setViewVisibility(r4, r0)
            r0 = r14
            r1 = r7
            r2 = r6
            r3 = r8
            r16 = r4
            r4 = r12
            r10 = r5
            r5 = r15
            java.lang.Object r5 = mergeTransitions(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L92
            if (r10 == 0) goto L92
            int r0 = r10.size()
            if (r0 > 0) goto L7e
            int r0 = r9.size()
            if (r0 <= 0) goto L7a
            goto L7e
        L7a:
            r4 = r11
            r11 = r26
            goto L95
        L7e:
            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
            r0.<init>()
            r4 = r11
            r11 = r26
            r11.onStart(r13, r0)
            androidx.fragment.app.FragmentTransition$1 r1 = new androidx.fragment.app.FragmentTransition$1
            r1.<init>(r11, r13, r0)
            r14.setListenerForTransitionEnd(r13, r5, r0, r1)
            goto L95
        L92:
            r4 = r11
            r11 = r26
        L95:
            if (r5 == 0) goto Ld0
            replaceHide(r14, r6, r13, r10)
            java.util.ArrayList r17 = r14.prepareSetNameOverridesReordered(r4)
            r0 = r14
            r1 = r5
            r2 = r7
            r3 = r16
            r19 = r4
            r4 = r6
            r11 = r5
            r5 = r10
            r20 = r6
            r6 = r8
            r21 = r7
            r7 = r19
            r0.scheduleRemoveTargets(r1, r2, r3, r4, r5, r6, r7)
            r6 = r22
            r14.beginDelayedTransition(r6, r11)
            r1 = r22
            r2 = r9
            r3 = r19
            r4 = r17
            r5 = r25
            r0.setNameOverridesReordered(r1, r2, r3, r4, r5)
            r0 = 0
            r1 = r16
            setViewVisibility(r1, r0)
            r0 = r19
            r14.swapSharedElementTargets(r8, r9, r0)
            goto Lda
        Ld0:
            r0 = r4
            r11 = r5
            r20 = r6
            r21 = r7
            r1 = r16
            r6 = r22
        Lda:
            return
    }

    private static androidx.fragment.app.FragmentTransition.FragmentContainerTransition ensureContainer(androidx.fragment.app.FragmentTransition.FragmentContainerTransition r1, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r2, int r3) {
            if (r1 != 0) goto Lb
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r0 = new androidx.fragment.app.FragmentTransition$FragmentContainerTransition
            r0.<init>()
            r1 = r0
            r2.put(r3, r1)
        Lb:
            return r1
    }

    static java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r3, java.lang.String r4) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            java.lang.Object r2 = r3.valueAt(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L18
            java.lang.Object r2 = r3.keyAt(r1)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r1 = 0
            return r1
    }

    private static java.lang.Object getEnterTransition(androidx.fragment.app.FragmentTransitionImpl r1, androidx.fragment.app.Fragment r2, boolean r3) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r3 == 0) goto Lb
            java.lang.Object r0 = r2.getReenterTransition()
            goto Lf
        Lb:
            java.lang.Object r0 = r2.getEnterTransition()
        Lf:
            java.lang.Object r0 = r1.cloneTransition(r0)
            return r0
    }

    private static java.lang.Object getExitTransition(androidx.fragment.app.FragmentTransitionImpl r1, androidx.fragment.app.Fragment r2, boolean r3) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r3 == 0) goto Lb
            java.lang.Object r0 = r2.getReturnTransition()
            goto Lf
        Lb:
            java.lang.Object r0 = r2.getExitTransition()
        Lf:
            java.lang.Object r0 = r1.cloneTransition(r0)
            return r0
    }

    static android.view.View getInEpicenterView(androidx.collection.ArrayMap<java.lang.String, android.view.View> r3, androidx.fragment.app.FragmentTransition.FragmentContainerTransition r4, java.lang.Object r5, boolean r6) {
            androidx.fragment.app.BackStackRecord r0 = r4.lastInTransaction
            if (r5 == 0) goto L2e
            if (r3 == 0) goto L2e
            java.util.ArrayList<java.lang.String> r1 = r0.mSharedElementSourceNames
            if (r1 == 0) goto L2e
            java.util.ArrayList<java.lang.String> r1 = r0.mSharedElementSourceNames
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2e
            r1 = 0
            if (r6 == 0) goto L1e
            java.util.ArrayList<java.lang.String> r2 = r0.mSharedElementSourceNames
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L26
        L1e:
            java.util.ArrayList<java.lang.String> r2 = r0.mSharedElementTargetNames
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L26:
            java.lang.Object r2 = r3.get(r1)
            android.view.View r2 = (android.view.View) r2
            return r2
        L2e:
            r1 = 0
            return r1
    }

    private static java.lang.Object getSharedElementTransition(androidx.fragment.app.FragmentTransitionImpl r2, androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, boolean r5) {
            if (r3 == 0) goto L19
            if (r4 != 0) goto L5
            goto L19
        L5:
            if (r5 == 0) goto Lc
            java.lang.Object r0 = r4.getSharedElementReturnTransition()
            goto L10
        Lc:
            java.lang.Object r0 = r3.getSharedElementEnterTransition()
        L10:
            java.lang.Object r0 = r2.cloneTransition(r0)
            java.lang.Object r1 = r2.wrapTransitionInSet(r0)
            return r1
        L19:
            r0 = 0
            return r0
    }

    private static java.lang.Object mergeTransitions(androidx.fragment.app.FragmentTransitionImpl r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, androidx.fragment.app.Fragment r6, boolean r7) {
            r0 = 1
            if (r3 == 0) goto L13
            if (r4 == 0) goto L13
            if (r6 == 0) goto L13
            if (r7 == 0) goto Le
            boolean r1 = r6.getAllowReturnTransitionOverlap()
            goto L12
        Le:
            boolean r1 = r6.getAllowEnterTransitionOverlap()
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r2.mergeTransitionsTogether(r4, r3, r5)
            goto L1e
        L1a:
            java.lang.Object r1 = r2.mergeTransitionsInSequence(r4, r3, r5)
        L1e:
            return r1
    }

    private static void replaceHide(androidx.fragment.app.FragmentTransitionImpl r2, java.lang.Object r3, androidx.fragment.app.Fragment r4, java.util.ArrayList<android.view.View> r5) {
            if (r4 == 0) goto L26
            if (r3 == 0) goto L26
            boolean r0 = r4.mAdded
            if (r0 == 0) goto L26
            boolean r0 = r4.mHidden
            if (r0 == 0) goto L26
            boolean r0 = r4.mHiddenChanged
            if (r0 == 0) goto L26
            r0 = 1
            r4.setHideReplaced(r0)
            android.view.View r0 = r4.getView()
            r2.scheduleHideFragmentView(r3, r0, r5)
            android.view.ViewGroup r0 = r4.mContainer
            androidx.fragment.app.FragmentTransition$2 r1 = new androidx.fragment.app.FragmentTransition$2
            r1.<init>(r5)
            androidx.core.view.OneShotPreDrawListener.add(r0, r1)
        L26:
            return
    }

    private static androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
            java.lang.String r0 = "androidx.transition.FragmentTransitionSupport"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L16
            androidx.fragment.app.FragmentTransitionImpl r1 = (androidx.fragment.app.FragmentTransitionImpl) r1     // Catch: java.lang.Exception -> L16
            return r1
        L16:
            r0 = move-exception
            r0 = 0
            return r0
    }

    static void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r3, androidx.collection.ArrayMap<java.lang.String, android.view.View> r4) {
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r3.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r4.containsKey(r1)
            if (r2 != 0) goto L17
            r3.removeAt(r0)
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    private static void scheduleTargetChange(androidx.fragment.app.FragmentTransitionImpl r10, android.view.ViewGroup r11, androidx.fragment.app.Fragment r12, android.view.View r13, java.util.ArrayList<android.view.View> r14, java.lang.Object r15, java.util.ArrayList<android.view.View> r16, java.lang.Object r17, java.util.ArrayList<android.view.View> r18) {
            androidx.fragment.app.FragmentTransition$4 r9 = new androidx.fragment.app.FragmentTransition$4
            r0 = r9
            r1 = r15
            r2 = r10
            r3 = r13
            r4 = r12
            r5 = r14
            r6 = r16
            r7 = r18
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r11
            androidx.core.view.OneShotPreDrawListener.add(r11, r9)
            return
    }

    private static void setOutEpicenter(androidx.fragment.app.FragmentTransitionImpl r2, java.lang.Object r3, java.lang.Object r4, androidx.collection.ArrayMap<java.lang.String, android.view.View> r5, boolean r6, androidx.fragment.app.BackStackRecord r7) {
            java.util.ArrayList<java.lang.String> r0 = r7.mSharedElementSourceNames
            if (r0 == 0) goto L2f
            java.util.ArrayList<java.lang.String> r0 = r7.mSharedElementSourceNames
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2f
            r0 = 0
            if (r6 == 0) goto L18
            java.util.ArrayList<java.lang.String> r1 = r7.mSharedElementTargetNames
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L20
        L18:
            java.util.ArrayList<java.lang.String> r1 = r7.mSharedElementSourceNames
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L20:
            java.lang.Object r1 = r5.get(r0)
            android.view.View r1 = (android.view.View) r1
            r2.setEpicenter(r3, r1)
            if (r4 == 0) goto L2f
            r2.setEpicenter(r4, r1)
        L2f:
            return
    }

    static void setViewVisibility(java.util.ArrayList<android.view.View> r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L9:
            if (r0 < 0) goto L17
            java.lang.Object r1 = r2.get(r0)
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            int r0 = r0 + (-1)
            goto L9
        L17:
            return
    }

    static void startTransitions(android.content.Context r8, androidx.fragment.app.FragmentContainer r9, java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10, java.util.ArrayList<java.lang.Boolean> r11, int r12, int r13, boolean r14, androidx.fragment.app.FragmentTransition.Callback r15) {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1 = r12
        L6:
            if (r1 >= r13) goto L24
            java.lang.Object r2 = r10.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.lang.Object r3 = r11.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1e
            calculatePopFragments(r2, r0, r14)
            goto L21
        L1e:
            calculateFragments(r2, r0, r14)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            int r1 = r0.size()
            if (r1 == 0) goto L60
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            int r2 = r0.size()
            r3 = 0
        L34:
            if (r3 >= r2) goto L60
            int r4 = r0.keyAt(r3)
            androidx.collection.ArrayMap r5 = calculateNameOverrides(r4, r10, r11, r12, r13)
            java.lang.Object r6 = r0.valueAt(r3)
            androidx.fragment.app.FragmentTransition$FragmentContainerTransition r6 = (androidx.fragment.app.FragmentTransition.FragmentContainerTransition) r6
            boolean r7 = r9.onHasView()
            if (r7 == 0) goto L5d
            android.view.View r7 = r9.onFindViewById(r4)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 != 0) goto L54
            goto L5d
        L54:
            if (r14 == 0) goto L5a
            configureTransitionsReordered(r7, r6, r1, r5, r15)
            goto L5d
        L5a:
            configureTransitionsOrdered(r7, r6, r1, r5, r15)
        L5d:
            int r3 = r3 + 1
            goto L34
        L60:
            return
    }

    static boolean supportsTransition() {
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r0 != 0) goto Lb
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
