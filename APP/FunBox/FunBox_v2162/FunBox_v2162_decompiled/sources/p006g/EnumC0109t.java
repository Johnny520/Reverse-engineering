package p006g;

import p013n.InterfaceC0209k;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: g.t */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0109t implements InterfaceC0209k {

    /* JADX INFO: renamed from: d */
    public static final EnumC0109t f408d = new EnumC0109t("TYPE_HEADER_ITEM", 0, 0, "header_item");

    /* JADX INFO: renamed from: e */
    public static final EnumC0109t f409e = new EnumC0109t("TYPE_STRING_ID_ITEM", 1, 1, "string_id_item");

    /* JADX INFO: renamed from: f */
    public static final EnumC0109t f410f = new EnumC0109t("TYPE_TYPE_ID_ITEM", 2, 2, "type_id_item");

    /* JADX INFO: renamed from: g */
    public static final EnumC0109t f411g = new EnumC0109t("TYPE_PROTO_ID_ITEM", 3, 3, "proto_id_item");

    /* JADX INFO: renamed from: h */
    public static final EnumC0109t f412h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0109t f413i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0109t f414j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0109t f415k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0109t f416l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0109t f417m;

    /* JADX INFO: renamed from: n */
    public static final EnumC0109t f418n;

    /* JADX INFO: renamed from: o */
    public static final EnumC0109t f419o;

    /* JADX INFO: renamed from: p */
    public static final EnumC0109t f420p;

    /* JADX INFO: renamed from: q */
    public static final EnumC0109t f421q;

    /* JADX INFO: renamed from: r */
    public static final EnumC0109t f422r;

    /* JADX INFO: renamed from: a */
    private final int f423a;

    /* JADX INFO: renamed from: b */
    private final String f424b;

    /* JADX INFO: renamed from: c */
    private final String f425c;

    static {
        new EnumC0109t("TYPE_FIELD_ID_ITEM", 4, 4, "field_id_item");
        f412h = new EnumC0109t("TYPE_METHOD_ID_ITEM", 5, 5, "method_id_item");
        f413i = new EnumC0109t("TYPE_CLASS_DEF_ITEM", 6, 6, "class_def_item");
        new EnumC0109t("TYPE_CALL_SITE_ID_ITEM", 7, 7, "call_site_id_item");
        new EnumC0109t("TYPE_METHOD_HANDLE_ITEM", 8, 8, "method_handle_item");
        f414j = new EnumC0109t("TYPE_MAP_LIST", 9, 4096, "map_list");
        f415k = new EnumC0109t("TYPE_TYPE_LIST", 10, 4097, "type_list");
        new EnumC0109t("TYPE_ANNOTATION_SET_REF_LIST", 11, 4098, "annotation_set_ref_list");
        new EnumC0109t("TYPE_ANNOTATION_SET_ITEM", 12, 4099, "annotation_set_item");
        f416l = new EnumC0109t("TYPE_CLASS_DATA_ITEM", 13, 8192, "class_data_item");
        f417m = new EnumC0109t("TYPE_CODE_ITEM", 14, 8193, "code_item");
        f418n = new EnumC0109t("TYPE_STRING_DATA_ITEM", 15, 8194, "string_data_item");
        f419o = new EnumC0109t("TYPE_DEBUG_INFO_ITEM", 16, 8195, "debug_info_item");
        new EnumC0109t("TYPE_ANNOTATION_ITEM", 17, 8196, "annotation_item");
        f420p = new EnumC0109t("TYPE_ENCODED_ARRAY_ITEM", 18, 8197, "encoded_array_item");
        f421q = new EnumC0109t("TYPE_ANNOTATIONS_DIRECTORY_ITEM", 19, 8198, "annotations_directory_item");
        f422r = new EnumC0109t("TYPE_MAP_ITEM", 20, -1, "map_item");
        new EnumC0109t("TYPE_TYPE_ITEM", 21, -1, "type_item");
        new EnumC0109t("TYPE_EXCEPTION_HANDLER_ITEM", 22, -1, "exception_handler_item");
        new EnumC0109t("TYPE_ANNOTATION_SET_REF_ITEM", 23, -1, "annotation_set_ref_item");
    }

    private EnumC0109t(String str, int i2, int i3, String str2) {
        this.f423a = i3;
        this.f424b = str2;
        this.f425c = (str2.endsWith("_item") ? str2.substring(0, str2.length() - 5) : str2).replace('_', ' ');
    }

    @Override // p013n.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        return this.f425c;
    }

    /* JADX INFO: renamed from: b */
    public final int m321b() {
        return this.f423a;
    }

    /* JADX INFO: renamed from: e */
    public final String m322e() {
        return this.f424b;
    }
}
