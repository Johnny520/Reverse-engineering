package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnMenuItemSelectListener<D> implements OnMenuItemClickListener<D> {
    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    @Deprecated
    public boolean onClick(D d, CharSequence charSequence, int i) {
        return true;
    }

    public void onMultiItemSelect(D d, CharSequence[] charSequenceArr, int[] iArr) {
    }

    public void onOneItemSelect(D d, CharSequence charSequence, int i, boolean z) {
    }
}
