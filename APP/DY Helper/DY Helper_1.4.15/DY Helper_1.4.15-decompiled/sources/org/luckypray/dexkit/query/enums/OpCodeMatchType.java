package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
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
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.OpCodeMatchType r1 = (org.luckypray.dexkit.query.enums.OpCodeMatchType) r1
            return r1
    }

    public static org.luckypray.dexkit.query.enums.OpCodeMatchType[] values() {
            org.luckypray.dexkit.query.enums.OpCodeMatchType[] r0 = org.luckypray.dexkit.query.enums.OpCodeMatchType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.OpCodeMatchType[] r0 = (org.luckypray.dexkit.query.enums.OpCodeMatchType[]) r0
            return r0
    }

    public final byte getValue() {
            r0 = this;
            byte r0 = r0.value
            return r0
    }
}
