package io.sentry.android.core.internal.gestures;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.d */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1705d extends Enum {
    private static final /* synthetic */ EnumC1705d[] $VALUES = null;
    public static final EnumC1705d Click = null;
    public static final EnumC1705d Scroll = null;
    public static final EnumC1705d Swipe = null;
    public static final EnumC1705d Unknown = null;

    private static /* synthetic */ EnumC1705d[] $values() {
        return new EnumC1705d[]{Click, Scroll, Swipe, Unknown};
    }

    static {
        Click = new EnumC1705d("Click", 0);
        Scroll = new EnumC1705d("Scroll", 1);
        Swipe = new EnumC1705d("Swipe", 2);
        Unknown = new EnumC1705d("Unknown", 3);
        $VALUES = $values();
    }

    EnumC1705d(String r1, int r2) {
    }

    public static EnumC1705d valueOf(String r1) {
        return (EnumC1705d) Enum.valueOf(EnumC1705d.class, r1);
    }

    public static EnumC1705d[] values() {
        return (EnumC1705d[]) $VALUES.clone();
    }
}
