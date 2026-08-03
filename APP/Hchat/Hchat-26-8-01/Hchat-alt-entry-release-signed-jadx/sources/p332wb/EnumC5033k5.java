package p332wb;

import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: wb.k5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5033k5 {
    f18305i("好友", "好友"),
    f18306j("群聊", "群聊"),
    f18307k("公众号", "公众号"),
    f18308l("标签", "标签好友"),
    f18309m("全部", "全部");


    /* JADX INFO: renamed from: g */
    public final String f18311g;

    /* JADX INFO: renamed from: h */
    public final String f18312h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC5033k5(String str, String str2) {
        this.f18311g = str;
        this.f18312h = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5033k5 valueOf(String str) {
        return (EnumC5033k5) AbstractC2091b.m5160g(EnumC5033k5.class, str);
    }
}
