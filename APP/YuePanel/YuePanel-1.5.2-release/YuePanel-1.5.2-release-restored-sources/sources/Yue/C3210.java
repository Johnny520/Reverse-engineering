package Yue;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3210 extends Handler {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3210 f133 = new C3210();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@InterfaceC6399 LogRecord logRecord) {
        C5499.m17103(logRecord, "record");
        C3209 c3209 = C3209.f131;
        String loggerName = logRecord.getLoggerName();
        C5499.m17102(loggerName, "record.loggerName");
        int iM290 = C3211.m290(logRecord);
        String message = logRecord.getMessage();
        C5499.m17102(message, "record.message");
        c3209.m287(loggerName, iM290, message, logRecord.getThrown());
    }
}
