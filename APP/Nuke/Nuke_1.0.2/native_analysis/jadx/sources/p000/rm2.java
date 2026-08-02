package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 {

    /* JADX INFO: renamed from: h */
    public static final rm2 f9647h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ rm2[] f9648i;

    static {
        rm2 rm2Var = new rm2("EditableText", 0);
        f9647h = rm2Var;
        f9648i = new rm2[]{rm2Var, new rm2("StaticText", 1)};
    }

    public static rm2 valueOf(String str) {
        return (rm2) Enum.valueOf(rm2.class, str);
    }

    public static rm2[] values() {
        return (rm2[]) f9648i.clone();
    }
}
