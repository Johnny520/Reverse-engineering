package p000A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0052b0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC0052b0 f211d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0052b0 f212e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0052b0 f213f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0052b0[] f214g;

    static {
        EnumC0052b0 enumC0052b0 = new EnumC0052b0("None", 0);
        f211d = enumC0052b0;
        EnumC0052b0 enumC0052b02 = new EnumC0052b0("Selection", 1);
        f212e = enumC0052b02;
        EnumC0052b0 enumC0052b03 = new EnumC0052b0("Cursor", 2);
        f213f = enumC0052b03;
        f214g = new EnumC0052b0[]{enumC0052b0, enumC0052b02, enumC0052b03};
    }

    public static EnumC0052b0 valueOf(String str) {
        return (EnumC0052b0) Enum.valueOf(EnumC0052b0.class, str);
    }

    public static EnumC0052b0[] values() {
        return (EnumC0052b0[]) f214g.clone();
    }
}
