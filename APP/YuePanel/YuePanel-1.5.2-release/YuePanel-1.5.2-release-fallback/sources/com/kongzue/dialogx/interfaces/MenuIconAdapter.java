package com.kongzue.dialogx.interfaces;

import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MenuIconAdapter<D extends com.kongzue.dialogx.interfaces.BaseDialog> extends com.kongzue.dialogx.interfaces.OnIconChangeCallBack<D> {
    public MenuIconAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public MenuIconAdapter(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public abstract boolean applyIcon(D r1, int r2, java.lang.String r3, android.widget.ImageView r4);

    @Override // com.kongzue.dialogx.interfaces.OnIconChangeCallBack
    public int getIcon(D r1, int r2, java.lang.String r3) {
            r0 = this;
            r1 = 0
            return r1
    }
}
