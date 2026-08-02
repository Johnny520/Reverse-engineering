package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 {
    public static final rm2 h;
    public static final /* synthetic */ rm2[] i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        rm2 rm2Var = new rm2("EditableText", 0);
        h = rm2Var;
        i = new rm2[]{rm2Var, new rm2("StaticText", 1)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rm2 valueOf(String str) {
        return (rm2) Enum.valueOf(rm2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static rm2[] values() {
        return (rm2[]) i.clone();
    }
}
