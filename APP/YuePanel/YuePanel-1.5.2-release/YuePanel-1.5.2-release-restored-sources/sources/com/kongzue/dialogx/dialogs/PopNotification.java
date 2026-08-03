package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC6490;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C8973;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.PopNotification;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.BlurViewType;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.NoTouchInterface;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener;
import com.kongzue.dialogx.interfaces.PopMoveDisplacementInterceptor;
import com.kongzue.dialogx.util.PopValueAnimator;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class PopNotification extends BaseDialog implements NoTouchInterface {
    public static final int TIME_NO_AUTO_DISMISS_DELAY = -1;
    public static int maxShowCount = Integer.MAX_VALUE;
    public static PopMoveDisplacementInterceptor<PopNotification> moveDisplacementInterceptor = null;
    public static int overrideEnterAnimRes = 0;
    public static long overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static long overrideExitDuration = -1;
    protected static List<PopNotification> popNotificationList;
    protected DialogXStyle.PopNotificationSettings.ALIGN align;
    protected Timer autoDismissTimer;
    protected CharSequence buttonText;
    private float defaultTop;
    protected DialogImpl dialogImpl;
    protected DialogLifecycleCallback<PopNotification> dialogLifecycleCallback;
    protected DialogXAnimInterface<PopNotification> dialogXAnimImpl;
    protected Bitmap iconBitmap;
    protected Drawable iconDrawable;
    protected int iconResId;
    protected int iconSize;
    protected CharSequence message;
    protected TextInfo messageTextInfo;
    protected OnBindView<PopNotification> onBindView;
    protected OnDialogButtonClickListener<PopNotification> onButtonClickListener;
    protected OnDialogButtonClickListener<PopNotification> onPopNotificationClickListener;
    protected BaseDialog.BOOLEAN tintIcon;
    protected CharSequence title;
    protected TextInfo titleTextInfo;

    /* JADX INFO: renamed from: me */
    protected PopNotification f4167me = this;
    protected int enterAnimResId = 0;
    protected int exitAnimResId = 0;
    protected boolean autoTintIconInLightOrDarkMode = true;
    protected float backgroundRadius = DialogX.defaultPopNotificationBackgroundRadius;
    protected boolean slideToClose = true;
    protected TextInfo buttonTextInfo = new TextInfo().setBold(true);
    protected int[] bodyMargin = {-1, -1, -1, -1};
    protected long autoDismissDelay = Long.MIN_VALUE;
    protected boolean preRecycle = false;

    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.PopNotification$7 */
    public static /* synthetic */ class C25057 {

        /* JADX INFO: renamed from: $SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopNotificationSettings$ALIGN */
        static final /* synthetic */ int[] f4168x81ac079;

        static {
            int[] iArr = new int[DialogXStyle.PopNotificationSettings.ALIGN.values().length];
            f4168x81ac079 = iArr;
            try {
                iArr[DialogXStyle.PopNotificationSettings.ALIGN.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4168x81ac079[DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4168x81ac079[DialogXStyle.PopNotificationSettings.ALIGN.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4168x81ac079[DialogXStyle.PopNotificationSettings.ALIGN.TOP_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4168x81ac079[DialogXStyle.PopNotificationSettings.ALIGN.BOTTOM_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class DialogImpl implements DialogConvertViewInterface {
        private List<View> blurViews;
        public ViewGroup boxBody;
        public RelativeLayout boxCustom;
        public DialogXBaseRelativeLayout boxRoot;
        public ImageView imgDialogxPopIcon;
        public TextView txtDialogxButton;
        public TextView txtDialogxPopMessage;
        public TextView txtDialogxPopTitle;

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            PopNotification.this.setDialogView(view);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.boxBody = (ViewGroup) view.findViewById(C2413R.id.box_body);
            this.imgDialogxPopIcon = (ImageView) view.findViewById(C2413R.id.img_dialogx_pop_icon);
            this.txtDialogxPopTitle = (TextView) view.findViewById(C2413R.id.txt_dialogx_pop_title);
            this.txtDialogxPopMessage = (TextView) view.findViewById(C2413R.id.txt_dialogx_pop_message);
            this.txtDialogxButton = (TextView) view.findViewById(C2413R.id.txt_dialogx_button);
            this.boxCustom = (RelativeLayout) view.findViewById(C2413R.id.box_custom);
            this.blurViews = PopNotification.this.findAllBlurView(view);
            init();
            PopNotification.this.dialogImpl = this;
            refreshView();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(View view) {
            BaseDialog baseDialog = PopNotification.this;
            if (baseDialog.preDismiss(baseDialog)) {
                return;
            }
            if (view != null) {
                view.setEnabled(false);
            }
            if (((BaseDialog) PopNotification.this).dismissAnimFlag || this.boxRoot == null) {
                return;
            }
            ((BaseDialog) PopNotification.this).dismissAnimFlag = true;
            this.boxCustom.setVisibility(8);
            this.boxBody.setFocusable(false);
            this.boxBody.setClickable(false);
            this.boxBody.setOnTouchListener(new View.OnTouchListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.9
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            this.txtDialogxButton.setFocusable(false);
            this.txtDialogxButton.setClickable(false);
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.10
                @Override // java.lang.Runnable
                public void run() {
                    DialogXAnimInterface<PopNotification> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doExitAnim(PopNotification.this.f4167me, dialogImpl.boxBody);
                    PopNotification.this.preRecycle = true;
                    BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PopNotification.this.waitForDismiss();
                        }
                    }, DialogImpl.this.getExitAnimationDuration(null));
                    List<PopNotification> list = PopNotification.popNotificationList;
                    if (list != null) {
                        int iIndexOf = list.indexOf(PopNotification.this.f4167me);
                        for (int i = 0; i < iIndexOf; i++) {
                            PopNotification.popNotificationList.get(i).moveFront(DialogImpl.this.boxBody.getHeight());
                        }
                    }
                }
            });
        }

        public DialogXAnimInterface<PopNotification> getDialogXAnimImpl() {
            PopNotification popNotification = PopNotification.this;
            if (popNotification.dialogXAnimImpl == null) {
                popNotification.dialogXAnimImpl = new DialogXAnimInterface<PopNotification>() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.11
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(PopNotification popNotification2, ViewGroup viewGroup) {
                        Context context = BaseDialog.getApplicationContext() == null ? DialogImpl.this.boxRoot.getContext() : BaseDialog.getApplicationContext();
                        int i = PopNotification.this.exitAnimResId;
                        if (i == 0) {
                            i = C2413R.anim.anim_dialogx_notification_exit;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        long exitAnimationDuration = DialogImpl.this.getExitAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setDuration(exitAnimationDuration);
                        animationLoadAnimation.setFillAfter(true);
                        DialogImpl.this.boxBody.startAnimation(animationLoadAnimation);
                        DialogImpl.this.boxRoot.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(exitAnimationDuration);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doShowAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doShowAnim(PopNotification popNotification2, ViewGroup viewGroup) {
                        Context applicationContext = BaseDialog.getApplicationContext();
                        int i = PopNotification.this.enterAnimResId;
                        if (i == 0) {
                            i = C2413R.anim.anim_dialogx_notification_enter;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(applicationContext, i);
                        long enterAnimationDuration = DialogImpl.this.getEnterAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                        animationLoadAnimation.setDuration(enterAnimationDuration);
                        animationLoadAnimation.setFillAfter(true);
                        DialogImpl.this.boxBody.startAnimation(animationLoadAnimation);
                        DialogImpl.this.boxRoot.animate().setDuration(enterAnimationDuration).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                    }
                };
            }
            return PopNotification.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxBody.getAnimation() != null) {
                animation = this.boxBody.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            long j = PopNotification.overrideEnterDuration;
            if (j >= 0) {
                duration = j;
            }
            return ((BaseDialog) PopNotification.this).enterAnimDuration >= 0 ? ((BaseDialog) PopNotification.this).enterAnimDuration : duration;
        }

        public long getExitAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxBody.getAnimation() != null) {
                animation = this.boxBody.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            long j = PopNotification.overrideExitDuration;
            if (j >= 0) {
                duration = j;
            }
            return ((BaseDialog) PopNotification.this).exitAnimDuration != -1 ? ((BaseDialog) PopNotification.this).exitAnimDuration : duration;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            PopNotification popNotification = PopNotification.this;
            if (popNotification.titleTextInfo == null) {
                popNotification.titleTextInfo = DialogX.titleTextInfo;
            }
            if (popNotification.messageTextInfo == null) {
                popNotification.messageTextInfo = DialogX.messageTextInfo;
            }
            if (popNotification.buttonTextInfo == null) {
                popNotification.buttonTextInfo = DialogX.buttonTextInfo;
            }
            if (((BaseDialog) popNotification).backgroundColor == null) {
                ((BaseDialog) PopNotification.this).backgroundColor = DialogX.backgroundColor;
            }
            PopNotification.this.getDialogView().setTranslationZ(PopNotification.this.getThisOrderIndex());
            PopNotification popNotification2 = PopNotification.this;
            if (popNotification2.autoDismissTimer == null) {
                popNotification2.showShort();
            }
            this.boxRoot.setClickable(false);
            this.boxRoot.setFocusable(false);
            this.boxRoot.setParentDialog(PopNotification.this.f4167me);
            this.boxRoot.setAutoUnsafePlacePadding(false);
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    List<PopNotification> list = PopNotification.popNotificationList;
                    if (list != null) {
                        list.remove(PopNotification.this);
                        if (PopNotification.popNotificationList.isEmpty()) {
                            PopNotification.popNotificationList = null;
                        }
                    }
                    Timer timer = PopNotification.this.autoDismissTimer;
                    if (timer != null) {
                        timer.cancel();
                    }
                    ((BaseDialog) PopNotification.this).isShow = false;
                    PopNotification.this.getDialogLifecycleCallback().onDismiss(PopNotification.this.f4167me);
                    PopNotification popNotification3 = PopNotification.this;
                    popNotification3.onDismiss(popNotification3.f4167me);
                    PopNotification.this.setLifecycleState(Lifecycle.State.DESTROYED);
                    PopNotification.this.dialogImpl = null;
                    BaseDialog.m5092gc();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) PopNotification.this).isShow = true;
                    ((BaseDialog) PopNotification.this).preShow = false;
                    PopNotification.this.setLifecycleState(Lifecycle.State.CREATED);
                    DialogImpl.this.boxRoot.setAlpha(0.0f);
                    PopNotification.this.onDialogShow();
                    PopNotification.this.getDialogLifecycleCallback().onShow(PopNotification.this.f4167me);
                    PopNotification popNotification3 = PopNotification.this;
                    popNotification3.onShow(popNotification3.f4167me);
                }
            });
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.boxBody.getLayoutParams();
            PopNotification popNotification3 = PopNotification.this;
            if (popNotification3.align == null) {
                popNotification3.align = DialogXStyle.PopNotificationSettings.ALIGN.TOP;
            }
            int i = C25057.f4168x81ac079[popNotification3.align.ordinal()];
            if (i == 1) {
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
            } else if (i == 2) {
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
                this.boxRoot.setAutoUnsafePlacePadding(true);
            } else if (i == 3) {
                layoutParams.removeRule(10);
                layoutParams.removeRule(12);
                layoutParams.addRule(13);
            }
            this.boxBody.setLayoutParams(layoutParams);
            this.boxRoot.setOnSafeInsetsChangeListener(new OnSafeInsetsChangeListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.2
                @Override // com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener
                public void onChange(Rect rect) {
                    float f;
                    DialogImpl dialogImpl = DialogImpl.this;
                    PopNotification popNotification4 = PopNotification.this;
                    DialogXStyle.PopNotificationSettings.ALIGN align = popNotification4.align;
                    if (align != DialogXStyle.PopNotificationSettings.ALIGN.TOP) {
                        if (align == DialogXStyle.PopNotificationSettings.ALIGN.TOP_INSIDE) {
                            dialogImpl.boxBody.setPadding(0, rect.top, 0, 0);
                        }
                    } else {
                        ViewGroup viewGroup = dialogImpl.boxBody;
                        if (popNotification4.defaultTop <= 0.0f) {
                            f = PopNotification.this.defaultTop = rect.top + r1.bodyMargin[1];
                        } else {
                            f = PopNotification.this.defaultTop;
                        }
                        viewGroup.setY(f);
                    }
                }
            });
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.3
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    return false;
                }
            });
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    Integer colorNullable;
                    Float floatStyleAttr;
                    DialogXAnimInterface<PopNotification> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doShowAnim(PopNotification.this.f4167me, dialogImpl.boxBody);
                    if (!DialogX.onlyOnePopNotification && PopNotification.popNotificationList != null) {
                        for (int i2 = 0; i2 < PopNotification.popNotificationList.size() - 1; i2++) {
                            PopNotification.popNotificationList.get(i2).moveBack(DialogImpl.this.boxBody.getHeight());
                        }
                    }
                    if (PopNotification.this.getStyle().popNotificationSettings() == null || PopNotification.this.getStyle().popNotificationSettings().blurBackgroundSettings() == null || !PopNotification.this.getStyle().popNotificationSettings().blurBackgroundSettings().blurBackground()) {
                        colorNullable = null;
                        floatStyleAttr = null;
                    } else {
                        if (((BaseDialog) PopNotification.this).backgroundColor == null) {
                            PopNotification popNotification4 = PopNotification.this;
                            colorNullable = popNotification4.getColorNullable(popNotification4.getIntStyleAttr(Integer.valueOf(popNotification4.getStyle().popNotificationSettings().blurBackgroundSettings().blurForwardColorRes(PopNotification.this.isLightTheme()))));
                        } else {
                            colorNullable = ((BaseDialog) PopNotification.this).backgroundColor;
                        }
                        floatStyleAttr = PopNotification.this.getFloatStyleAttr(Float.valueOf(r1.getStyle().popNotificationSettings().blurBackgroundSettings().blurBackgroundRoundRadiusPx()));
                    }
                    if (DialogImpl.this.blurViews != null) {
                        Iterator it = DialogImpl.this.blurViews.iterator();
                        while (it.hasNext()) {
                            BlurViewType blurViewType = (BlurViewType) ((View) it.next());
                            blurViewType.setOverlayColor(((BaseDialog) PopNotification.this).backgroundColor == null ? colorNullable : ((BaseDialog) PopNotification.this).backgroundColor);
                            blurViewType.setRadiusPx(floatStyleAttr);
                        }
                    }
                    PopNotification.this.setLifecycleState(Lifecycle.State.RESUMED);
                }
            });
            this.boxBody.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (((BaseDialog) PopNotification.this).dismissAnimFlag) {
                        BaseDialog.log("skip click @ A");
                        return;
                    }
                    PopNotification.this.haptic(view);
                    PopNotification popNotification4 = PopNotification.this;
                    OnDialogButtonClickListener<PopNotification> onDialogButtonClickListener = popNotification4.onPopNotificationClickListener;
                    if (onDialogButtonClickListener == null) {
                        popNotification4.dismiss();
                    } else {
                        if (onDialogButtonClickListener.onClick(popNotification4.f4167me, view)) {
                            return;
                        }
                        PopNotification.this.dismiss();
                    }
                }
            });
            this.txtDialogxButton.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (((BaseDialog) PopNotification.this).dismissAnimFlag) {
                        return;
                    }
                    PopNotification.this.haptic(view);
                    DialogImpl dialogImpl = DialogImpl.this;
                    PopNotification popNotification4 = PopNotification.this;
                    OnDialogButtonClickListener<PopNotification> onDialogButtonClickListener = popNotification4.onButtonClickListener;
                    if (onDialogButtonClickListener == null) {
                        dialogImpl.doDismiss(view);
                    } else {
                        if (onDialogButtonClickListener.onClick(popNotification4.f4167me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    }
                }
            });
            PopNotification.this.onDialogInit();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            GradientDrawable gradientDrawable;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.boxRoot;
            if (dialogXBaseRelativeLayout == null) {
                return;
            }
            dialogXBaseRelativeLayout.setRootPadding(((BaseDialog) PopNotification.this).screenPaddings[0], ((BaseDialog) PopNotification.this).screenPaddings[1], ((BaseDialog) PopNotification.this).screenPaddings[2], ((BaseDialog) PopNotification.this).screenPaddings[3]);
            if (((BaseDialog) PopNotification.this).backgroundColor != null) {
                PopNotification popNotification = PopNotification.this;
                popNotification.tintColor(this.boxBody, ((BaseDialog) popNotification).backgroundColor.intValue());
                List<View> list = this.blurViews;
                if (list != null) {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        ((BlurViewType) ((View) it.next())).setOverlayColor(((BaseDialog) PopNotification.this).backgroundColor);
                    }
                }
            }
            OnBindView<PopNotification> onBindView = PopNotification.this.onBindView;
            if (onBindView == null || onBindView.getCustomView() == null) {
                this.boxCustom.setVisibility(8);
            } else {
                PopNotification popNotification2 = PopNotification.this;
                popNotification2.onBindView.bindParent(this.boxCustom, popNotification2.f4167me);
                this.boxCustom.setVisibility(0);
            }
            if (PopNotification.this.backgroundRadius > -1.0f) {
                if ((this.boxBody.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) this.boxBody.getBackground()) != null) {
                    gradientDrawable.setCornerRadius(PopNotification.this.backgroundRadius);
                }
                this.boxBody.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.7
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), PopNotification.this.backgroundRadius);
                    }
                });
                this.boxBody.setClipToOutline(true);
                List<View> list2 = this.blurViews;
                if (list2 != null) {
                    Iterator<View> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((BlurViewType) ((View) it2.next())).setRadiusPx(Float.valueOf(PopNotification.this.backgroundRadius));
                    }
                }
            }
            PopNotification popNotification3 = PopNotification.this;
            popNotification3.showText(this.txtDialogxPopTitle, popNotification3.title);
            PopNotification popNotification4 = PopNotification.this;
            popNotification4.showText(this.txtDialogxPopMessage, popNotification4.message);
            PopNotification popNotification5 = PopNotification.this;
            popNotification5.showText(this.txtDialogxButton, popNotification5.buttonText);
            BaseDialog.useTextInfo(this.txtDialogxPopTitle, PopNotification.this.titleTextInfo);
            BaseDialog.useTextInfo(this.txtDialogxPopMessage, PopNotification.this.messageTextInfo);
            BaseDialog.useTextInfo(this.txtDialogxButton, PopNotification.this.buttonTextInfo);
            Bitmap bitmap = PopNotification.this.iconBitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                PopNotification popNotification6 = PopNotification.this;
                if (popNotification6.iconDrawable != null) {
                    this.imgDialogxPopIcon.setVisibility(0);
                    this.imgDialogxPopIcon.setImageDrawable(PopNotification.this.iconDrawable);
                } else if (popNotification6.iconResId != 0) {
                    this.imgDialogxPopIcon.setVisibility(0);
                    this.imgDialogxPopIcon.setImageResource(PopNotification.this.iconResId);
                } else {
                    this.imgDialogxPopIcon.setVisibility(8);
                }
            } else {
                this.imgDialogxPopIcon.setVisibility(0);
                this.imgDialogxPopIcon.setImageBitmap(PopNotification.this.iconBitmap);
            }
            PopNotification popNotification7 = PopNotification.this;
            if (popNotification7.tintIcon == BaseDialog.BOOLEAN.TRUE && popNotification7.autoTintIconInLightOrDarkMode) {
                this.imgDialogxPopIcon.setImageTintList(this.txtDialogxPopTitle.getTextColors());
            } else {
                this.imgDialogxPopIcon.setImageTintList(null);
            }
            if (PopNotification.this.iconSize > 0) {
                ViewGroup.LayoutParams layoutParams = this.imgDialogxPopIcon.getLayoutParams();
                int i = PopNotification.this.iconSize;
                layoutParams.width = i;
                layoutParams.height = i;
                this.imgDialogxPopIcon.setLayoutParams(layoutParams);
            }
            if (PopNotification.this.slideToClose) {
                this.boxBody.setOnTouchListener(new View.OnTouchListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.8
                    boolean touchDown;
                    float touchY;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
                    @Override // android.view.View.OnTouchListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            this.touchDown = true;
                            this.touchY = motionEvent.getY();
                        } else if (action == 1) {
                            if (DialogImpl.this.boxBody.getY() < PopNotification.this.defaultTop - DialogX.touchSlideTriggerThreshold) {
                                DialogImpl.this.doDismiss(view);
                            } else {
                                PopValueAnimator popValueAnimatorOfFloat = PopValueAnimator.ofFloat(DialogImpl.this.boxBody.getY(), PopNotification.this.defaultTop);
                                DialogImpl.this.boxBody.setTag(popValueAnimatorOfFloat);
                                popValueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.DialogImpl.8.1
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        if (PopNotification.this.getDialogImpl() == null || !((BaseDialog) PopNotification.this).isShow) {
                                            valueAnimator.cancel();
                                            return;
                                        }
                                        ViewGroup viewGroup = PopNotification.this.getDialogImpl().boxBody;
                                        if (viewGroup == null || !viewGroup.isAttachedToWindow()) {
                                            return;
                                        }
                                        viewGroup.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    }
                                });
                                popValueAnimatorOfFloat.setDuration(((BaseDialog) PopNotification.this).enterAnimDuration == -1 ? 300L : ((BaseDialog) PopNotification.this).enterAnimDuration).setInterpolator(new DecelerateInterpolator(2.0f));
                                popValueAnimatorOfFloat.start();
                                if (Math.abs(DialogImpl.this.boxBody.getY() - PopNotification.this.defaultTop) <= 1.0f && motionEvent.getY() <= this.touchY) {
                                    DialogImpl.this.boxBody.callOnClick();
                                }
                            }
                        } else if (action != 2) {
                            if (action == 3) {
                            }
                        } else if (this.touchDown) {
                            float y = motionEvent.getY() - this.touchY;
                            if (DialogImpl.this.boxBody.getY() + y < PopNotification.this.defaultTop) {
                                ViewGroup viewGroup = DialogImpl.this.boxBody;
                                viewGroup.setY(viewGroup.getY() + y);
                            } else {
                                DialogImpl dialogImpl = DialogImpl.this;
                                dialogImpl.boxBody.setY(PopNotification.this.defaultTop);
                            }
                        }
                        return true;
                    }
                });
            } else {
                this.boxBody.setOnTouchListener(null);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.boxBody.getLayoutParams();
            int[] iArr = PopNotification.this.bodyMargin;
            int i2 = iArr[0];
            if (i2 != -1) {
                layoutParams2.leftMargin = i2;
            }
            int i3 = iArr[1];
            if (i3 != -1) {
                layoutParams2.topMargin = i3;
            }
            int i4 = iArr[2];
            if (i4 != -1) {
                layoutParams2.rightMargin = i4;
            }
            int i5 = iArr[3];
            if (i5 != -1) {
                layoutParams2.bottomMargin = i5;
            }
            this.boxBody.setLayoutParams(layoutParams2);
            PopNotification.this.onDialogRefreshUI();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopNotification() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PopNotification build() {
        return new PopNotification();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int countDisplayPopNotificationNum() {
        if (popNotificationList == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < popNotificationList.size(); i2++) {
            PopNotification popNotification = popNotificationList.get(i2);
            if (popNotification != null && !popNotification.preRecycle) {
                i++;
            }
        }
        return i;
    }

    private boolean isNoSetCustomDelay() {
        return this.autoDismissDelay == Long.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveBack(int i) {
        float f;
        float paddingTop;
        if (getDialogImpl() == null || getDialogImpl().boxBody == null) {
            return;
        }
        ViewGroup viewGroup = getDialogImpl().boxBody;
        if (getDialogImpl() == null || viewGroup == null) {
            return;
        }
        if (this.style.popNotificationSettings() != null) {
            this.align = this.style.popNotificationSettings().align();
        }
        if (this.align == null) {
            this.align = DialogXStyle.PopNotificationSettings.ALIGN.TOP;
        }
        float y = viewGroup.getY();
        if (viewGroup.getTag() instanceof PopValueAnimator) {
            ((PopValueAnimator) viewGroup.getTag()).end();
            y = ((PopValueAnimator) viewGroup.getTag()).getEndValue();
        }
        int i2 = C25057.f4168x81ac079[this.align.ordinal()];
        if (i2 == 1) {
            f = (i * 1.1f) + y;
        } else if (i2 == 2 || i2 == 3) {
            paddingTop = i * 1.1f;
            f = y - paddingTop;
        } else if (i2 != 4) {
            if (i2 != 5) {
                f = 0.0f;
            }
            paddingTop = i * 1.1f;
            f = y - paddingTop;
        } else {
            y += i;
            paddingTop = viewGroup.getPaddingTop();
            f = y - paddingTop;
        }
        final float fResetAnimY = f;
        PopMoveDisplacementInterceptor<PopNotification> popMoveDisplacementInterceptor = moveDisplacementInterceptor;
        if (popMoveDisplacementInterceptor != null) {
            List<PopNotification> list = popNotificationList;
            int iIndexOf = list == null ? 0 : list.indexOf(this.f4167me);
            PopNotification popNotification = this.f4167me;
            float y2 = viewGroup.getY();
            int height = (int) (viewGroup.getHeight() / viewGroup.getScaleY());
            List<PopNotification> list2 = popNotificationList;
            fResetAnimY = popMoveDisplacementInterceptor.resetAnimY(iIndexOf, popNotification, y2, fResetAnimY, height, list2 == null ? 1 : list2.size(), true);
        }
        final float y3 = viewGroup.getY();
        PopValueAnimator popValueAnimatorOfFloat = PopValueAnimator.ofFloat(viewGroup.getY(), fResetAnimY);
        viewGroup.setTag(popValueAnimatorOfFloat);
        popValueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PopNotification.this.getDialogImpl() == null || !((BaseDialog) PopNotification.this).isShow) {
                    valueAnimator.cancel();
                    return;
                }
                ViewGroup viewGroup2 = PopNotification.this.getDialogImpl().boxBody;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f2 = fResetAnimY - y3;
                PopMoveDisplacementInterceptor<PopNotification> popMoveDisplacementInterceptor2 = PopNotification.moveDisplacementInterceptor;
                if (popMoveDisplacementInterceptor2 != null) {
                    List<PopNotification> list3 = PopNotification.popNotificationList;
                    int iIndexOf2 = list3 == null ? 0 : list3.indexOf(PopNotification.this.f4167me);
                    PopNotification popNotification2 = PopNotification.this.f4167me;
                    float f3 = y3;
                    if (popMoveDisplacementInterceptor2.animUpdater(iIndexOf2, popNotification2, viewGroup2, f3, fResetAnimY, Math.max(0.0f, Math.min(1.0f, f2 == 0.0f ? 1.0f : (fFloatValue - f3) / f2)), valueAnimator, PopNotification.popNotificationList == null ? 1 : PopNotification.this.countDisplayPopNotificationNum(), true)) {
                        return;
                    }
                }
                if (viewGroup2 == null || !viewGroup2.isAttachedToWindow()) {
                    return;
                }
                viewGroup2.setY(PopNotification.this.defaultTop = fFloatValue);
            }
        });
        long j = this.enterAnimDuration;
        if (j == -1) {
            j = 300;
        }
        popValueAnimatorOfFloat.setDuration(j).setInterpolator(new DecelerateInterpolator(2.0f));
        popValueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveFront(int i) {
        float f;
        float paddingTop;
        if (getDialogImpl() == null || getDialogImpl().boxBody == null) {
            return;
        }
        ViewGroup viewGroup = getDialogImpl().boxBody;
        if (getDialogImpl() == null || viewGroup == null) {
            return;
        }
        if (this.style.popNotificationSettings() != null) {
            this.align = this.style.popNotificationSettings().align();
        }
        if (this.align == null) {
            this.align = DialogXStyle.PopNotificationSettings.ALIGN.TOP;
        }
        float y = viewGroup.getY();
        if (viewGroup.getTag() instanceof PopValueAnimator) {
            ((PopValueAnimator) viewGroup.getTag()).end();
            y = ((PopValueAnimator) viewGroup.getTag()).getEndValue();
        }
        int i2 = C25057.f4168x81ac079[this.align.ordinal()];
        if (i2 == 1) {
            f = y - (i * 1.1f);
        } else if (i2 == 2 || i2 == 3) {
            paddingTop = i * 1.1f;
            f = paddingTop + y;
        } else if (i2 != 4) {
            if (i2 != 5) {
                f = 0.0f;
            }
            paddingTop = i * 1.1f;
            f = paddingTop + y;
        } else {
            y -= i;
            paddingTop = viewGroup.getPaddingTop();
            f = paddingTop + y;
        }
        final float fResetAnimY = f;
        PopMoveDisplacementInterceptor<PopNotification> popMoveDisplacementInterceptor = moveDisplacementInterceptor;
        if (popMoveDisplacementInterceptor != null) {
            List<PopNotification> list = popNotificationList;
            int iIndexOf = list == null ? 0 : list.indexOf(this.f4167me);
            PopNotification popNotification = this.f4167me;
            float y2 = viewGroup.getY();
            int height = (int) (viewGroup.getHeight() / viewGroup.getScaleY());
            List<PopNotification> list2 = popNotificationList;
            fResetAnimY = popMoveDisplacementInterceptor.resetAnimY(iIndexOf, popNotification, y2, fResetAnimY, height, list2 == null ? 1 : list2.size(), false);
        }
        final float y3 = viewGroup.getY();
        PopValueAnimator popValueAnimatorOfFloat = PopValueAnimator.ofFloat(y3, fResetAnimY);
        viewGroup.setTag(popValueAnimatorOfFloat);
        popValueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopNotification.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PopNotification.this.getDialogImpl() == null || !((BaseDialog) PopNotification.this).isShow) {
                    valueAnimator.cancel();
                    return;
                }
                ViewGroup viewGroup2 = PopNotification.this.getDialogImpl().boxBody;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f2 = fResetAnimY - y3;
                PopMoveDisplacementInterceptor<PopNotification> popMoveDisplacementInterceptor2 = PopNotification.moveDisplacementInterceptor;
                if (popMoveDisplacementInterceptor2 != null) {
                    List<PopNotification> list3 = PopNotification.popNotificationList;
                    int iIndexOf2 = list3 == null ? 0 : list3.indexOf(PopNotification.this.f4167me);
                    PopNotification popNotification2 = PopNotification.this.f4167me;
                    float f3 = y3;
                    if (popMoveDisplacementInterceptor2.animUpdater(iIndexOf2, popNotification2, viewGroup2, f3, fResetAnimY, Math.max(0.0f, Math.min(1.0f, f2 == 0.0f ? 1.0f : (fFloatValue - f3) / f2)), valueAnimator, PopNotification.popNotificationList == null ? 1 : PopNotification.this.countDisplayPopNotificationNum(), false)) {
                        return;
                    }
                }
                if (viewGroup2 == null || !viewGroup2.isAttachedToWindow()) {
                    return;
                }
                viewGroup2.setY(PopNotification.this.defaultTop = fFloatValue);
            }
        });
        long j = this.exitAnimDuration;
        if (j == -1) {
            j = 300;
        }
        popValueAnimatorOfFloat.setDuration(j).setInterpolator(new DecelerateInterpolator(2.0f));
        popValueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForDismiss() {
        List<PopNotification> list = popNotificationList;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.preRecycle = true;
        if (getDialogView() != null) {
            getDialogView().setVisibility(8);
        }
        new CopyOnWriteArrayList(popNotificationList).removeIf(new Predicate() { // from class: Yue.ۥۡۤۤۡ
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.isNull((PopNotification) obj);
            }
        });
        BaseDialog.dismiss(getDialogView());
    }

    public PopNotification appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    public PopNotification autoDismiss(long j) {
        this.autoDismissDelay = j;
        Timer timer = this.autoDismissTimer;
        if (timer != null) {
            timer.cancel();
        }
        if (j < 0) {
            return this;
        }
        Timer timer2 = new Timer();
        this.autoDismissTimer = timer2;
        timer2.schedule(new TimerTask() { // from class: com.kongzue.dialogx.dialogs.PopNotification.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                PopNotification.this.dismiss();
            }
        }, j);
        return this;
    }

    public PopNotification bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public PopNotification bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public PopNotification cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    public PopNotification cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public void dismiss() {
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopNotification.5
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = PopNotification.this.dialogImpl;
                if (dialogImpl == null) {
                    return;
                }
                dialogImpl.doDismiss(null);
            }
        });
    }

    public DialogXStyle.PopNotificationSettings.ALIGN getAlign() {
        return this.align;
    }

    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    public CharSequence getButtonText() {
        return this.buttonText;
    }

    public TextInfo getButtonTextInfo() {
        return this.buttonTextInfo;
    }

    public View getCustomView() {
        OnBindView<PopNotification> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    public DialogLifecycleCallback<PopNotification> getDialogLifecycleCallback() {
        DialogLifecycleCallback<PopNotification> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<PopNotification>() { // from class: com.kongzue.dialogx.dialogs.PopNotification.6
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<PopNotification> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public Bitmap getIconBitmap() {
        return this.iconBitmap;
    }

    public Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public int getMarginBottom() {
        return this.bodyMargin[3];
    }

    public int getMarginLeft() {
        return this.bodyMargin[0];
    }

    public int getMarginRight() {
        return this.bodyMargin[2];
    }

    public int getMarginTop() {
        return this.bodyMargin[1];
    }

    public CharSequence getMessage() {
        return this.message;
    }

    public TextInfo getMessageTextInfo() {
        return this.messageTextInfo;
    }

    public OnDialogButtonClickListener<PopNotification> getOnButtonClickListener() {
        return this.onButtonClickListener;
    }

    public OnDialogButtonClickListener<PopNotification> getOnPopNotificationClickListener() {
        return this.onPopNotificationClickListener;
    }

    public float getRadius() {
        return this.backgroundRadius;
    }

    public boolean getTintIcon() {
        return this.tintIcon == BaseDialog.BOOLEAN.TRUE;
    }

    public CharSequence getTitle() {
        return this.title;
    }

    public TextInfo getTitleTextInfo() {
        return this.titleTextInfo;
    }

    public void hide() {
        this.isHide = true;
        if (getDialogView() != null) {
            getDialogView().setVisibility(8);
        }
    }

    public PopNotification iconError() {
        setTintIcon(false);
        int iDefaultIconError = C2413R.mipmap.ico_dialogx_error;
        if (getStyle().popNotificationSettings() != null && getStyle().popNotificationSettings().defaultIconError() != 0) {
            iDefaultIconError = getStyle().popNotificationSettings().defaultIconError();
        }
        setIconSize(dip2px(26.0f));
        setIconResId(iDefaultIconError);
        return this;
    }

    public PopNotification iconSuccess() {
        setTintIcon(false);
        int iDefaultIconSuccess = C2413R.mipmap.ico_dialogx_success;
        if (getStyle().popNotificationSettings() != null && getStyle().popNotificationSettings().defaultIconSuccess() != 0) {
            iDefaultIconSuccess = getStyle().popNotificationSettings().defaultIconSuccess();
        }
        setIconSize(dip2px(26.0f));
        setIconResId(iDefaultIconSuccess);
        return this;
    }

    public PopNotification iconWarning() {
        setTintIcon(false);
        int iDefaultIconWarning = C2413R.mipmap.ico_dialogx_warning;
        if (getStyle().popNotificationSettings() != null && getStyle().popNotificationSettings().defaultIconWarning() != 0) {
            iDefaultIconWarning = getStyle().popNotificationSettings().defaultIconWarning();
        }
        setIconSize(dip2px(26.0f));
        setIconResId(iDefaultIconWarning);
        return this;
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
        return this.autoTintIconInLightOrDarkMode;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
        return false;
    }

    public boolean isSlideToClose() {
        return this.slideToClose;
    }

    public PopNotification noAutoDismiss() {
        autoDismiss(-1L);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onDismiss(PopNotification popNotification) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onShow(PopNotification popNotification) {
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopNotification.4
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = PopNotification.this.dialogImpl;
                if (dialogImpl != null) {
                    dialogImpl.refreshView();
                }
            }
        });
    }

    public PopNotification removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    public void resetAutoDismissTimer() {
        autoDismiss(this.autoDismissDelay);
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
        PopNotification popNotification;
        if (getDialogView() != null) {
            BaseDialog.dismiss(getDialogView());
            this.isShow = false;
        }
        if (getDialogImpl().boxCustom != null) {
            getDialogImpl().boxCustom.removeAllViews();
        }
        if (DialogX.onlyOnePopNotification) {
            List<PopNotification> list = popNotificationList;
            if (list == null || list.isEmpty()) {
                popNotification = null;
            } else {
                popNotification = popNotificationList.get(r0.size() - 1);
            }
            if (popNotification != null) {
                popNotification.dismiss();
            }
        }
        if (popNotificationList == null) {
            popNotificationList = new ArrayList();
        }
        popNotificationList.add(this);
        int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_popnotification_material : C2413R.layout.layout_dialogx_popnotification_material_dark;
        if (this.style.popNotificationSettings() != null) {
            if (this.style.popNotificationSettings().layout(isLightTheme()) != 0) {
                customDialogLayoutResId = this.style.popNotificationSettings().layout(isLightTheme());
            }
            DialogXStyle.PopNotificationSettings.ALIGN align = this.style.popNotificationSettings().align();
            this.align = align;
            if (align == null) {
                this.align = DialogXStyle.PopNotificationSettings.ALIGN.TOP;
            }
            int iEnterAnimResId = this.style.popNotificationSettings().enterAnimResId(isLightTheme());
            int iExitAnimResId = this.style.popNotificationSettings().exitAnimResId(isLightTheme());
            int i = this.enterAnimResId;
            if (i != 0 || (i = overrideEnterAnimRes) != 0) {
                iEnterAnimResId = i;
            } else if (iEnterAnimResId == 0) {
                iEnterAnimResId = C2413R.anim.anim_dialogx_notification_enter;
            }
            this.enterAnimResId = iEnterAnimResId;
            int i2 = this.exitAnimResId;
            if (i2 != 0 || (i2 = overrideExitAnimRes) != 0) {
                iExitAnimResId = i2;
            } else if (iExitAnimResId == 0) {
                iExitAnimResId = C2413R.anim.anim_dialogx_notification_exit;
            }
            this.exitAnimResId = iExitAnimResId;
            long j = this.enterAnimDuration;
            if (j == -1) {
                j = overrideEnterDuration;
            }
            this.enterAnimDuration = j;
            long j2 = this.exitAnimDuration;
            if (j2 == -1) {
                j2 = overrideExitDuration;
            }
            this.exitAnimDuration = j2;
        }
        this.enterAnimDuration = 0L;
        if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
            customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
        }
        View viewCreateView = createView(customDialogLayoutResId);
        this.dialogImpl = new DialogImpl(viewCreateView);
        if (viewCreateView != null) {
            viewCreateView.setTag(this.f4167me);
        }
        BaseDialog.show(viewCreateView);
    }

    public PopNotification setActionRunnable(int i, DialogXRunnable<PopNotification> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public PopNotification setAlign(DialogXStyle.PopNotificationSettings.ALIGN align) {
        this.align = align;
        return this;
    }

    public PopNotification setAnimResId(int i, int i2) {
        this.enterAnimResId = i;
        this.exitAnimResId = i2;
        return this;
    }

    public PopNotification setAutoTintIconInLightOrDarkMode(boolean z) {
        this.autoTintIconInLightOrDarkMode = z;
        refreshUI();
        return this;
    }

    public PopNotification setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public PopNotification setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopNotification setButton(CharSequence charSequence) {
        this.buttonText = charSequence;
        refreshUI();
        return this;
    }

    public PopNotification setButtonTextInfo(TextInfo textInfo) {
        this.buttonTextInfo = textInfo;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopNotification setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public PopNotification setCustomView(OnBindView<PopNotification> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public PopNotification setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public PopNotification setDialogLifecycleCallback(DialogLifecycleCallback<PopNotification> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4167me);
        }
        return this;
    }

    public PopNotification setDialogXAnimImpl(DialogXAnimInterface<PopNotification> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public PopNotification setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    public PopNotification setEnterAnimResId(int i) {
        this.enterAnimResId = i;
        return this;
    }

    public PopNotification setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    public PopNotification setExitAnimResId(int i) {
        this.exitAnimResId = i;
        return this;
    }

    public PopNotification setHapticFeedbackEnabled(boolean z) {
        this.isHapticFeedbackEnabled = z ? 1 : 0;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopNotification setIcon(Bitmap bitmap) {
        this.iconBitmap = bitmap;
        refreshUI();
        return this;
    }

    public PopNotification setIconResId(int i) {
        this.iconResId = i;
        refreshUI();
        return this;
    }

    public PopNotification setIconSize(int i) {
        this.iconSize = i;
        refreshUI();
        return this;
    }

    public PopNotification setMargin(int i, int i2, int i3, int i4) {
        int[] iArr = this.bodyMargin;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        refreshUI();
        return this;
    }

    public PopNotification setMarginBottom(int i) {
        this.bodyMargin[3] = i;
        refreshUI();
        return this;
    }

    public PopNotification setMarginLeft(int i) {
        this.bodyMargin[0] = i;
        refreshUI();
        return this;
    }

    public PopNotification setMarginRight(int i) {
        this.bodyMargin[2] = i;
        refreshUI();
        return this;
    }

    public PopNotification setMarginTop(int i) {
        this.bodyMargin[1] = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopNotification setMessage(CharSequence charSequence) {
        this.message = charSequence;
        refreshUI();
        return this;
    }

    public PopNotification setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public PopNotification setOnButtonClickListener(OnDialogButtonClickListener<PopNotification> onDialogButtonClickListener) {
        this.onButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public PopNotification setOnPopNotificationClickListener(OnDialogButtonClickListener<PopNotification> onDialogButtonClickListener) {
        this.onPopNotificationClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public PopNotification setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopNotification setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public PopNotification setSlideToClose(boolean z) {
        this.slideToClose = z;
        refreshUI();
        return this;
    }

    public PopNotification setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public PopNotification setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    public PopNotification setTintIcon(boolean z) {
        this.tintIcon = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    public PopNotification setTitle(CharSequence charSequence) {
        this.title = charSequence;
        refreshUI();
        return this;
    }

    public PopNotification setTitleTextInfo(TextInfo textInfo) {
        this.titleTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public PopNotification showAlways() {
        return noAutoDismiss();
    }

    public PopNotification showLong() {
        autoDismiss(3500L);
        if (!this.preShow && !this.isShow) {
            show();
        }
        return this;
    }

    public PopNotification showShort() {
        if (isNoSetCustomDelay()) {
            autoDismiss(C8973.AbstractC8977.f30287);
        }
        if (!this.preShow && !this.isShow) {
            show();
        }
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static PopNotification build(DialogXStyle dialogXStyle) {
        return new PopNotification().setStyle(dialogXStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static PopNotification show(OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(onBindView);
        popNotification.show();
        return popNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PopNotification onDismiss(DialogXRunnable<PopNotification> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PopNotification onShow(DialogXRunnable<PopNotification> dialogXRunnable) {
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
    public PopNotification setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public PopNotification setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public static PopNotification build(OnBindView<PopNotification> onBindView) {
        return new PopNotification().setCustomView(onBindView);
    }

    public PopNotification setButton(int i) {
        this.buttonText = getString(i);
        refreshUI();
        return this;
    }

    public PopNotification setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public PopNotification setIcon(Drawable drawable) {
        this.iconDrawable = drawable;
        return this;
    }

    public PopNotification setMessage(int i) {
        this.message = getString(i);
        refreshUI();
        return this;
    }

    public PopNotification setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public static PopNotification show(CharSequence charSequence) {
        PopNotification popNotification = new PopNotification(charSequence);
        popNotification.show();
        return popNotification;
    }

    public PopNotification setButton(CharSequence charSequence, OnDialogButtonClickListener<PopNotification> onDialogButtonClickListener) {
        this.buttonText = charSequence;
        this.onButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public static PopNotification show(CharSequence charSequence, CharSequence charSequence2) {
        PopNotification popNotification = new PopNotification(charSequence, charSequence2);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i) {
        PopNotification popNotification = new PopNotification(i);
        popNotification.show();
        return popNotification;
    }

    public PopNotification setButton(int i, OnDialogButtonClickListener<PopNotification> onDialogButtonClickListener) {
        this.buttonText = getString(i);
        this.onButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public static PopNotification show(int i, int i2) {
        PopNotification popNotification = new PopNotification(i, i2);
        popNotification.show();
        return popNotification;
    }

    public PopNotification setButton(OnDialogButtonClickListener<PopNotification> onDialogButtonClickListener) {
        this.onButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public PopNotification(OnBindView<PopNotification> onBindView) {
        this.onBindView = onBindView;
    }

    public static PopNotification show(CharSequence charSequence, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(charSequence, onBindView);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(CharSequence charSequence, CharSequence charSequence2, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(charSequence, charSequence2, onBindView);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(i, onBindView);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, int i2, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(i, i2, onBindView);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, CharSequence charSequence, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(i, charSequence, onBindView);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, CharSequence charSequence, CharSequence charSequence2, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(i, charSequence, charSequence2, onBindView);
        popNotification.show();
        return popNotification;
    }

    public PopNotification(CharSequence charSequence) {
        this.title = charSequence;
    }

    public static PopNotification show(int i, CharSequence charSequence) {
        PopNotification popNotification = new PopNotification(i, charSequence);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, CharSequence charSequence, CharSequence charSequence2) {
        PopNotification popNotification = new PopNotification(i, charSequence, charSequence2);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, int i2, int i3) {
        PopNotification popNotification = new PopNotification(i, i2, i3);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, int i2, int i3, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(i, i2, i3, onBindView);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, int i2, int i3, int i4) {
        PopNotification popNotification = new PopNotification(i, i2, i3, i4);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, int i2, int i3, int i4, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(i, i2, i3, i4, onBindView);
        popNotification.show();
        return popNotification;
    }

    public PopNotification(CharSequence charSequence, CharSequence charSequence2) {
        this.title = charSequence;
        this.message = charSequence2;
    }

    public static PopNotification show(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        PopNotification popNotification = new PopNotification(i, charSequence, charSequence2, charSequence3);
        popNotification.show();
        return popNotification;
    }

    public static PopNotification show(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, OnBindView<PopNotification> onBindView) {
        PopNotification popNotification = new PopNotification(i, charSequence, charSequence2, charSequence3, onBindView);
        popNotification.show();
        return popNotification;
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public PopNotification show() {
        if (this.isHide && getDialogView() != null) {
            getDialogView().setVisibility(0);
            return this;
        }
        super.beforeShow();
        if (getDialogView() == null) {
            if (DialogX.onlyOnePopNotification) {
                List<PopNotification> list = popNotificationList;
                if (list != null && !list.isEmpty()) {
                    popNotificationList.get(r0.size() - 1).dismiss();
                }
            } else if (popNotificationList != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(popNotificationList);
                for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
                    PopNotification popNotification = (PopNotification) copyOnWriteArrayList.get(i);
                    if (copyOnWriteArrayList.size() >= maxShowCount && i <= copyOnWriteArrayList.size() - maxShowCount) {
                        popNotification.dismiss();
                        popNotificationList.remove(popNotification);
                    }
                }
            }
            if (popNotificationList == null) {
                popNotificationList = new ArrayList();
            }
            popNotificationList.add(this);
            int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_popnotification_material : C2413R.layout.layout_dialogx_popnotification_material_dark;
            if (this.style.popNotificationSettings() != null) {
                if (this.style.popNotificationSettings().layout(isLightTheme()) != 0) {
                    customDialogLayoutResId = this.style.popNotificationSettings().layout(isLightTheme());
                }
                DialogXStyle.PopNotificationSettings.ALIGN align = this.style.popNotificationSettings().align();
                this.align = align;
                if (align == null) {
                    this.align = DialogXStyle.PopNotificationSettings.ALIGN.TOP;
                }
                int iEnterAnimResId = this.style.popNotificationSettings().enterAnimResId(isLightTheme());
                int iExitAnimResId = this.style.popNotificationSettings().exitAnimResId(isLightTheme());
                int i2 = this.enterAnimResId;
                if (i2 != 0 || (i2 = overrideEnterAnimRes) != 0) {
                    iEnterAnimResId = i2;
                } else if (iEnterAnimResId == 0) {
                    iEnterAnimResId = C2413R.anim.anim_dialogx_notification_enter;
                }
                this.enterAnimResId = iEnterAnimResId;
                int i3 = this.exitAnimResId;
                if (i3 != 0 || (i3 = overrideExitAnimRes) != 0) {
                    iExitAnimResId = i3;
                } else if (iExitAnimResId == 0) {
                    iExitAnimResId = C2413R.anim.anim_dialogx_notification_exit;
                }
                this.exitAnimResId = iExitAnimResId;
                long j = this.enterAnimDuration;
                if (j == -1) {
                    j = overrideEnterDuration;
                }
                this.enterAnimDuration = j;
                long j2 = this.exitAnimDuration;
                if (j2 == -1) {
                    j2 = overrideExitDuration;
                }
                this.exitAnimDuration = j2;
            }
            if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
                customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4167me);
            }
            BaseDialog.show(viewCreateView);
        } else {
            BaseDialog.show(getDialogView());
        }
        return this;
    }

    public PopNotification(int i) {
        this.title = getString(i);
    }

    public PopNotification(int i, int i2) {
        this.title = getString(i);
        this.message = getString(i2);
    }

    public PopNotification(int i, CharSequence charSequence) {
        this.iconResId = i;
        this.title = charSequence;
    }

    public PopNotification show(Activity activity) {
        PopNotification popNotification;
        super.beforeShow();
        if (getDialogView() == null) {
            if (DialogX.onlyOnePopNotification) {
                List<PopNotification> list = popNotificationList;
                if (list == null || list.isEmpty()) {
                    popNotification = null;
                } else {
                    popNotification = popNotificationList.get(r0.size() - 1);
                }
                if (popNotification != null) {
                    popNotification.dismiss();
                }
            }
            if (popNotificationList == null) {
                popNotificationList = new ArrayList();
            }
            popNotificationList.add(this);
            int customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_popnotification_material : C2413R.layout.layout_dialogx_popnotification_material_dark;
            if (this.style.popNotificationSettings() != null) {
                if (this.style.popNotificationSettings().layout(isLightTheme()) != 0) {
                    customDialogLayoutResId = this.style.popNotificationSettings().layout(isLightTheme());
                }
                DialogXStyle.PopNotificationSettings.ALIGN align = this.style.popNotificationSettings().align();
                this.align = align;
                if (align == null) {
                    this.align = DialogXStyle.PopNotificationSettings.ALIGN.TOP;
                }
                int iEnterAnimResId = this.style.popNotificationSettings().enterAnimResId(isLightTheme());
                int iExitAnimResId = this.style.popNotificationSettings().exitAnimResId(isLightTheme());
                int i = this.enterAnimResId;
                if (i != 0 || (i = overrideEnterAnimRes) != 0) {
                    iEnterAnimResId = i;
                } else if (iEnterAnimResId == 0) {
                    iEnterAnimResId = C2413R.anim.anim_dialogx_notification_enter;
                }
                this.enterAnimResId = iEnterAnimResId;
                int i2 = this.exitAnimResId;
                if (i2 != 0 || (i2 = overrideExitAnimRes) != 0) {
                    iExitAnimResId = i2;
                } else if (iExitAnimResId == 0) {
                    iExitAnimResId = C2413R.anim.anim_dialogx_notification_exit;
                }
                this.exitAnimResId = iExitAnimResId;
                long j = this.enterAnimDuration;
                if (j == -1) {
                    j = overrideEnterDuration;
                }
                this.enterAnimDuration = j;
                long j2 = this.exitAnimDuration;
                if (j2 == -1) {
                    j2 = overrideExitDuration;
                }
                this.exitAnimDuration = j2;
            }
            if (getCustomDialogLayoutResId(isLightTheme()) != 0) {
                customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme());
            }
            View viewCreateView = createView(customDialogLayoutResId);
            this.dialogImpl = new DialogImpl(viewCreateView);
            if (viewCreateView != null) {
                viewCreateView.setTag(this.f4167me);
            }
            BaseDialog.show(activity, viewCreateView);
        } else {
            BaseDialog.show(activity, getDialogView());
        }
        return this;
    }

    public PopNotification(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.iconResId = i;
        this.title = charSequence;
        this.message = charSequence2;
    }

    public PopNotification(int i, int i2, int i3) {
        this.iconResId = i;
        this.title = getString(i2);
        this.message = getString(i3);
    }

    public PopNotification(CharSequence charSequence, OnBindView<PopNotification> onBindView) {
        this.title = charSequence;
        this.onBindView = onBindView;
    }

    public PopNotification(CharSequence charSequence, CharSequence charSequence2, OnBindView<PopNotification> onBindView) {
        this.title = charSequence;
        this.message = charSequence2;
        this.onBindView = onBindView;
    }

    public PopNotification(int i, OnBindView<PopNotification> onBindView) {
        this.title = getString(i);
        this.onBindView = onBindView;
    }

    public PopNotification(int i, int i2, OnBindView<PopNotification> onBindView) {
        this.title = getString(i);
        this.message = getString(i2);
        this.onBindView = onBindView;
    }

    public PopNotification(int i, CharSequence charSequence, OnBindView<PopNotification> onBindView) {
        this.iconResId = i;
        this.title = charSequence;
        this.onBindView = onBindView;
    }

    public PopNotification(int i, CharSequence charSequence, CharSequence charSequence2, OnBindView<PopNotification> onBindView) {
        this.iconResId = i;
        this.title = charSequence;
        this.message = charSequence2;
        this.onBindView = onBindView;
    }

    public PopNotification(int i, int i2, int i3, OnBindView<PopNotification> onBindView) {
        this.iconResId = i;
        this.title = getString(i2);
        this.message = getString(i3);
        this.onBindView = onBindView;
    }

    public PopNotification(int i, int i2, int i3, int i4) {
        this.iconResId = i;
        this.title = getString(i2);
        this.message = getString(i3);
        this.buttonText = getString(i4);
    }

    public PopNotification(int i, int i2, int i3, int i4, OnBindView<PopNotification> onBindView) {
        this.iconResId = i;
        this.title = getString(i2);
        this.message = getString(i3);
        this.buttonText = getString(i4);
        this.onBindView = onBindView;
    }

    public PopNotification(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.iconResId = i;
        this.title = charSequence;
        this.message = charSequence2;
        this.buttonText = charSequence3;
    }

    public PopNotification(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, OnBindView<PopNotification> onBindView) {
        this.iconResId = i;
        this.title = charSequence;
        this.message = charSequence2;
        this.buttonText = charSequence3;
        this.onBindView = onBindView;
    }
}
