package com.kongzue.dialogx.interfaces;

import android.widget.ImageView;
import com.kongzue.dialogx.interfaces.BaseDialog;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MenuIconAdapter<D extends BaseDialog> extends OnIconChangeCallBack<D> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuIconAdapter() {
    }

    public abstract boolean applyIcon(D d, int i, String str, ImageView imageView);

    @Override // com.kongzue.dialogx.interfaces.OnIconChangeCallBack
    public int getIcon(D d, int i, String str) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MenuIconAdapter(boolean z) {
        super(z);
    }
}
