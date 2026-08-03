package com.kongzue.dialogx.dialogs;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LifecycleOwner;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.WaitDialog;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TipDialog extends WaitDialog {
    public static final int NO_AUTO_DISMISS = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WaitDialog show(int i) {
        return show((Activity) null, i);
    }

    public static WaitDialog showTipWithDefaultText(WaitDialog.TYPE type) {
        return WaitDialog.showTipWithDefaultText(type);
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        WaitDialog.dismiss();
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public OnBackgroundMaskClickListener<WaitDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public float getRadius() {
        return this.backgroundRadius;
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public boolean isBkgInterceptTouch() {
        return this.bkgInterceptTouch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ WaitDialog onDismiss(DialogXRunnable dialogXRunnable) {
        return onDismiss((DialogXRunnable<WaitDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ WaitDialog onShow(DialogXRunnable dialogXRunnable) {
        return onShow((DialogXRunnable<WaitDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ WaitDialog setActionRunnable(int i, DialogXRunnable dialogXRunnable) {
        return setActionRunnable(i, (DialogXRunnable<WaitDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ WaitDialog setDialogXAnimImpl(DialogXAnimInterface dialogXAnimInterface) {
        return setDialogXAnimImpl((DialogXAnimInterface<WaitDialog>) dialogXAnimInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ WaitDialog setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        return setOnBackPressedListener((OnBackPressedListener<WaitDialog>) onBackPressedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ WaitDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener onBackgroundMaskClickListener) {
        return setOnBackgroundMaskClickListener((OnBackgroundMaskClickListener<WaitDialog>) onBackgroundMaskClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static WaitDialog show(Activity activity, int i) {
        WaitDialog waitDialog = WaitDialog.getInstance(activity);
        if (waitDialog == null) {
            return WaitDialog.instanceBuild();
        }
        waitDialog.setTip(i, WaitDialog.TYPE.WARNING);
        if (waitDialog.getDialogImpl() == null) {
            waitDialog.show();
        } else {
            waitDialog.cancelDelayDismissTimer();
        }
        return waitDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: appendMessage(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bindDismissWithLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bringToFront()Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAction(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAllAction()Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog onDismiss(DialogXRunnable<WaitDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog onShow(DialogXRunnable<WaitDialog> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setActionRunnable(int i, DialogXRunnable<WaitDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBkgInterceptTouch(Z)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setDialogImplMode(Lcom/kongzue/dialogx/DialogX$IMPL_MODE;)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setDialogXAnimImpl(DialogXAnimInterface<WaitDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxHeight(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxWidth(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinHeight(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinWidth(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setOnBackPressedListener(OnBackPressedListener<WaitDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<WaitDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setRadius(F)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public TipDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public TipDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public TipDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(IZ)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(IIII)Lcom/kongzue/dialogx/dialogs/WaitDialog; */
    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public TipDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public static WaitDialog show(CharSequence charSequence) {
        return show((Activity) null, charSequence);
    }

    public static WaitDialog show(Activity activity, CharSequence charSequence) {
        WaitDialog waitDialog = WaitDialog.getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(charSequence, WaitDialog.TYPE.WARNING);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return WaitDialog.instanceBuild();
    }

    public static WaitDialog show(int i, WaitDialog.TYPE type) {
        return show((Activity) null, i, type);
    }

    public static WaitDialog show(Activity activity, int i, WaitDialog.TYPE type) {
        WaitDialog waitDialog = WaitDialog.getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(i, type);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return WaitDialog.instanceBuild();
    }

    public static WaitDialog show(CharSequence charSequence, WaitDialog.TYPE type) {
        return show((Activity) null, charSequence, type);
    }

    public static WaitDialog show(Activity activity, CharSequence charSequence, WaitDialog.TYPE type) {
        WaitDialog waitDialog = WaitDialog.getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(charSequence, type);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return WaitDialog.instanceBuild();
    }

    public static WaitDialog show(int i, WaitDialog.TYPE type, long j) {
        return show((Activity) null, i, type, j);
    }

    public static WaitDialog show(Activity activity, int i, WaitDialog.TYPE type, long j) {
        WaitDialog waitDialog = WaitDialog.getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(i, type);
            waitDialog.setTipShowDuration(j);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return WaitDialog.instanceBuild();
    }

    public static WaitDialog show(CharSequence charSequence, WaitDialog.TYPE type, long j) {
        return show((Activity) null, charSequence, type, j);
    }

    public static WaitDialog show(Activity activity, CharSequence charSequence, WaitDialog.TYPE type, long j) {
        WaitDialog waitDialog = WaitDialog.getInstance(activity);
        if (waitDialog != null) {
            waitDialog.setTip(charSequence, type);
            waitDialog.setTipShowDuration(j);
            if (waitDialog.getDialogImpl() == null) {
                waitDialog.show();
            } else {
                waitDialog.cancelDelayDismissTimer();
            }
            return waitDialog;
        }
        return WaitDialog.instanceBuild();
    }
}
