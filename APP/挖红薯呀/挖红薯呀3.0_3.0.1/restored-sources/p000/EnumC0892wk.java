package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wk */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0892wk {

    /* JADX INFO: renamed from: d */
    public static final EnumC0892wk f7138d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0892wk f7139e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0892wk f7140f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0892wk f7141g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0892wk f7142h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC0892wk[] f7143i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0892wk enumC0892wk = new EnumC0892wk("CPU_ACQUIRED", 0);
        f7138d = enumC0892wk;
        EnumC0892wk enumC0892wk2 = new EnumC0892wk("BLOCKING", 1);
        f7139e = enumC0892wk2;
        EnumC0892wk enumC0892wk3 = new EnumC0892wk("PARKING", 2);
        f7140f = enumC0892wk3;
        EnumC0892wk enumC0892wk4 = new EnumC0892wk("DORMANT", 3);
        f7141g = enumC0892wk4;
        EnumC0892wk enumC0892wk5 = new EnumC0892wk("TERMINATED", 4);
        f7142h = enumC0892wk5;
        f7143i = new EnumC0892wk[]{enumC0892wk, enumC0892wk2, enumC0892wk3, enumC0892wk4, enumC0892wk5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0892wk valueOf(String str) {
        return (EnumC0892wk) Enum.valueOf(EnumC0892wk.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0892wk[] values() {
        return (EnumC0892wk[]) f7143i.clone();
    }
}
