package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.W */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1679W extends Enum {
    private static final /* synthetic */ EnumC1679W[] $VALUES = null;
    public static final EnumC1679W SENTRY_HANDLER_STRATEGY_CHAIN_AT_START = null;
    public static final EnumC1679W SENTRY_HANDLER_STRATEGY_DEFAULT = null;
    private final int value;

    private static /* synthetic */ EnumC1679W[] $values() {
        return new EnumC1679W[]{SENTRY_HANDLER_STRATEGY_DEFAULT, SENTRY_HANDLER_STRATEGY_CHAIN_AT_START};
    }

    static {
        SENTRY_HANDLER_STRATEGY_DEFAULT = new EnumC1679W("SENTRY_HANDLER_STRATEGY_DEFAULT", 0, 0);
        SENTRY_HANDLER_STRATEGY_CHAIN_AT_START = new EnumC1679W("SENTRY_HANDLER_STRATEGY_CHAIN_AT_START", 1, 1);
        $VALUES = $values();
    }

    EnumC1679W(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static EnumC1679W valueOf(String r1) {
        return (EnumC1679W) Enum.valueOf(EnumC1679W.class, r1);
    }

    public static EnumC1679W[] values() {
        return (EnumC1679W[]) $VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}
