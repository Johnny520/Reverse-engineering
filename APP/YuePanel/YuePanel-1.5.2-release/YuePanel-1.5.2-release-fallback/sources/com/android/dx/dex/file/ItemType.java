package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public enum ItemType extends java.lang.Enum<com.android.dx.dex.file.ItemType> implements com.android.dx.util.ToHuman {
    private static final /* synthetic */ com.android.dx.dex.file.ItemType[] $VALUES = null;
    public static final com.android.dx.dex.file.ItemType TYPE_ANNOTATIONS_DIRECTORY_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_ANNOTATION_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_ANNOTATION_SET_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_ANNOTATION_SET_REF_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_ANNOTATION_SET_REF_LIST = null;
    public static final com.android.dx.dex.file.ItemType TYPE_CALL_SITE_ID_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_CLASS_DATA_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_CLASS_DEF_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_CODE_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_DEBUG_INFO_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_ENCODED_ARRAY_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_EXCEPTION_HANDLER_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_FIELD_ID_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_HEADER_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_MAP_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_MAP_LIST = null;
    public static final com.android.dx.dex.file.ItemType TYPE_METHOD_HANDLE_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_METHOD_ID_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_PROTO_ID_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_STRING_DATA_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_STRING_ID_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_TYPE_ID_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_TYPE_ITEM = null;
    public static final com.android.dx.dex.file.ItemType TYPE_TYPE_LIST = null;
    private final java.lang.String humanName;
    private final int mapValue;
    private final java.lang.String typeName;

    static {
            com.android.dx.dex.file.ItemType r1 = new com.android.dx.dex.file.ItemType
            r0 = r1
            r2 = 0
            java.lang.String r3 = "header_item"
            java.lang.String r4 = "TYPE_HEADER_ITEM"
            r1.<init>(r4, r2, r2, r3)
            com.android.dx.dex.file.ItemType.TYPE_HEADER_ITEM = r1
            com.android.dx.dex.file.ItemType r2 = new com.android.dx.dex.file.ItemType
            r1 = r2
            r3 = 1
            java.lang.String r4 = "string_id_item"
            java.lang.String r5 = "TYPE_STRING_ID_ITEM"
            r2.<init>(r5, r3, r3, r4)
            com.android.dx.dex.file.ItemType.TYPE_STRING_ID_ITEM = r2
            com.android.dx.dex.file.ItemType r3 = new com.android.dx.dex.file.ItemType
            r2 = r3
            r4 = 2
            java.lang.String r5 = "type_id_item"
            java.lang.String r6 = "TYPE_TYPE_ID_ITEM"
            r3.<init>(r6, r4, r4, r5)
            com.android.dx.dex.file.ItemType.TYPE_TYPE_ID_ITEM = r3
            com.android.dx.dex.file.ItemType r4 = new com.android.dx.dex.file.ItemType
            r3 = r4
            r5 = 3
            java.lang.String r6 = "proto_id_item"
            java.lang.String r7 = "TYPE_PROTO_ID_ITEM"
            r4.<init>(r7, r5, r5, r6)
            com.android.dx.dex.file.ItemType.TYPE_PROTO_ID_ITEM = r4
            com.android.dx.dex.file.ItemType r5 = new com.android.dx.dex.file.ItemType
            r4 = r5
            r6 = 4
            java.lang.String r7 = "field_id_item"
            java.lang.String r8 = "TYPE_FIELD_ID_ITEM"
            r5.<init>(r8, r6, r6, r7)
            com.android.dx.dex.file.ItemType.TYPE_FIELD_ID_ITEM = r5
            com.android.dx.dex.file.ItemType r6 = new com.android.dx.dex.file.ItemType
            r5 = r6
            r7 = 5
            java.lang.String r8 = "method_id_item"
            java.lang.String r9 = "TYPE_METHOD_ID_ITEM"
            r6.<init>(r9, r7, r7, r8)
            com.android.dx.dex.file.ItemType.TYPE_METHOD_ID_ITEM = r6
            com.android.dx.dex.file.ItemType r7 = new com.android.dx.dex.file.ItemType
            r6 = r7
            r8 = 6
            java.lang.String r9 = "class_def_item"
            java.lang.String r10 = "TYPE_CLASS_DEF_ITEM"
            r7.<init>(r10, r8, r8, r9)
            com.android.dx.dex.file.ItemType.TYPE_CLASS_DEF_ITEM = r7
            com.android.dx.dex.file.ItemType r8 = new com.android.dx.dex.file.ItemType
            r7 = r8
            r9 = 7
            java.lang.String r10 = "call_site_id_item"
            java.lang.String r11 = "TYPE_CALL_SITE_ID_ITEM"
            r8.<init>(r11, r9, r9, r10)
            com.android.dx.dex.file.ItemType.TYPE_CALL_SITE_ID_ITEM = r8
            com.android.dx.dex.file.ItemType r9 = new com.android.dx.dex.file.ItemType
            r8 = r9
            r10 = 8
            java.lang.String r11 = "method_handle_item"
            java.lang.String r12 = "TYPE_METHOD_HANDLE_ITEM"
            r9.<init>(r12, r10, r10, r11)
            com.android.dx.dex.file.ItemType.TYPE_METHOD_HANDLE_ITEM = r9
            com.android.dx.dex.file.ItemType r10 = new com.android.dx.dex.file.ItemType
            r9 = r10
            r11 = 4096(0x1000, float:5.74E-42)
            java.lang.String r12 = "map_list"
            java.lang.String r13 = "TYPE_MAP_LIST"
            r14 = 9
            r10.<init>(r13, r14, r11, r12)
            com.android.dx.dex.file.ItemType.TYPE_MAP_LIST = r10
            com.android.dx.dex.file.ItemType r11 = new com.android.dx.dex.file.ItemType
            r10 = r11
            r12 = 4097(0x1001, float:5.741E-42)
            java.lang.String r13 = "type_list"
            java.lang.String r14 = "TYPE_TYPE_LIST"
            r15 = 10
            r11.<init>(r14, r15, r12, r13)
            com.android.dx.dex.file.ItemType.TYPE_TYPE_LIST = r11
            com.android.dx.dex.file.ItemType r12 = new com.android.dx.dex.file.ItemType
            r11 = r12
            r13 = 4098(0x1002, float:5.743E-42)
            java.lang.String r14 = "annotation_set_ref_list"
            java.lang.String r15 = "TYPE_ANNOTATION_SET_REF_LIST"
            r24 = r0
            r0 = 11
            r12.<init>(r15, r0, r13, r14)
            com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_SET_REF_LIST = r12
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r12 = r0
            r13 = 4099(0x1003, float:5.744E-42)
            java.lang.String r14 = "annotation_set_item"
            java.lang.String r15 = "TYPE_ANNOTATION_SET_ITEM"
            r25 = r1
            r1 = 12
            r0.<init>(r15, r1, r13, r14)
            com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_SET_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r13 = r0
            r1 = 8192(0x2000, float:1.148E-41)
            java.lang.String r14 = "class_data_item"
            java.lang.String r15 = "TYPE_CLASS_DATA_ITEM"
            r26 = r2
            r2 = 13
            r0.<init>(r15, r2, r1, r14)
            com.android.dx.dex.file.ItemType.TYPE_CLASS_DATA_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r14 = r0
            r1 = 8193(0x2001, float:1.1481E-41)
            java.lang.String r2 = "code_item"
            java.lang.String r15 = "TYPE_CODE_ITEM"
            r27 = r3
            r3 = 14
            r0.<init>(r15, r3, r1, r2)
            com.android.dx.dex.file.ItemType.TYPE_CODE_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r15 = r0
            r1 = 8194(0x2002, float:1.1482E-41)
            java.lang.String r2 = "string_data_item"
            java.lang.String r3 = "TYPE_STRING_DATA_ITEM"
            r28 = r4
            r4 = 15
            r0.<init>(r3, r4, r1, r2)
            com.android.dx.dex.file.ItemType.TYPE_STRING_DATA_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r16 = r0
            r1 = 8195(0x2003, float:1.1484E-41)
            java.lang.String r2 = "debug_info_item"
            java.lang.String r3 = "TYPE_DEBUG_INFO_ITEM"
            r4 = 16
            r0.<init>(r3, r4, r1, r2)
            com.android.dx.dex.file.ItemType.TYPE_DEBUG_INFO_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r17 = r0
            r1 = 8196(0x2004, float:1.1485E-41)
            java.lang.String r2 = "annotation_item"
            java.lang.String r3 = "TYPE_ANNOTATION_ITEM"
            r4 = 17
            r0.<init>(r3, r4, r1, r2)
            com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r18 = r0
            r1 = 8197(0x2005, float:1.1486E-41)
            java.lang.String r2 = "encoded_array_item"
            java.lang.String r3 = "TYPE_ENCODED_ARRAY_ITEM"
            r4 = 18
            r0.<init>(r3, r4, r1, r2)
            com.android.dx.dex.file.ItemType.TYPE_ENCODED_ARRAY_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r19 = r0
            r1 = 8198(0x2006, float:1.1488E-41)
            java.lang.String r2 = "annotations_directory_item"
            java.lang.String r3 = "TYPE_ANNOTATIONS_DIRECTORY_ITEM"
            r4 = 19
            r0.<init>(r3, r4, r1, r2)
            com.android.dx.dex.file.ItemType.TYPE_ANNOTATIONS_DIRECTORY_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r20 = r0
            java.lang.String r1 = "map_item"
            java.lang.String r2 = "TYPE_MAP_ITEM"
            r3 = 20
            r4 = -1
            r0.<init>(r2, r3, r4, r1)
            com.android.dx.dex.file.ItemType.TYPE_MAP_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r21 = r0
            r1 = 21
            java.lang.String r2 = "type_item"
            java.lang.String r3 = "TYPE_TYPE_ITEM"
            r0.<init>(r3, r1, r4, r2)
            com.android.dx.dex.file.ItemType.TYPE_TYPE_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r22 = r0
            r1 = 22
            java.lang.String r2 = "exception_handler_item"
            java.lang.String r3 = "TYPE_EXCEPTION_HANDLER_ITEM"
            r0.<init>(r3, r1, r4, r2)
            com.android.dx.dex.file.ItemType.TYPE_EXCEPTION_HANDLER_ITEM = r0
            com.android.dx.dex.file.ItemType r0 = new com.android.dx.dex.file.ItemType
            r23 = r0
            r1 = 23
            java.lang.String r2 = "annotation_set_ref_item"
            java.lang.String r3 = "TYPE_ANNOTATION_SET_REF_ITEM"
            r0.<init>(r3, r1, r4, r2)
            com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_SET_REF_ITEM = r0
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            com.android.dx.dex.file.ItemType[] r0 = new com.android.dx.dex.file.ItemType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            com.android.dx.dex.file.ItemType.$VALUES = r0
            return
    }

    ItemType(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mapValue = r3
            r0.typeName = r4
            java.lang.String r1 = "_item"
            boolean r1 = r4.endsWith(r1)
            if (r1 == 0) goto L1a
            int r1 = r4.length()
            int r1 = r1 + (-5)
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r1)
        L1a:
            r1 = 95
            r2 = 32
            java.lang.String r1 = r4.replace(r1, r2)
            r0.humanName = r1
            return
    }

    public static com.android.dx.dex.file.ItemType valueOf(java.lang.String r1) {
            java.lang.Class<com.android.dx.dex.file.ItemType> r0 = com.android.dx.dex.file.ItemType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.android.dx.dex.file.ItemType r1 = (com.android.dx.dex.file.ItemType) r1
            return r1
    }

    public static com.android.dx.dex.file.ItemType[] values() {
            com.android.dx.dex.file.ItemType[] r0 = com.android.dx.dex.file.ItemType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.android.dx.dex.file.ItemType[] r0 = (com.android.dx.dex.file.ItemType[]) r0
            return r0
    }

    public int getMapValue() {
            r1 = this;
            int r0 = r1.mapValue
            return r0
    }

    public java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = r1.humanName
            return r0
    }
}
