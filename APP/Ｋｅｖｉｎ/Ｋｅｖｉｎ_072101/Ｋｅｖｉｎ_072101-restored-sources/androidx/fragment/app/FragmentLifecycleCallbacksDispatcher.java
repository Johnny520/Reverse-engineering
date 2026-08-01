package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
class FragmentLifecycleCallbacksDispatcher {
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> mLifecycleCallbacks;

    private static final class FragmentLifecycleCallbacksHolder {
        final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks mCallback;
        final boolean mRecursive;

        FragmentLifecycleCallbacksHolder(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mRecursive = r2
                return
        }
    }

    FragmentLifecycleCallbacksDispatcher(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mLifecycleCallbacks = r0
            r1.mFragmentManager = r2
            return
    }

    void dispatchOnFragmentActivityCreated(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentActivityCreated(r6, r7, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentActivityCreated(r4, r6, r7)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentAttached(androidx.fragment.app.Fragment r7, boolean r8) {
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentManager r1 = r6.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            if (r1 == 0) goto L1e
            androidx.fragment.app.FragmentManager r2 = r1.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3 = r2.getLifecycleCallbacksDispatcher()
            r4 = 1
            r3.dispatchOnFragmentAttached(r7, r4)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r2 = r6.mLifecycleCallbacks
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r3 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r3
            if (r8 == 0) goto L36
            boolean r4 = r3.mRecursive
            if (r4 == 0) goto L3d
        L36:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r4 = r3.mCallback
            androidx.fragment.app.FragmentManager r5 = r6.mFragmentManager
            r4.onFragmentAttached(r5, r7, r0)
        L3d:
            goto L24
        L3e:
            return
    }

    void dispatchOnFragmentCreated(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentCreated(r6, r7, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentCreated(r4, r6, r7)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentDestroyed(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentDestroyed(r6, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentDestroyed(r4, r6)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentDetached(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentDetached(r6, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentDetached(r4, r6)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentPaused(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentPaused(r6, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentPaused(r4, r6)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentPreAttached(androidx.fragment.app.Fragment r7, boolean r8) {
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentManager r1 = r6.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            if (r1 == 0) goto L1e
            androidx.fragment.app.FragmentManager r2 = r1.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3 = r2.getLifecycleCallbacksDispatcher()
            r4 = 1
            r3.dispatchOnFragmentPreAttached(r7, r4)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r2 = r6.mLifecycleCallbacks
            java.util.Iterator r2 = r2.iterator()
        L24:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r3 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r3
            if (r8 == 0) goto L36
            boolean r4 = r3.mRecursive
            if (r4 == 0) goto L3d
        L36:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r4 = r3.mCallback
            androidx.fragment.app.FragmentManager r5 = r6.mFragmentManager
            r4.onFragmentPreAttached(r5, r7, r0)
        L3d:
            goto L24
        L3e:
            return
    }

    void dispatchOnFragmentPreCreated(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentPreCreated(r6, r7, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentPreCreated(r4, r6, r7)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentResumed(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentResumed(r6, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentResumed(r4, r6)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentSaveInstanceState(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentSaveInstanceState(r6, r7, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentSaveInstanceState(r4, r6, r7)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentStarted(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentStarted(r6, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentStarted(r4, r6)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentStopped(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentStopped(r6, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentStopped(r4, r6)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentViewCreated(androidx.fragment.app.Fragment r6, android.view.View r7, android.os.Bundle r8, boolean r9) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentViewCreated(r6, r7, r8, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r9 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentViewCreated(r4, r6, r7, r8)
        L33:
            goto L1a
        L34:
            return
    }

    void dispatchOnFragmentViewDestroyed(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentViewDestroyed(r6, r3)
        L14:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.mLifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L2c
            boolean r3 = r2.mRecursive
            if (r3 == 0) goto L33
        L2c:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.mCallback
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r3.onFragmentViewDestroyed(r4, r6)
        L33:
            goto L1a
        L34:
            return
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r3, boolean r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r2.mLifecycleCallbacks
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r4.mLifecycleCallbacks
            monitor-enter(r0)
            r1 = 0
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r2 = r4.mLifecycleCallbacks     // Catch: java.lang.Throwable -> L23
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L23
        La:
            if (r1 >= r2) goto L21
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r4.mLifecycleCallbacks     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L23
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r3 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r3     // Catch: java.lang.Throwable -> L23
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r3.mCallback     // Catch: java.lang.Throwable -> L23
            if (r3 != r5) goto L1e
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r4.mLifecycleCallbacks     // Catch: java.lang.Throwable -> L23
            r3.remove(r1)     // Catch: java.lang.Throwable -> L23
            goto L21
        L1e:
            int r1 = r1 + 1
            goto La
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }
}
