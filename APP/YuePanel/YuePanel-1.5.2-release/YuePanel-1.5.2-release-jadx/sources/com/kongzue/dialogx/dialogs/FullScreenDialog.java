package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener;
import com.kongzue.dialogx.interfaces.ScrollController;
import com.kongzue.dialogx.util.FullScreenDialogTouchEventInterceptor;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FullScreenDialog extends BaseDialog implements DialogXBaseBottomDialog {
    public static final int ACTIVITY_CONTENT_RADIUS_DEFAULT = -1;
    public static final int ACTIVITY_CONTENT_RADIUS_KEEP = -2;
    public static BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterDuration = -1;
    public static int overrideExitDuration = -1;
    private Integer deviceRadiusCache;
    protected DialogImpl dialogImpl;
    protected DialogLifecycleCallback<FullScreenDialog> dialogLifecycleCallback;
    protected DialogXAnimInterface<FullScreenDialog> dialogXAnimImpl;
    protected boolean hideActivityContentView;
    protected boolean hideWithExitAnim;
    protected boolean hideZoomBackground;
    protected OnBackPressedListener<FullScreenDialog> onBackPressedListener;
    protected OnBackgroundMaskClickListener<FullScreenDialog> onBackgroundMaskClickListener;
    protected OnBindView<FullScreenDialog> onBindView;
    protected BaseDialog.BOOLEAN privateCancelable;
    protected float backgroundRadius = DialogX.defaultFullScreenDialogBackgroundRadius;
    protected float activityContentRadius = -1.0f;
    protected boolean allowInterceptTouch = true;
    protected boolean bottomNonSafetyAreaBySelf = false;
    protected Integer maskColor = null;

    /* JADX INFO: renamed from: me */
    protected FullScreenDialog f4162me = this;

    public class DialogImpl implements DialogConvertViewInterface {
        public MaxRelativeLayout bkg;
        public RelativeLayout boxBkg;
        public RelativeLayout boxCustom;
        public DialogXBaseRelativeLayout boxRoot;
        protected int enterY;
        private FullScreenDialogTouchEventInterceptor fullScreenDialogTouchEventInterceptor;
        public ActivityScreenShotImageView imgZoomActivity;
        public ScrollController scrollView;
        public float bkgEnterAimY = -1.0f;
        private Rect mUnsafeRect = new Rect(0, 0, 0, 0);
        private boolean enterAnimRunning = true;

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            FullScreenDialog.this.setDialogView(view);
            this.imgZoomActivity = (ActivityScreenShotImageView) view.findViewById(C2413R.id.img_zoom_activity);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.boxBkg = (RelativeLayout) view.findViewById(C2413R.id.box_bkg);
            this.bkg = (MaxRelativeLayout) view.findViewById(C2413R.id.bkg);
            this.boxCustom = (RelativeLayout) view.findViewById(C2413R.id.box_custom);
            ActivityScreenShotImageView activityScreenShotImageView = this.imgZoomActivity;
            activityScreenShotImageView.hideActivityContentView = FullScreenDialog.this.hideActivityContentView;
            activityScreenShotImageView.bindDialog(FullScreenDialog.this);
            if (FullScreenDialog.this.hideZoomBackground) {
                view.setBackgroundResource(C2413R.color.black20);
                this.imgZoomActivity.setVisibility(8);
            } else {
                view.setBackgroundResource(C2413R.color.black);
                this.imgZoomActivity.setVisibility(0);
            }
            init();
            FullScreenDialog.this.dialogImpl = this;
            refreshView();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void doShowAnimRepeat(int i, final int i2, boolean z) {
            this.enterAnimRunning = true;
            long enterAnimationDuration = getEnterAnimationDuration();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
            valueAnimatorOfInt.setDuration(enterAnimationDuration);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Yue.ۥۣ۠۠ۢ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f1303.lambda$doShowAnimRepeat$0(i2, valueAnimator);
                }
            });
            valueAnimatorOfInt.start();
            this.bkg.setVisibility(0);
            if (z) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(enterAnimationDuration);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.10
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            valueAnimatorOfFloat.start();
        }

        private boolean isMatchParentHeightCustomView() {
            ViewGroup.LayoutParams layoutParams;
            OnBindView<FullScreenDialog> onBindView = FullScreenDialog.this.onBindView;
            return (onBindView == null || onBindView.getCustomView() == null || (layoutParams = FullScreenDialog.this.onBindView.getCustomView().getLayoutParams()) == null || layoutParams.height != -1) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doShowAnimRepeat$0(int i, ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.bkg.setY(iIntValue);
            makeEnterY();
            float safeHeight = this.boxRoot.getSafeHeight() - this.enterY;
            if (safeHeight < 0.0f) {
                safeHeight = 0.0f;
            }
            if (safeHeight != this.bkgEnterAimY) {
                this.bkgEnterAimY = safeHeight;
                valueAnimator.cancel();
                doShowAnimRepeat(iIntValue, (int) safeHeight, true);
            } else if (iIntValue >= i) {
                this.enterAnimRunning = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void makeEnterY() {
            int height = this.boxCustom.getHeight();
            if (height == 0 || isMatchParentHeightCustomView()) {
                height = (int) this.boxRoot.getSafeHeight();
            }
            this.enterY = height;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(View view) {
            BaseDialog baseDialog = FullScreenDialog.this;
            if (baseDialog.preDismiss(baseDialog)) {
                return;
            }
            if (view != null) {
                view.setEnabled(false);
            }
            if (FullScreenDialog.this.getOwnActivity() == null || ((BaseDialog) FullScreenDialog.this).dismissAnimFlag || getDialogXAnimImpl() == null) {
                return;
            }
            ((BaseDialog) FullScreenDialog.this).dismissAnimFlag = true;
            getDialogXAnimImpl().doExitAnim(FullScreenDialog.this.f4162me, this.bkg);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogImpl.this.boxRoot;
                    if (dialogXBaseRelativeLayout != null) {
                        dialogXBaseRelativeLayout.setVisibility(8);
                    }
                    BaseDialog.dismiss(FullScreenDialog.this.getDialogView());
                }
            }, getExitAnimationDuration());
        }

        public DialogXAnimInterface<FullScreenDialog> getDialogXAnimImpl() {
            FullScreenDialog fullScreenDialog = FullScreenDialog.this;
            if (fullScreenDialog.dialogXAnimImpl == null) {
                fullScreenDialog.dialogXAnimImpl = new DialogXAnimInterface<FullScreenDialog>() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.11
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(FullScreenDialog fullScreenDialog2, ViewGroup viewGroup) {
                        long exitAnimationDuration = DialogImpl.this.getExitAnimationDuration();
                        MaxRelativeLayout maxRelativeLayout = DialogImpl.this.bkg;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(maxRelativeLayout, "y", maxRelativeLayout.getY(), DialogImpl.this.boxBkg.getHeight());
                        objectAnimatorOfFloat.setDuration(exitAnimationDuration);
                        objectAnimatorOfFloat.start();
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setDuration(exitAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.11.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                DialogImpl.this.boxRoot.setBkgAlpha(fFloatValue);
                                DialogImpl.this.enterAnimRunning = fFloatValue != 1.0f;
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doShowAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doShowAnim(FullScreenDialog fullScreenDialog2, ViewGroup viewGroup) {
                        DialogImpl.this.makeEnterY();
                        DialogImpl dialogImpl = DialogImpl.this;
                        float safeHeight = dialogImpl.boxRoot.getSafeHeight();
                        DialogImpl dialogImpl2 = DialogImpl.this;
                        dialogImpl.bkgEnterAimY = safeHeight - dialogImpl2.enterY;
                        if (dialogImpl2.bkgEnterAimY < 0.0f) {
                            dialogImpl2.bkgEnterAimY = 0.0f;
                        }
                        dialogImpl2.doShowAnimRepeat(dialogImpl2.boxRoot.getHeight(), (int) DialogImpl.this.bkgEnterAimY, false);
                    }
                };
            }
            return FullScreenDialog.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration() {
            int i = FullScreenDialog.overrideEnterDuration;
            return ((BaseDialog) FullScreenDialog.this).enterAnimDuration >= 0 ? ((BaseDialog) FullScreenDialog.this).enterAnimDuration : i >= 0 ? i : 300L;
        }

        public float getEnterY() {
            return Math.max(0.0f, this.boxRoot.getSafeHeight() - this.enterY);
        }

        public long getExitAnimationDuration() {
            int i = FullScreenDialog.overrideExitDuration;
            return ((BaseDialog) FullScreenDialog.this).exitAnimDuration != -1 ? ((BaseDialog) FullScreenDialog.this).exitAnimDuration : i >= 0 ? i : 300L;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            this.boxRoot.setParentDialog(FullScreenDialog.this.f4162me);
            FullScreenDialog.this.getDialogView().setTranslationZ(FullScreenDialog.this.getThisOrderIndex());
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    ((BaseDialog) FullScreenDialog.this).isShow = false;
                    FullScreenDialog.this.getDialogLifecycleCallback().onDismiss(FullScreenDialog.this.f4162me);
                    FullScreenDialog fullScreenDialog = FullScreenDialog.this;
                    fullScreenDialog.onDismiss(fullScreenDialog.f4162me);
                    FullScreenDialog.this.setLifecycleState(Lifecycle.State.DESTROYED);
                    DialogImpl.this.fullScreenDialogTouchEventInterceptor = null;
                    FullScreenDialog fullScreenDialog2 = FullScreenDialog.this;
                    fullScreenDialog2.dialogImpl = null;
                    fullScreenDialog2.dialogLifecycleCallback = null;
                    BaseDialog.m5092gc();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) FullScreenDialog.this).isShow = true;
                    ((BaseDialog) FullScreenDialog.this).preShow = false;
                    FullScreenDialog.this.setLifecycleState(Lifecycle.State.CREATED);
                    FullScreenDialog.this.onDialogShow();
                    FullScreenDialog.this.getDialogLifecycleCallback().onShow(FullScreenDialog.this.f4162me);
                    FullScreenDialog fullScreenDialog = FullScreenDialog.this;
                    fullScreenDialog.onShow(fullScreenDialog.f4162me);
                }
            });
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.2
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    FullScreenDialog fullScreenDialog = FullScreenDialog.this;
                    OnBackPressedListener<FullScreenDialog> onBackPressedListener = fullScreenDialog.onBackPressedListener;
                    if (onBackPressedListener != null) {
                        if (!onBackPressedListener.onBackPressed(fullScreenDialog.f4162me)) {
                            return true;
                        }
                        FullScreenDialog.this.dismiss();
                        return true;
                    }
                    if (!fullScreenDialog.isCancelable()) {
                        return true;
                    }
                    FullScreenDialog.this.dismiss();
                    return true;
                }
            });
            FullScreenDialog fullScreenDialog = FullScreenDialog.this;
            this.fullScreenDialogTouchEventInterceptor = new FullScreenDialogTouchEventInterceptor(fullScreenDialog.f4162me, fullScreenDialog.dialogImpl);
            this.boxRoot.setBkgAlpha(0.0f);
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    DialogImpl.this.bkg.setY(r0.boxRoot.getHeight());
                    DialogXAnimInterface<FullScreenDialog> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doShowAnim(FullScreenDialog.this.f4162me, dialogImpl.bkg);
                    FullScreenDialog.this.setLifecycleState(Lifecycle.State.RESUMED);
                }
            });
            this.boxRoot.setOnSafeInsetsChangeListener(new OnSafeInsetsChangeListener() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.4
                @Override // com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener
                public void onChange(Rect rect) {
                    DialogImpl.this.mUnsafeRect.set(rect);
                    DialogImpl.this.makeEnterY();
                    if (DialogImpl.this.enterAnimRunning || DialogImpl.this.getEnterY() == 0.0f) {
                        return;
                    }
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogImpl.bkg.setY(dialogImpl.getEnterY());
                }
            });
            this.bkg.setOnYChanged(new MaxRelativeLayout.OnYChanged() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.5
                @Override // com.kongzue.dialogx.util.views.MaxRelativeLayout.OnYChanged
                /* JADX INFO: renamed from: y */
                public void mo5090y(float f) {
                    float top = f + DialogImpl.this.bkg.getTop();
                    float height = 1.0f - ((DialogImpl.this.boxRoot.getHeight() - top) * 2.0E-5f);
                    float f2 = height <= 1.0f ? height : 1.0f;
                    DialogImpl dialogImpl = DialogImpl.this;
                    if (FullScreenDialog.this.hideZoomBackground) {
                        return;
                    }
                    dialogImpl.imgZoomActivity.setScale(f2);
                    DialogImpl dialogImpl2 = DialogImpl.this;
                    dialogImpl2.imgZoomActivity.setRadius(FullScreenDialog.this.getActivityZoomRadius(r0.getDeviceRadius(), FullScreenDialog.this.getActivityContentRadius(), (DialogImpl.this.boxRoot.getHeight() - top) / DialogImpl.this.boxRoot.getHeight()));
                }
            });
            this.boxCustom.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.6
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (i8 - i6 == i4 - i2 || DialogImpl.this.enterAnimRunning || DialogImpl.this.boxRoot.getFitSystemBarUtils().isInSmoothingPadding()) {
                        return;
                    }
                    DialogImpl.this.makeEnterY();
                    float safeHeight = DialogImpl.this.boxRoot.getSafeHeight() - DialogImpl.this.mUnsafeRect.bottom;
                    DialogImpl dialogImpl = DialogImpl.this;
                    float f = (safeHeight - dialogImpl.enterY) - dialogImpl.boxRoot.getUnsafePlace().top;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    DialogImpl dialogImpl2 = DialogImpl.this;
                    if (f == dialogImpl2.bkgEnterAimY || dialogImpl2.bkg.getY() == f) {
                        if (DialogImpl.this.bkg.getY() == f || f == 0.0f) {
                            return;
                        }
                        DialogImpl.this.bkg.setY(f);
                        return;
                    }
                    DialogImpl dialogImpl3 = DialogImpl.this;
                    float f2 = dialogImpl3.bkgEnterAimY;
                    dialogImpl3.bkgEnterAimY = f;
                    dialogImpl3.doShowAnimRepeat((int) f2, (int) f, true);
                }
            });
            FullScreenDialog.this.onDialogInit();
        }

        public void preDismiss() {
            if (FullScreenDialog.this.isCancelable()) {
                doDismiss(this.boxRoot);
                return;
            }
            int i = FullScreenDialog.overrideExitDuration;
            long j = i >= 0 ? i : 300L;
            if (((BaseDialog) FullScreenDialog.this).exitAnimDuration >= 0) {
                j = ((BaseDialog) FullScreenDialog.this).exitAnimDuration;
            }
            MaxRelativeLayout maxRelativeLayout = this.bkg;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(maxRelativeLayout, "y", maxRelativeLayout.getY(), this.bkgEnterAimY);
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.start();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            GradientDrawable gradientDrawable;
            if (this.boxRoot == null || FullScreenDialog.this.getOwnActivity() == null) {
                return;
            }
            this.boxRoot.setAutoUnsafePlacePadding(FullScreenDialog.this.isEnableImmersiveMode());
            this.boxRoot.setRootPadding(((BaseDialog) FullScreenDialog.this).screenPaddings[0], ((BaseDialog) FullScreenDialog.this).screenPaddings[1], ((BaseDialog) FullScreenDialog.this).screenPaddings[2], ((BaseDialog) FullScreenDialog.this).screenPaddings[3]);
            if (((BaseDialog) FullScreenDialog.this).backgroundColor != null) {
                FullScreenDialog fullScreenDialog = FullScreenDialog.this;
                fullScreenDialog.tintColor(this.bkg, ((BaseDialog) fullScreenDialog).backgroundColor.intValue());
            }
            this.bkg.setMaxWidth(FullScreenDialog.this.getMaxWidth());
            this.bkg.setMaxHeight(FullScreenDialog.this.getMaxHeight());
            this.bkg.setMinimumWidth(FullScreenDialog.this.getMinWidth());
            this.bkg.setMinimumHeight(FullScreenDialog.this.getMinHeight());
            if (FullScreenDialog.this.isCancelable()) {
                this.boxRoot.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        FullScreenDialog fullScreenDialog2 = FullScreenDialog.this;
                        OnBackgroundMaskClickListener<FullScreenDialog> onBackgroundMaskClickListener = fullScreenDialog2.onBackgroundMaskClickListener;
                        if (onBackgroundMaskClickListener == null || !onBackgroundMaskClickListener.onClick(fullScreenDialog2.f4162me, view)) {
                            DialogImpl.this.doDismiss(view);
                        }
                    }
                });
            } else {
                this.boxRoot.setOnClickListener(null);
            }
            if (FullScreenDialog.this.backgroundRadius > -1.0f) {
                if ((this.bkg.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) this.bkg.getBackground()) != null) {
                    float f = FullScreenDialog.this.backgroundRadius;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.bkg.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.DialogImpl.8
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        int width = view.getWidth();
                        float height = view.getHeight();
                        float f2 = FullScreenDialog.this.backgroundRadius;
                        outline.setRoundRect(0, 0, width, (int) (height + f2), f2);
                    }
                });
                this.bkg.setClipToOutline(true);
            }
            Integer num = FullScreenDialog.this.maskColor;
            if (num != null) {
                this.boxRoot.setBackgroundColor(num.intValue());
            }
            FullScreenDialog fullScreenDialog2 = FullScreenDialog.this;
            OnBindView<FullScreenDialog> onBindView = fullScreenDialog2.onBindView;
            if (onBindView != null) {
                onBindView.bindParent(this.boxCustom, fullScreenDialog2.f4162me);
                if (FullScreenDialog.this.onBindView.getCustomView() instanceof ScrollController) {
                    this.scrollView = (ScrollController) FullScreenDialog.this.onBindView.getCustomView();
                } else {
                    KeyEvent.Callback callbackFindViewWithTag = FullScreenDialog.this.onBindView.getCustomView().findViewWithTag("ScrollController");
                    if (callbackFindViewWithTag instanceof ScrollController) {
                        this.scrollView = (ScrollController) callbackFindViewWithTag;
                    }
                }
            }
            FullScreenDialog fullScreenDialog3 = FullScreenDialog.this;
            if (fullScreenDialog3.hideZoomBackground) {
                fullScreenDialog3.getDialogView().setBackgroundResource(C2413R.color.black20);
                this.imgZoomActivity.setVisibility(8);
            } else {
                fullScreenDialog3.getDialogView().setBackgroundResource(C2413R.color.black);
                this.imgZoomActivity.setVisibility(0);
            }
            this.fullScreenDialogTouchEventInterceptor.refresh(FullScreenDialog.this.f4162me, this);
            FullScreenDialog.this.onDialogRefreshUI();
        }

        public DialogImpl setScrollView(ScrollController scrollController) {
            this.scrollView = scrollController;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FullScreenDialog() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static FullScreenDialog build() {
        return new FullScreenDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getActivityZoomRadius(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public FullScreenDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public FullScreenDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public FullScreenDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    public FullScreenDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public void dismiss() {
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.2
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = FullScreenDialog.this.dialogImpl;
                if (dialogImpl == null) {
                    return;
                }
                dialogImpl.doDismiss(null);
            }
        });
    }

    public float getActivityContentRadius() {
        int iDip2px;
        float f = this.activityContentRadius;
        if (f >= 0.0f) {
            return f;
        }
        if (f == -2.0f) {
            iDip2px = getDeviceRadius();
        } else {
            if (getRadius() >= 0.0f) {
                return getRadius();
            }
            iDip2px = dip2px(15.0f);
        }
        return iDip2px;
    }

    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    public View getCustomView() {
        OnBindView<FullScreenDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public int getDeviceRadius() {
        if (this.deviceRadiusCache == null) {
            this.deviceRadiusCache = 0;
            if (Build.VERSION.SDK_INT >= 31) {
                WindowInsets windowInsetsPublicWindowInsets = getRootFrameLayout() == null ? BaseDialog.publicWindowInsets() : getRootFrameLayout().getRootWindowInsets();
                if (windowInsetsPublicWindowInsets != null) {
                    RoundedCorner roundedCorner = windowInsetsPublicWindowInsets.getRoundedCorner(0);
                    RoundedCorner roundedCorner2 = windowInsetsPublicWindowInsets.getRoundedCorner(1);
                    if (roundedCorner != null && roundedCorner2 != null) {
                        this.deviceRadiusCache = Integer.valueOf(Math.max(roundedCorner.getRadius(), roundedCorner2.getRadius()));
                    }
                }
            }
            if (this.deviceRadiusCache.intValue() == 0 && "xiaomi".equals(Build.MANUFACTURER.toLowerCase())) {
                try {
                    Integer num = (Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.miui.notch.radius", 0);
                    num.intValue();
                    this.deviceRadiusCache = num;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.deviceRadiusCache.intValue() == 0) {
                try {
                    int identifier = this.f4162me.getResources().getIdentifier("rounded_corner_radius", "dimen", "android");
                    if (identifier > 0) {
                        this.deviceRadiusCache = Integer.valueOf(this.f4162me.getResources().getDimensionPixelSize(identifier));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return this.deviceRadiusCache.intValue();
    }

    public DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    public DialogLifecycleCallback<FullScreenDialog> getDialogLifecycleCallback() {
        DialogLifecycleCallback<FullScreenDialog> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<FullScreenDialog>() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.3
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<FullScreenDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public OnBackPressedListener<FullScreenDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    public OnBackgroundMaskClickListener<FullScreenDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public float getRadius() {
        return this.backgroundRadius;
    }

    public void hide() {
        this.isHide = true;
        this.hideWithExitAnim = false;
        if (getDialogView() != null) {
            getDialogView().setVisibility(8);
        }
    }

    public FullScreenDialog hideActivityContentView(boolean z) {
        this.hideActivityContentView = z;
        return this;
    }

    public void hideWithExitAnim() {
        this.hideWithExitAnim = true;
        this.isHide = true;
        if (getDialogImpl() != null) {
            getDialogImpl().getDialogXAnimImpl().doExitAnim(this.f4162me, getDialogImpl().bkg);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.4
                @Override // java.lang.Runnable
                public void run() {
                    if (FullScreenDialog.this.getDialogView() != null) {
                        FullScreenDialog.this.getDialogView().setVisibility(8);
                    }
                }
            }, getDialogImpl().getExitAnimationDuration());
        }
    }

    public boolean isAllowInterceptTouch() {
        return this.allowInterceptTouch;
    }

    @Override // com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog
    public boolean isBottomNonSafetyAreaBySelf() {
        return this.bottomNonSafetyAreaBySelf;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
        BaseDialog.BOOLEAN r0 = this.privateCancelable;
        if (r0 != null) {
            return r0 == BaseDialog.BOOLEAN.TRUE;
        }
        BaseDialog.BOOLEAN r02 = overrideCancelable;
        return r02 != null ? r02 == BaseDialog.BOOLEAN.TRUE : this.cancelable;
    }

    public boolean isHideZoomBackground() {
        return this.hideZoomBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onDismiss(FullScreenDialog fullScreenDialog) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onShow(FullScreenDialog fullScreenDialog) {
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.FullScreenDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = FullScreenDialog.this.dialogImpl;
                if (dialogImpl != null) {
                    dialogImpl.refreshView();
                }
            }
        });
    }

    public FullScreenDialog removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
        if (getDialogView() != null) {
            BaseDialog.dismiss(getDialogView());
            this.isShow = false;
        }
        if (getDialogImpl().boxCustom != null) {
            getDialogImpl().boxCustom.removeAllViews();
        }
        this.enterAnimDuration = 0L;
        View viewCreateView = createView(getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : isLightTheme() ? C2413R.layout.layout_dialogx_fullscreen : C2413R.layout.layout_dialogx_fullscreen_dark);
        this.dialogImpl = new DialogImpl(viewCreateView);
        if (viewCreateView != null) {
            viewCreateView.setTag(this.f4162me);
        }
        BaseDialog.show(viewCreateView);
    }

    public FullScreenDialog setActionRunnable(int i, DialogXRunnable<FullScreenDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public FullScreenDialog setActivityContentRadius(float f) {
        this.activityContentRadius = f;
        return this;
    }

    public FullScreenDialog setAllowInterceptTouch(boolean z) {
        this.allowInterceptTouch = z;
        refreshUI();
        return this;
    }

    public FullScreenDialog setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public FullScreenDialog setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    public FullScreenDialog setBottomNonSafetyAreaBySelf(boolean z) {
        this.bottomNonSafetyAreaBySelf = z;
        return this;
    }

    public FullScreenDialog setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FullScreenDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public FullScreenDialog setCustomView(OnBindView<FullScreenDialog> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public FullScreenDialog setDeviceRadius(int i) {
        this.deviceRadiusCache = Integer.valueOf(i);
        return this;
    }

    public FullScreenDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public FullScreenDialog setDialogLifecycleCallback(DialogLifecycleCallback<FullScreenDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4162me);
        }
        return this;
    }

    public FullScreenDialog setDialogXAnimImpl(DialogXAnimInterface<FullScreenDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public FullScreenDialog setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    public FullScreenDialog setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    public FullScreenDialog setHideZoomBackground(boolean z) {
        this.hideZoomBackground = z;
        refreshUI();
        return this;
    }

    public FullScreenDialog setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public FullScreenDialog setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    public FullScreenDialog setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    public FullScreenDialog setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    public FullScreenDialog setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    public FullScreenDialog setOnBackPressedListener(OnBackPressedListener<FullScreenDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        refreshUI();
        return this;
    }

    public FullScreenDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<FullScreenDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    public FullScreenDialog setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FullScreenDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public FullScreenDialog setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public FullScreenDialog setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static FullScreenDialog build(OnBindView<FullScreenDialog> onBindView) {
        return new FullScreenDialog(onBindView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static FullScreenDialog show(OnBindView<FullScreenDialog> onBindView) {
        FullScreenDialog fullScreenDialog = new FullScreenDialog(onBindView);
        fullScreenDialog.show();
        return fullScreenDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FullScreenDialog onDismiss(DialogXRunnable<FullScreenDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FullScreenDialog onShow(DialogXRunnable<FullScreenDialog> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public FullScreenDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public FullScreenDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public FullScreenDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public FullScreenDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public FullScreenDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public FullScreenDialog show() {
        if (this.isHide && getDialogView() != null && this.isShow) {
            if (this.hideWithExitAnim && getDialogImpl() != null) {
                getDialogView().setVisibility(0);
                getDialogImpl().getDialogXAnimImpl().doShowAnim(this.f4162me, getDialogImpl().bkg);
            } else {
                getDialogView().setVisibility(0);
            }
            return this;
        }
        super.beforeShow();
        if (getDialogView() == null) {
            View viewCreateView = createView(getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : isLightTheme() ? C2413R.layout.layout_dialogx_fullscreen : C2413R.layout.layout_dialogx_fullscreen_dark);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4162me);
            }
            BaseDialog.show(viewCreateView);
        } else {
            BaseDialog.show(getDialogView());
        }
        return this;
    }

    public FullScreenDialog(OnBindView<FullScreenDialog> onBindView) {
        this.onBindView = onBindView;
    }

    public void show(Activity activity) {
        super.beforeShow();
        if (getDialogView() == null) {
            View viewCreateView = createView(getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : isLightTheme() ? C2413R.layout.layout_dialogx_fullscreen : C2413R.layout.layout_dialogx_fullscreen_dark);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4162me);
            }
            BaseDialog.show(activity, viewCreateView);
            return;
        }
        BaseDialog.show(activity, getDialogView());
    }
}
