package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y41 {

    /* JADX INFO: renamed from: h */
    public static final y41 f13302h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ y41[] f13303i;

    /* JADX INFO: Fake field, exist only in values array */
    y41 EF0;

    static {
        y41 y41Var = new y41("DEBUG", 0);
        y41 y41Var2 = new y41("INFO", 1);
        y41 y41Var3 = new y41("WARN", 2);
        f13302h = y41Var3;
        f13303i = new y41[]{y41Var, y41Var2, y41Var3, new y41("ERROR", 3), new y41("OFF", 4)};
    }

    public static y41 valueOf(String str) {
        return (y41) Enum.valueOf(y41.class, str);
    }

    public static y41[] values() {
        return (y41[]) f13303i.clone();
    }
}
