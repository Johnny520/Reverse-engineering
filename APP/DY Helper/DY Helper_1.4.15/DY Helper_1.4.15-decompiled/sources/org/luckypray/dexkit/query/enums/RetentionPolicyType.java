package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum RetentionPolicyType extends java.lang.Enum<org.luckypray.dexkit.query.enums.RetentionPolicyType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.RetentionPolicyType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.RetentionPolicyType Class = null;
    public static final org.luckypray.dexkit.query.enums.RetentionPolicyType Runtime = null;
    public static final org.luckypray.dexkit.query.enums.RetentionPolicyType Source = null;
    private final byte value;

    private static final /* synthetic */ org.luckypray.dexkit.query.enums.RetentionPolicyType[] $values() {
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = org.luckypray.dexkit.query.enums.RetentionPolicyType.Source
            org.luckypray.dexkit.query.enums.RetentionPolicyType r1 = org.luckypray.dexkit.query.enums.RetentionPolicyType.Class
            org.luckypray.dexkit.query.enums.RetentionPolicyType r2 = org.luckypray.dexkit.query.enums.RetentionPolicyType.Runtime
            org.luckypray.dexkit.query.enums.RetentionPolicyType[] r0 = new org.luckypray.dexkit.query.enums.RetentionPolicyType[]{r0, r1, r2}
            return r0
    }

    static {
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = new org.luckypray.dexkit.query.enums.RetentionPolicyType
            java.lang.String r1 = "Source"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            org.luckypray.dexkit.query.enums.RetentionPolicyType.Source = r0
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = new org.luckypray.dexkit.query.enums.RetentionPolicyType
            java.lang.String r1 = "Class"
            r2 = 2
            r0.<init>(r1, r3, r2)
            org.luckypray.dexkit.query.enums.RetentionPolicyType.Class = r0
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = new org.luckypray.dexkit.query.enums.RetentionPolicyType
            java.lang.String r1 = "Runtime"
            r3 = 3
            r0.<init>(r1, r2, r3)
            org.luckypray.dexkit.query.enums.RetentionPolicyType.Runtime = r0
            org.luckypray.dexkit.query.enums.RetentionPolicyType[] r0 = $values()
            org.luckypray.dexkit.query.enums.RetentionPolicyType.$VALUES = r0
            return
    }

    RetentionPolicyType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static org.luckypray.dexkit.query.enums.RetentionPolicyType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.query.enums.RetentionPolicyType> r0 = org.luckypray.dexkit.query.enums.RetentionPolicyType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.RetentionPolicyType r1 = (org.luckypray.dexkit.query.enums.RetentionPolicyType) r1
            return r1
    }

    public static org.luckypray.dexkit.query.enums.RetentionPolicyType[] values() {
            org.luckypray.dexkit.query.enums.RetentionPolicyType[] r0 = org.luckypray.dexkit.query.enums.RetentionPolicyType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.RetentionPolicyType[] r0 = (org.luckypray.dexkit.query.enums.RetentionPolicyType[]) r0
            return r0
    }

    public final byte getValue() {
            r0 = this;
            byte r0 = r0.value
            return r0
    }
}
