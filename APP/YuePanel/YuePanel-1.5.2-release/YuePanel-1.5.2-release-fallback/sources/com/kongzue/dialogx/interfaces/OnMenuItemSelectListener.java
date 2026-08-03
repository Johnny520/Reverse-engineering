package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnMenuItemSelectListener<D> implements com.kongzue.dialogx.interfaces.OnMenuItemClickListener<D> {
    public OnMenuItemSelectListener() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    @java.lang.Deprecated
    public boolean onClick(D r1, java.lang.CharSequence r2, int r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void onMultiItemSelect(D r1, java.lang.CharSequence[] r2, int[] r3) {
            r0 = this;
            return
    }

    public void onOneItemSelect(D r1, java.lang.CharSequence r2, int r3, boolean r4) {
            r0 = this;
            return
    }
}
