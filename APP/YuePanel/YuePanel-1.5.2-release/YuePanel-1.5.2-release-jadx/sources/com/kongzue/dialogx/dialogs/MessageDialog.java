package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC6490;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback;
import com.kongzue.dialogx.interfaces.BlurViewType;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.kongzue.dialogx.interfaces.ScrollController;
import com.kongzue.dialogx.util.InputInfo;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogScrollView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MessageDialog extends BaseDialog {
    public static BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterAnimRes = 0;
    public static int overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static int overrideExitDuration = -1;
    protected int buttonOrientation;
    protected BaseOnDialogClickCallback cancelButtonClickListener;
    protected CharSequence cancelText;
    protected TextInfo cancelTextInfo;
    protected int customEnterAnimResId;
    protected int customExitAnimResId;
    protected DialogImpl dialogImpl;
    protected DialogLifecycleCallback<MessageDialog> dialogLifecycleCallback;
    protected DialogXAnimInterface<MessageDialog> dialogXAnimImpl;
    protected boolean hideWithExitAnim;
    protected String inputHintText;
    protected InputInfo inputInfo;
    protected String inputText;
    protected CharSequence message;
    protected TextInfo messageTextInfo;
    protected BaseOnDialogClickCallback okButtonClickListener;
    protected CharSequence okText;
    protected TextInfo okTextInfo;
    protected OnBackPressedListener<MessageDialog> onBackPressedListener;
    protected OnBackgroundMaskClickListener<MessageDialog> onBackgroundMaskClickListener;
    protected OnBindView<MessageDialog> onBindView;
    protected BaseOnDialogClickCallback otherButtonClickListener;
    protected CharSequence otherText;
    protected TextInfo otherTextInfo;
    protected BaseDialog.BOOLEAN privateCancelable;
    protected CharSequence title;
    protected Drawable titleIcon;
    protected TextInfo titleTextInfo;
    protected boolean bkgInterceptTouch = true;

    /* JADX INFO: renamed from: me */
    protected MessageDialog f4164me = this;
    protected BaseDialog.BUTTON_SELECT_RESULT buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.NONE;
    protected Integer maskColor = null;
    protected float backgroundRadius = DialogX.defaultMessageDialogBackgroundRadius;

    public class DialogImpl implements DialogConvertViewInterface {
        public MaxRelativeLayout bkg;
        private List<View> blurViews;
        public LinearLayout boxButton;
        public RelativeLayout boxCustom;
        public ViewGroup boxList;
        public DialogXBaseRelativeLayout boxRoot;
        public TextView btnSelectNegative;
        public TextView btnSelectOther;
        public TextView btnSelectPositive;
        public ScrollController scrollView;
        public View spaceOtherButton;
        public View splitHorizontal;
        public TextView txtDialogTip;
        public TextView txtDialogTitle;
        public EditText txtInput;

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            MessageDialog.this.setDialogView(view);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.bkg = (MaxRelativeLayout) view.findViewById(C2413R.id.bkg);
            this.txtDialogTitle = (TextView) view.findViewById(C2413R.id.txt_dialog_title);
            this.scrollView = (ScrollController) view.findViewById(C2413R.id.scrollView);
            this.txtDialogTip = (TextView) view.findViewById(C2413R.id.txt_dialog_tip);
            this.boxList = (ViewGroup) view.findViewById(C2413R.id.box_list);
            this.boxCustom = (RelativeLayout) view.findViewById(C2413R.id.box_custom);
            this.txtInput = (EditText) view.findViewById(C2413R.id.txt_input);
            this.boxButton = (LinearLayout) view.findViewById(C2413R.id.box_button);
            this.btnSelectOther = (TextView) view.findViewById(C2413R.id.btn_selectOther);
            this.spaceOtherButton = view.findViewById(C2413R.id.space_other_button);
            this.splitHorizontal = view.findViewWithTag("split");
            this.btnSelectNegative = (TextView) view.findViewById(C2413R.id.btn_selectNegative);
            this.btnSelectPositive = (TextView) view.findViewById(C2413R.id.btn_selectPositive);
            this.blurViews = MessageDialog.this.findAllBlurView(view);
            init();
            MessageDialog.this.dialogImpl = this;
            refreshView();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(View view) {
            BaseDialog baseDialog = MessageDialog.this;
            if (baseDialog.preDismiss(baseDialog)) {
                return;
            }
            if (view != null) {
                view.setEnabled(false);
            }
            if (MessageDialog.this.getOwnActivity() == null || ((BaseDialog) MessageDialog.this).dismissAnimFlag || getDialogXAnimImpl() == null) {
                return;
            }
            ((BaseDialog) MessageDialog.this).dismissAnimFlag = true;
            getDialogXAnimImpl().doExitAnim(MessageDialog.this, this.bkg);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogImpl.this.boxRoot;
                    if (dialogXBaseRelativeLayout != null) {
                        dialogXBaseRelativeLayout.setVisibility(8);
                    }
                    BaseDialog.dismiss(MessageDialog.this.getDialogView());
                }
            }, getExitAnimationDuration(null));
        }

        public DialogXAnimInterface<MessageDialog> getDialogXAnimImpl() {
            MessageDialog messageDialog = MessageDialog.this;
            if (messageDialog.dialogXAnimImpl == null) {
                messageDialog.dialogXAnimImpl = new DialogXAnimInterface<MessageDialog>() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.9
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(MessageDialog messageDialog2, ViewGroup viewGroup) {
                        int iExitAnimResId = ((BaseDialog) MessageDialog.this).style.exitAnimResId() == 0 ? C2413R.anim.anim_dialogx_default_exit : ((BaseDialog) MessageDialog.this).style.exitAnimResId();
                        int i = MessageDialog.overrideExitAnimRes;
                        if (i != 0) {
                            iExitAnimResId = i;
                        }
                        MessageDialog messageDialog3 = MessageDialog.this;
                        int i2 = messageDialog3.customExitAnimResId;
                        if (i2 != 0) {
                            iExitAnimResId = i2;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(messageDialog3.getOwnActivity(), iExitAnimResId);
                        long exitAnimationDuration = DialogImpl.this.getExitAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setInterpolator(new AccelerateInterpolator());
                        animationLoadAnimation.setDuration(exitAnimationDuration);
                        DialogImpl.this.bkg.startAnimation(animationLoadAnimation);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setDuration(exitAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.9.2
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
                    public void doShowAnim(MessageDialog messageDialog2, ViewGroup viewGroup) {
                        int iEnterAnimResId = ((BaseDialog) MessageDialog.this).style.enterAnimResId() == 0 ? C2413R.anim.anim_dialogx_default_enter : ((BaseDialog) MessageDialog.this).style.enterAnimResId();
                        int i = MessageDialog.overrideEnterAnimRes;
                        if (i != 0) {
                            iEnterAnimResId = i;
                        }
                        MessageDialog messageDialog3 = MessageDialog.this;
                        int i2 = messageDialog3.customEnterAnimResId;
                        if (i2 != 0) {
                            iEnterAnimResId = i2;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(messageDialog3.getOwnActivity(), iEnterAnimResId);
                        long enterAnimationDuration = DialogImpl.this.getEnterAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setDuration(enterAnimationDuration);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator());
                        DialogImpl.this.bkg.startAnimation(animationLoadAnimation);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(enterAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.9.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }
                };
            }
            return MessageDialog.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.bkg.getAnimation() != null) {
                animation = this.bkg.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            int i = MessageDialog.overrideEnterDuration;
            if (i >= 0) {
                duration = i;
            }
            return ((BaseDialog) MessageDialog.this).enterAnimDuration >= 0 ? ((BaseDialog) MessageDialog.this).enterAnimDuration : duration;
        }

        public long getExitAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.bkg.getAnimation() != null) {
                animation = this.bkg.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            int i = MessageDialog.overrideExitDuration;
            if (i >= 0) {
                duration = i;
            }
            return ((BaseDialog) MessageDialog.this).exitAnimDuration != -1 ? ((BaseDialog) MessageDialog.this).exitAnimDuration : duration;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            MessageDialog messageDialog = MessageDialog.this;
            messageDialog.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.NONE;
            messageDialog.getDialogView().setTranslationZ(MessageDialog.this.getThisOrderIndex());
            MessageDialog messageDialog2 = MessageDialog.this;
            if (messageDialog2.titleTextInfo == null) {
                messageDialog2.titleTextInfo = DialogX.titleTextInfo;
            }
            if (messageDialog2.messageTextInfo == null) {
                messageDialog2.messageTextInfo = DialogX.messageTextInfo;
            }
            if (messageDialog2.okTextInfo == null) {
                messageDialog2.okTextInfo = DialogX.okButtonTextInfo;
            }
            if (messageDialog2.okTextInfo == null) {
                messageDialog2.okTextInfo = DialogX.buttonTextInfo;
            }
            if (messageDialog2.cancelTextInfo == null) {
                messageDialog2.cancelTextInfo = DialogX.buttonTextInfo;
            }
            if (messageDialog2.otherTextInfo == null) {
                messageDialog2.otherTextInfo = DialogX.buttonTextInfo;
            }
            if (messageDialog2.inputInfo == null) {
                messageDialog2.inputInfo = DialogX.inputInfo;
            }
            if (((BaseDialog) messageDialog2).backgroundColor == null) {
                ((BaseDialog) MessageDialog.this).backgroundColor = DialogX.backgroundColor;
            }
            this.txtDialogTitle.getPaint().setFakeBoldText(true);
            this.btnSelectNegative.getPaint().setFakeBoldText(true);
            this.btnSelectPositive.getPaint().setFakeBoldText(true);
            this.btnSelectOther.getPaint().setFakeBoldText(true);
            this.txtDialogTip.setMovementMethod(LinkMovementMethod.getInstance());
            this.boxRoot.setBkgAlpha(0.0f);
            this.boxRoot.setParentDialog(MessageDialog.this.f4164me);
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    ((BaseDialog) MessageDialog.this).isShow = false;
                    MessageDialog.this.getDialogLifecycleCallback().onDismiss(MessageDialog.this.f4164me);
                    MessageDialog messageDialog3 = MessageDialog.this;
                    messageDialog3.onDismiss(messageDialog3.f4164me);
                    MessageDialog.this.setLifecycleState(Lifecycle.State.DESTROYED);
                    MessageDialog.this.dialogLifecycleCallback = null;
                    BaseDialog.m5092gc();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) MessageDialog.this).isShow = true;
                    ((BaseDialog) MessageDialog.this).preShow = false;
                    MessageDialog.this.setLifecycleState(Lifecycle.State.CREATED);
                    MessageDialog.this.onDialogShow();
                    MessageDialog.this.getDialogLifecycleCallback().onShow(MessageDialog.this.f4164me);
                    MessageDialog messageDialog3 = MessageDialog.this;
                    messageDialog3.onShow(messageDialog3.f4164me);
                    DialogXAnimInterface<MessageDialog> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doShowAnim(MessageDialog.this.f4164me, dialogImpl.bkg);
                    if (((BaseDialog) MessageDialog.this).style.messageDialogBlurSettings() != null && ((BaseDialog) MessageDialog.this).style.messageDialogBlurSettings().blurBackground()) {
                        DialogImpl.this.bkg.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Integer colorNullable;
                                Float floatStyleAttr;
                                if (((BaseDialog) MessageDialog.this).style.messageDialogBlurSettings() != null) {
                                    MessageDialog messageDialog4 = MessageDialog.this;
                                    colorNullable = messageDialog4.getColorNullable(messageDialog4.getIntStyleAttr(Integer.valueOf(((BaseDialog) messageDialog4).style.messageDialogBlurSettings().blurForwardColorRes(MessageDialog.this.isLightTheme()))));
                                    floatStyleAttr = MessageDialog.this.getFloatStyleAttr(Float.valueOf(((BaseDialog) r1).style.messageDialogBlurSettings().blurBackgroundRoundRadiusPx()));
                                } else {
                                    colorNullable = null;
                                    floatStyleAttr = null;
                                }
                                if (DialogImpl.this.blurViews != null) {
                                    Iterator it = DialogImpl.this.blurViews.iterator();
                                    while (it.hasNext()) {
                                        BlurViewType blurViewType = (BlurViewType) ((View) it.next());
                                        blurViewType.setOverlayColor(((BaseDialog) MessageDialog.this).backgroundColor == null ? colorNullable : ((BaseDialog) MessageDialog.this).backgroundColor);
                                        blurViewType.setRadiusPx(floatStyleAttr);
                                    }
                                }
                                MessageDialog.this.setLifecycleState(Lifecycle.State.RESUMED);
                            }
                        });
                    }
                    if (((BaseDialog) MessageDialog.this).autoShowInputKeyboard) {
                        DialogImpl.this.txtInput.postDelayed(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                EditText editText = DialogImpl.this.txtInput;
                                if (editText == null) {
                                    return;
                                }
                                editText.requestFocus();
                                DialogImpl.this.txtInput.setFocusableInTouchMode(true);
                                DialogImpl dialogImpl2 = DialogImpl.this;
                                MessageDialog.this.imeShow(dialogImpl2.txtInput, true);
                                EditText editText2 = DialogImpl.this.txtInput;
                                editText2.setSelection(editText2.getText().length());
                                InputInfo inputInfo = MessageDialog.this.inputInfo;
                                if (inputInfo == null || !inputInfo.isSelectAllText()) {
                                    return;
                                }
                                DialogImpl.this.txtInput.selectAll();
                            }
                        }, 300L);
                        return;
                    }
                    InputInfo inputInfo = MessageDialog.this.inputInfo;
                    if (inputInfo == null || !inputInfo.isSelectAllText()) {
                        return;
                    }
                    DialogImpl.this.txtInput.clearFocus();
                    DialogImpl.this.txtInput.requestFocus();
                    DialogImpl.this.txtInput.selectAll();
                }
            });
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.2
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    MessageDialog messageDialog3 = MessageDialog.this;
                    OnBackPressedListener<MessageDialog> onBackPressedListener = messageDialog3.onBackPressedListener;
                    if (onBackPressedListener != null) {
                        if (!onBackPressedListener.onBackPressed(messageDialog3.f4164me)) {
                            return true;
                        }
                        MessageDialog.this.dismiss();
                        return true;
                    }
                    if (!messageDialog3.isCancelable()) {
                        return true;
                    }
                    MessageDialog.this.dismiss();
                    return true;
                }
            });
            this.btnSelectPositive.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogImpl dialogImpl = DialogImpl.this;
                    MessageDialog messageDialog3 = MessageDialog.this;
                    messageDialog3.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.BUTTON_OK;
                    EditText editText = dialogImpl.txtInput;
                    if (editText != null) {
                        messageDialog3.imeShow(editText, false);
                    }
                    MessageDialog.this.haptic(view);
                    DialogImpl dialogImpl2 = DialogImpl.this;
                    MessageDialog messageDialog4 = MessageDialog.this;
                    BaseOnDialogClickCallback baseOnDialogClickCallback = messageDialog4.okButtonClickListener;
                    if (baseOnDialogClickCallback == null) {
                        dialogImpl2.doDismiss(view);
                        return;
                    }
                    if (baseOnDialogClickCallback instanceof OnInputDialogButtonClickListener) {
                        EditText editText2 = dialogImpl2.txtInput;
                        String string = editText2 == null ? "" : editText2.getText().toString();
                        MessageDialog messageDialog5 = MessageDialog.this;
                        if (((OnInputDialogButtonClickListener) messageDialog5.okButtonClickListener).onClick(messageDialog5.f4164me, view, string)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                        return;
                    }
                    if (baseOnDialogClickCallback instanceof OnDialogButtonClickListener) {
                        if (((OnDialogButtonClickListener) baseOnDialogClickCallback).onClick(messageDialog4.f4164me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    } else {
                        if (!(baseOnDialogClickCallback instanceof OnMenuButtonClickListener) || ((OnMenuButtonClickListener) baseOnDialogClickCallback).onClick(messageDialog4.f4164me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    }
                }
            });
            this.btnSelectNegative.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogImpl dialogImpl = DialogImpl.this;
                    MessageDialog messageDialog3 = MessageDialog.this;
                    messageDialog3.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.BUTTON_CANCEL;
                    EditText editText = dialogImpl.txtInput;
                    if (editText != null) {
                        messageDialog3.imeShow(editText, false);
                    }
                    MessageDialog.this.haptic(view);
                    DialogImpl dialogImpl2 = DialogImpl.this;
                    MessageDialog messageDialog4 = MessageDialog.this;
                    BaseOnDialogClickCallback baseOnDialogClickCallback = messageDialog4.cancelButtonClickListener;
                    if (baseOnDialogClickCallback == null) {
                        dialogImpl2.doDismiss(view);
                        return;
                    }
                    if (baseOnDialogClickCallback instanceof OnInputDialogButtonClickListener) {
                        EditText editText2 = dialogImpl2.txtInput;
                        String string = editText2 == null ? "" : editText2.getText().toString();
                        MessageDialog messageDialog5 = MessageDialog.this;
                        if (((OnInputDialogButtonClickListener) messageDialog5.cancelButtonClickListener).onClick(messageDialog5.f4164me, view, string)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                        return;
                    }
                    if (baseOnDialogClickCallback instanceof OnMenuButtonClickListener) {
                        if (((OnMenuButtonClickListener) baseOnDialogClickCallback).onClick(messageDialog4.f4164me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    } else {
                        if (((OnDialogButtonClickListener) baseOnDialogClickCallback).onClick(messageDialog4.f4164me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    }
                }
            });
            this.btnSelectOther.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogImpl dialogImpl = DialogImpl.this;
                    MessageDialog messageDialog3 = MessageDialog.this;
                    messageDialog3.buttonSelectResult = BaseDialog.BUTTON_SELECT_RESULT.BUTTON_OTHER;
                    EditText editText = dialogImpl.txtInput;
                    if (editText != null) {
                        messageDialog3.imeShow(editText, false);
                    }
                    MessageDialog.this.haptic(view);
                    DialogImpl dialogImpl2 = DialogImpl.this;
                    MessageDialog messageDialog4 = MessageDialog.this;
                    BaseOnDialogClickCallback baseOnDialogClickCallback = messageDialog4.otherButtonClickListener;
                    if (baseOnDialogClickCallback == null) {
                        dialogImpl2.doDismiss(view);
                        return;
                    }
                    if (baseOnDialogClickCallback instanceof OnInputDialogButtonClickListener) {
                        EditText editText2 = dialogImpl2.txtInput;
                        String string = editText2 == null ? "" : editText2.getText().toString();
                        MessageDialog messageDialog5 = MessageDialog.this;
                        if (((OnInputDialogButtonClickListener) messageDialog5.otherButtonClickListener).onClick(messageDialog5.f4164me, view, string)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                        return;
                    }
                    if (baseOnDialogClickCallback instanceof OnMenuButtonClickListener) {
                        if (((OnMenuButtonClickListener) baseOnDialogClickCallback).onClick(messageDialog4.f4164me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    } else {
                        if (((OnDialogButtonClickListener) baseOnDialogClickCallback).onClick(messageDialog4.f4164me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    }
                }
            });
            MessageDialog.this.onDialogInit();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v65, resolved type: android.view.View */
        /* JADX DEBUG: Multi-variable search result rejected for r0v70, resolved type: android.view.View */
        /* JADX DEBUG: Multi-variable search result rejected for r4v79, resolved type: android.view.View */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            TextView textView;
            TextView textView2;
            if (this.boxRoot == null || MessageDialog.this.getOwnActivity() == null) {
                return;
            }
            this.boxRoot.setAutoUnsafePlacePadding(MessageDialog.this.isEnableImmersiveMode());
            InputInfo inputInfo = MessageDialog.this.inputInfo;
            if (inputInfo != null && inputInfo.getBottomLineColor() != null) {
                this.txtInput.getBackground().mutate().setColorFilter(MessageDialog.this.inputInfo.getBottomLineColor().intValue(), PorterDuff.Mode.SRC_ATOP);
            }
            InputInfo inputInfo2 = MessageDialog.this.inputInfo;
            if (inputInfo2 != null && inputInfo2.getCursorColor() != null) {
                int iIntValue = MessageDialog.this.inputInfo.getCursorColor().intValue();
                if (Build.VERSION.SDK_INT < 29) {
                    try {
                        Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                        declaredField.setAccessible(true);
                        int i = declaredField.getInt(this.txtInput);
                        Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                        declaredField2.setAccessible(true);
                        Object obj = declaredField2.get(this.txtInput);
                        Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                        declaredField3.setAccessible(true);
                        Drawable[] drawableArr = {this.txtInput.getContext().getResources().getDrawable(i), this.txtInput.getContext().getResources().getDrawable(i)};
                        Drawable drawable = drawableArr[0];
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                        drawable.setColorFilter(iIntValue, mode);
                        drawableArr[1].setColorFilter(iIntValue, mode);
                        declaredField3.set(obj, drawableArr);
                    } catch (Throwable th) {
                        BaseDialog.log("DialogX: 在对话框" + MessageDialog.this.dialogKey() + "中设置光标颜色时发生错误！");
                        if (DialogX.DEBUGMODE) {
                            th.printStackTrace();
                        }
                    }
                } else if (this.txtInput.getTextCursorDrawable() != null) {
                    this.txtInput.getTextCursorDrawable().mutate().setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_ATOP));
                } else {
                    try {
                        Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                        declaredField4.setAccessible(true);
                        declaredField4.set(this.txtInput, Integer.valueOf(C2413R.drawable.rect_dialogx_defalut_edittxt_cursor));
                        this.txtInput.getTextCursorDrawable().mutate().setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_ATOP));
                    } catch (Throwable th2) {
                        BaseDialog.log("DialogX: 在对话框" + MessageDialog.this.dialogKey() + "中设置光标颜色时发生错误！");
                        if (DialogX.DEBUGMODE) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
            this.boxRoot.setRootPadding(((BaseDialog) MessageDialog.this).screenPaddings[0], ((BaseDialog) MessageDialog.this).screenPaddings[1], ((BaseDialog) MessageDialog.this).screenPaddings[2], ((BaseDialog) MessageDialog.this).screenPaddings[3]);
            if (((BaseDialog) MessageDialog.this).backgroundColor != null) {
                MessageDialog messageDialog = MessageDialog.this;
                messageDialog.tintColor(this.bkg, ((BaseDialog) messageDialog).backgroundColor.intValue());
                if (((BaseDialog) MessageDialog.this).style.tintButtonBackground()) {
                    MessageDialog messageDialog2 = MessageDialog.this;
                    messageDialog2.tintColor(this.btnSelectOther, ((BaseDialog) messageDialog2).backgroundColor.intValue());
                    MessageDialog messageDialog3 = MessageDialog.this;
                    messageDialog3.tintColor(this.btnSelectNegative, ((BaseDialog) messageDialog3).backgroundColor.intValue());
                    MessageDialog messageDialog4 = MessageDialog.this;
                    messageDialog4.tintColor(this.btnSelectPositive, ((BaseDialog) messageDialog4).backgroundColor.intValue());
                }
                if (this.blurViews != null) {
                    BaseDialog.log("#blurViews != null");
                    for (View view : this.blurViews) {
                        BaseDialog.log("#blurView: " + view);
                        ((BlurViewType) view).setOverlayColor(((BaseDialog) MessageDialog.this).backgroundColor);
                    }
                }
            }
            this.bkg.setMaxWidth(MessageDialog.this.getMaxWidth());
            this.bkg.setMaxHeight(MessageDialog.this.getMaxHeight());
            this.bkg.setMinimumWidth(MessageDialog.this.getMinWidth());
            this.bkg.setMinimumHeight(MessageDialog.this.getMinHeight());
            View viewFindViewWithTag = this.boxRoot.findViewWithTag("dialogx_editbox");
            if (MessageDialog.this.f4164me instanceof InputDialog) {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(0);
                }
                this.txtInput.setVisibility(0);
                this.boxRoot.bindFocusView(this.txtInput);
            } else {
                if (viewFindViewWithTag != null) {
                    viewFindViewWithTag.setVisibility(8);
                }
                this.txtInput.setVisibility(8);
            }
            this.boxRoot.setClickable(true);
            Integer num = MessageDialog.this.maskColor;
            if (num != null) {
                this.boxRoot.setBackgroundColor(num.intValue());
            }
            if (MessageDialog.this.backgroundRadius > -1.0f) {
                this.bkg.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.6
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view2, Outline outline) {
                        outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), MessageDialog.this.backgroundRadius);
                    }
                });
                this.bkg.setClipToOutline(true);
                List<View> list = this.blurViews;
                if (list != null) {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        ((BlurViewType) it.next()).setRadiusPx(Float.valueOf(MessageDialog.this.backgroundRadius));
                    }
                }
            }
            MessageDialog messageDialog5 = MessageDialog.this;
            TextView textView3 = this.txtDialogTitle;
            CharSequence charSequence = messageDialog5.title;
            if (charSequence == null) {
                charSequence = DialogX.defaultMessageDialogTitleText;
            }
            messageDialog5.showText(textView3, charSequence);
            MessageDialog messageDialog6 = MessageDialog.this;
            messageDialog6.showText(this.txtDialogTip, messageDialog6.message);
            MessageDialog messageDialog7 = MessageDialog.this;
            messageDialog7.showText(this.btnSelectPositive, messageDialog7.okText);
            MessageDialog messageDialog8 = MessageDialog.this;
            messageDialog8.showText(this.btnSelectNegative, messageDialog8.cancelText);
            MessageDialog messageDialog9 = MessageDialog.this;
            messageDialog9.showText(this.btnSelectOther, messageDialog9.otherText);
            this.txtInput.setText(MessageDialog.this.inputText);
            this.txtInput.setHint(MessageDialog.this.inputHintText);
            View view2 = this.spaceOtherButton;
            if (view2 != null) {
                if (MessageDialog.this.otherText == null) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(0);
                }
            }
            BaseDialog.useTextInfo(this.txtDialogTitle, MessageDialog.this.titleTextInfo);
            BaseDialog.useTextInfo(this.txtDialogTip, MessageDialog.this.messageTextInfo);
            BaseDialog.useTextInfo(this.btnSelectPositive, MessageDialog.this.okTextInfo);
            BaseDialog.useTextInfo(this.btnSelectNegative, MessageDialog.this.cancelTextInfo);
            BaseDialog.useTextInfo(this.btnSelectOther, MessageDialog.this.otherTextInfo);
            LinearLayout linearLayout = this.boxButton;
            if (linearLayout != null) {
                TextView textView4 = this.btnSelectNegative;
                linearLayout.setVisibility(((textView4 == null || textView4.getVisibility() != 0) && ((textView = this.btnSelectOther) == null || textView.getVisibility() != 0) && ((textView2 = this.btnSelectPositive) == null || textView2.getVisibility() != 0)) ? 8 : 0);
            }
            if (MessageDialog.this.titleIcon != null) {
                int textSize = (int) this.txtDialogTitle.getTextSize();
                MessageDialog.this.titleIcon.setBounds(0, 0, textSize, textSize);
                this.txtDialogTitle.setCompoundDrawablePadding(MessageDialog.this.dip2px(10.0f));
                this.txtDialogTitle.setCompoundDrawables(MessageDialog.this.titleIcon, null, null, null);
            }
            InputInfo inputInfo3 = MessageDialog.this.inputInfo;
            if (inputInfo3 != null) {
                int inputType = inputInfo3.getInputType();
                if (MessageDialog.this.inputInfo.getMAX_LENGTH() != -1) {
                    int i2 = inputType & 15;
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                        inputType = (inputType & (-16)) | 1;
                    }
                    this.txtInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessageDialog.this.inputInfo.getMAX_LENGTH())});
                }
                if (MessageDialog.this.inputInfo.isMultipleLines()) {
                    inputType |= 131072;
                }
                this.txtInput.setInputType(inputType);
                if (MessageDialog.this.inputInfo.getTextInfo() != null) {
                    BaseDialog.useTextInfo(this.txtInput, MessageDialog.this.inputInfo.getTextInfo());
                }
                if (MessageDialog.this.inputInfo.getInputFilters() != null && MessageDialog.this.inputInfo.getInputFilters().length > 0) {
                    this.txtInput.setFilters(MessageDialog.this.inputInfo.getInputFilters());
                }
            }
            int i3 = !BaseDialog.isNull(MessageDialog.this.okText) ? 1 : 0;
            if (!BaseDialog.isNull(MessageDialog.this.cancelText)) {
                i3++;
            }
            if (!BaseDialog.isNull(MessageDialog.this.otherText)) {
                i3++;
            }
            View view3 = this.splitHorizontal;
            if (view3 != null) {
                MessageDialog messageDialog10 = MessageDialog.this;
                view3.setBackgroundColor(messageDialog10.getColor(((BaseDialog) messageDialog10).style.splitColorRes(MessageDialog.this.isLightTheme())));
            }
            this.boxButton.setOrientation(MessageDialog.this.buttonOrientation);
            MessageDialog messageDialog11 = MessageDialog.this;
            if (messageDialog11.buttonOrientation == 1) {
                if (((BaseDialog) messageDialog11).style.verticalButtonOrder() != null && ((BaseDialog) MessageDialog.this).style.verticalButtonOrder().length != 0) {
                    this.boxButton.removeAllViews();
                    for (int i4 : ((BaseDialog) MessageDialog.this).style.verticalButtonOrder()) {
                        if (i4 == 1) {
                            this.boxButton.addView(this.btnSelectPositive);
                            if (((BaseDialog) MessageDialog.this).style.overrideVerticalButtonRes() != null) {
                                this.btnSelectPositive.setBackgroundResource(((BaseDialog) MessageDialog.this).style.overrideVerticalButtonRes().overrideVerticalOkButtonBackgroundRes(i3, MessageDialog.this.isLightTheme()));
                            }
                        } else if (i4 == 2) {
                            this.boxButton.addView(this.btnSelectNegative);
                            if (((BaseDialog) MessageDialog.this).style.overrideVerticalButtonRes() != null) {
                                this.btnSelectNegative.setBackgroundResource(((BaseDialog) MessageDialog.this).style.overrideVerticalButtonRes().overrideVerticalCancelButtonBackgroundRes(i3, MessageDialog.this.isLightTheme()));
                            }
                        } else if (i4 == 3) {
                            this.boxButton.addView(this.btnSelectOther);
                            if (((BaseDialog) MessageDialog.this).style.overrideVerticalButtonRes() != null) {
                                this.btnSelectOther.setBackgroundResource(((BaseDialog) MessageDialog.this).style.overrideVerticalButtonRes().overrideVerticalOtherButtonBackgroundRes(i3, MessageDialog.this.isLightTheme()));
                            }
                        } else if (i4 == 4) {
                            Space space = new Space(MessageDialog.this.getOwnActivity());
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            layoutParams.weight = 1.0f;
                            this.boxButton.addView(space, layoutParams);
                        } else if (i4 == 5) {
                            View view4 = new View(MessageDialog.this.getOwnActivity());
                            view4.setBackgroundColor(MessageDialog.this.getResources().getColor(((BaseDialog) MessageDialog.this).style.splitColorRes(MessageDialog.this.isLightTheme())));
                            this.boxButton.addView(view4, new LinearLayout.LayoutParams(-1, ((BaseDialog) MessageDialog.this).style.splitWidthPx()));
                        }
                    }
                }
            } else if (((BaseDialog) messageDialog11).style.horizontalButtonOrder() != null && ((BaseDialog) MessageDialog.this).style.horizontalButtonOrder().length != 0) {
                this.boxButton.removeAllViews();
                for (int i5 : ((BaseDialog) MessageDialog.this).style.horizontalButtonOrder()) {
                    if (i5 == 1) {
                        this.boxButton.addView(this.btnSelectPositive);
                        if (((BaseDialog) MessageDialog.this).style.overrideHorizontalButtonRes() != null) {
                            this.btnSelectPositive.setBackgroundResource(((BaseDialog) MessageDialog.this).style.overrideHorizontalButtonRes().overrideHorizontalOkButtonBackgroundRes(i3, MessageDialog.this.isLightTheme()));
                        }
                    } else if (i5 == 2) {
                        this.boxButton.addView(this.btnSelectNegative);
                        if (((BaseDialog) MessageDialog.this).style.overrideHorizontalButtonRes() != null) {
                            this.btnSelectNegative.setBackgroundResource(((BaseDialog) MessageDialog.this).style.overrideHorizontalButtonRes().overrideHorizontalCancelButtonBackgroundRes(i3, MessageDialog.this.isLightTheme()));
                        }
                    } else if (i5 == 3) {
                        this.boxButton.addView(this.btnSelectOther);
                        if (((BaseDialog) MessageDialog.this).style.overrideHorizontalButtonRes() != null) {
                            this.btnSelectOther.setBackgroundResource(((BaseDialog) MessageDialog.this).style.overrideHorizontalButtonRes().overrideHorizontalOtherButtonBackgroundRes(i3, MessageDialog.this.isLightTheme()));
                        }
                    } else if (i5 != 4) {
                        if (i5 == 5 && this.boxButton.getChildCount() >= 1) {
                            LinearLayout linearLayout2 = this.boxButton;
                            if (linearLayout2.getChildAt(linearLayout2.getChildCount() - 1).getVisibility() != 8) {
                                View view5 = new View(MessageDialog.this.getOwnActivity());
                                view5.setBackgroundColor(MessageDialog.this.getResources().getColor(((BaseDialog) MessageDialog.this).style.splitColorRes(MessageDialog.this.isLightTheme())));
                                this.boxButton.addView(view5, new LinearLayout.LayoutParams(((BaseDialog) MessageDialog.this).style.splitWidthPx(), -1));
                            }
                        }
                    } else if (this.boxButton.getChildCount() >= 1) {
                        LinearLayout linearLayout3 = this.boxButton;
                        if (linearLayout3.getChildAt(linearLayout3.getChildCount() - 1).getVisibility() != 8) {
                            Space space2 = new Space(MessageDialog.this.getOwnActivity());
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams2.weight = 1.0f;
                            this.boxButton.addView(space2, layoutParams2);
                        }
                    }
                }
            }
            MessageDialog messageDialog12 = MessageDialog.this;
            if (!messageDialog12.bkgInterceptTouch) {
                this.boxRoot.setClickable(false);
            } else if (messageDialog12.isCancelable()) {
                this.boxRoot.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view6) {
                        MessageDialog messageDialog13 = MessageDialog.this;
                        OnBackgroundMaskClickListener<MessageDialog> onBackgroundMaskClickListener = messageDialog13.onBackgroundMaskClickListener;
                        if (onBackgroundMaskClickListener == null || !onBackgroundMaskClickListener.onClick(messageDialog13.f4164me, view6)) {
                            DialogImpl.this.doDismiss(view6);
                        }
                    }
                });
            } else {
                this.boxRoot.setOnClickListener(null);
            }
            OnBindView<MessageDialog> onBindView = MessageDialog.this.onBindView;
            if (onBindView == null || onBindView.getCustomView() == null) {
                this.boxCustom.setVisibility(8);
            } else {
                MessageDialog messageDialog13 = MessageDialog.this;
                messageDialog13.onBindView.bindParent(this.boxCustom, messageDialog13.f4164me);
                this.boxCustom.setVisibility(0);
                if (MessageDialog.this.onBindView.getCustomView() instanceof ScrollController) {
                    ScrollController scrollController = this.scrollView;
                    if (scrollController instanceof DialogScrollView) {
                        ((DialogScrollView) scrollController).setVerticalScrollBarEnabled(false);
                    }
                    this.scrollView = (ScrollController) MessageDialog.this.onBindView.getCustomView();
                } else {
                    View viewFindViewWithTag2 = MessageDialog.this.onBindView.getCustomView().findViewWithTag("ScrollController");
                    if (viewFindViewWithTag2 instanceof ScrollController) {
                        ScrollController scrollController2 = this.scrollView;
                        if (scrollController2 instanceof DialogScrollView) {
                            ((DialogScrollView) scrollController2).setVerticalScrollBarEnabled(false);
                        }
                        this.scrollView = (ScrollController) viewFindViewWithTag2;
                    }
                }
            }
            MessageDialog.this.onDialogRefreshUI();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MessageDialog build() {
        return new MessageDialog();
    }

    public MessageDialog appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    public MessageDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public MessageDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public MessageDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    public MessageDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public void dismiss() {
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.2
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = MessageDialog.this.dialogImpl;
                if (dialogImpl == null) {
                    return;
                }
                dialogImpl.doDismiss(dialogImpl.bkg);
            }
        });
    }

    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    public int getButtonOrientation() {
        return this.buttonOrientation;
    }

    public BaseDialog.BUTTON_SELECT_RESULT getButtonSelectResult() {
        return this.buttonSelectResult;
    }

    public CharSequence getCancelButton() {
        return this.cancelText;
    }

    public OnDialogButtonClickListener<MessageDialog> getCancelButtonClickListener() {
        return (OnDialogButtonClickListener) this.cancelButtonClickListener;
    }

    public TextInfo getCancelTextInfo() {
        return this.cancelTextInfo;
    }

    public View getCustomView() {
        OnBindView<MessageDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    public DialogLifecycleCallback<MessageDialog> getDialogLifecycleCallback() {
        DialogLifecycleCallback<MessageDialog> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<MessageDialog>() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.3
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<MessageDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public String getInputText() {
        EditText editText = this.dialogImpl.txtInput;
        return editText != null ? editText.getText().toString() : "";
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

    public OnDialogButtonClickListener<MessageDialog> getOkButtonClickListener() {
        return (OnDialogButtonClickListener) this.okButtonClickListener;
    }

    public TextInfo getOkTextInfo() {
        return this.okTextInfo;
    }

    public OnBackPressedListener<MessageDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    public OnBackgroundMaskClickListener<MessageDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public CharSequence getOtherButton() {
        return this.otherText;
    }

    public OnDialogButtonClickListener<MessageDialog> getOtherButtonClickListener() {
        return (OnDialogButtonClickListener) this.otherButtonClickListener;
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
            getDialogImpl().getDialogXAnimImpl().doExitAnim(this.f4164me, getDialogImpl().bkg);
            BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.4
                @Override // java.lang.Runnable
                public void run() {
                    if (MessageDialog.this.getDialogView() != null) {
                        MessageDialog.this.getDialogView().setVisibility(8);
                    }
                }
            }, getDialogImpl().getExitAnimationDuration(null));
        }
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
    public void onDismiss(MessageDialog messageDialog) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onShow(MessageDialog messageDialog) {
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.MessageDialog.1
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = MessageDialog.this.dialogImpl;
                if (dialogImpl != null) {
                    dialogImpl.refreshView();
                }
            }
        });
    }

    public MessageDialog removeCustomView() {
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
        int customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : this.style.layout(isLightTheme());
        if (customDialogLayoutResId == 0) {
            customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_material : C2413R.layout.layout_dialogx_material_dark;
        }
        this.enterAnimDuration = 0L;
        View viewCreateView = createView(customDialogLayoutResId);
        this.dialogImpl = new DialogImpl(viewCreateView);
        if (viewCreateView != null) {
            viewCreateView.setTag(this.f4164me);
        }
        BaseDialog.show(viewCreateView);
    }

    public MessageDialog setActionRunnable(int i, DialogXRunnable<MessageDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public MessageDialog setAnimResId(int i, int i2) {
        this.customEnterAnimResId = i;
        this.customExitAnimResId = i2;
        return this;
    }

    public MessageDialog setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public MessageDialog setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    public MessageDialog setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    public MessageDialog setButtonOrientation(int i) {
        this.buttonOrientation = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setCancelButton(CharSequence charSequence) {
        this.cancelText = charSequence;
        refreshUI();
        return this;
    }

    public MessageDialog setCancelButtonClickListener(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.cancelButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public MessageDialog setCancelTextInfo(TextInfo textInfo) {
        this.cancelTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public MessageDialog setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public MessageDialog setCustomView(OnBindView<MessageDialog> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public MessageDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public MessageDialog setDialogLifecycleCallback(DialogLifecycleCallback<MessageDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4164me);
        }
        return this;
    }

    public MessageDialog setDialogXAnimImpl(DialogXAnimInterface<MessageDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public MessageDialog setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    public MessageDialog setEnterAnimResId(int i) {
        this.customEnterAnimResId = i;
        return this;
    }

    public MessageDialog setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    public MessageDialog setExitAnimResId(int i) {
        this.customExitAnimResId = i;
        return this;
    }

    public MessageDialog setHapticFeedbackEnabled(boolean z) {
        this.isHapticFeedbackEnabled = z ? 1 : 0;
        return this;
    }

    public MessageDialog setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public MessageDialog setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    public MessageDialog setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setMessage(CharSequence charSequence) {
        this.message = charSequence;
        refreshUI();
        return this;
    }

    public MessageDialog setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public MessageDialog setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    public MessageDialog setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setOkButton(CharSequence charSequence) {
        this.okText = charSequence;
        refreshUI();
        return this;
    }

    public MessageDialog setOkButtonClickListener(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.okButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public MessageDialog setOkTextInfo(TextInfo textInfo) {
        this.okTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public MessageDialog setOnBackPressedListener(OnBackPressedListener<MessageDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        return this;
    }

    public MessageDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<MessageDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setOtherButton(CharSequence charSequence) {
        this.otherText = charSequence;
        refreshUI();
        return this;
    }

    public MessageDialog setOtherButtonClickListener(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.otherButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public MessageDialog setOtherTextInfo(TextInfo textInfo) {
        this.otherTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public MessageDialog setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public MessageDialog setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public MessageDialog setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setTitle(CharSequence charSequence) {
        this.title = charSequence;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MessageDialog setTitleIcon(Bitmap bitmap) {
        this.titleIcon = new BitmapDrawable(getResources(), bitmap);
        refreshUI();
        return this;
    }

    public MessageDialog setTitleTextInfo(TextInfo textInfo) {
        this.titleTextInfo = textInfo;
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static MessageDialog build(DialogXStyle dialogXStyle) {
        return new MessageDialog().setStyle(dialogXStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static MessageDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        MessageDialog messageDialog = new MessageDialog(charSequence, charSequence2, charSequence3);
        messageDialog.show();
        return messageDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MessageDialog onDismiss(DialogXRunnable<MessageDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MessageDialog onShow(DialogXRunnable<MessageDialog> dialogXRunnable) {
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
    public MessageDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public MessageDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public MessageDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public static MessageDialog build(OnBindView<MessageDialog> onBindView) {
        return new MessageDialog().setCustomView(onBindView);
    }

    public MessageDialog setCancelButton(int i) {
        this.cancelText = getString(i);
        refreshUI();
        return this;
    }

    public MessageDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public MessageDialog setMessage(int i) {
        this.message = getString(i);
        refreshUI();
        return this;
    }

    public MessageDialog setOkButton(int i) {
        this.okText = getString(i);
        refreshUI();
        return this;
    }

    public MessageDialog setOtherButton(int i) {
        this.otherText = getString(i);
        refreshUI();
        return this;
    }

    public MessageDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public MessageDialog setTitle(int i) {
        this.title = getString(i);
        refreshUI();
        return this;
    }

    public MessageDialog setTitleIcon(int i) {
        this.titleIcon = getResources().getDrawable(i);
        refreshUI();
        return this;
    }

    public static MessageDialog show(int i, int i2, int i3) {
        MessageDialog messageDialog = new MessageDialog(i, i2, i3);
        messageDialog.show();
        return messageDialog;
    }

    public MessageDialog setCancelButton(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.cancelButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public MessageDialog setOkButton(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.okButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public MessageDialog setOtherButton(OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.otherButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public MessageDialog setTitleIcon(Drawable drawable) {
        this.titleIcon = drawable;
        refreshUI();
        return this;
    }

    public static MessageDialog show(CharSequence charSequence, CharSequence charSequence2) {
        MessageDialog messageDialog = new MessageDialog(charSequence, charSequence2);
        messageDialog.show();
        return messageDialog;
    }

    public MessageDialog setCancelButton(CharSequence charSequence, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.cancelText = charSequence;
        this.cancelButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public MessageDialog setOkButton(CharSequence charSequence, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.okText = charSequence;
        this.okButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public MessageDialog setOtherButton(CharSequence charSequence, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.otherText = charSequence;
        this.otherButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public MessageDialog(CharSequence charSequence) {
        this.message = charSequence;
    }

    public static MessageDialog show(int i, int i2) {
        MessageDialog messageDialog = new MessageDialog(i, i2);
        messageDialog.show();
        return messageDialog;
    }

    public MessageDialog setCancelButton(int i, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.cancelText = getString(i);
        this.cancelButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public MessageDialog setOkButton(int i, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.okText = getString(i);
        this.okButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public MessageDialog setOtherButton(int i, OnDialogButtonClickListener<MessageDialog> onDialogButtonClickListener) {
        this.otherText = getString(i);
        this.otherButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public static MessageDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        MessageDialog messageDialog = new MessageDialog(charSequence, charSequence2, charSequence3, charSequence4);
        messageDialog.show();
        return messageDialog;
    }

    public static MessageDialog show(int i, int i2, int i3, int i4) {
        MessageDialog messageDialog = new MessageDialog(i, i2, i3, i4);
        messageDialog.show();
        return messageDialog;
    }

    public MessageDialog(CharSequence charSequence, CharSequence charSequence2) {
        this.title = charSequence;
        this.message = charSequence2;
    }

    public static MessageDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        MessageDialog messageDialog = new MessageDialog(charSequence, charSequence2, charSequence3, charSequence4, charSequence5);
        messageDialog.show();
        return messageDialog;
    }

    public static MessageDialog show(int i, int i2, int i3, int i4, int i5) {
        MessageDialog messageDialog = new MessageDialog(i, i2, i3, i4, i5);
        messageDialog.show();
        return messageDialog;
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public MessageDialog show() {
        if (this.isHide && getDialogView() != null && this.isShow) {
            if (this.hideWithExitAnim && getDialogImpl() != null) {
                getDialogView().setVisibility(0);
                getDialogImpl().getDialogXAnimImpl().doShowAnim(this.f4164me, getDialogImpl().bkg);
            } else {
                getDialogView().setVisibility(0);
            }
            return this;
        }
        super.beforeShow();
        if (getDialogView() == null) {
            int customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : this.style.layout(isLightTheme());
            if (customDialogLayoutResId == 0) {
                customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_material : C2413R.layout.layout_dialogx_material_dark;
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4164me);
            }
            BaseDialog.show(viewCreateView);
        } else {
            BaseDialog.show(getDialogView());
        }
        return this;
    }

    public MessageDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
    }

    public MessageDialog(int i, int i2, int i3) {
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
    }

    public void show(Activity activity) {
        super.beforeShow();
        if (getDialogView() == null) {
            int customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : this.style.layout(isLightTheme());
            if (customDialogLayoutResId == 0) {
                customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_material : C2413R.layout.layout_dialogx_material_dark;
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4164me);
            }
            BaseDialog.show(activity, viewCreateView);
            return;
        }
        BaseDialog.show(activity, getDialogView());
    }

    public MessageDialog(int i, int i2) {
        this.title = getString(i);
        this.message = getString(i2);
    }

    public MessageDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
    }

    public MessageDialog(int i, int i2, int i3, int i4) {
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.cancelText = getString(i4);
    }

    public MessageDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
        this.otherText = charSequence5;
    }

    public MessageDialog(int i, int i2, int i3, int i4, int i5) {
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.cancelText = getString(i4);
        this.otherText = getString(i5);
    }
}
