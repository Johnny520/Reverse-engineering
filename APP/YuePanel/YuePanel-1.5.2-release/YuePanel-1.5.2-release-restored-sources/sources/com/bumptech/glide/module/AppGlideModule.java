package com.bumptech.glide.module;

import Yue.InterfaceC6391;
import android.content.Context;
import com.bumptech.glide.GlideBuilder;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppGlideModule extends LibraryGlideModule implements AppliesOptions {
    @Override // com.bumptech.glide.module.AppliesOptions
    public void applyOptions(@InterfaceC6391 Context context, @InterfaceC6391 GlideBuilder glideBuilder) {
    }

    public boolean isManifestParsingEnabled() {
        return true;
    }
}
