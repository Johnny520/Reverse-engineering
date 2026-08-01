package com.xingin.xhss;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ModuleMain extends io.github.libxposed.api.XposedModule {
    private boolean cache;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam f135;

    static {
            r0 = -286577859594309(0xfffefb5be47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r0 = -286642284103749(0xfffefb4ce47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            return
    }

    public ModuleMain() {
            r0 = this;
            r0.<init>()
            return
    }

    public final native java.lang.Object c(java.lang.Object r1);

    public final void onModuleLoaded(io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam r3) {
            r2 = this;
            r0 = -286260032014405(0xfffefba5e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r0 = -286225672276037(0xfffefbade47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r2.f135 = r3
            com.xingin.xhss.ModuleInit r0 = com.xingin.xhss.ModuleInit.f134
            r0 = -286758248220741(0xfffefb31e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r0 = -286788312991813(0xfffefb2ae47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            r0 = -224966553733189(0xffff3364e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r0 = -224996618504261(0xffff335de47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            com.xingin.xhss.ModuleMain r0 = xhss.C1085.f3504
            if (r0 != 0) goto L3f
            xhss.C1085.f3504 = r2
        L3f:
            io.github.libxposed.api.XposedModuleInterface$ModuleLoadedParam r2 = xhss.C1085.f3505
            if (r2 != 0) goto L45
            xhss.C1085.f3505 = r3
        L45:
            return
    }

    public final void onPackageLoaded(io.github.libxposed.api.XposedModuleInterface.PackageLoadedParam r15) {
            r14 = this;
            r0 = -286285801818181(0xfffefb9fe47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            super.onPackageLoaded(r15)
            io.github.libxposed.api.XposedModuleInterface$ModuleLoadedParam r14 = r14.f135
            if (r14 == 0) goto L10
            goto L19
        L10:
            r0 = -286148362864709(0xfffefbbfe47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r14 = 0
        L19:
            java.lang.String r14 = r14.getProcessName()
            r0 = -286311571621957(0xfffefb99e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            boolean r0 = r15.isFirstPackage()
            if (r0 == 0) goto L22d
            r0 = -286397470967877(0xfffefb85e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L4b
            r0 = -286461895477317(0xfffefb76e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L4b
            goto L22d
        L4b:
            com.xingin.xhss.ModuleInit r14 = com.xingin.xhss.ModuleInit.f134
            r0 = -286814082795589(0xfffefb24e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            r0 = -286839852599365(0xfffefb1ee47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            java.lang.System.loadLibrary(r0)
            r0 = -286869917370437(0xfffefb17e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            android.content.pm.ApplicationInfo r1 = r15.getApplicationInfo()
            java.lang.String r1 = r1.dataDir
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r14.e(r0)
            long r0 = java.lang.System.currentTimeMillis()
            xhss.ᲇᲁᛱᛸ r14 = xhss.C1085.f3497
            java.lang.ClassLoader r2 = r15.getDefaultClassLoader()
            r14.getClass()
            xhss.C1085.f3500 = r2
            android.content.pm.ApplicationInfo r14 = r15.getApplicationInfo()
            r2 = -286899982141509(0xfffefb10e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r2)
            r2 = -224811934910533(0xffff3388e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r2)
            xhss.C1085.f3502 = r14
            com.xingin.xhss.ModuleMain r14 = xhss.C1085.m1755()
            android.content.pm.ApplicationInfo r14 = r14.getModuleApplicationInfo()
            r2 = -287003061356613(0xfffefaf8e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r2)
            r2 = -224691675826245(0xffff33a4e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r2)
            xhss.C1085.f3499 = r14
            com.xingin.xhss.ModuleMain r14 = xhss.C1085.m1755()
            java.lang.String r14 = r14.getFrameworkName()
            r2 = -287131910375493(0xfffefadae47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r2)
            com.xingin.xhss.ModuleMain r2 = xhss.C1085.m1755()
            java.lang.String r2 = r2.getFrameworkVersion()
            r3 = -287226399656005(0xfffefac4e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r3)
            com.xingin.xhss.ModuleMain r3 = xhss.C1085.m1755()
            long r3 = r3.getFrameworkVersionCode()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = -287333773838405(0xfffefaabe47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            r5.<init>(r6)
            r5.append(r14)
            r6 = -287406788282437(0xfffefa9ae47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            r5.append(r6)
            r5.append(r2)
            r6 = -287496982595653(0xfffefa85e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r6)
            r5.append(r2)
            r5.append(r3)
            r2 = -287604356778053(0xfffefa6ce47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3 = -278176903563333(0xffff02ffe47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r3)
            r5 = -278078119315525(0xffff0316e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r5)
            int r7 = r2.length()
            r8 = -278112479053893(0xffff030ee47a77bb, double:NaN)
            r10 = 0
            if (r7 != 0) goto L13a
            goto L157
        L13a:
            int r7 = r2.length()
            r11 = r10
        L13f:
            if (r11 >= r7) goto L157
            int r12 = r11 + 2000
            if (r12 <= r7) goto L146
            r12 = r7
        L146:
            java.lang.String r11 = r2.substring(r11, r12)
            xhss.AbstractC0775.m1313(r8)
            xhss.ᲇᲁᛱᛸ r13 = xhss.C1085.f3497
            r13.getClass()
            xhss.C1085.m1750(r11)
            r11 = r12
            goto L13f
        L157:
            r11 = -287849169913925(0xfffefa33e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r11)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L177
            r11 = -287883529652293(0xfffefa2be47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r11)
            boolean r14 = r14.equals(r2)
            if (r14 != 0) goto L177
            goto L22d
        L177:
            xhss.C1085.f3496 = r15
            xhss.ᲇᲀᛳᛸ r14 = xhss.C1076.f3469     // Catch: java.lang.Throwable -> L181
            r14.mo213()     // Catch: java.lang.Throwable -> L181
            xhss.ᛵᛷᲈᛶ r14 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L181
            goto L188
        L181:
            r14 = move-exception
            xhss.ᲈᛳᛱᲇ r2 = new xhss.ᲈᛳᛱᲇ
            r2.<init>(r14)
            r14 = r2
        L188:
            java.lang.Throwable r14 = xhss.AbstractC0134.m364(r14)
            if (r14 == 0) goto L1d1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r11 = -287913594423365(0xfffefa24e47a77bb, double:NaN)
            java.lang.String r7 = xhss.AbstractC0775.m1313(r11)
            r2.<init>(r7)
            java.lang.String r14 = r14.getMessage()
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            xhss.AbstractC0775.m1313(r3)
            xhss.AbstractC0775.m1313(r5)
            int r2 = r14.length()
            if (r2 != 0) goto L1b4
            goto L1d1
        L1b4:
            int r2 = r14.length()
            r7 = r10
        L1b9:
            if (r7 >= r2) goto L1d1
            int r11 = r7 + 2000
            if (r11 <= r2) goto L1c0
            r11 = r2
        L1c0:
            java.lang.String r7 = r14.substring(r7, r11)
            xhss.AbstractC0775.m1313(r8)
            xhss.ᲇᲁᛱᛸ r12 = xhss.C1085.f3497
            r12.getClass()
            xhss.C1085.m1750(r7)
            r7 = r11
            goto L1b9
        L1d1:
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r0 = -287982313900101(0xfffefa14e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            r14.<init>(r0)
            java.lang.String r15 = r15.getPackageName()
            r14.append(r15)
            r0 = -288008083703877(0xfffefa0ee47a77bb, double:NaN)
            java.lang.String r15 = xhss.AbstractC0775.m1313(r0)
            r14.append(r15)
            r14.append(r11)
            r0 = -288038148474949(0xfffefa07e47a77bb, double:NaN)
            java.lang.String r15 = xhss.AbstractC0775.m1313(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            int r15 = xhss.AbstractC0390.m780(r3, r14, r5)
            if (r15 != 0) goto L211
            goto L22d
        L211:
            int r15 = r14.length()
        L215:
            if (r10 >= r15) goto L22d
            int r0 = r10 + 2000
            if (r0 <= r15) goto L21c
            r0 = r15
        L21c:
            java.lang.String r1 = r14.substring(r10, r0)
            xhss.AbstractC0775.m1313(r8)
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497
            r2.getClass()
            xhss.C1085.m1750(r1)
            r10 = r0
            goto L215
        L22d:
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m81(boolean r1) {
            r0 = this;
            r0.cache = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m82() {
            r0 = this;
            boolean r0 = r0.cache
            return r0
    }
}
