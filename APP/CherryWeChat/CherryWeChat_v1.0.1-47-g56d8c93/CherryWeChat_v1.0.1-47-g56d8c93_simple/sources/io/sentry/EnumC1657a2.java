package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.a2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1657a2 extends Enum implements InterfaceC1567C0 {
    private static final /* synthetic */ EnumC1657a2[] $VALUES = null;
    public static final EnumC1657a2 DEBUG = null;
    public static final EnumC1657a2 ERROR = null;
    public static final EnumC1657a2 FATAL = null;
    public static final EnumC1657a2 INFO = null;
    public static final EnumC1657a2 WARNING = null;

    private static /* synthetic */ EnumC1657a2[] $values() {
        return new EnumC1657a2[]{DEBUG, INFO, WARNING, ERROR, FATAL};
    }

    static {
        DEBUG = new EnumC1657a2("DEBUG", 0);
        INFO = new EnumC1657a2("INFO", 1);
        WARNING = new EnumC1657a2("WARNING", 2);
        ERROR = new EnumC1657a2("ERROR", 3);
        FATAL = new EnumC1657a2("FATAL", 4);
        $VALUES = $values();
    }

    EnumC1657a2(String r1, int r2) {
    }

    public static EnumC1657a2 valueOf(String r1) {
        return (EnumC1657a2) Enum.valueOf(EnumC1657a2.class, r1);
    }

    public static EnumC1657a2[] values() {
        return (EnumC1657a2[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r2, ILogger r3) {
        C1901c r22 = (C1901c) r2;
        r22.m4115z(name().toLowerCase(Locale.ROOT));
    }
}
