package Yue;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3211 {
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m290(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
