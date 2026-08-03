package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bo */
/* JADX INFO: loaded from: classes.dex */
public class C0060bo {

    /* JADX INFO: renamed from: a */
    private static List<String> f315a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static Handler f316b;

    /* JADX INFO: renamed from: c */
    private static HandlerThread f317c;

    static {
        try {
            HandlerThread handlerThread = new HandlerThread("excHandlerThread", 10);
            f317c = handlerThread;
            handlerThread.start();
            f316b = new Handler(f317c.getLooper());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m352a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        sb.append("\r\n");
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = 50;
            if (stackTrace.length <= 50) {
                length = stackTrace.length;
            }
            for (int i = 0; i < length; i++) {
                sb.append("\t");
                sb.append(stackTrace[i]);
                sb.append("\r\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m354a(sb, stackTrace, cause, 1);
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m353a(final String str, final boolean z, final Map<String, Object> map) {
        try {
            f316b.post(new Runnable() { // from class: com.tendcloud.tenddata.bo.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Map map2 = map;
                        if (map2 == null || map2.isEmpty() || !C0060bo.m356b(z, String.valueOf(map.get("targetUrl")), str)) {
                            return;
                        }
                        C0115h.dForInternal(map.toString() + " host: " + str);
                        C0067bv c0067bv = new C0067bv();
                        c0067bv.f353b = "sdk";
                        c0067bv.f354c = z ? "send_ok" : "send_fail";
                        c0067bv.f355d = map;
                        c0067bv.f352a = AbstractC0018a.ENV;
                        C0132z.m785a().post(c0067bv);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static final void m354a(StringBuilder sb, StackTraceElement[] stackTraceElementArr, Throwable th, int i) {
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length - 1;
            for (int length2 = stackTraceElementArr.length - 1; length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2]); length2--) {
                length--;
            }
            if (length > 50) {
                length = 50;
            }
            sb.append("Caused by : ");
            sb.append(th);
            sb.append("\r\n");
            for (int i2 = 0; i2 <= length; i2++) {
                sb.append("\t");
                sb.append(stackTrace[i2]);
                sb.append("\r\n");
            }
            if (i < 5 && th.getCause() != null) {
                m354a(sb, stackTrace, th, i + 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m356b(boolean z, String str, String str2) {
        if (z && !C0131y.m767b(str2) && str2.contains(C0019aa.f81l)) {
            return false;
        }
        return z || !str.contains("api/q/a");
    }
}
