package com.ss.android.ugc.awemes;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ModuleMain extends com.ss.android.ugc.awemes.wrapper.ModuleMainWrapper {
    public ModuleMain() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.ss.android.ugc.awemes.wrapper.ModuleMainWrapper
    public native java.lang.Object e(java.lang.Object r1);

    public final void onModuleLoaded(io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam r5) {
            r4 = this;
            r0 = -718621327662638(0xfffd726aef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            ᲈᛱᛲ r1 = new ᲈᛱᛲ
            r1.<init>(r5)
            r0.getClass()
            r2 = -474443846950446(0xfffe507eef0961d2, double:NaN)
            r2 = -474473911721518(0xfffe5077ef0961d2, double:NaN)
            r2 = -473649278000686(0xfffe5137ef0961d2, double:NaN)
            defpackage.C0346.f1775 = r4
            android.content.pm.ApplicationInfo r4 = r4.getModuleApplicationInfo()
            r2 = -474551221132846(0xfffe5065ef0961d2, double:NaN)
            r2 = -473778127019566(0xfffe5119ef0961d2, double:NaN)
            defpackage.C0346.f1772 = r4
            r4 = -474010055253550(0xfffe50e3ef0961d2, double:NaN)
            defpackage.C0346.f1770 = r1
            return
    }

    @Override // com.ss.android.ugc.awemes.wrapper.ModuleMainWrapper
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo298(defpackage.C0405 r4) {
            r3 = this;
            r0 = -718647097466414(0xfffd7264ef0961d2, double:NaN)
            java.lang.String r0 = r4.getPackageName()
            r1 = -718672867270190(0xfffd725eef0961d2, double:NaN)
            java.lang.String r1 = "com.miui.contentcatcher"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            io.github.libxposed.api.XposedModuleInterface$PackageLoadedParam r0 = r4.f2062
            boolean r0 = r0.isFirstPackage()
            if (r0 != 0) goto L25
        L24:
            return
        L25:
            r0 = -718775946485294(0xfffd7246ef0961d2, double:NaN)
            java.lang.String r0 = "native"
            java.lang.System.loadLibrary(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r1 = -718806011256366(0xfffd723fef0961d2, double:NaN)
            java.lang.String r1 = "0x106"
            r0.add(r1)
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()
            java.lang.String r1 = r1.dataDir
            r0.add(r1)
            r3.e(r0)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            ᲈᛱᛲ r0 = defpackage.C0346.f1770
            if (r0 == 0) goto L59
            goto L62
        L59:
            r0 = -473932745842222(0xfffe50f5ef0961d2, double:NaN)
            r0 = 0
        L62:
            java.lang.String r0 = r0.getProcessName()
            r1 = -474409487212078(0xfffe5086ef0961d2, double:NaN)
            defpackage.C0346.f1769 = r0
            java.lang.String r3 = r3.getFrameworkName()
            r0 = -718831781060142(0xfffd7239ef0961d2, double:NaN)
            r0 = -474220508651054(0xfffe50b2ef0961d2, double:NaN)
            defpackage.C0346.f1777 = r3
            r0 = -474126019370542(0xfffe50c8ef0961d2, double:NaN)
            defpackage.C0346.f1776 = r4
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo()
            r0 = -473898386103854(0xfffe50fdef0961d2, double:NaN)
            defpackage.C0346.f1771 = r3
            java.lang.ClassLoader r3 = r4.getDefaultClassLoader()
            r0 = -474323587866158(0xfffe509aef0961d2, double:NaN)
            defpackage.C0346.f1767 = r3
            ᛶᲀᛶᛳ r3 = defpackage.C1143.f5236
            r3.m1023()
            return
    }
}
