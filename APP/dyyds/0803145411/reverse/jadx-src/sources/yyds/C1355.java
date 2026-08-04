package yyds;

import io.github.libxposed.api.XposedModuleInterface;

/* JADX INFO: renamed from: yyds.ᛶᛶᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1355 implements XposedModuleInterface.ModuleLoadedParam {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final XposedModuleInterface.ModuleLoadedParam f6256;

    public C1355(XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        AbstractC2328.m4341(-810197908620142L);
        this.f6256 = moduleLoadedParam;
    }

    public final String getProcessName() {
        String processName = this.f6256.getProcessName();
        AbstractC2328.m4341(-810223678423918L);
        return processName;
    }

    public final boolean isSystemServer() {
        return this.f6256.isSystemServer();
    }
}
