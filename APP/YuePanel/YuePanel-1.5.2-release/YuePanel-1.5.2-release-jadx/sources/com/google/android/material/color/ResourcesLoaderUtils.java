package com.google.android.material.color;

import Yue.InterfaceC7113;
import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(api = 30)
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderCreate = ColorResourcesLoaderCreator.create(context, map);
        if (resourcesLoaderCreate == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderCreate);
        return true;
    }

    public static boolean isColorResource(int i) {
        return 28 <= i && i <= 31;
    }
}
