package com.p000ss.android.ugc.awemes.wrapper;

import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import yyds.AbstractC2328;
import yyds.C0474;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleMainWrapper extends XposedModule {
    /* JADX INFO: renamed from: e */
    public native byte[] mo2e(byte[] bArr);

    public final void onPackageLoaded(XposedModuleInterface.PackageLoadedParam packageLoadedParam) {
        AbstractC2328.m4341(-810309577769838L);
        mo343(new C0474(packageLoadedParam));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo343(C0474 c0474) {
        AbstractC2328.m4341(-810335347573614L);
    }
}
