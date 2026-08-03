package io.sentry;

/* JADX INFO: renamed from: io.sentry.n0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1930n0 extends Enum {
    private static final /* synthetic */ EnumC1930n0[] $VALUES = null;
    public static final EnumC1930n0 OTEL = null;
    public static final EnumC1930n0 SENTRY = null;

    private static /* synthetic */ EnumC1930n0[] $values() {
        return new EnumC1930n0[]{SENTRY, OTEL};
    }

    static {
        SENTRY = new EnumC1930n0("SENTRY", 0);
        OTEL = new EnumC1930n0("OTEL", 1);
        $VALUES = $values();
    }

    EnumC1930n0(String r1, int r2) {
    }

    public static EnumC1930n0 valueOf(String r1) {
        return (EnumC1930n0) Enum.valueOf(EnumC1930n0.class, r1);
    }

    public static EnumC1930n0[] values() {
        return (EnumC1930n0[]) $VALUES.clone();
    }
}
