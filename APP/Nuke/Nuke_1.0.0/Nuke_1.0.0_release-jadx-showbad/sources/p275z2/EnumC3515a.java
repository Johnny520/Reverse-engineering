package p275z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z2.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3515a {

    /* JADX INFO: renamed from: d */
    public static final EnumC3515a f10959d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC3515a[] f10960e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3515a enumC3515a = new EnumC3515a("NO", 0);
        f10959d = enumC3515a;
        f10960e = new EnumC3515a[]{enumC3515a, new EnumC3515a("NOTICE", 1), new EnumC3515a("SILENT", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3515a valueOf(String str) {
        return (EnumC3515a) Enum.valueOf(EnumC3515a.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3515a[] values() {
        return (EnumC3515a[]) f10960e.clone();
    }
}
