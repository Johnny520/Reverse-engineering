package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲀᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0589 implements io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam f2046;

    public C0589(io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam r3) {
            r2 = this;
            r0 = -285023081433157(0xfffefcc5e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r2.<init>()
            r2.f2046 = r3
            return
    }

    public final android.content.pm.ApplicationInfo getApplicationInfo() {
            r2 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r2 = r2.f2046
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            r0 = -285134750582853(0xfffefcabe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            return r2
    }

    public final java.lang.ClassLoader getDefaultClassLoader() {
            r2 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r2 = r2.f2046
            java.lang.ClassLoader r2 = r2.getDefaultClassLoader()
            r0 = -285237829797957(0xfffefc93e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            return r2
    }

    public final java.lang.String getPackageName() {
            r2 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r2 = r2.f2046
            java.lang.String r2 = r2.getPackageName()
            r0 = -285048851236933(0xfffefcbfe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            return r2
    }

    public final boolean isFirstPackage() {
            r0 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r0 = r0.f2046
            boolean r0 = r0.isFirstPackage()
            return r0
    }
}
