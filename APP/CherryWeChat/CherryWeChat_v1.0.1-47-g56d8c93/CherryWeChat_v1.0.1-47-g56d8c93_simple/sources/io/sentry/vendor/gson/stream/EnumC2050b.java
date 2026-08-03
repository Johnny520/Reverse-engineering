package io.sentry.vendor.gson.stream;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2050b extends Enum {
    private static final /* synthetic */ EnumC2050b[] $VALUES = null;
    public static final EnumC2050b BEGIN_ARRAY = null;
    public static final EnumC2050b BEGIN_OBJECT = null;
    public static final EnumC2050b BOOLEAN = null;
    public static final EnumC2050b END_ARRAY = null;
    public static final EnumC2050b END_DOCUMENT = null;
    public static final EnumC2050b END_OBJECT = null;
    public static final EnumC2050b NAME = null;
    public static final EnumC2050b NULL = null;
    public static final EnumC2050b NUMBER = null;
    public static final EnumC2050b STRING = null;

    private static /* synthetic */ EnumC2050b[] $values() {
        return new EnumC2050b[]{BEGIN_ARRAY, END_ARRAY, BEGIN_OBJECT, END_OBJECT, NAME, STRING, NUMBER, BOOLEAN, NULL, END_DOCUMENT};
    }

    static {
        BEGIN_ARRAY = new EnumC2050b("BEGIN_ARRAY", 0);
        END_ARRAY = new EnumC2050b("END_ARRAY", 1);
        BEGIN_OBJECT = new EnumC2050b("BEGIN_OBJECT", 2);
        END_OBJECT = new EnumC2050b("END_OBJECT", 3);
        NAME = new EnumC2050b("NAME", 4);
        STRING = new EnumC2050b("STRING", 5);
        NUMBER = new EnumC2050b("NUMBER", 6);
        BOOLEAN = new EnumC2050b("BOOLEAN", 7);
        NULL = new EnumC2050b("NULL", 8);
        END_DOCUMENT = new EnumC2050b("END_DOCUMENT", 9);
        $VALUES = $values();
    }

    EnumC2050b(String r1, int r2) {
    }

    public static EnumC2050b valueOf(String r1) {
        return (EnumC2050b) Enum.valueOf(EnumC2050b.class, r1);
    }

    public static EnumC2050b[] values() {
        return (EnumC2050b[]) $VALUES.clone();
    }
}
