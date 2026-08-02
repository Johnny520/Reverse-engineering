package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public enum g21 implements t23 {
    TYPE_HEADER_ITEM("header_item", 0),
    TYPE_STRING_ID_ITEM("string_id_item", 1),
    TYPE_TYPE_ID_ITEM("type_id_item", 2),
    TYPE_PROTO_ID_ITEM("proto_id_item", 3),
    TYPE_FIELD_ID_ITEM("field_id_item", 4),
    TYPE_METHOD_ID_ITEM("method_id_item", 5),
    TYPE_CLASS_DEF_ITEM("class_def_item", 6),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_CALL_SITE_ID_ITEM("call_site_id_item", 7),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_METHOD_HANDLE_ITEM("method_handle_item", 8),
    TYPE_MAP_LIST("map_list", 4096),
    TYPE_TYPE_LIST("type_list", 4097),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATION_SET_REF_LIST("annotation_set_ref_list", 4098),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATION_SET_ITEM("annotation_set_item", 4099),
    TYPE_CLASS_DATA_ITEM("class_data_item", 8192),
    TYPE_CODE_ITEM("code_item", 8193),
    TYPE_STRING_DATA_ITEM("string_data_item", 8194),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_DEBUG_INFO_ITEM("debug_info_item", 8195),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATION_ITEM("annotation_item", 8196),
    TYPE_ENCODED_ARRAY_ITEM("encoded_array_item", 8197),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM("annotations_directory_item", 8198),
    TYPE_MAP_ITEM("map_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_TYPE_ITEM("type_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_EXCEPTION_HANDLER_ITEM("exception_handler_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_ANNOTATION_SET_REF_ITEM("annotation_set_ref_item", -1);


    /* JADX INFO: renamed from: h */
    public final int f3282h;

    /* JADX INFO: renamed from: i */
    public final String f3283i;

    /* JADX INFO: renamed from: j */
    public final String f3284j;

    g21(String str, int i) {
        this.f3282h = i;
        this.f3283i = str;
        this.f3284j = (str.endsWith("_item") ? str.substring(0, str.length() - 5) : str).replace('_', ' ');
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return this.f3284j;
    }
}
