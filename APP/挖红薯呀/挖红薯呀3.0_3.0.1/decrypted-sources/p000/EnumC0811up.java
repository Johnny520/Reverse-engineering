package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: up */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0811up {

    /* JADX INFO: renamed from: d */
    public static final EnumC0811up f6276d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0811up f6277e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0811up f6278f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0811up[] f6279g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0811up enumC0811up = new EnumC0811up("Yes", 0);
        f6276d = enumC0811up;
        EnumC0811up enumC0811up2 = new EnumC0811up("No", 1);
        f6277e = enumC0811up2;
        EnumC0811up enumC0811up3 = new EnumC0811up("NotInitialized", 2);
        f6278f = enumC0811up3;
        f6279g = new EnumC0811up[]{enumC0811up, enumC0811up2, enumC0811up3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0811up valueOf(String str) {
        return (EnumC0811up) Enum.valueOf(EnumC0811up.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0811up[] values() {
        return (EnumC0811up[]) f6279g.clone();
    }
}
