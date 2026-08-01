package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum FieldUsingType extends java.lang.Enum<org.luckypray.dexkit.result.FieldUsingType> {
    private static final /* synthetic */ org.luckypray.dexkit.result.FieldUsingType[] $VALUES = null;
    public static final org.luckypray.dexkit.result.FieldUsingType Read = null;
    public static final org.luckypray.dexkit.result.FieldUsingType Write = null;

    private static final /* synthetic */ org.luckypray.dexkit.result.FieldUsingType[] $values() {
            org.luckypray.dexkit.result.FieldUsingType r0 = org.luckypray.dexkit.result.FieldUsingType.Read
            org.luckypray.dexkit.result.FieldUsingType r1 = org.luckypray.dexkit.result.FieldUsingType.Write
            org.luckypray.dexkit.result.FieldUsingType[] r0 = new org.luckypray.dexkit.result.FieldUsingType[]{r0, r1}
            return r0
    }

    static {
            org.luckypray.dexkit.result.FieldUsingType r0 = new org.luckypray.dexkit.result.FieldUsingType
            java.lang.String r1 = "Read"
            r2 = 0
            r0.<init>(r1, r2)
            org.luckypray.dexkit.result.FieldUsingType.Read = r0
            org.luckypray.dexkit.result.FieldUsingType r0 = new org.luckypray.dexkit.result.FieldUsingType
            java.lang.String r1 = "Write"
            r2 = 1
            r0.<init>(r1, r2)
            org.luckypray.dexkit.result.FieldUsingType.Write = r0
            org.luckypray.dexkit.result.FieldUsingType[] r0 = $values()
            org.luckypray.dexkit.result.FieldUsingType.$VALUES = r0
            return
    }

    FieldUsingType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.luckypray.dexkit.result.FieldUsingType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.result.FieldUsingType> r0 = org.luckypray.dexkit.result.FieldUsingType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.result.FieldUsingType r1 = (org.luckypray.dexkit.result.FieldUsingType) r1
            return r1
    }

    public static org.luckypray.dexkit.result.FieldUsingType[] values() {
            org.luckypray.dexkit.result.FieldUsingType[] r0 = org.luckypray.dexkit.result.FieldUsingType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.result.FieldUsingType[] r0 = (org.luckypray.dexkit.result.FieldUsingType[]) r0
            return r0
    }

    public final boolean isRead() {
            r1 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = org.luckypray.dexkit.result.FieldUsingType.Read
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public final boolean isWrite() {
            r1 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = org.luckypray.dexkit.result.FieldUsingType.Write
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }
}
