package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: StringMatchType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m115d2 = {"Lorg/luckypray/dexkit/query/enums/StringMatchType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Contains", "StartsWith", "EndsWith", "SimilarRegex", "Equals", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public enum StringMatchType extends java.lang.Enum<org.luckypray.dexkit.query.enums.StringMatchType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.StringMatchType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.StringMatchType Contains = null;
    public static final org.luckypray.dexkit.query.enums.StringMatchType EndsWith = null;
    public static final org.luckypray.dexkit.query.enums.StringMatchType Equals = null;
    public static final org.luckypray.dexkit.query.enums.StringMatchType SimilarRegex = null;
    public static final org.luckypray.dexkit.query.enums.StringMatchType StartsWith = null;
    private final byte value;

    private static final /* synthetic */ org.luckypray.dexkit.query.enums.StringMatchType[] $values() {
            org.luckypray.dexkit.query.enums.StringMatchType r0 = org.luckypray.dexkit.query.enums.StringMatchType.Contains
            org.luckypray.dexkit.query.enums.StringMatchType r1 = org.luckypray.dexkit.query.enums.StringMatchType.StartsWith
            org.luckypray.dexkit.query.enums.StringMatchType r2 = org.luckypray.dexkit.query.enums.StringMatchType.EndsWith
            org.luckypray.dexkit.query.enums.StringMatchType r3 = org.luckypray.dexkit.query.enums.StringMatchType.SimilarRegex
            org.luckypray.dexkit.query.enums.StringMatchType r4 = org.luckypray.dexkit.query.enums.StringMatchType.Equals
            org.luckypray.dexkit.query.enums.StringMatchType[] r0 = new org.luckypray.dexkit.query.enums.StringMatchType[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            org.luckypray.dexkit.query.enums.StringMatchType r0 = new org.luckypray.dexkit.query.enums.StringMatchType
            java.lang.String r1 = "Contains"
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.StringMatchType.Contains = r0
            org.luckypray.dexkit.query.enums.StringMatchType r0 = new org.luckypray.dexkit.query.enums.StringMatchType
            java.lang.String r1 = "StartsWith"
            r2 = 1
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.StringMatchType.StartsWith = r0
            org.luckypray.dexkit.query.enums.StringMatchType r0 = new org.luckypray.dexkit.query.enums.StringMatchType
            java.lang.String r1 = "EndsWith"
            r2 = 2
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.StringMatchType.EndsWith = r0
            org.luckypray.dexkit.query.enums.StringMatchType r0 = new org.luckypray.dexkit.query.enums.StringMatchType
            java.lang.String r1 = "SimilarRegex"
            r2 = 3
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.StringMatchType.SimilarRegex = r0
            org.luckypray.dexkit.query.enums.StringMatchType r0 = new org.luckypray.dexkit.query.enums.StringMatchType
            java.lang.String r1 = "Equals"
            r2 = 4
            r0.<init>(r1, r2, r2)
            org.luckypray.dexkit.query.enums.StringMatchType.Equals = r0
            org.luckypray.dexkit.query.enums.StringMatchType[] r0 = $values()
            org.luckypray.dexkit.query.enums.StringMatchType.$VALUES = r0
            return
    }

    StringMatchType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static org.luckypray.dexkit.query.enums.StringMatchType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.query.enums.StringMatchType> r0 = org.luckypray.dexkit.query.enums.StringMatchType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.StringMatchType r0 = (org.luckypray.dexkit.query.enums.StringMatchType) r0
            return r0
    }

    public static org.luckypray.dexkit.query.enums.StringMatchType[] values() {
            org.luckypray.dexkit.query.enums.StringMatchType[] r0 = org.luckypray.dexkit.query.enums.StringMatchType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.StringMatchType[] r0 = (org.luckypray.dexkit.query.enums.StringMatchType[]) r0
            return r0
    }

    public final byte getValue() {
            r1 = this;
            byte r0 = r1.value
            return r0
    }
}
