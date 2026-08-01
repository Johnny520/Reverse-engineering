package p216p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p.Q */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2824Q {

    /* JADX INFO: renamed from: d */
    public static final EnumC2824Q f8890d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2824Q f8891e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC2824Q[] f8892f;

    static {
        EnumC2824Q enumC2824Q = new EnumC2824Q("Default", 0);
        f8890d = enumC2824Q;
        EnumC2824Q enumC2824Q2 = new EnumC2824Q("UserInput", 1);
        f8891e = enumC2824Q2;
        f8892f = new EnumC2824Q[]{enumC2824Q, enumC2824Q2, new EnumC2824Q("PreventUserInput", 2)};
    }

    public static EnumC2824Q valueOf(String str) {
        return (EnumC2824Q) Enum.valueOf(EnumC2824Q.class, str);
    }

    public static EnumC2824Q[] values() {
        return (EnumC2824Q[]) f8892f.clone();
    }
}
