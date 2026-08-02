package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class en2 {
    public static final en2 h;
    public static final en2 i;
    public static final en2 j;
    public static final /* synthetic */ en2[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        en2 en2Var = new en2("Left", 0);
        h = en2Var;
        en2 en2Var2 = new en2("Middle", 1);
        i = en2Var2;
        en2 en2Var3 = new en2("Right", 2);
        j = en2Var3;
        k = new en2[]{en2Var, en2Var2, en2Var3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static en2 valueOf(String str) {
        return (en2) Enum.valueOf(en2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static en2[] values() {
        return (en2[]) k.clone();
    }
}
