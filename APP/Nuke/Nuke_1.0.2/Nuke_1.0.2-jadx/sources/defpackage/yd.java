package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yd {
    public static final yd h;
    public static final yd i;
    public static final yd j;
    public static final yd k;
    public static final yd l;
    public static final yd m;
    public static final yd n;
    public static final /* synthetic */ yd[] o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        yd ydVar = new yd("Paragraph", 0);
        h = ydVar;
        yd ydVar2 = new yd("Span", 1);
        i = ydVar2;
        yd ydVar3 = new yd("VerbatimTts", 2);
        j = ydVar3;
        yd ydVar4 = new yd("Url", 3);
        k = ydVar4;
        yd ydVar5 = new yd("Link", 4);
        l = ydVar5;
        yd ydVar6 = new yd("Clickable", 5);
        m = ydVar6;
        yd ydVar7 = new yd("String", 6);
        n = ydVar7;
        o = new yd[]{ydVar, ydVar2, ydVar3, ydVar4, ydVar5, ydVar6, ydVar7};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yd valueOf(String str) {
        return (yd) Enum.valueOf(yd.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static yd[] values() {
        return (yd[]) o.clone();
    }
}
