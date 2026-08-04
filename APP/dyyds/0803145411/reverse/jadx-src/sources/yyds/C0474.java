package yyds;

import android.content.pm.ApplicationInfo;
import io.github.libxposed.api.XposedModuleInterface;

/* JADX INFO: renamed from: yyds.ᛲᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0474 implements XposedModuleInterface.PackageLoadedParam {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final XposedModuleInterface.PackageLoadedParam f2380;

    public C0474(XposedModuleInterface.PackageLoadedParam packageLoadedParam) {
        AbstractC2328.m4341(-809867196138350L);
        this.f2380 = packageLoadedParam;
    }

    public final ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = this.f2380.getApplicationInfo();
        AbstractC2328.m4341(-809978865288046L);
        return applicationInfo;
    }

    public final ClassLoader getDefaultClassLoader() {
        ClassLoader defaultClassLoader = this.f2380.getDefaultClassLoader();
        AbstractC2328.m4341(-810081944503150L);
        return defaultClassLoader;
    }

    public final String getPackageName() {
        String packageName = this.f2380.getPackageName();
        AbstractC2328.m4341(-809892965942126L);
        return packageName;
    }

    public final boolean isFirstPackage() {
        return this.f2380.isFirstPackage();
    }
}
