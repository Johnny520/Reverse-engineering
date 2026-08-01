package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
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
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.StringMatchType r1 = (org.luckypray.dexkit.query.enums.StringMatchType) r1
            return r1
    }

    public static org.luckypray.dexkit.query.enums.StringMatchType[] values() {
            org.luckypray.dexkit.query.enums.StringMatchType[] r0 = org.luckypray.dexkit.query.enums.StringMatchType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.StringMatchType[] r0 = (org.luckypray.dexkit.query.enums.StringMatchType[]) r0
            return r0
    }

    public final byte getValue() {
            r0 = this;
            byte r0 = r0.value
            return r0
    }
}
