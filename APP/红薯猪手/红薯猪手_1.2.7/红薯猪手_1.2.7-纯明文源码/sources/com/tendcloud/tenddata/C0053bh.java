package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0133zz;
import java.lang.Thread;
import java.util.HashMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bh */
/* JADX INFO: loaded from: classes.dex */
public class C0053bh {

    /* JADX INFO: renamed from: a */
    private static volatile C0053bh f289a;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bh$a */
    public static class a implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler appDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (C0020ab.f130e) {
                C0053bh.m317a(th, String.valueOf(System.currentTimeMillis()), AbstractC0018a.UNIVERSAL, true);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.appDefaultHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    static {
        try {
            C0132z.m785a().register(m314a());
        } catch (Throwable unused) {
        }
    }

    private C0053bh() {
        m318b();
    }

    /* JADX INFO: renamed from: a */
    public static C0053bh m314a() {
        if (f289a == null) {
            synchronized (C0053bh.class) {
                if (f289a == null) {
                    f289a = new C0053bh();
                }
            }
        }
        return f289a;
    }

    /* JADX INFO: renamed from: a */
    private static final String m315a(Throwable th) {
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
                sb.append("\tat ");
                sb.append(stackTrace[i]);
                sb.append("\r\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m316a(sb, stackTrace, cause, 1);
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static final void m316a(StringBuilder sb, StackTraceElement[] stackTraceElementArr, Throwable th, int i) {
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
                m316a(sb, stackTrace, th, i + 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m317a(Throwable th, String str, AbstractC0018a abstractC0018a, boolean z) {
        if (C0020ab.f132g == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = str.trim().isEmpty() ? System.currentTimeMillis() : Long.parseLong(str);
            if (z && C0020ab.f100J) {
                C0116i.m546c(jCurrentTimeMillis, abstractC0018a);
            }
        } catch (Throwable unused) {
        }
        Throwable cause = th;
        while (cause.getCause() != null) {
            try {
                cause = cause.getCause();
            } catch (Throwable unused2) {
                return;
            }
        }
        StackTraceElement[] stackTrace = cause.getStackTrace();
        String packageName = C0020ab.f132g.getPackageName();
        int i = 0;
        for (int i2 = 0; i < 3 && i2 < stackTrace.length; i2++) {
            String className = stackTrace[i2].getClassName();
            if ((!className.startsWith("java.") || packageName.startsWith("java.")) && ((!className.startsWith("javax.") || packageName.startsWith("javax.")) && ((!className.startsWith("android.") || packageName.startsWith("android.")) && (!className.startsWith("com.android.") || packageName.startsWith("com.android."))))) {
                stackTrace[i2].toString();
                i++;
            }
        }
        C0067bv c0067bv = new C0067bv();
        c0067bv.f353b = "apm";
        c0067bv.f354c = "error";
        TreeMap treeMap = new TreeMap();
        treeMap.put("msg", m315a(th));
        treeMap.put("type", cause.getClass().getName());
        c0067bv.f355d = treeMap;
        c0067bv.f352a = AbstractC0018a.UNIVERSAL;
        C0132z.m785a().post(c0067bv);
    }

    /* JADX INFO: renamed from: b */
    private static void m318b() {
        try {
            Thread.setDefaultUncaughtExceptionHandler(new a());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m319a(HashMap<String, Object> map) {
        try {
            AbstractC0018a abstractC0018a = (AbstractC0018a) map.get("service");
            if (map.containsKey("throwable") && map.containsKey("occurTime")) {
                m317a((Throwable) map.get("throwable"), String.valueOf(map.get("occurTime")), abstractC0018a, false);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventError(C0133zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 3) {
                    m319a(aVar.paraMap);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
