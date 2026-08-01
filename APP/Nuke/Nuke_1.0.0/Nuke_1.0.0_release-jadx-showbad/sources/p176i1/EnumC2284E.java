package p176i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i1.E */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2284E {

    /* JADX INFO: renamed from: d */
    public static final EnumC2284E f7440d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2284E f7441e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC2284E[] f7442f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2284E enumC2284E = new EnumC2284E("Inherit", 0);
        f7440d = enumC2284E;
        EnumC2284E enumC2284E2 = new EnumC2284E("SecureOn", 1);
        f7441e = enumC2284E2;
        f7442f = new EnumC2284E[]{enumC2284E, enumC2284E2, new EnumC2284E("SecureOff", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2284E valueOf(String str) {
        return (EnumC2284E) Enum.valueOf(EnumC2284E.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2284E[] values() {
        return (EnumC2284E[]) f7442f.clone();
    }
}
