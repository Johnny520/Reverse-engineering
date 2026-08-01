package androidx.fragment.app;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentTransitionImpl {




    public FragmentTransitionImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static void bfsAddViewChildren(java.util.List<android.view.View> r8, android.view.View r9) {
            int r0 = r8.size()
            boolean r1 = containedBeforeIndex(r8, r9, r0)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.lang.String r1 = androidx.core.view.ViewCompat.getTransitionName(r9)
            if (r1 == 0) goto L14
            r8.add(r9)
        L14:
            r1 = r0
        L15:
            int r2 = r8.size()
            if (r1 >= r2) goto L48
            java.lang.Object r2 = r8.get(r1)
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L45
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.getChildCount()
            r5 = 0
        L2d:
            if (r5 >= r4) goto L45
            android.view.View r6 = r3.getChildAt(r5)
            boolean r7 = containedBeforeIndex(r8, r6, r0)
            if (r7 != 0) goto L42
            java.lang.String r7 = androidx.core.view.ViewCompat.getTransitionName(r6)
            if (r7 == 0) goto L42
            r8.add(r6)
        L42:
            int r5 = r5 + 1
            goto L2d
        L45:
            int r1 = r1 + 1
            goto L15
        L48:
            return
    }

    private static boolean containedBeforeIndex(java.util.List<android.view.View> r2, android.view.View r3, int r4) {
            r0 = 0
        L1:
            if (r0 >= r4) goto Le
            java.lang.Object r1 = r2.get(r0)
            if (r1 != r3) goto Lb
            r1 = 1
            return r1
        Lb:
            int r0 = r0 + 1
            goto L1
        Le:
            r0 = 0
            return r0
    }

    static java.lang.String findKeyForValue(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4) {
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L25
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L25:
            goto L8
        L26:
            r0 = 0
            return r0
    }

    protected static boolean isNullOrEmpty(java.util.List r1) {
            if (r1 == 0) goto Lb
            boolean r0 = r1.isEmpty()
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

    public abstract void addTarget(java.lang.Object r1, android.view.View r2);

    public abstract void addTargets(java.lang.Object r1, java.util.ArrayList<android.view.View> r2);

    public abstract void beginDelayedTransition(android.view.ViewGroup r1, java.lang.Object r2);

    public abstract boolean canHandle(java.lang.Object r1);

    void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L2c
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L29
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
            if (r1 == 0) goto L17
            r5.add(r0)
            goto L28
        L17:
            int r1 = r0.getChildCount()
            r2 = 0
        L1c:
            if (r2 >= r1) goto L28
            android.view.View r3 = r0.getChildAt(r2)
            r4.captureTransitioningViews(r5, r3)
            int r2 = r2 + 1
            goto L1c
        L28:
            goto L2c
        L29:
            r5.add(r6)
        L2c:
            return
    }

    public abstract java.lang.Object cloneTransition(java.lang.Object r1);

    void findNamedViews(java.util.Map<java.lang.String, android.view.View> r6, android.view.View r7) {
            r5 = this;
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L27
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r7)
            if (r0 == 0) goto Lf
            r6.put(r0, r7)
        Lf:
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L27
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.getChildCount()
            r3 = 0
        L1b:
            if (r3 >= r2) goto L27
            android.view.View r4 = r1.getChildAt(r3)
            r5.findNamedViews(r6, r4)
            int r3 = r3 + 1
            goto L1b
        L27:
            return
    }

    protected void getBoundsOnScreen(android.view.View r8, android.graphics.Rect r9) {
            r7 = this;
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r8)
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r2 = r8.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.Matrix r1 = r8.getMatrix()
            r1.mapRect(r0)
            int r1 = r8.getLeft()
            float r1 = (float) r1
            int r2 = r8.getTop()
            float r2 = (float) r2
            r0.offset(r1, r2)
            android.view.ViewParent r1 = r8.getParent()
        L32:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L61
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getScrollX()
            int r3 = -r3
            float r3 = (float) r3
            int r4 = r2.getScrollY()
            int r4 = -r4
            float r4 = (float) r4
            r0.offset(r3, r4)
            android.graphics.Matrix r3 = r2.getMatrix()
            r3.mapRect(r0)
            int r3 = r2.getLeft()
            float r3 = (float) r3
            int r4 = r2.getTop()
            float r4 = (float) r4
            r0.offset(r3, r4)
            android.view.ViewParent r1 = r2.getParent()
            goto L32
        L61:
            r2 = 2
            int[] r2 = new int[r2]
            android.view.View r3 = r8.getRootView()
            r3.getLocationOnScreen(r2)
            r3 = 0
            r3 = r2[r3]
            float r3 = (float) r3
            r4 = 1
            r4 = r2[r4]
            float r4 = (float) r4
            r0.offset(r3, r4)
            float r3 = r0.left
            int r3 = java.lang.Math.round(r3)
            float r4 = r0.top
            int r4 = java.lang.Math.round(r4)
            float r5 = r0.right
            int r5 = java.lang.Math.round(r5)
            float r6 = r0.bottom
            int r6 = java.lang.Math.round(r6)
            r9.set(r3, r4, r5, r6)
            return
    }

    public abstract java.lang.Object mergeTransitionsInSequence(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public abstract java.lang.Object mergeTransitionsTogether(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    java.util.ArrayList<java.lang.String> prepareSetNameOverridesReordered(java.util.ArrayList<android.view.View> r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L20
            java.lang.Object r3 = r6.get(r2)
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = androidx.core.view.ViewCompat.getTransitionName(r3)
            r0.add(r4)
            r4 = 0
            androidx.core.view.ViewCompat.setTransitionName(r3, r4)
            int r2 = r2 + 1
            goto La
        L20:
            return r0
    }

    public abstract void removeTarget(java.lang.Object r1, android.view.View r2);

    public abstract void replaceTargets(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    public abstract void scheduleHideFragmentView(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    void scheduleNameReset(android.view.ViewGroup r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            androidx.fragment.app.FragmentTransitionImpl$3 r0 = new androidx.fragment.app.FragmentTransitionImpl$3
            r0.<init>(r1, r3, r4)
            androidx.core.view.OneShotPreDrawListener.add(r2, r0)
            return
    }

    public abstract void scheduleRemoveTargets(java.lang.Object r1, java.lang.Object r2, java.util.ArrayList<android.view.View> r3, java.lang.Object r4, java.util.ArrayList<android.view.View> r5, java.lang.Object r6, java.util.ArrayList<android.view.View> r7);

    public abstract void setEpicenter(java.lang.Object r1, android.graphics.Rect r2);

    public abstract void setEpicenter(java.lang.Object r1, android.view.View r2);

    public void setListenerForTransitionEnd(androidx.fragment.app.Fragment r1, java.lang.Object r2, androidx.core.os.CancellationSignal r3, java.lang.Runnable r4) {
            r0 = this;
            r4.run()
            return
    }

    void setNameOverridesOrdered(android.view.View r2, java.util.ArrayList<android.view.View> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            androidx.fragment.app.FragmentTransitionImpl$2 r0 = new androidx.fragment.app.FragmentTransitionImpl$2
            r0.<init>(r1, r3, r4)
            androidx.core.view.OneShotPreDrawListener.add(r2, r0)
            return
    }

    void setNameOverridesReordered(android.view.View r11, java.util.ArrayList<android.view.View> r12, java.util.ArrayList<android.view.View> r13, java.util.ArrayList<java.lang.String> r14, java.util.Map<java.lang.String, java.lang.String> r15) {
            r10 = this;
            int r7 = r13.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = r0
            r0 = 0
        Lb:
            if (r0 >= r7) goto L44
            java.lang.Object r1 = r12.get(r0)
            android.view.View r1 = (android.view.View) r1
            java.lang.String r2 = androidx.core.view.ViewCompat.getTransitionName(r1)
            r8.add(r2)
            if (r2 != 0) goto L1d
            goto L41
        L1d:
            r3 = 0
            androidx.core.view.ViewCompat.setTransitionName(r1, r3)
            java.lang.Object r3 = r15.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
        L28:
            if (r4 >= r7) goto L41
            java.lang.Object r5 = r14.get(r4)
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L3e
            java.lang.Object r5 = r13.get(r4)
            android.view.View r5 = (android.view.View) r5
            androidx.core.view.ViewCompat.setTransitionName(r5, r2)
            goto L41
        L3e:
            int r4 = r4 + 1
            goto L28
        L41:
            int r0 = r0 + 1
            goto Lb
        L44:
            androidx.fragment.app.FragmentTransitionImpl$1 r9 = new androidx.fragment.app.FragmentTransitionImpl$1
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r13
            r4 = r14
            r5 = r12
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.core.view.OneShotPreDrawListener.add(r11, r9)
            return
    }

    public abstract void setSharedElementTargets(java.lang.Object r1, android.view.View r2, java.util.ArrayList<android.view.View> r3);

    public abstract void swapSharedElementTargets(java.lang.Object r1, java.util.ArrayList<android.view.View> r2, java.util.ArrayList<android.view.View> r3);

    public abstract java.lang.Object wrapTransitionInSet(java.lang.Object r1);
}
