package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum UsingType extends Enum<UsingType> {
    private static final /* synthetic */ UsingType[] $VALUES = null;
    public static final UsingType Any = null;
    public static final UsingType Read = null;
    public static final UsingType Write = null;
    private final byte value;

    private static final /* synthetic */ UsingType[] $values() {
        return new UsingType[]{Any, Read, Write};
    }

    static {
        Any = new UsingType("Any", 0, (byte) 0);
        Read = new UsingType("Read", 1, (byte) 1);
        Write = new UsingType("Write", 2, (byte) 2);
        $VALUES = $values();
    }

    UsingType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static UsingType valueOf(String r1) {
        return (UsingType) Enum.valueOf(UsingType.class, r1);
    }

    public static UsingType[] values() {
        return (UsingType[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
