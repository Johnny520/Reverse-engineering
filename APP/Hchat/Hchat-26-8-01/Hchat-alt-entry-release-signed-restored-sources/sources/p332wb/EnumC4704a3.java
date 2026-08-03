package p332wb;

import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: wb.a3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4704a3 {
    IMAGE("图片"),
    TEXT("文字"),
    VOICE("语音"),
    VIDEO("视频"),
    OTHER("其他"),
    ALL("全部");


    /* JADX INFO: renamed from: g */
    public final String f15709g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC4704a3(String str) {
        this.f15709g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4704a3 valueOf(String str) {
        return (EnumC4704a3) AbstractC2091b.m5160g(EnumC4704a3.class, str);
    }
}
