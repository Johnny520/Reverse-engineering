package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.y2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2063y2 extends Enum {
    private static final /* synthetic */ EnumC2063y2[] $VALUES = null;
    public static final EnumC2063y2 HIGH = null;
    public static final EnumC2063y2 LOW = null;
    public static final EnumC2063y2 MEDIUM = null;
    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    private static /* synthetic */ EnumC2063y2[] $values() {
        return new EnumC2063y2[]{LOW, MEDIUM, HIGH};
    }

    static {
        LOW = new EnumC2063y2("LOW", 0, 0.8f, 50000, 10);
        MEDIUM = new EnumC2063y2("MEDIUM", 1, 1.0f, 75000, 30);
        HIGH = new EnumC2063y2("HIGH", 2, 1.0f, 100000, 50);
        $VALUES = $values();
    }

    EnumC2063y2(String r1, int r2, float r3, int r4, int r5) {
        this.sizeScale = r3;
        this.bitRate = r4;
        this.screenshotQuality = r5;
    }

    public static EnumC2063y2 valueOf(String r1) {
        return (EnumC2063y2) Enum.valueOf(EnumC2063y2.class, r1);
    }

    public static EnumC2063y2[] values() {
        return (EnumC2063y2[]) $VALUES.clone();
    }

    public String serializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
