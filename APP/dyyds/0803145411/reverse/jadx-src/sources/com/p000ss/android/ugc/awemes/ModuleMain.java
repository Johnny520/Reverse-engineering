package com.p000ss.android.ugc.awemes;

import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.p000ss.android.ugc.awemes.wrapper.ModuleMainWrapper;
import io.github.libxposed.api.XposedModuleInterface;
import yyds.AbstractC2328;
import yyds.C0207;
import yyds.C0474;
import yyds.C1009;
import yyds.C1355;
import yyds.C2701;
import yyds.C2713;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ModuleMain extends ModuleMainWrapper {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f488 = 0;

    @Override // com.p000ss.android.ugc.awemes.wrapper.ModuleMainWrapper
    /* JADX INFO: renamed from: e */
    public native byte[] mo2e(byte[] bArr);

    public final void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        AbstractC2328.m4341(-1142787291120494L);
        C2701 c2701 = C2701.f13261;
        C1355 c1355 = new C1355(moduleLoadedParam);
        c2701.getClass();
        AbstractC2328.m4341(-740688157901678L);
        AbstractC2328.m4341(-740718222672750L);
        AbstractC2328.m4341(-739893588951918L);
        C2701.f13262 = this;
        ApplicationInfo moduleApplicationInfo = getModuleApplicationInfo();
        AbstractC2328.m4341(-740795532084078L);
        AbstractC2328.m4341(-740022437970798L);
        C2701.f13266 = moduleApplicationInfo;
        AbstractC2328.m4341(-740254366204782L);
        C2701.f13260 = c1355;
    }

    @Override // com.p000ss.android.ugc.awemes.wrapper.ModuleMainWrapper
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo343(C0474 c0474) {
        AbstractC2328.m4341(-1142813060924270L);
        if (c0474.getPackageName().equals(AbstractC2328.m4341(-1142838830728046L)) || !c0474.f2380.isFirstPackage() || Process.isIsolated()) {
            return;
        }
        System.loadLibrary(AbstractC2328.m4341(-1142941909943150L));
        String str = c0474.getApplicationInfo().dataDir;
        AbstractC2328.m4341(-1142971974714222L);
        C0207.f1193.m859(str, new C2713(9, this));
        C2701.f13261.getClass();
        C1355 c1355 = C2701.f13260;
        if (c1355 == null) {
            AbstractC2328.m4341(-740177056793454L);
            c1355 = null;
        }
        String processName = c1355.getProcessName();
        AbstractC2328.m4341(-740653798163310L);
        C2701.f13259 = processName;
        String frameworkName = getFrameworkName();
        AbstractC2328.m4341(-1143006334452590L);
        AbstractC2328.m4341(-740464819602286L);
        C2701.f13263 = frameworkName;
        AbstractC2328.m4341(-740370330321774L);
        C2701.f13267 = c0474;
        ApplicationInfo applicationInfo = c0474.getApplicationInfo();
        AbstractC2328.m4341(-740142697055086L);
        C2701.f13268 = applicationInfo;
        ClassLoader defaultClassLoader = c0474.getDefaultClassLoader();
        AbstractC2328.m4341(-740567898817390L);
        C2701.f13258 = defaultClassLoader;
        C1009.f4599.m686();
    }
}
