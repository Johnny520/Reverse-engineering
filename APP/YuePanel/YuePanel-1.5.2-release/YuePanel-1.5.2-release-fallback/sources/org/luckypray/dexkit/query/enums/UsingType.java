package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/query/enums/UsingType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Any", "Read", "Write", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum UsingType extends java.lang.Enum<org.luckypray.dexkit.query.enums.UsingType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.UsingType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.UsingType Any = null;
    public static final org.luckypray.dexkit.query.enums.UsingType Read = null;
    public static final org.luckypray.dexkit.query.enums.UsingType Write = null;
    private final byte value;

    private static final /* synthetic */ org.luckypray.dexkit.query.enums.UsingType[] $values() {
            org.luckypray.dexkit.query.enums.UsingType r0 = org.luckypray.dexkit.query.enums.UsingType.Any
            org.luckypray.dexkit.query.enums.UsingType r1 = org.luckypray.dexkit.query.enums.UsingType.Read
            org.luckypray.dexkit.query.enums.UsingType r2 = org.luckypray.dexkit.query.enums.UsingType.Write
            org.luckypray.dexkit.query.enums.UsingType[] r0 = new org.luckypray.dexkit.query.enums.UsingType[]{r0, r1, r2}
            return r0
    }

    static {
            org.luckypray.dexkit.query.enums.UsingType r0 = new org.luckypray.dexkit.query.enums.UsingType
            java.lang.String r1 = "Any"
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.UsingType.Any = r0
            org.luckypray.dexkit.query.enums.UsingType r0 = new org.luckypray.dexkit.query.enums.UsingType
            java.lang.String r1 = "Read"
            r2 = 1
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.UsingType.Read = r0
            org.luckypray.dexkit.query.enums.UsingType r0 = new org.luckypray.dexkit.query.enums.UsingType
            java.lang.String r1 = "Write"
            r2 = 2
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.UsingType.Write = r0
            org.luckypray.dexkit.query.enums.UsingType[] r0 = $values()
            org.luckypray.dexkit.query.enums.UsingType.$VALUES = r0
            return
    }

    UsingType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static org.luckypray.dexkit.query.enums.UsingType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.query.enums.UsingType> r0 = org.luckypray.dexkit.query.enums.UsingType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.UsingType r1 = (org.luckypray.dexkit.query.enums.UsingType) r1
            return r1
    }

    public static org.luckypray.dexkit.query.enums.UsingType[] values() {
            org.luckypray.dexkit.query.enums.UsingType[] r0 = org.luckypray.dexkit.query.enums.UsingType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.UsingType[] r0 = (org.luckypray.dexkit.query.enums.UsingType[]) r0
            return r0
    }

    public final byte getValue() {
            r1 = this;
            byte r0 = r1.value
            return r0
    }
}
