package io.sentry.protocol;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.protocol.C */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1946C extends Enum {
    private static final /* synthetic */ EnumC1946C[] $VALUES = null;
    public static final EnumC1946C COMPONENT = null;
    public static final EnumC1946C CUSTOM = null;
    public static final EnumC1946C ROUTE = null;
    public static final EnumC1946C TASK = null;
    public static final EnumC1946C URL = null;
    public static final EnumC1946C VIEW = null;

    private static /* synthetic */ EnumC1946C[] $values() {
        return new EnumC1946C[]{CUSTOM, URL, ROUTE, VIEW, COMPONENT, TASK};
    }

    static {
        CUSTOM = new EnumC1946C("CUSTOM", 0);
        URL = new EnumC1946C("URL", 1);
        ROUTE = new EnumC1946C("ROUTE", 2);
        VIEW = new EnumC1946C("VIEW", 3);
        COMPONENT = new EnumC1946C("COMPONENT", 4);
        TASK = new EnumC1946C("TASK", 5);
        $VALUES = $values();
    }

    EnumC1946C(String r1, int r2) {
    }

    public static EnumC1946C valueOf(String r1) {
        return (EnumC1946C) Enum.valueOf(EnumC1946C.class, r1);
    }

    public static EnumC1946C[] values() {
        return (EnumC1946C[]) $VALUES.clone();
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
