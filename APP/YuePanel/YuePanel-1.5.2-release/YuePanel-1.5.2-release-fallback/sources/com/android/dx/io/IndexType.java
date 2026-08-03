package com.android.dx.io;

/* JADX INFO: loaded from: classes.dex */
public enum IndexType extends java.lang.Enum<com.android.dx.io.IndexType> {
    private static final /* synthetic */ com.android.dx.io.IndexType[] $VALUES = null;
    public static final com.android.dx.io.IndexType CALL_SITE_REF = null;
    public static final com.android.dx.io.IndexType FIELD_OFFSET = null;
    public static final com.android.dx.io.IndexType FIELD_REF = null;
    public static final com.android.dx.io.IndexType INLINE_METHOD = null;
    public static final com.android.dx.io.IndexType METHOD_AND_PROTO_REF = null;
    public static final com.android.dx.io.IndexType METHOD_HANDLE_REF = null;
    public static final com.android.dx.io.IndexType METHOD_REF = null;
    public static final com.android.dx.io.IndexType NONE = null;
    public static final com.android.dx.io.IndexType PROTO_REF = null;
    public static final com.android.dx.io.IndexType STRING_REF = null;
    public static final com.android.dx.io.IndexType TYPE_REF = null;
    public static final com.android.dx.io.IndexType UNKNOWN = null;
    public static final com.android.dx.io.IndexType VARIES = null;
    public static final com.android.dx.io.IndexType VTABLE_OFFSET = null;

    static {
            com.android.dx.io.IndexType r0 = new com.android.dx.io.IndexType
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2)
            com.android.dx.io.IndexType.UNKNOWN = r0
            com.android.dx.io.IndexType r1 = new com.android.dx.io.IndexType
            java.lang.String r2 = "NONE"
            r3 = 1
            r1.<init>(r2, r3)
            com.android.dx.io.IndexType.NONE = r1
            com.android.dx.io.IndexType r2 = new com.android.dx.io.IndexType
            java.lang.String r3 = "VARIES"
            r4 = 2
            r2.<init>(r3, r4)
            com.android.dx.io.IndexType.VARIES = r2
            com.android.dx.io.IndexType r3 = new com.android.dx.io.IndexType
            java.lang.String r4 = "TYPE_REF"
            r5 = 3
            r3.<init>(r4, r5)
            com.android.dx.io.IndexType.TYPE_REF = r3
            com.android.dx.io.IndexType r4 = new com.android.dx.io.IndexType
            java.lang.String r5 = "STRING_REF"
            r6 = 4
            r4.<init>(r5, r6)
            com.android.dx.io.IndexType.STRING_REF = r4
            com.android.dx.io.IndexType r5 = new com.android.dx.io.IndexType
            java.lang.String r6 = "METHOD_REF"
            r7 = 5
            r5.<init>(r6, r7)
            com.android.dx.io.IndexType.METHOD_REF = r5
            com.android.dx.io.IndexType r6 = new com.android.dx.io.IndexType
            java.lang.String r7 = "FIELD_REF"
            r8 = 6
            r6.<init>(r7, r8)
            com.android.dx.io.IndexType.FIELD_REF = r6
            com.android.dx.io.IndexType r7 = new com.android.dx.io.IndexType
            java.lang.String r8 = "METHOD_AND_PROTO_REF"
            r9 = 7
            r7.<init>(r8, r9)
            com.android.dx.io.IndexType.METHOD_AND_PROTO_REF = r7
            com.android.dx.io.IndexType r8 = new com.android.dx.io.IndexType
            java.lang.String r9 = "CALL_SITE_REF"
            r10 = 8
            r8.<init>(r9, r10)
            com.android.dx.io.IndexType.CALL_SITE_REF = r8
            com.android.dx.io.IndexType r9 = new com.android.dx.io.IndexType
            java.lang.String r10 = "INLINE_METHOD"
            r11 = 9
            r9.<init>(r10, r11)
            com.android.dx.io.IndexType.INLINE_METHOD = r9
            com.android.dx.io.IndexType r10 = new com.android.dx.io.IndexType
            java.lang.String r11 = "VTABLE_OFFSET"
            r12 = 10
            r10.<init>(r11, r12)
            com.android.dx.io.IndexType.VTABLE_OFFSET = r10
            com.android.dx.io.IndexType r11 = new com.android.dx.io.IndexType
            java.lang.String r12 = "FIELD_OFFSET"
            r13 = 11
            r11.<init>(r12, r13)
            com.android.dx.io.IndexType.FIELD_OFFSET = r11
            com.android.dx.io.IndexType r12 = new com.android.dx.io.IndexType
            java.lang.String r13 = "METHOD_HANDLE_REF"
            r14 = 12
            r12.<init>(r13, r14)
            com.android.dx.io.IndexType.METHOD_HANDLE_REF = r12
            com.android.dx.io.IndexType r13 = new com.android.dx.io.IndexType
            java.lang.String r14 = "PROTO_REF"
            r15 = 13
            r13.<init>(r14, r15)
            com.android.dx.io.IndexType.PROTO_REF = r13
            com.android.dx.io.IndexType[] r0 = new com.android.dx.io.IndexType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            com.android.dx.io.IndexType.$VALUES = r0
            return
    }

    IndexType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.android.dx.io.IndexType valueOf(java.lang.String r1) {
            java.lang.Class<com.android.dx.io.IndexType> r0 = com.android.dx.io.IndexType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.android.dx.io.IndexType r1 = (com.android.dx.io.IndexType) r1
            return r1
    }

    public static com.android.dx.io.IndexType[] values() {
            com.android.dx.io.IndexType[] r0 = com.android.dx.io.IndexType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.android.dx.io.IndexType[] r0 = (com.android.dx.io.IndexType[]) r0
            return r0
    }
}
