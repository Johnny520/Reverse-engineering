package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import Yue.InterfaceC6490;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.BlurViewType;
import com.kongzue.dialogx.interfaces.DialogConvertViewInterface;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.ProgressViewInterface;
import com.kongzue.dialogx.util.TextInfo;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.kongzue.dialogx.util.views.ProgressView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class WaitDialog extends BaseDialog {
    public static BaseDialog.BOOLEAN overrideCancelable = null;
    public static int overrideEnterAnimRes = 0;
    public static int overrideEnterDuration = -1;
    public static int overrideExitAnimRes = 0;
    public static int overrideExitDuration = -1;
    protected int customEnterAnimResId;
    protected int customExitAnimResId;
    protected Timer delayDismissTimer;
    protected WeakReference<DialogImpl> dialogImpl;
    protected DialogLifecycleCallback<WaitDialog> dialogLifecycleCallback;
    private WeakReference<View> dialogView;
    protected DialogXAnimInterface<WaitDialog> dialogXAnimImpl;
    protected CharSequence message;
    protected TextInfo messageTextInfo;
    protected OnBackPressedListener<WaitDialog> onBackPressedListener;
    protected OnBackgroundMaskClickListener<WaitDialog> onBackgroundMaskClickListener;
    protected OnBindView<WaitDialog> onBindView;
    protected BaseDialog.BOOLEAN privateCancelable;
    protected TYPE readyTipType;
    protected boolean bkgInterceptTouch = true;
    protected float backgroundRadius = DialogX.defaultWaitAndTipDialogBackgroundRadius;
    protected long tipShowDuration = 1500;
    protected float waitProgress = -1.0f;
    protected int showType = -1;
    protected Integer maskColor = null;

    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.WaitDialog$7 */
    public static /* synthetic */ class C25397 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE;

        static {
            int[] iArr = new int[TYPE.values().length];
            $SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE = iArr;
            try {
                iArr[TYPE.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE[TYPE.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE[TYPE.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE[TYPE.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum TYPE {
        NONE,
        SUCCESS,
        WARNING,
        ERROR,
        PROGRESSING
    }

    public WaitDialog() {
        this.ownActivity = new WeakReference<>(BaseDialog.getTopActivity());
        this.cancelable = DialogX.cancelableTipDialog;
    }

    public static WaitDialog build() {
        return new WaitDialog();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void dismiss() {
        WaitDialog waitDialog = getInstance();
        if (waitDialog != null) {
            waitDialog.doDismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WaitDialog getInstance() {
        return getInstance(null);
    }

    public static CharSequence getMessage() {
        return m5091me().message;
    }

    public static int getType() {
        return m5091me().showType;
    }

    public static WaitDialog instanceBuild() {
        return new WaitDialog();
    }

    /* JADX INFO: renamed from: me */
    public static WaitDialog m5091me() {
        WaitDialog waitDialog = getInstance();
        return waitDialog == null ? instanceBuild() : waitDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDialogImpl(DialogImpl dialogImpl) {
        WeakReference<DialogImpl> weakReference = this.dialogImpl;
        if (weakReference == null || weakReference.get() == dialogImpl) {
            return;
        }
        this.dialogImpl = new WeakReference<>(dialogImpl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WaitDialog setMessage(CharSequence charSequence) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog == null) {
            return instanceBuild();
        }
        waitDialog.preMessage(charSequence);
        waitDialog.refreshUI();
        return waitDialog;
    }

    public static WaitDialog showTipWithDefaultText(TYPE type) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog == null) {
            return instanceBuild();
        }
        waitDialog.setTip((CharSequence) null, type);
        if (waitDialog.getDialogImpl() == null) {
            waitDialog.show();
        } else {
            waitDialog.cancelDelayDismissTimer();
        }
        return waitDialog;
    }

    public static WaitDialog showWaitWithDefaultText() {
        WaitDialog waitDialog = getInstance();
        if (waitDialog == null) {
            return instanceBuild();
        }
        waitDialog.setTip((CharSequence) null, TYPE.NONE);
        if (waitDialog.getDialogImpl() == null) {
            waitDialog.show();
        } else {
            waitDialog.cancelDelayDismissTimer();
        }
        return waitDialog;
    }

    public WaitDialog appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    public WaitDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    public WaitDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    public void cancelDelayDismissTimer() {
        Timer timer = this.delayDismissTimer;
        if (timer != null) {
            timer.cancel();
        }
    }

    public WaitDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    public WaitDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    public void cleanInstance() {
        this.isShow = false;
        getDialogLifecycleCallback().onDismiss(this);
        setLifecycleState(Lifecycle.State.DESTROYED);
        WeakReference<DialogImpl> weakReference = this.dialogImpl;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.dialogImpl = null;
        WeakReference<View> weakReference2 = this.dialogView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.dialogView = null;
        this.dialogLifecycleCallback = null;
        WeakReference<Activity> weakReference3 = this.ownActivity;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        BaseDialog.m5092gc();
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void doDismiss() {
        this.isShow = false;
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.4
            @Override // java.lang.Runnable
            public void run() {
                if (WaitDialog.this.getDialogImpl() != null) {
                    WaitDialog.this.getDialogImpl().doDismiss(null);
                }
            }
        });
    }

    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    public View getCustomView() {
        OnBindView<WaitDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    public DialogImpl getDialogImpl() {
        WeakReference<DialogImpl> weakReference = this.dialogImpl;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public DialogLifecycleCallback<WaitDialog> getDialogLifecycleCallback() {
        DialogLifecycleCallback<WaitDialog> dialogLifecycleCallback = this.dialogLifecycleCallback;
        return dialogLifecycleCallback == null ? new DialogLifecycleCallback<WaitDialog>() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.6
        } : dialogLifecycleCallback;
    }

    public DialogXAnimInterface<WaitDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public CharSequence getMessageContent() {
        return this.message;
    }

    public TextInfo getMessageTextInfo() {
        return this.messageTextInfo;
    }

    public OnBackPressedListener<WaitDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    public OnBackgroundMaskClickListener<WaitDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    public float getProgress() {
        return this.waitProgress;
    }

    public float getRadius() {
        float f = this.backgroundRadius;
        return f < 0.0f ? dip2px(15.0f) : f;
    }

    public View getWaitDialogView() {
        WeakReference<View> weakReference = this.dialogView;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
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
        return r02 != null ? r02 == BaseDialog.BOOLEAN.TRUE : DialogX.cancelableTipDialog;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isLightTheme() {
        DialogX.THEME theme = DialogX.tipTheme;
        return theme == null ? super.isLightTheme() : theme == DialogX.THEME.LIGHT;
    }

    public WaitDialog onDismiss(DialogXRunnable<WaitDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    public WaitDialog onShow(DialogXRunnable<WaitDialog> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WaitDialog preMessage(CharSequence charSequence) {
        this.message = charSequence;
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
        if (getDialogImpl() == null) {
            return;
        }
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.3
            @Override // java.lang.Runnable
            public void run() {
                if (WaitDialog.this.getDialogImpl() != null) {
                    WaitDialog.this.getDialogImpl().refreshView();
                }
            }
        });
    }

    public WaitDialog removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
        refreshUI();
    }

    public WaitDialog setActionRunnable(int i, DialogXRunnable<WaitDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    public WaitDialog setAnimResId(int i, int i2) {
        this.customEnterAnimResId = i;
        this.customExitAnimResId = i2;
        return this;
    }

    public WaitDialog setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public WaitDialog setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    public WaitDialog setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    public WaitDialog setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WaitDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    public WaitDialog setCustomView(OnBindView<WaitDialog> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    public WaitDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    public WaitDialog setDialogLifecycleCallback(DialogLifecycleCallback<WaitDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(m5091me());
        }
        return this;
    }

    public WaitDialog setDialogXAnimImpl(DialogXAnimInterface<WaitDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    public WaitDialog setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    public WaitDialog setEnterAnimResId(int i) {
        this.customEnterAnimResId = i;
        return this;
    }

    public WaitDialog setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    public WaitDialog setExitAnimResId(int i) {
        this.customExitAnimResId = i;
        return this;
    }

    public WaitDialog setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    public WaitDialog setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    public WaitDialog setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WaitDialog setMessageContent(CharSequence charSequence) {
        this.message = charSequence;
        refreshUI();
        return this;
    }

    public WaitDialog setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public WaitDialog setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    public WaitDialog setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    public WaitDialog setOnBackPressedListener(OnBackPressedListener<WaitDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        refreshUI();
        return this;
    }

    public WaitDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<WaitDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    public WaitDialog setProgress(float f) {
        this.waitProgress = f;
        refreshUI();
        return this;
    }

    public WaitDialog setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WaitDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    public WaitDialog setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    public WaitDialog setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTip(TYPE type) {
        showTip(type);
    }

    public void setTipShowDuration(long j) {
        this.tipShowDuration = j;
        showTip(this.readyTipType);
    }

    public WaitDialog setTipType(TYPE type) {
        showTip(type);
        return this;
    }

    public void setWaitDialogView(View view) {
        this.dialogView = new WeakReference<>(view);
        setDialogView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void showTip(CharSequence charSequence, TYPE type) {
        this.showType = type.ordinal();
        this.message = charSequence;
        this.readyTipType = type;
        show();
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static WaitDialog getInstance(Activity activity) {
        if (activity == null) {
            activity = BaseDialog.getTopActivity();
        }
        if (BaseDialog.isActivityDestroyed(activity)) {
            return null;
        }
        for (BaseDialog baseDialog : BaseDialog.getRunningDialogList()) {
            if ((baseDialog instanceof WaitDialog) && baseDialog.isShow() && baseDialog.getOwnActivity() == activity) {
                return (WaitDialog) baseDialog;
            }
        }
        return new WaitDialog();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static WaitDialog show(CharSequence charSequence) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog == null) {
            return instanceBuild();
        }
        waitDialog.setTip(charSequence, TYPE.NONE);
        if (waitDialog.getDialogImpl() == null) {
            waitDialog.show();
        } else {
            waitDialog.cancelDelayDismissTimer();
        }
        return waitDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public WaitDialog preMessage(int i) {
        this.message = getString(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public WaitDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public WaitDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public WaitDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTip(CharSequence charSequence, TYPE type) {
        this.message = charSequence;
        showTip(type);
        refreshUI();
    }

    public class DialogImpl implements DialogConvertViewInterface {
        public MaxRelativeLayout bkg;
        private List<View> blurViews;
        public RelativeLayout boxCustomView;
        public RelativeLayout boxProgress;
        public DialogXBaseRelativeLayout boxRoot;
        private int layoutResId;
        private float oldProgress = -1.0f;
        public ProgressViewInterface progressView;
        public TextView txtInfo;

        /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl$8 */
        public class RunnableC25478 implements Runnable {
            final /* synthetic */ TYPE val$tip;

            public RunnableC25478(TYPE type) {
                this.val$tip = type;
            }

            @Override // java.lang.Runnable
            public void run() {
                WaitDialog.this.showType = this.val$tip.ordinal();
                if (DialogImpl.this.progressView == null) {
                    return;
                }
                int i = C25397.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE[this.val$tip.ordinal()];
                if (i == 1) {
                    DialogImpl.this.progressView.warning();
                } else if (i == 2) {
                    DialogImpl.this.progressView.success();
                } else if (i == 3) {
                    DialogImpl.this.progressView.error();
                } else if (i == 4) {
                    DialogImpl.this.progressView.loading();
                    return;
                }
                RelativeLayout relativeLayout = DialogImpl.this.boxProgress;
                if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                    DialogImpl.this.progressView.whenShowTick(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            WaitDialog.this.getDialogLifecycleCallback().onShow(WaitDialog.this);
                            DialogImpl.this.refreshView();
                            DialogImpl dialogImpl = DialogImpl.this;
                            if (WaitDialog.this.tipShowDuration > 0) {
                                ((View) dialogImpl.progressView).postDelayed(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.8.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        DialogImpl dialogImpl2 = DialogImpl.this;
                                        if (WaitDialog.this.showType > -1) {
                                            dialogImpl2.doDismiss(null);
                                        }
                                    }
                                }, WaitDialog.this.tipShowDuration);
                            }
                        }
                    });
                    return;
                }
                WaitDialog.this.getDialogLifecycleCallback().onShow(WaitDialog.this);
                DialogImpl.this.refreshView();
                if (WaitDialog.this.tipShowDuration > 0) {
                    BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.8.2
                        @Override // java.lang.Runnable
                        public void run() {
                            DialogImpl dialogImpl = DialogImpl.this;
                            if (WaitDialog.this.showType > -1) {
                                dialogImpl.doDismiss(null);
                            }
                        }
                    }, WaitDialog.this.tipShowDuration);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DialogImpl(int i) {
            this.layoutResId = WaitDialog.this.getCustomDialogLayoutResId(WaitDialog.this.isLightTheme()) != 0 ? WaitDialog.this.getCustomDialogLayoutResId(WaitDialog.this.isLightTheme()) : i;
        }

        private CharSequence getDefaultTipText(TYPE type) {
            int i = C25397.$SwitchMap$com$kongzue$dialogx$dialogs$WaitDialog$TYPE[type.ordinal()];
            if (i == 1) {
                return DialogX.defaultTipDialogWarningText;
            }
            if (i == 2) {
                return DialogX.defaultTipDialogSuccessText;
            }
            if (i == 3) {
                return DialogX.defaultTipDialogErrorText;
            }
            if (i != 4) {
                return null;
            }
            return DialogX.defaultWaitDialogWaitingText;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(final View view) {
            BaseDialog baseDialog = WaitDialog.this;
            if (baseDialog.preDismiss(baseDialog) || this.boxRoot == null || WaitDialog.this.getOwnActivity() == null || ((BaseDialog) WaitDialog.this).dismissAnimFlag || this.boxRoot == null) {
                return;
            }
            ((BaseDialog) WaitDialog.this).dismissAnimFlag = true;
            this.boxRoot.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    View view2 = view;
                    if (view2 != null) {
                        view2.setEnabled(false);
                    }
                    DialogXAnimInterface<WaitDialog> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                    DialogImpl dialogImpl = DialogImpl.this;
                    dialogXAnimImpl.doExitAnim(WaitDialog.this, dialogImpl.bkg);
                    BaseDialog.runOnMainDelay(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogImpl.this.boxRoot;
                            if (dialogXBaseRelativeLayout != null) {
                                dialogXBaseRelativeLayout.setVisibility(8);
                            }
                            BaseDialog.dismiss(WaitDialog.this.getWaitDialogView());
                        }
                    }, DialogImpl.this.getExitAnimationDuration(null));
                }
            });
        }

        public DialogXAnimInterface<WaitDialog> getDialogXAnimImpl() {
            WaitDialog waitDialog = WaitDialog.this;
            if (waitDialog.dialogXAnimImpl == null) {
                waitDialog.dialogXAnimImpl = new DialogXAnimInterface<WaitDialog>() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doExitAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doExitAnim(WaitDialog waitDialog2, ViewGroup viewGroup) {
                        Context ownActivity = WaitDialog.this.getOwnActivity();
                        if (ownActivity == null) {
                            ownActivity = DialogImpl.this.boxRoot.getContext();
                        }
                        if (ownActivity == null) {
                            return;
                        }
                        int i = C2413R.anim.anim_dialogx_default_exit;
                        int i2 = WaitDialog.overrideExitAnimRes;
                        if (i2 != 0) {
                            i = i2;
                        }
                        int i3 = WaitDialog.this.customExitAnimResId;
                        if (i3 != 0) {
                            i = i3;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(ownActivity, i);
                        long exitAnimationDuration = DialogImpl.this.getExitAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setDuration(exitAnimationDuration);
                        animationLoadAnimation.setInterpolator(new AccelerateInterpolator());
                        DialogImpl.this.bkg.startAnimation(animationLoadAnimation);
                        DialogImpl.this.boxRoot.animate().alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(exitAnimationDuration);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setDuration(exitAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.7.2
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogImpl.this.boxRoot;
                                if (dialogXBaseRelativeLayout != null) {
                                    dialogXBaseRelativeLayout.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: doShowAnim(Ljava/lang/Object;Landroid/view/ViewGroup;)V */
                    @Override // com.kongzue.dialogx.interfaces.DialogXAnimInterface
                    public void doShowAnim(WaitDialog waitDialog2, ViewGroup viewGroup) {
                        int i = C2413R.anim.anim_dialogx_default_enter;
                        int i2 = WaitDialog.overrideEnterAnimRes;
                        if (i2 != 0) {
                            i = i2;
                        }
                        WaitDialog waitDialog3 = WaitDialog.this;
                        int i3 = waitDialog3.customEnterAnimResId;
                        if (i3 != 0) {
                            i = i3;
                        }
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(waitDialog3.getOwnActivity(), i);
                        long enterAnimationDuration = DialogImpl.this.getEnterAnimationDuration(animationLoadAnimation);
                        animationLoadAnimation.setInterpolator(new DecelerateInterpolator());
                        animationLoadAnimation.setDuration(enterAnimationDuration);
                        DialogImpl.this.bkg.startAnimation(animationLoadAnimation);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(enterAnimationDuration);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.7.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogImpl.this.boxRoot.setBkgAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        valueAnimatorOfFloat.start();
                        DialogImpl.this.boxRoot.animate().setDuration(enterAnimationDuration).alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setListener(null);
                    }
                };
            }
            return WaitDialog.this.dialogXAnimImpl;
        }

        public long getEnterAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.bkg.getAnimation() != null) {
                animation = this.bkg.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            int i = WaitDialog.overrideEnterDuration;
            if (i >= 0) {
                duration = i;
            }
            return ((BaseDialog) WaitDialog.this).enterAnimDuration >= 0 ? ((BaseDialog) WaitDialog.this).enterAnimDuration : duration;
        }

        public long getExitAnimationDuration(@InterfaceC6490 Animation animation) {
            if (animation == null && this.bkg.getAnimation() != null) {
                animation = this.bkg.getAnimation();
            }
            long duration = (animation == null || animation.getDuration() == 0) ? 300L : animation.getDuration();
            int i = WaitDialog.overrideExitDuration;
            if (i >= 0) {
                duration = i;
            }
            return ((BaseDialog) WaitDialog.this).exitAnimDuration != -1 ? ((BaseDialog) WaitDialog.this).exitAnimDuration : duration;
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
            if (WaitDialog.this.getDialogView() != null) {
                WaitDialog.this.getDialogView().setTranslationZ(WaitDialog.this.getThisOrderIndex());
            }
            WaitDialog waitDialog = WaitDialog.this;
            if (waitDialog.messageTextInfo == null) {
                waitDialog.messageTextInfo = DialogX.tipTextInfo;
            }
            if (((BaseDialog) waitDialog).backgroundColor == null) {
                ((BaseDialog) WaitDialog.this).backgroundColor = DialogX.tipBackgroundColor;
            }
            WaitDialog waitDialog2 = WaitDialog.this;
            this.blurViews = waitDialog2.findAllBlurView((View) waitDialog2.dialogView.get());
            WaitDialog waitDialog3 = WaitDialog.this;
            Integer numValueOf = Integer.valueOf(waitDialog3.getColor(waitDialog3.isLightTheme() ? C2413R.color.dialogxWaitBkgDark : C2413R.color.dialogxWaitBkgLight));
            Float fValueOf = Float.valueOf(WaitDialog.this.dip2px(15.0f));
            if (((BaseDialog) WaitDialog.this).style.overrideWaitTipRes() != null) {
                fValueOf = WaitDialog.this.getFloatStyleAttr(Float.valueOf(((BaseDialog) r2).style.overrideWaitTipRes().overrideRadiusPx()), fValueOf);
                WaitDialog waitDialog4 = WaitDialog.this;
                numValueOf = waitDialog4.getColorNullable(waitDialog4.getIntStyleAttr(Integer.valueOf(((BaseDialog) waitDialog4).style.overrideWaitTipRes().overrideBackgroundColorRes(WaitDialog.this.isLightTheme())), Integer.valueOf(WaitDialog.this.isLightTheme() ? C2413R.color.dialogxWaitBkgDark : C2413R.color.dialogxWaitBkgLight)), numValueOf);
            }
            List<View> list = this.blurViews;
            if (list != null) {
                Iterator<View> it = list.iterator();
                while (it.hasNext()) {
                    BlurViewType blurViewType = (BlurViewType) ((View) it.next());
                    blurViewType.setOverlayColor(((BaseDialog) WaitDialog.this).backgroundColor == null ? numValueOf : ((BaseDialog) WaitDialog.this).backgroundColor);
                    blurViewType.setRadiusPx(fValueOf);
                }
            } else {
                GradientDrawable gradientDrawable = (GradientDrawable) WaitDialog.this.getResources().getDrawable(C2413R.drawable.rect_dialogx_material_wait_bkg);
                gradientDrawable.setColor(numValueOf.intValue());
                gradientDrawable.setCornerRadius(fValueOf.floatValue());
                this.bkg.setBackground(gradientDrawable);
            }
            this.boxRoot.setClickable(true);
            this.boxRoot.setParentDialog(WaitDialog.this);
            this.boxRoot.setOnLifecycleCallBack(new DialogXBaseRelativeLayout.OnLifecycleCallBack() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.1
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onDismiss() {
                    WaitDialog.this.cleanInstance();
                }

                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.OnLifecycleCallBack
                public void onShow() {
                    ((BaseDialog) WaitDialog.this).isShow = true;
                    ((BaseDialog) WaitDialog.this).preShow = false;
                    WaitDialog.this.setLifecycleState(Lifecycle.State.CREATED);
                    DialogImpl.this.boxRoot.setAlpha(0.0f);
                    DialogImpl.this.bkg.post(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (WaitDialog.this.getOwnActivity() == null) {
                                return;
                            }
                            DialogXAnimInterface<WaitDialog> dialogXAnimImpl = DialogImpl.this.getDialogXAnimImpl();
                            DialogImpl dialogImpl = DialogImpl.this;
                            dialogXAnimImpl.doShowAnim(WaitDialog.this, dialogImpl.bkg);
                            WaitDialog.this.onDialogShow();
                            WaitDialog.this.getDialogLifecycleCallback().onShow(WaitDialog.this);
                            WaitDialog.this.setLifecycleState(Lifecycle.State.RESUMED);
                        }
                    });
                }
            });
            TYPE type = WaitDialog.this.readyTipType;
            if (type != null && type != TYPE.NONE) {
                this.progressView.noLoading();
                ((View) this.progressView).postDelayed(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DialogImpl dialogImpl = DialogImpl.this;
                        dialogImpl.showTip(WaitDialog.this.readyTipType);
                    }
                }, 100L);
            }
            this.boxRoot.setOnBackPressedListener(new DialogXBaseRelativeLayout.PrivateBackPressedListener() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.3
                @Override // com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.PrivateBackPressedListener
                public boolean onBackPressed() {
                    WaitDialog waitDialog5 = WaitDialog.this;
                    OnBackPressedListener<WaitDialog> onBackPressedListener = waitDialog5.onBackPressedListener;
                    if (onBackPressedListener != null) {
                        if (!onBackPressedListener.onBackPressed(waitDialog5)) {
                            return true;
                        }
                        WaitDialog.dismiss();
                        return true;
                    }
                    if (!waitDialog5.isCancelable()) {
                        return true;
                    }
                    WaitDialog.dismiss();
                    return true;
                }
            });
            WaitDialog.this.onDialogInit();
        }

        public void lazyCreate() {
            View viewCreateView = WaitDialog.this.createView(this.layoutResId);
            if (viewCreateView == null) {
                return;
            }
            WaitDialog.this.setWaitDialogView(viewCreateView);
            this.boxRoot = (DialogXBaseRelativeLayout) viewCreateView.findViewById(C2413R.id.box_root);
            this.bkg = (MaxRelativeLayout) viewCreateView.findViewById(C2413R.id.bkg);
            this.boxProgress = (RelativeLayout) viewCreateView.findViewById(C2413R.id.box_progress);
            View progressView = (View) ((BaseDialog) WaitDialog.this).style.overrideWaitTipRes().overrideWaitView(WaitDialog.this.getOwnActivity(), WaitDialog.this.isLightTheme());
            if (progressView == null) {
                progressView = new ProgressView(WaitDialog.this.getOwnActivity());
            }
            this.progressView = (ProgressViewInterface) progressView;
            this.boxProgress.addView(progressView, new RelativeLayout.LayoutParams(-1, -1));
            this.boxCustomView = (RelativeLayout) viewCreateView.findViewById(C2413R.id.box_customView);
            this.txtInfo = (TextView) viewCreateView.findViewById(C2413R.id.txt_info);
            this.blurViews = WaitDialog.this.findAllBlurView(viewCreateView);
            init();
            WaitDialog.this.setDialogImpl(this);
            refreshView();
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
            if (this.boxRoot == null || WaitDialog.this.getOwnActivity() == null) {
                return;
            }
            this.boxRoot.setAutoUnsafePlacePadding(WaitDialog.this.isEnableImmersiveMode());
            this.boxRoot.setRootPadding(((BaseDialog) WaitDialog.this).screenPaddings[0], ((BaseDialog) WaitDialog.this).screenPaddings[1], ((BaseDialog) WaitDialog.this).screenPaddings[2], ((BaseDialog) WaitDialog.this).screenPaddings[3]);
            this.bkg.setMaxWidth(WaitDialog.this.getMaxWidth());
            this.bkg.setMaxHeight(WaitDialog.this.getMaxHeight());
            this.bkg.setMinWidth(WaitDialog.this.getMinWidth());
            this.bkg.setMinHeight(WaitDialog.this.getMinHeight());
            if (((BaseDialog) WaitDialog.this).backgroundColor != null) {
                List<View> list = this.blurViews;
                if (list != null) {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        ((BlurViewType) ((View) it.next())).setOverlayColor(((BaseDialog) WaitDialog.this).backgroundColor);
                    }
                } else {
                    GradientDrawable gradientDrawable = (GradientDrawable) WaitDialog.this.getResources().getDrawable(C2413R.drawable.rect_dialogx_material_wait_bkg);
                    gradientDrawable.setColor(WaitDialog.this.getBackgroundColor());
                    gradientDrawable.setCornerRadius(WaitDialog.this.getRadius());
                    this.bkg.setBackground(gradientDrawable);
                }
            }
            if (((BaseDialog) WaitDialog.this).style.overrideWaitTipRes() != null) {
                WaitDialog waitDialog = WaitDialog.this;
                int iIntValue = waitDialog.getIntStyleAttr(Integer.valueOf(((BaseDialog) waitDialog).style.overrideWaitTipRes().overrideTextColorRes(WaitDialog.this.isLightTheme())), Integer.valueOf(WaitDialog.this.isLightTheme() ? C2413R.color.white : C2413R.color.black)).intValue();
                this.txtInfo.setTextColor(WaitDialog.this.getResources().getColor(iIntValue));
                this.progressView.setColor(WaitDialog.this.getResources().getColor(iIntValue));
            } else {
                int i = WaitDialog.this.isLightTheme() ? C2413R.color.white : C2413R.color.black;
                this.txtInfo.setTextColor(WaitDialog.this.getResources().getColor(i));
                this.progressView.setColor(WaitDialog.this.getResources().getColor(i));
            }
            Integer num = DialogX.tipProgressColor;
            if (num != null) {
                this.progressView.setColor(num.intValue());
            }
            float f = WaitDialog.this.waitProgress;
            if (f >= 0.0f && f <= 1.0f && this.oldProgress != f) {
                this.progressView.progress(f);
                this.oldProgress = WaitDialog.this.waitProgress;
            }
            if (WaitDialog.this.backgroundRadius > -1.0f) {
                this.bkg.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.4
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), WaitDialog.this.backgroundRadius);
                    }
                });
                this.bkg.setClipToOutline(true);
                List<View> list2 = this.blurViews;
                if (list2 != null) {
                    Iterator<View> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((BlurViewType) ((View) it2.next())).setRadiusPx(Float.valueOf(WaitDialog.this.backgroundRadius));
                    }
                }
            }
            WaitDialog waitDialog2 = WaitDialog.this;
            TextView textView = this.txtInfo;
            CharSequence defaultTipText = waitDialog2.message;
            if (defaultTipText == null) {
                defaultTipText = getDefaultTipText(waitDialog2.readyTipType);
            }
            waitDialog2.showText(textView, defaultTipText);
            BaseDialog.useTextInfo(this.txtInfo, WaitDialog.this.messageTextInfo);
            Integer num2 = WaitDialog.this.maskColor;
            if (num2 != null) {
                this.boxRoot.setBackgroundColor(num2.intValue());
            }
            OnBindView<WaitDialog> onBindView = WaitDialog.this.onBindView;
            if (onBindView == null || onBindView.getCustomView() == null) {
                this.boxCustomView.setVisibility(8);
                this.boxProgress.setVisibility(0);
            } else {
                WaitDialog waitDialog3 = WaitDialog.this;
                waitDialog3.onBindView.bindParent(this.boxCustomView, waitDialog3);
                this.boxCustomView.setVisibility(0);
                this.boxProgress.setVisibility(8);
            }
            WaitDialog waitDialog4 = WaitDialog.this;
            if (!waitDialog4.bkgInterceptTouch) {
                this.boxRoot.setClickable(false);
            } else if (waitDialog4.isCancelable()) {
                this.boxRoot.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.DialogImpl.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        WaitDialog waitDialog5 = WaitDialog.this;
                        OnBackgroundMaskClickListener<WaitDialog> onBackgroundMaskClickListener = waitDialog5.onBackgroundMaskClickListener;
                        if (onBackgroundMaskClickListener == null || !onBackgroundMaskClickListener.onClick(waitDialog5, view)) {
                            DialogImpl.this.doDismiss(view);
                        }
                    }
                });
            } else {
                this.boxRoot.setOnClickListener(null);
            }
            WaitDialog.this.onDialogRefreshUI();
        }

        public void showTip(TYPE type) {
            BaseDialog.runOnMain(new RunnableC25478(type));
        }

        public DialogImpl(View view) {
            if (view == null) {
                return;
            }
            WaitDialog.this.setDialogView(view);
            this.boxRoot = (DialogXBaseRelativeLayout) view.findViewById(C2413R.id.box_root);
            this.bkg = (MaxRelativeLayout) view.findViewById(C2413R.id.bkg);
            this.boxProgress = (RelativeLayout) view.findViewById(C2413R.id.box_progress);
            View progressView = (View) ((BaseDialog) WaitDialog.this).style.overrideWaitTipRes().overrideWaitView(WaitDialog.this.getOwnActivity(), WaitDialog.this.isLightTheme());
            progressView = progressView == null ? new ProgressView(WaitDialog.this.getOwnActivity()) : progressView;
            this.progressView = (ProgressViewInterface) progressView;
            this.boxProgress.addView(progressView, new RelativeLayout.LayoutParams(-1, -1));
            this.boxCustomView = (RelativeLayout) view.findViewById(C2413R.id.box_customView);
            this.txtInfo = (TextView) view.findViewById(C2413R.id.txt_info);
            init();
            WaitDialog.this.setDialogImpl(this);
            refreshView();
        }
    }

    public static void dismiss(Activity activity) {
        WaitDialog waitDialog = getInstance(activity);
        if (waitDialog != null) {
            waitDialog.doDismiss();
        }
    }

    public void doDismiss(long j) {
        cancelDelayDismissTimer();
        Timer timer = new Timer();
        this.delayDismissTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                WaitDialog.this.doDismiss();
            }
        }, j);
    }

    public WaitDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    public WaitDialog setMessageContent(int i) {
        this.message = getString(i);
        refreshUI();
        return this;
    }

    public WaitDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public static void dismiss(long j) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog != null) {
            waitDialog.doDismiss(j);
        }
    }

    public static WaitDialog setMessage(int i) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog != null) {
            waitDialog.preMessage(i);
            waitDialog.refreshUI();
            return waitDialog;
        }
        return instanceBuild();
    }

    public void setTip(int i, TYPE type) {
        this.message = getString(i);
        showTip(type);
        refreshUI();
    }

    public void showTip(Activity activity, CharSequence charSequence, TYPE type) {
        this.showType = type.ordinal();
        this.message = charSequence;
        this.readyTipType = type;
        show(activity);
    }

    public static WaitDialog show(Activity activity, CharSequence charSequence) {
        WaitDialog waitDialog = getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(charSequence, TYPE.NONE);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public void showTip(int i, TYPE type) {
        this.showType = type.ordinal();
        this.message = getString(i);
        this.readyTipType = type;
        show();
    }

    public void showTip(Activity activity, int i, TYPE type) {
        this.showType = type.ordinal();
        this.message = getString(i);
        this.readyTipType = type;
        show(activity);
    }

    public static WaitDialog show(int i) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog != null) {
            waitDialog.setTip(i, TYPE.NONE);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public void showTip(TYPE type) {
        if (this.readyTipType == type) {
            return;
        }
        this.showType = type.ordinal();
        this.readyTipType = type;
        if (getDialogImpl() != null) {
            getDialogImpl().showTip(type);
        }
    }

    public static WaitDialog show(Activity activity, int i) {
        WaitDialog waitDialog = getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(i, TYPE.NONE);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public static WaitDialog show(CharSequence charSequence, float f) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog != null) {
            waitDialog.setTip(charSequence, TYPE.PROGRESSING);
            waitDialog.setProgress(f);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public static WaitDialog show(Activity activity, CharSequence charSequence, float f) {
        WaitDialog waitDialog = getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(charSequence, TYPE.PROGRESSING);
            waitDialog.setProgress(f);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public static WaitDialog show(int i, float f) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog != null) {
            waitDialog.setTip(i, TYPE.PROGRESSING);
            waitDialog.setProgress(f);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public static WaitDialog show(Activity activity, int i, float f) {
        WaitDialog waitDialog = getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(i, TYPE.PROGRESSING);
            waitDialog.setProgress(f);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public static WaitDialog show(Activity activity, float f) {
        WaitDialog waitDialog = getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(TYPE.PROGRESSING);
            waitDialog.setProgress(f);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    public static WaitDialog show(float f) {
        WaitDialog waitDialog = getInstance();
        if (waitDialog != null) {
            waitDialog.setTip(TYPE.PROGRESSING);
            waitDialog.setProgress(f);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return instanceBuild();
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public WaitDialog show() {
        super.beforeShow();
        BaseDialog.runOnMain(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.1
            @Override // java.lang.Runnable
            public void run() {
                int iOverrideWaitLayout = C2413R.layout.layout_dialogx_wait;
                if (((BaseDialog) WaitDialog.this).style.overrideWaitTipRes() != null && ((BaseDialog) WaitDialog.this).style.overrideWaitTipRes().overrideWaitLayout(WaitDialog.this.isLightTheme()) != 0) {
                    iOverrideWaitLayout = ((BaseDialog) WaitDialog.this).style.overrideWaitTipRes().overrideWaitLayout(WaitDialog.this.isLightTheme());
                }
                WaitDialog.this.dialogImpl = new WeakReference<>(WaitDialog.this.new DialogImpl(iOverrideWaitLayout));
                if (WaitDialog.this.getDialogImpl() != null) {
                    WaitDialog.this.getDialogImpl().lazyCreate();
                    if (WaitDialog.this.getWaitDialogView() != null) {
                        WaitDialog.this.getWaitDialogView().setTag(WaitDialog.this);
                        BaseDialog.show(WaitDialog.this.getWaitDialogView());
                    }
                }
            }
        });
        return this;
    }

    public WaitDialog show(final Activity activity) {
        super.beforeShow();
        activity.runOnUiThread(new Runnable() { // from class: com.kongzue.dialogx.dialogs.WaitDialog.2
            @Override // java.lang.Runnable
            public void run() {
                int iOverrideWaitLayout = C2413R.layout.layout_dialogx_wait;
                if (((BaseDialog) WaitDialog.this).style.overrideWaitTipRes() != null && ((BaseDialog) WaitDialog.this).style.overrideWaitTipRes().overrideWaitLayout(WaitDialog.this.isLightTheme()) != 0) {
                    iOverrideWaitLayout = ((BaseDialog) WaitDialog.this).style.overrideWaitTipRes().overrideWaitLayout(WaitDialog.this.isLightTheme());
                }
                WaitDialog.this.dialogImpl = new WeakReference<>(WaitDialog.this.new DialogImpl(iOverrideWaitLayout));
                if (WaitDialog.this.getDialogImpl() != null) {
                    WaitDialog.this.getDialogImpl().lazyCreate();
                    if (WaitDialog.this.getWaitDialogView() != null) {
                        WaitDialog.this.getWaitDialogView().setTag(WaitDialog.this);
                        BaseDialog.show(activity, WaitDialog.this.getWaitDialogView());
                    }
                }
            }
        });
        return this;
    }
}
