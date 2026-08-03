package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC6490;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class CustomDialog extends BaseDialog {
    public static BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterAnimRes = 0;
    public static int overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static int overrideExitDuration = -1;
    protected ALIGN align;
    protected int alignViewGravity;
    private ViewTreeObserver.OnPreDrawListener baseViewDrawListener;
    protected int[] baseViewLoc;
    protected WeakReference<View> baseViewWeakReference;
    protected boolean bkgInterceptTouch;
    protected DialogImpl dialogImpl;
    protected DialogLifecycleCallback<CustomDialog> dialogLifecycleCallback;
    protected DialogXAnimInterface<CustomDialog> dialogXAnimImpl;
    protected int enterAnimResId;
    protected int exitAnimResId;
    protected int height;
    protected boolean hideWithExitAnim;
    protected int[] marginRelativeBaseView;
    protected int maskColor;

    /* JADX INFO: renamed from: me */
    protected CustomDialog f4161me;
    protected OnBackPressedListener<CustomDialog> onBackPressedListener;
    protected OnBackgroundMaskClickListener<CustomDialog> onBackgroundMaskClickListener;
    protected OnBindView<CustomDialog> onBindView;
    protected BaseDialog.BOOLEAN privateCancelable;
    private ViewTreeObserver viewTreeObserver;
    protected int width;

    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.CustomDialog$5 */
    public static /* synthetic */ class C24395 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN;

        static {
            int[] iArr = new int[ALIGN.values().length];
            $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN = iArr;
            try {
                iArr[ALIGN.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.LEFT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.TOP_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.TOP_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.RIGHT_TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.LEFT_BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.BOTTOM_CENTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.BOTTOM_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.RIGHT_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.CENTER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.LEFT_CENTER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.RIGHT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[ALIGN.RIGHT_CENTER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public enum ALIGN {
        CENTER,
        TOP,
        TOP_CENTER,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM,
        BOTTOM_CENTER,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        LEFT_CENTER,
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT,
        RIGHT_CENTER,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public class DialogImpl implements DialogConvertViewInterface {
        ALIGN alignCache;
        public MaxRelativeLayout boxCustom;
        public DialogXBaseRelativeLayout boxRoot;
        boolean initSetCustomViewLayoutListener = false;

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            CustomDialog.this.setDialogView(view);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.boxCustom = (MaxRelativeLayout) view.findViewById(C2413R.id.box_custom);
            init();
            CustomDialog.this.dialogImpl = this;
            refreshView();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(View view) {
            BaseDialog baseDialog = CustomDialog.this;
            if (baseDialog.preDismiss(baseDialog)) {
                return;
            }
            if (view != null) {
                view.setEnabled(false);
            }
            if (((BaseDialog) CustomDialog.this).dismissAnimFlag || this.boxCustom == null) {
                return;
            }
            ((BaseDialog) CustomDialog.this).dismissAnimFlag = true;
            this.boxCustom.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    DialogXAnimInterface<CustomDialog> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doExitAnim(CustomDialog.this, dialogImpl.boxCustom);
                    BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogImpl.this.boxRoot;
                            if (dialogXBaseRelativeLayout != null) {
                                dialogXBaseRelativeLayout.setVisibility(8);
                            }
                            if (CustomDialog.this.baseViewDrawListener != null) {
                                if (CustomDialog.this.viewTreeObserver != null) {
                                    CustomDialog customDialog = CustomDialog.this;
                                    customDialog.removeDrawListener(customDialog.viewTreeObserver, CustomDialog.this.baseViewDrawListener);
                                } else {
                                    DialogImpl dialogImpl2 = DialogImpl.this;
                                    MaxRelativeLayout maxRelativeLayout = dialogImpl2.boxCustom;
                                    if (maxRelativeLayout != null) {
                                        CustomDialog.this.removeDrawListener(maxRelativeLayout.getViewTreeObserver(), CustomDialog.this.baseViewDrawListener);
                                    }
                                }
                                CustomDialog.this.baseViewDrawListener = null;
                                CustomDialog.this.viewTreeObserver = null;
                            }
                            BaseDialog.dismiss(CustomDialog.this.getDialogView());
                        }
                    }, DialogImpl.this.getExitAnimationDuration(null));
                }
            });
        }

        public DialogXAnimInterface<CustomDialog> getDialogXAnimImpl() {
            CustomDialog customDialog = CustomDialog.this;
            if (customDialog.dialogXAnimImpl == null) {
                customDialog.dialogXAnimImpl = new DialogXAnimInterface<CustomDialog>() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.8
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(CustomDialog customDialog2, ViewGroup viewGroup) {
                        long exitAnimationDuration;
                        if (CustomDialog.this.getDialogImpl() == null || CustomDialog.this.getDialogImpl().boxCustom == null) {
                            return;
                        }
                        int i = C2413R.anim.anim_dialogx_default_exit;
                        int i2 = CustomDialog.overrideExitAnimRes;
                        if (i2 != 0) {
                            i = i2;
                        }
                        DialogImpl dialogImpl = DialogImpl.this;
                        CustomDialog customDialog3 = CustomDialog.this;
                        int i3 = customDialog3.exitAnimResId;
                        if (i3 != 0) {
                            i = i3;
                        }
                        if (dialogImpl.boxCustom != null) {
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(customDialog3.getOwnActivity() == null ? DialogImpl.this.boxCustom.getContext() : CustomDialog.this.getOwnActivity(), i);
                            exitAnimationDuration = DialogImpl.this.getExitAnimationDuration(animationLoadAnimation);
                            animationLoadAnimation.setDuration(exitAnimationDuration);
                            DialogImpl.this.boxCustom.startAnimation(animationLoadAnimation);
                        } else {
                            exitAnimationDuration = dialogImpl.getExitAnimationDuration(null);
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setDuration(exitAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.8.2
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doShowAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doShowAnim(CustomDialog customDialog2, ViewGroup viewGroup) {
                        if (CustomDialog.this.getDialogImpl() == null || CustomDialog.this.getDialogImpl().boxCustom == null) {
                            return;
                        }
                        Animation enterAnimation = CustomDialog.this.getEnterAnimation();
                        long enterAnimationDuration = DialogImpl.this.getEnterAnimationDuration(enterAnimation);
                        enterAnimation.setDuration(enterAnimationDuration);
                        MaxRelativeLayout maxRelativeLayout = DialogImpl.this.boxCustom;
                        if (maxRelativeLayout != null) {
                            maxRelativeLayout.setVisibility(0);
                            DialogImpl.this.boxCustom.startAnimation(enterAnimation);
                        }
                        DialogImpl dialogImpl = DialogImpl.this;
                        int i = CustomDialog.this.maskColor;
                        if (i != 0) {
                            dialogImpl.boxRoot.setBackgroundColor(i);
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(enterAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.8.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }
                };
            }
            return CustomDialog.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxCustom.getAnimation() != null) {
                animation = this.boxCustom.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            int i = CustomDialog.overrideEnterDuration;
            if (i >= 0) {
                duration = i;
            }
            return ((BaseDialog) CustomDialog.this).enterAnimDuration >= 0 ? ((BaseDialog) CustomDialog.this).enterAnimDuration : duration;
        }

        public long getExitAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxCustom.getAnimation() != null) {
                animation = this.boxCustom.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            int i = CustomDialog.overrideExitDuration;
            if (i >= 0) {
                duration = i;
            }
            return ((BaseDialog) CustomDialog.this).exitAnimDuration != -1 ? ((BaseDialog) CustomDialog.this).exitAnimDuration : duration;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            CustomDialog customDialog = CustomDialog.this;
            if (customDialog.baseViewLoc == null && customDialog.baseView() != null) {
                CustomDialog customDialog2 = CustomDialog.this;
                customDialog2.baseViewLoc = new int[4];
                customDialog2.baseView().getLocationInWindow(CustomDialog.this.baseViewLoc);
                CustomDialog customDialog3 = CustomDialog.this;
                customDialog3.baseViewLoc[2] = customDialog3.baseView().getWidth();
                CustomDialog customDialog4 = CustomDialog.this;
                customDialog4.baseViewLoc[3] = customDialog4.baseView().getHeight();
            }
            CustomDialog.this.getDialogView().setTranslationZ(CustomDialog.this.getThisOrderIndex());
            this.boxRoot.setParentDialog(CustomDialog.this.f4161me);
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    ((BaseDialog) CustomDialog.this).isShow = false;
                    CustomDialog.this.getDialogLifecycleCallback().onDismiss(CustomDialog.this.f4161me);
                    CustomDialog customDialog5 = CustomDialog.this;
                    customDialog5.onDismiss(customDialog5.f4161me);
                    CustomDialog.this.setLifecycleState(Lifecycle.State.DESTROYED);
                    CustomDialog customDialog6 = CustomDialog.this;
                    customDialog6.dialogImpl = null;
                    customDialog6.dialogLifecycleCallback = null;
                    BaseDialog.m5092gc();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) CustomDialog.this).isShow = true;
                    ((BaseDialog) CustomDialog.this).preShow = false;
                    CustomDialog.this.setLifecycleState(Lifecycle.State.CREATED);
                    CustomDialog.this.getDialogLifecycleCallback().onShow(CustomDialog.this.f4161me);
                    CustomDialog customDialog5 = CustomDialog.this;
                    customDialog5.onShow(customDialog5.f4161me);
                    CustomDialog.this.onDialogShow();
                    DialogImpl.this.boxCustom.setVisibility(8);
                }
            });
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.2
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    CustomDialog customDialog5 = CustomDialog.this;
                    OnBackPressedListener<CustomDialog> onBackPressedListener = customDialog5.onBackPressedListener;
                    if (onBackPressedListener != null) {
                        if (!onBackPressedListener.onBackPressed(customDialog5.f4161me)) {
                            return true;
                        }
                        CustomDialog.this.dismiss();
                        return true;
                    }
                    if (!customDialog5.isCancelable()) {
                        return true;
                    }
                    CustomDialog.this.dismiss();
                    return true;
                }
            });
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    if (DialogImpl.this.getDialogXAnimImpl() != null) {
                        DialogXAnimInterface<CustomDialog> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                        DialogImpl dialogImpl = DialogImpl.this;
                        dialogXAnimImpl.doShowAnim(CustomDialog.this, dialogImpl.boxCustom);
                    }
                    if (CustomDialog.this.getDialogImpl() != null && CustomDialog.this.getDialogImpl().boxCustom != null) {
                        CustomDialog.this.getDialogImpl().boxCustom.setVisibility(0);
                    }
                    CustomDialog.this.setLifecycleState(Lifecycle.State.RESUMED);
                }
            });
            CustomDialog.this.onDialogInit();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            ALIGN align;
            MaxRelativeLayout maxRelativeLayout;
            if (this.boxRoot == null || CustomDialog.this.getOwnActivity() == null) {
                return;
            }
            this.boxCustom.setMaxWidth(CustomDialog.this.getMaxWidth());
            this.boxCustom.setMaxHeight(CustomDialog.this.getMaxHeight());
            this.boxCustom.setMinimumWidth(CustomDialog.this.getMinWidth());
            this.boxCustom.setMinimumHeight(CustomDialog.this.getMinHeight());
            this.boxRoot.setAutoUnsafePlacePadding(CustomDialog.this.isEnableImmersiveMode());
            this.boxRoot.setRootPadding(((BaseDialog) CustomDialog.this).screenPaddings[0], ((BaseDialog) CustomDialog.this).screenPaddings[1], ((BaseDialog) CustomDialog.this).screenPaddings[2], ((BaseDialog) CustomDialog.this).screenPaddings[3]);
            if (CustomDialog.this.baseView() == null) {
                MaxRelativeLayout maxRelativeLayout2 = this.boxCustom;
                if (maxRelativeLayout2 != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) maxRelativeLayout2.getLayoutParams();
                    if (layoutParams == null || ((align = this.alignCache) != null && align != CustomDialog.this.align)) {
                        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    }
                    switch (C24395.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[CustomDialog.this.align.ordinal()]) {
                        case 1:
                        case 2:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(10);
                            layoutParams.addRule(9);
                            break;
                        case 3:
                        case 4:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(10);
                            layoutParams.addRule(14);
                            break;
                        case 5:
                        case 6:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                            break;
                        case 7:
                        case 8:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(12);
                            break;
                        case 9:
                        case 10:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(12);
                            layoutParams.addRule(14);
                            break;
                        case 11:
                        case 12:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(12);
                            layoutParams.addRule(11);
                            break;
                        case 13:
                            layoutParams.removeRule(10);
                            layoutParams.removeRule(12);
                            layoutParams.addRule(13);
                            break;
                        case 14:
                        case 15:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(5);
                            layoutParams.addRule(15);
                            break;
                        case 16:
                        case 17:
                            layoutParams.removeRule(13);
                            layoutParams.addRule(11);
                            layoutParams.addRule(15);
                            break;
                    }
                    this.alignCache = CustomDialog.this.align;
                    this.boxCustom.setLayoutParams(layoutParams);
                }
            } else if (!this.initSetCustomViewLayoutListener) {
                if (this.boxCustom != null) {
                    this.boxCustom.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                }
                final Runnable runnable = new Runnable() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        DialogImpl dialogImpl = DialogImpl.this;
                        int x = CustomDialog.this.baseViewLoc[0] - ((int) dialogImpl.boxRoot.getX());
                        DialogImpl dialogImpl2 = DialogImpl.this;
                        int y = CustomDialog.this.baseViewLoc[1] - ((int) dialogImpl2.boxRoot.getY());
                        CustomDialog customDialog = CustomDialog.this;
                        if (customDialog.alignViewGravity != -1) {
                            int measuredHeight = customDialog.isAlignBaseViewGravity(16) ? ((CustomDialog.this.baseView().getMeasuredHeight() / 2) + y) - (DialogImpl.this.boxCustom.getHeight() / 2) : 0;
                            int measuredWidth = CustomDialog.this.isAlignBaseViewGravity(1) ? ((CustomDialog.this.baseView().getMeasuredWidth() / 2) + x) - (DialogImpl.this.boxCustom.getWidth() / 2) : 0;
                            if (CustomDialog.this.isAlignBaseViewGravity(17)) {
                                measuredWidth = ((CustomDialog.this.baseView().getMeasuredWidth() / 2) + x) - (DialogImpl.this.boxCustom.getWidth() / 2);
                                measuredHeight = ((CustomDialog.this.baseView().getMeasuredHeight() / 2) + y) - (DialogImpl.this.boxCustom.getHeight() / 2);
                            }
                            if (CustomDialog.this.isAlignBaseViewGravity(48)) {
                                measuredHeight = (y - DialogImpl.this.boxCustom.getHeight()) - CustomDialog.this.marginRelativeBaseView[3];
                            }
                            if (CustomDialog.this.isAlignBaseViewGravity(3)) {
                                measuredWidth = (x - DialogImpl.this.boxCustom.getWidth()) - CustomDialog.this.marginRelativeBaseView[2];
                            }
                            if (CustomDialog.this.isAlignBaseViewGravity(5)) {
                                measuredWidth = x + CustomDialog.this.baseView().getWidth() + CustomDialog.this.marginRelativeBaseView[0];
                            }
                            if (CustomDialog.this.isAlignBaseViewGravity(80)) {
                                measuredHeight = CustomDialog.this.marginRelativeBaseView[1] + y + CustomDialog.this.baseView().getHeight();
                            }
                            CustomDialog customDialog2 = CustomDialog.this;
                            int width = customDialog2.width;
                            if (width == 0) {
                                width = customDialog2.baseView().getWidth();
                            }
                            CustomDialog customDialog3 = CustomDialog.this;
                            int height = customDialog3.height;
                            if (height == 0) {
                                height = customDialog3.baseView().getHeight();
                            }
                            DialogImpl dialogImpl3 = DialogImpl.this;
                            int[] iArr = CustomDialog.this.baseViewLoc;
                            if (width <= 0) {
                                width = iArr[2];
                            }
                            iArr[2] = width;
                            if (height <= 0) {
                                height = iArr[3];
                            }
                            iArr[3] = height;
                            if (measuredWidth != 0) {
                                float f = measuredWidth;
                                if (f != dialogImpl3.boxCustom.getX()) {
                                    DialogImpl.this.boxCustom.setX(f);
                                }
                            }
                            if (measuredHeight != 0) {
                                float f2 = measuredHeight;
                                if (f2 != DialogImpl.this.boxCustom.getY()) {
                                    DialogImpl.this.boxCustom.setY(f2);
                                }
                            }
                            CustomDialog customDialog4 = CustomDialog.this;
                            customDialog4.onGetBaseViewLoc(customDialog4.baseViewLoc);
                        }
                    }
                };
                CustomDialog.this.viewTreeObserver = this.boxCustom.getViewTreeObserver();
                CustomDialog.this.viewTreeObserver.addOnPreDrawListener(CustomDialog.this.baseViewDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.5
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        int[] iArr = new int[2];
                        if (CustomDialog.this.baseView() != null) {
                            CustomDialog.this.baseView().getLocationInWindow(iArr);
                            if (CustomDialog.this.getDialogImpl() != null && ((BaseDialog) CustomDialog.this).isShow && CustomDialog.this.baseView().getVisibility() == 0) {
                                int i = iArr[0];
                                if (i != 0) {
                                    CustomDialog.this.baseViewLoc[0] = i;
                                }
                                int i2 = iArr[1];
                                if (i2 != 0) {
                                    CustomDialog.this.baseViewLoc[1] = i2;
                                }
                                runnable.run();
                            }
                        } else {
                            CustomDialog customDialog = CustomDialog.this;
                            customDialog.removeDrawListener(customDialog.viewTreeObserver, this);
                            CustomDialog.this.viewTreeObserver = null;
                            CustomDialog.this.baseViewDrawListener = null;
                        }
                        return true;
                    }
                });
                this.initSetCustomViewLayoutListener = true;
            }
            CustomDialog customDialog = CustomDialog.this;
            if (!customDialog.bkgInterceptTouch) {
                this.boxRoot.setClickable(false);
            } else if (customDialog.isCancelable()) {
                this.boxRoot.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.DialogImpl.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        CustomDialog customDialog2 = CustomDialog.this;
                        OnBackgroundMaskClickListener<CustomDialog> onBackgroundMaskClickListener = customDialog2.onBackgroundMaskClickListener;
                        if (onBackgroundMaskClickListener == null || !onBackgroundMaskClickListener.onClick(customDialog2.f4161me, view)) {
                            DialogImpl.this.doDismiss(view);
                        }
                    }
                });
            } else {
                this.boxRoot.setOnClickListener(null);
            }
            OnBindView<CustomDialog> onBindView = CustomDialog.this.onBindView;
            if (onBindView != null && onBindView.getCustomView() != null && (maxRelativeLayout = this.boxCustom) != null) {
                CustomDialog customDialog2 = CustomDialog.this;
                customDialog2.onBindView.bindParent(maxRelativeLayout, customDialog2.f4161me);
            }
            MaxRelativeLayout maxRelativeLayout3 = this.boxCustom;
            if (maxRelativeLayout3 != null) {
                int i = CustomDialog.this.width;
                if (i != -1) {
                    maxRelativeLayout3.setMaxWidth(i);
                    this.boxCustom.setMinimumWidth(CustomDialog.this.width);
                }
                int i2 = CustomDialog.this.height;
                if (i2 != -1) {
                    this.boxCustom.setMaxHeight(i2);
                    this.boxCustom.setMinimumHeight(CustomDialog.this.height);
                }
            }
            this.boxRoot.setBackgroundColor(CustomDialog.this.getMaskColor());
            CustomDialog.this.onDialogRefreshUI();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomDialog() {
        this.f4161me = this;
        this.enterAnimResId = C2413R.anim.anim_dialogx_default_enter;
        this.exitAnimResId = C2413R.anim.anim_dialogx_default_exit;
        this.align = ALIGN.CENTER;
        this.maskColor = 0;
        this.bkgInterceptTouch = true;
        this.alignViewGravity = -1;
        this.width = -1;
        this.height = -1;
        this.marginRelativeBaseView = new int[4];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CustomDialog build() {
        return new CustomDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animation getEnterAnimation() {
        Animation animationLoadAnimation;
        if (this.enterAnimResId == C2413R.anim.anim_dialogx_default_enter && this.exitAnimResId == C2413R.anim.anim_dialogx_default_exit && baseView() == null) {
            switch (C24395.$SwitchMap$com$kongzue$dialogx$dialogs$CustomDialog$ALIGN[this.align.ordinal()]) {
                case 1:
                case 3:
                case 4:
                case 5:
                    this.enterAnimResId = C2413R.anim.anim_dialogx_top_enter;
                    this.exitAnimResId = C2413R.anim.anim_dialogx_top_exit;
                    break;
                case 2:
                case 8:
                case 14:
                case 15:
                    this.enterAnimResId = C2413R.anim.anim_dialogx_left_enter;
                    this.exitAnimResId = C2413R.anim.anim_dialogx_left_exit;
                    break;
                case 6:
                case 12:
                case 16:
                case 17:
                    this.enterAnimResId = C2413R.anim.anim_dialogx_right_enter;
                    this.exitAnimResId = C2413R.anim.anim_dialogx_right_exit;
                    break;
                case 7:
                case 9:
                case 10:
                case 11:
                    this.enterAnimResId = C2413R.anim.anim_dialogx_bottom_enter;
                    this.exitAnimResId = C2413R.anim.anim_dialogx_bottom_exit;
                    break;
            }
            animationLoadAnimation = AnimationUtils.loadAnimation(getOwnActivity(), this.enterAnimResId);
            animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
        } else {
            int i = C2413R.anim.anim_dialogx_default_enter;
            int i2 = overrideEnterAnimRes;
            if (i2 != 0) {
                i = i2;
            }
            int i3 = this.enterAnimResId;
            if (i3 != 0) {
                i = i3;
            }
            animationLoadAnimation = AnimationUtils.loadAnimation(getOwnActivity(), i);
        }
        long duration = animationLoadAnimation.getDuration();
        int i4 = overrideEnterDuration;
        if (i4 >= 0) {
            duration = i4;
        }
        long j = this.enterAnimDuration;
        if (j >= 0) {
            duration = j;
        }
        animationLoadAnimation.setDuration(duration);
        return animationLoadAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDrawListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver == null || onPreDrawListener == null || !viewTreeObserver.isAlive()) {
            return;
        }
        try {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomDialog baseView(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.baseViewWeakReference) == null) {
            this.baseViewWeakReference = new WeakReference<>(view);
        } else {
            weakReference.clear();
            this.baseViewWeakReference = null;
        }
        return this;
    }

    public CustomDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public CustomDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public CustomDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    public CustomDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public void dismiss() {
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.2
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = CustomDialog.this.dialogImpl;
                if (dialogImpl == null) {
                    return;
                }
                dialogImpl.doDismiss(null);
            }
        });
    }

    public ALIGN getAlign() {
        return this.align;
    }

    public int getAlignBaseViewGravity() {
        return this.alignViewGravity;
    }

    public View getBaseView() {
        return baseView();
    }

    public int[] getBaseViewMargin() {
        return this.marginRelativeBaseView;
    }

    public int getBaseViewMarginBottom(int i) {
        return this.marginRelativeBaseView[3];
    }

    public int getBaseViewMarginLeft(int i) {
        return this.marginRelativeBaseView[0];
    }

    public int getBaseViewMarginRight(int i) {
        return this.marginRelativeBaseView[2];
    }

    public int getBaseViewMarginTop(int i) {
        return this.marginRelativeBaseView[1];
    }

    public View getCustomView() {
        OnBindView<CustomDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    public DialogLifecycleCallback<CustomDialog> getDialogLifecycleCallback() {
        DialogLifecycleCallback<CustomDialog> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<CustomDialog>() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.3
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<CustomDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    public int getEnterAnimResId() {
        return this.enterAnimResId;
    }

    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public int getExitAnimResId() {
        return this.exitAnimResId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaskColor() {
        return this.maskColor;
    }

    public OnBackPressedListener<CustomDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    public OnBackgroundMaskClickListener<CustomDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public int getWidth() {
        return this.width;
    }

    public void hide() {
        this.isHide = true;
        this.hideWithExitAnim = false;
        if (getDialogView() != null) {
            getDialogView().setVisibility(8);
        }
    }

    public void hideWithExitAnim() {
        this.hideWithExitAnim = true;
        this.isHide = true;
        if (getDialogImpl() != null) {
            getDialogImpl().getDialogXAnimImpl().doExitAnim(this, getDialogImpl().boxCustom);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.4
                @Override // java.lang.Runnable
                public void run() {
                    if (CustomDialog.this.getDialogView() != null) {
                        CustomDialog.this.getDialogView().setVisibility(8);
                    }
                }
            }, getDialogImpl().getExitAnimationDuration(null));
        }
    }

    public boolean isAlignBaseViewGravity(int i) {
        return (this.alignViewGravity & i) == i;
    }

    public boolean isAutoUnsafePlacePadding() {
        return isEnableImmersiveMode();
    }

    public boolean isBkgInterceptTouch() {
        return this.bkgInterceptTouch;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onDismiss(CustomDialog customDialog) {
    }

    public void onGetBaseViewLoc(int[] iArr) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onShow(CustomDialog customDialog) {
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.CustomDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = CustomDialog.this.dialogImpl;
                if (dialogImpl != null) {
                    dialogImpl.refreshView();
                }
            }
        });
    }

    public CustomDialog removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        if (getDialogView() != null) {
            if (getDialogImpl() != null && getDialogImpl().boxCustom != null && (onPreDrawListener = this.baseViewDrawListener) != null) {
                ViewTreeObserver viewTreeObserver = this.viewTreeObserver;
                if (viewTreeObserver != null) {
                    removeDrawListener(viewTreeObserver, onPreDrawListener);
                } else if (getDialogImpl().boxCustom != null) {
                    removeDrawListener(getDialogImpl().boxCustom.getViewTreeObserver(), this.baseViewDrawListener);
                }
                this.baseViewDrawListener = null;
                this.viewTreeObserver = null;
            }
            BaseDialog.dismiss(getDialogView());
            this.isShow = false;
        }
        if (getDialogImpl() != null && getDialogImpl().boxCustom != null) {
            getDialogImpl().boxCustom.removeAllViews();
        }
        this.enterAnimDuration = 0L;
        View viewCreateView = createView(getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : C2413R.layout.layout_dialogx_custom);
        this.dialogImpl = new DialogImpl(viewCreateView);
        if (viewCreateView != null) {
            viewCreateView.setTag(this.f4161me);
        }
        BaseDialog.show(viewCreateView);
    }

    public CustomDialog setActionRunnable(int i, DialogXRunnable<CustomDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public CustomDialog setAlign(ALIGN align) {
        this.align = align;
        refreshUI();
        return this;
    }

    public CustomDialog setAlignBaseView(View view) {
        baseView(view);
        int[] iArr = new int[4];
        this.baseViewLoc = iArr;
        view.getLocationInWindow(iArr);
        setFullScreen(true);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomDialog setAlignBaseViewGravity(View view, int i) {
        baseView(view);
        this.alignViewGravity = i;
        int[] iArr = new int[4];
        this.baseViewLoc = iArr;
        view.getLocationInWindow(iArr);
        setFullScreen(true);
        return this;
    }

    public CustomDialog setAnimResId(int i, int i2) {
        this.enterAnimResId = i;
        this.exitAnimResId = i2;
        return this;
    }

    @Deprecated
    public CustomDialog setAutoUnsafePlacePadding(boolean z) {
        setEnableImmersiveMode(z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomDialog setBaseViewMargin(int[] iArr) {
        this.marginRelativeBaseView = iArr;
        refreshUI();
        return this;
    }

    public CustomDialog setBaseViewMarginBottom(int i) {
        this.marginRelativeBaseView[3] = i;
        refreshUI();
        return this;
    }

    public CustomDialog setBaseViewMarginLeft(int i) {
        this.marginRelativeBaseView[0] = i;
        refreshUI();
        return this;
    }

    public CustomDialog setBaseViewMarginRight(int i) {
        this.marginRelativeBaseView[2] = i;
        refreshUI();
        return this;
    }

    public CustomDialog setBaseViewMarginTop(int i) {
        this.marginRelativeBaseView[1] = i;
        refreshUI();
        return this;
    }

    public CustomDialog setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        refreshUI();
        return this;
    }

    public CustomDialog setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public CustomDialog setCustomView(OnBindView<CustomDialog> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public CustomDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public CustomDialog setDialogLifecycleCallback(DialogLifecycleCallback<CustomDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4161me);
        }
        return this;
    }

    public CustomDialog setDialogXAnimImpl(DialogXAnimInterface<CustomDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public CustomDialog setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    public CustomDialog setEnterAnimResId(int i) {
        this.enterAnimResId = i;
        return this;
    }

    public CustomDialog setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    public CustomDialog setExitAnimResId(int i) {
        this.exitAnimResId = i;
        return this;
    }

    @Deprecated
    public CustomDialog setFullScreen(boolean z) {
        setEnableImmersiveMode(!z);
        return this;
    }

    public CustomDialog setHeight(int i) {
        this.height = i;
        refreshUI();
        return this;
    }

    public CustomDialog setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = i;
        refreshUI();
        return this;
    }

    public CustomDialog setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    public CustomDialog setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    public CustomDialog setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    public CustomDialog setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    public CustomDialog setOnBackPressedListener(OnBackPressedListener<CustomDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        refreshUI();
        return this;
    }

    public CustomDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<CustomDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CustomDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public CustomDialog setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public CustomDialog setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    public CustomDialog setWidth(int i) {
        this.width = i;
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static CustomDialog build(OnBindView<CustomDialog> onBindView) {
        return new CustomDialog().setCustomView(onBindView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static CustomDialog show(OnBindView<CustomDialog> onBindView) {
        CustomDialog customDialog = new CustomDialog(onBindView);
        customDialog.show();
        return customDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CustomDialog onDismiss(DialogXRunnable<CustomDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CustomDialog onShow(DialogXRunnable<CustomDialog> dialogXRunnable) {
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
    public CustomDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public CustomDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public CustomDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public CustomDialog setBaseViewMargin(int i, int i2, int i3, int i4) {
        this.marginRelativeBaseView = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public CustomDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public CustomDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public static CustomDialog show(OnBindView<CustomDialog> onBindView, ALIGN align) {
        CustomDialog customDialog = new CustomDialog(onBindView);
        customDialog.align = align;
        customDialog.show();
        return customDialog;
    }

    public View baseView() {
        WeakReference<View> weakReference = this.baseViewWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public CustomDialog setAlignBaseViewGravity(int i) {
        this.alignViewGravity = i;
        if (baseView() != null) {
            this.baseViewLoc = new int[4];
            baseView().getLocationInWindow(this.baseViewLoc);
        }
        setFullScreen(true);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public CustomDialog show() {
        if (this.isHide && getDialogView() != null && this.isShow) {
            if (this.hideWithExitAnim && getDialogImpl() != null && getDialogImpl().boxCustom != null) {
                getDialogView().setVisibility(0);
                getDialogImpl().getDialogXAnimImpl().doShowAnim(this, getDialogImpl().boxCustom);
                getDialogImpl().boxCustom.setVisibility(0);
                getDialogImpl().boxCustom.startAnimation(getEnterAnimation());
            } else {
                getDialogView().setVisibility(0);
            }
            return this;
        }
        super.beforeShow();
        if (getDialogView() == null) {
            View viewCreateView = createView(getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : C2413R.layout.layout_dialogx_custom);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4161me);
            }
            BaseDialog.show(viewCreateView);
        } else {
            BaseDialog.show(getDialogView());
        }
        return this;
    }

    public CustomDialog setAlignBaseViewGravity(View view, int i, int i2, int i3, int i4, int i5) {
        this.marginRelativeBaseView = new int[]{i2, i3, i4, i5};
        refreshUI();
        return setAlignBaseViewGravity(view, i);
    }

    public CustomDialog(OnBindView<CustomDialog> onBindView) {
        this.f4161me = this;
        this.enterAnimResId = C2413R.anim.anim_dialogx_default_enter;
        this.exitAnimResId = C2413R.anim.anim_dialogx_default_exit;
        this.align = ALIGN.CENTER;
        this.maskColor = 0;
        this.bkgInterceptTouch = true;
        this.alignViewGravity = -1;
        this.width = -1;
        this.height = -1;
        this.marginRelativeBaseView = new int[4];
        this.onBindView = onBindView;
    }

    public CustomDialog show(Activity activity) {
        super.beforeShow();
        if (getDialogView() == null) {
            View viewCreateView = createView(getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : C2413R.layout.layout_dialogx_custom);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4161me);
            }
            BaseDialog.show(activity, viewCreateView);
        } else {
            BaseDialog.show(activity, getDialogView());
        }
        return this;
    }
}
