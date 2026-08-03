package p108ha;

import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ha.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1660t {
    TEXT("文字"),
    IMAGE("图片"),
    VIDEO("视频"),
    LIVE_PHOTO("实况"),
    UNKNOWN("未知");


    /* JADX INFO: renamed from: g */
    public final String f5467g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC1660t(String str) {
        this.f5467g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1660t valueOf(String str) {
        return (EnumC1660t) AbstractC2091b.m5160g(EnumC1660t.class, str);
    }
}
