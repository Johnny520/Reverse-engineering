package p332wb;

import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: wb.iv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4993iv {
    f18013i("全部", "全部联系人"),
    f18014j("好友", "好友"),
    f18015k("群聊", "群聊"),
    f18016l("公众号", "公众号"),
    f18017m("标签", "标签好友");


    /* JADX INFO: renamed from: g */
    public final String f18019g;

    /* JADX INFO: renamed from: h */
    public final String f18020h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC4993iv(String str, String str2) {
        this.f18019g = str;
        this.f18020h = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4993iv valueOf(String str) {
        return (EnumC4993iv) AbstractC2091b.m5160g(EnumC4993iv.class, str);
    }
}
