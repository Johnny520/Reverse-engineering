package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback;
import com.kongzue.dialogx.interfaces.BlurViewType;
import com.kongzue.dialogx.interfaces.BottomDialogSlideEventLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXBaseBottomDialog;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.kongzue.dialogx.interfaces.ScrollController;
import com.kongzue.dialogx.util.BottomDialogTouchEventInterceptor;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BottomDialog extends BaseDialog implements DialogXBaseBottomDialog {
    public static BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterDuration = -1;
    public static int overrideExitDuration = -1;
    protected BaseOnDialogClickCallback cancelButtonClickListener;
    protected CharSequence cancelText;
    protected DialogImpl dialogImpl;
    protected DialogLifecycleCallback<BottomDialog> dialogLifecycleCallback;
    protected DialogXAnimInterface<BottomDialog> dialogXAnimImpl;
    protected boolean hideWithExitAnim;
    protected boolean isHide;
    protected TextInfo menuTextInfo;
    protected CharSequence message;
    protected TextInfo messageTextInfo;
    protected BaseOnDialogClickCallback okButtonClickListener;
    protected CharSequence okText;
    protected OnBackPressedListener<BottomDialog> onBackPressedListener;
    protected OnBackgroundMaskClickListener<BottomDialog> onBackgroundMaskClickListener;
    protected OnBindView<BottomDialog> onBindView;
    protected BaseOnDialogClickCallback otherButtonClickListener;
    protected CharSequence otherText;
    protected BaseDialog.BOOLEAN privateCancelable;
    protected CharSequence title;
    protected Drawable titleIcon;
    protected TextInfo titleTextInfo;
    protected boolean allowInterceptTouch = true;
    protected boolean bottomNonSafetyAreaBySelf = false;
    protected Integer maskColor = null;
    protected boolean bkgInterceptTouch = true;
    protected float backgroundRadius = DialogX.defaultBottomDialogBackgroundRadius;
    protected BaseDialog.BUTTON_SELECT_RESULT buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.NONE;
    protected boolean scrollableWhenContentLargeThanVisibleRange = true;
    protected TextInfo cancelTextInfo = new TextInfo().setBold(true);
    protected TextInfo okTextInfo = new TextInfo().setBold(true);
    protected TextInfo otherTextInfo = new TextInfo().setBold(true);
    protected float bottomDialogMaxHeight = 0.0f;

    /* JADX INFO: renamed from: me */
    protected BottomDialog f4159me = this;

    public class DialogImpl implements DialogConvertViewInterface {
        public MaxRelativeLayout bkg;
        public float bkgEnterAimY = -1.0f;
        private List<View> blurViews;
        private BottomDialogTouchEventInterceptor bottomDialogTouchEventInterceptor;
        public RelativeLayout boxBkg;
        public ViewGroup boxBody;
        public LinearLayout boxButton;
        public ViewGroup boxCancel;
        public LinearLayout boxContent;
        public RelativeLayout boxCustom;
        public ViewGroup boxList;
        public DialogXBaseRelativeLayout boxRoot;
        public TextView btnSelectNegative;
        public TextView btnSelectOther;
        public TextView btnSelectPositive;
        public View imgSplit;
        public ImageView imgTab;
        public ScrollController scrollView;
        public ImageView splitSelectOther;
        public ImageView splitSelectPositive;
        public TextView txtDialogTip;
        public TextView txtDialogTitle;

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            BottomDialog.this.setDialogView(view);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.boxBkg = (RelativeLayout) view.findViewById(C2413R.id.box_bkg);
            this.bkg = (MaxRelativeLayout) view.findViewById(C2413R.id.bkg);
            this.imgTab = (ImageView) view.findViewById(C2413R.id.img_tab);
            this.boxBody = (ViewGroup) view.findViewById(C2413R.id.box_body);
            this.txtDialogTitle = (TextView) view.findViewById(C2413R.id.txt_dialog_title);
            this.scrollView = (ScrollController) view.findViewById(C2413R.id.scrollView);
            this.boxContent = (LinearLayout) view.findViewById(C2413R.id.box_content);
            this.txtDialogTip = (TextView) view.findViewById(C2413R.id.txt_dialog_tip);
            this.imgSplit = view.findViewWithTag("split");
            this.boxList = (ViewGroup) view.findViewById(C2413R.id.box_list);
            this.boxCustom = (RelativeLayout) view.findViewById(C2413R.id.box_custom);
            if (!BottomDialog.this.scrollableWhenContentLargeThanVisibleRange) {
                ViewGroup viewGroup = (ViewGroup) this.txtDialogTitle.getParent();
                ((ViewGroup) this.boxContent.getParent()).removeView(this.boxContent);
                viewGroup.addView(this.boxContent, 1, new ViewGroup.LayoutParams(-1, -2));
            }
            this.boxCancel = (ViewGroup) view.findViewWithTag("cancelBox");
            this.boxButton = (LinearLayout) view.findViewById(C2413R.id.box_button);
            this.btnSelectNegative = (TextView) view.findViewById(C2413R.id.btn_selectNegative);
            this.btnSelectOther = (TextView) view.findViewById(C2413R.id.btn_selectOther);
            this.btnSelectPositive = (TextView) view.findViewById(C2413R.id.btn_selectPositive);
            this.splitSelectPositive = (ImageView) view.findViewWithTag("imgPositiveButtonSplit");
            this.splitSelectOther = (ImageView) view.findViewWithTag("imgOtherButtonSplit");
            this.blurViews = BottomDialog.this.findAllBlurView(view);
            init();
            BottomDialog.this.dialogImpl = this;
            refreshView();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(View view) {
            BaseDialog baseDialog = BottomDialog.this;
            if (baseDialog.preDismiss(baseDialog)) {
                return;
            }
            if (view != null) {
                view.setEnabled(false);
            }
            if (BottomDialog.this.getOwnActivity() == null || ((BaseDialog) BottomDialog.this).dismissAnimFlag || getDialogXAnimImpl() == null) {
                return;
            }
            ((BaseDialog) BottomDialog.this).dismissAnimFlag = true;
            getDialogXAnimImpl().doExitAnim(BottomDialog.this, this.bkg);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.11
                @Override // java.lang.Runnable
                public void run() {
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogImpl.this.boxRoot;
                    if (dialogXBaseRelativeLayout != null) {
                        dialogXBaseRelativeLayout.setVisibility(8);
                    }
                    BaseDialog.dismiss(BottomDialog.this.getDialogView());
                }
            }, getExitAnimationDuration());
        }

        public BottomDialogTouchEventInterceptor getBottomDialogTouchEventInterceptor() {
            return this.bottomDialogTouchEventInterceptor;
        }

        public DialogXAnimInterface<BottomDialog> getDialogXAnimImpl() {
            BottomDialog bottomDialog = BottomDialog.this;
            if (bottomDialog.dialogXAnimImpl == null) {
                bottomDialog.dialogXAnimImpl = new DialogXAnimInterface<BottomDialog>() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.12
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(BottomDialog bottomDialog2, ViewGroup viewGroup) {
                        long exitAnimationDuration = DialogImpl.this.getExitAnimationDuration();
                        RelativeLayout relativeLayout = DialogImpl.this.boxBkg;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), DialogImpl.this.boxBkg.getHeight());
                        objectAnimatorOfFloat.setDuration(exitAnimationDuration);
                        objectAnimatorOfFloat.start();
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setDuration(exitAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.12.2
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
                    public void doShowAnim(BottomDialog bottomDialog2, ViewGroup viewGroup) {
                        long enterAnimationDuration = DialogImpl.this.getEnterAnimationDuration();
                        float height = 0.0f;
                        if (bottomDialog2.isAllowInterceptTouch()) {
                            DialogImpl dialogImpl = DialogImpl.this;
                            float f = BottomDialog.this.bottomDialogMaxHeight;
                            if (f > 0.0f && f <= 1.0f) {
                                height = dialogImpl.boxBkg.getHeight() - (BottomDialog.this.bottomDialogMaxHeight * r4.boxBkg.getHeight());
                            } else if (f > 1.0f) {
                                height = dialogImpl.boxBkg.getHeight() - BottomDialog.this.bottomDialogMaxHeight;
                            }
                        } else {
                            DialogImpl dialogImpl2 = DialogImpl.this;
                            float f2 = BottomDialog.this.bottomDialogMaxHeight;
                            if (f2 > 0.0f && f2 <= 1.0f) {
                                height = dialogImpl2.boxBkg.getHeight() - (BottomDialog.this.bottomDialogMaxHeight * r4.boxBkg.getHeight());
                            } else if (f2 > 1.0f) {
                                height = dialogImpl2.boxBkg.getHeight() - BottomDialog.this.bottomDialogMaxHeight;
                            }
                            DialogImpl.this.boxBkg.setPadding(0, 0, 0, (int) height);
                        }
                        DialogImpl dialogImpl3 = DialogImpl.this;
                        RelativeLayout relativeLayout = dialogImpl3.boxBkg;
                        float measuredHeight = BottomDialog.this.getRootFrameLayout() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : BottomDialog.this.getRootFrameLayout().getMeasuredHeight();
                        float f3 = r6.boxRoot.getUnsafePlace().top + height;
                        DialogImpl.this.bkgEnterAimY = f3;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", measuredHeight, f3);
                        objectAnimatorOfFloat.setDuration(enterAnimationDuration);
                        objectAnimatorOfFloat.setAutoCancel(true);
                        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
                        objectAnimatorOfFloat.start();
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(enterAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.12.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }
                };
            }
            return BottomDialog.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration() {
            int i = BottomDialog.overrideEnterDuration;
            return ((BaseDialog) BottomDialog.this).enterAnimDuration >= 0 ? ((BaseDialog) BottomDialog.this).enterAnimDuration : i >= 0 ? i : 300L;
        }

        public long getExitAnimationDuration() {
            int i = BottomDialog.overrideExitDuration;
            return ((BaseDialog) BottomDialog.this).exitAnimDuration != -1 ? ((BaseDialog) BottomDialog.this).exitAnimDuration : i >= 0 ? i : 300L;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            BottomDialog bottomDialog = BottomDialog.this;
            bottomDialog.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.NONE;
            bottomDialog.getDialogView().setTranslationZ(BottomDialog.this.getThisOrderIndex());
            BottomDialog bottomDialog2 = BottomDialog.this;
            if (bottomDialog2.titleTextInfo == null) {
                bottomDialog2.titleTextInfo = DialogX.titleTextInfo;
            }
            if (bottomDialog2.messageTextInfo == null) {
                bottomDialog2.messageTextInfo = DialogX.messageTextInfo;
            }
            if (bottomDialog2.okTextInfo == null) {
                bottomDialog2.okTextInfo = DialogX.okButtonTextInfo;
            }
            if (bottomDialog2.okTextInfo == null) {
                bottomDialog2.okTextInfo = DialogX.buttonTextInfo;
            }
            if (bottomDialog2.cancelTextInfo == null) {
                bottomDialog2.cancelTextInfo = DialogX.buttonTextInfo;
            }
            if (bottomDialog2.otherTextInfo == null) {
                bottomDialog2.otherTextInfo = DialogX.buttonTextInfo;
            }
            if (((BaseDialog) bottomDialog2).backgroundColor == null) {
                ((BaseDialog) BottomDialog.this).backgroundColor = DialogX.backgroundColor;
            }
            BottomDialog bottomDialog3 = BottomDialog.this;
            if (bottomDialog3.cancelText == null) {
                bottomDialog3.cancelText = DialogX.cancelButtonText;
            }
            TextView textView = this.txtDialogTitle;
            if (textView != null) {
                textView.getPaint().setFakeBoldText(true);
            }
            TextView textView2 = this.btnSelectNegative;
            if (textView2 != null) {
                textView2.getPaint().setFakeBoldText(true);
            }
            TextView textView3 = this.btnSelectPositive;
            if (textView3 != null) {
                textView3.getPaint().setFakeBoldText(true);
            }
            TextView textView4 = this.btnSelectOther;
            if (textView4 != null) {
                textView4.getPaint().setFakeBoldText(true);
            }
            this.boxBkg.setY(BottomDialog.this.getRootFrameLayout() == null ? Resources.getSystem().getDisplayMetrics().heightPixels : BottomDialog.this.getRootFrameLayout().getMeasuredHeight());
            this.boxRoot.setParentDialog(BottomDialog.this.f4159me);
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    ((BaseDialog) BottomDialog.this).isShow = false;
                    BottomDialog.this.getDialogLifecycleCallback().onDismiss(BottomDialog.this.f4159me);
                    BottomDialog bottomDialog4 = BottomDialog.this;
                    bottomDialog4.onDismiss(bottomDialog4.f4159me);
                    BottomDialog.this.setLifecycleState(Lifecycle.State.DESTROYED);
                    DialogImpl dialogImpl = DialogImpl.this;
                    BottomDialog.this.dialogImpl = null;
                    dialogImpl.bottomDialogTouchEventInterceptor = null;
                    BottomDialog.this.dialogLifecycleCallback = null;
                    BaseDialog.m5092gc();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) BottomDialog.this).isShow = true;
                    ((BaseDialog) BottomDialog.this).preShow = false;
                    BottomDialog.this.setLifecycleState(Lifecycle.State.CREATED);
                    BottomDialog.this.getDialogLifecycleCallback().onShow(BottomDialog.this.f4159me);
                    BottomDialog bottomDialog4 = BottomDialog.this;
                    bottomDialog4.onShow(bottomDialog4.f4159me);
                    BottomDialog.this.onDialogShow();
                    BottomDialog.this.refreshUI();
                }
            });
            TextView textView5 = this.btnSelectNegative;
            if (textView5 != null) {
                textView5.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BottomDialog.this.haptic(view);
                        BottomDialog bottomDialog4 = BottomDialog.this;
                        bottomDialog4.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.BUTTON_CANCEL;
                        BaseOnDialogClickCallback baseOnDialogClickCallback = bottomDialog4.cancelButtonClickListener;
                        if (baseOnDialogClickCallback == null) {
                            bottomDialog4.dismiss();
                            return;
                        }
                        if (baseOnDialogClickCallback instanceof OnDialogButtonClickListener) {
                            if (((OnDialogButtonClickListener) baseOnDialogClickCallback).onClick(bottomDialog4.f4159me, view)) {
                                return;
                            }
                            BottomDialog.this.dismiss();
                        } else {
                            if (!(baseOnDialogClickCallback instanceof OnMenuButtonClickListener) || ((OnMenuButtonClickListener) baseOnDialogClickCallback).onClick(bottomDialog4.f4159me, view)) {
                                return;
                            }
                            BottomDialog.this.dismiss();
                        }
                    }
                });
            }
            TextView textView6 = this.btnSelectOther;
            if (textView6 != null) {
                textView6.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BottomDialog.this.haptic(view);
                        BottomDialog bottomDialog4 = BottomDialog.this;
                        bottomDialog4.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.BUTTON_OTHER;
                        BaseOnDialogClickCallback baseOnDialogClickCallback = bottomDialog4.otherButtonClickListener;
                        if (baseOnDialogClickCallback == null) {
                            bottomDialog4.dismiss();
                            return;
                        }
                        if (baseOnDialogClickCallback instanceof OnDialogButtonClickListener) {
                            if (((OnDialogButtonClickListener) baseOnDialogClickCallback).onClick(bottomDialog4.f4159me, view)) {
                                return;
                            }
                            BottomDialog.this.dismiss();
                        } else {
                            if (!(baseOnDialogClickCallback instanceof OnMenuButtonClickListener) || ((OnMenuButtonClickListener) baseOnDialogClickCallback).onClick(bottomDialog4.f4159me, view)) {
                                return;
                            }
                            BottomDialog.this.dismiss();
                        }
                    }
                });
            }
            TextView textView7 = this.btnSelectPositive;
            if (textView7 != null) {
                textView7.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BottomDialog.this.haptic(view);
                        BottomDialog bottomDialog4 = BottomDialog.this;
                        bottomDialog4.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.BUTTON_OK;
                        BaseOnDialogClickCallback baseOnDialogClickCallback = bottomDialog4.okButtonClickListener;
                        if (baseOnDialogClickCallback == null) {
                            bottomDialog4.dismiss();
                            return;
                        }
                        if (baseOnDialogClickCallback instanceof OnDialogButtonClickListener) {
                            if (((OnDialogButtonClickListener) baseOnDialogClickCallback).onClick(bottomDialog4.f4159me, view)) {
                                return;
                            }
                            BottomDialog.this.dismiss();
                        } else {
                            if (!(baseOnDialogClickCallback instanceof OnMenuButtonClickListener) || ((OnMenuButtonClickListener) baseOnDialogClickCallback).onClick(bottomDialog4.f4159me, view)) {
                                return;
                            }
                            BottomDialog.this.dismiss();
                        }
                    }
                });
            }
            if (this.imgSplit != null) {
                int iOverrideMenuDividerDrawableRes = ((BaseDialog) BottomDialog.this).style.overrideBottomDialogRes().overrideMenuDividerDrawableRes(BottomDialog.this.isLightTheme());
                int iOverrideMenuDividerHeight = ((BaseDialog) BottomDialog.this).style.overrideBottomDialogRes().overrideMenuDividerHeight(BottomDialog.this.isLightTheme());
                if (iOverrideMenuDividerDrawableRes != 0) {
                    this.imgSplit.setBackgroundResource(iOverrideMenuDividerDrawableRes);
                }
                if (iOverrideMenuDividerHeight != 0) {
                    ViewGroup.LayoutParams layoutParams = this.imgSplit.getLayoutParams();
                    layoutParams.height = iOverrideMenuDividerHeight;
                    this.imgSplit.setLayoutParams(layoutParams);
                }
            }
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.5
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    BottomDialog bottomDialog4 = BottomDialog.this;
                    OnBackPressedListener<BottomDialog> onBackPressedListener = bottomDialog4.onBackPressedListener;
                    if (onBackPressedListener != null) {
                        if (!onBackPressedListener.onBackPressed(bottomDialog4.f4159me)) {
                            return true;
                        }
                        BottomDialog.this.dismiss();
                        return true;
                    }
                    if (!bottomDialog4.isCancelable()) {
                        return true;
                    }
                    BottomDialog.this.dismiss();
                    return true;
                }
            });
            this.boxBkg.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    Integer colorNullable;
                    Float floatStyleAttr;
                    DialogXAnimInterface<BottomDialog> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doShowAnim(BottomDialog.this, dialogImpl.bkg);
                    if (((BaseDialog) BottomDialog.this).style.messageDialogBlurSettings() != null) {
                        BottomDialog bottomDialog4 = BottomDialog.this;
                        colorNullable = bottomDialog4.getColorNullable(bottomDialog4.getIntStyleAttr(Integer.valueOf(((BaseDialog) bottomDialog4).style.messageDialogBlurSettings().blurForwardColorRes(BottomDialog.this.isLightTheme()))));
                        floatStyleAttr = BottomDialog.this.getFloatStyleAttr(Float.valueOf(((BaseDialog) r1).style.messageDialogBlurSettings().blurBackgroundRoundRadiusPx()));
                    } else {
                        colorNullable = null;
                        floatStyleAttr = null;
                    }
                    if (DialogImpl.this.blurViews != null) {
                        Iterator it = DialogImpl.this.blurViews.iterator();
                        while (it.hasNext()) {
                            BlurViewType blurViewType = (BlurViewType) ((View) it.next());
                            blurViewType.setOverlayColor(((BaseDialog) BottomDialog.this).backgroundColor == null ? colorNullable : ((BaseDialog) BottomDialog.this).backgroundColor);
                            blurViewType.setRadiusPx(floatStyleAttr);
                        }
                    }
                }
            });
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    DialogImpl dialogImpl = DialogImpl.this;
                    BottomDialog bottomDialog4 = BottomDialog.this;
                    dialogImpl.bottomDialogTouchEventInterceptor = new BottomDialogTouchEventInterceptor(bottomDialog4.f4159me, bottomDialog4.dialogImpl);
                }
            }, getEnterAnimationDuration());
            BottomDialog.this.onDialogInit();
        }

        public void preDismiss() {
            if (BottomDialog.this.isCancelable()) {
                if (!(BottomDialog.this.getDialogLifecycleCallback() instanceof BottomDialogSlideEventLifecycleCallback)) {
                    doDismiss(this.boxRoot);
                    return;
                } else {
                    if (((BottomDialogSlideEventLifecycleCallback) BottomDialog.this.getDialogLifecycleCallback()).onSlideClose(BottomDialog.this.f4159me)) {
                        return;
                    }
                    doDismiss(this.boxRoot);
                    return;
                }
            }
            int i = BottomDialog.overrideExitDuration;
            long j = i >= 0 ? i : 300L;
            if (((BaseDialog) BottomDialog.this).exitAnimDuration >= 0) {
                j = ((BaseDialog) BottomDialog.this).exitAnimDuration;
            }
            RelativeLayout relativeLayout = this.boxBkg;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "y", relativeLayout.getY(), this.boxRoot.getUnsafePlace().top);
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.start();
        }

        public void reBuild() {
            init();
            BottomDialog.this.dialogImpl = this;
            refreshView();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            GradientDrawable gradientDrawable;
            TextView textView;
            TextView textView2;
            if (this.boxRoot == null || BottomDialog.this.getOwnActivity() == null) {
                return;
            }
            this.bkg.setMaxWidth(BottomDialog.this.getMaxWidth());
            this.bkg.setMaxHeight(BottomDialog.this.getMaxHeight());
            this.bkg.setMinimumWidth(BottomDialog.this.getMinWidth());
            this.bkg.setMinimumHeight(BottomDialog.this.getMinHeight());
            this.boxRoot.setAutoUnsafePlacePadding(BottomDialog.this.isEnableImmersiveMode());
            this.boxRoot.setRootPadding(((BaseDialog) BottomDialog.this).screenPaddings[0], ((BaseDialog) BottomDialog.this).screenPaddings[1], ((BaseDialog) BottomDialog.this).screenPaddings[2], ((BaseDialog) BottomDialog.this).screenPaddings[3]);
            if (((BaseDialog) BottomDialog.this).backgroundColor != null) {
                BottomDialog bottomDialog = BottomDialog.this;
                bottomDialog.tintColor(this.bkg, ((BaseDialog) bottomDialog).backgroundColor.intValue());
                if (((BaseDialog) BottomDialog.this).style.tintButtonBackground()) {
                    BottomDialog bottomDialog2 = BottomDialog.this;
                    bottomDialog2.tintColor(this.btnSelectOther, ((BaseDialog) bottomDialog2).backgroundColor.intValue());
                    BottomDialog bottomDialog3 = BottomDialog.this;
                    bottomDialog3.tintColor(this.btnSelectNegative, ((BaseDialog) bottomDialog3).backgroundColor.intValue());
                    BottomDialog bottomDialog4 = BottomDialog.this;
                    bottomDialog4.tintColor(this.btnSelectPositive, ((BaseDialog) bottomDialog4).backgroundColor.intValue());
                }
                List<View> list = this.blurViews;
                if (list != null) {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        ((BlurViewType) ((View) it.next())).setOverlayColor(((BaseDialog) BottomDialog.this).backgroundColor);
                    }
                }
            }
            BottomDialog bottomDialog5 = BottomDialog.this;
            bottomDialog5.showText(this.txtDialogTitle, bottomDialog5.title);
            BottomDialog bottomDialog6 = BottomDialog.this;
            bottomDialog6.showText(this.txtDialogTip, bottomDialog6.message);
            BaseDialog.useTextInfo(this.txtDialogTitle, BottomDialog.this.titleTextInfo);
            BaseDialog.useTextInfo(this.txtDialogTip, BottomDialog.this.messageTextInfo);
            BaseDialog.useTextInfo(this.btnSelectNegative, BottomDialog.this.cancelTextInfo);
            BaseDialog.useTextInfo(this.btnSelectOther, BottomDialog.this.otherTextInfo);
            BaseDialog.useTextInfo(this.btnSelectPositive, BottomDialog.this.okTextInfo);
            LinearLayout linearLayout = this.boxButton;
            if (linearLayout != null) {
                TextView textView3 = this.btnSelectNegative;
                linearLayout.setVisibility(((textView3 == null || textView3.getVisibility() != 0) && ((textView = this.btnSelectOther) == null || textView.getVisibility() != 0) && ((textView2 = this.btnSelectPositive) == null || textView2.getVisibility() != 0)) ? 8 : 0);
            }
            if (BottomDialog.this.titleIcon != null) {
                int textSize = (int) this.txtDialogTitle.getTextSize();
                BottomDialog.this.titleIcon.setBounds(0, 0, textSize, textSize);
                this.txtDialogTitle.setCompoundDrawablePadding(BottomDialog.this.dip2px(10.0f));
                this.txtDialogTitle.setCompoundDrawables(BottomDialog.this.titleIcon, null, null, null);
            }
            BottomDialog bottomDialog7 = BottomDialog.this;
            if (!bottomDialog7.bkgInterceptTouch) {
                this.boxRoot.setClickable(false);
            } else if (bottomDialog7.isCancelable()) {
                this.boxRoot.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.8
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BottomDialog bottomDialog8 = BottomDialog.this;
                        OnBackgroundMaskClickListener<BottomDialog> onBackgroundMaskClickListener = bottomDialog8.onBackgroundMaskClickListener;
                        if (onBackgroundMaskClickListener == null || !onBackgroundMaskClickListener.onClick(bottomDialog8.f4159me, view)) {
                            DialogImpl.this.doDismiss(view);
                        }
                    }
                });
            } else {
                this.boxRoot.setOnClickListener(null);
            }
            this.boxBkg.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogImpl.this.boxRoot.callOnClick();
                }
            });
            if (BottomDialog.this.backgroundRadius > -1.0f) {
                if ((this.bkg.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) this.bkg.getBackground()) != null) {
                    float f = BottomDialog.this.backgroundRadius;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.bkg.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl.10
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        int width = view.getWidth();
                        float height = view.getHeight();
                        float f2 = BottomDialog.this.backgroundRadius;
                        outline.setRoundRect(0, 0, width, (int) (height + f2), f2);
                    }
                });
                this.bkg.setClipToOutline(true);
                List<View> list2 = this.blurViews;
                if (list2 != null) {
                    Iterator<View> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((BlurViewType) ((View) it2.next())).setRadiusPx(Float.valueOf(BottomDialog.this.backgroundRadius));
                    }
                }
            }
            if (BottomDialog.this.maskColor != null) {
                this.boxRoot.setBackground(new ColorDrawable(BottomDialog.this.maskColor.intValue()));
            }
            OnBindView<BottomDialog> onBindView = BottomDialog.this.onBindView;
            if (onBindView != null && onBindView.getCustomView() != null) {
                BottomDialog bottomDialog8 = BottomDialog.this;
                bottomDialog8.onBindView.bindParent(this.boxCustom, bottomDialog8.f4159me);
                if (BottomDialog.this.onBindView.getCustomView() instanceof ScrollController) {
                    ScrollController scrollController = this.scrollView;
                    if (scrollController instanceof DialogScrollView) {
                        ((DialogScrollView) scrollController).setVerticalScrollBarEnabled(false);
                    }
                    this.scrollView = (ScrollController) BottomDialog.this.onBindView.getCustomView();
                } else {
                    KeyEvent.Callback callbackFindViewWithTag = BottomDialog.this.onBindView.getCustomView().findViewWithTag("ScrollController");
                    if (callbackFindViewWithTag instanceof ScrollController) {
                        ScrollController scrollController2 = this.scrollView;
                        if (scrollController2 instanceof DialogScrollView) {
                            ((DialogScrollView) scrollController2).setVerticalScrollBarEnabled(false);
                        }
                        this.scrollView = (ScrollController) callbackFindViewWithTag;
                    }
                }
            }
            if (BottomDialog.this.isAllowInterceptTouch() && BottomDialog.this.isCancelable()) {
                ImageView imageView = this.imgTab;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            } else {
                ImageView imageView2 = this.imgTab;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
            BottomDialogTouchEventInterceptor bottomDialogTouchEventInterceptor = this.bottomDialogTouchEventInterceptor;
            if (bottomDialogTouchEventInterceptor != null) {
                bottomDialogTouchEventInterceptor.refresh(BottomDialog.this.f4159me, this);
            }
            if (this.imgSplit != null) {
                if (this.txtDialogTitle.getVisibility() == 0 || this.txtDialogTip.getVisibility() == 0) {
                    this.imgSplit.setVisibility(0);
                } else {
                    this.imgSplit.setVisibility(8);
                }
            }
            if (this.boxCancel != null) {
                if (BaseDialog.isNull(BottomDialog.this.cancelText)) {
                    this.boxCancel.setVisibility(8);
                } else {
                    this.boxCancel.setVisibility(0);
                }
            }
            BottomDialog bottomDialog9 = BottomDialog.this;
            bottomDialog9.showText(this.btnSelectPositive, bottomDialog9.okText);
            BottomDialog bottomDialog10 = BottomDialog.this;
            bottomDialog10.showText(this.btnSelectNegative, bottomDialog10.cancelText);
            BottomDialog bottomDialog11 = BottomDialog.this;
            bottomDialog11.showText(this.btnSelectOther, bottomDialog11.otherText);
            ImageView imageView3 = this.splitSelectPositive;
            if (imageView3 != null) {
                imageView3.setVisibility(this.btnSelectPositive.getVisibility());
            }
            ImageView imageView4 = this.splitSelectOther;
            if (imageView4 != null) {
                imageView4.setVisibility(this.btnSelectOther.getVisibility());
            }
            BottomDialog.this.onDialogRefreshUI();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BottomDialog build() {
        return new BottomDialog();
    }

    public BottomDialog appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    public BottomDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public BottomDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public BottomDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    public BottomDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public void dismiss() {
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.2
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = BottomDialog.this.dialogImpl;
                if (dialogImpl == null) {
                    return;
                }
                dialogImpl.doDismiss(null);
            }
        });
    }

    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    public float getBottomDialogMaxHeight() {
        return this.bottomDialogMaxHeight;
    }

    public BaseDialog.BUTTON_SELECT_RESULT getButtonSelectResult() {
        return this.buttonSelectResult;
    }

    public CharSequence getCancelButton() {
        return this.cancelText;
    }

    public OnDialogButtonClickListener<BottomDialog> getCancelButtonClickListener() {
        return (OnDialogButtonClickListener) this.cancelButtonClickListener;
    }

    public TextInfo getCancelTextInfo() {
        return this.cancelTextInfo;
    }

    public View getCustomView() {
        OnBindView<BottomDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    public DialogLifecycleCallback<BottomDialog> getDialogLifecycleCallback() {
        DialogLifecycleCallback<BottomDialog> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<BottomDialog>() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.3
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<BottomDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public CharSequence getMessage() {
        return this.message;
    }

    public TextInfo getMessageTextInfo() {
        return this.messageTextInfo;
    }

    public CharSequence getOkButton() {
        return this.okText;
    }

    public TextInfo getOkTextInfo() {
        return this.okTextInfo;
    }

    public OnBackPressedListener<BottomDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    public OnBackgroundMaskClickListener<BottomDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public CharSequence getOtherButton() {
        return this.otherText;
    }

    public TextInfo getOtherTextInfo() {
        return this.otherTextInfo;
    }

    public float getRadius() {
        return this.backgroundRadius;
    }

    public CharSequence getTitle() {
        return this.title;
    }

    public Drawable getTitleIcon() {
        return this.titleIcon;
    }

    public TextInfo getTitleTextInfo() {
        return this.titleTextInfo;
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
            getDialogImpl().getDialogXAnimImpl().doExitAnim(this.f4159me, getDialogImpl().bkg);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.4
                @Override // java.lang.Runnable
                public void run() {
                    if (BottomDialog.this.getDialogView() != null) {
                        BottomDialog.this.getDialogView().setVisibility(8);
                    }
                }
            }, getDialogImpl().getExitAnimationDuration());
        }
    }

    public boolean isAllowInterceptTouch() {
        return this.style.overrideBottomDialogRes() != null && this.allowInterceptTouch && this.style.overrideBottomDialogRes().touchSlide();
    }

    public boolean isBkgInterceptTouch() {
        return this.bkgInterceptTouch;
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

    public boolean isScrollableWhenContentLargeThanVisibleRange() {
        return this.scrollableWhenContentLargeThanVisibleRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onDismiss(BottomDialog bottomDialog) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onShow(BottomDialog bottomDialog) {
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.BottomDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = BottomDialog.this.dialogImpl;
                if (dialogImpl != null) {
                    dialogImpl.refreshView();
                }
            }
        });
    }

    public BottomDialog removeCustomView() {
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
        if (getDialogImpl().boxList != null) {
            getDialogImpl().boxList.removeAllViews();
        }
        int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_bottom_material : C2413R.layout.layout_dialogx_bottom_material_dark;
        if (this.style.overrideBottomDialogRes() != null) {
            customDialogLayoutResId = this.style.overrideBottomDialogRes().overrideDialogLayout(isLightTheme());
        }
        if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
            customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
        }
        this.enterAnimDuration = 0L;
        View viewCreateView = createView(customDialogLayoutResId);
        this.dialogImpl = new DialogImpl(viewCreateView);
        if (viewCreateView != null) {
            viewCreateView.setTag(this.f4159me);
        }
        BaseDialog.show(viewCreateView);
    }

    public BottomDialog setActionRunnable(int i, DialogXRunnable<BottomDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public BottomDialog setAllowInterceptTouch(boolean z) {
        this.allowInterceptTouch = z;
        return this;
    }

    public BottomDialog setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public BottomDialog setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    public BottomDialog setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    public BottomDialog setBottomDialogMaxHeight(float f) {
        this.bottomDialogMaxHeight = f;
        return this;
    }

    public BottomDialog setBottomNonSafetyAreaBySelf(boolean z) {
        this.bottomNonSafetyAreaBySelf = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setCancelButton(CharSequence charSequence) {
        this.cancelText = charSequence;
        refreshUI();
        return this;
    }

    public BottomDialog setCancelButtonClickListener(OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.cancelButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public BottomDialog setCancelTextInfo(TextInfo textInfo) {
        this.cancelTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public BottomDialog setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public BottomDialog setCustomView(OnBindView<BottomDialog> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public BottomDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public BottomDialog setDialogLifecycleCallback(DialogLifecycleCallback<BottomDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4159me);
        }
        return this;
    }

    public BottomDialog setDialogXAnimImpl(DialogXAnimInterface<BottomDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public BottomDialog setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    public BottomDialog setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    public BottomDialog setHapticFeedbackEnabled(boolean z) {
        this.isHapticFeedbackEnabled = z ? 1 : 0;
        return this;
    }

    public BottomDialog setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public BottomDialog setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    public BottomDialog setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setMessage(CharSequence charSequence) {
        this.message = charSequence;
        refreshUI();
        return this;
    }

    public BottomDialog setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public BottomDialog setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    public BottomDialog setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setOkButton(CharSequence charSequence) {
        this.okText = charSequence;
        refreshUI();
        return this;
    }

    public BottomDialog setOkTextInfo(TextInfo textInfo) {
        this.okTextInfo = textInfo;
        return this;
    }

    public BottomDialog setOnBackPressedListener(OnBackPressedListener<BottomDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        refreshUI();
        return this;
    }

    public BottomDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<BottomDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setOtherButton(CharSequence charSequence) {
        this.otherText = charSequence;
        refreshUI();
        return this;
    }

    public BottomDialog setOtherTextInfo(TextInfo textInfo) {
        this.otherTextInfo = textInfo;
        return this;
    }

    public BottomDialog setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public BottomDialog setScrollableWhenContentLargeThanVisibleRange(boolean z) {
        this.scrollableWhenContentLargeThanVisibleRange = z;
        return this;
    }

    public BottomDialog setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public BottomDialog setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setTitle(CharSequence charSequence) {
        this.title = charSequence;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomDialog setTitleIcon(Bitmap bitmap) {
        this.titleIcon = new BitmapDrawable(getResources(), bitmap);
        refreshUI();
        return this;
    }

    public BottomDialog setTitleTextInfo(TextInfo textInfo) {
        this.titleTextInfo = textInfo;
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static BottomDialog build(DialogXStyle dialogXStyle) {
        return new BottomDialog().setStyle(dialogXStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static BottomDialog show(CharSequence charSequence, CharSequence charSequence2) {
        BottomDialog bottomDialog = new BottomDialog(charSequence, charSequence2);
        bottomDialog.show();
        return bottomDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BottomDialog onDismiss(DialogXRunnable<BottomDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BottomDialog onShow(DialogXRunnable<BottomDialog> dialogXRunnable) {
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
    public BottomDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public BottomDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public BottomDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public static BottomDialog build(OnBindView<BottomDialog> onBindView) {
        return new BottomDialog().setCustomView(onBindView);
    }

    public BottomDialog setCancelButton(int i) {
        this.cancelText = getString(i);
        refreshUI();
        return this;
    }

    public BottomDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public BottomDialog setMessage(int i) {
        this.message = getString(i);
        refreshUI();
        return this;
    }

    public BottomDialog setOkButton(int i) {
        this.okText = getString(i);
        refreshUI();
        return this;
    }

    public BottomDialog setOtherButton(int i) {
        this.otherText = getString(i);
        refreshUI();
        return this;
    }

    public BottomDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public BottomDialog setTitle(int i) {
        this.title = getString(i);
        refreshUI();
        return this;
    }

    public BottomDialog setTitleIcon(int i) {
        this.titleIcon = getResources().getDrawable(i);
        refreshUI();
        return this;
    }

    public static BottomDialog show(int i, int i2) {
        BottomDialog bottomDialog = new BottomDialog(i, i2);
        bottomDialog.show();
        return bottomDialog;
    }

    public BottomDialog setCancelButton(OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.cancelButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public BottomDialog setOkButton(OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.okButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public BottomDialog setOtherButton(OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.otherButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public BottomDialog setTitleIcon(Drawable drawable) {
        this.titleIcon = drawable;
        refreshUI();
        return this;
    }

    public static BottomDialog show(CharSequence charSequence, CharSequence charSequence2, OnBindView<BottomDialog> onBindView) {
        BottomDialog bottomDialog = new BottomDialog(charSequence, charSequence2, onBindView);
        bottomDialog.show();
        return bottomDialog;
    }

    public BottomDialog setCancelButton(CharSequence charSequence, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.cancelText = charSequence;
        this.cancelButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public BottomDialog setOkButton(CharSequence charSequence, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.okText = charSequence;
        this.okButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public BottomDialog setOtherButton(CharSequence charSequence, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.otherText = charSequence;
        this.otherButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public static BottomDialog show(int i, int i2, OnBindView<BottomDialog> onBindView) {
        BottomDialog bottomDialog = new BottomDialog(i, i2, onBindView);
        bottomDialog.show();
        return bottomDialog;
    }

    public BottomDialog setCancelButton(int i, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.cancelText = getString(i);
        this.cancelButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public BottomDialog setOkButton(int i, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.okText = getString(i);
        this.okButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public BottomDialog setOtherButton(int i, OnDialogButtonClickListener<BottomDialog> onDialogButtonClickListener) {
        this.otherText = getString(i);
        this.otherButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public static BottomDialog show(CharSequence charSequence, OnBindView<BottomDialog> onBindView) {
        BottomDialog bottomDialog = new BottomDialog(charSequence, onBindView);
        bottomDialog.show();
        return bottomDialog;
    }

    public static BottomDialog show(int i, OnBindView<BottomDialog> onBindView) {
        BottomDialog bottomDialog = new BottomDialog(i, onBindView);
        bottomDialog.show();
        return bottomDialog;
    }

    public BottomDialog(OnBindView<BottomDialog> onBindView) {
        this.onBindView = onBindView;
    }

    public static BottomDialog show(OnBindView<BottomDialog> onBindView) {
        BottomDialog bottomDialog = new BottomDialog(onBindView);
        bottomDialog.show();
        return bottomDialog;
    }

    public static BottomDialog show(int i, int i2, int i3) {
        BottomDialog bottomDialog = new BottomDialog(i, i2, i3);
        bottomDialog.show();
        return bottomDialog;
    }

    public static BottomDialog show(int i, int i2, int i3, int i4) {
        BottomDialog bottomDialog = new BottomDialog(i, i2, i3, i4);
        bottomDialog.show();
        return bottomDialog;
    }

    public static BottomDialog show(int i, int i2, int i3, OnBindView<BottomDialog> onBindView) {
        BottomDialog bottomDialog = new BottomDialog(i, i2, i3, onBindView);
        bottomDialog.show();
        return bottomDialog;
    }

    public static BottomDialog show(int i, int i2, int i3, int i4, OnBindView<BottomDialog> onBindView) {
        BottomDialog bottomDialog = new BottomDialog(i, i2, i3, i4, onBindView);
        bottomDialog.show();
        return bottomDialog;
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public BottomDialog show() {
        if (this.isHide && getDialogView() != null && this.isShow) {
            if (this.hideWithExitAnim && getDialogImpl() != null) {
                getDialogView().setVisibility(0);
                getDialogImpl().getDialogXAnimImpl().doShowAnim(this.f4159me, getDialogImpl().bkg);
            } else {
                getDialogView().setVisibility(0);
            }
            return this;
        }
        super.beforeShow();
        if (getDialogView() == null) {
            int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_bottom_material : C2413R.layout.layout_dialogx_bottom_material_dark;
            if (this.style.overrideBottomDialogRes() != null) {
                customDialogLayoutResId = this.style.overrideBottomDialogRes().overrideDialogLayout(isLightTheme());
            }
            if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
                customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4159me);
            }
            BaseDialog.show(viewCreateView);
        } else {
            BaseDialog.show(getDialogView());
        }
        return this;
    }

    public BottomDialog(CharSequence charSequence, OnBindView<BottomDialog> onBindView) {
        this.title = charSequence;
        this.onBindView = onBindView;
    }

    public void show(Activity activity) {
        super.beforeShow();
        if (getDialogView() == null) {
            int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_bottom_material : C2413R.layout.layout_dialogx_bottom_material_dark;
            if (this.style.overrideBottomDialogRes() != null) {
                customDialogLayoutResId = this.style.overrideBottomDialogRes().overrideDialogLayout(isLightTheme());
            }
            if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
                customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4159me);
            }
            BaseDialog.show(activity, viewCreateView);
            return;
        }
        BaseDialog.show(activity, getDialogView());
    }

    public BottomDialog(int i, OnBindView<BottomDialog> onBindView) {
        this.title = getString(i);
        this.onBindView = onBindView;
    }

    public BottomDialog(CharSequence charSequence, CharSequence charSequence2) {
        this.title = charSequence;
        this.message = charSequence2;
    }

    public BottomDialog(int i, int i2) {
        this.title = getString(i);
        this.message = getString(i2);
    }

    public BottomDialog(CharSequence charSequence, CharSequence charSequence2, OnBindView<BottomDialog> onBindView) {
        this.title = charSequence;
        this.message = charSequence2;
        this.onBindView = onBindView;
    }

    public BottomDialog(int i, int i2, OnBindView<BottomDialog> onBindView) {
        this.title = getString(i);
        this.message = getString(i2);
        this.onBindView = onBindView;
    }

    public BottomDialog(int i, int i2, int i3, int i4) {
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.cancelText = getString(i4);
    }

    public BottomDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
    }

    public BottomDialog(int i, int i2, int i3) {
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
    }

    public BottomDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
    }

    public BottomDialog(int i, int i2, int i3, OnBindView<BottomDialog> onBindView) {
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.onBindView = onBindView;
    }

    public BottomDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, OnBindView<BottomDialog> onBindView) {
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.onBindView = onBindView;
    }

    public BottomDialog(int i, int i2, int i3, int i4, OnBindView<BottomDialog> onBindView) {
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.cancelText = getString(i4);
        this.onBindView = onBindView;
    }

    public BottomDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, OnBindView<BottomDialog> onBindView) {
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
        this.onBindView = onBindView;
    }
}
