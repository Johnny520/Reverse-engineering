package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hn {
    public static final hn h;
    public static final hn i;
    public static final hn j;
    public static final /* synthetic */ hn[] k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        hn hnVar = new hn("SUSPEND", 0);
        h = hnVar;
        hn hnVar2 = new hn("DROP_OLDEST", 1);
        i = hnVar2;
        hn hnVar3 = new hn("DROP_LATEST", 2);
        j = hnVar3;
        k = new hn[]{hnVar, hnVar2, hnVar3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static hn valueOf(String str) {
        return (hn) Enum.valueOf(hn.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static hn[] values() {
        return (hn[]) k.clone();
    }
}
