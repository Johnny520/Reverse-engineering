package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i91 {

    /* JADX INFO: renamed from: h */
    public static final i91 f4497h;

    /* JADX INFO: renamed from: i */
    public static final i91 f4498i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ i91[] f4499j;

    /* JADX INFO: Fake field, exist only in values array */
    i91 EF0;

    static {
        i91 i91Var = new i91("SYNCHRONIZED", 0);
        i91 i91Var2 = new i91("PUBLICATION", 1);
        f4497h = i91Var2;
        i91 i91Var3 = new i91("NONE", 2);
        f4498i = i91Var3;
        f4499j = new i91[]{i91Var, i91Var2, i91Var3};
    }

    public static i91 valueOf(String str) {
        return (i91) Enum.valueOf(i91.class, str);
    }

    public static i91[] values() {
        return (i91[]) f4499j.clone();
    }
}
