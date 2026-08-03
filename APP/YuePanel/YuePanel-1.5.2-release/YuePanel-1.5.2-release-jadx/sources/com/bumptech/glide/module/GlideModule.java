package com.bumptech.glide.module;

import Yue.InterfaceC6391;
import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface GlideModule extends RegistersComponents, AppliesOptions {
    @Override // com.bumptech.glide.module.AppliesOptions
    /* synthetic */ void applyOptions(@InterfaceC6391 Context context, @InterfaceC6391 GlideBuilder glideBuilder);

    @Override // com.bumptech.glide.module.RegistersComponents
    /* synthetic */ void registerComponents(@InterfaceC6391 Context context, @InterfaceC6391 Glide glide, @InterfaceC6391 Registry registry);
}
