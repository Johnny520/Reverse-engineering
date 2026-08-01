package com.android.dx.dex.file;

import androidx.activity.AbstractC0053;
import com.android.dx.util.ToHuman;
import top.linl.dexparser.bean.DexMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum ItemType implements ToHuman {
    TYPE_HEADER_ITEM(0, "header_item"),
    TYPE_STRING_ID_ITEM(1, "string_id_item"),
    TYPE_TYPE_ID_ITEM(2, "type_id_item"),
    TYPE_PROTO_ID_ITEM(3, "proto_id_item"),
    TYPE_FIELD_ID_ITEM(4, "field_id_item"),
    TYPE_METHOD_ID_ITEM(5, "method_id_item"),
    TYPE_CLASS_DEF_ITEM(6, "class_def_item"),
    TYPE_CALL_SITE_ID_ITEM(7, "call_site_id_item"),
    TYPE_METHOD_HANDLE_ITEM(8, "method_handle_item"),
    TYPE_MAP_LIST(4096, "map_list"),
    TYPE_TYPE_LIST(DexMap.TYPE_TYPE_LIST, "type_list"),
    TYPE_ANNOTATION_SET_REF_LIST(DexMap.TYPE_ANNOTATION_SET_REF_LIST, "annotation_set_ref_list"),
    TYPE_ANNOTATION_SET_ITEM(DexMap.TYPE_ANNOTATION_SET_ITEM, "annotation_set_item"),
    TYPE_CLASS_DATA_ITEM(8192, "class_data_item"),
    TYPE_CODE_ITEM(DexMap.TYPE_CODE_ITEM, "code_item"),
    TYPE_STRING_DATA_ITEM(DexMap.TYPE_STRING_DATA_ITEM, "string_data_item"),
    TYPE_DEBUG_INFO_ITEM(DexMap.TYPE_DEBUG_INFO_ITEM, "debug_info_item"),
    TYPE_ANNOTATION_ITEM(DexMap.TYPE_ANNOTATION_ITEM, "annotation_item"),
    TYPE_ENCODED_ARRAY_ITEM(DexMap.TYPE_ENCODED_ARRAY_ITEM, "encoded_array_item"),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(DexMap.TYPE_ANNOTATIONS_DIRECTORY_ITEM, "annotations_directory_item"),
    TYPE_MAP_ITEM(-1, "map_item"),
    TYPE_TYPE_ITEM(-1, "type_item"),
    TYPE_EXCEPTION_HANDLER_ITEM(-1, "exception_handler_item"),
    TYPE_ANNOTATION_SET_REF_ITEM(-1, "annotation_set_ref_item");

    private final String humanName;
    private final int mapValue;
    private final String typeName;

    ItemType(int i, String str) {
        this.mapValue = i;
        this.typeName = str;
        this.humanName = (str.endsWith("_item") ? AbstractC0053.m161(5, 0, str) : str).replace('_', ' ');
    }

    public int getMapValue() {
        return this.mapValue;
    }

    public String getTypeName() {
        return this.typeName;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return this.humanName;
    }
}
