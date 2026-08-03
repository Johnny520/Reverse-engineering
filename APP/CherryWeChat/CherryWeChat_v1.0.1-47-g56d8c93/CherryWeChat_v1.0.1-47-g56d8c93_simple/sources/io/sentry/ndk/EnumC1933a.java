package io.sentry.ndk;

/* JADX INFO: renamed from: io.sentry.ndk.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1933a extends Enum {
    private static final /* synthetic */ EnumC1933a[] $VALUES = null;
    public static final EnumC1933a SENTRY_HANDLER_STRATEGY_CHAIN_AT_START = null;
    public static final EnumC1933a SENTRY_HANDLER_STRATEGY_DEFAULT = null;
    private final int value;

    private static /* synthetic */ EnumC1933a[] $values() {
        return new EnumC1933a[]{SENTRY_HANDLER_STRATEGY_DEFAULT, SENTRY_HANDLER_STRATEGY_CHAIN_AT_START};
    }

    static {
        SENTRY_HANDLER_STRATEGY_DEFAULT = new EnumC1933a("SENTRY_HANDLER_STRATEGY_DEFAULT", 0, 0);
        SENTRY_HANDLER_STRATEGY_CHAIN_AT_START = new EnumC1933a("SENTRY_HANDLER_STRATEGY_CHAIN_AT_START", 1, 1);
        $VALUES = $values();
    }

    EnumC1933a(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static EnumC1933a valueOf(String r1) {
        return (EnumC1933a) Enum.valueOf(EnumC1933a.class, r1);
    }

    public static EnumC1933a[] values() {
        return (EnumC1933a[]) $VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}
