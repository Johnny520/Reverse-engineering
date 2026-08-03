package com.google.android.material.internal;

import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ContextUtils {
    @InterfaceC6490
    public static Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
