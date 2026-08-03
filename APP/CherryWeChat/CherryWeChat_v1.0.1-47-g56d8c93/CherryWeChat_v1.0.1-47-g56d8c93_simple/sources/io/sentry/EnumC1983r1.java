package io.sentry;

/* JADX INFO: renamed from: io.sentry.r1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1983r1 extends Enum {
    private static final /* synthetic */ EnumC1983r1[] $VALUES = null;
    public static final EnumC1983r1 AUTO = null;
    public static final EnumC1983r1 OFF = null;

    /* JADX INFO: renamed from: ON */
    public static final EnumC1983r1 f7104ON = null;

    private static /* synthetic */ EnumC1983r1[] $values() {
        return new EnumC1983r1[]{AUTO, f7104ON, OFF};
    }

    static {
        AUTO = new EnumC1983r1("AUTO", 0);
        f7104ON = new EnumC1983r1("ON", 1);
        OFF = new EnumC1983r1("OFF", 2);
        $VALUES = $values();
    }

    EnumC1983r1(String r1, int r2) {
    }

    public static EnumC1983r1 valueOf(String r1) {
        return (EnumC1983r1) Enum.valueOf(EnumC1983r1.class, r1);
    }

    public static EnumC1983r1[] values() {
        return (EnumC1983r1[]) $VALUES.clone();
    }
}
