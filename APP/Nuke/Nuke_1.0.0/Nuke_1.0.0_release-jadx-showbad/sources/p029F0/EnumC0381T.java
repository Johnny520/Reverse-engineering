package p029F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F0.T */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0381T {

    /* JADX INFO: renamed from: d */
    public static final EnumC0381T f1193d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0381T f1194e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0381T[] f1195f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0381T enumC0381T = new EnumC0381T("Width", 0);
        f1193d = enumC0381T;
        EnumC0381T enumC0381T2 = new EnumC0381T("Height", 1);
        f1194e = enumC0381T2;
        f1195f = new EnumC0381T[]{enumC0381T, enumC0381T2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0381T valueOf(String str) {
        return (EnumC0381T) Enum.valueOf(EnumC0381T.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0381T[] values() {
        return (EnumC0381T[]) f1195f.clone();
    }
}
