package p203n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n.D */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2621D {

    /* JADX INFO: renamed from: d */
    public static final EnumC2621D f8331d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC2621D[] f8332e;

    static {
        EnumC2621D enumC2621D = new EnumC2621D("Default", 0);
        f8331d = enumC2621D;
        f8332e = new EnumC2621D[]{enumC2621D, new EnumC2621D("UserInput", 1), new EnumC2621D("PreventUserInput", 2)};
    }

    public static EnumC2621D valueOf(String str) {
        return (EnumC2621D) Enum.valueOf(EnumC2621D.class, str);
    }

    public static EnumC2621D[] values() {
        return (EnumC2621D[]) f8332e.clone();
    }
}
