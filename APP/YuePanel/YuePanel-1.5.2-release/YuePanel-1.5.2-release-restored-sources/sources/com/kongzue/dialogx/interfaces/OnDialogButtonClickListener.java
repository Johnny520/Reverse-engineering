package com.kongzue.dialogx.interfaces;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes.dex */
public interface OnDialogButtonClickListener<D extends BaseDialog> extends BaseOnDialogClickCallback {
    boolean onClick(D d, View view);
}
