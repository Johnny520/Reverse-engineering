package com.google.android.material.internal;

import Yue.InterfaceC5411;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.widget.Checkable;
import com.google.android.material.internal.MaterialCheckable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public interface MaterialCheckable<T extends MaterialCheckable<T>> extends Checkable {

    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C c, boolean z);
    }

    @InterfaceC5411
    int getId();

    void setInternalOnCheckedChangeListener(@InterfaceC6490 OnCheckedChangeListener<T> onCheckedChangeListener);
}
