package com.kongzue.dialogx.wrapper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleUtil {
    public static String modulePath = "";

    public static Context getContext(Context context) {
        return new ModuleContext(context);
    }

    public static LayoutInflater getLayoutInflater(Context context) {
        return LayoutInflater.from(context).cloneInContext(getContext(context));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"DiscouragedPrivateApi"})
    public static void injectModuleAppResources(Resources resources) {
        if (modulePath.isEmpty()) {
            return;
        }
        try {
            AssetManager assets = resources.getAssets();
            Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(assets, modulePath);
        } catch (Throwable unused) {
        }
    }

    public static void injectModuleAppResources(Context context) {
        injectModuleAppResources(context.getResources());
    }
}
