package com.bumptech.glide;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class GeneratedAppGlideModule extends AppGlideModule {
    @InterfaceC6391
    public Set<Class<?>> getExcludedModuleClasses() {
        return new HashSet();
    }

    @InterfaceC6490
    public RequestManagerRetriever.RequestManagerFactory getRequestManagerFactory() {
        return null;
    }
}
