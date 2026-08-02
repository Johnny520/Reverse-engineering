package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class er {
    public static final dr Companion;
    public static final j71 h;
    public static final er i;
    public static final er j;
    public static final /* synthetic */ er[] k;
    public static final /* synthetic */ yf0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        er erVar = new er("BLACKLIST", 0);
        i = erVar;
        er erVar2 = new er("WHITELIST", 1);
        j = erVar2;
        er[] erVarArr = {erVar, erVar2};
        k = erVarArr;
        l = new yf0(erVarArr);
        Companion = new dr();
        h = p7.B(i91.h, new c0(19));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static er valueOf(String str) {
        return (er) Enum.valueOf(er.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static er[] values() {
        return (er[]) k.clone();
    }
}
