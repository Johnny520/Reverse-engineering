package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.e2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1868e2 extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1868e2[] $VALUES = null;
    public static final EnumC1868e2 DEBUG = null;
    public static final EnumC1868e2 ERROR = null;
    public static final EnumC1868e2 FATAL = null;
    public static final EnumC1868e2 INFO = null;
    public static final EnumC1868e2 TRACE = null;
    public static final EnumC1868e2 WARN = null;
    private final int severityNumber;

    private static /* synthetic */ EnumC1868e2[] $values() {
        return new EnumC1868e2[]{TRACE, DEBUG, INFO, WARN, ERROR, FATAL};
    }

    static {
        TRACE = new EnumC1868e2("TRACE", 0, 1);
        DEBUG = new EnumC1868e2("DEBUG", 1, 5);
        INFO = new EnumC1868e2("INFO", 2, 9);
        WARN = new EnumC1868e2("WARN", 3, 13);
        ERROR = new EnumC1868e2("ERROR", 4, 17);
        FATAL = new EnumC1868e2("FATAL", 5, 21);
        $VALUES = $values();
    }

    EnumC1868e2(String r1, int r2, int r3) {
        this.severityNumber = r3;
    }

    public static EnumC1868e2 valueOf(String r1) {
        return (EnumC1868e2) Enum.valueOf(EnumC1868e2.class, r1);
    }

    public static EnumC1868e2[] values() {
        return (EnumC1868e2[]) $VALUES.clone();
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r2, ILogger r3) {
        C1901c r22 = (C1901c) r2;
        r22.m4115z(name().toLowerCase(Locale.ROOT));
    }
}
