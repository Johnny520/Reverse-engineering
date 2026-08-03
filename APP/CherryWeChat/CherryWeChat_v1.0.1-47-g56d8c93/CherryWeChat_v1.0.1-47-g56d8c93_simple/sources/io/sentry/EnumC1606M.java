package io.sentry;

/* JADX INFO: renamed from: io.sentry.M */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1606M extends Enum {
    private static final /* synthetic */ EnumC1606M[] $VALUES = null;
    public static final EnumC1606M CONNECTED = null;
    public static final EnumC1606M DISCONNECTED = null;
    public static final EnumC1606M NO_PERMISSION = null;
    public static final EnumC1606M UNKNOWN = null;

    private static /* synthetic */ EnumC1606M[] $values() {
        return new EnumC1606M[]{UNKNOWN, CONNECTED, DISCONNECTED, NO_PERMISSION};
    }

    static {
        UNKNOWN = new EnumC1606M("UNKNOWN", 0);
        CONNECTED = new EnumC1606M("CONNECTED", 1);
        DISCONNECTED = new EnumC1606M("DISCONNECTED", 2);
        NO_PERMISSION = new EnumC1606M("NO_PERMISSION", 3);
        $VALUES = $values();
    }

    EnumC1606M(String r1, int r2) {
    }

    public static EnumC1606M valueOf(String r1) {
        return (EnumC1606M) Enum.valueOf(EnumC1606M.class, r1);
    }

    public static EnumC1606M[] values() {
        return (EnumC1606M[]) $VALUES.clone();
    }
}
