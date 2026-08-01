package p244u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u.J */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3241J {

    /* JADX INFO: renamed from: d */
    public static final EnumC3241J f10039d;

    /* JADX INFO: renamed from: e */
    public static final EnumC3241J f10040e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC3241J[] f10041f;

    static {
        EnumC3241J enumC3241J = new EnumC3241J("Min", 0);
        f10039d = enumC3241J;
        EnumC3241J enumC3241J2 = new EnumC3241J("Max", 1);
        f10040e = enumC3241J2;
        f10041f = new EnumC3241J[]{enumC3241J, enumC3241J2};
    }

    public static EnumC3241J valueOf(String str) {
        return (EnumC3241J) Enum.valueOf(EnumC3241J.class, str);
    }

    public static EnumC3241J[] values() {
        return (EnumC3241J[]) f10041f.clone();
    }
}
