package com.bumptech.glide.request.target;

import Yue.InterfaceC3647;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C1898R;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {
    private static final String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce;
    private static int tagId = C1898R.id.glide_custom_view_target_tag;

    @InterfaceC6490
    private View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final SizeDeterminer sizeDeterminer;
    protected final T view;

    @InterfaceC8392
    public static final class SizeDeterminer {
        private static final int PENDING_SIZE = 0;

        @InterfaceC8392
        @InterfaceC6490
        static Integer maxDisplayLength;
        private final List<SizeReadyCallback> cbs = new ArrayList();

        @InterfaceC6490
        private SizeDeterminerLayoutListener layoutListener;
        private final View view;
        boolean waitForLayout;

        public static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<SizeDeterminer> sizeDeterminerRef;

            public SizeDeterminerLayoutListener(@InterfaceC6391 SizeDeterminer sizeDeterminer) {
                this.sizeDeterminerRef = new WeakReference<>(sizeDeterminer);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(ViewTarget.TAG, 2)) {
                    Log.v(ViewTarget.TAG, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                SizeDeterminer sizeDeterminer = this.sizeDeterminerRef.get();
                if (sizeDeterminer == null) {
                    return true;
                }
                sizeDeterminer.checkCurrentDimens();
                return true;
            }
        }

        public SizeDeterminer(@InterfaceC6391 View view) {
            this.view = view;
        }

        private static int getMaxDisplayLength(@InterfaceC6391 Context context) {
            if (maxDisplayLength == null) {
                Display defaultDisplay = ((WindowManager) Preconditions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                maxDisplayLength = Integer.valueOf(Math.max(point.x, point.y));
            }
            return maxDisplayLength.intValue();
        }

        private int getTargetDimen(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.waitForLayout && this.view.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(ViewTarget.TAG, 4)) {
                Log.i(ViewTarget.TAG, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return getMaxDisplayLength(this.view.getContext());
        }

        private int getTargetHeight() {
            int paddingTop = this.view.getPaddingTop() + this.view.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            return getTargetDimen(this.view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int getTargetWidth() {
            int paddingLeft = this.view.getPaddingLeft() + this.view.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            return getTargetDimen(this.view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean isDimensionValid(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean isViewStateAndSizeValid(int i, int i2) {
            return isDimensionValid(i) && isDimensionValid(i2);
        }

        private void notifyCbs(int i, int i2) {
            Iterator it = new ArrayList(this.cbs).iterator();
            while (it.hasNext()) {
                ((SizeReadyCallback) it.next()).onSizeReady(i, i2);
            }
        }

        public void checkCurrentDimens() {
            if (this.cbs.isEmpty()) {
                return;
            }
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                notifyCbs(targetWidth, targetHeight);
                clearCallbacksAndListener();
            }
        }

        public void clearCallbacksAndListener() {
            ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.layoutListener);
            }
            this.layoutListener = null;
            this.cbs.clear();
        }

        public void getSize(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                sizeReadyCallback.onSizeReady(targetWidth, targetHeight);
                return;
            }
            if (!this.cbs.contains(sizeReadyCallback)) {
                this.cbs.add(sizeReadyCallback);
            }
            if (this.layoutListener == null) {
                ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
                SizeDeterminerLayoutListener sizeDeterminerLayoutListener = new SizeDeterminerLayoutListener(this);
                this.layoutListener = sizeDeterminerLayoutListener;
                viewTreeObserver.addOnPreDrawListener(sizeDeterminerLayoutListener);
            }
        }

        public void removeCallback(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
            this.cbs.remove(sizeReadyCallback);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTarget(@InterfaceC6391 T t) {
        this.view = (T) Preconditions.checkNotNull(t);
        this.sizeDeterminer = new SizeDeterminer(t);
    }

    @InterfaceC6490
    private Object getTag() {
        return this.view.getTag(tagId);
    }

    private void maybeAddAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || this.isAttachStateListenerAdded) {
            return;
        }
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = true;
    }

    private void maybeRemoveAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || !this.isAttachStateListenerAdded) {
            return;
        }
        this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = false;
    }

    private void setTag(@InterfaceC6490 Object obj) {
        isTagUsedAtLeastOnce = true;
        this.view.setTag(tagId, obj);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (isTagUsedAtLeastOnce) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        tagId = i;
    }

    @InterfaceC6391
    public final ViewTarget<T, Z> clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new View.OnAttachStateChangeListener() { // from class: com.bumptech.glide.request.target.ViewTarget.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ViewTarget.this.resumeMyRequest();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ViewTarget.this.pauseMyRequest();
            }
        };
        maybeAddAttachStateListener();
        return this;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @InterfaceC6490
    public Request getRequest() {
        Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.Target
    @InterfaceC3647
    public void getSize(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
        this.sizeDeterminer.getSize(sizeReadyCallback);
    }

    @InterfaceC6391
    public T getView() {
        return this.view;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @InterfaceC3647
    public void onLoadCleared(@InterfaceC6490 Drawable drawable) {
        super.onLoadCleared(drawable);
        this.sizeDeterminer.clearCallbacksAndListener();
        if (this.isClearedByUs) {
            return;
        }
        maybeRemoveAttachStateListener();
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @InterfaceC3647
    public void onLoadStarted(@InterfaceC6490 Drawable drawable) {
        super.onLoadStarted(drawable);
        maybeAddAttachStateListener();
    }

    public void pauseMyRequest() {
        Request request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.clear();
            this.isClearedByUs = false;
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    @InterfaceC3647
    public void removeCallback(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
        this.sizeDeterminer.removeCallback(sizeReadyCallback);
    }

    public void resumeMyRequest() {
        Request request = getRequest();
        if (request == null || !request.isCleared()) {
            return;
        }
        request.begin();
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void setRequest(@InterfaceC6490 Request request) {
        setTag(request);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    @InterfaceC6391
    public final ViewTarget<T, Z> waitForLayout() {
        this.sizeDeterminer.waitForLayout = true;
        return this;
    }

    @Deprecated
    public ViewTarget(@InterfaceC6391 T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }
}
