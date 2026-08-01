package p007B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: B0.C */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0170C {

    /* JADX INFO: renamed from: d */
    public static final EnumC0170C f602d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0170C f603e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0170C f604f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0170C[] f605g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0170C enumC0170C = new EnumC0170C("Unknown", 0);
        f602d = enumC0170C;
        EnumC0170C enumC0170C2 = new EnumC0170C("Dispatching", 1);
        f603e = enumC0170C2;
        EnumC0170C enumC0170C3 = new EnumC0170C("NotDispatching", 2);
        f604f = enumC0170C3;
        f605g = new EnumC0170C[]{enumC0170C, enumC0170C2, enumC0170C3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0170C valueOf(String str) {
        return (EnumC0170C) Enum.valueOf(EnumC0170C.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0170C[] values() {
        return (EnumC0170C[]) f605g.clone();
    }
}
