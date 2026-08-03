package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC6490;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C8973;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.PopTip;
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
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class PopTip extends BaseDialog implements NoTouchInterface {
    public static final int TIME_NO_AUTO_DISMISS_DELAY = -1;
    public static int maxShowCount = Integer.MAX_VALUE;
    public static PopMoveDisplacementInterceptor<PopTip> moveDisplacementInterceptor = null;
    public static int overrideEnterAnimRes = 0;
    public static long overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static long overrideExitDuration = -1;
    protected static List<PopTip> popTipList;
    protected DialogXStyle.PopTipSettings.ALIGN align;
    protected long autoDismissDelay;
    protected Timer autoDismissTimer;
    protected CharSequence buttonText;
    protected DialogImpl dialogImpl;
    protected DialogLifecycleCallback<PopTip> dialogLifecycleCallback;
    protected DialogXAnimInterface<PopTip> dialogXAnimImpl;
    protected int iconResId;
    protected CharSequence message;
    protected TextInfo messageTextInfo;
    protected OnBindView<PopTip> onBindView;
    protected OnDialogButtonClickListener<PopTip> onButtonClickListener;
    protected OnDialogButtonClickListener<PopTip> onPopTipClickListener;
    protected BaseDialog.BOOLEAN tintIcon;

    /* JADX INFO: renamed from: me */
    protected PopTip f4169me = this;
    protected int enterAnimResId = 0;
    protected int exitAnimResId = 0;
    protected float backgroundRadius = DialogX.defaultPopTipBackgroundRadius;
    protected TextInfo buttonTextInfo = new TextInfo().setBold(true);
    protected int[] bodyMargin = {-1, -1, -1, -1};
    protected boolean preRecycle = false;

    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.PopTip$7 */
    public static /* synthetic */ class C25237 {

        /* JADX INFO: renamed from: $SwitchMap$com$kongzue$dialogx$interfaces$DialogXStyle$PopTipSettings$ALIGN */
        static final /* synthetic */ int[] f4170x462451d5;

        static {
            int[] iArr = new int[DialogXStyle.PopTipSettings.ALIGN.values().length];
            f4170x462451d5 = iArr;
            try {
                iArr[DialogXStyle.PopTipSettings.ALIGN.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4170x462451d5[DialogXStyle.PopTipSettings.ALIGN.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4170x462451d5[DialogXStyle.PopTipSettings.ALIGN.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4170x462451d5[DialogXStyle.PopTipSettings.ALIGN.TOP_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4170x462451d5[DialogXStyle.PopTipSettings.ALIGN.BOTTOM_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class DialogImpl implements DialogConvertViewInterface {
        private List<View> blurViews;
        public LinearLayout boxBody;
        public RelativeLayout boxCustom;
        public DialogXBaseRelativeLayout boxRoot;
        public ImageView imgDialogxPopIcon;
        public TextView txtDialogxButton;
        public TextView txtDialogxPopText;

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            PopTip.this.setDialogView(view);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.boxBody = (LinearLayout) view.findViewById(C2413R.id.box_body);
            this.imgDialogxPopIcon = (ImageView) view.findViewById(C2413R.id.img_dialogx_pop_icon);
            this.txtDialogxPopText = (TextView) view.findViewById(C2413R.id.txt_dialogx_pop_text);
            this.boxCustom = (RelativeLayout) view.findViewById(C2413R.id.box_custom);
            this.txtDialogxButton = (TextView) view.findViewById(C2413R.id.txt_dialogx_button);
            this.blurViews = PopTip.this.findAllBlurView(view);
            init();
            PopTip.this.dialogImpl = this;
            refreshView();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void applyPopTipAlign() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.boxBody.getLayoutParams();
            PopTip popTip = PopTip.this;
            if (popTip.align == null) {
                popTip.align = DialogXStyle.PopTipSettings.ALIGN.BOTTOM;
            }
            int i = C25237.f4170x462451d5[popTip.align.ordinal()];
            if (i == 1) {
                layoutParams.removeRule(12);
                layoutParams.removeRule(13);
                layoutParams.addRule(10);
            } else if (i == 2) {
                layoutParams.removeRule(10);
                layoutParams.removeRule(13);
                layoutParams.addRule(12);
            } else if (i == 3) {
                layoutParams.removeRule(10);
                layoutParams.removeRule(12);
                layoutParams.addRule(13);
            }
            this.boxBody.setLayoutParams(layoutParams);
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(View view) {
            BaseDialog baseDialog = PopTip.this;
            if (baseDialog.preDismiss(baseDialog)) {
                return;
            }
            if (view != null) {
                view.setEnabled(false);
            }
            if (((BaseDialog) PopTip.this).dismissAnimFlag || this.boxRoot == null) {
                return;
            }
            ((BaseDialog) PopTip.this).dismissAnimFlag = true;
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    DialogXAnimInterface<PopTip> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doExitAnim(PopTip.this.f4169me, dialogImpl.boxBody);
                    PopTip.this.preRecycle = true;
                    BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PopTip.this.waitForDismiss();
                        }
                    }, DialogImpl.this.getExitAnimationDuration(null));
                    List<PopTip> list = PopTip.popTipList;
                    if (list != null) {
                        int iIndexOf = list.indexOf(PopTip.this.f4169me);
                        for (int i = 0; i < iIndexOf; i++) {
                            PopTip.popTipList.get(i).moveFront();
                        }
                    }
                }
            });
        }

        public DialogXAnimInterface<PopTip> getDialogXAnimImpl() {
            PopTip popTip = PopTip.this;
            if (popTip.dialogXAnimImpl == null) {
                popTip.dialogXAnimImpl = new DialogXAnimInterface<PopTip>() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.9
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(PopTip popTip2, ViewGroup viewGroup) {
                        Context context = PopTip.this.getOwnActivity() == null ? DialogImpl.this.boxRoot.getContext() : PopTip.this.getOwnActivity();
                        int i = PopTip.this.exitAnimResId;
                        if (i == 0) {
                            i = C2413R.anim.anim_dialogx_default_exit;
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
                    public void doShowAnim(PopTip popTip2, ViewGroup viewGroup) {
                        Activity ownActivity = PopTip.this.getOwnActivity();
                        int i = PopTip.this.enterAnimResId;
                        if (i == 0) {
                            i = C2413R.anim.anim_dialogx_default_enter;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(ownActivity, i);
                        long enterAnimationDuration = DialogImpl.this.getEnterAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
                        animationLoadAnimation.setDuration(enterAnimationDuration);
                        animationLoadAnimation.setFillAfter(true);
                        DialogImpl.this.boxBody.startAnimation(animationLoadAnimation);
                        DialogImpl.this.boxRoot.animate().setDuration(enterAnimationDuration).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                    }
                };
            }
            return PopTip.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxBody.getAnimation() != null) {
                animation = this.boxBody.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            long j = PopTip.overrideEnterDuration;
            if (j >= 0) {
                duration = j;
            }
            return ((BaseDialog) PopTip.this).enterAnimDuration >= 0 ? ((BaseDialog) PopTip.this).enterAnimDuration : duration;
        }

        public long getExitAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.boxBody.getAnimation() != null) {
                animation = this.boxBody.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            long j = PopTip.overrideExitDuration;
            if (j >= 0) {
                duration = j;
            }
            return ((BaseDialog) PopTip.this).exitAnimDuration != -1 ? ((BaseDialog) PopTip.this).exitAnimDuration : duration;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            PopTip.this.getDialogView().setTranslationZ(PopTip.this.getThisOrderIndex());
            PopTip popTip = PopTip.this;
            if (popTip.messageTextInfo == null) {
                popTip.messageTextInfo = DialogX.popTextInfo;
            }
            if (popTip.buttonTextInfo == null) {
                popTip.buttonTextInfo = DialogX.buttonTextInfo;
            }
            if (((BaseDialog) popTip).backgroundColor == null) {
                ((BaseDialog) PopTip.this).backgroundColor = DialogX.backgroundColor;
            }
            PopTip popTip2 = PopTip.this;
            if (popTip2.autoDismissTimer == null) {
                popTip2.showShort();
            }
            this.boxRoot.setParentDialog(PopTip.this.f4169me);
            this.boxRoot.setAutoUnsafePlacePadding(true);
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    List<PopTip> list = PopTip.popTipList;
                    if (list != null) {
                        list.remove(PopTip.this);
                        if (PopTip.popTipList.isEmpty()) {
                            PopTip.popTipList = null;
                        }
                    }
                    ((BaseDialog) PopTip.this).isShow = false;
                    Timer timer = PopTip.this.autoDismissTimer;
                    if (timer != null) {
                        timer.cancel();
                    }
                    PopTip.this.getDialogLifecycleCallback().onDismiss(PopTip.this.f4169me);
                    PopTip popTip3 = PopTip.this;
                    popTip3.onDismiss(popTip3.f4169me);
                    PopTip.this.setLifecycleState(Lifecycle.State.DESTROYED);
                    PopTip.this.dialogImpl = null;
                    BaseDialog.m5092gc();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) PopTip.this).isShow = true;
                    ((BaseDialog) PopTip.this).preShow = false;
                    PopTip.this.setLifecycleState(Lifecycle.State.CREATED);
                    DialogImpl.this.boxRoot.setAlpha(0.0f);
                    PopTip.this.onDialogShow();
                    PopTip.this.getDialogLifecycleCallback().onShow(PopTip.this.f4169me);
                    PopTip popTip3 = PopTip.this;
                    popTip3.onShow(popTip3.f4169me);
                }
            });
            applyPopTipAlign();
            this.boxRoot.setOnSafeInsetsChangeListener(new OnSafeInsetsChangeListener() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.2
                @Override // com.kongzue.dialogx.interfaces.OnSafeInsetsChangeListener
                public void onChange(Rect rect) {
                    DialogImpl dialogImpl = DialogImpl.this;
                    if (PopTip.this.align == DialogXStyle.PopTipSettings.ALIGN.TOP_INSIDE) {
                        dialogImpl.boxBody.setPadding(0, rect.top, 0, 0);
                    }
                }
            });
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.3
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    return false;
                }
            });
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    DialogXAnimInterface<PopTip> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doShowAnim(PopTip.this.f4169me, dialogImpl.boxBody);
                    PopTip.this.setLifecycleState(Lifecycle.State.RESUMED);
                }
            });
            this.txtDialogxButton.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    PopTip.this.haptic(view);
                    DialogImpl dialogImpl = DialogImpl.this;
                    PopTip popTip3 = PopTip.this;
                    OnDialogButtonClickListener<PopTip> onDialogButtonClickListener = popTip3.onButtonClickListener;
                    if (onDialogButtonClickListener == null) {
                        dialogImpl.doDismiss(view);
                    } else {
                        if (onDialogButtonClickListener.onClick(popTip3.f4169me, view)) {
                            return;
                        }
                        DialogImpl.this.doDismiss(view);
                    }
                }
            });
            PopTip.this.onDialogInit();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            GradientDrawable gradientDrawable;
            if (this.boxRoot == null || PopTip.this.getOwnActivity() == null) {
                return;
            }
            this.boxRoot.setRootPadding(((BaseDialog) PopTip.this).screenPaddings[0], ((BaseDialog) PopTip.this).screenPaddings[1], ((BaseDialog) PopTip.this).screenPaddings[2], ((BaseDialog) PopTip.this).screenPaddings[3]);
            if (((BaseDialog) PopTip.this).backgroundColor != null) {
                PopTip popTip = PopTip.this;
                popTip.tintColor(this.boxBody, ((BaseDialog) popTip).backgroundColor.intValue());
                PopTip popTip2 = PopTip.this;
                popTip2.tintColor(this.txtDialogxButton, ((BaseDialog) popTip2).backgroundColor.intValue());
                List<View> list = this.blurViews;
                if (list != null) {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        ((BlurViewType) ((View) it.next())).setOverlayColor(((BaseDialog) PopTip.this).backgroundColor);
                    }
                }
            }
            OnBindView<PopTip> onBindView = PopTip.this.onBindView;
            if (onBindView == null || onBindView.getCustomView() == null) {
                this.boxCustom.setVisibility(8);
            } else {
                PopTip popTip3 = PopTip.this;
                popTip3.onBindView.bindParent(this.boxCustom, popTip3.f4169me);
                this.boxCustom.setVisibility(0);
            }
            PopTip popTip4 = PopTip.this;
            popTip4.showText(this.txtDialogxPopText, popTip4.message);
            PopTip popTip5 = PopTip.this;
            popTip5.showText(this.txtDialogxButton, popTip5.buttonText);
            BaseDialog.useTextInfo(this.txtDialogxPopText, PopTip.this.messageTextInfo);
            BaseDialog.useTextInfo(this.txtDialogxButton, PopTip.this.buttonTextInfo);
            if (PopTip.this.iconResId != 0) {
                this.imgDialogxPopIcon.setVisibility(0);
                this.imgDialogxPopIcon.setImageResource(PopTip.this.iconResId);
                if (PopTip.this.isTintIcon()) {
                    this.imgDialogxPopIcon.setImageTintList(this.txtDialogxPopText.getTextColors());
                } else {
                    this.imgDialogxPopIcon.setImageTintList(null);
                }
            } else {
                this.imgDialogxPopIcon.setVisibility(8);
            }
            if (PopTip.this.backgroundRadius > -1.0f) {
                if ((this.boxBody.getBackground() instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) this.boxBody.getBackground()) != null) {
                    gradientDrawable.setCornerRadius(PopTip.this.backgroundRadius);
                }
                this.boxBody.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.6
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), PopTip.this.backgroundRadius);
                    }
                });
                this.boxBody.setClipToOutline(true);
                List<View> list2 = this.blurViews;
                if (list2 != null) {
                    Iterator<View> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((BlurViewType) ((View) it2.next())).setRadiusPx(Float.valueOf(PopTip.this.backgroundRadius));
                    }
                }
            }
            if (PopTip.this.onPopTipClickListener != null) {
                this.boxBody.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.PopTip.DialogImpl.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        PopTip popTip6 = PopTip.this;
                        if (popTip6.onPopTipClickListener.onClick(popTip6.f4169me, view)) {
                            return;
                        }
                        PopTip.this.haptic(view);
                        PopTip.this.dismiss();
                    }
                });
            } else {
                this.boxBody.setOnClickListener(null);
                this.boxBody.setClickable(false);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.boxBody.getLayoutParams();
            int[] iArr = PopTip.this.bodyMargin;
            int i = iArr[0];
            if (i != -1) {
                layoutParams.leftMargin = i;
            }
            int i2 = iArr[1];
            if (i2 != -1) {
                layoutParams.topMargin = i2;
            }
            int i3 = iArr[2];
            if (i3 != -1) {
                layoutParams.rightMargin = i3;
            }
            int i4 = iArr[3];
            if (i4 != -1) {
                layoutParams.bottomMargin = i4;
            }
            this.boxBody.setLayoutParams(layoutParams);
            PopTip.this.onDialogRefreshUI();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopTip() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PopTip build() {
        return new PopTip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int countDisplayPopTipsNum() {
        if (popTipList == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < popTipList.size(); i2++) {
            PopTip popTip = popTipList.get(i2);
            if (popTip != null && !popTip.preRecycle) {
                i++;
            }
        }
        return i;
    }

    private void moveBack() {
        if (getDialogImpl() == null || getDialogImpl().boxBody == null || getDialogImpl() == null || getDialogImpl().boxBody == null) {
            return;
        }
        final LinearLayout linearLayout = getDialogImpl().boxBody;
        linearLayout.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopTip.2
            /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                float y;
                if (PopTip.this.getDialogImpl() == null) {
                    return;
                }
                PopTip popTip = PopTip.this;
                if (popTip.align == null && ((BaseDialog) popTip).style.popTipSettings() != null) {
                    PopTip popTip2 = PopTip.this;
                    popTip2.align = ((BaseDialog) popTip2).style.popTipSettings().align();
                }
                PopTip popTip3 = PopTip.this;
                if (popTip3.align == null) {
                    popTip3.align = DialogXStyle.PopTipSettings.ALIGN.TOP;
                }
                int i = C25237.f4170x462451d5[popTip3.align.ordinal()];
                if (i == 1) {
                    y = linearLayout.getY() + (linearLayout.getHeight() * 1.3f);
                } else if (i == 2 || i == 3) {
                    y = linearLayout.getY() - (linearLayout.getHeight() * 1.3f);
                } else if (i == 4) {
                    y = (linearLayout.getY() + linearLayout.getHeight()) - linearLayout.getPaddingTop();
                } else if (i != 5) {
                    y = 0.0f;
                }
                final float fResetAnimY = y;
                PopMoveDisplacementInterceptor<PopTip> popMoveDisplacementInterceptor = PopTip.moveDisplacementInterceptor;
                if (popMoveDisplacementInterceptor != null) {
                    List<PopTip> list = PopTip.popTipList;
                    int iIndexOf = list == null ? 0 : list.indexOf(PopTip.this.f4169me);
                    PopTip popTip4 = PopTip.this.f4169me;
                    float y2 = linearLayout.getY();
                    int height = (int) (linearLayout.getHeight() / linearLayout.getScaleY());
                    List<PopTip> list2 = PopTip.popTipList;
                    fResetAnimY = popMoveDisplacementInterceptor.resetAnimY(iIndexOf, popTip4, y2, fResetAnimY, height, list2 == null ? 1 : list2.size(), true);
                }
                if (linearLayout.getTag() instanceof ValueAnimator) {
                    ((ValueAnimator) linearLayout.getTag()).end();
                }
                final float y3 = linearLayout.getY();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y3, fResetAnimY);
                linearLayout.setTag(valueAnimatorOfFloat);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopTip.2.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PopTip.this.getDialogImpl() == null || !((BaseDialog) PopTip.this).isShow) {
                            valueAnimator.cancel();
                            return;
                        }
                        LinearLayout linearLayout2 = PopTip.this.getDialogImpl().boxBody;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float f = fResetAnimY - y3;
                        PopMoveDisplacementInterceptor<PopTip> popMoveDisplacementInterceptor2 = PopTip.moveDisplacementInterceptor;
                        if (popMoveDisplacementInterceptor2 != null) {
                            List<PopTip> list3 = PopTip.popTipList;
                            int iIndexOf2 = list3 == null ? 0 : list3.indexOf(PopTip.this.f4169me);
                            PopTip popTip5 = PopTip.this.f4169me;
                            float f2 = y3;
                            if (popMoveDisplacementInterceptor2.animUpdater(iIndexOf2, popTip5, linearLayout2, f2, fResetAnimY, Math.max(0.0f, Math.min(1.0f, f == 0.0f ? 1.0f : (fFloatValue - f2) / f)), valueAnimator, PopTip.popTipList == null ? 1 : PopTip.this.countDisplayPopTipsNum(), true)) {
                                return;
                            }
                        }
                        if (linearLayout2 == null || !linearLayout2.isAttachedToWindow()) {
                            return;
                        }
                        linearLayout2.setY(fFloatValue);
                    }
                });
                valueAnimatorOfFloat.setDuration(((BaseDialog) PopTip.this).enterAnimDuration == -1 ? 300L : ((BaseDialog) PopTip.this).enterAnimDuration).setInterpolator(new DecelerateInterpolator(2.0f));
                valueAnimatorOfFloat.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moveFront() {
        if (getDialogImpl() == null || getDialogImpl().boxBody == null || getDialogImpl() == null || getDialogImpl().boxBody == null) {
            return;
        }
        final LinearLayout linearLayout = getDialogImpl().boxBody;
        linearLayout.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopTip.3
            /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                float y;
                if (PopTip.this.getDialogImpl() == null) {
                    return;
                }
                PopTip popTip = PopTip.this;
                if (popTip.align == null && ((BaseDialog) popTip).style.popTipSettings() != null) {
                    PopTip popTip2 = PopTip.this;
                    popTip2.align = ((BaseDialog) popTip2).style.popTipSettings().align();
                }
                PopTip popTip3 = PopTip.this;
                if (popTip3.align == null) {
                    popTip3.align = DialogXStyle.PopTipSettings.ALIGN.TOP;
                }
                int i = C25237.f4170x462451d5[popTip3.align.ordinal()];
                if (i == 1) {
                    y = linearLayout.getY() - (linearLayout.getHeight() * 1.3f);
                } else if (i == 2 || i == 3) {
                    y = linearLayout.getY() + (linearLayout.getHeight() * 1.3f);
                } else if (i == 4) {
                    y = (linearLayout.getY() - linearLayout.getHeight()) + linearLayout.getPaddingTop();
                } else if (i != 5) {
                    y = 0.0f;
                }
                final float fResetAnimY = y;
                PopMoveDisplacementInterceptor<PopTip> popMoveDisplacementInterceptor = PopTip.moveDisplacementInterceptor;
                if (popMoveDisplacementInterceptor != null) {
                    List<PopTip> list = PopTip.popTipList;
                    int iIndexOf = list == null ? 0 : list.indexOf(PopTip.this.f4169me);
                    PopTip popTip4 = PopTip.this.f4169me;
                    float y2 = linearLayout.getY();
                    int height = (int) (linearLayout.getHeight() / linearLayout.getScaleY());
                    List<PopTip> list2 = PopTip.popTipList;
                    fResetAnimY = popMoveDisplacementInterceptor.resetAnimY(iIndexOf, popTip4, y2, fResetAnimY, height, list2 == null ? 1 : list2.size(), false);
                }
                if (linearLayout.getTag() instanceof ValueAnimator) {
                    ((ValueAnimator) linearLayout.getTag()).end();
                }
                final float y3 = linearLayout.getY();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y3, fResetAnimY);
                linearLayout.setTag(valueAnimatorOfFloat);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.PopTip.3.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PopTip.this.getDialogImpl() == null || !((BaseDialog) PopTip.this).isShow) {
                            valueAnimator.cancel();
                            return;
                        }
                        LinearLayout linearLayout2 = PopTip.this.getDialogImpl().boxBody;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float f = fResetAnimY - y3;
                        PopMoveDisplacementInterceptor<PopTip> popMoveDisplacementInterceptor2 = PopTip.moveDisplacementInterceptor;
                        if (popMoveDisplacementInterceptor2 != null) {
                            List<PopTip> list3 = PopTip.popTipList;
                            int iIndexOf2 = list3 == null ? 0 : list3.indexOf(PopTip.this.f4169me);
                            PopTip popTip5 = PopTip.this.f4169me;
                            float f2 = y3;
                            if (popMoveDisplacementInterceptor2.animUpdater(iIndexOf2, popTip5, linearLayout2, f2, fResetAnimY, Math.max(0.0f, Math.min(1.0f, f == 0.0f ? 1.0f : (fFloatValue - f2) / f)), valueAnimator, PopTip.popTipList == null ? 1 : PopTip.this.countDisplayPopTipsNum(), false)) {
                                return;
                            }
                        }
                        if (linearLayout2 == null || !linearLayout2.isAttachedToWindow()) {
                            return;
                        }
                        linearLayout2.setY(fFloatValue);
                    }
                });
                valueAnimatorOfFloat.setDuration(((BaseDialog) PopTip.this).exitAnimDuration == -1 ? 300L : ((BaseDialog) PopTip.this).exitAnimDuration).setInterpolator(new AccelerateInterpolator(2.0f));
                valueAnimatorOfFloat.start();
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static PopTip tip(String str) {
        return show(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForDismiss() {
        List<PopTip> list = popTipList;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.preRecycle = true;
        if (getDialogView() != null) {
            getDialogView().setVisibility(8);
        }
        new CopyOnWriteArrayList(popTipList).removeIf(new Predicate() { // from class: Yue.ۥۡۤۤۢ
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.isNull((PopTip) obj);
            }
        });
        BaseDialog.dismiss(getDialogView());
    }

    public PopTip appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    public PopTip autoDismiss(long j) {
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
        timer2.schedule(new TimerTask() { // from class: com.kongzue.dialogx.dialogs.PopTip.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                PopTip.this.dismiss();
            }
        }, j);
        return this;
    }

    public PopTip bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public PopTip bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public PopTip cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void cleanActivityContext() {
        super.cleanActivityContext();
        BaseDialog.dismiss(getDialogView());
    }

    public PopTip cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public void dismiss() {
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopTip.5
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = PopTip.this.dialogImpl;
                if (dialogImpl == null) {
                    return;
                }
                dialogImpl.doDismiss(null);
            }
        });
    }

    public DialogXStyle.PopTipSettings.ALIGN getAlign() {
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
        OnBindView<PopTip> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    public DialogLifecycleCallback<PopTip> getDialogLifecycleCallback() {
        DialogLifecycleCallback<PopTip> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<PopTip>() { // from class: com.kongzue.dialogx.dialogs.PopTip.6
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<PopTip> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public int getIconResId() {
        return this.iconResId;
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

    public OnDialogButtonClickListener<PopTip> getOnButtonClickListener() {
        return this.onButtonClickListener;
    }

    public OnDialogButtonClickListener<PopTip> getOnPopTipClickListener() {
        return this.onPopTipClickListener;
    }

    public float getRadius() {
        return this.backgroundRadius;
    }

    public void hide() {
        this.isHide = true;
        if (getDialogView() != null) {
            getDialogView().setVisibility(8);
        }
    }

    public PopTip iconError() {
        setTintIcon(false);
        int iDefaultIconError = C2413R.mipmap.ico_dialogx_error;
        if (getStyle().popTipSettings() != null && getStyle().popTipSettings().defaultIconError() != 0) {
            iDefaultIconError = getStyle().popTipSettings().defaultIconError();
        }
        setIconResId(iDefaultIconError);
        return this;
    }

    public PopTip iconSuccess() {
        setTintIcon(false);
        int iDefaultIconSuccess = C2413R.mipmap.ico_dialogx_success;
        if (getStyle().popTipSettings() != null && getStyle().popTipSettings().defaultIconSuccess() != 0) {
            iDefaultIconSuccess = getStyle().popTipSettings().defaultIconSuccess();
        }
        setIconResId(iDefaultIconSuccess);
        return this;
    }

    public PopTip iconWarning() {
        setTintIcon(false);
        int iDefaultIconWarning = C2413R.mipmap.ico_dialogx_warning;
        if (getStyle().popTipSettings() != null && getStyle().popTipSettings().defaultIconWarning() != 0) {
            iDefaultIconWarning = getStyle().popTipSettings().defaultIconWarning();
        }
        setIconResId(iDefaultIconWarning);
        return this;
    }

    @Deprecated
    public boolean isAutoTintIconInLightOrDarkMode() {
        return isTintIcon();
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
        return false;
    }

    public boolean isTintIcon() {
        return (this.tintIcon != null || getStyle().popTipSettings() == null) ? this.tintIcon == BaseDialog.BOOLEAN.TRUE : getStyle().popTipSettings().tintIcon();
    }

    public PopTip noAutoDismiss() {
        autoDismiss(-1L);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onDismiss(PopTip popTip) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onShow(PopTip popTip) {
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.PopTip.4
            @Override // java.lang.Runnable
            public void run() {
                DialogImpl dialogImpl = PopTip.this.dialogImpl;
                if (dialogImpl != null) {
                    dialogImpl.refreshView();
                }
            }
        });
    }

    public PopTip removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    public void resetAutoDismissTimer() {
        autoDismiss(this.autoDismissDelay);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
        /*
            r6 = this;
            android.view.View r0 = r6.getDialogView()
            r1 = 0
            if (r0 == 0) goto L10
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r6.isShow = r1
        L10:
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r6.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L21
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r0 = r6.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L21:
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopTip
            if (r0 == 0) goto L45
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L3e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r0 = (com.kongzue.dialogx.dialogs.PopTip) r0
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L80
            r0.dismiss()
            goto L80
        L45:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L80
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r2 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.<init>(r2)
        L50:
            int r2 = r0.size()
            if (r1 >= r2) goto L80
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r2 = (com.kongzue.dialogx.dialogs.PopTip) r2
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            if (r3 >= r4) goto L68
            r2.moveBack()
            goto L7d
        L68:
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            int r3 = r3 - r4
            if (r1 > r3) goto L7a
            r2.dismiss()
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r3 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r3.remove(r2)
            goto L7d
        L7a:
            r2.moveBack()
        L7d:
            int r1 = r1 + 1
            goto L50
        L80:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 != 0) goto L8b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip.popTipList = r0
        L8b:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L99
            int r0 = com.kongzue.dialogx.C2413R.layout.layout_dialogx_poptip_material
            goto L9b
        L99:
            int r0 = com.kongzue.dialogx.C2413R.layout.layout_dialogx_poptip_material_dark
        L9b:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L136
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto Lc1
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        Lc1:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r6.align
            if (r1 != 0) goto Le2
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            if (r1 != 0) goto Ld6
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
            r6.align = r1
            goto Le2
        Ld6:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            r6.align = r1
        Le2:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r2 = r2.popTipSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto L10c
            int r3 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterAnimRes
            if (r3 != 0) goto L10c
            if (r1 == 0) goto L109
            goto L10d
        L109:
            int r1 = com.kongzue.dialogx.C2413R.anim.anim_dialogx_default_enter
            goto L10d
        L10c:
            r1 = r3
        L10d:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto L11d
            int r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitAnimRes
            if (r1 != 0) goto L11d
            if (r2 == 0) goto L11a
            goto L11e
        L11a:
            int r2 = com.kongzue.dialogx.C2413R.anim.anim_dialogx_default_exit
            goto L11e
        L11d:
            r2 = r1
        L11e:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L12a
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterDuration
        L12a:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L134
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitDuration
        L134:
            r6.exitAnimDuration = r1
        L136:
            r1 = 0
            r6.enterAnimDuration = r1
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L14c
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L14c:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl
            r1.<init>(r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L15e
            com.kongzue.dialogx.dialogs.PopTip r1 = r6.f4169me
            r0.setTag(r1)
        L15e:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.dialogs.PopTip.restartDialog():void");
    }

    public PopTip setActionRunnable(int i, DialogXRunnable<PopTip> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public PopTip setAlign(DialogXStyle.PopTipSettings.ALIGN align) {
        this.align = align;
        if (getDialogImpl() != null) {
            getDialogImpl().applyPopTipAlign();
        }
        return this;
    }

    public PopTip setAnimResId(int i, int i2) {
        this.enterAnimResId = i;
        this.exitAnimResId = i2;
        return this;
    }

    @Deprecated
    public PopTip setAutoTintIconInLightOrDarkMode(boolean z) {
        setTintIcon(z);
        return this;
    }

    public PopTip setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public PopTip setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopTip setButton(CharSequence charSequence) {
        this.buttonText = charSequence;
        refreshUI();
        return this;
    }

    public PopTip setButtonTextInfo(TextInfo textInfo) {
        this.buttonTextInfo = textInfo;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopTip setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public PopTip setCustomView(OnBindView<PopTip> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public PopTip setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public PopTip setDialogLifecycleCallback(DialogLifecycleCallback<PopTip> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4169me);
        }
        return this;
    }

    public PopTip setDialogXAnimImpl(DialogXAnimInterface<PopTip> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public PopTip setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    public PopTip setEnterAnimResId(int i) {
        this.enterAnimResId = i;
        return this;
    }

    public PopTip setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    public PopTip setExitAnimResId(int i) {
        this.exitAnimResId = i;
        return this;
    }

    public PopTip setHapticFeedbackEnabled(boolean z) {
        this.isHapticFeedbackEnabled = z ? 1 : 0;
        return this;
    }

    public PopTip setIconResId(int i) {
        this.iconResId = i;
        refreshUI();
        return this;
    }

    public PopTip setMargin(int i, int i2, int i3, int i4) {
        int[] iArr = this.bodyMargin;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        refreshUI();
        return this;
    }

    public PopTip setMarginBottom(int i) {
        this.bodyMargin[3] = i;
        refreshUI();
        return this;
    }

    public PopTip setMarginLeft(int i) {
        this.bodyMargin[0] = i;
        refreshUI();
        return this;
    }

    public PopTip setMarginRight(int i) {
        this.bodyMargin[2] = i;
        refreshUI();
        return this;
    }

    public PopTip setMarginTop(int i) {
        this.bodyMargin[1] = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopTip setMessage(CharSequence charSequence) {
        this.message = charSequence;
        refreshUI();
        return this;
    }

    public PopTip setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public PopTip setOnButtonClickListener(OnDialogButtonClickListener<PopTip> onDialogButtonClickListener) {
        this.onButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public PopTip setOnPopTipClickListener(OnDialogButtonClickListener<PopTip> onDialogButtonClickListener) {
        this.onPopTipClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public PopTip setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopTip setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public PopTip setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public PopTip setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    public PopTip setTintIcon(boolean z) {
        this.tintIcon = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    public PopTip showAlways() {
        return noAutoDismiss();
    }

    public PopTip showLong() {
        autoDismiss(3500L);
        if (!this.preShow && !this.isShow) {
            show();
        }
        return this;
    }

    public PopTip showShort() {
        autoDismiss(C8973.AbstractC8977.f30287);
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
    public static PopTip build(DialogXStyle dialogXStyle) {
        return new PopTip().setStyle(dialogXStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static PopTip show(OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(onBindView);
        popTip.show();
        return popTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static PopTip tip(int i) {
        return show(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PopTip onDismiss(DialogXRunnable<PopTip> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PopTip onShow(DialogXRunnable<PopTip> dialogXRunnable) {
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
    public PopTip setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public PopTip setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public static PopTip build(OnBindView<PopTip> onBindView) {
        return new PopTip().setCustomView(onBindView);
    }

    public static PopTip tip(String str, String str2) {
        return show(str, str2);
    }

    public PopTip setButton(int i) {
        this.buttonText = getString(i);
        refreshUI();
        return this;
    }

    public PopTip setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public PopTip setMessage(int i) {
        this.message = getString(i);
        refreshUI();
        return this;
    }

    public PopTip setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public static PopTip show(CharSequence charSequence) {
        PopTip popTip = new PopTip(charSequence);
        popTip.show();
        return popTip;
    }

    public static PopTip tip(int i, int i2) {
        return show(i, i2);
    }

    public static PopTip tip(int i, String str) {
        return show(i, str);
    }

    public PopTip setButton(CharSequence charSequence, OnDialogButtonClickListener<PopTip> onDialogButtonClickListener) {
        this.buttonText = charSequence;
        this.onButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public static PopTip show(int i) {
        PopTip popTip = new PopTip(i);
        popTip.show();
        return popTip;
    }

    public static PopTip tip(int i, String str, String str2) {
        return show(i, str, str2);
    }

    public static PopTip show(CharSequence charSequence, OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(charSequence, onBindView);
        popTip.show();
        return popTip;
    }

    public PopTip setButton(int i, OnDialogButtonClickListener<PopTip> onDialogButtonClickListener) {
        this.buttonText = getString(i);
        this.onButtonClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public PopTip(OnBindView<PopTip> onBindView) {
        this.onBindView = onBindView;
    }

    public static PopTip show(int i, OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(i, onBindView);
        popTip.show();
        return popTip;
    }

    public PopTip setButton(OnDialogButtonClickListener<PopTip> onDialogButtonClickListener) {
        this.onButtonClickListener = onDialogButtonClickListener;
        return this;
    }

    public static PopTip show(CharSequence charSequence, CharSequence charSequence2) {
        PopTip popTip = new PopTip(charSequence, charSequence2);
        popTip.show();
        return popTip;
    }

    public static PopTip show(int i, int i2) {
        PopTip popTip = new PopTip(i, i2);
        popTip.show();
        return popTip;
    }

    public static PopTip show(int i, CharSequence charSequence, OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(i, charSequence, onBindView);
        popTip.show();
        return popTip;
    }

    public PopTip(CharSequence charSequence) {
        this.message = charSequence;
    }

    public static PopTip show(int i, CharSequence charSequence) {
        PopTip popTip = new PopTip(i, charSequence);
        popTip.show();
        return popTip;
    }

    public static PopTip show(int i, CharSequence charSequence, CharSequence charSequence2) {
        PopTip popTip = new PopTip(i, charSequence, charSequence2);
        popTip.show();
        return popTip;
    }

    public static PopTip show(int i, CharSequence charSequence, CharSequence charSequence2, OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(i, charSequence, charSequence2, onBindView);
        popTip.show();
        return popTip;
    }

    public static PopTip show(int i, int i2, int i3, OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(i, i2, i3, onBindView);
        popTip.show();
        return popTip;
    }

    public static PopTip show(CharSequence charSequence, CharSequence charSequence2, OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(charSequence, charSequence2, onBindView);
        popTip.show();
        return popTip;
    }

    public PopTip(int i) {
        this.message = getString(i);
    }

    public static PopTip show(int i, int i2, OnBindView<PopTip> onBindView) {
        PopTip popTip = new PopTip(i, i2, onBindView);
        popTip.show();
        return popTip;
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopTip show() {
        /*
            r6 = this;
            boolean r0 = r6.isHide
            r1 = 0
            if (r0 == 0) goto L13
            android.view.View r0 = r6.getDialogView()
            if (r0 == 0) goto L13
            android.view.View r0 = r6.getDialogView()
            r0.setVisibility(r1)
            return r6
        L13:
            super.beforeShow()
            android.view.View r0 = r6.getDialogView()
            if (r0 != 0) goto L159
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopTip
            if (r0 == 0) goto L40
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L39
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L39
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r0 = (com.kongzue.dialogx.dialogs.PopTip) r0
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L7b
            r0.dismiss()
            goto L7b
        L40:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L7b
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r2 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.<init>(r2)
        L4b:
            int r2 = r0.size()
            if (r1 >= r2) goto L7b
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r2 = (com.kongzue.dialogx.dialogs.PopTip) r2
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            if (r3 >= r4) goto L63
            r2.moveBack()
            goto L78
        L63:
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            int r3 = r3 - r4
            if (r1 > r3) goto L75
            r2.dismiss()
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r3 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r3.remove(r2)
            goto L78
        L75:
            r2.moveBack()
        L78:
            int r1 = r1 + 1
            goto L4b
        L7b:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 != 0) goto L86
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip.popTipList = r0
        L86:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L94
            int r0 = com.kongzue.dialogx.C2413R.layout.layout_dialogx_poptip_material
            goto L96
        L94:
            int r0 = com.kongzue.dialogx.C2413R.layout.layout_dialogx_poptip_material_dark
        L96:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L131
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto Lbc
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        Lbc:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r6.align
            if (r1 != 0) goto Ldd
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            if (r1 != 0) goto Ld1
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
            r6.align = r1
            goto Ldd
        Ld1:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            r6.align = r1
        Ldd:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r2 = r2.popTipSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto L107
            int r3 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterAnimRes
            if (r3 != 0) goto L107
            if (r1 == 0) goto L104
            goto L108
        L104:
            int r1 = com.kongzue.dialogx.C2413R.anim.anim_dialogx_default_enter
            goto L108
        L107:
            r1 = r3
        L108:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto L118
            int r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitAnimRes
            if (r1 != 0) goto L118
            if (r2 == 0) goto L115
            goto L119
        L115:
            int r2 = com.kongzue.dialogx.C2413R.anim.anim_dialogx_default_exit
            goto L119
        L118:
            r2 = r1
        L119:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L125
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterDuration
        L125:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L12f
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitDuration
        L12f:
            r6.exitAnimDuration = r1
        L131:
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L143
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L143:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl
            r1.<init>(r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L155
            com.kongzue.dialogx.dialogs.PopTip r1 = r6.f4169me
            r0.setTag(r1)
        L155:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto L160
        L159:
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        L160:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.dialogs.PopTip.show():com.kongzue.dialogx.dialogs.PopTip");
    }

    public PopTip(int i, CharSequence charSequence) {
        this.iconResId = i;
        this.message = charSequence;
    }

    public PopTip(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.iconResId = i;
        this.message = charSequence;
        this.buttonText = charSequence2;
    }

    public PopTip(int i, int i2, int i3) {
        this.iconResId = i;
        this.message = getString(i2);
        this.buttonText = getString(i3);
    }

    public PopTip(CharSequence charSequence, CharSequence charSequence2) {
        this.message = charSequence;
        this.buttonText = charSequence2;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public com.kongzue.dialogx.dialogs.PopTip show(android.app.Activity r7) {
        /*
            r6 = this;
            super.beforeShow()
            android.view.View r0 = r6.getDialogView()
            if (r0 != 0) goto L147
            boolean r0 = com.kongzue.dialogx.DialogX.onlyOnePopTip
            if (r0 == 0) goto L2d
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r0 = (com.kongzue.dialogx.dialogs.PopTip) r0
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L69
            r0.dismiss()
            goto L69
        L2d:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 == 0) goto L69
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r1 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.<init>(r1)
            r1 = 0
        L39:
            int r2 = r0.size()
            if (r1 >= r2) goto L69
            java.lang.Object r2 = r0.get(r1)
            com.kongzue.dialogx.dialogs.PopTip r2 = (com.kongzue.dialogx.dialogs.PopTip) r2
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            if (r3 >= r4) goto L51
            r2.moveBack()
            goto L66
        L51:
            int r3 = r0.size()
            int r4 = com.kongzue.dialogx.dialogs.PopTip.maxShowCount
            int r3 = r3 - r4
            if (r1 > r3) goto L63
            r2.dismiss()
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r3 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r3.remove(r2)
            goto L66
        L63:
            r2.moveBack()
        L66:
            int r1 = r1 + 1
            goto L39
        L69:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            if (r0 != 0) goto L74
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopTip.popTipList = r0
        L74:
            java.util.List<com.kongzue.dialogx.dialogs.PopTip> r0 = com.kongzue.dialogx.dialogs.PopTip.popTipList
            r0.add(r6)
            boolean r0 = r6.isLightTheme()
            if (r0 == 0) goto L82
            int r0 = com.kongzue.dialogx.C2413R.layout.layout_dialogx_poptip_material
            goto L84
        L82:
            int r0 = com.kongzue.dialogx.C2413R.layout.layout_dialogx_poptip_material_dark
        L84:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            if (r1 == 0) goto L11f
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto Laa
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r0 = r0.popTipSettings()
            boolean r1 = r6.isLightTheme()
            int r0 = r0.layout(r1)
        Laa:
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r6.align
            if (r1 != 0) goto Lcb
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            if (r1 != 0) goto Lbf
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = com.kongzue.dialogx.interfaces.DialogXStyle.PopTipSettings.ALIGN.BOTTOM
            r6.align = r1
            goto Lcb
        Lbf:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN r1 = r1.align()
            r6.align = r1
        Lcb:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r1 = r1.popTipSettings()
            boolean r2 = r6.isLightTheme()
            int r1 = r1.enterAnimResId(r2)
            com.kongzue.dialogx.interfaces.DialogXStyle r2 = r6.style
            com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings r2 = r2.popTipSettings()
            boolean r3 = r6.isLightTheme()
            int r2 = r2.exitAnimResId(r3)
            int r3 = r6.enterAnimResId
            if (r3 != 0) goto Lf5
            int r3 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterAnimRes
            if (r3 != 0) goto Lf5
            if (r1 == 0) goto Lf2
            goto Lf6
        Lf2:
            int r1 = com.kongzue.dialogx.C2413R.anim.anim_dialogx_default_enter
            goto Lf6
        Lf5:
            r1 = r3
        Lf6:
            r6.enterAnimResId = r1
            int r1 = r6.exitAnimResId
            if (r1 != 0) goto L106
            int r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitAnimRes
            if (r1 != 0) goto L106
            if (r2 == 0) goto L103
            goto L107
        L103:
            int r2 = com.kongzue.dialogx.C2413R.anim.anim_dialogx_default_exit
            goto L107
        L106:
            r2 = r1
        L107:
            r6.exitAnimResId = r2
            long r1 = r6.enterAnimDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L113
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideEnterDuration
        L113:
            r6.enterAnimDuration = r1
            long r1 = r6.exitAnimDuration
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L11d
            long r1 = com.kongzue.dialogx.dialogs.PopTip.overrideExitDuration
        L11d:
            r6.exitAnimDuration = r1
        L11f:
            boolean r1 = r6.isLightTheme()
            int r1 = r6.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto L131
            boolean r0 = r6.isLightTheme()
            int r0 = r6.getCustomDialogLayoutResId(r0)
        L131:
            android.view.View r0 = r6.createView(r0)
            com.kongzue.dialogx.dialogs.PopTip$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopTip$DialogImpl
            r1.<init>(r0)
            r6.dialogImpl = r1
            if (r0 == 0) goto L143
            com.kongzue.dialogx.dialogs.PopTip r1 = r6.f4169me
            r0.setTag(r1)
        L143:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r7, r0)
            goto L14e
        L147:
            android.view.View r0 = r6.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r7, r0)
        L14e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kongzue.dialogx.dialogs.PopTip.show(android.app.Activity):com.kongzue.dialogx.dialogs.PopTip");
    }

    public PopTip(int i, int i2) {
        this.message = getString(i);
        this.buttonText = getString(i2);
    }

    public PopTip(CharSequence charSequence, OnBindView<PopTip> onBindView) {
        this.message = charSequence;
        this.onBindView = onBindView;
    }

    public PopTip(int i, OnBindView<PopTip> onBindView) {
        this.message = getString(i);
        this.onBindView = onBindView;
    }

    public PopTip(int i, CharSequence charSequence, OnBindView<PopTip> onBindView) {
        this.iconResId = i;
        this.message = charSequence;
        this.onBindView = onBindView;
    }

    public PopTip(int i, CharSequence charSequence, CharSequence charSequence2, OnBindView<PopTip> onBindView) {
        this.iconResId = i;
        this.message = charSequence;
        this.buttonText = charSequence2;
        this.onBindView = onBindView;
    }

    public PopTip(int i, int i2, int i3, OnBindView<PopTip> onBindView) {
        this.iconResId = i;
        this.message = getString(i2);
        this.buttonText = getString(i3);
        this.onBindView = onBindView;
    }

    public PopTip(CharSequence charSequence, CharSequence charSequence2, OnBindView<PopTip> onBindView) {
        this.message = charSequence;
        this.buttonText = charSequence2;
        this.onBindView = onBindView;
    }

    public PopTip(int i, int i2, OnBindView<PopTip> onBindView) {
        this.message = getString(i);
        this.buttonText = getString(i2);
        this.onBindView = onBindView;
    }
}
