package p062e0;

import android.content.Context;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0551a {
    void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam);

    default void onCreate() {
    }
}
