package p041H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.T */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0574T {

    /* JADX INFO: renamed from: d */
    public static final EnumC0574T f1791d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0574T f1792e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0574T f1793f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0574T[] f1794g;

    static {
        EnumC0574T enumC0574T = new EnumC0574T("IsPlacedInLookahead", 0);
        f1791d = enumC0574T;
        EnumC0574T enumC0574T2 = new EnumC0574T("IsPlacedInApproach", 1);
        f1792e = enumC0574T2;
        EnumC0574T enumC0574T3 = new EnumC0574T("IsNotPlaced", 2);
        f1793f = enumC0574T3;
        f1794g = new EnumC0574T[]{enumC0574T, enumC0574T2, enumC0574T3};
    }

    public static EnumC0574T valueOf(String str) {
        return (EnumC0574T) Enum.valueOf(EnumC0574T.class, str);
    }

    public static EnumC0574T[] values() {
        return (EnumC0574T[]) f1794g.clone();
    }
}
