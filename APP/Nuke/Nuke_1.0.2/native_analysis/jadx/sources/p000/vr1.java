package p000;

import android.os.Build;
import android.system.Os;
import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import me.dartcv.nuke.BuildConfig;
import nuke.data.cipher.NativeCrypto;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vr1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f12145a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static o70 m5780a() {
        String str;
        int i;
        String str2;
        String str3;
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String str4 = (String) AbstractC0460mg.m3097l0(strArr);
        if (str4 == null) {
            str4 = "";
            str = str4;
        } else {
            str = "";
        }
        int i2 = Build.VERSION.SDK_INT;
        String strSubstring = Build.VERSION.RELEASE;
        strSubstring.getClass();
        int iM4004q0 = pv2.m4004q0(strSubstring, ".", 0, false, 6);
        if (iM4004q0 != -1) {
            strSubstring = strSubstring.substring(0, iM4004q0);
        }
        Integer numM6013e0 = wv2.m6013e0(strSubstring);
        int iIntValue = numM6013e0 != null ? numM6013e0.intValue() : i2;
        String str5 = Build.BRAND;
        if (str5 == null) {
            str5 = str;
        }
        String str6 = Build.MODEL;
        if (str6 == null) {
            String str7 = str5;
            str3 = str;
            i = iIntValue;
            str2 = str7;
        } else {
            i = iIntValue;
            str2 = str5;
            str3 = str6;
        }
        return new o70(str4, i2, i, str2, str3);
    }

    /* JADX INFO: renamed from: b */
    public static String m5781b(vu0 vu0Var) {
        if (vu0Var == vu0.f12174i) {
            String strM1340a = ed3.m1340a();
            String string = ed3.f2402a.getString("last_login_nick_name", "");
            string.getClass();
            pp1 pp1Var = pp1.f8445a;
            pp1.f8447c = new x83(new t22(false, "", 0L, 0L), m5780a(), pp0.m3915m(vu0Var), strM1340a, string, System.currentTimeMillis(), (String) null, (String) null, ed3.f2403b, 192, (c50) null);
            return strM1340a;
        }
        if (vu0Var != vu0.f12173h) {
            c80.m663A("Invalid hostType: ", vu0Var);
            return null;
        }
        pp1 pp1Var2 = pp1.f8445a;
        pp1.f8447c = new x83(new t22(false, "", 0L, 0L), m5780a(), pp0.m3915m(vu0Var), "2968447202", "kyousuke", System.currentTimeMillis(), (String) null, (String) null, "", 192, (c50) null);
        return "2968447202";
    }

    /* JADX INFO: renamed from: c */
    public static void m5782c(String str, vu0 vu0Var) {
        String str2;
        Object x92Var;
        int iOrdinal = vu0Var.ordinal();
        if (iOrdinal == 0) {
            str2 = z02.f13696QQ;
        } else if (iOrdinal == 1) {
            str2 = z02.WECHAT;
        } else {
            if (iOrdinal != 2) {
                c80.m675s();
                return;
            }
            str2 = z02.TIKTOK;
        }
        boolean zM4006s0 = pv2.m4006s0(str);
        Object x92Var2 = a83.f116a;
        if (zM4006s0) {
            try {
                XposedBridge.log("[NukeCore]Skip Nuke server sync: empty user id");
            } catch (Throwable th) {
            }
            if (x92Var2 instanceof x92) {
                Log.println(4, "NukeCore", "Skip Nuke server sync: empty user id");
                return;
            }
            return;
        }
        AtomicBoolean atomicBoolean = f12145a;
        if (!atomicBoolean.compareAndSet(false, true)) {
            try {
                XposedBridge.log("[NukeCore]Skip Nuke server sync: already running");
            } catch (Throwable th2) {
            }
            if (x92Var2 instanceof x92) {
                Log.println(4, "NukeCore", "Skip Nuke server sync: already running");
                return;
            }
            return;
        }
        try {
            try {
                m5783d(str, str2, vu0Var);
                x92Var = x92Var2;
            } finally {
            }
            Throwable thM6237a = y92.m6237a(x92Var);
            if (thM6237a != null) {
                String string = "Nuke server sync failed after feature install: ".concat(fg1.m1624Q(thM6237a)).toString();
                try {
                    XposedBridge.log("[NukeCore]" + string);
                } catch (Throwable th3) {
                    x92Var2 = new x92(th3);
                }
                if (x92Var2 instanceof x92) {
                    Log.println(6, "NukeCore", string);
                }
            }
            atomicBoolean.set(false);
        } catch (Throwable th4) {
            atomicBoolean.set(false);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5783d(String str, String str2, vu0 vu0Var) {
        String strM5692k;
        Object x92Var;
        Object x92Var2;
        boolean z;
        String str3;
        Object x92Var3;
        Object x92Var4;
        Object x92Var5;
        Object x92Var6;
        Method declaredMethod;
        Integer numM6013e0;
        boolean zIsConfigured = NativeCrypto.INSTANCE.isConfigured();
        Object x92Var7 = a83.f116a;
        if (!zIsConfigured) {
            try {
                XposedBridge.log("[NukeCore]Skip Nuke server sync: native client secrets are not configured");
            } catch (Throwable th) {
                x92Var7 = new x92(th);
            }
            if (x92Var7 instanceof x92) {
                Log.println(4, "NukeCore", "Skip Nuke server sync: native client secrets are not configured");
                return;
            }
            return;
        }
        if (str2.equals(z02.WECHAT)) {
            String string = ed3.f2402a.getString("last_login_nick_name", "");
            string.getClass();
            strM5692k = vi0.m5692k("Nuke onLogin: ", string, "/", ed3.f2404c, ", module=1.0.2(release), buildTime=1785243782422");
        } else {
            strM5692k = "Nuke onLogin";
        }
        String str4 = strM5692k;
        e41 e41Var = new e41();
        e41 e41Var2 = new e41();
        e41Var2.m1250d("mode", "in_process");
        e41Var2.m1249c("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        e41Var2.m1250d(BuildConfig.BUILD_TYPE, Build.VERSION.RELEASE);
        e41Var2.m1248b("available", Boolean.valueOf(new File("/sys/fs/selinux").isDirectory()));
        Boolean boolM4697h0 = s11.m4697h0("isSELinuxEnabled");
        e41Var2.m1248b("enabled", Boolean.valueOf(boolM4697h0 != null ? boolM4697h0.booleanValue() : new File("/sys/fs/selinux").isDirectory()));
        Boolean boolM4697h02 = s11.m4697h0("isSELinuxEnforced");
        if (boolM4697h02 == null) {
            String strM4693f0 = s11.m4693f0("/sys/fs/selinux/enforce");
            if (strM4693f0 == null || (numM6013e0 = wv2.m6013e0(strM4693f0)) == null) {
                boolM4697h02 = null;
            } else {
                boolM4697h02 = Boolean.valueOf(numM6013e0.intValue() == 1);
            }
        }
        e41Var2.m1248b("enforced", boolM4697h02);
        try {
            Class clsM4699i0 = s11.m4699i0();
            Object objInvoke = (clsM4699i0 == null || (declaredMethod = clsM4699i0.getDeclaredMethod("getContext", null)) == null) ? null : declaredMethod.invoke(null, null);
            x92Var = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        String str5 = (String) x92Var;
        String string2 = str5 != null ? pv2.m3993I0(str5).toString() : null;
        if (string2 == null) {
            string2 = s11.m4693f0("/proc/self/task/" + Os.gettid() + "/attr/current");
        }
        e41Var2.m1250d("context", string2);
        Class cls = Integer.TYPE;
        cls.getClass();
        String strM4701j0 = s11.m4701j0("getPidContext", new Class[]{cls}, Integer.valueOf(Os.getpid()));
        if (strM4701j0 == null) {
            strM4701j0 = s11.m4693f0("/proc/self/attr/current");
        }
        e41Var2.m1250d("pidContext", strM4701j0);
        e41Var2.m1250d("procContext", s11.m4701j0("getFileContext", new Class[]{String.class}, "/proc/self"));
        try {
            byte[] bArrM5899e0 = wi0.m5899e0(new File("/sys/fs/selinux/status"));
            if (bArrM5899e0.length < 20) {
                x92Var2 = null;
            } else {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrM5899e0).order(ByteOrder.nativeOrder());
                e41 e41Var3 = new e41();
                e41Var3.m1249c("version", Integer.valueOf(byteBufferOrder.getInt(0)));
                e41Var3.m1249c("sequence", Integer.valueOf(byteBufferOrder.getInt(4)));
                e41Var3.m1249c("enforcing", Integer.valueOf(byteBufferOrder.getInt(8)));
                e41Var3.m1249c("policyload", Integer.valueOf(byteBufferOrder.getInt(12)));
                e41Var3.m1249c("denyUnknown", Integer.valueOf(byteBufferOrder.getInt(16)));
                x92Var2 = e41Var3;
            }
        } catch (Throwable th3) {
            x92Var2 = new x92(th3);
        }
        boolean z2 = x92Var2 instanceof x92;
        Object obj = x92Var2;
        if (z2) {
            obj = null;
        }
        e41 e41Var4 = (e41) obj;
        mb1 mb1Var = e41Var2.f2304h;
        if (e41Var4 != null) {
            mb1Var.put("status", e41Var4);
        }
        e41 e41Var5 = new e41();
        a31 a31Var = new a31();
        s11.m4727z(e41Var5, a31Var, "system_server_execmem", s11.m4725x("u:r:system_server:s0", "u:r:system_server:s0", "process", "execmem"));
        s11.m4727z(e41Var5, a31Var, "aosp_su_transition", s11.m4725x("u:r:shell:s0", "u:r:su:s0", "process", "transition"));
        s11.m4727z(e41Var5, a31Var, "adbroot_context", s11.m4658C("u:r:adbroot:s0"));
        s11.m4727z(e41Var5, a31Var, "magisk_context", s11.m4722u(s11.m4658C("u:r:magisk:s0"), s11.m4658C("u:object_r:magisk_file:s0"), s11.m4725x("u:object_r:rootfs:s0", "u:object_r:tmpfs:s0", "filesystem", "associate"), s11.m4725x("u:r:kernel:s0", "u:object_r:tmpfs:s0", "fifo_file", "open")));
        s11.m4727z(e41Var5, a31Var, "kernelsu_context", s11.m4722u(s11.m4658C("u:r:ksu:s0"), s11.m4658C("u:object_r:ksu_file:s0"), s11.m4725x("u:r:kernel:s0", "u:object_r:adb_data_file:s0", "file", "read")));
        s11.m4727z(e41Var5, a31Var, "lsposed_context", s11.m4722u(s11.m4658C("u:object_r:lsposed_file:s0"), s11.m4725x("u:r:system_server:s0", "u:object_r:apk_data_file:s0", "file", "execute")));
        s11.m4727z(e41Var5, a31Var, "xposed_context", s11.m4722u(s11.m4658C("u:object_r:xposed_data:s0"), s11.m4658C("u:object_r:xposed_file:s0"), s11.m4725x("u:r:dex2oat:s0", "u:object_r:dex2oat_exec:s0", "file", "execute_no_trans")));
        s11.m4727z(e41Var5, a31Var, "zygisk_next_rule", s11.m4725x("u:r:zygote:s0", "u:object_r:adb_data_file:s0", "dir", "search"));
        mb1Var.put("markers", e41Var5);
        mb1Var.put("detected", a31Var);
        e41Var.f2304h.put("dirtySepolicy", e41Var2);
        String str6 = up0.f11406n;
        if (str6 == null) {
            t11.m5067S("hostPkgName");
            throw null;
        }
        e41Var.m1250d("hostPackage", str6);
        e41Var.m1250d("hostType", vu0Var.name());
        String str7 = Build.VERSION.RELEASE;
        Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String str8 = Build.BRAND;
        String str9 = Build.MANUFACTURER;
        String str10 = Build.MODEL;
        String str11 = Build.DEVICE;
        String str12 = up0.f11406n;
        if (str12 == null) {
            t11.m5067S("hostPkgName");
            throw null;
        }
        String property = System.getProperty("os.arch");
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String str13 = (String) AbstractC0460mg.m3097l0(strArr);
        try {
            Field field = XposedBridge.class.getField("TAG");
            field.getClass();
            z = true;
            try {
                field.setAccessible(true);
                try {
                    Object obj2 = field.get(null);
                    obj2.getClass();
                    str3 = (String) obj2;
                } catch (Exception unused) {
                    str3 = "未知";
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            z = true;
        }
        if (str3.equals("BugHook")) {
            str3 = "应用转生";
        } else if (str3.equals("LSPosed-Bridge")) {
            str3 = "LSPosed";
        } else if (str3.equals("SandXposed")) {
            str3 = "天鉴";
        } else if (str3.equals("PineXposed")) {
            str3 = "DreamLand";
        } else if (str3.equals("Xposed")) {
            try {
                ClassLoader classLoader = XposedBridge.class.getClassLoader();
                classLoader.getClass();
                if (classLoader.loadClass("me.weishu.exposed.ExposedBridge") != null) {
                    str3 = "太极";
                }
            } catch (Exception unused4) {
            }
        }
        boolean z3 = z;
        C0555ot c0555ot = new C0555ot(str4, new C0512nt(str7, numValueOf, str8, str9, str10, str11, BuildConfig.VERSION_NAME, "234", str12, property, str13, str3, null, "unknown", null, null, null, Locale.getDefault().toLanguageTag(), TimeZone.getDefault().getID(), null, e41Var, 643072, null));
        e41 e41Var6 = new e41();
        e41Var6.m1250d("userId", str);
        e41Var6.m1250d("platform", str2);
        try {
            try {
                l41 l41Var = new l41(new StringReader(new ir0().m2388e(c0555ot)));
                k31 k31VarM5196Y = AbstractC0731te.m5196Y(l41Var);
                try {
                    k31VarM5196Y.getClass();
                    if (!(k31VarM5196Y instanceof a41) && l41Var.m2814I() != 10) {
                        throw new t31("Did not consume the entire document.");
                    }
                    e41Var6.f2304h.put("report", k31VarM5196Y);
                    try {
                        NativeCrypto nativeCrypto = NativeCrypto.INSTANCE;
                        String string3 = e41Var6.toString();
                        string3.getClass();
                        x92Var3 = nativeCrypto.syncClient(string3);
                    } catch (Throwable th4) {
                        x92Var3 = new x92(th4);
                    }
                    Throwable thM6237a = y92.m6237a(x92Var3);
                    if (thM6237a != null) {
                        String string4 = "Nuke native client sync failed: ".concat(fg1.m1624Q(thM6237a)).toString();
                        try {
                            XposedBridge.log("[NukeCore]" + string4);
                            x92Var4 = x92Var7;
                        } catch (Throwable th5) {
                            x92Var4 = new x92(th5);
                        }
                        if (x92Var4 instanceof x92) {
                            Log.println(6, "NukeCore", string4);
                            return;
                        }
                        return;
                    }
                    try {
                        x92Var5 = (C0592pt) new ir0().m2385b((String) x92Var3, C0592pt.class);
                    } catch (Throwable th6) {
                        x92Var5 = new x92(th6);
                    }
                    if (!(x92Var5 instanceof x92)) {
                        C0592pt c0592pt = (C0592pt) x92Var5;
                        c0592pt.getClass();
                        boolean z4 = (t11.m5086l(c0592pt.m3981l(), y83.ACTIVE) && (t11.m5086l(c0592pt.m3978i(), hx0.VIP) || t11.m5086l(c0592pt.m3978i(), hx0.SPECIAL))) ? z3 : false;
                        long jM3980k = c0592pt.m3980k() * 1000;
                        pp1 pp1Var = pp1.f8445a;
                        x83 x83Var = pp1.f8447c;
                        if (x83Var == null) {
                            t11.m5067S("mUser");
                            throw null;
                        }
                        String strM3982m = c0592pt.m3982m();
                        if (strM3982m == null) {
                            strM3982m = c0592pt.m3978i();
                        }
                        x83 x83VarM6052k = x83.m6052k(x83Var, new t22(z4, strM3982m, 0L, jM3980k), null, null, null, null, jM3980k, c0592pt.m3981l(), null, null, 414, null);
                        x83VarM6052k.getClass();
                        pp1.f8447c = x83VarM6052k;
                    }
                    Throwable thM6237a2 = y92.m6237a(x92Var5);
                    if (thM6237a2 != null) {
                        String string5 = "Decrypt report response failed: ".concat(fg1.m1624Q(thM6237a2)).toString();
                        try {
                            XposedBridge.log("[NukeCore]" + string5);
                            x92Var6 = x92Var7;
                        } catch (Throwable th7) {
                            x92Var6 = new x92(th7);
                        }
                        if (x92Var6 instanceof x92) {
                            Log.println(6, "NukeCore", string5);
                        }
                    }
                } catch (NumberFormatException e) {
                    e = e;
                    throw new t31(e);
                }
            } catch (IOException e2) {
                throw new t31(e2);
            }
        } catch (NumberFormatException | ke1 e3) {
            e = e3;
        }
    }
}
