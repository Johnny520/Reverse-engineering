package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gr {
    public static final fr Companion;
    public static final j71 h;
    public static final gr i;
    public static final gr j;
    public static final gr k;
    public static final /* synthetic */ gr[] l;
    public static final /* synthetic */ yf0 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        gr grVar = new gr("CONTAINS", 0);
        i = grVar;
        gr grVar2 = new gr("EXACT", 1);
        j = grVar2;
        gr grVar3 = new gr("REGEX", 2);
        k = grVar3;
        gr[] grVarArr = {grVar, grVar2, grVar3};
        l = grVarArr;
        m = new yf0(grVarArr);
        Companion = new fr();
        h = p7.B(i91.h, new c0(20));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static gr valueOf(String str) {
        return (gr) Enum.valueOf(gr.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static gr[] values() {
        return (gr[]) l.clone();
    }
}
