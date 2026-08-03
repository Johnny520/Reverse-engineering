package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class TipDialog extends com.kongzue.dialogx.dialogs.WaitDialog {
    public static final int NO_AUTO_DISMISS = -1;

    public TipDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(int r1) {
            r0 = 0
            com.kongzue.dialogx.dialogs.WaitDialog r1 = show(r0, r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(int r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            r0 = 0
            com.kongzue.dialogx.dialogs.WaitDialog r1 = show(r0, r1, r2)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(int r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2, long r3) {
            r0 = 0
            com.kongzue.dialogx.dialogs.WaitDialog r1 = show(r0, r1, r2, r3)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r1, int r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r1 = com.kongzue.dialogx.dialogs.WaitDialog.getInstance(r1)
            if (r1 == 0) goto L19
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.WARNING
            r1.setTip(r2, r0)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r1.getDialogImpl()
            if (r2 != 0) goto L15
            r1.show()
            goto L18
        L15:
            r1.cancelDelayDismissTimer()
        L18:
            return r1
        L19:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = com.kongzue.dialogx.dialogs.WaitDialog.instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r0, int r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.getInstance(r0)
            if (r0 == 0) goto L17
            r0.setTip(r1, r2)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r1 = r0.getDialogImpl()
            if (r1 != 0) goto L13
            r0.show()
            goto L16
        L13:
            r0.cancelDelayDismissTimer()
        L16:
            return r0
        L17:
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.instanceBuild()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r0, int r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2, long r3) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.getInstance(r0)
            if (r0 == 0) goto L1a
            r0.setTip(r1, r2)
            r0.setTipShowDuration(r3)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r1 = r0.getDialogImpl()
            if (r1 != 0) goto L16
            r0.show()
            goto L19
        L16:
            r0.cancelDelayDismissTimer()
        L19:
            return r0
        L1a:
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.instanceBuild()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r1, java.lang.CharSequence r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r1 = com.kongzue.dialogx.dialogs.WaitDialog.getInstance(r1)
            if (r1 == 0) goto L19
            com.kongzue.dialogx.dialogs.WaitDialog$TYPE r0 = com.kongzue.dialogx.dialogs.WaitDialog.TYPE.WARNING
            r1.setTip(r2, r0)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r2 = r1.getDialogImpl()
            if (r2 != 0) goto L15
            r1.show()
            goto L18
        L15:
            r1.cancelDelayDismissTimer()
        L18:
            return r1
        L19:
            com.kongzue.dialogx.dialogs.WaitDialog r1 = com.kongzue.dialogx.dialogs.WaitDialog.instanceBuild()
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r0, java.lang.CharSequence r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.getInstance(r0)
            if (r0 == 0) goto L17
            r0.setTip(r1, r2)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r1 = r0.getDialogImpl()
            if (r1 != 0) goto L13
            r0.show()
            goto L16
        L13:
            r0.cancelDelayDismissTimer()
        L16:
            return r0
        L17:
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.instanceBuild()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(android.app.Activity r0, java.lang.CharSequence r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2, long r3) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.getInstance(r0)
            if (r0 == 0) goto L1a
            r0.setTip(r1, r2)
            r0.setTipShowDuration(r3)
            com.kongzue.dialogx.dialogs.WaitDialog$DialogImpl r1 = r0.getDialogImpl()
            if (r1 != 0) goto L16
            r0.show()
            goto L19
        L16:
            r0.cancelDelayDismissTimer()
        L19:
            return r0
        L1a:
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.instanceBuild()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(java.lang.CharSequence r1) {
            r0 = 0
            com.kongzue.dialogx.dialogs.WaitDialog r1 = show(r0, r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(java.lang.CharSequence r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2) {
            r0 = 0
            com.kongzue.dialogx.dialogs.WaitDialog r1 = show(r0, r1, r2)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog show(java.lang.CharSequence r1, com.kongzue.dialogx.dialogs.WaitDialog.TYPE r2, long r3) {
            r0 = 0
            com.kongzue.dialogx.dialogs.WaitDialog r1 = show(r0, r1, r2, r3)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.WaitDialog showTipWithDefaultText(com.kongzue.dialogx.dialogs.WaitDialog.TYPE r0) {
            com.kongzue.dialogx.dialogs.WaitDialog r0 = com.kongzue.dialogx.dialogs.WaitDialog.showTipWithDefaultText(r0)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog appendMessage(java.lang.CharSequence r4) {
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

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog appendMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.appendMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.bindDismissWithLifecycleOwner(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog bringToFront() {
            r1 = this;
            com.kongzue.dialogx.dialogs.TipDialog r0 = r1.bringToFront()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
            r0 = this;
            com.kongzue.dialogx.dialogs.WaitDialog.dismiss()
            return
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog cleanAction(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.cleanAction(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog cleanAllAction() {
            r1 = this;
            com.kongzue.dialogx.dialogs.TipDialog r0 = r1.cleanAllAction()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
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

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.WaitDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.WaitDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public float getRadius() {
            r1 = this;
            float r0 = r1.backgroundRadius
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public boolean isBkgInterceptTouch() {
            r1 = this;
            boolean r0 = r1.bkgInterceptTouch
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.onDismiss(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
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

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.onShow(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.WaitDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setActionRunnable(int r1, com.kongzue.dialogx.interfaces.DialogXRunnable r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setActionRunnable(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setBkgInterceptTouch(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setCustomDialogLayoutResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setCustomDialogLayoutResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setCustomDialogLayoutResId(int r1, boolean r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setCustomDialogLayoutResId(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.TipDialog setData(java.lang.String r2, java.lang.Object r3) {
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

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setDialogImplMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setDialogXAnimImpl(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.TipDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setMaxHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setMaxHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setMaxWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setMaxWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setMinHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setMinHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setMinWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setMinWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setOnBackPressedListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.WaitDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setOnBackgroundMaskClickListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setRadius(float r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setRadius(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public com.kongzue.dialogx.dialogs.TipDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setRootPadding(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setRootPadding(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setRootPadding(r1, r2, r3, r4)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.TipDialog setThisOrderIndex(int r2) {
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

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.WaitDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.WaitDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.TipDialog r1 = r0.setThisOrderIndex(r1)
            return r1
    }
}
