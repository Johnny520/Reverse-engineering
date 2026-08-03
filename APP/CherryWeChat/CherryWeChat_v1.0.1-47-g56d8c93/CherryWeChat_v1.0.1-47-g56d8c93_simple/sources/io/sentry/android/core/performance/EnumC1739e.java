package io.sentry.android.core.performance;

/* JADX INFO: renamed from: io.sentry.android.core.performance.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1739e extends Enum {
    private static final /* synthetic */ EnumC1739e[] $VALUES = null;
    public static final EnumC1739e COLD = null;
    public static final EnumC1739e UNKNOWN = null;
    public static final EnumC1739e WARM = null;

    private static /* synthetic */ EnumC1739e[] $values() {
        return new EnumC1739e[]{UNKNOWN, COLD, WARM};
    }

    static {
        UNKNOWN = new EnumC1739e("UNKNOWN", 0);
        COLD = new EnumC1739e("COLD", 1);
        WARM = new EnumC1739e("WARM", 2);
        $VALUES = $values();
    }

    EnumC1739e(String r1, int r2) {
    }

    public static EnumC1739e valueOf(String r1) {
        return (EnumC1739e) Enum.valueOf(EnumC1739e.class, r1);
    }

    public static EnumC1739e[] values() {
        return (EnumC1739e[]) $VALUES.clone();
    }
}
