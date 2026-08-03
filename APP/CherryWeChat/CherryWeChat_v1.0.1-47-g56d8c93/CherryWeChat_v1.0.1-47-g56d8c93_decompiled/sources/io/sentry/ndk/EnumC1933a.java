package io.sentry.ndk;

/* JADX INFO: renamed from: io.sentry.ndk.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1933a {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    EnumC1933a(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
