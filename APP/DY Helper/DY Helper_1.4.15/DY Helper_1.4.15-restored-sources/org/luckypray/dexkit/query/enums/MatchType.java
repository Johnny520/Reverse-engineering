package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
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
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.MatchType r1 = (org.luckypray.dexkit.query.enums.MatchType) r1
            return r1
    }

    public static org.luckypray.dexkit.query.enums.MatchType[] values() {
            org.luckypray.dexkit.query.enums.MatchType[] r0 = org.luckypray.dexkit.query.enums.MatchType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.MatchType[] r0 = (org.luckypray.dexkit.query.enums.MatchType[]) r0
            return r0
    }

    public final byte getValue() {
            r0 = this;
            byte r0 = r0.value
            return r0
    }
}
