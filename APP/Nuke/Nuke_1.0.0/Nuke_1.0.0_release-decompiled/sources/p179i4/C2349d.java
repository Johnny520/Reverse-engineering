package p179i4;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: i4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2349d extends Handler {

    /* JADX INFO: renamed from: a */
    public static final C2349d f7645a = new C2349d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        AbstractC1665j.m2985e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC2348c.f7643a;
        String loggerName = logRecord.getLoggerName();
        AbstractC1665j.m2984d(loggerName, "getLoggerName(...)");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i5 = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        AbstractC1665j.m2984d(message, "getMessage(...)");
        AbstractC2348c.m4176a(loggerName, i5, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
