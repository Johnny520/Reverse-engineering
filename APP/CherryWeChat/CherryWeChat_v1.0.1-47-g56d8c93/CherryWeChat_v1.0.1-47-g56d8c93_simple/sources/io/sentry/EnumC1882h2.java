package io.sentry;

/* JADX INFO: renamed from: io.sentry.h2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1882h2 extends Enum {
    private static final /* synthetic */ EnumC1882h2[] $VALUES = null;
    public static final EnumC1882h2 AGENT = null;
    public static final EnumC1882h2 AGENTLESS = null;
    public static final EnumC1882h2 AGENTLESS_SPRING = null;
    public static final EnumC1882h2 AUTO = null;
    public static final EnumC1882h2 OFF = null;

    private static /* synthetic */ EnumC1882h2[] $values() {
        return new EnumC1882h2[]{AUTO, OFF, AGENT, AGENTLESS, AGENTLESS_SPRING};
    }

    static {
        AUTO = new EnumC1882h2("AUTO", 0);
        OFF = new EnumC1882h2("OFF", 1);
        AGENT = new EnumC1882h2("AGENT", 2);
        AGENTLESS = new EnumC1882h2("AGENTLESS", 3);
        AGENTLESS_SPRING = new EnumC1882h2("AGENTLESS_SPRING", 4);
        $VALUES = $values();
    }

    EnumC1882h2(String r1, int r2) {
    }

    public static EnumC1882h2 valueOf(String r1) {
        return (EnumC1882h2) Enum.valueOf(EnumC1882h2.class, r1);
    }

    public static EnumC1882h2[] values() {
        return (EnumC1882h2[]) $VALUES.clone();
    }
}
