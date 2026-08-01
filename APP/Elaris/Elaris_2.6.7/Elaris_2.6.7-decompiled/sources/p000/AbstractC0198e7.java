package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedBridge;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0198e7 {

    /* JADX INFO: renamed from: a */
    public static final C0461t0 f226a = new C0461t0(128);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m343a(String str, String str2, Throwable th) {
        String message;
        StackTraceElement[] stackTrace;
        String simpleName = th == null ? "Throwable" : th.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(str.length() == 0 ? "unknown" : str);
        sb.append("/");
        sb.append(str2.length() == 0 ? "unknown" : str2);
        sb.append("/");
        sb.append(simpleName);
        if (f226a.m996a(System.currentTimeMillis(), sb.toString())) {
            StringBuilder sb2 = new StringBuilder("Elaris: hook diagnostic feature=");
            if (str.length() == 0) {
                str = "unknown";
            }
            sb2.append(str);
            sb2.append(" stage=");
            if (str2.length() == 0) {
                str2 = "unknown";
            }
            sb2.append(str2);
            sb2.append(" type=");
            sb2.append(simpleName);
            StackTraceElement stackTraceElement = null;
            if (th != null && (stackTrace = th.getStackTrace()) != null) {
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i];
                        if (stackTraceElement2 != null && stackTraceElement2.getClassName().startsWith(Prefs.PACKAGE_NAME)) {
                            stackTraceElement = stackTraceElement2;
                            break;
                        }
                        i++;
                    } else if (stackTrace.length != 0) {
                        stackTraceElement = stackTrace[0];
                    }
                }
            }
            if (stackTraceElement != null) {
                sb2.append(" at=");
                sb2.append(stackTraceElement.getClassName());
                sb2.append('#');
                sb2.append(stackTraceElement.getMethodName());
                sb2.append(':');
                sb2.append(stackTraceElement.getLineNumber());
            }
            if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG) && th != null && (message = th.getMessage()) != null && message.length() > 0) {
                sb2.append(" message=");
                if (message.length() > 180) {
                    message = message.substring(0, 180);
                }
                sb2.append(message);
            }
            XposedBridge.logAlways(sb2.toString());
        }
    }
}
