package p027c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c0.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0370o {

    /* JADX INFO: renamed from: g */
    public static final EnumC0370o f1041g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0370o f1042h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0370o f1043i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0370o[] f1044j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0370o enumC0370o = new EnumC0370o("Uninitialized", 0);
        f1041g = enumC0370o;
        EnumC0370o enumC0370o2 = new EnumC0370o("Detached", 1);
        f1042h = enumC0370o2;
        EnumC0370o enumC0370o3 = new EnumC0370o("Attached", 2);
        f1043i = enumC0370o3;
        f1044j = new EnumC0370o[]{enumC0370o, enumC0370o2, enumC0370o3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0370o valueOf(String str) {
        return (EnumC0370o) Enum.valueOf(EnumC0370o.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0370o[] values() {
        return (EnumC0370o[]) f1044j.clone();
    }
}
