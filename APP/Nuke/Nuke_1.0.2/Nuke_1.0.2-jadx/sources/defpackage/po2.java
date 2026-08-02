package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class po2 {
    public static final po2 h;
    public static final po2 i;
    public static final po2 j;
    public static final po2 k;
    public static final /* synthetic */ po2[] l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        po2 po2Var = new po2("TEXT", 0);
        h = po2Var;
        po2 po2Var2 = new po2("IMAGE", 1);
        i = po2Var2;
        po2 po2Var3 = new po2("VOICE", 2);
        j = po2Var3;
        po2 po2Var4 = new po2("SYSTEM_MSG", 3);
        k = po2Var4;
        l = new po2[]{po2Var, po2Var2, po2Var3, po2Var4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static po2 valueOf(String str) {
        return (po2) Enum.valueOf(po2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static po2[] values() {
        return (po2[]) l.clone();
    }
}
