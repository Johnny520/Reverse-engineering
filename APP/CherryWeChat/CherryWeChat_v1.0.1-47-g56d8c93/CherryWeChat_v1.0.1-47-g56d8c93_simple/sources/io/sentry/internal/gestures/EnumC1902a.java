package io.sentry.internal.gestures;

/* JADX INFO: renamed from: io.sentry.internal.gestures.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1902a extends Enum {
    private static final /* synthetic */ EnumC1902a[] $VALUES = null;
    public static final EnumC1902a CLICKABLE = null;
    public static final EnumC1902a SCROLLABLE = null;

    private static /* synthetic */ EnumC1902a[] $values() {
        return new EnumC1902a[]{CLICKABLE, SCROLLABLE};
    }

    static {
        CLICKABLE = new EnumC1902a("CLICKABLE", 0);
        SCROLLABLE = new EnumC1902a("SCROLLABLE", 1);
        $VALUES = $values();
    }

    EnumC1902a(String r1, int r2) {
    }

    public static EnumC1902a valueOf(String r1) {
        return (EnumC1902a) Enum.valueOf(EnumC1902a.class, r1);
    }

    public static EnumC1902a[] values() {
        return (EnumC1902a[]) $VALUES.clone();
    }
}
