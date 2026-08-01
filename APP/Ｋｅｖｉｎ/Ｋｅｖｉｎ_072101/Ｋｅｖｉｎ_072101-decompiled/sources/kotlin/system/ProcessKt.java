package kotlin.system;

/* JADX INFO: compiled from: Process.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, m115d2 = {"exitProcess", "", "status", "", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class ProcessKt {
    private static final java.lang.Void exitProcess(int r2) {
            java.lang.System.exit(r2)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "System.exit returned normally, while it was supposed to halt JVM."
            r0.<init>(r1)
            throw r0
    }
}
