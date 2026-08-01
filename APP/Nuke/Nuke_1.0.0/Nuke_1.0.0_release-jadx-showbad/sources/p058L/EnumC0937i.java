package p058L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L.i */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0937i {

    /* JADX INFO: renamed from: d */
    public static final EnumC0937i f2936d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0937i f2937e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0937i f2938f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0937i[] f2939g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0937i enumC0937i = new EnumC0937i("CROSSED", 0);
        f2936d = enumC0937i;
        EnumC0937i enumC0937i2 = new EnumC0937i("NOT_CROSSED", 1);
        f2937e = enumC0937i2;
        EnumC0937i enumC0937i3 = new EnumC0937i("COLLAPSED", 2);
        f2938f = enumC0937i3;
        f2939g = new EnumC0937i[]{enumC0937i, enumC0937i2, enumC0937i3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0937i valueOf(String str) {
        return (EnumC0937i) Enum.valueOf(EnumC0937i.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0937i[] values() {
        return (EnumC0937i[]) f2939g.clone();
    }
}
