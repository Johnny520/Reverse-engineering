package p000a;

/* JADX INFO: renamed from: a.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0001b {

    /* JADX INFO: renamed from: a */
    public static final String f0a = "_COROUTINE";

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement m2b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f0a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
