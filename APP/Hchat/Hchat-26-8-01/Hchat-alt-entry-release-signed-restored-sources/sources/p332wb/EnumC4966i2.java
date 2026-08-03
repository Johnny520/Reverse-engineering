package p332wb;

import p136j8.AbstractC2091b;
import p385zf.C6143b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.i2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4966i2 {

    /* JADX INFO: renamed from: h */
    public static final EnumC4966i2 f17757h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4966i2 f17758i;

    /* JADX INFO: renamed from: j */
    public static final EnumC4966i2 f17759j;

    /* JADX INFO: renamed from: k */
    public static final EnumC4966i2 f17760k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC4966i2[] f17761l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ C6143b f17762m;

    /* JADX INFO: renamed from: g */
    public final String f17763g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4966i2 enumC4966i2 = new EnumC4966i2("OFFICIAL", 0, "公众号");
        f17757h = enumC4966i2;
        EnumC4966i2 enumC4966i22 = new EnumC4966i2("GROUP", 1, "群聊");
        f17758i = enumC4966i22;
        EnumC4966i2 enumC4966i23 = new EnumC4966i2("FRIEND", 2, "好友");
        f17759j = enumC4966i23;
        EnumC4966i2 enumC4966i24 = new EnumC4966i2("ALL", 3, "全部");
        f17760k = enumC4966i24;
        EnumC4966i2[] enumC4966i2Arr = {enumC4966i2, enumC4966i22, enumC4966i23, enumC4966i24};
        f17761l = enumC4966i2Arr;
        f17762m = new C6143b(enumC4966i2Arr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC4966i2(String str, int i9, String str2) {
        this.f17763g = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4966i2 valueOf(String str) {
        return (EnumC4966i2) AbstractC2091b.m5160g(EnumC4966i2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4966i2[] values() {
        return (EnumC4966i2[]) f17761l.clone();
    }
}
