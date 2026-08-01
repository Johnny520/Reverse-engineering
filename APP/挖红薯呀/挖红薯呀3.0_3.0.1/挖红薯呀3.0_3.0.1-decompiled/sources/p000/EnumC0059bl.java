package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bl */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0059bl {

    /* JADX INFO: renamed from: d */
    public static final EnumC0059bl f538d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0059bl f539e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0059bl f540f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0059bl f541g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC0059bl[] f542h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0059bl enumC0059bl = new EnumC0059bl("DEFAULT", 0);
        f538d = enumC0059bl;
        EnumC0059bl enumC0059bl2 = new EnumC0059bl("LAZY", 1);
        f539e = enumC0059bl2;
        EnumC0059bl enumC0059bl3 = new EnumC0059bl("ATOMIC", 2);
        f540f = enumC0059bl3;
        EnumC0059bl enumC0059bl4 = new EnumC0059bl("UNDISPATCHED", 3);
        f541g = enumC0059bl4;
        f542h = new EnumC0059bl[]{enumC0059bl, enumC0059bl2, enumC0059bl3, enumC0059bl4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0059bl valueOf(String str) {
        return (EnumC0059bl) Enum.valueOf(EnumC0059bl.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0059bl[] values() {
        return (EnumC0059bl[]) f542h.clone();
    }
}
