package com.google.android.material.internal;

import Yue.C4187;
import Yue.C8273;
import Yue.C8472;
import Yue.C8514;
import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6545;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.C1980R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ViewUtils {

    @InterfaceC7113(16)
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        C8472 onApplyWindowInsets(View view, C8472 c8472, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(@InterfaceC6490 View view, @InterfaceC6391 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @InterfaceC6391
    public static Rect calculateOffsetRectFromBounds(@InterfaceC6391 View view, @InterfaceC6391 View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static Rect calculateRectFromBounds(@InterfaceC6391 View view) {
        return calculateRectFromBounds(view, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void doOnApplyWindowInsets(@InterfaceC6391 View view, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static float dpToPx(@InterfaceC6391 Context context, @InterfaceC4399(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @InterfaceC6490
    public static Integer getBackgroundColor(@InterfaceC6391 View view) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @InterfaceC6391
    public static List<View> getChildren(@InterfaceC6490 View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    @InterfaceC6490
    public static ViewGroup getContentView(@InterfaceC6490 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @InterfaceC6490
    public static ViewOverlayImpl getContentViewOverlay(@InterfaceC6391 View view) {
        return getOverlay(getContentView(view));
    }

    @InterfaceC6490
    private static InputMethodManager getInputMethodManager(@InterfaceC6391 View view) {
        return (InputMethodManager) C4187.m12072(view.getContext(), InputMethodManager.class);
    }

    @InterfaceC6490
    public static ViewOverlayImpl getOverlay(@InterfaceC6490 View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static float getParentAbsoluteElevation(@InterfaceC6391 View view) {
        float fM27347 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM27347 += C8273.m27347((View) parent);
        }
        return fM27347;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void hideKeyboard(@InterfaceC6391 View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        return C8273.m27356(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void removeOnGlobalLayoutListener(@InterfaceC6490 View view, @InterfaceC6391 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(@InterfaceC6391 View view) {
        if (C8273.m27397(view)) {
            C8273.m27433(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@InterfaceC6391 View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    C8273.m27433(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void requestFocusAndShowKeyboard(@InterfaceC6391 View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void setBoundsFromRect(@InterfaceC6391 View view, @InterfaceC6391 Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void showKeyboard(@InterfaceC6391 View view) {
        showKeyboard(view, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static Rect calculateRectFromBounds(@InterfaceC6391 View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void doOnApplyWindowInsets(@InterfaceC6391 View view, @InterfaceC6490 AttributeSet attributeSet, int i, int i2, @InterfaceC6490 final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C1980R.styleable.Insets, i, i2);
        final boolean z = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @InterfaceC6391
            public C8472 onApplyWindowInsets(View view2, @InterfaceC6391 C8472 c8472, @InterfaceC6391 RelativePadding relativePadding) {
                if (z) {
                    relativePadding.bottom += c8472.m28290();
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z2) {
                    if (zIsLayoutRtl) {
                        relativePadding.end += c8472.m28291();
                    } else {
                        relativePadding.start += c8472.m28291();
                    }
                }
                if (z3) {
                    if (zIsLayoutRtl) {
                        relativePadding.start += c8472.m28292();
                    } else {
                        relativePadding.end += c8472.m28292();
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, c8472, relativePadding) : c8472;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void hideKeyboard(@InterfaceC6391 View view, boolean z) {
        C8514 c8514M27384;
        if (z && (c8514M27384 = C8273.m27384(view)) != null) {
            c8514M27384.m28365(C8472.C8483.m28355());
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void removeOnGlobalLayoutListener(@InterfaceC6391 ViewTreeObserver viewTreeObserver, @InterfaceC6391 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void requestFocusAndShowKeyboard(@InterfaceC6391 final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: Yue.ۥۢۤۧۥ
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.showKeyboard(view, z);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void showKeyboard(@InterfaceC6391 View view, boolean z) {
        C8514 c8514M27384;
        if (!z || (c8514M27384 = C8273.m27384(view)) == null) {
            getInputMethodManager(view).showSoftInput(view, 1);
        } else {
            c8514M27384.m28372(C8472.C8483.m28355());
        }
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public void applyToView(View view) {
            C8273.m27471(view, this.start, this.top, this.end, this.bottom);
        }

        public RelativePadding(@InterfaceC6391 RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(@InterfaceC6391 View view, @InterfaceC6391 final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(C8273.m27367(view), view.getPaddingTop(), C8273.m27366(view), view.getPaddingBottom());
        C8273.m27468(view, new InterfaceC6545() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // Yue.InterfaceC6545
            public C8472 onApplyWindowInsets(View view2, C8472 c8472) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, c8472, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }
}
