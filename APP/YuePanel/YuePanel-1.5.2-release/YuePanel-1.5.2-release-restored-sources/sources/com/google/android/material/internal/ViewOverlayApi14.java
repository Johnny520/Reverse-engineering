package com.google.android.material.internal;

import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ViewOverlayApi14 implements ViewOverlayImpl {
    protected OverlayViewGroup overlayViewGroup;

    public ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.overlayViewGroup = new OverlayViewGroup(context, viewGroup, view, this);
    }

    public static ViewOverlayApi14 createFrom(View view) {
        ViewGroup contentView = ViewUtils.getContentView(view);
        if (contentView == null) {
            return null;
        }
        int childCount = contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = contentView.getChildAt(i);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).viewOverlay;
            }
        }
        return new ViewGroupOverlayApi14(contentView.getContext(), contentView, view);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@InterfaceC6391 Drawable drawable) {
        this.overlayViewGroup.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@InterfaceC6391 Drawable drawable) {
        this.overlayViewGroup.remove(drawable);
    }

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    public static class OverlayViewGroup extends ViewGroup {
        static Method invalidateChildInParentFastMethod;
        private boolean disposed;
        ArrayList<Drawable> drawables;
        ViewGroup hostView;
        View requestingView;
        ViewOverlayApi14 viewOverlay;

        static {
            try {
                Class cls = Integer.TYPE;
                invalidateChildInParentFastMethod = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.drawables = null;
            this.hostView = viewGroup;
            this.requestingView = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.viewOverlay = viewOverlayApi14;
        }

        private void assertNotDisposed() {
            if (this.disposed) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void disposeIfEmpty() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.drawables;
                if (arrayList == null || arrayList.size() == 0) {
                    this.disposed = true;
                    this.hostView.removeView(this);
                }
            }
        }

        private void getOffset(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.hostView.getLocationOnScreen(iArr2);
            this.requestingView.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void add(Drawable drawable) {
            assertNotDisposed();
            if (this.drawables == null) {
                this.drawables = new ArrayList<>();
            }
            if (this.drawables.contains(drawable)) {
                return;
            }
            this.drawables.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.hostView.getLocationOnScreen(new int[2]);
            this.requestingView.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.requestingView.getWidth(), this.requestingView.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.drawables;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.drawables.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.hostView == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.hostView == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            getOffset(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        public ViewParent invalidateChildInParentFast(int i, int i2, Rect rect) {
            if (this.hostView == null || invalidateChildInParentFastMethod == null) {
                return null;
            }
            try {
                getOffset(new int[2]);
                invalidateChildInParentFastMethod.invoke(this.hostView, Integer.valueOf(i), Integer.valueOf(i2), rect);
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@InterfaceC6391 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void remove(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.drawables;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                disposeIfEmpty();
            }
        }

        @Override // android.view.View
        public boolean verifyDrawable(@InterfaceC6391 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.drawables) != null && arrayList.contains(drawable));
        }

        public void remove(View view) {
            super.removeView(view);
            disposeIfEmpty();
        }

        public void add(View view) {
            assertNotDisposed();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.hostView && viewGroup.getParent() != null && C8273.m27397(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.hostView.getLocationOnScreen(iArr2);
                    C8273.m27414(view, iArr[0] - iArr2[0]);
                    C8273.m27415(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }
    }
}
