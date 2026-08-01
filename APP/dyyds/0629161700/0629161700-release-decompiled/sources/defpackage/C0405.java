package defpackage;

/* JADX INFO: renamed from: ᛳᛱᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0405 implements io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam f2062;

    public C0405(io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam r3) {
            r2 = this;
            r0 = -528925507100206(0xfffe1ef1ef0961d2, double:NaN)
            r2.<init>()
            r2.f2062 = r3
            return
    }

    public final android.content.pm.ApplicationInfo getApplicationInfo() {
            r2 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r2 = r2.f2062
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            r0 = -529037176249902(0xfffe1ed7ef0961d2, double:NaN)
            return r2
    }

    public final java.lang.ClassLoader getDefaultClassLoader() {
            r2 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r2 = r2.f2062
            java.lang.ClassLoader r2 = r2.getDefaultClassLoader()
            r0 = -529140255465006(0xfffe1ebfef0961d2, double:NaN)
            return r2
    }

    public final java.lang.String getPackageName() {
            r2 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r2 = r2.f2062
            java.lang.String r2 = r2.getPackageName()
            r0 = -528951276903982(0xfffe1eebef0961d2, double:NaN)
            return r2
    }

    public final boolean isFirstPackage() {
            r0 = this;
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r0 = r0.f2062
            boolean r0 = r0.isFirstPackage()
            return r0
    }
}
