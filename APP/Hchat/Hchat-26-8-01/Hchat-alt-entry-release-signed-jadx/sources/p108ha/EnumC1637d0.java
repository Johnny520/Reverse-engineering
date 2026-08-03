package p108ha;

import p003a2.C0014a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: ha.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1637d0 {
    TEXT("文字"),
    IMAGE("图片/图文"),
    VIDEO("视频/视文"),
    UNKNOWN("未知");


    /* JADX INFO: renamed from: h */
    public static final C0014a f5368h = new C0014a(17);

    /* JADX INFO: renamed from: g */
    public final String f5374g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC1637d0(String str) {
        this.f5374g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1637d0 valueOf(String str) {
        return (EnumC1637d0) AbstractC2091b.m5160g(EnumC1637d0.class, str);
    }
}
