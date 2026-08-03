package io.sentry;

/* JADX INFO: renamed from: io.sentry.g1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1877g1 extends Enum {
    private static final /* synthetic */ EnumC1877g1[] $VALUES = null;
    public static final EnumC1877g1 MANUAL = null;
    public static final EnumC1877g1 TRACE = null;

    private static /* synthetic */ EnumC1877g1[] $values() {
        return new EnumC1877g1[]{MANUAL, TRACE};
    }

    static {
        MANUAL = new EnumC1877g1("MANUAL", 0);
        TRACE = new EnumC1877g1("TRACE", 1);
        $VALUES = $values();
    }

    EnumC1877g1(String r1, int r2) {
    }

    public static EnumC1877g1 valueOf(String r1) {
        return (EnumC1877g1) Enum.valueOf(EnumC1877g1.class, r1);
    }

    public static EnumC1877g1[] values() {
        return (EnumC1877g1[]) $VALUES.clone();
    }
}
