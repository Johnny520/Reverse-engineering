package p021D3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.system.Os;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1925g;
import com.bumptech.glide.AbstractC1926h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import nuke.data.cipher.NativeCrypto;
import org.luckypray.dexkit.DexKitBridge;
import p000A.C0038T0;
import p000A.C0065i;
import p000A.C0071l;
import p000A.C0073m;
import p011B4.AbstractC0231b;
import p015C2.C0242b;
import p015C2.C0243c;
import p016C3.C0245b;
import p027E4.C0306U;
import p027E4.C0330q;
import p038G3.AbstractC0515a;
import p038G3.AbstractC0516b;
import p038G3.AbstractC0517c;
import p044H3.AbstractC0646a;
import p044H3.AbstractC0648c;
import p049I2.AbstractC0797o;
import p050I3.AbstractC0808h;
import p050I3.C0801a;
import p053J3.C0838G;
import p053J3.C0839H;
import p053J3.C0845f;
import p053J3.C0847h;
import p053J3.C0849j;
import p053J3.C0850k;
import p053J3.C0855p;
import p053J3.C0856q;
import p053J3.C0859t;
import p053J3.C0860u;
import p053J3.C0861v;
import p053J3.C0864y;
import p053J3.C0865z;
import p056K2.AbstractC0885k;
import p056K2.C0884j;
import p056K2.C0887m;
import p056K2.C0891q;
import p057K3.AbstractC0898f;
import p057K3.C0894b;
import p057K3.InterfaceC0897e;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p061L2.AbstractC0978r;
import p061L2.C0981u;
import p065M2.C0999b;
import p075O3.AbstractC1054a;
import p104U3.AbstractC1478b;
import p113W3.AbstractC1609b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p118X3.AbstractC1687I;
import p118X3.C1684F;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;
import p179i4.AbstractC2352g;
import p208n4.InterfaceC2708g;
import p213o2.C2785n;
import p213o2.C2787p;
import p213o2.C2791t;
import p224q2.C2923n;
import p236s3.C3186b;
import p263x2.AbstractC3448a;
import p269y2.C3491a;
import p269y2.C3492b;
import p275z2.C3516b;

