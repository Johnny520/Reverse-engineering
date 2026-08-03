package p099h.Hchat.crash;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import gg.AbstractC1416l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p054dg.AbstractC0793l;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3140d;
import p218og.C3143g;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.InterfaceC5059kv;
import sb.AbstractC3951a;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4150a0;
import tf.C4179z;

/* JADX INFO: renamed from: h.Hchat.crash.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1438g implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: h */
    public static volatile boolean f4762h;

    /* JADX INFO: renamed from: i */
    public static volatile boolean f4763i;

    /* JADX INFO: renamed from: j */
    public static volatile Application f4764j;

    /* JADX INFO: renamed from: k */
    public static volatile ClassLoader f4765k;

    /* JADX INFO: renamed from: m */
    public static volatile InterfaceC5059kv f4767m;

    /* JADX INFO: renamed from: o */
    public static volatile AtomicBoolean f4769o;

    /* JADX INFO: renamed from: p */
    public static File f4770p;

    /* JADX INFO: renamed from: q */
    public static File f4771q;

    /* JADX INFO: renamed from: r */
    public static File f4772r;

    /* JADX INFO: renamed from: s */
    public static File f4773s;

    /* JADX INFO: renamed from: t */
    public static File f4774t;

    /* JADX INFO: renamed from: a */
    public static final C1438g f4755a = new C1438g();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f4756b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f4757c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f4758d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f4759e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f4760f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public static final Handler f4761g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public static volatile WeakReference f4766l = new WeakReference(null);

    /* JADX INFO: renamed from: n */
    public static volatile WeakReference f4768n = new WeakReference(null);

    /* JADX INFO: renamed from: u */
    public static String f4775u = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m3859a(Application application) {
        Object c3959f;
        Object c3959f2;
        String processName;
        try {
            c3959f = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        PackageInfo packageInfo = (PackageInfo) c3959f;
        String str = packageInfo != null ? packageInfo.versionName : null;
        Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i9 = Build.VERSION.SDK_INT;
        long longVersionCode = 0;
        if (i9 >= 28) {
            if (packageInfo != null) {
                longVersionCode = packageInfo.getLongVersionCode();
            }
        } else if (packageInfo != null) {
            longVersionCode = packageInfo.versionCode;
        }
        if (i9 >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                c3959f2 = AbstractC3149m.m6698M0(AbstractC0793l.m2028h0(new File("/proc/self/cmdline"), AbstractC3137a.f10177a), (char) 0);
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            if (!(c3959f2 instanceof C3959f)) {
                obj = c3959f2;
            }
            processName = (String) obj;
        }
        StringBuilder sb2 = new StringBuilder("模块版本: 5.5.6 (490)\n");
        StringBuilder sbM2259v = AbstractC0921a.m2259v("微信版本: ", str, " (", longVersionCode);
        sbM2259v.append(")");
        sb2.append(sbM2259v.toString());
        sb2.append('\n');
        int iMyPid = Process.myPid();
        String str2 = Process.is64Bit() ? "64" : "32";
        StringBuilder sbM2258u = AbstractC0921a.m2258u(iMyPid, "进程: ", processName, " (pid=", ", ");
        sbM2258u.append(str2);
        sbM2258u.append(" 位)");
        sb2.append(sbM2258u.toString());
        sb2.append('\n');
        sb2.append("系统: Android " + Build.VERSION.RELEASE + " (SDK " + Build.VERSION.SDK_INT + ")");
        sb2.append('\n');
        sb2.append("设备: " + Build.MANUFACTURER + " " + Build.MODEL);
        sb2.append('\n');
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        sb2.append("ABI: ".concat(AbstractC4165l.m8369F0(strArr, null, 63)));
        sb2.append('\n');
        sb2.append("系统指纹: " + Build.FINGERPRINT);
        sb2.append('\n');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f1 A[PHI: r0
  0x01f1: PHI (r0v64 java.lang.Long) = (r0v58 java.lang.Long), (r0v66 java.lang.Long) binds: [B:151:0x0208, B:142:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0116  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3860b(Application application) {
        String str;
        String string;
        long j3;
        Object c3959f;
        int i9;
        int iIntValue;
        long j4;
        int iLongValue;
        String str2;
        int i10;
        long j5;
        ArrayList arrayList;
        long j10;
        Object c3959f2;
        C1439h c1439h;
        String str3;
        char c10;
        Object c3959f3;
        C1439h c1439h2;
        File file;
        long jCurrentTimeMillis;
        StringBuilder sb2;
        Object next;
        if (!f4763i) {
            return;
        }
        File file2 = f4770p;
        if (file2 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        File file3 = new File(file2, "previous_launch");
        File file4 = f4770p;
        if (file4 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        File file5 = new File(file4, "last_native_exit");
        File file6 = f4770p;
        if (file6 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        File file7 = new File(file6, "last_anr_exit");
        long jM3867i = m3867i(file3);
        long jM3867i2 = m3867i(file5);
        long jM3867i3 = m3867i(file7);
        File file8 = f4772r;
        String str4 = "nativePendingFile";
        if (file8 == null) {
            AbstractC1416l.m3831g("nativePendingFile");
            throw null;
        }
        if (!(file8.isFile() && file8.length() > 0)) {
            file8 = null;
        }
        long jLastModified = file8 != null ? file8.lastModified() : 0L;
        ArrayList arrayList2 = new ArrayList();
        File file9 = f4773s;
        if (file9 == null) {
            AbstractC1416l.m3831g("pendingReportFile");
            throw null;
        }
        String strM3868j = m3868j(file9);
        if (strM3868j != null) {
            if (!((AbstractC3149m.m6721t0(strM3868j) || (AbstractC3149m.m6709h0(strM3868j, "OutOfMemoryError", true) && AbstractC3149m.m6709h0(strM3868j, "Failed to allocate", true))) ? false : true)) {
                strM3868j = null;
            }
            if (strM3868j != null) {
                arrayList2.add(strM3868j);
            }
        }
        File file10 = f4771q;
        if (file10 == null) {
            AbstractC1416l.m3831g("javaPendingFile");
            throw null;
        }
        String strM3868j2 = m3868j(file10);
        if (strM3868j2 != null) {
            if (!((AbstractC3149m.m6721t0(strM3868j2) || (AbstractC3149m.m6709h0(strM3868j2, "OutOfMemoryError", true) && AbstractC3149m.m6709h0(strM3868j2, "Failed to allocate", true))) ? false : true)) {
                strM3868j2 = null;
            }
            if (strM3868j2 != null) {
                arrayList2.add(strM3868j2);
            }
        }
        File file11 = f4772r;
        if (file11 == null) {
            AbstractC1416l.m3831g("nativePendingFile");
            throw null;
        }
        String strM3868j3 = m3868j(file11);
        if (strM3868j3 != null) {
            C3140d c3140d = new C3140d(strM3868j3);
            while (true) {
                if (!c3140d.hasNext()) {
                    str = str4;
                    next = null;
                    break;
                }
                next = c3140d.next();
                C3140d c3140d2 = c3140d;
                str = str4;
                if (AbstractC3156t.m6740d0((String) next, "pid=", false)) {
                    break;
                }
                c3140d = c3140d2;
                str4 = str;
            }
            String str5 = (String) next;
            if (str5 != null) {
                string = AbstractC3149m.m6703R0(AbstractC3149m.m6695J0(str5, '=', str5)).toString();
            }
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (string.length() != 0) {
                j3 = jM3867i;
                iIntValue = 0;
                i9 = 0;
            } else {
                try {
                    if (AbstractC3156t.m6740d0(string, "0x", true)) {
                        String strSubstring = string.substring(2);
                        AbstractC0000a.m96w(16);
                        j4 = Long.parseLong(strSubstring, 16);
                    } else {
                        j4 = Long.parseLong(string);
                    }
                    Long lValueOf = Long.valueOf(j4);
                    if (1 > j4 || j4 > 2147483647L) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        j3 = jM3867i;
                        try {
                            iLongValue = (int) lValueOf.longValue();
                        } catch (Throwable th2) {
                            th = th2;
                            c3959f = new C3959f(th);
                        }
                    } else {
                        j3 = jM3867i;
                        iLongValue = 0;
                    }
                    c3959f = Integer.valueOf(iLongValue);
                } catch (Throwable th3) {
                    th = th3;
                    j3 = jM3867i;
                }
                i9 = 0;
                if (c3959f instanceof C3959f) {
                    c3959f = 0;
                }
                iIntValue = ((Number) c3959f).intValue();
            }
            if (Build.VERSION.SDK_INT >= 30) {
                str2 = strM3868j3;
                i10 = 30;
                j5 = j3;
                arrayList = arrayList2;
                j10 = jLastModified;
                c1439h = null;
            } else {
                try {
                    str2 = strM3868j3;
                    i10 = 30;
                    j5 = j3;
                    arrayList = arrayList2;
                    j10 = jLastModified;
                    try {
                        c3959f2 = CrashExitInfoApi30.INSTANCE.findNativeExit(application, j5, jM3867i2, j10, iIntValue);
                    } catch (Throwable th4) {
                        th = th4;
                        c3959f2 = new C3959f(th);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str2 = strM3868j3;
                    i10 = 30;
                    j5 = j3;
                    arrayList = arrayList2;
                    j10 = jLastModified;
                }
                Throwable thM8182b = C3960g.m8182b(c3959f2);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:Crash] 读取系统 Native 退出记录失败: ", thM8182b.getMessage(), thM8182b);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                c1439h = (C1439h) c3959f2;
            }
            if ((str2 == null && !AbstractC3149m.m6721t0(str2)) || c1439h != null) {
                if (c1439h != null) {
                    long j11 = c1439h.f4776a;
                    Long lValueOf2 = Long.valueOf(j11);
                    if ((j11 > 0 ? 1 : i9) == 0) {
                        lValueOf2 = null;
                    }
                    if (lValueOf2 != null) {
                        jCurrentTimeMillis = lValueOf2.longValue();
                        sb2 = new StringBuilder("Hchat 捕获到 Native 层异常\n");
                        sb2.append("时间: ".concat(m3864f(jCurrentTimeMillis)));
                        sb2.append('\n');
                        sb2.append(f4775u);
                        if (str2 != null && !AbstractC3149m.m6721t0(str2)) {
                            sb2.append("\n--- Native 信号记录 ---\n");
                            sb2.append(AbstractC3149m.m6703R0(str2).toString());
                            sb2.append('\n');
                        }
                        if (c1439h != null) {
                            sb2.append("\n--- Android 退出记录 ---\n");
                            sb2.append(c1439h.f4777b);
                        }
                        arrayList.add(AbstractC3149m.m6705T0(sb2.toString()).toString());
                    } else {
                        lValueOf2 = Long.valueOf(j10);
                        if ((j10 > 0 ? 1 : i9) == 0) {
                            lValueOf2 = null;
                        }
                        if (lValueOf2 == null) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        sb2 = new StringBuilder("Hchat 捕获到 Native 层异常\n");
                        sb2.append("时间: ".concat(m3864f(jCurrentTimeMillis)));
                        sb2.append('\n');
                        sb2.append(f4775u);
                        if (str2 != null) {
                            sb2.append("\n--- Native 信号记录 ---\n");
                            sb2.append(AbstractC3149m.m6703R0(str2).toString());
                            sb2.append('\n');
                        }
                        if (c1439h != null) {
                        }
                        arrayList.add(AbstractC3149m.m6705T0(sb2.toString()).toString());
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= i10) {
                str3 = "时间: ";
                c10 = '\n';
                c1439h2 = null;
            } else {
                str3 = "时间: ";
                try {
                    c10 = '\n';
                    try {
                        c3959f3 = CrashExitInfoApi30.INSTANCE.findAnrExit(application, j5, jM3867i3);
                    } catch (Throwable th6) {
                        th = th6;
                        c3959f3 = new C3959f(th);
                    }
                } catch (Throwable th7) {
                    th = th7;
                    c10 = '\n';
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                if (thM8182b2 != null) {
                    AbstractC0921a.m2261x("[Hchat:Crash] 读取系统 ANR 退出记录失败: ", thM8182b2.getMessage(), thM8182b2);
                }
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = null;
                }
                c1439h2 = (C1439h) c3959f3;
            }
            if (c1439h2 != null) {
                arrayList.add(AbstractC3149m.m6705T0("Hchat 捕获到 ANR 异常\n" + str3.concat(m3864f(c1439h2.f4776a)) + c10 + f4775u + "\n--- Android ANR 退出记录 ---\n" + c1439h2.f4777b).toString());
            }
            if (!arrayList.isEmpty()) {
                File file12 = f4773s;
                if (file12 == null) {
                    AbstractC1416l.m3831g("pendingReportFile");
                    throw null;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = new C3143g(arrayList).iterator();
                int length = i9;
                while (true) {
                    C4179z c4179z = (C4179z) it;
                    if (!((ListIterator) c4179z.f13716h).hasPrevious()) {
                        break;
                    }
                    String string2 = AbstractC3149m.m6703R0((String) ((ListIterator) c4179z.f13716h).previous()).toString();
                    if (string2.length() != 0) {
                        int i11 = arrayList3.isEmpty() ? i9 : 34;
                        if (string2.length() + length + i11 <= 1048576) {
                            arrayList3.add(string2);
                            length = string2.length() + i11 + length;
                        } else if (arrayList3.isEmpty()) {
                            arrayList3.add(AbstractC3149m.m6701P0(1048554, string2).concat("\n\n[异常日志超过保存上限，后续内容已截断]"));
                            break;
                        }
                    }
                }
                if (!m3870l(file12, AbstractC4166m.m8392A1(new C4150a0(arrayList3), "\n\n==============================\n\n", null, null, null, 62))) {
                    return;
                }
            }
            if (c1439h != null) {
                m3870l(file5, String.valueOf(c1439h.f4776a));
            }
            if (c1439h2 != null) {
                m3870l(file7, String.valueOf(c1439h2.f4776a));
            }
            file = f4771q;
            if (file != null) {
                AbstractC1416l.m3831g("javaPendingFile");
                throw null;
            }
            file.delete();
            File file13 = f4772r;
            if (file13 == null) {
                AbstractC1416l.m3831g(str);
                throw null;
            }
            file13.delete();
            m3870l(file3, String.valueOf(System.currentTimeMillis()));
            return;
        }
        str = "nativePendingFile";
        string = null;
        if (string == null) {
        }
        if (string.length() != 0) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        if (str2 == null) {
            if (c1439h != null) {
            }
        } else if (c1439h != null) {
        }
        if (Build.VERSION.SDK_INT >= i10) {
        }
        if (c1439h2 != null) {
        }
        if (!arrayList.isEmpty()) {
        }
        if (c1439h != null) {
        }
        if (c1439h2 != null) {
        }
        file = f4771q;
        if (file != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m3861c() {
        AtomicBoolean atomicBoolean = f4769o;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        InterfaceC5059kv interfaceC5059kv = f4767m;
        if (interfaceC5059kv != null) {
            interfaceC5059kv.close();
        }
        f4767m = null;
        f4768n = new WeakReference(null);
        f4769o = null;
        f4760f.set(false);
        if (f4770p == null) {
            return;
        }
        File file = f4771q;
        if (file == null) {
            AbstractC1416l.m3831g("javaPendingFile");
            throw null;
        }
        file.delete();
        File file2 = f4772r;
        if (file2 == null) {
            AbstractC1416l.m3831g("nativePendingFile");
            throw null;
        }
        file2.delete();
        File file3 = f4773s;
        if (file3 == null) {
            AbstractC1416l.m3831g("pendingReportFile");
            throw null;
        }
        file3.delete();
        File file4 = f4770p;
        if (file4 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        File[] fileArrListFiles = file4.listFiles();
        if (fileArrListFiles != null) {
            for (File file5 : fileArrListFiles) {
                String name = file5.getName();
                name.getClass();
                if (AbstractC3149m.m6709h0(name, ".tmp-", false)) {
                    file5.delete();
                }
            }
        }
        File file6 = f4770p;
        if (file6 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        m3870l(new File(file6, "previous_launch"), String.valueOf(System.currentTimeMillis()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3862d() {
        if (!f4763i || f4771q == null) {
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C1437f) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C1437f(defaultUncaughtExceptionHandler));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m3863e() {
        File file;
        Object c3959f;
        if (f4763i && f4762h && (file = f4772r) != null) {
            try {
                c3959f = Boolean.valueOf(NativeCrashBridge.install(file.getAbsolutePath()));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object obj = Boolean.FALSE;
            if (!(c3959f instanceof C3959f)) {
                obj = c3959f;
            }
            if (((Boolean) obj).booleanValue()) {
                f4759e.set(false);
                return;
            }
            if (f4759e.compareAndSet(false, true)) {
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:Crash] Native 捕获器安装失败: ", thM8182b.getMessage(), thM8182b);
                } else {
                    AbstractC1184v0.m3203m("[Hchat:Crash] Native 捕获器未能接管全部崩溃信号");
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m3864f(long j3) {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(j3));
        str.getClass();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m3865g(Application application, ClassLoader classLoader) {
        Object c3959f;
        C1438g c1438g = f4755a;
        classLoader.getClass();
        f4764j = application;
        f4765k = classLoader;
        m3866h(application);
        if (f4756b.get()) {
            if (!f4763i) {
                m3861c();
                return;
            }
            if (!f4757c.compareAndSet(false, true)) {
                m3862d();
                m3863e();
                return;
            }
            try {
                m3860b(application);
                f4762h = AbstractC3951a.m8176d(application, classLoader, "libhchat_crash.so", "hchat_crash", true);
                m3863e();
                application.registerActivityLifecycleCallbacks(c1438g);
                c3959f = Boolean.valueOf(f4761g.post(new RunnableC1436e(0)));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                f4757c.set(false);
                AbstractC0921a.m2261x("[Hchat:Crash] 初始化失败: ", thM8182b.getMessage(), thM8182b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m3866h(Application application) {
        Object c3959f;
        Object c3959f2;
        File file;
        f4764j = application;
        try {
            c3959f = Boolean.valueOf(AbstractC4302b.m8640c(application, "Hchat_crash_report_config").getBoolean("crash_report_enable", false));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:Crash] 读取异常捕获设置失败: ", thM8182b.getMessage(), thM8182b);
        }
        Boolean bool = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = bool;
        }
        f4763i = ((Boolean) c3959f).booleanValue();
        if (!f4756b.compareAndSet(false, true)) {
            if (f4763i) {
                m3862d();
                return;
            }
            return;
        }
        try {
            File file2 = new File(AbstractC4302b.m8641d(application), "crash");
            file2.mkdirs();
            f4770p = file2;
            file = f4770p;
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        if (file == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        f4771q = new File(file, "pending_java.log");
        File file3 = f4770p;
        if (file3 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        f4772r = new File(file3, "pending_native.log");
        File file4 = f4770p;
        if (file4 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        f4773s = new File(file4, "pending_report.log");
        File file5 = f4770p;
        if (file5 == null) {
            AbstractC1416l.m3831g("crashDir");
            throw null;
        }
        f4774t = new File(file5, "last_crash.log");
        f4775u = m3859a(application);
        if (f4763i) {
            m3862d();
        }
        c3959f2 = C3967n.f12976a;
        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
        if (thM8182b2 != null) {
            f4756b.set(false);
            AbstractC0921a.m2261x("[Hchat:Crash] Java 捕获器初始化失败: ", thM8182b2.getMessage(), thM8182b2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static long m3867i(File file) {
        Object c3959f;
        try {
            c3959f = Long.valueOf(Long.parseLong(AbstractC3149m.m6703R0(AbstractC0793l.m2028h0(file, AbstractC3137a.f10177a)).toString()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = 0L;
        }
        return ((Number) c3959f).longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: j */
    public static String m3868j(File file) {
        Object c3959f;
        int i9;
        if (!file.isFile()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (i10 < 1048576 && (i9 = fileInputStream.read(bArr, 0, Math.min(8192, 1048576 - i10))) > 0) {
                    byteArrayOutputStream.write(bArr, 0, i9);
                    i10 += i9;
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                c3959f = new String(byteArray, charset);
                fileInputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m3869k(Activity activity) {
        File file;
        if (f4763i && (file = f4773s) != null && file.isFile() && f4760f.compareAndSet(false, true)) {
            f4761g.postDelayed(new RunnableC1435d(activity), 700L);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m3870l(File file, String str) {
        Object c3959f;
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp-" + Process.myPid() + "-" + Thread.currentThread().getId());
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                try {
                    outputStreamWriter.write(str);
                    outputStreamWriter.flush();
                    fileOutputStream.getFD().sync();
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    try {
                        Files.move(file2.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                    } catch (AtomicMoveNotSupportedException unused) {
                        Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    }
                    c3959f = Boolean.TRUE;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:Crash] 写入崩溃记录失败: ", file.getName(), " ", thM8182b.getMessage(), thM8182b);
        }
        Boolean bool = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = bool;
        }
        Boolean bool2 = (Boolean) c3959f;
        if (!bool2.booleanValue()) {
            file2.delete();
        }
        return bool2.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        if (f4768n.get() == activity) {
            AtomicBoolean atomicBoolean = f4769o;
            if (atomicBoolean != null) {
                atomicBoolean.set(false);
            }
            InterfaceC5059kv interfaceC5059kv = f4767m;
            if (interfaceC5059kv != null) {
                interfaceC5059kv.close();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (f4766l.get() == activity) {
            f4766l = new WeakReference(null);
        }
        if (f4768n.get() == activity) {
            AtomicBoolean atomicBoolean = f4769o;
            if (atomicBoolean != null) {
                atomicBoolean.set(false);
            }
            InterfaceC5059kv interfaceC5059kv = f4767m;
            if (interfaceC5059kv != null) {
                interfaceC5059kv.close();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        f4766l = new WeakReference(activity);
        if (f4763i) {
            m3862d();
            m3863e();
            m3869k(activity);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
