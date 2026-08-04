package yyds;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: yyds.ᛲᲁᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0461 extends Handler {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0461 f2311 = new C0461();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC2691.f13229;
        String loggerName = logRecord.getLoggerName();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strM1292 = (String) AbstractC2691.f13230.get(loggerName);
        if (strM1292 == null) {
            strM1292 = AbstractC0473.m1292(23, loggerName);
        }
        if (Log.isLoggable(strM1292, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iM1290 = AbstractC0473.m1290(message, '\n', i2, 4);
                if (iM1290 == -1) {
                    iM1290 = length;
                }
                while (true) {
                    iMin = Math.min(iM1290, i2 + 4000);
                    Log.println(i, strM1292, message.substring(i2, iMin));
                    if (iMin >= iM1290) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
