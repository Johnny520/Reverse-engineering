package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.y */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1751y extends Enum {
    private static final /* synthetic */ EnumC1751y[] $VALUES = null;
    public static final EnumC1751y DUMP = null;
    public static final EnumC1751y ERROR = null;
    public static final EnumC1751y NO_DUMP = null;

    private static /* synthetic */ EnumC1751y[] $values() {
        return new EnumC1751y[]{DUMP, NO_DUMP, ERROR};
    }

    static {
        DUMP = new EnumC1751y("DUMP", 0);
        NO_DUMP = new EnumC1751y("NO_DUMP", 1);
        ERROR = new EnumC1751y("ERROR", 2);
        $VALUES = $values();
    }

    EnumC1751y(String r1, int r2) {
    }

    public static EnumC1751y valueOf(String r1) {
        return (EnumC1751y) Enum.valueOf(EnumC1751y.class, r1);
    }

    public static EnumC1751y[] values() {
        return (EnumC1751y[]) $VALUES.clone();
    }
}
