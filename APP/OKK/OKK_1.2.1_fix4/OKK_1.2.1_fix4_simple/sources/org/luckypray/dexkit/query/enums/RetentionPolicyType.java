package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum RetentionPolicyType extends Enum<RetentionPolicyType> {
    private static final /* synthetic */ RetentionPolicyType[] $VALUES = null;
    public static final RetentionPolicyType Class = null;
    public static final RetentionPolicyType Runtime = null;
    public static final RetentionPolicyType Source = null;
    private final byte value;

    private static final /* synthetic */ RetentionPolicyType[] $values() {
        return new RetentionPolicyType[]{Source, Class, Runtime};
    }

    static {
        Source = new RetentionPolicyType("Source", 0, (byte) 1);
        Class = new RetentionPolicyType("Class", 1, (byte) 2);
        Runtime = new RetentionPolicyType("Runtime", 2, (byte) 3);
        $VALUES = $values();
    }

    RetentionPolicyType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static RetentionPolicyType valueOf(String r1) {
        return (RetentionPolicyType) Enum.valueOf(RetentionPolicyType.class, r1);
    }

    public static RetentionPolicyType[] values() {
        return (RetentionPolicyType[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
