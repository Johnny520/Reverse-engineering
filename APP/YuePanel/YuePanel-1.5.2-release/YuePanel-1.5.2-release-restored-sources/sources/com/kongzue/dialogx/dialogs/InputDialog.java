package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import Yue.InterfaceC3906;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LifecycleOwner;
import android.view.View;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.kongzue.dialogx.util.InputInfo;
import com.kongzue.dialogx.util.TextInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class InputDialog extends MessageDialog {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputDialog() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InputDialog build() {
        return new InputDialog();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InputDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        InputDialog inputDialog = new InputDialog(charSequence, charSequence2, charSequence3);
        inputDialog.show();
        return inputDialog;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public int getBackgroundColor() {
        return this.backgroundColor.intValue();
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public int getButtonOrientation() {
        return this.buttonOrientation;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getCancelButton() {
        return this.cancelText;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getCancelTextInfo() {
        return this.cancelTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public View getCustomView() {
        OnBindView<MessageDialog> onBindView = this.onBindView;
        if (onBindView == null) {
            return null;
        }
        return onBindView.getCustomView();
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public DialogXAnimInterface<MessageDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public long getEnterAnimDuration() {
        return this.enterAnimDuration;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public long getExitAnimDuration() {
        return this.exitAnimDuration;
    }

    public OnInputDialogButtonClickListener getInputCancelButtonClickListener() {
        return (OnInputDialogButtonClickListener) this.cancelButtonClickListener;
    }

    public String getInputHintText() {
        return this.inputHintText;
    }

    public InputInfo getInputInfo() {
        return this.inputInfo;
    }

    public OnInputDialogButtonClickListener<InputDialog> getInputOkButtonClickListener() {
        return (OnInputDialogButtonClickListener) this.okButtonClickListener;
    }

    public OnInputDialogButtonClickListener getInputOtherButtonClickListener() {
        return (OnInputDialogButtonClickListener) this.otherButtonClickListener;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public String getInputText() {
        return (getDialogImpl() == null || getDialogImpl().txtInput == null) ? this.inputText : getDialogImpl().txtInput.getText().toString();
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getMessage() {
        return this.message;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getMessageTextInfo() {
        return this.messageTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getOkButton() {
        return this.okText;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getOkTextInfo() {
        return this.okTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public OnBackPressedListener<MessageDialog> getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public OnBackgroundMaskClickListener<MessageDialog> getOnBackgroundMaskClickListener() {
        return this.onBackgroundMaskClickListener;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getOtherButton() {
        return this.otherText;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getOtherTextInfo() {
        return this.otherTextInfo;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public CharSequence getTitle() {
        return this.title;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public TextInfo getTitleTextInfo() {
        return this.titleTextInfo;
    }

    public boolean isAutoShowInputKeyboard() {
        return this.autoShowInputKeyboard;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public boolean isBkgInterceptTouch() {
        return this.bkgInterceptTouch;
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
        BaseDialog.BOOLEAN r0 = this.privateCancelable;
        if (r0 != null) {
            return r0 == BaseDialog.BOOLEAN.TRUE;
        }
        BaseDialog.BOOLEAN r02 = MessageDialog.overrideCancelable;
        return r02 != null ? r02 == BaseDialog.BOOLEAN.TRUE : this.cancelable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog onDismiss(DialogXRunnable dialogXRunnable) {
        return onDismiss((DialogXRunnable<MessageDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog onShow(DialogXRunnable dialogXRunnable) {
        return onShow((DialogXRunnable<MessageDialog>) dialogXRunnable);
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
        if (getDialogView() != null) {
            BaseDialog.dismiss(getDialogView());
            this.isShow = false;
        }
        if (getDialogImpl().boxCustom != null) {
            getDialogImpl().boxCustom.removeAllViews();
        }
        int customDialogLayoutResId = getCustomDialogLayoutResId(isLightTheme()) != 0 ? getCustomDialogLayoutResId(isLightTheme()) : this.style.layout(isLightTheme());
        if (customDialogLayoutResId == 0) {
            customDialogLayoutResId = isLightTheme() ? C2413R.layout.layout_dialogx_material : C2413R.layout.layout_dialogx_material_dark;
        }
        String inputText = getInputText();
        this.enterAnimDuration = 0L;
        View viewCreateView = createView(customDialogLayoutResId);
        this.dialogImpl = new MessageDialog.DialogImpl(viewCreateView);
        if (viewCreateView != null) {
            viewCreateView.setTag(this.f4164me);
        }
        BaseDialog.show(viewCreateView);
        setInputText(inputText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setActionRunnable(int i, DialogXRunnable dialogXRunnable) {
        return setActionRunnable(i, (DialogXRunnable<MessageDialog>) dialogXRunnable);
    }

    public InputDialog setAutoShowInputKeyboard(boolean z) {
        this.autoShowInputKeyboard = z;
        return this;
    }

    public InputDialog setCancelButtonClickListener(OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.cancelButtonClickListener = onInputDialogButtonClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setCustomView(OnBindView onBindView) {
        return setCustomView((OnBindView<MessageDialog>) onBindView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setDialogLifecycleCallback(DialogLifecycleCallback dialogLifecycleCallback) {
        return setDialogLifecycleCallback((DialogLifecycleCallback<MessageDialog>) dialogLifecycleCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setDialogXAnimImpl(DialogXAnimInterface dialogXAnimInterface) {
        return setDialogXAnimImpl((DialogXAnimInterface<MessageDialog>) dialogXAnimInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputDialog setInputHintText(String str) {
        this.inputHintText = str;
        refreshUI();
        return this;
    }

    public InputDialog setInputInfo(InputInfo inputInfo) {
        this.inputInfo = inputInfo;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputDialog setInputText(String str) {
        this.inputText = str;
        refreshUI();
        return this;
    }

    public InputDialog setOkButtonClickListener(OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.okButtonClickListener = onInputDialogButtonClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        return setOnBackPressedListener((OnBackPressedListener<MessageDialog>) onBackPressedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ MessageDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener onBackgroundMaskClickListener) {
        return setOnBackgroundMaskClickListener((OnBackgroundMaskClickListener<MessageDialog>) onBackgroundMaskClickListener);
    }

    public InputDialog setOtherButtonClickListener(OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.otherButtonClickListener = onInputDialogButtonClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public InputDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.cancelable = DialogX.cancelable;
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static InputDialog build(DialogXStyle dialogXStyle) {
        InputDialog inputDialog = new InputDialog();
        inputDialog.setStyle(dialogXStyle);
        return inputDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: appendMessage(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog appendMessage(CharSequence charSequence) {
        this.message = TextUtils.concat(this.message, charSequence);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bindDismissWithLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bringToFront()Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAction(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAllAction()Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog onDismiss(DialogXRunnable<MessageDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog onShow(DialogXRunnable<MessageDialog> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: removeCustomView()Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setActionRunnable(int i, DialogXRunnable<MessageDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAnimResId(II)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setAnimResId(int i, int i2) {
        this.customEnterAnimResId = i;
        this.customExitAnimResId = i2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBackgroundColor(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setBackgroundColor(@InterfaceC3897 int i) {
        this.backgroundColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBackgroundColorRes(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setBackgroundColorRes(@InterfaceC3906 int i) {
        this.backgroundColor = Integer.valueOf(getColor(i));
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBkgInterceptTouch(Z)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setButtonOrientation(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setButtonOrientation(int i) {
        this.buttonOrientation = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setCancelTextInfo(TextInfo textInfo) {
        this.cancelTextInfo = textInfo;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelable(Z)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setCustomView(OnBindView<MessageDialog> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setDialogImplMode(Lcom/kongzue/dialogx/DialogX$IMPL_MODE;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setDialogLifecycleCallback(DialogLifecycleCallback<MessageDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4164me);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setDialogXAnimImpl(DialogXAnimInterface<MessageDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnterAnimDuration(J)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnterAnimResId(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setEnterAnimResId(int i) {
        this.customEnterAnimResId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setExitAnimDuration(J)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setExitAnimResId(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setExitAnimResId(int i) {
        this.customExitAnimResId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaskColor(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxHeight(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMaxHeight(int i) {
        this.maxHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaxWidth(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMaxWidth(int i) {
        this.maxWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMessageTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMessageTextInfo(TextInfo textInfo) {
        this.messageTextInfo = textInfo;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinHeight(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMinHeight(int i) {
        this.minHeight = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMinWidth(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMinWidth(int i) {
        this.minWidth = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOkTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOkTextInfo(TextInfo textInfo) {
        this.okTextInfo = textInfo;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOnBackPressedListener(OnBackPressedListener<MessageDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<MessageDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setOtherTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOtherTextInfo(TextInfo textInfo) {
        this.otherTextInfo = textInfo;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setRadius(F)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setRadius(float f) {
        this.backgroundRadius = f;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTitleTextInfo(Lcom/kongzue/dialogx/util/TextInfo;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setTitleTextInfo(TextInfo textInfo) {
        this.titleTextInfo = textInfo;
        refreshUI();
        return this;
    }

    public static InputDialog show(int i, int i2, int i3) {
        InputDialog inputDialog = new InputDialog(i, i2, i3);
        inputDialog.show();
        return inputDialog;
    }

    /* JADX DEBUG: Method merged with bridge method: setCancelButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setCancelButton(CharSequence charSequence) {
        this.cancelText = charSequence;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public InputDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public InputDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    public InputDialog setInputHintText(int i) {
        this.inputHintText = getString(i);
        refreshUI();
        return this;
    }

    public InputDialog setInputText(int i) {
        this.inputText = getString(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMessage(CharSequence charSequence) {
        this.message = charSequence;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOkButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOkButton(CharSequence charSequence) {
        this.okText = charSequence;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOtherButton(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOtherButton(CharSequence charSequence) {
        this.otherText = charSequence;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public InputDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(Ljava/lang/CharSequence;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setTitle(CharSequence charSequence) {
        this.title = charSequence;
        refreshUI();
        return this;
    }

    public static InputDialog build(OnBindView<MessageDialog> onBindView) {
        return new InputDialog().setCustomView(onBindView);
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(Landroid/graphics/Bitmap;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setTitleIcon(Bitmap bitmap) {
        this.titleIcon = new BitmapDrawable(getResources(), bitmap);
        refreshUI();
        return this;
    }

    public static InputDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        InputDialog inputDialog = new InputDialog(charSequence, charSequence2, charSequence3, charSequence4);
        inputDialog.show();
        return inputDialog;
    }

    /* JADX DEBUG: Method merged with bridge method: setCancelButton(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setCancelButton(int i) {
        this.cancelText = getString(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(IZ)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setMessage(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setMessage(int i) {
        this.message = getString(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOkButton(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOkButton(int i) {
        this.okText = getString(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setOtherButton(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setOtherButton(int i) {
        this.otherText = getString(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(IIII)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitle(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setTitle(int i) {
        this.title = getString(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(I)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setTitleIcon(int i) {
        this.titleIcon = getResources().getDrawable(i);
        refreshUI();
        return this;
    }

    public InputDialog(CharSequence charSequence, CharSequence charSequence2) {
        this.cancelable = DialogX.cancelable;
        this.title = charSequence;
        this.message = charSequence2;
    }

    public static InputDialog show(int i, int i2, int i3, int i4) {
        InputDialog inputDialog = new InputDialog(i, i2, i3, i4);
        inputDialog.show();
        return inputDialog;
    }

    public InputDialog setCancelButton(OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.cancelButtonClickListener = onInputDialogButtonClickListener;
        return this;
    }

    public InputDialog setOkButton(OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.okButtonClickListener = onInputDialogButtonClickListener;
        return this;
    }

    public InputDialog setOtherButton(OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.otherButtonClickListener = onInputDialogButtonClickListener;
        return this;
    }

    public InputDialog setCancelButton(CharSequence charSequence, OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.cancelText = charSequence;
        this.cancelButtonClickListener = onInputDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public InputDialog setOkButton(CharSequence charSequence, OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.okText = charSequence;
        this.okButtonClickListener = onInputDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public InputDialog setOtherButton(CharSequence charSequence, OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.otherText = charSequence;
        this.otherButtonClickListener = onInputDialogButtonClickListener;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setTitleIcon(Landroid/graphics/drawable/Drawable;)Lcom/kongzue/dialogx/dialogs/MessageDialog; */
    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public InputDialog setTitleIcon(Drawable drawable) {
        this.titleIcon = drawable;
        refreshUI();
        return this;
    }

    public static InputDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str) {
        InputDialog inputDialog = new InputDialog(charSequence, charSequence2, charSequence3, charSequence4, str);
        inputDialog.show();
        return inputDialog;
    }

    public InputDialog(int i, int i2, int i3) {
        this.cancelable = DialogX.cancelable;
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
    }

    public static InputDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        InputDialog inputDialog = new InputDialog(charSequence, charSequence2, charSequence3, charSequence4, charSequence5);
        inputDialog.show();
        return inputDialog;
    }

    public InputDialog setCancelButton(int i, OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.cancelText = getString(i);
        this.cancelButtonClickListener = onInputDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public InputDialog setOkButton(int i, OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.okText = getString(i);
        this.okButtonClickListener = onInputDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public InputDialog setOtherButton(int i, OnInputDialogButtonClickListener<InputDialog> onInputDialogButtonClickListener) {
        this.otherText = getString(i);
        this.otherButtonClickListener = onInputDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public static InputDialog show(int i, int i2, int i3, int i4, int i5) {
        InputDialog inputDialog = new InputDialog(i, i2, i3, i4, i5);
        inputDialog.show();
        return inputDialog;
    }

    public static InputDialog show(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, String str) {
        InputDialog inputDialog = new InputDialog(charSequence, charSequence2, charSequence3, charSequence4, charSequence5, str);
        inputDialog.show();
        return inputDialog;
    }

    public InputDialog(int i, int i2) {
        this.cancelable = DialogX.cancelable;
        this.title = getString(i);
        this.message = getString(i2);
    }

    public static InputDialog show(int i, int i2, int i3, int i4, int i5, int i6) {
        InputDialog inputDialog = new InputDialog(i, i2, i3, i4, i5, i6);
        inputDialog.show();
        return inputDialog;
    }

    public InputDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.cancelable = DialogX.cancelable;
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
    }

    public InputDialog(int i, int i2, int i3, int i4) {
        this.cancelable = DialogX.cancelable;
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.cancelText = getString(i4);
    }

    public InputDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, String str) {
        this.cancelable = DialogX.cancelable;
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
        this.inputText = str;
    }

    public InputDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        this.cancelable = DialogX.cancelable;
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
        this.otherText = charSequence5;
    }

    public InputDialog(int i, int i2, int i3, int i4, int i5) {
        this.cancelable = DialogX.cancelable;
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.cancelText = getString(i4);
        this.otherText = getString(i5);
    }

    public InputDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, String str) {
        this.cancelable = DialogX.cancelable;
        this.title = charSequence;
        this.message = charSequence2;
        this.okText = charSequence3;
        this.cancelText = charSequence4;
        this.otherText = charSequence5;
        this.inputText = str;
    }

    public InputDialog(int i, int i2, int i3, int i4, int i5, int i6) {
        this.cancelable = DialogX.cancelable;
        this.title = getString(i);
        this.message = getString(i2);
        this.okText = getString(i3);
        this.cancelText = getString(i4);
        this.otherText = getString(i5);
        this.inputText = getString(i6);
    }
}
