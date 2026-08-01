package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = this;
            byte r0 = r0.value
            return r0
    }
}
