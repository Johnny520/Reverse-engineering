package com.google.android.material.color;

import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.C1980R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(api = 30)
class ResourcesLoaderColorResourcesOverride implements ColorResourcesOverride {

    public static class ResourcesLoaderColorResourcesOverrideSingleton {
        private static final ResourcesLoaderColorResourcesOverride INSTANCE = new ResourcesLoaderColorResourcesOverride();

        private ResourcesLoaderColorResourcesOverrideSingleton() {
        }
    }

    public static ColorResourcesOverride getInstance() {
        return ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, map)) {
            return false;
        }
        ThemeUtils.applyThemeOverlay(context, C1980R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    @InterfaceC6391
    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C1980R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private ResourcesLoaderColorResourcesOverride() {
    }
}
