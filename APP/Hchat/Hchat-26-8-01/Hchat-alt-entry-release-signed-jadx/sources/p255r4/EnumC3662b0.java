package p255r4;

import p332wb.AbstractC4855en;
import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: r4.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3662b0 implements InterfaceC6097k {
    f11880j("header_item", 0),
    f11881k("string_id_item", 1),
    f11882l("type_id_item", 2),
    f11883m("proto_id_item", 3),
    f11884n("field_id_item", 4),
    f11885o("method_id_item", 5),
    f11886p("class_def_item", 6),
    f11887q("call_site_id_item", 7),
    f11888r("method_handle_item", 8),
    f11889s("map_list", 4096),
    f11890t("type_list", 4097),
    f11891u("annotation_set_ref_list", 4098),
    f11892v("annotation_set_item", 4099),
    f11893w("class_data_item", 8192),
    f11894x("code_item", 8193),
    f11895y("string_data_item", 8194),
    f11896z("debug_info_item", 8195),
    f11874A("annotation_item", 8196),
    f11875B("encoded_array_item", 8197),
    f11876C("annotations_directory_item", 8198),
    f11877D("map_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("type_item", -1),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("exception_handler_item", -1),
    f11878E("annotation_set_ref_item", -1);


    /* JADX INFO: renamed from: g */
    public final int f11897g;

    /* JADX INFO: renamed from: h */
    public final String f11898h;

    /* JADX INFO: renamed from: i */
    public final String f11899i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC3662b0(String str, int i9) {
        this.f11897g = i9;
        this.f11898h = str;
        this.f11899i = (str.endsWith("_item") ? AbstractC4855en.m9262f(5, 0, str) : str).replace('_', ' ');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return this.f11899i;
    }
}
