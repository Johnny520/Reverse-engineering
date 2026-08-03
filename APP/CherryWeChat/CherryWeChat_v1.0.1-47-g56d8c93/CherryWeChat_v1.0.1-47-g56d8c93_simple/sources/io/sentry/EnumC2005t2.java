package io.sentry;

/* JADX INFO: renamed from: io.sentry.t2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2005t2 extends Enum {
    private static final /* synthetic */ EnumC2005t2[] $VALUES = null;
    public static final EnumC2005t2 ALWAYS = null;
    public static final EnumC2005t2 MEDIUM = null;
    public static final EnumC2005t2 NONE = null;
    public static final EnumC2005t2 SMALL = null;

    private static /* synthetic */ EnumC2005t2[] $values() {
        return new EnumC2005t2[]{NONE, SMALL, MEDIUM, ALWAYS};
    }

    static {
        NONE = new EnumC2005t2("NONE", 0);
        SMALL = new EnumC2005t2("SMALL", 1);
        MEDIUM = new EnumC2005t2("MEDIUM", 2);
        ALWAYS = new EnumC2005t2("ALWAYS", 3);
        $VALUES = $values();
    }

    EnumC2005t2(String r1, int r2) {
    }

    public static EnumC2005t2 valueOf(String r1) {
        return (EnumC2005t2) Enum.valueOf(EnumC2005t2.class, r1);
    }

    public static EnumC2005t2[] values() {
        return (EnumC2005t2[]) $VALUES.clone();
    }
}
