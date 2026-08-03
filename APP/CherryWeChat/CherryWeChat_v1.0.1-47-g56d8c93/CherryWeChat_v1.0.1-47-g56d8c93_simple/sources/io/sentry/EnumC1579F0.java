package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.F0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1579F0 extends Enum implements InterfaceC1583G0 {
    private static final /* synthetic */ EnumC1579F0[] $VALUES = null;
    public static final EnumC1579F0 DAY = null;
    public static final EnumC1579F0 HOUR = null;
    public static final EnumC1579F0 MICROSECOND = null;
    public static final EnumC1579F0 MILLISECOND = null;
    public static final EnumC1579F0 MINUTE = null;
    public static final EnumC1579F0 NANOSECOND = null;
    public static final EnumC1579F0 SECOND = null;
    public static final EnumC1579F0 WEEK = null;

    private static /* synthetic */ EnumC1579F0[] $values() {
        return new EnumC1579F0[]{NANOSECOND, MICROSECOND, MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK};
    }

    static {
        NANOSECOND = new EnumC1579F0("NANOSECOND", 0);
        MICROSECOND = new EnumC1579F0("MICROSECOND", 1);
        MILLISECOND = new EnumC1579F0("MILLISECOND", 2);
        SECOND = new EnumC1579F0("SECOND", 3);
        MINUTE = new EnumC1579F0("MINUTE", 4);
        HOUR = new EnumC1579F0("HOUR", 5);
        DAY = new EnumC1579F0("DAY", 6);
        WEEK = new EnumC1579F0("WEEK", 7);
        $VALUES = $values();
    }

    EnumC1579F0(String r1, int r2) {
    }

    public static EnumC1579F0 valueOf(String r1) {
        return (EnumC1579F0) Enum.valueOf(EnumC1579F0.class, r1);
    }

    public static EnumC1579F0[] values() {
        return (EnumC1579F0[]) $VALUES.clone();
    }

    @Override // io.sentry.InterfaceC1583G0
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
