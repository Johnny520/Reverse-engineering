package p078P1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: P1.j */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1148j {

    /* JADX INFO: renamed from: d */
    public static final EnumC1148j f3786d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC1148j[] f3787e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1148j EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1148j enumC1148j = new EnumC1148j("SRGB", 0);
        EnumC1148j enumC1148j2 = new EnumC1148j("DISPLAY_P3", 1);
        f3786d = enumC1148j2;
        f3787e = new EnumC1148j[]{enumC1148j, enumC1148j2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1148j valueOf(String str) {
        return (EnumC1148j) Enum.valueOf(EnumC1148j.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1148j[] values() {
        return (EnumC1148j[]) f3787e.clone();
    }
}
