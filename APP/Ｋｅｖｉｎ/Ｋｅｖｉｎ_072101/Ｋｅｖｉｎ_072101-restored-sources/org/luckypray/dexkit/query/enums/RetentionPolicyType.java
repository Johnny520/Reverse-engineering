package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: RetentionPolicyType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m115d2 = {"Lorg/luckypray/dexkit/query/enums/RetentionPolicyType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Source", "Class", "Runtime", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.RetentionPolicyType r0 = (org.luckypray.dexkit.query.enums.RetentionPolicyType) r0
            return r0
    }

    public static org.luckypray.dexkit.query.enums.RetentionPolicyType[] values() {
            org.luckypray.dexkit.query.enums.RetentionPolicyType[] r0 = org.luckypray.dexkit.query.enums.RetentionPolicyType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.RetentionPolicyType[] r0 = (org.luckypray.dexkit.query.enums.RetentionPolicyType[]) r0
            return r0
    }

    public final byte getValue() {
            r1 = this;
            byte r0 = r1.value
            return r0
    }
}
