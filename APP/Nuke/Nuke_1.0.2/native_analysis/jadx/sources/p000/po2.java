package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class po2 {

    /* JADX INFO: renamed from: h */
    public static final po2 f8424h;

    /* JADX INFO: renamed from: i */
    public static final po2 f8425i;

    /* JADX INFO: renamed from: j */
    public static final po2 f8426j;

    /* JADX INFO: renamed from: k */
    public static final po2 f8427k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ po2[] f8428l;

    static {
        po2 po2Var = new po2("TEXT", 0);
        f8424h = po2Var;
        po2 po2Var2 = new po2("IMAGE", 1);
        f8425i = po2Var2;
        po2 po2Var3 = new po2("VOICE", 2);
        f8426j = po2Var3;
        po2 po2Var4 = new po2("SYSTEM_MSG", 3);
        f8427k = po2Var4;
        f8428l = new po2[]{po2Var, po2Var2, po2Var3, po2Var4};
    }

    public static po2 valueOf(String str) {
        return (po2) Enum.valueOf(po2.class, str);
    }

    public static po2[] values() {
        return (po2[]) f8428l.clone();
    }
}
