package p000;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.widget.Toast;
import com.ljx.wechatmod.core.GeekConfig$registerUpdateReceiver$receiver$1;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.fastkv.FastKV;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: js */
/* JADX INFO: loaded from: classes.dex */
public final class C0385js extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final int f2740a;

    /* JADX INFO: renamed from: b */
    public final Object f2741b;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C0385js(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            r3.f2740a = r4
            r3.f2741b = r5
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۧۦۢ"
            int r1 = androidx.core.graphics.drawable.C1009.m2946(r1)
        Le:
            switch(r1) {
                case 56421: goto L12;
                case 1747750: goto L48;
                case 1748711: goto L29;
                case 1749605: goto L41;
                case 1750539: goto L64;
                case 1754595: goto L5b;
                default: goto L11;
            }
        L11:
            goto Le
        L12:
            java.lang.String r0 = "vTuPdmaikXCu29ctUH"
            java.lang.String r0 = com.github.megatronking.stringfog.C1019.m2986(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r1 = com.google.android.material.datepicker.C1032.m3040()
            if (r1 < 0) goto L3e
            java.lang.String r1 = "ۡۢۨ"
        L24:
            int r1 = androidx.activity.result.C0994.m2889(r1)
            goto Le
        L29:
            int r1 = android.window.C0988.f5635
            if (r1 < 0) goto L34
            java.lang.String r1 = "ۢۥۤ"
        L2f:
            int r1 = com.google.android.material.appbar.C1020.m2993(r1)
            goto Le
        L34:
            int r1 = androidx.appcompat.widget.C1000.f5647
            int r2 = com.github.megatronking.stringfog.C1019.f5666
            int r1 = r1 % r2
            r2 = 1750356(0x1ab554, float:2.452771E-39)
            int r1 = r1 + r2
            goto Le
        L3e:
            java.lang.String r1 = "۠ۢۨ"
            goto L24
        L41:
            java.lang.String r1 = "ۧۦۢ"
            int r1 = com.google.android.material.datepicker.C1031.m3036(r1)
            goto Le
        L48:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = androidx.appcompat.app.C0997.f5644
            if (r1 < 0) goto L58
            java.lang.String r1 = "ۧۦۢ"
            int r1 = android.support.v4.graphics.drawable.C0987.m2861(r1)
            goto Le
        L58:
            java.lang.String r1 = "ۣ۟ۧ"
            goto L2f
        L5b:
            int r1 = androidx.core.graphics.drawable.C1009.m2948()
            if (r1 > 0) goto L29
            java.lang.String r1 = "ۣۨ"
            goto L24
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0385js.<init>(int, java.lang.Object):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x044e -> B:165:0x021d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    private final void m1616a(XC_MethodHook.MethodHookParam methodHookParam) {
        FastKV fastKV;
        FastKV fastKV2;
        String strM492a;
        String str;
        String str2;
        String str3;
        InterfaceC0814vd interfaceC0814vd = null;
        final int i = 1;
        final int i2 = 0;
        AbstractC0493mp.m1857g("param", methodHookParam);
        Object obj = methodHookParam.thisObject;
        AbstractC0493mp.m1855e("null cannot be cast to non-null type android.app.Application", obj);
        final Application application = (Application) obj;
        C0417kn c0417kn = C0417kn.f2847a;
        XC_LoadPackage.LoadPackageParam loadPackageParam = (XC_LoadPackage.LoadPackageParam) this.f2741b;
        String str4 = loadPackageParam.processName;
        AbstractC0493mp.m1856f("processName", str4);
        c0417kn.getClass();
        "context";
        "pName";
        C0417kn.f2848b = application;
        C0417kn.f2850d = str4;
        if (str4.equals("com.tencent.mm")) {
            try {
                File[] externalMediaDirs = application.getExternalMediaDirs();
                AbstractC0493mp.m1856f("getExternalMediaDirs(...)", externalMediaDirs);
                File file = externalMediaDirs.length == 0 ? null : externalMediaDirs[0];
                if (file == null) {
                    file = new File("/storage/emulated/0/Android/media/com.tencent.mm");
                }
                File file2 = new File(file, ".sys_cache/sns");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (file2.exists()) {
                    C0417kn.f2849c = new FastKV.Builder(file2.getAbsolutePath(), "sns_micro_video_cache").build();
                } else {
                    File file3 = new File(application.getFilesDir(), "geek_fallback_cache");
                    if (!file3.exists()) {
                        file3.mkdirs();
                    }
                    C0417kn.f2849c = new FastKV.Builder(file3.getAbsolutePath(), "sns_micro_video_cache").build();
                    String strM492a2 = "ConfigEngine";
                    String strM492a3 = "\u26a0\ufe0f \u5916\u90e8\u76ee\u5f55\u521b\u5efa\u5931\u8d25\uff0c\u5df2\u964d\u7ea7\u81f3\u5185\u90e8\u6c99\u76d2\u5b58\u50a8";
                    AbstractC0493mp.m1857g("tag", strM492a2);
                    AbstractC0493mp.m1857g("msg", strM492a3);
                }
                File file4 = new File(application.getFilesDir(), "xlog");
                if (new File(file4, "xlog_appender_metrics.kv").exists()) {
                    try {
                        Map all = new FastKV.Builder(file4.getAbsolutePath(), "xlog_appender_metrics").build().getAll();
                        AbstractC0493mp.m1856f("getAll(...)", all);
                        for (Map.Entry entry : all.entrySet()) {
                            String str5 = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Boolean) {
                                FastKV fastKV3 = C0417kn.f2849c;
                                if (fastKV3 != null) {
                                    fastKV3.putBoolean(str5, ((Boolean) value).booleanValue());
                                }
                            } else if (value instanceof String) {
                                FastKV fastKV4 = C0417kn.f2849c;
                                if (fastKV4 != null) {
                                    fastKV4.putString(str5, (String) value);
                                }
                            } else if ((value instanceof Integer) && (fastKV = C0417kn.f2849c) != null) {
                                fastKV.putInt(str5, ((Number) value).intValue());
                            }
                        }
                        C0301hk c0301hk = new C0301hk(new C0297hg(file4));
                        loop2: while (true) {
                            boolean z = true;
                            while (c0301hk.hasNext()) {
                                File file5 = (File) c0301hk.next();
                                if (!file5.delete() && file5.exists()) {
                                    z = false;
                                } else if (!z) {
                                    z = false;
                                }
                            }
                        }
                        String strM492a4 = "ConfigMigration";
                        String strM492a5 = "Media metrics synced and internal cache cleaned.";
                        AbstractC0493mp.m1857g("tag", strM492a4);
                        AbstractC0493mp.m1857g("msg", strM492a5);
                    } catch (Throwable th) {
                        AbstractC0493mp.m1857g("tag", "GeekConfig_CleanInternal");
                        "e";
                    }
                }
                SharedPreferences sharedPreferences = application.getSharedPreferences("geek_helper_prefs", 0);
                FastKV fastKV5 = C0417kn.f2849c;
                if (fastKV5 != null && !fastKV5.getBoolean("is_migrated_to_media_stealth", false)) {
                    Map<String, ?> all2 = sharedPreferences.getAll();
                    AbstractC0493mp.m1856f("getAll(...)", all2);
                    for (Map.Entry<String, ?> entry2 : all2.entrySet()) {
                        String key = entry2.getKey();
                        Object value2 = entry2.getValue();
                        if (value2 instanceof Boolean) {
                            FastKV fastKV6 = C0417kn.f2849c;
                            if (fastKV6 != null) {
                                fastKV6.putBoolean(key, ((Boolean) value2).booleanValue());
                            }
                        } else if (value2 instanceof String) {
                            FastKV fastKV7 = C0417kn.f2849c;
                            if (fastKV7 != null) {
                                fastKV7.putString(key, (String) value2);
                            }
                        } else if ((value2 instanceof Integer) && (fastKV2 = C0417kn.f2849c) != null) {
                            fastKV2.putInt(key, ((Number) value2).intValue());
                        }
                    }
                    FastKV fastKV8 = C0417kn.f2849c;
                    if (fastKV8 != null) {
                        fastKV8.putBoolean("is_migrated_to_media_stealth", true);
                    }
                    sharedPreferences.edit().clear().apply();
                }
            } catch (Throwable th2) {
                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "FastKV_Init_Crash", "tw==\n", "0vI8ySRxU5w=\n");
                try {
                    File file6 = new File(application.getFilesDir(), "geek_ultimate_fallback");
                    file6.mkdirs();
                    C0417kn.f2849c = new FastKV.Builder(file6.getAbsolutePath(), "sns_micro_video_cache").build();
                } catch (Throwable th3) {
                    g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "GeekConfig_UltimateFallback", "tw==\n", "0vI8ySRxU5w=\n");
                }
            }
        }
        application.registerActivityLifecycleCallbacks(new C0304hn());
        if (AbstractC0493mp.m1853c(loadPackageParam.processName, "com.tencent.mm")) {
            try {
                C0770u6.f4638a.getClass();
                C0770u6.m2442d(application);
            } catch (Throwable th4) {
                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "AuthManager_Init", "tw==\n", "0vI8ySRxU5w=\n");
            }
            C0417kn.f2847a.getClass();
            "context";
            IntentFilter intentFilter = new IntentFilter(C0417kn.f2858l);
            GeekConfig$registerUpdateReceiver$receiver$1 geekConfig$registerUpdateReceiver$receiver$1 = new GeekConfig$registerUpdateReceiver$receiver$1();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    application.registerReceiver(geekConfig$registerUpdateReceiver$receiver$1, intentFilter, 2);
                } else {
                    application.registerReceiver(geekConfig$registerUpdateReceiver$receiver$1, intentFilter);
                }
            } catch (Throwable th5) {
                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "GeekConfig_RegisterReceiver", "tw==\n", "0vI8ySRxU5w=\n");
            }
            try {
                long j = application.getPackageManager().getPackageInfo("com.ljx.wechatmod", 0).lastUpdateTime;
                C0417kn c0417kn2 = C0417kn.f2847a;
                String strM492a6 = "key_last_install_time";
                String strM492a7 = "0";
                c0417kn2.getClass();
                Long lM1473P = i50.m1473P(C0417kn.m1693d(strM492a6, strM492a7));
                if (j != (lM1473P != null ? lM1473P.longValue() : 0L)) {
                    String strM492a8 = "UpdateManager";
                    String strM492a9 = "\u68c0\u6d4b\u5230\u6a21\u5757\u53d1\u751f\u5b89\u88c5\u884c\u4e3a\uff0c\u5f3a\u5236\u91cd\u7f6e\u6697\u53f7\u4e3a #geek";
                    AbstractC0493mp.m1857g("tag", strM492a8);
                    AbstractC0493mp.m1857g("msg", strM492a9);
                    C0417kn.m1697h("key_secret_entry_code", "#geek");
                    C0417kn.m1697h("key_last_install_time", String.valueOf(j));
                    try {
                        Toast.makeText(application, "Geek\u6a21\u5757\u5df2\u91cd\u88c5\uff0c\u5165\u53e3\u6697\u53f7\u91cd\u7f6e\u4e3a #geek", 1).show();
                    } catch (Throwable th6) {
                    }
                }
            } catch (Throwable th7) {
                C0417kn c0417kn3 = C0417kn.f2847a;
                String strM492a10 = "key_secret_entry_code";
                c0417kn3.getClass();
                if (C0417kn.m1693d(strM492a10, "").length() == 0) {
                    C0417kn.m1697h("key_secret_entry_code", "#geek");
                }
                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "UpdateManager", "tw==\n", "0vI8ySRxU5w=\n");
            }
            ub0.m2470t(application);
            C0417kn c0417kn4 = C0417kn.f2847a;
            c0417kn4.getClass();
            C0703sd c0703sd = C0417kn.f2855i;
            ExecutorC0557of executorC0557of = AbstractC0929yg.f5431b;
            g80.m1206u(c0703sd, executorC0557of, new C0718ss(application, interfaceC0814vd, i2), 2);
            int iM1691b = C0417kn.m1691b("key_entry_mode", 2);
            if (iM1691b == 1 || iM1691b == 2) {
                C0417kn.m1699j("SecretEntryHook", new InterfaceC0379jm(application, i2) { // from class: rs

                    /* JADX INFO: renamed from: a */
                    public final int f4167a;

                    /* JADX INFO: renamed from: b */
                    public final Application f4168b;

                    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x003d A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x0032 A[SYNTHETIC] */
                    {
                        /*
                            r3 = this;
                            r3.f4167a = r5
                            r3.f4168b = r4
                            r3.<init>()
                            r0 = 0
                            java.lang.String r1 = "ۨۤۡ"
                            int r1 = com.google.android.material.appbar.C1021.m2996(r1)
                        Le:
                            switch(r1) {
                                case 56573: goto L12;
                                case 1749639: goto L2e;
                                case 1750535: goto L5f;
                                case 1753485: goto L78;
                                case 1755493: goto L13;
                                case 1755495: goto L44;
                                default: goto L11;
                            }
                        L11:
                            goto Le
                        L12:
                            return
                        L13:
                            int r1 = com.google.android.material.bottomappbar.C1024.m3008()
                            if (r1 > 0) goto L2e
                            int r1 = androidx.core.content.C1007.f5654
                            if (r1 > 0) goto L24
                            java.lang.String r1 = "ۨۥ"
                            int r1 = androidx.activity.result.C0992.m2881(r1)
                            goto Le
                        L24:
                            int r1 = com.google.android.material.bottomappbar.C1024.f5671
                            int r2 = com.google.android.material.snackbar.C1040.f5687
                            int r1 = r1 - r2
                            r2 = 1749956(0x1ab3c4, float:2.45221E-39)
                            int r1 = r1 + r2
                            goto Le
                        L2e:
                            int r1 = androidx.activity.result.C0992.f5639
                            if (r1 < 0) goto L3d
                            r1 = 93
                            com.github.megatronking.stringfog.C1019.f5666 = r1
                            java.lang.String r1 = "ۥ۟ۧ"
                            int r1 = androidx.appcompat.widget.C1000.m2911(r1)
                            goto Le
                        L3d:
                            java.lang.String r1 = "ۨۥ"
                        L3f:
                            int r1 = com.google.android.material.theme.C1042.m3078(r1)
                            goto Le
                        L44:
                            java.io.PrintStream r1 = java.lang.System.out
                            r1.println(r0)
                            int r1 = android.window.C0991.f5638
                            if (r1 > 0) goto L58
                            r1 = 33
                            androidx.appcompat.view.menu.C0999.f5646 = r1
                            java.lang.String r1 = "ۦۡۨ"
                            int r1 = com.google.android.material.behavior.C1022.m3001(r1)
                            goto Le
                        L58:
                            java.lang.String r1 = "ۨۥ"
                        L5a:
                            int r1 = com.google.android.material.internal.C1038.m3063(r1)
                            goto Le
                        L5f:
                            java.lang.String r0 = "M3DaV8b"
                            java.lang.String r0 = com.google.android.material.floatingactionbutton.C1037.m3058(r0)
                            int r1 = com.ljx.wechatmod.hook.C1049.m3105()
                            if (r1 > 0) goto L6e
                            java.lang.String r1 = "ۢۡۦ"
                            goto L5a
                        L6e:
                            int r1 = com.google.android.material.datepicker.C1034.f5681
                            int r2 = androidx.coordinatorlayout.widget.C1004.f5651
                            int r1 = r1 % r2
                            r2 = 1755539(0x1ac993, float:2.460034E-39)
                            int r1 = r1 + r2
                            goto Le
                        L78:
                            int r1 = com.google.android.material.appbar.C1020.f5667
                            int r2 = androidx.activity.C0996.f5643
                            r2 = r2 ^ 7039(0x1b7f, float:9.864E-42)
                            r1 = r1 ^ r2
                            if (r1 < 0) goto L87
                            com.google.android.material.appbar.C1020.m2990()
                            java.lang.String r1 = "ۧ۟ۨ"
                            goto L3f
                        L87:
                            int r1 = com.google.android.material.bottomappbar.C1024.f5671
                            int r2 = com.google.android.material.textfield.C1041.f5688
                            int r1 = r1 / r2
                            r2 = 1755493(0x1ac965, float:2.45997E-39)
                            int r1 = r1 + r2
                            goto Le
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.C0681rs.<init>(android.app.Application, int):void");
                    }

                    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x018d. Please report as an issue. */
                    /* JADX WARN: Removed duplicated region for block: B:205:0x056c  */
                    /* JADX WARN: Removed duplicated region for block: B:206:0x0574  */
                    /* JADX WARN: Removed duplicated region for block: B:280:0x04b6 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:292:0x01c6 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:302:0x01d3 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:303:0x04ae A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
                    @Override // p000.InterfaceC0379jm
                    /* JADX INFO: renamed from: a */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object mo474a() {
                        /*
                            Method dump skipped, instruction units count: 1678
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.C0681rs.mo474a():java.lang.Object");
                    }
                });
            }
            if (iM1691b == 0 || iM1691b == 2) {
                C0417kn.m1699j("MenuEntryHook", new InterfaceC0379jm
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04c8: INVOKE 
                      (wrap:java.lang.String:0x04bf: INVOKE ("NHbTUcmWzVUAW9JL5w==
                    "), ("eRO9JIz4uSc=
                    ") STATIC call: b50.a(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m), WRAPPED])
                      (wrap:jm:0x04c5: CONSTRUCTOR (r0v3 'application' android.app.Application A[DONT_INLINE]), (r4v0 'i' int A[DONT_INLINE]) A[MD:(android.app.Application, int):void (m), WRAPPED] call: rs.<init>(android.app.Application, int):void type: CONSTRUCTOR)
                     STATIC call: kn.j(java.lang.String, jm):void A[MD:(java.lang.String, jm):void (m)] in method: js.a(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:836)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 49 more
                    */
                /*
                    Method dump skipped, instruction units count: 1796
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C0385js.m1616a(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:197:0x05ca. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x007e. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:438:0x0bf8. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:1001:0x07a1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1002:0x11a4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1003:0x079d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1018:0x0ece A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1028:0x0737 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1030:0x0729 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1037:0x0b1c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1039:0x0b0b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1048:0x0f2a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1051:0x0f97 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1074:0x03f9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1076:0x10f5 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1079:0x03ee A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1082:0x0d46 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1102:0x0570 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1104:0x0563 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1116:0x05e8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1120:0x05d6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1122:0x0bc9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1125:0x0bc1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1134:0x0d3e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1135:0x0d2b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1151:0x08a6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1154:0x0ed5 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1156:0x0899 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1166:0x1411 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1168:0x1403 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1190:0x0fec A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1192:0x0fdf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1197:0x0a84 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1198:0x0a76 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1204:0x10ff A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1216:0x0c12 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1218:0x0c04 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1219:0x0d1e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1220:0x119d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1252:0x0f26 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:1258:0x0fa4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:278:0x07af  */
            /* JADX WARN: Removed duplicated region for block: B:279:0x07b6  */
            /* JADX WARN: Removed duplicated region for block: B:961:0x07e7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:962:0x07dd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:967:0x036d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:970:0x035f A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r75) {
                /*
                    Method dump skipped, instruction units count: 6288
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C0385js.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x031f  */
            /* JADX WARN: Removed duplicated region for block: B:214:0x071b  */
            /* JADX WARN: Removed duplicated region for block: B:234:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fe  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0302  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0309  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r14) {
                /*
                    Method dump skipped, instruction units count: 1830
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.C0385js.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
            }
        }
