package p147d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d1.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1960j {

    /* JADX INFO: renamed from: d */
    public static final EnumC1960j f6636d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1960j f6637e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC1960j[] f6638f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1960j enumC1960j = new EnumC1960j("Ltr", 0);
        f6636d = enumC1960j;
        EnumC1960j enumC1960j2 = new EnumC1960j("Rtl", 1);
        f6637e = enumC1960j2;
        f6638f = new EnumC1960j[]{enumC1960j, enumC1960j2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1960j valueOf(String str) {
        return (EnumC1960j) Enum.valueOf(EnumC1960j.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1960j[] values() {
        return (EnumC1960j[]) f6638f.clone();
    }
}
