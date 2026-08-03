package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes.dex */
public enum FieldUsingType extends Enum<FieldUsingType> {
    private static final /* synthetic */ FieldUsingType[] $VALUES = null;
    public static final FieldUsingType Read = null;
    public static final FieldUsingType Write = null;

    private static final /* synthetic */ FieldUsingType[] $values() {
        return new FieldUsingType[]{Read, Write};
    }

    static {
        Read = new FieldUsingType("Read", 0);
        Write = new FieldUsingType("Write", 1);
        $VALUES = $values();
    }

    FieldUsingType(String r1, int r2) {
    }

    public static FieldUsingType valueOf(String r1) {
        return (FieldUsingType) Enum.valueOf(FieldUsingType.class, r1);
    }

    public static FieldUsingType[] values() {
        return (FieldUsingType[]) $VALUES.clone();
    }

    public final boolean isRead() {
        if (this != Read) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isWrite() {
        if (this != Write) goto L5;
        return true;
    L5:
        return false;
    }
}