/* JADX INFO: renamed from: D3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0274k {

    /* JADX INFO: renamed from: c */
    public static EnumC0272i f883c;

    /* JADX INFO: renamed from: j */
    public static Dialog f890j;

    /* JADX INFO: renamed from: k */
    public static C0038T0 f891k;

    /* JADX INFO: renamed from: l */
    public static C0838G f892l;

    /* JADX INFO: renamed from: a */
    public static final C0887m f881a = AbstractC0797o.m1396u(new C0065i(4));

    /* JADX INFO: renamed from: b */
    public static final C0887m f882b = AbstractC0797o.m1396u(new C0065i(5));

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f884d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f885e = new AtomicBoolean();

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f886f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public static final AtomicBoolean f887g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public static final ExecutorService f888h = Executors.newSingleThreadExecutor(new ThreadFactoryC0268e(0));

    /* JADX INFO: renamed from: i */
    public static final Object f889i = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0847h m458a() {
        Object objM3229o;
        Object objM3229o2;
        Method declaredMethod;
        Integer numM3657T;
        C2791t c2791t = new C2791t();
        C2791t c2791t2 = new C2791t();
        c2791t2.m4979c("mode", "in_process");
        c2791t2.m4978b("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        c2791t2.m4979c("release", Build.VERSION.RELEASE);
        c2791t2.m4977a("available", Boolean.valueOf(new File("/sys/fs/selinux").isDirectory()));
        Boolean boolM3458R = AbstractC1923e.m3458R("isSELinuxEnabled");
        c2791t2.m4977a("enabled", Boolean.valueOf(boolM3458R != null ? boolM3458R.booleanValue() : new File("/sys/fs/selinux").isDirectory()));
        Boolean boolM3458R2 = AbstractC1923e.m3458R("isSELinuxEnforced");
        if (boolM3458R2 == null) {
            String strM3456P = AbstractC1923e.m3456P("/sys/fs/selinux/enforce");
            if (strM3456P == null || (numM3657T = AbstractC1983k.m3657T(strM3456P)) == null) {
                boolM3458R2 = null;
            } else {
                boolM3458R2 = Boolean.valueOf(numM3657T.intValue() == 1);
            }
        }
        c2791t2.m4977a("enforced", boolM3458R2);
        try {
            Class clsM3459S = AbstractC1923e.m3459S();
            Object objInvoke = (clsM3459S == null || (declaredMethod = clsM3459S.getDeclaredMethod("getContext", null)) == null) ? null : declaredMethod.invoke(null, null);
            objM3229o = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (objM3229o instanceof C0884j) {
            objM3229o = null;
        }
        String str = (String) objM3229o;
        String string = str != null ? AbstractC1976d.m3647o0(str).toString() : null;
        if (string == null) {
            string = AbstractC1923e.m3456P("/proc/self/task/" + Os.gettid() + "/attr/current");
        }
        c2791t2.m4979c("context", string);
        Class cls = Integer.TYPE;
        AbstractC1665j.m2982b(cls);
        String strM3460T = AbstractC1923e.m3460T("getPidContext", new Class[]{cls}, Integer.valueOf(Os.getpid()));
        if (strM3460T == null) {
            strM3460T = AbstractC1923e.m3456P("/proc/self/attr/current");
        }
        c2791t2.m4979c("pidContext", strM3460T);
        c2791t2.m4979c("procContext", AbstractC1923e.m3460T("getFileContext", new Class[]{String.class}, "/proc/self"));
        try {
            byte[] bArrM3550A = AbstractC1926h.m3550A(new File("/sys/fs/selinux/status"));
            if (bArrM3550A.length < 20) {
                objM3229o2 = null;
            } else {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrM3550A).order(ByteOrder.nativeOrder());
                C2791t c2791t3 = new C2791t();
                c2791t3.m4978b("version", Integer.valueOf(byteBufferOrder.getInt(0)));
                c2791t3.m4978b("sequence", Integer.valueOf(byteBufferOrder.getInt(4)));
                c2791t3.m4978b("enforcing", Integer.valueOf(byteBufferOrder.getInt(8)));
                c2791t3.m4978b("policyload", Integer.valueOf(byteBufferOrder.getInt(12)));
                c2791t3.m4978b("denyUnknown", Integer.valueOf(byteBufferOrder.getInt(16)));
                objM3229o2 = c2791t3;
            }
        } catch (Throwable th2) {
            objM3229o2 = AbstractC1784a.m3229o(th2);
        }
        boolean z5 = objM3229o2 instanceof C0884j;
        Object obj = objM3229o2;
        if (z5) {
            obj = null;
        }
        C2791t c2791t4 = (C2791t) obj;
        C2923n c2923n = c2791t2.f8818d;
        if (c2791t4 != null) {
            c2923n.put("status", c2791t4);
        }
        C2791t c2791t5 = new C2791t();
        C2787p c2787p = new C2787p();
        AbstractC1923e.m3476n(c2791t5, c2787p, "system_server_execmem", AbstractC1923e.m3474l("u:r:system_server:s0", "u:r:system_server:s0", "process", "execmem"));
        AbstractC1923e.m3476n(c2791t5, c2787p, "aosp_su_transition", AbstractC1923e.m3474l("u:r:shell:s0", "u:r:su:s0", "process", "transition"));
        AbstractC1923e.m3476n(c2791t5, c2787p, "adbroot_context", AbstractC1923e.m3478p("u:r:adbroot:s0"));
        AbstractC1923e.m3476n(c2791t5, c2787p, "magisk_context", AbstractC1923e.m3470h(AbstractC1923e.m3478p("u:r:magisk:s0"), AbstractC1923e.m3478p("u:object_r:magisk_file:s0"), AbstractC1923e.m3474l("u:object_r:rootfs:s0", "u:object_r:tmpfs:s0", "filesystem", "associate"), AbstractC1923e.m3474l("u:r:kernel:s0", "u:object_r:tmpfs:s0", "fifo_file", "open")));
        AbstractC1923e.m3476n(c2791t5, c2787p, "kernelsu_context", AbstractC1923e.m3470h(AbstractC1923e.m3478p("u:r:ksu:s0"), AbstractC1923e.m3478p("u:object_r:ksu_file:s0"), AbstractC1923e.m3474l("u:r:kernel:s0", "u:object_r:adb_data_file:s0", "file", "read")));
        AbstractC1923e.m3476n(c2791t5, c2787p, "lsposed_context", AbstractC1923e.m3470h(AbstractC1923e.m3478p("u:object_r:lsposed_file:s0"), AbstractC1923e.m3474l("u:r:system_server:s0", "u:object_r:apk_data_file:s0", "file", "execute")));
        AbstractC1923e.m3476n(c2791t5, c2787p, "xposed_context", AbstractC1923e.m3470h(AbstractC1923e.m3478p("u:object_r:xposed_data:s0"), AbstractC1923e.m3478p("u:object_r:xposed_file:s0"), AbstractC1923e.m3474l("u:r:dex2oat:s0", "u:object_r:dex2oat_exec:s0", "file", "execute_no_trans")));
        AbstractC1923e.m3476n(c2791t5, c2787p, "zygisk_next_rule", AbstractC1923e.m3474l("u:r:zygote:s0", "u:object_r:adb_data_file:s0", "dir", "search"));
        c2923n.put("markers", c2791t5);
        c2923n.put("detected", c2787p);
        c2791t.f8818d.put("dirtySepolicy", c2791t2);
        String str2 = AbstractC1785a.f6099e;
        if (str2 == null) {
            AbstractC1665j.m2991k("hostPkgName");
            throw null;
        }
        c2791t.m4979c("hostPackage", str2);
        c2791t.m4979c("hostType", m468k().name());
        String str3 = Build.VERSION.RELEASE;
        Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String str4 = Build.BRAND;
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        String str7 = Build.DEVICE;
        String str8 = AbstractC1785a.f6099e;
        if (str8 == null) {
            AbstractC1665j.m2991k("hostPkgName");
            throw null;
        }
        String property = System.getProperty("os.arch");
        String[] strArr = Build.SUPPORTED_ABIS;
        AbstractC1665j.m2984d(strArr, "SUPPORTED_ABIS");
        return new C0847h(str3, numValueOf, str4, str5, str6, str7, "1.0.0", "1", str8, property, (String) AbstractC0972l.m2001Y(strArr), "Xposed", null, "zygote", null, null, null, Locale.getDefault().toLanguageTag(), TimeZone.getDefault().getID(), null, c2791t, 643072, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m459b() {
        Object objM3229o;
        Object objM3229o2;
        try {
            objM3229o = m464g();
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
        if (thM1902a != null) {
            AbstractC1925g.m3537n("NukeCore", "Generate DexCacheSumSign failed: ".concat(AbstractC2352g.m4182E(thM1902a)));
            return false;
        }
        String str = (String) objM3229o;
        try {
            objM3229o2 = "";
            String strM449c = m466i().m449c("Dex_Cache_Sum_Sign");
            if (strM449c != null) {
                objM3229o2 = strM449c;
            }
        } catch (Throwable th2) {
            objM3229o2 = AbstractC1784a.m3229o(th2);
        }
        Throwable thM1902a2 = AbstractC0885k.m1902a(objM3229o2);
        if (thM1902a2 == null) {
            return ((String) objM3229o2).equals(str);
        }
        AbstractC1925g.m3537n("NukeCore", "Read DexCacheSumSign failed: ".concat(AbstractC2352g.m4182E(thM1902a2)));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static AbstractC0646a[] m460c() {
        int iOrdinal = m468k().ordinal();
        if (iOrdinal == 0) {
            return AbstractC0515a.f1649f;
        }
        if (iOrdinal == 1) {
            return AbstractC0516b.f1651f;
        }
        if (iOrdinal == 2) {
            return AbstractC0515a.f1650g;
        }
        throw new C0330q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m461d() throws InvocationTargetException {
        Object objM3229o;
        Object objM3229o2;
        Object objM3229o3;
        AtomicBoolean atomicBoolean = f885e;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (f889i) {
            if (atomicBoolean.get()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m474q()) {
                try {
                    m473p(m462e(str), str);
                    AbstractC1665j.m2985e("DexKit loaded from module apk entry: " + str, "msg");
                    objM3229o3 = C0891q.f2780a;
                } catch (Throwable th) {
                    objM3229o3 = AbstractC1784a.m3229o(th);
                }
                if (!(objM3229o3 instanceof C0884j)) {
                    f885e.set(true);
                    return;
                }
                Throwable thM1902a = AbstractC0885k.m1902a(objM3229o3);
                if (thM1902a != null) {
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load " + str + " from module apk");
                    AbstractC2352g.m4193f(unsatisfiedLinkError, thM1902a);
                    arrayList.add(unsatisfiedLinkError);
                }
            }
            for (File file : m475r()) {
                if (file.isFile()) {
                    try {
                        String absolutePath = file.getAbsolutePath();
                        AbstractC1665j.m2984d(absolutePath, "getAbsolutePath(...)");
                        m473p(file, absolutePath);
                        AbstractC1665j.m2985e("DexKit loaded from extracted module library: " + file.getAbsolutePath(), "msg");
                        objM3229o2 = C0891q.f2780a;
                    } catch (Throwable th2) {
                        objM3229o2 = AbstractC1784a.m3229o(th2);
                    }
                    if (!(objM3229o2 instanceof C0884j)) {
                        f885e.set(true);
                        return;
                    }
                    Throwable thM1902a2 = AbstractC0885k.m1902a(objM3229o2);
                    if (thM1902a2 != null) {
                        UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load " + file.getAbsolutePath());
                        AbstractC2352g.m4193f(unsatisfiedLinkError2, thM1902a2);
                        arrayList.add(unsatisfiedLinkError2);
                    }
                }
            }
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("loadLibrary0", Class.class, String.class);
                declaredMethod.setAccessible(true);
                try {
                    declaredMethod.invoke(Runtime.getRuntime(), DexKitBridge.class, "dexkit");
                    objM3229o = C0891q.f2780a;
                } catch (InvocationTargetException e5) {
                    Throwable targetException = e5.getTargetException();
                    if (targetException != null) {
                        throw targetException;
                    }
                    throw e5;
                }
            } catch (Throwable th3) {
                objM3229o = AbstractC1784a.m3229o(th3);
            }
            if (!(objM3229o instanceof C0884j)) {
                f885e.set(true);
                return;
            }
            Throwable thM1902a3 = AbstractC0885k.m1902a(objM3229o);
            if (thM1902a3 != null) {
                UnsatisfiedLinkError unsatisfiedLinkError3 = new UnsatisfiedLinkError("Failed to load dexkit by DexKitBridge classloader");
                AbstractC2352g.m4193f(unsatisfiedLinkError3, thM1902a3);
                arrayList.add(unsatisfiedLinkError3);
            }
            String str2 = AbstractC1785a.f6098d;
            if (str2 == null) {
                AbstractC1665j.m2991k("moduleApkPath");
                throw null;
            }
            UnsatisfiedLinkError unsatisfiedLinkError4 = new UnsatisfiedLinkError("Unable to load libdexkit.so from module apk path: " + str2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC2352g.m4193f(unsatisfiedLinkError4, (Throwable) it.next());
            }
            throw unsatisfiedLinkError4;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: e */
    public static File m462e(String str) throws IOException {
        String str2 = AbstractC1785a.f6098d;
        if (str2 == null) {
            AbstractC1665j.m2991k("moduleApkPath");
            throw null;
        }
        File file = new File(str2);
        Context context = AbstractC1785a.f6095a;
        if (context == null) {
            AbstractC1665j.m2991k("hostContext");
            throw null;
        }
        File file2 = new File(context.getCodeCacheDir(), "nuke_native");
        if (!file2.exists() && !file2.mkdirs()) {
            throw new IllegalStateException("Unable to create native cache dir: " + file2.getAbsolutePath());
        }
        String name = file.getName();
        AbstractC1665j.m2984d(name, "getName(...)");
        int iM3638f0 = AbstractC1976d.m3638f0(6, name, ".");
        if (iM3638f0 != -1) {
            name = name.substring(0, iM3638f0);
            AbstractC1665j.m2984d(name, "substring(...)");
        }
        File file3 = new File(file2, name + "-" + file.length() + "-" + file.lastModified() + "-libdexkit.so");
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry(str);
            if (entry == null) {
                throw new IllegalStateException("Missing native library entry: " + str);
            }
            if (!file3.isFile() || file3.length() != entry.getSize()) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        AbstractC1665j.m2982b(inputStream);
                        AbstractC1924f.m3496h(inputStream, fileOutputStream);
                        fileOutputStream.close();
                        inputStream.close();
                    } finally {
                    }
                } finally {
                }
            }
            zipFile.close();
            file3.setReadable(true, true);
            file3.setExecutable(true, true);
            return file3;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m463f(long j5) {
        double d5 = j5 < 0 ? 0L : j5;
        if (d5 >= 1048576.0d) {
            return String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(d5 / 1048576.0d)}, 1));
        }
        if (d5 >= 1024.0d) {
            return String.format(Locale.US, "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(d5 / 1024.0d)}, 1));
        }
        if (j5 < 0) {
            j5 = 0;
        }
        return j5 + " B";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m464g() {
        Context context = AbstractC1785a.f6095a;
        if (context == null) {
            AbstractC1665j.m2991k("hostContext");
            throw null;
        }
        AbstractC0646a[] abstractC0646aArrM460c = m460c();
        String str = AbstractC1785a.f6098d;
        if (str == null) {
            AbstractC1665j.m2991k("moduleApkPath");
            throw null;
        }
        File file = new File(str);
        String str2 = "NukeModuleSign{moduleVersionName = 1.0.0(release), moduleVersionCode = 1, buildTime = 1783179778015, apkLength = " + file.length() + ", apkLastModified = " + file.lastModified() + ", hookers = " + AbstractC0972l.m2005c0(abstractC0646aArrM460c, "|", new C0071l(12), 30) + "}";
        if (AbstractC0273j.f880a[m468k().ordinal()] != 1) {
            String str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            AbstractC1665j.m2982b(str3);
            int i5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            StringBuilder sbM405p = AbstractC0231b.m405p("NukeDexCacheSumSign{module = ", str2, ", versionName = ", str3, ", versionCode = ");
            sbM405p.append(i5);
            sbM405p.append("}");
            return sbM405p.toString();
        }
        String str4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        AbstractC1665j.m2982b(str4);
        int i6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        String strM469l = m469l();
        StringBuilder sbM405p2 = AbstractC0231b.m405p("NukeDexCacheSumSign{module = ", str2, ", versionName = ", str4, ", versionCode = ");
        sbM405p2.append(i6);
        sbM405p2.append(", patchId = ");
        sbM405p2.append(strM469l);
        sbM405p2.append("}");
        return sbM405p2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static List m465h() {
        Object objM3229o;
        try {
            objM3229o = (List) m466i().m448b("hooker_debug_records", AbstractC1922d.m3431l(new C3186b(C0859t.Companion.serializer())), null);
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        List list = (List) (objM3229o instanceof C0884j ? null : objM3229o);
        return list == null ? C0981u.f3047d : list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C0245b m466i() {
        return (C0245b) f882b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C0245b m467j() {
        return (C0245b) f881a.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static EnumC0272i m468k() {
        EnumC0272i enumC0272i = f883c;
        if (enumC0272i != null) {
            return enumC0272i;
        }
        AbstractC1665j.m2991k("mHostType");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m469l() {
        Object objM3229o;
        if (m468k() != EnumC0272i.f877e) {
            return "";
        }
        try {
            int i5 = AbstractC3448a.f10763a;
            C1753n c1753nM3507u = AbstractC1924f.m3507u(AbstractC1924f.m3512z("com.tencent.mm.boot.BuildConfig"));
            C3491a c3491a = new C3491a();
            c3491a.f10964a = (C3516b) c1753nM3507u.f6028e;
            c3491a.f10965b = "CLIENT_VERSION_ARM64";
            C0242b c0242b = (C0242b) AbstractC0973m.m2012S(c3491a.m5750b());
            Field field = c0242b.f813g;
            Field field2 = field != null ? field : null;
            if (field2 != null && !field2.isAccessible()) {
                field2.setAccessible(true);
            }
            objM3229o = String.valueOf(field.get(c0242b.f855f));
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        return (String) (objM3229o instanceof C0884j ? "" : objM3229o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m470m() {
        String str;
        String str2 = AbstractC1054a.f3289a;
        String str3 = AbstractC1054a.f3290b;
        C0865z c0865z = new C0865z(false, "", 0L, 0L);
        String[] strArr = Build.SUPPORTED_ABIS;
        AbstractC1665j.m2984d(strArr, "SUPPORTED_ABIS");
        String str4 = (String) AbstractC0972l.m2001Y(strArr);
        String str5 = str4 == null ? "" : str4;
        int i5 = Build.VERSION.SDK_INT;
        String strSubstring = Build.VERSION.RELEASE;
        AbstractC1665j.m2984d(strSubstring, "RELEASE");
        int iM3635c0 = AbstractC1976d.m3635c0(strSubstring, ".", 0, 6);
        if (iM3635c0 != -1) {
            strSubstring = strSubstring.substring(0, iM3635c0);
            AbstractC1665j.m2984d(strSubstring, "substring(...)");
        }
        Integer numM3657T = AbstractC1983k.m3657T(strSubstring);
        int iIntValue = numM3657T != null ? numM3657T.intValue() : i5;
        String str6 = Build.BRAND;
        String str7 = str6 == null ? "" : str6;
        String str8 = Build.MODEL;
        C0855p c0855p = new C0855p(str5, i5, iIntValue, str7, str8 == null ? "" : str8);
        Context context = AbstractC1785a.f6095a;
        if (context == null) {
            AbstractC1665j.m2991k("hostContext");
            throw null;
        }
        String str9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        AbstractC1665j.m2982b(str9);
        Context context2 = AbstractC1785a.f6095a;
        if (context2 == null) {
            AbstractC1665j.m2991k("hostContext");
            throw null;
        }
        f892l = new C0838G(c0865z, c0855p, new C0860u(str9, context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode, m469l(), m468k().ordinal()), str2, str3, System.currentTimeMillis(), (String) null, (String) null, AbstractC1054a.f3291c, 192, (AbstractC1661f) null);
        int iOrdinal = m468k().ordinal();
        if (iOrdinal == 0) {
            str = C0864y.f2700QQ;
        } else if (iOrdinal == 1) {
            str = C0864y.WECHAT;
        } else {
            if (iOrdinal != 2) {
                throw new C0330q();
            }
            str = C0864y.TIKTOK;
        }
        if (AbstractC1976d.m3637e0(str2)) {
            AbstractC1925g.m3544u("NukeCore", "Skip Nuke server sync: empty user id");
        } else if (f886f.compareAndSet(false, true)) {
            f888h.execute(new RunnableC0270g(1, str2, str));
        } else {
            AbstractC1925g.m3544u("NukeCore", "Skip Nuke server sync: already running");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m471n(AbstractC0646a[] abstractC0646aArr) {
        Object objM3229o;
        ArrayList arrayList = new ArrayList();
        boolean zM447a = m467j().m447a("security_mode", false);
        AbstractC1665j.m2985e(abstractC0646aArr, "<set-?>");
        AbstractC1478b.f5169a = abstractC0646aArr;
        for (AbstractC0646a abstractC0646a : abstractC0646aArr) {
            if (abstractC0646a instanceof AbstractC0648c) {
                arrayList.add(abstractC0646a);
            }
            if ((!zM447a || abstractC0646a.mo1117b()) && (!m472o(abstractC0646a.mo1118c()) || abstractC0646a.mo1117b())) {
                try {
                    AbstractC0517c.m773a(abstractC0646a);
                    objM3229o = C0891q.f2780a;
                } catch (Throwable th) {
                    objM3229o = AbstractC1784a.m3229o(th);
                }
                Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
                if (thM1902a != null) {
                    m476s(abstractC0646a, "install", thM1902a, "Hooker install failed");
                    AbstractC1925g.m3537n(abstractC0646a.mo1118c(), "Hooker " + abstractC0646a.mo1118c() + " failed: " + AbstractC2352g.m4182E(thM1902a));
                }
            }
        }
        AbstractC0648c[] abstractC0648cArr = (AbstractC0648c[]) arrayList.toArray(new AbstractC0648c[0]);
        AbstractC1665j.m2985e(abstractC0648cArr, "<set-?>");
        AbstractC1478b.f5170b = abstractC0648cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m472o(String str) {
        Object next;
        AbstractC1665j.m2985e(str, "hookerId");
        Iterator it = m465h().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1665j.m2981a(((C0859t) next).m1830l(), str)) {
                break;
            }
        }
        return ((C0859t) next) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m473p(File file, String str) throws InvocationTargetException {
        Object objM3229o;
        Object objM3229o2 = C0891q.f2780a;
        String absolutePath = file.getAbsolutePath();
        ClassLoader classLoader = C0274k.class.getClassLoader();
        ClassLoader classLoader2 = DexKitBridge.class.getClassLoader();
        try {
            AbstractC1665j.m2982b(absolutePath);
            Method declaredMethod = Runtime.class.getDeclaredMethod("load0", Class.class, String.class);
            declaredMethod.setAccessible(true);
            try {
                declaredMethod.invoke(Runtime.getRuntime(), DexKitBridge.class, absolutePath);
                objM3229o = objM3229o2;
            } catch (InvocationTargetException e5) {
                Throwable targetException = e5.getTargetException();
                if (targetException != null) {
                    throw targetException;
                }
                throw e5;
            }
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (!(objM3229o instanceof C0884j)) {
            AbstractC1665j.m2985e("DexKit native bound to DexKitBridge loader from " + str + ", nukeLoader=" + classLoader + ", dexKitLoader=" + classLoader2, "msg");
            return;
        }
        Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
        if (thM1902a != null) {
            if (classLoader != classLoader2) {
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to bind DexKit native library to DexKitBridge classloader from " + str);
                AbstractC2352g.m4193f(unsatisfiedLinkError, thM1902a);
                throw unsatisfiedLinkError;
            }
            try {
                System.load(absolutePath);
            } catch (Throwable th2) {
                objM3229o2 = AbstractC1784a.m3229o(th2);
            }
            if (!(objM3229o2 instanceof C0884j)) {
                AbstractC1665j.m2985e("DexKit native loaded by System.load from " + str, "msg");
                return;
            }
            Throwable thM1902a2 = AbstractC0885k.m1902a(objM3229o2);
            if (thM1902a2 == null) {
                return;
            }
            UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load DexKit native library from " + str);
            AbstractC2352g.m4193f(unsatisfiedLinkError2, thM1902a);
            AbstractC2352g.m4193f(unsatisfiedLinkError2, thM1902a2);
            throw unsatisfiedLinkError2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static ArrayList m474q() {
        String[] strArr = Build.SUPPORTED_ABIS;
        AbstractC1665j.m2984d(strArr, "SUPPORTED_ABIS");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            AbstractC0978r.m2032N(AbstractC1665j.m2981a(str, "arm64-v8a") ? AbstractC0972l.m1987K(new String[]{"arm64-v8a", "arm64"}) : AbstractC1665j.m2981a(str, "armeabi-v7a") ? AbstractC0972l.m1987K(new String[]{"armeabi-v7a", "arm"}) : AbstractC2352g.m4211y(str), arrayList);
        }
        List listM2011R = AbstractC0973m.m2011R(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0974n.m2029K(listM2011R, 10));
        Iterator it = listM2011R.iterator();
        while (it.hasNext()) {
            arrayList2.add("lib/" + ((String) it.next()) + "/libdexkit.so");
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static List m475r() {
        String str = AbstractC1785a.f6098d;
        if (str == null) {
            AbstractC1665j.m2991k("moduleApkPath");
            throw null;
        }
        File parentFile = new File(str).getParentFile();
        if (parentFile == null) {
            return C0981u.f3047d;
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        AbstractC1665j.m2984d(strArr, "SUPPORTED_ABIS");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            AbstractC0978r.m2032N(AbstractC1665j.m2981a(str2, "arm64-v8a") ? AbstractC0972l.m1987K(new String[]{"arm64", "arm64-v8a"}) : AbstractC1665j.m2981a(str2, "armeabi-v7a") ? AbstractC0972l.m1987K(new String[]{"arm", "armeabi-v7a"}) : AbstractC2352g.m4211y(str2), arrayList);
        }
        List listM2011R = AbstractC0973m.m2011R(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0974n.m2029K(listM2011R, 10));
        Iterator it = listM2011R.iterator();
        while (it.hasNext()) {
            arrayList2.add(new File(parentFile, AbstractC0231b.m400k("lib/", (String) it.next(), "/libdexkit.so")));
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m476s(AbstractC0646a abstractC0646a, String str, Throwable th, String str2) {
        AbstractC1665j.m2985e(abstractC0646a, "hooker");
        ArrayList arrayList = abstractC0646a.f2057b;
        if (!arrayList.contains(th)) {
            arrayList.add(th);
        }
        C0859t c0859t = new C0859t(abstractC0646a.mo1118c(), abstractC0646a.getClass().getName(), str, str2, th.getClass().getName(), th.getMessage(), AbstractC2352g.m4182E(th), 0L, 128, (AbstractC1661f) null);
        List listM465h = m465h();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM465h) {
            if (!AbstractC1665j.m2981a(((C0859t) obj).m1830l(), abstractC0646a.mo1118c())) {
                arrayList2.add(obj);
            }
        }
        try {
            m466i().m450d("hooker_debug_records", AbstractC0973m.m2020a0(arrayList2, c0859t), new C3186b(C0859t.Companion.serializer()));
        } catch (Throwable th2) {
            AbstractC1784a.m3229o(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m477t() throws IllegalAccessException {
        if (m468k() != EnumC0272i.f877e) {
            Process.killProcess(Process.myPid());
            return;
        }
        Field field = AbstractC1924f.m3512z("com.tencent.mm.process.KillProcessHelperActivity").getDeclaredFields()[0];
        field.setAccessible(true);
        Object obj = field.get(null);
        int i5 = AbstractC3448a.f10763a;
        C3492b c3492bM3111E = AbstractC1924f.m3507u(obj).m3111E();
        Class cls = Boolean.TYPE;
        AbstractC1665j.m2984d(cls, "TYPE");
        Object[] objArrCopyOf = Arrays.copyOf(new Object[]{Context.class, cls}, 2);
        ArrayList arrayList = c3492bM3111E.f10870g;
        AbstractC1665j.m2985e(arrayList, "<this>");
        AbstractC1665j.m2985e(objArrCopyOf, "elements");
        arrayList.addAll(AbstractC0972l.m1987K(objArrCopyOf));
        C0243c c0243c = (C0243c) AbstractC0973m.m2012S(c3492bM3111E.m5751b());
        Context context = AbstractC1785a.f6095a;
        if (context != null) {
            c0243c.m446K(context, Boolean.TRUE);
        } else {
            AbstractC1665j.m2991k("hostContext");
            throw null;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: J3.G.k(J3.G, J3.z, J3.p, J3.u, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):J3.G */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: u */
    public static void m478u(String str, String str2) {
        Object objM3229o;
        Object objM3229o2;
        ?? r4;
        Object objM3229o3;
        if (!AbstractC1609b.m2859b().isFile()) {
            AbstractC1925g.m3544u("NukeCore", "Skip Nuke server sync: native library is not ready");
            return;
        }
        if (!NativeCrypto.INSTANCE.isConfigured()) {
            AbstractC1925g.m3544u("NukeCore", "Skip Nuke server sync: native client secrets are not configured");
            return;
        }
        C0894b c0894b = AbstractC0898f.f2788a;
        AbstractC1665j.m2985e(str, "userId");
        AbstractC0898f.f2788a = new C0894b(str, str2);
        try {
            C2785n c2785n = C0801a.f2578a;
            objM3229o = C0801a.m1406a(new C0849j("Nuke 1.0.0 initialized", m458a()));
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
        if (thM1902a != null) {
            AbstractC1925g.m3537n("NukeCore", "Encrypt report failed: ".concat(AbstractC2352g.m4182E(thM1902a)));
            return;
        }
        C0856q c0856q = (C0856q) objM3229o;
        try {
            Object value = AbstractC0898f.f2790c.getValue();
            AbstractC1665j.m2984d(value, "getValue(...)");
            objM3229o2 = ((InterfaceC0897e) value).m1905a(c0856q).mo509b();
        } catch (Throwable th2) {
            objM3229o2 = AbstractC1784a.m3229o(th2);
        }
        Throwable thM1902a2 = AbstractC0885k.m1902a(objM3229o2);
        if (thM1902a2 != null) {
            AbstractC1925g.m3537n("NukeCore", "Nuke server sync request failed: ".concat(AbstractC2352g.m4182E(thM1902a2)));
            return;
        }
        C0306U c0306u = (C0306U) objM3229o2;
        C0845f c0845f = (C0845f) c0306u.f1018b;
        C1684F c1684f = c0306u.f1017a;
        String str3 = null;
        if (!c1684f.f5753s || c0845f == null) {
            int i5 = c1684f.f5741g;
            AbstractC1687I abstractC1687I = c0306u.f1019c;
            if (abstractC1687I != null) {
                InterfaceC2708g interfaceC2708gMo507f = abstractC1687I.mo507f();
                try {
                    String strMo4731z = interfaceC2708gMo507f.mo4731z(AbstractC1776g.m3178e(interfaceC2708gMo507f, abstractC1687I.m3006b()));
                    try {
                        interfaceC2708gMo507f.close();
                    } catch (Throwable th3) {
                        str3 = th3;
                    }
                    String str4 = str3;
                    str3 = strMo4731z;
                    r4 = str4;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    r4 = th5;
                    if (interfaceC2708gMo507f != null) {
                        try {
                            interfaceC2708gMo507f.close();
                            r4 = th5;
                        } catch (Throwable th6) {
                            AbstractC2352g.m4193f(th5, th6);
                            r4 = th5;
                        }
                    }
                }
                if (r4 != 0) {
                    throw r4;
                }
            }
            AbstractC1925g.m3537n("NukeCore", "Nuke server sync failed: code=" + i5 + ", error=" + str3);
            return;
        }
        if (!c0845f.m1598l()) {
            AbstractC1925g.m3537n("NukeCore", "Nuke server rejected sync: " + c0845f.m1594h() + " " + c0845f.m1597k());
            return;
        }
        try {
            objM3229o3 = (C0850k) AbstractC1922d.m3416B(c0845f);
        } catch (Throwable th7) {
            objM3229o3 = AbstractC1784a.m3229o(th7);
        }
        if (!(objM3229o3 instanceof C0884j)) {
            C0850k c0850k = (C0850k) objM3229o3;
            boolean z5 = AbstractC1665j.m2981a(c0850k.m1724l(), C0839H.ACTIVE) && (AbstractC1665j.m2981a(c0850k.m1721i(), C0861v.VIP) || AbstractC1665j.m2981a(c0850k.m1721i(), C0861v.SPECIAL));
            long jM1723k = c0850k.m1723k() * 1000;
            C0838G c0838g = f892l;
            if (c0838g == null) {
                AbstractC1665j.m2991k("mUser");
                throw null;
            }
            String strM1725m = c0850k.m1725m();
            if (strM1725m == null) {
                strM1725m = c0850k.m1721i();
            }
            C0838G c0838gM1534k = C0838G.m1534k(c0838g, new C0865z(z5, strM1725m, 0L, jM1723k), null, null, null, null, jM1723k, c0850k.m1724l(), null, null, 414, null);
            AbstractC1665j.m2985e(c0838gM1534k, "<set-?>");
            f892l = c0838gM1534k;
            String strM1726n = c0850k.m1726n();
            String strM1722j = c0850k.m1722j();
            String strM1724l = c0850k.m1724l();
            String strM1721i = c0850k.m1721i();
            StringBuilder sbM405p = AbstractC0231b.m405p("Nuke server sync success: user=", strM1726n, ", platform=", strM1722j, ", status=");
            sbM405p.append(strM1724l);
            sbM405p.append(", group=");
            sbM405p.append(strM1721i);
            AbstractC1925g.m3544u("NukeCore", sbM405p.toString());
        }
        Throwable thM1902a3 = AbstractC0885k.m1902a(objM3229o3);
        if (thM1902a3 != null) {
            AbstractC1925g.m3537n("NukeCore", "Decrypt report response failed: ".concat(AbstractC2352g.m4182E(thM1902a3)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m479v(String str, Float f2) {
        C0038T0 c0038t0 = f891k;
        if (c0038t0 == null) {
            return;
        }
        Activity activity = AbstractC1785a.f6097c;
        if (activity != null) {
            activity.runOnUiThread(new RunnableC0267d(c0038t0, str, f2, 0));
        } else {
            AbstractC1665j.m2991k("hostAct");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m480w(AbstractC0646a[] abstractC0646aArr) {
        if (f887g.compareAndSet(false, true)) {
            if (AbstractC1609b.m2859b().isFile()) {
                m481x(abstractC0646aArr);
                return;
            }
            AbstractC1925g.m3544u("NukeCore", "Skip native warmup: " + AbstractC1609b.m2859b().getAbsolutePath() + " is not ready");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m481x(AbstractC0646a[] abstractC0646aArr) {
        C0245b c0245bM466i = m466i();
        if (!(c0245bM466i instanceof C0245b)) {
            c0245bM466i = null;
        }
        if (c0245bM466i != null) {
            for (String str : AbstractC0972l.m1987K(new String[]{"Dex_Cache_Sum_Sign", "hooker_debug_records"})) {
                if (c0245bM466i.f823e.add(str)) {
                    AbstractC0808h.m1409c("confRefresh", new C0073m(1, c0245bM466i, str));
                }
            }
        }
        C0245b c0245bM467j = m467j();
        C0245b c0245b = c0245bM467j instanceof C0245b ? c0245bM467j : null;
        if (c0245b != null) {
            C0999b c0999bM4202o = AbstractC2352g.m4202o();
            c0999bM4202o.add("security_mode");
            for (AbstractC0646a abstractC0646a : abstractC0646aArr) {
                c0999bM4202o.add(abstractC0646a.mo1118c());
            }
            C0999b<String> c0999bM4200m = AbstractC2352g.m4200m(c0999bM4202o);
            AbstractC1665j.m2985e(c0999bM4200m, "keys");
            for (String str2 : c0999bM4200m) {
                if (c0245b.f823e.add(str2)) {
                    AbstractC0808h.m1409c("confRefresh", new C0073m(1, c0245b, str2));
                }
            }
        }
        NativeCrypto.INSTANCE.warmUpAsync();
    }
}
