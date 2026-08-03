package com.kongzue.dialogx.util.views;

import Yue.C4429;
import Yue.C5450;
import Yue.C8273;
import Yue.C8439;
import Yue.C8472;
import Yue.InterfaceC6391;
import Yue.InterfaceC6545;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FitSystemBarUtils {
    private CallBack callBack;
    private View contentView;
    private BaseDialog dialog;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    RelativePadding relativePaddingCache;
    View.OnLayoutChangeListener rootViewLayoutChangeListener;
    private boolean specialMode;
    private int specialModeImeHeight;
    private boolean inSmoothingPadding = false;
    public boolean safeCutOutPadding = true;
    public boolean smoothPadding = true;

    /* JADX INFO: renamed from: com.kongzue.dialogx.util.views.FitSystemBarUtils$6 */
    public static /* synthetic */ class C25796 {

        /* JADX INFO: renamed from: $SwitchMap$com$kongzue$dialogx$util$views$FitSystemBarUtils$Orientation */
        static final /* synthetic */ int[] f4179x43a445c0;

        static {
            int[] iArr = new int[Orientation.values().length];
            f4179x43a445c0 = iArr;
            try {
                iArr[Orientation.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4179x43a445c0[Orientation.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4179x43a445c0[Orientation.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4179x43a445c0[Orientation.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface CallBack {
        int initialPadding(Orientation orientation);

        boolean isEnable(Orientation orientation);

        void unsafeRect(int i, int i2, int i3, int i4);
    }

    public enum Orientation {
        Start,
        Top,
        End,
        Bottom
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private FitSystemBarUtils() {
    }

    private void addListenerWhenImeHeightChanged() {
        this.specialMode = true;
        final View decorView = getDecorView();
        if (decorView == null) {
            return;
        }
        if (this.onGlobalLayoutListener != null) {
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.kongzue.dialogx.util.views.FitSystemBarUtils.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                int height = decorView.getHeight();
                int i = Build.VERSION.SDK_INT;
                WindowInsetsController windowInsetsController = i >= 30 ? FitSystemBarUtils.this.getDecorView().getWindowInsetsController() : null;
                if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
                    rect.bottom = height;
                }
                int i2 = height - rect.bottom;
                if (i2 != FitSystemBarUtils.this.specialModeImeHeight) {
                    FitSystemBarUtils.this.specialModeImeHeight = i2;
                    FitSystemBarUtils.this.log("    FitSystemBarUtils: specialModeImeHeight=" + FitSystemBarUtils.this.specialModeImeHeight);
                    FitSystemBarUtils.this.applyCallBack();
                }
            }
        };
        this.onGlobalLayoutListener = onGlobalLayoutListener;
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void applyCallBack() {
        RelativePadding relativePadding = this.relativePaddingCache;
        if (relativePadding != null) {
            applyCallBack(relativePadding);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FitSystemBarUtils attachView(View view) {
        return attachView(view, new CallBack() { // from class: com.kongzue.dialogx.util.views.FitSystemBarUtils.1
            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public int initialPadding(Orientation orientation) {
                return 0;
            }

            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public boolean isEnable(Orientation orientation) {
                return true;
            }

            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public void unsafeRect(int i, int i2, int i3, int i4) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkOrientationAndStatusBarSide() {
        Activity activity = getActivity();
        if (activity == null || activity.getResources().getConfiguration().orientation != 2) {
            return 0;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 1) {
            return rotation != 3 ? 0 : 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void formatInsets(C8472 c8472, RelativePadding relativePadding) {
        int iM12893;
        int iM12894;
        int iM12892;
        int iM128932;
        C4429 c4429M28280;
        if (this.contentView == null || c8472 == null || relativePadding == null) {
            return;
        }
        this.relativePaddingCache = relativePadding;
        if (!this.safeCutOutPadding || (c4429M28280 = c8472.m28280()) == null) {
            iM12893 = 0;
            iM12894 = 0;
            iM12892 = 0;
            iM128932 = 0;
        } else {
            iM12894 = c4429M28280.m12894();
            iM12892 = c4429M28280.m12892();
            iM128932 = c4429M28280.m12893();
            iM12893 = c4429M28280.m12893();
        }
        C5450 c5450M28281 = c8472.m28281(C8472.C8483.m28355() | C8472.C8483.m28360());
        int i = c5450M28281.f1520;
        int i2 = c5450M28281.f13399;
        int windowSystemUiVisibility = this.contentView.getRootView().getWindowSystemUiVisibility();
        int i3 = Build.VERSION.SDK_INT;
        boolean z = i3 >= 30 || (windowSystemUiVisibility & 4) == 0;
        int i4 = ((i3 >= 30 || (windowSystemUiVisibility & 2) == 0) && (c8472.m28303(C8472.C8483.m28355()) || c8472.m28303(C8472.C8483.m28358()))) ? c5450M28281.f13400 : 0;
        int i5 = (z && c8472.m28303(C8472.C8483.m28359())) ? c5450M28281.f1521 : 0;
        if (isWrongInsets(c5450M28281)) {
            log("    FitSystemBarUtils: isWrongInsets try special mode...");
            int iCheckOrientationAndStatusBarSide = checkOrientationAndStatusBarSide();
            log("    FitSystemBarUtils: deviceOrientation = " + iCheckOrientationAndStatusBarSide);
            if (iCheckOrientationAndStatusBarSide != 1) {
                relativePadding.top = getStatusBarHeight();
                relativePadding.bottom = getNavigationBarHeight();
            } else {
                relativePadding.end = getStatusBarHeight();
                relativePadding.start = getNavigationBarHeight();
            }
            addListenerWhenImeHeightChanged();
        } else {
            this.specialMode = false;
            if (this.callBack.isEnable(Orientation.Top)) {
                relativePadding.top += Math.max(i5, iM12894);
            }
            if (this.callBack.isEnable(Orientation.Bottom)) {
                relativePadding.bottom += Math.max(i4, iM12893);
            }
            boolean z2 = C8273.m27356(this.contentView) == 1;
            if (this.callBack.isEnable(Orientation.Start)) {
                if (z2) {
                    relativePadding.start += Math.max(i2, iM128932);
                } else {
                    relativePadding.start += Math.max(i, iM12892);
                }
            }
            if (this.callBack.isEnable(Orientation.End)) {
                if (z2) {
                    relativePadding.end += Math.max(i, iM12892);
                } else {
                    relativePadding.end += Math.max(i2, iM128932);
                }
            }
        }
        applyCallBack(relativePadding);
    }

    private Activity getActivity() {
        BaseDialog baseDialog = this.dialog;
        return baseDialog == null ? BaseDialog.getTopActivity() : baseDialog.getOwnActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAppTargetSDKVersion() {
        try {
            Context applicationContext = BaseDialog.getApplicationContext();
            if (applicationContext == null) {
                return -1;
            }
            return applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getDecorView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getWindow().getDecorView();
    }

    private int getNavigationBarHeight() {
        if (isFullScreen() || getDecorView() == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowInsetsController windowInsetsController = i >= 30 ? getDecorView().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 16) == 0) {
            log("getNavigationBarHeight =0");
            return 0;
        }
        View view = this.contentView;
        Resources system = (view == null || view.getContext() == null) ? Resources.getSystem() : this.contentView.getContext().getResources();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private int getStatusBarHeight() {
        if (isFullScreen() || getDecorView() == null) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        WindowInsetsController windowInsetsController = i >= 30 ? getDecorView().getWindowInsetsController() : null;
        if (i >= 30 && windowInsetsController != null && (windowInsetsController.getSystemBarsBehavior() & 8192) == 0) {
            return 0;
        }
        View view = this.contentView;
        Resources system = (view == null || view.getContext() == null) ? Resources.getSystem() : this.contentView.getContext().getResources();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private boolean isFullScreen() {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        return ((activity.getWindow().getAttributes().flags & 1024) == 0 && (activity.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) ? false : true;
    }

    private boolean isWrongInsets(C5450 c5450) {
        return c5450.f1521 == 0 && c5450.f13400 == 0 && c5450.f1520 == 0 && c5450.f13399 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C8472 lambda$applyWindowInsets$0(RelativePadding relativePadding, View view, C8472 c8472) {
        if (this.inSmoothingPadding) {
            return c8472;
        }
        formatInsets(c8472, new RelativePadding(relativePadding));
        return c8472;
    }

    public void applyWindowInsets() {
        final RelativePadding relativePadding = new RelativePadding(C8273.m27367(this.contentView), this.contentView.getPaddingTop(), C8273.m27366(this.contentView), this.contentView.getPaddingBottom());
        C8273.m27468(this.contentView, new InterfaceC6545() { // from class: Yue.ۥ۠ۢۡۦ
            @Override // Yue.InterfaceC6545
            public final C8472 onApplyWindowInsets(View view, C8472 c8472) {
                return this.f1189.lambda$applyWindowInsets$0(relativePadding, view, c8472);
            }
        });
        if (Build.VERSION.SDK_INT >= 30) {
            log("FitSystemBarUtils: setWindowInsetsAnimationCallback");
            C8273.m27491(this.contentView, new C8439.AbstractC1537(1) { // from class: com.kongzue.dialogx.util.views.FitSystemBarUtils.3
                @Override // Yue.C8439.AbstractC1537
                public void onEnd(@InterfaceC6391 C8439 c8439) {
                    FitSystemBarUtils.this.log("FitSystemBarUtils: setWindowInsetsAnimationCallback#onEnd ");
                    FitSystemBarUtils.this.inSmoothingPadding = false;
                    super.onEnd(c8439);
                }

                @Override // Yue.C8439.AbstractC1537
                public void onPrepare(@InterfaceC6391 C8439 c8439) {
                    FitSystemBarUtils fitSystemBarUtils = FitSystemBarUtils.this;
                    fitSystemBarUtils.inSmoothingPadding = fitSystemBarUtils.smoothPadding;
                    super.onPrepare(c8439);
                }

                @Override // Yue.C8439.AbstractC1537
                @InterfaceC6391
                public C8472 onProgress(@InterfaceC6391 C8472 c8472, @InterfaceC6391 List<C8439> list) {
                    FitSystemBarUtils.this.log("FitSystemBarUtils: setWindowInsetsAnimationCallback#onProgress: " + c8472);
                    FitSystemBarUtils fitSystemBarUtils = FitSystemBarUtils.this;
                    if (fitSystemBarUtils.smoothPadding) {
                        fitSystemBarUtils.formatInsets(c8472, new RelativePadding(relativePadding));
                    }
                    return c8472;
                }
            });
        }
        if (C8273.m27397(this.contentView)) {
            log("FitSystemBarUtils: AttachedToWindow ok");
            C8273.m27433(this.contentView);
        } else {
            log("FitSystemBarUtils: wait AttachedToWindow");
            this.contentView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.kongzue.dialogx.util.views.FitSystemBarUtils.4

                /* JADX INFO: renamed from: com.kongzue.dialogx.util.views.FitSystemBarUtils$4$3, reason: invalid class name */
                public class AnonymousClass3 implements ViewTreeObserver.OnPreDrawListener {
                    final /* synthetic */ View val$parentView;

                    public AnonymousClass3(View view) {
                        this.val$parentView = view;
                    }

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        Rect rect = new Rect();
                        this.val$parentView.getWindowVisibleDisplayFrame(rect);
                        int i = rect.top;
                        Resources resources = this.val$parentView.getResources();
                        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                        int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                        FitSystemBarUtils.this.log("FitSystemBarUtils: below Android M use support mode: statusBarHeight=" + i + ", navigationBarHeight=" + dimensionPixelSize);
                        int iCheckOrientationAndStatusBarSide = FitSystemBarUtils.this.checkOrientationAndStatusBarSide();
                        FitSystemBarUtils.this.log("    FitSystemBarUtils: deviceOrientation = " + iCheckOrientationAndStatusBarSide);
                        if (iCheckOrientationAndStatusBarSide == -1 || iCheckOrientationAndStatusBarSide == 1) {
                            RelativePadding relativePadding = relativePadding;
                            relativePadding.end = dimensionPixelSize;
                            relativePadding.start = 0;
                        } else {
                            RelativePadding relativePadding2 = relativePadding;
                            relativePadding2.top = i;
                            relativePadding2.bottom = dimensionPixelSize;
                        }
                        ViewOnAttachStateChangeListenerC25774 viewOnAttachStateChangeListenerC25774 = ViewOnAttachStateChangeListenerC25774.this;
                        FitSystemBarUtils.this.applyCallBack(relativePadding);
                        this.val$parentView.getViewTreeObserver().removeOnPreDrawListener(this);
                        return true;
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                    FitSystemBarUtils.this.log("FitSystemBarUtils: onViewAttachedToWindow");
                    if (Build.VERSION.SDK_INT < 30 || FitSystemBarUtils.this.getAppTargetSDKVersion() < 30) {
                        final View view2 = (View) view.getParent();
                        View.OnLayoutChangeListener onLayoutChangeListener = FitSystemBarUtils.this.rootViewLayoutChangeListener;
                        if (onLayoutChangeListener != null) {
                            view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                        }
                        FitSystemBarUtils.this.rootViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.kongzue.dialogx.util.views.FitSystemBarUtils.4.1
                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                WindowInsets rootWindowInsets = view3.getRootView().getRootWindowInsets();
                                if (rootWindowInsets == null) {
                                    FitSystemBarUtils.this.log("    FitSystemBarUtils: RootView not get Insets");
                                } else {
                                    FitSystemBarUtils.this.log("    FitSystemBarUtils: RootView get Insets");
                                    FitSystemBarUtils.this.formatInsets(C8472.m28276(rootWindowInsets), new RelativePadding(relativePadding));
                                }
                            }
                        };
                        view2.addOnLayoutChangeListener(FitSystemBarUtils.this.rootViewLayoutChangeListener);
                        view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.kongzue.dialogx.util.views.FitSystemBarUtils.4.2
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view3) {
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view3) {
                                view2.removeOnLayoutChangeListener(FitSystemBarUtils.this.rootViewLayoutChangeListener);
                            }
                        });
                    }
                    C8273.m27433(view);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
    }

    public boolean isInSmoothingPadding() {
        return this.inSmoothingPadding;
    }

    public void log(String str) {
        if (DialogXBaseRelativeLayout.debugMode && DialogX.DEBUGMODE) {
            Log.e(">>>", str);
        }
    }

    public void recycle() {
        View decorView = getDecorView();
        if (decorView != null && this.onGlobalLayoutListener != null) {
            decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
        this.onGlobalLayoutListener = null;
        this.callBack = null;
        this.contentView = null;
        this.dialog = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static FitSystemBarUtils attachView(View view, CallBack callBack) {
        return new FitSystemBarUtils(view, callBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyCallBack(RelativePadding relativePadding) {
        CallBack callBack = this.callBack;
        if (callBack == null) {
            return;
        }
        relativePadding.start += callBack.initialPadding(Orientation.Start);
        relativePadding.top += this.callBack.initialPadding(Orientation.Top);
        relativePadding.end += this.callBack.initialPadding(Orientation.End);
        relativePadding.bottom += this.callBack.initialPadding(Orientation.Bottom);
        relativePadding.applyToView(this.contentView);
        log("    KONGZUE DEBUG DIALOGX FitSystemBarUtils callBack: left=" + relativePadding.start + " top=" + relativePadding.top + " right=" + relativePadding.end + " bottom=" + relativePadding.bottom + " specialMode=" + this.specialMode + " specialModeImeHeight=" + this.specialModeImeHeight);
        this.callBack.unsafeRect(relativePadding.start, relativePadding.top, relativePadding.end, relativePadding.bottom + (this.specialMode ? this.specialModeImeHeight : 0));
    }

    public static FitSystemBarUtils attachView(View view, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        return attachView(view, new CallBack() { // from class: com.kongzue.dialogx.util.views.FitSystemBarUtils.2
            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public int initialPadding(Orientation orientation) {
                return 0;
            }

            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public boolean isEnable(Orientation orientation) {
                int i = C25796.f4179x43a445c0[orientation.ordinal()];
                if (i == 1) {
                    return z;
                }
                if (i == 2) {
                    return z2;
                }
                if (i == 3) {
                    return z3;
                }
                if (i != 4) {
                    return false;
                }
                return z4;
            }

            @Override // com.kongzue.dialogx.util.views.FitSystemBarUtils.CallBack
            public void unsafeRect(int i, int i2, int i3, int i4) {
            }
        });
    }

    public static class RelativePadding {
        int bottom;
        int end;
        int start;
        int top;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public void applyToView(View view) {
            if (view instanceof DialogXBaseRelativeLayout) {
                return;
            }
            C8273.m27471(view, this.start, this.top, this.end, this.bottom);
        }

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public FitSystemBarUtils(View view, CallBack callBack) {
        this.contentView = view;
        this.callBack = callBack;
        if (view instanceof DialogXBaseRelativeLayout) {
            this.dialog = ((DialogXBaseRelativeLayout) view).getParentDialog();
        }
        applyWindowInsets();
    }
}
