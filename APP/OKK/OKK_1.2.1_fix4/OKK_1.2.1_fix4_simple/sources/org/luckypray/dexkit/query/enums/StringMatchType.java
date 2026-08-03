package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum StringMatchType extends Enum<StringMatchType> {
    private static final /* synthetic */ StringMatchType[] $VALUES = null;
    public static final StringMatchType Contains = null;
    public static final StringMatchType EndsWith = null;
    public static final StringMatchType Equals = null;
    public static final StringMatchType SimilarRegex = null;
    public static final StringMatchType StartsWith = null;
    private final byte value;

    private static final /* synthetic */ StringMatchType[] $values() {
        return new StringMatchType[]{Contains, StartsWith, EndsWith, SimilarRegex, Equals};
    }

    static {
        Contains = new StringMatchType("Contains", 0, (byte) 0);
        StartsWith = new StringMatchType("StartsWith", 1, (byte) 1);
        EndsWith = new StringMatchType("EndsWith", 2, (byte) 2);
        SimilarRegex = new StringMatchType("SimilarRegex", 3, (byte) 3);
        Equals = new StringMatchType("Equals", 4, (byte) 4);
        $VALUES = $values();
    }

    StringMatchType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static StringMatchType valueOf(String r1) {
        return (StringMatchType) Enum.valueOf(StringMatchType.class, r1);
    }

    public static StringMatchType[] values() {
        return (StringMatchType[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
