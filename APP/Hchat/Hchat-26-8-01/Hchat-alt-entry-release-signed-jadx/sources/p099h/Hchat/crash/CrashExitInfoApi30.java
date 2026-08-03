package p099h.Hchat.crash;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import gg.AbstractC1416l;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import p054dg.C0795n;
import p085fg.InterfaceC1231l;
import p091g3.AbstractC1326o0;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p276sf.C3959f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CrashExitInfoApi30 {
    public static final int $stable = 0;
    private static final long EXIT_MATCH_WINDOW_MS = 300000;
    public static final CrashExitInfoApi30 INSTANCE = new CrashExitInfoApi30();
    private static final int SYSTEM_TRACE_LIMIT = 786432;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private CrashExitInfoApi30() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C1439h findExit(final Application application, final int i9, long j3, final long j4, long j5, final int i10) {
        ApplicationExitInfo applicationExitInfoM3532d;
        Object next;
        Object next2;
        Object next3;
        ActivityManager activityManager = (ActivityManager) application.getSystemService(ActivityManager.class);
        if (activityManager != null) {
            List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(application.getPackageName(), 0, 32);
            historicalProcessExitReasons.getClass();
            final int i11 = 0;
            final int i12 = 1;
            List listM6418b0 = AbstractC3015m.m6418b0(new C3011i(new C3011i(new C3011i(new C3011i(new C0795n(historicalProcessExitReasons, 6), true, new InterfaceC1231l() { // from class: h.Hchat.crash.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1231l
                public final Object invoke(Object obj) {
                    boolean zFindExit$lambda$0;
                    switch (i11) {
                        case 0:
                            zFindExit$lambda$0 = CrashExitInfoApi30.findExit$lambda$0(i9, (ApplicationExitInfo) obj);
                            break;
                        default:
                            zFindExit$lambda$0 = CrashExitInfoApi30.findExit$lambda$1(i9, (ApplicationExitInfo) obj);
                            break;
                    }
                    return Boolean.valueOf(zFindExit$lambda$0);
                }
            }), true, new InterfaceC1231l() { // from class: h.Hchat.crash.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1231l
                public final Object invoke(Object obj) {
                    boolean zFindExit$lambda$0;
                    switch (i12) {
                        case 0:
                            zFindExit$lambda$0 = CrashExitInfoApi30.findExit$lambda$0(i10, (ApplicationExitInfo) obj);
                            break;
                        default:
                            zFindExit$lambda$0 = CrashExitInfoApi30.findExit$lambda$1(i10, (ApplicationExitInfo) obj);
                            break;
                    }
                    return Boolean.valueOf(zFindExit$lambda$0);
                }
            }), true, new InterfaceC1231l() { // from class: h.Hchat.crash.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1231l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(CrashExitInfoApi30.findExit$lambda$2(i10, application, (ApplicationExitInfo) obj));
                }
            }), true, new InterfaceC1231l() { // from class: h.Hchat.crash.c
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1231l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(CrashExitInfoApi30.findExit$lambda$3(j4, (ApplicationExitInfo) obj));
                }
            }));
            if (j5 > 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM6418b0) {
                    if (Math.abs(AbstractC1326o0.m3532d(obj).getTimestamp() - j5) <= EXIT_MATCH_WINDOW_MS) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    if (it.hasNext()) {
                        Long lValueOf = Long.valueOf(AbstractC1326o0.m3532d(next2).getTimestamp());
                        do {
                            Object next4 = it.next();
                            Long lValueOf2 = Long.valueOf(AbstractC1326o0.m3532d(next4).getTimestamp());
                            if (lValueOf.compareTo(lValueOf2) < 0) {
                                next2 = next4;
                                lValueOf = lValueOf2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next2 = null;
                }
                applicationExitInfoM3532d = AbstractC1326o0.m3532d(next2);
                if (applicationExitInfoM3532d == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listM6418b0) {
                        if (j3 <= 0 || AbstractC1326o0.m3532d(obj2).getTimestamp() >= j3) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        next3 = it2.next();
                        if (it2.hasNext()) {
                            Long lValueOf3 = Long.valueOf(AbstractC1326o0.m3532d(next3).getTimestamp());
                            do {
                                Object next5 = it2.next();
                                Long lValueOf4 = Long.valueOf(AbstractC1326o0.m3532d(next5).getTimestamp());
                                if (lValueOf3.compareTo(lValueOf4) < 0) {
                                    next3 = next5;
                                    lValueOf3 = lValueOf4;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    applicationExitInfoM3532d = AbstractC1326o0.m3532d(next3);
                }
            } else if (j3 > 0) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listM6418b0) {
                    if (AbstractC1326o0.m3532d(obj3).getTimestamp() >= j3) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        Long lValueOf5 = Long.valueOf(AbstractC1326o0.m3532d(next).getTimestamp());
                        do {
                            Object next6 = it3.next();
                            Long lValueOf6 = Long.valueOf(AbstractC1326o0.m3532d(next6).getTimestamp());
                            if (lValueOf5.compareTo(lValueOf6) < 0) {
                                next = next6;
                                lValueOf5 = lValueOf6;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                applicationExitInfoM3532d = AbstractC1326o0.m3532d(next);
            } else {
                applicationExitInfoM3532d = null;
            }
            if (applicationExitInfoM3532d != null) {
                return new C1439h(applicationExitInfoM3532d.getTimestamp(), formatExitInfo(applicationExitInfoM3532d));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findExit$lambda$0(int i9, ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason() == i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findExit$lambda$1(int i9, ApplicationExitInfo applicationExitInfo) {
        return i9 <= 0 || applicationExitInfo.getPid() == i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findExit$lambda$2(int i9, Application application, ApplicationExitInfo applicationExitInfo) {
        String processName;
        return i9 > 0 || (processName = applicationExitInfo.getProcessName()) == null || AbstractC3149m.m6721t0(processName) || AbstractC1416l.m3825a(applicationExitInfo.getProcessName(), application.getPackageName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findExit$lambda$3(long j3, ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getTimestamp() > j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String formatExitInfo(ApplicationExitInfo applicationExitInfo) {
        StringBuilder sb2 = new StringBuilder();
        String processName = applicationExitInfo.getProcessName();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (processName == null) {
            processName = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append("进程: ".concat(processName));
        sb2.append('\n');
        sb2.append("PID: " + applicationExitInfo.getPid());
        sb2.append('\n');
        sb2.append("UID: real=" + applicationExitInfo.getRealUid() + ", package=" + applicationExitInfo.getPackageUid());
        sb2.append('\n');
        CrashExitInfoApi30 crashExitInfoApi30 = INSTANCE;
        sb2.append("原因: " + crashExitInfoApi30.reasonName(applicationExitInfo.getReason()) + " (" + applicationExitInfo.getReason() + ")");
        sb2.append('\n');
        String description = applicationExitInfo.getDescription();
        if (description != null) {
            str = description;
        }
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        if (str != null) {
            sb2.append("说明: ".concat(str));
            sb2.append('\n');
        }
        sb2.append("状态: " + applicationExitInfo.getStatus());
        sb2.append('\n');
        sb2.append("重要性: " + applicationExitInfo.getImportance());
        sb2.append('\n');
        long pss = applicationExitInfo.getPss();
        long rss = applicationExitInfo.getRss();
        StringBuilder sbM6842o = AbstractC3199a.m6842o(pss, "PSS/RSS: ", " KB / ");
        sbM6842o.append(rss);
        sbM6842o.append(" KB");
        sb2.append(sbM6842o.toString());
        sb2.append('\n');
        String str2 = applicationExitInfo.getReason() == 6 ? "系统 ANR Trace" : "系统 Tombstone";
        String systemTrace = crashExitInfoApi30.readSystemTrace(applicationExitInfo, str2);
        if (systemTrace != null) {
            sb2.append('\n');
            sb2.append("--- " + str2 + " ---");
            sb2.append('\n');
            sb2.append(systemTrace);
        } else {
            sb2.append(str2.concat(": 当前系统未提供"));
            sb2.append('\n');
        }
        return AbstractC3149m.m6705T0(sb2.toString()).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isMostlyText(byte[] bArr) {
        if (bArr.length == 0) {
            return false;
        }
        int iMin = Math.min(bArr.length, 4096);
        int i9 = 0;
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = bArr[i10] & 255;
            if (i11 == 9 || i11 == 10 || i11 == 13 || ((32 <= i11 && i11 < 127) || i11 >= 128)) {
                i9++;
            }
        }
        return (i9 * 100) / iMin >= 85;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final String readSystemTrace(ApplicationExitInfo applicationExitInfo, String str) {
        Object c3959f;
        String str2;
        int i9;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    int i10 = 0;
                    while (i10 < SYSTEM_TRACE_LIMIT && (i9 = traceInputStream.read(bArr, 0, Math.min(8192, SYSTEM_TRACE_LIMIT - i10))) > 0) {
                        byteArrayOutputStream.write(bArr, 0, i9);
                        i10 += i9;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    if (byteArray.length == 0) {
                        c3959f = null;
                    } else if (isMostlyText(byteArray)) {
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        String string = AbstractC3149m.m6705T0(new String(byteArray, charset)).toString();
                        if (i10 >= SYSTEM_TRACE_LIMIT) {
                            str2 = "\n[" + str + " 超过保存上限]";
                        } else {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        c3959f = string + str2;
                    } else {
                        c3959f = "系统返回了 " + byteArray.length + " 字节二进制 " + str + "，无法直接显示文本。";
                    }
                    traceInputStream.close();
                } finally {
                }
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String reasonName(int i9) {
        switch (i9) {
            case 1:
                return "进程自行退出";
            case 2:
                return "收到信号";
            case 3:
                return "低内存";
            case 4:
                return "Java 崩溃";
            case 5:
                return "Native 崩溃";
            case 6:
                return "ANR";
            case 7:
                return "初始化失败";
            case 8:
                return "权限变化";
            case 9:
                return "资源使用过量";
            case 10:
                return "用户请求退出";
            case 11:
            default:
                return "未知";
            case 12:
                return "依赖进程退出";
            case 13:
                return "其他";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1439h findAnrExit(Application application, long j3, long j4) {
        application.getClass();
        return findExit(application, 6, j3, j4, 0L, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1439h findNativeExit(Application application, long j3, long j4, long j5, int i9) {
        application.getClass();
        return findExit(application, 5, j3, j4, j5, i9);
    }
}
