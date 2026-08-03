package com.google.android.material.behavior;

import Yue.C3055;
import Yue.C8273;
import Yue.C8301;
import Yue.InterfaceC3070;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC8792<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private boolean sensitivitySet;
    C8301 viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final C8301.AbstractC8302 dragCallback = new C8301.AbstractC8302() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@InterfaceC6391 View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z = C8273.m27356(view) == 1;
            int i = SwipeDismissBehavior.this.swipeDirection;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // Yue.C8301.AbstractC8302
        public int clampViewPositionHorizontal(@InterfaceC6391 View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = C8273.m27356(view) == 1;
            int i3 = SwipeDismissBehavior.this.swipeDirection;
            if (i3 == 0) {
                if (z) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i, width2);
        }

        @Override // Yue.C8301.AbstractC8302
        public int clampViewPositionVertical(@InterfaceC6391 View view, int i, int i2) {
            return view.getTop();
        }

        @Override // Yue.C8301.AbstractC8302
        public int getViewHorizontalDragRange(@InterfaceC6391 View view) {
            return view.getWidth();
        }

        @Override // Yue.C8301.AbstractC8302
        public void onViewCaptured(@InterfaceC6391 View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // Yue.C8301.AbstractC8302
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        @Override // Yue.C8301.AbstractC8302
        public void onViewPositionChanged(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance;
            float fAbs = Math.abs(i - this.originalCapturedViewLeft);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // Yue.C8301.AbstractC8302
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewReleased(@InterfaceC6391 View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (!shouldDismiss(view, f)) {
                i = this.originalCapturedViewLeft;
                z = false;
            } else if (f >= 0.0f) {
                int left = view.getLeft();
                int i2 = this.originalCapturedViewLeft;
                i = left < i2 ? this.originalCapturedViewLeft - width : i2 + width;
                z = true;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.m27649(i, view.getTop())) {
                C8273.m27427(view, new SettleRunnable(view, z));
            } else {
                if (!z || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // Yue.C8301.AbstractC8302
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z) {
            this.view = view;
            this.dismiss = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            C8301 c8301 = SwipeDismissBehavior.this.viewDragHelper;
            if (c8301 != null && c8301.m27618(true)) {
                C8273.m27427(this.view, this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? C8301.m27604(viewGroup, this.sensitivity, this.dragCallback) : C8301.m27605(viewGroup, this.dragCallback);
        }
    }

    public static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void updateAccessibilityActions(View view) {
        C8273.m27429(view, 1048576);
        if (canSwipeDismissView(view)) {
            C8273.m27432(view, C3055.C0034.f4528, null, new InterfaceC3070() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // Yue.InterfaceC3070
                public boolean perform(@InterfaceC6391 View view2, @InterfaceC6490 InterfaceC3070.AbstractC0039 abstractC0039) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z = C8273.m27356(view2) == 1;
                    int i = SwipeDismissBehavior.this.swipeDirection;
                    C8273.m27414(view2, (!(i == 0 && z) && (i != 1 || z)) ? view2.getWidth() : -view2.getWidth());
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@InterfaceC6391 View view) {
        return true;
    }

    public int getDragState() {
        C8301 c8301 = this.viewDragHelper;
        if (c8301 != null) {
            return c8301.m27633();
        }
        return 0;
    }

    @InterfaceC8392
    @InterfaceC6490
    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onInterceptTouchEvent(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, @InterfaceC6391 MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!zIsPointInChildBounds) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return !this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.m27650(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 V v, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (C8273.m27351(v) == 0) {
            C8273.m27457(v, 1);
            updateAccessibilityActions(v);
        }
        return zOnLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.m27640(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setListener(@InterfaceC6490 OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
