package io.sentry;

/* JADX INFO: renamed from: io.sentry.m0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1926m0 extends Enum {
    private static final /* synthetic */ EnumC1926m0[] $VALUES = null;
    public static final EnumC1926m0 HIGH = null;
    public static final EnumC1926m0 HIGHEST = null;
    public static final EnumC1926m0 LOW = null;
    public static final EnumC1926m0 LOWEST = null;
    public static final EnumC1926m0 MEDIUM = null;

    private static /* synthetic */ EnumC1926m0[] $values() {
        return new EnumC1926m0[]{LOWEST, LOW, MEDIUM, HIGH, HIGHEST};
    }

    static {
        LOWEST = new EnumC1926m0("LOWEST", 0);
        LOW = new EnumC1926m0("LOW", 1);
        MEDIUM = new EnumC1926m0("MEDIUM", 2);
        HIGH = new EnumC1926m0("HIGH", 3);
        HIGHEST = new EnumC1926m0("HIGHEST", 4);
        $VALUES = $values();
    }

    EnumC1926m0(String r1, int r2) {
    }

    public static EnumC1926m0 valueOf(String r1) {
        return (EnumC1926m0) Enum.valueOf(EnumC1926m0.class, r1);
    }

    public static EnumC1926m0[] values() {
        return (EnumC1926m0[]) $VALUES.clone();
    }
}
