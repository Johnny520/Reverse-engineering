package defpackage;

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
    public static final AtomicBoolean a = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static o70 a() {
        String str;
        int i;
        String str2;
        String str3;
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String str4 = (String) mg.l0(strArr);
        if (str4 == null) {
            str4 = "";
            str = str4;
        } else {
            str = "";
        }
        int i2 = Build.VERSION.SDK_INT;
        String strSubstring = Build.VERSION.RELEASE;
        strSubstring.getClass();
        int iQ0 = pv2.q0(strSubstring, ".", 0, false, 6);
        if (iQ0 != -1) {
            strSubstring = strSubstring.substring(0, iQ0);
        }
        Integer numE0 = wv2.e0(strSubstring);
        int iIntValue = numE0 != null ? numE0.intValue() : i2;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(vu0 vu0Var) {
        if (vu0Var == vu0.i) {
            String strA = ed3.a();
            String string = ed3.a.getString("last_login_nick_name", "");
            string.getClass();
            pp1 pp1Var = pp1.a;
            pp1.c = new x83(new t22(false, "", 0L, 0L), a(), pp0.m(vu0Var), strA, string, System.currentTimeMillis(), (String) null, (String) null, ed3.b, 192, (c50) null);
            return strA;
        }
        if (vu0Var != vu0.h) {
            c80.A("Invalid hostType: ", vu0Var);
            return null;
        }
        pp1 pp1Var2 = pp1.a;
        pp1.c = new x83(new t22(false, "", 0L, 0L), a(), pp0.m(vu0Var), "2968447202", "kyousuke", System.currentTimeMillis(), (String) null, (String) null, "", 192, (c50) null);
        return "2968447202";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    public static void c(String str, vu0 vu0Var) {
        String str2;
        Object x92Var;
        int iOrdinal = vu0Var.ordinal();
        if (iOrdinal == 0) {
            str2 = z02.QQ;
        } else if (iOrdinal == 1) {
            str2 = z02.WECHAT;
        } else {
            if (iOrdinal != 2) {
                c80.s();
                return;
            }
            str2 = z02.TIKTOK;
        }
        boolean zS0 = pv2.s0(str);
        Object x92Var2 = a83.a;
        if (zS0) {
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
        AtomicBoolean atomicBoolean = a;
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
                d(str, str2, vu0Var);
                x92Var = x92Var2;
            } finally {
            }
            Throwable thA = y92.a(x92Var);
            if (thA != null) {
                String string = "Nuke server sync failed after feature install: ".concat(fg1.Q(thA)).toString();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(String str, String str2, vu0 vu0Var) {
        String strK;
        Object x92Var;
        Object x92Var2;
        boolean z;
        String str3;
        Object x92Var3;
        Object x92Var4;
        Object x92Var5;
        Object x92Var6;
        Method declaredMethod;
        Integer numE0;
        boolean zIsConfigured = NativeCrypto.INSTANCE.isConfigured();
        Object x92Var7 = a83.a;
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
            String string = ed3.a.getString("last_login_nick_name", "");
            string.getClass();
            strK = vi0.k("Nuke onLogin: ", string, "/", ed3.c, ", module=1.0.2(release), buildTime=1785243782422");
        } else {
            strK = "Nuke onLogin";
        }
        String str4 = strK;
        e41 e41Var = new e41();
        e41 e41Var2 = new e41();
        e41Var2.d("mode", "in_process");
        e41Var2.c("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        e41Var2.d(BuildConfig.BUILD_TYPE, Build.VERSION.RELEASE);
        e41Var2.b("available", Boolean.valueOf(new File("/sys/fs/selinux").isDirectory()));
        Boolean boolH0 = s11.h0("isSELinuxEnabled");
        e41Var2.b("enabled", Boolean.valueOf(boolH0 != null ? boolH0.booleanValue() : new File("/sys/fs/selinux").isDirectory()));
        Boolean boolH02 = s11.h0("isSELinuxEnforced");
        if (boolH02 == null) {
            String strF0 = s11.f0("/sys/fs/selinux/enforce");
            if (strF0 == null || (numE0 = wv2.e0(strF0)) == null) {
                boolH02 = null;
            } else {
                boolH02 = Boolean.valueOf(numE0.intValue() == 1);
            }
        }
        e41Var2.b("enforced", boolH02);
        try {
            Class clsI0 = s11.i0();
            Object objInvoke = (clsI0 == null || (declaredMethod = clsI0.getDeclaredMethod("getContext", null)) == null) ? null : declaredMethod.invoke(null, null);
            x92Var = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        String str5 = (String) x92Var;
        String string2 = str5 != null ? pv2.I0(str5).toString() : null;
        if (string2 == null) {
            string2 = s11.f0("/proc/self/task/" + Os.gettid() + "/attr/current");
        }
        e41Var2.d("context", string2);
        Class cls = Integer.TYPE;
        cls.getClass();
        String strJ0 = s11.j0("getPidContext", new Class[]{cls}, Integer.valueOf(Os.getpid()));
        if (strJ0 == null) {
            strJ0 = s11.f0("/proc/self/attr/current");
        }
        e41Var2.d("pidContext", strJ0);
        e41Var2.d("procContext", s11.j0("getFileContext", new Class[]{String.class}, "/proc/self"));
        try {
            byte[] bArrE0 = wi0.e0(new File("/sys/fs/selinux/status"));
            if (bArrE0.length < 20) {
                x92Var2 = null;
            } else {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrE0).order(ByteOrder.nativeOrder());
                e41 e41Var3 = new e41();
                e41Var3.c("version", Integer.valueOf(byteBufferOrder.getInt(0)));
                e41Var3.c("sequence", Integer.valueOf(byteBufferOrder.getInt(4)));
                e41Var3.c("enforcing", Integer.valueOf(byteBufferOrder.getInt(8)));
                e41Var3.c("policyload", Integer.valueOf(byteBufferOrder.getInt(12)));
                e41Var3.c("denyUnknown", Integer.valueOf(byteBufferOrder.getInt(16)));
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
        mb1 mb1Var = e41Var2.h;
        if (e41Var4 != null) {
            mb1Var.put("status", e41Var4);
        }
        e41 e41Var5 = new e41();
        a31 a31Var = new a31();
        s11.z(e41Var5, a31Var, "system_server_execmem", s11.x("u:r:system_server:s0", "u:r:system_server:s0", "process", "execmem"));
        s11.z(e41Var5, a31Var, "aosp_su_transition", s11.x("u:r:shell:s0", "u:r:su:s0", "process", "transition"));
        s11.z(e41Var5, a31Var, "adbroot_context", s11.C("u:r:adbroot:s0"));
        s11.z(e41Var5, a31Var, "magisk_context", s11.u(s11.C("u:r:magisk:s0"), s11.C("u:object_r:magisk_file:s0"), s11.x("u:object_r:rootfs:s0", "u:object_r:tmpfs:s0", "filesystem", "associate"), s11.x("u:r:kernel:s0", "u:object_r:tmpfs:s0", "fifo_file", "open")));
        s11.z(e41Var5, a31Var, "kernelsu_context", s11.u(s11.C("u:r:ksu:s0"), s11.C("u:object_r:ksu_file:s0"), s11.x("u:r:kernel:s0", "u:object_r:adb_data_file:s0", "file", "read")));
        s11.z(e41Var5, a31Var, "lsposed_context", s11.u(s11.C("u:object_r:lsposed_file:s0"), s11.x("u:r:system_server:s0", "u:object_r:apk_data_file:s0", "file", "execute")));
        s11.z(e41Var5, a31Var, "xposed_context", s11.u(s11.C("u:object_r:xposed_data:s0"), s11.C("u:object_r:xposed_file:s0"), s11.x("u:r:dex2oat:s0", "u:object_r:dex2oat_exec:s0", "file", "execute_no_trans")));
        s11.z(e41Var5, a31Var, "zygisk_next_rule", s11.x("u:r:zygote:s0", "u:object_r:adb_data_file:s0", "dir", "search"));
        mb1Var.put("markers", e41Var5);
        mb1Var.put("detected", a31Var);
        e41Var.h.put("dirtySepolicy", e41Var2);
        String str6 = up0.n;
        if (str6 == null) {
            t11.S("hostPkgName");
            throw null;
        }
        e41Var.d("hostPackage", str6);
        e41Var.d("hostType", vu0Var.name());
        String str7 = Build.VERSION.RELEASE;
        Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String str8 = Build.BRAND;
        String str9 = Build.MANUFACTURER;
        String str10 = Build.MODEL;
        String str11 = Build.DEVICE;
        String str12 = up0.n;
        if (str12 == null) {
            t11.S("hostPkgName");
            throw null;
        }
        String property = System.getProperty("os.arch");
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String str13 = (String) mg.l0(strArr);
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
        ot otVar = new ot(str4, new nt(str7, numValueOf, str8, str9, str10, str11, BuildConfig.VERSION_NAME, "234", str12, property, str13, str3, null, "unknown", null, null, null, Locale.getDefault().toLanguageTag(), TimeZone.getDefault().getID(), null, e41Var, 643072, null));
        e41 e41Var6 = new e41();
        e41Var6.d("userId", str);
        e41Var6.d("platform", str2);
        try {
            try {
                l41 l41Var = new l41(new StringReader(new ir0().e(otVar)));
                k31 k31VarY = te.Y(l41Var);
                try {
                    k31VarY.getClass();
                    if (!(k31VarY instanceof a41) && l41Var.I() != 10) {
                        throw new t31("Did not consume the entire document.");
                    }
                    e41Var6.h.put("report", k31VarY);
                    try {
                        NativeCrypto nativeCrypto = NativeCrypto.INSTANCE;
                        String string3 = e41Var6.toString();
                        string3.getClass();
                        x92Var3 = nativeCrypto.syncClient(string3);
                    } catch (Throwable th4) {
                        x92Var3 = new x92(th4);
                    }
                    Throwable thA = y92.a(x92Var3);
                    if (thA != null) {
                        String string4 = "Nuke native client sync failed: ".concat(fg1.Q(thA)).toString();
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
                        x92Var5 = (pt) new ir0().b((String) x92Var3, pt.class);
                    } catch (Throwable th6) {
                        x92Var5 = new x92(th6);
                    }
                    if (!(x92Var5 instanceof x92)) {
                        pt ptVar = (pt) x92Var5;
                        ptVar.getClass();
                        boolean z4 = (t11.l(ptVar.l(), y83.ACTIVE) && (t11.l(ptVar.i(), hx0.VIP) || t11.l(ptVar.i(), hx0.SPECIAL))) ? z3 : false;
                        long jK = ptVar.k() * 1000;
                        pp1 pp1Var = pp1.a;
                        x83 x83Var = pp1.c;
                        if (x83Var == null) {
                            t11.S("mUser");
                            throw null;
                        }
                        String strM = ptVar.m();
                        if (strM == null) {
                            strM = ptVar.i();
                        }
                        x83 x83VarK = x83.k(x83Var, new t22(z4, strM, 0L, jK), null, null, null, null, jK, ptVar.l(), null, null, 414, null);
                        x83VarK.getClass();
                        pp1.c = x83VarK;
                    }
                    Throwable thA2 = y92.a(x92Var5);
                    if (thA2 != null) {
                        String string5 = "Decrypt report response failed: ".concat(fg1.Q(thA2)).toString();
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
