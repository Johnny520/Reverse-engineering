package io.sentry;

/* JADX INFO: renamed from: io.sentry.E2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1577E2 extends Enum {
    private static final /* synthetic */ EnumC1577E2[] $VALUES = null;
    public static final EnumC1577E2 Abnormal = null;
    public static final EnumC1577E2 Crashed = null;
    public static final EnumC1577E2 Exited = null;

    /* JADX INFO: renamed from: Ok */
    public static final EnumC1577E2 f5688Ok = null;

    private static /* synthetic */ EnumC1577E2[] $values() {
        return new EnumC1577E2[]{f5688Ok, Exited, Crashed, Abnormal};
    }

    static {
        f5688Ok = new EnumC1577E2("Ok", 0);
        Exited = new EnumC1577E2("Exited", 1);
        Crashed = new EnumC1577E2("Crashed", 2);
        Abnormal = new EnumC1577E2("Abnormal", 3);
        $VALUES = $values();
    }

    EnumC1577E2(String r1, int r2) {
    }

    public static EnumC1577E2 valueOf(String r1) {
        return (EnumC1577E2) Enum.valueOf(EnumC1577E2.class, r1);
    }

    public static EnumC1577E2[] values() {
        return (EnumC1577E2[]) $VALUES.clone();
    }
}
