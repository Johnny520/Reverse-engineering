package defpackage;

/* JADX INFO: renamed from: ᲈᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2169 implements io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam f9242;

    public C2169(io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam r3) {
            r2 = this;
            r0 = -529256219581998(0xfffe1ea4ef0961d2, double:NaN)
            r2.<init>()
            r2.f9242 = r3
            return
    }

    public final java.lang.String getProcessName() {
            r2 = this;
            io.github.libxposed.api.XposedModuleInterface$ModuleLoadedParam r2 = r2.f9242
            java.lang.String r2 = r2.getProcessName()
            r0 = -529281989385774(0xfffe1e9eef0961d2, double:NaN)
            return r2
    }

    public final boolean isSystemServer() {
            r0 = this;
            io.github.libxposed.api.XposedModuleInterface$ModuleLoadedParam r0 = r0.f9242
            boolean r0 = r0.isSystemServer()
            return r0
    }
}
