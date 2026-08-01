package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: MatchType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m115d2 = {"Lorg/luckypray/dexkit/query/enums/MatchType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Contains", "Equals", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public enum MatchType extends java.lang.Enum<org.luckypray.dexkit.query.enums.MatchType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.MatchType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.MatchType Contains = null;
    public static final org.luckypray.dexkit.query.enums.MatchType Equals = null;
    private final byte value;

    private static final /* synthetic */ org.luckypray.dexkit.query.enums.MatchType[] $values() {
            org.luckypray.dexkit.query.enums.MatchType r0 = org.luckypray.dexkit.query.enums.MatchType.Contains
            org.luckypray.dexkit.query.enums.MatchType r1 = org.luckypray.dexkit.query.enums.MatchType.Equals
            org.luckypray.dexkit.query.enums.MatchType[] r0 = new org.luckypray.dexkit.query.enums.MatchType[]{r0, r1}
            return r0
    }

    static {
            org.luckypray.dexkit.query.enums.MatchType r0 = new org.luckypray.dexkit.query.enums.MatchType
            java.lang.String r1 = "Contains"
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.MatchType.Contains = r0
            org.luckypray.dexkit.query.enums.MatchType r0 = new org.luckypray.dexkit.query.enums.MatchType
            java.lang.String r1 = "Equals"
            r2 = 1
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.MatchType.Equals = r0
            org.luckypray.dexkit.query.enums.MatchType[] r0 = $values()
            org.luckypray.dexkit.query.enums.MatchType.$VALUES = r0
            return
    }

    MatchType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static org.luckypray.dexkit.query.enums.MatchType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.query.enums.MatchType> r0 = org.luckypray.dexkit.query.enums.MatchType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.MatchType r0 = (org.luckypray.dexkit.query.enums.MatchType) r0
            return r0
    }

    public static org.luckypray.dexkit.query.enums.MatchType[] values() {
            org.luckypray.dexkit.query.enums.MatchType[] r0 = org.luckypray.dexkit.query.enums.MatchType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.MatchType[] r0 = (org.luckypray.dexkit.query.enums.MatchType[]) r0
            return r0
    }

    public final byte getValue() {
            r1 = this;
            byte r0 = r1.value
            return r0
    }
}
