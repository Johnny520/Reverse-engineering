package com.google.android.material.color;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.os.Build;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public interface ColorResourcesOverride {
    @InterfaceC6490
    static ColorResourcesOverride getInstance() {
        int i = Build.VERSION.SDK_INT;
        if ((30 > i || i > 33) && i < 34) {
            return null;
        }
        return ResourcesLoaderColorResourcesOverride.getInstance();
    }

    boolean applyIfPossible(@InterfaceC6391 Context context, @InterfaceC6391 Map<Integer, Integer> map);

    @InterfaceC6391
    Context wrapContextIfPossible(@InterfaceC6391 Context context, @InterfaceC6391 Map<Integer, Integer> map);
}
