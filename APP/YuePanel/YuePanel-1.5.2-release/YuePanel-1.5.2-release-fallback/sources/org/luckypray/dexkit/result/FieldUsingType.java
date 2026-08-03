package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/luckypray/dexkit/result/FieldUsingType;", "", "(Ljava/lang/String;I)V", "isRead", "", "isWrite", "Read", "Write", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isWrite() {
            r1 = this;
            org.luckypray.dexkit.result.FieldUsingType r0 = org.luckypray.dexkit.result.FieldUsingType.Write
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
