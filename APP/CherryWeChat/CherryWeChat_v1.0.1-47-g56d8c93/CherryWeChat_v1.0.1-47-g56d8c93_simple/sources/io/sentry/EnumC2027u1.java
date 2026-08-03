package io.sentry;

/* JADX INFO: renamed from: io.sentry.u1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2027u1 extends Enum {
    private static final /* synthetic */ EnumC2027u1[] $VALUES = null;
    public static final EnumC2027u1 COMBINED = null;
    public static final EnumC2027u1 CURRENT = null;
    public static final EnumC2027u1 GLOBAL = null;
    public static final EnumC2027u1 ISOLATION = null;

    private static /* synthetic */ EnumC2027u1[] $values() {
        return new EnumC2027u1[]{CURRENT, ISOLATION, GLOBAL, COMBINED};
    }

    static {
        CURRENT = new EnumC2027u1("CURRENT", 0);
        ISOLATION = new EnumC2027u1("ISOLATION", 1);
        GLOBAL = new EnumC2027u1("GLOBAL", 2);
        COMBINED = new EnumC2027u1("COMBINED", 3);
        $VALUES = $values();
    }

    EnumC2027u1(String r1, int r2) {
    }

    public static EnumC2027u1 valueOf(String r1) {
        return (EnumC2027u1) Enum.valueOf(EnumC2027u1.class, r1);
    }

    public static EnumC2027u1[] values() {
        return (EnumC2027u1[]) $VALUES.clone();
    }
}
