package com.google.android.material.resources;

import Yue.InterfaceC7144;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public abstract class TextAppearanceFontCallback {
    public abstract void onFontRetrievalFailed(int i);

    public abstract void onFontRetrieved(Typeface typeface, boolean z);
}
