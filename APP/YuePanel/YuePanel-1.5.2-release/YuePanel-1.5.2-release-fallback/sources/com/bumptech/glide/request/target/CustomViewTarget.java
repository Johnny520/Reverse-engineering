package com.bumptech.glide.request.target;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomViewTarget<T extends android.view.View, Z> implements com.bumptech.glide.request.target.Target<Z> {
    private static final java.lang.String TAG = "CustomViewTarget";

    @Yue.InterfaceC3214
    private static final int VIEW_TAG_ID = 0;

    @Yue.InterfaceC4544
    private android.view.View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer sizeDeterminer;
    protected final T view;


    @Yue.InterfaceC6959
    public static final class SizeDeterminer {
        private static final int PENDING_SIZE = 0;

        @Yue.InterfaceC6959
        @Yue.InterfaceC4544
        static java.lang.Integer maxDisplayLength;
        private final java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> cbs;

        @Yue.InterfaceC4544
        private com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer.SizeDeterminerLayoutListener layoutListener;
        private final android.view.View view;
        boolean waitForLayout;

        public static final class SizeDeterminerLayoutListener implements android.view.ViewTreeObserver.OnPreDrawListener {
            private final java.lang.ref.WeakReference<com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer> sizeDeterminerRef;

            public SizeDeterminerLayoutListener(@Yue.InterfaceC4410 com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r2)
                    r1.sizeDeterminerRef = r0
                    return
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                    r3 = this;
                    r0 = 2
                    java.lang.String r1 = "CustomViewTarget"
                    boolean r0 = android.util.Log.isLoggable(r1, r0)
                    if (r0 == 0) goto L1d
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "OnGlobalLayoutListener called attachStateListener="
                    r0.append(r2)
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r1, r0)
                L1d:
                    java.lang.ref.WeakReference<com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer> r0 = r3.sizeDeterminerRef
                    java.lang.Object r0 = r0.get()
                    com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer r0 = (com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer) r0
                    if (r0 == 0) goto L2a
                    r0.checkCurrentDimens()
                L2a:
                    r0 = 1
                    return r0
            }
        }

        public SizeDeterminer(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.cbs = r0
                r1.view = r2
                return
        }

        private static int getMaxDisplayLength(@Yue.InterfaceC4410 android.content.Context r1) {
                java.lang.Integer r0 = com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer.maxDisplayLength
                if (r0 != 0) goto L2c
                java.lang.String r0 = "window"
                java.lang.Object r1 = r1.getSystemService(r0)
                android.view.WindowManager r1 = (android.view.WindowManager) r1
                java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
                android.view.WindowManager r1 = (android.view.WindowManager) r1
                android.view.Display r1 = r1.getDefaultDisplay()
                android.graphics.Point r0 = new android.graphics.Point
                r0.<init>()
                r1.getSize(r0)
                int r1 = r0.x
                int r0 = r0.y
                int r1 = java.lang.Math.max(r1, r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer.maxDisplayLength = r1
            L2c:
                java.lang.Integer r1 = com.bumptech.glide.request.target.CustomViewTarget.SizeDeterminer.maxDisplayLength
                int r1 = r1.intValue()
                return r1
        }

        private int getTargetDimen(int r3, int r4, int r5) {
                r2 = this;
                int r0 = r4 - r5
                if (r0 <= 0) goto L5
                return r0
            L5:
                boolean r0 = r2.waitForLayout
                r1 = 0
                if (r0 == 0) goto L13
                android.view.View r0 = r2.view
                boolean r0 = r0.isLayoutRequested()
                if (r0 == 0) goto L13
                return r1
            L13:
                int r3 = r3 - r5
                if (r3 <= 0) goto L17
                return r3
            L17:
                android.view.View r3 = r2.view
                boolean r3 = r3.isLayoutRequested()
                if (r3 != 0) goto L3b
                r3 = -2
                if (r4 != r3) goto L3b
                r3 = 4
                java.lang.String r4 = "CustomViewTarget"
                boolean r3 = android.util.Log.isLoggable(r4, r3)
                if (r3 == 0) goto L30
                java.lang.String r3 = "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions."
                android.util.Log.i(r4, r3)
            L30:
                android.view.View r3 = r2.view
                android.content.Context r3 = r3.getContext()
                int r3 = getMaxDisplayLength(r3)
                return r3
            L3b:
                return r1
        }

        private int getTargetHeight() {
                r3 = this;
                android.view.View r0 = r3.view
                int r0 = r0.getPaddingTop()
                android.view.View r1 = r3.view
                int r1 = r1.getPaddingBottom()
                int r0 = r0 + r1
                android.view.View r1 = r3.view
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 == 0) goto L18
                int r1 = r1.height
                goto L19
            L18:
                r1 = 0
            L19:
                android.view.View r2 = r3.view
                int r2 = r2.getHeight()
                int r0 = r3.getTargetDimen(r2, r1, r0)
                return r0
        }

        private int getTargetWidth() {
                r3 = this;
                android.view.View r0 = r3.view
                int r0 = r0.getPaddingLeft()
                android.view.View r1 = r3.view
                int r1 = r1.getPaddingRight()
                int r0 = r0 + r1
                android.view.View r1 = r3.view
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 == 0) goto L18
                int r1 = r1.width
                goto L19
            L18:
                r1 = 0
            L19:
                android.view.View r2 = r3.view
                int r2 = r2.getWidth()
                int r0 = r3.getTargetDimen(r2, r1, r0)
                return r0
        }

        private boolean isDimensionValid(int r2) {
                r1 = this;
                if (r2 > 0) goto L9
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r0) goto L7
                goto L9
            L7:
                r2 = 0
                goto La
            L9:
                r2 = 1
            La:
                return r2
        }

        private boolean isViewStateAndSizeValid(int r1, int r2) {
                r0 = this;
                boolean r1 = r0.isDimensionValid(r1)
                if (r1 == 0) goto Le
                boolean r1 = r0.isDimensionValid(r2)
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        private void notifyCbs(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r1 = r2.cbs
                r0.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            Lb:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1b
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.request.target.SizeReadyCallback r1 = (com.bumptech.glide.request.target.SizeReadyCallback) r1
                r1.onSizeReady(r3, r4)
                goto Lb
            L1b:
                return
        }

        public void checkCurrentDimens() {
                r3 = this;
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r3.cbs
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L9
                return
            L9:
                int r0 = r3.getTargetWidth()
                int r1 = r3.getTargetHeight()
                boolean r2 = r3.isViewStateAndSizeValid(r0, r1)
                if (r2 != 0) goto L18
                return
            L18:
                r3.notifyCbs(r0, r1)
                r3.clearCallbacksAndListener()
                return
        }

        public void clearCallbacksAndListener() {
                r2 = this;
                android.view.View r0 = r2.view
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                boolean r1 = r0.isAlive()
                if (r1 == 0) goto L11
                com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener r1 = r2.layoutListener
                r0.removeOnPreDrawListener(r1)
            L11:
                r0 = 0
                r2.layoutListener = r0
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r2.cbs
                r0.clear()
                return
        }

        public void getSize(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r4) {
                r3 = this;
                int r0 = r3.getTargetWidth()
                int r1 = r3.getTargetHeight()
                boolean r2 = r3.isViewStateAndSizeValid(r0, r1)
                if (r2 == 0) goto L12
                r4.onSizeReady(r0, r1)
                return
            L12:
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r3.cbs
                boolean r0 = r0.contains(r4)
                if (r0 != 0) goto L1f
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r3.cbs
                r0.add(r4)
            L1f:
                com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener r4 = r3.layoutListener
                if (r4 != 0) goto L33
                android.view.View r4 = r3.view
                android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
                com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener r0 = new com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener
                r0.<init>(r3)
                r3.layoutListener = r0
                r4.addOnPreDrawListener(r0)
            L33:
                return
        }

        public void removeCallback(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r2) {
                r1 = this;
                java.util.List<com.bumptech.glide.request.target.SizeReadyCallback> r0 = r1.cbs
                r0.remove(r2)
                return
        }
    }

    static {
            int r0 = com.bumptech.glide.R.id.glide_custom_view_target_tag
            com.bumptech.glide.request.target.CustomViewTarget.VIEW_TAG_ID = r0
            return
    }

    public CustomViewTarget(@Yue.InterfaceC4410 T r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
            android.view.View r0 = (android.view.View) r0
            r1.view = r0
            com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer r0 = new com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer
            r0.<init>(r2)
            r1.sizeDeterminer = r0
            return
    }

    @Yue.InterfaceC4544
    private java.lang.Object getTag() {
            r2 = this;
            T extends android.view.View r0 = r2.view
            int r1 = com.bumptech.glide.request.target.CustomViewTarget.VIEW_TAG_ID
            java.lang.Object r0 = r0.getTag(r1)
            return r0
    }

    private void maybeAddAttachStateListener() {
            r2 = this;
            android.view.View$OnAttachStateChangeListener r0 = r2.attachStateListener
            if (r0 == 0) goto L11
            boolean r1 = r2.isAttachStateListenerAdded
            if (r1 == 0) goto L9
            goto L11
        L9:
            T extends android.view.View r1 = r2.view
            r1.addOnAttachStateChangeListener(r0)
            r0 = 1
            r2.isAttachStateListenerAdded = r0
        L11:
            return
    }

    private void maybeRemoveAttachStateListener() {
            r2 = this;
            android.view.View$OnAttachStateChangeListener r0 = r2.attachStateListener
            if (r0 == 0) goto L11
            boolean r1 = r2.isAttachStateListenerAdded
            if (r1 != 0) goto L9
            goto L11
        L9:
            T extends android.view.View r1 = r2.view
            r1.removeOnAttachStateChangeListener(r0)
            r0 = 0
            r2.isAttachStateListenerAdded = r0
        L11:
            return
    }

    private void setTag(@Yue.InterfaceC4544 java.lang.Object r3) {
            r2 = this;
            T extends android.view.View r0 = r2.view
            int r1 = com.bumptech.glide.request.target.CustomViewTarget.VIEW_TAG_ID
            r0.setTag(r1, r3)
            return
    }

    @Yue.InterfaceC4410
    public final com.bumptech.glide.request.target.CustomViewTarget<T, Z> clearOnDetach() {
            r1 = this;
            android.view.View$OnAttachStateChangeListener r0 = r1.attachStateListener
            if (r0 == 0) goto L5
            return r1
        L5:
            com.bumptech.glide.request.target.CustomViewTarget$1 r0 = new com.bumptech.glide.request.target.CustomViewTarget$1
            r0.<init>(r1)
            r1.attachStateListener = r0
            r1.maybeAddAttachStateListener()
            return r1
    }

    @Override // com.bumptech.glide.request.target.Target
    @Yue.InterfaceC4544
    public final com.bumptech.glide.request.Request getRequest() {
            r2 = this;
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L15
            boolean r1 = r0 instanceof com.bumptech.glide.request.Request
            if (r1 == 0) goto Ld
            com.bumptech.glide.request.Request r0 = (com.bumptech.glide.request.Request) r0
            return r0
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must not pass non-R.id ids to setTag(id)"
            r0.<init>(r1)
            throw r0
        L15:
            r0 = 0
            return r0
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r2) {
            r1 = this;
            com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer r0 = r1.sizeDeterminer
            r0.getSize(r2)
            return
    }

    @Yue.InterfaceC4410
    public final T getView() {
            r1 = this;
            T extends android.view.View r0 = r1.view
            return r0
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer r0 = r1.sizeDeterminer
            r0.clearCallbacksAndListener()
            r1.onResourceCleared(r2)
            boolean r2 = r1.isClearedByUs
            if (r2 != 0) goto Lf
            r1.maybeRemoveAttachStateListener()
        Lf:
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.maybeAddAttachStateListener()
            r0.onResourceLoading(r1)
            return
    }

    public abstract void onResourceCleared(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1);

    public void onResourceLoading(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
            r0 = this;
            return
    }

    public final void pauseMyRequest() {
            r2 = this;
            com.bumptech.glide.request.Request r0 = r2.getRequest()
            if (r0 == 0) goto Lf
            r1 = 1
            r2.isClearedByUs = r1
            r0.clear()
            r0 = 0
            r2.isClearedByUs = r0
        Lf:
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(@Yue.InterfaceC4410 com.bumptech.glide.request.target.SizeReadyCallback r2) {
            r1 = this;
            com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer r0 = r1.sizeDeterminer
            r0.removeCallback(r2)
            return
    }

    public final void resumeMyRequest() {
            r2 = this;
            com.bumptech.glide.request.Request r0 = r2.getRequest()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isCleared()
            if (r1 == 0) goto Lf
            r0.begin()
        Lf:
            return
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(@Yue.InterfaceC4544 com.bumptech.glide.request.Request r1) {
            r0 = this;
            r0.setTag(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Target for: "
            r0.append(r1)
            T extends android.view.View r1 = r2.view
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    public final com.bumptech.glide.request.target.CustomViewTarget<T, Z> useTagId(@Yue.InterfaceC3214 int r1) {
            r0 = this;
            return r0
    }

    @Yue.InterfaceC4410
    public final com.bumptech.glide.request.target.CustomViewTarget<T, Z> waitForLayout() {
            r2 = this;
            com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer r0 = r2.sizeDeterminer
            r1 = 1
            r0.waitForLayout = r1
            return r2
    }
}
