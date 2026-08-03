package com.kongzue.dialogx.util.views;

import Yue.AbstractC6546;
import Yue.C5450;
import Yue.C8364;
import Yue.C8472;
import Yue.InterfaceC6549;
import Yue.InterfaceC6844;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LifecycleOwner;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedDispatcher;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog;
import com.kongzue.dialogx.interfaces.DialogXSafetyModeInterface;
import com.kongzue.dialogx.interfaces.NoTouchInterface;
import com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener;
import com.kongzue.dialogx.util.views.FitSystemBarUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {
    public static boolean debugMode;
    private boolean autoUnsafePlacePadding;
    int[] extraPadding;
    private FitSystemBarUtils fitSystemBarUtils;
    private boolean focusable;
    private boolean interceptBack;
    private boolean isInited;
    boolean isLightMode;
    float nowBkgAlphaValue;
    AbstractC6546 onBackPressedCallback;
    private PrivateBackPressedListener onBackPressedListener;
    private OnLifecycleCallBack onLifecycleCallBack;
    private OnSafeInsetsChangeListener onSafeInsetsChangeListener;
    private WeakReference<BaseDialog> parentDialog;
    private WeakReference<View> requestFocusView;
    boolean touch;
    float touchDownX;
    float touchDownY;
    protected Rect unsafePlace;

    /* JADX INFO: renamed from: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$3 */
    public static /* synthetic */ class C25733 {

        /* JADX INFO: renamed from: $SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation */
        static final /* synthetic */ int[] f4178x43a445c0;

        static {
            int[] iArr = new int[FitSystemBarUtils.Orientation.values().length];
            f4178x43a445c0 = iArr;
            try {
                iArr[FitSystemBarUtils.Orientation.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4178x43a445c0[FitSystemBarUtils.Orientation.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4178x43a445c0[FitSystemBarUtils.Orientation.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4178x43a445c0[FitSystemBarUtils.Orientation.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static abstract class OnLifecycleCallBack {
        public abstract void onDismiss();

        public void onShow() {
        }
    }

    public interface PrivateBackPressedListener {
        boolean onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogXBaseRelativeLayout(Context context) {
        super(context);
        this.autoUnsafePlacePadding = true;
        this.focusable = true;
        this.interceptBack = true;
        this.isInited = false;
        this.unsafePlace = new Rect();
        this.isLightMode = true;
        this.extraPadding = new int[4];
        init(null);
    }

    private void init(AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 29) {
            setForceDarkAllowed(false);
        }
        if (this.isInited) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2413R.styleable.DialogXBaseRelativeLayout);
            this.focusable = typedArrayObtainStyledAttributes.getBoolean(C2413R.styleable.DialogXBaseRelativeLayout_baseFocusable, true);
            this.autoUnsafePlacePadding = typedArrayObtainStyledAttributes.getBoolean(C2413R.styleable.DialogXBaseRelativeLayout_autoSafeArea, true);
            this.interceptBack = typedArrayObtainStyledAttributes.getBoolean(C2413R.styleable.DialogXBaseRelativeLayout_interceptBack, true);
            typedArrayObtainStyledAttributes.recycle();
            this.isInited = true;
        }
        if (this.focusable) {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
        setBkgAlpha(0.0f);
        if (getParentDialog() != null && getParentDialog().getDialogImplMode() != DialogX.IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setDefaultFocusHighlightEnabled(false);
        log("KONGZUE DEBUG DIALOGX: create fitSystemBarUtils");
        this.fitSystemBarUtils = FitSystemBarUtils.attachView(this, new FitSystemBarUtils.CallBack() { // from class: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.1
            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public int initialPadding(FitSystemBarUtils.Orientation orientation) {
                int i = C25733.f4178x43a445c0[orientation.ordinal()];
                if (i == 1) {
                    return DialogXBaseRelativeLayout.this.extraPadding[0];
                }
                if (i == 2) {
                    return DialogXBaseRelativeLayout.this.extraPadding[1];
                }
                if (i == 3) {
                    return DialogXBaseRelativeLayout.this.extraPadding[2];
                }
                if (i != 4) {
                    return 0;
                }
                return DialogXBaseRelativeLayout.this.extraPadding[3];
            }

            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public boolean isEnable(FitSystemBarUtils.Orientation orientation) {
                return true;
            }

            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public void unsafeRect(int i, int i2, int i3, int i4) {
                DialogXBaseRelativeLayout.this.log("KONGZUE DEBUG DIALOGX: unsafeRect t=" + i2 + " b=" + i4);
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogXBaseRelativeLayout.this;
                if (dialogXBaseRelativeLayout.unsafePlace == null) {
                    dialogXBaseRelativeLayout.unsafePlace = new Rect();
                }
                C5450 c5450 = null;
                if (DialogXBaseRelativeLayout.this.getRootWindowInsets() != null) {
                    C8472 c8472M28276 = C8472.m28276(DialogXBaseRelativeLayout.this.getRootWindowInsets());
                    boolean zM28303 = c8472M28276.m28303(C8472.C8483.m28358());
                    if (!c8472M28276.m28303(C8472.C8483.m28355()) && zM28303) {
                        C5450 c5450M28281 = c8472M28276.m28281(C8472.C8483.m28360());
                        if (c5450M28281.f13400 != i4 || c5450M28281.f1521 != i2 || c5450M28281.f1520 != i || c5450M28281.f13399 != i3) {
                            c5450 = c5450M28281;
                        }
                    }
                }
                if (c5450 != null) {
                    DialogXBaseRelativeLayout.this.unsafePlace.left = Math.max(c5450.f1520, i);
                    DialogXBaseRelativeLayout.this.unsafePlace.top = Math.max(c5450.f1521, i2);
                    DialogXBaseRelativeLayout.this.unsafePlace.right = Math.max(c5450.f13399, i3);
                    DialogXBaseRelativeLayout.this.unsafePlace.bottom = Math.max(c5450.f13400, i4);
                } else {
                    Rect rect = DialogXBaseRelativeLayout.this.unsafePlace;
                    rect.left = i;
                    rect.top = i2;
                    rect.right = i3;
                    rect.bottom = i4;
                }
                if (DialogXBaseRelativeLayout.this.onSafeInsetsChangeListener != null) {
                    DialogXBaseRelativeLayout.this.onSafeInsetsChangeListener.onChange(DialogXBaseRelativeLayout.this.unsafePlace);
                }
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = DialogXBaseRelativeLayout.this;
                Rect rect2 = dialogXBaseRelativeLayout2.unsafePlace;
                dialogXBaseRelativeLayout2.setUnsafePadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        });
    }

    private boolean isAlignBottomDialog(BaseDialog baseDialog) {
        return (getParentDialog() instanceof DialogXBaseBottomDialog) || (findViewWithTag("DialogXSafetyArea") instanceof DialogXSafetyModeInterface);
    }

    private void setBackPressedDispatcher(boolean z) {
        if (!z) {
            AbstractC6546 abstractC6546 = this.onBackPressedCallback;
            if (abstractC6546 != null) {
                abstractC6546.remove();
                return;
            }
            return;
        }
        InterfaceC6549 interfaceC6549M4336 = C8364.m4336(this);
        if (interfaceC6549M4336 == null) {
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = interfaceC6549M4336.getOnBackPressedDispatcher();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) getContext();
        AbstractC6546 abstractC65462 = new AbstractC6546(true) { // from class: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.2
            @Override // Yue.AbstractC6546
            public void handleOnBackPressed() {
                if (DialogXBaseRelativeLayout.this.onBackPressedListener == null || ((BaseDialog) DialogXBaseRelativeLayout.this.parentDialog.get()).isHide()) {
                    return;
                }
                DialogXBaseRelativeLayout.this.onBackPressedListener.onBackPressed();
            }
        };
        this.onBackPressedCallback = abstractC65462;
        onBackPressedDispatcher.m28633(lifecycleOwner, abstractC65462);
    }

    public void bindFocusView(View view) {
        if (view != this) {
            this.requestFocusView = new WeakReference<>(view);
        }
    }

    @Override // android.view.View
    public boolean callOnClick() {
        if (isEnabled()) {
            return super.callOnClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        log("#dispatchKeyEvent: KeyCode=" + keyEvent.getKeyCode());
        return (isAttachedToWindow() && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4 && this.interceptBack && this.onBackPressedListener != null && !this.parentDialog.get().isHide()) ? this.onBackPressedListener.onBackPressed() : super.dispatchKeyEvent(keyEvent);
    }

    public FitSystemBarUtils getFitSystemBarUtils() {
        return this.fitSystemBarUtils;
    }

    public OnSafeInsetsChangeListener getOnSafeInsetsChangeListener() {
        return this.onSafeInsetsChangeListener;
    }

    public BaseDialog getParentDialog() {
        WeakReference<BaseDialog> weakReference = this.parentDialog;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int getRootPaddingBottom() {
        return this.extraPadding[3];
    }

    public int getRootPaddingLeft() {
        return this.extraPadding[0];
    }

    public int getRootPaddingRight() {
        return this.extraPadding[2];
    }

    public int getRootPaddingTop() {
        return this.extraPadding[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.unsafePlace;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.unsafePlace;
    }

    public int getUseAreaHeight() {
        return getHeight() - getRootPaddingBottom();
    }

    public int getUseAreaWidth() {
        return getWidth() - getRootPaddingRight();
    }

    public boolean isAutoUnsafePlacePadding() {
        return this.autoUnsafePlacePadding;
    }

    public boolean isBaseFocusable() {
        return this.focusable;
    }

    public boolean isInterceptBack() {
        return this.interceptBack;
    }

    public void log(String str) {
        if (debugMode && DialogX.DEBUGMODE) {
            Log.e(">>>", str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackPressedDispatcher(true);
        if (isInEditMode() || getParentDialog() == null || getParentDialog().getOwnActivity() == null) {
            return;
        }
        OnLifecycleCallBack onLifecycleCallBack = this.onLifecycleCallBack;
        if (onLifecycleCallBack != null) {
            onLifecycleCallBack.onShow();
        }
        this.isLightMode = (getResources().getConfiguration().uiMode & 48) == 16;
        if (this.focusable) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.isLightMode == ((configuration.uiMode & 48) == 16) || DialogX.globalTheme != DialogX.THEME.AUTO || getParentDialog() == null) {
            return;
        }
        getParentDialog().restartDialog();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        OnLifecycleCallBack onLifecycleCallBack = this.onLifecycleCallBack;
        if (onLifecycleCallBack != null) {
            onLifecycleCallBack.onDismiss();
        }
        FitSystemBarUtils fitSystemBarUtils = this.fitSystemBarUtils;
        if (fitSystemBarUtils != null) {
            fitSystemBarUtils.recycle();
        }
        setBackPressedDispatcher(false);
        this.fitSystemBarUtils = null;
        this.onSafeInsetsChangeListener = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touch = true;
            this.touchDownX = motionEvent.getX();
            this.touchDownY = motionEvent.getY();
        } else if (action == 1 && this.touch && findFocus() != this && getParentDialog() != null) {
            float fDip2px = getParentDialog().dip2px(5.0f);
            if (Math.abs(motionEvent.getX() - this.touchDownX) <= fDip2px && Math.abs(motionEvent.getY() - this.touchDownY) <= fDip2px) {
                callOnClick();
            }
        }
        if (getParentDialog() instanceof NoTouchInterface) {
            return super.onTouchEvent(motionEvent);
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 2);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled()) {
            return super.performClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        WeakReference<View> weakReference;
        if (getParentDialog() != null && (getParentDialog() instanceof NoTouchInterface)) {
            return false;
        }
        if (i == 130 && (weakReference = this.requestFocusView) != null && weakReference.get() != null && this.requestFocusView.get() != this) {
            return this.requestFocusView.get().requestFocus();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || viewFindFocus == this) {
            return super.requestFocus(i, rect);
        }
        viewFindFocus.requestFocus();
        return true;
    }

    public void requestFocusOnResume() {
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || viewFindFocus == this) {
            requestFocus();
        } else {
            viewFindFocus.requestFocus();
        }
    }

    public DialogXBaseRelativeLayout setAutoUnsafePlacePadding(boolean z) {
        this.autoUnsafePlacePadding = z;
        return this;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        drawable.setAlpha((int) (this.nowBkgAlphaValue * 255.0f));
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setBackground(new ColorDrawable(i));
    }

    public DialogXBaseRelativeLayout setBkgAlpha(float f) {
        this.nowBkgAlphaValue = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
        return this;
    }

    public DialogXBaseRelativeLayout setInterceptBack(boolean z) {
        this.interceptBack = z;
        return this;
    }

    public DialogXBaseRelativeLayout setOnBackPressedListener(PrivateBackPressedListener privateBackPressedListener) {
        this.onBackPressedListener = privateBackPressedListener;
        return this;
    }

    public DialogXBaseRelativeLayout setOnLifecycleCallBack(OnLifecycleCallBack onLifecycleCallBack) {
        this.onLifecycleCallBack = onLifecycleCallBack;
        return this;
    }

    public DialogXBaseRelativeLayout setOnSafeInsetsChangeListener(OnSafeInsetsChangeListener onSafeInsetsChangeListener) {
        this.onSafeInsetsChangeListener = onSafeInsetsChangeListener;
        return this;
    }

    public DialogXBaseRelativeLayout setParentDialog(BaseDialog baseDialog) {
        this.parentDialog = new WeakReference<>(baseDialog);
        if (baseDialog != null && baseDialog.getDialogImplMode() != DialogX.IMPL_MODE.VIEW) {
            setFitsSystemWindows(true);
        }
        if (this.unsafePlace != null) {
            log("KONGZUE DEBUG DIALOGX: setParentDialog()=" + getParentDialog());
            Rect rect = this.unsafePlace;
            setUnsafePadding(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            log("KONGZUE DEBUG DIALOGX: setParentDialog() unsafePlace is null");
        }
        return this;
    }

    public void setRootPadding(int i, int i2, int i3, int i4) {
        int[] iArr = this.extraPadding;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public void setUnsafePadding(@InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        log("KONGZUE DEBUG DIALOGX: setUnsafePadding=" + getParentDialog() + " t=" + i2 + " b=" + i4);
        if (DialogX.ignoreUnsafeInsetsHorizontal) {
            log("  KONGZUE DEBUG DIALOGX: ignoreUnsafeInsetsHorizontal, start and end set 0");
            i = 0;
            i3 = 0;
        }
        if (isAlignBottomDialog(getParentDialog())) {
            log("  KONGZUE DEBUG DIALOGX: Dialog is align bottom");
            View viewFindViewWithTag = findViewWithTag("DialogXSafetyArea");
            if (viewFindViewWithTag instanceof DialogXSafetyModeInterface) {
                int dialogXSafetyMode = ((DialogXSafetyModeInterface) viewFindViewWithTag).getDialogXSafetyMode();
                boolean z = (dialogXSafetyMode & 1) != 0;
                boolean z2 = (dialogXSafetyMode & 2) != 0;
                boolean z3 = (dialogXSafetyMode & 4) != 0;
                boolean z4 = (dialogXSafetyMode & 8) != 0;
                log("    KONGZUE DEBUG DIALOGX: dialogXSafetyArea" + viewFindViewWithTag + " hasLeft=" + z2 + "hasTop=" + z + " hasRight=" + z4 + " hasBottom=" + z3);
                viewFindViewWithTag.setPadding(z2 ? i : 0, z ? i2 : 0, z4 ? i3 : 0, z3 ? i4 : 0);
                if (z) {
                    i2 = 0;
                }
                if (z2) {
                    i = 0;
                }
                if (z4) {
                    i3 = 0;
                }
                if (z3) {
                }
            } else {
                ViewGroup viewGroup = (ViewGroup) findViewById(C2413R.id.bkg);
                if (!((DialogXBaseBottomDialog) getParentDialog()).isBottomNonSafetyAreaBySelf() && viewGroup != null) {
                    log("    KONGZUE DEBUG DIALOGX: bkgView.setPadding b=" + i4);
                    viewGroup.setPadding(0, 0, 0, i4);
                }
            }
            i4 = 0;
        }
        if (isAutoUnsafePlacePadding()) {
            log("  KONGZUE DEBUG DIALOGX: root.setPadding t=" + i2 + " b=" + i4);
            setPadding(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8 && getAlpha() == 0.0f) {
            setAlpha(0.01f);
        }
        super.setVisibility(i);
    }

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.autoUnsafePlacePadding = true;
        this.focusable = true;
        this.interceptBack = true;
        this.isInited = false;
        this.unsafePlace = new Rect();
        this.isLightMode = true;
        this.extraPadding = new int[4];
        init(attributeSet);
    }

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.autoUnsafePlacePadding = true;
        this.focusable = true;
        this.interceptBack = true;
        this.isInited = false;
        this.unsafePlace = new Rect();
        this.isLightMode = true;
        this.extraPadding = new int[4];
        init(attributeSet);
    }
}
