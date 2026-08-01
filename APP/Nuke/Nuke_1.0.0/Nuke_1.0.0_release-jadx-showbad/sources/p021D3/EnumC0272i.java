package p021D3;

import p053J3.C0864y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D3.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0272i {

    /* JADX INFO: renamed from: d */
    public static final EnumC0272i f876d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0272i f877e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0272i f878f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0272i[] f879g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0272i enumC0272i = new EnumC0272i("MOBILE_QQ", 0);
        f876d = enumC0272i;
        EnumC0272i enumC0272i2 = new EnumC0272i(C0864y.WECHAT, 1);
        f877e = enumC0272i2;
        EnumC0272i enumC0272i3 = new EnumC0272i(C0864y.TIKTOK, 2);
        f878f = enumC0272i3;
        f879g = new EnumC0272i[]{enumC0272i, enumC0272i2, enumC0272i3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0272i valueOf(String str) {
        return (EnumC0272i) Enum.valueOf(EnumC0272i.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0272i[] values() {
        return (EnumC0272i[]) f879g.clone();
    }
}
