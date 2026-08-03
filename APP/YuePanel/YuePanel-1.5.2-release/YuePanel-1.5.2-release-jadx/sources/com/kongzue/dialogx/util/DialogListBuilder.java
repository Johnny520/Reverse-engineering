package com.kongzue.dialogx.util;

import com.kongzue.dialogx.interfaces.BaseDialog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DialogListBuilder {
    ArrayList<BaseDialog> dialogs;

    public static DialogListBuilder create(BaseDialog... baseDialogArr) {
        DialogListBuilder dialogListBuilder = new DialogListBuilder();
        for (BaseDialog baseDialog : baseDialogArr) {
            if (baseDialog != null) {
                dialogListBuilder.add(baseDialog);
            }
        }
        return dialogListBuilder;
    }

    public DialogListBuilder add(BaseDialog baseDialog) {
        if (this.dialogs == null) {
            this.dialogs = new ArrayList<>();
        }
        if (baseDialog != null && !baseDialog.isShow() && !baseDialog.isPreShow()) {
            baseDialog.setDialogListBuilder(this);
            this.dialogs.add(baseDialog);
        }
        return this;
    }

    public void clear() {
        ArrayList<BaseDialog> arrayList = this.dialogs;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public boolean isEmpty() {
        if (this.dialogs == null) {
            return true;
        }
        while (!this.dialogs.isEmpty() && this.dialogs.get(0) == null) {
            this.dialogs.remove(0);
        }
        return this.dialogs.isEmpty();
    }

    public DialogListBuilder show() {
        ArrayList<BaseDialog> arrayList = this.dialogs;
        if (arrayList != null && !arrayList.isEmpty()) {
            while (!this.dialogs.isEmpty() && this.dialogs.get(0) == null) {
                this.dialogs.remove(0);
            }
            this.dialogs.get(0).show();
        }
        return this;
    }

    public void showNext() {
        ArrayList<BaseDialog> arrayList = this.dialogs;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.dialogs.remove(0);
        if (this.dialogs.isEmpty() || this.dialogs.get(0) == null) {
            return;
        }
        this.dialogs.get(0).show();
    }
}
