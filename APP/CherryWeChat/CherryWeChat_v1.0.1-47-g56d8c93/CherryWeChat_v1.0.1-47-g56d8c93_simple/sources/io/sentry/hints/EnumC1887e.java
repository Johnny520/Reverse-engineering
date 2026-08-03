package io.sentry.hints;

/* JADX INFO: renamed from: io.sentry.hints.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1887e extends Enum {
    private static final /* synthetic */ EnumC1887e[] $VALUES = null;
    public static final EnumC1887e MULTITHREADED_DEDUPLICATION = null;

    private static /* synthetic */ EnumC1887e[] $values() {
        return new EnumC1887e[]{MULTITHREADED_DEDUPLICATION};
    }

    static {
        MULTITHREADED_DEDUPLICATION = new EnumC1887e("MULTITHREADED_DEDUPLICATION", 0);
        $VALUES = $values();
    }

    EnumC1887e(String r1, int r2) {
    }

    public static EnumC1887e valueOf(String r1) {
        return (EnumC1887e) Enum.valueOf(EnumC1887e.class, r1);
    }

    public static EnumC1887e[] values() {
        return (EnumC1887e[]) $VALUES.clone();
    }
}
