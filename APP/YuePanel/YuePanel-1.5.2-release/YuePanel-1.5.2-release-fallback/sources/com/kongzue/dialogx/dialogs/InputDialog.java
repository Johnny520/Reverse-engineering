package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class InputDialog extends com.kongzue.dialogx.dialogs.MessageDialog {
    public InputDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    public InputDialog(int r2, int r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            return
    }

    public InputDialog(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            java.lang.String r2 = r1.getString(r4)
            r1.okText = r2
            return
    }

    public InputDialog(int r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            java.lang.String r2 = r1.getString(r4)
            r1.okText = r2
            java.lang.String r2 = r1.getString(r5)
            r1.cancelText = r2
            return
    }

    public InputDialog(int r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            java.lang.String r2 = r1.getString(r4)
            r1.okText = r2
            java.lang.String r2 = r1.getString(r5)
            r1.cancelText = r2
            java.lang.String r2 = r1.getString(r6)
            r1.otherText = r2
            return
    }

    public InputDialog(int r2, int r3, int r4, int r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            java.lang.String r2 = r1.getString(r2)
            r1.title = r2
            java.lang.String r2 = r1.getString(r3)
            r1.message = r2
            java.lang.String r2 = r1.getString(r4)
            r1.okText = r2
            java.lang.String r2 = r1.getString(r5)
            r1.cancelText = r2
            java.lang.String r2 = r1.getString(r6)
            r1.otherText = r2
            java.lang.String r2 = r1.getString(r7)
            r1.inputText = r2
            return
    }

    public InputDialog(java.lang.CharSequence r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            r1.title = r2
            r1.message = r3
            return
    }

    public InputDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            return
    }

    public InputDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            r1.cancelText = r5
            return
    }

    public InputDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            r1.cancelText = r5
            r1.otherText = r6
            return
    }

    public InputDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.String r7) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            r1.cancelText = r5
            r1.otherText = r6
            r1.inputText = r7
            return
    }

    public InputDialog(java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            boolean r0 = com.kongzue.dialogx.DialogX.cancelable
            r1.cancelable = r0
            r1.title = r2
            r1.message = r3
            r1.okText = r4
            r1.cancelText = r5
            r1.inputText = r6
            return
    }

    public static com.kongzue.dialogx.dialogs.InputDialog build() {
            com.kongzue.dialogx.dialogs.InputDialog r0 = new com.kongzue.dialogx.dialogs.InputDialog
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.InputDialog build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.InputDialog r0 = new com.kongzue.dialogx.dialogs.InputDialog
            r0.<init>()
            r0.setStyle(r1)
            return r0
    }

    public static com.kongzue.dialogx.dialogs.InputDialog build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            com.kongzue.dialogx.dialogs.InputDialog r0 = new com.kongzue.dialogx.dialogs.InputDialog
            r0.<init>()
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCustomView(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(int r1, int r2, int r3) {
            com.kongzue.dialogx.dialogs.InputDialog r0 = new com.kongzue.dialogx.dialogs.InputDialog
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(int r1, int r2, int r3, int r4) {
            com.kongzue.dialogx.dialogs.InputDialog r0 = new com.kongzue.dialogx.dialogs.InputDialog
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(int r7, int r8, int r9, int r10, int r11) {
            com.kongzue.dialogx.dialogs.InputDialog r6 = new com.kongzue.dialogx.dialogs.InputDialog
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.show()
            return r6
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(int r8, int r9, int r10, int r11, int r12, int r13) {
            com.kongzue.dialogx.dialogs.InputDialog r7 = new com.kongzue.dialogx.dialogs.InputDialog
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.show()
            return r7
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3) {
            com.kongzue.dialogx.dialogs.InputDialog r0 = new com.kongzue.dialogx.dialogs.InputDialog
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4) {
            com.kongzue.dialogx.dialogs.InputDialog r0 = new com.kongzue.dialogx.dialogs.InputDialog
            r0.<init>(r1, r2, r3, r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, java.lang.CharSequence r11) {
            com.kongzue.dialogx.dialogs.InputDialog r6 = new com.kongzue.dialogx.dialogs.InputDialog
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.show()
            return r6
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.String r13) {
            com.kongzue.dialogx.dialogs.InputDialog r7 = new com.kongzue.dialogx.dialogs.InputDialog
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.show()
            return r7
    }

    public static com.kongzue.dialogx.dialogs.InputDialog show(java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, java.lang.String r11) {
            com.kongzue.dialogx.dialogs.InputDialog r6 = new com.kongzue.dialogx.dialogs.InputDialog
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.show()
            return r6
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog appendMessage(java.lang.CharSequence r4) {
            r3 = this;
            java.lang.CharSequence r0 = r3.message
            r1 = 2
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r1)
            r3.message = r4
            r3.refreshUI()
            return r3
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog appendMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.appendMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.bindDismissWithLifecycleOwner(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog bringToFront() {
            r1 = this;
            com.kongzue.dialogx.dialogs.InputDialog r0 = r1.bringToFront()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
            r0 = this;
            r0.dismiss()
            return
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog cleanAction(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.cleanAction(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog cleanAllAction() {
            r1 = this;
            com.kongzue.dialogx.dialogs.InputDialog r0 = r1.cleanAllAction()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public java.lang.String dialogKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r2.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public int getButtonOrientation() {
            r1 = this;
            int r0 = r1.buttonOrientation
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getCancelButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.cancelText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getCancelTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.cancelTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.dialogXAnimImpl
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public long getEnterAnimDuration() {
            r2 = this;
            long r0 = r2.enterAnimDuration
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public long getExitAnimDuration() {
            r2 = this;
            long r0 = r2.exitAnimDuration
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener getInputCancelButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.cancelButtonClickListener
            com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener) r0
            return r0
    }

    public java.lang.String getInputHintText() {
            r1 = this;
            java.lang.String r0 = r1.inputHintText
            return r0
    }

    public com.kongzue.dialogx.util.InputInfo getInputInfo() {
            r1 = this;
            com.kongzue.dialogx.util.InputInfo r0 = r1.inputInfo
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> getInputOkButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.okButtonClickListener
            com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener) r0
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener getInputOtherButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.otherButtonClickListener
            com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener) r0
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.String getInputText() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 == 0) goto L1d
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.getDialogImpl()
            android.widget.EditText r0 = r0.txtInput
            if (r0 == 0) goto L1d
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.getDialogImpl()
            android.widget.EditText r0 = r0.txtInput
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
            java.lang.String r0 = r1.inputText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.message
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getMessageTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.messageTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getOkButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.okText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getOkTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.okTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBackPressedListener
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getOtherButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.otherText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getOtherTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.otherTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.title
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getTitleTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.titleTextInfo
            return r0
    }

    public boolean isAutoShowInputKeyboard() {
            r1 = this;
            boolean r0 = r1.autoShowInputKeyboard
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public boolean isBkgInterceptTouch() {
            r1 = this;
            boolean r0 = r1.bkgInterceptTouch
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
            r4 = this;
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = r4.privateCancelable
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r3) goto Lb
            r1 = r2
        Lb:
            return r1
        Lc:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.MessageDialog.overrideCancelable
            if (r0 == 0) goto L16
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r3) goto L15
            r1 = r2
        L15:
            return r1
        L16:
            boolean r0 = r4.cancelable
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.onDismiss(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onShowRunnable = r1
            boolean r1 = r0.isShow()
            if (r1 == 0) goto Lf
            com.kongzue.dialogx.interfaces.DialogXRunnable r1 = r0.onShowRunnable
            if (r1 == 0) goto Lf
            r1.run(r0)
        Lf:
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.onShow(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.dialogs.InputDialog r0 = r1.removeCustomView()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
            r4 = this;
            android.view.View r0 = r4.getDialogView()
            if (r0 == 0) goto L10
            android.view.View r0 = r4.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r0 = 0
            r4.isShow = r0
        L10:
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r4.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L21
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r4.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L21:
            boolean r0 = r4.isLightTheme()
            int r0 = r4.getCustomDialogLayoutResId(r0)
            if (r0 == 0) goto L34
            boolean r0 = r4.isLightTheme()
            int r0 = r4.getCustomDialogLayoutResId(r0)
            goto L3e
        L34:
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r4.style
            boolean r1 = r4.isLightTheme()
            int r0 = r0.layout(r1)
        L3e:
            if (r0 != 0) goto L4b
            boolean r0 = r4.isLightTheme()
            if (r0 == 0) goto L49
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material
            goto L4b
        L49:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_material_dark
        L4b:
            java.lang.String r1 = r4.getInputText()
            r2 = 0
            r4.enterAnimDuration = r2
            android.view.View r0 = r4.createView(r0)
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r2 = new com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl
            r2.<init>(r4, r0)
            r4.dialogImpl = r2
            if (r0 == 0) goto L65
            com.kongzue.dialogx.dialogs.MessageDialog r2 = r4.me
            r0.setTag(r2)
        L65:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            r4.setInputText(r1)
            return
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setActionRunnable(int r1, com.kongzue.dialogx.interfaces.DialogXRunnable r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setActionRunnable(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setAnimResId(int r1, int r2) {
            r0 = this;
            r0.customEnterAnimResId = r1
            r0.customExitAnimResId = r2
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setAnimResId(int r1, int r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setAnimResId(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.InputDialog setAutoShowInputKeyboard(boolean r1) {
            r0 = this;
            r0.autoShowInputKeyboard = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setBackgroundColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setBackgroundColorRes(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setBkgInterceptTouch(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setButtonOrientation(int r1) {
            r0 = this;
            r0.buttonOrientation = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setButtonOrientation(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setButtonOrientation(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setCancelButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setCancelButton(com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.cancelText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r2) {
            r0 = this;
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCancelButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCancelButton(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.InputDialog setCancelButtonClickListener(com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.cancelTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCancelTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setCancelable(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            goto L7
        L5:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.FALSE
        L7:
            r0.privateCancelable = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelable(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCancelable(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCustomDialogLayoutResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCustomDialogLayoutResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCustomDialogLayoutResId(int r1, boolean r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCustomDialogLayoutResId(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setCustomView(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.InputDialog setData(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.data = r0
        Lb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            r0.put(r2, r3)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setDialogImplMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.MessageDialog r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setDialogLifecycleCallback(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setDialogXAnimImpl(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.InputDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setEnterAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setEnterAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setEnterAnimResId(int r1) {
            r0 = this;
            r0.customEnterAnimResId = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setEnterAnimResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setEnterAnimResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setExitAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setExitAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setExitAnimResId(int r1) {
            r0 = this;
            r0.customExitAnimResId = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setExitAnimResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setExitAnimResId(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.InputDialog setInputHintText(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.inputHintText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setInputHintText(java.lang.String r1) {
            r0 = this;
            r0.inputHintText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setInputInfo(com.kongzue.dialogx.util.InputInfo r1) {
            r0 = this;
            r0.inputInfo = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setInputText(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.inputText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setInputText(java.lang.String r1) {
            r0 = this;
            r0.inputText = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMaskColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMaxHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMaxHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMaxWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMaxWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMessage(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMessageTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMinHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMinHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMinWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setMinWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOkButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOkButton(int r1, com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOkButton(com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.okText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r2) {
            r0 = this;
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOkButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOkButton(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOkButtonClickListener(com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.okTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOkTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOnBackPressedListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOnBackgroundMaskClickListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOtherButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOtherButton(com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.otherText = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r2) {
            r0 = this;
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOtherButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOtherButton(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.InputDialog setOtherButtonClickListener(com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener<com.kongzue.dialogx.dialogs.InputDialog> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.otherTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setOtherTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setRadius(float r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setRadius(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setRootPadding(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setRootPadding(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setRootPadding(r1, r2, r3, r4)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.InputDialog setThisOrderIndex(int r2) {
            r1 = this;
            r1.thisOrderIndex = r2
            android.view.View r0 = r1.getDialogView()
            if (r0 == 0) goto L10
            android.view.View r0 = r1.getDialogView()
            float r2 = (float) r2
            r0.setTranslationZ(r2)
        L10:
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setTitle(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.title = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitle(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setTitle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitle(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setTitle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setTitleIcon(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.titleIcon = r2
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setTitleIcon(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.titleIcon = r0
            r2.refreshUI()
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.titleIcon = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(android.graphics.Bitmap r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.InputDialog setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.titleTextInfo = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.InputDialog r1 = r0.setTitleTextInfo(r1)
            return r1
    }
}
