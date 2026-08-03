package p339x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x1.d2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5596d2 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5596d2 f22747g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5596d2 f22748h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5596d2 f22749i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC5596d2[] f22750j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5596d2 enumC5596d2 = new EnumC5596d2("ContinueTraversal", 0);
        f22747g = enumC5596d2;
        EnumC5596d2 enumC5596d22 = new EnumC5596d2("SkipSubtreeAndContinueTraversal", 1);
        f22748h = enumC5596d22;
        EnumC5596d2 enumC5596d23 = new EnumC5596d2("CancelTraversal", 2);
        f22749i = enumC5596d23;
        f22750j = new EnumC5596d2[]{enumC5596d2, enumC5596d22, enumC5596d23};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5596d2 valueOf(String str) {
        return (EnumC5596d2) Enum.valueOf(EnumC5596d2.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5596d2[] values() {
        return (EnumC5596d2[]) f22750j.clone();
    }
}
