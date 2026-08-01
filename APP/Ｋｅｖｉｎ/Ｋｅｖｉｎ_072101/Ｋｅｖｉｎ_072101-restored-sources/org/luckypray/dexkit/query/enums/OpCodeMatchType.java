package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: OpCodeMatchType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m115d2 = {"Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Contains", "StartsWith", "EndsWith", "Equals", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public enum OpCodeMatchType extends java.lang.Enum<org.luckypray.dexkit.query.enums.OpCodeMatchType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.OpCodeMatchType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.OpCodeMatchType Contains = null;
    public static final org.luckypray.dexkit.query.enums.OpCodeMatchType EndsWith = null;
    public static final org.luckypray.dexkit.query.enums.OpCodeMatchType Equals = null;
    public static final org.luckypray.dexkit.query.enums.OpCodeMatchType StartsWith = null;
    private final byte value;

    private static final /* synthetic */ org.luckypray.dexkit.query.enums.OpCodeMatchType[] $values() {
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains
            org.luckypray.dexkit.query.enums.OpCodeMatchType r1 = org.luckypray.dexkit.query.enums.OpCodeMatchType.StartsWith
            org.luckypray.dexkit.query.enums.OpCodeMatchType r2 = org.luckypray.dexkit.query.enums.OpCodeMatchType.EndsWith
            org.luckypray.dexkit.query.enums.OpCodeMatchType r3 = org.luckypray.dexkit.query.enums.OpCodeMatchType.Equals
            org.luckypray.dexkit.query.enums.OpCodeMatchType[] r0 = new org.luckypray.dexkit.query.enums.OpCodeMatchType[]{r0, r1, r2, r3}
            return r0
    }

    static {
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = new org.luckypray.dexkit.query.enums.OpCodeMatchType
            java.lang.String r1 = "Contains"
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.OpCodeMatchType.Contains = r0
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = new org.luckypray.dexkit.query.enums.OpCodeMatchType
            java.lang.String r1 = "StartsWith"
            r2 = 1
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.OpCodeMatchType.StartsWith = r0
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = new org.luckypray.dexkit.query.enums.OpCodeMatchType
            java.lang.String r1 = "EndsWith"
            r2 = 2
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.OpCodeMatchType.EndsWith = r0
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = new org.luckypray.dexkit.query.enums.OpCodeMatchType
            java.lang.String r1 = "Equals"
            r2 = 3
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.OpCodeMatchType.Equals = r0
            org.luckypray.dexkit.query.enums.OpCodeMatchType[] r0 = $values()
            org.luckypray.dexkit.query.enums.OpCodeMatchType.$VALUES = r0
            return
    }

    OpCodeMatchType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static org.luckypray.dexkit.query.enums.OpCodeMatchType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.query.enums.OpCodeMatchType> r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.OpCodeMatchType r0 = (org.luckypray.dexkit.query.enums.OpCodeMatchType) r0
            return r0
    }

    public static org.luckypray.dexkit.query.enums.OpCodeMatchType[] values() {
            org.luckypray.dexkit.query.enums.OpCodeMatchType[] r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.OpCodeMatchType[] r0 = (org.luckypray.dexkit.query.enums.OpCodeMatchType[]) r0
            return r0
    }

    public final byte getValue() {
            r1 = this;
            byte r0 = r1.value
            return r0
    }
}
