package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum MatchType extends Enum<MatchType> {
    private static final /* synthetic */ MatchType[] $VALUES = null;
    public static final MatchType Contains = null;
    public static final MatchType Equals = null;
    private final byte value;

    private static final /* synthetic */ MatchType[] $values() {
        return new MatchType[]{Contains, Equals};
    }

    static {
        Contains = new MatchType("Contains", 0, (byte) 0);
        Equals = new MatchType("Equals", 1, (byte) 1);
        $VALUES = $values();
    }

    MatchType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static MatchType valueOf(String r1) {
        return (MatchType) Enum.valueOf(MatchType.class, r1);
    }

    public static MatchType[] values() {
        return (MatchType[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
