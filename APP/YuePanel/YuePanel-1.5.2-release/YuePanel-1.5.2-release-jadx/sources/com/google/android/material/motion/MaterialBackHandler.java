package com.google.android.material.motion;

import Yue.C3505;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@InterfaceC6391 C3505 c3505);

    void updateBackProgress(@InterfaceC6391 C3505 c3505);
}
