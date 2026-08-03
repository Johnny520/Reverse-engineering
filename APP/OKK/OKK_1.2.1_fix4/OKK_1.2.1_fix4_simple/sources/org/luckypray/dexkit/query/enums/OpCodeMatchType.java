package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum OpCodeMatchType extends Enum<OpCodeMatchType> {
    private static final /* synthetic */ OpCodeMatchType[] $VALUES = null;
    public static final OpCodeMatchType Contains = null;
    public static final OpCodeMatchType EndsWith = null;
    public static final OpCodeMatchType Equals = null;
    public static final OpCodeMatchType StartsWith = null;
    private final byte value;

    private static final /* synthetic */ OpCodeMatchType[] $values() {
        return new OpCodeMatchType[]{Contains, StartsWith, EndsWith, Equals};
    }

    static {
        Contains = new OpCodeMatchType("Contains", 0, (byte) 0);
        StartsWith = new OpCodeMatchType("StartsWith", 1, (byte) 1);
        EndsWith = new OpCodeMatchType("EndsWith", 2, (byte) 2);
        Equals = new OpCodeMatchType("Equals", 3, (byte) 3);
        $VALUES = $values();
    }

    OpCodeMatchType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static OpCodeMatchType valueOf(String r1) {
        return (OpCodeMatchType) Enum.valueOf(OpCodeMatchType.class, r1);
    }

    public static OpCodeMatchType[] values() {
        return (OpCodeMatchType[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
