package p041H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0556D0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC0556D0 f1668d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0556D0 f1669e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0556D0 f1670f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0556D0[] f1671g;

    static {
        EnumC0556D0 enumC0556D0 = new EnumC0556D0("ContinueTraversal", 0);
        f1668d = enumC0556D0;
        EnumC0556D0 enumC0556D02 = new EnumC0556D0("SkipSubtreeAndContinueTraversal", 1);
        f1669e = enumC0556D02;
        EnumC0556D0 enumC0556D03 = new EnumC0556D0("CancelTraversal", 2);
        f1670f = enumC0556D03;
        f1671g = new EnumC0556D0[]{enumC0556D0, enumC0556D02, enumC0556D03};
    }

    public static EnumC0556D0 valueOf(String str) {
        return (EnumC0556D0) Enum.valueOf(EnumC0556D0.class, str);
    }

    public static EnumC0556D0[] values() {
        return (EnumC0556D0[]) f1671g.clone();
    }
}
