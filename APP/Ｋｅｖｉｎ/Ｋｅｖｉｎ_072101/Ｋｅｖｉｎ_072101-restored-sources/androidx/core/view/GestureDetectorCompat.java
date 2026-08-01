package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class GestureDetectorCompat {
    private final androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl mImpl;

    interface GestureDetectorCompatImpl {
        boolean isLongpressEnabled();

        boolean onTouchEvent(android.view.MotionEvent r1);

        void setIsLongpressEnabled(boolean r1);

        void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r1);
    }

    static class GestureDetectorCompatImplBase implements androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl {
        private static final int DOUBLE_TAP_TIMEOUT = 0;
        private static final int LONG_PRESS = 2;
        private static final int SHOW_PRESS = 1;
        private static final int TAP = 3;
        private static final int TAP_TIMEOUT = 0;
        private boolean mAlwaysInBiggerTapRegion;
        private boolean mAlwaysInTapRegion;
        android.view.MotionEvent mCurrentDownEvent;
        boolean mDeferConfirmSingleTap;
        android.view.GestureDetector.OnDoubleTapListener mDoubleTapListener;
        private int mDoubleTapSlopSquare;
        private float mDownFocusX;
        private float mDownFocusY;
        private final android.os.Handler mHandler;
        private boolean mInLongPress;
        private boolean mIsDoubleTapping;
        private boolean mIsLongpressEnabled;
        private float mLastFocusX;
        private float mLastFocusY;
        final android.view.GestureDetector.OnGestureListener mListener;
        private int mMaximumFlingVelocity;
        private int mMinimumFlingVelocity;
        private android.view.MotionEvent mPreviousUpEvent;
        boolean mStillDown;
        private int mTouchSlopSquare;
        private android.view.VelocityTracker mVelocityTracker;

        private class GestureHandler extends android.os.Handler {
            final /* synthetic */ androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase this$0;

            GestureHandler(androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            GestureHandler(androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase r1, android.os.Handler r2) {
                    r0 = this;
                    r0.this$0 = r1
                    android.os.Looper r1 = r2.getLooper()
                    r0.<init>(r1)
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r4) {
                    r3 = this;
                    int r0 = r4.what
                    switch(r0) {
                        case 1: goto L42;
                        case 2: goto L3c;
                        case 3: goto L1e;
                        default: goto L5;
                    }
                L5:
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unknown message "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L1e:
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    android.view.GestureDetector$OnDoubleTapListener r0 = r0.mDoubleTapListener
                    if (r0 == 0) goto L4e
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    boolean r0 = r0.mStillDown
                    if (r0 != 0) goto L36
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    android.view.GestureDetector$OnDoubleTapListener r0 = r0.mDoubleTapListener
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r1 = r3.this$0
                    android.view.MotionEvent r1 = r1.mCurrentDownEvent
                    r0.onSingleTapConfirmed(r1)
                    goto L4e
                L36:
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    r1 = 1
                    r0.mDeferConfirmSingleTap = r1
                    goto L4e
                L3c:
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    r0.dispatchLongPress()
                    goto L4e
                L42:
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r0 = r3.this$0
                    android.view.GestureDetector$OnGestureListener r0 = r0.mListener
                    androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase r1 = r3.this$0
                    android.view.MotionEvent r1 = r1.mCurrentDownEvent
                    r0.onShowPress(r1)
                L4e:
                    return
            }
        }

        static {
                int r0 = android.view.ViewConfiguration.getTapTimeout()
                androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.TAP_TIMEOUT = r0
                int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
                androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT = r0
                return
        }

        GestureDetectorCompatImplBase(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
                r1 = this;
                r1.<init>()
                if (r4 == 0) goto Ld
                androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler r0 = new androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler
                r0.<init>(r1, r4)
                r1.mHandler = r0
                goto L14
            Ld:
                androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler r0 = new androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler
                r0.<init>(r1)
                r1.mHandler = r0
            L14:
                r1.mListener = r3
                boolean r0 = r3 instanceof android.view.GestureDetector.OnDoubleTapListener
                if (r0 == 0) goto L20
                r0 = r3
                android.view.GestureDetector$OnDoubleTapListener r0 = (android.view.GestureDetector.OnDoubleTapListener) r0
                r1.setOnDoubleTapListener(r0)
            L20:
                r1.init(r2)
                return
        }

        private void cancel() {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 1
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 2
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 3
                r0.removeMessages(r1)
                android.view.VelocityTracker r0 = r2.mVelocityTracker
                r0.recycle()
                r0 = 0
                r2.mVelocityTracker = r0
                r0 = 0
                r2.mIsDoubleTapping = r0
                r2.mStillDown = r0
                r2.mAlwaysInTapRegion = r0
                r2.mAlwaysInBiggerTapRegion = r0
                r2.mDeferConfirmSingleTap = r0
                boolean r1 = r2.mInLongPress
                if (r1 == 0) goto L2b
                r2.mInLongPress = r0
            L2b:
                return
        }

        private void cancelTaps() {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 1
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 2
                r0.removeMessages(r1)
                android.os.Handler r0 = r2.mHandler
                r1 = 3
                r0.removeMessages(r1)
                r0 = 0
                r2.mIsDoubleTapping = r0
                r2.mAlwaysInTapRegion = r0
                r2.mAlwaysInBiggerTapRegion = r0
                r2.mDeferConfirmSingleTap = r0
                boolean r1 = r2.mInLongPress
                if (r1 == 0) goto L21
                r2.mInLongPress = r0
            L21:
                return
        }

        private void init(android.content.Context r5) {
                r4 = this;
                if (r5 == 0) goto L32
                android.view.GestureDetector$OnGestureListener r0 = r4.mListener
                if (r0 == 0) goto L2a
                r0 = 1
                r4.mIsLongpressEnabled = r0
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r5)
                int r1 = r0.getScaledTouchSlop()
                int r2 = r0.getScaledDoubleTapSlop()
                int r3 = r0.getScaledMinimumFlingVelocity()
                r4.mMinimumFlingVelocity = r3
                int r3 = r0.getScaledMaximumFlingVelocity()
                r4.mMaximumFlingVelocity = r3
                int r3 = r1 * r1
                r4.mTouchSlopSquare = r3
                int r3 = r2 * r2
                r4.mDoubleTapSlopSquare = r3
                return
            L2a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "OnGestureListener must not be null"
                r0.<init>(r1)
                throw r0
            L32:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Context must not be null"
                r0.<init>(r1)
                throw r0
        }

        private boolean isConsideredDoubleTap(android.view.MotionEvent r7, android.view.MotionEvent r8, android.view.MotionEvent r9) {
                r6 = this;
                boolean r0 = r6.mAlwaysInBiggerTapRegion
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                long r2 = r9.getEventTime()
                long r4 = r8.getEventTime()
                long r2 = r2 - r4
                int r0 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT
                long r4 = (long) r0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L17
                return r1
            L17:
                float r0 = r7.getX()
                int r0 = (int) r0
                float r2 = r9.getX()
                int r2 = (int) r2
                int r0 = r0 - r2
                float r2 = r7.getY()
                int r2 = (int) r2
                float r3 = r9.getY()
                int r3 = (int) r3
                int r2 = r2 - r3
                int r3 = r0 * r0
                int r4 = r2 * r2
                int r3 = r3 + r4
                int r4 = r6.mDoubleTapSlopSquare
                if (r3 >= r4) goto L37
                r1 = 1
            L37:
                return r1
        }

        void dispatchLongPress() {
                r2 = this;
                android.os.Handler r0 = r2.mHandler
                r1 = 3
                r0.removeMessages(r1)
                r0 = 0
                r2.mDeferConfirmSingleTap = r0
                r0 = 1
                r2.mInLongPress = r0
                android.view.GestureDetector$OnGestureListener r0 = r2.mListener
                android.view.MotionEvent r1 = r2.mCurrentDownEvent
                r0.onLongPress(r1)
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean isLongpressEnabled() {
                r1 = this;
                boolean r0 = r1.mIsLongpressEnabled
                return r0
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean onTouchEvent(android.view.MotionEvent r23) {
                r22 = this;
                r0 = r22
                r1 = r23
                int r2 = r23.getAction()
                android.view.VelocityTracker r3 = r0.mVelocityTracker
                if (r3 != 0) goto L12
                android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
                r0.mVelocityTracker = r3
            L12:
                android.view.VelocityTracker r3 = r0.mVelocityTracker
                r3.addMovement(r1)
                r3 = r2 & 255(0xff, float:3.57E-43)
                r4 = 6
                if (r3 != r4) goto L1e
                r3 = 1
                goto L1f
            L1e:
                r3 = 0
            L1f:
                if (r3 == 0) goto L26
                int r4 = r23.getActionIndex()
                goto L27
            L26:
                r4 = -1
            L27:
                r7 = 0
                r8 = 0
                int r9 = r23.getPointerCount()
                r10 = 0
            L2e:
                if (r10 >= r9) goto L40
                if (r4 != r10) goto L33
                goto L3d
            L33:
                float r11 = r1.getX(r10)
                float r7 = r7 + r11
                float r11 = r1.getY(r10)
                float r8 = r8 + r11
            L3d:
                int r10 = r10 + 1
                goto L2e
            L40:
                if (r3 == 0) goto L45
                int r10 = r9 + (-1)
                goto L46
            L45:
                r10 = r9
            L46:
                float r11 = (float) r10
                float r11 = r7 / r11
                float r12 = (float) r10
                float r12 = r8 / r12
                r13 = 0
                r14 = r2 & 255(0xff, float:3.57E-43)
                r15 = 1000(0x3e8, float:1.401E-42)
                switch(r14) {
                    case 0: goto L208;
                    case 1: goto L16c;
                    case 2: goto Lea;
                    case 3: goto Ldf;
                    case 4: goto L54;
                    case 5: goto Lcc;
                    case 6: goto L5c;
                    default: goto L54;
                }
            L54:
                r18 = r2
                r19 = r3
                r20 = r4
                goto L2ad
            L5c:
                r0.mLastFocusX = r11
                r0.mDownFocusX = r11
                r0.mLastFocusY = r12
                r0.mDownFocusY = r12
                android.view.VelocityTracker r5 = r0.mVelocityTracker
                int r6 = r0.mMaximumFlingVelocity
                float r6 = (float) r6
                r5.computeCurrentVelocity(r15, r6)
                int r5 = r23.getActionIndex()
                int r6 = r1.getPointerId(r5)
                android.view.VelocityTracker r14 = r0.mVelocityTracker
                float r14 = r14.getXVelocity(r6)
                android.view.VelocityTracker r15 = r0.mVelocityTracker
                float r15 = r15.getYVelocity(r6)
                r16 = 0
                r18 = r2
                r2 = r16
            L86:
                if (r2 >= r9) goto Lc4
                if (r2 != r5) goto L91
                r19 = r3
                r20 = r4
                r16 = r5
                goto Lbb
            L91:
                r19 = r3
                int r3 = r1.getPointerId(r2)
                r20 = r4
                android.view.VelocityTracker r4 = r0.mVelocityTracker
                float r4 = r4.getXVelocity(r3)
                float r4 = r4 * r14
                r16 = r5
                android.view.VelocityTracker r5 = r0.mVelocityTracker
                float r5 = r5.getYVelocity(r3)
                float r5 = r5 * r15
                float r17 = r4 + r5
                r21 = 0
                int r21 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
                if (r21 >= 0) goto Lb9
                r21 = r3
                android.view.VelocityTracker r3 = r0.mVelocityTracker
                r3.clear()
                goto Lca
            Lb9:
                r21 = r3
            Lbb:
                int r2 = r2 + 1
                r5 = r16
                r3 = r19
                r4 = r20
                goto L86
            Lc4:
                r19 = r3
                r20 = r4
                r16 = r5
            Lca:
                goto L2ad
            Lcc:
                r18 = r2
                r19 = r3
                r20 = r4
                r0.mLastFocusX = r11
                r0.mDownFocusX = r11
                r0.mLastFocusY = r12
                r0.mDownFocusY = r12
                r22.cancelTaps()
                goto L2ad
            Ldf:
                r18 = r2
                r19 = r3
                r20 = r4
                r22.cancel()
                goto L2ad
            Lea:
                r18 = r2
                r19 = r3
                r20 = r4
                boolean r2 = r0.mInLongPress
                if (r2 == 0) goto Lf6
                goto L2ad
            Lf6:
                float r2 = r0.mLastFocusX
                float r2 = r2 - r11
                float r3 = r0.mLastFocusY
                float r3 = r3 - r12
                boolean r4 = r0.mIsDoubleTapping
                if (r4 == 0) goto L109
                android.view.GestureDetector$OnDoubleTapListener r4 = r0.mDoubleTapListener
                boolean r4 = r4.onDoubleTapEvent(r1)
                r13 = r13 | r4
                goto L2ad
            L109:
                boolean r4 = r0.mAlwaysInTapRegion
                if (r4 == 0) goto L14c
                float r4 = r0.mDownFocusX
                float r4 = r11 - r4
                int r4 = (int) r4
                float r14 = r0.mDownFocusY
                float r14 = r12 - r14
                int r14 = (int) r14
                int r15 = r4 * r4
                int r21 = r14 * r14
                int r15 = r15 + r21
                int r6 = r0.mTouchSlopSquare
                if (r15 <= r6) goto L143
                android.view.GestureDetector$OnGestureListener r6 = r0.mListener
                android.view.MotionEvent r5 = r0.mCurrentDownEvent
                boolean r5 = r6.onScroll(r5, r1, r2, r3)
                r0.mLastFocusX = r11
                r0.mLastFocusY = r12
                r6 = 0
                r0.mAlwaysInTapRegion = r6
                android.os.Handler r6 = r0.mHandler
                r13 = 3
                r6.removeMessages(r13)
                android.os.Handler r6 = r0.mHandler
                r13 = 1
                r6.removeMessages(r13)
                android.os.Handler r6 = r0.mHandler
                r13 = 2
                r6.removeMessages(r13)
                r13 = r5
            L143:
                int r5 = r0.mTouchSlopSquare
                if (r15 <= r5) goto L14a
                r5 = 0
                r0.mAlwaysInBiggerTapRegion = r5
            L14a:
                goto L2ad
            L14c:
                float r4 = java.lang.Math.abs(r2)
                r5 = 1065353216(0x3f800000, float:1.0)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 >= 0) goto L15e
                float r4 = java.lang.Math.abs(r3)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 < 0) goto L14a
            L15e:
                android.view.GestureDetector$OnGestureListener r4 = r0.mListener
                android.view.MotionEvent r5 = r0.mCurrentDownEvent
                boolean r13 = r4.onScroll(r5, r1, r2, r3)
                r0.mLastFocusX = r11
                r0.mLastFocusY = r12
                goto L2ad
            L16c:
                r18 = r2
                r19 = r3
                r20 = r4
                r2 = 0
                r0.mStillDown = r2
                android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r23)
                boolean r3 = r0.mIsDoubleTapping
                if (r3 == 0) goto L185
                android.view.GestureDetector$OnDoubleTapListener r3 = r0.mDoubleTapListener
                boolean r3 = r3.onDoubleTapEvent(r1)
                r13 = r13 | r3
                goto L1de
            L185:
                boolean r3 = r0.mInLongPress
                if (r3 == 0) goto L193
                android.os.Handler r3 = r0.mHandler
                r4 = 3
                r3.removeMessages(r4)
                r3 = 0
                r0.mInLongPress = r3
                goto L1de
            L193:
                boolean r3 = r0.mAlwaysInTapRegion
                if (r3 == 0) goto L1ab
                android.view.GestureDetector$OnGestureListener r3 = r0.mListener
                boolean r13 = r3.onSingleTapUp(r1)
                boolean r3 = r0.mDeferConfirmSingleTap
                if (r3 == 0) goto L1de
                android.view.GestureDetector$OnDoubleTapListener r3 = r0.mDoubleTapListener
                if (r3 == 0) goto L1de
                android.view.GestureDetector$OnDoubleTapListener r3 = r0.mDoubleTapListener
                r3.onSingleTapConfirmed(r1)
                goto L1de
            L1ab:
                android.view.VelocityTracker r3 = r0.mVelocityTracker
                r4 = 0
                int r5 = r1.getPointerId(r4)
                int r4 = r0.mMaximumFlingVelocity
                float r4 = (float) r4
                r3.computeCurrentVelocity(r15, r4)
                float r4 = r3.getYVelocity(r5)
                float r6 = r3.getXVelocity(r5)
                float r14 = java.lang.Math.abs(r4)
                int r15 = r0.mMinimumFlingVelocity
                float r15 = (float) r15
                int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
                if (r14 > 0) goto L1d6
                float r14 = java.lang.Math.abs(r6)
                int r15 = r0.mMinimumFlingVelocity
                float r15 = (float) r15
                int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
                if (r14 <= 0) goto L1de
            L1d6:
                android.view.GestureDetector$OnGestureListener r14 = r0.mListener
                android.view.MotionEvent r15 = r0.mCurrentDownEvent
                boolean r13 = r14.onFling(r15, r1, r6, r4)
            L1de:
                android.view.MotionEvent r3 = r0.mPreviousUpEvent
                if (r3 == 0) goto L1e7
                android.view.MotionEvent r3 = r0.mPreviousUpEvent
                r3.recycle()
            L1e7:
                r0.mPreviousUpEvent = r2
                android.view.VelocityTracker r3 = r0.mVelocityTracker
                if (r3 == 0) goto L1f5
                android.view.VelocityTracker r3 = r0.mVelocityTracker
                r3.recycle()
                r3 = 0
                r0.mVelocityTracker = r3
            L1f5:
                r3 = 0
                r0.mIsDoubleTapping = r3
                r0.mDeferConfirmSingleTap = r3
                android.os.Handler r3 = r0.mHandler
                r4 = 1
                r3.removeMessages(r4)
                android.os.Handler r3 = r0.mHandler
                r4 = 2
                r3.removeMessages(r4)
                goto L2ad
            L208:
                r18 = r2
                r19 = r3
                r20 = r4
                android.view.GestureDetector$OnDoubleTapListener r2 = r0.mDoubleTapListener
                if (r2 == 0) goto L252
                android.os.Handler r2 = r0.mHandler
                r3 = 3
                boolean r2 = r2.hasMessages(r3)
                if (r2 == 0) goto L220
                android.os.Handler r4 = r0.mHandler
                r4.removeMessages(r3)
            L220:
                android.view.MotionEvent r3 = r0.mCurrentDownEvent
                if (r3 == 0) goto L249
                android.view.MotionEvent r3 = r0.mPreviousUpEvent
                if (r3 == 0) goto L249
                if (r2 == 0) goto L249
                android.view.MotionEvent r3 = r0.mCurrentDownEvent
                android.view.MotionEvent r4 = r0.mPreviousUpEvent
                boolean r3 = r0.isConsideredDoubleTap(r3, r4, r1)
                if (r3 == 0) goto L249
                r3 = 1
                r0.mIsDoubleTapping = r3
                android.view.GestureDetector$OnDoubleTapListener r3 = r0.mDoubleTapListener
                android.view.MotionEvent r4 = r0.mCurrentDownEvent
                boolean r3 = r3.onDoubleTap(r4)
                r3 = r3 | r13
                android.view.GestureDetector$OnDoubleTapListener r4 = r0.mDoubleTapListener
                boolean r4 = r4.onDoubleTapEvent(r1)
                r13 = r3 | r4
                goto L252
            L249:
                android.os.Handler r3 = r0.mHandler
                int r4 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.DOUBLE_TAP_TIMEOUT
                long r4 = (long) r4
                r6 = 3
                r3.sendEmptyMessageDelayed(r6, r4)
            L252:
                r0.mLastFocusX = r11
                r0.mDownFocusX = r11
                r0.mLastFocusY = r12
                r0.mDownFocusY = r12
                android.view.MotionEvent r2 = r0.mCurrentDownEvent
                if (r2 == 0) goto L263
                android.view.MotionEvent r2 = r0.mCurrentDownEvent
                r2.recycle()
            L263:
                android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r23)
                r0.mCurrentDownEvent = r2
                r2 = 1
                r0.mAlwaysInTapRegion = r2
                r0.mAlwaysInBiggerTapRegion = r2
                r0.mStillDown = r2
                r2 = 0
                r0.mInLongPress = r2
                r0.mDeferConfirmSingleTap = r2
                boolean r2 = r0.mIsLongpressEnabled
                if (r2 == 0) goto L295
                android.os.Handler r2 = r0.mHandler
                r3 = 2
                r2.removeMessages(r3)
                android.os.Handler r2 = r0.mHandler
                android.view.MotionEvent r3 = r0.mCurrentDownEvent
                long r3 = r3.getDownTime()
                int r5 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.TAP_TIMEOUT
                long r5 = (long) r5
                long r3 = r3 + r5
                int r5 = android.view.ViewConfiguration.getLongPressTimeout()
                long r5 = (long) r5
                long r3 = r3 + r5
                r5 = 2
                r2.sendEmptyMessageAtTime(r5, r3)
            L295:
                android.os.Handler r2 = r0.mHandler
                android.view.MotionEvent r3 = r0.mCurrentDownEvent
                long r3 = r3.getDownTime()
                int r5 = androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.TAP_TIMEOUT
                long r5 = (long) r5
                long r3 = r3 + r5
                r5 = 1
                r2.sendEmptyMessageAtTime(r5, r3)
                android.view.GestureDetector$OnGestureListener r2 = r0.mListener
                boolean r2 = r2.onDown(r1)
                r13 = r13 | r2
            L2ad:
                return r13
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setIsLongpressEnabled(boolean r1) {
                r0 = this;
                r0.mIsLongpressEnabled = r1
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r1) {
                r0 = this;
                r0.mDoubleTapListener = r1
                return
        }
    }

    static class GestureDetectorCompatImplJellybeanMr2 implements androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl {
        private final android.view.GestureDetector mDetector;

        GestureDetectorCompatImplJellybeanMr2(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
                r1 = this;
                r1.<init>()
                android.view.GestureDetector r0 = new android.view.GestureDetector
                r0.<init>(r2, r3, r4)
                r1.mDetector = r0
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean isLongpressEnabled() {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                boolean r0 = r0.isLongpressEnabled()
                return r0
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public boolean onTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                boolean r0 = r0.onTouchEvent(r2)
                return r0
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setIsLongpressEnabled(boolean r2) {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                r0.setIsLongpressEnabled(r2)
                return
        }

        @Override // androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImpl
        public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
                r1 = this;
                android.view.GestureDetector r0 = r1.mDetector
                r0.setOnDoubleTapListener(r2)
                return
        }
    }

    public GestureDetectorCompat(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GestureDetectorCompat(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
            r1 = this;
            r1.<init>()
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2 r0 = new androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2
            r0.<init>(r2, r3, r4)
            r1.mImpl = r0
            return
    }

    public boolean isLongpressEnabled() {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            boolean r0 = r0.isLongpressEnabled()
            return r0
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            boolean r0 = r0.onTouchEvent(r2)
            return r0
    }

    public void setIsLongpressEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            r0.setIsLongpressEnabled(r2)
            return
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            androidx.core.view.GestureDetectorCompat$GestureDetectorCompatImpl r0 = r1.mImpl
            r0.setOnDoubleTapListener(r2)
            return
    }
}
